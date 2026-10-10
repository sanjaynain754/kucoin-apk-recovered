package com.jumio.sdk.retry;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/jumio/sdk/retry/JumioRetryReasonGeneric;", "", "<init>", "()V", "GENERIC", "", "USER_CANCEL", "ATTEMPT_FAILED", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class JumioRetryReasonGeneric {
    public static final int ATTEMPT_FAILED = 4;
    public static final int GENERIC = 1;

    @NotNull
    public static final JumioRetryReasonGeneric INSTANCE = new JumioRetryReasonGeneric();
    public static final int USER_CANCEL = 2;
}
