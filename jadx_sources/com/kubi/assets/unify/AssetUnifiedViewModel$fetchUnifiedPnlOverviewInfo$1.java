package com.kubi.assets.unify;

import com.kubi.assets.AssetV2EventTracker;
import com.kubi.assets.entity.UnifiedOverviewEntity;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.json.JSONException;
import p402kf.C41016c;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: AssetUnifiedViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.unify.AssetUnifiedViewModel$fetchUnifiedPnlOverviewInfo$1", m90122f = "AssetUnifiedViewModel.kt", m90123i = {}, m90124l = {176}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nAssetUnifiedViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetUnifiedViewModel.kt\ncom/kubi/assets/unify/AssetUnifiedViewModel$fetchUnifiedPnlOverviewInfo$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,271:1\n25#2:272\n26#2:274\n1#3:273\n*S KotlinDebug\n*F\n+ 1 AssetUnifiedViewModel.kt\ncom/kubi/assets/unify/AssetUnifiedViewModel$fetchUnifiedPnlOverviewInfo$1\n*L\n186#1:272\n186#1:274\n186#1:273\n*E\n"})
public final class AssetUnifiedViewModel$fetchUnifiedPnlOverviewInfo$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AssetUnifiedViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.assets.unify.AssetUnifiedViewModel$fetchUnifiedPnlOverviewInfo$1$1 */
    /* JADX INFO: compiled from: AssetUnifiedViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/entity/UnifiedOverviewEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.unify.AssetUnifiedViewModel$fetchUnifiedPnlOverviewInfo$1$1", m90122f = "AssetUnifiedViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C111331 extends SuspendLambda implements Function2<UnifiedOverviewEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AssetUnifiedViewModel this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(UnifiedOverviewEntity unifiedOverviewEntity, Continuation<? super Unit> continuation) {
            return ((C111331) create(unifiedOverviewEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111331(AssetUnifiedViewModel assetUnifiedViewModel, Continuation<? super C111331> continuation) {
            super(2, continuation);
            this.this$0 = assetUnifiedViewModel;
        }

        /* JADX INFO: renamed from: f */
        public static final UIState m19710f(UnifiedOverviewEntity unifiedOverviewEntity, UIState uIState) {
            return UIState.copy$default(uIState, null, null, false, false, false, null, null, null, null, null, unifiedOverviewEntity, 1023, null);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C111331 c111331 = new C111331(this.this$0, continuation);
            c111331.L$0 = obj;
            return c111331;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            UnifiedOverviewEntity unifiedOverviewEntity = (UnifiedOverviewEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final UnifiedOverviewEntity unifiedOverviewEntityCopy$default = UnifiedOverviewEntity.copy$default(unifiedOverviewEntity, null, null, null, null, null, null, AssetsDepend.f18689a.m19189j().d0().getBalanceCurrency(), C41016c.m89965c(), 63, null);
            this.this$0.updateState(new Function1() { // from class: com.kubi.assets.unify.k0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AssetUnifiedViewModel$fetchUnifiedPnlOverviewInfo$1.C111331.m19710f(unifiedOverviewEntityCopy$default, (UIState) obj2);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetUnifiedViewModel$fetchUnifiedPnlOverviewInfo$1(AssetUnifiedViewModel assetUnifiedViewModel, Continuation<? super AssetUnifiedViewModel$fetchUnifiedPnlOverviewInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = assetUnifiedViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AssetUnifiedViewModel$fetchUnifiedPnlOverviewInfo$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AssetUnifiedViewModel$fetchUnifiedPnlOverviewInfo$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws JSONException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e<UnifiedOverviewEntity> interfaceC41634eM17165t0 = this.this$0.m19697G().m17165t0();
            C111331 c111331 = new C111331(this.this$0, null);
            this.label = 1;
            obj = RetrofitFlowExKt.m42824e(interfaceC41634eM17165t0, false, c111331, this, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Throwable throwable = ((C19334f) obj).getThrowable();
        if (throwable != null) {
            AssetV2EventTracker.f17857a.m17555h("ultra-account/asset/data/overview", throwable);
            C44128b.m97264h(throwable);
        }
        return Unit.INSTANCE;
    }
}
