package fm;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.host.HostManager;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.data.trade.model.PositionTrialEntity;
import com.kubi.kumex.data.trade.model.UserJoinChallengeEntity;
import com.kubi.kumex.utils.C17054k0;
import com.kubi.resources.C22890g;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27092t0;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.WeakHashMap;
import ki.C41050b;
import ki.InterfaceC41049a;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p314hi.InterfaceC38213a;
import p371ji.C40410a;
import p402kf.C41014a;
import p429lf.C42180b;
import p729wl.C45875l0;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: fm.d */
/* JADX INFO: compiled from: PositionEntityEx.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004\u001a\n\u0010\u000b\u001a\u00020\f*\u00020\u0004\u001a\n\u0010\r\u001a\u00020\b*\u00020\u0004\u001a\n\u0010\u000e\u001a\u00020\f*\u00020\u0004\u001a\n\u0010\u000f\u001a\u00020\f*\u00020\u0004\u001a\n\u0010\u0010\u001a\u00020\b*\u00020\u0004\u001a\u001e\u0010\u0011\u001a\u00020\b*\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\f\u001a\f\u0010\u0015\u001a\u0004\u0018\u00010\u0013*\u00020\u0004\u001a\f\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\u0004\u001a\u0014\u0010\u0017\u001a\u00020\b*\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\f\u001a\n\u0010\u0018\u001a\u00020\b*\u00020\u0004\u001a\n\u0010\u0019\u001a\u00020\b*\u00020\u0004\u001a\u0014\u0010\u001a\u001a\u00020\b*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u001a\n\u0010\u001b\u001a\u00020\b*\u00020\u0004\u001a\u0014\u0010\u001c\u001a\u00020\b*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u001a\u0014\u0010\u001d\u001a\u00020\b*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u001a\n\u0010\u001e\u001a\u00020\u001f*\u00020\u0004\u001a\n\u0010 \u001a\u00020\b*\u00020\u0004\u001a \u0010!\u001a\u00020\b*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u001a:\u0010$\u001a\u0004\u0018\u00010\u0013*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0013\u001a,\u0010'\u001a\u0004\u0018\u00010\u0013*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010&\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0013\u001a6\u0010(\u001a\u00020\b*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010)\u001a\u00020\f2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0013\u001a\n\u0010*\u001a\u00020\u001f*\u00020\u0004\u001a\n\u0010+\u001a\u00020\u001f*\u00020\u0004\u001a\n\u0010,\u001a\u00020\u001f*\u00020\u0004\u001a\u0014\u0010-\u001a\u00020\b*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u001a\u0014\u0010.\u001a\u00020\b*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u001a\u0014\u0010/\u001a\u00020\b*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u001a\n\u00100\u001a\u00020\f*\u00020\u0004\u001a\f\u00101\u001a\u0004\u0018\u00010\b*\u00020\u0004\u001a\n\u00102\u001a\u000203*\u00020\u0004\u001a\u000e\u00104\u001a\u0004\u0018\u00010\b*\u0004\u0018\u000105\u001a\n\u00106\u001a\u00020\b*\u000207\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u00068"}, m90084d2 = {"lock", "", "contractCache", "Ljava/util/WeakHashMap;", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "contract", "stub", "", "getStub", "()Ljava/lang/String;", "isBuyMore", "", "getSide", "isClose", "isCross", "formatMarginMode", "formatUnPnl", "unrealisedPnl", "Ljava/math/BigDecimal;", "withCurrency", "unrealisedPnlAccordingCalculatePriceType", "unrealisedRoePcntAccordingCalculatePriceType", "formatPnl", "formatRoi", "formatRoiUseMarkPricePnl", "formatLiquidationPrice", "formatRiskRatio", "formatMarkPrice", "formatOpenPrice", "formatSymbol", "", "formatLeverage", "formatQty", "qtyUnitStrategy", "Lcom/kubi/futures/trade/config/qty/IQtyUnitStrategy;", "transformQty", FirebaseAnalytics.Param.PRICE, "qty", "transformQtyOfLot", "formatQtyAppendUnit", "needSubSign", "formatSide", "formatIMR", "formatMMR", "formatMargin", "formatMaintMargin", "formatMarginLegal", "isTradeProTrialPosition", "tradeProProgressUrl", "tradeProCountdownEndTimeMillis", "", "buildProgressUrl", "Lcom/kubi/kumex/data/trade/model/UserJoinChallengeEntity;", "resolveTradeProProgressUrl", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPositionEntityEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PositionEntityEx.kt\ncom/kubi/kumex/extensions/PositionEntityExKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,430:1\n1#2:431\n*E\n"})
public final class C37569d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Object f83533a = new Object();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final WeakHashMap<PositionEntity, ContractEntity> f83534b = new WeakHashMap<>();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final String f83535c = C27017c.f54310a.m66516f(R$string.stub, new Object[0]);

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final String m84660a(@Nullable UserJoinChallengeEntity userJoinChallengeEntity) {
        String strM66668h = C27041f.m66668h(userJoinChallengeEntity != null ? userJoinChallengeEntity.getCampaignTemplateCode() : null);
        if (StringsKt.isBlank(strM66668h)) {
            return null;
        }
        return HostManager.a.e() + "/competition/" + strM66668h;
    }

    /* JADX INFO: renamed from: A */
    public static final boolean m84649A(@NotNull PositionEntity positionEntity) {
        Intrinsics.checkNotNullParameter(positionEntity, "<this>");
        return Intrinsics.areEqual(positionEntity.getMarginMode(), "CROSS");
    }

    /* JADX INFO: renamed from: B */
    public static final boolean m84650B(@NotNull PositionEntity positionEntity) {
        Intrinsics.checkNotNullParameter(positionEntity, "<this>");
        if (!positionEntity.isTrialFunds()) {
            return false;
        }
        if (C27092t0.m66898c(positionEntity.getPrizeType())) {
            return true;
        }
        PositionTrialEntity trialCoupon = positionEntity.getTrialCoupon();
        return C27092t0.m66898c(trialCoupon != null ? trialCoupon.getPrizeType() : null);
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public static final String m84651C(@NotNull FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity) {
        Intrinsics.checkNotNullParameter(futuresWelfareTrialItemEntity, "<this>");
        String strM66668h = C27041f.m66668h(m84660a(new UserJoinChallengeEntity(futuresWelfareTrialItemEntity.getCampaignTemplateCode(), null, null, null, null, null, null, null, 254, null)));
        if (StringsKt.isBlank(strM66668h)) {
            strM66668h = C27041f.m66668h(futuresWelfareTrialItemEntity.getProgressUrl());
        }
        return StringsKt.isBlank(strM66668h) ? C45875l0.f103336a.m101358z0() : strM66668h;
    }

    /* JADX INFO: renamed from: D */
    public static final long m84652D(@NotNull PositionEntity positionEntity) {
        Intrinsics.checkNotNullParameter(positionEntity, "<this>");
        UserJoinChallengeEntity userJoinChallenge = positionEntity.getUserJoinChallenge();
        long jM66652l = C27039d.m66652l(userJoinChallenge != null ? userJoinChallenge.getEndTime() : null);
        if (jM66652l > 0) {
            return jM66652l;
        }
        PositionTrialEntity trialCoupon = positionEntity.getTrialCoupon();
        return C27039d.m66652l(trialCoupon != null ? trialCoupon.getExpiredPeriod() : null);
    }

    @Nullable
    /* JADX INFO: renamed from: E */
    public static final String m84653E(@NotNull PositionEntity positionEntity) {
        Intrinsics.checkNotNullParameter(positionEntity, "<this>");
        return m84660a(positionEntity.getUserJoinChallenge());
    }

    @Nullable
    /* JADX INFO: renamed from: F */
    public static final BigDecimal m84654F(@NotNull PositionEntity positionEntity, @Nullable ContractEntity contractEntity, @Nullable InterfaceC41049a interfaceC41049a, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(positionEntity, "<this>");
        if (bigDecimal2 == null && (bigDecimal2 = positionEntity.getCurrentQty()) == null) {
            return null;
        }
        BigDecimal bigDecimal3 = BigDecimal.ZERO;
        if (bigDecimal2.compareTo(bigDecimal3) == 0) {
            return bigDecimal3;
        }
        if (contractEntity == null) {
            return bigDecimal2;
        }
        if (interfaceC41049a == null) {
            interfaceC41049a = C41050b.f91264a.m90019b(contractEntity);
        }
        InterfaceC38213a interfaceC38213aM84629s = C37567b.m84629s(contractEntity);
        if (bigDecimal == null && (bigDecimal = positionEntity.getLatestPrice()) == null) {
            bigDecimal = positionEntity.getMarkPrice();
        }
        return interfaceC41049a.mo90007a(interfaceC38213aM84629s, bigDecimal, bigDecimal2, null);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ BigDecimal m84655G(PositionEntity positionEntity, ContractEntity contractEntity, InterfaceC41049a interfaceC41049a, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            interfaceC41049a = null;
        }
        if ((i11 & 4) != 0) {
            bigDecimal = null;
        }
        if ((i11 & 8) != 0) {
            bigDecimal2 = null;
        }
        return m84654F(positionEntity, contractEntity, interfaceC41049a, bigDecimal, bigDecimal2);
    }

    @Nullable
    /* JADX INFO: renamed from: H */
    public static final BigDecimal m84656H(@NotNull PositionEntity positionEntity, @Nullable ContractEntity contractEntity, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(positionEntity, "<this>");
        if (bigDecimal == null) {
            return null;
        }
        BigDecimal bigDecimal3 = BigDecimal.ZERO;
        if (bigDecimal.compareTo(bigDecimal3) == 0) {
            return bigDecimal3;
        }
        if (contractEntity == null) {
            return bigDecimal;
        }
        InterfaceC41049a interfaceC41049aM90019b = C41050b.f91264a.m90019b(contractEntity);
        InterfaceC38213a interfaceC38213aM84629s = C37567b.m84629s(contractEntity);
        if (bigDecimal2 == null && (bigDecimal2 = positionEntity.getLatestPrice()) == null) {
            bigDecimal2 = positionEntity.getMarkPrice();
        }
        return interfaceC41049aM90019b.mo90015i(interfaceC38213aM84629s, bigDecimal2, bigDecimal, null);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ BigDecimal m84657I(PositionEntity positionEntity, ContractEntity contractEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            bigDecimal2 = null;
        }
        return m84656H(positionEntity, contractEntity, bigDecimal, bigDecimal2);
    }

    @Nullable
    /* JADX INFO: renamed from: J */
    public static final BigDecimal m84658J(@NotNull PositionEntity positionEntity) {
        Intrinsics.checkNotNullParameter(positionEntity, "<this>");
        if (C40410a.f89722a.m89054c()) {
            return positionEntity.getLatestUnrealisedPnl() == null ? positionEntity.getUnrealisedPnl() : positionEntity.getLatestUnrealisedPnl();
        }
        return positionEntity.getUnrealisedPnl();
    }

    @Nullable
    /* JADX INFO: renamed from: K */
    public static final BigDecimal m84659K(@NotNull PositionEntity positionEntity) {
        Intrinsics.checkNotNullParameter(positionEntity, "<this>");
        if (C40410a.f89722a.m89054c()) {
            return positionEntity.getLatestUnrealisedRoePcnt() == null ? positionEntity.getUnrealisedRoePcnt() : positionEntity.getLatestUnrealisedRoePcnt();
        }
        return positionEntity.getUnrealisedRoePcnt();
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final ContractEntity m84661b(@NotNull PositionEntity positionEntity) {
        ContractEntity contractEntity;
        Object next;
        Intrinsics.checkNotNullParameter(positionEntity, "<this>");
        synchronized (f83533a) {
            try {
                contractEntity = f83534b.get(positionEntity);
                if (contractEntity == null) {
                    Iterator<T> it = RepositoryServiceLocator.f19236a.m20288g().mo25016k().iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.areEqual(((ContractEntity) next).getSymbol(), positionEntity.getSymbol()));
                    f83534b.put(positionEntity, (ContractEntity) next);
                    contractEntity = (ContractEntity) next;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return contractEntity;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final CharSequence m84662c(@NotNull PositionEntity positionEntity) {
        String strM92642g;
        Intrinsics.checkNotNullParameter(positionEntity, "<this>");
        BigDecimal crossIMR = positionEntity.getCrossIMR();
        return (crossIMR == null || (strM92642g = C42180b.m92642g(crossIMR, null, RoundingMode.UP, 0, false, false, true, 21, null)) == null) ? f83535c : strM92642g;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m84663d(@NotNull PositionEntity positionEntity) {
        Intrinsics.checkNotNullParameter(positionEntity, "<this>");
        return C17054k0.m36530d(positionEntity.getRealLeverage(), false, 1, null);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m84664e(@NotNull PositionEntity positionEntity, @Nullable ContractEntity contractEntity) {
        Intrinsics.checkNotNullParameter(positionEntity, "<this>");
        BigDecimal liquidationPrice = positionEntity.getLiquidationPrice();
        return C27041f.m66669i(liquidationPrice != null ? C17054k0.m36540n(liquidationPrice, contractEntity, m84683x(positionEntity), false, false, 12, null) : null, f83535c);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final CharSequence m84665f(@NotNull PositionEntity positionEntity) {
        String strM92642g;
        Intrinsics.checkNotNullParameter(positionEntity, "<this>");
        BigDecimal crossMMR = positionEntity.getCrossMMR();
        return (crossMMR == null || (strM92642g = C42180b.m92642g(crossMMR, null, RoundingMode.UP, 0, false, false, true, 21, null)) == null) ? f83535c : strM92642g;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m84666g(@NotNull PositionEntity positionEntity, @Nullable ContractEntity contractEntity) {
        String strM92640e;
        Intrinsics.checkNotNullParameter(positionEntity, "<this>");
        BigDecimal maintMargin = positionEntity.getMaintMargin();
        if (maintMargin != null) {
            strM92640e = C42180b.m92640e(maintMargin, RoundingMode.DOWN, C37567b.m84623m(contractEntity), true, true, true, 0, null, 96, null);
        } else {
            strM92640e = null;
        }
        return C27041f.m66669i(C42828b.m93902c(strM92640e), f83535c);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m84667h(@NotNull PositionEntity positionEntity, @Nullable ContractEntity contractEntity) {
        BigDecimal bigDecimalAbs;
        Intrinsics.checkNotNullParameter(positionEntity, "<this>");
        BigDecimal maintMargin = positionEntity.getMaintMargin();
        String strM89950x = null;
        if (maintMargin != null && (bigDecimalAbs = maintMargin.abs()) != null) {
            double dDoubleValue = bigDecimalAbs.doubleValue();
            String strM66677q = C27041f.m66677q(positionEntity.getSettleCurrency());
            if (strM66677q != null) {
                strM89950x = strM66677q;
            } else if (contractEntity != null) {
                strM89950x = C37567b.m84620j(contractEntity);
            }
            strM89950x = C41014a.m89950x(C41014a.m89939m(dDoubleValue, strM89950x), null, null, 0, false, false, true, true, 31, null);
        }
        return C27041f.m66669i(strM89950x, f83535c);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final String m84668i(@NotNull PositionEntity positionEntity) {
        Intrinsics.checkNotNullParameter(positionEntity, "<this>");
        return m84649A(positionEntity) ? C27017c.f54310a.m66516f(R$string.kumex_cross_position, new Object[0]) : C27017c.f54310a.m66516f(R$string.kumex_isolate_position, new Object[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final String m84669j(@NotNull PositionEntity positionEntity, @Nullable ContractEntity contractEntity) {
        Intrinsics.checkNotNullParameter(positionEntity, "<this>");
        BigDecimal markPrice = positionEntity.getMarkPrice();
        return C27041f.m66669i(markPrice != null ? C17054k0.m36536j(markPrice, contractEntity, null, true, true, false, 18, null) : null, f83535c);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final String m84670k(@NotNull PositionEntity positionEntity, @Nullable ContractEntity contractEntity) {
        Intrinsics.checkNotNullParameter(positionEntity, "<this>");
        BigDecimal avgEntryPrice = positionEntity.getAvgEntryPrice();
        return C27041f.m66669i(avgEntryPrice != null ? C17054k0.m36543q(avgEntryPrice, contractEntity, RoundingMode.HALF_UP, true, true, false, 16, null) : null, f83535c);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static final String m84671l(@NotNull PositionEntity positionEntity, boolean z11) {
        Intrinsics.checkNotNullParameter(positionEntity, "<this>");
        BigDecimal realisedPnl = positionEntity.getRealisedPnl();
        String strM66668h = C27041f.m66668h(C42828b.m93902c(C27041f.m66669i(realisedPnl != null ? C42180b.m92640e(realisedPnl, null, C37567b.m84623m(m84661b(positionEntity)), true, true, true, 0, null, 97, null) : null, f83535c)));
        return z11 ? C42828b.m93906g(strM66668h, C27041f.m66668h(C27041f.m66677q(positionEntity.getSettleCurrency())), true, false, 4, null) : strM66668h;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static final String m84672m(@NotNull PositionEntity positionEntity, @Nullable ContractEntity contractEntity, @Nullable InterfaceC41049a interfaceC41049a) {
        BigDecimal bigDecimalAbs;
        Intrinsics.checkNotNullParameter(positionEntity, "<this>");
        BigDecimal currentQty = positionEntity.getCurrentQty();
        if (currentQty == null || (bigDecimalAbs = currentQty.abs()) == null) {
            return f83535c;
        }
        if (bigDecimalAbs.compareTo(BigDecimal.ZERO) == 0) {
            return "0";
        }
        if (contractEntity == null) {
            return C42180b.m92640e(bigDecimalAbs, null, 0, false, false, false, 0, null, 125, null);
        }
        if (interfaceC41049a == null) {
            interfaceC41049a = C41050b.f91264a.m90019b(contractEntity);
        }
        InterfaceC38213a interfaceC38213aM84629s = C37567b.m84629s(contractEntity);
        BigDecimal latestPrice = positionEntity.getLatestPrice();
        if (latestPrice == null) {
            latestPrice = positionEntity.getMarkPrice();
        }
        return interfaceC41049a.mo90008b(interfaceC38213aM84629s, latestPrice, bigDecimalAbs, null).toString();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ String m84673n(PositionEntity positionEntity, ContractEntity contractEntity, InterfaceC41049a interfaceC41049a, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            interfaceC41049a = null;
        }
        return m84672m(positionEntity, contractEntity, interfaceC41049a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0020  */
    /* JADX WARN: Code duplicated, block: B:15:0x0023  */
    /* JADX WARN: Code duplicated, block: B:17:0x002b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x002e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    /* JADX WARN: Code duplicated, block: B:22:0x003f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    @NotNull
    /* JADX INFO: renamed from: o */
    public static final String m84674o(@NotNull PositionEntity positionEntity, @Nullable ContractEntity contractEntity, @Nullable InterfaceC41049a interfaceC41049a, boolean z11, @Nullable BigDecimal bigDecimal) {
        BigDecimal bigDecimal2;
        BigDecimal latestPrice;
        Intrinsics.checkNotNullParameter(positionEntity, "<this>");
        if (!z11) {
            if (bigDecimal == null) {
                bigDecimal = positionEntity.getCurrentQty();
            }
            if (bigDecimal != null) {
                bigDecimal = bigDecimal.abs();
            } else {
                bigDecimal2 = null;
            }
            if (bigDecimal2 == null) {
                return f83535c;
            }
            if (bigDecimal2.compareTo(BigDecimal.ZERO) == 0) {
                return "0";
            }
            if (contractEntity == null) {
                return C42180b.m92640e(bigDecimal2, null, 0, false, false, false, 0, null, 125, null);
            }
            if (interfaceC41049a == null) {
                interfaceC41049a = C41050b.f91264a.m90019b(contractEntity);
            }
            InterfaceC38213a interfaceC38213aM84629s = C37567b.m84629s(contractEntity);
            latestPrice = positionEntity.getLatestPrice();
            if (latestPrice == null) {
                latestPrice = positionEntity.getMarkPrice();
            }
            return C27041f.m66668h(C42828b.m93915p(C42828b.m93906g(interfaceC41049a.mo90008b(interfaceC38213aM84629s, latestPrice, bigDecimal2, null).toString(), interfaceC41049a.mo90014h(interfaceC38213aM84629s), true, false, 4, null)));
        }
        if (bigDecimal == null) {
            bigDecimal = positionEntity.getCurrentQty();
        }
        bigDecimal2 = bigDecimal;
        if (bigDecimal2 == null) {
            return f83535c;
        }
        if (bigDecimal2.compareTo(BigDecimal.ZERO) == 0) {
            return "0";
        }
        if (contractEntity == null) {
            return C42180b.m92640e(bigDecimal2, null, 0, false, false, false, 0, null, 125, null);
        }
        if (interfaceC41049a == null) {
            interfaceC41049a = C41050b.f91264a.m90019b(contractEntity);
        }
        InterfaceC38213a interfaceC38213aM84629s2 = C37567b.m84629s(contractEntity);
        latestPrice = positionEntity.getLatestPrice();
        if (latestPrice == null) {
            latestPrice = positionEntity.getMarkPrice();
        }
        return C27041f.m66668h(C42828b.m93915p(C42828b.m93906g(interfaceC41049a.mo90008b(interfaceC38213aM84629s2, latestPrice, bigDecimal2, null).toString(), interfaceC41049a.mo90014h(interfaceC38213aM84629s2), true, false, 4, null)));
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ String m84675p(PositionEntity positionEntity, ContractEntity contractEntity, InterfaceC41049a interfaceC41049a, boolean z11, BigDecimal bigDecimal, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            interfaceC41049a = null;
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        if ((i11 & 8) != 0) {
            bigDecimal = null;
        }
        return m84674o(positionEntity, contractEntity, interfaceC41049a, z11, bigDecimal);
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public static final String m84676q(@NotNull PositionEntity positionEntity) {
        Intrinsics.checkNotNullParameter(positionEntity, "<this>");
        BigDecimal bigDecimal = (C27039d.m66656p(positionEntity.getRiskRatio()).compareTo(BigDecimal.ZERO) < 0 || C27039d.m66656p(positionEntity.getRiskRatio()).compareTo(BigDecimal.TEN) > 0) ? new BigDecimal("9.9999") : positionEntity.getRiskRatio();
        return C27041f.m66669i(bigDecimal != null ? C42180b.m92642g(bigDecimal, null, RoundingMode.UP, 0, false, true, true, 5, null) : null, f83535c);
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public static final String m84677r(@NotNull PositionEntity positionEntity) {
        Intrinsics.checkNotNullParameter(positionEntity, "<this>");
        BigDecimal bigDecimalM84659K = m84659K(positionEntity);
        return C27041f.m66669i(bigDecimalM84659K != null ? C42180b.m92642g(bigDecimalM84659K, null, null, 2, false, true, false, 35, null) : null, f83535c);
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public static final String m84678s(@NotNull PositionEntity positionEntity) {
        Intrinsics.checkNotNullParameter(positionEntity, "<this>");
        BigDecimal unrealisedRoePcnt = positionEntity.getUnrealisedRoePcnt();
        return C27041f.m66669i(unrealisedRoePcnt != null ? C42180b.m92642g(unrealisedRoePcnt, null, null, 2, false, true, false, 35, null) : null, f83535c);
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public static final CharSequence m84679t(@NotNull PositionEntity positionEntity) {
        Intrinsics.checkNotNullParameter(positionEntity, "<this>");
        boolean zM84685z = m84685z(positionEntity);
        C27096v0 c27096v0M66905e = new C27096v0().m66905e(zM84685z ? C27017c.f54310a.m66516f(R$string.multi, new Object[0]) : C27017c.f54310a.m66516f(R$string.empty, new Object[0]), C22890g.m54281f(C27017c.f54310a.m66513b(), zM84685z));
        Intrinsics.checkNotNullExpressionValue(c27096v0M66905e, "appendForeground(...)");
        return c27096v0M66905e;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public static final CharSequence m84680u(@NotNull PositionEntity positionEntity) {
        C27096v0 c27096v0M24440e;
        Intrinsics.checkNotNullParameter(positionEntity, "<this>");
        ContractEntity contractEntityM84661b = m84661b(positionEntity);
        return (contractEntityM84661b == null || (c27096v0M24440e = FuturesDisplayNameUtils.f22525a.m24440e(contractEntityM84661b)) == null) ? C27041f.m66669i(positionEntity.getSymbol(), f83535c) : c27096v0M24440e;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public static final String m84681v(@NotNull PositionEntity positionEntity, @Nullable BigDecimal bigDecimal, boolean z11) {
        Intrinsics.checkNotNullParameter(positionEntity, "<this>");
        String strM66668h = C27041f.m66668h(C42828b.m93902c(C27041f.m66669i(bigDecimal != null ? C42180b.m92640e(bigDecimal, null, C37567b.m84623m(m84661b(positionEntity)), true, true, true, 0, null, 97, null) : null, f83535c)));
        return z11 ? C42828b.m93906g(strM66668h, C27041f.m66668h(C27041f.m66677q(positionEntity.getSettleCurrency())), true, false, 4, null) : strM66668h;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ String m84682w(PositionEntity positionEntity, BigDecimal bigDecimal, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return m84681v(positionEntity, bigDecimal, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public static final String m84683x(@NotNull PositionEntity positionEntity) {
        Intrinsics.checkNotNullParameter(positionEntity, "<this>");
        return m84685z(positionEntity) ? "buy" : "sell";
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public static final String m84684y() {
        return f83535c;
    }

    /* JADX INFO: renamed from: z */
    public static final boolean m84685z(@NotNull PositionEntity positionEntity) {
        Intrinsics.checkNotNullParameter(positionEntity, "<this>");
        return C41014a.m89922G(positionEntity.getCurrentQty(), null, 1, null).doubleValue() > 0.0d;
    }
}
