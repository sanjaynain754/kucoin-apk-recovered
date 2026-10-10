package com.jumio.sdk.reject;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/jumio/sdk/reject/JumioRejectReason;", "", "<init>", "()V", "DIGITAL_COPY", "", "NOT_READABLE", "NO_DOC", "MISSING_BACK", "MISSING_FRONT", "UNSUPPORTED_DOCUMENT", "INVALID_CERTIFICATE", "BLURRY", "MISSING_PART_DOC", "HIDDEN_PART_DOC", "DAMAGED_DOCUMENT", "GLARE", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class JumioRejectReason {

    @NotNull
    public static final String BLURRY = "2001";

    @NotNull
    public static final String DAMAGED_DOCUMENT = "2005";

    @NotNull
    public static final String DIGITAL_COPY = "104";

    @NotNull
    public static final String GLARE = "2006";

    @NotNull
    public static final String HIDDEN_PART_DOC = "2004";

    @NotNull
    public static final JumioRejectReason INSTANCE = new JumioRejectReason();

    @NotNull
    public static final String INVALID_CERTIFICATE = "501";

    @NotNull
    public static final String MISSING_BACK = "206";

    @NotNull
    public static final String MISSING_FRONT = "214";

    @NotNull
    public static final String MISSING_PART_DOC = "2003";

    @NotNull
    public static final String NOT_READABLE = "200";

    @NotNull
    public static final String NO_DOC = "201";

    @NotNull
    public static final String UNSUPPORTED_DOCUMENT = "401";
}
