package com.sumsub.sns.internal.nfc;

import java.util.ArrayList;
import java.util.Iterator;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.nfc.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC33375d {
    /* JADX INFO: renamed from: a */
    public static ArrayList m71675a(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null).iterator();
        while (it.hasNext()) {
            Short sh2 = (Short) C33381j.f68080e.get((String) it.next());
            if (sh2 != null) {
                arrayList.add(Short.valueOf(sh2.shortValue()));
            }
        }
        return arrayList;
    }
}
