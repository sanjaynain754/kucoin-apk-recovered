package com.sumsub.sns.internal.features.presentation.country.picker;

import android.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.widget.SNSCheckBox;
import com.sumsub.sns.core.widget.SNSFlagView;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;
import com.sumsub.sns.databinding.C28336a;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.features.presentation.country.C30877b;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.country.picker.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30891d extends ListAdapter implements Filterable {

    /* JADX INFO: renamed from: a */
    public final boolean f62403a;

    /* JADX INFO: renamed from: b */
    public final Collator f62404b;

    /* JADX INFO: renamed from: c */
    public final C30887b f62405c;

    /* JADX INFO: renamed from: d */
    public final List f62406d;

    /* JADX INFO: renamed from: e */
    public final Set f62407e;

    /* JADX INFO: renamed from: f */
    public Set f62408f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC41669n f62409g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC41669n f62410h;

    /* JADX INFO: renamed from: a */
    public static final int m70511a(C30891d c30891d, C30877b c30877b, C30877b c30877b2) {
        return c30891d.f62404b.compare(c30877b.f62374b, c30877b2.f62374b);
    }

    public C30891d(List list, Set set, boolean z11, boolean z12) {
        super(new C30885a());
        this.f62403a = z12;
        this.f62404b = Collator.getInstance(C28468k0.f57987e);
        Comparator comparator = new Comparator() { // from class: com.sumsub.sns.internal.features.presentation.country.picker.d0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C30891d.m70511a(this.f62411b, (C30877b) obj, (C30877b) obj2);
            }
        };
        this.f62405c = new C30887b(this);
        list = z11 ? CollectionsKt.sortedWith(list, comparator) : list;
        this.f62406d = list;
        this.f62407e = z12 ? set : SetsKt.emptySet();
        this.f62408f = set;
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(set);
        this.f62409g = interfaceC41669nM91009a;
        this.f62410h = interfaceC41669nM91009a;
        submitList(m70512a(list));
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return this.f62405c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i11) {
        C30877b c30877b = (C30877b) getItem(i11);
        ((C30884F) viewHolder).m70510a(c30877b, this.f62408f.contains(c30877b));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i11) {
        int i12 = C30884F.f62392g;
        C30889c c30889c = new C30889c(this);
        boolean z11 = this.f62403a;
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.sns_countries_list_multiselect_item, viewGroup, false);
        int i13 = R.id.icon;
        SNSFlagView sNSFlagView = (SNSFlagView) ViewBindings.findChildViewById(viewInflate, R.id.icon);
        if (sNSFlagView != null) {
            i13 = R$id.sns_checkbox;
            SNSCheckBox sNSCheckBox = (SNSCheckBox) ViewBindings.findChildViewById(viewInflate, i13);
            if (sNSCheckBox != null) {
                i13 = R.id.text1;
                SNSSubtitle2TextView sNSSubtitle2TextView = (SNSSubtitle2TextView) ViewBindings.findChildViewById(viewInflate, R.id.text1);
                if (sNSSubtitle2TextView != null) {
                    return new C30884F(new C28336a((ConstraintLayout) viewInflate, sNSFlagView, sNSCheckBox, sNSSubtitle2TextView), c30889c, z11);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i13)));
    }

    /* JADX INFO: renamed from: a */
    public final List m70512a(List list) {
        if (this.f62407e.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (this.f62407e.contains((C30877b) obj)) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        return CollectionsKt.plus((Collection) pair.component1(), (Iterable) pair.component2());
    }
}
