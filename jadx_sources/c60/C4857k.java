package c60;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.KcSmallSwitchButton;
import com.kubi.transfer.lib.R$id;
import com.kubi.transfer.view.TransferNoticeView;

/* JADX INFO: renamed from: c60.k */
/* JADX INFO: compiled from: TransProDialogFragmentBinding.java */
/* JADX INFO: loaded from: classes52.dex */
public final class C4857k implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f5020a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f5021b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayoutCompat f5022c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TransferNoticeView f5023d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RecyclerView f5024e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final KcSmallSwitchButton f5025f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f5026g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final DashTextView f5027h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4857k m4988a(@NonNull View view) {
        int i11 = R$id.dialogTitle;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.llMultiAccountSwitch;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
            if (linearLayoutCompat != null) {
                i11 = R$id.noticeView;
                TransferNoticeView transferNoticeView = (TransferNoticeView) ViewBindings.findChildViewById(view, i11);
                if (transferNoticeView != null) {
                    i11 = R$id.recycler_view;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                    if (recyclerView != null) {
                        i11 = R$id.switchMultiAccount;
                        KcSmallSwitchButton kcSmallSwitchButton = (KcSmallSwitchButton) ViewBindings.findChildViewById(view, i11);
                        if (kcSmallSwitchButton != null) {
                            i11 = R$id.switchNotice;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                i11 = R$id.tvMultiAccountTip;
                                DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                if (dashTextView != null) {
                                    return new C4857k((LinearLayout) view, baseTextView, linearLayoutCompat, transferNoticeView, recyclerView, kcSmallSwitchButton, baseTextView2, dashTextView);
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
        return this.f5020a;
    }

    public C4857k(@NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull TransferNoticeView transferNoticeView, @NonNull RecyclerView recyclerView, @NonNull KcSmallSwitchButton kcSmallSwitchButton, @NonNull BaseTextView baseTextView2, @NonNull DashTextView dashTextView) {
        this.f5020a = linearLayout;
        this.f5021b = baseTextView;
        this.f5022c = linearLayoutCompat;
        this.f5023d = transferNoticeView;
        this.f5024e = recyclerView;
        this.f5025f = kcSmallSwitchButton;
        this.f5026g = baseTextView2;
        this.f5027h = dashTextView;
    }
}
