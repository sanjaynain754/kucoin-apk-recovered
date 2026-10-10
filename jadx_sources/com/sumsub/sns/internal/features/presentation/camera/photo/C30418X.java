package com.sumsub.sns.internal.features.presentation.camera.photo;

import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.domain.C28547d;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.extensions.InterfaceC30000a;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.X */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30418X extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f61212a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f61213b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30736v0 f61214c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C29983l f61215d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30418X(C30736v0 c30736v0, C29983l c29983l, Continuation continuation) {
        super(2, continuation);
        this.f61214c = c30736v0;
        this.f61215d = c29983l;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30418X c30418x = new C30418X(this.f61214c, this.f61215d, continuation);
        c30418x.f61213b = obj;
        return c30418x;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C30418X) create((InterfaceC41635f) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f61212a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41635f interfaceC41635f = (InterfaceC41635f) this.f61213b;
            C30736v0 c30736v0 = this.f61214c;
            InterfaceC30000a interfaceC30000a = c30736v0.f62091d;
            String strM70441a = c30736v0.m70441a(this.f61215d, "sns_step_%s_selector_footerHtml");
            if (strM70441a == null) {
                strM70441a = "";
            }
            C30417W c30417w = new C30417W(this.f61214c.f62103p, AbstractC28462i0.m69364a(strM70441a, ((C28547d) interfaceC30000a).f58099a.f58163a), this.f61214c.m70441a(this.f61215d, "sns_step_%s_selector_action_continue"));
            this.f61212a = 1;
            if (C41636g.m90878B(interfaceC41635f, c30417w, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
