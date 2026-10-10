package w30;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.tradefacade.R$id;
import com.kubi.tradefacade.R$layout;

/* JADX INFO: renamed from: w30.d */
/* JADX INFO: compiled from: SpotKycLeadViewBinding.java */
/* JADX INFO: loaded from: classes50.dex */
public final class C45717d implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f103095a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f103096b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f103097c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f103098d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45717d m100918a(@NonNull View view) {
        int i11 = R$id.btnVerify;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.ivIcon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.tvMessage;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    return new C45717d((LinearLayoutCompat) view, kcPrimaryButton, appCompatImageView, baseTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C45717d m100919c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.spot_kyc_lead_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m100918a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f103095a;
    }

    public C45717d(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView) {
        this.f103095a = linearLayoutCompat;
        this.f103096b = kcPrimaryButton;
        this.f103097c = appCompatImageView;
        this.f103098d = baseTextView;
    }
}
