package com.tencent.liteav.videoproducer.capture;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import com.tencent.liteav.base.util.Size;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.liteav.videoproducer.capture.b */
/* JADX INFO: loaded from: classes59.dex */
public final class C34953b {

    /* JADX INFO: renamed from: d */
    private Size f74631d = null;

    /* JADX INFO: renamed from: a */
    public int f74628a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f74629b = false;

    /* JADX INFO: renamed from: c */
    private final LinkedList<FaceRect> f74630c = new LinkedList<>();

    /* JADX INFO: renamed from: a */
    public final void m76683a(int i11, int i12) {
        this.f74631d = new Size(i11, i12);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m76686b() {
        this.f74630c.clear();
    }

    /* JADX INFO: renamed from: a */
    public final void m76684a(List<Rect> list, float f11) {
        Size size;
        if (list.size() <= 0 || (size = this.f74631d) == null || size.width <= 0 || size.height <= 0) {
            return;
        }
        RectF rectF = new RectF(m76681a(list));
        Matrix matrix = new Matrix();
        matrix.setScale(1.0f, this.f74629b ? -1.0f : 1.0f);
        matrix.postRotate(this.f74628a);
        Size size2 = this.f74631d;
        matrix.postScale(size2.height / 2000.0f, size2.width / 2000.0f);
        matrix.postScale(f11, f11);
        Size size3 = this.f74631d;
        matrix.postTranslate(size3.height / 2.0f, size3.width / 2.0f);
        matrix.mapRect(rectF);
        synchronized (this) {
            this.f74630c.clear();
            this.f74630c.addLast(new FaceRect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.width()), Math.round(rectF.height())));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m76685a(List<Rect> list, Rect rect, Rect rect2) {
        Size size;
        int i11;
        int i12;
        if (list.size() <= 0 || (size = this.f74631d) == null || size.width <= 0 || size.height <= 0 || rect == null || rect.width() <= 0 || rect.height() <= 0 || rect2 == null || rect2.width() <= 0 || rect2.height() <= 0) {
            return;
        }
        Rect rectM76681a = m76681a(list);
        Size size2 = this.f74631d;
        int i13 = size2.width;
        int i14 = size2.height;
        float f11 = i13 > i14 ? i13 / i14 : i14 / i13;
        int iWidth = rect.width();
        int iHeight = rect.height();
        float f12 = iWidth;
        float f13 = iHeight;
        if (f11 > f12 / f13) {
            i12 = (int) (f12 / f11);
            i11 = iWidth;
        } else {
            i11 = (int) (f13 * f11);
            i12 = iHeight;
        }
        int iAbs = Math.abs(i11 - iWidth);
        int iAbs2 = Math.abs(i12 - iHeight);
        float fWidth = f12 / rect2.width();
        RectF rectF = new RectF((rectM76681a.left - rect2.left) * fWidth, (rectM76681a.top - rect2.top) * fWidth, rect.right - ((rect2.right - rectM76681a.right) * fWidth), rect.bottom - ((rect2.bottom - rectM76681a.bottom) * fWidth));
        Matrix matrix = new Matrix();
        matrix.postTranslate((-iAbs) / 2.0f, (-iAbs2) / 2.0f);
        matrix.postTranslate((-i11) / 2.0f, (-i12) / 2.0f);
        Size size3 = this.f74631d;
        matrix.postScale(size3.height / i12, size3.width / i11);
        matrix.postScale(1.0f, this.f74629b ? -1.0f : 1.0f);
        matrix.postRotate(this.f74628a);
        Size size4 = this.f74631d;
        matrix.postTranslate(size4.height / 2.0f, size4.width / 2.0f);
        Size size5 = this.f74631d;
        matrix.postScale(fWidth, fWidth, size5.height / 2.0f, size5.width / 2.0f);
        matrix.mapRect(rectF);
        synchronized (this) {
            this.f74630c.clear();
            this.f74630c.addLast(new FaceRect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.width()), Math.round(rectF.height())));
        }
    }

    /* JADX INFO: renamed from: a */
    private static Rect m76681a(List<Rect> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        Rect rect = list.get(0);
        for (Rect rect2 : list) {
            if (rect2.width() * rect2.height() > rect.width() * rect.height()) {
                rect = rect2;
            }
        }
        return rect;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized FaceRect m76682a() {
        if (this.f74630c.size() <= 0) {
            return null;
        }
        return this.f74630c.removeFirst();
    }
}
