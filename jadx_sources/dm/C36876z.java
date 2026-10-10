package dm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;

/* JADX INFO: renamed from: dm.z */
/* JADX INFO: compiled from: BkumexDialogFuturesMoreMenuBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36876z implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81395a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RtlViewPager f81396b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final SlidingTabLayout f81397c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36876z m82620a(@NonNull View view) {
        int i11 = R$id.rtlViewPager;
        RtlViewPager rtlViewPager = (RtlViewPager) ViewBindings.findChildViewById(view, i11);
        if (rtlViewPager != null) {
            i11 = R$id.slidingTabLayout;
            SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
            if (slidingTabLayout != null) {
                return new C36876z((LinearLayout) view, rtlViewPager, slidingTabLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f81395a;
    }

    public C36876z(@NonNull LinearLayout linearLayout, @NonNull RtlViewPager rtlViewPager, @NonNull SlidingTabLayout slidingTabLayout) {
        this.f81395a = linearLayout;
        this.f81396b = rtlViewPager;
        this.f81397c = slidingTabLayout;
    }
}
