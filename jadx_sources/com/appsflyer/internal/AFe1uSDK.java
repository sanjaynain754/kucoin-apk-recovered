package com.appsflyer.internal;

import android.annotation.SuppressLint;
import com.appsflyer.internal.AFe1nSDK.RunnableC51572;
import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class AFe1uSDK {

    @NotNull
    public final AFc1fSDK AFAdRevenueData;

    @NotNull
    private final AFf1fSDK areAllFieldsValid;

    @NotNull
    private final AFe1nSDK component3;

    @NotNull
    public final AFc1pSDK getCurrencyIso4217Code;

    @NotNull
    private final AFg1pSDK getMediationNetwork;

    @NotNull
    private final AFc1kSDK getMonetizationNetwork;

    @NotNull
    private final ExecutorService getRevenue;

    public AFe1uSDK(@NotNull AFc1pSDK aFc1pSDK, @NotNull AFc1fSDK aFc1fSDK, @NotNull AFc1kSDK aFc1kSDK, @NotNull ExecutorService executorService, @NotNull AFg1pSDK aFg1pSDK, @NotNull AFf1fSDK aFf1fSDK, @NotNull AFe1nSDK aFe1nSDK) {
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFc1fSDK, "");
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFg1pSDK, "");
        Intrinsics.checkNotNullParameter(aFf1fSDK, "");
        Intrinsics.checkNotNullParameter(aFe1nSDK, "");
        this.getCurrencyIso4217Code = aFc1pSDK;
        this.AFAdRevenueData = aFc1fSDK;
        this.getMonetizationNetwork = aFc1kSDK;
        this.getRevenue = executorService;
        this.getMediationNetwork = aFg1pSDK;
        this.areAllFieldsValid = aFf1fSDK;
        this.component3 = aFe1nSDK;
    }

    @SuppressLint({"NewApi"})
    public final void AFAdRevenueData() {
        if (this.getCurrencyIso4217Code.getMonetizationNetwork("didSendRevenueTriggerOnLastBackground", true) || !AFj1jSDK.getMonetizationNetwork(this.AFAdRevenueData.getMonetizationNetwork)) {
            return;
        }
        getCurrencyIso4217Code(AFe1sSDK.AFa1zSDK.INSTANCE, new Function1<AFe1qSDK, Unit>() { // from class: com.appsflyer.internal.AFe1uSDK.2
            {
                super(1);
            }

            public final void getMediationNetwork(@NotNull AFe1qSDK aFe1qSDK) {
                Intrinsics.checkNotNullParameter(aFe1qSDK, "");
                if (aFe1qSDK == AFe1qSDK.SUCCESS) {
                    AFe1uSDK.this.getCurrencyIso4217Code.getRevenue("didSendRevenueTriggerOnLastBackground", true);
                }
            }

            @Override // p852kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFe1qSDK aFe1qSDK) {
                getMediationNetwork(aFe1qSDK);
                return Unit.INSTANCE;
            }
        });
    }

    @SuppressLint({"NewApi"})
    public final void getCurrencyIso4217Code(@NotNull AFe1sSDK aFe1sSDK, @NotNull Function1<? super AFe1qSDK, Unit> function1) {
        Intrinsics.checkNotNullParameter(aFe1sSDK, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AFe1aSDK aFe1aSDK = new AFe1aSDK(aFe1sSDK, this.getRevenue, this.getMonetizationNetwork, this.AFAdRevenueData, this.getMediationNetwork, this.areAllFieldsValid, function1);
        AFe1nSDK aFe1nSDK = this.component3;
        aFe1nSDK.getMonetizationNetwork.execute(aFe1nSDK.new RunnableC51572(aFe1aSDK));
    }
}
