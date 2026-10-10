package q70;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.utaspotlib.R$id;

/* JADX INFO: renamed from: q70.i */
/* JADX INFO: compiled from: UtaOrderMarketLayoutBinding.java */
/* JADX INFO: loaded from: classes54.dex */
public final class C43662i implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f96415a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f96416b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f96417c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f96418d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f96419e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f96420f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f96421g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f96422h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f96423i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f96424j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f96425k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C43662i m96085a(@NonNull View view) {
        int i11 = R$id.llOrderValue;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
        if (linearLayout != null) {
            i11 = R$id.llQuantity;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout2 != null) {
                i11 = R$id.tvOrderValue;
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
                                i11 = R$id.tvPriceValue;
                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView5 != null) {
                                    i11 = R$id.tvQuantityTitle;
                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView6 != null) {
                                        i11 = R$id.tvQuantityUnit;
                                        BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView7 != null) {
                                            i11 = R$id.tvQuantityValue;
                                            BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView8 != null) {
                                                return new C43662i((LinearLayout) view, linearLayout, linearLayout2, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8);
                                            }
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
        return this.f96415a;
    }

    public C43662i(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8) {
        this.f96415a = linearLayout;
        this.f96416b = linearLayout2;
        this.f96417c = linearLayout3;
        this.f96418d = baseTextView;
        this.f96419e = baseTextView2;
        this.f96420f = baseTextView3;
        this.f96421g = baseTextView4;
        this.f96422h = baseTextView5;
        this.f96423i = baseTextView6;
        this.f96424j = baseTextView7;
        this.f96425k = baseTextView8;
    }
}
