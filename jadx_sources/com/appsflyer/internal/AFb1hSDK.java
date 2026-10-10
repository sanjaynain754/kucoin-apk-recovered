package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class AFb1hSDK implements AFb1gSDK {

    @NotNull
    private final AFc1iSDK AFAdRevenueData;

    @NotNull
    private final AFc1fSDK getCurrencyIso4217Code;

    @NotNull
    private final AFf1fSDK getRevenue;

    public AFb1hSDK(@NotNull AFc1iSDK aFc1iSDK, @NotNull AFc1fSDK aFc1fSDK, @NotNull AFf1fSDK aFf1fSDK) {
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        Intrinsics.checkNotNullParameter(aFc1fSDK, "");
        Intrinsics.checkNotNullParameter(aFf1fSDK, "");
        this.AFAdRevenueData = aFc1iSDK;
        this.getCurrencyIso4217Code = aFc1fSDK;
        this.getRevenue = aFf1fSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFb1hSDK aFb1hSDK, AppSetIdInfo appSetIdInfo) {
        Intrinsics.checkNotNullParameter(aFb1hSDK, "");
        AFc1iSDK aFc1iSDK = aFb1hSDK.AFAdRevenueData;
        int scope = appSetIdInfo.getScope();
        String id2 = appSetIdInfo.getId();
        Intrinsics.checkNotNullExpressionValue(id2, "");
        aFc1iSDK.copy = new AFb1cSDK(scope, id2);
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final boolean AFAdRevenueData() {
        return !this.getRevenue.getMediationNetwork() && !this.AFAdRevenueData.AFAdRevenueData() && AFj1jSDK.getCurrencyIso4217Code(this.getCurrencyIso4217Code.getMonetizationNetwork) && AFj1jSDK.AFAdRevenueData(this.getCurrencyIso4217Code.getMonetizationNetwork);
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final void getCurrencyIso4217Code() {
        Context context = this.getCurrencyIso4217Code.getMonetizationNetwork;
        if (context != null) {
            try {
                Intrinsics.checkNotNullExpressionValue(AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener() { // from class: com.appsflyer.internal.j
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        AFb1hSDK.getMonetizationNetwork(this.f6334a, (AppSetIdInfo) obj);
                    }
                }), "");
            } catch (Throwable th2) {
                AFg1bSDK.e$default(AFLogger.INSTANCE, AFh1ySDK.APP_SET_ID, "Error while trying to  fetch App set ID", th2, false, false, false, false, 120, null);
                Unit unit = Unit.INSTANCE;
            }
        }
    }
}
