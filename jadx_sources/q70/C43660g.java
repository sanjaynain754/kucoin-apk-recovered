package q70;

import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.utaspotlib.R$id;

/* JADX INFO: renamed from: q70.g */
/* JADX INFO: compiled from: UtaOrderInfoConfirmDialogLayoutBinding.java */
/* JADX INFO: loaded from: classes54.dex */
public final class C43660g implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f96383a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f96384b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final CheckBox f96385c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FrameLayout f96386d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatImageView f96387e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatImageView f96388f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ShapeTextView f96389g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final NestedScrollView f96390h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f96391i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f96392j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f96393k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f96394l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f96395m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f96396n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f96397o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f96398p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f96399q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final AppCompatTextView f96400r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f96401s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final View f96402t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final View f96403u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final View f96404v;

    public C43660g(@NonNull ConstraintLayout constraintLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull CheckBox checkBox, @NonNull FrameLayout frameLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull ShapeTextView shapeTextView, @NonNull NestedScrollView nestedScrollView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull AppCompatTextView appCompatTextView, @NonNull BaseTextView baseTextView10, @NonNull View view, @NonNull View view2, @NonNull View view3) {
        this.f96383a = constraintLayout;
        this.f96384b = kcPrimaryButton;
        this.f96385c = checkBox;
        this.f96386d = frameLayout;
        this.f96387e = appCompatImageView;
        this.f96388f = appCompatImageView2;
        this.f96389g = shapeTextView;
        this.f96390h = nestedScrollView;
        this.f96391i = baseTextView;
        this.f96392j = baseTextView2;
        this.f96393k = baseTextView3;
        this.f96394l = baseTextView4;
        this.f96395m = baseTextView5;
        this.f96396n = baseTextView6;
        this.f96397o = baseTextView7;
        this.f96398p = baseTextView8;
        this.f96399q = baseTextView9;
        this.f96400r = appCompatTextView;
        this.f96401s = baseTextView10;
        this.f96402t = view;
        this.f96403u = view2;
        this.f96404v = view3;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C43660g m96081a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        int i11 = R$id.btn_confirm;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.cbNotShowAgain;
            CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i11);
            if (checkBox != null) {
                i11 = R$id.detailContainerView;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                if (frameLayout != null) {
                    i11 = R$id.ivClose;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatImageView != null) {
                        i11 = R$id.ivRiskRatioArrow;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                        if (appCompatImageView2 != null) {
                            i11 = R$id.orderType;
                            ShapeTextView shapeTextView = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                            if (shapeTextView != null) {
                                i11 = R$id.scrollContent;
                                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i11);
                                if (nestedScrollView != null) {
                                    i11 = R$id.tvBorrowAmount;
                                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView != null) {
                                        i11 = R$id.tvBorrowAmountValue;
                                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView2 != null) {
                                            i11 = R$id.tvCurrentRiskRatioValue;
                                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView3 != null) {
                                                i11 = R$id.tvHour;
                                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView4 != null) {
                                                    i11 = R$id.tvHourValue;
                                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView5 != null) {
                                                        i11 = R$id.tvNotShowAgainDes;
                                                        BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView6 != null) {
                                                            i11 = R$id.tvPreAfterRiskRatioValue;
                                                            BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView7 != null) {
                                                                i11 = R$id.tvRiskRatioTitle;
                                                                BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView8 != null) {
                                                                    i11 = R$id.tvSymbolName;
                                                                    BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView9 != null) {
                                                                        i11 = R$id.tvTitle;
                                                                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (appCompatTextView != null) {
                                                                            i11 = R$id.tvTradeDirection;
                                                                            BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView10 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.viewDivider))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.viewDivider2))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i11 = R$id.viewDivider3))) != null) {
                                                                                return new C43660g((ConstraintLayout) view, kcPrimaryButton, checkBox, frameLayout, appCompatImageView, appCompatImageView2, shapeTextView, nestedScrollView, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, appCompatTextView, baseTextView10, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3);
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
        return this.f96383a;
    }
}
