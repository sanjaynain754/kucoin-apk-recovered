package p637ta;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.margin.view.MarginPnlHeaderView;
import com.kubi.assets.view.AccountInfoHeaderView;
import com.kubi.assets.view.VerticalIconTextBtn;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.widget.shape.view.ShapeTextView;

/* JADX INFO: renamed from: ta.x5 */
/* JADX INFO: compiled from: ViewCrossAssetsHeaderBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44898x5 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f101141a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AccountInfoHeaderView f101142b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f101143c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f101144d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f101145e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayout f101146f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ShapeTextView f101147g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LinearLayout f101148h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f101149i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final VerticalIconTextBtn f101150j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f101151k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final ShowHideTextView f101152l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final ShowHideTextView f101153m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f101154n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final ShowHideTextView f101155o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final ShowHideTextView f101156p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final VerticalIconTextBtn f101157q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final VerticalIconTextBtn f101158r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final MarginPnlHeaderView f101159s;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44898x5 m99320a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.accountInfoHeader;
        AccountInfoHeaderView accountInfoHeaderView = (AccountInfoHeaderView) ViewBindings.findChildViewById(view, i11);
        if (accountInfoHeaderView != null) {
            i11 = R$id.ivMarginHistory;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.line0))) != null) {
                i11 = R$id.llAssets;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                if (linearLayout != null) {
                    i11 = R$id.llLiability;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout2 != null) {
                        i11 = R$id.rbCross;
                        ShapeTextView shapeTextView = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                        if (shapeTextView != null) {
                            i11 = R$id.rb_group;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                            if (linearLayout3 != null) {
                                i11 = R$id.rbIsolated;
                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView != null) {
                                    i11 = R$id.tvBorrow;
                                    VerticalIconTextBtn verticalIconTextBtn = (VerticalIconTextBtn) ViewBindings.findChildViewById(view, i11);
                                    if (verticalIconTextBtn != null) {
                                        i11 = R$id.tvLiability;
                                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView2 != null) {
                                            i11 = R$id.tvLiabilityLegal;
                                            ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                            if (showHideTextView != null) {
                                                i11 = R$id.tvLiabilityValue;
                                                ShowHideTextView showHideTextView2 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                if (showHideTextView2 != null) {
                                                    i11 = R$id.tvNetAsset;
                                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView3 != null) {
                                                        i11 = R$id.tvNetAssetLegal;
                                                        ShowHideTextView showHideTextView3 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (showHideTextView3 != null) {
                                                            i11 = R$id.tvNetAssetValue;
                                                            ShowHideTextView showHideTextView4 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (showHideTextView4 != null) {
                                                                i11 = R$id.tvRepay;
                                                                VerticalIconTextBtn verticalIconTextBtn2 = (VerticalIconTextBtn) ViewBindings.findChildViewById(view, i11);
                                                                if (verticalIconTextBtn2 != null) {
                                                                    i11 = R$id.tvTransfer;
                                                                    VerticalIconTextBtn verticalIconTextBtn3 = (VerticalIconTextBtn) ViewBindings.findChildViewById(view, i11);
                                                                    if (verticalIconTextBtn3 != null) {
                                                                        i11 = R$id.viewMarginPnl;
                                                                        MarginPnlHeaderView marginPnlHeaderView = (MarginPnlHeaderView) ViewBindings.findChildViewById(view, i11);
                                                                        if (marginPnlHeaderView != null) {
                                                                            return new C44898x5((ConstraintLayout) view, accountInfoHeaderView, imageView, viewFindChildViewById, linearLayout, linearLayout2, shapeTextView, linearLayout3, baseTextView, verticalIconTextBtn, baseTextView2, showHideTextView, showHideTextView2, baseTextView3, showHideTextView3, showHideTextView4, verticalIconTextBtn2, verticalIconTextBtn3, marginPnlHeaderView);
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
        return this.f101141a;
    }

    public C44898x5(@NonNull ConstraintLayout constraintLayout, @NonNull AccountInfoHeaderView accountInfoHeaderView, @NonNull ImageView imageView, @NonNull View view, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ShapeTextView shapeTextView, @NonNull LinearLayout linearLayout3, @NonNull BaseTextView baseTextView, @NonNull VerticalIconTextBtn verticalIconTextBtn, @NonNull BaseTextView baseTextView2, @NonNull ShowHideTextView showHideTextView, @NonNull ShowHideTextView showHideTextView2, @NonNull BaseTextView baseTextView3, @NonNull ShowHideTextView showHideTextView3, @NonNull ShowHideTextView showHideTextView4, @NonNull VerticalIconTextBtn verticalIconTextBtn2, @NonNull VerticalIconTextBtn verticalIconTextBtn3, @NonNull MarginPnlHeaderView marginPnlHeaderView) {
        this.f101141a = constraintLayout;
        this.f101142b = accountInfoHeaderView;
        this.f101143c = imageView;
        this.f101144d = view;
        this.f101145e = linearLayout;
        this.f101146f = linearLayout2;
        this.f101147g = shapeTextView;
        this.f101148h = linearLayout3;
        this.f101149i = baseTextView;
        this.f101150j = verticalIconTextBtn;
        this.f101151k = baseTextView2;
        this.f101152l = showHideTextView;
        this.f101153m = showHideTextView2;
        this.f101154n = baseTextView3;
        this.f101155o = showHideTextView3;
        this.f101156p = showHideTextView4;
        this.f101157q = verticalIconTextBtn2;
        this.f101158r = verticalIconTextBtn3;
        this.f101159s = marginPnlHeaderView;
    }
}
