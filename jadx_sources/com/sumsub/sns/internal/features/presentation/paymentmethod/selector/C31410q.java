package com.sumsub.sns.internal.features.presentation.paymentmethod.selector;

import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.paymentmethod.selector.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31410q implements InterfaceC41634e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41634e f63647a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C29983l f63648b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f63649c;

    public C31410q(InterfaceC41634e interfaceC41634e, C29983l c29983l, List list) {
        this.f63647a = interfaceC41634e;
        this.f63648b = c29983l;
        this.f63649c = list;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41634e
    public final Object collect(InterfaceC41635f interfaceC41635f, Continuation continuation) {
        Object objCollect = this.f63647a.collect(new C31409p(interfaceC41635f, this.f63648b, this.f63649c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }
}
