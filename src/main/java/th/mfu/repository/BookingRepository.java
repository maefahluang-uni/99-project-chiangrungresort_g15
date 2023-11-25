package th.mfu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import th.mfu.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    
}
