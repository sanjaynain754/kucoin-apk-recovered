package dm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;

/* JADX INFO: renamed from: dm.p2 */
/* JADX INFO: compiled from: BkumexFragmentKumexSubmitBottomSheetBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36820p2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final NestedScrollView f80800a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f80801b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f80802c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FrameLayout f80803d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f80804e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final View f80805f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36820p2 m82501a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.footer_panel;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout != null) {
            i11 = R$id.header_panel;
            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
            if (frameLayout2 != null) {
                i11 = R$id.input_panel;
                FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                if (frameLayout3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_drag_label))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.view_keyboard_placeholder))) != null) {
                    return new C36820p2((NestedScrollView) view, frameLayout, frameLayout2, frameLayout3, viewFindChildViewById, viewFindChildViewById2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C36820p2 m82502c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.bkumex_fragment_kumex_submit_bottom_sheet, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m82501a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f80800a;
    }

    public C36820p2(@NonNull NestedScrollView nestedScrollView, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull View view, @NonNull View view2) {
        this.f80800a = nestedScrollView;
        this.f80801b = frameLayout;
        this.f80802c = frameLayout2;
        this.f80803d = frameLayout3;
        this.f80804e = view;
        this.f80805f = view2;
    }
}
