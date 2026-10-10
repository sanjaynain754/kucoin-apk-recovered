package bv;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.view.NoScrollQuoteViewPager;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.flyco.RankSlidingTabLayout;
import com.kubi.resources.widget.flyco.SlidingTabLayout;

/* JADX INFO: renamed from: bv.v */
/* JADX INFO: compiled from: FragmentQuoteFavoriteBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4698v implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f4559a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f4560b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f4561c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f4562d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f4563e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final RankSlidingTabLayout f4564f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final SlidingTabLayout f4565g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f4566h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final NoScrollQuoteViewPager f4567i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4698v m4708a(@NonNull View view) {
        int i11 = R$id.btnHomeRankAction;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
        if (linearLayout != null) {
            i11 = R$id.ivEdit;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.iv_guide_close;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView2 != null) {
                    i11 = R$id.ll_float_guide;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout2 != null) {
                        i11 = R$id.tabLayout_home;
                        RankSlidingTabLayout rankSlidingTabLayout = (RankSlidingTabLayout) ViewBindings.findChildViewById(view, i11);
                        if (rankSlidingTabLayout != null) {
                            i11 = R$id.tabLayout_quote;
                            SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
                            if (slidingTabLayout != null) {
                                i11 = R$id.tv_guide_action;
                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView != null) {
                                    i11 = R$id.viewPager;
                                    NoScrollQuoteViewPager noScrollQuoteViewPager = (NoScrollQuoteViewPager) ViewBindings.findChildViewById(view, i11);
                                    if (noScrollQuoteViewPager != null) {
                                        return new C4698v((LinearLayoutCompat) view, linearLayout, imageView, imageView2, linearLayout2, rankSlidingTabLayout, slidingTabLayout, baseTextView, noScrollQuoteViewPager);
                                    }
                                }
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
    public LinearLayoutCompat getRoot() {
        return this.f4559a;
    }

    public C4698v(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout2, @NonNull RankSlidingTabLayout rankSlidingTabLayout, @NonNull SlidingTabLayout slidingTabLayout, @NonNull BaseTextView baseTextView, @NonNull NoScrollQuoteViewPager noScrollQuoteViewPager) {
        this.f4559a = linearLayoutCompat;
        this.f4560b = linearLayout;
        this.f4561c = imageView;
        this.f4562d = imageView2;
        this.f4563e = linearLayout2;
        this.f4564f = rankSlidingTabLayout;
        this.f4565g = slidingTabLayout;
        this.f4566h = baseTextView;
        this.f4567i = noScrollQuoteViewPager;
    }
}
