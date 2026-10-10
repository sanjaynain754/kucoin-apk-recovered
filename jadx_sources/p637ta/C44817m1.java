package p637ta;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.m1 */
/* JADX INFO: compiled from: AssetItemOngoingLoadMoreBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44817m1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f100445a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f100446b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f100447c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44817m1 m99155a(@NonNull View view) {
        int i11 = R$id.ivArrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.tvTitle;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                return new C44817m1((LinearLayoutCompat) view, imageView, baseTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C44817m1 m99156c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.asset_item_ongoing_load_more, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m99155a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f100445a;
    }

    public C44817m1(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView) {
        this.f100445a = linearLayoutCompat;
        this.f100446b = imageView;
        this.f100447c = baseTextView;
    }
}
