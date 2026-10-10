package com.kubi.assets.interceptor;

import com.kubi.assets.AssetV2Api;
import com.kubi.assets.freeze.AssetFreezeApi;
import com.kubi.assets.freeze.entity.WithdrawPreFreezeEntity;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.utils.extensions.C27041f;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WithdrawRouteInterceptor.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.interceptor.WithdrawRouteInterceptor$checkWithdraw$1", m90122f = "WithdrawRouteInterceptor.kt", m90123i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2}, m90124l = {246, 252, 271}, m90125m = "invokeSuspend", m90126n = {"$this$launchOnTopLifecycleStart", "api", "freezeApi", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-WithdrawRouteInterceptor$checkWithdraw$1$1", "$this$launchOnTopLifecycleStart", "api", "freezeApi", "$this$invokeSuspend_u24lambda_u240", "freezeResult", "middleGroundResourceId", "$i$a$-runCatching-WithdrawRouteInterceptor$checkWithdraw$1$1", "$this$launchOnTopLifecycleStart", "api", "freezeApi"}, m90127s = {"L$0", "L$1", "L$2", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2"})
public final class WithdrawRouteInterceptor$checkWithdraw$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $address;
    final /* synthetic */ Function0<Unit> $callBack;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ WithdrawRouteInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithdrawRouteInterceptor$checkWithdraw$1(WithdrawRouteInterceptor withdrawRouteInterceptor, Function0<Unit> function0, String str, Continuation<? super WithdrawRouteInterceptor$checkWithdraw$1> continuation) {
        super(2, continuation);
        this.this$0 = withdrawRouteInterceptor;
        this.$callBack = function0;
        this.$address = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WithdrawRouteInterceptor$checkWithdraw$1 withdrawRouteInterceptor$checkWithdraw$1 = new WithdrawRouteInterceptor$checkWithdraw$1(this.this$0, this.$callBack, this.$address, continuation);
        withdrawRouteInterceptor$checkWithdraw$1.L$0 = obj;
        return withdrawRouteInterceptor$checkWithdraw$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((WithdrawRouteInterceptor$checkWithdraw$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00c9 A[Catch: all -> 0x00ce, TryCatch #3 {all -> 0x00ce, blocks: (B:25:0x00bd, B:27:0x00c9, B:31:0x00d3, B:33:0x00db, B:39:0x011e), top: B:55:0x00bd }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00db A[Catch: all -> 0x00ce, TRY_LEAVE, TryCatch #3 {all -> 0x00ce, blocks: (B:25:0x00bd, B:27:0x00c9, B:31:0x00d3, B:33:0x00db, B:39:0x011e), top: B:55:0x00bd }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0119  */
    /* JADX WARN: Code duplicated, block: B:39:0x011e A[Catch: all -> 0x00ce, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00ce, blocks: (B:25:0x00bd, B:27:0x00c9, B:31:0x00d3, B:33:0x00db, B:39:0x011e), top: B:55:0x00bd }] */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0159, code lost:
    
        if (r0.m17436v(r2, r1, r4, r21) == r7) goto L46;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AssetV2Api assetV2Api;
        AssetFreezeApi assetFreezeApi;
        int i11;
        Object objM42826g;
        InterfaceC41709m0 interfaceC41709m0;
        AssetFreezeApi assetFreezeApi2;
        WithdrawRouteInterceptor withdrawRouteInterceptor;
        WithdrawPreFreezeEntity withdrawPreFreezeEntity;
        String frozenStatus;
        AbstractC41697j0 abstractC41697j0M94120b;
        WithdrawRouteInterceptor$checkWithdraw$1$1$1 withdrawRouteInterceptor$checkWithdraw$1$1$1;
        InterfaceC41709m0 interfaceC41709m1 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            AssetV2Api assetV2Api2 = (AssetV2Api) C42597a.m93387c().create(AssetV2Api.class);
            AssetFreezeApi assetFreezeApi3 = (AssetFreezeApi) C42597a.m93391g().create(AssetFreezeApi.class);
            WithdrawRouteInterceptor withdrawRouteInterceptor2 = this.this$0;
            try {
                Result.Companion companion = Result.INSTANCE;
                InterfaceC41634e<WithdrawPreFreezeEntity> interfaceC41634eM17177y0 = assetV2Api2.m17177y0();
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m1);
                this.L$1 = assetV2Api2;
                this.L$2 = assetFreezeApi3;
                this.L$3 = withdrawRouteInterceptor2;
                this.L$4 = SpillingKt.nullOutSpilledVariable(interfaceC41709m1);
                i11 = 0;
                this.I$0 = 0;
                this.label = 1;
                objM42826g = RetrofitFlowExKt.m42826g(interfaceC41634eM17177y0, false, null, this, 3, null);
                if (objM42826g != coroutine_suspended) {
                    interfaceC41709m0 = interfaceC41709m1;
                    assetV2Api = assetV2Api2;
                    assetFreezeApi2 = assetFreezeApi3;
                    withdrawRouteInterceptor = withdrawRouteInterceptor2;
                    withdrawPreFreezeEntity = (WithdrawPreFreezeEntity) ((C19334f) objM42826g).m42846a();
                    if (withdrawPreFreezeEntity != null) {
                        frozenStatus = withdrawPreFreezeEntity.getFrozenStatus();
                    } else {
                        frozenStatus = null;
                    }
                    if (Intrinsics.areEqual(frozenStatus, "FROZEN")) {
                        String strM66668h = C27041f.m66668h(withdrawPreFreezeEntity.getPopupConfigId());
                        abstractC41697j0M94120b = C42911a.m94120b();
                        withdrawRouteInterceptor$checkWithdraw$1$1$1 = new WithdrawRouteInterceptor$checkWithdraw$1$1$1(assetFreezeApi2, strM66668h, withdrawRouteInterceptor, withdrawPreFreezeEntity, null);
                        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m1);
                        this.L$1 = assetV2Api;
                        this.L$2 = SpillingKt.nullOutSpilledVariable(assetFreezeApi2);
                        this.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                        this.L$4 = SpillingKt.nullOutSpilledVariable(withdrawPreFreezeEntity);
                        this.L$5 = SpillingKt.nullOutSpilledVariable(strM66668h);
                        this.I$0 = i11;
                        this.label = 2;
                        if (C41686h.m91049g(abstractC41697j0M94120b, withdrawRouteInterceptor$checkWithdraw$1$1$1, this) != coroutine_suspended) {
                            assetFreezeApi = assetFreezeApi2;
                            return Unit.INSTANCE;
                        }
                    } else {
                        Result.m103844constructorimpl(Unit.INSTANCE);
                        WithdrawRouteInterceptor withdrawRouteInterceptor3 = this.this$0;
                        Intrinsics.checkNotNull(assetV2Api);
                        Function0<Unit> function0 = this.$callBack;
                        String str = this.$address;
                        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m1);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(assetV2Api);
                        this.L$2 = SpillingKt.nullOutSpilledVariable(assetFreezeApi2);
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.label = 3;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                assetV2Api = assetV2Api2;
                assetFreezeApi = assetFreezeApi3;
                Result.Companion companion2 = Result.INSTANCE;
                Result.m103844constructorimpl(ResultKt.createFailure(th));
                assetFreezeApi2 = assetFreezeApi;
                WithdrawRouteInterceptor withdrawRouteInterceptor4 = this.this$0;
                Intrinsics.checkNotNull(assetV2Api);
                Function0<Unit> function1 = this.$callBack;
                String str2 = this.$address;
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m1);
                this.L$1 = SpillingKt.nullOutSpilledVariable(assetV2Api);
                this.L$2 = SpillingKt.nullOutSpilledVariable(assetFreezeApi2);
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.label = 3;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            int i13 = this.I$0;
            interfaceC41709m0 = (InterfaceC41709m0) this.L$4;
            WithdrawRouteInterceptor withdrawRouteInterceptor5 = (WithdrawRouteInterceptor) this.L$3;
            AssetFreezeApi assetFreezeApi4 = (AssetFreezeApi) this.L$2;
            AssetV2Api assetV2Api3 = (AssetV2Api) this.L$1;
            try {
                ResultKt.throwOnFailure(obj);
                i11 = i13;
                withdrawRouteInterceptor = withdrawRouteInterceptor5;
                assetFreezeApi2 = assetFreezeApi4;
                assetV2Api = assetV2Api3;
                objM42826g = obj;
                try {
                    withdrawPreFreezeEntity = (WithdrawPreFreezeEntity) ((C19334f) objM42826g).m42846a();
                    if (withdrawPreFreezeEntity != null) {
                        frozenStatus = withdrawPreFreezeEntity.getFrozenStatus();
                    } else {
                        frozenStatus = null;
                    }
                    if (Intrinsics.areEqual(frozenStatus, "FROZEN")) {
                        String strM66668h2 = C27041f.m66668h(withdrawPreFreezeEntity.getPopupConfigId());
                        abstractC41697j0M94120b = C42911a.m94120b();
                        withdrawRouteInterceptor$checkWithdraw$1$1$1 = new WithdrawRouteInterceptor$checkWithdraw$1$1$1(assetFreezeApi2, strM66668h2, withdrawRouteInterceptor, withdrawPreFreezeEntity, null);
                        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m1);
                        this.L$1 = assetV2Api;
                        this.L$2 = SpillingKt.nullOutSpilledVariable(assetFreezeApi2);
                        this.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                        this.L$4 = SpillingKt.nullOutSpilledVariable(withdrawPreFreezeEntity);
                        this.L$5 = SpillingKt.nullOutSpilledVariable(strM66668h2);
                        this.I$0 = i11;
                        this.label = 2;
                        if (C41686h.m91049g(abstractC41697j0M94120b, withdrawRouteInterceptor$checkWithdraw$1$1$1, this) != coroutine_suspended) {
                            assetFreezeApi = assetFreezeApi2;
                            return Unit.INSTANCE;
                        }
                    } else {
                        Result.m103844constructorimpl(Unit.INSTANCE);
                        WithdrawRouteInterceptor withdrawRouteInterceptor6 = this.this$0;
                        Intrinsics.checkNotNull(assetV2Api);
                        Function0<Unit> function2 = this.$callBack;
                        String str3 = this.$address;
                        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m1);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(assetV2Api);
                        this.L$2 = SpillingKt.nullOutSpilledVariable(assetFreezeApi2);
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.label = 3;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    assetFreezeApi = assetFreezeApi2;
                    Result.Companion companion3 = Result.INSTANCE;
                    Result.m103844constructorimpl(ResultKt.createFailure(th));
                    assetFreezeApi2 = assetFreezeApi;
                }
            } catch (Throwable th4) {
                th = th4;
                assetFreezeApi = assetFreezeApi4;
                assetV2Api = assetV2Api3;
                Result.Companion companion4 = Result.INSTANCE;
                Result.m103844constructorimpl(ResultKt.createFailure(th));
                assetFreezeApi2 = assetFreezeApi;
                WithdrawRouteInterceptor withdrawRouteInterceptor7 = this.this$0;
                Intrinsics.checkNotNull(assetV2Api);
                Function0<Unit> function3 = this.$callBack;
                String str4 = this.$address;
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m1);
                this.L$1 = SpillingKt.nullOutSpilledVariable(assetV2Api);
                this.L$2 = SpillingKt.nullOutSpilledVariable(assetFreezeApi2);
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.label = 3;
            }
            return coroutine_suspended;
        }
        if (i12 != 2) {
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        assetFreezeApi = (AssetFreezeApi) this.L$2;
        assetV2Api = (AssetV2Api) this.L$1;
        try {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } catch (Throwable th5) {
            th = th5;
            Result.Companion companion5 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th));
            assetFreezeApi2 = assetFreezeApi;
            WithdrawRouteInterceptor withdrawRouteInterceptor8 = this.this$0;
            Intrinsics.checkNotNull(assetV2Api);
            Function0<Unit> function4 = this.$callBack;
            String str5 = this.$address;
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m1);
            this.L$1 = SpillingKt.nullOutSpilledVariable(assetV2Api);
            this.L$2 = SpillingKt.nullOutSpilledVariable(assetFreezeApi2);
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.label = 3;
        }
    }
}
