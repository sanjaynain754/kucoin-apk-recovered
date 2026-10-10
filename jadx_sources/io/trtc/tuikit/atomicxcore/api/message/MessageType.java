package io.trtc.tuikit.atomicxcore.api.message;

import com.jumio.core.data.UploadType;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/MessageType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "UNKNOWN", "TEXT", "IMAGE", "VIDEO", "SOUND", "FILE", UploadType.FACE, "SYSTEM", "CUSTOM", "MERGED", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public enum MessageType {
    UNKNOWN(0),
    TEXT(1),
    IMAGE(2),
    VIDEO(3),
    SOUND(4),
    FILE(5),
    FACE(6),
    SYSTEM(7),
    CUSTOM(8),
    MERGED(9);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final int value;

    @NotNull
    public static EnumEntries<MessageType> getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }

    MessageType(int i11) {
        this.value = i11;
    }
}
