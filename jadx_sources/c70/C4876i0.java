package c70;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.user.R$id;

/* JADX INFO: renamed from: c70.i0 */
/* JADX INFO: compiled from: BusercenterSignProtocolContentRetainDialogBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4876i0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f5148a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f5149b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f5150c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f5151d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f5152e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4876i0 m5030a(@NonNull View view) {
        int i11 = R$id.btnAgreeProtocol;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.btnExitProtocol;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i11 = R$id.tvProtocolRetainContent;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    return new C4876i0(linearLayout, kcPrimaryButton, baseTextView, linearLayout, baseTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f5148a;
    }

    public C4876i0(@NonNull LinearLayout linearLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView, @NonNull LinearLayout linearLayout2, @NonNull BaseTextView baseTextView2) {
        this.f5148a = linearLayout;
        this.f5149b = kcPrimaryButton;
        this.f5150c = baseTextView;
        this.f5151d = linearLayout2;
        this.f5152e = baseTextView2;
    }
}
