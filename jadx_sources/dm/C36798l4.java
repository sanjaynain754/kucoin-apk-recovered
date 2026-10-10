package dm;

import android.view.View;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;

/* JADX INFO: renamed from: dm.l4 */
/* JADX INFO: compiled from: BkumexSelectContractOfHistoryPopBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36798l4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f80495a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ClearEditText f80496b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f80497c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f80498d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RecyclerView f80499e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final RecyclerView f80500f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RecyclerView f80501g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final Space f80502h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final View f80503i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36798l4 m82457a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.edit;
        ClearEditText clearEditText = (ClearEditText) ViewBindings.findChildViewById(view, i11);
        if (clearEditText != null) {
            i11 = R$id.empty;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.line))) != null) {
                i11 = R$id.searchRecyclerView;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                if (recyclerView != null) {
                    i11 = R$id.section;
                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                    if (recyclerView2 != null) {
                        i11 = R$id.sectionItem;
                        RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                        if (recyclerView3 != null) {
                            i11 = R$id.space;
                            Space space = (Space) ViewBindings.findChildViewById(view, i11);
                            if (space != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.view_shadow))) != null) {
                                return new C36798l4((LinearLayoutCompat) view, clearEditText, baseTextView, viewFindChildViewById, recyclerView, recyclerView2, recyclerView3, space, viewFindChildViewById2);
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
    public LinearLayoutCompat getRoot() {
        return this.f80495a;
    }

    public C36798l4(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ClearEditText clearEditText, @NonNull BaseTextView baseTextView, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2, @NonNull RecyclerView recyclerView3, @NonNull Space space, @NonNull View view2) {
        this.f80495a = linearLayoutCompat;
        this.f80496b = clearEditText;
        this.f80497c = baseTextView;
        this.f80498d = view;
        this.f80499e = recyclerView;
        this.f80500f = recyclerView2;
        this.f80501g = recyclerView3;
        this.f80502h = space;
        this.f80503i = view2;
    }
}
