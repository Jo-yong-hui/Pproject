package ybc.spring.mvc.service;

import ybc.spring.mvc.vo.Park;

import java.util.List;

public interface ParkService {
    List<Park> readPark(String addr, String shour, String ehour, String satshour, String satehour, String holshour, String holehour, String weekday, String saturday, String holiday, String gubun);
    int countPark(String addr, String shour, String ehour, String satshour, String satehour, String holshour, String holehour, String weekday, String saturday, String holiday, String gubun);
}
