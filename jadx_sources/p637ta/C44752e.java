package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;

/* JADX INFO: renamed from: ta.e */
/* JADX INFO: compiled from: AssetAccountBillFragmentBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44752e implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f99787a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RtlViewPager f99788b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final SlidingTabLayout f99789c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44752e m99018a(@NonNull View view) {
        int i11 = R$id.rtlViewPager;
        RtlViewPager rtlViewPager = (RtlViewPager) ViewBindings.findChildViewById(view, i11);
        if (rtlViewPager != null) {
            i11 = R$id.slidingTabLayout;
            SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
            if (slidingTabLayout != null) {
                return new C44752e((ConstraintLayout) view, rtlViewPager, slidingTabLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f99787a;
    }

    public C44752e(@NonNull ConstraintLayout constraintLayout, @NonNull RtlViewPager rtlViewPager, @NonNull SlidingTabLayout slidingTabLayout) {
        this.f99787a = constraintLayout;
        this.f99788b = rtlViewPager;
        this.f99789c = slidingTabLayout;
    }
}
