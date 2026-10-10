package com.sumsub.sns.internal.fingerprint.infoproviders;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.sumsub.sns.internal.fingerprint.tools.threading.safe.AbstractC33266c;
import java.lang.reflect.InvocationTargetException;
import p852kotlin.Result;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.fingerprint.infoproviders.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33204a {

    /* JADX INFO: renamed from: a */
    public final Context f67750a;

    /* JADX INFO: renamed from: a */
    public final String m71555a() {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.infoproviders.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C33204a.m71553a(this.f67780b);
            }
        });
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = "";
        }
        return (String) objM71616a;
    }

    /* JADX INFO: renamed from: b */
    public final String m71556b() {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.infoproviders.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C33204a.m71554b(this.f67783b);
            }
        });
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = "";
        }
        return (String) objM71616a;
    }

    public C33204a(Context context) {
        this.f67750a = context;
    }

    /* JADX INFO: renamed from: a */
    public static final String m71553a(C33204a c33204a) {
        int intExtra;
        Intent intentRegisterReceiver = c33204a.f67750a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null || (intExtra = intentRegisterReceiver.getIntExtra("health", -1)) == -1) {
            return "";
        }
        switch (intExtra) {
            case 2:
                return "good";
            case 3:
                return "overheat";
            case 4:
                return "dead";
            case 5:
                return "over voltage";
            case 6:
                return "unspecified failure";
            case 7:
                return "cold";
            default:
                return "unknown";
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m71554b(C33204a c33204a) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        return String.valueOf(((Double) Class.forName("com.android.internal.os.PowerProfile").getMethod("getBatteryCapacity", null).invoke(Class.forName("com.android.internal.os.PowerProfile").getConstructor(Context.class).newInstance(c33204a.f67750a), null)).doubleValue());
    }
}
