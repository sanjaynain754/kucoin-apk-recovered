package com.sumsub.sns.internal.features.presentation.geo;

import com.sumsub.sns.internal.core.presentation.form.InterfaceC28805l;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29103d2;
import com.sumsub.sns.internal.features.data.model.common.C29094c;
import java.util.Iterator;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.Y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31068Y implements InterfaceC28805l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C31120v0 f62821a;

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28805l
    /* JADX INFO: renamed from: a */
    public final List mo69625a(String str, String str2) {
        return null;
    }

    public C31068Y(C31120v0 c31120v0) {
        this.f62821a = c31120v0;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28805l
    /* JADX INFO: renamed from: b */
    public final String mo69626b(String str, String str2) {
        Object next;
        AbstractC29103d2 abstractC29103d2;
        C28936t c28936t = this.f62821a.f62927m;
        KProperty kProperty = C31120v0.f62914w[0];
        Iterator it = ((List) c28936t.m69705a()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            abstractC29103d2 = ((C29094c) next).f59041a.f59781b;
        } while (!Intrinsics.areEqual(abstractC29103d2 != null ? abstractC29103d2.mo69715b() : null, str2));
        C29094c c29094c = (C29094c) next;
        if (c29094c != null) {
            return c29094c.f59042b;
        }
        return null;
    }
}
