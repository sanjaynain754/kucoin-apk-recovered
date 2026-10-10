package com.trtc.uikit.livekit.component.networkInfo.store;

import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.device.NetworkQuality;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: NetworkInfoStore.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\bR\u001a\u0010\u001a\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\bR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\bR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\bR\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\b¨\u0006&"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;", "", "<init>", "()V", "videoStatus", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;", "getVideoStatus", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "audioStatus", "getAudioStatus", "isTakeInSeat", "", "isNetworkConnected", "networkStatus", "Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;", "getNetworkStatus", "resolution", "", "getResolution", "audioMode", "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$AudioQuality;", "getAudioMode", "audioCaptureVolume", "", "getAudioCaptureVolume", "isDeviceThermal", "()Z", "setDeviceThermal", "(Z)V", "isDisplayNetworkWeakTips", "rtt", "getRtt", "upLoss", "getUpLoss", "downLoss", "getDownLoss", "Status", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class NetworkInfoState {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC41669n<Status> f77912a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC41669n<Status> f77913b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final InterfaceC41669n<Boolean> f77914c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final InterfaceC41669n<Boolean> f77915d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final InterfaceC41669n<NetworkQuality> f77916e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final InterfaceC41669n<String> f77917f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final InterfaceC41669n<TUIRoomDefine.AudioQuality> f77918g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final InterfaceC41669n<Integer> f77919h;

    /* JADX INFO: renamed from: i */
    public boolean f77920i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final InterfaceC41669n<Boolean> f77921j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final InterfaceC41669n<Integer> f77922k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final InterfaceC41669n<Integer> f77923l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final InterfaceC41669n<Integer> f77924m;

    /* JADX INFO: compiled from: NetworkInfoStore.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;", "", "<init>", "(Ljava/lang/String;I)V", "Mute", "Closed", ReactProgressBarViewManager.DEFAULT_STYLE, "Abnormal", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum Status {
        Mute,
        Closed,
        Normal,
        Abnormal;


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f77926c = EnumEntriesKt.enumEntries(m79813a());

        @NotNull
        public static EnumEntries<Status> getEntries() {
            return f77926c;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final InterfaceC41669n<Integer> m79799a() {
        return this.f77919h;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final InterfaceC41669n<TUIRoomDefine.AudioQuality> m79800b() {
        return this.f77918g;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final InterfaceC41669n<Status> m79801c() {
        return this.f77913b;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final InterfaceC41669n<Integer> m79802d() {
        return this.f77924m;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final InterfaceC41669n<NetworkQuality> m79803e() {
        return this.f77916e;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final InterfaceC41669n<String> m79804f() {
        return this.f77917f;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final InterfaceC41669n<Integer> m79805g() {
        return this.f77922k;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final InterfaceC41669n<Integer> m79806h() {
        return this.f77923l;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final InterfaceC41669n<Status> m79807i() {
        return this.f77912a;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getF77920i() {
        return this.f77920i;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final InterfaceC41669n<Boolean> m79809k() {
        return this.f77921j;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final InterfaceC41669n<Boolean> m79810l() {
        return this.f77915d;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final InterfaceC41669n<Boolean> m79811m() {
        return this.f77914c;
    }

    /* JADX INFO: renamed from: n */
    public final void m79812n(boolean z11) {
        this.f77920i = z11;
    }

    public NetworkInfoState() {
        Status status = Status.Normal;
        this.f77912a = C41679x.m91009a(status);
        this.f77913b = C41679x.m91009a(status);
        Boolean bool = Boolean.FALSE;
        this.f77914c = C41679x.m91009a(bool);
        this.f77915d = C41679x.m91009a(Boolean.TRUE);
        this.f77916e = C41679x.m91009a(NetworkQuality.UNKNOWN);
        this.f77917f = C41679x.m91009a("");
        this.f77918g = C41679x.m91009a(TUIRoomDefine.AudioQuality.DEFAULT);
        this.f77919h = C41679x.m91009a(0);
        this.f77921j = C41679x.m91009a(bool);
        this.f77922k = C41679x.m91009a(0);
        this.f77923l = C41679x.m91009a(0);
        this.f77924m = C41679x.m91009a(0);
    }
}
