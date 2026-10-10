package com.sumsub.sns.internal.core.presentation.android.location;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.SystemClock;
import androidx.core.content.ContextCompat;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.core.presentation.common.AbstractC28787t;
import com.sumsub.sns.internal.features.data.model.geo.C29795e;
import com.sumsub.sns.internal.features.domain.geo.AbstractC30199j;
import com.sumsub.sns.internal.features.presentation.geo.C31087g;
import kotlinx.coroutines.InterfaceC41769w;
import kotlinx.coroutines.flow.C41636g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.time.Duration;
import p852kotlin.time.DurationKt;
import p852kotlin.time.DurationUnit;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.android.location.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28682r extends AbstractC28787t {

    /* JADX INFO: renamed from: i */
    public static final long f58321i;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ int f58322t = 0;

    /* JADX INFO: renamed from: e */
    public final String f58323e;

    /* JADX INFO: renamed from: f */
    public final Lazy f58324f;

    /* JADX INFO: renamed from: g */
    public final LocationListener f58325g;

    /* JADX INFO: renamed from: h */
    public final LocationListener f58326h;

    public C28682r(C31087g c31087g, Function0 function0) {
        super(c31087g, null);
        this.f58323e = "LocationAcquisition";
        this.f58324f = LazyKt.lazy(function0);
        this.f58325g = new LocationListener() { // from class: com.sumsub.sns.internal.core.presentation.android.location.w
            @Override // android.location.LocationListener
            public final void onLocationChanged(Location location) {
                C28682r.m69492a(this.f58336a, location);
            }
        };
        this.f58326h = new LocationListener() { // from class: com.sumsub.sns.internal.core.presentation.android.location.x
            @Override // android.location.LocationListener
            public final void onLocationChanged(Location location) {
                C28682r.m69493b(this.f58337a, location);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public final void m69494a(Location location) {
        C28676l c28676l = (C28676l) this.f58324f.getValue();
        C29795e c29795e = new C29795e(location.getLatitude(), location.getLongitude(), location.getAccuracy(), AbstractC30199j.m70135a(location));
        c28676l.m69490a("onLocation: acquired");
        InterfaceC41769w interfaceC41769w = c28676l.f58311d;
        if (interfaceC41769w != null) {
            interfaceC41769w.mo91370n(new C28663a(c29795e));
        }
    }

    static {
        Duration.Companion companion = Duration.INSTANCE;
        f58321i = Duration.m105198getInWholeMillisecondsimpl(DurationKt.toDuration(5, DurationUnit.SECONDS));
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: h */
    public final String mo69480h() {
        return this.f58323e;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: l */
    public final void mo69495l() {
        AbstractC28421U.m69305b(C41636g.m90939v(C41636g.m90927m(new C28679o(this.f58549a.getViewLifecycleOwner().getLifecycle().getCurrentStateFlow()), ((C28676l) this.f58324f.getValue()).f58310c, new C28680p(null))), this.f58549a.getViewLifecycleOwner(), new C28681q(this, null));
    }

    /* JADX INFO: renamed from: b */
    public static final void m69493b(C28682r c28682r, Location location) {
        c28682r.m69494a(location);
    }

    /* JADX INFO: renamed from: a */
    public static final void m69491a(C28682r c28682r, long j11) {
        Location lastKnownLocation;
        if (ContextCompat.checkSelfPermission(c28682r.f58549a.requireContext(), "android.permission.ACCESS_FINE_LOCATION") == 0 || ContextCompat.checkSelfPermission(c28682r.f58549a.requireContext(), "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            LocationManager locationManager = (LocationManager) ContextCompat.getSystemService(c28682r.f58549a.requireContext(), LocationManager.class);
            if (locationManager == null) {
                lastKnownLocation = null;
            } else {
                Location lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                lastKnownLocation = lastKnownLocation2 == null ? locationManager.getLastKnownLocation("network") : lastKnownLocation2;
            }
            if (lastKnownLocation != null) {
                Duration.Companion companion = Duration.INSTANCE;
                if (Duration.m105186compareToLRDsOJo(DurationKt.toDuration(SystemClock.elapsedRealtimeNanos() - lastKnownLocation.getElapsedRealtimeNanos(), DurationUnit.NANOSECONDS), j11) <= 0) {
                    c28682r.m69494a(lastKnownLocation);
                    return;
                }
            }
            LocationManager locationManager2 = (LocationManager) ContextCompat.getSystemService(c28682r.f58549a.requireContext(), LocationManager.class);
            if (locationManager2 == null || (!locationManager2.isProviderEnabled("gps") && !locationManager2.isProviderEnabled("network"))) {
                C28676l c28676l = (C28676l) c28682r.f58324f.getValue();
                c28676l.m69490a("onNoProvider");
                InterfaceC41769w interfaceC41769w = c28676l.f58311d;
                if (interfaceC41769w != null) {
                    interfaceC41769w.mo91370n(C28667c.f58297a);
                    return;
                }
                return;
            }
            LocationManager locationManager3 = (LocationManager) ContextCompat.getSystemService(c28682r.f58549a.requireContext(), LocationManager.class);
            if (locationManager3 != null) {
                LocationListener locationListener = c28682r.f58325g;
                if (locationManager3.isProviderEnabled("gps")) {
                    locationManager3.requestLocationUpdates("gps", f58321i, 0.0f, locationListener);
                }
                LocationListener locationListener2 = c28682r.f58326h;
                if (locationManager3.isProviderEnabled("network")) {
                    locationManager3.requestLocationUpdates("network", f58321i, 0.0f, locationListener2);
                    return;
                }
                return;
            }
            return;
        }
        C28676l c28676l2 = (C28676l) c28682r.f58324f.getValue();
        c28676l2.m69490a("onNoPermission");
        InterfaceC41769w interfaceC41769w2 = c28676l2.f58311d;
        if (interfaceC41769w2 != null) {
            interfaceC41769w2.mo91370n(C28665b.f58295a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m69492a(C28682r c28682r, Location location) {
        c28682r.m69494a(location);
    }
}
