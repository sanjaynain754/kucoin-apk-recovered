package com.kubi.credential.exception;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ClearCredentialException.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/credential/exception/ClearCredentialException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "type", "", "errorMessage", "", "throwable", "", "(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/Throwable;)V", "getErrorMessage", "()Ljava/lang/CharSequence;", "getThrowable", "()Ljava/lang/Throwable;", "getType", "()Ljava/lang/String;", "credential_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class ClearCredentialException extends Exception {

    @Nullable
    private final CharSequence errorMessage;

    @Nullable
    private final Throwable throwable;

    @NotNull
    private final String type;

    public /* synthetic */ ClearCredentialException(String str, CharSequence charSequence, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : charSequence, (i11 & 4) != 0 ? null : th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClearCredentialException(@NotNull String type, @Nullable CharSequence charSequence, @Nullable Throwable th2) {
        super(charSequence != null ? charSequence.toString() : null, th2);
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.errorMessage = charSequence;
        this.throwable = th2;
    }

    @Nullable
    public final CharSequence getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    public final Throwable getThrowable() {
        return this.throwable;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
