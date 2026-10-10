package p270ft;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.viewpager2.SlidingTabLayout;

/* JADX INFO: renamed from: ft.s1 */
/* JADX INFO: compiled from: PaymentFragmentP2pOrderHistoryBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37683s1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f84614a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C37657n0 f84615b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final SlidingTabLayout f84616c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ViewPager2 f84617d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37683s1 m84956a(@NonNull View view) {
        int i11 = R$id.p2p_common_title_bar;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            C37657n0 c37657n0M84897a = C37657n0.m84897a(viewFindChildViewById);
            int i12 = R$id.tab;
            SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i12);
            if (slidingTabLayout != null) {
                i12 = R$id.viewPager;
                ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i12);
                if (viewPager2 != null) {
                    return new C37683s1((LinearLayout) view, c37657n0M84897a, slidingTabLayout, viewPager2);
                }
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f84614a;
    }

    public C37683s1(@NonNull LinearLayout linearLayout, @NonNull C37657n0 c37657n0, @NonNull SlidingTabLayout slidingTabLayout, @NonNull ViewPager2 viewPager2) {
        this.f84614a = linearLayout;
        this.f84615b = c37657n0;
        this.f84616c = slidingTabLayout;
        this.f84617d = viewPager2;
    }
}
