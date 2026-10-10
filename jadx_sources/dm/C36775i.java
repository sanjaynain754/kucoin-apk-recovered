package dm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: dm.i */
/* JADX INFO: compiled from: BkumexDialogBboTypeBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36775i implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f80220a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f80221b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f80222c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f80223d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f80224e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayout f80225f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayout f80226g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f80227h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f80228i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36775i m82407a(@NonNull View view) {
        int i11 = R$id.other1;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.other5;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.same1;
                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView3 != null) {
                    i11 = R$id.same5;
                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView4 != null) {
                        i11 = R$id.tips1;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                        if (linearLayout != null) {
                            i11 = R$id.tips2;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                            if (linearLayout2 != null) {
                                i11 = R$id.tipsTitle;
                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView5 != null) {
                                    i11 = R$id.titleTips;
                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView6 != null) {
                                        return new C36775i((LinearLayout) view, baseTextView, baseTextView2, baseTextView3, baseTextView4, linearLayout, linearLayout2, baseTextView5, baseTextView6);
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
        return this.f80220a;
    }

    public C36775i(@NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6) {
        this.f80220a = linearLayout;
        this.f80221b = baseTextView;
        this.f80222c = baseTextView2;
        this.f80223d = baseTextView3;
        this.f80224e = baseTextView4;
        this.f80225f = linearLayout2;
        this.f80226g = linearLayout3;
        this.f80227h = baseTextView5;
        this.f80228i = baseTextView6;
    }
}
