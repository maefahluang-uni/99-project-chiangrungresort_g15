document.addEventListener('DOMContentLoaded', function () {
    fetch('http://localhost:8100/menu') // เปลี่ยน URL ตรงนี้
        .then(response => response.json())
        .then(data => {
            const container = document.getElementById('productContainer');

            if (data.length > 0) {
                data.forEach(menuItem => {
                    const box = document.createElement('div');
                    box.className = 'box';
                    box.id = `menu_${menuItem.menu_id}`; // เพิ่ม ID สำหรับแต่ละเมนู

                    const content = `
                        <img src="${menuItem.image_url}" alt="${menuItem.menu_name}">
                        <p><strong>Menu ID:</strong> ${menuItem.menu_id}</p>
                        <p><strong>Menu Name:</strong> ${menuItem.menu_name}</p>
                        <p><strong>Price:</strong> ${menuItem.price}</p>
                    `;

                    box.innerHTML = content;
                    container.appendChild(box);
                });
            } else {
                // If no menu items, display "No menu items"
                const noMenuItemMessage = document.createElement('p');
                noMenuItemMessage.textContent = 'No menu items';
                container.appendChild(noMenuItemMessage);
            }
        })
        .catch(error => console.error('Error:', error));

        document.getElementById('productContainer').addEventListener('click', function (event) {
            // ตรวจสอบว่าคลิกที่เมนู
            if (event.target.matches('.box')) {
                // รีเซ็ตสีของกล่องทั้งหมด
                document.querySelectorAll('.box').forEach(box => {
                    box.style.backgroundColor = ''; // เคลียร์สีพื้นหลัง
                });
        
                // ดึงข้อมูลเมนูจาก ID
                const menuId = event.target.id.split('_')[1];
                const selectedMenu = data.find(menuItem => menuItem.menu_id === menuId);
        
                // เปลี่ยนสีของกล่องที่ถูกคลิก
                event.target.style.backgroundColor = '#C4A621';
        
                // เพิ่มรายการลงในตะกร้า (cart)
                addToCart(selectedMenu);
            }
        });
    })