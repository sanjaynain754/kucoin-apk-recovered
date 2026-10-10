package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.V0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30504V0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public InterfaceC41669n f61588a;

    /* JADX INFO: renamed from: b */
    public int f61589b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30444C2 f61590c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f61591d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30504V0(C30444C2 c30444c2, boolean z11, Continuation continuation) {
        super(2, continuation);
        this.f61590c = c30444c2;
        this.f61591d = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30504V0(this.f61590c, this.f61591d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30504V0(this.f61590c, this.f61591d, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41669n interfaceC41669n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f61589b;
        if (i11 != 0) {
            if (i11 == 1) {
                interfaceC41669n = this.f61588a;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C30444C2 c30444c2 = this.f61590c;
            c30444c2.f61338B = false;
            AbstractC28073M0.updateState$default(c30444c2, false, new C30501U0(null), 1, null);
            C30444C2 c30444c3 = this.f61590c;
            InterfaceC41669n interfaceC41669n2 = c30444c3.f61343G;
            this.f61588a = interfaceC41669n2;
            this.f61589b = 1;
            obj = c30444c3.m70352d(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC41669n = interfaceC41669n2;
        }
        C30486P c30486p = (C30486P) obj;
        interfaceC41669n.setValue(C30486P.m70403a(c30486p, null, C30483O.m70402a(c30486p.f61538b, null, Boxing.boxBoolean(this.f61591d), 7), null, null, null, 29));
        return Unit.INSTANCE;
    }
}
