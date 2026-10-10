package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JavaType;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.util.d */
/* JADX INFO: compiled from: BeanUtil.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6487d {
    /* JADX INFO: renamed from: c */
    public static boolean m11896c(String str) {
        return str.startsWith("java.time.");
    }

    /* JADX INFO: renamed from: d */
    public static boolean m11897d(String str) {
        return str.startsWith("org.joda.time.");
    }

    /* JADX INFO: renamed from: a */
    public static String m11894a(JavaType javaType) {
        String str;
        String str2;
        String name = javaType.getRawClass().getName();
        if (m11896c(name)) {
            if (name.indexOf(46, 10) >= 0) {
                return null;
            }
            str = "Java 8 date/time";
            str2 = "com.fasterxml.jackson.datatype:jackson-datatype-jsr310";
        } else {
            if (!m11897d(name)) {
                return null;
            }
            str = "Joda date/time";
            str2 = "com.fasterxml.jackson.datatype:jackson-datatype-joda";
        }
        return String.format("%s type %s not supported by default: add Module \"%s\" to enable handling", str, C6490g.m11904G(javaType), str2);
    }

    /* JADX INFO: renamed from: b */
    public static Object m11895b(JavaType javaType) {
        Class<?> rawClass = javaType.getRawClass();
        Class<?> clsM11927b0 = C6490g.m11927b0(rawClass);
        if (clsM11927b0 != null) {
            return C6490g.m11948m(clsM11927b0);
        }
        if (!javaType.isContainerType() && !javaType.isReferenceType()) {
            if (rawClass == String.class) {
                return "";
            }
            if (javaType.isTypeOrSubTypeOf(Date.class)) {
                return new Date(0L);
            }
            if (javaType.isTypeOrSubTypeOf(Calendar.class)) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                gregorianCalendar.setTimeInMillis(0L);
                return gregorianCalendar;
            }
            return null;
        }
        return JsonInclude.Include.NON_EMPTY;
    }
}
