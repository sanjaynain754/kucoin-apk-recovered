package com.sumsub.sns.internal.fingerprint.infoproviders;

import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings;
import com.sumsub.sns.internal.fingerprint.tools.threading.safe.AbstractC33266c;
import p852kotlin.Result;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.fingerprint.infoproviders.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33234p {

    /* JADX INFO: renamed from: a */
    public final ContentResolver f67778a;

    /* JADX INFO: renamed from: a */
    public final String m71608a() {
        return Build.VERSION.SDK_INT >= 28 ? m71610b("rtt_calling_mode") : "";
    }

    /* JADX INFO: renamed from: b */
    public final String m71610b(final String str) {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.infoproviders.q0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C33234p.m71606b(this.f67781b, str);
            }
        });
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = "";
        }
        return (String) objM71616a;
    }

    /* JADX INFO: renamed from: c */
    public final String m71611c(final String str) {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.infoproviders.r0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C33234p.m71607c(this.f67784b, str);
            }
        });
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = "";
        }
        return (String) objM71616a;
    }

    public C33234p(ContentResolver contentResolver) {
        this.f67778a = contentResolver;
    }

    /* JADX INFO: renamed from: b */
    public static final String m71606b(C33234p c33234p, String str) {
        return Settings.Secure.getString(c33234p.f67778a, str);
    }

    /* JADX INFO: renamed from: c */
    public static final String m71607c(C33234p c33234p, String str) {
        return Settings.System.getString(c33234p.f67778a, str);
    }

    /* JADX INFO: renamed from: a */
    public final String m71609a(final String str) {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.infoproviders.s0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C33234p.m71605a(this.f67787b, str);
            }
        });
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = "";
        }
        return (String) objM71616a;
    }

    /* JADX INFO: renamed from: a */
    public static final String m71605a(C33234p c33234p, String str) {
        return Settings.Global.getString(c33234p.f67778a, str);
    }
}
