package com.sumsub.sns.internal.core.domain.facedetector;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.Size;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p126ml.core.AbstractC33335n;
import com.sumsub.sns.internal.p126ml.core.C33331j;
import com.sumsub.sns.internal.p126ml.core.C33332k;
import com.sumsub.sns.internal.p126ml.core.C33333l;
import com.sumsub.sns.internal.p126ml.core.C33334m;
import com.sumsub.sns.internal.p126ml.facedetector.C33355a;
import com.sumsub.sns.internal.p126ml.facedetector.C33356b;
import com.sumsub.sns.internal.p126ml.facedetector.models.AbstractC33360d;
import com.sumsub.sns.internal.p126ml.facedetector.models.C33359c;
import com.sumsub.sns.internal.p126ml.facedetector.models.C33361e;
import com.sumsub.sns.internal.p126ml.facedetector.models.C33362f;
import com.sumsub.sns.internal.p126ml.facedetector.models.C33363g;
import java.util.List;
import kotlinx.coroutines.C41690i;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.domain.facedetector.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28572r implements InterfaceC28561g {

    /* JADX INFO: renamed from: a */
    public final Context f58137a;

    /* JADX INFO: renamed from: b */
    public C33355a f58138b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f58139c;

    @Override // com.sumsub.sns.internal.core.domain.facedetector.InterfaceC28561g
    public final void stop() throws InterruptedException {
        this.f58139c = false;
        C33356b.m71665a("TensorflowFaceDetector@stop()");
        C41690i.m91067b(null, new C28571q(this, null), 1, null);
        this.f58138b = null;
        C33356b.m71665a("TensorflowFaceDetector@stop(), detector destroyed");
    }

    @Override // com.sumsub.sns.internal.core.domain.facedetector.InterfaceC28561g
    public final String getName() {
        return "TensorFlow";
    }

    @Override // com.sumsub.sns.internal.core.domain.facedetector.InterfaceC28561g
    public final boolean isStarted() {
        return this.f58139c;
    }

    @Override // com.sumsub.sns.internal.core.domain.facedetector.InterfaceC28561g
    public final void start() {
        C33356b.m71665a("TensorflowFaceDetector@start()");
        Context context = this.f58137a;
        C33361e c33361e = new C33361e();
        c33361e.f68038b = 1;
        c33361e.f68037a = 0.4f;
        C33362f c33362f = new C33362f(c33361e);
        AbstractC33360d.m71666a(c33362f);
        this.f58138b = new C33355a(context, c33362f);
        C33356b.m71665a("TensorflowFaceDetector@start(), detector created");
        this.f58139c = true;
    }

    public C28572r(Context context) {
        this.f58137a = context;
    }

    @Override // com.sumsub.sns.internal.core.domain.facedetector.InterfaceC28561g
    /* JADX INFO: renamed from: a */
    public final AbstractC28568n mo69426a(Bitmap bitmap, RectF rectF) throws Throwable {
        AbstractC28568n c28565k;
        float f11;
        List list;
        C33359c c33359c;
        List list2;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        AbstractC33335n abstractC33335n = (AbstractC33335n) C41690i.m91067b(null, new C28570p(this, bitmap, null), 1, null);
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        if (abstractC33335n instanceof C33333l) {
            C33333l c33333l = (C33333l) abstractC33335n;
            int size = ((C33363g) c33333l.f67967a).f68041a.size();
            int size2 = 0;
            if (size != 0) {
                if (size != 1) {
                    c28565k = new C28567m(bitmap);
                } else {
                    C33359c c33359c2 = (C33359c) ((C33363g) c33333l.f67967a).f68041a.get(0);
                    Size size3 = new Size(bitmap.getWidth(), bitmap.getHeight());
                    if (rectF.contains(c33359c2.f68035b)) {
                        c28565k = new C28564j(bitmap, size3, c33359c2.f68035b);
                    } else {
                        c28565k = new C28566l(bitmap, c33359c2.f68035b);
                    }
                }
            } else {
                c28565k = new C28565k(bitmap);
            }
            C33363g c33363g = (C33363g) c33333l.f67967a;
            if (c33363g != null && (list2 = c33363g.f68041a) != null) {
                size2 = list2.size();
            }
            C33363g c33363g2 = (C33363g) c33333l.f67967a;
            if (c33363g2 != null && (list = c33363g2.f68041a) != null && (c33359c = (C33359c) CollectionsKt.firstOrNull(list)) != null) {
                f11 = c33359c.f68034a;
            } else {
                f11 = 0.0f;
            }
            C33356b.m71665a("processImage(), frame=" + bitmap.getWidth() + "x" + bitmap.getHeight() + ", time=" + jElapsedRealtime2 + " ms, faces=" + size2 + ", faceScore=" + f11 + ", result=" + AbstractC28458h.m69333a(c28565k));
            return c28565k;
        }
        if (!(abstractC33335n instanceof C33331j)) {
            if (!(abstractC33335n instanceof C33332k)) {
                if (abstractC33335n instanceof C33334m) {
                    C33356b.m71665a("TensorflowFaceDetector@processImage(), timeout");
                    throw new IllegalStateException("TensorflowFaceDetector timed out");
                }
                C33356b.m71665a("TensorflowFaceDetector@processImage(), unknown");
                throw new IllegalStateException("Unknown result or error got from TensorflowFaceDetector");
            }
            C33356b.m71665a("TensorflowFaceDetector@processImage(), skip");
            throw new IllegalStateException("TensorflowFaceDetector was skipped");
        }
        C33331j c33331j = (C33331j) abstractC33335n;
        C33272c.f67816e.f67810a.mo68955d("TensorflowFaceDetector", "TensorflowFaceDetector@processImage(), result error", c33331j.f67966a);
        throw c33331j.f67966a;
    }
}
