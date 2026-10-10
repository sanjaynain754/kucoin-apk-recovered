package com.otaliastudios.transcoder.internal.audio.remix;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.nio.ShortBuffer;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.Intrinsics;
import s90.C44367a;
import s90.C44368b;
import s90.C44369c;

/* JADX INFO: compiled from: AudioRemixer.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b`\u0018\u0000 \n2\u00020\u0001:\u0001\fJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/audio/remix/AudioRemixer;", "", "Ljava/nio/ShortBuffer;", "inputBuffer", "outputBuffer", "", "b", "(Ljava/nio/ShortBuffer;Ljava/nio/ShortBuffer;)V", "", "inputSize", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(I)I", "Companion", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public interface AudioRemixer {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f55653a;

    /* JADX INFO: compiled from: AudioRemixer.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0080\u0002¢\u0006\u0002\b\b¨\u0006\t"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/audio/remix/AudioRemixer$Companion;", "", "()V", "get", "Lcom/otaliastudios/transcoder/internal/audio/remix/AudioRemixer;", "inputChannels", "", "outputChannels", "get$lib_release", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f55653a = new Companion();

        @NotNull
        public final AudioRemixer get$lib_release(int inputChannels, int outputChannels) {
            if (!SetsKt.setOf((Object[]) new Integer[]{1, 2}).contains(Integer.valueOf(inputChannels))) {
                throw new IllegalStateException(Intrinsics.stringPlus("Input channel count not supported: ", Integer.valueOf(inputChannels)).toString());
            }
            if (!SetsKt.setOf((Object[]) new Integer[]{1, 2}).contains(Integer.valueOf(outputChannels))) {
                throw new IllegalStateException(Intrinsics.stringPlus("Input channel count not supported: ", Integer.valueOf(inputChannels)).toString());
            }
            if (inputChannels < outputChannels) {
                return new C44369c();
            }
            return inputChannels > outputChannels ? new C44367a() : new C44368b();
        }
    }

    /* JADX INFO: renamed from: a */
    int mo67944a(int inputSize);

    /* JADX INFO: renamed from: b */
    void mo67945b(@NotNull ShortBuffer inputBuffer, @NotNull ShortBuffer outputBuffer);
}
