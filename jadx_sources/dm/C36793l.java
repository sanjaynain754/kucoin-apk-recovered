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
import com.kubi.resources.widget.KcSwitchButton;
import com.kubi.resources.widget.bubbleseekbar.KcSeekBar;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;

/* JADX INFO: renamed from: dm.l */
/* JADX INFO: compiled from: BkumexDialogCrossLeverageSettingBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36793l implements ViewBinding {

    /* JADX INFO: renamed from: A */
    @NonNull
    public final AlignTopTextView f80422A;

    /* JADX INFO: renamed from: B */
    @NonNull
    public final KcPrimaryButton f80423B;

    /* JADX INFO: renamed from: C */
    @NonNull
    public final BaseTextView f80424C;

    /* JADX INFO: renamed from: D */
    @NonNull
    public final AlignTopTextView f80425D;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80426a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f80427b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f80428c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f80429d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f80430e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ConstraintLayout f80431f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ConstraintLayout f80432g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ConstraintLayout f80433h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f80434i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final DashTextView f80435j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final View f80436k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final ShapeConstraintLayout f80437l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final AlignTopTextView f80438m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f80439n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final AlignTopTextView f80440o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final ConstraintLayout f80441p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final ModifyLeverageInputView f80442q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final AppCompatImageView f80443r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f80444s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f80445t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final DashTextView f80446u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final KcSeekBar f80447v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final Space f80448w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final KcSwitchButton f80449x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final BaseTextView f80450y;

    /* JADX INFO: renamed from: z */
    @NonNull
    public final BaseTextView f80451z;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36793l m82446a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.after;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.batchLeverageCl;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
            if (constraintLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.batchLeverageDivider))) != null) {
                i11 = R$id.batchLeverageTitle;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.cl_adjust;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                    if (constraintLayout2 != null) {
                        i11 = R$id.cl_content;
                        ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                        if (constraintLayout3 != null) {
                            i11 = R$id.cl_title;
                            ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                            if (constraintLayout4 != null) {
                                i11 = R$id.current;
                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView3 != null) {
                                    i11 = R$id.currentLeverage;
                                    DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                    if (dashTextView != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.dividerView))) != null) {
                                        i11 = R$id.eduCl;
                                        ShapeConstraintLayout shapeConstraintLayout = (ShapeConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                        if (shapeConstraintLayout != null) {
                                            i11 = R$id.eduHint;
                                            AlignTopTextView alignTopTextView = (AlignTopTextView) ViewBindings.findChildViewById(view, i11);
                                            if (alignTopTextView != null) {
                                                i11 = R$id.eduVerifyTv;
                                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView4 != null) {
                                                    i11 = R$id.hint;
                                                    AlignTopTextView alignTopTextView2 = (AlignTopTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (alignTopTextView2 != null) {
                                                        i11 = R$id.hintCl;
                                                        ConstraintLayout constraintLayout5 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                                        if (constraintLayout5 != null) {
                                                            i11 = R$id.inputView;
                                                            ModifyLeverageInputView modifyLeverageInputView = (ModifyLeverageInputView) ViewBindings.findChildViewById(view, i11);
                                                            if (modifyLeverageInputView != null) {
                                                                i11 = R$id.iv_back;
                                                                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                                                if (appCompatImageView != null) {
                                                                    i11 = R$id.marginAfter;
                                                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView5 != null) {
                                                                        i11 = R$id.marginCurrent;
                                                                        BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView6 != null) {
                                                                            i11 = R$id.marginLabel;
                                                                            DashTextView dashTextView2 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (dashTextView2 != null) {
                                                                                i11 = R$id.progressBar;
                                                                                KcSeekBar kcSeekBar = (KcSeekBar) ViewBindings.findChildViewById(view, i11);
                                                                                if (kcSeekBar != null) {
                                                                                    i11 = R$id.space;
                                                                                    Space space = (Space) ViewBindings.findChildViewById(view, i11);
                                                                                    if (space != null) {
                                                                                        i11 = R$id.switch_batch;
                                                                                        KcSwitchButton kcSwitchButton = (KcSwitchButton) ViewBindings.findChildViewById(view, i11);
                                                                                        if (kcSwitchButton != null) {
                                                                                            i11 = R$id.symbol;
                                                                                            BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                            if (baseTextView7 != null) {
                                                                                                i11 = R$id.title;
                                                                                                BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                if (baseTextView8 != null) {
                                                                                                    i11 = R$id.trialLeverageHintTv;
                                                                                                    AlignTopTextView alignTopTextView3 = (AlignTopTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                    if (alignTopTextView3 != null) {
                                                                                                        i11 = R$id.tv_confirm;
                                                                                                        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                                                                                        if (kcPrimaryButton != null) {
                                                                                                            i11 = R$id.verifyTv;
                                                                                                            BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                            if (baseTextView9 != null) {
                                                                                                                i11 = R$id.warning;
                                                                                                                AlignTopTextView alignTopTextView4 = (AlignTopTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                                if (alignTopTextView4 != null) {
                                                                                                                    return new C36793l((ConstraintLayout) view, baseTextView, constraintLayout, viewFindChildViewById, baseTextView2, constraintLayout2, constraintLayout3, constraintLayout4, baseTextView3, dashTextView, viewFindChildViewById2, shapeConstraintLayout, alignTopTextView, baseTextView4, alignTopTextView2, constraintLayout5, modifyLeverageInputView, appCompatImageView, baseTextView5, baseTextView6, dashTextView2, kcSeekBar, space, kcSwitchButton, baseTextView7, baseTextView8, alignTopTextView3, kcPrimaryButton, baseTextView9, alignTopTextView4);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f80426a;
    }

    public C36793l(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull ConstraintLayout constraintLayout2, @NonNull View view, @NonNull BaseTextView baseTextView2, @NonNull ConstraintLayout constraintLayout3, @NonNull ConstraintLayout constraintLayout4, @NonNull ConstraintLayout constraintLayout5, @NonNull BaseTextView baseTextView3, @NonNull DashTextView dashTextView, @NonNull View view2, @NonNull ShapeConstraintLayout shapeConstraintLayout, @NonNull AlignTopTextView alignTopTextView, @NonNull BaseTextView baseTextView4, @NonNull AlignTopTextView alignTopTextView2, @NonNull ConstraintLayout constraintLayout6, @NonNull ModifyLeverageInputView modifyLeverageInputView, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull DashTextView dashTextView2, @NonNull KcSeekBar kcSeekBar, @NonNull Space space, @NonNull KcSwitchButton kcSwitchButton, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull AlignTopTextView alignTopTextView3, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView9, @NonNull AlignTopTextView alignTopTextView4) {
        this.f80426a = constraintLayout;
        this.f80427b = baseTextView;
        this.f80428c = constraintLayout2;
        this.f80429d = view;
        this.f80430e = baseTextView2;
        this.f80431f = constraintLayout3;
        this.f80432g = constraintLayout4;
        this.f80433h = constraintLayout5;
        this.f80434i = baseTextView3;
        this.f80435j = dashTextView;
        this.f80436k = view2;
        this.f80437l = shapeConstraintLayout;
        this.f80438m = alignTopTextView;
        this.f80439n = baseTextView4;
        this.f80440o = alignTopTextView2;
        this.f80441p = constraintLayout6;
        this.f80442q = modifyLeverageInputView;
        this.f80443r = appCompatImageView;
        this.f80444s = baseTextView5;
        this.f80445t = baseTextView6;
        this.f80446u = dashTextView2;
        this.f80447v = kcSeekBar;
        this.f80448w = space;
        this.f80449x = kcSwitchButton;
        this.f80450y = baseTextView7;
        this.f80451z = baseTextView8;
        this.f80422A = alignTopTextView3;
        this.f80423B = kcPrimaryButton;
        this.f80424C = baseTextView9;
        this.f80425D = alignTopTextView4;
    }
}
