package com.appsflyer.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1cSDK {

    @NotNull
    public final String getMediationNetwork;
    public final int getMonetizationNetwork;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFb1cSDK)) {
            return false;
        }
        AFb1cSDK aFb1cSDK = (AFb1cSDK) obj;
        return this.getMonetizationNetwork == aFb1cSDK.getMonetizationNetwork && Intrinsics.areEqual(this.getMediationNetwork, aFb1cSDK.getMediationNetwork);
    }

    public AFb1cSDK(int i11, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getMonetizationNetwork = i11;
        this.getMediationNetwork = str;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.getMonetizationNetwork) * 31) + this.getMediationNetwork.hashCode();
    }

    @NotNull
    public final String toString() {
        return "AppSetIdModel(scope=" + this.getMonetizationNetwork + ", id=" + this.getMediationNetwork + ")";
    }
}
