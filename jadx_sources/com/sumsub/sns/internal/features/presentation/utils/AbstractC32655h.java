package com.sumsub.sns.internal.features.presentation.utils;

import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.core.presentation.form.model.C28827V;
import com.sumsub.sns.internal.core.presentation.form.model.C28865w;
import com.sumsub.sns.internal.features.data.model.common.AbstractC28985C;
import com.sumsub.sns.internal.features.data.model.common.C28975A;
import com.sumsub.sns.internal.features.data.model.common.C28980B;
import com.sumsub.sns.internal.features.data.model.common.C29724z;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29494N;
import java.util.ArrayList;
import java.util.List;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.utils.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC32655h {
    /* JADX INFO: renamed from: a */
    public static final AbstractC28841e0 m71277a(AbstractC28985C abstractC28985C, String str) {
        if (!(abstractC28985C instanceof C28975A)) {
            if (abstractC28985C instanceof C28980B) {
                return new C28865w(((C28980B) abstractC28985C).f58903b.toString(), "appdata");
            }
            throw new NoWhenBranchMatchedException();
        }
        C28975A c28975a = (C28975A) abstractC28985C;
        List<C29724z> list = c28975a.f58900d;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (C29724z c29724z : list) {
            arrayList.add(new C29494N(c29724z.f59791a, c29724z.f59792b));
        }
        C29470F c29470f = new C29470F(str, c28975a.f58898b, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, arrayList, 764);
        C29494N c29494n = (C29494N) CollectionsKt.getOrNull(arrayList, c28975a.f58899c);
        return new C28827V(c29470f, "appdata", c29494n != null ? c29494n.f59517a : null, false, (CharSequence) null, 56);
    }
}
