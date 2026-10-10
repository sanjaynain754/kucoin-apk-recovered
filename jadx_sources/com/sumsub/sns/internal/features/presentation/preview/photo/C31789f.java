package com.sumsub.sns.internal.features.presentation.preview.photo;

import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31789f extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC31826m f64597a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31789f(AbstractC31826m abstractC31826m, Continuation continuation) {
        super(2, continuation);
        this.f64597a = abstractC31826m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31789f(this.f64597a, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31789f(this.f64597a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        BottomSheetBehavior bottomSheetBehavior = this.f64597a.f64682p;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setHideable(true);
        }
        BottomSheetBehavior bottomSheetBehavior2 = this.f64597a.f64682p;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.setState(5);
        }
        AbstractC31826m abstractC31826m = this.f64597a;
        TextView textView = (TextView) abstractC31826m.f64675i.getValue(abstractC31826m, AbstractC31826m.f64666t[7]);
        if (textView != null) {
            textView.setVisibility(8);
        }
        return Unit.INSTANCE;
    }
}
