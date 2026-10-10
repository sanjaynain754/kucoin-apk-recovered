package com.kubi.kumex.market;

import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.market.model.QuotesEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import fm.C37567b;
import fm.C37569d;
import fm.C37570e;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p801yl.C46527h0;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import th.InterfaceC44980d;

/* JADX INFO: renamed from: com.kubi.kumex.market.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: MarketObjects.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\u001f\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u0006!"}, m90084d2 = {"Lcom/kubi/kumex/market/ContractObject;", "", "type", "", "contract", "Lcom/kubi/kumex/data/market/model/QuotesEntity;", "<init>", "(ILcom/kubi/kumex/data/market/model/QuotesEntity;)V", "getType", "()I", "getContract", "()Lcom/kubi/kumex/data/market/model/QuotesEntity;", "indexLongClick", "getIndexLongClick", "setIndexLongClick", "(I)V", "selectSymbol", "", "getSelectSymbol", "()Ljava/lang/String;", "setSelectSymbol", "(Ljava/lang/String;)V", "config", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "getConfig", "()Lcom/kubi/kumex/data/platform/model/ContractEntity;", "isFavor", "", "()Z", "priceText", "getPriceText", "rateText", "getRateText", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class ContractObject {

    /* JADX INFO: renamed from: a */
    public final int f29416a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final QuotesEntity f29417b;

    /* JADX INFO: renamed from: c */
    public int f29418c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public String f29419d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final ContractEntity f29420e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final String f29421f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final String f29422g;

    public ContractObject(int i11, @NotNull QuotesEntity contract) {
        String strM92640e;
        Intrinsics.checkNotNullParameter(contract, "contract");
        this.f29416a = i11;
        this.f29417b = contract;
        this.f29418c = -1;
        this.f29419d = C46527h0.f104291a.m102677L();
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(contract.getSymbol()), false, 2, null);
        this.f29420e = contractEntityM99529O;
        BigDecimal lastPrice = contract.getLastPrice();
        if (lastPrice != null) {
            strM92640e = C42180b.m92640e(lastPrice, null, C27039d.m66650j(contractEntityM99529O != null ? Integer.valueOf(C37567b.m84618h(contractEntityM99529O)) : null), true, false, true, 0, null, 105, null);
        } else {
            strM92640e = null;
        }
        this.f29421f = C27041f.m66669i(strM92640e, C37569d.m84684y());
        BigDecimal priceChgPct = contract.getPriceChgPct();
        this.f29422g = C27041f.m66669i(priceChgPct != null ? C42180b.m92642g(priceChgPct, null, null, 0, true, false, true, 23, null) : null, C37569d.m84684y());
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ContractEntity getF29420e() {
        return this.f29420e;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final QuotesEntity getF29417b() {
        return this.f29417b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF29418c() {
        return this.f29418c;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getF29421f() {
        return this.f29421f;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getF29422g() {
        return this.f29422g;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public String getF29419d() {
        return this.f29419d;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getF29416a() {
        return this.f29416a;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m34387h() {
        return C37570e.m84690e(this.f29417b.getSymbol());
    }

    /* JADX INFO: renamed from: i */
    public final void m34388i(int i11) {
        this.f29418c = i11;
    }

    /* JADX INFO: renamed from: j */
    public void m34389j(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f29419d = str;
    }
}
