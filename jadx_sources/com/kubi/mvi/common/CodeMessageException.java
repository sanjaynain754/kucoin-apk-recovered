package com.kubi.mvi.common;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: CodeMessageException.kt */
/* JADX INFO: loaded from: classes29.dex */
@Deprecated(message = "Deprecated")
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m90084d2 = {"Lcom/kubi/mvi/common/CodeMessageException;", "", "code", "", "errorMessage", "throwable", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "getCode", "()Ljava/lang/String;", "getErrorMessage", "getThrowable", "()Ljava/lang/Throwable;", "Companion", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final class CodeMessageException extends Throwable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String code;

    @Nullable
    private final String errorMessage;

    @Nullable
    private final Throwable throwable;

    /* JADX INFO: compiled from: CodeMessageException.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001f\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\tJ\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/mvi/common/CodeMessageException$Companion;", "", "()V", "create", "Lcom/kubi/mvi/common/CodeMessageException;", "code", "", "(Ljava/lang/Integer;)Lcom/kubi/mvi/common/CodeMessageException;", "message", "", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/kubi/mvi/common/CodeMessageException;", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CodeMessageException create(@Nullable String code) {
            return create(code, (String) null);
        }

        public Companion() {
        }

        @NotNull
        public final CodeMessageException create(@Nullable Integer code) {
            return create(code != null ? code.toString() : null, (String) null);
        }

        @NotNull
        public final CodeMessageException create(@Nullable Integer code, @Nullable String message) {
            return create(code != null ? code.toString() : null, message);
        }

        @NotNull
        public final CodeMessageException create(@Nullable String code, @Nullable String message) {
            return new CodeMessageException(code, message, null, 4, null);
        }
    }

    public CodeMessageException() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ CodeMessageException(String str, String str2, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : th2);
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    public final Throwable getThrowable() {
        return this.throwable;
    }

    public CodeMessageException(@Nullable String str, @Nullable String str2, @Nullable Throwable th2) {
        super(str2, th2);
        this.code = str;
        this.errorMessage = str2;
        this.throwable = th2;
    }
}
