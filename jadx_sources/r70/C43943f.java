package r70;

import android.os.Bundle;
import com.kubi.core.base.TradeAccountType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import u70.C45131c;

/* JADX INFO: renamed from: r70.f */
/* JADX INFO: compiled from: UtaMarginCoreDataRepoProvider.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/utaspotlib/repo/UtaMarginCoreDataRepoProvider;", "Lcom/kubi/utaspotlib/repo/UtaCoreDataRepoProvider;", "arguments", "Landroid/os/Bundle;", "<init>", "(Landroid/os/Bundle;)V", "tradeAccountType", "Lcom/kubi/core/base/TradeAccountType;", "getTradeAccountType", "()Lcom/kubi/core/base/TradeAccountType;", "orderRepo", "Lcom/kubi/utaspotlib/repo/order/UtaTradeOrderDataRepo;", "getOrderRepo", "()Lcom/kubi/utaspotlib/repo/order/UtaTradeOrderDataRepo;", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43943f extends C43942e {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final TradeAccountType f97159i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final C45131c f97160j;

    @Override // r70.C43942e, p827zc.AbstractC46753c
    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public TradeAccountType getF97159i() {
        return this.f97159i;
    }

    @Override // r70.C43942e, p827zc.AbstractC46753c
    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter and merged with bridge method [inline-methods] */
    public C45131c mo96893b() {
        return this.f97160j;
    }

    public C43943f(@Nullable Bundle bundle) {
        super(bundle);
        TradeAccountType.Margin margin = TradeAccountType.Margin.INSTANCE;
        this.f97159i = margin;
        this.f97160j = new C45131c(margin);
    }
}
