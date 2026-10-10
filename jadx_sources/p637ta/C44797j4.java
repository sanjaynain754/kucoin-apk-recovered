package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.round.widget.RoundLinearLayout;

/* JADX INFO: renamed from: ta.j4 */
/* JADX INFO: compiled from: KucoinFragmentDepositLayoutAddressBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44797j4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final RoundLinearLayout f100225a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RoundLinearLayout f100226b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C44757e4 f100227c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final C44789i4 f100228d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final C44827n4 f100229e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44797j4 m99113a(@NonNull View view) {
        RoundLinearLayout roundLinearLayout = (RoundLinearLayout) view;
        int i11 = R$id.subIncludeAccount;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            C44757e4 c44757e4M99028a = C44757e4.m99028a(viewFindChildViewById);
            i11 = R$id.subIncludeAddress;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
            if (viewFindChildViewById2 != null) {
                C44789i4 c44789i4M99096a = C44789i4.m99096a(viewFindChildViewById2);
                i11 = R$id.subIncludeMemo;
                View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i11);
                if (viewFindChildViewById3 != null) {
                    return new C44797j4(roundLinearLayout, roundLinearLayout, c44757e4M99028a, c44789i4M99096a, C44827n4.m99180a(viewFindChildViewById3));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RoundLinearLayout getRoot() {
        return this.f100225a;
    }

    public C44797j4(@NonNull RoundLinearLayout roundLinearLayout, @NonNull RoundLinearLayout roundLinearLayout2, @NonNull C44757e4 c44757e4, @NonNull C44789i4 c44789i4, @NonNull C44827n4 c44827n4) {
        this.f100225a = roundLinearLayout;
        this.f100226b = roundLinearLayout2;
        this.f100227c = c44757e4;
        this.f100228d = c44789i4;
        this.f100229e = c44827n4;
    }
}
