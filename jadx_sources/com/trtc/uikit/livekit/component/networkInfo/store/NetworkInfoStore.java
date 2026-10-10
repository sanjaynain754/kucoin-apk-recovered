package com.trtc.uikit.livekit.component.networkInfo.store;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomObserver;
import com.tencent.trtc.TRTCCloud;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import io.trtc.tuikit.atomicxcore.api.device.NetworkInfo;
import io.trtc.tuikit.atomicxcore.api.device.NetworkQuality;
import io.trtc.tuikit.atomicxcore.api.live.AVStatistics;
import io.trtc.tuikit.atomicxcore.api.live.SeatInfo;
import io.trtc.tuikit.atomicxcore.api.login.LoginStore;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NetworkInfoStore.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u009d\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u001c\u0018\u0000 L2\u00020\u0001:\u0001LB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"J\u000e\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&J\u000e\u0010'\u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u0003J\u0006\u0010(\u001a\u00020\u001fJ\u0006\u0010)\u001a\u00020\u001fJ\u000e\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020,J\u0018\u0010-\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020/H\u0002J\u0014\u00100\u001a\u00020\u001f2\f\u00101\u001a\b\u0012\u0004\u0012\u00020302J\u0018\u00104\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u00105\u001a\u00020/H\u0002J\u0014\u00106\u001a\u00020\u001f2\f\u00107\u001a\b\u0012\u0004\u0012\u00020802J\u0010\u00109\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020,H\u0002J\u0010\u0010;\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020,H\u0002J\u0012\u0010<\u001a\u0004\u0018\u00010=2\u0006\u0010>\u001a\u00020?H\u0002J\u0010\u0010@\u001a\u00020\u001f2\u0006\u0010>\u001a\u000208H\u0002J\u0010\u0010A\u001a\u00020\u001f2\u0006\u0010>\u001a\u000208H\u0002J\u0010\u0010B\u001a\u00020/2\u0006\u0010>\u001a\u000208H\u0002J\u0010\u0010C\u001a\u00020\u001f2\u0006\u0010>\u001a\u000208H\u0002J\b\u0010D\u001a\u00020\u001fH\u0002J\b\u0010E\u001a\u00020\u001fH\u0002J\b\u0010F\u001a\u00020\u001fH\u0002J\b\u0010G\u001a\u00020\u001fH\u0002J\u0012\u0010H\u001a\u00020/2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002J\u0017\u0010I\u001a\u00020\u001f2\b\u0010J\u001a\u0004\u0018\u00010/H\u0002¢\u0006\u0002\u0010KR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001d¨\u0006M"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "networkInfoState", "Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;", "getNetworkInfoState", "()Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;", "logger", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "appContext", "userId", "", "trtcCloud", "Lcom/tencent/trtc/TRTCCloud;", "tuiRoomEngine", "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;", "networkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "networkReceiver", "Landroid/content/BroadcastReceiver;", "networkBadStartTime", "", "subscribeStateJob", "Lkotlinx/coroutines/Job;", "engineObserver", "com/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$engineObserver$1", "Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$engineObserver$1;", "initAudioCaptureVolume", "", "setAudioCaptureVolume", "volume", "", "updateAudioStatusByVolume", "updateAudioMode", "audioQuality", "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$AudioQuality;", "checkDeviceTemperature", "addObserver", "removeObserver", "handleNetworkQualityChange", "networkInfo", "Lio/trtc/tuikit/atomicxcore/api/device/NetworkInfo;", "handleAudioStateChanged", "hasAudio", "", "handleSeatListChanged", "seatList", "", "Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;", "handleVideoStateChanged", "hasVideo", "handleStatisticsChanged", "statisticsList", "Lio/trtc/tuikit/atomicxcore/api/live/AVStatistics;", "updateNetworkInfo", "info", "checkAndShowNetworkWeakTips", "getLocalStreamStats", "Lcom/tencent/trtc/TRTCStatistics$TRTCLocalStatistics;", "statistics", "Lcom/tencent/trtc/TRTCStatistics;", "updateResolution", "updateVideoStatus", "isBitrateAbnormal", "updateAudioStatus", "startListenNetworkConnection", "stopListenNetworkConnection", "registerNetworkCallback", "registerBroadcastReceiver", "isNetworkAvailable", "onNetworkConnectionChange", "isConnection", "(Ljava/lang/Boolean;)V", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNetworkInfoStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkInfoStore.kt\ncom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,389:1\n1#2:390\n*E\n"})
public final class NetworkInfoStore {

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final Companion f77927k = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final NetworkInfoState f77928a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final LiveKitLogger f77929b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Context f77930c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final String f77931d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final TRTCCloud f77932e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final TUIRoomEngine f77933f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public ConnectivityManager.NetworkCallback f77934g;

    /* JADX INFO: renamed from: h */
    public long f77935h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public InterfaceC41775x1 f77936i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final C35946a f77937j;

    /* JADX INFO: compiled from: NetworkInfoStore.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$Companion;", "", "<init>", "()V", "NETWORK_WEAK_THRESHOLD_MS", "", "LOW_FRAME_RATE_THRESHOLD", "", "LOW_BITRATE_THRESHOLD_240P", "LOW_BITRATE_THRESHOLD_360P", "LOW_BITRATE_THRESHOLD_480P", "LOW_BITRATE_THRESHOLD_540x540", "LOW_BITRATE_THRESHOLD_540x960", "LOW_BITRATE_THRESHOLD_1080P", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.store.NetworkInfoStore$a */
    /* JADX INFO: compiled from: NetworkInfoStore.kt */
    @Metadata(m90083d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\u000e"}, m90084d2 = {"com/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$engineObserver$1", "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;", "onUserVideoStateChanged", "", "userId", "", "streamType", "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;", "hasVideo", "", "reason", "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ChangeReason;", "onUserAudioStateChanged", "hasAudio", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35946a extends TUIRoomObserver {
        public C35946a() {
        }

        @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
        public void onUserAudioStateChanged(String userId, boolean hasAudio, TUIRoomDefine.ChangeReason reason) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(reason, "reason");
            NetworkInfoStore.this.m79826j(userId, hasAudio);
        }

        @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
        public void onUserVideoStateChanged(String userId, TUIRoomDefine.VideoStreamType streamType, boolean hasVideo, TUIRoomDefine.ChangeReason reason) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(streamType, "streamType");
            Intrinsics.checkNotNullParameter(reason, "reason");
            NetworkInfoStore.this.m79830n(userId, hasVideo);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.store.NetworkInfoStore$b */
    /* JADX INFO: compiled from: NetworkInfoStore.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017¨\u0006\b"}, m90084d2 = {"com/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$registerNetworkCallback$1", "Landroid/net/ConnectivityManager$NetworkCallback;", "onCapabilitiesChanged", "", "network", "Landroid/net/Network;", "networkCapabilities", "Landroid/net/NetworkCapabilities;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35948b extends ConnectivityManager.NetworkCallback {
        public C35948b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        @RequiresApi(23)
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            Intrinsics.checkNotNullParameter(network, "network");
            Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
            if (networkCapabilities.hasCapability(16)) {
                NetworkInfoStore.this.f77929b.m79404b("network status changed: Network is connected and available");
                NetworkInfoStore.this.getF77928a().m79810l().setValue(Boolean.TRUE);
            } else {
                NetworkInfoStore.this.f77929b.m79404b("network status changed: Network is not available");
                NetworkInfoStore.this.getF77928a().m79810l().setValue(Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m79833q(Context context) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        if (context == null) {
            return false;
        }
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        return (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(12) || (!networkCapabilities.hasTransport(1) && !networkCapabilities.hasTransport(0) && !networkCapabilities.hasTransport(3))) ? false : true;
    }

    public NetworkInfoStore(@NotNull Context context) {
        String userID;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f77928a = new NetworkInfoState();
        this.f77929b = LiveKitLogger.f77564c.getComponentLogger("NetworkInfoService");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f77930c = applicationContext;
        UserProfile value = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
        this.f77931d = (value == null || (userID = value.getUserID()) == null) ? "" : userID;
        TRTCCloud tRTCCloud = TUIRoomEngine.sharedInstance().getTRTCCloud();
        Intrinsics.checkNotNullExpressionValue(tRTCCloud, "getTRTCCloud(...)");
        this.f77932e = tRTCCloud;
        TUIRoomEngine tUIRoomEngineSharedInstance = TUIRoomEngine.sharedInstance();
        Intrinsics.checkNotNullExpressionValue(tUIRoomEngineSharedInstance, "sharedInstance(...)");
        this.f77933f = tUIRoomEngineSharedInstance;
        this.f77937j = new C35946a();
    }

    /* JADX INFO: renamed from: A */
    public final void m79819A(NetworkInfo networkInfo) {
        this.f77928a.m79805g().setValue(Integer.valueOf(networkInfo.getDelay()));
        this.f77928a.m79802d().setValue(Integer.valueOf(networkInfo.getDownLoss()));
        this.f77928a.m79806h().setValue(Integer.valueOf(networkInfo.getUpLoss()));
        this.f77928a.m79803e().setValue(networkInfo.getQuality());
    }

    /* JADX INFO: renamed from: B */
    public final void m79820B(AVStatistics aVStatistics) {
        this.f77928a.m79804f().setValue(aVStatistics.getVideoWidth() + " P");
    }

    /* JADX INFO: renamed from: C */
    public final void m79821C(AVStatistics aVStatistics) {
        if (this.f77928a.m79807i().getValue() == NetworkInfoState.Status.Closed) {
            return;
        }
        NetworkQuality value = this.f77928a.m79803e().getValue();
        if (value == NetworkQuality.VERY_BAD || value == NetworkQuality.DOWN) {
            this.f77928a.m79807i().setValue(NetworkInfoState.Status.Abnormal);
        } else {
            this.f77928a.m79807i().setValue((aVStatistics.getFrameRate() < 15 || m79832p(aVStatistics)) ? NetworkInfoState.Status.Abnormal : NetworkInfoState.Status.Normal);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m79824h(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f77929b.m79404b("checkDeviceTemperature:[context:" + context + ']');
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            this.f77928a.m79812n(((float) intentRegisterReceiver.getIntExtra("temperature", 0)) / 10.0f > 45.0f);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final NetworkInfoState getF77928a() {
        return this.f77928a;
    }

    /* JADX INFO: renamed from: j */
    public final void m79826j(String str, boolean z11) {
        if (TextUtils.equals(str, this.f77931d)) {
            this.f77928a.m79801c().setValue((!z11 || this.f77928a.m79801c().getValue() == NetworkInfoState.Status.Mute) ? NetworkInfoState.Status.Closed : NetworkInfoState.Status.Normal);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m79827k(@NotNull NetworkInfo networkInfo) {
        Intrinsics.checkNotNullParameter(networkInfo, "networkInfo");
        if (this.f77928a.m79810l().getValue().booleanValue()) {
            m79819A(networkInfo);
            m79823g(networkInfo);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m79828l(@NotNull List<SeatInfo> seatList) {
        Intrinsics.checkNotNullParameter(seatList, "seatList");
        Iterator<SeatInfo> it = seatList.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().getUserInfo().getUserID(), this.f77931d)) {
                this.f77928a.m79811m().setValue(Boolean.TRUE);
                return;
            }
        }
        this.f77928a.m79811m().setValue(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: m */
    public final void m79829m(@NotNull List<AVStatistics> statisticsList) {
        Intrinsics.checkNotNullParameter(statisticsList, "statisticsList");
        if (statisticsList.isEmpty() || statisticsList.get(0).getUserID().length() != 0) {
            return;
        }
        AVStatistics aVStatistics = statisticsList.get(0);
        m79820B(aVStatistics);
        m79821C(aVStatistics);
        m79841y(aVStatistics);
    }

    /* JADX INFO: renamed from: n */
    public final void m79830n(String str, boolean z11) {
        if (TextUtils.equals(str, this.f77931d)) {
            this.f77928a.m79807i().setValue(z11 ? NetworkInfoState.Status.Normal : NetworkInfoState.Status.Closed);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m79831o() {
        this.f77929b.m79404b("initAudioCaptureVolume:[]");
        this.f77928a.m79799a().setValue(Integer.valueOf(this.f77932e.getAudioCaptureVolume()));
    }

    /* JADX INFO: renamed from: r */
    public final void m79834r(Boolean bool) {
        if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            this.f77928a.m79803e().setValue(NetworkQuality.DOWN);
            this.f77928a.m79807i().setValue(NetworkInfoState.Status.Abnormal);
        } else {
            this.f77928a.m79803e().setValue(NetworkQuality.UNKNOWN);
            this.f77928a.m79807i().setValue(NetworkInfoState.Status.Normal);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m79835s() {
        Object systemService = this.f77930c.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            return;
        }
        this.f77934g = new C35948b();
        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).build();
        ConnectivityManager.NetworkCallback networkCallback = this.f77934g;
        Intrinsics.checkNotNull(networkCallback);
        connectivityManager.registerNetworkCallback(networkRequestBuild, networkCallback);
    }

    /* JADX INFO: renamed from: u */
    public final void m79837u(int i11) {
        this.f77929b.m79404b("setAudioCaptureVolume:[volume:" + i11 + ']');
        this.f77928a.m79799a().setValue(Integer.valueOf(i11));
        this.f77932e.setAudioCaptureVolume(i11);
    }

    /* JADX INFO: renamed from: w */
    public final void m79839w() {
        Object systemService = this.f77930c.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        ConnectivityManager.NetworkCallback networkCallback = this.f77934g;
        if (networkCallback == null || connectivityManager == null) {
            return;
        }
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }

    /* JADX INFO: renamed from: x */
    public final void m79840x(@NotNull TUIRoomDefine.AudioQuality audioQuality) {
        Intrinsics.checkNotNullParameter(audioQuality, "audioQuality");
        this.f77929b.m79404b("updateAudioMode:[audioQuality:" + audioQuality + ']');
        this.f77928a.m79800b().setValue(audioQuality);
        this.f77933f.updateAudioQuality(audioQuality);
    }

    /* JADX INFO: renamed from: y */
    public final void m79841y(AVStatistics aVStatistics) {
        NetworkInfoState.Status value = this.f77928a.m79801c().getValue();
        if (value == NetworkInfoState.Status.Closed || value == NetworkInfoState.Status.Mute) {
            return;
        }
        this.f77928a.m79801c().setValue(aVStatistics.getAudioBitrate() > 0 ? NetworkInfoState.Status.Normal : NetworkInfoState.Status.Abnormal);
    }

    /* JADX INFO: renamed from: z */
    public final void m79842z(int i11) {
        this.f77929b.m79404b("updateAudioStatusByVolume:[volume:" + i11 + ']');
        if (this.f77928a.m79801c().getValue() != NetworkInfoState.Status.Closed) {
            this.f77928a.m79801c().setValue(i11 == 0 ? NetworkInfoState.Status.Mute : NetworkInfoState.Status.Normal);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m79822f() {
        m79838v();
        this.f77933f.addObserver(this.f77937j);
        this.f77936i = C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new NetworkInfoStore$addObserver$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: g */
    public final void m79823g(NetworkInfo networkInfo) {
        boolean z11;
        if (networkInfo.getQuality() != NetworkQuality.BAD && networkInfo.getQuality() != NetworkQuality.VERY_BAD && networkInfo.getQuality() != NetworkQuality.DOWN) {
            z11 = false;
        } else {
            z11 = true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z11) {
            long j11 = this.f77935h;
            if (j11 == 0) {
                this.f77935h = jCurrentTimeMillis;
            } else if (jCurrentTimeMillis - j11 >= 30000) {
                this.f77928a.m79809k().setValue(Boolean.TRUE);
                this.f77935h = jCurrentTimeMillis;
            }
        } else {
            this.f77935h = 0L;
        }
        NetworkQuality value = this.f77928a.m79803e().getValue();
        if (value != NetworkQuality.VERY_BAD && value != NetworkQuality.DOWN) {
            return;
        }
        this.f77928a.m79807i().setValue(NetworkInfoState.Status.Abnormal);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m79832p(AVStatistics aVStatistics) {
        int videoWidth = aVStatistics.getVideoWidth();
        int videoHeight = aVStatistics.getVideoHeight();
        int videoBitrate = aVStatistics.getVideoBitrate();
        if (videoWidth != 240) {
            if (videoWidth != 360) {
                if (videoWidth != 480) {
                    if (videoWidth != 540) {
                        if (videoWidth == 1080 && videoBitrate < 1500) {
                            return true;
                        }
                        return false;
                    }
                    if (videoHeight != 540) {
                        if (videoHeight == 960 && videoBitrate < 800) {
                            return true;
                        }
                        return false;
                    }
                    if (videoBitrate < 500) {
                        return true;
                    }
                    return false;
                }
                if (videoBitrate < 350) {
                    return true;
                }
                return false;
            }
            if (videoBitrate < 200) {
                return true;
            }
            return false;
        }
        if (videoBitrate < 100) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final void m79836t() {
        m79839w();
        this.f77933f.removeObserver(this.f77937j);
        InterfaceC41775x1 interfaceC41775x1 = this.f77936i;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m79838v() {
        m79835s();
    }
}
