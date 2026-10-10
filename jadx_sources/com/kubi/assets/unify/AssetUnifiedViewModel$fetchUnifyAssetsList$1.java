package com.kubi.assets.unify;

import com.kubi.assets.entity.UnifiedAssetsEntity;
import com.kubi.mvi.event.SingleEvent;
import com.tencent.rtmp.TXLiveConstants;
import java.util.ArrayList;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: AssetUnifiedViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.unify.AssetUnifiedViewModel$fetchUnifyAssetsList$1", m90122f = "AssetUnifiedViewModel.kt", m90123i = {0, 0, 0}, m90124l = {197}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "$this$invokeSuspend_u24lambda_u242", "$i$a$-runCatching-AssetUnifiedViewModel$fetchUnifyAssetsList$1$1"}, m90127s = {"L$0", "L$1", "I$0"})
public final class AssetUnifiedViewModel$fetchUnifyAssetsList$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AssetUnifiedViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetUnifiedViewModel$fetchUnifyAssetsList$1(AssetUnifiedViewModel assetUnifiedViewModel, Continuation<? super AssetUnifiedViewModel$fetchUnifyAssetsList$1> continuation) {
        super(2, continuation);
        this.this$0 = assetUnifiedViewModel;
    }

    /* JADX INFO: renamed from: h */
    public static final UIState m19714h(ArrayList arrayList, UIState uIState) {
        return UIState.copy$default(uIState, null, null, false, false, false, arrayList, null, null, null, null, null, TXLiveConstants.PLAY_EVT_STREAM_SWITCH_SUCC, null);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AssetUnifiedViewModel$fetchUnifyAssetsList$1 assetUnifiedViewModel$fetchUnifyAssetsList$1 = new AssetUnifiedViewModel$fetchUnifyAssetsList$1(this.this$0, continuation);
        assetUnifiedViewModel$fetchUnifyAssetsList$1.L$0 = obj;
        return assetUnifiedViewModel$fetchUnifyAssetsList$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AssetUnifiedViewModel$fetchUnifyAssetsList$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                final AssetUnifiedViewModel assetUnifiedViewModel = this.this$0;
                Result.Companion companion = Result.INSTANCE;
                Function1 function1 = new Function1() { // from class: com.kubi.assets.unify.l0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AssetUnifiedViewModel$fetchUnifyAssetsList$1.m19713g(assetUnifiedViewModel, (ArrayList) obj2);
                    }
                };
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.I$0 = 0;
                this.label = 1;
                if (UnifiedAssetListExtKt.m19719e(assetUnifiedViewModel, function1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        AssetUnifiedViewModel assetUnifiedViewModel2 = this.this$0;
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            assetUnifiedViewModel2.sendSingleEvent(SingleEvent.C19247c.f35626b);
            C44128b.m97264h(thM103847exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m19713g(AssetUnifiedViewModel assetUnifiedViewModel, final ArrayList arrayList) {
        ArrayList<UnifiedAssetsEntity> originAssetsSourceList = assetUnifiedViewModel.getState().getOriginAssetsSourceList();
        if (originAssetsSourceList != null && !originAssetsSourceList.isEmpty()) {
            assetUnifiedViewModel.sendSingleEvent(SingleEvent.C19247c.f35626b);
        }
        assetUnifiedViewModel.updateState(new Function1() { // from class: com.kubi.assets.unify.m0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetUnifiedViewModel$fetchUnifyAssetsList$1.m19714h(arrayList, (UIState) obj);
            }
        });
        return Unit.INSTANCE;
    }
}
