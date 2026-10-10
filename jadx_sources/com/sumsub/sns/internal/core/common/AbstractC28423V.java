package com.sumsub.sns.internal.core.common;

import com.tencent.bugly.proguard.C33820nf;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.V */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28423V {

    /* JADX INFO: renamed from: a */
    public static final Set f57933a = SetsKt.setOf((Object[]) new String[]{"zh-tw", "pt-br"});

    /* JADX INFO: renamed from: b */
    public static final Lazy f57934b = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.common.m1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC28423V.m69308a();
        }
    });

    /* JADX INFO: renamed from: a */
    public static final HashMap m69308a() {
        String[] iSOCountries = Locale.getISOCountries();
        HashMap map = new HashMap(iSOCountries.length);
        for (String str : iSOCountries) {
            Locale locale = new Locale("", str);
            map.put(locale.getISO3Country().toUpperCase(Locale.ROOT), locale);
        }
        map.put("RKS", new Locale("", "XK"));
        map.put("ANT", new Locale("", "NL"));
        return map;
    }

    /* JADX INFO: renamed from: a */
    public static String m69307a(Locale locale) {
        if (!StringsKt.isBlank(locale.getCountry())) {
            String str = locale.getLanguage() + C33820nf.f71144W + locale.getCountry().toLowerCase(Locale.ROOT);
            if (f57933a.contains(str)) {
                return str;
            }
        }
        return locale.getLanguage();
    }
}
