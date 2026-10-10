package p270ft;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;

/* JADX INFO: renamed from: ft.v */
/* JADX INFO: compiled from: BotcFragmentFiatRechargeHistoryBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37696v implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f84744a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RtlViewPager f84745b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final SlidingTabLayout f84746c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37696v m84982a(@NonNull View view) {
        int i11 = R$id.view_pager;
        RtlViewPager rtlViewPager = (RtlViewPager) ViewBindings.findChildViewById(view, i11);
        if (rtlViewPager != null) {
            i11 = R$id.view_tab_layout;
            SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
            if (slidingTabLayout != null) {
                return new C37696v((LinearLayout) view, rtlViewPager, slidingTabLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f84744a;
    }

    public C37696v(@NonNull LinearLayout linearLayout, @NonNull RtlViewPager rtlViewPager, @NonNull SlidingTabLayout slidingTabLayout) {
        this.f84744a = linearLayout;
        this.f84745b = rtlViewPager;
        this.f84746c = slidingTabLayout;
    }
}
