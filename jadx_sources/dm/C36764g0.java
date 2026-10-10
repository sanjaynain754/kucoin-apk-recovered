package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import com.kubi.futures.view.AnimateDrawableEndView;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.KcTradeNumAbInputView;
import com.kubi.resources.widget.KcTradeRateView;
import com.kubi.resources.widget.bubbleseekbar.KcSeekBar;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dm.g0 */
/* JADX INFO: compiled from: BkumexDialogLimitCloseBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36764g0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80082a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final DashTextView f80083b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f80084c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final Barrier f80085d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatImageView f80086e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AnimateDrawableEndView f80087f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final KcTradeNumAbInputView f80088g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final KcTradeNumAbInputView f80089h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final KcPrimaryButton f80090i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f80091j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f80092k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final FlexboxLayout f80093l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f80094m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f80095n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f80096o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f80097p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f80098q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f80099r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f80100s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f80101t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f80102u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final KcSeekBar f80103v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final KcTradeRateView f80104w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final BaseTextView f80105x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final BaseTextView f80106y;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36764g0 m82381a(@NonNull View view) {
        int i11 = R$id.availableQtyLabel;
        DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
        if (dashTextView != null) {
            i11 = R$id.availableQtyValue;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.barrier;
                Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
                if (barrier != null) {
                    i11 = R$id.close;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatImageView != null) {
                        i11 = R$id.closeOrderTypeSelector;
                        AnimateDrawableEndView animateDrawableEndView = (AnimateDrawableEndView) ViewBindings.findChildViewById(view, i11);
                        if (animateDrawableEndView != null) {
                            i11 = R$id.closePriceInput;
                            KcTradeNumAbInputView kcTradeNumAbInputView = (KcTradeNumAbInputView) ViewBindings.findChildViewById(view, i11);
                            if (kcTradeNumAbInputView != null) {
                                i11 = R$id.closeQtyInput;
                                KcTradeNumAbInputView kcTradeNumAbInputView2 = (KcTradeNumAbInputView) ViewBindings.findChildViewById(view, i11);
                                if (kcTradeNumAbInputView2 != null) {
                                    i11 = R$id.confirm;
                                    KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                    if (kcPrimaryButton != null) {
                                        i11 = R$id.expectLabel;
                                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView2 != null) {
                                            i11 = R$id.expectValue;
                                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView3 != null) {
                                                i11 = R$id.flow;
                                                FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(view, i11);
                                                if (flexboxLayout != null) {
                                                    i11 = R$id.lastLabel;
                                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView4 != null) {
                                                        i11 = R$id.lastValue;
                                                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView5 != null) {
                                                            i11 = R$id.legalValue;
                                                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView6 != null) {
                                                                i11 = R$id.leverage;
                                                                BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView7 != null) {
                                                                    i11 = R$id.marketLabel;
                                                                    BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView8 != null) {
                                                                        i11 = R$id.openLabel;
                                                                        BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView9 != null) {
                                                                            i11 = R$id.openValue;
                                                                            BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView10 != null) {
                                                                                i11 = R$id.positionQtyLabel;
                                                                                BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView11 != null) {
                                                                                    i11 = R$id.positionQtyValue;
                                                                                    BaseTextView baseTextView12 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (baseTextView12 != null) {
                                                                                        i11 = R$id.progressBar;
                                                                                        KcSeekBar kcSeekBar = (KcSeekBar) ViewBindings.findChildViewById(view, i11);
                                                                                        if (kcSeekBar != null) {
                                                                                            i11 = R$id.side;
                                                                                            KcTradeRateView kcTradeRateView = (KcTradeRateView) ViewBindings.findChildViewById(view, i11);
                                                                                            if (kcTradeRateView != null) {
                                                                                                i11 = R$id.symbol;
                                                                                                BaseTextView baseTextView13 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                if (baseTextView13 != null) {
                                                                                                    i11 = R$id.title;
                                                                                                    BaseTextView baseTextView14 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                    if (baseTextView14 != null) {
                                                                                                        return new C36764g0((ConstraintLayout) view, dashTextView, baseTextView, barrier, appCompatImageView, animateDrawableEndView, kcTradeNumAbInputView, kcTradeNumAbInputView2, kcPrimaryButton, baseTextView2, baseTextView3, flexboxLayout, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, baseTextView11, baseTextView12, kcSeekBar, kcTradeRateView, baseTextView13, baseTextView14);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f80082a;
    }

    public C36764g0(@NonNull ConstraintLayout constraintLayout, @NonNull DashTextView dashTextView, @NonNull BaseTextView baseTextView, @NonNull Barrier barrier, @NonNull AppCompatImageView appCompatImageView, @NonNull AnimateDrawableEndView animateDrawableEndView, @NonNull KcTradeNumAbInputView kcTradeNumAbInputView, @NonNull KcTradeNumAbInputView kcTradeNumAbInputView2, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull FlexboxLayout flexboxLayout, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull BaseTextView baseTextView12, @NonNull KcSeekBar kcSeekBar, @NonNull KcTradeRateView kcTradeRateView, @NonNull BaseTextView baseTextView13, @NonNull BaseTextView baseTextView14) {
        this.f80082a = constraintLayout;
        this.f80083b = dashTextView;
        this.f80084c = baseTextView;
        this.f80085d = barrier;
        this.f80086e = appCompatImageView;
        this.f80087f = animateDrawableEndView;
        this.f80088g = kcTradeNumAbInputView;
        this.f80089h = kcTradeNumAbInputView2;
        this.f80090i = kcPrimaryButton;
        this.f80091j = baseTextView2;
        this.f80092k = baseTextView3;
        this.f80093l = flexboxLayout;
        this.f80094m = baseTextView4;
        this.f80095n = baseTextView5;
        this.f80096o = baseTextView6;
        this.f80097p = baseTextView7;
        this.f80098q = baseTextView8;
        this.f80099r = baseTextView9;
        this.f80100s = baseTextView10;
        this.f80101t = baseTextView11;
        this.f80102u = baseTextView12;
        this.f80103v = kcSeekBar;
        this.f80104w = kcTradeRateView;
        this.f80105x = baseTextView13;
        this.f80106y = baseTextView14;
    }
}
