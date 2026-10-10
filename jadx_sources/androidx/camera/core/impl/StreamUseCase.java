package androidx.camera.core.impl;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: StreamUseCase.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0011"}, m90084d2 = {"Landroidx/camera/core/impl/StreamUseCase;", "", "intValue", "", "<init>", "(Ljava/lang/String;II)V", "DEFAULT", "PREVIEW", "VIDEO_RECORD", "STILL_CAPTURE", "VIDEO_CALL", "PREVIEW_VIDEO_STILL", "CROPPED_RAW", "value", "", "getValue", "()J", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public enum StreamUseCase {
    DEFAULT(0),
    PREVIEW(1),
    VIDEO_RECORD(3),
    STILL_CAPTURE(2),
    VIDEO_CALL(5),
    PREVIEW_VIDEO_STILL(4),
    CROPPED_RAW(6);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final long value;

    @NotNull
    public static EnumEntries<StreamUseCase> getEntries() {
        return $ENTRIES;
    }

    public final long getValue() {
        return this.value;
    }

    StreamUseCase(int i11) {
        this.value = i11;
    }
}
