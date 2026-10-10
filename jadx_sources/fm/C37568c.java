package fm;

import com.facebook.react.uimanager.ViewProps;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.FuturesRemote;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p294gz.C38057a;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import th.InterfaceC44980d;

/* JADX INFO: renamed from: fm.c */
/* JADX INFO: compiled from: OrderEntityEx.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004\u001a\r\u0010\u0007\u001a\u00020\b*\u00020\u0004H\u0086\b\u001a\u0015\u0010\t\u001a\u00020\b*\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0086\b\u001a\u0018\u0010\f\u001a\u00020\r*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000\u001a\r\u0010\u000e\u001a\u00020\r*\u00020\u0004H\u0086\b\u001a\n\u0010\u000f\u001a\u00020\b*\u00020\u0004\u001a\n\u0010\u0010\u001a\u00020\b*\u00020\u0004\u001a\n\u0010\u0011\u001a\u00020\b*\u00020\u0004\u001a\n\u0010\u0012\u001a\u00020\b*\u00020\u0004\u001a\n\u0010\u0013\u001a\u00020\b*\u00020\u0004\u001a\n\u0010\u0014\u001a\u00020\b*\u00020\u0004\u001a\n\u0010\u0015\u001a\u00020\b*\u00020\u0004\u001a\n\u0010\u0016\u001a\u00020\b*\u00020\u0004\u001a\n\u0010\u0017\u001a\u00020\b*\u00020\u0004\u001a\n\u0010\u0018\u001a\u00020\b*\u00020\u0004\u001a\n\u0010\u0019\u001a\u00020\b*\u00020\u0004\u001a\u0006\u0010\u001a\u001a\u00020\b\u001a\n\u0010\u001b\u001a\u00020\b*\u00020\u0004\u001a\n\u0010\u001c\u001a\u00020\b*\u00020\u0004\u001a\n\u0010\u001d\u001a\u00020\b*\u00020\u0004\u001a\n\u0010\u001e\u001a\u00020\b*\u00020\u0004\u001a\n\u0010\u001f\u001a\u00020\b*\u00020\u0004\u001a\n\u0010 \u001a\u00020\r*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m90084d2 = {"lock", "", "contractCache", "Ljava/util/WeakHashMap;", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "contract", "isBuyMore", "", "isProfit", "positionEntity", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "getStopPriceShow", "", "getStopTypeShow", "isCross", "isLimit", "isMarket", "isAdvancedOfPostOnly", "isHidden", "isStopLimit", "isStopMarket", "isTso", "isTwap", "isSupportModify", "isSupportModifyEntry", "isSupportModifyByConfig", "isReduceOrder", "isActiveTwapOrder", "isTpslOrder", "isPosTpOrder", "isPosSlOrder", "trackType", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37568c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Object f83531a = new Object();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final WeakHashMap<OrderEntity, ContractEntity> f83532b = new WeakHashMap<>();

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final ContractEntity m84630a(@NotNull OrderEntity orderEntity) {
        ContractEntity contractEntityM99529O;
        Intrinsics.checkNotNullParameter(orderEntity, "<this>");
        synchronized (f83531a) {
            WeakHashMap<OrderEntity, ContractEntity> weakHashMap = f83532b;
            contractEntityM99529O = weakHashMap.get(orderEntity);
            if (contractEntityM99529O == null) {
                contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(orderEntity.getSymbol()), false, 2, null);
                weakHashMap.put(orderEntity, contractEntityM99529O);
            }
        }
        return contractEntityM99529O;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m84631b(@NotNull OrderEntity orderEntity, @Nullable ContractEntity contractEntity) {
        BigDecimal bigDecimalM11724a;
        Intrinsics.checkNotNullParameter(orderEntity, "<this>");
        String plainString = null;
        if (contractEntity == null) {
            BigDecimal stopPrice = orderEntity.getStopPrice();
            if (stopPrice != null && (bigDecimalM11724a = C6447a.m11724a(stopPrice)) != null) {
                plainString = bigDecimalM11724a.toPlainString();
            }
            return C27041f.m66669i(plainString, C37569d.m84684y());
        }
        if (Intrinsics.areEqual(orderEntity.getStopPriceType(), "TP")) {
            BigDecimal stopPrice2 = orderEntity.getStopPrice();
            return C27041f.m66668h(stopPrice2 != null ? C42180b.m92640e(stopPrice2, null, C27039d.m66650j(Integer.valueOf(C37567b.m84618h(contractEntity))), true, false, true, 0, null, 105, null) : null);
        }
        BigDecimal stopPrice3 = orderEntity.getStopPrice();
        return C27041f.m66668h(stopPrice3 != null ? C42180b.m92640e(stopPrice3, null, C27039d.m66651k(Integer.valueOf(C37567b.m84612b(contractEntity)), 2), true, false, true, 0, null, 105, null) : null);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m84632c(@NotNull OrderEntity orderEntity) {
        Intrinsics.checkNotNullParameter(orderEntity, "<this>");
        return Intrinsics.areEqual(orderEntity.getStatus(), "OPEN") || Intrinsics.areEqual(orderEntity.getStatus(), "TRIGGERING") || Intrinsics.areEqual(orderEntity.getStatus(), "CANCELING") || Intrinsics.areEqual(orderEntity.getStatus(), "PAUSED");
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m84633d(@NotNull OrderEntity orderEntity) {
        Intrinsics.checkNotNullParameter(orderEntity, "<this>");
        return Intrinsics.areEqual(orderEntity.getType(), TUIConstants.TUIContact.LIMIT) && C27025c.m66566d(orderEntity.getPostOnly()) && !C27025c.m66566d(orderEntity.getHidden()) && !C27025c.m66566d(orderEntity.getIceberg());
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m84634e(@NotNull OrderEntity orderEntity) {
        Intrinsics.checkNotNullParameter(orderEntity, "<this>");
        return Intrinsics.areEqual(orderEntity.getMarginMode(), "CROSS");
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m84635f(@NotNull OrderEntity orderEntity) {
        Intrinsics.checkNotNullParameter(orderEntity, "<this>");
        if (!Intrinsics.areEqual(orderEntity.getType(), TUIConstants.TUIContact.LIMIT) || C27025c.m66566d(orderEntity.getPostOnly())) {
            return false;
        }
        return C27025c.m66566d(orderEntity.getHidden()) || C27025c.m66566d(orderEntity.getIceberg());
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m84636g(@NotNull OrderEntity orderEntity) {
        Intrinsics.checkNotNullParameter(orderEntity, "<this>");
        return (!Intrinsics.areEqual(orderEntity.getType(), TUIConstants.TUIContact.LIMIT) || C27025c.m66566d(orderEntity.getPostOnly()) || C27025c.m66566d(orderEntity.getHidden()) || C27025c.m66566d(orderEntity.getIceberg()) || !C41014a.m89917B(orderEntity.getCallbackRate())) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m84637h(@NotNull OrderEntity orderEntity) {
        Intrinsics.checkNotNullParameter(orderEntity, "<this>");
        return Intrinsics.areEqual(orderEntity.getType(), "market") && C41014a.m89917B(orderEntity.getStopPrice()) && C41014a.m89917B(orderEntity.getCallbackRate());
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m84638i(@NotNull OrderEntity orderEntity) {
        Intrinsics.checkNotNullParameter(orderEntity, "<this>");
        return m84645p(orderEntity) && ((Intrinsics.areEqual(orderEntity.getSide(), "sell") && Intrinsics.areEqual(orderEntity.getStop(), "up")) || (Intrinsics.areEqual(orderEntity.getSide(), "buy") && Intrinsics.areEqual(orderEntity.getStop(), "down")));
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m84639j(@NotNull OrderEntity orderEntity) {
        Intrinsics.checkNotNullParameter(orderEntity, "<this>");
        return C27025c.m66566d(orderEntity.getCloseOrder()) || C27025c.m66566d(orderEntity.getCloseOnly());
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m84640k(@NotNull OrderEntity orderEntity) {
        Intrinsics.checkNotNullParameter(orderEntity, "<this>");
        return Intrinsics.areEqual(orderEntity.getType(), TUIConstants.TUIContact.LIMIT) && !C41014a.m89917B(orderEntity.getStopPrice());
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m84641l(@NotNull OrderEntity orderEntity) {
        Intrinsics.checkNotNullParameter(orderEntity, "<this>");
        return Intrinsics.areEqual(orderEntity.getType(), "market") && !C41014a.m89917B(orderEntity.getStopPrice());
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m84642m(@NotNull OrderEntity orderEntity) {
        Intrinsics.checkNotNullParameter(orderEntity, "<this>");
        String strMo24997Y = RepositoryServiceLocator.f19236a.m20288g().mo24997Y(C27041f.m66668h(orderEntity.getSymbol()));
        boolean zM85928a = C38057a.f85671a.m85928a("kcApp.B6FuturesTrade.openorder.modify.1", true);
        boolean zMo64979C = IUnifyAccountService.f53155a.get().mo64979C();
        if (m84645p(orderEntity)) {
            if (!Intrinsics.areEqual(strMo24997Y, "Open") || orderEntity.isTrialFunds() || zMo64979C || !zM85928a || !FuturesRemote.f23108a.m25653t() || !C24129b.m58030b(SiteVisibleConfigKey.TpslOrderModify)) {
                return false;
            }
        } else if ((!Intrinsics.areEqual(orderEntity.getType(), TUIConstants.TUIContact.LIMIT) && !m84647r(orderEntity)) || !Intrinsics.areEqual(strMo24997Y, "Open") || orderEntity.isTrialFunds() || !C41014a.m89917B(orderEntity.getStopPrice()) || !C41014a.m89917B(orderEntity.getCallbackRate()) || !zM85928a || !FuturesRemote.f23108a.m25653t()) {
            return false;
        }
        return BrokerConfig.f19211a.m20201d().mo20232T();
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m84643n() {
        return BrokerConfig.f19211a.m20201d().mo20232T() && C38057a.f85671a.m85928a("kcApp.B6FuturesTrade.openorder.modify.1", true) && FuturesRemote.f23108a.m25653t();
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m84644o(@NotNull OrderEntity orderEntity) {
        Intrinsics.checkNotNullParameter(orderEntity, "<this>");
        if (!IUnifyAccountService.f53155a.get().mo64979C()) {
            return m84642m(orderEntity);
        }
        String strMo24997Y = RepositoryServiceLocator.f19236a.m20288g().mo24997Y(C27041f.m66668h(orderEntity.getSymbol()));
        boolean zM85928a = C38057a.f85671a.m85928a("kcApp.B6FuturesTrade.openorder.modify.1", true);
        if (Intrinsics.areEqual(strMo24997Y, "Open") && !orderEntity.isTrialFunds() && C41014a.m89917B(orderEntity.getStopPrice()) && C41014a.m89917B(orderEntity.getCallbackRate())) {
            return (m84636g(orderEntity) || m84633d(orderEntity)) && zM85928a && FuturesRemote.f23108a.m25653t();
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m84645p(@NotNull OrderEntity orderEntity) {
        String stop;
        String stopPriceType;
        Intrinsics.checkNotNullParameter(orderEntity, "<this>");
        if ((!m84641l(orderEntity) && !m84640k(orderEntity)) || (stop = orderEntity.getStop()) == null || stop.length() == 0 || C41014a.m89917B(orderEntity.getStopPrice()) || (stopPriceType = orderEntity.getStopPriceType()) == null || stopPriceType.length() == 0) {
            return false;
        }
        return C27025c.m66566d(orderEntity.getCloseOnly()) || C27025c.m66566d(orderEntity.getCloseOrder());
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m84646q(@NotNull OrderEntity orderEntity) {
        Intrinsics.checkNotNullParameter(orderEntity, "<this>");
        return !C41014a.m89917B(orderEntity.getCallbackRate());
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m84647r(@NotNull OrderEntity orderEntity) {
        Intrinsics.checkNotNullParameter(orderEntity, "<this>");
        return Intrinsics.areEqual(orderEntity.getAdvancedType(), "twap");
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public static final String m84648s(@NotNull OrderEntity orderEntity) {
        Intrinsics.checkNotNullParameter(orderEntity, "<this>");
        if (m84636g(orderEntity)) {
            return TUIConstants.TUIContact.LIMIT;
        }
        if (m84637h(orderEntity)) {
            return "market";
        }
        if (m84640k(orderEntity)) {
            return "limitStop";
        }
        if (m84641l(orderEntity)) {
            return "marketStop";
        }
        if (m84635f(orderEntity)) {
            return ViewProps.HIDDEN;
        }
        if (m84646q(orderEntity)) {
            return "trailingStop";
        }
        return m84633d(orderEntity) ? ViewProps.HIDDEN : "none";
    }
}
