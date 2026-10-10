package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ta.o1 */
/* JADX INFO: compiled from: AssetKumexDialogCommonFilterBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44831o1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f100533a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f100534b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f100535c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcPrimaryButton f100536d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f100537e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44831o1 m99188a(@NonNull View view) {
        int i11 = R$id.ll_container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
        if (linearLayout != null) {
            i11 = R$id.tvConfirm;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.tvReset;
                KcPrimaryButton kcPrimaryButton2 = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                if (kcPrimaryButton2 != null) {
                    i11 = R$id.tvTitle;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        return new C44831o1((LinearLayoutCompat) view, linearLayout, kcPrimaryButton, kcPrimaryButton2, baseTextView);
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
        return this.f100533a;
    }

    public C44831o1(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayout linearLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KcPrimaryButton kcPrimaryButton2, @NonNull BaseTextView baseTextView) {
        this.f100533a = linearLayoutCompat;
        this.f100534b = linearLayout;
        this.f100535c = kcPrimaryButton;
        this.f100536d = kcPrimaryButton2;
        this.f100537e = baseTextView;
    }
}
