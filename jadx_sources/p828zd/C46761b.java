package p828zd;

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
import v30.C45383g0;

/* JADX INFO: renamed from: zd.b */
/* JADX INFO: compiled from: SpotSymbolBarViewHolder.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011R\u0014\u0010\u001e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0011R\u0014\u0010 \u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0011¨\u0006\""}, m90084d2 = {"Lcom/kubi/core/biz/symbolbar/spot/SpotSymbolBarViewHolder;", "Lcom/kubi/core/biz/symbolbar/ISymbolBarViewHolder;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "binding", "Lcom/kubi/tradecorebiz/databinding/LayoutSpotSymbolBarBinding;", "rootView", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "ivSymbolView", "Landroid/widget/ImageView;", "getIvSymbolView", "()Landroid/widget/ImageView;", "symbolTextView", "Landroid/widget/TextView;", "getSymbolTextView", "()Landroid/widget/TextView;", "stLabel", "getStLabel", "changeRateTextView", "getChangeRateTextView", "leverTextView", "getLeverTextView", "kLinePageEnterView", "getKLinePageEnterView", "kLineStateBtn", "getKLineStateBtn", "moreBtn", "getMoreBtn", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46761b implements InterfaceC46140b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Context f104625a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final C45383g0 f104626b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final View f104627c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final ImageView f104628d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final TextView f104629e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final TextView f104630f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final TextView f104631g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final TextView f104632h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final ImageView f104633i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final ImageView f104634j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final ImageView f104635k;

    public C46761b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f104625a = context;
        C45383g0 c45383g0M100299c = C45383g0.m100299c(LayoutInflater.from(getF104625a()), null, false);
        Intrinsics.checkNotNullExpressionValue(c45383g0M100299c, "inflate(...)");
        this.f104626b = c45383g0M100299c;
        LinearLayout root = c45383g0M100299c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        this.f104627c = root;
        AppCompatImageView ivSymbolMenu = c45383g0M100299c.f102092e;
        Intrinsics.checkNotNullExpressionValue(ivSymbolMenu, "ivSymbolMenu");
        this.f104628d = ivSymbolMenu;
        BaseTextView tvSymbolMenu = c45383g0M100299c.f102096i;
        Intrinsics.checkNotNullExpressionValue(tvSymbolMenu, "tvSymbolMenu");
        this.f104629e = tvSymbolMenu;
        BaseTextView tvStLabel = c45383g0M100299c.f102095h;
        Intrinsics.checkNotNullExpressionValue(tvStLabel, "tvStLabel");
        this.f104630f = tvStLabel;
        BaseTextView tvChangeRate = c45383g0M100299c.f102093f;
        Intrinsics.checkNotNullExpressionValue(tvChangeRate, "tvChangeRate");
        this.f104631g = tvChangeRate;
        BaseTextView tvLeverLabel = c45383g0M100299c.f102094g;
        Intrinsics.checkNotNullExpressionValue(tvLeverLabel, "tvLeverLabel");
        this.f104632h = tvLeverLabel;
        AppCompatImageView ivKlinePageEnter = c45383g0M100299c.f102090c;
        Intrinsics.checkNotNullExpressionValue(ivKlinePageEnter, "ivKlinePageEnter");
        this.f104633i = ivKlinePageEnter;
        ImageView ivKLineStateBtn = c45383g0M100299c.f102089b;
        Intrinsics.checkNotNullExpressionValue(ivKLineStateBtn, "ivKLineStateBtn");
        this.f104634j = ivKLineStateBtn;
        AppCompatImageView ivMore = c45383g0M100299c.f102091d;
        Intrinsics.checkNotNullExpressionValue(ivMore, "ivMore");
        this.f104635k = ivMore;
    }

    @Override // p757xd.InterfaceC46140b
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public View getF104627c() {
        return this.f104627c;
    }

    @Override // p757xd.InterfaceC46140b
    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public TextView getF104631g() {
        return this.f104631g;
    }

    @Override // p757xd.InterfaceC46140b
    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public ImageView getF104635k() {
        return this.f104635k;
    }

    @Override // p757xd.InterfaceC46140b
    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public TextView getF104630f() {
        return this.f104630f;
    }

    @Override // p757xd.InterfaceC46140b
    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public ImageView getF104633i() {
        return this.f104633i;
    }

    @Override // p757xd.InterfaceC46140b
    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public TextView getF104632h() {
        return this.f104632h;
    }

    @Override // p757xd.InterfaceC46140b
    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public ImageView getF104628d() {
        return this.f104628d;
    }

    @Override // p757xd.InterfaceC46140b
    @NotNull
    /* JADX INFO: renamed from: getContext, reason: from getter */
    public Context getF104625a() {
        return this.f104625a;
    }

    @Override // p757xd.InterfaceC46140b
    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public ImageView getF104634j() {
        return this.f104634j;
    }

    @Override // p757xd.InterfaceC46140b
    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public TextView getF104629e() {
        return this.f104629e;
    }
}
