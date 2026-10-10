package com.kubi.kumex.record;

import android.content.Context;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.assets.model.ProfitRecordEntity;
import com.kubi.kumex.data.platform.model.CoinEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.PropertyEntity;
import com.kubi.resources.C22890g;
import com.kubi.router.utils.C23636b;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import java.math.BigDecimal;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import th.InterfaceC44980d;

/* JADX INFO: renamed from: com.kubi.kumex.record.c1, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: RecordObjects.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/kumex/record/ProfitRecordObject;", "Lcom/kubi/kumex/record/BaseProfitRecordObject;", "record1", "Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;", "<init>", "(Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;)V", "getRecord1", "()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;", "green", "", "red", "precision", "profitSymbolText", "", "getProfitSymbolText", "()Ljava/lang/CharSequence;", "profitAmountText", "Lcom/kubi/utils/StyledText;", "getProfitAmountText", "()Lcom/kubi/utils/StyledText;", "realisedPnlRateText", "getRealisedPnlRateText", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRecordObjects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordObjects.kt\ncom/kubi/kumex/record/ProfitRecordObject\n+ 2 CoinEntityEx.kt\ncom/kubi/kumex/extensions/CoinEntityExKt\n*L\n1#1,1120:1\n24#2:1121\n16#2:1122\n*S KotlinDebug\n*F\n+ 1 RecordObjects.kt\ncom/kubi/kumex/record/ProfitRecordObject\n*L\n286#1:1121\n286#1:1122\n*E\n"})
public final /* data */ class ProfitRecordObject extends BaseProfitRecordObject {

    /* JADX INFO: renamed from: f, reason: from toString */
    @NotNull
    public final ProfitRecordEntity record1;

    /* JADX INFO: renamed from: g */
    public final int f29955g;

    /* JADX INFO: renamed from: h */
    public final int f29956h;

    /* JADX INFO: renamed from: i */
    public final int f29957i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final CharSequence f29958j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final C27096v0 f29959k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final C27096v0 f29960l;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ProfitRecordObject) && Intrinsics.areEqual(this.record1, ((ProfitRecordObject) other).record1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfitRecordObject(@NotNull ProfitRecordEntity record1) {
        String str;
        PropertyEntity properties;
        super(record1);
        Intrinsics.checkNotNullParameter(record1, "record1");
        this.record1 = record1;
        Context contextM56289c = C23636b.m56289c();
        Intrinsics.checkNotNullExpressionValue(contextM56289c, "getTopActivityOrApp(...)");
        int iM54291p = C22890g.m54291p(contextM56289c);
        this.f29955g = iM54291p;
        Context contextM56289c2 = C23636b.m56289c();
        Intrinsics.checkNotNullExpressionValue(contextM56289c2, "getTopActivityOrApp(...)");
        int iM54289n = C22890g.m54289n(contextM56289c2);
        this.f29956h = iM54289n;
        String currency = getF29936a().getCurrency();
        RepositoryServiceLocator repositoryServiceLocator = RepositoryServiceLocator.f19236a;
        CoinEntity coinEntityM99528E = InterfaceC44980d.m99528E(repositoryServiceLocator.m20288g(), C27041f.m66668h(currency), false, 2, null);
        int iM66651k = C27039d.m66651k((coinEntityM99528E == null || (properties = coinEntityM99528E.getProperties()) == null) ? null : properties.getDisplayPrecision(), 8);
        this.f29957i = iM66651k;
        InterfaceC44980d interfaceC44980dM20288g = repositoryServiceLocator.m20288g();
        String symbol = getF29936a().getSymbol();
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(interfaceC44980dM20288g, symbol == null ? "" : symbol, false, 2, null);
        C27096v0 c27096v0M24440e = contractEntityM99529O != null ? FuturesDisplayNameUtils.f22525a.m24440e(contractEntityM99529O) : null;
        String symbol2 = getF29936a().getSymbol();
        this.f29958j = C27041f.m66667g(c27096v0M24440e, symbol2 != null ? symbol2 : "");
        C27096v0 c27096v0 = new C27096v0();
        BigDecimal bigDecimalM89922G = C41014a.m89922G(getF29936a().getRealisedPnl(), null, 1, null);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        if (bigDecimalM89922G.compareTo(bigDecimalValueOf) >= 0) {
            str = "valueOf(...)";
            c27096v0.m66905e(C42828b.m93906g(C42828b.m93902c(C42180b.m92640e(C41014a.m89922G(getF29936a().getRealisedPnl(), null, 1, null), null, iM66651k, true, true, true, 0, null, 97, null)), C27041f.m66669i(C27041f.m66677q(getF29936a().getCurrency()), C27017c.f54310a.m66516f(R$string.stub, new Object[0])), true, false, 4, null), iM54291p);
        } else {
            str = "valueOf(...)";
            c27096v0.m66905e(C42828b.m93906g(C42828b.m93902c(C42180b.m92640e(C41014a.m89922G(getF29936a().getRealisedPnl(), null, 1, null), null, iM66651k, true, true, true, 0, null, 97, null)), C27041f.m66669i(C27041f.m66677q(getF29936a().getCurrency()), C27017c.f54310a.m66516f(R$string.stub, new Object[0])), true, false, 4, null), iM54289n);
        }
        this.f29959k = c27096v0;
        C27096v0 c27096v1 = new C27096v0();
        BigDecimal roe = getF29936a().getRoe();
        String strM66516f = (roe == null || (strM66516f = C42180b.m92642g(roe, null, null, 2, true, true, false, 35, null)) == null) ? C27017c.f54310a.m66516f(R$string.stub, new Object[0]) : strM66516f;
        BigDecimal bigDecimalM89922G2 = C41014a.m89922G(getF29936a().getRoe(), null, 1, null);
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, str);
        c27096v1.m66905e(strM66516f, bigDecimalM89922G2.compareTo(bigDecimalValueOf2) < 0 ? iM54289n : iM54291p);
        this.f29960l = c27096v1;
    }

    public int hashCode() {
        return this.record1.hashCode();
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final C27096v0 getF29959k() {
        return this.f29959k;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final CharSequence getF29958j() {
        return this.f29958j;
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final C27096v0 getF29960l() {
        return this.f29960l;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final ProfitRecordEntity getRecord1() {
        return this.record1;
    }

    @NotNull
    public String toString() {
        return "ProfitRecordObject(record1=" + this.record1 + ')';
    }
}
