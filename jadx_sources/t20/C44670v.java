package t20;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.v */
/* JADX INFO: compiled from: BspotViewImportantNoticeBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44670v implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ShapeLinearLayout f99401a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f99402b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f99403c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44670v m98816a(@NonNull View view) {
        int i11 = R$id.ivClose;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.tvImportantNotice;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                return new C44670v((ShapeLinearLayout) view, imageView, baseTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ShapeLinearLayout getRoot() {
        return this.f99401a;
    }

    public C44670v(@NonNull ShapeLinearLayout shapeLinearLayout, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView) {
        this.f99401a = shapeLinearLayout;
        this.f99402b = imageView;
        this.f99403c = baseTextView;
    }
}
