package io.trtc.tuikit.atomicxcore.api.message;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "INIT", "SENDING", "SEND_SUCCESS", "SEND_FAIL", "RECALLED", "DELETED", "LOCAL_IMPORTED", "VIOLATION", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public enum MessageStatus {
    INIT(0),
    SENDING(1),
    SEND_SUCCESS(2),
    SEND_FAIL(3),
    RECALLED(4),
    DELETED(5),
    LOCAL_IMPORTED(6),
    VIOLATION(7);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final int value;

    @NotNull
    public static EnumEntries<MessageStatus> getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }

    MessageStatus(int i11) {
        this.value = i11;
    }
}
