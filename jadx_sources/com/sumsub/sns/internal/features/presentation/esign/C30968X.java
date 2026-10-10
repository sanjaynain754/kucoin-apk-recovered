package com.sumsub.sns.internal.features.presentation.esign;

import com.sumsub.sns.internal.core.presentation.form.InterfaceC28805l;
import com.sumsub.sns.internal.features.data.model.esign.C29729A;
import com.sumsub.sns.internal.features.data.model.esign.C29787w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.X */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30968X implements InterfaceC28805l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C30997n0 f62579a;

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28805l
    /* JADX INFO: renamed from: a */
    public final List mo69625a(String str, String str2) {
        List list;
        C29729A c29729a = (C29729A) this.f62579a.f62657q.get(StringsKt.replace$default(str2, "sns_doc_", "", false, 4, (Object) null));
        if (c29729a == null || (list = c29729a.f59799b) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((C29787w) it.next());
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            if (((C29787w) obj).f59859b) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        int size2 = arrayList2.size();
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            arrayList3.add("sns_agr_" + ((C29787w) obj2).f59858a);
        }
        return arrayList3;
    }

    public C30968X(C30997n0 c30997n0) {
        this.f62579a = c30997n0;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28805l
    /* JADX INFO: renamed from: b */
    public final String mo69626b(String str, String str2) {
        return (String) this.f62579a.m70557f().get(str2);
    }
}
