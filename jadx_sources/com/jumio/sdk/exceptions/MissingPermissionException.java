package com.jumio.sdk.exceptions;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/sdk/exceptions/MissingPermissionException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "permissions", "", "", "<init>", "([Ljava/lang/String;)V", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MissingPermissionException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingPermissionException(@NotNull String[] permissions) {
        super(MissingPermissionExceptionKt.access$createMessage(permissions));
        Intrinsics.checkNotNullParameter(permissions, "permissions");
    }
}
