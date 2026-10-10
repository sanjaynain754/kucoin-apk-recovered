package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CheckEditText;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.KcTradeRateView;
import com.kubi.resources.widget.bubbleseekbar.KcSeekBar;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dm.j0 */
/* JADX INFO: compiled from: BkumexDialogMarketCloseBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36782j0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80270a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final CheckEditText f80271b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f80272c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final DashTextView f80273d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f80274e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatImageView f80275f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final KcPrimaryButton f80276g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f80277h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f80278i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final FlexboxLayout f80279j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f80280k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f80281l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f80282m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f80283n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final View f80284o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f80285p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f80286q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f80287r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f80288s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final CheckEditText f80289t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f80290u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final KcSeekBar f80291v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final KcTradeRateView f80292w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final BaseTextView f80293x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final BaseTextView f80294y;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36782j0 m82422a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.amountEdit;
        CheckEditText checkEditText = (CheckEditText) ViewBindings.findChildViewById(view, i11);
        if (checkEditText != null) {
            i11 = R$id.amountLabel;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.availableQtyLabel;
                DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                if (dashTextView != null) {
                    i11 = R$id.availableQtyValue;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        i11 = R$id.close;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                        if (appCompatImageView != null) {
                            i11 = R$id.confirm;
                            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                            if (kcPrimaryButton != null) {
                                i11 = R$id.expectLabel;
                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView3 != null) {
                                    i11 = R$id.expectValue;
                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView4 != null) {
                                        i11 = R$id.flow;
                                        FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(view, i11);
                                        if (flexboxLayout != null) {
                                            i11 = R$id.lastLabel;
                                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView5 != null) {
                                                i11 = R$id.lastValue;
                                                BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView6 != null) {
                                                    i11 = R$id.legalValue;
                                                    BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView7 != null) {
                                                        i11 = R$id.leverage;
                                                        BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView8 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.line))) != null) {
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
                                                                            i11 = R$id.priceEdit;
                                                                            CheckEditText checkEditText2 = (CheckEditText) ViewBindings.findChildViewById(view, i11);
                                                                            if (checkEditText2 != null) {
                                                                                i11 = R$id.priceLabel;
                                                                                BaseTextView baseTextView13 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView13 != null) {
                                                                                    i11 = R$id.progressBar;
                                                                                    KcSeekBar kcSeekBar = (KcSeekBar) ViewBindings.findChildViewById(view, i11);
                                                                                    if (kcSeekBar != null) {
                                                                                        i11 = R$id.side;
                                                                                        KcTradeRateView kcTradeRateView = (KcTradeRateView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (kcTradeRateView != null) {
                                                                                            i11 = R$id.symbol;
                                                                                            BaseTextView baseTextView14 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                            if (baseTextView14 != null) {
                                                                                                i11 = R$id.title;
                                                                                                BaseTextView baseTextView15 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                if (baseTextView15 != null) {
                                                                                                    return new C36782j0((ConstraintLayout) view, checkEditText, baseTextView, dashTextView, baseTextView2, appCompatImageView, kcPrimaryButton, baseTextView3, baseTextView4, flexboxLayout, baseTextView5, baseTextView6, baseTextView7, baseTextView8, viewFindChildViewById, baseTextView9, baseTextView10, baseTextView11, baseTextView12, checkEditText2, baseTextView13, kcSeekBar, kcTradeRateView, baseTextView14, baseTextView15);
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
        return this.f80270a;
    }

    public C36782j0(@NonNull ConstraintLayout constraintLayout, @NonNull CheckEditText checkEditText, @NonNull BaseTextView baseTextView, @NonNull DashTextView dashTextView, @NonNull BaseTextView baseTextView2, @NonNull AppCompatImageView appCompatImageView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull FlexboxLayout flexboxLayout, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull View view, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull BaseTextView baseTextView12, @NonNull CheckEditText checkEditText2, @NonNull BaseTextView baseTextView13, @NonNull KcSeekBar kcSeekBar, @NonNull KcTradeRateView kcTradeRateView, @NonNull BaseTextView baseTextView14, @NonNull BaseTextView baseTextView15) {
        this.f80270a = constraintLayout;
        this.f80271b = checkEditText;
        this.f80272c = baseTextView;
        this.f80273d = dashTextView;
        this.f80274e = baseTextView2;
        this.f80275f = appCompatImageView;
        this.f80276g = kcPrimaryButton;
        this.f80277h = baseTextView3;
        this.f80278i = baseTextView4;
        this.f80279j = flexboxLayout;
        this.f80280k = baseTextView5;
        this.f80281l = baseTextView6;
        this.f80282m = baseTextView7;
        this.f80283n = baseTextView8;
        this.f80284o = view;
        this.f80285p = baseTextView9;
        this.f80286q = baseTextView10;
        this.f80287r = baseTextView11;
        this.f80288s = baseTextView12;
        this.f80289t = checkEditText2;
        this.f80290u = baseTextView13;
        this.f80291v = kcSeekBar;
        this.f80292w = kcTradeRateView;
        this.f80293x = baseTextView14;
        this.f80294y = baseTextView15;
    }
}
