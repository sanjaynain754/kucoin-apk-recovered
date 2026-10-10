package p637ta;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.AlignTopTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ta.m3 */
/* JADX INFO: compiled from: DialogWithdrawCheckBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44819m3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f100452a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f100453b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f100454c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final NestedScrollView f100455d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final KcPrimaryButton f100456e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AlignTopTextView f100457f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AlignTopTextView f100458g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final AlignTopTextView f100459h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f100460i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44819m3 m99162a(@NonNull View view) {
        int i11 = R$id.iv_cancel;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.iv_check;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView2 != null) {
                i11 = R$id.scrollView;
                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i11);
                if (nestedScrollView != null) {
                    i11 = R$id.tv_confirm;
                    KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                    if (kcPrimaryButton != null) {
                        i11 = R$id.tv_desc_1;
                        AlignTopTextView alignTopTextView = (AlignTopTextView) ViewBindings.findChildViewById(view, i11);
                        if (alignTopTextView != null) {
                            i11 = R$id.tv_desc_2;
                            AlignTopTextView alignTopTextView2 = (AlignTopTextView) ViewBindings.findChildViewById(view, i11);
                            if (alignTopTextView2 != null) {
                                i11 = R$id.tv_desc_3;
                                AlignTopTextView alignTopTextView3 = (AlignTopTextView) ViewBindings.findChildViewById(view, i11);
                                if (alignTopTextView3 != null) {
                                    i11 = R$id.tv_title;
                                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView != null) {
                                        return new C44819m3((ConstraintLayout) view, imageView, imageView2, nestedScrollView, kcPrimaryButton, alignTopTextView, alignTopTextView2, alignTopTextView3, baseTextView);
                                    }
                                }
                            }
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
    public ConstraintLayout getRoot() {
        return this.f100452a;
    }

    public C44819m3(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull NestedScrollView nestedScrollView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull AlignTopTextView alignTopTextView, @NonNull AlignTopTextView alignTopTextView2, @NonNull AlignTopTextView alignTopTextView3, @NonNull BaseTextView baseTextView) {
        this.f100452a = constraintLayout;
        this.f100453b = imageView;
        this.f100454c = imageView2;
        this.f100455d = nestedScrollView;
        this.f100456e = kcPrimaryButton;
        this.f100457f = alignTopTextView;
        this.f100458g = alignTopTextView2;
        this.f100459h = alignTopTextView3;
        this.f100460i = baseTextView;
    }
}
