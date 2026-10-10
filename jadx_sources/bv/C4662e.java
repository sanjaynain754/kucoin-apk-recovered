package bv;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.view.CanScrollQuoteViewPager;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.flyco.SlidingTabLayout;

/* JADX INFO: renamed from: bv.e */
/* JADX INFO: compiled from: FragmentChainContainerBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4662e implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f4286a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f4287b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f4288c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f4289d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final SlidingTabLayout f4290e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final CanScrollQuoteViewPager f4291f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4662e m4636a(@NonNull View view) {
        int i11 = R$id.chain_filter_layout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
        if (linearLayout != null) {
            i11 = R$id.iv_filter;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.iv_time;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.tabLayout;
                    SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
                    if (slidingTabLayout != null) {
                        i11 = R$id.viewPager;
                        CanScrollQuoteViewPager canScrollQuoteViewPager = (CanScrollQuoteViewPager) ViewBindings.findChildViewById(view, i11);
                        if (canScrollQuoteViewPager != null) {
                            return new C4662e((LinearLayoutCompat) view, linearLayout, appCompatImageView, baseTextView, slidingTabLayout, canScrollQuoteViewPager);
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
        return this.f4286a;
    }

    public C4662e(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayout linearLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView, @NonNull SlidingTabLayout slidingTabLayout, @NonNull CanScrollQuoteViewPager canScrollQuoteViewPager) {
        this.f4286a = linearLayoutCompat;
        this.f4287b = linearLayout;
        this.f4288c = appCompatImageView;
        this.f4289d = baseTextView;
        this.f4290e = slidingTabLayout;
        this.f4291f = canScrollQuoteViewPager;
    }
}
