package p206dp;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.RadioButton;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;
import com.kubi.resources.widget.RadioGroupPlus;

/* JADX INFO: renamed from: dp.b0 */
/* JADX INFO: compiled from: BmarginFragmentMarketRecommendBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36904b0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81589a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final HorizontalScrollView f81590b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RadioButton f81591c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RadioButton f81592d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RadioButton f81593e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final RadioButton f81594f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RadioButton f81595g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final RecyclerView f81596h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final RadioGroupPlus f81597i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36904b0 m82677a(@NonNull View view) {
        int i11 = R$id.hsv_type;
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ViewBindings.findChildViewById(view, i11);
        if (horizontalScrollView != null) {
            i11 = R$id.rb_activity;
            RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i11);
            if (radioButton != null) {
                i11 = R$id.rb_all;
                RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                if (radioButton2 != null) {
                    i11 = R$id.rb_earn;
                    RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                    if (radioButton3 != null) {
                        i11 = R$id.rb_otc;
                        RadioButton radioButton4 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                        if (radioButton4 != null) {
                            i11 = R$id.rb_robot;
                            RadioButton radioButton5 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                            if (radioButton5 != null) {
                                i11 = R$id.recycler_view;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                                if (recyclerView != null) {
                                    i11 = R$id.rgp;
                                    RadioGroupPlus radioGroupPlus = (RadioGroupPlus) ViewBindings.findChildViewById(view, i11);
                                    if (radioGroupPlus != null) {
                                        return new C36904b0((ConstraintLayout) view, horizontalScrollView, radioButton, radioButton2, radioButton3, radioButton4, radioButton5, recyclerView, radioGroupPlus);
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
        return this.f81589a;
    }

    public C36904b0(@NonNull ConstraintLayout constraintLayout, @NonNull HorizontalScrollView horizontalScrollView, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull RadioButton radioButton3, @NonNull RadioButton radioButton4, @NonNull RadioButton radioButton5, @NonNull RecyclerView recyclerView, @NonNull RadioGroupPlus radioGroupPlus) {
        this.f81589a = constraintLayout;
        this.f81590b = horizontalScrollView;
        this.f81591c = radioButton;
        this.f81592d = radioButton2;
        this.f81593e = radioButton3;
        this.f81594f = radioButton4;
        this.f81595g = radioButton5;
        this.f81596h = recyclerView;
        this.f81597i = radioGroupPlus;
    }
}
