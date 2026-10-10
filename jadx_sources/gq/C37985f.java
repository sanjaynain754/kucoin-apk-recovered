package gq;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.mine.R$id;
import com.kubi.widget.web.ui.KWebContainer;

/* JADX INFO: renamed from: gq.f */
/* JADX INFO: compiled from: BusercenterActivityMoveH5Binding.java */
/* JADX INFO: loaded from: classes29.dex */
public final class C37985f implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f85456a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f85457b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f85458c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KWebContainer f85459d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37985f m85845a(@NonNull View view) {
        int i11 = R$id.fl_ok;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout != null) {
            i11 = R$id.tv_have_read;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
            if (textView != null) {
                i11 = R$id.webview;
                KWebContainer kWebContainer = (KWebContainer) ViewBindings.findChildViewById(view, i11);
                if (kWebContainer != null) {
                    return new C37985f((FrameLayout) view, frameLayout, textView, kWebContainer);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f85456a;
    }

    public C37985f(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull TextView textView, @NonNull KWebContainer kWebContainer) {
        this.f85456a = frameLayout;
        this.f85457b = frameLayout2;
        this.f85458c = textView;
        this.f85459d = kWebContainer;
    }
}
