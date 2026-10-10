package com.kubi.assets.bill;

import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import io.reactivex.functions.Action;
import java.util.HashMap;
import java.util.Map;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FutureRecordFilterHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.bill.FutureAssetFilterHelper$fetchFilterTypeList$1", m90122f = "FutureRecordFilterHelper.kt", m90123i = {1}, m90124l = {110, 111}, m90125m = "invokeSuspend", m90126n = {DbParams.KEY_CHANNEL_RESULT}, m90127s = {"L$0"})
public final class FutureAssetFilterHelper$fetchFilterTypeList$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Action $callBack;
    final /* synthetic */ String $type;
    final /* synthetic */ String $typeKey;
    Object L$0;
    int label;

    /* JADX INFO: renamed from: com.kubi.assets.bill.FutureAssetFilterHelper$fetchFilterTypeList$1$1 */
    /* JADX INFO: compiled from: FutureRecordFilterHelper.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.bill.FutureAssetFilterHelper$fetchFilterTypeList$1$1", m90122f = "FutureRecordFilterHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C95731 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Action $callBack;
        final /* synthetic */ Object $result;
        final /* synthetic */ String $typeKey;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C95731(String str, Object obj, Action action, Continuation<? super C95731> continuation) {
            super(2, continuation);
            this.$typeKey = str;
            this.$result = obj;
            this.$callBack = action;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C95731(this.$typeKey, this.$result, this.$callBack, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C95731) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                HashMap map = FutureAssetFilterHelper.f16705f;
                String str = this.$typeKey;
                Object obj2 = this.$result;
                if (Result.m103850isFailureimpl(obj2)) {
                    obj2 = null;
                }
                Map mapEmptyMap = (Map) obj2;
                if (mapEmptyMap == null) {
                    mapEmptyMap = MapsKt.emptyMap();
                }
                map.put(str, mapEmptyMap);
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
    public FutureAssetFilterHelper$fetchFilterTypeList$1(String str, String str2, Action action, Continuation<? super FutureAssetFilterHelper$fetchFilterTypeList$1> continuation) {
        super(2, continuation);
        this.$type = str;
        this.$typeKey = str2;
        this.$callBack = action;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FutureAssetFilterHelper$fetchFilterTypeList$1(this.$type, this.$typeKey, this.$callBack, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FutureAssetFilterHelper$fetchFilterTypeList$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r1, r3, r7) == r0) goto L15;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM15649n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                objM15649n = ((Result) obj).getValue();
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        AccountBillRepository accountBillRepository = new AccountBillRepository();
        String str = this.$type;
        this.label = 1;
        objM15649n = accountBillRepository.m15649n(str, this);
        if (objM15649n != coroutine_suspended) {
        }
        return coroutine_suspended;
        AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
        C95731 c95731 = new C95731(this.$typeKey, objM15649n, this.$callBack, null);
        this.L$0 = SpillingKt.nullOutSpilledVariable(objM15649n);
        this.label = 2;
    }
}
