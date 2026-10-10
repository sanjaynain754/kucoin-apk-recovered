package androidx.media3.decoder;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public class DecoderInputBuffer extends Buffer {
    public static final int BUFFER_REPLACEMENT_MODE_DIRECT = 2;
    public static final int BUFFER_REPLACEMENT_MODE_DISABLED = 0;
    public static final int BUFFER_REPLACEMENT_MODE_NORMAL = 1;
    private final int bufferReplacementMode;
    public final CryptoInfo cryptoInfo;

    @Nullable
    public ByteBuffer data;

    @Nullable
    public Format format;
    private final int paddingSize;

    @Nullable
    public ByteBuffer supplementalData;
    public long timeUs;
    public boolean waitingForKeys;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface BufferReplacementMode {
    }

    public static final class InsufficientCapacityException extends IllegalStateException {
        public final int currentCapacity;
        public final int requiredCapacity;

        public InsufficientCapacityException(int i11, int i12) {
            super("Buffer too small (" + i11 + " < " + i12 + ")");
            this.currentCapacity = i11;
            this.requiredCapacity = i12;
        }
    }

    public DecoderInputBuffer(int i11) {
        this(i11, 0);
    }

    static {
        MediaLibraryInfo.registerModule("media3.decoder");
    }

    public DecoderInputBuffer(int i11, int i12) {
        this.cryptoInfo = new CryptoInfo();
        this.bufferReplacementMode = i11;
        this.paddingSize = i12;
    }

    private ByteBuffer createReplacementByteBuffer(int i11) {
        int i12 = this.bufferReplacementMode;
        if (i12 == 1) {
            return ByteBuffer.allocate(i11);
        }
        if (i12 == 2) {
            return ByteBuffer.allocateDirect(i11);
        }
        ByteBuffer byteBuffer = this.data;
        throw new InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i11);
    }

    public static DecoderInputBuffer newNoDataInstance() {
        return new DecoderInputBuffer(0);
    }

    public void ensureSpaceForWrite(int i11) {
        int i12 = i11 + this.paddingSize;
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null) {
            this.data = createReplacementByteBuffer(i12);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i13 = i12 + iPosition;
        if (iCapacity >= i13) {
            this.data = byteBuffer;
            return;
        }
        ByteBuffer byteBufferCreateReplacementByteBuffer = createReplacementByteBuffer(i13);
        byteBufferCreateReplacementByteBuffer.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferCreateReplacementByteBuffer.put(byteBuffer);
        }
        this.data = byteBufferCreateReplacementByteBuffer;
    }

    public final void flip() {
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.supplementalData;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean isEncrypted() {
        return getFlag(1073741824);
    }

    public void resetSupplementalData(int i11) {
        ByteBuffer byteBuffer = this.supplementalData;
        if (byteBuffer == null || byteBuffer.capacity() < i11) {
            this.supplementalData = ByteBuffer.allocate(i11);
        } else {
            this.supplementalData.clear();
        }
    }

    @Override // androidx.media3.decoder.Buffer
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.supplementalData;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.waitingForKeys = false;
    }
}
