package p637ta;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.options.view.OptionsPnlHeaderView;
import com.kubi.assets.view.AccountInfoHeaderView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.resources.widget.button.KcSecondaryButton;

/* JADX INFO: renamed from: ta.q2 */
/* JADX INFO: compiled from: AssetViewOptionsHeaderBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44846q2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f100666a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AccountInfoHeaderView f100667b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f100668c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f100669d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f100670e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayout f100671f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f100672g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ShowHideTextView f100673h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ShowHideTextView f100674i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f100675j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final ShowHideTextView f100676k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final ShowHideTextView f100677l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final KcSecondaryButton f100678m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final OptionsPnlHeaderView f100679n;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44846q2 m99217a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.accountInfoHeader;
        AccountInfoHeaderView accountInfoHeaderView = (AccountInfoHeaderView) ViewBindings.findChildViewById(view, i11);
        if (accountInfoHeaderView != null) {
            i11 = R$id.ivOptionTradeHistory;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.line1))) != null) {
                i11 = R$id.llAssets;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                if (linearLayout != null) {
                    i11 = R$id.llLiability;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout2 != null) {
                        i11 = R$id.tvLiability;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.tvLiabilityLegal;
                            ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                            if (showHideTextView != null) {
                                i11 = R$id.tvLiabilityValue;
                                ShowHideTextView showHideTextView2 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                if (showHideTextView2 != null) {
                                    i11 = R$id.tvNetAsset;
                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView2 != null) {
                                        i11 = R$id.tvNetAssetLegal;
                                        ShowHideTextView showHideTextView3 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                        if (showHideTextView3 != null) {
                                            i11 = R$id.tvNetAssetValue;
                                            ShowHideTextView showHideTextView4 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                            if (showHideTextView4 != null) {
                                                i11 = R$id.tvTransfer;
                                                KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
                                                if (kcSecondaryButton != null) {
                                                    i11 = R$id.viewMarginPnl;
                                                    OptionsPnlHeaderView optionsPnlHeaderView = (OptionsPnlHeaderView) ViewBindings.findChildViewById(view, i11);
                                                    if (optionsPnlHeaderView != null) {
                                                        return new C44846q2((ConstraintLayout) view, accountInfoHeaderView, imageView, viewFindChildViewById, linearLayout, linearLayout2, baseTextView, showHideTextView, showHideTextView2, baseTextView2, showHideTextView3, showHideTextView4, kcSecondaryButton, optionsPnlHeaderView);
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
        return this.f100666a;
    }

    public C44846q2(@NonNull ConstraintLayout constraintLayout, @NonNull AccountInfoHeaderView accountInfoHeaderView, @NonNull ImageView imageView, @NonNull View view, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull BaseTextView baseTextView, @NonNull ShowHideTextView showHideTextView, @NonNull ShowHideTextView showHideTextView2, @NonNull BaseTextView baseTextView2, @NonNull ShowHideTextView showHideTextView3, @NonNull ShowHideTextView showHideTextView4, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull OptionsPnlHeaderView optionsPnlHeaderView) {
        this.f100666a = constraintLayout;
        this.f100667b = accountInfoHeaderView;
        this.f100668c = imageView;
        this.f100669d = view;
        this.f100670e = linearLayout;
        this.f100671f = linearLayout2;
        this.f100672g = baseTextView;
        this.f100673h = showHideTextView;
        this.f100674i = showHideTextView2;
        this.f100675j = baseTextView2;
        this.f100676k = showHideTextView3;
        this.f100677l = showHideTextView4;
        this.f100678m = kcSecondaryButton;
        this.f100679n = optionsPnlHeaderView;
    }
}
