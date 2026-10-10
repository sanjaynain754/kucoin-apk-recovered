package c60;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.transfer.lib.R$id;

/* JADX INFO: renamed from: c60.a */
/* JADX INFO: compiled from: BtransferFragmentBatchTransferBinding.java */
/* JADX INFO: loaded from: classes52.dex */
public final class C4847a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f4915a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f4916b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f4917c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayoutCompat f4918d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f4919e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayout f4920f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RecyclerView f4921g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TextView f4922h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final TextView f4923i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final KcPrimaryButton f4924j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final View f4925k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4847a m4971a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.ivCheck;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.ivSort;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView2 != null) {
                i11 = R$id.layoutConfirm;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                if (linearLayoutCompat != null) {
                    i11 = R$id.layoutSelectAll;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout != null) {
                        i11 = R$id.layoutSort;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                        if (linearLayout2 != null) {
                            i11 = R$id.recyclerview;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                            if (recyclerView != null) {
                                i11 = R$id.tvBatchTransferTip;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                                if (textView != null) {
                                    i11 = R$id.tvCoinTitle;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                                    if (textView2 != null) {
                                        i11 = R$id.tvConfirm;
                                        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                        if (kcPrimaryButton != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_divider))) != null) {
                                            return new C4847a((ConstraintLayout) view, imageView, imageView2, linearLayoutCompat, linearLayout, linearLayout2, recyclerView, textView, textView2, kcPrimaryButton, viewFindChildViewById);
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
    public ConstraintLayout getRoot() {
        return this.f4915a;
    }

    public C4847a(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull View view) {
        this.f4915a = constraintLayout;
        this.f4916b = imageView;
        this.f4917c = imageView2;
        this.f4918d = linearLayoutCompat;
        this.f4919e = linearLayout;
        this.f4920f = linearLayout2;
        this.f4921g = recyclerView;
        this.f4922h = textView;
        this.f4923i = textView2;
        this.f4924j = kcPrimaryButton;
        this.f4925k = view;
    }
}
