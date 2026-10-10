package c70;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.KcTextInputLayout;
import com.kubi.user.R$id;

/* JADX INFO: renamed from: c70.d0 */
/* JADX INFO: compiled from: BusercenterLayoutRcodeInputBinding.java */
/* JADX INFO: loaded from: classes23.dex */
public final class C4866d0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f5071a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcTextInputLayout f5072b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f5073c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f5074d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f5075e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4866d0 m5010a(@NonNull View view) {
        int i11 = R$id.inputRcode;
        KcTextInputLayout kcTextInputLayout = (KcTextInputLayout) ViewBindings.findChildViewById(view, i11);
        if (kcTextInputLayout != null) {
            i11 = R$id.ivReferArrow;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.layoutRefer;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                if (linearLayout != null) {
                    i11 = R$id.tvRcodeDiscount;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                    if (textView != null) {
                        return new C4866d0((LinearLayoutCompat) view, kcTextInputLayout, imageView, linearLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f5071a;
    }

    public C4866d0(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull KcTextInputLayout kcTextInputLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull TextView textView) {
        this.f5071a = linearLayoutCompat;
        this.f5072b = kcTextInputLayout;
        this.f5073c = imageView;
        this.f5074d = linearLayout;
        this.f5075e = textView;
    }
}
