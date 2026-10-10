package com.jumio.core.data;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/jumio/core/data/UploadType;", "", "<init>", "()V", UploadType.FRONTSIDE, "", UploadType.BACKSIDE, UploadType.FACE, UploadType.LIVENESS_SERIES, UploadType.DOCUMENT, UploadType.JUMIO_LIVENESS, "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UploadType {

    @NotNull
    public static final String BACKSIDE = "BACKSIDE";

    @NotNull
    public static final String DOCUMENT = "DOCUMENT";

    @NotNull
    public static final String FACE = "FACE";

    @NotNull
    public static final String FRONTSIDE = "FRONTSIDE";

    @NotNull
    public static final UploadType INSTANCE = new UploadType();

    @NotNull
    public static final String JUMIO_LIVENESS = "JUMIO_LIVENESS";

    @NotNull
    public static final String LIVENESS_SERIES = "LIVENESS_SERIES";

    private UploadType() {
    }
}
