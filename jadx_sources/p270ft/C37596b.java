package p270ft;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;

/* JADX INFO: renamed from: ft.b */
/* JADX INFO: compiled from: BotcActivitySearchFiatBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37596b implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f83612a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ClearEditText f83613b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f83614c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f83615d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f83616e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37596b m84776a(@NonNull View view) {
        int i11 = R$id.et_search_fiat;
        ClearEditText clearEditText = (ClearEditText) ViewBindings.findChildViewById(view, i11);
        if (clearEditText != null) {
            i11 = R$id.tv_close_action;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.view_fiat_recycler;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                if (recyclerView != null) {
                    i11 = R$id.view_search;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout != null) {
                        return new C37596b((LinearLayout) view, clearEditText, baseTextView, recyclerView, linearLayout);
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
        return this.f83612a;
    }

    public C37596b(@NonNull LinearLayout linearLayout, @NonNull ClearEditText clearEditText, @NonNull BaseTextView baseTextView, @NonNull RecyclerView recyclerView, @NonNull LinearLayout linearLayout2) {
        this.f83612a = linearLayout;
        this.f83613b = clearEditText;
        this.f83614c = baseTextView;
        this.f83615d = recyclerView;
        this.f83616e = linearLayout2;
    }
}
