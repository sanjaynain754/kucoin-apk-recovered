package com.tencent.liteav.videoproducer.capture;

import com.tencent.liteav.base.util.C34744i;
import java.util.Locale;

/* JADX INFO: loaded from: classes59.dex */
public class CameraCaptureParams extends CaptureSourceInterface.CaptureParams {

    /* JADX INFO: renamed from: a */
    public Boolean f74594a = null;

    @Override // com.tencent.liteav.videoproducer.capture.CaptureSourceInterface.CaptureParams
    public boolean equals(Object obj) {
        if (!(obj instanceof CameraCaptureParams)) {
            return false;
        }
        CameraCaptureParams cameraCaptureParams = (CameraCaptureParams) obj;
        return super.equals(cameraCaptureParams) && C34744i.m76117a(this.f74594a, cameraCaptureParams.f74594a);
    }

    @Override // com.tencent.liteav.videoproducer.capture.CaptureSourceInterface.CaptureParams
    public String toString() {
        return String.format(Locale.ENGLISH, "%s, frontCamera: %b", super.toString(), this.f74594a);
    }
}
