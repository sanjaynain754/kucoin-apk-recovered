package p270ft;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.n0 */
/* JADX INFO: compiled from: P2pCommonTitleBarBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37657n0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f84298a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f84299b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f84300c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37657n0 m84897a(@NonNull View view) {
        int i11 = R$id.iv_close;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.title_view;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                return new C37657n0((LinearLayout) view, appCompatImageView, baseTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f84298a;
    }

    public C37657n0(@NonNull LinearLayout linearLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView) {
        this.f84298a = linearLayout;
        this.f84299b = appCompatImageView;
        this.f84300c = baseTextView;
    }
}
