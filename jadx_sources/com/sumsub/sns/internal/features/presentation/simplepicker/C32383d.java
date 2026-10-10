package com.sumsub.sns.internal.features.presentation.simplepicker;

import android.widget.Filter;
import java.util.ArrayList;
import java.util.List;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.simplepicker.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32383d extends Filter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C32384e f65968a;

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Object obj = filterResults != null ? filterResults.values : null;
        List listEmptyList = obj instanceof List ? (List) obj : null;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        this.f65968a.submitList(listEmptyList);
    }

    public C32383d(C32384e c32384e) {
        this.f65968a = c32384e;
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        List arrayList;
        CharSequence charSequenceTrim = charSequence != null ? StringsKt.trim(charSequence) : null;
        if (charSequenceTrim == null || charSequenceTrim.length() == 0) {
            arrayList = this.f65968a.f65969a;
        } else {
            List list = this.f65968a.f65969a;
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (StringsKt.contains((CharSequence) ((C32387h) obj).f65973b, charSequenceTrim, true)) {
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
