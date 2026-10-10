package dm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;

/* JADX INFO: renamed from: dm.i0 */
/* JADX INFO: compiled from: BkumexDialogMarkPriceGuideBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36776i0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f80229a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcSecondaryButton f80230b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f80231c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f80232d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36776i0 m82409a(@NonNull View view) {
        int i11 = R$id.confirm;
        KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcSecondaryButton != null) {
            i11 = R$id.goSetting;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.title;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    return new C36776i0((LinearLayoutCompat) view, kcSecondaryButton, kcPrimaryButton, baseTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C36776i0 m82410c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.bkumex_dialog_mark_price_guide, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m82409a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f80229a;
    }

    public C36776i0(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView) {
        this.f80229a = linearLayoutCompat;
        this.f80230b = kcSecondaryButton;
        this.f80231c = kcPrimaryButton;
        this.f80232d = baseTextView;
    }
}
