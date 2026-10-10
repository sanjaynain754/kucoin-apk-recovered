package com.kubi.spot.helper;

import com.kubi.data.entity.SymbolPreviewEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.spot.exeption.SpotMessage;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37762n;
import gf.C37890n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.spot.helper.l, reason: from Kotlin metadata */
/* JADX INFO: compiled from: MarketHelper.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f¢\u0006\u0002\u0010\u000eJC\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f¢\u0006\u0002\u0010\u0010JC\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fH\u0002¢\u0006\u0002\u0010\u0010JO\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fH\u0002¢\u0006\u0002\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0002\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u0005*\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0002J\u0018\u0010\u0019\u001a\u00020\u0005*\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0002¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/spot/helper/MarketHelper;", "", "<init>", "()V", "handleSymbolClick", "", "symbol", "", "fromType", "", "spmId", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Lcom/kubi/data/entity/TradeItemBean;", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "data", "(Lcom/kubi/data/entity/TradeItemBean;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "refreshData", "handleJumpTask", "it", "Lcom/kubi/data/entity/SymbolPreviewEntity;", "(Lcom/kubi/data/entity/TradeItemBean;Ljava/lang/Integer;Ljava/lang/String;Lcom/kubi/data/entity/SymbolPreviewEntity;Lkotlin/jvm/functions/Function1;)V", "compatJump", "(Ljava/lang/String;Ljava/lang/Integer;)V", "goMarketSpotReady", "goMarketSpot", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketHelper.kt\ncom/kubi/spot/helper/MarketHelper\n+ 2 SpotIssue.kt\ncom/kubi/spot/exeption/SpotIssueKt\n*L\n1#1,196:1\n52#2,2:197\n52#2,2:199\n*S KotlinDebug\n*F\n+ 1 MarketHelper.kt\ncom/kubi/spot/helper/MarketHelper\n*L\n61#1:197,2\n161#1:199,2\n*E\n"})
public final class MarketHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final MarketHelper f50590a = new MarketHelper();

    /* JADX INFO: renamed from: a */
    public final void m61818a(String str, Integer num) {
        m61815c(this, str, null, 1, null);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m61815c(MarketHelper marketHelper, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str2 = null;
        }
        marketHelper.m61819b(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m61816e(MarketHelper marketHelper, TradeItemBean tradeItemBean, Integer num, String str, SymbolPreviewEntity symbolPreviewEntity, Function1 function1, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = null;
        }
        if ((i11 & 8) != 0) {
            symbolPreviewEntity = null;
        }
        if ((i11 & 16) != 0) {
            function1 = null;
        }
        marketHelper.m61820d(tradeItemBean, num, str, symbolPreviewEntity, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m61817h(MarketHelper marketHelper, String str, Integer num, String str2, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = 0;
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        marketHelper.m61822g(str, num, str2, function1);
    }

    /* JADX INFO: renamed from: b */
    public final void m61819b(String str, String str2) {
        InterfaceC37762n.a.m85177a(C37304a.f82764a, str, str2, null, null, 12, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m61820d(TradeItemBean tradeItemBean, Integer num, String str, SymbolPreviewEntity symbolPreviewEntity, Function1<? super TradeItemBean, Unit> function1) {
        Integer num2 = (num != null && num.intValue() == 1 && tradeItemBean.getSymbolInfoEntity().isPreviewEnableShow()) ? 0 : num;
        if ((num2 != null && num2.intValue() == 0) || (num2 != null && num2.intValue() == 2)) {
            InterfaceC37762n.a.m85177a(C37304a.f82764a, tradeItemBean.getSymbol(), str, null, null, 12, null);
            tradeItemBean.setSymbolInfoEntity(null);
            return;
        }
        if (num2 != null && num2.intValue() == 1) {
            if (function1 != null) {
                function1.invoke(tradeItemBean);
                return;
            }
            return;
        }
        String symbol = tradeItemBean.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        m61818a(symbol, num);
        C43846g.m96568c(new SpotMessage("fromType: " + num + ", symbol: " + tradeItemBean.getSymbol(), "MarketHelper", false, 4, null), null, 2, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m61821f(@NotNull TradeItemBean data, @Nullable Integer num, @Nullable String str, @Nullable Function1<? super TradeItemBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(data, "data");
        m61816e(this, data, num, str, null, function1, 8, null);
    }

    /* JADX INFO: renamed from: g */
    public final void m61822g(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable Function1<? super TradeItemBean, Unit> function1) {
        if (str == null || str.length() == 0) {
            return;
        }
        TradeItemBean tradeItemBeanM85603D = C37890n.f85269a.m85603D(str);
        if (tradeItemBeanM85603D != null) {
            m61821f(tradeItemBeanM85603D, num, str2, function1);
            return;
        }
        m61818a(str, num);
        C43846g.m96568c(new SpotMessage("handleSymbolClick data is null，but fromType: " + num + ", symbol: " + str, "MarketHelper", false, 4, null), null, 2, null);
    }
}
