$(document).ready(function () {
    // Function to fetch and display menu items
    function displayMenu() {
        $.ajax({
            url: '/api/menu/all',
            method: 'GET',
            success: function (data) {
                // Clear existing menu items
                $('#menuContainer').empty();

                // Loop through the retrieved data and append each menu item
                data.forEach(function (menuItem) {
                    var menuItemHtml = `
                        <div class="menu-item">
                            <img src="${menuItem.imageUrl}" alt="${menuItem.itemName}">
                            <div class="menu-item-info">
                                <h3>${menuItem.itemName}</h3>
                                <p>${menuItem.price}</p>
                            </div>
                        </div>`;
                    $('#menuContainer').append(menuItemHtml);
                });
            },
            error: function (error) {
                console.log('Error fetching menu items:', error);
            }
        });
    }

    // Initial display of menu items
    displayMenu();

    // Event listener for the "Add New Menu Item" button
    $('#addMenuItemBtn').on('click', function () {
        // Example: Adding a new menu item
        $.ajax({
            url: '/api/menu/add', // API endpoint to add a new menu item
            method: 'POST',
            data: {
                itemName: 'New Menu Item',
                imageUrl: 'new_image_url_here',
                price: 'New Price'
            },
            success: function () {
                // After successfully adding a new menu item, re-display the menu
                displayMenu();
            },
            error: function (error) {
                console.log('Error adding new menu item:', error);
            }
            
        });
    });
});
