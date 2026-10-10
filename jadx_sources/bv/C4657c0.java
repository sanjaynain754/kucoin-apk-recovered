package bv;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: bv.c0 */
/* JADX INFO: compiled from: KucoinFragmentAlertCreateBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4657c0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f4246a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f4247b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f4248c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RadioGroup f4249d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RadioButton f4250e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final RadioButton f4251f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RecyclerView f4252g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f4253h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayout f4254i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4657c0 m4626a(@NonNull View view) {
        int i11 = R$id.iv_back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.iv_delete_tip;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView2 != null) {
                i11 = R$id.rb_group;
                RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i11);
                if (radioGroup != null) {
                    i11 = R$id.rb_one;
                    RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i11);
                    if (radioButton != null) {
                        i11 = R$id.rb_two;
                        RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                        if (radioButton2 != null) {
                            i11 = R$id.recycler_alert_rv;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                            if (recyclerView != null) {
                                i11 = R$id.tv_open_notify_tip;
                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView != null) {
                                    i11 = R$id.view_open_notify;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                    if (linearLayout != null) {
                                        return new C4657c0((LinearLayout) view, imageView, imageView2, radioGroup, radioButton, radioButton2, recyclerView, baseTextView, linearLayout);
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
        return this.f4246a;
    }

    public C4657c0(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull RadioGroup radioGroup, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView, @NonNull LinearLayout linearLayout2) {
        this.f4246a = linearLayout;
        this.f4247b = imageView;
        this.f4248c = imageView2;
        this.f4249d = radioGroup;
        this.f4250e = radioButton;
        this.f4251f = radioButton2;
        this.f4252g = recyclerView;
        this.f4253h = baseTextView;
        this.f4254i = linearLayout2;
    }
}
