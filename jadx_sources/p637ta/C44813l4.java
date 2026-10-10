package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ta.l4 */
/* JADX INFO: compiled from: KucoinFragmentDepositLayoutFailBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44813l4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f100393a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayoutCompat f100394b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f100395c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcPrimaryButton f100396d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44813l4 m99147a(@NonNull View view) {
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
        int i11 = R$id.tvErrorTip;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.tvRetry;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                return new C44813l4(linearLayoutCompat, linearLayoutCompat, baseTextView, kcPrimaryButton);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f100393a;
    }

    public C44813l4(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull BaseTextView baseTextView, @NonNull KcPrimaryButton kcPrimaryButton) {
        this.f100393a = linearLayoutCompat;
        this.f100394b = linearLayoutCompat2;
        this.f100395c = baseTextView;
        this.f100396d = kcPrimaryButton;
    }
}
