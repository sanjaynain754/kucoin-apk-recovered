package fj;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.home.R$id;
import com.kubi.resources.widget.AutoHeightViewPager;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.flyco.SlidingTabLayout;

/* JADX INFO: renamed from: fj.h0 */
/* JADX INFO: compiled from: KucoinHomeCardRankBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37522h0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f83310a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final DashTextView f83311b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f83312c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayoutCompat f83313d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FrameLayout f83314e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayoutCompat f83315f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AutoHeightViewPager f83316g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LinearLayout f83317h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final SlidingTabLayout f83318i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final DashTextView f83319j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f83320k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final LinearLayout f83321l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final LinearLayoutCompat f83322m;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37522h0 m84504a(@NonNull View view) {
        int i11 = R$id.coin_pair;
        DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
        if (dashTextView != null) {
            i11 = R$id.jump_more;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout != null) {
                i11 = R$id.layoutExpandMore;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                if (linearLayoutCompat != null) {
                    i11 = R$id.layoutHeader;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                    if (frameLayout != null) {
                        i11 = R$id.layout_more;
                        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                        if (linearLayoutCompat2 != null) {
                            i11 = R$id.m_view_pager;
                            AutoHeightViewPager autoHeightViewPager = (AutoHeightViewPager) ViewBindings.findChildViewById(view, i11);
                            if (autoHeightViewPager != null) {
                                LinearLayout linearLayout2 = (LinearLayout) view;
                                i11 = R$id.rank_tab_layout;
                                SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
                                if (slidingTabLayout != null) {
                                    i11 = R$id.tv_sort_change_rate;
                                    DashTextView dashTextView2 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                    if (dashTextView2 != null) {
                                        i11 = R$id.tv_sort_price;
                                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView != null) {
                                            i11 = R$id.view_close;
                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                            if (linearLayout3 != null) {
                                                i11 = R$id.view_expand;
                                                LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                                if (linearLayoutCompat3 != null) {
                                                    return new C37522h0(linearLayout2, dashTextView, linearLayout, linearLayoutCompat, frameLayout, linearLayoutCompat2, autoHeightViewPager, linearLayout2, slidingTabLayout, dashTextView2, baseTextView, linearLayout3, linearLayoutCompat3);
                                                }
                                            }
                                        }
                                    }
                                }
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
        return this.f83310a;
    }

    public C37522h0(@NonNull LinearLayout linearLayout, @NonNull DashTextView dashTextView, @NonNull LinearLayout linearLayout2, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull FrameLayout frameLayout, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull AutoHeightViewPager autoHeightViewPager, @NonNull LinearLayout linearLayout3, @NonNull SlidingTabLayout slidingTabLayout, @NonNull DashTextView dashTextView2, @NonNull BaseTextView baseTextView, @NonNull LinearLayout linearLayout4, @NonNull LinearLayoutCompat linearLayoutCompat3) {
        this.f83310a = linearLayout;
        this.f83311b = dashTextView;
        this.f83312c = linearLayout2;
        this.f83313d = linearLayoutCompat;
        this.f83314e = frameLayout;
        this.f83315f = linearLayoutCompat2;
        this.f83316g = autoHeightViewPager;
        this.f83317h = linearLayout3;
        this.f83318i = slidingTabLayout;
        this.f83319j = dashTextView2;
        this.f83320k = baseTextView;
        this.f83321l = linearLayout4;
        this.f83322m = linearLayoutCompat3;
    }
}
