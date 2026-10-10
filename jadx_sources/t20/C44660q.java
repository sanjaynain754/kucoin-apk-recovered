package t20;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.UpDownTextView;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.q */
/* JADX INFO: compiled from: BkucoinLayoutCoinTickBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44660q implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f99284a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final UpDownTextView f99285b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f99286c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f99287d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f99288e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44660q m98796a(@NonNull View view) {
        int i11 = R$id.tv_change_rate;
        UpDownTextView upDownTextView = (UpDownTextView) ViewBindings.findChildViewById(view, i11);
        if (upDownTextView != null) {
            i11 = R$id.tv_coin_name;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.tv_price;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.tv_time;
                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView3 != null) {
                        return new C44660q((ConstraintLayout) view, upDownTextView, baseTextView, baseTextView2, baseTextView3);
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
        return this.f99284a;
    }

    public C44660q(@NonNull ConstraintLayout constraintLayout, @NonNull UpDownTextView upDownTextView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f99284a = constraintLayout;
        this.f99285b = upDownTextView;
        this.f99286c = baseTextView;
        this.f99287d = baseTextView2;
        this.f99288e = baseTextView3;
    }
}
