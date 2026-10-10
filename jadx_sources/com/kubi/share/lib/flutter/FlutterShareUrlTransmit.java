package com.kubi.share.lib.flutter;

import com.kubi.share.api.IShareService;
import org.jetbrains.annotations.NotNull;
import p741wy.InterfaceC45955o;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.share.lib.flutter.g, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FlutterShareUrlTransmit.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/share/lib/flutter/FlutterShareUrlTransmit;", "Lcom/kubi/sdk/flutter/transmit/IShareUrlTransmit;", "<init>", "()V", "getShareUrl", "", "utmSource", "ShareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FlutterShareUrlTransmit implements InterfaceC45955o {
    @Override // p741wy.InterfaceC45955o
    @NotNull
    /* JADX INFO: renamed from: g */
    public String mo59666g(@NotNull String utmSource) {
        Intrinsics.checkNotNullParameter(utmSource, "utmSource");
        return IShareService.f49268a.get().mo38d(utmSource);
    }
}
