package com.kubi.tradingbotkit.business.strategyList.viewModel;

import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44127a;

/* JADX INFO: renamed from: com.kubi.tradingbotkit.business.strategyList.viewModel.b */
/* JADX INFO: compiled from: StrategyListViewModel.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"LogOfException", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "getLogOfException", "()Lkotlinx/coroutines/CoroutineExceptionHandler;", "TradingBotKitLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStrategyListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StrategyListViewModel.kt\ncom/kubi/tradingbotkit/business/strategyList/viewModel/StrategyListViewModelKt\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,287:1\n47#2,4:288\n*S KotlinDebug\n*F\n+ 1 StrategyListViewModel.kt\ncom/kubi/tradingbotkit/business/strategyList/viewModel/StrategyListViewModelKt\n*L\n285#1:288,4\n*E\n"})
public final class C26205b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final CoroutineExceptionHandler f52448a = new a(CoroutineExceptionHandler.INSTANCE);

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.strategyList.viewModel.b$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 StrategyListViewModel.kt\ncom/kubi/tradingbotkit/business/strategyList/viewModel/StrategyListViewModelKt\n*L\n1#1,49:1\n286#2,2:50\n*E\n"})
    public static final class a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C44127a.m97247g("LogOfException", exception);
        }

        public a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final CoroutineExceptionHandler m64158a() {
        return f52448a;
    }
}
