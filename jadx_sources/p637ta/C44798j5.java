package p637ta;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.j5 */
/* JADX INFO: compiled from: KucoinViewWithdrawEmptyBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44798j5 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f100230a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f100231b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f100232c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f100233d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f100234e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44798j5 m99115a(@NonNull View view) {
        int i11 = R$id.iv_empty;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.tv_error;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.tv_setup_notice;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.tv_tip;
                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView3 != null) {
                        return new C44798j5((ConstraintLayout) view, imageView, baseTextView, baseTextView2, baseTextView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f100230a;
    }

    public C44798j5(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f100230a = constraintLayout;
        this.f100231b = imageView;
        this.f100232c = baseTextView;
        this.f100233d = baseTextView2;
        this.f100234e = baseTextView3;
    }
}
