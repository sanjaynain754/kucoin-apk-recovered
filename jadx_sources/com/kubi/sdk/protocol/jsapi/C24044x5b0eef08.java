package com.kubi.sdk.protocol.jsapi;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.monitor.MonitorLevel;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiShareGalleryDataEntity;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$data$1$invokeSuspend$lambda$1$$inlined$fromJsonOrNull$2 */
/* JADX INFO: compiled from: GsonUtils.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0004\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/f;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/f;Ljava/lang/Throwable;)V", "com/kubi/utils/GsonUtils$fromJsonOrNull$7"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.utils.GsonUtils$fromJsonOrNull$7", m90122f = "GsonUtils.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJsonOrNull$7\n*L\n1#1,195:1\n*E\n"})
public final class C24044x5b0eef08 extends SuspendLambda implements Function3<InterfaceC41635f<? super KCJSApiShareGalleryDataEntity>, Throwable, Continuation<? super Unit>, Object> {
    int label;

    public C24044x5b0eef08(Continuation continuation) {
        super(3, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull InterfaceC41635f<? super KCJSApiShareGalleryDataEntity> interfaceC41635f, @NotNull Throwable th2, @Nullable Continuation<? super Unit> continuation) {
        return new C24044x5b0eef08(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            String simpleName = KCJSApiShareGalleryDataEntity.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "T::class.java.simpleName");
            C43846g.m96570e(simpleName, "GsonUtils", MonitorLevel.ERROR);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
