package dm;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dm.y0 */
/* JADX INFO: compiled from: BkumexDialogRiskWarningBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36872y0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81357a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f81358b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f81359c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TextView f81360d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36872y0 m82612a(@NonNull View view) {
        int i11 = R$id.confirm;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.tvContent;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
            if (textView != null) {
                i11 = R$id.tvTitle;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                if (textView2 != null) {
                    return new C36872y0((LinearLayout) view, kcPrimaryButton, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f81357a;
    }

    public C36872y0(@NonNull LinearLayout linearLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f81357a = linearLayout;
        this.f81358b = kcPrimaryButton;
        this.f81359c = textView;
        this.f81360d = textView2;
    }
}
