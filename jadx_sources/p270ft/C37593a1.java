package p270ft;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;

/* JADX INFO: renamed from: ft.a1 */
/* JADX INFO: compiled from: PaymentDialogFastSellPaymentMethodBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37593a1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f83599a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f83600b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f83601c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TextView f83602d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37593a1 m84770a(@NonNull View view) {
        int i11 = R$id.ivClose;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
            if (recyclerView != null) {
                i11 = R$id.tvTitle;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                if (textView != null) {
                    return new C37593a1((ConstraintLayout) view, appCompatImageView, recyclerView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f83599a;
    }

    public C37593a1(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.f83599a = constraintLayout;
        this.f83600b = appCompatImageView;
        this.f83601c = recyclerView;
        this.f83602d = textView;
    }
}
