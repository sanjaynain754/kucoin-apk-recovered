package bv;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.view.NoScrollQuoteViewPager;
import com.kubi.resources.widget.flyco.RankSlidingTabLayout;

/* JADX INFO: renamed from: bv.x */
/* JADX INFO: compiled from: FragmentRankBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4702x implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f4604a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RankSlidingTabLayout f4605b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f4606c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f4607d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final NoScrollQuoteViewPager f4608e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4702x m4716a(@NonNull View view) {
        int i11 = R$id.tabLayout;
        RankSlidingTabLayout rankSlidingTabLayout = (RankSlidingTabLayout) ViewBindings.findChildViewById(view, i11);
        if (rankSlidingTabLayout != null) {
            i11 = R$id.tabLayout_end;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.tabLayout_start;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView2 != null) {
                    i11 = R$id.viewPager;
                    NoScrollQuoteViewPager noScrollQuoteViewPager = (NoScrollQuoteViewPager) ViewBindings.findChildViewById(view, i11);
                    if (noScrollQuoteViewPager != null) {
                        return new C4702x((ConstraintLayout) view, rankSlidingTabLayout, imageView, imageView2, noScrollQuoteViewPager);
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
        return this.f4604a;
    }

    public C4702x(@NonNull ConstraintLayout constraintLayout, @NonNull RankSlidingTabLayout rankSlidingTabLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull NoScrollQuoteViewPager noScrollQuoteViewPager) {
        this.f4604a = constraintLayout;
        this.f4605b = rankSlidingTabLayout;
        this.f4606c = imageView;
        this.f4607d = imageView2;
        this.f4608e = noScrollQuoteViewPager;
    }
}
