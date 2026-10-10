package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcSwitchButton;

/* JADX INFO: renamed from: ta.v5 */
/* JADX INFO: compiled from: ViewAutoEarnCoinEntryBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44884v5 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f101013a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcSwitchButton f101014b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayoutCompat f101015c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f101016d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f101017e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44884v5 m99292a(@NonNull View view) {
        int i11 = R$id.autoEarnSwitch;
        KcSwitchButton kcSwitchButton = (KcSwitchButton) ViewBindings.findChildViewById(view, i11);
        if (kcSwitchButton != null) {
            i11 = R$id.row1;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
            if (linearLayoutCompat != null) {
                i11 = R$id.tvDesc;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.tvTitle;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        return new C44884v5((ConstraintLayout) view, kcSwitchButton, linearLayoutCompat, baseTextView, baseTextView2);
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
        return this.f101013a;
    }

    public C44884v5(@NonNull ConstraintLayout constraintLayout, @NonNull KcSwitchButton kcSwitchButton, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f101013a = constraintLayout;
        this.f101014b = kcSwitchButton;
        this.f101015c = linearLayoutCompat;
        this.f101016d = baseTextView;
        this.f101017e = baseTextView2;
    }
}
