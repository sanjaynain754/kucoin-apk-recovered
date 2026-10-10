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

/* JADX INFO: renamed from: dm.j1 */
/* JADX INFO: compiled from: BkumexDialogUnifyIsolatedLeverageSettingBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36783j1 implements ViewBinding {

    /* JADX INFO: renamed from: A */
    @NonNull
    public final BaseTextView f80295A;

    /* JADX INFO: renamed from: B */
    @NonNull
    public final AlignTopTextView f80296B;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80297a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Group f80298b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f80299c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f80300d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ConstraintLayout f80301e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ConstraintLayout f80302f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f80303g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final DashTextView f80304h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final Space f80305i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final AlignTopTextView f80306j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final ConstraintLayout f80307k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final AlignTopTextView f80308l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final ModifyLeverageInputView f80309m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final AppCompatImageView f80310n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f80311o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f80312p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final DashTextView f80313q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f80314r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f80315s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final DashTextView f80316t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final KcSeekBar f80317u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final BaseTextView f80318v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final Space f80319w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final BaseTextView f80320x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final BaseTextView f80321y;

    /* JADX INFO: renamed from: z */
    @NonNull
    public final KcPrimaryButton f80322z;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36783j1 m82424a(@NonNull View view) {
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
                                                i11 = R$id.holdPosition;
                                                AlignTopTextView alignTopTextView2 = (AlignTopTextView) ViewBindings.findChildViewById(view, i11);
                                                if (alignTopTextView2 != null) {
                                                    i11 = R$id.inputView;
                                                    ModifyLeverageInputView modifyLeverageInputView = (ModifyLeverageInputView) ViewBindings.findChildViewById(view, i11);
                                                    if (modifyLeverageInputView != null) {
                                                        i11 = R$id.iv_back;
                                                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                                        if (appCompatImageView != null) {
                                                            i11 = R$id.liquidationPriceAfter;
                                                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView3 != null) {
                                                                i11 = R$id.liquidationPriceCurrent;
                                                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView4 != null) {
                                                                    i11 = R$id.liquidationPriceLabel;
                                                                    DashTextView dashTextView2 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (dashTextView2 != null) {
                                                                        i11 = R$id.marginAfter;
                                                                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView5 != null) {
                                                                            i11 = R$id.marginCurrent;
                                                                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView6 != null) {
                                                                                i11 = R$id.marginLabel;
                                                                                DashTextView dashTextView3 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (dashTextView3 != null) {
                                                                                    i11 = R$id.progressBar;
                                                                                    KcSeekBar kcSeekBar = (KcSeekBar) ViewBindings.findChildViewById(view, i11);
                                                                                    if (kcSeekBar != null) {
                                                                                        i11 = R$id.riskLimit;
                                                                                        BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (baseTextView7 != null) {
                                                                                            i11 = R$id.space;
                                                                                            Space space2 = (Space) ViewBindings.findChildViewById(view, i11);
                                                                                            if (space2 != null) {
                                                                                                i11 = R$id.symbol;
                                                                                                BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                if (baseTextView8 != null) {
                                                                                                    i11 = R$id.title;
                                                                                                    BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                    if (baseTextView9 != null) {
                                                                                                        i11 = R$id.tv_confirm;
                                                                                                        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                                                                                        if (kcPrimaryButton != null) {
                                                                                                            i11 = R$id.verifyTv;
                                                                                                            BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                            if (baseTextView10 != null) {
                                                                                                                i11 = R$id.warning;
                                                                                                                AlignTopTextView alignTopTextView3 = (AlignTopTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                                if (alignTopTextView3 != null) {
                                                                                                                    return new C36783j1((ConstraintLayout) view, group, baseTextView, constraintLayout, constraintLayout2, constraintLayout3, baseTextView2, dashTextView, space, alignTopTextView, constraintLayout4, alignTopTextView2, modifyLeverageInputView, appCompatImageView, baseTextView3, baseTextView4, dashTextView2, baseTextView5, baseTextView6, dashTextView3, kcSeekBar, baseTextView7, space2, baseTextView8, baseTextView9, kcPrimaryButton, baseTextView10, alignTopTextView3);
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
        return this.f80297a;
    }

    public C36783j1(@NonNull ConstraintLayout constraintLayout, @NonNull Group group, @NonNull BaseTextView baseTextView, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ConstraintLayout constraintLayout4, @NonNull BaseTextView baseTextView2, @NonNull DashTextView dashTextView, @NonNull Space space, @NonNull AlignTopTextView alignTopTextView, @NonNull ConstraintLayout constraintLayout5, @NonNull AlignTopTextView alignTopTextView2, @NonNull ModifyLeverageInputView modifyLeverageInputView, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull DashTextView dashTextView2, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull DashTextView dashTextView3, @NonNull KcSeekBar kcSeekBar, @NonNull BaseTextView baseTextView7, @NonNull Space space2, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView10, @NonNull AlignTopTextView alignTopTextView3) {
        this.f80297a = constraintLayout;
        this.f80298b = group;
        this.f80299c = baseTextView;
        this.f80300d = constraintLayout2;
        this.f80301e = constraintLayout3;
        this.f80302f = constraintLayout4;
        this.f80303g = baseTextView2;
        this.f80304h = dashTextView;
        this.f80305i = space;
        this.f80306j = alignTopTextView;
        this.f80307k = constraintLayout5;
        this.f80308l = alignTopTextView2;
        this.f80309m = modifyLeverageInputView;
        this.f80310n = appCompatImageView;
        this.f80311o = baseTextView3;
        this.f80312p = baseTextView4;
        this.f80313q = dashTextView2;
        this.f80314r = baseTextView5;
        this.f80315s = baseTextView6;
        this.f80316t = dashTextView3;
        this.f80317u = kcSeekBar;
        this.f80318v = baseTextView7;
        this.f80319w = space2;
        this.f80320x = baseTextView8;
        this.f80321y = baseTextView9;
        this.f80322z = kcPrimaryButton;
        this.f80295A = baseTextView10;
        this.f80296B = alignTopTextView3;
    }
}
