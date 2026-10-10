package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.log.C33272c;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.C41713n0;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.s0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30311s0 extends AbstractC30223k0 {

    /* JADX INFO: renamed from: d */
    public InterfaceC30271n0 f60936d;

    /* JADX INFO: renamed from: e */
    public final ConcurrentHashMap f60937e;

    @Override // com.sumsub.sns.internal.features.domain.AbstractC30223k0
    /* JADX INFO: renamed from: a */
    public final Object mo70148a(List list, AbstractC30176f0 abstractC30176f0, C30221j0 c30221j0) {
        C30227m0 c30227m0 = (C30227m0) abstractC30176f0;
        if (c30227m0.f60760e) {
            return Unit.INSTANCE;
        }
        Object objM70146a = AbstractC30223k0.m70146a(this, list, c30227m0, c30221j0);
        return objM70146a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70146a : Unit.INSTANCE;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C30311s0(C28578h c28578h) {
        InterfaceC29953a interfaceC29953a = (InterfaceC29953a) c28578h.f58168f.getValue();
        InterfaceC29921d interfaceC29921d = (InterfaceC29921d) c28578h.f58169g.getValue();
        super(interfaceC29953a, interfaceC29921d, (InterfaceC29984m) c28578h.f58180r.getValue());
        this.f60937e = new ConcurrentHashMap();
    }

    @Override // com.sumsub.sns.internal.features.domain.AbstractC30223k0
    /* JADX INFO: renamed from: b */
    public final Object mo70149b(AbstractC30176f0 abstractC30176f0, AbstractC29172p abstractC29172p, String str, C30221j0 c30221j0) {
        C30227m0 c30227m0 = (C30227m0) abstractC30176f0;
        this.f60937e.clear();
        Iterator it = c30227m0.f60759d.iterator();
        while (it.hasNext()) {
            this.f60937e.put((C29054T) it.next(), Boxing.boxInt(0));
        }
        return C41713n0.m91130f(new C30309r0(c30227m0, this, str, null), c30221j0);
    }

    @Override // com.sumsub.sns.internal.features.domain.AbstractC30223k0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo70147a(AbstractC30176f0 abstractC30176f0, AbstractC29172p abstractC29172p, String str, C30221j0 c30221j0) {
        return m70179a((C30227m0) abstractC30176f0, str, c30221j0);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:41:0x0118  */
    /* JADX WARN: Code duplicated, block: B:43:0x011b  */
    /* JADX WARN: Code duplicated, block: B:46:0x014f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x0150  */
    /* JADX WARN: Code duplicated, block: B:50:0x015a  */
    /* JADX WARN: Code duplicated, block: B:51:0x015d  */
    /* JADX WARN: Code duplicated, block: B:54:0x018d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0198  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0150 -> B:48:0x0156). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m70179a(com.sumsub.sns.internal.features.domain.C30227m0 r20, java.lang.String r21, p852kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.features.domain.C30311s0.m70179a(com.sumsub.sns.internal.features.domain.m0, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: a */
    public final int m70178a() {
        int iSumOfInt = CollectionsKt.sumOfInt(this.f60937e.values()) / this.f60937e.size();
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "total upload progress=" + iSumOfInt, null);
        return iSumOfInt;
    }
}
