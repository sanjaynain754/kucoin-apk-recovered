package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class AFc1jSDK implements AFc1pSDK {

    @NotNull
    private final AFc1gSDK<SharedPreferences> getMediationNetwork;

    @NotNull
    private final Lazy getRevenue;

    @Override // com.appsflyer.internal.AFc1pSDK
    public final long AFAdRevenueData(@Nullable String str, long j11) {
        try {
            return ((SharedPreferences) this.getRevenue.getValue()).getLong(str, j11);
        } catch (ClassCastException e11) {
            AFg1bSDK.e$default(AFLogger.INSTANCE, AFh1ySDK.PREFERENCES, "Unexpected data type found for key " + str, e11, false, false, false, false, 120, null);
            return j11;
        }
    }

    @Override // com.appsflyer.internal.AFc1pSDK
    public final void getRevenue(@Nullable String str, boolean z11) {
        ((SharedPreferences) this.getRevenue.getValue()).edit().putBoolean(str, z11).apply();
    }

    public AFc1jSDK(@NotNull AFc1gSDK<SharedPreferences> aFc1gSDK) {
        Intrinsics.checkNotNullParameter(aFc1gSDK, "");
        this.getMediationNetwork = aFc1gSDK;
        this.getRevenue = LazyKt.lazy(new Function0<SharedPreferences>() { // from class: com.appsflyer.internal.AFc1jSDK.2
            {
                super(0);
            }

            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: m_, reason: merged with bridge method [inline-methods] */
            public final SharedPreferences invoke() {
                return (SharedPreferences) AFc1jSDK.this.getMediationNetwork.getMediationNetwork.invoke();
            }
        });
    }

    @Override // com.appsflyer.internal.AFc1pSDK
    public final void getCurrencyIso4217Code(@Nullable String str, long j11) {
        ((SharedPreferences) this.getRevenue.getValue()).edit().putLong(str, j11).apply();
    }

    @Override // com.appsflyer.internal.AFc1pSDK
    @Nullable
    public final String getMediationNetwork(@Nullable String str, @Nullable String str2) {
        try {
            return ((SharedPreferences) this.getRevenue.getValue()).getString(str, str2);
        } catch (ClassCastException e11) {
            AFg1bSDK.e$default(AFLogger.INSTANCE, AFh1ySDK.PREFERENCES, "Unexpected data type found for key " + str, e11, false, false, false, false, 120, null);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.AFc1pSDK
    public final void getMonetizationNetwork(@Nullable String str, @Nullable String str2) {
        ((SharedPreferences) this.getRevenue.getValue()).edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFc1pSDK
    public final void getRevenue(@Nullable String str, int i11) {
        ((SharedPreferences) this.getRevenue.getValue()).edit().putInt(str, i11).apply();
    }

    @Override // com.appsflyer.internal.AFc1pSDK
    public final int AFAdRevenueData(@Nullable String str, int i11) {
        try {
            return ((SharedPreferences) this.getRevenue.getValue()).getInt(str, i11);
        } catch (ClassCastException e11) {
            AFg1bSDK.e$default(AFLogger.INSTANCE, AFh1ySDK.PREFERENCES, "Unexpected data type found for key " + str, e11, false, false, false, false, 120, null);
            return i11;
        }
    }

    @Override // com.appsflyer.internal.AFc1pSDK
    public final boolean getMonetizationNetwork(@Nullable String str, boolean z11) {
        try {
            return ((SharedPreferences) this.getRevenue.getValue()).getBoolean(str, z11);
        } catch (ClassCastException e11) {
            AFg1bSDK.e$default(AFLogger.INSTANCE, AFh1ySDK.PREFERENCES, "Unexpected data type found for key " + str, e11, false, false, false, false, 120, null);
            return z11;
        }
    }

    @Override // com.appsflyer.internal.AFc1pSDK
    public final void getRevenue(@Nullable String str) {
        ((SharedPreferences) this.getRevenue.getValue()).edit().remove(str).apply();
    }

    @Override // com.appsflyer.internal.AFc1pSDK
    public final boolean getMonetizationNetwork(@Nullable String str) {
        return ((SharedPreferences) this.getRevenue.getValue()).contains(str);
    }
}
