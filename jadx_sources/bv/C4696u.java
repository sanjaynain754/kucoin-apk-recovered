package bv;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.view.NoScrollQuoteViewPager;
import com.kubi.resources.widget.flyco.SlidingTabLayout;

/* JADX INFO: renamed from: bv.u */
/* JADX INFO: compiled from: FragmentQuoteAlphaBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4696u implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f4541a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SlidingTabLayout f4542b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final NoScrollQuoteViewPager f4543c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4696u m4704a(@NonNull View view) {
        int i11 = R$id.tabLayout;
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
        if (slidingTabLayout != null) {
            i11 = R$id.viewPager;
            NoScrollQuoteViewPager noScrollQuoteViewPager = (NoScrollQuoteViewPager) ViewBindings.findChildViewById(view, i11);
            if (noScrollQuoteViewPager != null) {
                return new C4696u((LinearLayoutCompat) view, slidingTabLayout, noScrollQuoteViewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f4541a;
    }

    public C4696u(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull SlidingTabLayout slidingTabLayout, @NonNull NoScrollQuoteViewPager noScrollQuoteViewPager) {
        this.f4541a = linearLayoutCompat;
        this.f4542b = slidingTabLayout;
        this.f4543c = noScrollQuoteViewPager;
    }
}
