package l60;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.unify.R$id;

/* JADX INFO: renamed from: l60.a */
/* JADX INFO: compiled from: FragmentUnifyAccountToggleBinding.java */
/* JADX INFO: loaded from: classes52.dex */
public final class C42106a implements ViewBinding {

    /* JADX INFO: renamed from: A */
    @NonNull
    public final BaseTextView f93430A;

    /* JADX INFO: renamed from: B */
    @NonNull
    public final BaseTextView f93431B;

    /* JADX INFO: renamed from: C */
    @NonNull
    public final KcPrimaryButton f93432C;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final NestedScrollView f93433a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f93434b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f93435c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f93436d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f93437e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final NestedScrollView f93438f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final FlexboxLayout f93439g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final FlexboxLayout f93440h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final FlexboxLayout f93441i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f93442j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f93443k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final KcPrimaryButton f93444l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f93445m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f93446n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f93447o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f93448p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f93449q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f93450r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f93451s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f93452t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f93453u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final BaseTextView f93454v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final BaseTextView f93455w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final BaseTextView f93456x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final BaseTextView f93457y;

    /* JADX INFO: renamed from: z */
    @NonNull
    public final BaseTextView f93458z;

    public C42106a(@NonNull NestedScrollView nestedScrollView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KcPrimaryButton kcPrimaryButton2, @NonNull View view, @NonNull View view2, @NonNull NestedScrollView nestedScrollView2, @NonNull FlexboxLayout flexboxLayout, @NonNull FlexboxLayout flexboxLayout2, @NonNull FlexboxLayout flexboxLayout3, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull KcPrimaryButton kcPrimaryButton3, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull BaseTextView baseTextView12, @NonNull BaseTextView baseTextView13, @NonNull BaseTextView baseTextView14, @NonNull BaseTextView baseTextView15, @NonNull BaseTextView baseTextView16, @NonNull BaseTextView baseTextView17, @NonNull BaseTextView baseTextView18, @NonNull KcPrimaryButton kcPrimaryButton4) {
        this.f93433a = nestedScrollView;
        this.f93434b = kcPrimaryButton;
        this.f93435c = kcPrimaryButton2;
        this.f93436d = view;
        this.f93437e = view2;
        this.f93438f = nestedScrollView2;
        this.f93439g = flexboxLayout;
        this.f93440h = flexboxLayout2;
        this.f93441i = flexboxLayout3;
        this.f93442j = baseTextView;
        this.f93443k = baseTextView2;
        this.f93444l = kcPrimaryButton3;
        this.f93445m = baseTextView3;
        this.f93446n = baseTextView4;
        this.f93447o = baseTextView5;
        this.f93448p = baseTextView6;
        this.f93449q = baseTextView7;
        this.f93450r = baseTextView8;
        this.f93451s = baseTextView9;
        this.f93452t = baseTextView10;
        this.f93453u = baseTextView11;
        this.f93454v = baseTextView12;
        this.f93455w = baseTextView13;
        this.f93456x = baseTextView14;
        this.f93457y = baseTextView15;
        this.f93458z = baseTextView16;
        this.f93430A = baseTextView17;
        this.f93431B = baseTextView18;
        this.f93432C = kcPrimaryButton4;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42106a m92367a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.btnToggleClassic;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.btnToggleUnify;
            KcPrimaryButton kcPrimaryButton2 = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.divider))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.divider1))) != null) {
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                i11 = R$id.supportTradeList;
                FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(view, i11);
                if (flexboxLayout != null) {
                    i11 = R$id.supportTradeListUnify;
                    FlexboxLayout flexboxLayout2 = (FlexboxLayout) ViewBindings.findChildViewById(view, i11);
                    if (flexboxLayout2 != null) {
                        i11 = R$id.supportTradeListUnifyMore;
                        FlexboxLayout flexboxLayout3 = (FlexboxLayout) ViewBindings.findChildViewById(view, i11);
                        if (flexboxLayout3 != null) {
                            i11 = R$id.title;
                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView != null) {
                                i11 = R$id.tvClassic;
                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView2 != null) {
                                    i11 = R$id.tvClassicCheck;
                                    KcPrimaryButton kcPrimaryButton3 = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                    if (kcPrimaryButton3 != null) {
                                        i11 = R$id.tvClassicDesc;
                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView3 != null) {
                                            i11 = R$id.tvFundsRule;
                                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView4 != null) {
                                                i11 = R$id.tvFundsRule1;
                                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView5 != null) {
                                                    i11 = R$id.tvFundsRule1Unify;
                                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView6 != null) {
                                                        i11 = R$id.tvFundsRule2;
                                                        BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView7 != null) {
                                                            i11 = R$id.tvFundsRule2Unify;
                                                            BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView8 != null) {
                                                                i11 = R$id.tvFundsRuleUnify;
                                                                BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView9 != null) {
                                                                    i11 = R$id.tvMoreTrade;
                                                                    BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView10 != null) {
                                                                        i11 = R$id.tvSupportTrade;
                                                                        BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView11 != null) {
                                                                            i11 = R$id.tvSupportTradeUnify;
                                                                            BaseTextView baseTextView12 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView12 != null) {
                                                                                i11 = R$id.tvUnify;
                                                                                BaseTextView baseTextView13 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView13 != null) {
                                                                                    i11 = R$id.tvUnifyDesc;
                                                                                    BaseTextView baseTextView14 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (baseTextView14 != null) {
                                                                                        i11 = R$id.tvUseRule;
                                                                                        BaseTextView baseTextView15 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (baseTextView15 != null) {
                                                                                            i11 = R$id.tvUseRule1;
                                                                                            BaseTextView baseTextView16 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                            if (baseTextView16 != null) {
                                                                                                i11 = R$id.tvUseRule1Unify;
                                                                                                BaseTextView baseTextView17 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                if (baseTextView17 != null) {
                                                                                                    i11 = R$id.tvUseRuleUnify;
                                                                                                    BaseTextView baseTextView18 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                    if (baseTextView18 != null) {
                                                                                                        i11 = R$id.unifyCheck;
                                                                                                        KcPrimaryButton kcPrimaryButton4 = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                                                                                        if (kcPrimaryButton4 != null) {
                                                                                                            return new C42106a(nestedScrollView, kcPrimaryButton, kcPrimaryButton2, viewFindChildViewById, viewFindChildViewById2, nestedScrollView, flexboxLayout, flexboxLayout2, flexboxLayout3, baseTextView, baseTextView2, kcPrimaryButton3, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, baseTextView11, baseTextView12, baseTextView13, baseTextView14, baseTextView15, baseTextView16, baseTextView17, baseTextView18, kcPrimaryButton4);
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
    public NestedScrollView getRoot() {
        return this.f93433a;
    }
}
