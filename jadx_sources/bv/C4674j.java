package bv;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;

/* JADX INFO: renamed from: bv.j */
/* JADX INFO: compiled from: FragmentChanceBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4674j implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f4376a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SlidingTabLayout f4377b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RtlViewPager f4378c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4674j m4660a(@NonNull View view) {
        int i11 = R$id.tabLayout;
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
        if (slidingTabLayout != null) {
            i11 = R$id.viewPager;
            RtlViewPager rtlViewPager = (RtlViewPager) ViewBindings.findChildViewById(view, i11);
            if (rtlViewPager != null) {
                return new C4674j((LinearLayoutCompat) view, slidingTabLayout, rtlViewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f4376a;
    }

    public C4674j(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull SlidingTabLayout slidingTabLayout, @NonNull RtlViewPager rtlViewPager) {
        this.f4376a = linearLayoutCompat;
        this.f4377b = slidingTabLayout;
        this.f4378c = rtlViewPager;
    }
}
