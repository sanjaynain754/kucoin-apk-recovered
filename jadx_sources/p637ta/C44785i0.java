package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.ClearEditText;

/* JADX INFO: renamed from: ta.i0 */
/* JADX INFO: compiled from: AssetFilterSearchCoinDialogBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44785i0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f100101a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ClearEditText f100102b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f100103c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatImageView f100104d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayoutCompat f100105e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44785i0 m99087a(@NonNull View view) {
        int i11 = R$id.etSearchBar;
        ClearEditText clearEditText = (ClearEditText) ViewBindings.findChildViewById(view, i11);
        if (clearEditText != null) {
            i11 = R$id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
            if (recyclerView != null) {
                i11 = R$id.selectIcon;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView != null) {
                    i11 = R$id.tvTitle;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                    if (linearLayoutCompat != null) {
                        return new C44785i0((LinearLayout) view, clearEditText, recyclerView, appCompatImageView, linearLayoutCompat);
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
        return this.f100101a;
    }

    public C44785i0(@NonNull LinearLayout linearLayout, @NonNull ClearEditText clearEditText, @NonNull RecyclerView recyclerView, @NonNull AppCompatImageView appCompatImageView, @NonNull LinearLayoutCompat linearLayoutCompat) {
        this.f100101a = linearLayout;
        this.f100102b = clearEditText;
        this.f100103c = recyclerView;
        this.f100104d = appCompatImageView;
        this.f100105e = linearLayoutCompat;
    }
}
