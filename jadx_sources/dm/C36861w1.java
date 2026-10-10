package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;

/* JADX INFO: renamed from: dm.w1 */
/* JADX INFO: compiled from: BkumexFragmentContractRecordBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36861w1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f81277a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SlidingTabLayout f81278b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RtlViewPager f81279c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36861w1 m82587a(@NonNull View view) {
        int i11 = R$id.actionTab;
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
        if (slidingTabLayout != null) {
            i11 = R$id.viewPager;
            RtlViewPager rtlViewPager = (RtlViewPager) ViewBindings.findChildViewById(view, i11);
            if (rtlViewPager != null) {
                return new C36861w1((LinearLayoutCompat) view, slidingTabLayout, rtlViewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f81277a;
    }

    public C36861w1(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull SlidingTabLayout slidingTabLayout, @NonNull RtlViewPager rtlViewPager) {
        this.f81277a = linearLayoutCompat;
        this.f81278b = slidingTabLayout;
        this.f81279c = rtlViewPager;
    }
}
