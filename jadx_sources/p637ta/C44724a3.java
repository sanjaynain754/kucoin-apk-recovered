package p637ta;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.widget.shape.view.ShapeTextView;

/* JADX INFO: renamed from: ta.a3 */
/* JADX INFO: compiled from: BassetsViewDepositKycBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44724a3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f99562a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f99563b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayoutCompat f99564c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f99565d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ShapeTextView f99566e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f99567f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44724a3 m98958a(@NonNull View view) {
        int i11 = R$id.ivBg;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
            i11 = R$id.tvContent;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.tvGoKyc;
                ShapeTextView shapeTextView = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                if (shapeTextView != null) {
                    i11 = R$id.tvTitle;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        return new C44724a3(linearLayoutCompat, imageView, linearLayoutCompat, baseTextView, shapeTextView, baseTextView2);
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
        return this.f99562a;
    }

    public C44724a3(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ImageView imageView, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull BaseTextView baseTextView, @NonNull ShapeTextView shapeTextView, @NonNull BaseTextView baseTextView2) {
        this.f99562a = linearLayoutCompat;
        this.f99563b = imageView;
        this.f99564c = linearLayoutCompat2;
        this.f99565d = baseTextView;
        this.f99566e = shapeTextView;
        this.f99567f = baseTextView2;
    }
}
