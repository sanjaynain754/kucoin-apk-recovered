package com.kubi.payment.flutter;

import android.net.Uri;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.payment.flutter.e, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FlutterUtils.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/payment/flutter/FlutterUtils;", "", "<init>", "()V", "generateFlutterRoute", "", "route", "needLogin", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FlutterUtils {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FlutterUtils f39512a = new FlutterUtils();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m48217b(FlutterUtils flutterUtils, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return flutterUtils.m48218a(str, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m48218a(@NotNull String route, boolean z11) {
        Intrinsics.checkNotNullParameter(route, "route");
        return "flutter?route=" + Uri.encode(route) + "&needLogin=" + z11;
    }
}
