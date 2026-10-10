package com.sumsub.sns.internal.features.presentation.verification2.host;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.host.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32825i implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f67169a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f67170b;

    public C32825i(InterfaceC41635f interfaceC41635f, String str) {
        this.f67169a = interfaceC41635f;
        this.f67170b = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C32824h c32824h;
        if (continuation instanceof C32824h) {
            c32824h = (C32824h) continuation;
            int i11 = c32824h.f67167b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32824h.f67167b = i11 - Integer.MIN_VALUE;
            } else {
                c32824h = new C32824h(this, continuation);
            }
        } else {
            c32824h = new C32824h(this, continuation);
        }
        Object obj2 = c32824h.f67166a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32824h.f67167b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f67169a;
            InterfaceC32823g interfaceC32823g = (InterfaceC32823g) obj;
            if (interfaceC32823g == null || !Intrinsics.areEqual(interfaceC32823g.mo71350a(), StringsKt.trim((CharSequence) this.f67170b).toString())) {
                interfaceC32823g = null;
            }
            c32824h.f67167b = 1;
            if (interfaceC41635f.emit(interfaceC32823g, c32824h) == coroutine_suspended) {
                return coroutine_suspended;
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
