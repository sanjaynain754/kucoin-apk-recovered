package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.e2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC31259e2 {
    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    /* JADX INFO: renamed from: a */
    public static final Document m70661a(List list, AbstractC29172p abstractC29172p, C31292k2 c31292k2) {
        boolean z11;
        boolean z12;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z13 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Document document = (Document) next;
            if (abstractC29172p.mo69760k().f59152b) {
                List list2 = abstractC29172p.mo69760k().f59154d;
                if (!(list2 != null ? list2.contains(document.getType().f59014a) : false)) {
                    z13 = false;
                }
            }
            if (z13) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Document document2 = (Document) obj;
            if (document2.isSubmitted()) {
                if (document2.isRejected()) {
                    if (c31292k2.f63411a.contains(document2.getType())) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                } else {
                    z12 = false;
                }
                if (z12) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = true;
            }
            if (z11) {
                arrayList2.add(obj);
            }
        }
        Logger.DefaultImpls.v$default(C33272c.f67812a, AbstractC33294e.m71624a(C31251c2.f63266C), "moveToNextStep: total docs " + list.size() + ", docs left " + arrayList2.size(), null, 4, null);
        return (Document) CollectionsKt.firstOrNull((List) arrayList2);
    }
}
