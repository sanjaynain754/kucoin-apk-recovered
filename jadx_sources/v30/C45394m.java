package v30;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;
import com.kubi.tradecorebiz.R$id;

/* JADX INFO: renamed from: v30.m */
/* JADX INFO: compiled from: BspotViewComplianceNoticeBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45394m implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ShapeLinearLayout f102202a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f102203b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f102204c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45394m m100322a(@NonNull View view) {
        int i11 = R$id.ivClose;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.tvComplianceNotice;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                return new C45394m((ShapeLinearLayout) view, imageView, baseTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ShapeLinearLayout getRoot() {
        return this.f102202a;
    }

    public C45394m(@NonNull ShapeLinearLayout shapeLinearLayout, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView) {
        this.f102202a = shapeLinearLayout;
        this.f102203b = imageView;
        this.f102204c = baseTextView;
    }
}
