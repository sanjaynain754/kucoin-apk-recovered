package bv;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.view.RankShimmer;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;

/* JADX INFO: renamed from: bv.c */
/* JADX INFO: compiled from: FragmentAlphaListBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4656c implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f4243a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RankShimmer f4244b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final SwipeRefreshRecyclerView f4245c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4656c m4624a(@NonNull View view) {
        int i11 = R$id.rs_loading;
        RankShimmer rankShimmer = (RankShimmer) ViewBindings.findChildViewById(view, i11);
        if (rankShimmer != null) {
            i11 = R$id.swipeRecyclerLayout;
            SwipeRefreshRecyclerView swipeRefreshRecyclerView = (SwipeRefreshRecyclerView) ViewBindings.findChildViewById(view, i11);
            if (swipeRefreshRecyclerView != null) {
                return new C4656c((FrameLayout) view, rankShimmer, swipeRefreshRecyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f4243a;
    }

    public C4656c(@NonNull FrameLayout frameLayout, @NonNull RankShimmer rankShimmer, @NonNull SwipeRefreshRecyclerView swipeRefreshRecyclerView) {
        this.f4243a = frameLayout;
        this.f4244b = rankShimmer;
        this.f4245c = swipeRefreshRecyclerView;
    }
}
