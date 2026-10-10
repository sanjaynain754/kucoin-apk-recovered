package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.flyco.SlidingTabLayout;

/* JADX INFO: renamed from: ta.o0 */
/* JADX INFO: compiled from: AssetFragmentConvertHistoryBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44830o0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f100530a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SlidingTabLayout f100531b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final CustomViewPager f100532c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44830o0 m99186a(@NonNull View view) {
        int i11 = R$id.tabLayout;
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
        if (slidingTabLayout != null) {
            i11 = R$id.viewPager;
            CustomViewPager customViewPager = (CustomViewPager) ViewBindings.findChildViewById(view, i11);
            if (customViewPager != null) {
                return new C44830o0((ConstraintLayout) view, slidingTabLayout, customViewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f100530a;
    }

    public C44830o0(@NonNull ConstraintLayout constraintLayout, @NonNull SlidingTabLayout slidingTabLayout, @NonNull CustomViewPager customViewPager) {
        this.f100530a = constraintLayout;
        this.f100531b = slidingTabLayout;
        this.f100532c = customViewPager;
    }
}
