package dm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.resources.widget.button.KcSecondaryButton;

/* JADX INFO: renamed from: dm.z0 */
/* JADX INFO: compiled from: BkumexDialogSearchContractBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36877z0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81398a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ClearEditText f81399b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f81400c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f81401d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final KcSecondaryButton f81402e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36877z0 m82622a(@NonNull View view) {
        int i11 = R$id.edit;
        ClearEditText clearEditText = (ClearEditText) ViewBindings.findChildViewById(view, i11);
        if (clearEditText != null) {
            i11 = R$id.empty;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.recyclerView;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                if (recyclerView != null) {
                    i11 = R$id.tv_confirm;
                    KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
                    if (kcSecondaryButton != null) {
                        return new C36877z0((LinearLayout) view, clearEditText, baseTextView, recyclerView, kcSecondaryButton);
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
        return this.f81398a;
    }

    public C36877z0(@NonNull LinearLayout linearLayout, @NonNull ClearEditText clearEditText, @NonNull BaseTextView baseTextView, @NonNull RecyclerView recyclerView, @NonNull KcSecondaryButton kcSecondaryButton) {
        this.f81398a = linearLayout;
        this.f81399b = clearEditText;
        this.f81400c = baseTextView;
        this.f81401d = recyclerView;
        this.f81402e = kcSecondaryButton;
    }
}
