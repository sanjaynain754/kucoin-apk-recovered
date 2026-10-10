package com.kubi.p110rn.core;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RnDebugBundleInfo.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\u0003¨\u0006\b"}, m90084d2 = {"Lcom/kubi/rn/core/RnDebugBundleInfo;", "", "bizBundlePath", "", "baseBundlePath", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toDialogContent", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RnDebugBundleInfo {
    /* JADX WARN: Multi-variable type inference failed */
    public RnDebugBundleInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public RnDebugBundleInfo(@NotNull String bizBundlePath, @Nullable String str) {
        Intrinsics.checkNotNullParameter(bizBundlePath, "bizBundlePath");
    }

    @NotNull
    public final String toDialogContent() {
        return "";
    }

    public /* synthetic */ RnDebugBundleInfo(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? null : str2);
    }
}
