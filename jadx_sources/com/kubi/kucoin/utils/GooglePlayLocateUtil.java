package com.kubi.kucoin.utils;

import android.annotation.SuppressLint;
import android.os.Looper;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseApplication;
import com.kubi.utils.DataMapUtil;
import com.kubi.utils.extensions.C27041f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: GooglePlayLocateUtil.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\rH\u0002J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/kucoin/utils/GooglePlayLocateUtil;", "Lcom/kubi/kucoin/utils/Locate;", "<init>", "()V", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "settingsClient", "Lcom/google/android/gms/location/SettingsClient;", "locationCallback", "Lcom/google/android/gms/location/LocationCallback;", "locationRequest", "Lcom/google/android/gms/location/LocationRequest;", "startLocationUpdates", "", "activity", "Lcom/kubi/sdk/BaseActivity;", "stopLocationUpdates", "onStart", "onStop", "Companion", "LLocation_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"MissingPermission"})
public final class GooglePlayLocateUtil implements Locate {

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Companion f28536e = new Companion(null);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Lazy<GooglePlayLocateUtil> f28537f = LazyKt.lazy(new Function0() { // from class: com.kubi.kucoin.utils.d0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return GooglePlayLocateUtil.m33091y();
        }
    });

    /* JADX INFO: renamed from: a */
    @NotNull
    public FusedLocationProviderClient f28538a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public SettingsClient f28539b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public LocationCallback f28540c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public LocationRequest f28541d;

    /* JADX INFO: compiled from: GooglePlayLocateUtil.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kucoin/utils/GooglePlayLocateUtil$Companion;", "", "<init>", "()V", "INSTANCE", "Lcom/kubi/kucoin/utils/GooglePlayLocateUtil;", "getINSTANCE", "()Lcom/kubi/kucoin/utils/GooglePlayLocateUtil;", "INSTANCE$delegate", "Lkotlin/Lazy;", "LLocation_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final GooglePlayLocateUtil getINSTANCE() {
            return (GooglePlayLocateUtil) GooglePlayLocateUtil.f28537f.getValue();
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.utils.GooglePlayLocateUtil$a */
    /* JADX INFO: compiled from: GooglePlayLocateUtil.kt */
    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/kucoin/utils/GooglePlayLocateUtil$startLocationUpdates$1", "Lcom/google/android/gms/location/LocationCallback;", "onLocationResult", "", "locationResult", "Lcom/google/android/gms/location/LocationResult;", "LLocation_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15698a extends LocationCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseActivity f28542a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ GooglePlayLocateUtil f28543b;

        public C15698a(BaseActivity baseActivity, GooglePlayLocateUtil googlePlayLocateUtil) {
            this.f28542a = baseActivity;
            this.f28543b = googlePlayLocateUtil;
        }

        @Override // com.google.android.gms.location.LocationCallback
        public void onLocationResult(LocationResult locationResult) {
            Intrinsics.checkNotNullParameter(locationResult, "locationResult");
            C44128b.m97267k("GooglePlayLocateUtil latitude:" + locationResult.getLastLocation().getLatitude() + " longitude:" + locationResult.getLastLocation().getLongitude());
            LocateManager.f28544a.m33106i(locationResult.getLastLocation(), true, this.f28542a);
            this.f28543b.onStop();
        }
    }

    /* JADX INFO: renamed from: B */
    private final void m33082B(final BaseActivity baseActivity) {
        final Looper looperMyLooper;
        C44128b.m97267k("GooglePlayLocateUtil: startLocationUpdates");
        if (m33168g() || (looperMyLooper = Looper.myLooper()) == null) {
            return;
        }
        DataMapUtil.f54245a.m66379n("LAST_LOCATE_TIME", System.currentTimeMillis());
        this.f28540c = new C15698a(baseActivity, this);
        LocationSettingsRequest.Builder builder = new LocationSettingsRequest.Builder();
        builder.addLocationRequest(this.f28541d);
        Task<LocationSettingsResponse> taskCheckLocationSettings = this.f28539b.checkLocationSettings(builder.build());
        final Function1 function1 = new Function1() { // from class: com.kubi.kucoin.utils.f0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GooglePlayLocateUtil.m33083C(this.f28567b, looperMyLooper, (LocationSettingsResponse) obj);
            }
        };
        taskCheckLocationSettings.addOnSuccessListener(new OnSuccessListener() { // from class: com.kubi.kucoin.utils.g0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                GooglePlayLocateUtil.m33084D(function1, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.kubi.kucoin.utils.h0
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                GooglePlayLocateUtil.m33085E(baseActivity, exc);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m33083C(GooglePlayLocateUtil googlePlayLocateUtil, Looper looper, LocationSettingsResponse locationSettingsResponse) {
        FusedLocationProviderClient fusedLocationProviderClient = googlePlayLocateUtil.f28538a;
        LocationRequest locationRequest = googlePlayLocateUtil.f28541d;
        LocationCallback locationCallback = googlePlayLocateUtil.f28540c;
        Intrinsics.checkNotNull(locationCallback);
        fusedLocationProviderClient.requestLocationUpdates(locationRequest, locationCallback, looper);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public static final void m33085E(BaseActivity baseActivity, Exception e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        C44128b.m97260d(C27041f.m66668h(e11.getMessage()));
        LocateManager.f28544a.m33106i(null, true, baseActivity);
    }

    /* JADX INFO: renamed from: y */
    public static final GooglePlayLocateUtil m33091y() {
        return new GooglePlayLocateUtil();
    }

    /* JADX INFO: renamed from: F */
    public final void m33093F() {
        LocationCallback locationCallback = this.f28540c;
        if (locationCallback != null) {
            this.f28538a.removeLocationUpdates(locationCallback);
        }
    }

    @Override // com.kubi.kucoin.utils.Locate
    /* JADX INFO: renamed from: q */
    public void mo33094q(@NotNull final BaseActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (m33168g()) {
            Locate.m33156b(this, activity, null, new Function0() { // from class: com.kubi.kucoin.utils.e0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GooglePlayLocateUtil.m33081A(this.f28565b, activity);
                }
            }, 2, null);
        } else {
            m33169k();
            m33082B(activity);
        }
    }

    public GooglePlayLocateUtil() {
        BaseApplication.Companion companion = BaseApplication.INSTANCE;
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(companion.get());
        Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
        this.f28538a = fusedLocationProviderClient;
        SettingsClient settingsClient = LocationServices.getSettingsClient(companion.get());
        Intrinsics.checkNotNullExpressionValue(settingsClient, "getSettingsClient(...)");
        this.f28539b = settingsClient;
        LocationRequest locationRequestCreate = LocationRequest.create();
        locationRequestCreate.setInterval(0L);
        locationRequestCreate.setFastestInterval(0L);
        locationRequestCreate.setPriority(100);
        Intrinsics.checkNotNullExpressionValue(locationRequestCreate, "apply(...)");
        this.f28541d = locationRequestCreate;
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m33081A(GooglePlayLocateUtil googlePlayLocateUtil, BaseActivity baseActivity) {
        googlePlayLocateUtil.m33082B(baseActivity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D */
    public static final void m33084D(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // com.kubi.kucoin.utils.Locate
    public void onStop() {
        m33093F();
    }
}
