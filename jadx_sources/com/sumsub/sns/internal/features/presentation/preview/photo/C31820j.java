package com.sumsub.sns.internal.features.presentation.preview.photo;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlinx.coroutines.DelayKt;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31820j extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f64657a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC31826m f64658b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31932u f64659c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31820j(AbstractC31826m abstractC31826m, C31932u c31932u, Continuation continuation) {
        super(2, continuation);
        this.f64658b = abstractC31826m;
        this.f64659c = c31932u;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31820j(this.f64658b, this.f64659c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31820j(this.f64658b, this.f64659c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f64657a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            AbstractC31826m abstractC31826m = this.f64658b;
            C31932u c31932u = this.f64659c;
            KProperty[] kPropertyArr = AbstractC31826m.f64666t;
            abstractC31826m.m70904a(c31932u);
            this.f64657a = 1;
            if (DelayKt.m90350b(300L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        BottomSheetBehavior bottomSheetBehavior = this.f64658b.f64682p;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setState(3);
        }
        return Unit.INSTANCE;
    }
}
