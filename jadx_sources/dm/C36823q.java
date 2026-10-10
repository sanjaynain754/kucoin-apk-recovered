package dm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;

/* JADX INFO: renamed from: dm.q */
/* JADX INFO: compiled from: BkumexDialogEuropeUnlockLeverageBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36823q implements ViewBinding {

    /* JADX INFO: renamed from: A */
    @NonNull
    public final BaseTextView f80823A;

    /* JADX INFO: renamed from: B */
    @NonNull
    public final BaseTextView f80824B;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f80825a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f80826b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f80827c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f80828d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f80829e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f80830f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ShapeConstraintLayout f80831g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final KcPrimaryButton f80832h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final View f80833i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final NestedScrollView f80834j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final ShapeConstraintLayout f80835k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f80836l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final AppCompatImageView f80837m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f80838n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final ShapeConstraintLayout f80839o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f80840p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final AppCompatImageView f80841q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f80842r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final ShapeConstraintLayout f80843s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f80844t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final AppCompatImageView f80845u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final BaseTextView f80846v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final BaseTextView f80847w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final Group f80848x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final AppCompatImageView f80849y;

    /* JADX INFO: renamed from: z */
    @NonNull
    public final BaseTextView f80850z;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36823q m82508a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.clContainer;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
        if (linearLayout != null) {
            i11 = R$id.close;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.desc;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.hintAction;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        i11 = R$id.hintDesc;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null) {
                            i11 = R$id.hintLayout;
                            ShapeConstraintLayout shapeConstraintLayout = (ShapeConstraintLayout) ViewBindings.findChildViewById(view, i11);
                            if (shapeConstraintLayout != null) {
                                i11 = R$id.know;
                                KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                if (kcPrimaryButton != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.line))) != null) {
                                    i11 = R$id.scrollView;
                                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i11);
                                    if (nestedScrollView != null) {
                                        i11 = R$id.stageOne;
                                        ShapeConstraintLayout shapeConstraintLayout2 = (ShapeConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                        if (shapeConstraintLayout2 != null) {
                                            i11 = R$id.stageOneDesc;
                                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView4 != null) {
                                                i11 = R$id.stageOneIcon;
                                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                                if (appCompatImageView2 != null) {
                                                    i11 = R$id.stageOneTitle;
                                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView5 != null) {
                                                        i11 = R$id.stageThree;
                                                        ShapeConstraintLayout shapeConstraintLayout3 = (ShapeConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                                        if (shapeConstraintLayout3 != null) {
                                                            i11 = R$id.stageThreeDesc;
                                                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView6 != null) {
                                                                i11 = R$id.stageThreeIcon;
                                                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                                                if (appCompatImageView3 != null) {
                                                                    i11 = R$id.stageThreeTitle;
                                                                    BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView7 != null) {
                                                                        i11 = R$id.stageTwo;
                                                                        ShapeConstraintLayout shapeConstraintLayout4 = (ShapeConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                                                        if (shapeConstraintLayout4 != null) {
                                                                            i11 = R$id.stageTwoDesc;
                                                                            BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView8 != null) {
                                                                                i11 = R$id.stageTwoIcon;
                                                                                AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                                                                if (appCompatImageView4 != null) {
                                                                                    i11 = R$id.stageTwoTitle;
                                                                                    BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (baseTextView9 != null) {
                                                                                        i11 = R$id.successDesc;
                                                                                        BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (baseTextView10 != null) {
                                                                                            i11 = R$id.successGroup;
                                                                                            Group group = (Group) ViewBindings.findChildViewById(view, i11);
                                                                                            if (group != null) {
                                                                                                i11 = R$id.successIcon;
                                                                                                AppCompatImageView appCompatImageView5 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                                                                                if (appCompatImageView5 != null) {
                                                                                                    i11 = R$id.successTitle;
                                                                                                    BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                    if (baseTextView11 != null) {
                                                                                                        i11 = R$id.title;
                                                                                                        BaseTextView baseTextView12 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                        if (baseTextView12 != null) {
                                                                                                            i11 = R$id.unlockLeverage;
                                                                                                            BaseTextView baseTextView13 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                            if (baseTextView13 != null) {
                                                                                                                return new C36823q((LinearLayout) view, linearLayout, appCompatImageView, baseTextView, baseTextView2, baseTextView3, shapeConstraintLayout, kcPrimaryButton, viewFindChildViewById, nestedScrollView, shapeConstraintLayout2, baseTextView4, appCompatImageView2, baseTextView5, shapeConstraintLayout3, baseTextView6, appCompatImageView3, baseTextView7, shapeConstraintLayout4, baseTextView8, appCompatImageView4, baseTextView9, baseTextView10, group, appCompatImageView5, baseTextView11, baseTextView12, baseTextView13);
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
    public LinearLayout getRoot() {
        return this.f80825a;
    }

    public C36823q(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull ShapeConstraintLayout shapeConstraintLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull View view, @NonNull NestedScrollView nestedScrollView, @NonNull ShapeConstraintLayout shapeConstraintLayout2, @NonNull BaseTextView baseTextView4, @NonNull AppCompatImageView appCompatImageView2, @NonNull BaseTextView baseTextView5, @NonNull ShapeConstraintLayout shapeConstraintLayout3, @NonNull BaseTextView baseTextView6, @NonNull AppCompatImageView appCompatImageView3, @NonNull BaseTextView baseTextView7, @NonNull ShapeConstraintLayout shapeConstraintLayout4, @NonNull BaseTextView baseTextView8, @NonNull AppCompatImageView appCompatImageView4, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull Group group, @NonNull AppCompatImageView appCompatImageView5, @NonNull BaseTextView baseTextView11, @NonNull BaseTextView baseTextView12, @NonNull BaseTextView baseTextView13) {
        this.f80825a = linearLayout;
        this.f80826b = linearLayout2;
        this.f80827c = appCompatImageView;
        this.f80828d = baseTextView;
        this.f80829e = baseTextView2;
        this.f80830f = baseTextView3;
        this.f80831g = shapeConstraintLayout;
        this.f80832h = kcPrimaryButton;
        this.f80833i = view;
        this.f80834j = nestedScrollView;
        this.f80835k = shapeConstraintLayout2;
        this.f80836l = baseTextView4;
        this.f80837m = appCompatImageView2;
        this.f80838n = baseTextView5;
        this.f80839o = shapeConstraintLayout3;
        this.f80840p = baseTextView6;
        this.f80841q = appCompatImageView3;
        this.f80842r = baseTextView7;
        this.f80843s = shapeConstraintLayout4;
        this.f80844t = baseTextView8;
        this.f80845u = appCompatImageView4;
        this.f80846v = baseTextView9;
        this.f80847w = baseTextView10;
        this.f80848x = group;
        this.f80849y = appCompatImageView5;
        this.f80850z = baseTextView11;
        this.f80823A = baseTextView12;
        this.f80824B = baseTextView13;
    }
}
