package timoday.bai5.service;

import java.util.ArrayList;
import java.util.Date;

import timoday.bai5.entity.Household;
import timoday.bai5.entity.People;

public class Residential {
    public static ArrayList<Household> households = new ArrayList<Household>();

    public void addHousehold (Household household){
        households.add(household);
    }

    public void anCo (){
        Date now = new Date();
        int thisYear = now.getYear() + 1900;
        System.out.println("Nhung nha co cu 80 tuoi la nha so: ");
        for (Household household : households){
            for (People person : household.getmemberss()){
                if (thisYear - person.getYearOfBirth() == 80){
                    System.out.println(household.getHomeNumber() + " ");
                    break;
                }        

            }
        }
    }

    // private Date dateToString(String stringDate){
    //     Date date = null;
    //     SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
    //     try {
    //         date = simpleDateFormat.parse(stringDate);
    //     } catch (ParseException e) {
    //         System.out.println("Sai dinh dang ngay thang");
    //     }
    //     return date;
    // }

}
