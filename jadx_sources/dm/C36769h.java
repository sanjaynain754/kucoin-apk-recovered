package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.AlignTopCheckBox;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dm.h */
/* JADX INFO: compiled from: BkumexDialogAllMarketCloseBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36769h implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80156a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f80157b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AlignTopCheckBox f80158c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcPrimaryButton f80159d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f80160e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f80161f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36769h m82393a(@NonNull View view) {
        int i11 = R$id.cancel;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.cbAgain;
            AlignTopCheckBox alignTopCheckBox = (AlignTopCheckBox) ViewBindings.findChildViewById(view, i11);
            if (alignTopCheckBox != null) {
                i11 = R$id.confirm;
                KcPrimaryButton kcPrimaryButton2 = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                if (kcPrimaryButton2 != null) {
                    i11 = R$id.message;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.title;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            return new C36769h((ConstraintLayout) view, kcPrimaryButton, alignTopCheckBox, kcPrimaryButton2, baseTextView, baseTextView2);
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
    public ConstraintLayout getRoot() {
        return this.f80156a;
    }

    public C36769h(@NonNull ConstraintLayout constraintLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull AlignTopCheckBox alignTopCheckBox, @NonNull KcPrimaryButton kcPrimaryButton2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f80156a = constraintLayout;
        this.f80157b = kcPrimaryButton;
        this.f80158c = alignTopCheckBox;
        this.f80159d = kcPrimaryButton2;
        this.f80160e = baseTextView;
        this.f80161f = baseTextView2;
    }
}
