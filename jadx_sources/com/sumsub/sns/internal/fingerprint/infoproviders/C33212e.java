package com.sumsub.sns.internal.fingerprint.infoproviders;

import android.os.Build;
import com.sumsub.sns.internal.fingerprint.tools.threading.safe.AbstractC33266c;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import p852kotlin.Result;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.fingerprint.infoproviders.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33212e {
    /* JADX INFO: renamed from: a */
    public static final Map m71561a(C33212e c33212e) {
        c33212e.getClass();
        HashMap map = new HashMap();
        Scanner scanner = new Scanner(new File("/proc/cpuinfo"));
        while (scanner.hasNextLine()) {
            List listSplit$default = StringsKt.split$default((CharSequence) scanner.nextLine(), new String[]{": "}, false, 0, 6, (Object) null);
            if (listSplit$default.size() > 1) {
                map.put(StringsKt.trim((CharSequence) listSplit$default.get(0)).toString(), StringsKt.trim((CharSequence) listSplit$default.get(1)).toString());
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: b */
    public static final String m71562b() {
        return Build.SUPPORTED_ABIS[0];
    }

    /* JADX INFO: renamed from: c */
    public final int m71565c() {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.infoproviders.v
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(C33212e.m71563d());
            }
        });
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = 0;
        }
        return ((Number) objM71616a).intValue();
    }

    /* JADX INFO: renamed from: e */
    public final Map m71566e() {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.infoproviders.u
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C33212e.m71561a(this.f67790b);
            }
        });
        Map mapEmptyMap = MapsKt.emptyMap();
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = mapEmptyMap;
        }
        return (Map) objM71616a;
    }

    /* JADX INFO: renamed from: d */
    public static final int m71563d() {
        return Runtime.getRuntime().availableProcessors();
    }

    /* JADX INFO: renamed from: a */
    public final String m71564a() {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.infoproviders.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C33212e.m71562b();
            }
        });
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = "";
        }
        return (String) objM71616a;
    }
}
