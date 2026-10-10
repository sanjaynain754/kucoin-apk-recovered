package com.jumio.sdk.enums;

import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m90084d2 = {"docProofOptionToJumioAcquireMode", "Lcom/jumio/sdk/enums/JumioAcquireMode;", TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT, "", "jumio-core_release"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class JumioAcquireModeKt {
    @NotNull
    public static final JumioAcquireMode docProofOptionToJumioAcquireMode(@NotNull String option) {
        Intrinsics.checkNotNullParameter(option, "option");
        if (Intrinsics.areEqual(option, "camera_capture")) {
            return JumioAcquireMode.CAMERA;
        }
        if (Intrinsics.areEqual(option, "upload")) {
            return JumioAcquireMode.FILE;
        }
        throw new IllegalArgumentException("No JumioAcquireMode available for " + option);
    }
}
