.class public final Lob/a;
.super Ljava/lang/Object;
.source "InstrumentBuilder.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lob/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\u0008\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000c\u001a\u0004\u0008\r\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lob/a;",
        "",
        "Lcom/kubi/chat/entity/ChatMessage;",
        "chatMessage",
        "<init>",
        "(Lcom/kubi/chat/entity/ChatMessage;)V",
        "Lcom/kubi/chat/entity/InstrumentTypeEnum;",
        "type",
        "c",
        "(Lcom/kubi/chat/entity/InstrumentTypeEnum;)Lob/a;",
        "a",
        "()Lcom/kubi/chat/entity/ChatMessage;",
        "Lcom/kubi/chat/entity/ChatMessage;",
        "b",
        "Lcom/kubi/chat/entity/InstrumentTypeEnum;",
        "instrumentType",
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
.field public final a:Lcom/kubi/chat/entity/ChatMessage;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:Lcom/kubi/chat/entity/InstrumentTypeEnum;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/kubi/chat/entity/ChatMessage;)V
    .locals 1
    .param p1    # Lcom/kubi/chat/entity/ChatMessage;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "chatMessage"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lob/a;->a:Lcom/kubi/chat/entity/ChatMessage;

    .line 11
    .line 12
    sget-object p1, Lcom/kubi/chat/entity/InstrumentTypeEnum;->UNRECOGNIZED:Lcom/kubi/chat/entity/InstrumentTypeEnum;

    .line 13
    .line 14
    iput-object p1, p0, Lob/a;->b:Lcom/kubi/chat/entity/InstrumentTypeEnum;

    .line 15
    return-void
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


# virtual methods
.method public final a()Lcom/kubi/chat/entity/ChatMessage;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lob/a;->b:Lcom/kubi/chat/entity/InstrumentTypeEnum;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/chat/entity/InstrumentTypeEnum;->UNRECOGNIZED:Lcom/kubi/chat/entity/InstrumentTypeEnum;

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    .line 10
    :cond_0
    sget-object v0, Lcom/kubi/chat/proto/ProtocolFrameKt$Dsl;->b:Lcom/kubi/chat/proto/ProtocolFrameKt$Dsl$Companion;

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;->newBuilder()Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame$a;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    const-string v2, "newBuilder()"

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/kubi/chat/proto/ProtocolFrameKt$Dsl$Companion;->_create(Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame$a;)Lcom/kubi/chat/proto/ProtocolFrameKt$Dsl;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lob/a;->b()Lcom/kubi/chat/entity/ChatMessage;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Lcom/kubi/chat/entity/ChatMessage;->getDataPro()Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;->getHeader()Lcom/kubi/chat/proto/ImProtocol$ProtocolHeader;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    const-string v3, "chatMessage.getDataPro().header"

    .line 38
    .line 39
    .line 40
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    sget-object v3, Lcom/kubi/chat/proto/ProtocolHeaderKt$Dsl;->b:Lcom/kubi/chat/proto/ProtocolHeaderKt$Dsl$Companion;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Lcom/google/protobuf/GeneratedMessageLite;->toBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    const-string v4, "this.toBuilder()"

    .line 49
    .line 50
    .line 51
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    check-cast v1, Lcom/kubi/chat/proto/ImProtocol$ProtocolHeader$a;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3, v1}, Lcom/kubi/chat/proto/ProtocolHeaderKt$Dsl$Companion;->_create(Lcom/kubi/chat/proto/ImProtocol$ProtocolHeader$a;)Lcom/kubi/chat/proto/ProtocolHeaderKt$Dsl;

    .line 57
    move-result-object v1

    .line 58
    .line 59
    sget-object v3, Lcom/kubi/chat/proto/ImProtocol$ProtocolType;->INSTRUMENT:Lcom/kubi/chat/proto/ImProtocol$ProtocolType;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v3}, Lcom/kubi/chat/proto/ProtocolHeaderKt$Dsl;->h(Lcom/kubi/chat/proto/ImProtocol$ProtocolType;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Lcom/kubi/chat/proto/ProtocolHeaderKt$Dsl;->a()Lcom/kubi/chat/proto/ImProtocol$ProtocolHeader;

    .line 66
    move-result-object v1

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v1}, Lcom/kubi/chat/proto/ProtocolFrameKt$Dsl;->b(Lcom/kubi/chat/proto/ImProtocol$ProtocolHeader;)V

    .line 70
    .line 71
    sget-object v1, Lcom/kubi/chat/proto/InstrumentKt$Dsl;->b:Lcom/kubi/chat/proto/InstrumentKt$Dsl$Companion;

    .line 72
    .line 73
    .line 74
    invoke-static {}, Lcom/kubi/chat/proto/ImProtocol$Instrument;->newBuilder()Lcom/kubi/chat/proto/ImProtocol$Instrument$a;

    .line 75
    move-result-object v3

    .line 76
    .line 77
    .line 78
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v3}, Lcom/kubi/chat/proto/InstrumentKt$Dsl$Companion;->_create(Lcom/kubi/chat/proto/ImProtocol$Instrument$a;)Lcom/kubi/chat/proto/InstrumentKt$Dsl;

    .line 82
    move-result-object v1

    .line 83
    .line 84
    iget-object v2, p0, Lob/a;->b:Lcom/kubi/chat/entity/InstrumentTypeEnum;

    .line 85
    .line 86
    sget-object v3, Lob/a$a;->$EnumSwitchMapping$0:[I

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 90
    move-result v2

    .line 91
    .line 92
    aget v2, v3, v2

    .line 93
    const/4 v3, 0x1

    .line 94
    .line 95
    if-eq v2, v3, :cond_2

    .line 96
    const/4 v3, 0x2

    .line 97
    .line 98
    if-eq v2, v3, :cond_1

    .line 99
    .line 100
    sget-object v2, Lcom/kubi/chat/proto/ImProtocol$InstrumentType;->UNRECOGNIZED:Lcom/kubi/chat/proto/ImProtocol$InstrumentType;

    .line 101
    goto :goto_0

    .line 102
    .line 103
    :cond_1
    sget-object v2, Lcom/kubi/chat/proto/ImProtocol$InstrumentType;->ACK:Lcom/kubi/chat/proto/ImProtocol$InstrumentType;

    .line 104
    goto :goto_0

    .line 105
    .line 106
    :cond_2
    sget-object v2, Lcom/kubi/chat/proto/ImProtocol$InstrumentType;->MESSAGE_READ:Lcom/kubi/chat/proto/ImProtocol$InstrumentType;

    .line 107
    .line 108
    .line 109
    :goto_0
    invoke-virtual {v1, v2}, Lcom/kubi/chat/proto/InstrumentKt$Dsl;->b(Lcom/kubi/chat/proto/ImProtocol$InstrumentType;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, Lcom/kubi/chat/proto/InstrumentKt$Dsl;->a()Lcom/kubi/chat/proto/ImProtocol$Instrument;

    .line 113
    move-result-object v1

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v1}, Lcom/kubi/chat/proto/ProtocolFrameKt$Dsl;->c(Lcom/kubi/chat/proto/ImProtocol$Instrument;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Lcom/kubi/chat/proto/ProtocolFrameKt$Dsl;->a()Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;

    .line 120
    move-result-object v0

    .line 121
    .line 122
    new-instance v1, Lcom/kubi/chat/entity/ChatMessage;

    .line 123
    .line 124
    .line 125
    invoke-direct {v1, v0}, Lcom/kubi/chat/entity/ChatMessage;-><init>(Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;)V

    .line 126
    return-object v1
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

.method public final b()Lcom/kubi/chat/entity/ChatMessage;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lob/a;->a:Lcom/kubi/chat/entity/ChatMessage;

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

.method public final c(Lcom/kubi/chat/entity/InstrumentTypeEnum;)Lob/a;
    .locals 1
    .param p1    # Lcom/kubi/chat/entity/InstrumentTypeEnum;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "type"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lob/a;->b:Lcom/kubi/chat/entity/InstrumentTypeEnum;

    .line 8
    return-object p0
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
