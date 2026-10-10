package p270ft;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;

/* JADX INFO: renamed from: ft.p1 */
/* JADX INFO: compiled from: PaymentFragmentFastTradeBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37668p1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84391a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f84392b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatTextView f84393c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TextView f84394d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37668p1 m84921a(@NonNull View view) {
        int i11 = R$id.container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout != null) {
            i11 = R$id.tvBuy;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
            if (appCompatTextView != null) {
                i11 = R$id.tvSell;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                if (textView != null) {
                    return new C37668p1((ConstraintLayout) view, frameLayout, appCompatTextView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f84391a;
    }

    public C37668p1(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull TextView textView) {
        this.f84391a = constraintLayout;
        this.f84392b = frameLayout;
        this.f84393c = appCompatTextView;
        this.f84394d = textView;
    }
}
