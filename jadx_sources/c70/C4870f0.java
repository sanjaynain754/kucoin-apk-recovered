package c70;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.resources.widget.KcTextInputLayout;
import com.kubi.user.R$id;

/* JADX INFO: renamed from: c70.f0 */
/* JADX INFO: compiled from: BusercenterLayoutSignupByPasswordBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4870f0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f5098a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ClearEditText f5099b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcTextInputLayout f5100c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f5101d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FrameLayout f5102e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4870f0 m5018a(@NonNull View view) {
        int i11 = R$id.edtPassword;
        ClearEditText clearEditText = (ClearEditText) ViewBindings.findChildViewById(view, i11);
        if (clearEditText != null) {
            i11 = R$id.inputPassword;
            KcTextInputLayout kcTextInputLayout = (KcTextInputLayout) ViewBindings.findChildViewById(view, i11);
            if (kcTextInputLayout != null) {
                i11 = R$id.ivClean;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    FrameLayout frameLayout = (FrameLayout) view;
                    return new C4870f0(frameLayout, clearEditText, kcTextInputLayout, imageView, frameLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f5098a;
    }

    public C4870f0(@NonNull FrameLayout frameLayout, @NonNull ClearEditText clearEditText, @NonNull KcTextInputLayout kcTextInputLayout, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout2) {
        this.f5098a = frameLayout;
        this.f5099b = clearEditText;
        this.f5100c = kcTextInputLayout;
        this.f5101d = imageView;
        this.f5102e = frameLayout2;
    }
}
