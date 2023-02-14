package com.eland.sentry.anno;

import org.springframework.stereotype.Controller;

import java.lang.annotation.*;

@Controller
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface AnnoHowMuchTime {

}
