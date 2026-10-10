package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.data.utils.InterfaceC30061a;
import com.sumsub.sns.internal.features.domain.documents.C30122P;
import com.sumsub.sns.internal.features.domain.documents.C30124S;
import com.sumsub.sns.internal.log.C33272c;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.o0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30303o0 implements InterfaceC30061a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C29054T f60901a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30311s0 f60902b;

    /* JADX INFO: renamed from: a */
    public final String m70174a() {
        C29054T c29054t = this.f60901a;
        return c29054t.f58997d + ", side=" + c29054t.f58998e;
    }

    public C30303o0(C29054T c29054t, C30311s0 c30311s0) {
        this.f60901a = c29054t;
        this.f60902b = c30311s0;
    }

    /* JADX INFO: renamed from: b */
    public final void m70176b() {
        C33272c.f67816e.f67810a.mo68955d("DocCapture", m70174a() + ", upload finished", null);
        C30311s0 c30311s0 = this.f60902b;
        C29054T c29054t = this.f60901a;
        c30311s0.f60937e.put(c29054t, 100);
        InterfaceC30271n0 interfaceC30271n0 = c30311s0.f60936d;
        if (interfaceC30271n0 != null) {
            interfaceC30271n0.mo70170a(c29054t, C30122P.f60562a, c30311s0.m70178a());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m70175a(int i11) {
        C33272c.f67816e.f67810a.mo68955d("DocCapture", m70174a() + ", uploaded progress=" + i11, null);
        C30311s0 c30311s0 = this.f60902b;
        C29054T c29054t = this.f60901a;
        c30311s0.f60937e.put(c29054t, Integer.valueOf(i11));
        InterfaceC30271n0 interfaceC30271n0 = c30311s0.f60936d;
        if (interfaceC30271n0 != null) {
            interfaceC30271n0.mo70170a(c29054t, i11 == 100 ? C30122P.f60562a : new C30124S(i11), c30311s0.m70178a());
        }
    }
}
