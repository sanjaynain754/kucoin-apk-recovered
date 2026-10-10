package bv;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.tradechance.widget.squarify.ChanceSquarifyView;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: bv.s0 */
/* JADX INFO: compiled from: QuoteViewTradechancePlateBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4693s0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f4528a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ChanceSquarifyView f4529b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f4530c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f4531d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4693s0 m4698a(@NonNull View view) {
        int i11 = R$id.squarify;
        ChanceSquarifyView chanceSquarifyView = (ChanceSquarifyView) ViewBindings.findChildViewById(view, i11);
        if (chanceSquarifyView != null) {
            i11 = R$id.tvMore;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.tvTitle;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    return new C4693s0((ConstraintLayout) view, chanceSquarifyView, baseTextView, baseTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f4528a;
    }

    public C4693s0(@NonNull ConstraintLayout constraintLayout, @NonNull ChanceSquarifyView chanceSquarifyView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f4528a = constraintLayout;
        this.f4529b = chanceSquarifyView;
        this.f4530c = baseTextView;
        this.f4531d = baseTextView2;
    }
}
