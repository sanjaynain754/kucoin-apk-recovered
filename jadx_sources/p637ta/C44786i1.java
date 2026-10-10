package p637ta;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;
import com.kubi.sdk.widget.shape.view.ShapeTextView;

/* JADX INFO: renamed from: ta.i1 */
/* JADX INFO: compiled from: AssetItemOngoingFinanceBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44786i1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ShapeConstraintLayout f100106a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final CoinAvatarView f100107b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ShowHideTextView f100108c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f100109d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ShowHideTextView f100110e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f100111f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f100112g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f100113h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ShowHideTextView f100114i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ShapeTextView f100115j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f100116k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final ShowHideTextView f100117l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f100118m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final View f100119n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final ShapeConstraintLayout f100120o;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44786i1 m99089a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.ivIcon;
        CoinAvatarView coinAvatarView = (CoinAvatarView) ViewBindings.findChildViewById(view, i11);
        if (coinAvatarView != null) {
            i11 = R$id.tvAmount;
            ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
            if (showHideTextView != null) {
                i11 = R$id.tvAmountName;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.tvAnnualized;
                    ShowHideTextView showHideTextView2 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                    if (showHideTextView2 != null) {
                        i11 = R$id.tvAnnualizedName;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.tvEndDate;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null) {
                                i11 = R$id.tvEndDateName;
                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView4 != null) {
                                    i11 = R$id.tvHolder;
                                    ShowHideTextView showHideTextView3 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                    if (showHideTextView3 != null) {
                                        i11 = R$id.tvLabel;
                                        ShapeTextView shapeTextView = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                                        if (shapeTextView != null) {
                                            i11 = R$id.tvName;
                                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView5 != null) {
                                                i11 = R$id.tvRevenue;
                                                ShowHideTextView showHideTextView4 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                if (showHideTextView4 != null) {
                                                    i11 = R$id.tvRevenueName;
                                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView6 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_divider))) != null) {
                                                        i11 = R$id.yellowBg;
                                                        ShapeConstraintLayout shapeConstraintLayout = (ShapeConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                                        if (shapeConstraintLayout != null) {
                                                            return new C44786i1((ShapeConstraintLayout) view, coinAvatarView, showHideTextView, baseTextView, showHideTextView2, baseTextView2, baseTextView3, baseTextView4, showHideTextView3, shapeTextView, baseTextView5, showHideTextView4, baseTextView6, viewFindChildViewById, shapeConstraintLayout);
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

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C44786i1 m99090c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.asset_item_ongoing_finance, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m99089a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ShapeConstraintLayout getRoot() {
        return this.f100106a;
    }

    public C44786i1(@NonNull ShapeConstraintLayout shapeConstraintLayout, @NonNull CoinAvatarView coinAvatarView, @NonNull ShowHideTextView showHideTextView, @NonNull BaseTextView baseTextView, @NonNull ShowHideTextView showHideTextView2, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull ShowHideTextView showHideTextView3, @NonNull ShapeTextView shapeTextView, @NonNull BaseTextView baseTextView5, @NonNull ShowHideTextView showHideTextView4, @NonNull BaseTextView baseTextView6, @NonNull View view, @NonNull ShapeConstraintLayout shapeConstraintLayout2) {
        this.f100106a = shapeConstraintLayout;
        this.f100107b = coinAvatarView;
        this.f100108c = showHideTextView;
        this.f100109d = baseTextView;
        this.f100110e = showHideTextView2;
        this.f100111f = baseTextView2;
        this.f100112g = baseTextView3;
        this.f100113h = baseTextView4;
        this.f100114i = showHideTextView3;
        this.f100115j = shapeTextView;
        this.f100116k = baseTextView5;
        this.f100117l = showHideTextView4;
        this.f100118m = baseTextView6;
        this.f100119n = view;
        this.f100120o = shapeConstraintLayout2;
    }
}
