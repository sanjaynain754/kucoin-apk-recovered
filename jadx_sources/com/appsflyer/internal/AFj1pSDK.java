package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes34.dex */
public final class AFj1pSDK implements SensorEventListener {
    private final int AFAdRevenueData;
    private long component3;

    @NonNull
    private final Executor component4;

    @NonNull
    private final String getCurrencyIso4217Code;
    private double getMediationNetwork;

    @NonNull
    private final String getMonetizationNetwork;
    private final int getRevenue;
    private final float[][] component1 = new float[2][];
    private final long[] areAllFieldsValid = new long[2];

    private static double getCurrencyIso4217Code(@NonNull float[] fArr, @NonNull float[] fArr2) {
        int iMin = Math.min(fArr.length, fArr2.length);
        double dPow = 0.0d;
        for (int i11 = 0; i11 < iMin; i11++) {
            dPow += StrictMath.pow(fArr[i11] - fArr2[i11], 2.0d);
        }
        return Math.sqrt(dPow);
    }

    public final void getRevenue(@NonNull Map<AFj1pSDK, Map<String, Object>> map, boolean z11) {
        if (!AFAdRevenueData()) {
            if (map.containsKey(this)) {
                return;
            }
            map.put(this, getMonetizationNetwork());
            return;
        }
        map.put(this, getMonetizationNetwork());
        if (z11) {
            int length = this.component1.length;
            for (int i11 = 0; i11 < length; i11++) {
                this.component1[i11] = null;
            }
            int length2 = this.areAllFieldsValid.length;
            for (int i12 = 0; i12 < length2; i12++) {
                this.areAllFieldsValid[i12] = 0;
            }
            this.getMediationNetwork = 0.0d;
            this.component3 = 0L;
        }
    }

    private boolean AFAdRevenueData() {
        return this.component1[0] != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* JADX INFO: renamed from: F_, reason: merged with bridge method [inline-methods] */
    public void m6006G_(SensorEvent sensorEvent) {
        long j11 = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long jCurrentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.component1;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.areAllFieldsValid[0] = jCurrentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
            this.component1[1] = fArrCopyOf;
            this.areAllFieldsValid[1] = jCurrentTimeMillis;
            this.getMediationNetwork = getCurrencyIso4217Code(fArr3, fArrCopyOf);
            return;
        }
        if (50000000 <= j11 - this.component3) {
            this.component3 = j11;
            if (Arrays.equals(fArr4, fArr)) {
                this.areAllFieldsValid[1] = jCurrentTimeMillis;
                return;
            }
            double currencyIso4217Code = getCurrencyIso4217Code(fArr3, fArr);
            if (currencyIso4217Code > this.getMediationNetwork) {
                this.component1[1] = Arrays.copyOf(fArr, fArr.length);
                this.areAllFieldsValid[1] = jCurrentTimeMillis;
                this.getMediationNetwork = currencyIso4217Code;
            }
        }
    }

    @NonNull
    private Map<String, Object> getMonetizationNetwork() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.getRevenue));
        concurrentHashMap.put("sN", this.getMonetizationNetwork);
        concurrentHashMap.put("sV", this.getCurrencyIso4217Code);
        float[] fArr = this.component1[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", getCurrencyIso4217Code(fArr));
        }
        float[] fArr2 = this.component1[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", getCurrencyIso4217Code(fArr2));
        }
        return concurrentHashMap;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AFj1pSDK)) {
            return false;
        }
        AFj1pSDK aFj1pSDK = (AFj1pSDK) obj;
        return getRevenue(aFj1pSDK.getRevenue, aFj1pSDK.getMonetizationNetwork, aFj1pSDK.getCurrencyIso4217Code);
    }

    public final int hashCode() {
        return this.AFAdRevenueData;
    }

    public AFj1pSDK(Sensor sensor, @NonNull ExecutorService executorService) {
        int type = sensor.getType();
        this.getRevenue = type;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.getMonetizationNetwork = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.getCurrencyIso4217Code = str;
        this.AFAdRevenueData = ((((type + 31) * 31) + name.hashCode()) * 31) + str.hashCode();
        this.component4 = executorService;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.component4.execute(new Runnable() { // from class: com.appsflyer.internal.g0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6324b.m6006G_(sensorEvent);
                }
            });
        } else {
            m6006G_(sensorEvent);
        }
    }

    @NonNull
    private static List<Float> getCurrencyIso4217Code(@NonNull float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f11 : fArr) {
            arrayList.add(Float.valueOf(f11));
        }
        return arrayList;
    }

    private boolean getRevenue(int i11, @NonNull String str, @NonNull String str2) {
        return this.getRevenue == i11 && this.getMonetizationNetwork.equals(str) && this.getCurrencyIso4217Code.equals(str2);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i11) {
    }
}
