package com.kubi.payment.fasttradev2;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: FastTradeViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\n"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/os/Parcelable;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.FastTradeViewModel$getHistoryCurrency$2", m90122f = "FastTradeViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FastTradeViewModel$getHistoryCurrency$2<T> extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super List<? extends T>>, Object> {
    final /* synthetic */ StorageId<List<T>> $key;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastTradeViewModel$getHistoryCurrency$2(StorageId<List<T>> storageId, Continuation<? super FastTradeViewModel$getHistoryCurrency$2> continuation) {
        super(2, continuation);
        this.$key = storageId;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FastTradeViewModel$getHistoryCurrency$2(this.$key, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<? extends T>> continuation) {
        return ((FastTradeViewModel$getHistoryCurrency$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return C46392a.m102325g(this.$key, CollectionsKt.emptyList());
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
