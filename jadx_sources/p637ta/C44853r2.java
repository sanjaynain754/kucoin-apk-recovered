package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;

/* JADX INFO: renamed from: ta.r2 */
/* JADX INFO: compiled from: AssetViewSearchHeaderBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44853r2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f100723a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ClearEditText f100724b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f100725c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f100726d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44853r2 m99230a(@NonNull View view) {
        int i11 = R$id.etSearch;
        ClearEditText clearEditText = (ClearEditText) ViewBindings.findChildViewById(view, i11);
        if (clearEditText != null) {
            i11 = R$id.tvClose;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new C44853r2(linearLayout, clearEditText, baseTextView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f100723a;
    }

    public C44853r2(@NonNull LinearLayout linearLayout, @NonNull ClearEditText clearEditText, @NonNull BaseTextView baseTextView, @NonNull LinearLayout linearLayout2) {
        this.f100723a = linearLayout;
        this.f100724b = clearEditText;
        this.f100725c = baseTextView;
        this.f100726d = linearLayout2;
    }
}
