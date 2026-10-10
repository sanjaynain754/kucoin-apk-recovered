package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.sdk.widget.TitleBar;

/* JADX INFO: renamed from: ta.q5 */
/* JADX INFO: compiled from: LayoutSwitchFragmentbarBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44849q5 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f100696a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SlidingTabLayout f100697b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TitleBar f100698c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final CustomViewPager f100699d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44849q5 m99223a(@NonNull View view) {
        int i11 = R$id.tabLayout;
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
        if (slidingTabLayout != null) {
            i11 = R$id.titleBar;
            TitleBar titleBar = (TitleBar) ViewBindings.findChildViewById(view, i11);
            if (titleBar != null) {
                i11 = R$id.viewPager;
                CustomViewPager customViewPager = (CustomViewPager) ViewBindings.findChildViewById(view, i11);
                if (customViewPager != null) {
                    return new C44849q5((ConstraintLayout) view, slidingTabLayout, titleBar, customViewPager);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f100696a;
    }

    public C44849q5(@NonNull ConstraintLayout constraintLayout, @NonNull SlidingTabLayout slidingTabLayout, @NonNull TitleBar titleBar, @NonNull CustomViewPager customViewPager) {
        this.f100696a = constraintLayout;
        this.f100697b = slidingTabLayout;
        this.f100698c = titleBar;
        this.f100699d = customViewPager;
    }
}
