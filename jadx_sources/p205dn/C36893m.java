package p205dn;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kyc.R$id;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dn.m */
/* JADX INFO: compiled from: LayoutJumioConfirmScanBinding.java */
/* JADX INFO: loaded from: classes21.dex */
public final class C36893m implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81498a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f81499b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f81500c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f81501d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f81502e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36893m m82655a(@NonNull View view) {
        int i11 = R$id.btnConfirmUpload;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.confirmViewList;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout != null) {
                i11 = R$id.ivBack;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    i11 = R$id.tvRetry;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                    if (textView != null) {
                        return new C36893m((LinearLayout) view, kcPrimaryButton, linearLayout, imageView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f81498a;
    }

    public C36893m(@NonNull LinearLayout linearLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f81498a = linearLayout;
        this.f81499b = kcPrimaryButton;
        this.f81500c = linearLayout2;
        this.f81501d = imageView;
        this.f81502e = textView;
    }
}
