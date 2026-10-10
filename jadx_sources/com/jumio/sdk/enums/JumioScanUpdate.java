package com.jumio.sdk.enums;

import com.jumio.core.extraction.docfinder.processor.tilted.TiltedImageProcessor;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, m90084d2 = {"Lcom/jumio/sdk/enums/JumioScanUpdate;", "", "<init>", "(Ljava/lang/String;I)V", "CAMERA_AVAILABLE", "FALLBACK", "NFC_EXTRACTION_STARTED", "NFC_EXTRACTION_PROGRESS", "NFC_EXTRACTION_FINISHED", "CENTER_ID", "HOLD_STRAIGHT", "MOVE_CLOSER", "TOO_CLOSE", "HOLD_STILL", "MOVE_FACE_INTO_FRAME", "CENTER_FACE", "LEVEL_EYES_AND_DEVICE", "TILT_FACE_UP", "TILT_FACE_DOWN", "TILT_FACE_LEFT", "TILT_FACE_RIGHT", "MOVE_FACE_CLOSER", "FACE_TOO_CLOSE", "NEXT_POSITION", "FLASH", TiltedImageProcessor.BATCH_ID, "IMAGE_ANALYSIS", "ROTATE", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum JumioScanUpdate {
    CAMERA_AVAILABLE,
    FALLBACK,
    NFC_EXTRACTION_STARTED,
    NFC_EXTRACTION_PROGRESS,
    NFC_EXTRACTION_FINISHED,
    CENTER_ID,
    HOLD_STRAIGHT,
    MOVE_CLOSER,
    TOO_CLOSE,
    HOLD_STILL,
    MOVE_FACE_INTO_FRAME,
    CENTER_FACE,
    LEVEL_EYES_AND_DEVICE,
    TILT_FACE_UP,
    TILT_FACE_DOWN,
    TILT_FACE_LEFT,
    TILT_FACE_RIGHT,
    MOVE_FACE_CLOSER,
    FACE_TOO_CLOSE,
    NEXT_POSITION,
    FLASH,
    TILT,
    IMAGE_ANALYSIS,
    ROTATE;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<JumioScanUpdate> getEntries() {
        return $ENTRIES;
    }
}
