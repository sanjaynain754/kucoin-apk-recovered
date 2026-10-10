package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import p385jy.C40820a;
import p385jy.C40822c;

/* JADX INFO: renamed from: ta.z */
/* JADX INFO: compiled from: AssetDialogEvmChainListBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44906z implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f101201a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C40820a f101202b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C40822c f101203c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f101204d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f101205e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f101206f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44906z m99336a(@NonNull View view) {
        int i11 = R$id.failedView;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
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
                            return new C44906z((LinearLayout) view, c40820aM89302a, c40822cM89306a, recyclerView, baseTextView, baseTextView2);
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
        return this.f101201a;
    }

    public C44906z(@NonNull LinearLayout linearLayout, @NonNull C40820a c40820a, @NonNull C40822c c40822c, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f101201a = linearLayout;
        this.f101202b = c40820a;
        this.f101203c = c40822c;
        this.f101204d = recyclerView;
        this.f101205e = baseTextView;
        this.f101206f = baseTextView2;
    }
}
