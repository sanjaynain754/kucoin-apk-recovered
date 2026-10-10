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
import com.kubi.resources.widget.button.KcSecondaryButton;

/* JADX INFO: renamed from: ta.i3 */
/* JADX INFO: compiled from: DialogCommonFilterBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44788i3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f100128a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f100129b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f100130c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcSecondaryButton f100131d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f100132e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44788i3 m99094a(@NonNull View view) {
        int i11 = R$id.ll_container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
        if (linearLayout != null) {
            i11 = R$id.tvConfirm;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.tvReset;
                KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
                if (kcSecondaryButton != null) {
                    i11 = R$id.tvTitle;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        return new C44788i3((LinearLayoutCompat) view, linearLayout, kcPrimaryButton, kcSecondaryButton, baseTextView);
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
        return this.f100128a;
    }

    public C44788i3(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayout linearLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull BaseTextView baseTextView) {
        this.f100128a = linearLayoutCompat;
        this.f100129b = linearLayout;
        this.f100130c = kcPrimaryButton;
        this.f100131d = kcSecondaryButton;
        this.f100132e = baseTextView;
    }
}
