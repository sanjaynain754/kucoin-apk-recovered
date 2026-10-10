package bv;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.view.RankShimmer;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: bv.r */
/* JADX INFO: compiled from: FragmentFavoritePageContainerBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4690r implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f4510a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f4511b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayoutCompat f4512c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f4513d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RankShimmer f4514e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f4515f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final C4650a f4516g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final C4677k0 f4517h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4690r m4692a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.fl_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout != null) {
            i11 = R$id.layoutViewMoreHome;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
            if (linearLayoutCompat != null) {
                i11 = R$id.recycler_view;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                if (recyclerView != null) {
                    i11 = R$id.rs_loading;
                    RankShimmer rankShimmer = (RankShimmer) ViewBindings.findChildViewById(view, i11);
                    if (rankShimmer != null) {
                        i11 = R$id.tvViewMore;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_sort))) != null) {
                            C4650a c4650aM4612a = C4650a.m4612a(viewFindChildViewById);
                            i11 = R$id.view_sort_rank;
                            View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
                            if (viewFindChildViewById2 != null) {
                                return new C4690r((ConstraintLayout) view, frameLayout, linearLayoutCompat, recyclerView, rankShimmer, baseTextView, c4650aM4612a, C4677k0.m4666a(viewFindChildViewById2));
                            }
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
    public ConstraintLayout getRoot() {
        return this.f4510a;
    }

    public C4690r(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull RecyclerView recyclerView, @NonNull RankShimmer rankShimmer, @NonNull BaseTextView baseTextView, @NonNull C4650a c4650a, @NonNull C4677k0 c4677k0) {
        this.f4510a = constraintLayout;
        this.f4511b = frameLayout;
        this.f4512c = linearLayoutCompat;
        this.f4513d = recyclerView;
        this.f4514e = rankShimmer;
        this.f4515f = baseTextView;
        this.f4516g = c4650a;
        this.f4517h = c4677k0;
    }
}
