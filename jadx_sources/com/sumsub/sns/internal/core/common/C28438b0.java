package com.sumsub.sns.internal.core.common;

import com.google.mlkit.vision.face.Face;
import com.google.mlkit.vision.face.FaceDetector;
import java.util.List;
import kotlinx.coroutines.C41716o;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.b0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28438b0 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FaceDetector f57951a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C41716o f57952b;

    public C28438b0(FaceDetector faceDetector, C41716o c41716o) {
        this.f57951a = faceDetector;
        this.f57952b = c41716o;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Face face = (Face) CollectionsKt.firstOrNull((List) obj);
        this.f57951a.close();
        if (face == null) {
            this.f57952b.m91151P(0, null);
            this.f57951a.close();
        } else {
            this.f57952b.m91151P(Integer.valueOf((int) face.getHeadEulerAngleZ()), null);
        }
        return Unit.INSTANCE;
    }
}
