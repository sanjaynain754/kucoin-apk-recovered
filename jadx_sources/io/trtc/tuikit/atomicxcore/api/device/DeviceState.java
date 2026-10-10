package io.trtc.tuikit.atomicxcore.api.device;

import io.trtc.tuikit.atomicxcore.api.call.AbstractC39397b;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B½\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0002\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0002\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0002\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJ\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001bJ\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001bJ\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00130\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001bJ\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001bJ\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00160\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001bJà\u0001\u0010(\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00022\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0002HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020\r2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b3\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b4\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b5\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b6\u0010\u001bR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b7\u0010\u001bR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b8\u0010\u001bR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b9\u0010\u001bR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b\u000e\u0010\u001bR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b:\u0010\u001bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b;\u0010\u001bR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u00102\u001a\u0004\b<\u0010\u001bR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u00102\u001a\u0004\b=\u0010\u001bR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u00102\u001a\u0004\b>\u0010\u001b¨\u0006?"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;", "", "Lkotlinx/coroutines/flow/w;", "Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;", "microphoneStatus", "Lio/trtc/tuikit/atomicxcore/api/device/DeviceError;", "microphoneLastError", "", "captureVolume", "currentMicVolume", "outputVolume", "cameraStatus", "cameraLastError", "", "isFrontCamera", "Lio/trtc/tuikit/atomicxcore/api/device/MirrorType;", "localMirrorType", "Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;", "localVideoQuality", "Lio/trtc/tuikit/atomicxcore/api/device/AudioRoute;", "currentAudioRoute", "screenStatus", "Lio/trtc/tuikit/atomicxcore/api/device/NetworkInfo;", "networkInfo", "<init>", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)V", "component1", "()Lkotlinx/coroutines/flow/w;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/flow/w;", "getMicrophoneStatus", "getMicrophoneLastError", "getCaptureVolume", "getCurrentMicVolume", "getOutputVolume", "getCameraStatus", "getCameraLastError", "getLocalMirrorType", "getLocalVideoQuality", "getCurrentAudioRoute", "getScreenStatus", "getNetworkInfo", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class DeviceState {

    @NotNull
    private final InterfaceC41678w<DeviceError> cameraLastError;

    @NotNull
    private final InterfaceC41678w<DeviceStatus> cameraStatus;

    @NotNull
    private final InterfaceC41678w<Integer> captureVolume;

    @NotNull
    private final InterfaceC41678w<AudioRoute> currentAudioRoute;

    @NotNull
    private final InterfaceC41678w<Integer> currentMicVolume;

    @NotNull
    private final InterfaceC41678w<Boolean> isFrontCamera;

    @NotNull
    private final InterfaceC41678w<MirrorType> localMirrorType;

    @NotNull
    private final InterfaceC41678w<VideoQuality> localVideoQuality;

    @NotNull
    private final InterfaceC41678w<DeviceError> microphoneLastError;

    @NotNull
    private final InterfaceC41678w<DeviceStatus> microphoneStatus;

    @NotNull
    private final InterfaceC41678w<NetworkInfo> networkInfo;

    @NotNull
    private final InterfaceC41678w<Integer> outputVolume;

    @NotNull
    private final InterfaceC41678w<DeviceStatus> screenStatus;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceState copy$default(DeviceState deviceState, InterfaceC41678w interfaceC41678w, InterfaceC41678w interfaceC41678w2, InterfaceC41678w interfaceC41678w3, InterfaceC41678w interfaceC41678w4, InterfaceC41678w interfaceC41678w5, InterfaceC41678w interfaceC41678w6, InterfaceC41678w interfaceC41678w7, InterfaceC41678w interfaceC41678w8, InterfaceC41678w interfaceC41678w9, InterfaceC41678w interfaceC41678w10, InterfaceC41678w interfaceC41678w11, InterfaceC41678w interfaceC41678w12, InterfaceC41678w interfaceC41678w13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC41678w = deviceState.microphoneStatus;
        }
        return deviceState.copy(interfaceC41678w, (i11 & 2) != 0 ? deviceState.microphoneLastError : interfaceC41678w2, (i11 & 4) != 0 ? deviceState.captureVolume : interfaceC41678w3, (i11 & 8) != 0 ? deviceState.currentMicVolume : interfaceC41678w4, (i11 & 16) != 0 ? deviceState.outputVolume : interfaceC41678w5, (i11 & 32) != 0 ? deviceState.cameraStatus : interfaceC41678w6, (i11 & 64) != 0 ? deviceState.cameraLastError : interfaceC41678w7, (i11 & 128) != 0 ? deviceState.isFrontCamera : interfaceC41678w8, (i11 & 256) != 0 ? deviceState.localMirrorType : interfaceC41678w9, (i11 & 512) != 0 ? deviceState.localVideoQuality : interfaceC41678w10, (i11 & 1024) != 0 ? deviceState.currentAudioRoute : interfaceC41678w11, (i11 & 2048) != 0 ? deviceState.screenStatus : interfaceC41678w12, (i11 & 4096) != 0 ? deviceState.networkInfo : interfaceC41678w13);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceState)) {
            return false;
        }
        DeviceState deviceState = (DeviceState) other;
        return Intrinsics.areEqual(this.microphoneStatus, deviceState.microphoneStatus) && Intrinsics.areEqual(this.microphoneLastError, deviceState.microphoneLastError) && Intrinsics.areEqual(this.captureVolume, deviceState.captureVolume) && Intrinsics.areEqual(this.currentMicVolume, deviceState.currentMicVolume) && Intrinsics.areEqual(this.outputVolume, deviceState.outputVolume) && Intrinsics.areEqual(this.cameraStatus, deviceState.cameraStatus) && Intrinsics.areEqual(this.cameraLastError, deviceState.cameraLastError) && Intrinsics.areEqual(this.isFrontCamera, deviceState.isFrontCamera) && Intrinsics.areEqual(this.localMirrorType, deviceState.localMirrorType) && Intrinsics.areEqual(this.localVideoQuality, deviceState.localVideoQuality) && Intrinsics.areEqual(this.currentAudioRoute, deviceState.currentAudioRoute) && Intrinsics.areEqual(this.screenStatus, deviceState.screenStatus) && Intrinsics.areEqual(this.networkInfo, deviceState.networkInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceState(@NotNull InterfaceC41678w<? extends DeviceStatus> microphoneStatus, @NotNull InterfaceC41678w<? extends DeviceError> microphoneLastError, @NotNull InterfaceC41678w<Integer> captureVolume, @NotNull InterfaceC41678w<Integer> currentMicVolume, @NotNull InterfaceC41678w<Integer> outputVolume, @NotNull InterfaceC41678w<? extends DeviceStatus> cameraStatus, @NotNull InterfaceC41678w<? extends DeviceError> cameraLastError, @NotNull InterfaceC41678w<Boolean> isFrontCamera, @NotNull InterfaceC41678w<? extends MirrorType> localMirrorType, @NotNull InterfaceC41678w<? extends VideoQuality> localVideoQuality, @NotNull InterfaceC41678w<? extends AudioRoute> currentAudioRoute, @NotNull InterfaceC41678w<? extends DeviceStatus> screenStatus, @NotNull InterfaceC41678w<NetworkInfo> networkInfo) {
        Intrinsics.checkNotNullParameter(microphoneStatus, "microphoneStatus");
        Intrinsics.checkNotNullParameter(microphoneLastError, "microphoneLastError");
        Intrinsics.checkNotNullParameter(captureVolume, "captureVolume");
        Intrinsics.checkNotNullParameter(currentMicVolume, "currentMicVolume");
        Intrinsics.checkNotNullParameter(outputVolume, "outputVolume");
        Intrinsics.checkNotNullParameter(cameraStatus, "cameraStatus");
        Intrinsics.checkNotNullParameter(cameraLastError, "cameraLastError");
        Intrinsics.checkNotNullParameter(isFrontCamera, "isFrontCamera");
        Intrinsics.checkNotNullParameter(localMirrorType, "localMirrorType");
        Intrinsics.checkNotNullParameter(localVideoQuality, "localVideoQuality");
        Intrinsics.checkNotNullParameter(currentAudioRoute, "currentAudioRoute");
        Intrinsics.checkNotNullParameter(screenStatus, "screenStatus");
        Intrinsics.checkNotNullParameter(networkInfo, "networkInfo");
        this.microphoneStatus = microphoneStatus;
        this.microphoneLastError = microphoneLastError;
        this.captureVolume = captureVolume;
        this.currentMicVolume = currentMicVolume;
        this.outputVolume = outputVolume;
        this.cameraStatus = cameraStatus;
        this.cameraLastError = cameraLastError;
        this.isFrontCamera = isFrontCamera;
        this.localMirrorType = localMirrorType;
        this.localVideoQuality = localVideoQuality;
        this.currentAudioRoute = currentAudioRoute;
        this.screenStatus = screenStatus;
        this.networkInfo = networkInfo;
    }

    @NotNull
    public final InterfaceC41678w<DeviceStatus> component1() {
        return this.microphoneStatus;
    }

    @NotNull
    public final InterfaceC41678w<VideoQuality> component10() {
        return this.localVideoQuality;
    }

    @NotNull
    public final InterfaceC41678w<AudioRoute> component11() {
        return this.currentAudioRoute;
    }

    @NotNull
    public final InterfaceC41678w<DeviceStatus> component12() {
        return this.screenStatus;
    }

    @NotNull
    public final InterfaceC41678w<NetworkInfo> component13() {
        return this.networkInfo;
    }

    @NotNull
    public final InterfaceC41678w<DeviceError> component2() {
        return this.microphoneLastError;
    }

    @NotNull
    public final InterfaceC41678w<Integer> component3() {
        return this.captureVolume;
    }

    @NotNull
    public final InterfaceC41678w<Integer> component4() {
        return this.currentMicVolume;
    }

    @NotNull
    public final InterfaceC41678w<Integer> component5() {
        return this.outputVolume;
    }

    @NotNull
    public final InterfaceC41678w<DeviceStatus> component6() {
        return this.cameraStatus;
    }

    @NotNull
    public final InterfaceC41678w<DeviceError> component7() {
        return this.cameraLastError;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> component8() {
        return this.isFrontCamera;
    }

    @NotNull
    public final InterfaceC41678w<MirrorType> component9() {
        return this.localMirrorType;
    }

    @NotNull
    public final DeviceState copy(@NotNull InterfaceC41678w<? extends DeviceStatus> microphoneStatus, @NotNull InterfaceC41678w<? extends DeviceError> microphoneLastError, @NotNull InterfaceC41678w<Integer> captureVolume, @NotNull InterfaceC41678w<Integer> currentMicVolume, @NotNull InterfaceC41678w<Integer> outputVolume, @NotNull InterfaceC41678w<? extends DeviceStatus> cameraStatus, @NotNull InterfaceC41678w<? extends DeviceError> cameraLastError, @NotNull InterfaceC41678w<Boolean> isFrontCamera, @NotNull InterfaceC41678w<? extends MirrorType> localMirrorType, @NotNull InterfaceC41678w<? extends VideoQuality> localVideoQuality, @NotNull InterfaceC41678w<? extends AudioRoute> currentAudioRoute, @NotNull InterfaceC41678w<? extends DeviceStatus> screenStatus, @NotNull InterfaceC41678w<NetworkInfo> networkInfo) {
        Intrinsics.checkNotNullParameter(microphoneStatus, "microphoneStatus");
        Intrinsics.checkNotNullParameter(microphoneLastError, "microphoneLastError");
        Intrinsics.checkNotNullParameter(captureVolume, "captureVolume");
        Intrinsics.checkNotNullParameter(currentMicVolume, "currentMicVolume");
        Intrinsics.checkNotNullParameter(outputVolume, "outputVolume");
        Intrinsics.checkNotNullParameter(cameraStatus, "cameraStatus");
        Intrinsics.checkNotNullParameter(cameraLastError, "cameraLastError");
        Intrinsics.checkNotNullParameter(isFrontCamera, "isFrontCamera");
        Intrinsics.checkNotNullParameter(localMirrorType, "localMirrorType");
        Intrinsics.checkNotNullParameter(localVideoQuality, "localVideoQuality");
        Intrinsics.checkNotNullParameter(currentAudioRoute, "currentAudioRoute");
        Intrinsics.checkNotNullParameter(screenStatus, "screenStatus");
        Intrinsics.checkNotNullParameter(networkInfo, "networkInfo");
        return new DeviceState(microphoneStatus, microphoneLastError, captureVolume, currentMicVolume, outputVolume, cameraStatus, cameraLastError, isFrontCamera, localMirrorType, localVideoQuality, currentAudioRoute, screenStatus, networkInfo);
    }

    @NotNull
    public final InterfaceC41678w<DeviceError> getCameraLastError() {
        return this.cameraLastError;
    }

    @NotNull
    public final InterfaceC41678w<DeviceStatus> getCameraStatus() {
        return this.cameraStatus;
    }

    @NotNull
    public final InterfaceC41678w<Integer> getCaptureVolume() {
        return this.captureVolume;
    }

    @NotNull
    public final InterfaceC41678w<AudioRoute> getCurrentAudioRoute() {
        return this.currentAudioRoute;
    }

    @NotNull
    public final InterfaceC41678w<Integer> getCurrentMicVolume() {
        return this.currentMicVolume;
    }

    @NotNull
    public final InterfaceC41678w<MirrorType> getLocalMirrorType() {
        return this.localMirrorType;
    }

    @NotNull
    public final InterfaceC41678w<VideoQuality> getLocalVideoQuality() {
        return this.localVideoQuality;
    }

    @NotNull
    public final InterfaceC41678w<DeviceError> getMicrophoneLastError() {
        return this.microphoneLastError;
    }

    @NotNull
    public final InterfaceC41678w<DeviceStatus> getMicrophoneStatus() {
        return this.microphoneStatus;
    }

    @NotNull
    public final InterfaceC41678w<NetworkInfo> getNetworkInfo() {
        return this.networkInfo;
    }

    @NotNull
    public final InterfaceC41678w<Integer> getOutputVolume() {
        return this.outputVolume;
    }

    @NotNull
    public final InterfaceC41678w<DeviceStatus> getScreenStatus() {
        return this.screenStatus;
    }

    public int hashCode() {
        return this.networkInfo.hashCode() + AbstractC39397b.m88226a(this.screenStatus, AbstractC39397b.m88226a(this.currentAudioRoute, AbstractC39397b.m88226a(this.localVideoQuality, AbstractC39397b.m88226a(this.localMirrorType, AbstractC39397b.m88226a(this.isFrontCamera, AbstractC39397b.m88226a(this.cameraLastError, AbstractC39397b.m88226a(this.cameraStatus, AbstractC39397b.m88226a(this.outputVolume, AbstractC39397b.m88226a(this.currentMicVolume, AbstractC39397b.m88226a(this.captureVolume, AbstractC39397b.m88226a(this.microphoneLastError, this.microphoneStatus.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public final InterfaceC41678w<Boolean> isFrontCamera() {
        return this.isFrontCamera;
    }

    @NotNull
    public String toString() {
        return "DeviceState(microphoneStatus=" + this.microphoneStatus + ", microphoneLastError=" + this.microphoneLastError + ", captureVolume=" + this.captureVolume + ", currentMicVolume=" + this.currentMicVolume + ", outputVolume=" + this.outputVolume + ", cameraStatus=" + this.cameraStatus + ", cameraLastError=" + this.cameraLastError + ", isFrontCamera=" + this.isFrontCamera + ", localMirrorType=" + this.localMirrorType + ", localVideoQuality=" + this.localVideoQuality + ", currentAudioRoute=" + this.currentAudioRoute + ", screenStatus=" + this.screenStatus + ", networkInfo=" + this.networkInfo + ')';
    }
}
