package io.trtc.tuikit.atomicxcore.api.message;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/MessageMediaFileType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "THUMB_IMAGE", "LARGE_IMAGE", "ORIGINAL_IMAGE", "VIDEO_SNAPSHOT", "VIDEO", "SOUND", "FILE", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public enum MessageMediaFileType {
    THUMB_IMAGE(0),
    LARGE_IMAGE(1),
    ORIGINAL_IMAGE(2),
    VIDEO_SNAPSHOT(3),
    VIDEO(4),
    SOUND(5),
    FILE(6);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final int value;

    @NotNull
    public static EnumEntries<MessageMediaFileType> getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }

    MessageMediaFileType(int i11) {
        this.value = i11;
    }
}
