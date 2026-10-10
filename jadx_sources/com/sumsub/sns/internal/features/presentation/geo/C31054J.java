package com.sumsub.sns.internal.features.presentation.geo;

import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.J */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31054J implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f62775a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f62776b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f62777c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ List f62778d;

    public C31054J(InterfaceC41635f interfaceC41635f, String str, String str2, List list) {
        this.f62775a = interfaceC41635f;
        this.f62776b = str;
        this.f62777c = str2;
        this.f62778d = list;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C31053I c31053i;
        if (continuation instanceof C31053I) {
            c31053i = (C31053I) continuation;
            int i11 = c31053i.f62773b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31053i.f62773b = i11 - Integer.MIN_VALUE;
            } else {
                c31053i = new C31053I(this, continuation);
            }
        } else {
            c31053i = new C31053I(this, continuation);
        }
        Object obj2 = c31053i.f62772a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31053i.f62773b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f62775a;
            C31128z0 c31128z0 = new C31128z0(this.f62776b, this.f62777c, this.f62778d, (C31126y0) obj);
            c31053i.f62773b = 1;
            if (interfaceC41635f.emit(c31128z0, c31053i) == coroutine_suspended) {
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
