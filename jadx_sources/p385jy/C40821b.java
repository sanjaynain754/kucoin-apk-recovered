package p385jy;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.sdk.R$id;

/* JADX INFO: renamed from: jy.b */
/* JADX INFO: compiled from: ViewFailBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C40821b implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f90681a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TextView f90682b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C40821b m89304a(@NonNull View view) {
        int i11 = R$id.fail_tips;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
        if (textView != null) {
            return new C40821b((FrameLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f90681a;
    }

    public C40821b(@NonNull FrameLayout frameLayout, @NonNull TextView textView) {
        this.f90681a = frameLayout;
        this.f90682b = textView;
    }
}
