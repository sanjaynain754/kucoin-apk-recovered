package p205dn;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kyc.R$id;
import com.kubi.kyc.ui.kycv2.UploadImageView3;

/* JADX INFO: renamed from: dn.k */
/* JADX INFO: compiled from: KycFragmemtImageAdvanceBinding.java */
/* JADX INFO: loaded from: classes21.dex */
public final class C36891k implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f81476a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f81477b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final UploadImageView3 f81478c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RelativeLayout f81479d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FrameLayout f81480e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TextView f81481f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final TextView f81482g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TextView f81483h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36891k m82651a(@NonNull View view) {
        int i11 = R$id.ivBack;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.iv_preview;
            UploadImageView3 uploadImageView3 = (UploadImageView3) ViewBindings.findChildViewById(view, i11);
            if (uploadImageView3 != null) {
                i11 = R$id.f31061rl;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i11);
                if (relativeLayout != null) {
                    FrameLayout frameLayout = (FrameLayout) view;
                    i11 = R$id.tv_confirm;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                    if (textView != null) {
                        i11 = R$id.tv_retake;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                        if (textView2 != null) {
                            i11 = R$id.tv_title;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                            if (textView3 != null) {
                                return new C36891k(frameLayout, imageView, uploadImageView3, relativeLayout, frameLayout, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f81476a;
    }

    public C36891k(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull UploadImageView3 uploadImageView3, @NonNull RelativeLayout relativeLayout, @NonNull FrameLayout frameLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f81476a = frameLayout;
        this.f81477b = imageView;
        this.f81478c = uploadImageView3;
        this.f81479d = relativeLayout;
        this.f81480e = frameLayout2;
        this.f81481f = textView;
        this.f81482g = textView2;
        this.f81483h = textView3;
    }
}
