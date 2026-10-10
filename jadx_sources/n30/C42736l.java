package n30;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.tradebase.R$id;
import com.kubi.tradebase.R$layout;

/* JADX INFO: renamed from: n30.l */
/* JADX INFO: compiled from: KcBottomDialogHostFragmentLayoutBinding.java */
/* JADX INFO: loaded from: classes48.dex */
public final class C42736l implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f94646a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f94647b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42736l m93644a(@NonNull View view) {
        int i11 = R$id.hostContainer;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout != null) {
            return new C42736l((LinearLayout) view, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C42736l m93645c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.kc_bottom_dialog_host_fragment_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m93644a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f94646a;
    }

    public C42736l(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout) {
        this.f94646a = linearLayout;
        this.f94647b = frameLayout;
    }
}
