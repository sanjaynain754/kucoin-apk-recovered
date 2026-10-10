package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1mSDK implements AFj1nSDK {
    private static final BitSet component2;
    final Handler AFAdRevenueData;
    private final ExecutorService areAllFieldsValid;
    private final Map<AFj1pSDK, AFj1pSDK> component1;
    private final Map<AFj1pSDK, Map<String, Object>> component3;
    private final SensorManager component4;
    private boolean equals;
    final Runnable getCurrencyIso4217Code;
    boolean getMediationNetwork;
    final Runnable getMonetizationNetwork;
    final Object getRevenue;
    private final Runnable hashCode;

    @VisibleForTesting
    private AFj1mSDK(@NonNull SensorManager sensorManager, Handler handler, ExecutorService executorService) {
        this.getRevenue = new Object();
        BitSet bitSet = component2;
        this.component1 = new HashMap(bitSet.size());
        this.component3 = new ConcurrentHashMap(bitSet.size());
        this.getCurrencyIso4217Code = new Runnable() { // from class: com.appsflyer.internal.AFj1mSDK.4
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1mSDK.this.getRevenue) {
                    AFj1mSDK.this.getMediationNetwork();
                    AFj1mSDK aFj1mSDK = AFj1mSDK.this;
                    aFj1mSDK.AFAdRevenueData.postDelayed(aFj1mSDK.getMonetizationNetwork, 150L);
                    AFj1mSDK.this.getMediationNetwork = true;
                }
            }
        };
        this.getMonetizationNetwork = new Runnable() { // from class: com.appsflyer.internal.d0
            @Override // java.lang.Runnable
            public final void run() {
                this.f6315b.component3();
            }
        };
        this.hashCode = new Runnable() { // from class: com.appsflyer.internal.AFj1mSDK.5
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1mSDK.this.getRevenue) {
                    try {
                        AFj1mSDK aFj1mSDK = AFj1mSDK.this;
                        if (aFj1mSDK.getMediationNetwork) {
                            aFj1mSDK.AFAdRevenueData.removeCallbacks(aFj1mSDK.getCurrencyIso4217Code);
                            AFj1mSDK aFj1mSDK2 = AFj1mSDK.this;
                            aFj1mSDK2.AFAdRevenueData.removeCallbacks(aFj1mSDK2.getMonetizationNetwork);
                            AFj1mSDK.this.getCurrencyIso4217Code();
                            AFj1mSDK.this.getMediationNetwork = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        };
        this.component4 = sensorManager;
        this.AFAdRevenueData = handler;
        this.areAllFieldsValid = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component4() {
        try {
            for (Sensor sensor : this.component4.getSensorList(-1)) {
                if (getRevenue(sensor.getType())) {
                    AFj1pSDK aFj1pSDK = new AFj1pSDK(sensor, this.areAllFieldsValid);
                    if (!this.component1.containsKey(aFj1pSDK)) {
                        this.component1.put(aFj1pSDK, aFj1pSDK);
                    }
                    this.component4.registerListener(this.component1.get(aFj1pSDK), sensor, 1, this.AFAdRevenueData);
                }
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("registerListeners error", th2);
        }
        this.equals = true;
    }

    private static boolean getRevenue(int i11) {
        return i11 >= 0 && component2.get(i11);
    }

    @Override // com.appsflyer.internal.AFj1nSDK
    public final synchronized void AFAdRevenueData() {
        this.AFAdRevenueData.post(this.hashCode);
    }

    static {
        BitSet bitSet = new BitSet(6);
        component2 = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    @NonNull
    @VisibleForTesting
    private List<Map<String, Object>> areAllFieldsValid() {
        synchronized (this.getRevenue) {
            try {
                if (!this.component1.isEmpty() && this.equals) {
                    Iterator<AFj1pSDK> it = this.component1.values().iterator();
                    while (it.hasNext()) {
                        it.next().getRevenue(this.component3, false);
                    }
                }
                if (this.component3.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.EMPTY_LIST);
                }
                return new CopyOnWriteArrayList(this.component3.values());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component1() {
        try {
            if (!this.component1.isEmpty()) {
                for (AFj1pSDK aFj1pSDK : this.component1.values()) {
                    this.component4.unregisterListener(aFj1pSDK);
                    aFj1pSDK.getRevenue(this.component3, true);
                }
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("error while unregistering listeners", th2);
        }
        this.equals = false;
    }

    @NonNull
    @VisibleForTesting
    private List<Map<String, Object>> component2() {
        synchronized (this.getRevenue) {
            try {
                Iterator<AFj1pSDK> it = this.component1.values().iterator();
                while (it.hasNext()) {
                    it.next().getRevenue(this.component3, true);
                }
                if (this.component3.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.EMPTY_LIST);
                }
                return new CopyOnWriteArrayList(this.component3.values());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component3() {
        synchronized (this.getRevenue) {
            this.AFAdRevenueData.post(new RunnableC5194e0(this));
        }
    }

    public final void getCurrencyIso4217Code() {
        this.AFAdRevenueData.post(new RunnableC5194e0(this));
    }

    @VisibleForTesting
    public final void getMediationNetwork() {
        this.AFAdRevenueData.post(new Runnable() { // from class: com.appsflyer.internal.f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f6322b.component4();
            }
        });
    }

    @Override // com.appsflyer.internal.AFj1nSDK
    public final void getMonetizationNetwork() {
        this.AFAdRevenueData.post(this.hashCode);
        this.AFAdRevenueData.post(this.getCurrencyIso4217Code);
    }

    @Override // com.appsflyer.internal.AFj1nSDK
    @NonNull
    public final Map<String, Object> getRevenue() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> listAreAllFieldsValid = areAllFieldsValid();
        if (!listAreAllFieldsValid.isEmpty()) {
            concurrentHashMap.put("sensors", listAreAllFieldsValid);
            return concurrentHashMap;
        }
        List<Map<String, Object>> listComponent2 = component2();
        if (!listComponent2.isEmpty()) {
            concurrentHashMap.put("sensors", listComponent2);
        }
        return concurrentHashMap;
    }

    public AFj1mSDK(@NonNull Context context, ExecutorService executorService) {
        SensorManager sensorManager = (SensorManager) context.getApplicationContext().getSystemService("sensor");
        HandlerThread handlerThread = new HandlerThread("internal");
        handlerThread.start();
        this(sensorManager, new Handler(handlerThread.getLooper()), executorService);
    }
}
