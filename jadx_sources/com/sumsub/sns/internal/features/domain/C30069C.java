package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.core.presentation.form.viewutils.AbstractC28232c;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29154m;
import java.util.Iterator;
import java.util.Map;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.C */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30069C {
    /* JADX INFO: renamed from: a */
    public static C30068B m70095a(AbstractC29172p abstractC29172p, C30270n c30270n) {
        boolean zAreEqual;
        String strM69166a;
        Object next;
        String str;
        Map map;
        C30226m c30226m;
        Iterator it = abstractC29172p.mo69760k().f59151a.iterator();
        do {
            zAreEqual = false;
            strM69166a = null;
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!StringsKt.startsWith$default(((C29154m) next).f59132a.f59014a, "PHONE_VERIFICATION", false, 2, (Object) null));
        C29154m c29154m = (C29154m) next;
        if (c30270n != null && (c30226m = c30270n.f60859f) != null) {
            str = c30226m.f60757b;
            if (str == null && (str = c30226m.f60756a) == null) {
                str = c30226m.f60758c;
            }
        } else {
            str = null;
        }
        if (c30270n != null && (map = c30270n.f60855b) != null) {
            strM69166a = AbstractC28232c.m69166a(str, map);
        }
        String strMo69757h = abstractC29172p.mo69757h();
        if (strMo69757h != null && !StringsKt.isBlank(strMo69757h)) {
            if (c29154m != null) {
                zAreEqual = Intrinsics.areEqual(c29154m.f59146o, Boolean.TRUE);
            }
            return new C30068B(strMo69757h, zAreEqual);
        }
        if (strMo69757h != null) {
            strM69166a = strMo69757h;
        }
        return new C30068B(strM69166a, false);
    }
}
