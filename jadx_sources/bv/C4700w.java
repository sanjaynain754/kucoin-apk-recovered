package bv;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.view.NoScrollQuoteViewPager;
import com.kubi.resources.widget.flyco.SlidingTabLayout;

/* JADX INFO: renamed from: bv.w */
/* JADX INFO: compiled from: FragmentQuoteMarketContainerBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4700w implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f4586a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SlidingTabLayout f4587b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final NoScrollQuoteViewPager f4588c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4700w m4712a(@NonNull View view) {
        int i11 = R$id.tabLayout;
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
        if (slidingTabLayout != null) {
            i11 = R$id.viewPager;
            NoScrollQuoteViewPager noScrollQuoteViewPager = (NoScrollQuoteViewPager) ViewBindings.findChildViewById(view, i11);
            if (noScrollQuoteViewPager != null) {
                return new C4700w((LinearLayoutCompat) view, slidingTabLayout, noScrollQuoteViewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f4586a;
    }

    public C4700w(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull SlidingTabLayout slidingTabLayout, @NonNull NoScrollQuoteViewPager noScrollQuoteViewPager) {
        this.f4586a = linearLayoutCompat;
        this.f4587b = slidingTabLayout;
        this.f4588c = noScrollQuoteViewPager;
    }
}
