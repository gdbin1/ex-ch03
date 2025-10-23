package com.gbk.mybatis_thymleaf.domain;

import java.time.LocalDateTime;

//import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Student {
	
	private Long id;
	private String name;
	private String email;
	private Integer age;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
}
