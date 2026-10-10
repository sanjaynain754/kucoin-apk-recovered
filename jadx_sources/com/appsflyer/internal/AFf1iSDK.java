package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1nSDK.RunnableC51572;

/* JADX INFO: loaded from: classes34.dex */
public final class AFf1iSDK implements AFe1rSDK {
    private final Object AFAdRevenueData = new Object();
    private final AFe1nSDK areAllFieldsValid;

    @Nullable
    private AFi1vSDK component1;
    private final AFd1mSDK component2;
    private final AFf1kSDK component3;

    @Nullable
    private AFf1qSDK component4;
    private final AFf1pSDK getCurrencyIso4217Code;
    private final AFc1kSDK getMediationNetwork;
    public final AFf1lSDK getMonetizationNetwork;
    private final AFf1fSDK getRevenue;

    public final void getMonetizationNetwork(@Nullable AFf1oSDK aFf1oSDK) {
        AFf1nSDK aFf1nSDK = new AFf1nSDK(this.getCurrencyIso4217Code, this.getMediationNetwork, this.getRevenue, this.getMonetizationNetwork, this.component2, this.component3, "v1", aFf1oSDK);
        AFe1nSDK aFe1nSDK = this.areAllFieldsValid;
        aFe1nSDK.getMonetizationNetwork.execute(aFe1nSDK.new RunnableC51572(aFf1nSDK));
    }

    private void getRevenue(@NonNull AFf1qSDK aFf1qSDK, @Nullable AFf1oSDK aFf1oSDK) {
        synchronized (this.AFAdRevenueData) {
            this.component4 = aFf1qSDK;
        }
        if (aFf1oSDK != null) {
            aFf1oSDK.onRemoteConfigUpdateFinished(aFf1qSDK);
        }
    }

    @Override // com.appsflyer.internal.AFe1rSDK
    public final void AFAdRevenueData(AFe1mSDK<?> aFe1mSDK, AFe1qSDK aFe1qSDK) {
        if (aFe1mSDK instanceof AFf1nSDK) {
            AFf1nSDK aFf1nSDK = (AFf1nSDK) aFe1mSDK;
            AFf1qSDK aFf1qSDK = aFf1nSDK.component1;
            if (aFf1qSDK == null) {
                AFLogger.INSTANCE.m5978w(AFh1ySDK.REMOTE_CONTROL, "update RC returned null result, something went wrong!");
                aFf1qSDK = AFf1qSDK.FAILURE;
            }
            if (aFf1qSDK != AFf1qSDK.USE_CACHED) {
                AFi1vSDK aFi1vSDK = aFf1nSDK.component2;
                synchronized (this.AFAdRevenueData) {
                    this.component1 = aFi1vSDK;
                }
            }
            getRevenue(aFf1qSDK, aFf1nSDK.areAllFieldsValid);
        }
    }

    @Nullable
    public final AFi1vSDK getCurrencyIso4217Code() {
        AFi1vSDK aFi1vSDK;
        synchronized (this.AFAdRevenueData) {
            aFi1vSDK = this.component1;
            this.component1 = null;
        }
        return aFi1vSDK;
    }

    public AFf1iSDK(AFf1pSDK aFf1pSDK, AFc1kSDK aFc1kSDK, AFf1fSDK aFf1fSDK, AFf1lSDK aFf1lSDK, AFd1mSDK aFd1mSDK, AFf1kSDK aFf1kSDK, AFe1nSDK aFe1nSDK) {
        this.getCurrencyIso4217Code = aFf1pSDK;
        this.getMediationNetwork = aFc1kSDK;
        this.getRevenue = aFf1fSDK;
        this.getMonetizationNetwork = aFf1lSDK;
        this.component2 = aFd1mSDK;
        this.component3 = aFf1kSDK;
        this.areAllFieldsValid = aFe1nSDK;
        aFe1nSDK.getMediationNetwork.add(this);
    }

    @Override // com.appsflyer.internal.AFe1rSDK
    public final void getMonetizationNetwork(AFe1mSDK<?> aFe1mSDK) {
        if (aFe1mSDK instanceof AFf1nSDK) {
            AFf1nSDK aFf1nSDK = (AFf1nSDK) aFe1mSDK;
            synchronized (this.AFAdRevenueData) {
                this.component1 = null;
            }
            getRevenue(AFf1qSDK.FAILURE, aFf1nSDK.areAllFieldsValid);
        }
    }
}
