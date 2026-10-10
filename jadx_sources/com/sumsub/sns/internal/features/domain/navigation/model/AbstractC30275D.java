package com.sumsub.sns.internal.features.domain.navigation.model;

import com.sumsub.sns.internal.features.data.model.common.C29070X;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.navigation.model.D */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC30275D {
    /* JADX INFO: renamed from: a */
    public static final C29070X m70171a(InterfaceC30301z interfaceC30301z) {
        if (interfaceC30301z instanceof InterfaceC30290o) {
            return ((InterfaceC30290o) interfaceC30301z).mo70172a();
        }
        if (Intrinsics.areEqual(interfaceC30301z, C30298w.f60897a)) {
            return new C29070X("VIDEO_IDENT");
        }
        if (Intrinsics.areEqual(interfaceC30301z, C30299x.f60898a) || Intrinsics.areEqual(interfaceC30301z, C30300y.f60899a) || Intrinsics.areEqual(interfaceC30301z, C30292q.f60891a) || Intrinsics.areEqual(interfaceC30301z, C30294s.f60893a) || Intrinsics.areEqual(interfaceC30301z, C30293r.f60892a) || Intrinsics.areEqual(interfaceC30301z, C30279d.f60876a) || Intrinsics.areEqual(interfaceC30301z, C30297v.f60896a) || Intrinsics.areEqual(interfaceC30301z, C30296u.f60895a) || Intrinsics.areEqual(interfaceC30301z, C30291p.f60890a) || (interfaceC30301z instanceof C30295t)) {
            return new C29070X("TYPE_UNKNOWN");
        }
        throw new NoWhenBranchMatchedException();
    }
}
