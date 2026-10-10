package bv;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.kubi.quotefacade.R$id;
import com.kubi.resources.widget.viewpager2.SlidingTabLayout;

/* JADX INFO: renamed from: bv.n */
/* JADX INFO: compiled from: FragmentEtfMarketBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4682n implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f4460a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SlidingTabLayout f4461b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ViewPager2 f4462c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4682n m4676a(@NonNull View view) {
        int i11 = R$id.actionTab;
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
        if (slidingTabLayout != null) {
            i11 = R$id.viewPager;
            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i11);
            if (viewPager2 != null) {
                return new C4682n((LinearLayout) view, slidingTabLayout, viewPager2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f4460a;
    }

    public C4682n(@NonNull LinearLayout linearLayout, @NonNull SlidingTabLayout slidingTabLayout, @NonNull ViewPager2 viewPager2) {
        this.f4460a = linearLayout;
        this.f4461b = slidingTabLayout;
        this.f4462c = viewPager2;
    }
}
