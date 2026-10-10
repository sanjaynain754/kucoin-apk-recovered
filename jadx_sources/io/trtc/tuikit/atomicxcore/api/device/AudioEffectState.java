package io.trtc.tuikit.atomicxcore.api.device;

import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39393c;
import io.trtc.tuikit.atomicxcore.api.call.AbstractC39397b;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJP\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\u000eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\b\u0010\u000eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001f\u0010\u000e¨\u0006 "}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectState;", "", "Lkotlinx/coroutines/flow/w;", "Lio/trtc/tuikit/atomicxcore/api/device/AudioChangerType;", "audioChangerType", "Lio/trtc/tuikit/atomicxcore/api/device/AudioReverbType;", "audioReverbType", "", "isEarMonitorOpened", "", "earMonitorVolume", "<init>", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)V", "component1", "()Lkotlinx/coroutines/flow/w;", "component2", "component3", "component4", "copy", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectState;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/flow/w;", "getAudioChangerType", "getAudioReverbType", "getEarMonitorVolume", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class AudioEffectState {

    @NotNull
    private final InterfaceC41678w<AudioChangerType> audioChangerType;

    @NotNull
    private final InterfaceC41678w<AudioReverbType> audioReverbType;

    @NotNull
    private final InterfaceC41678w<Integer> earMonitorVolume;

    @NotNull
    private final InterfaceC41678w<Boolean> isEarMonitorOpened;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioEffectState)) {
            return false;
        }
        AudioEffectState audioEffectState = (AudioEffectState) other;
        return Intrinsics.areEqual(this.audioChangerType, audioEffectState.audioChangerType) && Intrinsics.areEqual(this.audioReverbType, audioEffectState.audioReverbType) && Intrinsics.areEqual(this.isEarMonitorOpened, audioEffectState.isEarMonitorOpened) && Intrinsics.areEqual(this.earMonitorVolume, audioEffectState.earMonitorVolume);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioEffectState(@NotNull InterfaceC41678w<? extends AudioChangerType> audioChangerType, @NotNull InterfaceC41678w<? extends AudioReverbType> audioReverbType, @NotNull InterfaceC41678w<Boolean> isEarMonitorOpened, @NotNull InterfaceC41678w<Integer> earMonitorVolume) {
        Intrinsics.checkNotNullParameter(audioChangerType, "audioChangerType");
        Intrinsics.checkNotNullParameter(audioReverbType, "audioReverbType");
        Intrinsics.checkNotNullParameter(isEarMonitorOpened, "isEarMonitorOpened");
        Intrinsics.checkNotNullParameter(earMonitorVolume, "earMonitorVolume");
        this.audioChangerType = audioChangerType;
        this.audioReverbType = audioReverbType;
        this.isEarMonitorOpened = isEarMonitorOpened;
        this.earMonitorVolume = earMonitorVolume;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AudioEffectState copy$default(AudioEffectState audioEffectState, InterfaceC41678w interfaceC41678w, InterfaceC41678w interfaceC41678w2, InterfaceC41678w interfaceC41678w3, InterfaceC41678w interfaceC41678w4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC41678w = audioEffectState.audioChangerType;
        }
        if ((i11 & 2) != 0) {
            interfaceC41678w2 = audioEffectState.audioReverbType;
        }
        if ((i11 & 4) != 0) {
            interfaceC41678w3 = audioEffectState.isEarMonitorOpened;
        }
        if ((i11 & 8) != 0) {
            interfaceC41678w4 = audioEffectState.earMonitorVolume;
        }
        return audioEffectState.copy(interfaceC41678w, interfaceC41678w2, interfaceC41678w3, interfaceC41678w4);
    }

    @NotNull
    public final InterfaceC41678w<AudioChangerType> component1() {
        return this.audioChangerType;
    }

    @NotNull
    public final InterfaceC41678w<AudioReverbType> component2() {
        return this.audioReverbType;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> component3() {
        return this.isEarMonitorOpened;
    }

    @NotNull
    public final InterfaceC41678w<Integer> component4() {
        return this.earMonitorVolume;
    }

    @NotNull
    public final AudioEffectState copy(@NotNull InterfaceC41678w<? extends AudioChangerType> audioChangerType, @NotNull InterfaceC41678w<? extends AudioReverbType> audioReverbType, @NotNull InterfaceC41678w<Boolean> isEarMonitorOpened, @NotNull InterfaceC41678w<Integer> earMonitorVolume) {
        Intrinsics.checkNotNullParameter(audioChangerType, "audioChangerType");
        Intrinsics.checkNotNullParameter(audioReverbType, "audioReverbType");
        Intrinsics.checkNotNullParameter(isEarMonitorOpened, "isEarMonitorOpened");
        Intrinsics.checkNotNullParameter(earMonitorVolume, "earMonitorVolume");
        return new AudioEffectState(audioChangerType, audioReverbType, isEarMonitorOpened, earMonitorVolume);
    }

    @NotNull
    public final InterfaceC41678w<AudioChangerType> getAudioChangerType() {
        return this.audioChangerType;
    }

    @NotNull
    public final InterfaceC41678w<AudioReverbType> getAudioReverbType() {
        return this.audioReverbType;
    }

    @NotNull
    public final InterfaceC41678w<Integer> getEarMonitorVolume() {
        return this.earMonitorVolume;
    }

    public int hashCode() {
        return this.earMonitorVolume.hashCode() + AbstractC39397b.m88226a(this.isEarMonitorOpened, AbstractC39397b.m88226a(this.audioReverbType, this.audioChangerType.hashCode() * 31, 31), 31);
    }

    @NotNull
    public final InterfaceC41678w<Boolean> isEarMonitorOpened() {
        return this.isEarMonitorOpened;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioEffectState(audioChangerType=");
        sb2.append(this.audioChangerType);
        sb2.append(", audioReverbType=");
        sb2.append(this.audioReverbType);
        sb2.append(", isEarMonitorOpened=");
        sb2.append(this.isEarMonitorOpened);
        sb2.append(", earMonitorVolume=");
        return AbstractC39393c.m88222a(sb2, this.earMonitorVolume, ')');
    }
}
