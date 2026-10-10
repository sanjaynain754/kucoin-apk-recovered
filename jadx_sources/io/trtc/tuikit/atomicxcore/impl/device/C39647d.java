package io.trtc.tuikit.atomicxcore.impl.device;

import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import com.tencent.liteav.audio.TXAudioEffectManager;
import io.trtc.tuikit.atomicxcore.api.device.AudioChangerType;
import io.trtc.tuikit.atomicxcore.api.device.AudioEffectState;
import io.trtc.tuikit.atomicxcore.api.device.AudioEffectStore;
import io.trtc.tuikit.atomicxcore.api.device.AudioReverbType;
import io.trtc.tuikit.atomicxcore.api.view.AbstractC39398a;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.device.d */
/* JADX INFO: loaded from: classes61.dex */
public final class C39647d extends AudioEffectStore {

    /* JADX INFO: renamed from: h */
    public static final Lazy f88068h = LazyKt.lazy(C39645b.f88067a);

    /* JADX INFO: renamed from: a */
    public final InterfaceC41669n f88069a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC41669n f88070b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC41669n f88071c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC41669n f88072d;

    /* JADX INFO: renamed from: e */
    public final C39510r f88073e;

    /* JADX INFO: renamed from: f */
    public final TXAudioEffectManager f88074f;

    /* JADX INFO: renamed from: g */
    public final AudioEffectState f88075g;

    @Override // io.trtc.tuikit.atomicxcore.api.device.AudioEffectStore
    public final AudioEffectState getAudioEffectState() {
        return this.f88075g;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.device.AudioEffectStore
    public final void reset() {
        AbstractC39465b.m88232a(this.f88073e, "API: reset called", "message", 0, "API: reset called");
        setAudioChangerType(AudioChangerType.NONE);
        setAudioReverbType(AudioReverbType.NONE);
        setVoiceEarMonitorEnable(false);
        setVoiceEarMonitorVolume(100);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.device.AudioEffectStore
    public final void setVoiceEarMonitorEnable(boolean z11) {
        C39510r c39510r = this.f88073e;
        String message = "API: setVoiceEarMonitorEnable called with enable=" + z11 + ", currentEnable=" + ((Boolean) this.f88071c.getValue()).booleanValue();
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88071c.setValue(Boolean.valueOf(z11));
        this.f88074f.enableVoiceEarMonitor(z11);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.device.AudioEffectStore
    public final void setVoiceEarMonitorVolume(int i11) {
        C39510r c39510r = this.f88073e;
        String message = "API: setVoiceEarMonitorVolume called with volume=" + i11 + ", enable=" + ((Boolean) this.f88071c.getValue()).booleanValue();
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88072d.setValue(Integer.valueOf(i11));
        this.f88074f.setVoiceEarMonitorVolume(i11);
    }

    public C39647d() {
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(AudioChangerType.NONE);
        this.f88069a = interfaceC41669nM91009a;
        InterfaceC41669n interfaceC41669nM91009a2 = C41679x.m91009a(AudioReverbType.NONE);
        this.f88070b = interfaceC41669nM91009a2;
        InterfaceC41669n interfaceC41669nM91009a3 = C41679x.m91009a(Boolean.FALSE);
        this.f88071c = interfaceC41669nM91009a3;
        InterfaceC41669n interfaceC41669nM91009a4 = C41679x.m91009a(100);
        this.f88072d = interfaceC41669nM91009a4;
        this.f88073e = AbstractC39398a.m88229a("AudioEffectStoreImpl", "file", "AtomicXCore-Live", "AudioEffectStoreImpl");
        this.f88074f = TUIRoomEngine.sharedInstance().getTRTCCloud().getAudioEffectManager();
        this.f88075g = new AudioEffectState(interfaceC41669nM91009a, interfaceC41669nM91009a2, interfaceC41669nM91009a3, interfaceC41669nM91009a4);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.device.AudioEffectStore
    public final void setAudioChangerType(AudioChangerType audioChangerType) {
        TXAudioEffectManager.TXVoiceChangerType tXVoiceChangerType;
        Intrinsics.checkNotNullParameter(audioChangerType, "type");
        C39510r c39510r = this.f88073e;
        String message = "API: setAudioChangerType called with type=" + audioChangerType + ", currentType=" + this.f88069a.getValue();
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88069a.setValue(audioChangerType);
        TXAudioEffectManager tXAudioEffectManager = this.f88074f;
        Intrinsics.checkNotNullParameter(audioChangerType, "audioChangerType");
        switch (AbstractC39644a.f88065a[audioChangerType.ordinal()]) {
            case 1:
                tXVoiceChangerType = TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_0;
                break;
            case 2:
                tXVoiceChangerType = TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_1;
                break;
            case 3:
                tXVoiceChangerType = TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_2;
                break;
            case 4:
                tXVoiceChangerType = TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_3;
                break;
            case 5:
                tXVoiceChangerType = TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_4;
                break;
            case 6:
                tXVoiceChangerType = TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_5;
                break;
            case 7:
                tXVoiceChangerType = TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_6;
                break;
            case 8:
                tXVoiceChangerType = TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_7;
                break;
            case 9:
                tXVoiceChangerType = TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_8;
                break;
            case 10:
                tXVoiceChangerType = TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_9;
                break;
            case 11:
                tXVoiceChangerType = TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_10;
                break;
            case 12:
                tXVoiceChangerType = TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_11;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        tXAudioEffectManager.setVoiceChangerType(tXVoiceChangerType);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.device.AudioEffectStore
    public final void setAudioReverbType(AudioReverbType audioReverbType) {
        TXAudioEffectManager.TXVoiceReverbType tXVoiceReverbType;
        Intrinsics.checkNotNullParameter(audioReverbType, "type");
        C39510r c39510r = this.f88073e;
        String message = "API: setAudioReverbType called with type=" + audioReverbType + ", currentType=" + this.f88070b.getValue();
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88070b.setValue(audioReverbType);
        TXAudioEffectManager tXAudioEffectManager = this.f88074f;
        Intrinsics.checkNotNullParameter(audioReverbType, "audioReverbType");
        switch (AbstractC39644a.f88066b[audioReverbType.ordinal()]) {
            case 1:
                tXVoiceReverbType = TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_0;
                break;
            case 2:
                tXVoiceReverbType = TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_1;
                break;
            case 3:
                tXVoiceReverbType = TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_2;
                break;
            case 4:
                tXVoiceReverbType = TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_3;
                break;
            case 5:
                tXVoiceReverbType = TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_4;
                break;
            case 6:
                tXVoiceReverbType = TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_5;
                break;
            case 7:
                tXVoiceReverbType = TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_6;
                break;
            case 8:
                tXVoiceReverbType = TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_7;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        tXAudioEffectManager.setVoiceReverbType(tXVoiceReverbType);
    }
}
