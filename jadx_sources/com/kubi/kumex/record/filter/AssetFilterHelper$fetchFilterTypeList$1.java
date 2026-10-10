package com.kubi.kumex.record.filter;

import com.kubi.broker.RepositoryServiceLocator;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import io.reactivex.functions.Action;
import java.util.Map;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: RecordFilterHelper.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.record.filter.AssetFilterHelper$fetchFilterTypeList$1", m90122f = "RecordFilterHelper.kt", m90123i = {0}, m90124l = {109}, m90125m = "invokeSuspend", m90126n = {DbParams.KEY_CHANNEL_RESULT}, m90127s = {"L$0"})
public final class AssetFilterHelper$fetchFilterTypeList$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Action $callBack;
    final /* synthetic */ String $type;
    final /* synthetic */ String $typeKey;
    Object L$0;
    int label;

    /* JADX INFO: renamed from: com.kubi.kumex.record.filter.AssetFilterHelper$fetchFilterTypeList$1$1 */
    /* JADX INFO: compiled from: RecordFilterHelper.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.kumex.record.filter.AssetFilterHelper$fetchFilterTypeList$1$1", m90122f = "RecordFilterHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C167071 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Action $callBack;
        final /* synthetic */ Map<String, String> $result;
        final /* synthetic */ String $typeKey;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C167071(String str, Map<String, String> map, Action action, Continuation<? super C167071> continuation) {
            super(2, continuation);
            this.$typeKey = str;
            this.$result = map;
            this.$callBack = action;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C167071(this.$typeKey, this.$result, this.$callBack, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C167071) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                AssetFilterHelper.f30241f.put(this.$typeKey, this.$result);
                Action action = this.$callBack;
                if (action != null) {
                    action.run();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetFilterHelper$fetchFilterTypeList$1(String str, String str2, Action action, Continuation<? super AssetFilterHelper$fetchFilterTypeList$1> continuation) {
        super(2, continuation);
        this.$type = str;
        this.$typeKey = str2;
        this.$callBack = action;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AssetFilterHelper$fetchFilterTypeList$1(this.$type, this.$typeKey, this.$callBack, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AssetFilterHelper$fetchFilterTypeList$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
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
            Map<String, String> mapMo99972b = RepositoryServiceLocator.f19236a.m20290i().mo99972b(this.$type);
            AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
            C167071 c167071 = new C167071(this.$typeKey, mapMo99972b, this.$callBack, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(mapMo99972b);
            this.label = 1;
            if (C41686h.m91049g(abstractC41697j0M94121c, c167071, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
