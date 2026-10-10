package t20;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.p */
/* JADX INFO: compiled from: BkucoinLayoutCoinCountDownBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44658p implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f99275a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f99276b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f99277c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f99278d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f99279e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f99280f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f99281g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44658p m98792a(@NonNull View view) {
        int i11 = R$id.tv_days;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.tv_days_label;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.tv_hours;
                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView3 != null) {
                    i11 = R$id.tv_hours_label;
                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView4 != null) {
                        i11 = R$id.tv_minutes;
                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView5 != null) {
                            i11 = R$id.tv_minutes_label;
                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView6 != null) {
                                return new C44658p((ConstraintLayout) view, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6);
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
        return this.f99275a;
    }

    public C44658p(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6) {
        this.f99275a = constraintLayout;
        this.f99276b = baseTextView;
        this.f99277c = baseTextView2;
        this.f99278d = baseTextView3;
        this.f99279e = baseTextView4;
        this.f99280f = baseTextView5;
        this.f99281g = baseTextView6;
    }
}
