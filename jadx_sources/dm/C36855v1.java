package dm;

import android.view.View;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.futures.view.ModifyMarginInputView;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.KcSmallSwitchButton;
import com.kubi.resources.widget.KcTradeRateView;
import com.kubi.resources.widget.bubbleseekbar.KcSeekBar;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dm.v1 */
/* JADX INFO: compiled from: BkumexFragmentChildModifyMarginBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36855v1 implements ViewBinding {

    /* JADX INFO: renamed from: A */
    @NonNull
    public final Space f81203A;

    /* JADX INFO: renamed from: B */
    @NonNull
    public final BaseTextView f81204B;

    /* JADX INFO: renamed from: C */
    @NonNull
    public final KcTradeRateView f81205C;

    /* JADX INFO: renamed from: D */
    @NonNull
    public final KcPrimaryButton f81206D;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81207a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f81208b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Group f81209c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f81210d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final KcSmallSwitchButton f81211e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f81212f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ConstraintLayout f81213g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ConstraintLayout f81214h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f81215i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f81216j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f81217k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f81218l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f81219m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final ModifyMarginInputView f81220n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f81221o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f81222p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final DashTextView f81223q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final View f81224r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f81225s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f81226t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f81227u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final BaseTextView f81228v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final BaseTextView f81229w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final DashTextView f81230x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final KcSeekBar f81231y;

    /* JADX INFO: renamed from: z */
    @NonNull
    public final DashTextView f81232z;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36855v1 m82575a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.after;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.autoGroup;
            Group group = (Group) ViewBindings.findChildViewById(view, i11);
            if (group != null) {
                i11 = R$id.autoLabel;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.autoSwitch;
                    KcSmallSwitchButton kcSmallSwitchButton = (KcSmallSwitchButton) ViewBindings.findChildViewById(view, i11);
                    if (kcSmallSwitchButton != null) {
                        i11 = R$id.availableBalance;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null) {
                            i11 = R$id.cl_adjust;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                            if (constraintLayout != null) {
                                i11 = R$id.cl_title;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                if (constraintLayout2 != null) {
                                    i11 = R$id.current;
                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView4 != null) {
                                        i11 = R$id.desc;
                                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView5 != null) {
                                            i11 = R$id.entryAfter;
                                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView6 != null) {
                                                i11 = R$id.entryCurrent;
                                                BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView7 != null) {
                                                    i11 = R$id.entryLabel;
                                                    BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView8 != null) {
                                                        i11 = R$id.inputView;
                                                        ModifyMarginInputView modifyMarginInputView = (ModifyMarginInputView) ViewBindings.findChildViewById(view, i11);
                                                        if (modifyMarginInputView != null) {
                                                            i11 = R$id.leverageAfter;
                                                            BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView9 != null) {
                                                                i11 = R$id.leverageCurrent;
                                                                BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView10 != null) {
                                                                    i11 = R$id.leverageLabel;
                                                                    DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (dashTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.line))) != null) {
                                                                        i11 = R$id.liquidationAfter;
                                                                        BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView11 != null) {
                                                                            i11 = R$id.liquidationCurrent;
                                                                            BaseTextView baseTextView12 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView12 != null) {
                                                                                i11 = R$id.liquidationLabel;
                                                                                BaseTextView baseTextView13 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView13 != null) {
                                                                                    i11 = R$id.marginAfter;
                                                                                    BaseTextView baseTextView14 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (baseTextView14 != null) {
                                                                                        i11 = R$id.marginCurrent;
                                                                                        BaseTextView baseTextView15 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (baseTextView15 != null) {
                                                                                            i11 = R$id.marginLabel;
                                                                                            DashTextView dashTextView2 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                                                            if (dashTextView2 != null) {
                                                                                                i11 = R$id.progressBar;
                                                                                                KcSeekBar kcSeekBar = (KcSeekBar) ViewBindings.findChildViewById(view, i11);
                                                                                                if (kcSeekBar != null) {
                                                                                                    i11 = R$id.questionLabel;
                                                                                                    DashTextView dashTextView3 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                    if (dashTextView3 != null) {
                                                                                                        i11 = R$id.space;
                                                                                                        Space space = (Space) ViewBindings.findChildViewById(view, i11);
                                                                                                        if (space != null) {
                                                                                                            i11 = R$id.symbol;
                                                                                                            BaseTextView baseTextView16 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                            if (baseTextView16 != null) {
                                                                                                                i11 = R$id.tag;
                                                                                                                KcTradeRateView kcTradeRateView = (KcTradeRateView) ViewBindings.findChildViewById(view, i11);
                                                                                                                if (kcTradeRateView != null) {
                                                                                                                    i11 = R$id.tv_confirm;
                                                                                                                    KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                                                                                                    if (kcPrimaryButton != null) {
                                                                                                                        return new C36855v1((ConstraintLayout) view, baseTextView, group, baseTextView2, kcSmallSwitchButton, baseTextView3, constraintLayout, constraintLayout2, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, modifyMarginInputView, baseTextView9, baseTextView10, dashTextView, viewFindChildViewById, baseTextView11, baseTextView12, baseTextView13, baseTextView14, baseTextView15, dashTextView2, kcSeekBar, dashTextView3, space, baseTextView16, kcTradeRateView, kcPrimaryButton);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f81207a;
    }

    public C36855v1(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull Group group, @NonNull BaseTextView baseTextView2, @NonNull KcSmallSwitchButton kcSmallSwitchButton, @NonNull BaseTextView baseTextView3, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull ModifyMarginInputView modifyMarginInputView, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull DashTextView dashTextView, @NonNull View view, @NonNull BaseTextView baseTextView11, @NonNull BaseTextView baseTextView12, @NonNull BaseTextView baseTextView13, @NonNull BaseTextView baseTextView14, @NonNull BaseTextView baseTextView15, @NonNull DashTextView dashTextView2, @NonNull KcSeekBar kcSeekBar, @NonNull DashTextView dashTextView3, @NonNull Space space, @NonNull BaseTextView baseTextView16, @NonNull KcTradeRateView kcTradeRateView, @NonNull KcPrimaryButton kcPrimaryButton) {
        this.f81207a = constraintLayout;
        this.f81208b = baseTextView;
        this.f81209c = group;
        this.f81210d = baseTextView2;
        this.f81211e = kcSmallSwitchButton;
        this.f81212f = baseTextView3;
        this.f81213g = constraintLayout2;
        this.f81214h = constraintLayout3;
        this.f81215i = baseTextView4;
        this.f81216j = baseTextView5;
        this.f81217k = baseTextView6;
        this.f81218l = baseTextView7;
        this.f81219m = baseTextView8;
        this.f81220n = modifyMarginInputView;
        this.f81221o = baseTextView9;
        this.f81222p = baseTextView10;
        this.f81223q = dashTextView;
        this.f81224r = view;
        this.f81225s = baseTextView11;
        this.f81226t = baseTextView12;
        this.f81227u = baseTextView13;
        this.f81228v = baseTextView14;
        this.f81229w = baseTextView15;
        this.f81230x = dashTextView2;
        this.f81231y = kcSeekBar;
        this.f81232z = dashTextView3;
        this.f81203A = space;
        this.f81204B = baseTextView16;
        this.f81205C = kcTradeRateView;
        this.f81206D = kcPrimaryButton;
    }
}
