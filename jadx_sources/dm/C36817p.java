package dm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;

/* JADX INFO: renamed from: dm.p */
/* JADX INFO: compiled from: BkumexDialogEuropeTrialSimulationOrderBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36817p implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f80747a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f80748b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f80749c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f80750d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f80751e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final KcPrimaryButton f80752f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AppCompatImageView f80753g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f80754h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f80755i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ShapeConstraintLayout f80756j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f80757k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f80758l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f80759m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f80760n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f80761o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f80762p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f80763q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f80764r;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36817p m82495a(@NonNull View view) {
        int i11 = R$id.clContainer;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
        if (constraintLayout != null) {
            i11 = R$id.close;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.condition;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.desc;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        i11 = R$id.done;
                        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                        if (kcPrimaryButton != null) {
                            i11 = R$id.image;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                            if (appCompatImageView2 != null) {
                                i11 = R$id.leverage;
                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView3 != null) {
                                    i11 = R$id.leverageLabel;
                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView4 != null) {
                                        i11 = R$id.orderLayout;
                                        ShapeConstraintLayout shapeConstraintLayout = (ShapeConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                        if (shapeConstraintLayout != null) {
                                            i11 = R$id.orderTitle;
                                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView5 != null) {
                                                i11 = R$id.side;
                                                BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView6 != null) {
                                                    i11 = R$id.sideLabel;
                                                    BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView7 != null) {
                                                        i11 = R$id.symbol;
                                                        BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView8 != null) {
                                                            i11 = R$id.symbolLabel;
                                                            BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView9 != null) {
                                                                i11 = R$id.title;
                                                                BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView10 != null) {
                                                                    i11 = R$id.type;
                                                                    BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView11 != null) {
                                                                        i11 = R$id.typeLabel;
                                                                        BaseTextView baseTextView12 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView12 != null) {
                                                                            return new C36817p((LinearLayout) view, constraintLayout, appCompatImageView, baseTextView, baseTextView2, kcPrimaryButton, appCompatImageView2, baseTextView3, baseTextView4, shapeConstraintLayout, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, baseTextView11, baseTextView12);
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
        return this.f80747a;
    }

    public C36817p(@NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull AppCompatImageView appCompatImageView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull ShapeConstraintLayout shapeConstraintLayout, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull BaseTextView baseTextView12) {
        this.f80747a = linearLayout;
        this.f80748b = constraintLayout;
        this.f80749c = appCompatImageView;
        this.f80750d = baseTextView;
        this.f80751e = baseTextView2;
        this.f80752f = kcPrimaryButton;
        this.f80753g = appCompatImageView2;
        this.f80754h = baseTextView3;
        this.f80755i = baseTextView4;
        this.f80756j = shapeConstraintLayout;
        this.f80757k = baseTextView5;
        this.f80758l = baseTextView6;
        this.f80759m = baseTextView7;
        this.f80760n = baseTextView8;
        this.f80761o = baseTextView9;
        this.f80762p = baseTextView10;
        this.f80763q = baseTextView11;
        this.f80764r = baseTextView12;
    }
}
