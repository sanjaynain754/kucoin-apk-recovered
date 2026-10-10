package com.kubi.chat.entity;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: IProtoMessage.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\tH&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0003H&¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/chat/entity/IProtoMessage;", "", "getMContent", "", "getMDeviceId", "getMFrom", "getMMetadata", "", "getMSeqId", "", "getMSid", "getMTimestamp", "getMTo", "getMType", "Lcom/kubi/chat/entity/MsgTypeEnum;", "getMUniqueId", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public interface IProtoMessage {
    @NotNull
    String getMContent();

    @NotNull
    String getMDeviceId();

    @NotNull
    String getMFrom();

    @NotNull
    Map<String, String> getMMetadata();

    long getMSeqId();

    @NotNull
    String getMSid();

    long getMTimestamp();

    @NotNull
    String getMTo();

    @NotNull
    MsgTypeEnum getMType();

    @NotNull
    String getMUniqueId();
}
