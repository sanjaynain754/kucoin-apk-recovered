package com.sumsub.sns.internal.features.presentation.geo;

import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.S */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31062S implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f62803a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C29983l f62804b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f62805c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f62806d;

    public C31062S(InterfaceC41635f interfaceC41635f, C31120v0 c31120v0, C29983l c29983l, String str, String str2) {
        this.f62803a = interfaceC41635f;
        this.f62804b = c29983l;
        this.f62805c = str;
        this.f62806d = str2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C31061Q c31061q;
        C31124x0 c31124x0;
        if (continuation instanceof C31061Q) {
            c31061q = (C31061Q) continuation;
            int i11 = c31061q.f62801b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31061q.f62801b = i11 - Integer.MIN_VALUE;
            } else {
                c31061q = new C31061Q(this, continuation);
            }
        } else {
            c31061q = new C31061Q(this, continuation);
        }
        Object obj2 = c31061q.f62800a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31061q.f62801b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f62803a;
            Long l11 = (Long) obj;
            if (l11 != null) {
                c31124x0 = C31120v0.m70575a(this.f62804b, this.f62805c, l11.longValue());
            } else {
                String strM70061a = this.f62804b.m70061a(this.f62806d);
                if (strM70061a == null) {
                    strM70061a = "";
                }
                c31124x0 = new C31124x0(strM70061a, C31046E0.f62752a);
            }
            c31061q.f62801b = 1;
            if (interfaceC41635f.emit(c31124x0, c31061q) == coroutine_suspended) {
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
