package com.sumsub.sns.internal.features.presentation.preview.applicantdata;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29103d2;
import com.sumsub.sns.internal.features.data.model.common.C29051S0;
import com.sumsub.sns.internal.features.data.model.common.C29060U1;
import com.sumsub.sns.internal.features.data.model.common.C29068W1;
import com.sumsub.sns.internal.features.data.model.common.C29076Y1;
import com.sumsub.sns.internal.features.data.model.common.C29719y;
import com.sumsub.sns.internal.features.data.model.common.remote.C29275R3;
import com.sumsub.sns.internal.features.data.model.common.remote.C29427o;
import com.sumsub.sns.internal.features.data.model.common.remote.C29661w;
import com.sumsub.sns.internal.features.data.model.common.remote.InterfaceC29434p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.applicantdata.F */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31481F {
    /* JADX INFO: renamed from: a */
    public static void m70752a(List list, int i11, Integer num) {
        C29719y c29719y = new C29719y(new C29060U1(i11), true, null, null, 508);
        C29719y c29719y2 = new C29719y(new C29076Y1(i11), true, null, null, 508);
        if (num == null || num.intValue() <= 0 || num.intValue() >= list.size()) {
            list.add(c29719y);
            list.add(c29719y2);
        } else {
            list.add(num.intValue(), c29719y);
            list.add(num.intValue() + 1, c29719y2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Set m70751a(List list) {
        Object next;
        List list2;
        String str;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C29051S0 c29051s0 = AbstractC29103d2.Companion;
            str = ((C29661w) next).f59718b;
            c29051s0.getClass();
        } while (!Intrinsics.areEqual(C29051S0.m69736a(str), C29068W1.f59010b));
        C29661w c29661w = (C29661w) next;
        if (c29661w == null) {
            return SetsKt.emptySet();
        }
        if (!c29661w.f59720d) {
            return SetsKt.emptySet();
        }
        InterfaceC29434p interfaceC29434p = c29661w.f59721e;
        C29427o c29427o = interfaceC29434p instanceof C29427o ? (C29427o) interfaceC29434p : null;
        if (c29427o != null && (list2 = c29427o.f59426a) != null) {
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            for (Object obj : list2) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                C29275R3 c29275r3 = (C29275R3) obj;
                Integer numValueOf = (c29275r3.f59264a == null || c29275r3.f59265b == null) ? null : Integer.valueOf(i11);
                if (numValueOf != null) {
                    arrayList.add(numValueOf);
                }
                i11 = i12;
            }
            return CollectionsKt.toSet(arrayList);
        }
        return SetsKt.emptySet();
    }
}
