package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;

/* JADX INFO: renamed from: ta.c4 */
/* JADX INFO: compiled from: KucoinActivitySearchCoinFiatBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44741c4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99684a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C44766f5 f99685b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C44774g5 f99686c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RtlViewPager f99687d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final SlidingTabLayout f99688e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44741c4 m98994a(@NonNull View view) {
        int i11 = R$id.layout_withdraw_navigation_bar;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            C44766f5 c44766f5M99047a = C44766f5.m99047a(viewFindChildViewById);
            i11 = R$id.searchBar;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
            if (viewFindChildViewById2 != null) {
                C44774g5 c44774g5M99064a = C44774g5.m99064a(viewFindChildViewById2);
                i11 = R$id.searchPager;
                RtlViewPager rtlViewPager = (RtlViewPager) ViewBindings.findChildViewById(view, i11);
                if (rtlViewPager != null) {
                    i11 = R$id.searchTab;
                    SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
                    if (slidingTabLayout != null) {
                        return new C44741c4((LinearLayout) view, c44766f5M99047a, c44774g5M99064a, rtlViewPager, slidingTabLayout);
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
        return this.f99684a;
    }

    public C44741c4(@NonNull LinearLayout linearLayout, @NonNull C44766f5 c44766f5, @NonNull C44774g5 c44774g5, @NonNull RtlViewPager rtlViewPager, @NonNull SlidingTabLayout slidingTabLayout) {
        this.f99684a = linearLayout;
        this.f99685b = c44766f5;
        this.f99686c = c44774g5;
        this.f99687d = rtlViewPager;
        this.f99688e = slidingTabLayout;
    }
}
