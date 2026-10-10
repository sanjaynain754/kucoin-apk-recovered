package p556qd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kubi.resources.widget.BaseTextView;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import v30.C45384h;

/* JADX INFO: renamed from: qd.g */
/* JADX INFO: compiled from: LeverViewHolder.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/core/biz/leverbar/VerticalModeViewHolder;", "Lcom/kubi/core/biz/leverbar/IViewHolder;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "binding", "Lcom/kubi/tradecorebiz/databinding/BkucoinLayoutLeverBarVerticalBinding;", "rootView", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "marginTypeView", "Landroid/widget/TextView;", "getMarginTypeView", "()Landroid/widget/TextView;", "marginLeverView", "getMarginLeverView", "repayModeView", "getRepayModeView", "borrowAndRepayView", "getBorrowAndRepayView", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43716g implements InterfaceC43711b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final C45384h f96632a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final View f96633b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final TextView f96634c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final TextView f96635d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final TextView f96636e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final TextView f96637f;

    public C43716g(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C45384h c45384hM100302c = C45384h.m100302c(LayoutInflater.from(context), null, false);
        Intrinsics.checkNotNullExpressionValue(c45384hM100302c, "inflate(...)");
        this.f96632a = c45384hM100302c;
        LinearLayout root = c45384hM100302c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        this.f96633b = root;
        BaseTextView tvMarginType = c45384hM100302c.f102100d;
        Intrinsics.checkNotNullExpressionValue(tvMarginType, "tvMarginType");
        this.f96634c = tvMarginType;
        BaseTextView tvMarginLever = c45384hM100302c.f102099c;
        Intrinsics.checkNotNullExpressionValue(tvMarginLever, "tvMarginLever");
        this.f96635d = tvMarginLever;
        BaseTextView tvRepayMode = c45384hM100302c.f102101e;
        Intrinsics.checkNotNullExpressionValue(tvRepayMode, "tvRepayMode");
        this.f96636e = tvRepayMode;
        BaseTextView tvBorrowAndRepay = c45384hM100302c.f102098b;
        Intrinsics.checkNotNullExpressionValue(tvBorrowAndRepay, "tvBorrowAndRepay");
        this.f96637f = tvBorrowAndRepay;
    }

    @Override // p556qd.InterfaceC43711b
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public View getF96633b() {
        return this.f96633b;
    }

    @Override // p556qd.InterfaceC43711b
    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public TextView getF96635d() {
        return this.f96635d;
    }

    @Override // p556qd.InterfaceC43711b
    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public TextView getF96634c() {
        return this.f96634c;
    }

    @Override // p556qd.InterfaceC43711b
    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public TextView getF96637f() {
        return this.f96637f;
    }

    @Override // p556qd.InterfaceC43711b
    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public TextView getF96636e() {
        return this.f96636e;
    }
}
