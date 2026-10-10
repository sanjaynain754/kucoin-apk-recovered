package p637ta;

import android.view.View;
import android.widget.HorizontalScrollView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.b */
/* JADX INFO: compiled from: AssetAccountBillFilterBarBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44728b implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final HorizontalScrollView f99589a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f99590b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f99591c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f99592d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f99593e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f99594f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f99595g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f99596h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44728b m98966a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.divider1;
        View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.divider2))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.divider3))) != null) {
            i11 = R$id.selectCoin;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.selectSides;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.selectTime;
                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView3 != null) {
                        i11 = R$id.selectType;
                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView4 != null) {
                            return new C44728b((HorizontalScrollView) view, viewFindChildViewById3, viewFindChildViewById, viewFindChildViewById2, baseTextView, baseTextView2, baseTextView3, baseTextView4);
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
    public HorizontalScrollView getRoot() {
        return this.f99589a;
    }

    public C44728b(@NonNull HorizontalScrollView horizontalScrollView, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f99589a = horizontalScrollView;
        this.f99590b = view;
        this.f99591c = view2;
        this.f99592d = view3;
        this.f99593e = baseTextView;
        this.f99594f = baseTextView2;
        this.f99595g = baseTextView3;
        this.f99596h = baseTextView4;
    }
}
