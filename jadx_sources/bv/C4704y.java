package bv;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.view.NoScrollQuoteViewPager;
import com.kubi.resources.widget.flyco.RankSlidingTabLayout;

/* JADX INFO: renamed from: bv.y */
/* JADX INFO: compiled from: FragmentRankContainerBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4704y implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f4626a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RankSlidingTabLayout f4627b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f4628c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final NoScrollQuoteViewPager f4629d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4704y m4720a(@NonNull View view) {
        int i11 = R$id.actionTab;
        RankSlidingTabLayout rankSlidingTabLayout = (RankSlidingTabLayout) ViewBindings.findChildViewById(view, i11);
        if (rankSlidingTabLayout != null) {
            i11 = R$id.btnHomeRankAction;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout != null) {
                i11 = R$id.viewPager;
                NoScrollQuoteViewPager noScrollQuoteViewPager = (NoScrollQuoteViewPager) ViewBindings.findChildViewById(view, i11);
                if (noScrollQuoteViewPager != null) {
                    return new C4704y((LinearLayoutCompat) view, rankSlidingTabLayout, linearLayout, noScrollQuoteViewPager);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f4626a;
    }

    public C4704y(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull RankSlidingTabLayout rankSlidingTabLayout, @NonNull LinearLayout linearLayout, @NonNull NoScrollQuoteViewPager noScrollQuoteViewPager) {
        this.f4626a = linearLayoutCompat;
        this.f4627b = rankSlidingTabLayout;
        this.f4628c = linearLayout;
        this.f4629d = noScrollQuoteViewPager;
    }
}
