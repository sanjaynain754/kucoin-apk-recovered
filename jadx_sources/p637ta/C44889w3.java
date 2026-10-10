package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;

/* JADX INFO: renamed from: ta.w3 */
/* JADX INFO: compiled from: FragmentAssetv2NewguideBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44889w3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f101057a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BGABanner f101058b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f101059c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcSecondaryButton f101060d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44889w3 m99302a(@NonNull View view) {
        int i11 = R$id.m_banner;
        BGABanner bGABanner = (BGABanner) ViewBindings.findChildViewById(view, i11);
        if (bGABanner != null) {
            i11 = R$id.tv_deposit;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.tv_ok;
                KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
                if (kcSecondaryButton != null) {
                    return new C44889w3((LinearLayoutCompat) view, bGABanner, kcPrimaryButton, kcSecondaryButton);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f101057a;
    }

    public C44889w3(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull BGABanner bGABanner, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KcSecondaryButton kcSecondaryButton) {
        this.f101057a = linearLayoutCompat;
        this.f101058b = bGABanner;
        this.f101059c = kcPrimaryButton;
        this.f101060d = kcSecondaryButton;
    }
}
