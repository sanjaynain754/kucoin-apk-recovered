package dm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;

/* JADX INFO: renamed from: dm.w0 */
/* JADX INFO: compiled from: BkumexDialogPositionSortBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36860w0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81272a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f81273b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f81274c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcSecondaryButton f81275d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f81276e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36860w0 m82585a(@NonNull View view) {
        int i11 = R$id.recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            i11 = R$id.tv_confirm;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.tv_reset;
                KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
                if (kcSecondaryButton != null) {
                    i11 = R$id.tv_title;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        return new C36860w0((LinearLayout) view, recyclerView, kcPrimaryButton, kcSecondaryButton, baseTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f81272a;
    }

    public C36860w0(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull BaseTextView baseTextView) {
        this.f81272a = linearLayout;
        this.f81273b = recyclerView;
        this.f81274c = kcPrimaryButton;
        this.f81275d = kcSecondaryButton;
        this.f81276e = baseTextView;
    }
}
