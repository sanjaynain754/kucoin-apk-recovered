package com.jumio.core.cdn;

import com.jumio.core.network.DownloadTask;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00072\n\u0010\f\u001a\u00060\rj\u0002`\u000eH\u0096@¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lcom/jumio/core/cdn/CDNDownloadListener;", "Lcom/jumio/core/network/DownloadTask$ProgressListener;", "", "<init>", "()V", "isRateLimitExceeded", "onProgressUpdate", "", "percent", "", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onProgressException", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onProgressDone", "data", "(Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class CDNDownloadListener implements DownloadTask.ProgressListener<Boolean> {
    @Override // com.jumio.core.network.DownloadTask.ProgressListener
    public boolean isRateLimitExceeded() {
        return false;
    }

    @Override // com.jumio.core.network.DownloadTask.ProgressListener
    public /* bridge */ /* synthetic */ Object onProgressDone(Boolean bool, Continuation continuation) {
        return onProgressDone2(bool, (Continuation<? super Unit>) continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: onProgressDone, reason: avoid collision after fix types in other method */
    public Object onProgressDone2(@Nullable Boolean bool, @NotNull Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    @Override // com.jumio.core.network.DownloadTask.ProgressListener
    @Nullable
    public Object onProgressException(@NotNull Exception exc, @NotNull Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    @Override // com.jumio.core.network.DownloadTask.ProgressListener
    @Nullable
    public Object onProgressUpdate(float f11, @NotNull Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }
}
