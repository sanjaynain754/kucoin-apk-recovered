package com.kubi.chat.entity;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p468nb.C42792a;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: IChatMessage.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0004J\u001b\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0012H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0002H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0000H&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 H&¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0002H&¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0002H&¢\u0006\u0004\b'\u0010\u0004J\u0019\u0010)\u001a\u00020\u00162\b\u0010(\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b)\u0010*J\u0011\u0010+\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u001aH&¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0002H&¢\u0006\u0004\b/\u0010\u0004J\u0017\u00101\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u0002H&¢\u0006\u0004\b1\u0010&J\u000f\u00102\u001a\u00020\u0002H&¢\u0006\u0004\b2\u0010\u0004¨\u00063"}, m90084d2 = {"Lcom/kubi/chat/entity/IChatMessage;", "", "", "getUniqueId", "()Ljava/lang/String;", "getFromUid", "getToUid", "", "getSeqId", "()J", "getTimestamp", "getContent", "", "getMetadata", "()Ljava/util/Map;", "Lcom/kubi/chat/entity/MsgTypeEnum;", "getMsgType", "()Lcom/kubi/chat/entity/MsgTypeEnum;", "Lcom/kubi/chat/entity/MsgStatusEnum;", "getStatus", "()Lcom/kubi/chat/entity/MsgStatusEnum;", "status", "", "setStatus", "(Lcom/kubi/chat/entity/MsgStatusEnum;)V", "uid", "", "isOutDirect", "(Ljava/lang/String;)Z", "message", "isTheSame", "(Lcom/kubi/chat/entity/IChatMessage;)Z", "Lnb/a;", "conversation", "isMsgRead", "(Lnb/a;)Z", "path", "setLocalPath", "(Ljava/lang/String;)V", "getLocalPath", "size", "setCompressSize", "(Ljava/lang/Long;)V", "getCompressSize", "()Ljava/lang/Long;", "hasPicUrl", "()Z", "getInstrumentMsg", "content", "setFailedInfo", "getFailedInfo", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public interface IChatMessage {
    @Nullable
    Long getCompressSize();

    @NotNull
    String getContent();

    @NotNull
    String getFailedInfo();

    @NotNull
    String getFromUid();

    @NotNull
    String getInstrumentMsg();

    @NotNull
    String getLocalPath();

    @NotNull
    Map<String, String> getMetadata();

    @NotNull
    MsgTypeEnum getMsgType();

    long getSeqId();

    @NotNull
    MsgStatusEnum getStatus();

    long getTimestamp();

    @NotNull
    String getToUid();

    @NotNull
    String getUniqueId();

    boolean hasPicUrl();

    boolean isMsgRead(@NotNull C42792a conversation);

    boolean isOutDirect(@NotNull String uid);

    boolean isTheSame(@NotNull IChatMessage message);

    void setCompressSize(@Nullable Long size);

    void setFailedInfo(@NotNull String content);

    void setLocalPath(@NotNull String path);

    void setStatus(@NotNull MsgStatusEnum status);
}
