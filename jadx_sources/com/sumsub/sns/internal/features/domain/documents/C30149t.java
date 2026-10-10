package com.sumsub.sns.internal.features.domain.documents;

import android.text.Spanned;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.domain.C28547d;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29121g2;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.remote.C29307Y0;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.extensions.InterfaceC30000a;
import com.sumsub.sns.internal.features.domain.C30217h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.documents.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public class C30149t {

    /* JADX INFO: renamed from: a */
    public final InterfaceC30000a f60587a;

    /* JADX INFO: renamed from: a */
    public static final CharSequence m70114a(Spanned spanned) {
        return spanned;
    }

    /* JADX INFO: renamed from: a */
    public final Object m70116a(C29124h c29124h, C30145p c30145p, C29983l c29983l) {
        String strMo70117a;
        List list;
        String str;
        Map mapM69780f;
        String str2;
        try {
            List list2 = c30145p.f60581c;
            List list3 = c30145p.f60582d;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC28462i0.m69364a(AbstractC29121g2.m69769a((String) it.next()).m69801a(c29983l, null), ((C28547d) this.f60587a).f58099a.f58163a));
            }
            final String strJoinToString$default = CollectionsKt.joinToString$default(arrayList, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, null, null, 0, null, new Function1() { // from class: com.sumsub.sns.internal.features.domain.documents.a0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C30149t.m70114a((Spanned) obj);
                }
            }, 30, null);
            Function1 function1 = new Function1() { // from class: com.sumsub.sns.internal.features.domain.documents.b0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C30149t.m70115a(strJoinToString$default, (String) obj);
                }
            };
            List<C30217h0> listFilterNotNull = CollectionsKt.filterNotNull(list3);
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listFilterNotNull, 10)), 16));
            for (C30217h0 c30217h0 : listFilterNotNull) {
                C29307Y0 c29307y0 = c30217h0.f60735b;
                if (c29307y0 == null || (list = c29307y0.f59319d) == null || (str = (String) CollectionsKt.firstOrNull(list)) == null) {
                    strMo70117a = null;
                } else {
                    strMo70117a = mo70117a(str, c29124h != null ? AbstractC29130i.m69780f(c29124h) : null);
                    if (c29124h != null && (mapM69780f = AbstractC29130i.m69780f(c29124h)) != null && (str2 = (String) mapM69780f.get(strMo70117a)) != null) {
                        strMo70117a = str2;
                    }
                }
                Pair pairM90091to = TuplesKt.m90091to(c30217h0.f60734a, function1.invoke(strMo70117a));
                linkedHashMap.put(pairM90091to.getFirst(), pairM90091to.getSecond());
            }
            return Result.m103844constructorimpl(linkedHashMap);
        } catch (Exception e11) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(e11));
        }
    }

    public C30149t(InterfaceC30000a interfaceC30000a) {
        this.f60587a = interfaceC30000a;
    }

    /* JADX INFO: renamed from: a */
    public static final String m70115a(String str, String str2) {
        if (str2 != null) {
            return StringsKt.replace$default(str2, "{docTypes}", str, false, 4, (Object) null);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public String mo70117a(String str, Map map) {
        return (map != null ? (String) map.get(str) : null) != null ? str : "default";
    }
}
