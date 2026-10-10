package com.sumsub.sns.internal.features.presentation.simplepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;
import com.sumsub.sns.databinding.C28324D;
import java.util.List;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.simplepicker.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32384e extends ListAdapter implements Filterable {

    /* JADX INFO: renamed from: a */
    public final List f65969a;

    /* JADX INFO: renamed from: b */
    public final Function1 f65970b;

    /* JADX INFO: renamed from: c */
    public final C32383d f65971c;

    public C32384e(List list, Function1 function1) {
        super(new C32385f());
        this.f65969a = list;
        this.f65970b = function1;
        this.f65971c = new C32383d(this);
        submitList(list);
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return this.f65971c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i11) {
        ((C32388i) viewHolder).m71110a((C32387h) getItem(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i11) {
        int i12 = C32388i.f65974g;
        Function1 function1 = this.f65970b;
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.sns_simple_picker_item, viewGroup, false);
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        SNSSubtitle2TextView sNSSubtitle2TextView = (SNSSubtitle2TextView) viewInflate;
        return new C32388i(new C28324D(sNSSubtitle2TextView, sNSSubtitle2TextView), function1);
    }
}
