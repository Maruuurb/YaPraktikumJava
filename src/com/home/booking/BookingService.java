package com.home;

public interface BookingService {
    void booking (int bookingId, Customer customer);
    void cancel (int booking);
    int getBookingCount();
}
