package com.trtc.uikit.livekit.features.anchorboardcast.store;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.TypedValue;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.qcloud.tuicore.TUICore;
import com.trtc.uikit.livekit.common.ErrorLocalized;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.component.beauty.tebeauty.TEBeautyManager;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.DeviceControlPolicy;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import wd0.MediaState;

/* JADX INFO: compiled from: MediaStore.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\bJ\u001e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017J\b\u0010\u0019\u001a\u00020\u0010H\u0002J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0017H\u0002J\u0006\u0010\u001d\u001a\u00020\u0010J\u000e\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\bJ\u001e\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006&"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;", "", "<init>", "()V", "logger", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "_isAudioLocked", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_isVideoLocked", "_isPipModeEnabled", "mediaState", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaState;", "getMediaState", "()Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaState;", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "", "enableMultiPlaybackQuality", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "createVideoMuteBitmap", "context", "Landroid/content/Context;", "bigResId", "", "smallResId", "releaseVideoMuteBitmap", "createMuteBitmap", "Landroid/graphics/Bitmap;", "resId", "setCustomVideoProcess", "enablePipMode", "disableUserMediaDevice", "userId", "", "device", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore$MediaDevice;", "isDisable", "MediaDevice", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMediaStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaStore.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,168:1\n230#2,5:169\n*S KotlinDebug\n*F\n+ 1 MediaStore.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore\n*L\n96#1:169,5\n*E\n"})
public final class MediaStore {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final LiveKitLogger f78184a = LiveKitLogger.f77564c.getFeaturesLogger("MediaManager");

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC41669n<Boolean> f78185b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final InterfaceC41669n<Boolean> f78186c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final InterfaceC41669n<Boolean> f78187d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final MediaState f78188e;

    /* JADX INFO: compiled from: MediaStore.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore$MediaDevice;", "", "<init>", "(Ljava/lang/String;I)V", "MICROPHONE", "CAMERA", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum MediaDevice {
        MICROPHONE,
        CAMERA;


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f78190c = EnumEntriesKt.enumEntries(m80258a());

        @NotNull
        public static EnumEntries<MediaDevice> getEntries() {
            return f78190c;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.store.MediaStore$a */
    /* JADX INFO: compiled from: MediaStore.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore$disableUserMediaDevice$1", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "onSuccess", "", "onFailure", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36060a implements CompletionHandler {
        public C36060a() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onFailure(int code, String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            MediaStore.this.f78184a.m79403a("openRemoteCamera failed:code:" + code + ",desc:" + desc);
            ErrorLocalized.f77561a.onError(code);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onSuccess() {
            MediaStore.this.f78184a.m79404b("openRemoteCamera:[success]");
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.store.MediaStore$b */
    /* JADX INFO: compiled from: MediaStore.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore$disableUserMediaDevice$2", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "onSuccess", "", "onFailure", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36061b implements CompletionHandler {
        public C36061b() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onFailure(int code, String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            MediaStore.this.f78184a.m79403a("closeRemoteCamera failed:code:" + code + ",desc:" + desc);
            ErrorLocalized.f77561a.onError(code);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onSuccess() {
            MediaStore.this.f78184a.m79404b("closeRemoteCamera:[success]");
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.store.MediaStore$c */
    /* JADX INFO: compiled from: MediaStore.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore$disableUserMediaDevice$3", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "onSuccess", "", "onFailure", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36062c implements CompletionHandler {
        public C36062c() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onFailure(int code, String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            MediaStore.this.f78184a.m79403a("openRemoteMicrophone failed:code:" + code + ",desc:" + desc);
            ErrorLocalized.f77561a.onError(code);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onSuccess() {
            MediaStore.this.f78184a.m79404b("openRemoteMicrophone:[success]");
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.store.MediaStore$d */
    /* JADX INFO: compiled from: MediaStore.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore$disableUserMediaDevice$4", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "onSuccess", "", "onFailure", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36063d implements CompletionHandler {
        public C36063d() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onFailure(int code, String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            MediaStore.this.f78184a.m79403a("closeRemoteMicrophone failed:code:" + code + ",desc:" + desc);
            ErrorLocalized.f77561a.onError(code);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onSuccess() {
            MediaStore.this.f78184a.m79404b("closeRemoteMicrophone:[success]");
        }
    }

    /* JADX INFO: renamed from: b */
    public final Bitmap m80249b(Context context, int i11) {
        TypedValue typedValue = new TypedValue();
        context.getResources().openRawResource(i11, typedValue);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = typedValue.density;
        options.inScaled = false;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), i11, options);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource, "decodeResource(...)");
        return bitmapDecodeResource;
    }

    /* JADX INFO: renamed from: c */
    public final void m80250c(@NotNull Context context, int i11, int i12) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f78188e.getBigMuteBitmap() == null) {
            this.f78188e.m101184d(m80249b(context, i11));
        }
        if (this.f78188e.getSmallMuteBitmap() == null) {
            this.f78188e.m101185e(m80249b(context, i12));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m80251d() {
        this.f78184a.m79404b(TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC);
        m80256i();
        m80253f(false);
    }

    /* JADX INFO: renamed from: e */
    public final void m80252e(@NotNull String userId, @NotNull MediaDevice device, boolean z11) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(device, "device");
        String liveID = LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID();
        if (liveID.length() == 0) {
            return;
        }
        if (device == MediaDevice.CAMERA) {
            if (z11) {
                LiveSeatStore.INSTANCE.create(liveID).openRemoteCamera(userId, DeviceControlPolicy.UNLOCK_ONLY, new C36060a());
                return;
            } else {
                LiveSeatStore.INSTANCE.create(liveID).closeRemoteCamera(userId, new C36061b());
                return;
            }
        }
        if (z11) {
            LiveSeatStore.INSTANCE.create(liveID).openRemoteMicrophone(userId, DeviceControlPolicy.UNLOCK_ONLY, new C36062c());
        } else {
            LiveSeatStore.INSTANCE.create(liveID).closeRemoteMicrophone(userId, new C36063d());
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m80254g(boolean z11) {
        Boolean value;
        InterfaceC41669n<Boolean> interfaceC41669n = this.f78187d;
        do {
            value = interfaceC41669n.getValue();
            value.getClass();
        } while (!interfaceC41669n.compareAndSet(value, Boolean.valueOf(z11)));
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final MediaState getF78188e() {
        return this.f78188e;
    }

    /* JADX INFO: renamed from: i */
    public final void m80256i() {
        Bitmap bigMuteBitmap = this.f78188e.getBigMuteBitmap();
        if (bigMuteBitmap != null && !bigMuteBitmap.isRecycled()) {
            bigMuteBitmap.recycle();
        }
        Bitmap smallMuteBitmap = this.f78188e.getSmallMuteBitmap();
        if (smallMuteBitmap != null && !smallMuteBitmap.isRecycled()) {
            smallMuteBitmap.recycle();
        }
        this.f78188e.m101184d(null);
        this.f78188e.m101185e(null);
    }

    /* JADX INFO: renamed from: j */
    public final void m80257j() {
        TEBeautyManager.f77696a.m79595s();
    }

    public MediaStore() {
        Boolean bool = Boolean.FALSE;
        InterfaceC41669n<Boolean> interfaceC41669nM91009a = C41679x.m91009a(bool);
        this.f78185b = interfaceC41669nM91009a;
        InterfaceC41669n<Boolean> interfaceC41669nM91009a2 = C41679x.m91009a(bool);
        this.f78186c = interfaceC41669nM91009a2;
        InterfaceC41669n<Boolean> interfaceC41669nM91009a3 = C41679x.m91009a(bool);
        this.f78187d = interfaceC41669nM91009a3;
        this.f78188e = new MediaState(interfaceC41669nM91009a, interfaceC41669nM91009a2, interfaceC41669nM91009a3, null, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m80253f(boolean z11) {
        TUICore.callService("AdvanceSettingManager", "enableMultiPlaybackQuality", MapsKt.hashMapOf(TuplesKt.m90091to(BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, Boolean.valueOf(z11))));
    }
}
