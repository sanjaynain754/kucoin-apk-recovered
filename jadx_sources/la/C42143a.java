package la;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.app.bizcontrol.R$id;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: la.a */
/* JADX INFO: compiled from: LayoutBizControlKycDialogBinding.java */
/* JADX INFO: loaded from: classes64.dex */
public final class C42143a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f93577a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f93578b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f93579c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TextView f93580d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f93581e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42143a m92481a(@NonNull View view) {
        int i11 = R$id.btn_confirm;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.ivStatusImage;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.tv_content;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                if (textView != null) {
                    i11 = R$id.tv_title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                    if (textView2 != null) {
                        return new C42143a((ConstraintLayout) view, kcPrimaryButton, imageView, textView, textView2);
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
        return this.f93577a;
    }

    public C42143a(@NonNull ConstraintLayout constraintLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f93577a = constraintLayout;
        this.f93578b = kcPrimaryButton;
        this.f93579c = imageView;
        this.f93580d = textView;
        this.f93581e = textView2;
    }
}
