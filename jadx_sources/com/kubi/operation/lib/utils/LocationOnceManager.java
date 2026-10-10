package com.kubi.operation.lib.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.CancellationSignal;
import androidx.core.content.ContextCompat;
import androidx.core.location.LocationManagerCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.blankj.utilcode.util.C5258a;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseApplication;
import com.kubi.utils.C27100x0;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import xb0.C46126b;

/* JADX INFO: compiled from: LocationOnceManager.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0010\u001a\u00020\r*\u00020\u0011H\u0002J*\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00112\u001a\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00130\u0016J9\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u001a2\u0006\u0010\u0014\u001a\u00020\u00112\u001a\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00130\u0016H\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ@\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00112\u001a\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00130\u00162\u0006\u0010\u001e\u001a\u00020\u00172\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0018H\u0002J\u0010\u0010 \u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J\u0006\u0010!\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\f\u0010\u000e¨\u0006\""}, m90084d2 = {"Lcom/kubi/operation/lib/utils/LocationOnceManager;", "", "<init>", "()V", "TAG", "", "locationManager", "Landroid/location/LocationManager;", "getLocationManager", "()Landroid/location/LocationManager;", "locationManager$delegate", "Lkotlin/Lazy;", "isGmsAvailable", "", "()Z", "isGmsAvailable$delegate", "isPageUnusable", "Landroidx/fragment/app/FragmentActivity;", "locationOnce", "", "activity", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lcom/kubi/operation/lib/utils/ResultCode;", "Landroid/location/Location;", "locationNow", "Lkotlin/Result;", "locationNow-gIAlu-s", "(Landroidx/fragment/app/FragmentActivity;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "onResult", "resultCode", FirebaseAnalytics.Param.LOCATION, "requestOpenGPS", "goAppSystemSettings", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLocationOnceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocationOnceManager.kt\ncom/kubi/operation/lib/utils/LocationOnceManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,180:1\n1#2:181\n1869#3,2:182\n*S KotlinDebug\n*F\n+ 1 LocationOnceManager.kt\ncom/kubi/operation/lib/utils/LocationOnceManager\n*L\n105#1:182,2\n*E\n"})
public final class LocationOnceManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final LocationOnceManager f36846a = new LocationOnceManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f36847b = LazyKt.lazy(new Function0() { // from class: com.kubi.operation.lib.utils.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LocationOnceManager.m43632t();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f36848c = LazyKt.lazy(new Function0() { // from class: com.kubi.operation.lib.utils.i
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(LocationOnceManager.m43631r());
        }
    });

    /* JADX INFO: renamed from: B */
    public static final Unit m43611B(final FragmentActivity fragmentActivity, final Function2 function2) {
        LocationOnceManager locationOnceManager = f36846a;
        if (locationOnceManager.m43644s(fragmentActivity)) {
            return Unit.INSTANCE;
        }
        if (ContextCompat.checkSelfPermission(BaseApplication.INSTANCE.get(), "android.permission.ACCESS_FINE_LOCATION") != 0) {
            Observable<Boolean> observableM101655n = new C46126b(fragmentActivity).m101655n("android.permission.ACCESS_FINE_LOCATION");
            final Function1 function1 = new Function1() { // from class: com.kubi.operation.lib.utils.l
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LocationOnceManager.m43612C(fragmentActivity, function2, (Boolean) obj);
                }
            };
            RouteExKt.m56238b(observableM101655n.subscribe(new Consumer() { // from class: com.kubi.operation.lib.utils.m
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    LocationOnceManager.m43613D(function1, obj);
                }
            }), fragmentActivity);
        } else {
            Result.m103843boximpl(locationOnceManager.m43645u(fragmentActivity, function2));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m43612C(FragmentActivity fragmentActivity, Function2 function2, Boolean bool) {
        C44128b.m97261e("LocationOnceManager", "location-permission-result: " + bool);
        if (bool.booleanValue()) {
            f36846a.m43645u(fragmentActivity, function2);
            return Unit.INSTANCE;
        }
        m43614F(f36846a, fragmentActivity, function2, ResultCode.UN_AUTHORIZED, null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m43614F(LocationOnceManager locationOnceManager, FragmentActivity fragmentActivity, Function2 function2, ResultCode resultCode, Location location, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            location = null;
        }
        locationOnceManager.m43639E(fragmentActivity, function2, resultCode, location);
    }

    /* JADX INFO: renamed from: G */
    public static final Unit m43615G(ResultCode resultCode, Location location, FragmentActivity fragmentActivity, Function2 function2) {
        C44128b.m97266j("LocationOnceManager", "location-result: resultCode=" + resultCode + ", location=" + location);
        if (f36846a.m43644s(fragmentActivity)) {
            return Unit.INSTANCE;
        }
        LifecycleOwnerKt.getLifecycleScope(fragmentActivity).launchWhenStarted(new LocationOnceManager$onResult$1$1(function2, resultCode, location, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public static final Unit m43616I(FragmentActivity fragmentActivity) {
        if (!f36846a.m43641n().isProviderEnabled("gps")) {
            try {
                Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
                intent.addFlags(268435456);
                fragmentActivity.startActivity(intent);
            } catch (Exception e11) {
                C44128b.m97268l("LocationOnceManager", "requestOpenGPS" + e11.getMessage());
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final LocationManager m43632t() {
        Object systemService = BaseApplication.INSTANCE.get().getSystemService(FirebaseAnalytics.Param.LOCATION);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        return (LocationManager) systemService;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m43633v(final String str, final AtomicBoolean atomicBoolean, final FragmentActivity fragmentActivity, final Function2 function2) {
        LocationManagerCompat.getCurrentLocation(f36846a.m43641n(), str, new CancellationSignal(), C42917g.m94137c(), (androidx.core.util.Consumer<Location>) new androidx.core.util.Consumer() { // from class: com.kubi.operation.lib.utils.g
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                LocationOnceManager.m43634w(str, atomicBoolean, fragmentActivity, function2, (Location) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final void m43634w(String str, AtomicBoolean atomicBoolean, FragmentActivity fragmentActivity, Function2 function2, Location location) {
        C44128b.m97266j("LocationOnceManager", "locationNow-result: location=(" + str + ')' + location);
        if (atomicBoolean.compareAndSet(false, true)) {
            f36846a.m43639E(fragmentActivity, function2, ResultCode.SUCCESS, location);
        }
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m43635x(FragmentActivity fragmentActivity, Function2 function2, Location location) {
        f36846a.m43639E(fragmentActivity, function2, ResultCode.SUCCESS, location);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static final void m43637z(FragmentActivity fragmentActivity, Function2 function2, Exception e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        LocationOnceManager locationOnceManager = f36846a;
        ResultCode resultCode = ResultCode.ERROR;
        String message = e11.getMessage();
        if (message == null) {
            message = "";
        }
        resultCode.setMsg(message);
        Unit unit = Unit.INSTANCE;
        m43614F(locationOnceManager, fragmentActivity, function2, resultCode, null, 8, null);
    }

    /* JADX INFO: renamed from: A */
    public final void m43638A(@NotNull final FragmentActivity activity, @NotNull final Function2<? super ResultCode, ? super Location, Unit> callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C27100x0.m66923d(new Function0() { // from class: com.kubi.operation.lib.utils.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocationOnceManager.m43611B(activity, callback);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final void m43639E(final FragmentActivity fragmentActivity, final Function2<? super ResultCode, ? super Location, Unit> function2, final ResultCode resultCode, final Location location) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.operation.lib.utils.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocationOnceManager.m43615G(resultCode, location, fragmentActivity, function2);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public final void m43640H(final FragmentActivity fragmentActivity) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.operation.lib.utils.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocationOnceManager.m43616I(fragmentActivity);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final LocationManager m43641n() {
        return (LocationManager) f36847b.getValue();
    }

    /* JADX INFO: renamed from: o */
    public final void m43642o() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.operation.lib.utils.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocationOnceManager.m43630p();
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final boolean m43643q() {
        return ((Boolean) f36848c.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8, types: [kotlin.jvm.functions.Function2] */
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: u */
    public final Object m43645u(final FragmentActivity fragmentActivity, Function2<? super ResultCode, ? super Location, Unit> function2) {
        ?? r11;
        Object objM103844constructorimpl;
        ?? r12;
        try {
            Result.Companion companion = Result.INSTANCE;
            LocationOnceManager locationOnceManager = f36846a;
            final ?? M43644s = locationOnceManager.m43644s(fragmentActivity);
            try {
                if (M43644s != 0) {
                    M43644s = function2;
                } else if (locationOnceManager.m43643q() || locationOnceManager.m43641n().isProviderEnabled("gps")) {
                    M43644s = function2;
                    if (locationOnceManager.m43643q()) {
                        C44128b.m97266j("LocationOnceManager", "locationNow-use: fusedLocationClient");
                        Task<Location> currentLocation = LocationServices.getFusedLocationProviderClient((Activity) fragmentActivity).getCurrentLocation(100, new CancellationTokenSource().getToken());
                        final Function1 function1 = new Function1() { // from class: com.kubi.operation.lib.utils.o
                            @Override // p852kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LocationOnceManager.m43635x(fragmentActivity, M43644s, (Location) obj);
                            }
                        };
                        Intrinsics.checkNotNull(currentLocation.addOnSuccessListener(new OnSuccessListener() { // from class: com.kubi.operation.lib.utils.p
                            @Override // com.google.android.gms.tasks.OnSuccessListener
                            public final void onSuccess(Object obj) {
                                LocationOnceManager.m43636y(function1, obj);
                            }
                        }).addOnFailureListener(new OnFailureListener() { // from class: com.kubi.operation.lib.utils.q
                            @Override // com.google.android.gms.tasks.OnFailureListener
                            public final void onFailure(Exception exc) {
                                LocationOnceManager.m43637z(fragmentActivity, M43644s, exc);
                            }
                        }));
                    } else {
                        C44128b.m97266j("LocationOnceManager", "locationNow-use: LocationManager");
                        List<String> providers = locationOnceManager.m43641n().getProviders(true);
                        Intrinsics.checkNotNullExpressionValue(providers, "getProviders(...)");
                        if (providers.isEmpty()) {
                            ResultCode resultCode = ResultCode.ERROR;
                            resultCode.setMsg("noProviders");
                            Unit unit = Unit.INSTANCE;
                            m43614F(locationOnceManager, fragmentActivity, M43644s, resultCode, null, 8, null);
                        } else {
                            C44128b.m97266j("LocationOnceManager", "locationNow-providers: " + CollectionsKt.joinToString$default(providers, null, null, null, 0, null, null, 63, null));
                            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                            for (final String str : providers) {
                                C27100x0.m66923d(new Function0() { // from class: com.kubi.operation.lib.utils.f
                                    @Override // p852kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return LocationOnceManager.m43633v(str, atomicBoolean, fragmentActivity, M43644s);
                                    }
                                });
                            }
                        }
                    }
                } else {
                    locationOnceManager.m43640H(fragmentActivity);
                    M43644s = function2;
                    m43614F(locationOnceManager, fragmentActivity, M43644s, ResultCode.UN_AUTHORIZED, null, 8, null);
                }
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                r12 = M43644s;
            } catch (Throwable th2) {
                th = th2;
                r11 = M43644s;
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th));
                r12 = r11;
            }
        } catch (Throwable th3) {
            th = th3;
            r11 = function2;
        }
        Object obj = objM103844constructorimpl;
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj);
        if (thM103847exceptionOrNullimpl != null) {
            LocationOnceManager locationOnceManager2 = f36846a;
            ResultCode resultCode2 = ResultCode.ERROR;
            String message = thM103847exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            resultCode2.setMsg(message);
            Unit unit2 = Unit.INSTANCE;
            m43614F(locationOnceManager2, fragmentActivity, r12, resultCode2, null, 8, null);
            C44128b.m97263g("LocationOnceManager", thM103847exceptionOrNullimpl);
        }
        return obj;
    }

    /* JADX INFO: renamed from: D */
    public static final void m43613D(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m43630p() {
        FragmentActivity fragmentActivity;
        Activity activityM6125h = C5258a.m6125h();
        if (activityM6125h instanceof FragmentActivity) {
            fragmentActivity = (FragmentActivity) activityM6125h;
        } else {
            fragmentActivity = null;
        }
        if (fragmentActivity == null) {
            return Unit.INSTANCE;
        }
        LifecycleOwnerKt.getLifecycleScope(fragmentActivity).launchWhenStarted(new LocationOnceManager$goAppSystemSettings$1$1(fragmentActivity, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m43631r() {
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(BaseApplication.INSTANCE.get()) == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    public static final void m43636y(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m43644s(FragmentActivity fragmentActivity) {
        if (!fragmentActivity.isFinishing() && !fragmentActivity.isDestroyed()) {
            return false;
        }
        return true;
    }
}
