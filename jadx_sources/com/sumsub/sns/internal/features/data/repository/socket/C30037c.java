package com.sumsub.sns.internal.features.data.repository.socket;

import com.sumsub.sns.internal.features.data.model.common.remote.C29226H3;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.socket.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30037c implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f60337a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30050p f60338b;

    public C30037c(InterfaceC41635f interfaceC41635f, C30050p c30050p) {
        this.f60337a = interfaceC41635f;
        this.f60338b = c30050p;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C30036b c30036b;
        if (continuation instanceof C30036b) {
            c30036b = (C30036b) continuation;
            int i11 = c30036b.f60335b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30036b.f60335b = i11 - Integer.MIN_VALUE;
            } else {
                c30036b = new C30036b(this, continuation);
            }
        } else {
            c30036b = new C30036b(this, continuation);
        }
        Object obj2 = c30036b.f60334a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30036b.f60335b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f60337a;
            C29226H3 c29226h3M69815a = C29226H3.Companion.m69815a(this.f60338b.f60376f, (String) obj);
            c30036b.f60335b = 1;
            if (interfaceC41635f.emit(c29226h3M69815a, c30036b) == coroutine_suspended) {
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
