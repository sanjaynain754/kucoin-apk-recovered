package p637ta;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;

/* JADX INFO: renamed from: ta.y1 */
/* JADX INFO: compiled from: AssetPasteEdittextLayoutBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44901y1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f101168a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ClearEditText f101169b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f101170c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44901y1 m99326a(@NonNull View view) {
        int i11 = R$id.addrSearch;
        ClearEditText clearEditText = (ClearEditText) ViewBindings.findChildViewById(view, i11);
        if (clearEditText != null) {
            i11 = R$id.tvPaste;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                return new C44901y1((FrameLayout) view, clearEditText, baseTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f101168a;
    }

    public C44901y1(@NonNull FrameLayout frameLayout, @NonNull ClearEditText clearEditText, @NonNull BaseTextView baseTextView) {
        this.f101168a = frameLayout;
        this.f101169b = clearEditText;
        this.f101170c = baseTextView;
    }
}
