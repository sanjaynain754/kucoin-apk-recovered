package com.kubi.kucoin.utils;

import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseApplication;
import com.kubi.utils.DataMapUtil;
import com.kubi.utils.extensions.C27025c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: LocateUtil.kt */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/kucoin/utils/LocateUtil;", "Lcom/kubi/kucoin/utils/Locate;", "<init>", "()V", "locationManager", "Landroid/location/LocationManager;", "map", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Landroid/location/LocationListener;", "requestOpenGPS", "", "startLocationUpdates", "activity", "Lcom/kubi/sdk/BaseActivity;", "onStart", "onStop", "Companion", "LLocation_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLocateUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocateUtil.kt\ncom/kubi/kucoin/utils/LocateUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,115:1\n1869#2,2:116\n1869#2,2:118\n*S KotlinDebug\n*F\n+ 1 LocateUtil.kt\ncom/kubi/kucoin/utils/LocateUtil\n*L\n87#1:116,2\n110#1:118,2\n*E\n"})
public final class LocateUtil implements Locate {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f28548c = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Lazy<LocateUtil> f28549d = LazyKt.lazy(new Function0() { // from class: com.kubi.kucoin.utils.t0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LocateUtil.m33110w();
        }
    });

    /* JADX INFO: renamed from: a */
    @Nullable
    public LocationManager f28550a = (LocationManager) BaseApplication.INSTANCE.get().getSystemService(FirebaseAnalytics.Param.LOCATION);

    /* JADX INFO: renamed from: b */
    @NotNull
    public ConcurrentHashMap<String, LocationListener> f28551b = new ConcurrentHashMap<>();

    /* JADX INFO: compiled from: LocateUtil.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kucoin/utils/LocateUtil$Companion;", "", "<init>", "()V", "INSTANCE", "Lcom/kubi/kucoin/utils/LocateUtil;", "getINSTANCE", "()Lcom/kubi/kucoin/utils/LocateUtil;", "INSTANCE$delegate", "Lkotlin/Lazy;", "LLocation_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final LocateUtil getINSTANCE() {
            return (LocateUtil) LocateUtil.f28549d.getValue();
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.utils.LocateUtil$a */
    /* JADX INFO: compiled from: LocateUtil.kt */
    @Metadata(m90083d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J$\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\u000f"}, m90084d2 = {"com/kubi/kucoin/utils/LocateUtil$startLocationUpdates$1$locationListener$1", "Landroid/location/LocationListener;", "onLocationChanged", "", FirebaseAnalytics.Param.LOCATION, "Landroid/location/Location;", "onStatusChanged", "provider", "", "status", "", "extras", "Landroid/os/Bundle;", "onProviderEnabled", "onProviderDisabled", "LLocation_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15701a implements LocationListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BaseActivity f28553b;

        public C15701a(BaseActivity baseActivity) {
            this.f28553b = baseActivity;
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            Intrinsics.checkNotNullParameter(location, "location");
            LocateUtil.this.onStop();
            C44128b.m97267k("LocateUtil latitude:" + Double.valueOf(location.getLatitude()) + " longitude:" + Double.valueOf(location.getLongitude()));
            LocateManager.f28544a.m33106i(location, true, this.f28553b);
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String provider) {
            Intrinsics.checkNotNullParameter(provider, "provider");
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String provider) {
            Intrinsics.checkNotNullParameter(provider, "provider");
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String provider, int status, Bundle extras) {
            String str;
            if (status == 0) {
                str = provider + "不在服务内!";
            } else if (status == 1) {
                str = provider + "为暂停服务状态!";
            } else if (status != 2) {
                str = "";
            } else {
                str = provider + "为可用状态!";
            }
            C44128b.m97267k("LocateUtil " + provider + " onStatusChanged: " + str);
        }
    }

    /* JADX INFO: renamed from: w */
    public static final LocateUtil m33110w() {
        return new LocateUtil();
    }

    /* JADX INFO: renamed from: A */
    public final void m33114A() {
        LocationManager locationManager = this.f28550a;
        if (locationManager == null || locationManager.isProviderEnabled("gps")) {
            return;
        }
        try {
            Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
            intent.addFlags(268435456);
            BaseApplication.INSTANCE.get().startActivity(intent);
        } catch (Exception e11) {
            C44128b.m97267k("LocateUtil: requestOpenGPS" + e11.getMessage());
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m33115B(@NotNull BaseActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C44128b.m97267k("LocateUtil: startLocationUpdates");
        if (m33168g()) {
            return;
        }
        DataMapUtil.f54245a.m66379n("LAST_LOCATE_TIME", System.currentTimeMillis());
        LocationManager locationManager = this.f28550a;
        if (locationManager != null) {
            List<String> providers = locationManager.getProviders(true);
            Intrinsics.checkNotNullExpressionValue(providers, "getProviders(...)");
            for (String str : providers) {
                C44128b.m97267k(str);
                this.f28551b.put(str, new C15701a(activity));
            }
            Set<Map.Entry<String, LocationListener>> setEntrySet = this.f28551b.entrySet();
            Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                locationManager.requestLocationUpdates((String) entry.getKey(), 0L, 0.0f, (LocationListener) entry.getValue());
            }
        }
    }

    @Override // com.kubi.kucoin.utils.Locate
    public void onStop() {
        LocationManager locationManager = this.f28550a;
        if (locationManager != null) {
            Set<Map.Entry<String, LocationListener>> setEntrySet = this.f28551b.entrySet();
            Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                locationManager.removeUpdates((LocationListener) ((Map.Entry) it.next()).getValue());
            }
        }
    }

    @Override // com.kubi.kucoin.utils.Locate
    /* JADX INFO: renamed from: q */
    public void mo33094q(@NotNull final BaseActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        LocationManager locationManager = this.f28550a;
        if (locationManager != null) {
            if (m33168g() || !C27025c.m66566d(Boolean.valueOf(locationManager.isProviderEnabled("gps")))) {
                m33172s(activity, new Function0() { // from class: com.kubi.kucoin.utils.u0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LocateUtil.m33112y(this.f28604b);
                    }
                }, new Function0() { // from class: com.kubi.kucoin.utils.v0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LocateUtil.m33113z(this.f28613b, activity);
                    }
                });
            } else {
                m33169k();
                m33115B(activity);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m33112y(LocateUtil locateUtil) {
        locateUtil.m33114A();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m33113z(LocateUtil locateUtil, BaseActivity baseActivity) {
        locateUtil.m33115B(baseActivity);
        return Unit.INSTANCE;
    }
}
