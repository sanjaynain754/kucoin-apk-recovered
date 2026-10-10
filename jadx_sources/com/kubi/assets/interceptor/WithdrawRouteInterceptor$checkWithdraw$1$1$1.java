package com.kubi.assets.interceptor;

import com.kubi.assets.entity.BlackGroupResponse;
import com.kubi.assets.entity.BlackGroupResponseKt;
import com.kubi.assets.freeze.AssetFreezeApi;
import com.kubi.assets.freeze.AssetMiddleGroundResource;
import com.kubi.assets.freeze.entity.WithdrawPreFreezeEntity;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: WithdrawRouteInterceptor.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.interceptor.WithdrawRouteInterceptor$checkWithdraw$1$1$1", m90122f = "WithdrawRouteInterceptor.kt", m90123i = {0, 0, 0, 0}, m90124l = {257}, m90125m = "invokeSuspend", m90126n = {DbParams.KEY_CHANNEL_RESULT, "dialogResource", "content", "url"}, m90127s = {"L$0", "L$1", "L$2", "L$3"})
public final class WithdrawRouteInterceptor$checkWithdraw$1$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ AssetFreezeApi $freezeApi;
    final /* synthetic */ WithdrawPreFreezeEntity $freezeResult;
    final /* synthetic */ String $middleGroundResourceId;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ WithdrawRouteInterceptor this$0;

    /* JADX INFO: renamed from: com.kubi.assets.interceptor.WithdrawRouteInterceptor$checkWithdraw$1$1$1$1 */
    /* JADX INFO: compiled from: WithdrawRouteInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.interceptor.WithdrawRouteInterceptor$checkWithdraw$1$1$1$1", m90122f = "WithdrawRouteInterceptor.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C102191 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $content;
        final /* synthetic */ WithdrawPreFreezeEntity $freezeResult;
        final /* synthetic */ String $url;
        int label;
        final /* synthetic */ WithdrawRouteInterceptor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C102191(WithdrawRouteInterceptor withdrawRouteInterceptor, WithdrawPreFreezeEntity withdrawPreFreezeEntity, String str, String str2, Continuation<? super C102191> continuation) {
            super(2, continuation);
            this.this$0 = withdrawRouteInterceptor;
            this.$freezeResult = withdrawPreFreezeEntity;
            this.$content = str;
            this.$url = str2;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C102191(this.this$0, this.$freezeResult, this.$content, this.$url, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C102191) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.m17435u(new BlackGroupResponse(C27039d.m66652l(this.$freezeResult.getExpiredAt()), BlackGroupResponseKt.FREEZE_CENTER, null, this.$content, this.$url, 4, null));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithdrawRouteInterceptor$checkWithdraw$1$1$1(AssetFreezeApi assetFreezeApi, String str, WithdrawRouteInterceptor withdrawRouteInterceptor, WithdrawPreFreezeEntity withdrawPreFreezeEntity, Continuation<? super WithdrawRouteInterceptor$checkWithdraw$1$1$1> continuation) {
        super(2, continuation);
        this.$freezeApi = assetFreezeApi;
        this.$middleGroundResourceId = str;
        this.this$0 = withdrawRouteInterceptor;
        this.$freezeResult = withdrawPreFreezeEntity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WithdrawRouteInterceptor$checkWithdraw$1$1$1(this.$freezeApi, this.$middleGroundResourceId, this.this$0, this.$freezeResult, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((WithdrawRouteInterceptor$checkWithdraw$1$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AssetMiddleGroundResource assetMiddleGroundResource;
        String str;
        Map<String, String> srcTextMap;
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
            Map<String, List<AssetMiddleGroundResource>> mapM16911f = this.$freezeApi.m16911f(this.$middleGroundResourceId);
            List<AssetMiddleGroundResource> list = mapM16911f.get(this.$middleGroundResourceId);
            String url = null;
            if (list != null) {
                assetMiddleGroundResource = (AssetMiddleGroundResource) CollectionsKt.firstOrNull((List) list);
            } else {
                assetMiddleGroundResource = null;
            }
            if (assetMiddleGroundResource != null && (srcTextMap = assetMiddleGroundResource.getSrcTextMap()) != null) {
                str = srcTextMap.get("content");
            } else {
                str = null;
            }
            if (assetMiddleGroundResource != null) {
                url = assetMiddleGroundResource.getUrl();
            }
            String strM66668h = C27041f.m66668h(url);
            AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
            C102191 c102191 = new C102191(this.this$0, this.$freezeResult, str, strM66668h, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(mapM16911f);
            this.L$1 = SpillingKt.nullOutSpilledVariable(assetMiddleGroundResource);
            this.L$2 = SpillingKt.nullOutSpilledVariable(str);
            this.L$3 = SpillingKt.nullOutSpilledVariable(strM66668h);
            this.label = 1;
            if (C41686h.m91049g(abstractC41697j0M94121c, c102191, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
