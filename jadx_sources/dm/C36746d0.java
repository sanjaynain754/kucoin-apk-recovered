package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dm.d0 */
/* JADX INFO: compiled from: BkumexDialogFuturesTrialWithdrawRisksBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36746d0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f79860a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f79861b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f79862c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcPrimaryButton f79863d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f79864e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36746d0 m82343a(@NonNull View view) {
        int i11 = R$id.tv_customer_service;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.tv_desc;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.tv_ok;
                KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                if (kcPrimaryButton != null) {
                    i11 = R$id.tv_title;
                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView3 != null) {
                        return new C36746d0((LinearLayoutCompat) view, baseTextView, baseTextView2, kcPrimaryButton, baseTextView3);
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
        return this.f79860a;
    }

    public C36746d0(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView3) {
        this.f79860a = linearLayoutCompat;
        this.f79861b = baseTextView;
        this.f79862c = baseTextView2;
        this.f79863d = kcPrimaryButton;
        this.f79864e = baseTextView3;
    }
}
