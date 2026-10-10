package v30;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;
import com.kubi.tradecorebiz.R$id;

/* JADX INFO: renamed from: v30.l0 */
/* JADX INFO: compiled from: TradeCoreViewImportantNoticeBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45393l0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ShapeLinearLayout f102199a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f102200b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f102201c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45393l0 m100320a(@NonNull View view) {
        int i11 = R$id.ivClose;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.tvImportantNotice;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                return new C45393l0((ShapeLinearLayout) view, imageView, baseTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ShapeLinearLayout getRoot() {
        return this.f102199a;
    }

    public C45393l0(@NonNull ShapeLinearLayout shapeLinearLayout, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView) {
        this.f102199a = shapeLinearLayout;
        this.f102200b = imageView;
        this.f102201c = baseTextView;
    }
}
