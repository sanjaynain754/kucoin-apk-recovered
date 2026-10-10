package c60;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.round.widget.RoundConstraintLayout;
import com.kubi.transfer.lib.R$id;

/* JADX INFO: renamed from: c60.f */
/* JADX INFO: compiled from: BtransferViewTransferAccountBinding.java */
/* JADX INFO: loaded from: classes52.dex */
public final class C4852f implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final RoundConstraintLayout f4966a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f4967b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f4968c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f4969d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f4970e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f4971f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RoundConstraintLayout f4972g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LinearLayout f4973h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayout f4974i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final TextView f4975j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final TextView f4976k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final TextView f4977l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final TextView f4978m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final TextView f4979n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final TextView f4980o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final View f4981p;

    public C4852f(@NonNull RoundConstraintLayout roundConstraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull RoundConstraintLayout roundConstraintLayout2, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull View view) {
        this.f4966a = roundConstraintLayout;
        this.f4967b = imageView;
        this.f4968c = imageView2;
        this.f4969d = imageView3;
        this.f4970e = imageView4;
        this.f4971f = imageView5;
        this.f4972g = roundConstraintLayout2;
        this.f4973h = linearLayout;
        this.f4974i = linearLayout2;
        this.f4975j = textView;
        this.f4976k = textView2;
        this.f4977l = textView3;
        this.f4978m = textView4;
        this.f4979n = textView5;
        this.f4980o = textView6;
        this.f4981p = view;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4852f m4981a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.ivExchange;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.ivFromArrow;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView2 != null) {
                i11 = R$id.ivFromIcon;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView3 != null) {
                    i11 = R$id.ivToArrow;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView4 != null) {
                        i11 = R$id.ivToIcon;
                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView5 != null) {
                            RoundConstraintLayout roundConstraintLayout = (RoundConstraintLayout) view;
                            i11 = R$id.llFrom;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                            if (linearLayout != null) {
                                i11 = R$id.llTo;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                if (linearLayout2 != null) {
                                    i11 = R$id.tvFrom;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                                    if (textView != null) {
                                        i11 = R$id.tvFromPairName;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                                        if (textView2 != null) {
                                            i11 = R$id.tv_from_title;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                                            if (textView3 != null) {
                                                i11 = R$id.tvTo;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                if (textView4 != null) {
                                                    i11 = R$id.tvToPairName;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                    if (textView5 != null) {
                                                        i11 = R$id.tv_to_title;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                        if (textView6 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_divider))) != null) {
                                                            return new C4852f(roundConstraintLayout, imageView, imageView2, imageView3, imageView4, imageView5, roundConstraintLayout, linearLayout, linearLayout2, textView, textView2, textView3, textView4, textView5, textView6, viewFindChildViewById);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RoundConstraintLayout getRoot() {
        return this.f4966a;
    }
}
