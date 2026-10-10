package com.kubi.core.biz.offline;

import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.core.base.p076ui.ImportInfoDisplayData;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.sdk.BaseFragment;
import com.kubi.tradecorebiz.R$string;
import com.kubi.utils.extensions.C27041f;
import gf.C37890n;
import id.C38519a;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p367jd.C40390d;
import p429lf.C42179a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: SymbolOfflineUtilsExt.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003\u001a\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0000\u001a\u0012\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0000\u001a$\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u001a0\u0010\u0010\u001a\u00020\u0011*\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u001aW\u0010\u0015\u001a\u00020\u0011*\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00072%\b\u0002\u0010\u0017\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0018\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"SYMBOL_OFFLINE_TIP_AUTO_SUPPRESS_DURATION_MILLIS", "", "buildSymbolOfflineTipSuppressKey", "", "tradeType", "symbol", "isAutoOfflineTipSuppressed", "", "suppressUntil", "currentTime", "nextAutoOfflineTipSuppressUntil", "checkSymbolOffline", "Lkotlinx/coroutines/Job;", "Lcom/kubi/sdk/BaseFragment;", "showSymbol", "suppressKey", "showAutoOfflineTipDialog", "", "offlineInfo", "Lcom/kubi/core/biz/offline/SymbolOfflineData;", "contentTip", "showOfflineTipDialog", "supportNotShowAnyMore", "confirmCallback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "isNotShowAnyMore", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSymbolOfflineUtilsExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SymbolOfflineUtilsExt.kt\ncom/kubi/core/biz/offline/SymbolOfflineUtilsExtKt\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,116:1\n84#2:117\n75#2,2:118\n*S KotlinDebug\n*F\n+ 1 SymbolOfflineUtilsExt.kt\ncom/kubi/core/biz/offline/SymbolOfflineUtilsExtKt\n*L\n53#1:117\n62#1:118,2\n*E\n"})
public final class SymbolOfflineUtilsExtKt {
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m22067c(@NotNull String tradeType, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return tradeType + '_' + symbol;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final InterfaceC41775x1 m22068d(@NotNull BaseFragment baseFragment, @NotNull String symbol, @NotNull String showSymbol, @NotNull String suppressKey) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(showSymbol, "showSymbol");
        Intrinsics.checkNotNullParameter(suppressKey, "suppressKey");
        return LifecycleOwnerKt.getLifecycleScope(baseFragment).launchWhenCreated(new SymbolOfflineUtilsExtKt$checkSymbolOffline$1(symbol, baseFragment, showSymbol, suppressKey, null));
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m22069e(long j11, long j12) {
        return j11 > j12;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ boolean m22070f(long j11, long j12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j12 = System.currentTimeMillis();
        }
        return m22069e(j11, j12);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ long m22072h(long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = System.currentTimeMillis();
        }
        return m22071g(j11);
    }

    /* JADX INFO: renamed from: i */
    public static final void m22073i(@NotNull BaseFragment baseFragment, @NotNull SymbolOfflineData offlineInfo, @NotNull String showSymbol, @Nullable String str, @NotNull String suppressKey) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(offlineInfo, "offlineInfo");
        Intrinsics.checkNotNullParameter(showSymbol, "showSymbol");
        Intrinsics.checkNotNullParameter(suppressKey, "suppressKey");
        final StorageId<Long> storageIdM87126a = C38519a.f86479a.m87126a(suppressKey);
        if (m22070f(C46392a.m102324f(storageIdM87126a, 0L), 0L, 2, null)) {
            return;
        }
        m22076l(baseFragment, offlineInfo, showSymbol, str, true, new Function1() { // from class: com.kubi.core.biz.offline.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SymbolOfflineUtilsExtKt.m22075k(storageIdM87126a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m22074j(BaseFragment baseFragment, SymbolOfflineData symbolOfflineData, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        if ((i11 & 8) != 0 && (str3 = symbolOfflineData.getSymbol()) == null) {
            str3 = str;
        }
        m22073i(baseFragment, symbolOfflineData, str, str2, str3);
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m22075k(StorageId storageId, boolean z11) {
        if (z11) {
            C46392a.m102330m(storageId, m22072h(0L, 1, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final void m22076l(@NotNull BaseFragment baseFragment, @NotNull SymbolOfflineData offlineInfo, @NotNull String showSymbol, @Nullable String str, boolean z11, @Nullable Function1<? super Boolean, Unit> function1) {
        String str2;
        String string;
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(offlineInfo, "offlineInfo");
        Intrinsics.checkNotNullParameter(showSymbol, "showSymbol");
        Long offlineTime = offlineInfo.getOfflineTime();
        if (offlineTime != null) {
            long jLongValue = offlineTime.longValue();
            Long showStartTime = offlineInfo.getShowStartTime();
            if (showStartTime != null) {
                final long jLongValue2 = showStartTime.longValue();
                Long showEndTime = offlineInfo.getShowEndTime();
                if (showEndTime != null) {
                    final long jLongValue3 = showEndTime.longValue();
                    Long lM22084a = offlineInfo.m22084a();
                    if (str == null) {
                        if (lM22084a == null || lM22084a.longValue() <= System.currentTimeMillis()) {
                            string = baseFragment.getString(R$string.kc_trade_offline_spot_tip, showSymbol, C42179a.m92633f(jLongValue, null, false, true, null, 11, null));
                        } else {
                            SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(offlineInfo.getSymbol());
                            int i11 = R$string.kc_trade_offline_withdraw_tip;
                            String strM66668h = C27041f.m66668h(C42179a.m92633f(offlineInfo.getOfflineTime().longValue(), null, false, true, null, 11, null));
                            String strM92633f = C42179a.m92633f(lM22084a.longValue(), null, false, true, null, 11, null);
                            String strM22085b = offlineInfo.m22085b(symbolInfoEntityM85601B);
                            if (strM22085b == null) {
                                strM22085b = "";
                            }
                            string = baseFragment.getString(i11, showSymbol, strM66668h, strM92633f, strM22085b);
                        }
                        Intrinsics.checkNotNull(string);
                        str2 = string;
                    } else {
                        str2 = str;
                    }
                    String string2 = baseFragment.getString(R$string.kc_trade_symbol_offline_soon);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    String string3 = baseFragment.getString(R$string.i_already_know);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    C40390d.m89009d(baseFragment, new ImportInfoDisplayData("showOfflineTipDialog", string2, str2, string3, z11, offlineInfo.getLink(), function1), new Function0() { // from class: com.kubi.core.biz.offline.b
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(SymbolOfflineUtilsExtKt.m22078n(jLongValue2, jLongValue3));
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m22077m(BaseFragment baseFragment, SymbolOfflineData symbolOfflineData, String str, String str2, boolean z11, Function1 function1, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        if ((i11 & 16) != 0) {
            function1 = null;
        }
        m22076l(baseFragment, symbolOfflineData, str, str2, z11, function1);
    }

    /* JADX INFO: renamed from: g */
    public static final long m22071g(long j11) {
        return j11 + 86400000;
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m22078n(long j11, long j12) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j11 <= jCurrentTimeMillis && jCurrentTimeMillis <= j12) {
            return true;
        }
        return false;
    }
}
