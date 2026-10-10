package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.c5 */
/* JADX INFO: compiled from: KucoinFragmentWithdrawSelectChainBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44742c5 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99689a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f99690b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Space f99691c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f99692d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f99693e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f99694f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f99695g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f99696h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44742c5 m98996a(@NonNull View view) {
        int i11 = R$id.recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            i11 = R$id.space_2;
            Space space = (Space) ViewBindings.findChildViewById(view, i11);
            if (space != null) {
                i11 = R$id.tip_2;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.tip_3;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        i11 = R$id.tip_4;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null) {
                            i11 = R$id.tv_sub_title;
                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView4 != null) {
                                i11 = R$id.tv_title;
                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView5 != null) {
                                    return new C44742c5((LinearLayout) view, recyclerView, space, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5);
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
        return this.f99689a;
    }

    public C44742c5(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull Space space, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5) {
        this.f99689a = linearLayout;
        this.f99690b = recyclerView;
        this.f99691c = space;
        this.f99692d = baseTextView;
        this.f99693e = baseTextView2;
        this.f99694f = baseTextView3;
        this.f99695g = baseTextView4;
        this.f99696h = baseTextView5;
    }
}
