package com.home;

public class HotelBookingService extends AbstractBookingService {


    public void booking (int id, Customer customer){
        System.out.println("Бронируем отель. Бронь № " + id + " :"+ customer.getFullName());
        bookingsCount ++;
    }

    public  void  cancel (int id){
        if (bookingsCount == 0){
            System.out.println("Нет броней в отеле. Делать нечего");
        }else {
            System.out.println("Отель. Отменяем бронь № " + id);
            bookingsCount --;
        }
    }

    public int getBookingCount(){
        return bookingsCount;
    }
}
