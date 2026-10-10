package com.sumsub.sns.internal.core.domain.facedetector;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.face.Face;
import com.google.mlkit.vision.face.FaceDetection;
import com.google.mlkit.vision.face.FaceDetector;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import com.sumsub.sns.internal.log.C33270a;
import com.sumsub.sns.internal.log.C33272c;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.domain.facedetector.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28562h implements InterfaceC28561g {

    /* JADX INFO: renamed from: a */
    public FaceDetector f58119a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f58120b;

    @Override // com.sumsub.sns.internal.core.domain.facedetector.InterfaceC28561g
    /* JADX INFO: renamed from: a */
    public final AbstractC28568n mo69426a(Bitmap bitmap, RectF rectF) {
        C33270a c33270a = C33272c.f67816e;
        c33270a.f67810a.mo68955d("MLKitFaceDetector", "@processImage()", null);
        FaceDetector faceDetector = this.f58119a;
        if (faceDetector == null) {
            c33270a.f67810a.mo68955d("MLKitFaceDetector", "@processImage(), detector is null", null);
            throw new IllegalStateException("Detector is null in MlKit");
        }
        c33270a.f67810a.mo68955d("MLKitFaceDetector", "@processImage(), creating InputImage from Bitmap", null);
        InputImage inputImageFromBitmap = InputImage.fromBitmap(bitmap, 0);
        c33270a.f67810a.mo68955d("MLKitFaceDetector", "@processImage(), InputImage created", null);
        c33270a.f67810a.mo68955d("MLKitFaceDetector", "@processImage(), starting analyzing frame", null);
        List list = (List) Tasks.await(faceDetector.process(inputImageFromBitmap), 3000L, TimeUnit.MILLISECONDS);
        c33270a.f67810a.mo68955d("MLKitFaceDetector", "@processImage(), success", null);
        if (list.isEmpty()) {
            c33270a.f67810a.mo68955d("MLKitFaceDetector", "@processImage(), no faces found", null);
            return new C28565k(bitmap);
        }
        if (list.size() > 1) {
            c33270a.f67810a.mo68955d("MLKitFaceDetector", "@processImage(), more than 1 faces found", null);
            return new C28567m(bitmap);
        }
        return m69427a(rectF, (Face) CollectionsKt.first(list), bitmap, new Size(bitmap.getWidth(), bitmap.getHeight()));
    }

    @Override // com.sumsub.sns.internal.core.domain.facedetector.InterfaceC28561g
    public final void stop() {
        this.f58120b = false;
        C33270a c33270a = C33272c.f67816e;
        c33270a.f67810a.mo68955d("MLKitFaceDetector", "@stop()", null);
        FaceDetector faceDetector = this.f58119a;
        if (faceDetector != null) {
            faceDetector.close();
        }
        this.f58119a = null;
        c33270a.f67810a.mo68955d("MLKitFaceDetector", "@stop(), stopped", null);
    }

    @Override // com.sumsub.sns.internal.core.domain.facedetector.InterfaceC28561g
    public final String getName() {
        return "MLKit";
    }

    @Override // com.sumsub.sns.internal.core.domain.facedetector.InterfaceC28561g
    public final boolean isStarted() {
        return this.f58120b;
    }

    @Override // com.sumsub.sns.internal.core.domain.facedetector.InterfaceC28561g
    public final void start() {
        C33270a c33270a = C33272c.f67816e;
        c33270a.f67810a.mo68955d("MLKitFaceDetector", "@start()", null);
        stop();
        this.f58119a = FaceDetection.getClient(new FaceDetectorOptions.Builder().setPerformanceMode(1).setLandmarkMode(1).setClassificationMode(1).setMinFaceSize(0.4f).build());
        c33270a.f67810a.mo68955d("MLKitFaceDetector", "@start(), started", null);
        this.f58120b = true;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC28568n m69427a(RectF rectF, Face face, Bitmap bitmap, Size size) {
        String str = "@processFace(), got " + bitmap.getWidth() + "x" + bitmap.getHeight() + " frame";
        C33270a c33270a = C33272c.f67816e;
        c33270a.f67810a.mo68955d("MLKitFaceDetector", str, null);
        Rect boundingBox = face.getBoundingBox();
        RectF rectF2 = new RectF((size.getWidth() - boundingBox.right) / size.getWidth(), boundingBox.top / size.getHeight(), (size.getWidth() - boundingBox.left) / size.getWidth(), boundingBox.bottom / size.getHeight());
        if (rectF.contains(rectF2)) {
            c33270a.f67810a.mo68955d("MLKitFaceDetector", "@processFace(), face is in capture box", null);
            return new C28564j(bitmap, size, rectF2);
        }
        c33270a.f67810a.mo68955d("MLKitFaceDetector", "@processFace(), face is NOT in capture box", null);
        return new C28566l(bitmap, rectF2);
    }
}
