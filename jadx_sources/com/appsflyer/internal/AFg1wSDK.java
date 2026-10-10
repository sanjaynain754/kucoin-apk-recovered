package com.appsflyer.internal;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface AFg1wSDK {

    /* JADX INFO: loaded from: classes34.dex */
    public static final class AFa1uSDK {
        final float getMediationNetwork;

        @Nullable
        final String getRevenue;

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1uSDK)) {
                return false;
            }
            AFa1uSDK aFa1uSDK = (AFa1uSDK) obj;
            return Float.compare(this.getMediationNetwork, aFa1uSDK.getMediationNetwork) == 0 && Intrinsics.areEqual(this.getRevenue, aFa1uSDK.getRevenue);
        }

        public final int hashCode() {
            int iHashCode = Float.hashCode(this.getMediationNetwork) * 31;
            String str = this.getRevenue;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final String toString() {
            return "BatteryData(level=" + this.getMediationNetwork + ", charging=" + this.getRevenue + ")";
        }

        public AFa1uSDK(float f11, @Nullable String str) {
            this.getMediationNetwork = f11;
            this.getRevenue = str;
        }
    }

    @NotNull
    AFa1uSDK getMediationNetwork(@NotNull Context context);
}
