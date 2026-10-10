package com.jumio.core.network;

import com.jumio.core.Injected;
import jumio.core.C40611W0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes56.dex */
@Injected
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH&¨\u0006\fÀ\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/network/DownloadServiceInterface;", "", "download", "Lcom/jumio/core/network/DownloadResponse;", "url", "", "timeout", "", "id", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface DownloadServiceInterface {
    void close();

    @Nullable
    Object download(@NotNull String str, int i11, @NotNull String str2, @NotNull Continuation<? super C40611W0> continuation);

    static /* synthetic */ Object download$default(DownloadServiceInterface downloadServiceInterface, String str, int i11, String str2, Continuation continuation, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: download");
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            str2 = "";
        }
        return downloadServiceInterface.download(str, i11, str2, continuation);
    }
}
