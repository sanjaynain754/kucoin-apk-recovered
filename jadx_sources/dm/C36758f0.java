package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.futures.view.ModifyLeverageInputView;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.AlignTopTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcSwitchButton;
import com.kubi.resources.widget.bubbleseekbar.KcSeekBar;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;

/* JADX INFO: renamed from: dm.f0 */
/* JADX INFO: compiled from: BkumexDialogIsolatedLeverageSettingBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36758f0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f79986a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f79987b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f79988c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f79989d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ConstraintLayout f79990e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f79991f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final View f79992g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ShapeConstraintLayout f79993h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final AlignTopTextView f79994i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f79995j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final AlignTopTextView f79996k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final ConstraintLayout f79997l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final ModifyLeverageInputView f79998m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final AppCompatImageView f79999n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final KcSeekBar f80000o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final ConstraintLayout f80001p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final AlignTopTextView f80002q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final KcSwitchButton f80003r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f80004s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f80005t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final AlignTopTextView f80006u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final KcPrimaryButton f80007v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final BaseTextView f80008w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final AlignTopTextView f80009x;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36758f0 m82367a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.batchLeverageCl;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
        if (constraintLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.batchLeverageDivider))) != null) {
            i11 = R$id.batchLeverageTitle;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.cl_content;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                if (constraintLayout2 != null) {
                    i11 = R$id.currentLeverage;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.dividerView))) != null) {
                        i11 = R$id.eduCl;
                        ShapeConstraintLayout shapeConstraintLayout = (ShapeConstraintLayout) ViewBindings.findChildViewById(view, i11);
                        if (shapeConstraintLayout != null) {
                            i11 = R$id.eduHint;
                            AlignTopTextView alignTopTextView = (AlignTopTextView) ViewBindings.findChildViewById(view, i11);
                            if (alignTopTextView != null) {
                                i11 = R$id.eduVerifyTv;
                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView3 != null) {
                                    i11 = R$id.hint;
                                    AlignTopTextView alignTopTextView2 = (AlignTopTextView) ViewBindings.findChildViewById(view, i11);
                                    if (alignTopTextView2 != null) {
                                        i11 = R$id.hintCl;
                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                        if (constraintLayout3 != null) {
                                            i11 = R$id.inputView;
                                            ModifyLeverageInputView modifyLeverageInputView = (ModifyLeverageInputView) ViewBindings.findChildViewById(view, i11);
                                            if (modifyLeverageInputView != null) {
                                                i11 = R$id.iv_back;
                                                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                                if (appCompatImageView != null) {
                                                    i11 = R$id.progressBar;
                                                    KcSeekBar kcSeekBar = (KcSeekBar) ViewBindings.findChildViewById(view, i11);
                                                    if (kcSeekBar != null) {
                                                        i11 = R$id.retailLeverageHintCl;
                                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                                        if (constraintLayout4 != null) {
                                                            i11 = R$id.retailLeverageHintTv;
                                                            AlignTopTextView alignTopTextView3 = (AlignTopTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (alignTopTextView3 != null) {
                                                                i11 = R$id.switch_batch;
                                                                KcSwitchButton kcSwitchButton = (KcSwitchButton) ViewBindings.findChildViewById(view, i11);
                                                                if (kcSwitchButton != null) {
                                                                    i11 = R$id.symbol;
                                                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView4 != null) {
                                                                        i11 = R$id.title;
                                                                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView5 != null) {
                                                                            i11 = R$id.trialLeverageHintTv;
                                                                            AlignTopTextView alignTopTextView4 = (AlignTopTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (alignTopTextView4 != null) {
                                                                                i11 = R$id.tv_confirm;
                                                                                KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                                                                if (kcPrimaryButton != null) {
                                                                                    i11 = R$id.verifyTv;
                                                                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (baseTextView6 != null) {
                                                                                        i11 = R$id.warning;
                                                                                        AlignTopTextView alignTopTextView5 = (AlignTopTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (alignTopTextView5 != null) {
                                                                                            return new C36758f0((ConstraintLayout) view, constraintLayout, viewFindChildViewById, baseTextView, constraintLayout2, baseTextView2, viewFindChildViewById2, shapeConstraintLayout, alignTopTextView, baseTextView3, alignTopTextView2, constraintLayout3, modifyLeverageInputView, appCompatImageView, kcSeekBar, constraintLayout4, alignTopTextView3, kcSwitchButton, baseTextView4, baseTextView5, alignTopTextView4, kcPrimaryButton, baseTextView6, alignTopTextView5);
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
        return this.f79986a;
    }

    public C36758f0(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull View view, @NonNull BaseTextView baseTextView, @NonNull ConstraintLayout constraintLayout3, @NonNull BaseTextView baseTextView2, @NonNull View view2, @NonNull ShapeConstraintLayout shapeConstraintLayout, @NonNull AlignTopTextView alignTopTextView, @NonNull BaseTextView baseTextView3, @NonNull AlignTopTextView alignTopTextView2, @NonNull ConstraintLayout constraintLayout4, @NonNull ModifyLeverageInputView modifyLeverageInputView, @NonNull AppCompatImageView appCompatImageView, @NonNull KcSeekBar kcSeekBar, @NonNull ConstraintLayout constraintLayout5, @NonNull AlignTopTextView alignTopTextView3, @NonNull KcSwitchButton kcSwitchButton, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull AlignTopTextView alignTopTextView4, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView6, @NonNull AlignTopTextView alignTopTextView5) {
        this.f79986a = constraintLayout;
        this.f79987b = constraintLayout2;
        this.f79988c = view;
        this.f79989d = baseTextView;
        this.f79990e = constraintLayout3;
        this.f79991f = baseTextView2;
        this.f79992g = view2;
        this.f79993h = shapeConstraintLayout;
        this.f79994i = alignTopTextView;
        this.f79995j = baseTextView3;
        this.f79996k = alignTopTextView2;
        this.f79997l = constraintLayout4;
        this.f79998m = modifyLeverageInputView;
        this.f79999n = appCompatImageView;
        this.f80000o = kcSeekBar;
        this.f80001p = constraintLayout5;
        this.f80002q = alignTopTextView3;
        this.f80003r = kcSwitchButton;
        this.f80004s = baseTextView4;
        this.f80005t = baseTextView5;
        this.f80006u = alignTopTextView4;
        this.f80007v = kcPrimaryButton;
        this.f80008w = baseTextView6;
        this.f80009x = alignTopTextView5;
    }
}
