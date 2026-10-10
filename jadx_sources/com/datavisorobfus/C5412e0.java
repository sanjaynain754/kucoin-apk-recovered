package com.datavisorobfus;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.datavisorobfus.e0 */
/* JADX INFO: loaded from: classes34.dex */
public class C5412e0 {

    /* JADX INFO: renamed from: com.datavisorobfus.e0$a */
    public class a implements LocationListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Map f7247a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ LocationManager f7248b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ CountDownLatch f7249c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Looper f7250d;

        public a(Map map, LocationManager locationManager, CountDownLatch countDownLatch, Looper looper) {
            this.f7247a = map;
            this.f7248b = locationManager;
            this.f7249c = countDownLatch;
            this.f7250d = looper;
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            Map map;
            String strValueOf = "empty";
            try {
                try {
                    if (location != null) {
                        this.f7247a.put("dv_latitude", String.valueOf(location.getLatitude()));
                        Map map2 = this.f7247a;
                        strValueOf = String.valueOf(location.getLongitude());
                        map = map2;
                    } else {
                        C5415f0.m7136a("newLocation is null");
                        this.f7247a.put("dv_latitude", "empty");
                        map = this.f7247a;
                    }
                    map.put("dv_longitude", strValueOf);
                    this.f7248b.removeUpdates(this);
                } catch (Throwable th2) {
                    try {
                        C5415f0.m7139a(th2);
                        this.f7247a.put("dv_latitude", "exception");
                        this.f7247a.put("dv_longitude", "exception");
                        this.f7248b.removeUpdates(this);
                    } catch (Throwable th3) {
                        try {
                            this.f7248b.removeUpdates(this);
                            this.f7249c.countDown();
                            this.f7250d.quitSafely();
                        } catch (Throwable unused) {
                        }
                        throw th3;
                    }
                }
                this.f7249c.countDown();
                this.f7250d.quitSafely();
            } catch (Throwable unused2) {
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i11, Bundle bundle) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, String> m7133a(Context context) {
        Looper looper;
        HashMap map = new HashMap();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        HandlerThread handlerThread = new HandlerThread("dv-location-thread");
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        try {
            if (C5440r.m7280b(context, "android.permission.ACCESS_COARSE_LOCATION") && C5440r.m7280b(context, "android.permission.ACCESS_FINE_LOCATION")) {
                C5415f0.m7136a("no location permission");
                map.put("dv_latitude", "no_permission");
                map.put("dv_longitude", "no_permission");
                looper2.quitSafely();
                countDownLatch.countDown();
                return map;
            }
            LocationManager locationManager = (LocationManager) context.getSystemService(FirebaseAnalytics.Param.LOCATION);
            Criteria criteria = new Criteria();
            criteria.setAccuracy(2);
            criteria.setPowerRequirement(1);
            String bestProvider = locationManager.getBestProvider(criteria, true);
            a aVar = new a(map, locationManager, countDownLatch, looper2);
            looper = looper2;
            try {
                try {
                    locationManager.requestLocationUpdates(bestProvider, 0L, 0.0f, aVar, looper);
                } catch (SecurityException e11) {
                    aVar = aVar;
                    C5415f0.m7139a(e11);
                    map.put("dv_latitude", "exception");
                    map.put("dv_longitude", "exception");
                    countDownLatch.countDown();
                    looper.quitSafely();
                }
                if (!countDownLatch.await(3000L, TimeUnit.MILLISECONDS)) {
                    C5415f0.m7136a("get location overtime");
                    map.put("dv_latitude", "empty");
                    map.put("dv_longitude", "empty");
                    try {
                        locationManager.removeUpdates(aVar);
                    } catch (Throwable unused) {
                    }
                    looper.quitSafely();
                }
                return map;
            } catch (Throwable th2) {
                th = th2;
                C5415f0.m7139a(th);
                map.put("dv_latitude", "exception");
                map.put("dv_longitude", "exception");
                looper.quitSafely();
                return map;
            }
        } catch (Throwable th3) {
            th = th3;
            looper = looper2;
        }
    }
}
