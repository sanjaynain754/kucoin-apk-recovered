package com.kubi.assets.service;

import com.kubi.assets.AssetV2Api;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import lb.C42153h;
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
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.service.AssetsHelper$getAlphaAccountVisible$1", m90122f = "AssetsHelper.kt", m90123i = {}, m90124l = {120}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nAssetsHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetsHelper.kt\ncom/kubi/assets/service/AssetsHelper$getAlphaAccountVisible$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,584:1\n25#2:585\n26#2:587\n1#3:586\n*S KotlinDebug\n*F\n+ 1 AssetsHelper.kt\ncom/kubi/assets/service/AssetsHelper$getAlphaAccountVisible$1\n*L\n122#1:585\n122#1:587\n122#1:586\n*E\n"})
public final class AssetsHelper$getAlphaAccountVisible$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ AssetV2Api $api;
    int label;

    /* JADX INFO: renamed from: com.kubi.assets.service.AssetsHelper$getAlphaAccountVisible$1$1 */
    /* JADX INFO: compiled from: AssetsHelper.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.service.AssetsHelper$getAlphaAccountVisible$1$1", m90122f = "AssetsHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nAssetsHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetsHelper.kt\ncom/kubi/assets/service/AssetsHelper$getAlphaAccountVisible$1$1\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,584:1\n126#2,2:585\n*S KotlinDebug\n*F\n+ 1 AssetsHelper.kt\ncom/kubi/assets/service/AssetsHelper$getAlphaAccountVisible$1$1\n*L\n121#1:585,2\n*E\n"})
    public static final class C109161 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        public C109161(Continuation<? super C109161> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C109161 c109161 = new C109161(continuation);
            c109161.Z$0 = ((Boolean) obj).booleanValue();
            return c109161;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C109161) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C46392a.m102328k(C42153h.f93593a.m92499C(), z11);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetsHelper$getAlphaAccountVisible$1(AssetV2Api assetV2Api, Continuation<? super AssetsHelper$getAlphaAccountVisible$1> continuation) {
        super(2, continuation);
        this.$api = assetV2Api;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AssetsHelper$getAlphaAccountVisible$1(this.$api, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AssetsHelper$getAlphaAccountVisible$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41634e<Boolean> interfaceC41634eM17147m0 = this.$api.m17147m0();
            C109161 c109161 = new C109161(null);
            this.label = 1;
            obj = RetrofitFlowExKt.m42823d(interfaceC41634eM17147m0, false, c109161, this);
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
