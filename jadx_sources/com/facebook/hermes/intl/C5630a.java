package com.facebook.hermes.intl;

import android.icu.util.ULocale;
import androidx.annotation.RequiresApi;
import com.tencent.bugly.proguard.C33820nf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import p359j5.C40277f;
import p359j5.C40278g;
import p359j5.InterfaceC40273b;

/* JADX INFO: renamed from: com.facebook.hermes.intl.a */
/* JADX INFO: compiled from: LocaleMatcher.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5630a {

    /* JADX INFO: renamed from: com.facebook.hermes.intl.a$a */
    /* JADX INFO: compiled from: LocaleMatcher.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public InterfaceC40273b<?> f8783a;

        /* JADX INFO: renamed from: b */
        public HashMap<String, String> f8784b = new HashMap<>();
    }

    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: c */
    public static a m9050c(String[] strArr) throws JSRangeErrorException {
        a aVar = new a();
        for (String str : strArr) {
            InterfaceC40273b interfaceC40273bM88690b = C40277f.m88690b(str);
            ULocale uLocaleM9049b = m9049b(interfaceC40273bM88690b);
            if (uLocaleM9049b != null) {
                aVar.f8783a = C40278g.m88693j(uLocaleM9049b);
                aVar.f8784b = interfaceC40273bM88690b.mo88661d();
                return aVar;
            }
        }
        aVar.f8783a = C40278g.m88691h();
        return aVar;
    }

    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: d */
    public static String[] m9051d(String[] strArr) throws JSRangeErrorException {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (m9049b(C40277f.m88690b(str)) != null) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX INFO: renamed from: e */
    public static String[] m9052e() {
        ArrayList arrayList = new ArrayList();
        for (Locale locale : Locale.getAvailableLocales()) {
            arrayList.add(locale.toLanguageTag());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX INFO: renamed from: g */
    public static a m9054g(String[] strArr, String[] strArr2) throws JSRangeErrorException {
        a aVar = new a();
        for (String str : strArr) {
            InterfaceC40273b interfaceC40273bM88690b = C40277f.m88690b(str);
            String strM9048a = m9048a(strArr2, interfaceC40273bM88690b.mo88659b());
            if (!strM9048a.isEmpty()) {
                aVar.f8783a = C40277f.m88690b(strM9048a);
                aVar.f8784b = interfaceC40273bM88690b.mo88661d();
                return aVar;
            }
        }
        aVar.f8783a = C40277f.m88689a();
        return aVar;
    }

    /* JADX INFO: renamed from: h */
    public static String[] m9055h(String[] strArr) throws JSRangeErrorException {
        ArrayList arrayList = new ArrayList();
        String[] strArrM9052e = m9052e();
        for (String str : strArr) {
            String strM9048a = m9048a(strArrM9052e, C40277f.m88690b(str).mo88659b());
            if (strM9048a != null && !strM9048a.isEmpty()) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX INFO: renamed from: a */
    public static String m9048a(String[] strArr, String str) {
        while (Arrays.asList(strArr).indexOf(str) <= -1) {
            int iLastIndexOf = str.lastIndexOf(C33820nf.f71144W);
            if (iLastIndexOf < 0) {
                return "";
            }
            if (iLastIndexOf >= 2 && str.charAt(iLastIndexOf - 2) == '-') {
                iLastIndexOf -= 2;
            }
            str = str.substring(0, iLastIndexOf);
        }
        return str;
    }

    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: b */
    public static ULocale m9049b(InterfaceC40273b<?> interfaceC40273b) throws JSRangeErrorException {
        boolean[] zArr = new boolean[1];
        ULocale uLocaleAcceptLanguage = ULocale.acceptLanguage(new ULocale[]{(ULocale) interfaceC40273b.mo88658a()}, ULocale.getAvailableLocales(), zArr);
        if (!zArr[0] && uLocaleAcceptLanguage != null) {
            return uLocaleAcceptLanguage;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static a m9053f(String[] strArr) throws JSRangeErrorException {
        return m9054g(strArr, m9052e());
    }
}
