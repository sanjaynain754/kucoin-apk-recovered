package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.RendererCapabilities;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class ExternallyLoadedImageDecoder implements ImageDecoder {
    private final BitmapResolver bitmapResolver;
    private final DecoderInputBuffer inputBuffer;
    private final ImageOutputBuffer outputBuffer;

    @Nullable
    private ListenableFuture<Bitmap> pendingDecode;
    private long pendingDecodeTimeUs;
    private boolean pendingEndOfStream;

    public interface BitmapResolver {
        ListenableFuture<Bitmap> resolve(ExternalImageRequest externalImageRequest);
    }

    public static final class Factory implements ImageDecoder.Factory {
        private final BitmapResolver bitmapResolver;

        @Override // androidx.media3.exoplayer.image.ImageDecoder.Factory
        public ExternallyLoadedImageDecoder createImageDecoder() {
            return new ExternallyLoadedImageDecoder(this.bitmapResolver);
        }

        @Override // androidx.media3.exoplayer.image.ImageDecoder.Factory
        public int supportsFormat(Format format) {
            int i11;
            if (Objects.equals(format.sampleMimeType, MimeTypes.APPLICATION_EXTERNALLY_LOADED_IMAGE)) {
                i11 = 4;
            } else {
                i11 = MimeTypes.isImage(format.sampleMimeType) ? 1 : 0;
            }
            return RendererCapabilities.create(i11);
        }

        public Factory(BitmapResolver bitmapResolver) {
            this.bitmapResolver = bitmapResolver;
        }
    }

    public static final class ExternalImageRequest {
        public final Uri uri;

        public ExternalImageRequest(Uri uri) {
            this.uri = uri;
        }
    }

    private ExternallyLoadedImageDecoder(BitmapResolver bitmapResolver) {
        this.bitmapResolver = bitmapResolver;
        this.inputBuffer = new DecoderInputBuffer(1);
        this.outputBuffer = new ImageOutputBuffer() { // from class: androidx.media3.exoplayer.image.ExternallyLoadedImageDecoder.1
            @Override // androidx.media3.decoder.DecoderOutputBuffer
            public void release() {
                clear();
            }
        };
    }

    private void resetState() {
        ListenableFuture<Bitmap> listenableFuture = this.pendingDecode;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
            this.pendingDecode = null;
        }
        this.pendingEndOfStream = false;
        this.outputBuffer.release();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.decoder.Decoder
    @Nullable
    public DecoderInputBuffer dequeueInputBuffer() {
        if (this.pendingDecode == null) {
            return this.inputBuffer;
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.exoplayer.image.ImageDecoder, androidx.media3.decoder.Decoder
    @Nullable
    public ImageOutputBuffer dequeueOutputBuffer() throws ImageDecoderException {
        if (this.pendingEndOfStream) {
            this.outputBuffer.addFlag(4);
            this.pendingEndOfStream = false;
            return this.outputBuffer;
        }
        ListenableFuture<Bitmap> listenableFuture = this.pendingDecode;
        if (listenableFuture != null) {
            try {
                if (listenableFuture.isDone()) {
                    try {
                        this.outputBuffer.bitmap = (Bitmap) Futures.getDone(this.pendingDecode);
                        ImageOutputBuffer imageOutputBuffer = this.outputBuffer;
                        imageOutputBuffer.timeUs = this.pendingDecodeTimeUs;
                        this.pendingDecode = null;
                        return imageOutputBuffer;
                    } catch (CancellationException e11) {
                        throw new ImageDecoderException(e11);
                    } catch (ExecutionException e12) {
                        throw new ImageDecoderException(e12.getCause());
                    }
                }
            } catch (Throwable th2) {
                this.pendingDecode = null;
                throw th2;
            }
        }
        return null;
    }

    @Override // androidx.media3.decoder.Decoder
    public String getName() {
        return "externallyLoadedImageDecoder";
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.exoplayer.image.ImageDecoder, androidx.media3.decoder.Decoder
    public void queueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        if (decoderInputBuffer.isEndOfStream()) {
            this.pendingEndOfStream = true;
            decoderInputBuffer.clear();
            return;
        }
        ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(decoderInputBuffer.data);
        Assertions.checkState(byteBuffer.hasArray());
        this.pendingDecode = this.bitmapResolver.resolve(new ExternalImageRequest(Uri.parse(new String(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.remaining(), StandardCharsets.UTF_8))));
        this.pendingDecodeTimeUs = decoderInputBuffer.timeUs;
        decoderInputBuffer.clear();
    }

    @Override // androidx.media3.decoder.Decoder
    public void flush() {
        resetState();
    }

    @Override // androidx.media3.decoder.Decoder
    public void release() {
        resetState();
    }

    @Override // androidx.media3.decoder.Decoder
    public void setOutputStartTimeUs(long j11) {
    }
}
