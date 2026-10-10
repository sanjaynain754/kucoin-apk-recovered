package com.kubi.kumex.utils;

import android.content.Context;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fasterxml.jackson.databind.node.C6447a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.BrokerConfig;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.utils.C27017c;
import fm.C37567b;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p236em.C37214b;
import p314hi.C38214b;
import p314hi.InterfaceC38213a;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kumex.utils.k0 */
/* JADX INFO: compiled from: StringEx.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0016\u0010\u0007\u001a\u00020\b*\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u001a>\u0010\t\u001a\u00020\n*\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\bH\u0000\u001a>\u0010\u0010\u001a\u00020\n*\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\bH\u0000\u001a>\u0010\t\u001a\u00020\n*\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\bH\u0000\u001a>\u0010\u0010\u001a\u00020\n*\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\bH\u0000\u001a4\u0010\u0012\u001a\u00020\n*\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\u00112\b\b\u0001\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\bH\u0000\u001a4\u0010\u0012\u001a\u00020\n*\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0001\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\bH\u0000\u001a\u0018\u0010\u0014\u001a\u00020\n*\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0015\u001a\u00020\bH\u0000\u001a\u0018\u0010\u0016\u001a\u00020\n*\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0015\u001a\u00020\bH\u0000\u001a\n\u0010\u0017\u001a\u00020\n*\u00020\n\u001a\n\u0010\u0018\u001a\u00020\n*\u00020\u0019¨\u0006\u001a"}, m90084d2 = {TtmlNode.TAG_DIV, "Ljava/math/BigDecimal;", "other", "scale", "", "roundingMode", "Ljava/math/RoundingMode;", "equal", "", FirebaseAnalytics.Param.PRICE, "", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "isGroup", "isShowMin", "isShowLess", "indexPrice", "Lcom/kubi/futures/trade/config/IFuturesContractConfig;", "liquidationPrice", "side", "formatLeverage", "keepZero", "formatLeverageWithoutX", "removeZeroBeforeOfGreaterZero", "getCancelAllOrderTips", "Landroid/content/Context;", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C17054k0 {
    /* JADX INFO: renamed from: b */
    public static final boolean m36528b(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2) {
        if (bigDecimal == null && bigDecimal2 == null) {
            return true;
        }
        if (bigDecimal == null && bigDecimal2 != null) {
            return false;
        }
        if (bigDecimal != null && bigDecimal2 == null) {
            return false;
        }
        try {
            Intrinsics.checkNotNull(bigDecimal);
            return bigDecimal.compareTo(bigDecimal2) == 0;
        } catch (Exception e11) {
            C37214b.m83255a(e11, "BigDecimal.equal-this:" + bigDecimal + ",other:" + bigDecimal2);
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m36530d(BigDecimal bigDecimal, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return m36529c(bigDecimal, z11);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ String m36532f(BigDecimal bigDecimal, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return m36531e(bigDecimal, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final BigDecimal m36527a(@NotNull BigDecimal bigDecimal, @NotNull BigDecimal other, int i11, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        BigDecimal bigDecimalDivide = bigDecimal.divide(other, i11, roundingMode);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        return bigDecimalDivide;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m36529c(@Nullable BigDecimal bigDecimal, boolean z11) {
        String strM92640e;
        if (bigDecimal != null && (strM92640e = C42180b.m92640e(bigDecimal, RoundingMode.HALF_UP, 2, z11, true, false, 0, null, 112, null)) != null) {
            String str = strM92640e + 'x';
            if (str != null) {
                return str;
            }
        }
        return C27017c.f54310a.m66516f(R$string.stub, new Object[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m36531e(@Nullable BigDecimal bigDecimal, boolean z11) {
        String strM92640e;
        return (bigDecimal == null || (strM92640e = C42180b.m92640e(bigDecimal, RoundingMode.HALF_UP, 2, z11, true, false, 0, null, 112, null)) == null) ? C27017c.f54310a.m66516f(R$string.stub, new Object[0]) : strM92640e;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m36533g(@NotNull Context context) {
        String str;
        Intrinsics.checkNotNullParameter(context, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getString(R$string.cancel_all_active_delegate));
        BrokerConfig brokerConfig = BrokerConfig.f19211a;
        if (brokerConfig.m20201d().mo20238a1() > 0) {
            str = '\n' + context.getString(R$string.order_cancel_all_limit_count_tips, String.valueOf(brokerConfig.m20201d().mo20238a1()));
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m36534h(@NotNull BigDecimal bigDecimal, @Nullable ContractEntity contractEntity, @NotNull RoundingMode roundingMode, boolean z11, boolean z12, boolean z13) {
        BigDecimal bigDecimal2;
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        if (contractEntity == null) {
            String plainString = C6447a.m11724a(bigDecimal).toPlainString();
            Intrinsics.checkNotNull(plainString);
            return plainString;
        }
        BigDecimal bigDecimalM89921F = C41014a.m89921F(contractEntity.getIndexPriceTickSize(), "0.0000000001");
        BigDecimal bigDecimalM89921F2 = C41014a.m89921F(contractEntity.getMaxPrice(), "1000000");
        if (bigDecimal.compareTo(bigDecimalM89921F) < 0) {
            bigDecimal2 = bigDecimalM89921F;
        } else {
            bigDecimal2 = bigDecimal.compareTo(bigDecimalM89921F2) > 0 ? bigDecimalM89921F2 : bigDecimal;
        }
        return C42180b.m92640e(bigDecimal2, roundingMode, C37567b.m84612b(contractEntity), z12, z13, z11, 0, null, 96, null);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final String m36535i(@NotNull BigDecimal bigDecimal, @Nullable InterfaceC38213a interfaceC38213a, @NotNull RoundingMode roundingMode, boolean z11, boolean z12, boolean z13) {
        BigDecimal bigDecimal2;
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        if (interfaceC38213a == null) {
            String plainString = C6447a.m11724a(bigDecimal).toPlainString();
            Intrinsics.checkNotNull(plainString);
            return plainString;
        }
        BigDecimal bigDecimalM89921F = C41014a.m89921F(interfaceC38213a.mo86230a(), "0.0000000001");
        BigDecimal bigDecimalM89921F2 = C41014a.m89921F(interfaceC38213a.mo86243n(), "1000000");
        if (bigDecimal.compareTo(bigDecimalM89921F) < 0) {
            bigDecimal2 = bigDecimalM89921F;
        } else {
            bigDecimal2 = bigDecimal.compareTo(bigDecimalM89921F2) > 0 ? bigDecimalM89921F2 : bigDecimal;
        }
        return C42180b.m92640e(bigDecimal2, roundingMode, C38214b.m86252a(interfaceC38213a), z12, z13, z11, 0, null, 96, null);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ String m36536j(BigDecimal bigDecimal, ContractEntity contractEntity, RoundingMode roundingMode, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return m36534h(bigDecimal, contractEntity, roundingMode, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? false : z12, (i11 & 16) != 0 ? false : z13);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ String m36537k(BigDecimal bigDecimal, InterfaceC38213a interfaceC38213a, RoundingMode roundingMode, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return m36535i(bigDecimal, interfaceC38213a, roundingMode, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? false : z12, (i11 & 16) != 0 ? false : z13);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0047  */
    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    @NotNull
    /* JADX INFO: renamed from: l */
    public static final String m36538l(@NotNull BigDecimal bigDecimal, @Nullable ContractEntity contractEntity, @NotNull String side, boolean z11, boolean z12) {
        BigDecimal bigDecimal2;
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        if (contractEntity == null) {
            String plainString = C6447a.m11724a(bigDecimal).toPlainString();
            Intrinsics.checkNotNull(plainString);
            return plainString;
        }
        BigDecimal bigDecimalM89921F = C41014a.m89921F(contractEntity.getIndexPriceTickSize(), "0.0000000001");
        BigDecimal bigDecimalM89921F2 = C41014a.m89921F(contractEntity.getMaxPrice(), "1000000");
        if (bigDecimal.compareTo(BigDecimal.ZERO) < 0) {
            if (Intrinsics.areEqual(side, "buy")) {
                bigDecimal2 = bigDecimalM89921F;
            } else {
                bigDecimal2 = bigDecimalM89921F2;
            }
        } else if (bigDecimal.compareTo(bigDecimalM89921F) < 0) {
            bigDecimal2 = bigDecimalM89921F;
        } else if (bigDecimal.compareTo(bigDecimalM89921F2) > 0) {
            bigDecimal2 = bigDecimalM89921F2;
        } else {
            bigDecimal2 = bigDecimal;
        }
        return C42180b.m92640e(bigDecimal2, Intrinsics.areEqual(side, "buy") ? RoundingMode.UP : RoundingMode.DOWN, C37567b.m84612b(contractEntity), z12, false, z11, 0, null, 96, null);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0047  */
    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    @NotNull
    /* JADX INFO: renamed from: m */
    public static final String m36539m(@NotNull BigDecimal bigDecimal, @Nullable InterfaceC38213a interfaceC38213a, @NotNull String side, boolean z11, boolean z12) {
        BigDecimal bigDecimal2;
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        if (interfaceC38213a == null) {
            String plainString = C6447a.m11724a(bigDecimal).toPlainString();
            Intrinsics.checkNotNull(plainString);
            return plainString;
        }
        BigDecimal bigDecimalM89921F = C41014a.m89921F(interfaceC38213a.mo86230a(), "0.0000000001");
        BigDecimal bigDecimalM89921F2 = C41014a.m89921F(interfaceC38213a.mo86243n(), "1000000");
        if (bigDecimal.compareTo(BigDecimal.ZERO) < 0) {
            if (Intrinsics.areEqual(side, "buy")) {
                bigDecimal2 = bigDecimalM89921F;
            } else {
                bigDecimal2 = bigDecimalM89921F2;
            }
        } else if (bigDecimal.compareTo(bigDecimalM89921F) < 0) {
            bigDecimal2 = bigDecimalM89921F;
        } else if (bigDecimal.compareTo(bigDecimalM89921F2) > 0) {
            bigDecimal2 = bigDecimalM89921F2;
        } else {
            bigDecimal2 = bigDecimal;
        }
        return C42180b.m92640e(bigDecimal2, Intrinsics.areEqual(side, "buy") ? RoundingMode.UP : RoundingMode.DOWN, C38214b.m86252a(interfaceC38213a), z12, false, z11, 0, null, 96, null);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ String m36540n(BigDecimal bigDecimal, ContractEntity contractEntity, String str, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            z12 = true;
        }
        return m36538l(bigDecimal, contractEntity, str, z11, z12);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ String m36541o(BigDecimal bigDecimal, InterfaceC38213a interfaceC38213a, String str, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            z12 = true;
        }
        return m36539m(bigDecimal, interfaceC38213a, str, z11, z12);
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public static final String m36542p(@NotNull BigDecimal bigDecimal, @Nullable ContractEntity contractEntity, @NotNull RoundingMode roundingMode, boolean z11, boolean z12, boolean z13) {
        BigDecimal bigDecimal2;
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        if (contractEntity == null) {
            String plainString = C6447a.m11724a(bigDecimal).toPlainString();
            Intrinsics.checkNotNull(plainString);
            return plainString;
        }
        BigDecimal bigDecimalM89921F = C41014a.m89921F(contractEntity.getTickSize(), "0.0000000001");
        BigDecimal bigDecimalM89921F2 = C41014a.m89921F(contractEntity.getMaxPrice(), "1000000");
        if (bigDecimal.compareTo(bigDecimalM89921F) < 0) {
            bigDecimal2 = bigDecimalM89921F;
        } else {
            bigDecimal2 = bigDecimal.compareTo(bigDecimalM89921F2) > 0 ? bigDecimalM89921F2 : bigDecimal;
        }
        return C42180b.m92640e(bigDecimal2, roundingMode, C37567b.m84618h(contractEntity), z12, z13, z11, 0, null, 96, null);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ String m36543q(BigDecimal bigDecimal, ContractEntity contractEntity, RoundingMode roundingMode, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return m36542p(bigDecimal, contractEntity, roundingMode, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? false : z12, (i11 & 16) != 0 ? false : z13);
    }
}
