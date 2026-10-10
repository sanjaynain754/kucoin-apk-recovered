package com.sumsub.sns.internal.features.presentation.geo;

import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.T */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31063T implements InterfaceC41634e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41634e f62807a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31120v0 f62808b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C29983l f62809c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f62810d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f62811e;

    public C31063T(InterfaceC41634e interfaceC41634e, C31120v0 c31120v0, C29983l c29983l, String str, String str2) {
        this.f62807a = interfaceC41634e;
        this.f62808b = c31120v0;
        this.f62809c = c29983l;
        this.f62810d = str;
        this.f62811e = str2;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41634e
    public final Object collect(InterfaceC41635f interfaceC41635f, Continuation continuation) {
        Object objCollect = this.f62807a.collect(new C31062S(interfaceC41635f, this.f62808b, this.f62809c, this.f62810d, this.f62811e), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }
}
