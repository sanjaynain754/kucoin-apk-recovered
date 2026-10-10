package com.kubi.assets.margin.isolated;

import com.kubi.assets.service.AssetsHelper;
import com.kubi.data.coin.TransferJumper;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.transfer.api.ITransferService;
import com.kubi.transfer.entity.Quote;
import com.kubi.transfer.entity.SearchSymbolEntity;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: AssetV2IsolatedHeaderView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.margin.isolated.AssetV2IsolatedHeaderView$initListener$5$1", m90122f = "AssetV2IsolatedHeaderView.kt", m90123i = {}, m90124l = {184}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AssetV2IsolatedHeaderView$initListener$5$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;

    public AssetV2IsolatedHeaderView$initListener$5$1(Continuation<? super AssetV2IsolatedHeaderView$initListener$5$1> continuation) {
        super(1, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new AssetV2IsolatedHeaderView$initListener$5$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((AssetV2IsolatedHeaderView$initListener$5$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM42830k;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e<List<SearchSymbolEntity>> interfaceC41634eMo64510a = ITransferService.f52538a.get().mo64510a();
            this.label = 1;
            objM42830k = RetrofitFlowExKt.m42830k(interfaceC41634eMo64510a, this);
            if (objM42830k == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM42830k = obj;
        }
        List list = (List) objM42830k;
        if (list != null) {
            SearchSymbolEntity searchSymbolEntity = !list.isEmpty() ? (SearchSymbolEntity) list.get(0) : null;
            if (searchSymbolEntity != null) {
                TransferJumper.Companion companion = TransferJumper.f21427a;
                Quote quote = searchSymbolEntity.getQuote();
                TransferJumper.Companion.jumpToTransfer$default(companion, quote != null ? quote.getCurrency() : null, null, searchSymbolEntity.getSymbol(), "TRADE", SharedPositionInfo.MARGIN_MODE_ISOLATED, false, C43852m.m96601m("B4isolatedMarginAssetsDetails", "transfer", "1"), 34, null);
            } else {
                AssetsHelper.m19139N(AssetsHelper.f18684a, null, null, null, 7, null);
            }
        }
        return Unit.INSTANCE;
    }
}
