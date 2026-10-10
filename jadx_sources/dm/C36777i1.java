package dm;

import android.view.View;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.futures.view.ModifyLeverageInputView;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.AlignTopTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.bubbleseekbar.KcSeekBar;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dm.i1 */
/* JADX INFO: compiled from: BkumexDialogUnifyCrossLeverageSettingBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36777i1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80233a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Group f80234b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f80235c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f80236d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ConstraintLayout f80237e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ConstraintLayout f80238f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f80239g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final DashTextView f80240h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final Space f80241i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final AlignTopTextView f80242j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final ConstraintLayout f80243k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final ModifyLeverageInputView f80244l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final AppCompatImageView f80245m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f80246n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f80247o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final DashTextView f80248p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final KcSeekBar f80249q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final Space f80250r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f80251s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f80252t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final KcPrimaryButton f80253u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final BaseTextView f80254v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final AlignTopTextView f80255w;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36777i1 m82412a(@NonNull View view) {
        int i11 = R$id.adjustGroup;
        Group group = (Group) ViewBindings.findChildViewById(view, i11);
        if (group != null) {
            i11 = R$id.after;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.cl_adjust;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                if (constraintLayout != null) {
                    i11 = R$id.cl_content;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                    if (constraintLayout2 != null) {
                        i11 = R$id.cl_title;
                        ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                        if (constraintLayout3 != null) {
                            i11 = R$id.current;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                i11 = R$id.currentLeverage;
                                DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                if (dashTextView != null) {
                                    i11 = R$id.dividerView;
                                    Space space = (Space) ViewBindings.findChildViewById(view, i11);
                                    if (space != null) {
                                        i11 = R$id.hint;
                                        AlignTopTextView alignTopTextView = (AlignTopTextView) ViewBindings.findChildViewById(view, i11);
                                        if (alignTopTextView != null) {
                                            i11 = R$id.hintCl;
                                            ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                            if (constraintLayout4 != null) {
                                                i11 = R$id.inputView;
                                                ModifyLeverageInputView modifyLeverageInputView = (ModifyLeverageInputView) ViewBindings.findChildViewById(view, i11);
                                                if (modifyLeverageInputView != null) {
                                                    i11 = R$id.iv_back;
                                                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                                    if (appCompatImageView != null) {
                                                        i11 = R$id.marginAfter;
                                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView3 != null) {
                                                            i11 = R$id.marginCurrent;
                                                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView4 != null) {
                                                                i11 = R$id.marginLabel;
                                                                DashTextView dashTextView2 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (dashTextView2 != null) {
                                                                    i11 = R$id.progressBar;
                                                                    KcSeekBar kcSeekBar = (KcSeekBar) ViewBindings.findChildViewById(view, i11);
                                                                    if (kcSeekBar != null) {
                                                                        i11 = R$id.space;
                                                                        Space space2 = (Space) ViewBindings.findChildViewById(view, i11);
                                                                        if (space2 != null) {
                                                                            i11 = R$id.symbol;
                                                                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView5 != null) {
                                                                                i11 = R$id.title;
                                                                                BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView6 != null) {
                                                                                    i11 = R$id.tv_confirm;
                                                                                    KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                                                                    if (kcPrimaryButton != null) {
                                                                                        i11 = R$id.verifyTv;
                                                                                        BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (baseTextView7 != null) {
                                                                                            i11 = R$id.warning;
                                                                                            AlignTopTextView alignTopTextView2 = (AlignTopTextView) ViewBindings.findChildViewById(view, i11);
                                                                                            if (alignTopTextView2 != null) {
                                                                                                return new C36777i1((ConstraintLayout) view, group, baseTextView, constraintLayout, constraintLayout2, constraintLayout3, baseTextView2, dashTextView, space, alignTopTextView, constraintLayout4, modifyLeverageInputView, appCompatImageView, baseTextView3, baseTextView4, dashTextView2, kcSeekBar, space2, baseTextView5, baseTextView6, kcPrimaryButton, baseTextView7, alignTopTextView2);
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
        return this.f80233a;
    }

    public C36777i1(@NonNull ConstraintLayout constraintLayout, @NonNull Group group, @NonNull BaseTextView baseTextView, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ConstraintLayout constraintLayout4, @NonNull BaseTextView baseTextView2, @NonNull DashTextView dashTextView, @NonNull Space space, @NonNull AlignTopTextView alignTopTextView, @NonNull ConstraintLayout constraintLayout5, @NonNull ModifyLeverageInputView modifyLeverageInputView, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull DashTextView dashTextView2, @NonNull KcSeekBar kcSeekBar, @NonNull Space space2, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView7, @NonNull AlignTopTextView alignTopTextView2) {
        this.f80233a = constraintLayout;
        this.f80234b = group;
        this.f80235c = baseTextView;
        this.f80236d = constraintLayout2;
        this.f80237e = constraintLayout3;
        this.f80238f = constraintLayout4;
        this.f80239g = baseTextView2;
        this.f80240h = dashTextView;
        this.f80241i = space;
        this.f80242j = alignTopTextView;
        this.f80243k = constraintLayout5;
        this.f80244l = modifyLeverageInputView;
        this.f80245m = appCompatImageView;
        this.f80246n = baseTextView3;
        this.f80247o = baseTextView4;
        this.f80248p = dashTextView2;
        this.f80249q = kcSeekBar;
        this.f80250r = space2;
        this.f80251s = baseTextView5;
        this.f80252t = baseTextView6;
        this.f80253u = kcPrimaryButton;
        this.f80254v = baseTextView7;
        this.f80255w = alignTopTextView2;
    }
}
