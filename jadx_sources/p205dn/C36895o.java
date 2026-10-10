package p205dn;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kyc.R$id;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dn.o */
/* JADX INFO: compiled from: LayoutJumioDialogContentPermissionHintBinding.java */
/* JADX INFO: loaded from: classes21.dex */
public final class C36895o implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81506a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TextView f81507b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f81508c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36895o m82659a(@NonNull View view) {
        int i11 = R$id.tvCancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
        if (textView != null) {
            i11 = R$id.tvConfirm;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                return new C36895o((LinearLayout) view, textView, kcPrimaryButton);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f81506a;
    }

    public C36895o(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull KcPrimaryButton kcPrimaryButton) {
        this.f81506a = linearLayout;
        this.f81507b = textView;
        this.f81508c = kcPrimaryButton;
    }
}
