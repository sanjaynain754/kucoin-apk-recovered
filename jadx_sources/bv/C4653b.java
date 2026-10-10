package bv;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.kubi.quotefacade.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.viewpager2.SlidingTabLayout;

/* JADX INFO: renamed from: bv.b */
/* JADX INFO: compiled from: FragmentAlphaContainerBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4653b implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f4222a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SlidingTabLayout f4223b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f4224c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatImageView f4225d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f4226e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ViewPager2 f4227f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final C4679l0 f4228g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4653b m4618a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.actionTab;
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
        if (slidingTabLayout != null) {
            i11 = R$id.ivFilterInfo;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.ivFilterNetwork;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView2 != null) {
                    i11 = R$id.tvTime;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.viewPager;
                        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i11);
                        if (viewPager2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.viewSort))) != null) {
                            return new C4653b((LinearLayoutCompat) view, slidingTabLayout, appCompatImageView, appCompatImageView2, baseTextView, viewPager2, C4679l0.m4670a(viewFindChildViewById));
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
    public LinearLayoutCompat getRoot() {
        return this.f4222a;
    }

    public C4653b(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull SlidingTabLayout slidingTabLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull BaseTextView baseTextView, @NonNull ViewPager2 viewPager2, @NonNull C4679l0 c4679l0) {
        this.f4222a = linearLayoutCompat;
        this.f4223b = slidingTabLayout;
        this.f4224c = appCompatImageView;
        this.f4225d = appCompatImageView2;
        this.f4226e = baseTextView;
        this.f4227f = viewPager2;
        this.f4228g = c4679l0;
    }
}
