package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import com.kubi.futures.trade.submit.panel.view.InputPanelTimeInputView;
import com.kubi.futures.trade.submit.panel.view.twap.TwapAdvanceSettingView;
import com.kubi.futures.view.MaxHeightConstraintLayout;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcTradeNumAbInputView;
import com.kubi.resources.widget.KcTradeRateView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dm.m0 */
/* JADX INFO: compiled from: BkumexDialogModifyOrderTwapBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36800m0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final MaxHeightConstraintLayout f80510a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f80511b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f80512c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatImageView f80513d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatImageView f80514e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final KcPrimaryButton f80515f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final KcTradeNumAbInputView f80516g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f80517h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final View f80518i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final FlexboxLayout f80519j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final MaxHeightConstraintLayout f80520k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f80521l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f80522m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f80523n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f80524o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f80525p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f80526q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final NestedScrollView f80527r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final KcTradeRateView f80528s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f80529t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f80530u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final InputPanelTimeInputView f80531v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final TwapAdvanceSettingView f80532w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final BaseTextView f80533x;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36800m0 m82461a(@NonNull View view) {
        View viewFindChildViewById;
        InputPanelTimeInputView inputPanelTimeInputViewFindChildViewById;
        TwapAdvanceSettingView twapAdvanceSettingViewFindChildViewById;
        int i11 = R$id.advanceLabelTv;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.advanceSettingCl;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
            if (constraintLayout != null) {
                i11 = R$id.advanceToggleIv;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView != null) {
                    i11 = R$id.close;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatImageView2 != null) {
                        i11 = R$id.confirm;
                        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                        if (kcPrimaryButton != null) {
                            i11 = R$id.delegationAmount;
                            KcTradeNumAbInputView kcTradeNumAbInputView = (KcTradeNumAbInputView) ViewBindings.findChildViewById(view, i11);
                            if (kcTradeNumAbInputView != null) {
                                i11 = R$id.descTv;
                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.divider))) != null) {
                                    i11 = R$id.flow;
                                    FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(view, i11);
                                    if (flexboxLayout != null) {
                                        i11 = R$id.frame;
                                        MaxHeightConstraintLayout maxHeightConstraintLayout = (MaxHeightConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                        if (maxHeightConstraintLayout != null) {
                                            i11 = R$id.latestPrice;
                                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView3 != null) {
                                                i11 = R$id.latestPriceLabel;
                                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView4 != null) {
                                                    i11 = R$id.leverage;
                                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView5 != null) {
                                                        i11 = R$id.marginMode;
                                                        BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView6 != null) {
                                                            i11 = R$id.markPrice;
                                                            BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView7 != null) {
                                                                i11 = R$id.markPriceLabel;
                                                                BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView8 != null) {
                                                                    i11 = R$id.scrollView;
                                                                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i11);
                                                                    if (nestedScrollView != null) {
                                                                        i11 = R$id.side;
                                                                        KcTradeRateView kcTradeRateView = (KcTradeRateView) ViewBindings.findChildViewById(view, i11);
                                                                        if (kcTradeRateView != null) {
                                                                            i11 = R$id.symbol;
                                                                            BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView9 != null) {
                                                                                i11 = R$id.title;
                                                                                BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView10 != null && (inputPanelTimeInputViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.totalTimeInputView))) != null && (twapAdvanceSettingViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.twapAdvanceSettingView))) != null) {
                                                                                    i11 = R$id.twapTagTv;
                                                                                    BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (baseTextView11 != null) {
                                                                                        return new C36800m0((MaxHeightConstraintLayout) view, baseTextView, constraintLayout, appCompatImageView, appCompatImageView2, kcPrimaryButton, kcTradeNumAbInputView, baseTextView2, viewFindChildViewById, flexboxLayout, maxHeightConstraintLayout, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, nestedScrollView, kcTradeRateView, baseTextView9, baseTextView10, inputPanelTimeInputViewFindChildViewById, twapAdvanceSettingViewFindChildViewById, baseTextView11);
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
        return this.f80510a;
    }

    public C36800m0(@NonNull MaxHeightConstraintLayout maxHeightConstraintLayout, @NonNull BaseTextView baseTextView, @NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KcTradeNumAbInputView kcTradeNumAbInputView, @NonNull BaseTextView baseTextView2, @NonNull View view, @NonNull FlexboxLayout flexboxLayout, @NonNull MaxHeightConstraintLayout maxHeightConstraintLayout2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull NestedScrollView nestedScrollView, @NonNull KcTradeRateView kcTradeRateView, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull InputPanelTimeInputView inputPanelTimeInputView, @NonNull TwapAdvanceSettingView twapAdvanceSettingView, @NonNull BaseTextView baseTextView11) {
        this.f80510a = maxHeightConstraintLayout;
        this.f80511b = baseTextView;
        this.f80512c = constraintLayout;
        this.f80513d = appCompatImageView;
        this.f80514e = appCompatImageView2;
        this.f80515f = kcPrimaryButton;
        this.f80516g = kcTradeNumAbInputView;
        this.f80517h = baseTextView2;
        this.f80518i = view;
        this.f80519j = flexboxLayout;
        this.f80520k = maxHeightConstraintLayout2;
        this.f80521l = baseTextView3;
        this.f80522m = baseTextView4;
        this.f80523n = baseTextView5;
        this.f80524o = baseTextView6;
        this.f80525p = baseTextView7;
        this.f80526q = baseTextView8;
        this.f80527r = nestedScrollView;
        this.f80528s = kcTradeRateView;
        this.f80529t = baseTextView9;
        this.f80530u = baseTextView10;
        this.f80531v = inputPanelTimeInputView;
        this.f80532w = twapAdvanceSettingView;
        this.f80533x = baseTextView11;
    }
}
