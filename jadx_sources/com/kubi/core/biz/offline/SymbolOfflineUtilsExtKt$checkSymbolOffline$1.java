package com.kubi.core.biz.offline;

import com.kubi.sdk.BaseFragment;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SymbolOfflineUtilsExt.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.offline.SymbolOfflineUtilsExtKt$checkSymbolOffline$1", m90122f = "SymbolOfflineUtilsExt.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SymbolOfflineUtilsExtKt$checkSymbolOffline$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $showSymbol;
    final /* synthetic */ String $suppressKey;
    final /* synthetic */ String $symbol;
    final /* synthetic */ BaseFragment $this_checkSymbolOffline;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SymbolOfflineUtilsExtKt$checkSymbolOffline$1(String str, BaseFragment baseFragment, String str2, String str3, Continuation<? super SymbolOfflineUtilsExtKt$checkSymbolOffline$1> continuation) {
        super(2, continuation);
        this.$symbol = str;
        this.$this_checkSymbolOffline = baseFragment;
        this.$showSymbol = str2;
        this.$suppressKey = str3;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SymbolOfflineUtilsExtKt$checkSymbolOffline$1(this.$symbol, this.$this_checkSymbolOffline, this.$showSymbol, this.$suppressKey, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SymbolOfflineUtilsExtKt$checkSymbolOffline$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            SymbolOfflineData symbolOfflineDataM22081c = SymbolsOfflineManager.f20563a.m22081c(this.$symbol);
            if (symbolOfflineDataM22081c != null) {
                SymbolOfflineUtilsExtKt.m22074j(this.$this_checkSymbolOffline, symbolOfflineDataM22081c, this.$showSymbol, null, this.$suppressKey, 4, null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
