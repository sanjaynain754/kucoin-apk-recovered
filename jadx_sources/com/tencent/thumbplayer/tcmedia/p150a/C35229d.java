package com.tencent.thumbplayer.tcmedia.p150a;

import android.graphics.Bitmap;
import android.util.Log;
import com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35231a;
import com.tencent.thumbplayer.tcmedia.api.TPCaptureCallBack;
import com.tencent.thumbplayer.tcmedia.core.common.TPGeneralError;
import com.tencent.thumbplayer.tcmedia.core.common.TPVideoFrame;
import com.tencent.thumbplayer.tcmedia.core.imagegenerator.ITPImageGeneratorCallback;
import com.tencent.thumbplayer.tcmedia.core.imagegenerator.TPImageGenerator;
import com.tencent.thumbplayer.tcmedia.core.imagegenerator.TPImageGeneratorParams;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.a.d */
/* JADX INFO: loaded from: classes62.dex */
public class C35229d implements InterfaceC35231a, ITPImageGeneratorCallback {

    /* JADX INFO: renamed from: a */
    private long f75509a;

    /* JADX INFO: renamed from: b */
    private TPImageGenerator f75510b;

    /* JADX INFO: renamed from: c */
    private Map<Long, TPCaptureCallBack> f75511c;

    public C35229d(int i11) {
        this(i11, 0L, 0L);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35231a
    /* JADX INFO: renamed from: a */
    public void mo77349a() {
        try {
            this.f75510b.cancelAllImageGenerations();
            this.f75510b.unInit();
        } catch (Exception e11) {
            TPLogUtil.m78797e("TPThumbPlayer[TPThumbCapture.java]", "release: " + Log.getStackTraceString(e11));
        }
        this.f75511c.clear();
        this.f75510b = null;
    }

    public C35229d(int i11, long j11, long j12) {
        this.f75509a = 0L;
        this.f75510b = new TPImageGenerator(i11, j11, j12, this);
        this.f75511c = new HashMap();
        try {
            this.f75510b.init();
        } catch (Exception e11) {
            TPLogUtil.m78797e("TPThumbPlayer[TPThumbCapture.java]", "init: " + Log.getStackTraceString(e11));
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35231a
    /* JADX INFO: renamed from: a */
    public void mo77350a(long j11, TPImageGeneratorParams tPImageGeneratorParams, TPCaptureCallBack tPCaptureCallBack) {
        if (tPImageGeneratorParams == null) {
            tPImageGeneratorParams = new TPImageGeneratorParams();
            tPImageGeneratorParams.format = 37;
        }
        TPImageGeneratorParams tPImageGeneratorParams2 = tPImageGeneratorParams;
        long j12 = this.f75509a + 1;
        this.f75509a = j12;
        this.f75511c.put(Long.valueOf(j12), tPCaptureCallBack);
        try {
            this.f75510b.generateImageAsyncAtTime(j11, this.f75509a, tPImageGeneratorParams2);
        } catch (Exception e11) {
            TPLogUtil.m78797e("TPThumbPlayer[TPThumbCapture.java]", "generateImageAsyncAtTime: " + Log.getStackTraceString(e11));
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.imagegenerator.ITPImageGeneratorCallback
    public void onImageGenerationCompleted(int i11, long j11, long j12, long j13, TPVideoFrame tPVideoFrame) {
        TPCaptureCallBack tPCaptureCallBack = this.f75511c.get(Long.valueOf(j13));
        if (tPCaptureCallBack != null) {
            if (i11 != 0 || tPVideoFrame == null) {
                tPCaptureCallBack.onCaptureVideoFailed(i11);
            } else {
                Bitmap bitmapM77324a = C35226a.m77324a(tPVideoFrame);
                if (bitmapM77324a != null) {
                    tPCaptureCallBack.onCaptureVideoSuccess(bitmapM77324a);
                } else {
                    i11 = TPGeneralError.FAILED;
                    tPCaptureCallBack.onCaptureVideoFailed(i11);
                }
            }
        }
        this.f75511c.remove(Long.valueOf(j13));
    }

    public C35229d(String str) {
        this.f75509a = 0L;
        this.f75510b = new TPImageGenerator(str, this);
        this.f75511c = new HashMap();
        try {
            this.f75510b.init();
        } catch (Exception e11) {
            TPLogUtil.m78797e("TPThumbPlayer[TPThumbCapture.java]", "init: " + Log.getStackTraceString(e11));
        }
    }
}
