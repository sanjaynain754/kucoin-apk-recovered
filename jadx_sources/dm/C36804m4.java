package dm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: dm.m4 */
/* JADX INFO: compiled from: BkumexTimeInputViewBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36804m4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f80624a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f80625b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f80626c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f80627d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36804m4 m82469a(@NonNull View view) {
        int i11 = R$id.initialDescTv;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.inputHintTv;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.inputTv;
                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView3 != null) {
                    return new C36804m4(view, baseTextView, baseTextView2, baseTextView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static C36804m4 m82470b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.bkumex_time_input_view, viewGroup);
        return m82469a(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f80624a;
    }

    public C36804m4(@NonNull View view, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f80624a = view;
        this.f80625b = baseTextView;
        this.f80626c = baseTextView2;
        this.f80627d = baseTextView3;
    }
}
