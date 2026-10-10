package v40;

import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import t40.InterfaceC44690a;

/* JADX INFO: renamed from: v40.b */
/* JADX INFO: compiled from: FuturesGridRepository.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\"\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\f2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000fJ\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\f2\u0006\u0010\u0017\u001a\u00020\u0018J6\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\f2&\u0010\u001b\u001a\"\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001cj\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u001dJ\u0016\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\f2\u0006\u0010!\u001a\u00020\"J\u001c\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020%\u0018\u00010$0\f2\u0006\u0010&\u001a\u00020\u000fJ\u0016\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f2\u0006\u0010(\u001a\u00020)J\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010+\u001a\u00020,J\u001e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f2\u0006\u0010.\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020 R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u00060"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/futures/repostory/FuturesGridRepository;", "", "<init>", "()V", "robotSpotApi", "Lcom/kubi/tradingbotkit/business/futures/api/IFuturesGridApi;", "kotlin.jvm.PlatformType", "getRobotSpotApi", "()Lcom/kubi/tradingbotkit/business/futures/api/IFuturesGridApi;", "robotSpotApi$delegate", "Lkotlin/Lazy;", "requestLongShort", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/tradingbotkit/entity/futures/FuturesGridLongShortEntity;", "symbol", "", "requestCurrentSymbolInfo", "Lcom/kubi/tradingbotkit/entity/futures/FuturesGridSymbolInfoEntity;", "requestAiParams", "Lcom/kubi/tradingbotkit/entity/futures/FuturesGridAiParamsEntity;", "direction", "getDefaultSymbol", "Lcom/kubi/tradingbotkit/entity/DefaultSymbolEntity;", "templateType", "", "requestCalculateParams", "Lcom/kubi/tradingbotkit/entity/futures/FutureGridParamsEntity;", "map", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "requestMaxLeverage", "createRobot", "", "createRobotParamsBean", "Lcom/kubi/tradingbotkit/bean/params/CreateRobotParamsBean;", "getRunningList", "", "Lcom/kubi/tradingbotkit/entity/futures/FuturesGridStrategyEntity;", "type", "shutdownFuturesGrid", "stopBean", "Lcom/kubi/tradingbotkit/bean/params/StopBean;", "requestAddDeposit", "futuresAddDepositBean", "Lcom/kubi/tradingbotkit/bean/params/futures/FuturesAddDepositBean;", "calculateRunningBlowUpPrice", "addAmount", "taskId", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45419b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f102443a = LazyKt.lazy(new Function0() { // from class: v40.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45419b.m100374b();
        }
    });

    /* JADX INFO: renamed from: b */
    public static final InterfaceC44690a m100374b() {
        return (InterfaceC44690a) C42597a.m93387c().create(InterfaceC44690a.class);
    }
}
