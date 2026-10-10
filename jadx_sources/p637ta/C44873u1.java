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

/* JADX INFO: renamed from: ta.u1 */
/* JADX INFO: compiled from: AssetMultiPaymentDialogItemGridBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44873u1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f100926a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f100927b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayoutCompat f100928c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ShapeTextView f100929d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f100930e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44873u1 m99270a(@NonNull View view) {
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
                        return new C44873u1((FrameLayout) view, appCompatImageView, linearLayoutCompat, shapeTextView, baseTextView);
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
        return this.f100926a;
    }

    public C44873u1(@NonNull FrameLayout frameLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ShapeTextView shapeTextView, @NonNull BaseTextView baseTextView) {
        this.f100926a = frameLayout;
        this.f100927b = appCompatImageView;
        this.f100928c = linearLayoutCompat;
        this.f100929d = shapeTextView;
        this.f100930e = baseTextView;
    }
}
