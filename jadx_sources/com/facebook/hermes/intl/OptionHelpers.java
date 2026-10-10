package com.facebook.hermes.intl;

import java.util.Arrays;
import p359j5.C40275d;

/* JADX INFO: loaded from: classes34.dex */
public class OptionHelpers {

    public enum OptionType {
        BOOLEAN,
        STRING
    }

    /* JADX INFO: renamed from: d */
    public static <T extends Enum<T>> T m9039d(Class<T> cls, Object obj) {
        try {
            if (C40275d.m88683n(obj)) {
                return (T) Enum.valueOf(cls, "UNDEFINED");
            }
            if (C40275d.m88679j(obj)) {
                return null;
            }
            String strM88677h = C40275d.m88677h(obj);
            if (strM88677h.equals("2-digit")) {
                return (T) Enum.valueOf(cls, "DIGIT2");
            }
            for (T t11 : cls.getEnumConstants()) {
                if (t11.name().compareToIgnoreCase(strM88677h) == 0) {
                    return t11;
                }
            }
            return null;
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static Object m9036a(String str, Object obj, Object obj2, Object obj3, Object obj4) throws JSRangeErrorException {
        if (C40275d.m88683n(obj)) {
            return obj4;
        }
        if (C40275d.m88680k(obj)) {
            double dM88675f = C40275d.m88675f(obj);
            if (!Double.isNaN(dM88675f) && dM88675f <= C40275d.m88675f(obj3) && dM88675f >= C40275d.m88675f(obj2)) {
                return obj;
            }
            throw new JSRangeErrorException(str + " value is invalid.");
        }
        throw new JSRangeErrorException(str + " value is invalid.");
    }

    /* JADX INFO: renamed from: b */
    public static Object m9037b(Object obj, String str, Object obj2, Object obj3, Object obj4) throws JSRangeErrorException {
        return m9036a(str, C40275d.m88670a(obj, str), obj2, obj3, obj4);
    }

    /* JADX INFO: renamed from: c */
    public static Object m9038c(Object obj, String str, OptionType optionType, Object obj2, Object obj3) throws JSRangeErrorException {
        Object objM88670a = C40275d.m88670a(obj, str);
        if (C40275d.m88683n(objM88670a)) {
            return obj3;
        }
        if (C40275d.m88679j(objM88670a)) {
            objM88670a = "";
        }
        if (optionType == OptionType.BOOLEAN && !C40275d.m88678i(objM88670a)) {
            throw new JSRangeErrorException("Boolean option expected but not found");
        }
        if (optionType == OptionType.STRING && !C40275d.m88682m(objM88670a)) {
            throw new JSRangeErrorException("String option expected but not found");
        }
        if (!C40275d.m88683n(obj2) && !Arrays.asList((Object[]) obj2).contains(objM88670a)) {
            throw new JSRangeErrorException("String option expected but not found");
        }
        return objM88670a;
    }
}
