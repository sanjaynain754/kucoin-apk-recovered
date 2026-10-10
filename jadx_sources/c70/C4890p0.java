package c70;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.user.R$id;

/* JADX INFO: renamed from: c70.p0 */
/* JADX INFO: compiled from: BusercenterViewDeleteAccountSuccessBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4890p0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f5272a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f5273b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f5274c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TextView f5275d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4890p0 m5059a(@NonNull View view) {
        int i11 = R$id.iv_success;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.tv_confirm;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
            if (textView != null) {
                i11 = R$id.tv_done;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                if (textView2 != null) {
                    return new C4890p0((ConstraintLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f5272a;
    }

    public C4890p0(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f5272a = constraintLayout;
        this.f5273b = imageView;
        this.f5274c = textView;
        this.f5275d = textView2;
    }
}
