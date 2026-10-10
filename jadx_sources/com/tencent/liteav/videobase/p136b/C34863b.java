package com.tencent.liteav.videobase.p136b;

import android.opengl.GLES20;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.frame.C34886e;
import com.tencent.liteav.videobase.p135a.C34861a;
import com.tencent.liteav.videobase.utils.PerspectiveTransformMatrixCalculator;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.filter.TXCGPUImagePerspectiveCorrectionFilter;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.liteav.videobase.b.b */
/* JADX INFO: loaded from: classes59.dex */
public final class C34863b extends C34861a {

    /* JADX INFO: renamed from: h */
    private int f74115h;

    /* JADX INFO: renamed from: i */
    private float[] f74116i;

    @Override // com.tencent.liteav.videobase.p135a.C34861a
    /* JADX INFO: renamed from: a */
    public final void mo76470a(int i11) {
        super.mo76470a(i11);
        float[] fArr = this.f74116i;
        if (fArr == null) {
            fArr = GLConstants.f74123a;
        }
        GLES20.glUniformMatrix3fv(this.f74115h, 1, false, fArr, 0);
    }

    public C34863b() {
        super(TXCGPUImageFilter.NO_FILTER_VERTEX_SHADER, TXCGPUImagePerspectiveCorrectionFilter.DISTORTION_CORRECTION_FILTER_FRAGMENT_SHADER);
    }

    @Override // com.tencent.liteav.videobase.p135a.C34861a
    /* JADX INFO: renamed from: b */
    public final void mo76476b(C34886e c34886e) {
        super.mo76476b(c34886e);
        this.f74115h = GLES20.glGetUniformLocation(this.f74108f, "matrix");
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m76478a(C34863b c34863b, List list, List list2) {
        float[] perspectiveTransformMatrix = PerspectiveTransformMatrixCalculator.getPerspectiveTransformMatrix(list, list2);
        float[] fArr = new float[9];
        for (int i11 = 0; i11 < 3; i11++) {
            for (int i12 = 0; i12 < 3; i12++) {
                fArr[(i12 * 3) + i11] = perspectiveTransformMatrix[(i11 * 3) + i12];
            }
        }
        c34863b.f74116i = fArr;
    }
}
