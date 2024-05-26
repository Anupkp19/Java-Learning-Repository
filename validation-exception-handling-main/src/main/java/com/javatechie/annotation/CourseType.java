package com.javatechie.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE_PARAMETER})
@Constraint(validatedBy = CourseTypeValidators.class)
@Documented
public @interface CourseType {
    String message() default "Course Type should be either LIVE OR RECORDING";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
