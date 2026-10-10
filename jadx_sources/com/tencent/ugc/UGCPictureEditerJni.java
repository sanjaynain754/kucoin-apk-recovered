package com.tencent.ugc;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@JNINamespace("liteav::ugc")
public class UGCPictureEditerJni extends TXPictureEditer {
    private static final String TAG = "UGCPictureEditerJni";
    private long mNativeHandler;

    private static native long nativeCreatePictureEditer(UGCPictureEditerJni uGCPictureEditerJni);

    private static native void nativeDestroy(long j11);

    private static native void nativeProcessPicture(long j11, Object obj);

    private static native void nativeSetCropRect(long j11, int i11, int i12, int i13, int i14);

    private static native void nativeSetOutputFillMode(long j11, int i11);

    private static native void nativeSetOutputRotation(long j11, int i11);

    private static native void nativeSetOutputSize(long j11, int i11, int i12);

    private static native void nativeSetPasterList(long j11, Object[] objArr, float[] fArr, float[] fArr2, float[] fArr3);

    private static native void nativeSetSourcePicture(long j11, Object obj);

    private void onProcessPicture(Object obj, Object obj2) {
        if (obj instanceof TXPictureEditer.PictureProcessListener) {
            LiteavLog.m76087i(TAG, "process picture callback.");
            ((TXPictureEditer.PictureProcessListener) obj).onPictureProcessed((Bitmap) obj2);
        }
    }

    public void destroy() {
        long j11 = this.mNativeHandler;
        if (j11 != 0) {
            nativeDestroy(j11);
        }
        this.mNativeHandler = 0L;
    }

    public void finalize() throws Throwable {
        long j11 = this.mNativeHandler;
        if (j11 != 0) {
            nativeDestroy(j11);
        }
    }

    @Override // com.tencent.ugc.TXPictureEditer
    public void setCropRect(Rect rect) {
        long j11 = this.mNativeHandler;
        if (j11 != 0) {
            nativeSetCropRect(j11, rect.left, rect.top, rect.width(), rect.height());
        }
    }

    @Override // com.tencent.ugc.TXPictureEditer
    public void setOutputFillMode(int i11) {
        long j11 = this.mNativeHandler;
        if (j11 != 0) {
            GLConstants.GLScaleType gLScaleType = GLConstants.GLScaleType.CENTER_CROP;
            if (i11 == 2) {
                gLScaleType = GLConstants.GLScaleType.FIT_CENTER;
            }
            nativeSetOutputFillMode(j11, gLScaleType.mValue);
        }
    }

    @Override // com.tencent.ugc.TXPictureEditer
    public void setOutputRotation(int i11) {
        long j11 = this.mNativeHandler;
        if (j11 != 0) {
            nativeSetOutputRotation(j11, i11);
        }
    }

    @Override // com.tencent.ugc.TXPictureEditer
    public void setOutputSize(int i11, int i12) {
        long j11 = this.mNativeHandler;
        if (j11 != 0) {
            nativeSetOutputSize(j11, i11, i12);
        }
    }

    @Override // com.tencent.ugc.TXPictureEditer
    public void setPasterList(List<TXVideoEditConstants.TXPaster> list) {
        if (this.mNativeHandler == 0) {
            return;
        }
        if (list == null || list.isEmpty()) {
            LiteavLog.m76087i(TAG, "set paster list. list is null");
            nativeSetPasterList(this.mNativeHandler, null, null, null, null);
            return;
        }
        int size = list.size();
        Bitmap[] bitmapArr = new Bitmap[size];
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        for (int i11 = 0; i11 < size; i11++) {
            TXVideoEditConstants.TXPaster tXPaster = list.get(i11);
            bitmapArr[i11] = tXPaster.pasterImage;
            TXVideoEditConstants.TXRect tXRect = tXPaster.frame;
            fArr[i11] = tXRect.f76678x;
            fArr2[i11] = tXRect.f76679y;
            fArr3[i11] = tXRect.width;
        }
        nativeSetPasterList(this.mNativeHandler, bitmapArr, fArr, fArr2, fArr3);
    }

    @Override // com.tencent.ugc.TXPictureEditer
    public void setPicture(Bitmap bitmap) {
        if (bitmap == null) {
            LiteavLog.m76083e(TAG, "set picture bitmap is null");
            return;
        }
        long j11 = this.mNativeHandler;
        if (j11 != 0) {
            nativeSetSourcePicture(j11, bitmap);
        }
    }

    public UGCPictureEditerJni(Context context) {
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix("liteav");
        this.mNativeHandler = nativeCreatePictureEditer(this);
    }

    @Override // com.tencent.ugc.TXPictureEditer
    public void processPicture(TXPictureEditer.PictureProcessListener pictureProcessListener) {
        if (!UGCLicenseChecker.isStandardFunctionSupport() && !UGCLicenseChecker.isIMPluginFunctionSupport()) {
            LiteavLog.m76083e(TAG, "processPicture is not supported in your license");
            return;
        }
        long j11 = this.mNativeHandler;
        if (j11 != 0) {
            nativeProcessPicture(j11, pictureProcessListener);
        }
    }
}
