package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: dm.y3 */
/* JADX INFO: compiled from: BkumexItemPerpetualSwapBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36875y3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81390a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f81391b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f81392c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f81393d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f81394e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36875y3 m82618a(@NonNull View view) {
        int i11 = R$id.marginModeTv;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i11 = R$id.selectStatusTv;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.symbolTv;
                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView3 != null) {
                    return new C36875y3(constraintLayout, baseTextView, constraintLayout, baseTextView2, baseTextView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f81390a;
    }

    public C36875y3(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull ConstraintLayout constraintLayout2, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f81390a = constraintLayout;
        this.f81391b = baseTextView;
        this.f81392c = constraintLayout2;
        this.f81393d = baseTextView2;
        this.f81394e = baseTextView3;
    }
}
