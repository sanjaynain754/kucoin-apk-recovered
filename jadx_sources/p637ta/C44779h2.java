package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;

/* JADX INFO: renamed from: ta.h2 */
/* JADX INFO: compiled from: AssetViewCommonSearchBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44779h2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f100023a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ClearEditText f100024b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f100025c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f100026d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44779h2 m99075a(@NonNull View view) {
        int i11 = R$id.et_search;
        ClearEditText clearEditText = (ClearEditText) ViewBindings.findChildViewById(view, i11);
        if (clearEditText != null) {
            i11 = R$id.tv_close;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new C44779h2(linearLayout, clearEditText, baseTextView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f100023a;
    }

    public C44779h2(@NonNull LinearLayout linearLayout, @NonNull ClearEditText clearEditText, @NonNull BaseTextView baseTextView, @NonNull LinearLayout linearLayout2) {
        this.f100023a = linearLayout;
        this.f100024b = clearEditText;
        this.f100025c = baseTextView;
        this.f100026d = linearLayout2;
    }
}
