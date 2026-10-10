package com.kubi.kyc.flutter;

import com.kubi.sdk.flutter.transmit.KycFlutterRedirectResult;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p741wy.InterfaceC45950j;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kyc.flutter.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FlutterKycRedirectTransmit.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kyc/flutter/FlutterKycRedirectTransmit;", "Lcom/kubi/sdk/flutter/transmit/IKycFlutterRedirectTransmit;", "<init>", "()V", "handleRedirect", "Lcom/kubi/sdk/flutter/transmit/KycFlutterRedirectResult;", "postcard", "Lcom/kubi/router/model/Postcard;", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FlutterKycRedirectTransmit implements InterfaceC45950j {
    @Override // p741wy.InterfaceC45950j
    @NotNull
    /* JADX INFO: renamed from: p */
    public KycFlutterRedirectResult mo36788p(@NotNull C4400a postcard) {
        Intrinsics.checkNotNullParameter(postcard, "postcard");
        return KycFlutterRedirectHandler.f31215a.m36793e(postcard);
    }
}
