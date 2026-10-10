package dm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: dm.n1 */
/* JADX INFO: compiled from: BkumexFooterPanelKLineOnewayBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36807n1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80651a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f80652b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f80653c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f80654d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f80655e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f80656f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f80657g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f80658h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36807n1 m82475a(@NonNull View view) {
        int i11 = R$id.bottomOperationLl;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
        if (linearLayout != null) {
            i11 = R$id.buyAction;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.marginDeposit;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.marginDepositValue;
                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView3 != null) {
                        i11 = R$id.openLabel;
                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView4 != null) {
                            i11 = R$id.openValue;
                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView5 != null) {
                                i11 = R$id.sellAction;
                                BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView6 != null) {
                                    return new C36807n1((ConstraintLayout) view, linearLayout, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6);
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
        return this.f80651a;
    }

    public C36807n1(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6) {
        this.f80651a = constraintLayout;
        this.f80652b = linearLayout;
        this.f80653c = baseTextView;
        this.f80654d = baseTextView2;
        this.f80655e = baseTextView3;
        this.f80656f = baseTextView4;
        this.f80657g = baseTextView5;
        this.f80658h = baseTextView6;
    }
}
