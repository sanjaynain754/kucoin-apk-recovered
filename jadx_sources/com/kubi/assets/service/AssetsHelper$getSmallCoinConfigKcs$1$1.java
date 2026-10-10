package com.kubi.assets.service;

import com.kubi.assets.AssetV2Api;
import com.kubi.assets.entity.SmallEntity;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.utils.C27099x;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import lb.C42153h;
import o00.C42917g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: compiled from: AssetsHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.service.AssetsHelper$getSmallCoinConfigKcs$1$1", m90122f = "AssetsHelper.kt", m90123i = {}, m90124l = {105}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nAssetsHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetsHelper.kt\ncom/kubi/assets/service/AssetsHelper$getSmallCoinConfigKcs$1$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,584:1\n25#2:585\n26#2:587\n1#3:586\n*S KotlinDebug\n*F\n+ 1 AssetsHelper.kt\ncom/kubi/assets/service/AssetsHelper$getSmallCoinConfigKcs$1$1\n*L\n108#1:585\n108#1:587\n108#1:586\n*E\n"})
public final class AssetsHelper$getSmallCoinConfigKcs$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ AssetV2Api $api;
    int label;

    /* JADX INFO: renamed from: com.kubi.assets.service.AssetsHelper$getSmallCoinConfigKcs$1$1$1 */
    /* JADX INFO: compiled from: AssetsHelper.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/entity/SmallEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.service.AssetsHelper$getSmallCoinConfigKcs$1$1$1", m90122f = "AssetsHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nAssetsHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetsHelper.kt\ncom/kubi/assets/service/AssetsHelper$getSmallCoinConfigKcs$1$1$1\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,584:1\n15#2,2:585\n23#3,2:587\n*S KotlinDebug\n*F\n+ 1 AssetsHelper.kt\ncom/kubi/assets/service/AssetsHelper$getSmallCoinConfigKcs$1$1$1\n*L\n107#1:585,2\n107#1:587,2\n*E\n"})
    public static final class C109171 extends SuspendLambda implements Function2<SmallEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C109171(Continuation<? super C109171> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SmallEntity smallEntity, Continuation<? super Unit> continuation) {
            return ((C109171) create(smallEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: f */
        public static final void m19179f(SmallEntity smallEntity) {
            C46392a.m102333p(C42153h.f93593a.m92502F(), C27099x.m66919i(smallEntity, false, 2, null));
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C109171 c109171 = new C109171(continuation);
            c109171.L$0 = obj;
            return c109171;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final SmallEntity smallEntity = (SmallEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AssetsHelper.f18684a.m19175w(smallEntity);
            C42917g.m94137c().execute(new Runnable() { // from class: com.kubi.assets.service.c
                @Override // java.lang.Runnable
                public final void run() {
                    AssetsHelper$getSmallCoinConfigKcs$1$1.C109171.m19179f(smallEntity);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetsHelper$getSmallCoinConfigKcs$1$1(AssetV2Api assetV2Api, Continuation<? super AssetsHelper$getSmallCoinConfigKcs$1$1> continuation) {
        super(2, continuation);
        this.$api = assetV2Api;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AssetsHelper$getSmallCoinConfigKcs$1$1(this.$api, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AssetsHelper$getSmallCoinConfigKcs$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
            InterfaceC41634e<SmallEntity> interfaceC41634eM17081F = this.$api.m17081F();
            C109171 c109171 = new C109171(null);
            this.label = 1;
            obj = RetrofitFlowExKt.m42823d(interfaceC41634eM17081F, false, c109171, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Throwable throwable = ((C19334f) obj).getThrowable();
        if (throwable != null) {
            C44128b.m97264h(throwable);
        }
        return Unit.INSTANCE;
    }
}
