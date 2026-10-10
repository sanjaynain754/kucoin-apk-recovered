package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.camera.view.PreviewView;
import com.sumsub.sns.internal.core.common.AbstractC28396H;
import com.sumsub.sns.internal.core.presentation.camera.CameraX$Mode;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30602o extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public Context f61816a;

    /* JADX INFO: renamed from: b */
    public int f61817b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30471K f61818c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Bitmap f61819d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30602o(C30471K c30471k, Bitmap bitmap, Continuation continuation) {
        super(2, continuation);
        this.f61818c = c30471k;
        this.f61819d = bitmap;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30602o(this.f61818c, this.f61819d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30602o(this.f61818c, this.f61819d, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e6  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int width;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f61817b;
        if (i11 != 0) {
            if (i11 == 1) {
                obj2 = this.f61816a;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            if (Intrinsics.areEqual(((C30486P) ((C30444C2) this.f61818c.f61477i.getValue()).f61343G.getValue()).f61538b.f61526a, Boxing.boxBoolean(true)) && ((C30444C2) this.f61818c.f61477i.getValue()).m70355h() != CameraX$Mode.SEAMLESS_DOC_CAPTURE_LEGACY) {
                C30471K c30471k = this.f61818c;
                if (c30471k.f61470K != null) {
                    Matrix matrix = c30471k.f61469J;
                    int width2 = this.f61819d.getWidth();
                    int height = this.f61819d.getHeight();
                    PreviewView previewViewMo70229m = this.f61818c.mo70229m();
                    int height2 = 0;
                    if (previewViewMo70229m != null) {
                        width = previewViewMo70229m.getWidth();
                    } else {
                        width = 0;
                    }
                    PreviewView previewViewMo70229m2 = this.f61818c.mo70229m();
                    if (previewViewMo70229m2 != null) {
                        height2 = previewViewMo70229m2.getHeight();
                    }
                    AbstractC28396H.m69281a(matrix, width2, height, width, height2);
                    C30471K c30471k2 = this.f61818c;
                    c30471k2.f61469J.invert(c30471k2.f61473N);
                    C30471K c30471k3 = this.f61818c;
                    RectF rectF = c30471k3.f61471L;
                    Rect rect = c30471k3.f61470K;
                    if (rect != null) {
                        rectF.set(rect);
                        C30471K c30471k4 = this.f61818c;
                        c30471k4.f61473N.mapRect(c30471k4.f61471L);
                        C30471K c30471k5 = this.f61818c;
                        Rect rect2 = c30471k5.f61472M;
                        RectF rectF2 = c30471k5.f61471L;
                        rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
            Context context = this.f61818c.getContext();
            if (context != null) {
                C30471K c30471k6 = this.f61818c;
                Bitmap bitmap = this.f61819d;
                C30444C2 c30444c2 = (C30444C2) c30471k6.f61477i.getValue();
                Rect rect3 = c30471k6.f61472M;
                this.f61816a = context;
                this.f61817b = 1;
                if (c30444c2.m70330a(context, bitmap, rect3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj2 = context;
            } else {
                obj2 = SNSPhotoDocumentPickerViewModel$FrameHandleResult.RELEASED;
            }
            if (obj2 == SNSPhotoDocumentPickerViewModel$FrameHandleResult.RELEASED) {
                this.f61819d.recycle();
            }
            return Unit.INSTANCE;
        }
        if (obj2 == null) {
            obj2 = SNSPhotoDocumentPickerViewModel$FrameHandleResult.RELEASED;
        }
        if (obj2 == SNSPhotoDocumentPickerViewModel$FrameHandleResult.RELEASED) {
            this.f61819d.recycle();
        }
        return Unit.INSTANCE;
    }
}
