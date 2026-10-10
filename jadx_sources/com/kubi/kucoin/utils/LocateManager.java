package com.kubi.kucoin.utils;

import android.location.Location;
import android.text.TextUtils;
import androidx.annotation.Keep;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.reflect.TypeToken;
import com.kubi.kucoin.entity.GPSEntity;
import com.kubi.resources.GlobalDialogManager;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27099x;
import com.kubi.utils.DataMapUtil;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.core.C27029c;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.Iterator;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p728wk.InterfaceC45850a;
import p777xx.C46337a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: LocateManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001&B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001aJ \u0010\u001f\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010$\u001a\u0004\u0018\u00010%R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m90084d2 = {"Lcom/kubi/kucoin/utils/LocateManager;", "", "<init>", "()V", "ONE_DAY_TO_MILLISECOND", "", "REFUSE_PERMISSION_TIME", "", "REFUSE_PERMISSION_AFTER_DAY", "REFUSE_PERMISSION", "REFUSE_NUMS", "LAST_LOCATE_TIME", "LOCATE_INTERVAL_TIME", "LOCATION_UPDATE_DISTANCE", "LAST_LOCATION", "locate", "Lcom/kubi/kucoin/utils/Locate;", "userApi", "Lcom/kubi/kucoin/api/GpsApi;", "kotlin.jvm.PlatformType", "getUserApi", "()Lcom/kubi/kucoin/api/GpsApi;", "userApi$delegate", "Lkotlin/Lazy;", "gmsAvailable", "init", "", "onStart", "activity", "Lcom/kubi/sdk/BaseActivity;", "onStop", "uploadLocationData", FirebaseAnalytics.Param.LOCATION, "Landroid/location/Location;", "isAuth", "", "getLastLocation", "Lcom/kubi/kucoin/utils/LocateManager$LocationData;", "LocationData", "LLocation_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLocateManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocateManager.kt\ncom/kubi/kucoin/utils/LocateManager\n+ 2 KuEmitter.kt\ncom/kubi/router/emitter/KuEmitter\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,147:1\n16#2:148\n2756#3:149\n1#4:150\n160#5,4:151\n160#5,4:155\n*S KotlinDebug\n*F\n+ 1 LocateManager.kt\ncom/kubi/kucoin/utils/LocateManager\n*L\n82#1:148\n82#1:149\n82#1:150\n99#1:151,4\n139#1:155,4\n*E\n"})
public final class LocateManager {

    /* JADX INFO: renamed from: b */
    @Nullable
    public static Locate f28545b;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final LocateManager f28544a = new LocateManager();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f28546c = LazyKt.lazy(new Function0() { // from class: com.kubi.kucoin.utils.q0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LocateManager.m33100l();
        }
    });

    /* JADX INFO: renamed from: d */
    public static final int f28547d = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(BaseApplication.INSTANCE.get());

    /* JADX INFO: compiled from: LocateManager.kt */
    /* JADX INFO: loaded from: classes19.dex */
    @Keep
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/kucoin/utils/LocateManager$LocationData;", "", JPushConstants.Geofence.KEY_LATITUDE, "", JPushConstants.Geofence.KEY_LONGITUDE, "<init>", "(DD)V", "getLatitude", "()D", "getLongitude", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "LLocation_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class LocationData {
        private final double latitude;
        private final double longitude;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocationData)) {
                return false;
            }
            LocationData locationData = (LocationData) other;
            return Double.compare(this.latitude, locationData.latitude) == 0 && Double.compare(this.longitude, locationData.longitude) == 0;
        }

        public static /* synthetic */ LocationData copy$default(LocationData locationData, double d11, double d12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                d11 = locationData.latitude;
            }
            if ((i11 & 2) != 0) {
                d12 = locationData.longitude;
            }
            return locationData.copy(d11, d12);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final double getLatitude() {
            return this.latitude;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final double getLongitude() {
            return this.longitude;
        }

        @NotNull
        public final LocationData copy(double latitude, double longitude) {
            return new LocationData(latitude, longitude);
        }

        public final double getLatitude() {
            return this.latitude;
        }

        public final double getLongitude() {
            return this.longitude;
        }

        public int hashCode() {
            return (Double.hashCode(this.latitude) * 31) + Double.hashCode(this.longitude);
        }

        @NotNull
        public String toString() {
            return "LocationData(latitude=" + this.latitude + ", longitude=" + this.longitude + ')';
        }

        public LocationData(double d11, double d12) {
            this.latitude = d11;
            this.longitude = d12;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.utils.LocateManager$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C15699a extends TypeToken<LocationData> {
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.utils.LocateManager$b */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C15700b extends TypeToken<LocationData> {
    }

    /* JADX INFO: renamed from: j */
    public static final void m33098j(boolean z11, Object obj) {
        C44128b.m97267k("LocateManager: 未获取到定位，是否授权: " + z11 + " 上传成功");
    }

    /* JADX INFO: renamed from: k */
    public static final void m33099k(Object obj) {
        C44128b.m97267k("LocateManager: 上传成功");
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final LocationData m33101d() {
        Object objM66914d = null;
        String strM66369j = DataMapUtil.m66369j(DataMapUtil.f54245a, "LAST_LOCATION", null, 2, null);
        if (TextUtils.isEmpty(strM66369j)) {
            return null;
        }
        try {
            C27099x c27099x = C27099x.f54458a;
            objM66914d = C27099x.m66914d(strM66369j, new C15699a().getType());
        } catch (Throwable unused) {
        }
        return (LocationData) objM66914d;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC45850a m33102e() {
        return (InterfaceC45850a) f28546c.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final void m33103f() {
        f28545b = f28547d == 0 ? GooglePlayLocateUtil.f28536e.getINSTANCE() : LocateUtil.f28548c.getINSTANCE();
    }

    /* JADX INFO: renamed from: g */
    public final void m33104g(@NotNull BaseActivity activity) {
        Locate locate;
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!UserInfo.a.n()) {
            C44128b.m97267k("LocateManager: 没登录不采集位置");
        } else {
            if (GlobalDialogManager.f43651a.m54344i()) {
                return;
            }
            if (System.currentTimeMillis() - DataMapUtil.m66368f(DataMapUtil.f54245a, "LAST_LOCATE_TIME", 0L, 2, null) > 10800000 && (locate = f28545b) != null) {
                locate.mo33094q(activity);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m33105h() {
        Locate locate = f28545b;
        if (locate != null) {
            locate.onStop();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m33106i(@Nullable Location location, final boolean z11, @NotNull BaseActivity activity) {
        Object objM66914d;
        Intrinsics.checkNotNullParameter(activity, "activity");
        C46337a c46337a = C46337a.f103912a;
        Iterator it = Router.f46192a.m56190l(ILocationChangeReceiver.class).iterator();
        while (it.hasNext()) {
            ((ILocationChangeReceiver) it.next()).invoke(location);
        }
        if (location == null) {
            Disposable disposableSubscribe = m33102e().m101275a(new GPSEntity(z11, false, null, null, Long.valueOf(System.currentTimeMillis()), null, 44, null)).compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: com.kubi.kucoin.utils.r0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    LocateManager.m33098j(z11, obj);
                }
            }, new C24223c1(null, false));
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, activity.getDestroyDisposable());
            return;
        }
        String strM66369j = DataMapUtil.m66369j(DataMapUtil.f54245a, "LAST_LOCATION", null, 2, null);
        if (!TextUtils.isEmpty(strM66369j)) {
            try {
                C27099x c27099x = C27099x.f54458a;
                objM66914d = C27099x.m66914d(strM66369j, new C15700b().getType());
            } catch (Throwable unused) {
                objM66914d = null;
            }
            LocationData locationData = (LocationData) objM66914d;
            float[] fArr = new float[1];
            Location.distanceBetween(C27039d.m66646f(locationData != null ? Double.valueOf(locationData.getLatitude()) : null), C27039d.m66646f(locationData != null ? Double.valueOf(locationData.getLongitude()) : null), location.getLatitude(), location.getLongitude(), fArr);
            if (fArr[0] <= 10000.0f) {
                C44128b.m97267k("LocateManager: 10公里内不上传");
                return;
            }
        }
        DataMapUtil dataMapUtil = DataMapUtil.f54245a;
        String strM66606i = C27029c.m66606i(new LocationData(location.getLatitude(), location.getLongitude()));
        Intrinsics.checkNotNullExpressionValue(strM66606i, "toJson(...)");
        dataMapUtil.m66380o("LAST_LOCATION", strM66606i);
        C44128b.m97267k("LocateManager: 上传位置 latitude:" + location.getLatitude() + " longitude:" + location.getLongitude());
        Disposable disposableSubscribe2 = m33102e().m101275a(new GPSEntity(true, true, Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()), Long.valueOf(System.currentTimeMillis()), null, 32, null)).compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: com.kubi.kucoin.utils.s0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LocateManager.m33099k(obj);
            }
        }, new C24223c1(null, false));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe2, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe2, activity.getDestroyDisposable());
    }

    /* JADX INFO: renamed from: l */
    public static final InterfaceC45850a m33100l() {
        return (InterfaceC45850a) C42597a.m93386b().create(InterfaceC45850a.class);
    }
}
