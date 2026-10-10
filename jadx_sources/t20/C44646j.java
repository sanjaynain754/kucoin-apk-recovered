package t20;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.RadioButton;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.RadioGroupPlus;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.j */
/* JADX INFO: compiled from: BkucoinFragmentMarketRecommendBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44646j implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f99136a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final HorizontalScrollView f99137b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RadioButton f99138c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RadioButton f99139d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RadioButton f99140e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final RadioButton f99141f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RadioButton f99142g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final RecyclerView f99143h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final RadioGroupPlus f99144i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44646j m98768a(@NonNull View view) {
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
                                        return new C44646j((ConstraintLayout) view, horizontalScrollView, radioButton, radioButton2, radioButton3, radioButton4, radioButton5, recyclerView, radioGroupPlus);
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
        return this.f99136a;
    }

    public C44646j(@NonNull ConstraintLayout constraintLayout, @NonNull HorizontalScrollView horizontalScrollView, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull RadioButton radioButton3, @NonNull RadioButton radioButton4, @NonNull RadioButton radioButton5, @NonNull RecyclerView recyclerView, @NonNull RadioGroupPlus radioGroupPlus) {
        this.f99136a = constraintLayout;
        this.f99137b = horizontalScrollView;
        this.f99138c = radioButton;
        this.f99139d = radioButton2;
        this.f99140e = radioButton3;
        this.f99141f = radioButton4;
        this.f99142g = radioButton5;
        this.f99143h = recyclerView;
        this.f99144i = radioGroupPlus;
    }
}
