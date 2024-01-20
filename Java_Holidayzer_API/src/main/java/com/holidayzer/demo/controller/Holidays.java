package com.holidayzer.demo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/holidays")
public class Holidays {
  private Holidayzer holidayzer = new Holidayzer();
  public Holidays() {
    holidayzer.createCalendar();
  }

  @GetMapping()
  public Map<String, String> allHolidays() {
    return holidayzer.getAllHolidays();
  }

  @GetMapping("/{holiday}")
  public String getHolidayString(@PathVariable("holiday") String holiday) {
    return "feriado: " + holidayzer.findHoliday(holiday);
  }

}
