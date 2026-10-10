package c70;

import android.view.View;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.user.R$id;

/* JADX INFO: renamed from: c70.s */
/* JADX INFO: compiled from: BusercenterLayoutCodeInputViewBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4895s implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f5302a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final CheckedTextView f5303b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final CheckedTextView f5304c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final CheckedTextView f5305d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final CheckedTextView f5306e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final CheckedTextView f5307f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final CheckedTextView f5308g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final EditText f5309h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayout f5310i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4895s m5069a(@NonNull View view) {
        int i11 = R$id.ctv_code1;
        CheckedTextView checkedTextView = (CheckedTextView) ViewBindings.findChildViewById(view, i11);
        if (checkedTextView != null) {
            i11 = R$id.ctv_code2;
            CheckedTextView checkedTextView2 = (CheckedTextView) ViewBindings.findChildViewById(view, i11);
            if (checkedTextView2 != null) {
                i11 = R$id.ctv_code3;
                CheckedTextView checkedTextView3 = (CheckedTextView) ViewBindings.findChildViewById(view, i11);
                if (checkedTextView3 != null) {
                    i11 = R$id.ctv_code4;
                    CheckedTextView checkedTextView4 = (CheckedTextView) ViewBindings.findChildViewById(view, i11);
                    if (checkedTextView4 != null) {
                        i11 = R$id.ctv_code5;
                        CheckedTextView checkedTextView5 = (CheckedTextView) ViewBindings.findChildViewById(view, i11);
                        if (checkedTextView5 != null) {
                            i11 = R$id.ctv_code6;
                            CheckedTextView checkedTextView6 = (CheckedTextView) ViewBindings.findChildViewById(view, i11);
                            if (checkedTextView6 != null) {
                                i11 = R$id.et_input_fake;
                                EditText editText = (EditText) ViewBindings.findChildViewById(view, i11);
                                if (editText != null) {
                                    i11 = R$id.layout_codes;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                    if (linearLayout != null) {
                                        return new C4895s((FrameLayout) view, checkedTextView, checkedTextView2, checkedTextView3, checkedTextView4, checkedTextView5, checkedTextView6, editText, linearLayout);
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
    public FrameLayout getRoot() {
        return this.f5302a;
    }

    public C4895s(@NonNull FrameLayout frameLayout, @NonNull CheckedTextView checkedTextView, @NonNull CheckedTextView checkedTextView2, @NonNull CheckedTextView checkedTextView3, @NonNull CheckedTextView checkedTextView4, @NonNull CheckedTextView checkedTextView5, @NonNull CheckedTextView checkedTextView6, @NonNull EditText editText, @NonNull LinearLayout linearLayout) {
        this.f5302a = frameLayout;
        this.f5303b = checkedTextView;
        this.f5304c = checkedTextView2;
        this.f5305d = checkedTextView3;
        this.f5306e = checkedTextView4;
        this.f5307f = checkedTextView5;
        this.f5308g = checkedTextView6;
        this.f5309h = editText;
        this.f5310i = linearLayout;
    }
}
