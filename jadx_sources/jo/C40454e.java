package jo;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.loan.R$id;

/* JADX INFO: renamed from: jo.e */
/* JADX INFO: compiled from: BloanFragmentBorrowRepayToggleBinding.java */
/* JADX INFO: loaded from: classes26.dex */
public final class C40454e implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f89778a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f89779b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RadioButton f89780c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RadioGroup f89781d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RadioButton f89782e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C40454e m89097a(@NonNull View view) {
        int i11 = R$id.fl_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout != null) {
            i11 = R$id.rbCorss;
            RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i11);
            if (radioButton != null) {
                i11 = R$id.rb_group;
                RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i11);
                if (radioGroup != null) {
                    i11 = R$id.rbIsolated;
                    RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                    if (radioButton2 != null) {
                        return new C40454e((LinearLayout) view, frameLayout, radioButton, radioGroup, radioButton2);
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
        return this.f89778a;
    }

    public C40454e(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull RadioButton radioButton, @NonNull RadioGroup radioGroup, @NonNull RadioButton radioButton2) {
        this.f89778a = linearLayout;
        this.f89779b = frameLayout;
        this.f89780c = radioButton;
        this.f89781d = radioGroup;
        this.f89782e = radioButton2;
    }
}
