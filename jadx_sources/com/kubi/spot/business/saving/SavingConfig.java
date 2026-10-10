package com.kubi.spot.business.saving;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.spot.business.holder.AdvancedLimitOrderHolder;
import com.kubi.spot.business.holder.BaseOrderHolder;
import com.kubi.spot.business.holder.LimitOrderHolder;
import com.kubi.spot.business.holder.x2;
import com.kubi.spot.business.holder.z;
import com.kubi.user.config.UserInfo;
import id.C38519a;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: renamed from: com.kubi.spot.business.saving.p, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SavingConfig.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001 B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000b\u001a\u00020\u0005J\u0016\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005J\u0006\u0010\u0018\u001a\u00020\u0005J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\nJ\u000e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\nJ\u0015\u0010\r\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u001dJ\u0012\u0010\u001e\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0011H\u0002J\u0012\u0010\u001e\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0002J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005H\u0002R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m90084d2 = {"Lcom/kubi/spot/business/saving/SavingConfig;", "", "<init>", "()V", "isGrayBizEnable", "", "()Z", "isEarnSavingsEnabled", "savingModeChangeEventListeners", "", "Lcom/kubi/spot/business/saving/SavingConfig$ISavingModeChangeEvent;", "isSupportSavingVersion", "isSupportSavingOrder", "isSpotNormalLimitOrder", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "orderHolder", "Lcom/kubi/spot/business/holder/BaseOrderHolder;", "isSupportUseSavingBalanceForTrade", "isSupportSymbol", "symbol", "updateSavingTradeMode", "", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "isEnableSavingOrderModel", "registerSavingModelChangeEvent", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "unregisterSavingModelChangeEvent", "order", "isSpotNormalLimitOrder$SpotLib_googleRelease", "isNotAuctionTrade", "notifySavingModeChangeEvent", "ISavingModeChangeEvent", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSavingConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavingConfig.kt\ncom/kubi/spot/business/saving/SavingConfig\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,168:1\n35#2,4:169\n39#2:175\n44#3,2:173\n126#4,2:176\n135#4,2:178\n1869#5,2:180\n*S KotlinDebug\n*F\n+ 1 SavingConfig.kt\ncom/kubi/spot/business/saving/SavingConfig\n*L\n26#1:169,4\n26#1:175\n26#1:173,2\n120#1:176,2\n132#1:178,2\n164#1:180,2\n*E\n"})
public final class SavingConfig {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SavingConfig f50323a = new SavingConfig();

    /* JADX INFO: renamed from: b */
    public static final boolean f50324b = C24129b.m58030b(SiteVisibleConfigKey.EARN_SAVINGS);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final List<a> f50325c = new ArrayList();

    /* JADX INFO: renamed from: com.kubi.spot.business.saving.p$a */
    /* JADX INFO: compiled from: SavingConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/spot/business/saving/SavingConfig$ISavingModeChangeEvent;", "", "onChange", "", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo61347a(boolean z11);
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.saving.p$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class b extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: a */
    public final boolean m61333a() {
        return UserInfo.a.n() && m61340h() && C46392a.m102322d(C38519a.f86479a.m87135j(), false);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m61334b() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new b().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_saving_balance_order_enable", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        Boolean bool = (Boolean) objM20457a;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m61335c(SymbolInfoEntity symbolInfoEntity) {
        return !(symbolInfoEntity != null ? Intrinsics.areEqual(symbolInfoEntity.getEnableAuctionTrade(), Boolean.TRUE) : false);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m61336d(BaseOrderHolder baseOrderHolder) {
        z parentBehavior;
        return m61335c((baseOrderHolder == null || (parentBehavior = baseOrderHolder.getParentBehavior()) == null) ? null : parentBehavior.N());
    }

    /* JADX INFO: renamed from: e */
    public final boolean m61337e(@NotNull BaseOrderHolder order) {
        Intrinsics.checkNotNullParameter(order, "order");
        return (order instanceof LimitOrderHolder) && (order.getDiffTradeImp() instanceof x2) && !(order instanceof AdvancedLimitOrderHolder) && !order.o0();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m61338f(@NotNull BaseOrderHolder orderHolder) {
        Intrinsics.checkNotNullParameter(orderHolder, "orderHolder");
        return UserInfo.a.n() && m61340h() && m61337e(orderHolder) && m61335c(orderHolder.getParentBehavior().N());
    }

    /* JADX INFO: renamed from: g */
    public final boolean m61339g(boolean z11, @NotNull SymbolInfoEntity symbolInfo) {
        Intrinsics.checkNotNullParameter(symbolInfo, "symbolInfo");
        return UserInfo.a.n() && m61340h() && z11 && m61335c(symbolInfo);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m61341i(@Nullable SymbolInfoEntity symbolInfoEntity) {
        return UserInfo.a.n() && m61340h() && m61335c(symbolInfoEntity);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m61342j(@NotNull BaseOrderHolder orderHolder) {
        Intrinsics.checkNotNullParameter(orderHolder, "orderHolder");
        return UserInfo.a.n() && m61340h() && m61337e(orderHolder) && m61336d(orderHolder) && m61333a();
    }

    /* JADX INFO: renamed from: k */
    public final void m61343k(boolean z11) {
        Iterator<T> it = f50325c.iterator();
        while (it.hasNext()) {
            ((a) it.next()).mo61347a(z11);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m61344l(@NotNull a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        f50325c.add(listener);
    }

    /* JADX INFO: renamed from: m */
    public final void m61345m(@NotNull a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        f50325c.remove(listener);
    }

    /* JADX INFO: renamed from: n */
    public final void m61346n(boolean z11) {
        if (UserInfo.a.n() && m61340h()) {
            C46392a.m102328k(C38519a.f86479a.m87135j(), z11);
            m61343k(z11);
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m61340h() {
        if (m61334b() && f50324b) {
            return true;
        }
        return false;
    }
}
