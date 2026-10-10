package com.kubi.kumex.record;

import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.assets.model.ProfitDetailItemEntity;
import com.kubi.kumex.data.assets.model.ProfitRecordEntity;
import com.kubi.kumex.data.platform.model.CoinEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.PropertyEntity;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33556b3;
import fm.C37567b;
import java.math.BigDecimal;
import ki.C41050b;
import ki.InterfaceC41049a;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p314hi.InterfaceC38213a;
import p429lf.C42179a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import th.InterfaceC44980d;

/* JADX INFO: renamed from: com.kubi.kumex.record.p0, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: RecordObjects.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010'\u001a\u00020\u001eJ\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J'\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010,\u001a\u00020\u001e2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000bR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000bR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000bR\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0011\u0010%\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010\u000b¨\u00061"}, m90084d2 = {"Lcom/kubi/kumex/record/ProfitDetailObject;", "", "id", "", "record", "Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;", C33556b3.f68963J, "Lcom/kubi/kumex/data/assets/model/ProfitDetailItemEntity;", "<init>", "(Ljava/lang/String;Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;Lcom/kubi/kumex/data/assets/model/ProfitDetailItemEntity;)V", "getId", "()Ljava/lang/String;", "getRecord", "()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;", "getDetail", "()Lcom/kubi/kumex/data/assets/model/ProfitDetailItemEntity;", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "getContract", "()Lcom/kubi/kumex/data/platform/model/ContractEntity;", "settleTimeText", "getSettleTimeText", "dealAmountText", "getDealAmountText", "getSettleText", "number", "Ljava/math/BigDecimal;", "settleDirectionTextNew", "getSettleDirectionTextNew", "supportClosePnlShow", "", "getSupportClosePnlShow", "()Z", "closePnl", "getClosePnl", "()Ljava/math/BigDecimal;", "isSupportLiquidAmount", "settleDirectionTextOldCompat", "getSettleDirectionTextOldCompat", "isFirstItem", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRecordObjects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordObjects.kt\ncom/kubi/kumex/record/ProfitDetailObject\n+ 2 CoinEntityEx.kt\ncom/kubi/kumex/extensions/CoinEntityExKt\n*L\n1#1,1120:1\n24#2:1121\n16#2:1122\n*S KotlinDebug\n*F\n+ 1 RecordObjects.kt\ncom/kubi/kumex/record/ProfitDetailObject\n*L\n723#1:1121\n723#1:1122\n*E\n"})
public final /* data */ class ProfitDetailObject {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final ProfitRecordEntity record;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final ProfitDetailItemEntity detail;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final ContractEntity f30317d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final String f30318e;

    /* JADX INFO: renamed from: f */
    public final boolean f30319f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final BigDecimal f30320g;

    /* JADX INFO: renamed from: h */
    public final boolean f30321h;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfitDetailObject)) {
            return false;
        }
        ProfitDetailObject profitDetailObject = (ProfitDetailObject) other;
        return Intrinsics.areEqual(this.id, profitDetailObject.id) && Intrinsics.areEqual(this.record, profitDetailObject.record) && Intrinsics.areEqual(this.detail, profitDetailObject.detail);
    }

    public ProfitDetailObject(@NotNull String id2, @NotNull ProfitRecordEntity record, @NotNull ProfitDetailItemEntity detail) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(detail, "detail");
        this.id = id2;
        this.record = record;
        this.detail = detail;
        this.f30317d = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(detail.getSymbol()), false, 2, null);
        Long createdAt = detail.getCreatedAt();
        this.f30318e = createdAt != null ? C42179a.m92633f(createdAt.longValue(), null, false, false, null, 15, null) : null;
        this.f30319f = Intrinsics.areEqual(detail.getType(), "CLOSE_LONG") || Intrinsics.areEqual(detail.getType(), "CLOSE_SHORT") || Intrinsics.areEqual(detail.getType(), "LIQUIDATION") || Intrinsics.areEqual(detail.getType(), "ADL");
        BigDecimal realisedGrossCostNew = detail.getRealisedGrossCostNew();
        this.f30320g = realisedGrossCostNew == null ? C27039d.m66656p(detail.getRealisedGrossCost()) : realisedGrossCostNew;
        this.f30321h = Intrinsics.areEqual(detail.getType(), "LIQUIDATION");
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getF30320g() {
        return this.f30320g;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ContractEntity getF30317d() {
        return this.f30317d;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final String m35800c() {
        BigDecimal size = this.detail.getSize();
        if (size == null) {
            return null;
        }
        ContractEntity contractEntity = this.f30317d;
        if (contractEntity == null) {
            return C42828b.m93906g(C42180b.m92640e(size, null, 0, false, false, false, 0, null, 125, null), C27017c.f54310a.m66516f(R$string.card, new Object[0]), true, false, 4, null);
        }
        InterfaceC38213a interfaceC38213aM84629s = C37567b.m84629s(contractEntity);
        InterfaceC41049a interfaceC41049aM90019b = C41050b.f91264a.m90019b(contractEntity);
        return C42828b.m93906g(interfaceC41049aM90019b.mo90008b(interfaceC38213aM84629s, this.detail.getPrice(), size, null).toString(), interfaceC41049aM90019b.mo90014h(interfaceC38213aM84629s), true, false, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final ProfitDetailItemEntity getDetail() {
        return this.detail;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final ProfitRecordEntity getRecord() {
        return this.record;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    /* JADX INFO: renamed from: g */
    public final String m35804g() {
        if (this.detail.getType() == null) {
            return null;
        }
        String type = this.detail.getType();
        if (type != null) {
            switch (type.hashCode()) {
                case -1547143037:
                    if (type.equals("CLOSE_LONG")) {
                        return C27017c.f54310a.m66516f(R$string.kumex_pnln_title3, new Object[0]);
                    }
                    break;
                case -1466779933:
                    if (type.equals("RECONCILIATION")) {
                        return C27017c.f54310a.m66516f(R$string.kumex_liquidation_reconciliation, new Object[0]);
                    }
                    break;
                case -777188583:
                    if (type.equals("LIQUIDATION")) {
                        return C27017c.f54310a.m66516f(R$string.kumex_pnln_title5, new Object[0]);
                    }
                    break;
                case -710536395:
                    if (type.equals("CLOSE_SHORT")) {
                        return C27017c.f54310a.m66516f(R$string.kumex_pnln_title4, new Object[0]);
                    }
                    break;
                case 64649:
                    if (type.equals("ADL")) {
                        return C27017c.f54310a.m66516f(R$string.kumex_pnln_title6, new Object[0]);
                    }
                    break;
                case 67286865:
                    if (type.equals("OPEN_LONG")) {
                        return C27017c.f54310a.m66516f(R$string.kumex_pnln_title1, new Object[0]);
                    }
                    break;
                case 2092150311:
                    if (type.equals("OPEN_SHORT")) {
                        return C27017c.f54310a.m66516f(R$string.kumex_pnln_title2, new Object[0]);
                    }
                    break;
            }
        }
        return C27017c.f54310a.m66516f(R$string.kumex_pnln_title4, new Object[0]);
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.record.hashCode()) * 31) + this.detail.hashCode();
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final String m35806i(@NotNull BigDecimal number) {
        PropertyEntity properties;
        Intrinsics.checkNotNullParameter(number, "number");
        Integer displayPrecision = null;
        CoinEntity coinEntityM99528E = InterfaceC44980d.m99528E(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(this.detail.getCurrency()), false, 2, null);
        if (coinEntityM99528E != null && (properties = coinEntityM99528E.getProperties()) != null) {
            displayPrecision = properties.getDisplayPrecision();
        }
        return C42828b.m93906g(C42828b.m93902c(C42180b.m92640e(number, null, C27039d.m66651k(displayPrecision, 8), true, true, true, 0, null, 97, null)), C27041f.m66668h(C27041f.m66677q(this.detail.getCurrency())), true, false, 4, null);
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getF30318e() {
        return this.f30318e;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getF30319f() {
        return this.f30319f;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m35809l() {
        return Intrinsics.areEqual("1_0", this.id);
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getF30321h() {
        return this.f30321h;
    }

    @NotNull
    public String toString() {
        return "ProfitDetailObject(id=" + this.id + ", record=" + this.record + ", detail=" + this.detail + ')';
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final String m35805h() {
        Double dValueOf;
        Double dValueOf2;
        Double dValueOf3;
        if (m35809l() && Intrinsics.areEqual(this.record.getType(), "LIQUID_LONG")) {
            return C27017c.f54310a.m66516f(R$string.force_close_sell_out, new Object[0]);
        }
        if (m35809l() && Intrinsics.areEqual(this.record.getType(), "LIQUID_SHORT")) {
            return C27017c.f54310a.m66516f(R$string.force_close_buy_in, new Object[0]);
        }
        if (m35809l() && Intrinsics.areEqual(this.record.getType(), "ADL_LONG")) {
            return C27017c.f54310a.m66516f(R$string.adl_sell_out, new Object[0]);
        }
        if (m35809l() && Intrinsics.areEqual(this.record.getType(), "ADL_SHORT")) {
            return C27017c.f54310a.m66516f(R$string.adl_buy_in, new Object[0]);
        }
        BigDecimal realisedGrossCost = this.detail.getRealisedGrossCost();
        Double dValueOf4 = null;
        if (realisedGrossCost != null) {
            dValueOf = Double.valueOf(realisedGrossCost.doubleValue());
        } else {
            dValueOf = null;
        }
        if (Intrinsics.areEqual(dValueOf, 0.0d) && Intrinsics.areEqual(this.detail.getSide(), "BUY")) {
            return C27017c.f54310a.m66516f(R$string.open_position_buy_in, new Object[0]);
        }
        BigDecimal realisedGrossCost2 = this.detail.getRealisedGrossCost();
        if (realisedGrossCost2 != null) {
            dValueOf2 = Double.valueOf(realisedGrossCost2.doubleValue());
        } else {
            dValueOf2 = null;
        }
        if (Intrinsics.areEqual(dValueOf2, 0.0d) && Intrinsics.areEqual(this.detail.getSide(), "SELL")) {
            return C27017c.f54310a.m66516f(R$string.open_position_sell_out, new Object[0]);
        }
        BigDecimal realisedGrossCost3 = this.detail.getRealisedGrossCost();
        if (realisedGrossCost3 != null) {
            dValueOf3 = Double.valueOf(realisedGrossCost3.doubleValue());
        } else {
            dValueOf3 = null;
        }
        if (!Intrinsics.areEqual(dValueOf3, 0.0d) && Intrinsics.areEqual(this.detail.getSide(), "BUY")) {
            return C27017c.f54310a.m66516f(R$string.close_position_buy_in, new Object[0]);
        }
        BigDecimal realisedGrossCost4 = this.detail.getRealisedGrossCost();
        if (realisedGrossCost4 != null) {
            dValueOf4 = Double.valueOf(realisedGrossCost4.doubleValue());
        }
        if (!Intrinsics.areEqual(dValueOf4, 0.0d) && Intrinsics.areEqual(this.detail.getSide(), "SELL")) {
            return C27017c.f54310a.m66516f(R$string.close_position_sell_out, new Object[0]);
        }
        return C27017c.f54310a.m66516f(R$string.close_position_sell_out, new Object[0]);
    }
}
