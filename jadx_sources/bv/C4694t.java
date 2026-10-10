package bv;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.view.RankShimmer;

/* JADX INFO: renamed from: bv.t */
/* JADX INFO: compiled from: FragmentHoldingsContainerBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4694t implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f4532a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f4533b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RankShimmer f4534c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final C4654b0 f4535d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4694t m4700a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.fragment_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout != null) {
            i11 = R$id.rsLoading;
            RankShimmer rankShimmer = (RankShimmer) ViewBindings.findChildViewById(view, i11);
            if (rankShimmer != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_take_place))) != null) {
                return new C4694t((FrameLayout) view, frameLayout, rankShimmer, C4654b0.m4620a(viewFindChildViewById));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f4532a;
    }

    public C4694t(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull RankShimmer rankShimmer, @NonNull C4654b0 c4654b0) {
        this.f4532a = frameLayout;
        this.f4533b = frameLayout2;
        this.f4534c = rankShimmer;
        this.f4535d = c4654b0;
    }
}
