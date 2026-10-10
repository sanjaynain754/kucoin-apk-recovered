package c70;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;
import com.kubi.user.R$id;

/* JADX INFO: renamed from: c70.t */
/* JADX INFO: compiled from: BusercenterLayoutExternalAccountBindBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4897t implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f5316a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C4868e0 f5317b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C4872g0 f5318c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final C4870f0 f5319d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final KcPrimaryButton f5320e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayoutCompat f5321f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayoutCompat f5322g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final NavigationBar f5323h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final NestedScrollView f5324i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final SlidingTabLayout f5325j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final RtlViewPager f5326k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f5327l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f5328m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f5329n;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4897t m5073a(@NonNull View view) {
        int i11 = R$id.bindingEmail;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            C4868e0 c4868e0M5014a = C4868e0.m5014a(viewFindChildViewById);
            i11 = R$id.bindingPhone;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
            if (viewFindChildViewById2 != null) {
                C4872g0 c4872g0M5022a = C4872g0.m5022a(viewFindChildViewById2);
                i11 = R$id.bindingPwd;
                View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i11);
                if (viewFindChildViewById3 != null) {
                    C4870f0 c4870f0M5018a = C4870f0.m5018a(viewFindChildViewById3);
                    i11 = R$id.btnNext;
                    KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                    if (kcPrimaryButton != null) {
                        i11 = R$id.layoutPwd;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                        if (linearLayoutCompat != null) {
                            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) view;
                            i11 = R$id.naviBar;
                            NavigationBar navigationBar = (NavigationBar) ViewBindings.findChildViewById(view, i11);
                            if (navigationBar != null) {
                                i11 = R$id.scrollView;
                                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i11);
                                if (nestedScrollView != null) {
                                    i11 = R$id.tabLayout;
                                    SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
                                    if (slidingTabLayout != null) {
                                        i11 = R$id.tabPage;
                                        RtlViewPager rtlViewPager = (RtlViewPager) ViewBindings.findChildViewById(view, i11);
                                        if (rtlViewPager != null) {
                                            i11 = R$id.tvBindTips;
                                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView != null) {
                                                i11 = R$id.tvContinueLogin;
                                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView2 != null) {
                                                    i11 = R$id.tvForgetPwd;
                                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView3 != null) {
                                                        return new C4897t(linearLayoutCompat2, c4868e0M5014a, c4872g0M5022a, c4870f0M5018a, kcPrimaryButton, linearLayoutCompat, linearLayoutCompat2, navigationBar, nestedScrollView, slidingTabLayout, rtlViewPager, baseTextView, baseTextView2, baseTextView3);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f5316a;
    }

    public C4897t(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull C4868e0 c4868e0, @NonNull C4872g0 c4872g0, @NonNull C4870f0 c4870f0, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull LinearLayoutCompat linearLayoutCompat3, @NonNull NavigationBar navigationBar, @NonNull NestedScrollView nestedScrollView, @NonNull SlidingTabLayout slidingTabLayout, @NonNull RtlViewPager rtlViewPager, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f5316a = linearLayoutCompat;
        this.f5317b = c4868e0;
        this.f5318c = c4872g0;
        this.f5319d = c4870f0;
        this.f5320e = kcPrimaryButton;
        this.f5321f = linearLayoutCompat2;
        this.f5322g = linearLayoutCompat3;
        this.f5323h = navigationBar;
        this.f5324i = nestedScrollView;
        this.f5325j = slidingTabLayout;
        this.f5326k = rtlViewPager;
        this.f5327l = baseTextView;
        this.f5328m = baseTextView2;
        this.f5329n = baseTextView3;
    }
}
