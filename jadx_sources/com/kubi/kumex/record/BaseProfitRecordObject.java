package com.kubi.kumex.record;

import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.assets.model.ProfitRecordEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.utils.C17054k0;
import com.kubi.resources.C22890g;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27041f;
import fm.C37569d;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42179a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import th.InterfaceC44980d;

/* JADX INFO: renamed from: com.kubi.kumex.record.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: RecordObjects.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000fR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m90084d2 = {"Lcom/kubi/kumex/record/BaseProfitRecordObject;", "", "record", "Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;", "<init>", "(Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;)V", "getRecord", "()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "getContract", "()Lcom/kubi/kumex/data/platform/model/ContractEntity;", "marginModeText", "", "getMarginModeText", "()Ljava/lang/String;", "profitTimeText", "getProfitTimeText", "leverageDesc", "getLeverageDesc", "closeTypeText", "getCloseTypeText", "closeTypeCompat", "getCloseTypeCompat", "directionText", "Lcom/kubi/utils/StyledText;", "getDirectionText", "()Lcom/kubi/utils/StyledText;", "directionTextColor", "", "getDirectionTextColor", "()I", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class BaseProfitRecordObject {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ProfitRecordEntity f29936a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final ContractEntity f29937b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final String f29938c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final String f29939d;

    /* JADX INFO: renamed from: e */
    public final int f29940e;

    public BaseProfitRecordObject(@NotNull ProfitRecordEntity record) {
        Intrinsics.checkNotNullParameter(record, "record");
        this.f29936a = record;
        this.f29937b = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(record.getSymbol()), false, 2, null);
        this.f29938c = Intrinsics.areEqual(record.getMarginMode(), "CROSS") ? C27017c.f54310a.m66516f(R$string.kumex_cross_position, new Object[0]) : C27017c.f54310a.m66516f(R$string.kumex_isolate_position, new Object[0]);
        Long closeDate = record.getCloseDate();
        this.f29939d = C27041f.m66669i(closeDate != null ? C42179a.m92633f(closeDate.longValue(), null, true, true, null, 9, null) : null, C37569d.m84684y());
        this.f29940e = C22890g.m54281f(C27017c.f54310a.m66513b(), record.isBuy());
    }

    /* JADX INFO: renamed from: a */
    public final String m35295a() {
        String type = this.f29936a.getType();
        if (type == null) {
            return "";
        }
        switch (type.hashCode()) {
            case -1760088167:
                return !type.equals("LIQUID_SHORT") ? "" : C27017c.f54310a.m66516f(R$string.force_close_buy_in, new Object[0]);
            case -1738956506:
                return !type.equals("ADL_SHORT") ? "" : C27017c.f54310a.m66516f(R$string.adl_buy_in, new Object[0]);
            case -1547143037:
                return !type.equals("CLOSE_LONG") ? "" : C27017c.f54310a.m66516f(R$string.kumex_pnln_title3, new Object[0]);
            case -749715553:
                return !type.equals("LIQUID_LONG") ? "" : C27017c.f54310a.m66516f(R$string.force_close_sell_out, new Object[0]);
            case -710536395:
                return !type.equals("CLOSE_SHORT") ? "" : C27017c.f54310a.m66516f(R$string.kumex_pnln_title4, new Object[0]);
            case -194844558:
                return !type.equals("ADL_LONG") ? "" : C27017c.f54310a.m66516f(R$string.adl_sell_out, new Object[0]);
            default:
                return "";
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m35296b() {
        if (this.f29936a.getCloseType() == null) {
            return m35295a();
        }
        return Intrinsics.areEqual(this.f29936a.getCloseType(), "CLOSE") ? C27017c.f54310a.m66516f(R$string.kumex_pnln_status_self, new Object[0]) : C27017c.f54310a.m66516f(R$string.kumex_pnln_status_system, new Object[0]);
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ContractEntity getF29937b() {
        return this.f29937b;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final C27096v0 m35298d() {
        if (this.f29936a.getSide() == null) {
            return null;
        }
        return new C27096v0().m66905e(this.f29936a.isBuy() ? C27017c.f54310a.m66516f(R$string.multi, new Object[0]) : C27017c.f54310a.m66516f(R$string.empty, new Object[0]), C22890g.m54281f(C27017c.f54310a.m66513b(), this.f29936a.isBuy()));
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getF29940e() {
        return this.f29940e;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final String m35300f() {
        if (this.f29936a.getLeverage() != null) {
            BigDecimal leverage = this.f29936a.getLeverage();
            Intrinsics.checkNotNull(leverage);
            if (leverage.compareTo(BigDecimal.ZERO) > 0) {
                return C17054k0.m36530d(this.f29936a.getLeverage(), false, 1, null);
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getF29938c() {
        return this.f29938c;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getF29939d() {
        return this.f29939d;
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final ProfitRecordEntity getF29936a() {
        return this.f29936a;
    }
}
