package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import p385jy.C40820a;
import p385jy.C40822c;

/* JADX INFO: renamed from: ta.a0 */
/* JADX INFO: compiled from: AssetDialogEvmRepeatChainBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44721a0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99535a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f99536b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f99537c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcSecondaryButton f99538d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final C40820a f99539e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final C40822c f99540f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RecyclerView f99541g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f99542h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f99543i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44721a0 m98952a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.btnKeep;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.btnLayout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout != null) {
                i11 = R$id.btnRemoveDuplicate;
                KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
                if (kcSecondaryButton != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.failedView))) != null) {
                    C40820a c40820aM89302a = C40820a.m89302a(viewFindChildViewById);
                    i11 = R$id.loadingView;
                    View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
                    if (viewFindChildViewById2 != null) {
                        C40822c c40822cM89306a = C40822c.m89306a(viewFindChildViewById2);
                        i11 = R$id.recyclerView;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                        if (recyclerView != null) {
                            i11 = R$id.tvSubtitle;
                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView != null) {
                                i11 = R$id.tvTitle;
                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView2 != null) {
                                    return new C44721a0((LinearLayout) view, kcPrimaryButton, linearLayout, kcSecondaryButton, c40820aM89302a, c40822cM89306a, recyclerView, baseTextView, baseTextView2);
                                }
                            }
                        }
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
        return this.f99535a;
    }

    public C44721a0(@NonNull LinearLayout linearLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull LinearLayout linearLayout2, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull C40820a c40820a, @NonNull C40822c c40822c, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f99535a = linearLayout;
        this.f99536b = kcPrimaryButton;
        this.f99537c = linearLayout2;
        this.f99538d = kcSecondaryButton;
        this.f99539e = c40820a;
        this.f99540f = c40822c;
        this.f99541g = recyclerView;
        this.f99542h = baseTextView;
        this.f99543i = baseTextView2;
    }
}
