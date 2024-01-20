package com.holidayzer.demo.controller;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class Holidayzer {
  private Map<String, String> holidays = new HashMap<>();

  public Holidayzer() {
    createCalendar();
  }

  public void createCalendar() {
    holidays.put("01/01/2023", "Confraternização mundial");
    holidays.put("21/02/2023", "Carnaval");
    holidays.put("17/04/2023", "Páscoa");
    holidays.put("21/04/2023", "Tiradentes");
    holidays.put("01/05/2023", "Dia do trabalho");
    holidays.put("08/06/2023", "Corpus Christi");
    holidays.put("07/09/2023", "Independência do Brasil");
    holidays.put("12/10/2023", "Nossa Senhora Aparecida");
    holidays.put("02/11/2023", "Finados");
    holidays.put("15/11/2023", "Proclamação da República");
    holidays.put("25/12/2023", "Natal");
  }

  public String findHoliday(String date) {
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Date parsedDate;
    try {
      parsedDate = dateFormat.parse(date);
    } catch (ParseException e) {
      return null; // Invalid date format
    }
    String formattedDate = dateFormat.format(parsedDate);
    String feriado = holidays.get(formattedDate);
    if (feriado == null) {
      return "Não há feriado em " + formattedDate;
    }
    return feriado;
  }

  public Map<String, String> getAllHolidays() {
    return holidays;
  }
}