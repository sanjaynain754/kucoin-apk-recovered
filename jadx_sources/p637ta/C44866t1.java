package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import p385jy.C40820a;

/* JADX INFO: renamed from: ta.t1 */
/* JADX INFO: compiled from: AssetMultiPaymentDialogBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44866t1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f100860a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayoutCompat f100861b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C40820a f100862c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final C44832o2 f100863d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RecyclerView f100864e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f100865f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44866t1 m99256a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.content;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
        if (linearLayoutCompat != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.failedView))) != null) {
            C40820a c40820aM89302a = C40820a.m89302a(viewFindChildViewById);
            i11 = R$id.loadingView;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
            if (viewFindChildViewById2 != null) {
                C44832o2 c44832o2M99190a = C44832o2.m99190a(viewFindChildViewById2);
                i11 = R$id.recyclerView;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                if (recyclerView != null) {
                    i11 = R$id.tvTitle;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        return new C44866t1((LinearLayout) view, linearLayoutCompat, c40820aM89302a, c44832o2M99190a, recyclerView, baseTextView);
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
        return this.f100860a;
    }

    public C44866t1(@NonNull LinearLayout linearLayout, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull C40820a c40820a, @NonNull C44832o2 c44832o2, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView) {
        this.f100860a = linearLayout;
        this.f100861b = linearLayoutCompat;
        this.f100862c = c40820a;
        this.f100863d = c44832o2;
        this.f100864e = recyclerView;
        this.f100865f = baseTextView;
    }
}
