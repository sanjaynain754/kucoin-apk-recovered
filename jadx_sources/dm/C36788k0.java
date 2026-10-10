package dm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: dm.k0 */
/* JADX INFO: compiled from: BkumexDialogModifyMarginModeBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36788k0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f80375a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f80376b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f80377c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayoutCompat f80378d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f80379e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f80380f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayoutCompat f80381g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f80382h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f80383i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36788k0 m82435a(@NonNull View view) {
        int i11 = R$id.cross;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.crossDesc;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.crossLayout;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                if (linearLayoutCompat != null) {
                    i11 = R$id.isolated;
                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView3 != null) {
                        i11 = R$id.isolatedDesc;
                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView4 != null) {
                            i11 = R$id.isolatedLayout;
                            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                            if (linearLayoutCompat2 != null) {
                                i11 = R$id.modeSetting;
                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView5 != null) {
                                    i11 = R$id.title;
                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView6 != null) {
                                        return new C36788k0((LinearLayout) view, baseTextView, baseTextView2, linearLayoutCompat, baseTextView3, baseTextView4, linearLayoutCompat2, baseTextView5, baseTextView6);
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
    public LinearLayout getRoot() {
        return this.f80375a;
    }

    public C36788k0(@NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6) {
        this.f80375a = linearLayout;
        this.f80376b = baseTextView;
        this.f80377c = baseTextView2;
        this.f80378d = linearLayoutCompat;
        this.f80379e = baseTextView3;
        this.f80380f = baseTextView4;
        this.f80381g = linearLayoutCompat2;
        this.f80382h = baseTextView5;
        this.f80383i = baseTextView6;
    }
}
