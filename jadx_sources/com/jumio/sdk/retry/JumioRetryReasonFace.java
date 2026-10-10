package com.jumio.sdk.retry;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/jumio/sdk/retry/JumioRetryReasonFace;", "", "<init>", "()V", "GENERIC", "", "TOO_MUCH_MOVEMENT", "LIGHTING_TOO_BRIGHT", "LIGHTING_TOO_DARK", "EYES_CLOSED", "OBSCURED_FACE", "MULTIPLE_FACES", "SUNGLASSES", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class JumioRetryReasonFace {
    public static final int EYES_CLOSED = 3005;
    public static final int GENERIC = 3001;

    @NotNull
    public static final JumioRetryReasonFace INSTANCE = new JumioRetryReasonFace();
    public static final int LIGHTING_TOO_BRIGHT = 3003;
    public static final int LIGHTING_TOO_DARK = 3004;
    public static final int MULTIPLE_FACES = 3007;
    public static final int OBSCURED_FACE = 3006;
    public static final int SUNGLASSES = 3008;
    public static final int TOO_MUCH_MOVEMENT = 3002;
}
