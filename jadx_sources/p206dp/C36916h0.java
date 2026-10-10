package p206dp;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;

/* JADX INFO: renamed from: dp.h0 */
/* JADX INFO: compiled from: BmarginFragmentSymbolsBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36916h0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81726a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ClearEditText f81727b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f81728c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final SlidingTabLayout f81729d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RtlViewPager f81730e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36916h0 m82701a(@NonNull View view) {
        int i11 = R$id.et_search;
        ClearEditText clearEditText = (ClearEditText) ViewBindings.findChildViewById(view, i11);
        if (clearEditText != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i11 = R$id.tab_margin_type_layout;
            SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
            if (slidingTabLayout != null) {
                i11 = R$id.view_margin_symbol_pager;
                RtlViewPager rtlViewPager = (RtlViewPager) ViewBindings.findChildViewById(view, i11);
                if (rtlViewPager != null) {
                    return new C36916h0(linearLayout, clearEditText, linearLayout, slidingTabLayout, rtlViewPager);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f81726a;
    }

    public C36916h0(@NonNull LinearLayout linearLayout, @NonNull ClearEditText clearEditText, @NonNull LinearLayout linearLayout2, @NonNull SlidingTabLayout slidingTabLayout, @NonNull RtlViewPager rtlViewPager) {
        this.f81726a = linearLayout;
        this.f81727b = clearEditText;
        this.f81728c = linearLayout2;
        this.f81729d = slidingTabLayout;
        this.f81730e = rtlViewPager;
    }
}
