package k00;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.sdk.res.R$id;
import com.kubi.sdk.res.R$layout;

/* JADX INFO: renamed from: k00.d */
/* JADX INFO: compiled from: DialogFragmentLoadingBinding.java */
/* JADX INFO: loaded from: classes42.dex */
public final class C40840d implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f90743a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f90744b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f90745c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C40840d m89375a(@NonNull View view) {
        int i11 = R$id.loading;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.tipTextView;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
            if (textView != null) {
                return new C40840d((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C40840d m89376c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.dialog_fragment_loading, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m89375a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f90743a;
    }

    public C40840d(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f90743a = linearLayout;
        this.f90744b = imageView;
        this.f90745c = textView;
    }
}
