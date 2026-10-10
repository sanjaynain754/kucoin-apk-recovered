package com.jumio.core.network;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import java.io.InputStream;
import jumio.core.C40712q;
import jumio.core.C40717r;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0094@¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/jumio/core/network/ByteArrayDownloadTask;", "Lcom/jumio/core/network/DownloadTask;", "", "url", "", "timeout", "", "callbackDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Ljava/lang/String;ILkotlinx/coroutines/CoroutineDispatcher;)V", "processInputStream", "inputStream", "Ljava/io/InputStream;", SessionDescription.ATTR_LENGTH, "(Ljava/io/InputStream;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ByteArrayDownloadTask extends DownloadTask<byte[]> {
    public /* synthetic */ ByteArrayDownloadTask(String str, int i11, AbstractC41697j0 abstractC41697j0, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? C41782z0.m91393c() : abstractC41697j0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.jumio.core.network.DownloadTask
    @Nullable
    public Object processInputStream(@NotNull InputStream inputStream, int i11, @NotNull Continuation<? super byte[]> continuation) {
        C40712q c40712q;
        if (continuation instanceof C40712q) {
            c40712q = (C40712q) continuation;
            int i12 = c40712q.f90360d;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c40712q.f90360d = i12 - Integer.MIN_VALUE;
            } else {
                c40712q = new C40712q(this, continuation);
            }
        } else {
            c40712q = new C40712q(this, continuation);
        }
        Object objM91049g = c40712q.f90358b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c40712q.f90360d;
        if (i13 == 0) {
            ResultKt.throwOnFailure(objM91049g);
            AbstractC41697j0 abstractC41697j0M91392b = C41782z0.m91392b();
            C40717r c40717r = new C40717r(inputStream, this, i11, null);
            c40712q.f90357a = SpillingKt.nullOutSpilledVariable(inputStream);
            c40712q.f90360d = 1;
            objM91049g = C41686h.m91049g(abstractC41697j0M91392b, c40717r, c40712q);
            if (objM91049g == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM91049g);
        }
        Intrinsics.checkNotNullExpressionValue(objM91049g, "withContext(...)");
        return objM91049g;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteArrayDownloadTask(@NotNull String url, int i11, @NotNull AbstractC41697j0 callbackDispatcher) {
        super(url, i11, callbackDispatcher);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(callbackDispatcher, "callbackDispatcher");
    }
}
