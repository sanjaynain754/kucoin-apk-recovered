package com.sumsub.sns.internal.fingerprint.infoproviders;

import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.media.RingtoneManager;
import android.net.Uri;
import com.sumsub.sns.internal.fingerprint.tools.threading.safe.AbstractC33266c;
import java.util.ArrayList;
import java.util.Locale;
import java.util.TimeZone;
import p852kotlin.Result;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.fingerprint.infoproviders.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33214f {

    /* JADX INFO: renamed from: a */
    public final RingtoneManager f67758a;

    /* JADX INFO: renamed from: b */
    public final AssetManager f67759b;

    /* JADX INFO: renamed from: c */
    public final Configuration f67760c;

    /* JADX INFO: renamed from: b */
    public static final String m71569b(C33214f c33214f) {
        Locale locale;
        String country;
        Configuration configuration = c33214f.f67760c;
        return (configuration == null || (locale = configuration.locale) == null || (country = locale.getCountry()) == null) ? "" : country;
    }

    /* JADX INFO: renamed from: c */
    public static final String m71571c(C33214f c33214f) {
        Uri ringtoneUri;
        String string;
        RingtoneManager ringtoneManager = c33214f.f67758a;
        return (ringtoneManager == null || (ringtoneUri = ringtoneManager.getRingtoneUri(0)) == null || (string = ringtoneUri.toString()) == null) ? "" : string;
    }

    /* JADX INFO: renamed from: a */
    public final String[] m71574a() {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.infoproviders.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C33214f.m71567a(this.f67751b);
            }
        });
        String[] strArr = new String[0];
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = strArr;
        }
        return (String[]) objM71616a;
    }

    /* JADX INFO: renamed from: b */
    public static String m71568b() {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.infoproviders.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C33214f.m71570c();
            }
        });
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = "";
        }
        return (String) objM71616a;
    }

    /* JADX INFO: renamed from: c */
    public static final String m71570c() {
        return Locale.getDefault().getLanguage();
    }

    /* JADX INFO: renamed from: f */
    public static String m71572f() {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.infoproviders.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C33214f.m71573g();
            }
        });
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = "";
        }
        return (String) objM71616a;
    }

    /* JADX INFO: renamed from: d */
    public final String m71575d() {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.infoproviders.y
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C33214f.m71569b(this.f67791b);
            }
        });
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = "";
        }
        return (String) objM71616a;
    }

    /* JADX INFO: renamed from: e */
    public final String m71576e() {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.infoproviders.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C33214f.m71571c(this.f67792b);
            }
        });
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = "";
        }
        return (String) objM71616a;
    }

    public C33214f(RingtoneManager ringtoneManager, AssetManager assetManager, Configuration configuration) {
        this.f67758a = ringtoneManager;
        this.f67759b = assetManager;
        this.f67760c = configuration;
    }

    /* JADX INFO: renamed from: g */
    public static final String m71573g() {
        return TimeZone.getDefault().getDisplayName();
    }

    /* JADX INFO: renamed from: a */
    public static final String[] m71567a(C33214f c33214f) {
        String[] locales;
        AssetManager assetManager = c33214f.f67759b;
        if (assetManager != null && (locales = assetManager.getLocales()) != null) {
            ArrayList arrayList = new ArrayList(locales.length);
            for (String str : locales) {
                arrayList.add(String.valueOf(str));
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            if (strArr != null) {
                return strArr;
            }
        }
        return new String[0];
    }
}
