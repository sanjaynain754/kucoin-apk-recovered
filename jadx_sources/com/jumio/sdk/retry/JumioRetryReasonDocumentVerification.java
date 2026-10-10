package com.jumio.sdk.retry;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/jumio/sdk/retry/JumioRetryReasonDocumentVerification;", "", "<init>", "()V", "DOCUMENT_NOT_READABLE", "", "DOCUMENT_ENCRYPTED", "DOCUMENT_PAGE_LIMIT", "DOCUMENT_SIZE_LIMIT", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class JumioRetryReasonDocumentVerification {
    public static final int DOCUMENT_ENCRYPTED = 402;
    public static final int DOCUMENT_NOT_READABLE = 401;
    public static final int DOCUMENT_PAGE_LIMIT = 403;
    public static final int DOCUMENT_SIZE_LIMIT = 404;

    @NotNull
    public static final JumioRetryReasonDocumentVerification INSTANCE = new JumioRetryReasonDocumentVerification();
}
