package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ft.k0 */
/* JADX INFO: compiled from: MarketingCouponLayoutBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37642k0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84127a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Layer f84128b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f84129c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final C37637j0 f84130d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatImageView f84131e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatImageView f84132f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AppCompatImageView f84133g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final AppCompatImageView f84134h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f84135i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f84136j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37642k0 m84867a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.background_layer;
        Layer layer = (Layer) ViewBindings.findChildViewById(view, i11);
        if (layer != null) {
            i11 = R$id.confirm_button;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.fast_trade_marketing_coupon_card))) != null) {
                C37637j0 c37637j0M84856a = C37637j0.m84856a(viewFindChildViewById);
                i11 = R$id.iv_close;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView != null) {
                    i11 = R$id.marketing_coupon_top_bg;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatImageView2 != null) {
                        i11 = R$id.marketing_coupon_top_icon_bg;
                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                        if (appCompatImageView3 != null) {
                            i11 = R$id.top_start_img;
                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                            if (appCompatImageView4 != null) {
                                i11 = R$id.tv_expire_time;
                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView != null) {
                                    i11 = R$id.tv_title;
                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView2 != null) {
                                        return new C37642k0((ConstraintLayout) view, layer, kcPrimaryButton, c37637j0M84856a, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, baseTextView, baseTextView2);
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
    public ConstraintLayout getRoot() {
        return this.f84127a;
    }

    public C37642k0(@NonNull ConstraintLayout constraintLayout, @NonNull Layer layer, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull C37637j0 c37637j0, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatImageView appCompatImageView3, @NonNull AppCompatImageView appCompatImageView4, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f84127a = constraintLayout;
        this.f84128b = layer;
        this.f84129c = kcPrimaryButton;
        this.f84130d = c37637j0;
        this.f84131e = appCompatImageView;
        this.f84132f = appCompatImageView2;
        this.f84133g = appCompatImageView3;
        this.f84134h = appCompatImageView4;
        this.f84135i = baseTextView;
        this.f84136j = baseTextView2;
    }
}
