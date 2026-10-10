package com.kubi.payment.util;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.sdk.base.entity.BaseEntity;
import kotlinx.coroutines.InterfaceC41709m0;
import p477nt.AbstractC42878k;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: RepositoryExt.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0004H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/payment/base/Result;", ExifInterface.GPS_DIRECTION_TRUE, "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.util.RepositoryExtKt$launch$2", m90122f = "RepositoryExt.kt", m90123i = {0}, m90124l = {20}, m90125m = "invokeSuspend", m90126n = {"$this$withContext"}, m90127s = {"L$0"})
public final class RepositoryExtKt$launch$2<T> extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super AbstractC42878k<? extends T>>, Object> {
    final /* synthetic */ Function2<InterfaceC41709m0, Continuation<? super BaseEntity<T>>, Object> $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepositoryExtKt$launch$2(Function2<? super InterfaceC41709m0, ? super Continuation<? super BaseEntity<T>>, ? extends Object> function2, Continuation<? super RepositoryExtKt$launch$2> continuation) {
        super(2, continuation);
        this.$block = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RepositoryExtKt$launch$2 repositoryExtKt$launch$2 = new RepositoryExtKt$launch$2(this.$block, continuation);
        repositoryExtKt$launch$2.L$0 = obj;
        return repositoryExtKt$launch$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super AbstractC42878k<? extends T>> continuation) {
        return ((RepositoryExtKt$launch$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                Function2<InterfaceC41709m0, Continuation<? super BaseEntity<T>>, Object> function2 = this.$block;
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.label = 1;
                obj = function2.invoke(interfaceC41709m0, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BaseEntity baseEntity = (BaseEntity) obj;
            return baseEntity.getSuccess() ? new AbstractC42878k.Success(baseEntity.getData()) : new AbstractC42878k.Error(new ApiException(baseEntity.getCode(), baseEntity.getMsg(), baseEntity.getData()));
        } catch (Exception e11) {
            return new AbstractC42878k.Error(e11);
        }
    }
}
