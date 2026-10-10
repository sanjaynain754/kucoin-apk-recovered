package com.sumsub.sns.internal.features.presentation.geo;

import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.K */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31055K implements InterfaceC41634e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41634e f62779a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f62780b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f62781c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ List f62782d;

    public C31055K(InterfaceC41634e interfaceC41634e, String str, String str2, List list) {
        this.f62779a = interfaceC41634e;
        this.f62780b = str;
        this.f62781c = str2;
        this.f62782d = list;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41634e
    public final Object collect(InterfaceC41635f interfaceC41635f, Continuation continuation) {
        Object objCollect = this.f62779a.collect(new C31054J(interfaceC41635f, this.f62780b, this.f62781c, this.f62782d), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }
}
