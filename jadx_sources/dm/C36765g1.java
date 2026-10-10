package dm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dm.g1 */
/* JADX INFO: compiled from: BkumexDialogTwapOrderTypeSettingBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36765g1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80107a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f80108b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f80109c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f80110d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ConstraintLayout f80111e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f80112f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ViewStub f80113g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TextView f80114h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ConstraintLayout f80115i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36765g1 m82383a(@NonNull View view) {
        int i11 = R$id.confirmTv;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.customPriceTv;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.ivClose;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    i11 = R$id.marketPriceCl;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                    if (constraintLayout != null) {
                        i11 = R$id.marketPriceTv;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.priceSettingViewStub;
                            ViewStub viewStub = (ViewStub) ViewBindings.findChildViewById(view, i11);
                            if (viewStub != null) {
                                i11 = R$id.titleTv;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                                if (textView != null) {
                                    i11 = R$id.typeSelectorCl;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                    if (constraintLayout2 != null) {
                                        return new C36765g1((ConstraintLayout) view, kcPrimaryButton, baseTextView, imageView, constraintLayout, baseTextView2, viewStub, textView, constraintLayout2);
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
    public static C36765g1 m82384c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.bkumex_dialog_twap_order_type_setting, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m82383a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f80107a;
    }

    public C36765g1(@NonNull ConstraintLayout constraintLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull BaseTextView baseTextView2, @NonNull ViewStub viewStub, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout3) {
        this.f80107a = constraintLayout;
        this.f80108b = kcPrimaryButton;
        this.f80109c = baseTextView;
        this.f80110d = imageView;
        this.f80111e = constraintLayout2;
        this.f80112f = baseTextView2;
        this.f80113g = viewStub;
        this.f80114h = textView;
        this.f80115i = constraintLayout3;
    }
}
