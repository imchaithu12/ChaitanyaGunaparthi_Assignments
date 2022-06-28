package com.cg.collections;

import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Long a=Long.valueOf("4352674589");
        Long b=Long.valueOf("9877665544");
        Long c=Long.valueOf("8893392322");
        Long d=Long.valueOf("9848356011");
        contact a1=new contact(a,"Rose","rose@gmail.com",Gender.female);
        contact a2=new contact(b,"Danniel","Danniel@gmail.com",Gender.male);
        contact a3=new contact(c,"malkova","malkova@gmail.com",Gender.female);
        contact a4=new contact(d,"Tommy","Tommy@gmail.com",Gender.male);

        TreeMap<Long,contact> info= new TreeMap<Long,contact>(Collections.reverseOrder());
        info.put(a,a1);
        info.put(b,a2);
        info.put(c,a3);
        info.put(d,a4);
        System.out.println("All the key-Value pairs: ");
        //printing all key-value pairs
        for (Map.Entry<Long, contact> entry: info.entrySet()){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
        //printing all the keys
        System.out.println("All the Keys: ");
        for (Map.Entry<Long, contact> entry: info.entrySet()){
            System.out.println(entry.getKey());
        }
        System.out.println("All the Values: ");
        //printing all the values
        for (Map.Entry<Long, contact> entry: info.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
enum Gender{
    male,female;
}
class contact{
    private Long phone_number;
    private String name;
    private String email;
    private Gender gender;

    public contact(Long phone_number,String name,String email,Gender gender){
        this.phone_number=phone_number;
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "name: "+name+" Phone no: "+phone_number+" email: "+email;
    }
}