package dm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: dm.t0 */
/* JADX INFO: compiled from: BkumexDialogPositionQtyBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36842t0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81056a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f81057b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f81058c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f81059d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f81060e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f81061f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f81062g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f81063h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36842t0 m82549a(@NonNull View view) {
        int i11 = R$id.currencyLabel;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.currencyValue;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.lotLabel;
                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView3 != null) {
                    i11 = R$id.lotValue;
                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView4 != null) {
                        i11 = R$id.title;
                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView5 != null) {
                            i11 = R$id.value;
                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView6 != null) {
                                i11 = R$id.valueLabel;
                                BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView7 != null) {
                                    return new C36842t0((LinearLayout) view, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7);
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
    public LinearLayout getRoot() {
        return this.f81056a;
    }

    public C36842t0(@NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7) {
        this.f81056a = linearLayout;
        this.f81057b = baseTextView;
        this.f81058c = baseTextView2;
        this.f81059d = baseTextView3;
        this.f81060e = baseTextView4;
        this.f81061f = baseTextView5;
        this.f81062g = baseTextView6;
        this.f81063h = baseTextView7;
    }
}
