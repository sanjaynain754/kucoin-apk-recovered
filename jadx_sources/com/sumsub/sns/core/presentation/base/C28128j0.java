package com.sumsub.sns.core.presentation.base;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29980i;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.j0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28128j0 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f57353a;

    public C28128j0(InterfaceC41635f interfaceC41635f) {
        this.f57353a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C28125i0 c28125i0;
        AbstractC29971N abstractC29971N;
        AbstractC29971N abstractC29971N2;
        if (continuation instanceof C28125i0) {
            c28125i0 = (C28125i0) continuation;
            int i11 = c28125i0.f57346b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c28125i0.f57346b = i11 - Integer.MIN_VALUE;
            } else {
                c28125i0 = new C28125i0(this, continuation);
            }
        } else {
            c28125i0 = new C28125i0(this, continuation);
        }
        Object obj2 = c28125i0.f57345a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c28125i0.f57346b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f57353a;
            C29980i c29980i = (C29980i) obj;
            C29983l c29983l = null;
            AbstractC29172p abstractC29172p = (c29980i == null || (abstractC29971N2 = c29980i.f60239a) == null) ? null : (AbstractC29172p) abstractC29971N2.m70051c();
            C29124h c29124h = c29980i != null ? (C29124h) c29980i.f60240b.m70051c() : null;
            if (c29980i != null && (abstractC29971N = c29980i.f60241c) != null) {
                c29983l = (C29983l) abstractC29971N.m70051c();
            }
            C28075O c28075o = new C28075O(c29124h, abstractC29172p, c29983l);
            c28125i0.f57346b = 1;
            if (interfaceC41635f.emit(c28075o, c28125i0) == coroutine_suspended) {
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
