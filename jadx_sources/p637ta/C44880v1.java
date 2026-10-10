package p637ta;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.widget.shape.view.ShapeTextView;

/* JADX INFO: renamed from: ta.v1 */
/* JADX INFO: compiled from: AssetMultiPaymentDialogItemRowBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44880v1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f100987a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f100988b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayoutCompat f100989c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ShapeTextView f100990d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f100991e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f100992f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44880v1 m99284a(@NonNull View view) {
        int i11 = R$id.ivIcon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.jumpRoot;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
            if (linearLayoutCompat != null) {
                i11 = R$id.tvLastUse;
                ShapeTextView shapeTextView = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                if (shapeTextView != null) {
                    i11 = R$id.tvRow1;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tvRow2;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            return new C44880v1((FrameLayout) view, appCompatImageView, linearLayoutCompat, shapeTextView, baseTextView, baseTextView2);
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
        return this.f100987a;
    }

    public C44880v1(@NonNull FrameLayout frameLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ShapeTextView shapeTextView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f100987a = frameLayout;
        this.f100988b = appCompatImageView;
        this.f100989c = linearLayoutCompat;
        this.f100990d = shapeTextView;
        this.f100991e = baseTextView;
        this.f100992f = baseTextView2;
    }
}
