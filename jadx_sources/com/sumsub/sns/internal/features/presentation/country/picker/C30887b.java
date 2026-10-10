package com.sumsub.sns.internal.features.presentation.country.picker;

import android.widget.Filter;
import com.sumsub.sns.internal.features.presentation.country.C30877b;
import java.util.ArrayList;
import java.util.List;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.country.picker.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30887b extends Filter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C30891d f62399a;

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Object obj = filterResults != null ? filterResults.values : null;
        List listEmptyList = obj instanceof List ? (List) obj : null;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        C30891d c30891d = this.f62399a;
        c30891d.submitList(c30891d.m70512a(listEmptyList));
    }

    public C30887b(C30891d c30891d) {
        this.f62399a = c30891d;
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        List arrayList;
        CharSequence charSequenceTrim = charSequence != null ? StringsKt.trim(charSequence) : null;
        if (charSequenceTrim == null || charSequenceTrim.length() == 0) {
            arrayList = this.f62399a.f62406d;
        } else {
            List list = this.f62399a.f62406d;
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (StringsKt.contains((CharSequence) ((C30877b) obj).f62374b, charSequenceTrim, true)) {
                    arrayList.add(obj);
                }
            }
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        filterResults.values = arrayList;
        filterResults.count = arrayList.size();
        return filterResults;
    }
}
