package com.sumsub.sns.internal.features.presentation.camera.photo;

import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.d0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30431d0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f61252a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f61253b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30736v0 f61254c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C29983l f61255d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30431d0(C30736v0 c30736v0, C29983l c29983l, Continuation continuation) {
        super(2, continuation);
        this.f61254c = c30736v0;
        this.f61255d = c29983l;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30431d0 c30431d0 = new C30431d0(this.f61254c, this.f61255d, continuation);
        c30431d0.f61253b = obj;
        return c30431d0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C30431d0) create((InterfaceC41635f) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f61252a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41635f interfaceC41635f = (InterfaceC41635f) this.f61253b;
            C30428c0 c30428c0 = new C30428c0(this.f61254c.f62099l, C30736v0.m70438a(this.f61254c, this.f61255d), this.f61254c.m70441a(this.f61255d, "sns_step_%s_selector_country_placeholder"));
            this.f61252a = 1;
            if (C41636g.m90878B(interfaceC41635f, c30428c0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
