package com.sumsub.sns.internal.features.data.model.common.remote.response;

import com.sumsub.sns.internal.features.data.model.common.C29046Q2;
import com.sumsub.sns.internal.features.data.model.common.C29053S2;
import com.sumsub.sns.internal.features.data.model.common.C29062V;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.C29106e;
import java.util.ArrayList;
import java.util.List;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.Z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC29517Z {
    /* JADX INFO: renamed from: a */
    public static final C29046Q2 m69881a(C29509V c29509v) {
        C29053S2 c29053s2;
        ArrayList arrayList;
        C29530c0 c29530c0 = c29509v.f59528a;
        ArrayList arrayList2 = null;
        if (c29530c0 != null) {
            Boolean bool = c29530c0.f59544a;
            Boolean bool2 = c29530c0.f59545b;
            Double d11 = c29530c0.f59546c;
            List<String> list = c29530c0.f59547d;
            if (list != null) {
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (String str : list) {
                    C29070X.Companion.getClass();
                    arrayList.add(C29062V.m69739a(str));
                }
            } else {
                arrayList = null;
            }
            c29053s2 = new C29053S2(bool, bool2, d11, arrayList);
        } else {
            c29053s2 = null;
        }
        List<C29573l> list2 = c29509v.f59529b;
        if (list2 != null) {
            arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (C29573l c29573l : list2) {
                arrayList2.add(new C29106e(c29573l.f59597a, c29573l.f59598b, c29573l.f59599c));
            }
        }
        return new C29046Q2(c29053s2, arrayList2, c29509v.f59530c);
    }
}
