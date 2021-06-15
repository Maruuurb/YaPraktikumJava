package com.home;

public class FlightBookingService extends AbstractBookingService  {



    public void booking (int id, Customer customer){
        System.out.println("Бронь №: " + id + " "+ customer.getFullName());
        bookingsCount ++;
    }

    public  void  cancel (int id){
        if (bookingsCount == 0){
            System.out.println("Нет броней. Делать нечего");
        }else {
            System.out.println("Отменяем бронь №: " + id);
            bookingsCount --;
        }
    }

    public int getBookingCount(){
        return bookingsCount;
    }
}

