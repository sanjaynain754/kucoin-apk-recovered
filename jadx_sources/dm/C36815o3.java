package dm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;

/* JADX INFO: renamed from: dm.o3 */
/* JADX INFO: compiled from: BkumexFragmentWelfareHistoryBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36815o3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f80734a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SlidingTabLayout f80735b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RtlViewPager f80736c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36815o3 m82491a(@NonNull View view) {
        int i11 = R$id.tab_layout;
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
        if (slidingTabLayout != null) {
            i11 = R$id.viewPager;
            RtlViewPager rtlViewPager = (RtlViewPager) ViewBindings.findChildViewById(view, i11);
            if (rtlViewPager != null) {
                return new C36815o3((LinearLayout) view, slidingTabLayout, rtlViewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f80734a;
    }

    public C36815o3(@NonNull LinearLayout linearLayout, @NonNull SlidingTabLayout slidingTabLayout, @NonNull RtlViewPager rtlViewPager) {
        this.f80734a = linearLayout;
        this.f80735b = slidingTabLayout;
        this.f80736c = rtlViewPager;
    }
}
