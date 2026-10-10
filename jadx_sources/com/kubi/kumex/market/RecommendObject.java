package com.kubi.kumex.market;

import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.kumex.data.market.model.QuotesEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import fm.C37567b;
import fm.C37569d;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import th.InterfaceC44980d;

/* JADX INFO: renamed from: com.kubi.kumex.market.q0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: MarketObjects.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/kumex/market/RecommendObject;", "", "isSelect", "", "contract", "Lcom/kubi/kumex/data/market/model/QuotesEntity;", "<init>", "(ZLcom/kubi/kumex/data/market/model/QuotesEntity;)V", "()Z", "getContract", "()Lcom/kubi/kumex/data/market/model/QuotesEntity;", "config", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "getConfig", "()Lcom/kubi/kumex/data/platform/model/ContractEntity;", "symbolText", "", "getSymbolText", "()Ljava/lang/CharSequence;", "priceText", "", "getPriceText", "()Ljava/lang/String;", "rateText", "getRateText", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RecommendObject {

    /* JADX INFO: renamed from: a */
    public final boolean f29452a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final QuotesEntity f29453b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final ContractEntity f29454c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final CharSequence f29455d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final String f29456e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final String f29457f;

    public RecommendObject(boolean z11, @NotNull QuotesEntity contract) {
        String strM92640e;
        Intrinsics.checkNotNullParameter(contract, "contract");
        this.f29452a = z11;
        this.f29453b = contract;
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(contract.getSymbol()), false, 2, null);
        this.f29454c = contractEntityM99529O;
        C27096v0 c27096v0M24435g = contractEntityM99529O != null ? FuturesDisplayNameUtils.m24435g(FuturesDisplayNameUtils.f22525a, contractEntityM99529O, false, 1, null) : null;
        String symbol = contract.getSymbol();
        this.f29455d = C27041f.m66667g(c27096v0M24435g, symbol == null ? "" : symbol);
        BigDecimal lastPrice = contract.getLastPrice();
        if (lastPrice != null) {
            strM92640e = C42180b.m92640e(lastPrice, null, C27039d.m66650j(contractEntityM99529O != null ? Integer.valueOf(C37567b.m84618h(contractEntityM99529O)) : null), true, false, true, 0, null, 105, null);
        } else {
            strM92640e = null;
        }
        this.f29456e = C27041f.m66669i(strM92640e, C37569d.m84684y());
        BigDecimal priceChgPct = contract.getPriceChgPct();
        this.f29457f = C27041f.m66669i(priceChgPct != null ? C42180b.m92642g(priceChgPct, null, null, 0, true, false, true, 23, null) : null, C37569d.m84684y());
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final QuotesEntity getF29453b() {
        return this.f29453b;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF29456e() {
        return this.f29456e;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF29457f() {
        return this.f29457f;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final CharSequence getF29455d() {
        return this.f29455d;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getF29452a() {
        return this.f29452a;
    }
}
