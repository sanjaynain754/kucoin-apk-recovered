package n30;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.tradebase.R$id;

/* JADX INFO: renamed from: n30.b */
/* JADX INFO: compiled from: BkumexSelectTradeTypeOfHistoryPopBinding.java */
/* JADX INFO: loaded from: classes48.dex */
public final class C42726b implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f94570a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f94571b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f94572c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42726b m93623a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView == null || (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_shadow))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        return new C42726b((LinearLayoutCompat) view, recyclerView, viewFindChildViewById);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f94570a;
    }

    public C42726b(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull RecyclerView recyclerView, @NonNull View view) {
        this.f94570a = linearLayoutCompat;
        this.f94571b = recyclerView;
        this.f94572c = view;
    }
}
