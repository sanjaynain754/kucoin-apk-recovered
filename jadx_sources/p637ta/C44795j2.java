package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.FilterEmojiEditText;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;

/* JADX INFO: renamed from: ta.j2 */
/* JADX INFO: compiled from: AssetViewDepositLightningNetworkBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44795j2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ShapeLinearLayout f100214a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f100215b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f100216c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FilterEmojiEditText f100217d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f100218e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f100219f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f100220g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f100221h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44795j2 m99109a(@NonNull View view) {
        int i11 = R$id.btn_withdraw;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.cl_withdraw_amount;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
            if (constraintLayout != null) {
                i11 = R$id.et_amount;
                FilterEmojiEditText filterEmojiEditText = (FilterEmojiEditText) ViewBindings.findChildViewById(view, i11);
                if (filterEmojiEditText != null) {
                    i11 = R$id.tvAccount;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tvErrorTip;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.tvInvoiceTip;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null) {
                                i11 = R$id.tv_withdraw_unit;
                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView4 != null) {
                                    return new C44795j2((ShapeLinearLayout) view, kcPrimaryButton, constraintLayout, filterEmojiEditText, baseTextView, baseTextView2, baseTextView3, baseTextView4);
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
    public ShapeLinearLayout getRoot() {
        return this.f100214a;
    }

    public C44795j2(@NonNull ShapeLinearLayout shapeLinearLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull ConstraintLayout constraintLayout, @NonNull FilterEmojiEditText filterEmojiEditText, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f100214a = shapeLinearLayout;
        this.f100215b = kcPrimaryButton;
        this.f100216c = constraintLayout;
        this.f100217d = filterEmojiEditText;
        this.f100218e = baseTextView;
        this.f100219f = baseTextView2;
        this.f100220g = baseTextView3;
        this.f100221h = baseTextView4;
    }
}
