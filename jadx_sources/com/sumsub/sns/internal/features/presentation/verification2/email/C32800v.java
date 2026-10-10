package com.sumsub.sns.internal.features.presentation.verification2.email;

import com.sumsub.sns.internal.features.presentation.verification2.host.InterfaceC32823g;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.email.v */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32800v implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f67128a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32774D f67129b;

    public C32800v(InterfaceC41635f interfaceC41635f, C32774D c32774d) {
        this.f67128a = interfaceC41635f;
        this.f67129b = c32774d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C32799u c32799u;
        if (continuation instanceof C32799u) {
            c32799u = (C32799u) continuation;
            int i11 = c32799u.f67126b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32799u.f67126b = i11 - Integer.MIN_VALUE;
            } else {
                c32799u = new C32799u(this, continuation);
            }
        } else {
            c32799u = new C32799u(this, continuation);
        }
        Object obj2 = c32799u.f67125a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32799u.f67126b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f67128a;
            if (Intrinsics.areEqual(this.f67129b.f67078c.getValue(), ((InterfaceC32823g) obj).mo71350a())) {
                c32799u.f67126b = 1;
                if (interfaceC41635f.emit(obj, c32799u) == coroutine_suspended) {
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
