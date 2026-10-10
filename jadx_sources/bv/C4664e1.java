package bv;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.kubi.quotefacade.R$id;
import com.kubi.resources.widget.flyco.SlidingTabLayout;

/* JADX INFO: renamed from: bv.e1 */
/* JADX INFO: compiled from: WidgetHomeFeedRnBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4664e1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f4307a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SlidingTabLayout f4308b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ViewPager f4309c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f4310d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ConstraintLayout f4311e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final FrameLayout f4312f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayout f4313g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4664e1 m4640a(@NonNull View view) {
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
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                    if (frameLayout != null) {
                        i11 = R$id.quote_home_feed_edit_layout;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                        if (linearLayout != null) {
                            return new C4664e1(constraintLayout, slidingTabLayout, viewPager, imageView, constraintLayout, frameLayout, linearLayout);
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
        return this.f4307a;
    }

    public C4664e1(@NonNull ConstraintLayout constraintLayout, @NonNull SlidingTabLayout slidingTabLayout, @NonNull ViewPager viewPager, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout) {
        this.f4307a = constraintLayout;
        this.f4308b = slidingTabLayout;
        this.f4309c = viewPager;
        this.f4310d = imageView;
        this.f4311e = constraintLayout2;
        this.f4312f = frameLayout;
        this.f4313g = linearLayout;
    }
}
