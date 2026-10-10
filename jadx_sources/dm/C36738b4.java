package dm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dm.b4 */
/* JADX INFO: compiled from: BkumexKycLeadViewBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36738b4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f79759a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f79760b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f79761c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f79762d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36738b4 m82326a(@NonNull View view) {
        int i11 = R$id.btnVerify;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.ivIcon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.tvMessage;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    return new C36738b4((LinearLayoutCompat) view, kcPrimaryButton, appCompatImageView, baseTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C36738b4 m82327c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.bkumex_kyc_lead_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m82326a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f79759a;
    }

    public C36738b4(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView) {
        this.f79759a = linearLayoutCompat;
        this.f79760b = kcPrimaryButton;
        this.f79761c = appCompatImageView;
        this.f79762d = baseTextView;
    }
}
