package com.tencent.ugc;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.videobase.frame.PixelFrame;

/* JADX INFO: loaded from: classes2.dex */
@JNINamespace("liteav::ugc")
public class UGCFrameRateFilter {
    private final String TAG;
    private final long mNativeHandler;

    public static class Result {

        /* JADX INFO: renamed from: a */
        boolean f76692a;

        /* JADX INFO: renamed from: b */
        long f76693b;
    }

    private static native long nativeCreate(int i11);

    private static native void nativeDestroy(long j11);

    private static native Object nativeFilterFrame(long j11, long j12);

    private static Result createFilterFrameResult(boolean z11, long j11) {
        Result result = new Result();
        result.f76692a = z11;
        result.f76693b = j11;
        return result;
    }

    public void finalize() throws Throwable {
        nativeDestroy(this.mNativeHandler);
    }

    public boolean isFilterOutFrame(PixelFrame pixelFrame) {
        if (pixelFrame == null) {
            return true;
        }
        long j11 = this.mNativeHandler;
        if (j11 == 0) {
            return false;
        }
        Result result = (Result) nativeFilterFrame(j11, pixelFrame.getTimestamp());
        pixelFrame.setTimestamp(result.f76693b);
        return result.f76692a;
    }

    public UGCFrameRateFilter(int i11) {
        String str = "UGCFrameRateFilter_" + hashCode();
        this.TAG = str;
        LiteavLog.m76087i(str, "set frame rate. frame rate is ".concat(String.valueOf(i11)));
        this.mNativeHandler = nativeCreate(i11);
    }
}
