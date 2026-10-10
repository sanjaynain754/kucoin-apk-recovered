package com.kubi.flutter.widget.kline.interactor;

import com.kubi.flutter.proto.kline.CandleItem;
import com.kubi.flutter.proto.kline.OrderItem;
import com.kubi.flutter.widget.kline.C12802p;
import com.kubi.flutter.widget.kline.IKLineDataInteractor;
import com.kubi.flutter.widget.kline.KLineCdnRange;
import com.kubi.p110rn.Constants;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.C41686h;
import mr.C42597a;
import o00.C42911a;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KLineCommonDataInteractors.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u000f\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0001\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0014J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0014J,\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u001e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0094@¢\u0006\u0002\u0010\u001fJ\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u001e2\u0006\u0010\u0016\u001a\u00020\"H\u0094@¢\u0006\u0002\u0010#J$\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u001e2\u0006\u0010\u0016\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u001bH\u0094@¢\u0006\u0002\u0010%J\u0014\u0010&\u001a\u00020!*\u00020'2\u0006\u0010(\u001a\u00020)H\u0014J\u0014\u0010*\u001a\u00020!*\u00020'2\u0006\u0010(\u001a\u00020)H\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006+"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/interactor/KLineIndexDataInteractor;", "Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;", "<init>", "()V", "marketSocket", "Lcom/kubi/flutter/widget/kline/interactor/IMarketSocket;", "getMarketSocket", "()Lcom/kubi/flutter/widget/kline/interactor/IMarketSocket;", "marketSocket$delegate", "Lkotlin/Lazy;", "marketApi", "Lcom/kubi/flutter/widget/kline/interactor/IMarketApi;", "getMarketApi", "()Lcom/kubi/flutter/widget/kline/interactor/IMarketApi;", "marketApi$delegate", "toCandleItem", "Lcom/kubi/flutter/proto/kline/CandleItem;", "", "", "source", "([Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/flutter/proto/kline/CandleItem;", "getTopic", "param", "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$DataParam;", "buildKlineRequest", "Lokhttp3/Request;", "begin", "", "end", "fetchCdnKlineList", "", "(Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$DataParam;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchActiveOrderList", "Lcom/kubi/flutter/proto/kline/OrderItem;", "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$OrderParam;", "(Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$OrderParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchHistoryOrderList", "(Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$OrderParam;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toActiveOrderItem", "Lcom/kubi/flutter/widget/kline/KlineOrderEntity;", Constants.BIZ, "Lcom/kubi/flutter/proto/kline/OrderItem$BizType;", "toHistoryOrderItem", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKLineCommonDataInteractors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineCommonDataInteractors.kt\ncom/kubi/flutter/widget/kline/interactor/KLineIndexDataInteractor\n+ 2 KLineContract.kt\ncom/kubi/flutter/widget/kline/KLineContractKt\n+ 3 OrderItemKt.kt\ncom/kubi/flutter/proto/kline/OrderItemKtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,345:1\n8#2:346\n8#3:347\n8#3:349\n1#4:348\n1#4:350\n*S KotlinDebug\n*F\n+ 1 KLineCommonDataInteractors.kt\ncom/kubi/flutter/widget/kline/interactor/KLineIndexDataInteractor\n*L\n152#1:346\n188#1:347\n192#1:349\n188#1:348\n192#1:350\n*E\n"})
public final class KLineIndexDataInteractor extends KLineBaseDataInteractor {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f22457b = LazyKt.lazy(new Function0() { // from class: com.kubi.flutter.widget.kline.interactor.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KLineIndexDataInteractor.m24317I();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f22458c = LazyKt.lazy(new Function0() { // from class: com.kubi.flutter.widget.kline.interactor.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KLineIndexDataInteractor.m24316H();
        }
    });

    /* JADX INFO: renamed from: F */
    public final IMarketApi m24318F() {
        Object value = this.f22458c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IMarketApi) value;
    }

    /* JADX INFO: renamed from: G */
    public final IMarketSocket m24319G() {
        Object value = this.f22457b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IMarketSocket) value;
    }

    @Override // com.kubi.flutter.widget.kline.interactor.KLineBaseDataInteractor
    @NotNull
    /* JADX INFO: renamed from: q */
    public Request mo24306q(@NotNull IKLineDataInteractor.DataParam param, long j11, long j12) {
        Intrinsics.checkNotNullParameter(param, "param");
        long j13 = 1000;
        KLineCdnRange kLineCdnRangeM24368c = C12802p.m24368c(param.getType(), System.currentTimeMillis() / j13);
        return m24319G().m24350b(param.getSymbol(), param.getType().getName(), kLineCdnRangeM24368c.getBegin() * j13, kLineCdnRangeM24368c.getEnd() * j13);
    }

    @Override // com.kubi.flutter.widget.kline.interactor.KLineBaseDataInteractor
    @NotNull
    /* JADX INFO: renamed from: v */
    public String mo24311v(@NotNull IKLineDataInteractor.DataParam param) {
        Intrinsics.checkNotNullParameter(param, "param");
        String str = String.format("/index/candles:%s", Arrays.copyOf(new Object[]{param.getSymbol() + '_' + param.getType().getType()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @Override // com.kubi.flutter.widget.kline.interactor.KLineBaseDataInteractor
    @NotNull
    /* JADX INFO: renamed from: z */
    public CandleItem mo24312z(@NotNull String[] strArr, @NotNull String source) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        return C12789i.m24352b(strArr);
    }

    /* JADX INFO: renamed from: H */
    public static final IMarketApi m24316H() {
        return (IMarketApi) C42597a.m93391g().create(IMarketApi.class);
    }

    /* JADX INFO: renamed from: I */
    public static final IMarketSocket m24317I() {
        return (IMarketSocket) C42597a.m93390f().create(IMarketSocket.class);
    }

    @Override // com.kubi.flutter.widget.kline.interactor.KLineBaseDataInteractor
    @Nullable
    /* JADX INFO: renamed from: r */
    public Object mo24307r(@NotNull IKLineDataInteractor.OrderParam orderParam, @NotNull Continuation<? super List<OrderItem>> continuation) {
        return CollectionsKt.emptyList();
    }

    @Override // com.kubi.flutter.widget.kline.interactor.KLineBaseDataInteractor
    @Nullable
    /* JADX INFO: renamed from: s */
    public Object mo24308s(@NotNull IKLineDataInteractor.DataParam dataParam, long j11, long j12, @NotNull Continuation<? super List<CandleItem>> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new KLineIndexDataInteractor$fetchCdnKlineList$2(this, dataParam, j11, j12, null), continuation);
    }

    @Override // com.kubi.flutter.widget.kline.interactor.KLineBaseDataInteractor
    @Nullable
    /* JADX INFO: renamed from: t */
    public Object mo24309t(@NotNull IKLineDataInteractor.OrderParam orderParam, long j11, @NotNull Continuation<? super List<OrderItem>> continuation) {
        return CollectionsKt.emptyList();
    }
}
