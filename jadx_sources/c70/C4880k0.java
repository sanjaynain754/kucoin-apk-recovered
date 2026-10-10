package c70;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.user.R$id;

/* JADX INFO: renamed from: c70.k0 */
/* JADX INFO: compiled from: BusercenterSignProtocolLinkDialogBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4880k0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f5185a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f5186b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f5187c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f5188d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4880k0 m5039a(@NonNull View view) {
        int i11 = R$id.btnAgreeProtocol;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.btnExitProtocol;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.tvProtocolLinkList;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    return new C4880k0((LinearLayoutCompat) view, kcPrimaryButton, baseTextView, baseTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f5185a;
    }

    public C4880k0(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f5185a = linearLayoutCompat;
        this.f5186b = kcPrimaryButton;
        this.f5187c = baseTextView;
        this.f5188d = baseTextView2;
    }
}
