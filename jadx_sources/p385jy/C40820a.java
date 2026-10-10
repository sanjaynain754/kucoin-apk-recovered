package p385jy;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.sdk.R$id;

/* JADX INFO: renamed from: jy.a */
/* JADX INFO: compiled from: ViewEmptyBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C40820a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f90678a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f90679b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f90680c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C40820a m89302a(@NonNull View view) {
        int i11 = R$id.empty_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.empty_tips;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
            if (textView != null) {
                return new C40820a((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f90678a;
    }

    public C40820a(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f90678a = linearLayout;
        this.f90679b = imageView;
        this.f90680c = textView;
    }
}
