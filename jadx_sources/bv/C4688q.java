package bv;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;

/* JADX INFO: renamed from: bv.q */
/* JADX INFO: compiled from: FragmentFavoriteEditContainerFragmentBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4688q implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f4494a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SlidingTabLayout f4495b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RtlViewPager f4496c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4688q m4688a(@NonNull View view) {
        int i11 = R$id.tabLayout;
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
        if (slidingTabLayout != null) {
            i11 = R$id.viewPager;
            RtlViewPager rtlViewPager = (RtlViewPager) ViewBindings.findChildViewById(view, i11);
            if (rtlViewPager != null) {
                return new C4688q((LinearLayoutCompat) view, slidingTabLayout, rtlViewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f4494a;
    }

    public C4688q(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull SlidingTabLayout slidingTabLayout, @NonNull RtlViewPager rtlViewPager) {
        this.f4494a = linearLayoutCompat;
        this.f4495b = slidingTabLayout;
        this.f4496c = rtlViewPager;
    }
}
