package p270ft;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ft.y1 */
/* JADX INFO: compiled from: PaymentFragmentRechargePaymentMethodBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37711y1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84927a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f84928b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Layer f84929c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f84930d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f84931e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f84932f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final KcPrimaryButton f84933g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final AppCompatImageView f84934h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final Layer f84935i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f84936j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37711y1 m85008a(@NonNull View view) {
        int i11 = R$id.iv_coin;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.layer;
            Layer layer = (Layer) ViewBindings.findChildViewById(view, i11);
            if (layer != null) {
                i11 = R$id.recyclerView;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                if (recyclerView != null) {
                    i11 = R$id.title_view;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tv_coin_name;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.unavailable_button;
                            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                            if (kcPrimaryButton != null) {
                                i11 = R$id.unavailable_icon;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                if (appCompatImageView != null) {
                                    i11 = R$id.unavailable_layer;
                                    Layer layer2 = (Layer) ViewBindings.findChildViewById(view, i11);
                                    if (layer2 != null) {
                                        i11 = R$id.unavailable_text;
                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView3 != null) {
                                            return new C37711y1((ConstraintLayout) view, imageView, layer, recyclerView, baseTextView, baseTextView2, kcPrimaryButton, appCompatImageView, layer2, baseTextView3);
                                        }
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
        return this.f84927a;
    }

    public C37711y1(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull Layer layer, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull AppCompatImageView appCompatImageView, @NonNull Layer layer2, @NonNull BaseTextView baseTextView3) {
        this.f84927a = constraintLayout;
        this.f84928b = imageView;
        this.f84929c = layer;
        this.f84930d = recyclerView;
        this.f84931e = baseTextView;
        this.f84932f = baseTextView2;
        this.f84933g = kcPrimaryButton;
        this.f84934h = appCompatImageView;
        this.f84935i = layer2;
        this.f84936j = baseTextView3;
    }
}
