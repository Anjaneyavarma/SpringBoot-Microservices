package com.spring.user.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    public long departmentId;
    public String departmentName;
    public String departmentAddress;
    public String departmentCode;
}
