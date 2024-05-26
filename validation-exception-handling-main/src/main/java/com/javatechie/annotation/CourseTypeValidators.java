package com.javatechie.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class CourseTypeValidators implements ConstraintValidator<CourseTypeValidation,String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        List list = Arrays.asList("RECORDED","LIVE");
        return list.contains(s);
    }
}
