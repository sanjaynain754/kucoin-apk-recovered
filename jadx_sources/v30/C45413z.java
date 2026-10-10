package v30;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.tradecorebiz.R$id;

/* JADX INFO: renamed from: v30.z */
/* JADX INFO: compiled from: HistoryOrdersFilterToolbarLayoutBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45413z implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final RelativeLayout f102420a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f102421b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RelativeLayout f102422c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f102423d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f102424e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f102425f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f102426g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final View f102427h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final View f102428i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final View f102429j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45413z m100363a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        int i11 = R$id.ivFilter;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i11 = R$id.tvPair;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.tvSide;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.tvTradeAccount;
                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView3 != null) {
                        i11 = R$id.tvType;
                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView4 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view0))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.view1))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i11 = R$id.view2))) != null) {
                            return new C45413z(relativeLayout, imageView, relativeLayout, baseTextView, baseTextView2, baseTextView3, baseTextView4, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3);
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
    public RelativeLayout getRoot() {
        return this.f102420a;
    }

    public C45413z(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull View view, @NonNull View view2, @NonNull View view3) {
        this.f102420a = relativeLayout;
        this.f102421b = imageView;
        this.f102422c = relativeLayout2;
        this.f102423d = baseTextView;
        this.f102424e = baseTextView2;
        this.f102425f = baseTextView3;
        this.f102426g = baseTextView4;
        this.f102427h = view;
        this.f102428i = view2;
        this.f102429j = view3;
    }
}
