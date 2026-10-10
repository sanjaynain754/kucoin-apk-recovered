package com.sumsub.sns.internal.features.presentation.utils;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.remote.C29332c;
import com.sumsub.sns.internal.features.data.model.common.remote.C29380i;
import com.sumsub.sns.internal.p125ff.C33048a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.utils.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32641a {
    /* JADX INFO: renamed from: a */
    public static boolean m71262a(C29380i c29380i) {
        List list;
        C29332c c29332c = c29380i.f59390b;
        if (c29332c != null && (list = c29332c.f59346d) != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (C32649e.f66643c.contains((String) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m71260a(C29124h c29124h, AbstractC29172p abstractC29172p, List list) {
        if (!Intrinsics.areEqual(AbstractC29130i.m69784j(c29124h), Boolean.TRUE) && !m71261a(abstractC29172p) && list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                C32641a c32641a = C32649e.f66642b;
                if (!m71262a((C29380i) obj)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() > 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m71261a(AbstractC29172p abstractC29172p) {
        return abstractC29172p.mo69752a() != null || C33048a.f67493z.m71434a();
    }
}
