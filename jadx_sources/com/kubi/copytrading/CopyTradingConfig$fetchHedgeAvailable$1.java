package com.kubi.copytrading;

import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p659uc.C45151a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: compiled from: CopyTradingConfig.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.copytrading.CopyTradingConfig$fetchHedgeAvailable$1", m90122f = "CopyTradingConfig.kt", m90123i = {}, m90124l = {303}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nCopyTradingConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CopyTradingConfig.kt\ncom/kubi/copytrading/CopyTradingConfig$fetchHedgeAvailable$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,310:1\n25#2:311\n26#2:315\n1#3:312\n126#4,2:313\n*S KotlinDebug\n*F\n+ 1 CopyTradingConfig.kt\ncom/kubi/copytrading/CopyTradingConfig$fetchHedgeAvailable$1\n*L\n305#1:311\n305#1:315\n305#1:312\n306#1:313,2\n*E\n"})
public final class CopyTradingConfig$fetchHedgeAvailable$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $subUid;
    int label;

    /* JADX INFO: renamed from: com.kubi.copytrading.CopyTradingConfig$fetchHedgeAvailable$1$1 */
    /* JADX INFO: compiled from: CopyTradingConfig.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "supportHedge", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.copytrading.CopyTradingConfig$fetchHedgeAvailable$1$1", m90122f = "CopyTradingConfig.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nCopyTradingConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CopyTradingConfig.kt\ncom/kubi/copytrading/CopyTradingConfig$fetchHedgeAvailable$1$1\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,310:1\n126#2,2:311\n*S KotlinDebug\n*F\n+ 1 CopyTradingConfig.kt\ncom/kubi/copytrading/CopyTradingConfig$fetchHedgeAvailable$1$1\n*L\n304#1:311,2\n*E\n"})
    public static final class C114341 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        public C114341(Continuation<? super C114341> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C114341 c114341 = new C114341(continuation);
            c114341.Z$0 = ((Boolean) obj).booleanValue();
            return c114341;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C114341) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C46392a.m102328k(C45151a.f101594a.m99795a(), z11);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingConfig$fetchHedgeAvailable$1(String str, Continuation<? super CopyTradingConfig$fetchHedgeAvailable$1> continuation) {
        super(2, continuation);
        this.$subUid = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingConfig$fetchHedgeAvailable$1(this.$subUid, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CopyTradingConfig$fetchHedgeAvailable$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41634e<Boolean> interfaceC41634eM20826e = CopyTradingConfig.f19710a.m20601r().m20826e("hedgeModePosition", this.$subUid);
            C114341 c114341 = new C114341(null);
            this.label = 1;
            obj = RetrofitFlowExKt.m42823d(interfaceC41634eM20826e, false, c114341, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (((C19334f) obj).getThrowable() != null) {
            C46392a.m102328k(C45151a.f101594a.m99795a(), false);
        }
        return Unit.INSTANCE;
    }
}
