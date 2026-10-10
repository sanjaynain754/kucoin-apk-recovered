package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.camera.view.PreviewView;
import com.sumsub.sns.internal.core.common.AbstractC28396H;
import com.sumsub.sns.internal.core.presentation.camera.CameraX$Mode;
import com.sumsub.sns.internal.features.presentation.camera.C30369d;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.C */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30441C extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public Context f61326a;

    /* JADX INFO: renamed from: b */
    public int f61327b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30468J f61328c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Bitmap f61329d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30441C(C30468J c30468j, Bitmap bitmap, Continuation continuation) {
        super(2, continuation);
        this.f61328c = c30468j;
        this.f61329d = bitmap;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30441C(this.f61328c, this.f61329d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30441C(this.f61328c, this.f61329d, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f7  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        RectF rectF;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f61327b;
        if (i11 != 0) {
            if (i11 == 1) {
                obj2 = this.f61326a;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            if (Intrinsics.areEqual(((C30538d1) ((C30440B2) this.f61328c.f61433a.getValue()).f61287H.getValue()).f61666b, Boxing.boxBoolean(true)) && ((C30440B2) this.f61328c.f61433a.getValue()).m70314g() != CameraX$Mode.SEAMLESS_DOC_CAPTURE_LEGACY) {
                z11 = true;
            } else {
                z11 = false;
            }
            C30369d c30369d = this.f61328c.f61435c.f62126h;
            PreviewView previewView = (PreviewView) c30369d.f61092g.getValue(c30369d, C30369d.f61089h[1]);
            if (previewView != null) {
                rectF = new RectF(0.0f, 0.0f, previewView.getWidth(), previewView.getHeight());
            } else {
                rectF = new RectF();
            }
            if (z11 && !rectF.isEmpty()) {
                AbstractC28396H.m69281a(this.f61328c.f61440h, this.f61329d.getWidth(), this.f61329d.getHeight(), (int) rectF.width(), (int) rectF.height());
                C30468J c30468j = this.f61328c;
                c30468j.f61440h.invert(c30468j.f61443k);
                this.f61328c.f61441i.set(rectF);
                C30468J c30468j2 = this.f61328c;
                c30468j2.f61443k.mapRect(c30468j2.f61441i);
                C30468J c30468j3 = this.f61328c;
                Rect rect = c30468j3.f61442j;
                RectF rectF2 = c30468j3.f61441i;
                rect.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            }
            Context context = this.f61328c.getContext();
            if (context != null) {
                C30468J c30468j4 = this.f61328c;
                Bitmap bitmap = this.f61329d;
                C30440B2 c30440b2 = (C30440B2) c30468j4.f61433a.getValue();
                Rect rect2 = c30468j4.f61442j;
                this.f61326a = context;
                this.f61327b = 1;
                if (c30440b2.m70285a(context, bitmap, rect2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj2 = context;
            } else {
                obj2 = SNSPhotoDocumentPickerViewModel2$FrameHandleResult.RELEASED;
            }
            if (obj2 == SNSPhotoDocumentPickerViewModel2$FrameHandleResult.RELEASED) {
                this.f61329d.recycle();
            }
            return Unit.INSTANCE;
        }
        if (obj2 == null) {
            obj2 = SNSPhotoDocumentPickerViewModel2$FrameHandleResult.RELEASED;
        }
        if (obj2 == SNSPhotoDocumentPickerViewModel2$FrameHandleResult.RELEASED) {
            this.f61329d.recycle();
        }
        return Unit.INSTANCE;
    }
}
