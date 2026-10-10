package p637ta;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.view.AssetEmptyView;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.i */
/* JADX INFO: compiled from: AssetCoinDetailAllocationViewBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44784i implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f100095a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f100096b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f100097c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f100098d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AssetEmptyView f100099e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayout f100100f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44784i m99085a(@NonNull View view) {
        int i11 = R$id.account_recyclerview;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            i11 = R$id.allocation_title;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.arrowToggle;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    i11 = R$id.empty_view;
                    AssetEmptyView assetEmptyView = (AssetEmptyView) ViewBindings.findChildViewById(view, i11);
                    if (assetEmptyView != null) {
                        LinearLayout linearLayout = (LinearLayout) view;
                        return new C44784i(linearLayout, recyclerView, baseTextView, imageView, assetEmptyView, linearLayout);
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
        return this.f100095a;
    }

    public C44784i(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView, @NonNull ImageView imageView, @NonNull AssetEmptyView assetEmptyView, @NonNull LinearLayout linearLayout2) {
        this.f100095a = linearLayout;
        this.f100096b = recyclerView;
        this.f100097c = baseTextView;
        this.f100098d = imageView;
        this.f100099e = assetEmptyView;
        this.f100100f = linearLayout2;
    }
}
