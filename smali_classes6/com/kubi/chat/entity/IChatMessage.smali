.class public interface abstract Lcom/kubi/chat/entity/IChatMessage;
.super Ljava/lang/Object;
.source "IChatMessage.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0013\u0008f\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0006\u0010\u0004J\u000f\u0010\u0008\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u000b\u0010\u0004J\u001b\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000cH&\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0012H&\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0000H&\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 H&\u00a2\u0006\u0004\u0008\"\u0010#J\u0017\u0010%\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008%\u0010&J\u000f\u0010\'\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\'\u0010\u0004J\u0019\u0010)\u001a\u00020\u00162\u0008\u0010(\u001a\u0004\u0018\u00010\u0007H&\u00a2\u0006\u0004\u0008)\u0010*J\u0011\u0010+\u001a\u0004\u0018\u00010\u0007H&\u00a2\u0006\u0004\u0008+\u0010,J\u000f\u0010-\u001a\u00020\u001aH&\u00a2\u0006\u0004\u0008-\u0010.J\u000f\u0010/\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008/\u0010\u0004J\u0017\u00101\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u0002H&\u00a2\u0006\u0004\u00081\u0010&J\u000f\u00102\u001a\u00020\u0002H&\u00a2\u0006\u0004\u00082\u0010\u0004\u00a8\u00063"
    }
    d2 = {
        "Lcom/kubi/chat/entity/IChatMessage;",
        "",
        "",
        "getUniqueId",
        "()Ljava/lang/String;",
        "getFromUid",
        "getToUid",
        "",
        "getSeqId",
        "()J",
        "getTimestamp",
        "getContent",
        "",
        "getMetadata",
        "()Ljava/util/Map;",
        "Lcom/kubi/chat/entity/MsgTypeEnum;",
        "getMsgType",
        "()Lcom/kubi/chat/entity/MsgTypeEnum;",
        "Lcom/kubi/chat/entity/MsgStatusEnum;",
        "getStatus",
        "()Lcom/kubi/chat/entity/MsgStatusEnum;",
        "status",
        "",
        "setStatus",
        "(Lcom/kubi/chat/entity/MsgStatusEnum;)V",
        "uid",
        "",
        "isOutDirect",
        "(Ljava/lang/String;)Z",
        "message",
        "isTheSame",
        "(Lcom/kubi/chat/entity/IChatMessage;)Z",
        "Lnb/a;",
        "conversation",
        "isMsgRead",
        "(Lnb/a;)Z",
        "path",
        "setLocalPath",
        "(Ljava/lang/String;)V",
        "getLocalPath",
        "size",
        "setCompressSize",
        "(Ljava/lang/Long;)V",
        "getCompressSize",
        "()Ljava/lang/Long;",
        "hasPicUrl",
        "()Z",
        "getInstrumentMsg",
        "content",
        "setFailedInfo",
        "getFailedInfo",
        "ImSDK_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract getCompressSize()Ljava/lang/Long;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getContent()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getFailedInfo()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getFromUid()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getInstrumentMsg()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getLocalPath()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getMetadata()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getMsgType()Lcom/kubi/chat/entity/MsgTypeEnum;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getSeqId()J
.end method

.method public abstract getStatus()Lcom/kubi/chat/entity/MsgStatusEnum;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getTimestamp()J
.end method

.method public abstract getToUid()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getUniqueId()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract hasPicUrl()Z
.end method

.method public abstract isMsgRead(Lnb/a;)Z
    .param p1    # Lnb/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract isOutDirect(Ljava/lang/String;)Z
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract isTheSame(Lcom/kubi/chat/entity/IChatMessage;)Z
    .param p1    # Lcom/kubi/chat/entity/IChatMessage;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract setCompressSize(Ljava/lang/Long;)V
    .param p1    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract setFailedInfo(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract setLocalPath(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract setStatus(Lcom/kubi/chat/entity/MsgStatusEnum;)V
    .param p1    # Lcom/kubi/chat/entity/MsgStatusEnum;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
