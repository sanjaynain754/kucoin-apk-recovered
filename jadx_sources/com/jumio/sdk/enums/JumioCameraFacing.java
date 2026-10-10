package com.jumio.sdk.enums;

import com.jumio.core.constants.ConstantsKt;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m90084d2 = {"Lcom/jumio/sdk/enums/JumioCameraFacing;", "", "<init>", "(Ljava/lang/String;I)V", "FRONT", "BACK", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum JumioCameraFacing {
    FRONT,
    BACK;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/sdk/enums/JumioCameraFacing$Companion;", "", "<init>", "()V", "fromFaceCaptureMode", "Lcom/jumio/sdk/enums/JumioCameraFacing;", "faceCaptureMode", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        @NotNull
        public final JumioCameraFacing fromFaceCaptureMode(@NotNull String faceCaptureMode) {
            Intrinsics.checkNotNullParameter(faceCaptureMode, "faceCaptureMode");
            if (Intrinsics.areEqual(faceCaptureMode, ConstantsKt.FACE_CAPTURE_MODE_FRONT)) {
                return JumioCameraFacing.FRONT;
            }
            if (Intrinsics.areEqual(faceCaptureMode, ConstantsKt.FACE_CAPTURE_MODE_BACK)) {
                return JumioCameraFacing.BACK;
            }
            throw new IllegalArgumentException("Invalid faceCaptureMode: faceCaptureMode");
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @NotNull
    public static EnumEntries<JumioCameraFacing> getEntries() {
        return $ENTRIES;
    }
}
