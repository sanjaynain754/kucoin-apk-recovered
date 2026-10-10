package org.aomedia.avif.android;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes23.dex */
public class AvifDecoder {
    private boolean alphaPresent;
    private long decoder;
    private int depth;
    private int frameCount;
    private double[] frameDurations;
    private int height;
    private int repetitionCount;
    private int width;

    /* JADX INFO: loaded from: classes61.dex */
    public static class Info {
        public boolean alphaPresent;
        public int depth;
        public int height;
        public int width;
    }

    @Nullable
    public static AvifDecoder create(ByteBuffer byteBuffer) {
        return create(byteBuffer, 1);
    }

    private native long createDecoder(ByteBuffer byteBuffer, int i11, int i12);

    public static boolean decode(ByteBuffer byteBuffer, int i11, Bitmap bitmap) {
        return decode(byteBuffer, i11, bitmap, 0);
    }

    public static native boolean decode(ByteBuffer byteBuffer, int i11, Bitmap bitmap, int i12);

    private native void destroyDecoder(long j11);

    public static native boolean getInfo(ByteBuffer byteBuffer, int i11, Info info);

    public static boolean isAvifImage(ByteBuffer byteBuffer) {
        return isAvifImage(byteBuffer, byteBuffer.remaining());
    }

    private static native boolean isAvifImage(ByteBuffer byteBuffer, int i11);

    private native int nextFrame(long j11, Bitmap bitmap);

    private native int nextFrameIndex(long j11);

    private native int nthFrame(long j11, int i11, Bitmap bitmap);

    public static native String resultToString(int i11);

    public static native String versionString();

    public int nextFrame(Bitmap bitmap) {
        return nextFrame(this.decoder, bitmap);
    }

    public int nextFrameIndex() {
        return nextFrameIndex(this.decoder);
    }

    public int nthFrame(int i11, Bitmap bitmap) {
        return nthFrame(this.decoder, i11, bitmap);
    }

    static {
        try {
            System.loadLibrary("avif_android");
        } catch (UnsatisfiedLinkError e11) {
            e11.printStackTrace();
        }
    }

    @Nullable
    public static AvifDecoder create(ByteBuffer byteBuffer, int i11) {
        AvifDecoder avifDecoder = new AvifDecoder(byteBuffer, i11);
        if (avifDecoder.decoder == 0) {
            return null;
        }
        return avifDecoder;
    }

    public boolean getAlphaPresent() {
        return this.alphaPresent;
    }

    public int getDepth() {
        return this.depth;
    }

    public int getFrameCount() {
        return this.frameCount;
    }

    public double[] getFrameDurations() {
        return this.frameDurations;
    }

    public int getHeight() {
        return this.height;
    }

    public int getRepetitionCount() {
        return this.repetitionCount;
    }

    public int getWidth() {
        return this.width;
    }

    public void release() {
        long j11 = this.decoder;
        if (j11 != 0) {
            destroyDecoder(j11);
        }
        this.decoder = 0L;
    }

    private AvifDecoder(ByteBuffer byteBuffer, int i11) {
        this.decoder = createDecoder(byteBuffer, byteBuffer.remaining(), i11);
    }
}
