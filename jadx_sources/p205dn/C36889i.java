package p205dn;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kyc.R$id;

/* JADX INFO: renamed from: dn.i */
/* JADX INFO: compiled from: BusercenterViewUploadImagev2NewBinding.java */
/* JADX INFO: loaded from: classes21.dex */
public final class C36889i implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81470a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f81471b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f81472c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36889i m82647a(@NonNull View view) {
        int i11 = R$id.imagev2;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        return new C36889i(constraintLayout, imageView, constraintLayout);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f81470a;
    }

    public C36889i(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2) {
        this.f81470a = constraintLayout;
        this.f81471b = imageView;
        this.f81472c = constraintLayout2;
    }
}
