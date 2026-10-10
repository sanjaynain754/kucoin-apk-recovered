package com.sumsub.sns.internal.core.domain;

import androidx.datastore.preferences.core.Preferences;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.domain.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28588m implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f58199a;

    public C28588m(InterfaceC41635f interfaceC41635f) {
        this.f58199a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C28586l c28586l;
        if (continuation instanceof C28586l) {
            c28586l = (C28586l) continuation;
            int i11 = c28586l.f58197b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c28586l.f58197b = i11 - Integer.MIN_VALUE;
            } else {
                c28586l = new C28586l(this, continuation);
            }
        } else {
            c28586l = new C28586l(this, continuation);
        }
        Object obj2 = c28586l.f58196a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c28586l.f58197b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f58199a;
            Object obj3 = ((Preferences) obj).get(C28598r.f58212d);
            c28586l.f58197b = 1;
            if (interfaceC41635f.emit(obj3, c28586l) == coroutine_suspended) {
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
