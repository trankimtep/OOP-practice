package bai13.services;

import bai13.exceptions.BirthdayException;
import bai13.exceptions.EmailException;
import bai13.exceptions.NameException;
import bai13.exceptions.PhoneException;

public class DataValidator {
    public void birthdayCheck (String birthDay) throws BirthdayException{
        String[] arr = birthDay.trim().split("/");
        if (arr.length != 3 || arr[0].length() != 2 || arr[1].length() != 2 || arr[2].length() != 4) {
            throw new BirthdayException("Birthday is invalid !!!");
        }
    }

    public void emailCheck (String email) throws EmailException {
        String[] arr = email.trim().split("@");
        if (arr.length != 2 ) {
            throw new EmailException("Email is invalid !!!");
        }
    }

    public void nameCheck (String name) throws NameException {
        for (int i = 0; i < name.length(); i++) {
            int tem = name.charAt(i);
            if ((tem < 65 && tem != 20) || (tem > 90 && tem < 97) || tem > 122) {
                throw new NameException("Name is invalid !!!");
            }
        }
    }

    public void phoneCheck (String phone) throws PhoneException {
        boolean ok = true;
        if (phone.length() != 10) {
            ok = false;
        }

        for (int i = 0; i < phone.length(); i++) {
            int tem = phone.charAt(i);
            if (tem < 48 || tem > 57) {
                ok = false;
                break;
            }
        }
        if (!ok) {
            throw new PhoneException("Phone number is invalid !!!");
        }
    }
}
