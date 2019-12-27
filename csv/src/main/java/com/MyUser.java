package com;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyUser {
	@CsvBindByPosition(position = 0)
	@CsvBindByName(column = "NAME")
    private String name;
	@CsvBindByPosition(position = 1)
	@CsvBindByName(column = "EMAIL")
    private String email;
	@CsvBindByPosition(position = 2)
	@CsvBindByName(column = "PHONE_NO")
    private String phoneNo;
	@CsvBindByPosition(position = 3)
	@CsvBindByName(column = "COUNTRY")
    private String country;

	
}