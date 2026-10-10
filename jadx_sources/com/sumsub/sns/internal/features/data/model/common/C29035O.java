package com.sumsub.sns.internal.features.data.model.common;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.O */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29035O implements Comparator {

    /* JADX INFO: renamed from: a */
    public final AbstractC29172p f58974a;

    /* JADX INFO: renamed from: b */
    public final List f58975b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i11;
        Document document = (Document) obj;
        Document document2 = (Document) obj2;
        int i12 = -1;
        int i13 = 0;
        if (document == null) {
            i11 = -1;
            break;
        }
        Iterator it = this.f58975b.iterator();
        i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (Intrinsics.areEqual((C29070X) it.next(), document.getType())) {
                break;
            }
            i11++;
        }
        if (document2 != null) {
            Iterator it2 = this.f58975b.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.areEqual((C29070X) it2.next(), document2.getType())) {
                    i12 = i13;
                    break;
                }
                i13++;
            }
        }
        return i11 - i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2 */
    public C29035O(AbstractC29172p abstractC29172p) {
        this.f58974a = abstractC29172p;
        List list = abstractC29172p.mo69760k().f59151a;
        ?? arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C29154m) it.next()).f59132a.f59014a);
        }
        List list2 = this.f58974a.mo69760k().f59152b ? this.f58974a.mo69760k().f59154d : null;
        arrayList = list2 != null ? list2 : arrayList;
        List list3 = this.f58974a.mo69760k().f59151a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C29154m) it2.next()).f59132a);
        }
        this.f58975b = CollectionsKt.sortedWith(arrayList2, new C29031N(arrayList));
    }
}
