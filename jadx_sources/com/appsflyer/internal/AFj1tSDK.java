package com.appsflyer.internal;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFj1tSDK extends Observable {
    public final String AFAdRevenueData;
    public final String component2;
    long component4;
    final Runnable getRevenue;
    public final Map<String, Object> getMediationNetwork = new HashMap();
    public AFa1ySDK areAllFieldsValid = AFa1ySDK.NOT_STARTED;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1tSDK$2 */
    /* JADX INFO: loaded from: classes34.dex */
    public class C51842 implements Observer {
        public C51842() {
        }

        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            AFj1tSDK.this.getRevenue.run();
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public enum AFa1ySDK {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public abstract void AFAdRevenueData(Context context);

    public void getMonetizationNetwork() {
        this.getMediationNetwork.put("latency", Long.valueOf(System.currentTimeMillis() - this.component4));
    }

    public final void getRevenue() {
        this.getMediationNetwork.put("source", this.AFAdRevenueData);
        this.getMediationNetwork.put("type", this.component2);
        getMonetizationNetwork();
        this.areAllFieldsValid = AFa1ySDK.FINISHED;
        setChanged();
        notifyObservers();
    }

    public AFj1tSDK(String str, String str2, Runnable runnable) {
        this.getRevenue = runnable;
        this.AFAdRevenueData = str2;
        this.component2 = str;
    }
}
