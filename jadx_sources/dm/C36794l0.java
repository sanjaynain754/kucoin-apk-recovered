package dm;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import com.kubi.futures.view.AnimateDrawableEndView;
import com.kubi.futures.view.MaxHeightConstraintLayout;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcTradeNumAbInputView;
import com.kubi.resources.widget.KcTradeRateView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dm.l0 */
/* JADX INFO: compiled from: BkumexDialogModifyOrderLimitBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36794l0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final MaxHeightConstraintLayout f80452a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f80453b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f80454c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FrameLayout f80455d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final KcTradeNumAbInputView f80456e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final KcTradeNumAbInputView f80457f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final FlexboxLayout f80458g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final MaxHeightConstraintLayout f80459h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f80460i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f80461j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f80462k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final View f80463l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f80464m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f80465n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f80466o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f80467p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final NestedScrollView f80468q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final KcTradeRateView f80469r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f80470s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final AnimateDrawableEndView f80471t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f80472u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final BaseTextView f80473v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final BaseTextView f80474w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final KcTradeNumAbInputView f80475x;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36794l0 m82448a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.close;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.confirm;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.container;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                if (frameLayout != null) {
                    i11 = R$id.delegationPrice;
                    KcTradeNumAbInputView kcTradeNumAbInputView = (KcTradeNumAbInputView) ViewBindings.findChildViewById(view, i11);
                    if (kcTradeNumAbInputView != null) {
                        i11 = R$id.delegationQty;
                        KcTradeNumAbInputView kcTradeNumAbInputView2 = (KcTradeNumAbInputView) ViewBindings.findChildViewById(view, i11);
                        if (kcTradeNumAbInputView2 != null) {
                            i11 = R$id.flow;
                            FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(view, i11);
                            if (flexboxLayout != null) {
                                i11 = R$id.frame;
                                MaxHeightConstraintLayout maxHeightConstraintLayout = (MaxHeightConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                if (maxHeightConstraintLayout != null) {
                                    i11 = R$id.latestPrice;
                                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView != null) {
                                        i11 = R$id.latestPriceLabel;
                                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView2 != null) {
                                            i11 = R$id.leverage;
                                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.line))) != null) {
                                                i11 = R$id.marginMode;
                                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView4 != null) {
                                                    i11 = R$id.markPrice;
                                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView5 != null) {
                                                        i11 = R$id.markPriceLabel;
                                                        BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView6 != null) {
                                                            i11 = R$id.orderType;
                                                            BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView7 != null) {
                                                                i11 = R$id.scrollView;
                                                                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i11);
                                                                if (nestedScrollView != null) {
                                                                    i11 = R$id.side;
                                                                    KcTradeRateView kcTradeRateView = (KcTradeRateView) ViewBindings.findChildViewById(view, i11);
                                                                    if (kcTradeRateView != null) {
                                                                        i11 = R$id.symbol;
                                                                        BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView8 != null) {
                                                                            i11 = R$id.takerStop;
                                                                            AnimateDrawableEndView animateDrawableEndView = (AnimateDrawableEndView) ViewBindings.findChildViewById(view, i11);
                                                                            if (animateDrawableEndView != null) {
                                                                                i11 = R$id.title;
                                                                                BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView9 != null) {
                                                                                    i11 = R$id.type;
                                                                                    BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (baseTextView10 != null) {
                                                                                        i11 = R$id.typeLabel;
                                                                                        BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (baseTextView11 != null) {
                                                                                            i11 = R$id.visibleQty;
                                                                                            KcTradeNumAbInputView kcTradeNumAbInputView3 = (KcTradeNumAbInputView) ViewBindings.findChildViewById(view, i11);
                                                                                            if (kcTradeNumAbInputView3 != null) {
                                                                                                return new C36794l0((MaxHeightConstraintLayout) view, appCompatImageView, kcPrimaryButton, frameLayout, kcTradeNumAbInputView, kcTradeNumAbInputView2, flexboxLayout, maxHeightConstraintLayout, baseTextView, baseTextView2, baseTextView3, viewFindChildViewById, baseTextView4, baseTextView5, baseTextView6, baseTextView7, nestedScrollView, kcTradeRateView, baseTextView8, animateDrawableEndView, baseTextView9, baseTextView10, baseTextView11, kcTradeNumAbInputView3);
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
    public MaxHeightConstraintLayout getRoot() {
        return this.f80452a;
    }

    public C36794l0(@NonNull MaxHeightConstraintLayout maxHeightConstraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull FrameLayout frameLayout, @NonNull KcTradeNumAbInputView kcTradeNumAbInputView, @NonNull KcTradeNumAbInputView kcTradeNumAbInputView2, @NonNull FlexboxLayout flexboxLayout, @NonNull MaxHeightConstraintLayout maxHeightConstraintLayout2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull View view, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull NestedScrollView nestedScrollView, @NonNull KcTradeRateView kcTradeRateView, @NonNull BaseTextView baseTextView8, @NonNull AnimateDrawableEndView animateDrawableEndView, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull KcTradeNumAbInputView kcTradeNumAbInputView3) {
        this.f80452a = maxHeightConstraintLayout;
        this.f80453b = appCompatImageView;
        this.f80454c = kcPrimaryButton;
        this.f80455d = frameLayout;
        this.f80456e = kcTradeNumAbInputView;
        this.f80457f = kcTradeNumAbInputView2;
        this.f80458g = flexboxLayout;
        this.f80459h = maxHeightConstraintLayout2;
        this.f80460i = baseTextView;
        this.f80461j = baseTextView2;
        this.f80462k = baseTextView3;
        this.f80463l = view;
        this.f80464m = baseTextView4;
        this.f80465n = baseTextView5;
        this.f80466o = baseTextView6;
        this.f80467p = baseTextView7;
        this.f80468q = nestedScrollView;
        this.f80469r = kcTradeRateView;
        this.f80470s = baseTextView8;
        this.f80471t = animateDrawableEndView;
        this.f80472u = baseTextView9;
        this.f80473v = baseTextView10;
        this.f80474w = baseTextView11;
        this.f80475x = kcTradeNumAbInputView3;
    }
}
