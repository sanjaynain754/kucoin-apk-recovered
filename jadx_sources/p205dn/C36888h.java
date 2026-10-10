package p205dn;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kyc.R$id;
import com.kubi.kyc.ui.UploadImageView2;

/* JADX INFO: renamed from: dn.h */
/* JADX INFO: compiled from: BusercenterItemCellUploadBinding.java */
/* JADX INFO: loaded from: classes21.dex */
public final class C36888h implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81465a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TextView f81466b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f81467c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TextView f81468d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final UploadImageView2 f81469e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36888h m82645a(@NonNull View view) {
        int i11 = R$id.tv_error_msg;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
        if (textView != null) {
            i11 = R$id.tv_label;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
            if (textView2 != null) {
                i11 = R$id.tv_tips;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                if (textView3 != null) {
                    i11 = R$id.upload_image_view;
                    UploadImageView2 uploadImageView2 = (UploadImageView2) ViewBindings.findChildViewById(view, i11);
                    if (uploadImageView2 != null) {
                        return new C36888h((LinearLayout) view, textView, textView2, textView3, uploadImageView2);
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
        return this.f81465a;
    }

    public C36888h(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull UploadImageView2 uploadImageView2) {
        this.f81465a = linearLayout;
        this.f81466b = textView;
        this.f81467c = textView2;
        this.f81468d = textView3;
        this.f81469e = uploadImageView2;
    }
}
