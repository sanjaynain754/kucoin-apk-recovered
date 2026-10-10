package com.sumsub.sns.internal.features.presentation.common;

import com.sumsub.sns.core.widget.SNSCommonBottomSheetView;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.common.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30821f extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62255a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC30823g f62256b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30821f(AbstractC30823g abstractC30823g, Continuation continuation) {
        super(2, continuation);
        this.f62256b = abstractC30823g;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30821f c30821f = new C30821f(this.f62256b, continuation);
        c30821f.f62255a = obj;
        return c30821f;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C30821f c30821f = new C30821f(this.f62256b, (Continuation) obj2);
        c30821f.f62255a = (C30827i) obj;
        return c30821f.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70482a(AbstractC30823g abstractC30823g, C30827i c30827i) {
        ((AbstractC30808G) abstractC30823g.getViewModel$idensic_mobile_sdk_aar_defaultRelease()).intent(c30827i.f62266a);
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        final C30827i c30827i = (C30827i) this.f62255a;
        if (c30827i != null) {
            SNSCommonBottomSheetView sNSCommonBottomSheetViewMo70492f = this.f62256b.mo70492f();
            if (sNSCommonBottomSheetViewMo70492f != null) {
                final AbstractC30823g abstractC30823g = this.f62256b;
                new C30810I(sNSCommonBottomSheetViewMo70492f, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.common.e0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C30821f.m70482a(abstractC30823g, c30827i);
                    }
                }).m70477a(c30827i.f62267b, c30827i.f62268c);
            }
        } else if (c30827i != null) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
