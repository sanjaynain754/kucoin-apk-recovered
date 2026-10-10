package com.sumsub.sns.core.presentation.form;

import com.sumsub.sns.internal.core.presentation.form.InterfaceC28805l;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import java.util.List;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.form.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28167d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C28169f f57416a;

    public C28167d(C28169f c28169f) {
        this.f57416a = c28169f;
    }

    /* JADX INFO: renamed from: a */
    public final String m69098a(AbstractC28841e0 abstractC28841e0) {
        InterfaceC28805l interfaceC28805l = (InterfaceC28805l) this.f57416a.f57431j.getValue();
        String strMo69643d = abstractC28841e0.mo69643d();
        if (strMo69643d == null) {
            strMo69643d = "";
        }
        String str = abstractC28841e0.mo69642c().f59466a;
        return interfaceC28805l.mo69626b(strMo69643d, str != null ? str : "");
    }

    /* JADX INFO: renamed from: b */
    public final List m69099b(AbstractC28841e0 abstractC28841e0) {
        InterfaceC28805l interfaceC28805l = (InterfaceC28805l) this.f57416a.f57431j.getValue();
        String strMo69643d = abstractC28841e0.mo69643d();
        if (strMo69643d == null) {
            strMo69643d = "";
        }
        String str = abstractC28841e0.mo69642c().f59466a;
        return interfaceC28805l.mo69625a(strMo69643d, str != null ? str : "");
    }
}
