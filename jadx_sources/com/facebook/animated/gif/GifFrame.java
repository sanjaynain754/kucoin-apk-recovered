package com.facebook.animated.gif;

import android.graphics.Bitmap;
import p448m5.InterfaceC42428c;
import p712w3.InterfaceC45704d;

/* JADX INFO: loaded from: classes34.dex */
public class GifFrame implements InterfaceC42428c {

    @InterfaceC45704d
    private long mNativeContext;

    @InterfaceC45704d
    private native void nativeDispose();

    @InterfaceC45704d
    private native void nativeFinalize();

    @InterfaceC45704d
    private native int nativeGetDisposalMode();

    @InterfaceC45704d
    private native int nativeGetDurationMs();

    @InterfaceC45704d
    private native int nativeGetHeight();

    @InterfaceC45704d
    private native int nativeGetTransparentPixelColor();

    @InterfaceC45704d
    private native int nativeGetWidth();

    @InterfaceC45704d
    private native int nativeGetXOffset();

    @InterfaceC45704d
    private native int nativeGetYOffset();

    @InterfaceC45704d
    private native boolean nativeHasTransparency();

    @InterfaceC45704d
    private native void nativeRenderFrame(int i11, int i12, Bitmap bitmap);

    @InterfaceC45704d
    public GifFrame(long j11) {
        this.mNativeContext = j11;
    }

    @Override // p448m5.InterfaceC42428c
    /* JADX INFO: renamed from: a */
    public int mo7816a() {
        return nativeGetXOffset();
    }

    @Override // p448m5.InterfaceC42428c
    /* JADX INFO: renamed from: b */
    public int mo7817b() {
        return nativeGetYOffset();
    }

    @Override // p448m5.InterfaceC42428c
    /* JADX INFO: renamed from: c */
    public void mo7818c(int i11, int i12, Bitmap bitmap) {
        nativeRenderFrame(i11, i12, bitmap);
    }

    /* JADX INFO: renamed from: d */
    public int m7819d() {
        return nativeGetDisposalMode();
    }

    @Override // p448m5.InterfaceC42428c
    public void dispose() {
        nativeDispose();
    }

    public void finalize() {
        nativeFinalize();
    }

    @Override // p448m5.InterfaceC42428c
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // p448m5.InterfaceC42428c
    public int getWidth() {
        return nativeGetWidth();
    }
}
