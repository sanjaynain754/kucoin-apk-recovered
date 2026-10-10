package p637ta;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.AlertTipsTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ta.n4 */
/* JADX INFO: compiled from: KucoinFragmentDepositMemoBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44827n4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f100503a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f100504b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f100505c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f100506d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f100507e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f100508f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AlertTipsTextView f100509g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f100510h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44827n4 m99180a(@NonNull View view) {
        int i11 = R$id.copy_memo_address;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.iv_memo_info;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.iv_qr_code;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView2 != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    i11 = R$id.tv_coin_address_memo;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tv_coin_memo_tip_2;
                        AlertTipsTextView alertTipsTextView = (AlertTipsTextView) ViewBindings.findChildViewById(view, i11);
                        if (alertTipsTextView != null) {
                            i11 = R$id.tv_memo_title;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                return new C44827n4(linearLayout, kcPrimaryButton, imageView, imageView2, linearLayout, baseTextView, alertTipsTextView, baseTextView2);
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
    public LinearLayout getRoot() {
        return this.f100503a;
    }

    public C44827n4(@NonNull LinearLayout linearLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout2, @NonNull BaseTextView baseTextView, @NonNull AlertTipsTextView alertTipsTextView, @NonNull BaseTextView baseTextView2) {
        this.f100503a = linearLayout;
        this.f100504b = kcPrimaryButton;
        this.f100505c = imageView;
        this.f100506d = imageView2;
        this.f100507e = linearLayout2;
        this.f100508f = baseTextView;
        this.f100509g = alertTipsTextView;
        this.f100510h = baseTextView2;
    }
}
