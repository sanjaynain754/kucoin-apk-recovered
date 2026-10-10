package com.sumsub.sns.internal.features.presentation.country.picker;

import java.util.Set;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.country.picker.x */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30912x implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f62449a;

    public C30912x(InterfaceC41635f interfaceC41635f) {
        this.f62449a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C30911w c30911w;
        if (continuation instanceof C30911w) {
            c30911w = (C30911w) continuation;
            int i11 = c30911w.f62447b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30911w.f62447b = i11 - Integer.MIN_VALUE;
            } else {
                c30911w = new C30911w(this, continuation);
            }
        } else {
            c30911w = new C30911w(this, continuation);
        }
        Object obj2 = c30911w.f62446a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30911w.f62447b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f62449a;
            Object objFirstOrNull = CollectionsKt.firstOrNull((Set) obj);
            c30911w.f62447b = 1;
            if (interfaceC41635f.emit(objFirstOrNull, c30911w) == coroutine_suspended) {
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
