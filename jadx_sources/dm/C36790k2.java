package dm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;

/* JADX INFO: renamed from: dm.k2 */
/* JADX INFO: compiled from: BkumexFragmentFuturesSubmitBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36790k2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f80393a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f80394b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f80395c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FrameLayout f80396d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36790k2 m82439a(@NonNull View view) {
        int i11 = R$id.footer_panel;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout != null) {
            i11 = R$id.header_panel;
            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
            if (frameLayout2 != null) {
                i11 = R$id.input_panel;
                FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                if (frameLayout3 != null) {
                    return new C36790k2((LinearLayout) view, frameLayout, frameLayout2, frameLayout3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C36790k2 m82440c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.bkumex_fragment_futures_submit, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m82439a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f80393a;
    }

    public C36790k2(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3) {
        this.f80393a = linearLayout;
        this.f80394b = frameLayout;
        this.f80395c = frameLayout2;
        this.f80396d = frameLayout3;
    }
}
