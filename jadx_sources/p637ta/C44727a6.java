package p637ta;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.margin.view.MarginPnlHeaderView;
import com.kubi.assets.view.AccountInfoHeaderView;
import com.kubi.resources.widget.AlertTipsTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;

/* JADX INFO: renamed from: ta.a6 */
/* JADX INFO: compiled from: ViewFuturesAssetsHeaderBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44727a6 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f99579a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AccountInfoHeaderView f99580b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KuCheckBox f99581c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f99582d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ShapeLinearLayout f99583e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final MarginPnlHeaderView f99584f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final View f99585g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f99586h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final KcPrimaryButton f99587i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final AlertTipsTextView f99588j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44727a6 m98964a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.accountInfoHeader;
        AccountInfoHeaderView accountInfoHeaderView = (AccountInfoHeaderView) ViewBindings.findChildViewById(view, i11);
        if (accountInfoHeaderView != null) {
            i11 = R$id.checkBox;
            KuCheckBox kuCheckBox = (KuCheckBox) ViewBindings.findChildViewById(view, i11);
            if (kuCheckBox != null) {
                i11 = R$id.ivExpandArrow;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    i11 = R$id.llGift;
                    ShapeLinearLayout shapeLinearLayout = (ShapeLinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (shapeLinearLayout != null) {
                        i11 = R$id.pnlLayout;
                        MarginPnlHeaderView marginPnlHeaderView = (MarginPnlHeaderView) ViewBindings.findChildViewById(view, i11);
                        if (marginPnlHeaderView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.stubView))) != null) {
                            i11 = R$id.tvTip;
                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView != null) {
                                i11 = R$id.tvTransfer;
                                KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                if (kcPrimaryButton != null) {
                                    i11 = R$id.tvUnifiedModeTradeTip;
                                    AlertTipsTextView alertTipsTextView = (AlertTipsTextView) ViewBindings.findChildViewById(view, i11);
                                    if (alertTipsTextView != null) {
                                        return new C44727a6((ConstraintLayout) view, accountInfoHeaderView, kuCheckBox, imageView, shapeLinearLayout, marginPnlHeaderView, viewFindChildViewById, baseTextView, kcPrimaryButton, alertTipsTextView);
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
        return this.f99579a;
    }

    public C44727a6(@NonNull ConstraintLayout constraintLayout, @NonNull AccountInfoHeaderView accountInfoHeaderView, @NonNull KuCheckBox kuCheckBox, @NonNull ImageView imageView, @NonNull ShapeLinearLayout shapeLinearLayout, @NonNull MarginPnlHeaderView marginPnlHeaderView, @NonNull View view, @NonNull BaseTextView baseTextView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull AlertTipsTextView alertTipsTextView) {
        this.f99579a = constraintLayout;
        this.f99580b = accountInfoHeaderView;
        this.f99581c = kuCheckBox;
        this.f99582d = imageView;
        this.f99583e = shapeLinearLayout;
        this.f99584f = marginPnlHeaderView;
        this.f99585g = view;
        this.f99586h = baseTextView;
        this.f99587i = kcPrimaryButton;
        this.f99588j = alertTipsTextView;
    }
}
