package r80;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.widget.web.R$id;

/* JADX INFO: renamed from: r80.a */
/* JADX INFO: compiled from: KwebLayoutWebviewWhiteBinding.java */
/* JADX INFO: loaded from: classes59.dex */
public final class C43945a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f97161a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TextView f97162b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f97163c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f97164d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C43945a m96902a(@NonNull View view) {
        int i11 = R$id.tv_go_on;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
        if (textView != null) {
            i11 = R$id.tv_url;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
            if (textView2 != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new C43945a(linearLayout, textView, textView2, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f97161a;
    }

    public C43945a(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout2) {
        this.f97161a = linearLayout;
        this.f97162b = textView;
        this.f97163c = textView2;
        this.f97164d = linearLayout2;
    }
}
