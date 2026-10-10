package androidx.camera.video.internal.audio;

import com.google.auto.value.AutoValue;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
public interface AudioStream {

    public static class AudioStreamException extends Exception {
        public AudioStreamException() {
        }

        public AudioStreamException(String str) {
            super(str);
        }

        public AudioStreamException(String str, Throwable th2) {
            super(str, th2);
        }

        public AudioStreamException(Throwable th2) {
            super(th2);
        }
    }

    @AutoValue
    public static abstract class PacketInfo {
        public abstract int getSizeInBytes();

        public abstract long getTimestampNs();

        /* JADX INFO: renamed from: of */
        public static PacketInfo m2171of(int i11, long j11) {
            return new AutoValue_AudioStream_PacketInfo(i11, j11);
        }
    }

    PacketInfo read(ByteBuffer byteBuffer);

    void release();

    void setCallback(AudioStreamCallback audioStreamCallback, Executor executor);

    void start() throws IllegalStateException, AudioStreamException;

    void stop() throws IllegalStateException;

    public interface AudioStreamCallback {
        default void onSilenceStateChanged(boolean z11) {
        }
    }
}
