package com.facebook.hermes.intl;

import android.icu.text.NumberingSystem;
import android.icu.util.Calendar;
import android.icu.util.ULocale;
import androidx.core.text.util.LocalePreferences;
import androidx.credentials.provider.CredentialEntry;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p359j5.C40275d;
import p359j5.InterfaceC40273b;

/* JADX INFO: loaded from: classes34.dex */
public class UnicodeExtensionKeys {

    /* JADX INFO: renamed from: a */
    public static String f8765a = "calendar";

    /* JADX INFO: renamed from: b */
    public static String f8766b = "ca";

    /* JADX INFO: renamed from: c */
    public static String f8767c = "numbers";

    /* JADX INFO: renamed from: d */
    public static String f8768d = "nu";

    /* JADX INFO: renamed from: e */
    public static String f8769e = "hours";

    /* JADX INFO: renamed from: f */
    public static String f8770f = "hc";

    /* JADX INFO: renamed from: g */
    public static String f8771g = "collation";

    /* JADX INFO: renamed from: h */
    public static String f8772h = "co";

    /* JADX INFO: renamed from: i */
    public static String f8773i = "colnumeric";

    /* JADX INFO: renamed from: j */
    public static String f8774j = "kn";

    /* JADX INFO: renamed from: k */
    public static String f8775k = "colcasefirst";

    /* JADX INFO: renamed from: l */
    public static String f8776l = "kf";

    /* JADX INFO: renamed from: m */
    public static HashMap<String, String> f8777m = new HashMap<String, String>() { // from class: com.facebook.hermes.intl.UnicodeExtensionKeys.1
        {
            put(UnicodeExtensionKeys.f8766b, UnicodeExtensionKeys.f8765a);
            put(UnicodeExtensionKeys.f8768d, UnicodeExtensionKeys.f8767c);
            put(UnicodeExtensionKeys.f8770f, UnicodeExtensionKeys.f8769e);
            put(UnicodeExtensionKeys.f8772h, UnicodeExtensionKeys.f8771g);
            put(UnicodeExtensionKeys.f8774j, UnicodeExtensionKeys.f8773i);
            put(UnicodeExtensionKeys.f8776l, UnicodeExtensionKeys.f8775k);
        }
    };

    /* JADX INFO: renamed from: n */
    public static HashMap<String, String> f8778n = new HashMap<String, String>() { // from class: com.facebook.hermes.intl.UnicodeExtensionKeys.2
        {
            put(UnicodeExtensionKeys.f8765a, UnicodeExtensionKeys.f8766b);
            put(UnicodeExtensionKeys.f8767c, UnicodeExtensionKeys.f8768d);
            put(UnicodeExtensionKeys.f8769e, UnicodeExtensionKeys.f8770f);
            put(UnicodeExtensionKeys.f8771g, UnicodeExtensionKeys.f8772h);
            put(UnicodeExtensionKeys.f8773i, UnicodeExtensionKeys.f8774j);
            put(UnicodeExtensionKeys.f8775k, UnicodeExtensionKeys.f8776l);
        }
    };

    /* JADX INFO: renamed from: o */
    public static final Map<String, String> f8779o = new HashMap<String, String>() { // from class: com.facebook.hermes.intl.UnicodeExtensionKeys.3
        {
            put("dictionary", "dict");
            put("phonebook", "phonebk");
            put("traditional", "trad");
            put("gb2312han", "gb2312");
        }
    };

    /* JADX INFO: renamed from: p */
    public static Map<String, String> f8780p = new HashMap<String, String>() { // from class: com.facebook.hermes.intl.UnicodeExtensionKeys.4
        {
            put(LocalePreferences.CalendarType.GREGORIAN, "gregory");
        }
    };

    /* JADX INFO: renamed from: q */
    public static Map<String, String> f8781q = new HashMap<String, String>() { // from class: com.facebook.hermes.intl.UnicodeExtensionKeys.5
        {
            put("traditional", "traditio");
        }
    };

    /* JADX INFO: renamed from: r */
    public static Map<String, String[]> f8782r = new HashMap<String, String[]>() { // from class: com.facebook.hermes.intl.UnicodeExtensionKeys.6
        {
            put("nu", new String[]{"adlm", "ahom", "arab", "arabext", "bali", "beng", "bhks", "brah", "cakm", "cham", "deva", "diak", "fullwide", "gong", "gonm", "gujr", "guru", "hanidec", "hmng", "hmnp", "java", "kali", "khmr", "knda", "lana", "lanatham", "laoo", "latn", "lepc", "limb", "mathbold", "mathdbl", "mathmono", "mathsanb", "mathsans", "mlym", "modi", "mong", "mroo", "mtei", "mymr", "mymrshan", "mymrtlng", "newa", "nkoo", "olck", "orya", "osma", "rohg", "saur", "segment", "shrd", "sind", "sinh", "sora", "sund", "takr", "talu", "tamldec", "telu", "thai", "tibt", "tirh", "vaii", "wara", "wcho"});
            put("co", new String[]{"big5han", "compat", "dict", DevicePublicKeyStringDef.DIRECT, "ducet", "emoji", "eor", "gb2312", "phonebk", "phonetic", "pinyin", "reformed", "searchjl", "stroke", "trad", "unihan", "zhuyin"});
            put("ca", new String[]{"buddhist", LocalePreferences.CalendarType.CHINESE, "coptic", LocalePreferences.CalendarType.DANGI, "ethioaa", "ethiopic", "gregory", LocalePreferences.CalendarType.HEBREW, LocalePreferences.CalendarType.INDIAN, LocalePreferences.CalendarType.ISLAMIC, LocalePreferences.CalendarType.ISLAMIC_UMALQURA, LocalePreferences.CalendarType.ISLAMIC_TBLA, LocalePreferences.CalendarType.ISLAMIC_CIVIL, LocalePreferences.CalendarType.ISLAMIC_RGSA, "iso8601", "japanese", LocalePreferences.CalendarType.PERSIAN, "roc"});
        }
    };

    /* JADX INFO: renamed from: a */
    public static String m9041a(String str) {
        return f8777m.containsKey(str) ? f8777m.get(str) : str;
    }

    /* JADX INFO: renamed from: b */
    public static String m9042b(String str) {
        return f8778n.containsKey(str) ? f8778n.get(str) : str;
    }

    /* JADX INFO: renamed from: d */
    public static String m9044d(String str) {
        return !f8780p.containsKey(str) ? str : f8780p.get(str);
    }

    /* JADX INFO: renamed from: e */
    public static String m9045e(String str) {
        Map<String, String> map = f8779o;
        return !map.containsKey(str) ? str : map.get(str);
    }

    /* JADX INFO: renamed from: f */
    public static Object m9046f(String str, Object obj) {
        if (str.equals("ca") && C40275d.m88682m(obj)) {
            return m9044d((String) obj);
        }
        if (str.equals("nu") && C40275d.m88682m(obj)) {
            return m9047g((String) obj);
        }
        if (str.equals("co") && C40275d.m88682m(obj)) {
            return m9045e((String) obj);
        }
        if (str.equals("kn") && C40275d.m88682m(obj) && obj.equals("yes")) {
            return C40275d.m88687r(CredentialEntry.TRUE_STRING);
        }
        return ((str.equals("kn") || str.equals("kf")) && C40275d.m88682m(obj) && obj.equals("no")) ? C40275d.m88687r(CredentialEntry.FALSE_STRING) : obj;
    }

    /* JADX INFO: renamed from: g */
    public static String m9047g(String str) {
        return !f8781q.containsKey(str) ? str : f8781q.get(str);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m9043c(String str, String str2, InterfaceC40273b interfaceC40273b) throws JSRangeErrorException {
        ULocale uLocale = (ULocale) interfaceC40273b.getLocale();
        String[] availableNames = new String[0];
        if (str.equals("co")) {
            if (str2.equals("standard") || str2.equals(FirebaseAnalytics.Event.SEARCH)) {
                return false;
            }
            availableNames = android.icu.text.Collator.getKeywordValuesForLocale("co", uLocale, false);
        } else if (str.equals("ca")) {
            availableNames = Calendar.getKeywordValuesForLocale("ca", uLocale, false);
        } else if (str.equals("nu")) {
            availableNames = NumberingSystem.getAvailableNames();
        }
        if (availableNames.length == 0) {
            return true;
        }
        return Arrays.asList(availableNames).contains(str2);
    }
}
