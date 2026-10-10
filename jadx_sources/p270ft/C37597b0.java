package p270ft;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.otc.view.IndexBar;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;

/* JADX INFO: renamed from: ft.b0 */
/* JADX INFO: compiled from: BotcFragmentPaytypeSelectBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37597b0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f83617a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ClearEditText f83618b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final IndexBar f83619c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f83620d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f83621e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f83622f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37597b0 m84778a(@NonNull View view) {
        int i11 = R$id.et_search;
        ClearEditText clearEditText = (ClearEditText) ViewBindings.findChildViewById(view, i11);
        if (clearEditText != null) {
            i11 = R$id.index_bar;
            IndexBar indexBar = (IndexBar) ViewBindings.findChildViewById(view, i11);
            if (indexBar != null) {
                i11 = R$id.recycler_view;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                if (recyclerView != null) {
                    i11 = R$id.tv_close;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tv_index;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            return new C37597b0((FrameLayout) view, clearEditText, indexBar, recyclerView, baseTextView, baseTextView2);
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
    public FrameLayout getRoot() {
        return this.f83617a;
    }

    public C37597b0(@NonNull FrameLayout frameLayout, @NonNull ClearEditText clearEditText, @NonNull IndexBar indexBar, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f83617a = frameLayout;
        this.f83618b = clearEditText;
        this.f83619c = indexBar;
        this.f83620d = recyclerView;
        this.f83621e = baseTextView;
        this.f83622f = baseTextView2;
    }
}
