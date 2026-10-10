package jo;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.loan.R$id;

/* JADX INFO: renamed from: jo.i */
/* JADX INFO: compiled from: BloanIncludeBusinessPauseBinding.java */
/* JADX INFO: loaded from: classes26.dex */
public final class C40458i implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f89806a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f89807b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f89808c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TextView f89809d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C40458i m89105a(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R$id.pause_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.pause_tips;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
            if (textView != null) {
                return new C40458i(constraintLayout, constraintLayout, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f89806a;
    }

    public C40458i(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f89806a = constraintLayout;
        this.f89807b = constraintLayout2;
        this.f89808c = imageView;
        this.f89809d = textView;
    }
}
