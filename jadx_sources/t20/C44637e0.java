package t20;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ViewSwitcher;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.e0 */
/* JADX INFO: compiled from: FragmentToggleSymbolsBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44637e0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99051a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ClearEditText f99052b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f99053c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f99054d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final SlidingTabLayout f99055e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f99056f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RtlViewPager f99057g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ViewSwitcher f99058h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44637e0 m98751a(@NonNull View view) {
        int i11 = R$id.et_search;
        ClearEditText clearEditText = (ClearEditText) ViewBindings.findChildViewById(view, i11);
        if (clearEditText != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i11 = R$id.rcv_search;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
            if (recyclerView != null) {
                i11 = R$id.tab_layout;
                SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
                if (slidingTabLayout != null) {
                    i11 = R$id.tvTitle;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.view_pager;
                        RtlViewPager rtlViewPager = (RtlViewPager) ViewBindings.findChildViewById(view, i11);
                        if (rtlViewPager != null) {
                            i11 = R$id.view_switcher;
                            ViewSwitcher viewSwitcher = (ViewSwitcher) ViewBindings.findChildViewById(view, i11);
                            if (viewSwitcher != null) {
                                return new C44637e0(linearLayout, clearEditText, linearLayout, recyclerView, slidingTabLayout, baseTextView, rtlViewPager, viewSwitcher);
                            }
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
    public LinearLayout getRoot() {
        return this.f99051a;
    }

    public C44637e0(@NonNull LinearLayout linearLayout, @NonNull ClearEditText clearEditText, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull SlidingTabLayout slidingTabLayout, @NonNull BaseTextView baseTextView, @NonNull RtlViewPager rtlViewPager, @NonNull ViewSwitcher viewSwitcher) {
        this.f99051a = linearLayout;
        this.f99052b = clearEditText;
        this.f99053c = linearLayout2;
        this.f99054d = recyclerView;
        this.f99055e = slidingTabLayout;
        this.f99056f = baseTextView;
        this.f99057g = rtlViewPager;
        this.f99058h = viewSwitcher;
    }
}
