package dm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;

/* JADX INFO: renamed from: dm.b */
/* JADX INFO: compiled from: BkumexAnnouncementDialogBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36733b implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f79714a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SlidingTabLayout f79715b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RtlViewPager f79716c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36733b m82316a(@NonNull View view) {
        int i11 = R$id.announcement_tab_layout;
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
        if (slidingTabLayout != null) {
            i11 = R$id.announcement_view_pager;
            RtlViewPager rtlViewPager = (RtlViewPager) ViewBindings.findChildViewById(view, i11);
            if (rtlViewPager != null) {
                return new C36733b((LinearLayout) view, slidingTabLayout, rtlViewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f79714a;
    }

    public C36733b(@NonNull LinearLayout linearLayout, @NonNull SlidingTabLayout slidingTabLayout, @NonNull RtlViewPager rtlViewPager) {
        this.f79714a = linearLayout;
        this.f79715b = slidingTabLayout;
        this.f79716c = rtlViewPager;
    }
}
