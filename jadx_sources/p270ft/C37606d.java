package p270ft;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;

/* JADX INFO: renamed from: ft.d */
/* JADX INFO: compiled from: BotcFragmentAdManageBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37606d implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f83758a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SlidingTabLayout f83759b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RtlViewPager f83760c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37606d m84794a(@NonNull View view) {
        int i11 = R$id.tab_layout;
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
        if (slidingTabLayout != null) {
            i11 = R$id.view_pager;
            RtlViewPager rtlViewPager = (RtlViewPager) ViewBindings.findChildViewById(view, i11);
            if (rtlViewPager != null) {
                return new C37606d((LinearLayout) view, slidingTabLayout, rtlViewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f83758a;
    }

    public C37606d(@NonNull LinearLayout linearLayout, @NonNull SlidingTabLayout slidingTabLayout, @NonNull RtlViewPager rtlViewPager) {
        this.f83758a = linearLayout;
        this.f83759b = slidingTabLayout;
        this.f83760c = rtlViewPager;
    }
}
