package bv;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.view.RankShimmer;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;

/* JADX INFO: renamed from: bv.z */
/* JADX INFO: compiled from: FragmentRankListBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4706z implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f4643a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayoutCompat f4644b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f4645c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayoutCompat f4646d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RankShimmer f4647e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final SwipeRefreshRecyclerView f4648f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f4649g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final C4677k0 f4650h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4706z m4724a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.layoutViewMore;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
        if (linearLayoutCompat != null) {
            i11 = R$id.rank_list_loading_view;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
            if (frameLayout != null) {
                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) view;
                i11 = R$id.rs_loading;
                RankShimmer rankShimmer = (RankShimmer) ViewBindings.findChildViewById(view, i11);
                if (rankShimmer != null) {
                    i11 = R$id.swipeRecyclerLayout;
                    SwipeRefreshRecyclerView swipeRefreshRecyclerView = (SwipeRefreshRecyclerView) ViewBindings.findChildViewById(view, i11);
                    if (swipeRefreshRecyclerView != null) {
                        i11 = R$id.tvViewMore;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_sort))) != null) {
                            return new C4706z(linearLayoutCompat2, linearLayoutCompat, frameLayout, linearLayoutCompat2, rankShimmer, swipeRefreshRecyclerView, baseTextView, C4677k0.m4666a(viewFindChildViewById));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f4643a;
    }

    public C4706z(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull FrameLayout frameLayout, @NonNull LinearLayoutCompat linearLayoutCompat3, @NonNull RankShimmer rankShimmer, @NonNull SwipeRefreshRecyclerView swipeRefreshRecyclerView, @NonNull BaseTextView baseTextView, @NonNull C4677k0 c4677k0) {
        this.f4643a = linearLayoutCompat;
        this.f4644b = linearLayoutCompat2;
        this.f4645c = frameLayout;
        this.f4646d = linearLayoutCompat3;
        this.f4647e = rankShimmer;
        this.f4648f = swipeRefreshRecyclerView;
        this.f4649g = baseTextView;
        this.f4650h = c4677k0;
    }
}
