package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.viewpager2.SlidingTabLayout;

/* JADX INFO: renamed from: dm.i4 */
/* JADX INFO: compiled from: BkumexModifyMarginDialogBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36780i4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80261a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SlidingTabLayout f80262b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f80263c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ViewPager2 f80264d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36780i4 m82418a(@NonNull View view) {
        int i11 = R$id.actionTab;
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
        if (slidingTabLayout != null) {
            i11 = R$id.iv_back;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.viewPager;
                ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i11);
                if (viewPager2 != null) {
                    return new C36780i4((ConstraintLayout) view, slidingTabLayout, appCompatImageView, viewPager2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f80261a;
    }

    public C36780i4(@NonNull ConstraintLayout constraintLayout, @NonNull SlidingTabLayout slidingTabLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull ViewPager2 viewPager2) {
        this.f80261a = constraintLayout;
        this.f80262b = slidingTabLayout;
        this.f80263c = appCompatImageView;
        this.f80264d = viewPager2;
    }
}
