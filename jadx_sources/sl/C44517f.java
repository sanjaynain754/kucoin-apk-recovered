package sl;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kucoin.market.monitor.lib.R$id;

/* JADX INFO: renamed from: sl.f */
/* JADX INFO: compiled from: FragmentWidgetSettingBinding.java */
/* JADX INFO: loaded from: classes19.dex */
public final class C44517f implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f98655a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TextView f98656b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f98657c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44517f m98494a(@NonNull View view) {
        int i11 = R$id.floating_track;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
        if (textView != null) {
            i11 = R$id.widget_tracking;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
            if (textView2 != null) {
                return new C44517f((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f98655a;
    }

    public C44517f(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f98655a = linearLayout;
        this.f98656b = textView;
        this.f98657c = textView2;
    }
}
