package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29180q2;
import com.sumsub.sns.internal.features.data.model.common.C29157m2;
import com.sumsub.sns.internal.features.data.model.common.remote.C29307Y0;
import com.sumsub.sns.internal.features.data.repository.applicant.AbstractC29920c;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import java.io.File;
import java.util.Map;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.v0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30319v0 extends AbstractC30223k0 {
    @Override // com.sumsub.sns.internal.features.domain.AbstractC30223k0
    /* JADX INFO: renamed from: a */
    public final Object mo70147a(AbstractC30176f0 abstractC30176f0, AbstractC29172p abstractC29172p, String str, C30221j0 c30221j0) {
        throw new UnsupportedOperationException("Not yet implemented and never will");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C30319v0(C28578h c28578h) {
        InterfaceC29953a interfaceC29953a = (InterfaceC29953a) c28578h.f58168f.getValue();
        InterfaceC29921d interfaceC29921d = (InterfaceC29921d) c28578h.f58169g.getValue();
        super(interfaceC29953a, interfaceC29921d, (InterfaceC29984m) c28578h.f58180r.getValue());
    }

    @Override // com.sumsub.sns.internal.features.domain.AbstractC30223k0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo70149b(AbstractC30176f0 abstractC30176f0, AbstractC29172p abstractC29172p, String str, C30221j0 c30221j0) {
        return m70185a((C30313t0) abstractC30176f0, abstractC29172p, str, (ContinuationImpl) c30221j0);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: a */
    public final Object m70185a(C30313t0 c30313t0, AbstractC29172p abstractC29172p, String str, ContinuationImpl continuationImpl) {
        C30315u0 c30315u0;
        String str2;
        if (continuationImpl instanceof C30315u0) {
            c30315u0 = (C30315u0) continuationImpl;
            int i11 = c30315u0.f60946c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30315u0.f60946c = i11 - Integer.MIN_VALUE;
            } else {
                c30315u0 = new C30315u0(this, continuationImpl);
            }
        } else {
            c30315u0 = new C30315u0(this, continuationImpl);
        }
        C30315u0 c30315u1 = c30315u0;
        Object objM70003a = c30315u1.f60944a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30315u1.f60946c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70003a);
            AbstractC29180q2 abstractC29180q2 = (AbstractC29180q2) CollectionsKt.firstOrNull(abstractC29172p.m69796b(c30313t0.f60638a.getType()));
            if (abstractC29180q2 == null || (str2 = abstractC29180q2.f59176a) == null) {
                str2 = C29157m2.f59150c.f59176a;
            }
            String str3 = str2;
            Map mapMapOf = MapsKt.mapOf(TuplesKt.m90091to("X-Video-Selfie-Phrase", AbstractC28458h.m69334a(c30313t0.f60941e)));
            InterfaceC29921d interfaceC29921d = this.f60754b;
            File file = c30313t0.f60940d;
            c30315u1.f60946c = 1;
            objM70003a = AbstractC29920c.m70003a(interfaceC29921d, str, file, str3, null, mapMapOf, null, null, c30315u1, 40);
            if (objM70003a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70003a);
        }
        return CollectionsKt.listOf(new C30217h0(null, (C29307Y0) objM70003a));
    }
}
