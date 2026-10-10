package p206dp;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ViewSwitcher;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;

/* JADX INFO: renamed from: dp.i0 */
/* JADX INFO: compiled from: BmarginFragmentToggleSymbolsBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36918i0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81734a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f81735b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f81736c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final SlidingTabLayout f81737d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RtlViewPager f81738e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ViewSwitcher f81739f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36918i0 m82704a(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R$id.rcv_search;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            i11 = R$id.tab_layout;
            SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
            if (slidingTabLayout != null) {
                i11 = R$id.view_pager;
                RtlViewPager rtlViewPager = (RtlViewPager) ViewBindings.findChildViewById(view, i11);
                if (rtlViewPager != null) {
                    i11 = R$id.view_switcher;
                    ViewSwitcher viewSwitcher = (ViewSwitcher) ViewBindings.findChildViewById(view, i11);
                    if (viewSwitcher != null) {
                        return new C36918i0(linearLayout, linearLayout, recyclerView, slidingTabLayout, rtlViewPager, viewSwitcher);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f81734a;
    }

    public C36918i0(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull SlidingTabLayout slidingTabLayout, @NonNull RtlViewPager rtlViewPager, @NonNull ViewSwitcher viewSwitcher) {
        this.f81734a = linearLayout;
        this.f81735b = linearLayout2;
        this.f81736c = recyclerView;
        this.f81737d = slidingTabLayout;
        this.f81738e = rtlViewPager;
        this.f81739f = viewSwitcher;
    }
}
