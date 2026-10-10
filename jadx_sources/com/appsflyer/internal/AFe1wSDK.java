package com.appsflyer.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class AFe1wSDK {

    @NotNull
    final String getMediationNetwork;

    @NotNull
    final String getMonetizationNetwork;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFe1wSDK)) {
            return false;
        }
        AFe1wSDK aFe1wSDK = (AFe1wSDK) obj;
        return Intrinsics.areEqual(this.getMediationNetwork, aFe1wSDK.getMediationNetwork) && Intrinsics.areEqual(this.getMonetizationNetwork, aFe1wSDK.getMonetizationNetwork);
    }

    public AFe1wSDK(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.getMediationNetwork = str;
        this.getMonetizationNetwork = str2;
    }

    public final int hashCode() {
        return (this.getMediationNetwork.hashCode() * 31) + this.getMonetizationNetwork.hashCode();
    }

    @NotNull
    public final String toString() {
        return "HostConfig(prefix=" + this.getMediationNetwork + ", host=" + this.getMonetizationNetwork + ")";
    }
}
