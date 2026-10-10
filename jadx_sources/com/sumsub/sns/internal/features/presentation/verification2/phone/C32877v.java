package com.sumsub.sns.internal.features.presentation.verification2.phone;

import com.sumsub.sns.internal.features.presentation.verification2.host.InterfaceC32823g;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.phone.v */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32877v implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f67270a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32847F f67271b;

    public C32877v(InterfaceC41635f interfaceC41635f, C32847F c32847f) {
        this.f67270a = interfaceC41635f;
        this.f67271b = c32847f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C32876u c32876u;
        if (continuation instanceof C32876u) {
            c32876u = (C32876u) continuation;
            int i11 = c32876u.f67268b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32876u.f67268b = i11 - Integer.MIN_VALUE;
            } else {
                c32876u = new C32876u(this, continuation);
            }
        } else {
            c32876u = new C32876u(this, continuation);
        }
        Object obj2 = c32876u.f67267a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32876u.f67268b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f67270a;
            InterfaceC32823g interfaceC32823g = (InterfaceC32823g) obj;
            C32849a c32849a = (C32849a) this.f67271b.f67209e.f67225k.getValue();
            if (Intrinsics.areEqual(c32849a != null ? c32849a.f67214a : null, interfaceC32823g.mo71350a())) {
                c32876u.f67268b = 1;
                if (interfaceC41635f.emit(obj, c32876u) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj2);
        }
        return Unit.INSTANCE;
    }
}
