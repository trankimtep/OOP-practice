package bai14.service;

import bai14.exceptions.*;

public class DataValidator {
    public void birthdayCheck (String birthDay) throws InvalidDOBException{
        String[] arr = birthDay.trim().split("/");
        if (arr.length != 3 || arr[0].length() != 2 || arr[1].length() != 2 || arr[2].length() != 4) {
            throw new InvalidDOBException("Birthday is invalid !!!");
        }
    }

    public void nameCheck (String name) throws InvalidFullNameException {
        if (name.length() > 50 || name.length() < 10) {
            throw new InvalidFullNameException("Full name is invalid !!!");
        }
    }

    public void phoneCheck (String phone) throws InvalidPhoneNumberException {
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

        String tem = phone.substring(0, 2);
        if (!(tem.equals("090") && tem.equals("098") && tem.equals("091") && tem.equals("031") && tem.equals("035") && tem.equals("038"))) {
            ok = false;
        }
        if (!ok) {
            throw new InvalidPhoneNumberException("Phone number is invalid !!!");
        }
    }
}
