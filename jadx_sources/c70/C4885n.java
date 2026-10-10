package c70;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.user.R$id;

/* JADX INFO: renamed from: c70.n */
/* JADX INFO: compiled from: BusercenterFragmentResetPwdEmailAuthBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4885n implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f5216a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TextView f5217b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f5218c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TextView f5219d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f5220e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4885n m5049a(@NonNull View view) {
        int i11 = R$id.tvRiskCheck1;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
        if (textView != null) {
            i11 = R$id.tvRiskCheck2;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
            if (textView2 != null) {
                i11 = R$id.tvRiskCheck3;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                if (textView3 != null) {
                    i11 = R$id.tvRiskContent;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i11);
                    if (textView4 != null) {
                        return new C4885n((LinearLayoutCompat) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f5216a;
    }

    public C4885n(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f5216a = linearLayoutCompat;
        this.f5217b = textView;
        this.f5218c = textView2;
        this.f5219d = textView3;
        this.f5220e = textView4;
    }
}
