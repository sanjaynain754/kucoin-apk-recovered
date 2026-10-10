package com.appsflyer.internal;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nExcManagerClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExcManagerClient.kt\ncom/appsflyer/internal/logger/ExcManagerClient\n+ 2 StringExtensions.kt\ncom/appsflyer/internal/util/StringExtensionsKt\n*L\n1#1,26:1\n36#2:27\n*S KotlinDebug\n*F\n+ 1 ExcManagerClient.kt\ncom/appsflyer/internal/logger/ExcManagerClient\n*L\n21#1:27\n*E\n"})
public final class AFg1cSDK extends AFg1bSDK {

    @NotNull
    private final AFd1zSDK getRevenue;

    public AFg1cSDK(@NotNull AFd1zSDK aFd1zSDK) {
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        this.getRevenue = aFd1zSDK;
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    /* JADX INFO: renamed from: e */
    public final void mo5915e(@NotNull AFh1ySDK aFh1ySDK, @NotNull String str, @NotNull Throwable th2, boolean z11, boolean z12, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(aFh1ySDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        if (z13) {
            if (StringsKt.isBlank(str)) {
                str = "missing label";
            }
            this.getRevenue.afErrorLogForExcManagerOnly().getRevenue(th2, withTag$SDK_prodRelease(str, aFh1ySDK));
        }
    }
}
