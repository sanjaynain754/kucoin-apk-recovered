.class public final Lcom/kubi/chat/entity/ChatMessage;
.super Ljava/lang/Object;
.source "ChatMessage.kt"

# interfaces
.implements Lcom/kubi/chat/entity/IChatMessage;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/chat/entity/ChatMessage$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\rJ\u001b\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00080\u000fH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\nJ\u000f\u0010\u0013\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\nJ\u000f\u0010\u0014\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\nJ\u000f\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008!\u0010\"J\u0017\u0010$\u001a\u00020 2\u0006\u0010#\u001a\u00020\u0001H\u0016\u00a2\u0006\u0004\u0008$\u0010%J\u0017\u0010(\u001a\u00020 2\u0006\u0010\'\u001a\u00020&H\u0016\u00a2\u0006\u0004\u0008(\u0010)J\u0017\u0010+\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008+\u0010,J\u000f\u0010-\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008-\u0010\nJ\u0019\u0010/\u001a\u00020\u001c2\u0008\u0010.\u001a\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0004\u0008/\u00100J\u0011\u00101\u001a\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0004\u00081\u00102J\u000f\u00103\u001a\u00020 H\u0016\u00a2\u0006\u0004\u00083\u00104J\u000f\u00105\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u00085\u0010\nJ\u0017\u00107\u001a\u00020\u001c2\u0006\u00106\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u00087\u0010,J\u000f\u00108\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u00088\u0010\nJ\r\u0010:\u001a\u000209\u00a2\u0006\u0004\u0008:\u0010;J\r\u0010<\u001a\u00020\u0002\u00a2\u0006\u0004\u0008<\u0010=R\u0016\u0010>\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008>\u0010?R\u0016\u0010@\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008@\u0010AR\u0018\u0010B\u001a\u0004\u0018\u00010\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008B\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008D\u0010ER\u0018\u0010F\u001a\u0004\u0018\u00010\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008F\u0010C\u00a8\u0006G"
    }
    d2 = {
        "Lcom/kubi/chat/entity/ChatMessage;",
        "Lcom/kubi/chat/entity/IChatMessage;",
        "Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;",
        "data",
        "<init>",
        "(Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;)V",
        "Lcom/kubi/chat/entity/IProtoMessage;",
        "(Lcom/kubi/chat/entity/IProtoMessage;)V",
        "",
        "getUniqueId",
        "()Ljava/lang/String;",
        "",
        "getSeqId",
        "()J",
        "getTimestamp",
        "",
        "getMetadata",
        "()Ljava/util/Map;",
        "getFromUid",
        "getToUid",
        "getContent",
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
        "Lokio/ByteString;",
        "getDataByte",
        "()Lokio/ByteString;",
        "getDataPro",
        "()Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;",
        "protoMessage",
        "Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;",
        "messageStatus",
        "Lcom/kubi/chat/entity/MsgStatusEnum;",
        "localPath",
        "Ljava/lang/String;",
        "compressSize",
        "Ljava/lang/Long;",
        "failedInfo",
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


# instance fields
.field private compressSize:Ljava/lang/Long;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private failedInfo:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private localPath:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private messageStatus:Lcom/kubi/chat/entity/MsgStatusEnum;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private protoMessage:Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/kubi/chat/entity/IProtoMessage;)V
    .locals 6
    .param p1    # Lcom/kubi/chat/entity/IProtoMessage;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    sget-object v0, Lcom/kubi/chat/entity/MsgStatusEnum;->UNDEF:Lcom/kubi/chat/entity/MsgStatusEnum;

    iput-object v0, p0, Lcom/kubi/chat/entity/ChatMessage;->messageStatus:Lcom/kubi/chat/entity/MsgStatusEnum;

    .line 6
    sget-object v0, Lcom/kubi/chat/proto/ProtocolFrameKt$Dsl;->b:Lcom/kubi/chat/proto/ProtocolFrameKt$Dsl$Companion;

    invoke-static {}, Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;->newBuilder()Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame$a;

    move-result-object v1

    const-string v2, "newBuilder()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/kubi/chat/proto/ProtocolFrameKt$Dsl$Companion;->_create(Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame$a;)Lcom/kubi/chat/proto/ProtocolFrameKt$Dsl;

    move-result-object v0

    .line 7
    sget-object v1, Lcom/kubi/chat/proto/ProtocolHeaderKt$Dsl;->b:Lcom/kubi/chat/proto/ProtocolHeaderKt$Dsl$Companion;

    invoke-static {}, Lcom/kubi/chat/proto/ImProtocol$ProtocolHeader;->newBuilder()Lcom/kubi/chat/proto/ImProtocol$ProtocolHeader$a;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Lcom/kubi/chat/proto/ProtocolHeaderKt$Dsl$Companion;->_create(Lcom/kubi/chat/proto/ImProtocol$ProtocolHeader$a;)Lcom/kubi/chat/proto/ProtocolHeaderKt$Dsl;

    move-result-object v1

    const/4 v3, 0x1

    .line 8
    invoke-virtual {v1, v3}, Lcom/kubi/chat/proto/ProtocolHeaderKt$Dsl;->k(I)V

    .line 9
    invoke-interface {p1}, Lcom/kubi/chat/entity/IProtoMessage;->getMUniqueId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/kubi/chat/proto/ProtocolHeaderKt$Dsl;->j(Ljava/lang/String;)V

    .line 10
    invoke-interface {p1}, Lcom/kubi/chat/entity/IProtoMessage;->getMFrom()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/kubi/chat/proto/ProtocolHeaderKt$Dsl;->i(Ljava/lang/String;)V

    .line 11
    invoke-interface {p1}, Lcom/kubi/chat/entity/IProtoMessage;->getMSid()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/kubi/chat/proto/ProtocolHeaderKt$Dsl;->f(Ljava/lang/String;)V

    .line 12
    invoke-interface {p1}, Lcom/kubi/chat/entity/IProtoMessage;->getMSeqId()J

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Lcom/kubi/chat/proto/ProtocolHeaderKt$Dsl;->e(J)V

    .line 13
    sget-object v4, Lcom/kubi/chat/proto/ImProtocol$ProtocolType;->MESSAGE:Lcom/kubi/chat/proto/ImProtocol$ProtocolType;

    invoke-virtual {v1, v4}, Lcom/kubi/chat/proto/ProtocolHeaderKt$Dsl;->h(Lcom/kubi/chat/proto/ImProtocol$ProtocolType;)V

    .line 14
    invoke-interface {p1}, Lcom/kubi/chat/entity/IProtoMessage;->getMDeviceId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/kubi/chat/proto/ProtocolHeaderKt$Dsl;->d(Ljava/lang/String;)V

    .line 15
    invoke-interface {p1}, Lcom/kubi/chat/entity/IProtoMessage;->getMTimestamp()J

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Lcom/kubi/chat/proto/ProtocolHeaderKt$Dsl;->g(J)V

    .line 16
    invoke-virtual {v1}, Lcom/kubi/chat/proto/ProtocolHeaderKt$Dsl;->b()Lcom/google/protobuf/kotlin/DslMap;

    move-result-object v4

    invoke-interface {p1}, Lcom/kubi/chat/entity/IProtoMessage;->getMMetadata()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Lcom/kubi/chat/proto/ProtocolHeaderKt$Dsl;->c(Lcom/google/protobuf/kotlin/DslMap;Ljava/util/Map;)V

    .line 17
    invoke-virtual {v1}, Lcom/kubi/chat/proto/ProtocolHeaderKt$Dsl;->a()Lcom/kubi/chat/proto/ImProtocol$ProtocolHeader;

    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Lcom/kubi/chat/proto/ProtocolFrameKt$Dsl;->b(Lcom/kubi/chat/proto/ImProtocol$ProtocolHeader;)V

    .line 19
    sget-object v1, Lcom/kubi/chat/proto/MessageKt$Dsl;->b:Lcom/kubi/chat/proto/MessageKt$Dsl$Companion;

    invoke-static {}, Lcom/kubi/chat/proto/ImProtocol$Message;->newBuilder()Lcom/kubi/chat/proto/ImProtocol$Message$a;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Lcom/kubi/chat/proto/MessageKt$Dsl$Companion;->_create(Lcom/kubi/chat/proto/ImProtocol$Message$a;)Lcom/kubi/chat/proto/MessageKt$Dsl;

    move-result-object v1

    .line 20
    invoke-interface {p1}, Lcom/kubi/chat/entity/IProtoMessage;->getMFrom()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/kubi/chat/proto/MessageKt$Dsl;->c(Ljava/lang/String;)V

    .line 21
    invoke-interface {p1}, Lcom/kubi/chat/entity/IProtoMessage;->getMTo()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/kubi/chat/proto/MessageKt$Dsl;->d(Ljava/lang/String;)V

    .line 22
    invoke-interface {p1}, Lcom/kubi/chat/entity/IProtoMessage;->getMContent()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/kubi/chat/proto/MessageKt$Dsl;->b(Ljava/lang/String;)V

    .line 23
    invoke-interface {p1}, Lcom/kubi/chat/entity/IProtoMessage;->getMType()Lcom/kubi/chat/entity/MsgTypeEnum;

    move-result-object p1

    sget-object v2, Lcom/kubi/chat/entity/ChatMessage$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v2, p1

    if-eq p1, v3, :cond_1

    const/4 v2, 0x2

    if-eq p1, v2, :cond_0

    .line 24
    sget-object p1, Lcom/kubi/chat/proto/ImProtocol$MessageType;->UNRECOGNIZED:Lcom/kubi/chat/proto/ImProtocol$MessageType;

    goto :goto_0

    .line 25
    :cond_0
    sget-object p1, Lcom/kubi/chat/proto/ImProtocol$MessageType;->IMAGE:Lcom/kubi/chat/proto/ImProtocol$MessageType;

    goto :goto_0

    .line 26
    :cond_1
    sget-object p1, Lcom/kubi/chat/proto/ImProtocol$MessageType;->TEXT:Lcom/kubi/chat/proto/ImProtocol$MessageType;

    .line 27
    :goto_0
    invoke-virtual {v1, p1}, Lcom/kubi/chat/proto/MessageKt$Dsl;->e(Lcom/kubi/chat/proto/ImProtocol$MessageType;)V

    .line 28
    invoke-virtual {v1}, Lcom/kubi/chat/proto/MessageKt$Dsl;->a()Lcom/kubi/chat/proto/ImProtocol$Message;

    move-result-object p1

    .line 29
    invoke-virtual {v0, p1}, Lcom/kubi/chat/proto/ProtocolFrameKt$Dsl;->d(Lcom/kubi/chat/proto/ImProtocol$Message;)V

    .line 30
    invoke-virtual {v0}, Lcom/kubi/chat/proto/ProtocolFrameKt$Dsl;->a()Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;

    move-result-object p1

    .line 31
    iput-object p1, p0, Lcom/kubi/chat/entity/ChatMessage;->protoMessage:Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;

    return-void
.end method

.method public constructor <init>(Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;)V
    .locals 1
    .param p1    # Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lcom/kubi/chat/entity/MsgStatusEnum;->UNDEF:Lcom/kubi/chat/entity/MsgStatusEnum;

    iput-object v0, p0, Lcom/kubi/chat/entity/ChatMessage;->messageStatus:Lcom/kubi/chat/entity/MsgStatusEnum;

    .line 3
    iput-object p1, p0, Lcom/kubi/chat/entity/ChatMessage;->protoMessage:Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;

    return-void
.end method


# virtual methods
.method public getCompressSize()Ljava/lang/Long;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/chat/entity/ChatMessage;->compressSize:Ljava/lang/Long;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public getContent()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/chat/entity/ChatMessage;->protoMessage:Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;->getMessage()Lcom/kubi/chat/proto/ImProtocol$Message;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/chat/proto/ImProtocol$Message;->getContent()Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lub/b;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    move-result-object v0

    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public final getDataByte()Lokio/ByteString;
    .locals 6
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lokio/ByteString;->Companion:Lokio/ByteString$Companion;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/kubi/chat/entity/ChatMessage;->protoMessage:Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/google/protobuf/AbstractMessageLite;->toByteArray()[B

    .line 8
    move-result-object v1

    .line 9
    .line 10
    const-string v2, "protoMessage.toByteArray()"

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    const/4 v4, 0x3

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    .line 19
    .line 20
    invoke-static/range {v0 .. v5}, Lokio/ByteString$Companion;->of$default(Lokio/ByteString$Companion;[BIIILjava/lang/Object;)Lokio/ByteString;

    .line 21
    move-result-object v0

    .line 22
    return-object v0
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public final getDataPro()Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/chat/entity/ChatMessage;->protoMessage:Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public getFailedInfo()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/chat/entity/ChatMessage;->failedInfo:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lub/b;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public getFromUid()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/chat/entity/ChatMessage;->protoMessage:Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;->getMessage()Lcom/kubi/chat/proto/ImProtocol$Message;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/chat/proto/ImProtocol$Message;->getFrom()Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lub/b;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    move-result-object v0

    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public getInstrumentMsg()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/chat/entity/ChatMessage;->protoMessage:Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;->getInstrument()Lcom/kubi/chat/proto/ImProtocol$Instrument;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/chat/proto/ImProtocol$Instrument;->getMsg()Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    const-string v1, "protoMessage.instrument.msg"

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public getLocalPath()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/chat/entity/ChatMessage;->localPath:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lub/b;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public getMetadata()Ljava/util/Map;
    .locals 1
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

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/chat/entity/ChatMessage;->protoMessage:Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;->getHeader()Lcom/kubi/chat/proto/ImProtocol$ProtocolHeader;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/chat/proto/ImProtocol$ProtocolHeader;->getMetadataMap()Ljava/util/Map;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 16
    move-result-object v0

    .line 17
    :cond_0
    return-object v0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public getMsgType()Lcom/kubi/chat/entity/MsgTypeEnum;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/chat/entity/ChatMessage;->protoMessage:Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;->getMessage()Lcom/kubi/chat/proto/ImProtocol$Message;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/chat/proto/ImProtocol$Message;->getType()Lcom/kubi/chat/proto/ImProtocol$MessageType;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    const/4 v0, -0x1

    .line 14
    goto :goto_0

    .line 15
    .line 16
    :cond_0
    sget-object v1, Lcom/kubi/chat/entity/ChatMessage$WhenMappings;->$EnumSwitchMapping$1:[I

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 20
    move-result v0

    .line 21
    .line 22
    aget v0, v1, v0

    .line 23
    :goto_0
    const/4 v1, 0x1

    .line 24
    .line 25
    if-eq v0, v1, :cond_2

    .line 26
    const/4 v1, 0x2

    .line 27
    .line 28
    if-eq v0, v1, :cond_1

    .line 29
    .line 30
    sget-object v0, Lcom/kubi/chat/entity/MsgTypeEnum;->UNDEF:Lcom/kubi/chat/entity/MsgTypeEnum;

    .line 31
    return-object v0

    .line 32
    .line 33
    :cond_1
    sget-object v0, Lcom/kubi/chat/entity/MsgTypeEnum;->IMAGE:Lcom/kubi/chat/entity/MsgTypeEnum;

    .line 34
    return-object v0

    .line 35
    .line 36
    :cond_2
    sget-object v0, Lcom/kubi/chat/entity/MsgTypeEnum;->TEXT:Lcom/kubi/chat/entity/MsgTypeEnum;

    .line 37
    return-object v0
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
.end method

.method public getSeqId()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/chat/entity/ChatMessage;->protoMessage:Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;->getHeader()Lcom/kubi/chat/proto/ImProtocol$ProtocolHeader;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/chat/proto/ImProtocol$ProtocolHeader;->getSeqId()J

    .line 10
    move-result-wide v0

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lub/b;->c(Ljava/lang/Long;)J

    .line 18
    move-result-wide v0

    .line 19
    return-wide v0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public getStatus()Lcom/kubi/chat/entity/MsgStatusEnum;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/chat/entity/ChatMessage;->protoMessage:Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;->getInstrument()Lcom/kubi/chat/proto/ImProtocol$Instrument;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/chat/proto/ImProtocol$Instrument;->getType()Lcom/kubi/chat/proto/ImProtocol$InstrumentType;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    const/4 v0, -0x1

    .line 14
    goto :goto_0

    .line 15
    .line 16
    :cond_0
    sget-object v1, Lcom/kubi/chat/entity/ChatMessage$WhenMappings;->$EnumSwitchMapping$2:[I

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 20
    move-result v0

    .line 21
    .line 22
    aget v0, v1, v0

    .line 23
    :goto_0
    const/4 v1, 0x1

    .line 24
    .line 25
    if-eq v0, v1, :cond_2

    .line 26
    const/4 v1, 0x2

    .line 27
    .line 28
    if-eq v0, v1, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, Lcom/kubi/chat/entity/ChatMessage;->messageStatus:Lcom/kubi/chat/entity/MsgStatusEnum;

    .line 31
    return-object v0

    .line 32
    .line 33
    :cond_1
    sget-object v0, Lcom/kubi/chat/entity/MsgStatusEnum;->READED:Lcom/kubi/chat/entity/MsgStatusEnum;

    .line 34
    return-object v0

    .line 35
    .line 36
    :cond_2
    sget-object v0, Lcom/kubi/chat/entity/MsgStatusEnum;->DELIVERED:Lcom/kubi/chat/entity/MsgStatusEnum;

    .line 37
    return-object v0
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
.end method

.method public getTimestamp()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/chat/entity/ChatMessage;->protoMessage:Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;->getHeader()Lcom/kubi/chat/proto/ImProtocol$ProtocolHeader;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/chat/proto/ImProtocol$ProtocolHeader;->getTimestamp()J

    .line 10
    move-result-wide v0

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lub/b;->c(Ljava/lang/Long;)J

    .line 18
    move-result-wide v0

    .line 19
    return-wide v0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public getToUid()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/chat/entity/ChatMessage;->protoMessage:Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;->getMessage()Lcom/kubi/chat/proto/ImProtocol$Message;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/chat/proto/ImProtocol$Message;->getTo()Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lub/b;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    move-result-object v0

    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public getUniqueId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/chat/entity/ChatMessage;->protoMessage:Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;->getHeader()Lcom/kubi/chat/proto/ImProtocol$ProtocolHeader;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/chat/proto/ImProtocol$ProtocolHeader;->getUniqueId()Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lub/b;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    move-result-object v0

    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public hasPicUrl()Z
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/chat/entity/ChatMessage;->getContent()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x0

    .line 7
    .line 8
    const-string v3, "http"

    .line 9
    const/4 v4, 0x0

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v3, v4, v1, v2}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public isMsgRead(Lnb/a;)Z
    .locals 4
    .param p1    # Lnb/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "conversation"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/chat/entity/ChatMessage;->getSeqId()J

    .line 9
    move-result-wide v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lnb/a;->g()J

    .line 13
    move-result-wide v2

    .line 14
    .line 15
    cmp-long p1, v0, v2

    .line 16
    .line 17
    if-gtz p1, :cond_0

    .line 18
    const/4 p1, 0x1

    .line 19
    return p1

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return p1
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method

.method public isOutDirect(Ljava/lang/String;)Z
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "uid"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/chat/entity/ChatMessage;->protoMessage:Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;->getHeader()Lcom/kubi/chat/proto/ImProtocol$ProtocolHeader;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/kubi/chat/proto/ImProtocol$ProtocolHeader;->getUid()Ljava/lang/String;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    move-result p1

    .line 20
    return p1
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method

.method public isTheSame(Lcom/kubi/chat/entity/IChatMessage;)Z
    .locals 1
    .param p1    # Lcom/kubi/chat/entity/IChatMessage;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "message"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/chat/entity/ChatMessage;->getUniqueId()Ljava/lang/String;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Lcom/kubi/chat/entity/IChatMessage;->getUniqueId()Ljava/lang/String;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    .line 16
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    move-result p1

    .line 18
    return p1
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method

.method public setCompressSize(Ljava/lang/Long;)V
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/chat/entity/ChatMessage;->compressSize:Ljava/lang/Long;

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method

.method public setFailedInfo(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "content"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/chat/entity/ChatMessage;->failedInfo:Ljava/lang/String;

    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method

.method public setLocalPath(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "path"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/chat/entity/ChatMessage;->localPath:Ljava/lang/String;

    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method

.method public setStatus(Lcom/kubi/chat/entity/MsgStatusEnum;)V
    .locals 1
    .param p1    # Lcom/kubi/chat/entity/MsgStatusEnum;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "status"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/chat/entity/ChatMessage;->messageStatus:Lcom/kubi/chat/entity/MsgStatusEnum;

    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method
