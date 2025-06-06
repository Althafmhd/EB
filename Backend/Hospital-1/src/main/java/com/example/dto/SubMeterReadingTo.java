package com.example.dto;

import java.time.LocalDate;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor

@Getter
@Setter
public class SubMeterReadingTo {
	private Long id;
	private String mainmetername;
	private String subblockmetername;
	private String submetername;
	private Long readingunits;
	private Long todayunits;
	private LocalDate date;

}
