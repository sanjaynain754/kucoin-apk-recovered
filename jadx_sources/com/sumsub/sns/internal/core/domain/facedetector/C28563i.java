package com.sumsub.sns.internal.core.domain.facedetector;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.media.FaceDetector;
import android.util.Size;
import com.sumsub.sns.internal.core.common.C28433a;
import com.sumsub.sns.internal.log.C33270a;
import com.sumsub.sns.internal.log.C33272c;
import java.util.NoSuchElementException;
import p852kotlin.Pair;
import p852kotlin.collections.ArraysKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.domain.facedetector.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28563i implements InterfaceC28561g {

    /* JADX INFO: renamed from: a */
    public FaceDetector f58121a;

    /* JADX INFO: renamed from: b */
    public int f58122b;

    /* JADX INFO: renamed from: c */
    public int f58123c;

    /* JADX INFO: renamed from: e */
    public volatile boolean f58125e;

    /* JADX INFO: renamed from: d */
    public final C28433a f58124d = new C28433a(Bitmap.Config.RGB_565);

    /* JADX INFO: renamed from: f */
    public final String f58126f = "Native";

    @Override // com.sumsub.sns.internal.core.domain.facedetector.InterfaceC28561g
    /* JADX INFO: renamed from: a */
    public final AbstractC28568n mo69426a(Bitmap bitmap, RectF rectF) {
        String str = "@processImage(), got " + bitmap.getWidth() + "x" + bitmap.getHeight() + " frame";
        C33270a c33270a = C33272c.f67816e;
        c33270a.f67810a.mo68955d("NativeFaceDetector", str, null);
        Pair pairM69429a = m69429a(bitmap);
        c33270a.f67810a.mo68955d("NativeFaceDetector", "@processImage(), detector prepared, trying to find faces", null);
        FaceDetector.Face[] faceArr = new FaceDetector.Face[1];
        ((FaceDetector) pairM69429a.getSecond()).findFaces((Bitmap) pairM69429a.getFirst(), faceArr);
        int size = ArraysKt.filterNotNull(faceArr).size();
        c33270a.f67810a.mo68955d("NativeFaceDetector", "@processImage(), " + size + " found", null);
        if (size == 0) {
            return new C28565k(bitmap);
        }
        if (size != 1) {
            return new C28567m(bitmap);
        }
        FaceDetector.Face face = faceArr[0];
        if (face != null) {
            return m69428a(rectF, face, bitmap, new Size(bitmap.getWidth(), bitmap.getHeight()));
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // com.sumsub.sns.internal.core.domain.facedetector.InterfaceC28561g
    public final void stop() {
        this.f58125e = false;
        C33272c.f67816e.f67810a.mo68955d("NativeFaceDetector", "@stop()", null);
        this.f58121a = null;
        this.f58122b = 0;
        this.f58123c = 0;
        C28433a c28433a = this.f58124d;
        synchronized (c28433a) {
            try {
                Bitmap bitmap = c28433a.f57946b;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                c28433a.f57946b = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.sumsub.sns.internal.core.domain.facedetector.InterfaceC28561g
    public final String getName() {
        return this.f58126f;
    }

    @Override // com.sumsub.sns.internal.core.domain.facedetector.InterfaceC28561g
    public final boolean isStarted() {
        return this.f58125e;
    }

    @Override // com.sumsub.sns.internal.core.domain.facedetector.InterfaceC28561g
    public final void start() {
        C33272c.f67816e.f67810a.mo68955d("NativeFaceDetector", "@start()", null);
        this.f58125e = true;
    }

    /* JADX INFO: renamed from: a */
    public final Pair m69429a(Bitmap bitmap) {
        C33270a c33270a = C33272c.f67816e;
        c33270a.f67810a.mo68955d("NativeFaceDetector", "@prepareDetector()", null);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        c33270a.f67810a.mo68955d("NativeFaceDetector", "@prepareDetector(), got bitmap of size " + width + "x" + height, null);
        FaceDetector faceDetector = this.f58121a;
        if (faceDetector == null || this.f58122b != width || this.f58123c != height) {
            c33270a.f67810a.mo68955d("NativeFaceDetector", "@prepareDetector(), create FaceDetector", null);
            this.f58122b = width;
            this.f58123c = height;
            faceDetector = new FaceDetector(width, height, 1);
        } else {
            c33270a.f67810a.mo68955d("NativeFaceDetector", "@prepareDetector(), reuse old FaceDetector", null);
        }
        this.f58121a = faceDetector;
        c33270a.f67810a.mo68955d("NativeFaceDetector", "@prepareDetector(), making RGB565 copy of Bitmap", null);
        Bitmap bitmapM69317a = this.f58124d.m69317a(width, height);
        new Canvas(bitmapM69317a).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        c33270a.f67810a.mo68955d("NativeFaceDetector", "@prepareDetector(), RGB565 copy made", null);
        return new Pair(bitmapM69317a, faceDetector);
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC28568n m69428a(RectF rectF, FaceDetector.Face face, Bitmap bitmap, Size size) {
        if (face.confidence() < 0.3f) {
            C33272c.f67816e.f67810a.mo68955d("NativeFaceDetector", "@processFace(), face confidence is too low (" + face.confidence() + ")", null);
            return new C28565k(bitmap);
        }
        PointF pointF = new PointF();
        face.getMidPoint(pointF);
        RectF rectF2 = new RectF(pointF.x - face.eyesDistance(), ((int) pointF.y) - (face.eyesDistance() * 1.5f), face.eyesDistance() + ((int) pointF.x), (face.eyesDistance() * 1.5f) + ((int) pointF.y));
        RectF rectF3 = new RectF((size.getWidth() - rectF2.right) / size.getWidth(), rectF2.top / size.getHeight(), (size.getWidth() - rectF2.left) / size.getWidth(), rectF2.bottom / size.getHeight());
        if (rectF.contains(rectF3)) {
            C33272c.f67816e.f67810a.mo68955d("NativeFaceDetector", "@processFace(), face is in capture box", null);
            return new C28564j(bitmap, size, rectF3);
        }
        C33272c.f67816e.f67810a.mo68955d("NativeFaceDetector", "@processFace(), face is NOT in capture box", null);
        return new C28566l(bitmap, rectF3);
    }
}
