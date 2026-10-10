package com.kubi.assets.options;

import com.kubi.assets.entity.OptionsAssetPushEntity;
import com.kubi.assets.entity.OptionsOverviewEntity;
import com.kubi.utils.extensions.DowngradeExKt;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p311hf.C38184b;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AssetOptionsViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.options.AssetOptionsViewModel$subscribeAssetOptions$1", m90122f = "AssetOptionsViewModel.kt", m90123i = {0, 0}, m90124l = {81}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "$i$a$-runCatching-AssetOptionsViewModel$subscribeAssetOptions$1$1"}, m90127s = {"L$0", "I$0"})
public final class AssetOptionsViewModel$subscribeAssetOptions$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AssetOptionsViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.assets.options.AssetOptionsViewModel$subscribeAssetOptions$1$a */
    /* JADX INFO: compiled from: AssetOptionsViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C10519a<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC41709m0 f18127b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AssetOptionsViewModel f18128c;

        public C10519a(InterfaceC41709m0 interfaceC41709m0, AssetOptionsViewModel assetOptionsViewModel) {
            this.f18127b = interfaceC41709m0;
            this.f18128c = assetOptionsViewModel;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(OptionsAssetPushEntity optionsAssetPushEntity, Continuation<? super Unit> continuation) {
            OptionsOverviewEntity optionsOverviewEntityM18140a;
            if (!C41713n0.m91132h(this.f18127b)) {
                return Unit.INSTANCE;
            }
            OptionsOverviewEntity optionsOverviewEntity = this.f18128c.getState().getOptionsOverviewEntity();
            if (optionsOverviewEntity != null && (optionsOverviewEntityM18140a = C10544m.m18140a(optionsOverviewEntity, optionsAssetPushEntity)) != null) {
                this.f18128c.m18103M(optionsOverviewEntityM18140a);
            }
            this.f18128c.m18101J(optionsAssetPushEntity.getPositions());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetOptionsViewModel$subscribeAssetOptions$1(AssetOptionsViewModel assetOptionsViewModel, Continuation<? super AssetOptionsViewModel$subscribeAssetOptions$1> continuation) {
        super(2, continuation);
        this.this$0 = assetOptionsViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AssetOptionsViewModel$subscribeAssetOptions$1 assetOptionsViewModel$subscribeAssetOptions$1 = new AssetOptionsViewModel$subscribeAssetOptions$1(this.this$0, continuation);
        assetOptionsViewModel$subscribeAssetOptions$1.L$0 = obj;
        return assetOptionsViewModel$subscribeAssetOptions$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AssetOptionsViewModel$subscribeAssetOptions$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                AssetOptionsViewModel assetOptionsViewModel = this.this$0;
                Result.Companion companion = Result.INSTANCE;
                InterfaceC41634e interfaceC41634eM90917h = C41636g.m90917h(C41636g.m90906b0(assetOptionsViewModel.m18100I().m20181a(DowngradeExKt.m66551u("/option/position:%s", new Object[]{C38184b.f85884a.m86146a()}, null, 2, null)), 2000L), new AssetOptionsViewModel$subscribeAssetOptions$1$1$1(null));
                C10519a c10519a = new C10519a(interfaceC41709m0, assetOptionsViewModel);
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.I$0 = 0;
                this.label = 1;
                if (interfaceC41634eM90917h.collect(c10519a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return Unit.INSTANCE;
    }
}
