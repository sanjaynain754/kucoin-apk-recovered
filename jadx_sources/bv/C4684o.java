package bv;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.resources.widget.AutoHeightViewPager;
import com.kubi.resources.widget.flyco.SlidingTabLayout;

/* JADX INFO: renamed from: bv.o */
/* JADX INFO: compiled from: FragmentFavAlphaBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4684o implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f4466a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SlidingTabLayout f4467b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AutoHeightViewPager f4468c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4684o m4680a(@NonNull View view) {
        int i11 = R$id.tabLayout;
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
        if (slidingTabLayout != null) {
            i11 = R$id.viewPager;
            AutoHeightViewPager autoHeightViewPager = (AutoHeightViewPager) ViewBindings.findChildViewById(view, i11);
            if (autoHeightViewPager != null) {
                return new C4684o((LinearLayoutCompat) view, slidingTabLayout, autoHeightViewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f4466a;
    }

    public C4684o(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull SlidingTabLayout slidingTabLayout, @NonNull AutoHeightViewPager autoHeightViewPager) {
        this.f4466a = linearLayoutCompat;
        this.f4467b = slidingTabLayout;
        this.f4468c = autoHeightViewPager;
    }
}
