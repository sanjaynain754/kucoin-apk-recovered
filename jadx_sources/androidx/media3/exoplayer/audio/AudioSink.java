package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.PlayerId;
import com.tencent.bugly.proguard.C33627eb;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public interface AudioSink {
    public static final long CURRENT_POSITION_NOT_SET = Long.MIN_VALUE;
    public static final int OFFLOAD_MODE_DISABLED = 0;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_NOT_REQUIRED = 2;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_REQUIRED = 1;
    public static final int SINK_FORMAT_SUPPORTED_DIRECTLY = 2;
    public static final int SINK_FORMAT_SUPPORTED_WITH_TRANSCODING = 1;
    public static final int SINK_FORMAT_UNSUPPORTED = 0;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface OffloadMode {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SinkFormatSupport {
    }

    public static final class UnexpectedDiscontinuityException extends Exception {
        public final long actualPresentationTimeUs;
        public final long expectedPresentationTimeUs;

        public UnexpectedDiscontinuityException(long j11, long j12) {
            super("Unexpected audio track timestamp discontinuity: expected " + j12 + ", got " + j11);
            this.actualPresentationTimeUs = j11;
            this.expectedPresentationTimeUs = j12;
        }
    }

    public static final class WriteException extends Exception {
        public final int errorCode;
        public final Format format;
        public final boolean isRecoverable;

        public WriteException(int i11, Format format, boolean z11) {
            super("AudioTrack write failed: " + i11);
            this.isRecoverable = z11;
            this.errorCode = i11;
            this.format = format;
        }
    }

    void configure(Format format, int i11, @Nullable int[] iArr) throws ConfigurationException;

    void disableTunneling();

    void enableTunnelingV21();

    void flush();

    @Nullable
    AudioAttributes getAudioAttributes();

    long getCurrentPositionUs(boolean z11);

    int getFormatSupport(Format format);

    PlaybackParameters getPlaybackParameters();

    boolean getSkipSilenceEnabled();

    boolean handleBuffer(ByteBuffer byteBuffer, long j11, int i11) throws WriteException, InitializationException;

    void handleDiscontinuity();

    boolean hasPendingData();

    boolean isEnded();

    void pause();

    void play();

    void playToEndOfStream() throws WriteException;

    void reset();

    void setAudioAttributes(AudioAttributes audioAttributes);

    void setAudioSessionId(int i11);

    void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

    void setListener(Listener listener);

    void setPlaybackParameters(PlaybackParameters playbackParameters);

    void setSkipSilenceEnabled(boolean z11);

    void setVolume(float f11);

    boolean supportsFormat(Format format);

    public static final class AudioTrackConfig {
        public final int bufferSize;
        public final int channelConfig;
        public final int encoding;
        public final boolean offload;
        public final int sampleRate;
        public final boolean tunneling;

        public AudioTrackConfig(int i11, int i12, int i13, boolean z11, boolean z12, int i14) {
            this.encoding = i11;
            this.sampleRate = i12;
            this.channelConfig = i13;
            this.tunneling = z11;
            this.offload = z12;
            this.bufferSize = i14;
        }
    }

    public static final class ConfigurationException extends Exception {
        public final Format format;

        public ConfigurationException(Throwable th2, Format format) {
            super(th2);
            this.format = format;
        }

        public ConfigurationException(String str, Format format) {
            super(str);
            this.format = format;
        }
    }

    default AudioOffloadSupport getFormatOffloadSupport(Format format) {
        return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
    }

    public static final class InitializationException extends Exception {
        public final int audioTrackState;
        public final Format format;
        public final boolean isRecoverable;

        public InitializationException(String str, int i11, Format format, boolean z11, @Nullable Throwable th2) {
            super(str, th2);
            this.audioTrackState = i11;
            this.isRecoverable = z11;
            this.format = format;
        }

        public InitializationException(int i11, int i12, int i13, int i14, Format format, boolean z11, @Nullable Exception exc) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AudioTrack init failed ");
            sb2.append(i11);
            sb2.append(C33627eb.f69716f);
            sb2.append("Config(");
            sb2.append(i12);
            sb2.append(", ");
            sb2.append(i13);
            sb2.append(", ");
            sb2.append(i14);
            sb2.append(")");
            sb2.append(C33627eb.f69716f);
            sb2.append(format);
            sb2.append(z11 ? " (recoverable)" : "");
            this(sb2.toString(), i11, format, z11, exc);
        }
    }

    public interface Listener {
        void onPositionDiscontinuity();

        void onSkipSilenceEnabledChanged(boolean z11);

        void onUnderrun(int i11, long j11, long j12);

        default void onAudioCapabilitiesChanged() {
        }

        default void onOffloadBufferEmptying() {
        }

        default void onOffloadBufferFull() {
        }

        default void onSilenceSkipped() {
        }

        default void onAudioSinkError(Exception exc) {
        }

        default void onAudioTrackInitialized(AudioTrackConfig audioTrackConfig) {
        }

        default void onAudioTrackReleased(AudioTrackConfig audioTrackConfig) {
        }

        default void onPositionAdvancing(long j11) {
        }
    }

    default void release() {
    }

    default void setClock(Clock clock) {
    }

    @RequiresApi(29)
    default void setOffloadMode(int i11) {
    }

    default void setOutputStreamOffsetUs(long j11) {
    }

    default void setPlayerId(@Nullable PlayerId playerId) {
    }

    @RequiresApi(23)
    default void setPreferredDevice(@Nullable AudioDeviceInfo audioDeviceInfo) {
    }

    @RequiresApi(29)
    default void setOffloadDelayPadding(int i11, int i12) {
    }
}
