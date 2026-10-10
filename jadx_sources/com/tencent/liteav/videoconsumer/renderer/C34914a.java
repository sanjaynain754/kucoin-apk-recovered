package com.tencent.liteav.videoconsumer.renderer;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videobase.frame.C34886e;
import com.tencent.liteav.videobase.frame.C34890i;
import com.tencent.liteav.videobase.p136b.C34863b;
import com.tencent.liteav.videobase.p136b.RunnableC34864c;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.liteav.videoconsumer.renderer.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C34914a {

    /* JADX INFO: renamed from: a */
    final String f74460a = "PostProcessor_" + hashCode();

    /* JADX INFO: renamed from: b */
    final Size f74461b;

    /* JADX INFO: renamed from: c */
    final C34886e f74462c;

    /* JADX INFO: renamed from: d */
    C34863b f74463d;

    /* JADX INFO: renamed from: e */
    FloatBuffer f74464e;

    /* JADX INFO: renamed from: f */
    FloatBuffer f74465f;

    /* JADX INFO: renamed from: g */
    C34890i f74466g;

    /* JADX INFO: renamed from: h */
    Matrix f74467h;

    /* JADX INFO: renamed from: i */
    List<PointF> f74468i;

    /* JADX INFO: renamed from: j */
    List<PointF> f74469j;

    /* JADX INFO: renamed from: k */
    boolean f74470k;

    /* JADX INFO: renamed from: a */
    public final void m76591a(List<PointF> list, List<PointF> list2) {
        if (list == null || list.size() != 4 || list2 == null || list2.size() != 4 || !this.f74461b.isValid() || this.f74463d == null) {
            return;
        }
        List<PointF> listM76590a = m76590a(list);
        List<PointF> listM76590a2 = m76590a(list2);
        C34863b c34863b = this.f74463d;
        if (listM76590a.size() == 4 && listM76590a2.size() == 4) {
            c34863b.m76474a(RunnableC34864c.m76479a(c34863b, listM76590a2, listM76590a));
        }
    }

    public C34914a(C34886e c34886e, int i11, int i12) {
        Size size = new Size();
        this.f74461b = size;
        this.f74470k = false;
        this.f74462c = c34886e;
        size.set(i11, i12);
    }

    /* JADX INFO: renamed from: a */
    private List<PointF> m76590a(List<PointF> list) {
        ArrayList arrayList = new ArrayList();
        for (PointF pointF : list) {
            float f11 = pointF.x;
            Size size = this.f74461b;
            PointF pointFM76589a = m76589a(new PointF(f11 * size.width, pointF.y * size.height), this.f74467h);
            float f12 = pointFM76589a.x;
            Size size2 = this.f74461b;
            PointF pointF2 = new PointF(f12 / size2.width, pointFM76589a.y / size2.height);
            pointF2.y = 1.0f - pointF2.y;
            arrayList.add(pointF2);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private static PointF m76589a(PointF pointF, Matrix matrix) {
        if (matrix != null) {
            Matrix matrix2 = new Matrix();
            if (matrix.invert(matrix2)) {
                float[] fArr = new float[2];
                matrix2.mapPoints(fArr, new float[]{pointF.x, pointF.y});
                return new PointF(fArr[0], fArr[1]);
            }
        }
        return pointF;
    }
}
