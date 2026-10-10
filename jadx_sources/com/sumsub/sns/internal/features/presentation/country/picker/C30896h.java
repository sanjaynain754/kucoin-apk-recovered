package com.sumsub.sns.internal.features.presentation.country.picker;

import java.util.Set;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.country.picker.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30896h implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f62415a;

    public C30896h(InterfaceC41635f interfaceC41635f) {
        this.f62415a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C30895g c30895g;
        if (continuation instanceof C30895g) {
            c30895g = (C30895g) continuation;
            int i11 = c30895g.f62413b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30895g.f62413b = i11 - Integer.MIN_VALUE;
            } else {
                c30895g = new C30895g(this, continuation);
            }
        } else {
            c30895g = new C30895g(this, continuation);
        }
        Object obj2 = c30895g.f62412a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30895g.f62413b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f62415a;
            Integer numBoxInt = Boxing.boxInt(((Set) obj).size());
            c30895g.f62413b = 1;
            if (interfaceC41635f.emit(numBoxInt, c30895g) == coroutine_suspended) {
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
