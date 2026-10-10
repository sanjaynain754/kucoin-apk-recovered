package v30;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;
import com.kubi.tradecorebiz.R$id;

/* JADX INFO: renamed from: v30.i */
/* JADX INFO: compiled from: BkucoinMultiTabBottomDialogBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45386i implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f102134a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RtlViewPager f102135b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final SlidingTabLayout f102136c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45386i m100306a(@NonNull View view) {
        int i11 = R$id.rtlViewPager;
        RtlViewPager rtlViewPager = (RtlViewPager) ViewBindings.findChildViewById(view, i11);
        if (rtlViewPager != null) {
            i11 = R$id.slidingTabLayout;
            SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
            if (slidingTabLayout != null) {
                return new C45386i((LinearLayout) view, rtlViewPager, slidingTabLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f102134a;
    }

    public C45386i(@NonNull LinearLayout linearLayout, @NonNull RtlViewPager rtlViewPager, @NonNull SlidingTabLayout slidingTabLayout) {
        this.f102134a = linearLayout;
        this.f102135b = rtlViewPager;
        this.f102136c = slidingTabLayout;
    }
}
