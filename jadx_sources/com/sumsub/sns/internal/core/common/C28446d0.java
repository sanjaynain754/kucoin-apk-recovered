package com.sumsub.sns.internal.core.common;

import android.graphics.Bitmap;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.face.FaceDetection;
import com.google.mlkit.vision.face.FaceDetector;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import kotlinx.coroutines.C41716o;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.d0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28446d0 implements InterfaceC28389D0 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.sumsub.sns.internal.core.common.InterfaceC28389D0
    /* JADX INFO: renamed from: a */
    public final Object mo69276a(Bitmap bitmap, Continuation continuation) {
        C28429Y c28429y;
        if (continuation instanceof C28429Y) {
            c28429y = (C28429Y) continuation;
            int i11 = c28429y.f57941c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c28429y.f57941c = i11 - Integer.MIN_VALUE;
            } else {
                c28429y = new C28429Y(this, (ContinuationImpl) continuation);
            }
        } else {
            c28429y = new C28429Y(this, (ContinuationImpl) continuation);
        }
        Object objM91171w = c28429y.f57939a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c28429y.f57941c;
        int iIntValue = 0;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM91171w);
                FaceDetector client = FaceDetection.getClient(new FaceDetectorOptions.Builder().setPerformanceMode(2).setLandmarkMode(2).setClassificationMode(2).build());
                InputImage inputImageFromBitmap = InputImage.fromBitmap(bitmap, 0);
                c28429y.f57941c = 1;
                C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(c28429y), 1);
                c41716o.m91142E();
                Task taskAddOnFailureListener = client.process(inputImageFromBitmap).addOnCanceledListener(new C28431Z(client, c41716o)).addOnFailureListener(new C28434a0(client, c41716o));
                final C28438b0 c28438b0 = new C28438b0(client, c41716o);
                taskAddOnFailureListener.addOnSuccessListener(new OnSuccessListener() { // from class: com.sumsub.sns.internal.core.common.c0
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final /* synthetic */ void onSuccess(Object obj) {
                        c28438b0.invoke(obj);
                    }
                });
                objM91171w = c41716o.m91171w();
                if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(c28429y);
                }
                if (objM91171w == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM91171w);
            }
            iIntValue = ((Number) objM91171w).intValue();
        } catch (Throwable unused) {
        }
        return Boxing.boxInt(iIntValue);
    }
}
