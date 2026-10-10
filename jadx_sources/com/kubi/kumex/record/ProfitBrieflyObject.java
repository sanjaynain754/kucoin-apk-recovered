package com.kubi.kumex.record;

import android.content.Context;
import android.text.style.ForegroundColorSpan;
import androidx.annotation.ColorInt;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.kumex.R$color;
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
import com.tencent.bugly.proguard.C33627eb;
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

/* JADX INFO: renamed from: com.kubi.kumex.record.g0, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: RecordObjects.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00172\b\b\u0003\u0010\u001c\u001a\u00020\t2\b\b\u0003\u0010\u001d\u001a\u00020\tJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\tHÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, m90084d2 = {"Lcom/kubi/kumex/record/ProfitBrieflyObject;", "Lcom/kubi/kumex/record/BaseProfitRecordObject;", "record1", "Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;", "<init>", "(Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;)V", "getRecord1", "()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;", "totalSettleColor", "", "getTotalSettleColor", "()I", "symbolCurrencyText", "Lcom/kubi/utils/StyledText;", "getSymbolCurrencyText", "()Lcom/kubi/utils/StyledText;", "totalRealisedPnlText", "", "getTotalRealisedPnlText", "()Ljava/lang/CharSequence;", "totalRealisedPnlRate", "getTotalRealisedPnlRate", "closePnl", "Ljava/math/BigDecimal;", "getClosePnl", "()Ljava/math/BigDecimal;", "getSettleText", "number", "numColor", "currencyColor", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRecordObjects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordObjects.kt\ncom/kubi/kumex/record/ProfitBrieflyObject\n+ 2 CoinEntityEx.kt\ncom/kubi/kumex/extensions/CoinEntityExKt\n*L\n1#1,1120:1\n24#2:1121\n16#2:1122\n*S KotlinDebug\n*F\n+ 1 RecordObjects.kt\ncom/kubi/kumex/record/ProfitBrieflyObject\n*L\n450#1:1121\n450#1:1122\n*E\n"})
public final /* data */ class ProfitBrieflyObject extends BaseProfitRecordObject {

    /* JADX INFO: renamed from: f, reason: from toString */
    @NotNull
    public final ProfitRecordEntity record1;

    /* JADX INFO: renamed from: g */
    @ColorInt
    public final int f30283g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final C27096v0 f30284h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final CharSequence f30285i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final C27096v0 f30286j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final BigDecimal f30287k;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ProfitBrieflyObject) && Intrinsics.areEqual(this.record1, ((ProfitBrieflyObject) other).record1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfitBrieflyObject(@NotNull ProfitRecordEntity record1) {
        int iM66512a;
        C27096v0 c27096v0Append;
        super(record1);
        Intrinsics.checkNotNullParameter(record1, "record1");
        this.record1 = record1;
        C27096v0 c27096v0 = null;
        if (C41014a.m89922G(getF29936a().getRealisedPnl(), null, 1, null).doubleValue() > 0.0d) {
            Context contextM56289c = C23636b.m56289c();
            Intrinsics.checkNotNullExpressionValue(contextM56289c, "getTopActivityOrApp(...)");
            iM66512a = C22890g.m54291p(contextM56289c);
        } else if (C41014a.m89922G(getF29936a().getRealisedPnl(), null, 1, null).doubleValue() < 0.0d) {
            Context contextM56289c2 = C23636b.m56289c();
            Intrinsics.checkNotNullExpressionValue(contextM56289c2, "getTopActivityOrApp(...)");
            iM66512a = C22890g.m54289n(contextM56289c2);
        } else {
            iM66512a = C27017c.f54310a.m66512a(R$color.emphasis);
        }
        this.f30283g = iM66512a;
        InterfaceC44980d interfaceC44980dM20288g = RepositoryServiceLocator.f19236a.m20288g();
        String symbol = getF29936a().getSymbol();
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(interfaceC44980dM20288g, symbol == null ? "" : symbol, false, 2, null);
        if (contractEntityM99529O == null || (c27096v0Append = FuturesDisplayNameUtils.f22525a.m24440e(contractEntityM99529O)) == null) {
            C27096v0 c27096v1 = new C27096v0();
            String symbol2 = getF29936a().getSymbol();
            c27096v0Append = c27096v1.append(symbol2 != null ? symbol2 : "");
            Intrinsics.checkNotNullExpressionValue(c27096v0Append, "append(...)");
        }
        this.f30284h = c27096v0Append;
        this.f30285i = m35793k(C41014a.m89922G(getF29936a().getRealisedPnl(), null, 1, null), iM66512a, iM66512a);
        BigDecimal roe = getF29936a().getRoe();
        if (roe != null) {
            C27096v0 c27096v2 = new C27096v0();
            c27096v2.m66905e(C42180b.m92642g(C41014a.m89922G(roe, null, 1, null), null, null, 2, true, true, false, 35, null), iM66512a);
            c27096v0 = c27096v2;
        }
        this.f30286j = c27096v0;
        BigDecimal realisedGrossCostNew = getF29936a().getRealisedGrossCostNew();
        this.f30287k = realisedGrossCostNew == null ? C27039d.m66656p(getF29936a().getRealisedGrossCost()) : realisedGrossCostNew;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ CharSequence m35791l(ProfitBrieflyObject profitBrieflyObject, BigDecimal bigDecimal, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = C27017c.f54310a.m66512a(R$color.emphasis);
        }
        if ((i13 & 4) != 0) {
            i12 = C27017c.f54310a.m66512a(R$color.emphasis40);
        }
        return profitBrieflyObject.m35793k(bigDecimal, i11, i12);
    }

    public int hashCode() {
        return this.record1.hashCode();
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final BigDecimal getF30287k() {
        return this.f30287k;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final CharSequence m35793k(@NotNull BigDecimal number, @ColorInt int i11, @ColorInt int i12) {
        PropertyEntity properties;
        Intrinsics.checkNotNullParameter(number, "number");
        C27096v0 c27096v0 = new C27096v0();
        Integer displayPrecision = null;
        CoinEntity coinEntityM99528E = InterfaceC44980d.m99528E(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(getF29936a().getCurrency()), false, 2, null);
        if (coinEntityM99528E != null && (properties = coinEntityM99528E.getProperties()) != null) {
            displayPrecision = properties.getDisplayPrecision();
        }
        C27096v0 c27096v0M66903c = c27096v0.m66903c(C42828b.m93902c(C42180b.m92640e(number, null, C27039d.m66651k(displayPrecision, 8), true, true, true, 0, null, 97, null)), new ForegroundColorSpan(i11));
        Intrinsics.checkNotNullExpressionValue(c27096v0M66903c, "append(...)");
        C27096v0 c27096v0M66903c2 = new C27096v0().m66903c(' ' + C27041f.m66668h(C27041f.m66677q(getF29936a().getCurrency())), new ForegroundColorSpan(i12));
        Intrinsics.checkNotNullExpressionValue(c27096v0M66903c2, "append(...)");
        C27096v0 c27096v0M66903c3 = new C27096v0().m66903c(C33627eb.f69716f, new ForegroundColorSpan(i12));
        Intrinsics.checkNotNullExpressionValue(c27096v0M66903c3, "append(...)");
        return C42828b.m93904e(c27096v0M66903c, c27096v0M66903c2, c27096v0M66903c3, true);
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final C27096v0 getF30284h() {
        return this.f30284h;
    }

    @Nullable
    /* JADX INFO: renamed from: n, reason: from getter */
    public final C27096v0 getF30286j() {
        return this.f30286j;
    }

    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public final CharSequence getF30285i() {
        return this.f30285i;
    }

    @NotNull
    public String toString() {
        return "ProfitBrieflyObject(record1=" + this.record1 + ')';
    }
}
