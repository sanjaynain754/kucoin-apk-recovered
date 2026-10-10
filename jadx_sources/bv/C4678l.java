package bv;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.view.RankShimmer;

/* JADX INFO: renamed from: bv.l */
/* JADX INFO: compiled from: FragmentCommonListBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4678l implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f4413a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C4681m0 f4414b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f4415c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RankShimmer f4416d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4678l m4668a(@NonNull View view) {
        int i11 = R$id.common_sort;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            C4681m0 c4681m0M4674a = C4681m0.m4674a(viewFindChildViewById);
            int i12 = R$id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i12);
            if (recyclerView != null) {
                i12 = R$id.rs_loading;
                RankShimmer rankShimmer = (RankShimmer) ViewBindings.findChildViewById(view, i12);
                if (rankShimmer != null) {
                    return new C4678l((LinearLayout) view, c4681m0M4674a, recyclerView, rankShimmer);
                }
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f4413a;
    }

    public C4678l(@NonNull LinearLayout linearLayout, @NonNull C4681m0 c4681m0, @NonNull RecyclerView recyclerView, @NonNull RankShimmer rankShimmer) {
        this.f4413a = linearLayout;
        this.f4414b = c4681m0;
        this.f4415c = recyclerView;
        this.f4416d = rankShimmer;
    }
}
