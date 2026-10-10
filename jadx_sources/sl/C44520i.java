package sl;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kucoin.market.monitor.lib.R$id;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;

/* JADX INFO: renamed from: sl.i */
/* JADX INFO: compiled from: MarketMonitorFragmentChooseSymbolBinding.java */
/* JADX INFO: loaded from: classes19.dex */
public final class C44520i implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f98667a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SlidingTabLayout f98668b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RtlViewPager f98669c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44520i m98500a(@NonNull View view) {
        int i11 = R$id.tab_layout;
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
        if (slidingTabLayout != null) {
            i11 = R$id.view_pager;
            RtlViewPager rtlViewPager = (RtlViewPager) ViewBindings.findChildViewById(view, i11);
            if (rtlViewPager != null) {
                return new C44520i((LinearLayout) view, slidingTabLayout, rtlViewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f98667a;
    }

    public C44520i(@NonNull LinearLayout linearLayout, @NonNull SlidingTabLayout slidingTabLayout, @NonNull RtlViewPager rtlViewPager) {
        this.f98667a = linearLayout;
        this.f98668b = slidingTabLayout;
        this.f98669c = rtlViewPager;
    }
}
