package com.facebook.animated.gif;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;
import com.facebook.soloader.nativeloader.NativeLoader;
import java.nio.ByteBuffer;
import p448m5.InterfaceC42427b;
import p463n5.InterfaceC42753c;
import p585r5.C43928c;
import p712w3.C45708h;
import p712w3.InterfaceC45704d;

/* JADX INFO: loaded from: classes34.dex */
@InterfaceC45704d
public class GifImage implements InterfaceC42427b, InterfaceC42753c {

    /* JADX INFO: renamed from: b */
    public static volatile boolean f7641b;

    /* JADX INFO: renamed from: a */
    public Bitmap.Config f7642a = null;

    @InterfaceC45704d
    private long mNativeContext;

    @InterfaceC45704d
    public GifImage() {
    }

    @InterfaceC45704d
    private static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer, int i11, boolean z11);

    @InterfaceC45704d
    private static native GifImage nativeCreateFromFileDescriptor(int i11, int i12, boolean z11);

    @InterfaceC45704d
    private static native GifImage nativeCreateFromNativeMemory(long j11, int i11, int i12, boolean z11);

    @InterfaceC45704d
    private native void nativeDispose();

    @InterfaceC45704d
    private native void nativeFinalize();

    @InterfaceC45704d
    private native int nativeGetDuration();

    @InterfaceC45704d
    private native GifFrame nativeGetFrame(int i11);

    @InterfaceC45704d
    private native int nativeGetFrameCount();

    @InterfaceC45704d
    private native int[] nativeGetFrameDurations();

    @InterfaceC45704d
    private native int nativeGetHeight();

    @InterfaceC45704d
    private native int nativeGetLoopCount();

    @InterfaceC45704d
    private native int nativeGetSizeInBytes();

    @InterfaceC45704d
    private native int nativeGetWidth();

    @InterfaceC45704d
    private native boolean nativeIsAnimated();

    @Override // p448m5.InterfaceC42427b
    /* JADX INFO: renamed from: d */
    public boolean mo7827d() {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static synchronized void m7822l() {
        if (!f7641b) {
            f7641b = true;
            NativeLoader.loadLibrary("gifimage");
        }
    }

    /* JADX INFO: renamed from: m */
    public static AnimatedDrawableFrameInfo.DisposalMethod m7823m(int i11) {
        if (i11 == 0) {
            return AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_DO_NOT;
        }
        if (i11 == 1) {
            return AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_DO_NOT;
        }
        if (i11 == 2) {
            return AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND;
        }
        return i11 == 3 ? AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_PREVIOUS : AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_DO_NOT;
    }

    @Override // p448m5.InterfaceC42427b
    /* JADX INFO: renamed from: g */
    public Bitmap.Config mo7830g() {
        return this.f7642a;
    }

    @InterfaceC45704d
    public GifImage(long j11) {
        this.mNativeContext = j11;
    }

    /* JADX INFO: renamed from: j */
    public static GifImage m7820j(ByteBuffer byteBuffer, C43928c c43928c) {
        m7822l();
        byteBuffer.rewind();
        GifImage gifImageNativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer, c43928c.f97120b, c43928c.f97125g);
        gifImageNativeCreateFromDirectByteBuffer.f7642a = c43928c.f97127i;
        return gifImageNativeCreateFromDirectByteBuffer;
    }

    /* JADX INFO: renamed from: k */
    public static GifImage m7821k(long j11, int i11, C43928c c43928c) {
        boolean z11;
        m7822l();
        if (j11 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        C45708h.m100891b(Boolean.valueOf(z11));
        GifImage gifImageNativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j11, i11, c43928c.f97120b, c43928c.f97125g);
        gifImageNativeCreateFromNativeMemory.f7642a = c43928c.f97127i;
        return gifImageNativeCreateFromNativeMemory;
    }

    @Override // p448m5.InterfaceC42427b
    /* JADX INFO: renamed from: a */
    public int mo7824a() {
        return nativeGetFrameCount();
    }

    @Override // p448m5.InterfaceC42427b
    /* JADX INFO: renamed from: b */
    public int mo7825b() {
        int iNativeGetLoopCount = nativeGetLoopCount();
        if (iNativeGetLoopCount == -1) {
            return 1;
        }
        if (iNativeGetLoopCount != 0) {
            return iNativeGetLoopCount + 1;
        }
        return 0;
    }

    @Override // p448m5.InterfaceC42427b
    /* JADX INFO: renamed from: c */
    public AnimatedDrawableFrameInfo mo7826c(int i11) {
        GifFrame gifFrameMo7828e = mo7828e(i11);
        try {
            return new AnimatedDrawableFrameInfo(i11, gifFrameMo7828e.mo7816a(), gifFrameMo7828e.mo7817b(), gifFrameMo7828e.getWidth(), gifFrameMo7828e.getHeight(), AnimatedDrawableFrameInfo.BlendOperation.BLEND_WITH_PREVIOUS, m7823m(gifFrameMo7828e.m7819d()));
        } finally {
            gifFrameMo7828e.dispose();
        }
    }

    @Override // p463n5.InterfaceC42753c
    /* JADX INFO: renamed from: f */
    public InterfaceC42427b mo7829f(long j11, int i11, C43928c c43928c) {
        return m7821k(j11, i11, c43928c);
    }

    public void finalize() {
        nativeFinalize();
    }

    @Override // p448m5.InterfaceC42427b
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // p448m5.InterfaceC42427b
    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    @Override // p448m5.InterfaceC42427b
    public int getWidth() {
        return nativeGetWidth();
    }

    @Override // p448m5.InterfaceC42427b
    /* JADX INFO: renamed from: h */
    public int[] mo7831h() {
        return nativeGetFrameDurations();
    }

    @Override // p463n5.InterfaceC42753c
    /* JADX INFO: renamed from: i */
    public InterfaceC42427b mo7832i(ByteBuffer byteBuffer, C43928c c43928c) {
        return m7820j(byteBuffer, c43928c);
    }

    @Override // p448m5.InterfaceC42427b
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public GifFrame mo7828e(int i11) {
        return nativeGetFrame(i11);
    }
}
