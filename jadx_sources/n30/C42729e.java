package n30;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.tradebase.R$id;
import com.kubi.tradebase.tradetype.BottomSheetViewPager;

/* JADX INFO: renamed from: n30.e */
/* JADX INFO: compiled from: BtradebaseDialogTradeTypeInfoBinding.java */
/* JADX INFO: loaded from: classes48.dex */
public final class C42729e implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f94603a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SlidingTabLayout f94604b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcSecondaryButton f94605c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BottomSheetViewPager f94606d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42729e m93629a(@NonNull View view) {
        int i11 = R$id.tab_layout;
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
        if (slidingTabLayout != null) {
            i11 = R$id.view_ok;
            KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcSecondaryButton != null) {
                i11 = R$id.view_pager;
                BottomSheetViewPager bottomSheetViewPager = (BottomSheetViewPager) ViewBindings.findChildViewById(view, i11);
                if (bottomSheetViewPager != null) {
                    return new C42729e((LinearLayout) view, slidingTabLayout, kcSecondaryButton, bottomSheetViewPager);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f94603a;
    }

    public C42729e(@NonNull LinearLayout linearLayout, @NonNull SlidingTabLayout slidingTabLayout, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull BottomSheetViewPager bottomSheetViewPager) {
        this.f94603a = linearLayout;
        this.f94604b = slidingTabLayout;
        this.f94605c = kcSecondaryButton;
        this.f94606d = bottomSheetViewPager;
    }
}
