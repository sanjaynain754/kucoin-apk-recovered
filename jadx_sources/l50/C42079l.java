package l50;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ViewSwitcher;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;
import com.kubi.tradingbotkit.R$id;

/* JADX INFO: renamed from: l50.l */
/* JADX INFO: compiled from: BtradingBotKitFragmentToggleSymbolsBinding.java */
/* JADX INFO: loaded from: classes51.dex */
public final class C42079l implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f93022a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ClearEditText f93023b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f93024c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f93025d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final SlidingTabLayout f93026e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatTextView f93027f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RtlViewPager f93028g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ViewSwitcher f93029h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42079l m92311a(@NonNull View view) {
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
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatTextView != null) {
                        i11 = R$id.view_pager;
                        RtlViewPager rtlViewPager = (RtlViewPager) ViewBindings.findChildViewById(view, i11);
                        if (rtlViewPager != null) {
                            i11 = R$id.view_switcher;
                            ViewSwitcher viewSwitcher = (ViewSwitcher) ViewBindings.findChildViewById(view, i11);
                            if (viewSwitcher != null) {
                                return new C42079l(linearLayout, clearEditText, linearLayout, recyclerView, slidingTabLayout, appCompatTextView, rtlViewPager, viewSwitcher);
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
        return this.f93022a;
    }

    public C42079l(@NonNull LinearLayout linearLayout, @NonNull ClearEditText clearEditText, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull SlidingTabLayout slidingTabLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull RtlViewPager rtlViewPager, @NonNull ViewSwitcher viewSwitcher) {
        this.f93022a = linearLayout;
        this.f93023b = clearEditText;
        this.f93024c = linearLayout2;
        this.f93025d = recyclerView;
        this.f93026e = slidingTabLayout;
        this.f93027f = appCompatTextView;
        this.f93028g = rtlViewPager;
        this.f93029h = viewSwitcher;
    }
}
