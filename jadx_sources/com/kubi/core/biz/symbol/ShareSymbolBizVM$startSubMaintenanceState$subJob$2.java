package com.kubi.core.biz.symbol;

import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ShareSymbolBizVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.symbol.ShareSymbolBizVM$startSubMaintenanceState$subJob$2", m90122f = "ShareSymbolBizVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nShareSymbolBizVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareSymbolBizVM.kt\ncom/kubi/core/biz/symbol/ShareSymbolBizVM$startSubMaintenanceState$subJob$2\n+ 2 ShareSymbolBizVM.kt\ncom/kubi/core/biz/symbol/ShareSymbolBizVM\n*L\n1#1,272:1\n265#2,3:273\n*S KotlinDebug\n*F\n+ 1 ShareSymbolBizVM.kt\ncom/kubi/core/biz/symbol/ShareSymbolBizVM$startSubMaintenanceState$subJob$2\n*L\n254#1:273,3\n*E\n"})
public final class ShareSymbolBizVM$startSubMaintenanceState$subJob$2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $symbol;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ ShareSymbolBizVM this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareSymbolBizVM$startSubMaintenanceState$subJob$2(ShareSymbolBizVM shareSymbolBizVM, String str, Continuation<? super ShareSymbolBizVM$startSubMaintenanceState$subJob$2> continuation) {
        super(2, continuation);
        this.this$0 = shareSymbolBizVM;
        this.$symbol = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ShareSymbolBizVM$startSubMaintenanceState$subJob$2 shareSymbolBizVM$startSubMaintenanceState$subJob$2 = new ShareSymbolBizVM$startSubMaintenanceState$subJob$2(this.this$0, this.$symbol, continuation);
        shareSymbolBizVM$startSubMaintenanceState$subJob$2.Z$0 = ((Boolean) obj).booleanValue();
        return shareSymbolBizVM$startSubMaintenanceState$subJob$2;
    }

    public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
        return ((ShareSymbolBizVM$startSubMaintenanceState$subJob$2) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z11 = this.Z$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (Intrinsics.areEqual(this.this$0.f20866X, this.$symbol)) {
            ShareSymbolBizVM shareSymbolBizVM = this.this$0;
            SymbolBizUiState symbolBizUiState = (SymbolBizUiState) CollectionsKt.lastOrNull((List) shareSymbolBizVM.f20871c0.mo86421a());
            if (symbolBizUiState != null) {
                shareSymbolBizVM.f20871c0.mo90855d(SymbolBizUiState.copy$default(symbolBizUiState, null, null, null, false, z11, false, 47, null));
            }
        }
        return Unit.INSTANCE;
    }
}
