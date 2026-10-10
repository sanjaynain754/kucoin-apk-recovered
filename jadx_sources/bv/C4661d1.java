package bv;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.kubi.quotefacade.R$id;
import com.kubi.resources.widget.flyco.SlidingTabLayout;

/* JADX INFO: renamed from: bv.d1 */
/* JADX INFO: compiled from: WidgetHomeFeedBinding.java */
/* JADX INFO: loaded from: classes12.dex */
public final class C4661d1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f4279a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SlidingTabLayout f4280b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ViewPager f4281c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f4282d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ConstraintLayout f4283e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final FragmentContainerView f4284f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayout f4285g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4661d1 m4634a(@NonNull View view) {
        int i11 = R$id.feed_card_tab_layout;
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
        if (slidingTabLayout != null) {
            i11 = R$id.feed_tab_vp;
            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, i11);
            if (viewPager != null) {
                i11 = R$id.home_feed_edit_icon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i11 = R$id.quote_home_feed_container;
                    FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i11);
                    if (fragmentContainerView != null) {
                        i11 = R$id.quote_home_feed_edit_layout;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                        if (linearLayout != null) {
                            return new C4661d1(constraintLayout, slidingTabLayout, viewPager, imageView, constraintLayout, fragmentContainerView, linearLayout);
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
    public ConstraintLayout getRoot() {
        return this.f4279a;
    }

    public C4661d1(@NonNull ConstraintLayout constraintLayout, @NonNull SlidingTabLayout slidingTabLayout, @NonNull ViewPager viewPager, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull FragmentContainerView fragmentContainerView, @NonNull LinearLayout linearLayout) {
        this.f4279a = constraintLayout;
        this.f4280b = slidingTabLayout;
        this.f4281c = viewPager;
        this.f4282d = imageView;
        this.f4283e = constraintLayout2;
        this.f4284f = fragmentContainerView;
        this.f4285g = linearLayout;
    }
}
