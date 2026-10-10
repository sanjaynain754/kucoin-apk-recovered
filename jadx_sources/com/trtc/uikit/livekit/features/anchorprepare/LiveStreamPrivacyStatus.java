package com.trtc.uikit.livekit.features.anchorprepare;

import com.trtc.uikit.livekit.R$string;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: AnchorPrepareViewDefine.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorprepare/LiveStreamPrivacyStatus;", "", "resId", "", "<init>", "(Ljava/lang/String;II)V", "getResId", "()I", "PUBLIC", "PRIVACY", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum LiveStreamPrivacyStatus {
    PUBLIC(R$string.common_stream_privacy_status_default),
    PRIVACY(R$string.common_stream_privacy_status_privacy);


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f78461c = EnumEntriesKt.enumEntries(m80617a());
    private final int resId;

    @NotNull
    public static EnumEntries<LiveStreamPrivacyStatus> getEntries() {
        return f78461c;
    }

    public final int getResId() {
        return this.resId;
    }

    LiveStreamPrivacyStatus(int i11) {
        this.resId = i11;
    }
}
