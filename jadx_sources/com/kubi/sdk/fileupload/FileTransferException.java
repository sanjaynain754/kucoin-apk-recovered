package com.kubi.sdk.fileupload;

import com.kubi.monitor.BaseIssueException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FileTransferException.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/sdk/fileupload/FileTransferException;", "Lcom/kubi/monitor/BaseIssueException;", "msg", "", "e", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "fileupload_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class FileTransferException extends BaseIssueException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileTransferException(@Nullable String str, @NotNull Throwable e11) {
        super("FileUpload", str, e11);
        Intrinsics.checkNotNullParameter(e11, "e");
    }
}
