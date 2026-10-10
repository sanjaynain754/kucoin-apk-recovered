package p637ta;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;
import com.kubi.sdk.widget.shape.view.ShapeImageView;

/* JADX INFO: renamed from: ta.u5 */
/* JADX INFO: compiled from: ViewAccountInfoHeaderBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44877u5 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f100958a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatCheckBox f100959b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayoutCompat f100960c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ShowHideTextView f100961d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FrameLayout f100962e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ShapeImageView f100963f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final FrameLayout f100964g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final AppCompatImageView f100965h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ImageView f100966i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ImageView f100967j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final AppCompatImageView f100968k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final ShapeLinearLayout f100969l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final ShapeLinearLayout f100970m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final LinearLayoutCompat f100971n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final DashTextView f100972o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f100973p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f100974q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f100975r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final DashTextView f100976s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final ShowHideTextView f100977t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final ShowHideTextView f100978u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final BaseTextView f100979v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final ViewStub f100980w;

    public C44877u5(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatCheckBox appCompatCheckBox, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ShowHideTextView showHideTextView, @NonNull FrameLayout frameLayout, @NonNull ShapeImageView shapeImageView, @NonNull FrameLayout frameLayout2, @NonNull AppCompatImageView appCompatImageView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull AppCompatImageView appCompatImageView2, @NonNull ShapeLinearLayout shapeLinearLayout, @NonNull ShapeLinearLayout shapeLinearLayout2, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull DashTextView dashTextView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull DashTextView dashTextView2, @NonNull ShowHideTextView showHideTextView2, @NonNull ShowHideTextView showHideTextView3, @NonNull BaseTextView baseTextView4, @NonNull ViewStub viewStub) {
        this.f100958a = constraintLayout;
        this.f100959b = appCompatCheckBox;
        this.f100960c = linearLayoutCompat;
        this.f100961d = showHideTextView;
        this.f100962e = frameLayout;
        this.f100963f = shapeImageView;
        this.f100964g = frameLayout2;
        this.f100965h = appCompatImageView;
        this.f100966i = imageView;
        this.f100967j = imageView2;
        this.f100968k = appCompatImageView2;
        this.f100969l = shapeLinearLayout;
        this.f100970m = shapeLinearLayout2;
        this.f100971n = linearLayoutCompat2;
        this.f100972o = dashTextView;
        this.f100973p = baseTextView;
        this.f100974q = baseTextView2;
        this.f100975r = baseTextView3;
        this.f100976s = dashTextView2;
        this.f100977t = showHideTextView2;
        this.f100978u = showHideTextView3;
        this.f100979v = baseTextView4;
        this.f100980w = viewStub;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44877u5 m99278a(@NonNull View view) {
        int i11 = R$id.cbHideOrShow;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(view, i11);
        if (appCompatCheckBox != null) {
            i11 = R$id.chartIndicator;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
            if (linearLayoutCompat != null) {
                i11 = R$id.day_value;
                ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                if (showHideTextView != null) {
                    i11 = R$id.fl_other;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                    if (frameLayout != null) {
                        i11 = R$id.ivArrow;
                        ShapeImageView shapeImageView = (ShapeImageView) ViewBindings.findChildViewById(view, i11);
                        if (shapeImageView != null) {
                            i11 = R$id.ivArrowClick;
                            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                            if (frameLayout2 != null) {
                                i11 = R$id.ivCopyTradingWalletTagArrow;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                if (appCompatImageView != null) {
                                    i11 = R$id.ivCopyTradingWalletTagIcon;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                                    if (imageView != null) {
                                        i11 = R$id.iv_sub_action;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                                        if (imageView2 != null) {
                                            i11 = R$id.ivZeroBalance;
                                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                            if (appCompatImageView2 != null) {
                                                i11 = R$id.llCopyTradingWalletTag;
                                                ShapeLinearLayout shapeLinearLayout = (ShapeLinearLayout) ViewBindings.findChildViewById(view, i11);
                                                if (shapeLinearLayout != null) {
                                                    i11 = R$id.llKiaBtn;
                                                    ShapeLinearLayout shapeLinearLayout2 = (ShapeLinearLayout) ViewBindings.findChildViewById(view, i11);
                                                    if (shapeLinearLayout2 != null) {
                                                        i11 = R$id.llTotalAsset;
                                                        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                                        if (linearLayoutCompat2 != null) {
                                                            i11 = R$id.pnl_title;
                                                            DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (dashTextView != null) {
                                                                i11 = R$id.tvAction;
                                                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView != null) {
                                                                    i11 = R$id.tvCopyTradingWalletTagAmount;
                                                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView2 != null) {
                                                                        i11 = R$id.tvSecondUnit;
                                                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView3 != null) {
                                                                            i11 = R$id.tvTotalAsset;
                                                                            DashTextView dashTextView2 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (dashTextView2 != null) {
                                                                                i11 = R$id.tvTotalAssetLegalValue;
                                                                                ShowHideTextView showHideTextView2 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (showHideTextView2 != null) {
                                                                                    i11 = R$id.tvTotalAssetValue;
                                                                                    ShowHideTextView showHideTextView3 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (showHideTextView3 != null) {
                                                                                        i11 = R$id.tvUnit;
                                                                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (baseTextView4 != null) {
                                                                                            i11 = R$id.viewStub;
                                                                                            ViewStub viewStub = (ViewStub) ViewBindings.findChildViewById(view, i11);
                                                                                            if (viewStub != null) {
                                                                                                return new C44877u5((ConstraintLayout) view, appCompatCheckBox, linearLayoutCompat, showHideTextView, frameLayout, shapeImageView, frameLayout2, appCompatImageView, imageView, imageView2, appCompatImageView2, shapeLinearLayout, shapeLinearLayout2, linearLayoutCompat2, dashTextView, baseTextView, baseTextView2, baseTextView3, dashTextView2, showHideTextView2, showHideTextView3, baseTextView4, viewStub);
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
        return this.f100958a;
    }
}
