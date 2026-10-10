package c70;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcCoordinatorLayout;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.user.R$id;

/* JADX INFO: renamed from: c70.d */
/* JADX INFO: compiled from: BusercenterFangmentSetUserPwdBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4865d implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final KcCoordinatorLayout f5060a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C4870f0 f5061b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C4870f0 f5062c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcPrimaryButton f5063d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f5064e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayoutCompat f5065f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final NestedScrollView f5066g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f5067h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f5068i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f5069j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f5070k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4865d m5008a(@NonNull View view) {
        int i11 = R$id.bindingPwd;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            C4870f0 c4870f0M5018a = C4870f0.m5018a(viewFindChildViewById);
            i11 = R$id.bindingPwdCheck;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
            if (viewFindChildViewById2 != null) {
                C4870f0 c4870f0M5018a2 = C4870f0.m5018a(viewFindChildViewById2);
                i11 = R$id.btnConfirm;
                KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                if (kcPrimaryButton != null) {
                    i11 = R$id.iconTips;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView != null) {
                        i11 = R$id.layoutRoot;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                        if (linearLayoutCompat != null) {
                            i11 = R$id.scrollView;
                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i11);
                            if (nestedScrollView != null) {
                                i11 = R$id.tvPwdRule1;
                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView != null) {
                                    i11 = R$id.tvPwdRule2;
                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView2 != null) {
                                        i11 = R$id.tvPwdRule3;
                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView3 != null) {
                                            i11 = R$id.tvSafeWordTips;
                                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView4 != null) {
                                                return new C4865d((KcCoordinatorLayout) view, c4870f0M5018a, c4870f0M5018a2, kcPrimaryButton, imageView, linearLayoutCompat, nestedScrollView, baseTextView, baseTextView2, baseTextView3, baseTextView4);
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
    public KcCoordinatorLayout getRoot() {
        return this.f5060a;
    }

    public C4865d(@NonNull KcCoordinatorLayout kcCoordinatorLayout, @NonNull C4870f0 c4870f0, @NonNull C4870f0 c4870f1, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull ImageView imageView, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull NestedScrollView nestedScrollView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f5060a = kcCoordinatorLayout;
        this.f5061b = c4870f0;
        this.f5062c = c4870f1;
        this.f5063d = kcPrimaryButton;
        this.f5064e = imageView;
        this.f5065f = linearLayoutCompat;
        this.f5066g = nestedScrollView;
        this.f5067h = baseTextView;
        this.f5068i = baseTextView2;
        this.f5069j = baseTextView3;
        this.f5070k = baseTextView4;
    }
}
