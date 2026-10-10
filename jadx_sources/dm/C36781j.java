package dm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;

/* JADX INFO: renamed from: dm.j */
/* JADX INFO: compiled from: BkumexDialogCommonFilterBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36781j implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f80265a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f80266b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f80267c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcSecondaryButton f80268d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f80269e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36781j m82420a(@NonNull View view) {
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
                        return new C36781j((LinearLayoutCompat) view, linearLayout, kcPrimaryButton, kcSecondaryButton, baseTextView);
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
        return this.f80265a;
    }

    public C36781j(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayout linearLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull BaseTextView baseTextView) {
        this.f80265a = linearLayoutCompat;
        this.f80266b = linearLayout;
        this.f80267c = kcPrimaryButton;
        this.f80268d = kcSecondaryButton;
        this.f80269e = baseTextView;
    }
}
