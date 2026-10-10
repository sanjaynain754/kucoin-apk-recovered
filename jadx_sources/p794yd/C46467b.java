package p794yd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.kubi.resources.widget.BaseTextView;
import org.jetbrains.annotations.NotNull;
import p757xd.InterfaceC46140b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import v30.C45381f0;

/* JADX INFO: renamed from: yd.b */
/* JADX INFO: compiled from: MarginSymbolBarViewHolder.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011R\u0014\u0010\u001e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0011R\u0014\u0010 \u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0011¨\u0006\""}, m90084d2 = {"Lcom/kubi/core/biz/symbolbar/margin/MarginSymbolBarViewHolder;", "Lcom/kubi/core/biz/symbolbar/ISymbolBarViewHolder;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "binding", "Lcom/kubi/tradecorebiz/databinding/LayoutMarginSymbolBarBinding;", "getContext", "()Landroid/content/Context;", "rootView", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "ivSymbolView", "Landroid/widget/ImageView;", "getIvSymbolView", "()Landroid/widget/ImageView;", "symbolTextView", "Landroid/widget/TextView;", "getSymbolTextView", "()Landroid/widget/TextView;", "stLabel", "getStLabel", "changeRateTextView", "getChangeRateTextView", "leverTextView", "getLeverTextView", "kLinePageEnterView", "getKLinePageEnterView", "kLineStateBtn", "getKLineStateBtn", "moreBtn", "getMoreBtn", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46467b implements InterfaceC46140b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final C45381f0 f104219a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Context f104220b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final View f104221c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final ImageView f104222d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final TextView f104223e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final TextView f104224f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final TextView f104225g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final TextView f104226h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final ImageView f104227i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final ImageView f104228j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final ImageView f104229k;

    public C46467b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C45381f0 c45381f0M100293c = C45381f0.m100293c(LayoutInflater.from(context), null, false);
        Intrinsics.checkNotNullExpressionValue(c45381f0M100293c, "inflate(...)");
        this.f104219a = c45381f0M100293c;
        Context context2 = c45381f0M100293c.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f104220b = context2;
        LinearLayout root = c45381f0M100293c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        this.f104221c = root;
        AppCompatImageView ivSymbolMenu = c45381f0M100293c.f102077e;
        Intrinsics.checkNotNullExpressionValue(ivSymbolMenu, "ivSymbolMenu");
        this.f104222d = ivSymbolMenu;
        BaseTextView tvSymbolMenu = c45381f0M100293c.f102081i;
        Intrinsics.checkNotNullExpressionValue(tvSymbolMenu, "tvSymbolMenu");
        this.f104223e = tvSymbolMenu;
        BaseTextView tvStLabel = c45381f0M100293c.f102080h;
        Intrinsics.checkNotNullExpressionValue(tvStLabel, "tvStLabel");
        this.f104224f = tvStLabel;
        BaseTextView tvChangeRate = c45381f0M100293c.f102078f;
        Intrinsics.checkNotNullExpressionValue(tvChangeRate, "tvChangeRate");
        this.f104225g = tvChangeRate;
        BaseTextView tvLeverLabel = c45381f0M100293c.f102079g;
        Intrinsics.checkNotNullExpressionValue(tvLeverLabel, "tvLeverLabel");
        this.f104226h = tvLeverLabel;
        AppCompatImageView ivKlinePageEnter = c45381f0M100293c.f102075c;
        Intrinsics.checkNotNullExpressionValue(ivKlinePageEnter, "ivKlinePageEnter");
        this.f104227i = ivKlinePageEnter;
        AppCompatImageView ivKLineStateBtn = c45381f0M100293c.f102074b;
        Intrinsics.checkNotNullExpressionValue(ivKLineStateBtn, "ivKLineStateBtn");
        this.f104228j = ivKLineStateBtn;
        AppCompatImageView ivMore = c45381f0M100293c.f102076d;
        Intrinsics.checkNotNullExpressionValue(ivMore, "ivMore");
        this.f104229k = ivMore;
    }

    @Override // p757xd.InterfaceC46140b
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public View getF104221c() {
        return this.f104221c;
    }

    @Override // p757xd.InterfaceC46140b
    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public TextView getF104225g() {
        return this.f104225g;
    }

    @Override // p757xd.InterfaceC46140b
    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public ImageView getF104229k() {
        return this.f104229k;
    }

    @Override // p757xd.InterfaceC46140b
    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public TextView getF104224f() {
        return this.f104224f;
    }

    @Override // p757xd.InterfaceC46140b
    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public ImageView getF104227i() {
        return this.f104227i;
    }

    @Override // p757xd.InterfaceC46140b
    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public TextView getF104226h() {
        return this.f104226h;
    }

    @Override // p757xd.InterfaceC46140b
    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public ImageView getF104222d() {
        return this.f104222d;
    }

    @Override // p757xd.InterfaceC46140b
    @NotNull
    /* JADX INFO: renamed from: getContext, reason: from getter */
    public Context getF104220b() {
        return this.f104220b;
    }

    @Override // p757xd.InterfaceC46140b
    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public ImageView getF104228j() {
        return this.f104228j;
    }

    @Override // p757xd.InterfaceC46140b
    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public TextView getF104223e() {
        return this.f104223e;
    }
}
