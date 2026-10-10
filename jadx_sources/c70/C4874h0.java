package c70;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.user.R$id;
import com.kubi.user.protocol.text.SignProtocolContentView;

/* JADX INFO: renamed from: c70.h0 */
/* JADX INFO: compiled from: BusercenterSignProtocolContentDialogBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4874h0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f5137a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f5138b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final SignProtocolContentView f5139c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4874h0 m5026a(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R$id.signProtocolContentView;
        SignProtocolContentView signProtocolContentView = (SignProtocolContentView) ViewBindings.findChildViewById(view, i11);
        if (signProtocolContentView != null) {
            return new C4874h0(linearLayout, linearLayout, signProtocolContentView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f5137a;
    }

    public C4874h0(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull SignProtocolContentView signProtocolContentView) {
        this.f5137a = linearLayout;
        this.f5138b = linearLayout2;
        this.f5139c = signProtocolContentView;
    }
}
