package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.futures.view.AnimateDrawableEndView;
import com.kubi.kumex.R$id;
import com.kubi.kumex.view.FocusEditText;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: dm.k3 */
/* JADX INFO: compiled from: BkumexFragmentTakerStopBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36791k3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80397a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FocusEditText f80398b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FocusEditText f80399c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f80400d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AnimateDrawableEndView f80401e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final FocusEditText f80402f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final FocusEditText f80403g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f80404h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final AnimateDrawableEndView f80405i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36791k3 m82442a(@NonNull View view) {
        int i11 = R$id.lossPrice;
        FocusEditText focusEditText = (FocusEditText) ViewBindings.findChildViewById(view, i11);
        if (focusEditText != null) {
            i11 = R$id.lossRate;
            FocusEditText focusEditText2 = (FocusEditText) ViewBindings.findChildViewById(view, i11);
            if (focusEditText2 != null) {
                i11 = R$id.lossTitle;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.lossType;
                    AnimateDrawableEndView animateDrawableEndView = (AnimateDrawableEndView) ViewBindings.findChildViewById(view, i11);
                    if (animateDrawableEndView != null) {
                        i11 = R$id.profitPrice;
                        FocusEditText focusEditText3 = (FocusEditText) ViewBindings.findChildViewById(view, i11);
                        if (focusEditText3 != null) {
                            i11 = R$id.profitRate;
                            FocusEditText focusEditText4 = (FocusEditText) ViewBindings.findChildViewById(view, i11);
                            if (focusEditText4 != null) {
                                i11 = R$id.profitTitle;
                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView2 != null) {
                                    i11 = R$id.profitType;
                                    AnimateDrawableEndView animateDrawableEndView2 = (AnimateDrawableEndView) ViewBindings.findChildViewById(view, i11);
                                    if (animateDrawableEndView2 != null) {
                                        return new C36791k3((ConstraintLayout) view, focusEditText, focusEditText2, baseTextView, animateDrawableEndView, focusEditText3, focusEditText4, baseTextView2, animateDrawableEndView2);
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
        return this.f80397a;
    }

    public C36791k3(@NonNull ConstraintLayout constraintLayout, @NonNull FocusEditText focusEditText, @NonNull FocusEditText focusEditText2, @NonNull BaseTextView baseTextView, @NonNull AnimateDrawableEndView animateDrawableEndView, @NonNull FocusEditText focusEditText3, @NonNull FocusEditText focusEditText4, @NonNull BaseTextView baseTextView2, @NonNull AnimateDrawableEndView animateDrawableEndView2) {
        this.f80397a = constraintLayout;
        this.f80398b = focusEditText;
        this.f80399c = focusEditText2;
        this.f80400d = baseTextView;
        this.f80401e = animateDrawableEndView;
        this.f80402f = focusEditText3;
        this.f80403g = focusEditText4;
        this.f80404h = baseTextView2;
        this.f80405i = animateDrawableEndView2;
    }
}
