package c70;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.user.R$id;

/* JADX INFO: renamed from: c70.s0 */
/* JADX INFO: compiled from: KucoinFragmentSecurityStartBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4896s0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f5311a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f5312b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f5313c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f5314d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f5315e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4896s0 m5071a(@NonNull View view) {
        int i11 = R$id.btn_open;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.tv1;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.tv2;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.tv3;
                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView3 != null) {
                        return new C4896s0((ConstraintLayout) view, kcPrimaryButton, baseTextView, baseTextView2, baseTextView3);
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
        return this.f5311a;
    }

    public C4896s0(@NonNull ConstraintLayout constraintLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f5311a = constraintLayout;
        this.f5312b = kcPrimaryButton;
        this.f5313c = baseTextView;
        this.f5314d = baseTextView2;
        this.f5315e = baseTextView3;
    }
}
