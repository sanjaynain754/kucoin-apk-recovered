package q70;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.utaspotlib.R$id;

/* JADX INFO: renamed from: q70.f */
/* JADX INFO: compiled from: UtaOrderAdvancedLimitLayoutBinding.java */
/* JADX INFO: loaded from: classes54.dex */
public final class C43659f implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f96373a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f96374b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f96375c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f96376d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f96377e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f96378f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f96379g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f96380h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f96381i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f96382j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C43659f m96079a(@NonNull View view) {
        int i11 = R$id.tvOrderValue;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.tvOrderValueTitle;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.tvOrderValueUnit;
                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView3 != null) {
                    i11 = R$id.tvPriceTitle;
                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView4 != null) {
                        i11 = R$id.tvPriceUnit;
                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView5 != null) {
                            i11 = R$id.tvPriceValue;
                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView6 != null) {
                                i11 = R$id.tvQuantityTitle;
                                BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView7 != null) {
                                    i11 = R$id.tvQuantityUnit;
                                    BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView8 != null) {
                                        i11 = R$id.tvQuantityValue;
                                        BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView9 != null) {
                                            return new C43659f((LinearLayout) view, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9);
                                        }
                                    }
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
        return this.f96373a;
    }

    public C43659f(@NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9) {
        this.f96373a = linearLayout;
        this.f96374b = baseTextView;
        this.f96375c = baseTextView2;
        this.f96376d = baseTextView3;
        this.f96377e = baseTextView4;
        this.f96378f = baseTextView5;
        this.f96379g = baseTextView6;
        this.f96380h = baseTextView7;
        this.f96381i = baseTextView8;
        this.f96382j = baseTextView9;
    }
}
