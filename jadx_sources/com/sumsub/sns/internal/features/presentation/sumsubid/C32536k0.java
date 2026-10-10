package com.sumsub.sns.internal.features.presentation.sumsubid;

import com.sumsub.sns.core.presentation.base.C28075O;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.k0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32536k0 extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public int f66368a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ InterfaceC41635f f66369b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f66370c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32487O0 f66371d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C28075O f66372e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32536k0(Continuation continuation, C32487O0 c32487o0, C28075O c28075o) {
        super(3, continuation);
        this.f66371d = c32487o0;
        this.f66372e = c28075o;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C32536k0 c32536k0 = new C32536k0((Continuation) obj3, this.f66371d, this.f66372e);
        c32536k0.f66369b = (InterfaceC41635f) obj;
        c32536k0.f66370c = obj2;
        return c32536k0.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41634e interfaceC41634eM90930n0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f66368a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41635f interfaceC41635f = this.f66369b;
            int i12 = AbstractC32530i0.f66358a[((SNSSumsubIdStep) this.f66370c).ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                interfaceC41634eM90930n0 = new C32562u0(C41636g.m90881E(this.f66371d.f66277p));
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            interfaceC41634eM90930n0 = new C32556r0(this.f66371d.f66275n, this.f66372e);
                        }
                    } else {
                        interfaceC41634eM90930n0 = C41636g.m90887K(new C32539l0(this.f66372e, null));
                    }
                } else {
                    interfaceC41634eM90930n0 = new C32548o0(this.f66371d.f66273l, this.f66372e);
                }
            } else {
                C32487O0 c32487o0 = this.f66371d;
                interfaceC41634eM90930n0 = C41636g.m90930n0(c32487o0.f66271j, new C32606x0(null, c32487o0, this.f66372e));
            }
            this.f66368a = 1;
            if (C41636g.m90878B(interfaceC41635f, interfaceC41634eM90930n0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
