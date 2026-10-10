package p701vs;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.operation.lib.R$id;
import com.kubi.resources.widget.MarqueeTextView;

/* JADX INFO: renamed from: vs.b */
/* JADX INFO: compiled from: OperationFragmentCoinTopicBinding.java */
/* JADX INFO: loaded from: classes32.dex */
public final class C45625b implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f102765a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Guideline f102766b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f102767c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f102768d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final MarqueeTextView f102769e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayoutCompat f102770f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final TextView f102771g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final View f102772h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45625b m100735a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.guideline;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i11);
        if (guideline != null) {
            i11 = R$id.ivClose;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.ivIcon;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView2 != null) {
                    i11 = R$id.marqueeView;
                    MarqueeTextView marqueeTextView = (MarqueeTextView) ViewBindings.findChildViewById(view, i11);
                    if (marqueeTextView != null) {
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
                        i11 = R$id.tvTitle;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                        if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.viewPoint))) != null) {
                            return new C45625b(linearLayoutCompat, guideline, imageView, imageView2, marqueeTextView, linearLayoutCompat, textView, viewFindChildViewById);
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
        return this.f102765a;
    }

    public C45625b(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull Guideline guideline, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull MarqueeTextView marqueeTextView, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull TextView textView, @NonNull View view) {
        this.f102765a = linearLayoutCompat;
        this.f102766b = guideline;
        this.f102767c = imageView;
        this.f102768d = imageView2;
        this.f102769e = marqueeTextView;
        this.f102770f = linearLayoutCompat2;
        this.f102771g = textView;
        this.f102772h = view;
    }
}
