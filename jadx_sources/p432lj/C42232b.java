package p432lj;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.home.realtime.IRealTimeAdapter;
import com.kubi.home.realtime.IRealTimeData;
import com.kubi.home.realtime.IRealTimeWidgetService;
import com.kubi.home.realtime.ViewLifecycleListener;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p456mj.C42562k;
import p502oj.C43099d;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: lj.b */
/* JADX INFO: compiled from: RealTimeWidgetService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\n\u001a\u00020\u000b\"\b\b\u0000\u0010\f*\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\f0\u000fH\u0016J \u0010\u0010\u001a\u00020\u000b\"\b\b\u0000\u0010\f*\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\f0\u0012H\u0016J \u0010\u0013\u001a\u00020\u000b\"\b\b\u0000\u0010\f*\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\f0\u0012H\u0016J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\rH\u0016J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\rH\u0016J\b\u0010\u001a\u001a\u00020\u0005H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/home/realtime/frame/RealTimeWidgetService;", "Lcom/kubi/home/realtime/IRealTimeWidgetService;", "<init>", "()V", "realTimeOpen", "", "getRealTimeOpen", "()Z", "realTimeOpen$delegate", "Lkotlin/Lazy;", "registerAdapter", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/home/realtime/IRealTimeData;", "adapter", "Lcom/kubi/home/realtime/IRealTimeAdapter;", "addLifecycleListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/kubi/home/realtime/ViewLifecycleListener;", "removeLifecycleListener", "add", "data", "update", "newData", "remove", "isRemoved", "realTimeEnable", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRealTimeWidgetService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealTimeWidgetService.kt\ncom/kubi/home/realtime/frame/RealTimeWidgetService\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,73:1\n35#2,4:74\n39#2:80\n44#3,2:78\n*S KotlinDebug\n*F\n+ 1 RealTimeWidgetService.kt\ncom/kubi/home/realtime/frame/RealTimeWidgetService\n*L\n17#1:74,4\n17#1:80\n17#1:78,2\n*E\n"})
public final class C42232b implements IRealTimeWidgetService {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f93688b = LazyKt.lazy(new Function0() { // from class: lj.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(C42232b.m92672j());
        }
    });

    /* JADX INFO: renamed from: lj.b$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m92672j() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_home_real_time_widget_config", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        Boolean bool = (Boolean) objM20457a;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Override // com.kubi.home.realtime.IRealTimeWidgetService
    /* JADX INFO: renamed from: a */
    public <T extends IRealTimeData> void mo30031a(@NotNull IRealTimeAdapter<T> adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        if (m92674i()) {
            C42562k.f94240a.m93304C(adapter);
        }
    }

    @Override // com.kubi.home.realtime.IRealTimeWidgetService
    /* JADX INFO: renamed from: b */
    public <T extends IRealTimeData> void mo30032b(@NotNull ViewLifecycleListener<T> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (m92674i()) {
            C42562k.f94240a.m93313k(listener);
        }
    }

    @Override // com.kubi.home.realtime.IRealTimeWidgetService
    /* JADX INFO: renamed from: c */
    public boolean mo30033c(@NotNull IRealTimeData newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        if (m92674i()) {
            return C42562k.f94240a.m93310K(newData, false);
        }
        return false;
    }

    @Override // com.kubi.home.realtime.IRealTimeWidgetService
    /* JADX INFO: renamed from: d */
    public boolean mo30034d(@NotNull IRealTimeData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return C42562k.f94240a.m93320s(data.getUniqueId());
    }

    @Override // com.kubi.home.realtime.IRealTimeWidgetService
    /* JADX INFO: renamed from: e */
    public boolean mo30035e(@NotNull IRealTimeData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (m92674i()) {
            return C42562k.f94240a.m93305D(data, false);
        }
        return false;
    }

    @Override // com.kubi.home.realtime.IRealTimeWidgetService
    /* JADX INFO: renamed from: f */
    public void mo30036f(@NotNull IRealTimeData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (m92674i()) {
            C42562k.f94240a.m93312i(data, false);
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m92673h() {
        return ((Boolean) this.f93688b.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m92674i() {
        return C43099d.f95299a.m94706c() && m92673h();
    }
}
