package dm;

import android.view.View;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.futures.view.ModifyLeverageInputView;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.AlignTopTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.bubbleseekbar.KcSeekBar;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dm.q0 */
/* JADX INFO: compiled from: BkumexDialogPositionLeverageBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36824q0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80851a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f80852b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f80853c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f80854d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f80855e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f80856f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f80857g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f80858h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f80859i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final AlignTopTextView f80860j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f80861k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final ModifyLeverageInputView f80862l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final AppCompatImageView f80863m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final DashTextView f80864n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f80865o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f80866p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f80867q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f80868r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f80869s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final DashTextView f80870t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final KcSeekBar f80871u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final Space f80872v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final BaseTextView f80873w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final BaseTextView f80874x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final KcPrimaryButton f80875y;

    /* JADX INFO: renamed from: z */
    @NonNull
    public final AlignTopTextView f80876z;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36824q0 m82510a(@NonNull View view) {
        int i11 = R$id.after;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.cl_adjust;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
            if (constraintLayout != null) {
                i11 = R$id.cl_title;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                if (constraintLayout2 != null) {
                    i11 = R$id.current;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        i11 = R$id.currentLeverage;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null) {
                            i11 = R$id.entryAfter;
                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView4 != null) {
                                i11 = R$id.entryCurrent;
                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView5 != null) {
                                    i11 = R$id.entryLabel;
                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView6 != null) {
                                        i11 = R$id.error;
                                        AlignTopTextView alignTopTextView = (AlignTopTextView) ViewBindings.findChildViewById(view, i11);
                                        if (alignTopTextView != null) {
                                            i11 = R$id.guide;
                                            BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView7 != null) {
                                                i11 = R$id.inputView;
                                                ModifyLeverageInputView modifyLeverageInputView = (ModifyLeverageInputView) ViewBindings.findChildViewById(view, i11);
                                                if (modifyLeverageInputView != null) {
                                                    i11 = R$id.iv_back;
                                                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                                    if (appCompatImageView != null) {
                                                        i11 = R$id.leverage;
                                                        DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (dashTextView != null) {
                                                            i11 = R$id.liquidationAfter;
                                                            BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView8 != null) {
                                                                i11 = R$id.liquidationCurrent;
                                                                BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView9 != null) {
                                                                    i11 = R$id.liquidationLabel;
                                                                    BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView10 != null) {
                                                                        i11 = R$id.marginAfter;
                                                                        BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView11 != null) {
                                                                            i11 = R$id.marginCurrent;
                                                                            BaseTextView baseTextView12 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView12 != null) {
                                                                                i11 = R$id.marginLabel;
                                                                                DashTextView dashTextView2 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (dashTextView2 != null) {
                                                                                    i11 = R$id.progressBar;
                                                                                    KcSeekBar kcSeekBar = (KcSeekBar) ViewBindings.findChildViewById(view, i11);
                                                                                    if (kcSeekBar != null) {
                                                                                        i11 = R$id.space;
                                                                                        Space space = (Space) ViewBindings.findChildViewById(view, i11);
                                                                                        if (space != null) {
                                                                                            i11 = R$id.symbol;
                                                                                            BaseTextView baseTextView13 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                            if (baseTextView13 != null) {
                                                                                                i11 = R$id.title;
                                                                                                BaseTextView baseTextView14 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                if (baseTextView14 != null) {
                                                                                                    i11 = R$id.tv_confirm;
                                                                                                    KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                                                                                    if (kcPrimaryButton != null) {
                                                                                                        i11 = R$id.warning;
                                                                                                        AlignTopTextView alignTopTextView2 = (AlignTopTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                        if (alignTopTextView2 != null) {
                                                                                                            return new C36824q0((ConstraintLayout) view, baseTextView, constraintLayout, constraintLayout2, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, alignTopTextView, baseTextView7, modifyLeverageInputView, appCompatImageView, dashTextView, baseTextView8, baseTextView9, baseTextView10, baseTextView11, baseTextView12, dashTextView2, kcSeekBar, space, baseTextView13, baseTextView14, kcPrimaryButton, alignTopTextView2);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f80851a;
    }

    public C36824q0(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull AlignTopTextView alignTopTextView, @NonNull BaseTextView baseTextView7, @NonNull ModifyLeverageInputView modifyLeverageInputView, @NonNull AppCompatImageView appCompatImageView, @NonNull DashTextView dashTextView, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull BaseTextView baseTextView12, @NonNull DashTextView dashTextView2, @NonNull KcSeekBar kcSeekBar, @NonNull Space space, @NonNull BaseTextView baseTextView13, @NonNull BaseTextView baseTextView14, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull AlignTopTextView alignTopTextView2) {
        this.f80851a = constraintLayout;
        this.f80852b = baseTextView;
        this.f80853c = constraintLayout2;
        this.f80854d = constraintLayout3;
        this.f80855e = baseTextView2;
        this.f80856f = baseTextView3;
        this.f80857g = baseTextView4;
        this.f80858h = baseTextView5;
        this.f80859i = baseTextView6;
        this.f80860j = alignTopTextView;
        this.f80861k = baseTextView7;
        this.f80862l = modifyLeverageInputView;
        this.f80863m = appCompatImageView;
        this.f80864n = dashTextView;
        this.f80865o = baseTextView8;
        this.f80866p = baseTextView9;
        this.f80867q = baseTextView10;
        this.f80868r = baseTextView11;
        this.f80869s = baseTextView12;
        this.f80870t = dashTextView2;
        this.f80871u = kcSeekBar;
        this.f80872v = space;
        this.f80873w = baseTextView13;
        this.f80874x = baseTextView14;
        this.f80875y = kcPrimaryButton;
        this.f80876z = alignTopTextView2;
    }
}
