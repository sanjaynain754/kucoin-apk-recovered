package com.kubi.sdk.pkg.task;

import a00.C0008a;
import com.kubi.sdk.pkg.util.PackageException;
import org.jetbrains.annotations.NotNull;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TaskException.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/sdk/pkg/task/TaskException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "code", "", "message", "", "(ILjava/lang/String;)V", "cause", "", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "getCode", "()I", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTaskException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskException.kt\ncom/kubi/sdk/pkg/task/TaskException\n+ 2 PackageException.kt\ncom/kubi/sdk/pkg/util/PackageExceptionKt\n*L\n1#1,30:1\n22#2,2:31\n*S KotlinDebug\n*F\n+ 1 TaskException.kt\ncom/kubi/sdk/pkg/task/TaskException\n*L\n27#1:31,2\n*E\n"})
public final class TaskException extends RuntimeException {
    private final int code;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskException(int i11, @NotNull String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        this.code = i11;
        C43840a.m96548b(message, "package_update");
    }

    public final int getCode() {
        return this.code;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskException(int i11, @NotNull String message, @NotNull Throwable cause) {
        super(message, cause);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.code = i11;
        C43840a.m96548b(message, "package_update");
        if (C0008a.f8a.m9a(cause)) {
            return;
        }
        C43846g.m96568c(new PackageException(cause, "package_update", false, null, 8, null), null, 2, null);
    }
}
