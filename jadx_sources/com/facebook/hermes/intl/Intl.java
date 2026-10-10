package com.facebook.hermes.intl;

import android.icu.lang.UCharacter;
import android.icu.util.ULocale;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p359j5.C40276e;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes34.dex */
@InterfaceC44695a
public class Intl {
    /* JADX INFO: renamed from: a */
    public static List<String> m9027a(List<String> list) throws JSRangeErrorException {
        if (list.size() == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null) {
                if (!str.isEmpty()) {
                    String strM88688a = C40276e.m88688a(str);
                    if (!strM88688a.isEmpty() && !arrayList.contains(strM88688a)) {
                        arrayList.add(strM88688a);
                    }
                } else {
                    throw new JSRangeErrorException("Incorrect locale information provided");
                }
            } else {
                throw new JSRangeErrorException("Incorrect locale information provided");
            }
        }
        return arrayList;
    }

    @InterfaceC44695a
    public static List<String> getCanonicalLocales(List<String> list) throws JSRangeErrorException {
        return m9027a(list);
    }

    @InterfaceC44695a
    public static String toLocaleLowerCase(List<String> list, String str) throws JSRangeErrorException {
        return UCharacter.toLowerCase((ULocale) C5630a.m9050c((String[]) list.toArray(new String[list.size()])).f8783a.getLocale(), str);
    }

    @InterfaceC44695a
    public static String toLocaleUpperCase(List<String> list, String str) throws JSRangeErrorException {
        return UCharacter.toUpperCase((ULocale) C5630a.m9050c((String[]) list.toArray(new String[list.size()])).f8783a.getLocale(), str);
    }
}
