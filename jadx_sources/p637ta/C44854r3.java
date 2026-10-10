package p637ta;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.flyco.SlidingTabLayout;

/* JADX INFO: renamed from: ta.r3 */
/* JADX INFO: compiled from: FragmentAssetv2Binding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44854r3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f100727a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f100728b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f100729c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f100730d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayoutCompat f100731e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final SlidingTabLayout f100732f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final View f100733g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final CustomViewPager f100734h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44854r3 m99232a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.btnSortTab;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.iv_back;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i11 = R$id.tab_bar_layout;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                if (linearLayoutCompat != null) {
                    i11 = R$id.tab_layout_assetv2;
                    SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
                    if (slidingTabLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_divider))) != null) {
                        i11 = R$id.vp_assetv2;
                        CustomViewPager customViewPager = (CustomViewPager) ViewBindings.findChildViewById(view, i11);
                        if (customViewPager != null) {
                            return new C44854r3(constraintLayout, appCompatImageView, imageView, constraintLayout, linearLayoutCompat, slidingTabLayout, viewFindChildViewById, customViewPager);
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
    public ConstraintLayout getRoot() {
        return this.f100727a;
    }

    public C44854r3(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull SlidingTabLayout slidingTabLayout, @NonNull View view, @NonNull CustomViewPager customViewPager) {
        this.f100727a = constraintLayout;
        this.f100728b = appCompatImageView;
        this.f100729c = imageView;
        this.f100730d = constraintLayout2;
        this.f100731e = linearLayoutCompat;
        this.f100732f = slidingTabLayout;
        this.f100733g = view;
        this.f100734h = customViewPager;
    }
}
