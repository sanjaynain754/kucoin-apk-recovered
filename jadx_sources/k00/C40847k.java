package k00;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.sdk.res.R$id;
import com.kubi.sdk.res.R$layout;

/* JADX INFO: renamed from: k00.k */
/* JADX INFO: compiled from: KucoinViewSwitchFragmentBinding.java */
/* JADX INFO: loaded from: classes42.dex */
public final class C40847k implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f90772a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f90773b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f90774c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f90775d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RadioGroup f90776e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final RadioButton f90777f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RadioButton f90778g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TextView f90779h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C40847k m89393a(@NonNull View view) {
        int i11 = R$id.fl_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout != null) {
            i11 = R$id.iv_back;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.iv_right;
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
                                i11 = R$id.tv_right;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                                if (textView != null) {
                                    return new C40847k(view, frameLayout, imageView, imageView2, radioGroup, radioButton, radioButton2, textView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static C40847k m89394b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.kucoin_view_switch_fragment, viewGroup);
        return m89393a(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f90772a;
    }

    public C40847k(@NonNull View view, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull RadioGroup radioGroup, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull TextView textView) {
        this.f90772a = view;
        this.f90773b = frameLayout;
        this.f90774c = imageView;
        this.f90775d = imageView2;
        this.f90776e = radioGroup;
        this.f90777f = radioButton;
        this.f90778g = radioButton2;
        this.f90779h = textView;
    }
}
