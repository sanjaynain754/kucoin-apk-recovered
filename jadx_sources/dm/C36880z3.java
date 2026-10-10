package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: dm.z3 */
/* JADX INFO: compiled from: BkumexItemPerpetualSwapFailedBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36880z3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81415a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f81416b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f81417c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36880z3 m82629a(@NonNull View view) {
        int i11 = R$id.errorMsgTv;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.symbolsTv;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                return new C36880z3((ConstraintLayout) view, baseTextView, baseTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f81415a;
    }

    public C36880z3(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f81415a = constraintLayout;
        this.f81416b = baseTextView;
        this.f81417c = baseTextView2;
    }
}
