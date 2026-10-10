package c60;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.numeric.financial.widget.FinancialInputEditText;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.FilterEmojiEditText;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;
import com.kubi.transfer.lib.R$id;

/* JADX INFO: renamed from: c60.g */
/* JADX INFO: compiled from: BtransferViewTransferAmountBinding.java */
/* JADX INFO: loaded from: classes52.dex */
public final class C4853g implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f4982a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FilterEmojiEditText f4983b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FinancialInputEditText f4984c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ShapeConstraintLayout f4985d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayoutCompat f4986e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f4987f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f4988g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f4989h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f4990i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ShowHideTextView f4991j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f4992k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4853g m4983a(@NonNull View view) {
        int i11 = R$id.etAmount;
        FilterEmojiEditText filterEmojiEditText = (FilterEmojiEditText) ViewBindings.findChildViewById(view, i11);
        if (filterEmojiEditText != null) {
            i11 = R$id.etAmountFinancial;
            FinancialInputEditText financialInputEditText = (FinancialInputEditText) ViewBindings.findChildViewById(view, i11);
            if (financialInputEditText != null) {
                i11 = R$id.layoutAmount;
                ShapeConstraintLayout shapeConstraintLayout = (ShapeConstraintLayout) ViewBindings.findChildViewById(view, i11);
                if (shapeConstraintLayout != null) {
                    i11 = R$id.llMultiAccountAvailableAmount;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                    if (linearLayoutCompat != null) {
                        i11 = R$id.tvAvailableAmount;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.tvAvailableTitle;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                i11 = R$id.tvChooseAll;
                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView3 != null) {
                                    i11 = R$id.tvCurrency;
                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView4 != null) {
                                        i11 = R$id.tvFiat;
                                        ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                        if (showHideTextView != null) {
                                            i11 = R$id.tvMultiAccountAvailableAmount;
                                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView5 != null) {
                                                return new C4853g(view, filterEmojiEditText, financialInputEditText, shapeConstraintLayout, linearLayoutCompat, baseTextView, baseTextView2, baseTextView3, baseTextView4, showHideTextView, baseTextView5);
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
    public View getRoot() {
        return this.f4982a;
    }

    public C4853g(@NonNull View view, @NonNull FilterEmojiEditText filterEmojiEditText, @NonNull FinancialInputEditText financialInputEditText, @NonNull ShapeConstraintLayout shapeConstraintLayout, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull ShowHideTextView showHideTextView, @NonNull BaseTextView baseTextView5) {
        this.f4982a = view;
        this.f4983b = filterEmojiEditText;
        this.f4984c = financialInputEditText;
        this.f4985d = shapeConstraintLayout;
        this.f4986e = linearLayoutCompat;
        this.f4987f = baseTextView;
        this.f4988g = baseTextView2;
        this.f4989h = baseTextView3;
        this.f4990i = baseTextView4;
        this.f4991j = showHideTextView;
        this.f4992k = baseTextView5;
    }
}
