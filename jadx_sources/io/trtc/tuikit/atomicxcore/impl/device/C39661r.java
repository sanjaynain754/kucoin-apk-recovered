package io.trtc.tuikit.atomicxcore.impl.device;

import android.content.Context;
import com.tencent.cloud.tuikit.engine.call.TUICallEngine;
import com.tencent.cloud.tuikit.engine.extension.TUIRoomDeviceManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import com.tencent.trtc.TRTCCloudDef;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.device.AudioRoute;
import io.trtc.tuikit.atomicxcore.api.device.DeviceError;
import io.trtc.tuikit.atomicxcore.api.device.DeviceFocusOwner;
import io.trtc.tuikit.atomicxcore.api.device.DeviceState;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStatus;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import io.trtc.tuikit.atomicxcore.api.device.MirrorType;
import io.trtc.tuikit.atomicxcore.api.device.NetworkInfo;
import io.trtc.tuikit.atomicxcore.api.device.VideoQuality;
import io.trtc.tuikit.atomicxcore.api.view.AbstractC39398a;
import io.trtc.tuikit.atomicxcore.api.view.CameraView;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.json.JSONObject;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.device.r */
/* JADX INFO: loaded from: classes61.dex */
public final class C39661r extends DeviceStore {

    /* JADX INFO: renamed from: s */
    public static final Lazy f88102s = LazyKt.lazy(C39653j.f88090a);

    /* JADX INFO: renamed from: a */
    public final InterfaceC41669n f88103a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC41669n f88104b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC41669n f88105c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC41669n f88106d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC41669n f88107e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC41669n f88108f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC41669n f88109g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC41669n f88110h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC41669n f88111i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC41669n f88112j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC41669n f88113k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC41669n f88114l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC41669n f88115m;

    /* JADX INFO: renamed from: n */
    public final C39510r f88116n;

    /* JADX INFO: renamed from: o */
    public final TUIRoomEngine f88117o;

    /* JADX INFO: renamed from: p */
    public final TUICallEngine f88118p;

    /* JADX INFO: renamed from: q */
    public DeviceFocusOwner f88119q;

    /* JADX INFO: renamed from: r */
    public final DeviceState f88120r;

    public C39661r() {
        DeviceStatus deviceStatus = DeviceStatus.OFF;
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(deviceStatus);
        this.f88103a = interfaceC41669nM91009a;
        DeviceError deviceError = DeviceError.NO_ERROR;
        InterfaceC41669n interfaceC41669nM91009a2 = C41679x.m91009a(deviceError);
        this.f88104b = interfaceC41669nM91009a2;
        InterfaceC41669n interfaceC41669nM91009a3 = C41679x.m91009a(100);
        this.f88105c = interfaceC41669nM91009a3;
        InterfaceC41669n interfaceC41669nM91009a4 = C41679x.m91009a(0);
        this.f88106d = interfaceC41669nM91009a4;
        InterfaceC41669n interfaceC41669nM91009a5 = C41679x.m91009a(100);
        this.f88107e = interfaceC41669nM91009a5;
        InterfaceC41669n interfaceC41669nM91009a6 = C41679x.m91009a(deviceStatus);
        this.f88108f = interfaceC41669nM91009a6;
        InterfaceC41669n interfaceC41669nM91009a7 = C41679x.m91009a(deviceError);
        this.f88109g = interfaceC41669nM91009a7;
        InterfaceC41669n interfaceC41669nM91009a8 = C41679x.m91009a(Boolean.TRUE);
        this.f88110h = interfaceC41669nM91009a8;
        InterfaceC41669n interfaceC41669nM91009a9 = C41679x.m91009a(MirrorType.AUTO);
        this.f88111i = interfaceC41669nM91009a9;
        InterfaceC41669n interfaceC41669nM91009a10 = C41679x.m91009a(VideoQuality.QUALITY_1080P);
        this.f88112j = interfaceC41669nM91009a10;
        InterfaceC41669n interfaceC41669nM91009a11 = C41679x.m91009a(AudioRoute.SPEAKERPHONE);
        this.f88113k = interfaceC41669nM91009a11;
        InterfaceC41669n interfaceC41669nM91009a12 = C41679x.m91009a(deviceStatus);
        this.f88114l = interfaceC41669nM91009a12;
        InterfaceC41669n interfaceC41669nM91009a13 = C41679x.m91009a(new NetworkInfo(null, null, 0, 0, 0, 31, null));
        this.f88115m = interfaceC41669nM91009a13;
        C39510r c39510rM88229a = AbstractC39398a.m88229a("DeviceStoreImpl", "file", "AtomicXCore-Live", "DeviceStoreImpl");
        this.f88116n = c39510rM88229a;
        TUIRoomEngine tUIRoomEngineSharedInstance = TUIRoomEngine.sharedInstance();
        this.f88117o = tUIRoomEngineSharedInstance;
        C39655l c39655l = new C39655l(this);
        this.f88119q = DeviceFocusOwner.NONE;
        this.f88120r = new DeviceState(interfaceC41669nM91009a, interfaceC41669nM91009a2, interfaceC41669nM91009a3, interfaceC41669nM91009a4, interfaceC41669nM91009a5, interfaceC41669nM91009a6, interfaceC41669nM91009a7, interfaceC41669nM91009a8, interfaceC41669nM91009a9, interfaceC41669nM91009a10, interfaceC41669nM91009a11, interfaceC41669nM91009a12, interfaceC41669nM91009a13);
        tUIRoomEngineSharedInstance.addObserver(c39655l);
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            ContextUtils.initContextFromNative("liteav");
            applicationContext = ContextUtils.getApplicationContext();
        }
        if (applicationContext != null) {
            this.f88118p = TUICallEngine.createInstance(applicationContext);
        } else {
            Intrinsics.checkNotNullParameter("init callEngine fail, invalid context.", "message");
            c39510rM88229a.m88251a(2, "init callEngine fail, invalid context.");
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.device.DeviceStore
    public final void closeLocalCamera() {
        C39510r c39510r = this.f88116n;
        String message = "API: closeLocalCamera called with focus=" + this.f88119q;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        if (AbstractC39656m.f88092a[this.f88119q.ordinal()] == 1) {
            TUICallEngine tUICallEngine = this.f88118p;
            if (tUICallEngine != null) {
                tUICallEngine.closeCamera();
            }
        } else {
            this.f88117o.closeLocalCamera();
        }
        this.f88108f.setValue(DeviceStatus.OFF);
        this.f88109g.setValue(DeviceError.NO_ERROR);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.device.DeviceStore
    public final void closeLocalMicrophone() {
        C39510r c39510r = this.f88116n;
        String message = "API: closeLocalMicrophone called with focus=" + this.f88119q;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        if (AbstractC39656m.f88092a[this.f88119q.ordinal()] == 1) {
            TUICallEngine tUICallEngine = this.f88118p;
            if (tUICallEngine != null) {
                tUICallEngine.closeMicrophone();
            }
        } else {
            this.f88117o.closeLocalMicrophone();
        }
        this.f88103a.setValue(DeviceStatus.OFF);
        this.f88104b.setValue(DeviceError.NO_ERROR);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.device.DeviceStore
    public final DeviceState getDeviceState() {
        return this.f88120r;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.device.DeviceStore
    public final void openLocalCamera(boolean z11, CompletionHandler completionHandler) {
        C39510r c39510r = this.f88116n;
        String message = "API: openLocalCamera called with isFront=" + z11 + ", focus=" + this.f88119q;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        if (AbstractC39656m.f88092a[this.f88119q.ordinal()] != 1) {
            this.f88117o.openLocalCamera(z11, AbstractC39652i.m88295a((VideoQuality) this.f88112j.getValue()), new C39658o(this, z11, completionHandler));
            return;
        }
        this.f88108f.setValue(DeviceStatus.ON);
        this.f88109g.setValue(DeviceError.NO_ERROR);
        this.f88110h.setValue(Boolean.valueOf(z11));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isFront", z11);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("api", "openCamera");
            jSONObject2.put(ReportDataTable.COLUMN_PARAMS, jSONObject);
            TUICallEngine tUICallEngine = this.f88118p;
            if (tUICallEngine != null) {
                tUICallEngine.callExperimentalAPI(jSONObject2.toString());
            }
            if (completionHandler != null) {
                completionHandler.onSuccess();
            }
        } catch (Exception e11) {
            if (completionHandler != null) {
                completionHandler.onFailure(-1, "callEngine openLocalCamera fail");
            }
            C39510r c39510r2 = this.f88116n;
            String message2 = "callEngine openLocalCamera fail, e: " + e11.getMessage();
            c39510r2.getClass();
            Intrinsics.checkNotNullParameter(message2, "message");
            c39510r2.m88251a(2, message2);
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.device.DeviceStore
    public final void openLocalMicrophone(CompletionHandler completionHandler) {
        C39510r c39510r = this.f88116n;
        String message = "API: openLocalMicrophone called with focus=" + this.f88119q;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        if (AbstractC39656m.f88092a[this.f88119q.ordinal()] != 1) {
            this.f88117o.openLocalMicrophone(TUIRoomDefine.AudioQuality.DEFAULT, new C39659p(this, completionHandler));
            return;
        }
        TUICallEngine tUICallEngine = this.f88118p;
        if (tUICallEngine != null) {
            tUICallEngine.openMicrophone(new C39657n(this, completionHandler));
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.device.DeviceStore
    public final void reset() {
        AbstractC39465b.m88232a(this.f88116n, "API: reset called", "message", 0, "API: reset called");
        setCaptureVolume(100);
        setOutputVolume(100);
        setAudioRoute(AudioRoute.SPEAKERPHONE);
        switchMirror(MirrorType.AUTO);
        updateVideoQuality(VideoQuality.QUALITY_1080P);
        closeLocalMicrophone();
        closeLocalCamera();
        stopScreenShare();
        this.f88106d.setValue(0);
        this.f88110h.setValue(Boolean.TRUE);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.device.DeviceStore
    public final void setAudioRoute(AudioRoute audioRoute) {
        TUIRoomDeviceManager.AudioRoute audioRoute2;
        Intrinsics.checkNotNullParameter(audioRoute, "audioRoute");
        C39510r c39510r = this.f88116n;
        String message = "API: setAudioRoute called with audioRoute=" + audioRoute;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        TUIRoomDeviceManager mediaDeviceManager = this.f88117o.getMediaDeviceManager();
        Intrinsics.checkNotNullParameter(audioRoute, "audioRoute");
        int i11 = AbstractC39651h.f88086c[audioRoute.ordinal()];
        if (i11 == 1) {
            audioRoute2 = TUIRoomDeviceManager.AudioRoute.EARPIECE;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            audioRoute2 = TUIRoomDeviceManager.AudioRoute.SPEAKERPHONE;
        }
        mediaDeviceManager.setAudioRoute(audioRoute2);
        this.f88113k.setValue(audioRoute);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.device.DeviceStore
    public final void setCaptureVolume(int i11) {
        C39510r c39510r = this.f88116n;
        String message = "API: setCaptureVolume called with volume=" + i11;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88117o.getTRTCCloud().setAudioCaptureVolume(i11);
        this.f88105c.setValue(Integer.valueOf(i11));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.device.DeviceStore
    public final void setFocus$atomicxcore_release(DeviceFocusOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        C39510r c39510r = this.f88116n;
        String message = "API: setFocus called with owner=" + owner;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88119q = owner;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.device.DeviceStore
    public final void setOutputVolume(int i11) {
        C39510r c39510r = this.f88116n;
        String message = "API: setOutputVolume called with volume=" + i11;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88117o.getTRTCCloud().getAudioEffectManager().setVoiceCaptureVolume(i11);
        this.f88107e.setValue(Integer.valueOf(i11));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.device.DeviceStore
    public final void startCameraTest(CameraView cameraView, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(cameraView, "cameraView");
        C39510r c39510r = this.f88116n;
        String message = "API: startCameraTest called with cameraView=" + cameraView + ", focus=" + this.f88119q;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88117o.setLocalVideoView(cameraView);
        if (AbstractC39656m.f88092a[this.f88119q.ordinal()] != 1) {
            this.f88117o.openLocalCamera(true, AbstractC39652i.m88295a((VideoQuality) this.f88112j.getValue()), new C39660q(this, completionHandler));
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isFront", true);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("api", "openCamera");
            jSONObject2.put(ReportDataTable.COLUMN_PARAMS, jSONObject);
            TUICallEngine tUICallEngine = this.f88118p;
            if (tUICallEngine != null) {
                tUICallEngine.callExperimentalAPI(jSONObject2.toString());
            }
            if (completionHandler != null) {
                completionHandler.onSuccess();
            }
        } catch (Exception e11) {
            if (completionHandler != null) {
                completionHandler.onFailure(-1, "callEngine startCameraTest fail");
            }
            C39510r c39510r2 = this.f88116n;
            String message2 = "callEngine startCameraTest fail, e: " + e11.getMessage();
            c39510r2.getClass();
            Intrinsics.checkNotNullParameter(message2, "message");
            c39510r2.m88251a(2, message2);
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.device.DeviceStore
    public final void startScreenShare() {
        AbstractC39465b.m88232a(this.f88116n, "API: startScreenShare called", "message", 0, "API: startScreenShare called");
        this.f88117o.startScreenSharing();
        this.f88114l.setValue(DeviceStatus.ON);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.device.DeviceStore
    public final void stopCameraTest() {
        C39510r c39510r = this.f88116n;
        String message = "API: stopCameraTest called with focus=" + this.f88119q;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        if (AbstractC39656m.f88092a[this.f88119q.ordinal()] != 1) {
            this.f88117o.closeLocalCamera();
            return;
        }
        TUICallEngine tUICallEngine = this.f88118p;
        if (tUICallEngine != null) {
            tUICallEngine.closeCamera();
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.device.DeviceStore
    public final void stopScreenShare() {
        AbstractC39465b.m88232a(this.f88116n, "API: stopScreenShare called", "message", 0, "API: stopScreenShare called");
        this.f88117o.stopScreenSharing();
        this.f88114l.setValue(DeviceStatus.OFF);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.device.DeviceStore
    public final void switchCamera(boolean z11) {
        C39510r c39510r = this.f88116n;
        String message = "API: switchCamera called with isFront=" + z11;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88117o.getMediaDeviceManager().switchCamera(z11);
        this.f88110h.setValue(Boolean.valueOf(z11));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.device.DeviceStore
    public final void switchMirror(MirrorType mirrorType) {
        Intrinsics.checkNotNullParameter(mirrorType, "mirrorType");
        C39510r c39510r = this.f88116n;
        String message = "API: switchMirror called with mirrorType=" + mirrorType;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        int i11 = 0;
        c39510r.m88251a(0, message);
        TRTCCloudDef.TRTCRenderParams tRTCRenderParams = new TRTCCloudDef.TRTCRenderParams();
        Intrinsics.checkNotNullParameter(mirrorType, "mirrorType");
        int i12 = AbstractC39651h.f88084a[mirrorType.ordinal()];
        if (i12 != 1) {
            i11 = 2;
            if (i12 == 2) {
                i11 = 1;
            } else if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        tRTCRenderParams.mirrorType = i11;
        this.f88117o.getTRTCCloud().setLocalRenderParams(tRTCRenderParams);
        this.f88111i.setValue(mirrorType);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.device.DeviceStore
    public final void updateVideoQuality(VideoQuality quality) {
        Intrinsics.checkNotNullParameter(quality, "quality");
        C39510r c39510r = this.f88116n;
        String message = "API: updateVideoQuality called with quality=" + quality;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88117o.updateVideoQuality(AbstractC39652i.m88295a(quality));
        this.f88112j.setValue(quality);
    }
}
