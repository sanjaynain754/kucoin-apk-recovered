package p270ft;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.viewpager2.SlidingTabLayout;

/* JADX INFO: renamed from: ft.t1 */
/* JADX INFO: compiled from: PaymentFragmentP2pOrderHistoryChildBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37688t1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f84666a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SlidingTabLayout f84667b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ViewPager2 f84668c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37688t1 m84967a(@NonNull View view) {
        int i11 = R$id.tab;
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
        if (slidingTabLayout != null) {
            i11 = R$id.viewPager;
            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i11);
            if (viewPager2 != null) {
                return new C37688t1((LinearLayout) view, slidingTabLayout, viewPager2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f84666a;
    }

    public C37688t1(@NonNull LinearLayout linearLayout, @NonNull SlidingTabLayout slidingTabLayout, @NonNull ViewPager2 viewPager2) {
        this.f84666a = linearLayout;
        this.f84667b = slidingTabLayout;
        this.f84668c = viewPager2;
    }
}
