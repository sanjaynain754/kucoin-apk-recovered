package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;

/* JADX INFO: renamed from: ta.g0 */
/* JADX INFO: compiled from: AssetDialogWithdrawReverseCalculationBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44769g0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f99946a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ShapeConstraintLayout f99947b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f99948c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f99949d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f99950e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f99951f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f99952g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f99953h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f99954i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44769g0 m99053a(@NonNull View view) {
        int i11 = R$id.clContent;
        ShapeConstraintLayout shapeConstraintLayout = (ShapeConstraintLayout) ViewBindings.findChildViewById(view, i11);
        if (shapeConstraintLayout != null) {
            i11 = R$id.tvConfirm;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.tv_content;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.tvReciveAmount;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        i11 = R$id.tvReciveAmountName;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null) {
                            i11 = R$id.tv_title;
                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView4 != null) {
                                i11 = R$id.tvWithdrawAmount;
                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView5 != null) {
                                    i11 = R$id.tvWithdrawAmountName;
                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView6 != null) {
                                        return new C44769g0((LinearLayoutCompat) view, shapeConstraintLayout, kcPrimaryButton, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6);
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
    public LinearLayoutCompat getRoot() {
        return this.f99946a;
    }

    public C44769g0(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ShapeConstraintLayout shapeConstraintLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6) {
        this.f99946a = linearLayoutCompat;
        this.f99947b = shapeConstraintLayout;
        this.f99948c = kcPrimaryButton;
        this.f99949d = baseTextView;
        this.f99950e = baseTextView2;
        this.f99951f = baseTextView3;
        this.f99952g = baseTextView4;
        this.f99953h = baseTextView5;
        this.f99954i = baseTextView6;
    }
}
