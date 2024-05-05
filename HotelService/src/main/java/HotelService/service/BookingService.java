package HotelService.service;

import java.math.BigInteger;

import org.springframework.http.ResponseEntity;

import HotelService.model.Booking;


public interface BookingService {

	public ResponseEntity<?> createBooking(Booking newBooking);

	public Booking updateBooking(Booking newBooking);

	public String deleteBooking(BigInteger bookingId);

	public Iterable<Booking> displayAllBooking();

	public ResponseEntity<?> findBookingById(BigInteger bookingId);
}
