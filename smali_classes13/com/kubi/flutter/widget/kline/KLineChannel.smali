.class public final Lcom/kubi/flutter/widget/kline/KLineChannel;
.super Ljava/lang/Object;
.source "KLineChannel.kt"

# interfaces
.implements Lcom/kubi/flutter/widget/kline/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/flutter/widget/kline/KLineChannel$Companion;,
        Lcom/kubi/flutter/widget/kline/KLineChannel$InnerMessageHandler;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000 ;2\u00020\u0001:\u0002;<B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0019H\u0086@\u00a2\u0006\u0002\u0010\u001bJ\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001d\u001a\u00020\u001eH\u0096@\u00a2\u0006\u0002\u0010\u001fJ\u0018\u0010 \u001a\u0004\u0018\u00010\u00152\u0006\u0010!\u001a\u00020\"H\u0096@\u00a2\u0006\u0002\u0010#J\u0018\u0010$\u001a\u0004\u0018\u00010\u00152\u0006\u0010%\u001a\u00020&H\u0096@\u00a2\u0006\u0002\u0010\'J\u0010\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u000fH\u0016J\u0010\u0010*\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u000fH\u0016J\u0018\u0010+\u001a\u0004\u0018\u00010\u00152\u0006\u0010,\u001a\u00020-H\u0082@\u00a2\u0006\u0002\u0010.J\u0016\u0010/\u001a\u00020\u00082\u0006\u0010,\u001a\u00020-H\u0082@\u00a2\u0006\u0002\u0010.J\u0016\u00100\u001a\u00020\u00152\u0006\u00101\u001a\u000202H\u0082@\u00a2\u0006\u0002\u00103J\r\u00104\u001a\u00020\u0011H\u0000\u00a2\u0006\u0002\u00085J\u000c\u00106\u001a\u00020\u0008*\u000207H\u0002J\"\u00108\u001a\u0004\u0018\u00010\u0015*\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0006\u00109\u001a\u00020\u0008H\u0082@\u00a2\u0006\u0002\u0010:R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006="
    }
    d2 = {
        "Lcom/kubi/flutter/widget/kline/KLineChannel;",
        "Lcom/kubi/flutter/widget/kline/IKLineChannel;",
        "<init>",
        "()V",
        "bufferPool",
        "Lcom/kubi/flutter/widget/kline/utils/ByteBufferPool;",
        "channel",
        "Lio/flutter/plugin/common/BasicMessageChannel;",
        "Ljava/nio/ByteBuffer;",
        "sendLock",
        "Lkotlinx/coroutines/sync/Semaphore;",
        "channelScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "listeners",
        "Lcom/kubi/flutter/widget/kline/utils/EventListeners;",
        "Lcom/kubi/flutter/widget/kline/IKLineChannel$EventListener;",
        "bind",
        "",
        "binaryMessenger",
        "Lio/flutter/plugin/common/BinaryMessenger;",
        "update",
        "Lcom/kubi/flutter/proto/kline/Response;",
        "type",
        "Lcom/kubi/flutter/proto/kline/CandleList$UpdateType;",
        "candleItemList",
        "",
        "Lcom/kubi/flutter/proto/kline/CandleItem;",
        "(Lcom/kubi/flutter/proto/kline/CandleList$UpdateType;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "sendControl",
        "control",
        "Lcom/kubi/flutter/proto/kline/ViewControl;",
        "(Lcom/kubi/flutter/proto/kline/ViewControl;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "sendCandleList",
        "candleListData",
        "Lcom/kubi/flutter/proto/kline/CandleList;",
        "(Lcom/kubi/flutter/proto/kline/CandleList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "sendOrderList",
        "orderListData",
        "Lcom/kubi/flutter/proto/kline/OrderList;",
        "(Lcom/kubi/flutter/proto/kline/OrderList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "addListener",
        "listener",
        "removeListener",
        "send",
        "request",
        "Lcom/kubi/flutter/proto/kline/Request;",
        "(Lcom/kubi/flutter/proto/kline/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "onReceived",
        "onListenerEvent",
        "eventMessage",
        "Lcom/kubi/flutter/proto/kline/EventMessage;",
        "(Lcom/kubi/flutter/proto/kline/EventMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "close",
        "close$LKLineWidget_googleRelease",
        "toByteBuffer",
        "Lcom/google/protobuf/MessageLite;",
        "sendAsync",
        "message",
        "(Lio/flutter/plugin/common/BasicMessageChannel;Ljava/nio/ByteBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Companion",
        "InnerMessageHandler",
        "LKLineWidget_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nKLineChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineChannel.kt\ncom/kubi/flutter/widget/kline/KLineChannel\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 RequestKt.kt\ncom/kubi/flutter/proto/kline/RequestKtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 CandleListKt.kt\ncom/kubi/flutter/proto/kline/CandleListKtKt\n+ 6 KLineIssue.kt\ncom/kubi/flutter/widget/kline/exception/KLineIssueKt\n+ 7 EventListeners.kt\ncom/kubi/flutter/widget/kline/utils/EventListeners\n+ 8 ResponseKt.kt\ncom/kubi/flutter/proto/kline/ResponseKtKt\n*L\n1#1,227:1\n47#2,4:228\n8#3:232\n8#3:236\n8#3:248\n8#3:260\n1#4:233\n1#4:235\n1#4:237\n1#4:249\n1#4:261\n1#4:267\n8#5:234\n51#6,10:238\n51#6,10:250\n45#6,4:268\n46#7,4:262\n8#8:266\n*S KotlinDebug\n*F\n+ 1 KLineChannel.kt\ncom/kubi/flutter/widget/kline/KLineChannel\n*L\n45#1:228,4\n62#1:232\n72#1:236\n84#1:248\n97#1:260\n62#1:233\n63#1:235\n72#1:237\n84#1:249\n97#1:261\n159#1:267\n63#1:234\n81#1:238,10\n94#1:250,10\n172#1:268,4\n157#1:262,4\n159#1:266\n*E\n"
    }
.end annotation


# static fields
.field public static final f:Lcom/kubi/flutter/widget/kline/KLineChannel$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lcom/kubi/flutter/widget/kline/utils/ByteBufferPool;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:Lio/flutter/plugin/common/BasicMessageChannel;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/flutter/plugin/common/BasicMessageChannel<",
            "Ljava/nio/ByteBuffer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final c:Lrg0/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lkotlinx/coroutines/m0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lcom/kubi/flutter/widget/kline/utils/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/kubi/flutter/widget/kline/utils/f<",
            "Lcom/kubi/flutter/widget/kline/a$a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/flutter/widget/kline/KLineChannel$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/flutter/widget/kline/KLineChannel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/flutter/widget/kline/KLineChannel;->f:Lcom/kubi/flutter/widget/kline/KLineChannel$Companion;

    .line 9
    return-void
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
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/kubi/flutter/widget/kline/utils/ByteBufferPool;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/kubi/flutter/widget/kline/utils/ByteBufferPool;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineChannel;->a:Lcom/kubi/flutter/widget/kline/utils/ByteBufferPool;

    .line 11
    const/4 v0, 0x1

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v0}, Lrg0/j;->a(II)Lrg0/g;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    iput-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineChannel;->c:Lrg0/g;

    .line 18
    .line 19
    new-instance v0, Lkotlinx/coroutines/l0;

    .line 20
    .line 21
    const-string v1, "KLineChannel"

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v1}, Lkotlinx/coroutines/l0;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lkotlin/coroutines/AbstractCoroutineContextElement;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    sget-object v1, Lkotlinx/coroutines/CoroutineExceptionHandler;->M0:Lkotlinx/coroutines/CoroutineExceptionHandler$a;

    .line 35
    .line 36
    new-instance v2, Lcom/kubi/flutter/widget/kline/KLineChannel$a;

    .line 37
    .line 38
    .line 39
    invoke-direct {v2, v1}, Lcom/kubi/flutter/widget/kline/KLineChannel$a;-><init>(Lkotlinx/coroutines/CoroutineExceptionHandler$a;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {v0, v2}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    iput-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineChannel;->d:Lkotlinx/coroutines/m0;

    .line 50
    .line 51
    new-instance v0, Lcom/kubi/flutter/widget/kline/utils/f;

    .line 52
    .line 53
    .line 54
    invoke-direct {v0}, Lcom/kubi/flutter/widget/kline/utils/f;-><init>()V

    .line 55
    .line 56
    iput-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineChannel;->e:Lcom/kubi/flutter/widget/kline/utils/f;

    .line 57
    return-void
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
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
.end method

.method public static final synthetic e(Lcom/kubi/flutter/widget/kline/KLineChannel;)Lcom/kubi/flutter/widget/kline/utils/ByteBufferPool;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/flutter/widget/kline/KLineChannel;->a:Lcom/kubi/flutter/widget/kline/utils/ByteBufferPool;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic f(Lcom/kubi/flutter/widget/kline/KLineChannel;)Lio/flutter/plugin/common/BasicMessageChannel;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/flutter/widget/kline/KLineChannel;->b:Lio/flutter/plugin/common/BasicMessageChannel;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic g(Lcom/kubi/flutter/widget/kline/KLineChannel;)Lkotlinx/coroutines/m0;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/flutter/widget/kline/KLineChannel;->d:Lkotlinx/coroutines/m0;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic h(Lcom/kubi/flutter/widget/kline/KLineChannel;)Lrg0/g;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/flutter/widget/kline/KLineChannel;->c:Lrg0/g;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic i(Lcom/kubi/flutter/widget/kline/KLineChannel;Lcom/kubi/flutter/proto/kline/EventMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/flutter/widget/kline/KLineChannel;->o(Lcom/kubi/flutter/proto/kline/EventMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
.end method

.method public static final synthetic j(Lcom/kubi/flutter/widget/kline/KLineChannel;Lcom/kubi/flutter/proto/kline/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/flutter/widget/kline/KLineChannel;->p(Lcom/kubi/flutter/proto/kline/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
.end method

.method public static final synthetic k(Lcom/kubi/flutter/widget/kline/KLineChannel;Lio/flutter/plugin/common/BasicMessageChannel;Ljava/nio/ByteBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lcom/kubi/flutter/widget/kline/KLineChannel;->r(Lio/flutter/plugin/common/BasicMessageChannel;Ljava/nio/ByteBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
.end method

.method public static final synthetic l(Lcom/kubi/flutter/widget/kline/KLineChannel;Lcom/google/protobuf/MessageLite;)Ljava/nio/ByteBuffer;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/flutter/widget/kline/KLineChannel;->s(Lcom/google/protobuf/MessageLite;)Ljava/nio/ByteBuffer;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method


# virtual methods
.method public a(Lcom/kubi/flutter/proto/kline/OrderList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .param p1    # Lcom/kubi/flutter/proto/kline/OrderList;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/flutter/proto/kline/OrderList;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/flutter/proto/kline/Response;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p2, Lcom/kubi/flutter/widget/kline/KLineChannel$sendOrderList$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/flutter/widget/kline/KLineChannel$sendOrderList$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/flutter/widget/kline/KLineChannel$sendOrderList$1;->label:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/kubi/flutter/widget/kline/KLineChannel$sendOrderList$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/flutter/widget/kline/KLineChannel$sendOrderList$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/kubi/flutter/widget/kline/KLineChannel$sendOrderList$1;-><init>(Lcom/kubi/flutter/widget/kline/KLineChannel;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/kubi/flutter/widget/kline/KLineChannel$sendOrderList$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/flutter/widget/kline/KLineChannel$sendOrderList$1;->label:I

    .line 33
    const/4 v3, 0x1

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Lcom/kubi/flutter/widget/kline/KLineChannel$sendOrderList$1;->L$1:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lcom/kubi/flutter/proto/kline/Request;

    .line 42
    .line 43
    iget-object p1, v0, Lcom/kubi/flutter/widget/kline/KLineChannel$sendOrderList$1;->L$0:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lcom/kubi/flutter/proto/kline/OrderList;

    .line 46
    .line 47
    .line 48
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 49
    goto :goto_2

    .line 50
    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    .line 56
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    throw p1

    .line 58
    .line 59
    .line 60
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Lcom/kubi/flutter/proto/kline/OrderList;->getOrderType()Lcom/kubi/flutter/proto/kline/OrderList$OrderType;

    .line 64
    move-result-object p2

    .line 65
    .line 66
    sget-object v2, Lcom/kubi/flutter/proto/kline/OrderList$OrderType;->UNRECOGNIZED:Lcom/kubi/flutter/proto/kline/OrderList$OrderType;

    .line 67
    .line 68
    if-ne p2, v2, :cond_4

    .line 69
    .line 70
    const-string p1, "openDataPush 2 times"

    .line 71
    const/4 p2, 0x0

    .line 72
    .line 73
    const-string v0, "orderType is UNRECOGNIZED"

    .line 74
    const/4 v1, 0x2

    .line 75
    const/4 v2, 0x0

    .line 76
    .line 77
    .line 78
    invoke-static {v0, p1, p2, v1, v2}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 79
    move-result p1

    .line 80
    .line 81
    const-string p2, "KLineChannel"

    .line 82
    .line 83
    if-eqz p1, :cond_3

    .line 84
    .line 85
    new-instance p1, Lcom/kubi/flutter/widget/kline/exception/KLineMessage;

    .line 86
    .line 87
    .line 88
    invoke-direct {p1, v0, p2, v3}, Lcom/kubi/flutter/widget/kline/exception/KLineMessage;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 89
    .line 90
    .line 91
    invoke-static {p1, v2, v1, v2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 92
    goto :goto_1

    .line 93
    .line 94
    .line 95
    :cond_3
    invoke-static {v0, p2}, Log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    :goto_1
    return-object v2

    .line 97
    .line 98
    :cond_4
    sget-object p2, Lcom/kubi/flutter/proto/kline/RequestKt$Dsl;->b:Lcom/kubi/flutter/proto/kline/RequestKt$Dsl$Companion;

    .line 99
    .line 100
    .line 101
    invoke-static {}, Lcom/kubi/flutter/proto/kline/Request;->newBuilder()Lcom/kubi/flutter/proto/kline/Request$b;

    .line 102
    move-result-object v2

    .line 103
    .line 104
    const-string v4, "newBuilder(...)"

    .line 105
    .line 106
    .line 107
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p2, v2}, Lcom/kubi/flutter/proto/kline/RequestKt$Dsl$Companion;->_create(Lcom/kubi/flutter/proto/kline/Request$b;)Lcom/kubi/flutter/proto/kline/RequestKt$Dsl;

    .line 111
    move-result-object p2

    .line 112
    .line 113
    .line 114
    invoke-virtual {p2, p1}, Lcom/kubi/flutter/proto/kline/RequestKt$Dsl;->c(Lcom/kubi/flutter/proto/kline/OrderList;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p2}, Lcom/kubi/flutter/proto/kline/RequestKt$Dsl;->a()Lcom/kubi/flutter/proto/kline/Request;

    .line 118
    move-result-object p2

    .line 119
    .line 120
    .line 121
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    move-result-object p1

    .line 123
    .line 124
    iput-object p1, v0, Lcom/kubi/flutter/widget/kline/KLineChannel$sendOrderList$1;->L$0:Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    move-result-object p1

    .line 129
    .line 130
    iput-object p1, v0, Lcom/kubi/flutter/widget/kline/KLineChannel$sendOrderList$1;->L$1:Ljava/lang/Object;

    .line 131
    .line 132
    iput v3, v0, Lcom/kubi/flutter/widget/kline/KLineChannel$sendOrderList$1;->label:I

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0, p2, v0}, Lcom/kubi/flutter/widget/kline/KLineChannel;->q(Lcom/kubi/flutter/proto/kline/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 136
    move-result-object p2

    .line 137
    .line 138
    if-ne p2, v1, :cond_5

    .line 139
    return-object v1

    .line 140
    .line 141
    :cond_5
    :goto_2
    check-cast p2, Lcom/kubi/flutter/proto/kline/Response;

    .line 142
    return-object p2
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
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
.end method

.method public b(Lcom/kubi/flutter/proto/kline/CandleList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .param p1    # Lcom/kubi/flutter/proto/kline/CandleList;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/flutter/proto/kline/CandleList;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/flutter/proto/kline/Response;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p2, Lcom/kubi/flutter/widget/kline/KLineChannel$sendCandleList$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/flutter/widget/kline/KLineChannel$sendCandleList$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/flutter/widget/kline/KLineChannel$sendCandleList$1;->label:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/kubi/flutter/widget/kline/KLineChannel$sendCandleList$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/flutter/widget/kline/KLineChannel$sendCandleList$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/kubi/flutter/widget/kline/KLineChannel$sendCandleList$1;-><init>(Lcom/kubi/flutter/widget/kline/KLineChannel;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/kubi/flutter/widget/kline/KLineChannel$sendCandleList$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/flutter/widget/kline/KLineChannel$sendCandleList$1;->label:I

    .line 33
    const/4 v3, 0x1

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Lcom/kubi/flutter/widget/kline/KLineChannel$sendCandleList$1;->L$1:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lcom/kubi/flutter/proto/kline/Request;

    .line 42
    .line 43
    iget-object p1, v0, Lcom/kubi/flutter/widget/kline/KLineChannel$sendCandleList$1;->L$0:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lcom/kubi/flutter/proto/kline/CandleList;

    .line 46
    .line 47
    .line 48
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 49
    goto :goto_2

    .line 50
    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    .line 56
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    throw p1

    .line 58
    .line 59
    .line 60
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Lcom/kubi/flutter/proto/kline/CandleList;->getUpdateType()Lcom/kubi/flutter/proto/kline/CandleList$UpdateType;

    .line 64
    move-result-object p2

    .line 65
    .line 66
    sget-object v2, Lcom/kubi/flutter/proto/kline/CandleList$UpdateType;->UNRECOGNIZED:Lcom/kubi/flutter/proto/kline/CandleList$UpdateType;

    .line 67
    .line 68
    if-ne p2, v2, :cond_4

    .line 69
    .line 70
    const-string p1, "openDataPush 2 times"

    .line 71
    const/4 p2, 0x0

    .line 72
    .line 73
    const-string v0, "updateType is UNRECOGNIZED"

    .line 74
    const/4 v1, 0x2

    .line 75
    const/4 v2, 0x0

    .line 76
    .line 77
    .line 78
    invoke-static {v0, p1, p2, v1, v2}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 79
    move-result p1

    .line 80
    .line 81
    const-string p2, "KLineChannel"

    .line 82
    .line 83
    if-eqz p1, :cond_3

    .line 84
    .line 85
    new-instance p1, Lcom/kubi/flutter/widget/kline/exception/KLineMessage;

    .line 86
    .line 87
    .line 88
    invoke-direct {p1, v0, p2, v3}, Lcom/kubi/flutter/widget/kline/exception/KLineMessage;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 89
    .line 90
    .line 91
    invoke-static {p1, v2, v1, v2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 92
    goto :goto_1

    .line 93
    .line 94
    .line 95
    :cond_3
    invoke-static {v0, p2}, Log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    :goto_1
    return-object v2

    .line 97
    .line 98
    :cond_4
    sget-object p2, Lcom/kubi/flutter/proto/kline/RequestKt$Dsl;->b:Lcom/kubi/flutter/proto/kline/RequestKt$Dsl$Companion;

    .line 99
    .line 100
    .line 101
    invoke-static {}, Lcom/kubi/flutter/proto/kline/Request;->newBuilder()Lcom/kubi/flutter/proto/kline/Request$b;

    .line 102
    move-result-object v2

    .line 103
    .line 104
    const-string v4, "newBuilder(...)"

    .line 105
    .line 106
    .line 107
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p2, v2}, Lcom/kubi/flutter/proto/kline/RequestKt$Dsl$Companion;->_create(Lcom/kubi/flutter/proto/kline/Request$b;)Lcom/kubi/flutter/proto/kline/RequestKt$Dsl;

    .line 111
    move-result-object p2

    .line 112
    .line 113
    .line 114
    invoke-virtual {p2, p1}, Lcom/kubi/flutter/proto/kline/RequestKt$Dsl;->b(Lcom/kubi/flutter/proto/kline/CandleList;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p2}, Lcom/kubi/flutter/proto/kline/RequestKt$Dsl;->a()Lcom/kubi/flutter/proto/kline/Request;

    .line 118
    move-result-object p2

    .line 119
    .line 120
    .line 121
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    move-result-object p1

    .line 123
    .line 124
    iput-object p1, v0, Lcom/kubi/flutter/widget/kline/KLineChannel$sendCandleList$1;->L$0:Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    move-result-object p1

    .line 129
    .line 130
    iput-object p1, v0, Lcom/kubi/flutter/widget/kline/KLineChannel$sendCandleList$1;->L$1:Ljava/lang/Object;

    .line 131
    .line 132
    iput v3, v0, Lcom/kubi/flutter/widget/kline/KLineChannel$sendCandleList$1;->label:I

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0, p2, v0}, Lcom/kubi/flutter/widget/kline/KLineChannel;->q(Lcom/kubi/flutter/proto/kline/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 136
    move-result-object p2

    .line 137
    .line 138
    if-ne p2, v1, :cond_5

    .line 139
    return-object v1

    .line 140
    .line 141
    :cond_5
    :goto_2
    check-cast p2, Lcom/kubi/flutter/proto/kline/Response;

    .line 142
    return-object p2
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
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
.end method

.method public c(Lcom/kubi/flutter/proto/kline/ViewControl;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1    # Lcom/kubi/flutter/proto/kline/ViewControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/flutter/proto/kline/ViewControl;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/flutter/proto/kline/Response;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/flutter/proto/kline/RequestKt$Dsl;->b:Lcom/kubi/flutter/proto/kline/RequestKt$Dsl$Companion;

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lcom/kubi/flutter/proto/kline/Request;->newBuilder()Lcom/kubi/flutter/proto/kline/Request$b;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    const-string v2, "newBuilder(...)"

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/kubi/flutter/proto/kline/RequestKt$Dsl$Companion;->_create(Lcom/kubi/flutter/proto/kline/Request$b;)Lcom/kubi/flutter/proto/kline/RequestKt$Dsl;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/kubi/flutter/proto/kline/RequestKt$Dsl;->d(Lcom/kubi/flutter/proto/kline/ViewControl;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/kubi/flutter/proto/kline/RequestKt$Dsl;->a()Lcom/kubi/flutter/proto/kline/Request;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1, p2}, Lcom/kubi/flutter/widget/kline/KLineChannel;->q(Lcom/kubi/flutter/proto/kline/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 26
    move-result-object p1

    .line 27
    return-object p1
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
.end method

.method public d(Lcom/kubi/flutter/widget/kline/a$a;)V
    .locals 1
    .param p1    # Lcom/kubi/flutter/widget/kline/a$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "listener"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineChannel;->e:Lcom/kubi/flutter/widget/kline/utils/f;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/kubi/flutter/widget/kline/utils/f;->b(Ljava/lang/Object;)V

    .line 11
    return-void
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
.end method

.method public final m(Lio/flutter/plugin/common/BinaryMessenger;)V
    .locals 3
    .param p1    # Lio/flutter/plugin/common/BinaryMessenger;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "binaryMessenger"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "KLineChannel"

    .line 8
    .line 9
    const-string v1, "bind"

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    new-instance v0, Lio/flutter/plugin/common/BasicMessageChannel;

    .line 15
    .line 16
    const-string v1, "kline-channel"

    .line 17
    .line 18
    sget-object v2, Lio/flutter/plugin/common/BinaryCodec;->INSTANCE_DIRECT:Lio/flutter/plugin/common/BinaryCodec;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, p1, v1, v2}, Lio/flutter/plugin/common/BasicMessageChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Lio/flutter/plugin/common/MessageCodec;)V

    .line 22
    .line 23
    new-instance p1, Lcom/kubi/flutter/widget/kline/KLineChannel$InnerMessageHandler;

    .line 24
    .line 25
    .line 26
    invoke-direct {p1, p0}, Lcom/kubi/flutter/widget/kline/KLineChannel$InnerMessageHandler;-><init>(Lcom/kubi/flutter/widget/kline/KLineChannel;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1}, Lio/flutter/plugin/common/BasicMessageChannel;->setMessageHandler(Lio/flutter/plugin/common/BasicMessageChannel$MessageHandler;)V

    .line 30
    .line 31
    iput-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineChannel;->b:Lio/flutter/plugin/common/BasicMessageChannel;

    .line 32
    return-void
.end method

.method public final n()V
    .locals 3

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineChannel;->b:Lio/flutter/plugin/common/BasicMessageChannel;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/BasicMessageChannel;->setMessageHandler(Lio/flutter/plugin/common/BasicMessageChannel$MessageHandler;)V

    .line 9
    goto :goto_0

    .line 10
    :catch_0
    move-exception v0

    .line 11
    goto :goto_1

    .line 12
    .line 13
    :cond_0
    :goto_0
    iput-object v1, p0, Lcom/kubi/flutter/widget/kline/KLineChannel;->b:Lio/flutter/plugin/common/BasicMessageChannel;

    .line 14
    .line 15
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineChannel;->e:Lcom/kubi/flutter/widget/kline/utils/f;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/kubi/flutter/widget/kline/utils/f;->c()V

    .line 19
    .line 20
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineChannel;->d:Lkotlinx/coroutines/m0;

    .line 21
    const/4 v2, 0x1

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/n0;->e(Lkotlinx/coroutines/m0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    return-void

    .line 26
    .line 27
    .line 28
    :goto_1
    invoke-static {v0}, Lny/b;->e(Ljava/lang/Throwable;)Z

    .line 29
    move-result v1

    .line 30
    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    const-string v1, "channelScope close error"

    .line 34
    .line 35
    .line 36
    invoke-static {v0, v1}, Log/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 37
    :cond_1
    return-void
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
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
.end method

.method public final o(Lcom/kubi/flutter/proto/kline/EventMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/flutter/proto/kline/EventMessage;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/flutter/proto/kline/Response;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of v0, p2, Lcom/kubi/flutter/widget/kline/KLineChannel$onListenerEvent$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/flutter/widget/kline/KLineChannel$onListenerEvent$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/flutter/widget/kline/KLineChannel$onListenerEvent$1;->label:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/kubi/flutter/widget/kline/KLineChannel$onListenerEvent$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/flutter/widget/kline/KLineChannel$onListenerEvent$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/kubi/flutter/widget/kline/KLineChannel$onListenerEvent$1;-><init>(Lcom/kubi/flutter/widget/kline/KLineChannel;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/kubi/flutter/widget/kline/KLineChannel$onListenerEvent$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/flutter/widget/kline/KLineChannel$onListenerEvent$1;->label:I

    .line 33
    const/4 v3, 0x1

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Lcom/kubi/flutter/widget/kline/KLineChannel$onListenerEvent$1;->L$4:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lcom/kubi/flutter/widget/kline/a$a;

    .line 42
    .line 43
    iget-object p1, v0, Lcom/kubi/flutter/widget/kline/KLineChannel$onListenerEvent$1;->L$3:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lkotlin/coroutines/Continuation;

    .line 46
    .line 47
    iget-object p1, v0, Lcom/kubi/flutter/widget/kline/KLineChannel$onListenerEvent$1;->L$1:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Lcom/kubi/flutter/widget/kline/utils/f;

    .line 50
    .line 51
    iget-object p1, v0, Lcom/kubi/flutter/widget/kline/KLineChannel$onListenerEvent$1;->L$0:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p1, Lcom/kubi/flutter/proto/kline/EventMessage;

    .line 54
    .line 55
    .line 56
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 57
    goto :goto_1

    .line 58
    .line 59
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    .line 64
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    throw p1

    .line 66
    .line 67
    .line 68
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 69
    .line 70
    iget-object p2, p0, Lcom/kubi/flutter/widget/kline/KLineChannel;->e:Lcom/kubi/flutter/widget/kline/utils/f;

    .line 71
    .line 72
    .line 73
    invoke-static {p2}, Lcom/kubi/flutter/widget/kline/utils/f;->a(Lcom/kubi/flutter/widget/kline/utils/f;)Ljava/util/Set;

    .line 74
    move-result-object v2

    .line 75
    monitor-enter v2

    .line 76
    .line 77
    .line 78
    :try_start_0
    invoke-static {p2}, Lcom/kubi/flutter/widget/kline/utils/f;->a(Lcom/kubi/flutter/widget/kline/utils/f;)Ljava/util/Set;

    .line 79
    move-result-object v4

    .line 80
    .line 81
    .line 82
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 83
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    monitor-exit v2

    .line 85
    .line 86
    if-nez v4, :cond_3

    .line 87
    const/4 p1, 0x0

    .line 88
    goto :goto_2

    .line 89
    :cond_3
    move-object v2, v4

    .line 90
    .line 91
    check-cast v2, Lcom/kubi/flutter/widget/kline/a$a;

    .line 92
    .line 93
    .line 94
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    move-result-object v5

    .line 96
    .line 97
    iput-object v5, v0, Lcom/kubi/flutter/widget/kline/KLineChannel$onListenerEvent$1;->L$0:Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    move-result-object p2

    .line 102
    .line 103
    iput-object p2, v0, Lcom/kubi/flutter/widget/kline/KLineChannel$onListenerEvent$1;->L$1:Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    move-result-object p2

    .line 108
    .line 109
    iput-object p2, v0, Lcom/kubi/flutter/widget/kline/KLineChannel$onListenerEvent$1;->L$2:Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    move-result-object p2

    .line 114
    .line 115
    iput-object p2, v0, Lcom/kubi/flutter/widget/kline/KLineChannel$onListenerEvent$1;->L$3:Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    move-result-object p2

    .line 120
    .line 121
    iput-object p2, v0, Lcom/kubi/flutter/widget/kline/KLineChannel$onListenerEvent$1;->L$4:Ljava/lang/Object;

    .line 122
    const/4 p2, 0x0

    .line 123
    .line 124
    iput p2, v0, Lcom/kubi/flutter/widget/kline/KLineChannel$onListenerEvent$1;->I$0:I

    .line 125
    .line 126
    iput p2, v0, Lcom/kubi/flutter/widget/kline/KLineChannel$onListenerEvent$1;->I$1:I

    .line 127
    .line 128
    iput v3, v0, Lcom/kubi/flutter/widget/kline/KLineChannel$onListenerEvent$1;->label:I

    .line 129
    .line 130
    .line 131
    invoke-interface {v2, p1, v0}, Lcom/kubi/flutter/widget/kline/a$a;->a(Lcom/kubi/flutter/proto/kline/EventMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 132
    move-result-object p2

    .line 133
    .line 134
    if-ne p2, v1, :cond_4

    .line 135
    return-object v1

    .line 136
    :cond_4
    :goto_1
    move-object p1, p2

    .line 137
    .line 138
    :goto_2
    check-cast p1, Lcom/kubi/flutter/proto/kline/Response;

    .line 139
    .line 140
    if-nez p1, :cond_5

    .line 141
    .line 142
    sget-object p1, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;->b:Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl$Companion;

    .line 143
    .line 144
    .line 145
    invoke-static {}, Lcom/kubi/flutter/proto/kline/Response;->newBuilder()Lcom/kubi/flutter/proto/kline/Response$b;

    .line 146
    move-result-object p2

    .line 147
    .line 148
    const-string v0, "newBuilder(...)"

    .line 149
    .line 150
    .line 151
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1, p2}, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl$Companion;->_create(Lcom/kubi/flutter/proto/kline/Response$b;)Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;

    .line 155
    move-result-object p1

    .line 156
    .line 157
    const/16 p2, 0x192

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1, p2}, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;->b(I)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1}, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;->a()Lcom/kubi/flutter/proto/kline/Response;

    .line 164
    move-result-object p1

    .line 165
    :cond_5
    return-object p1

    .line 166
    :catchall_0
    move-exception p1

    .line 167
    monitor-exit v2

    .line 168
    throw p1
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
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
.end method

.method public final p(Lcom/kubi/flutter/proto/kline/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/flutter/proto/kline/Request;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/nio/ByteBuffer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/flutter/widget/kline/KLineChannel$onReceived$2;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p1, p0, v2}, Lcom/kubi/flutter/widget/kline/KLineChannel$onReceived$2;-><init>(Lcom/kubi/flutter/proto/kline/Request;Lcom/kubi/flutter/widget/kline/KLineChannel;Lkotlin/coroutines/Continuation;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 14
    move-result-object p1

    .line 15
    return-object p1
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
.end method

.method public final q(Lcom/kubi/flutter/proto/kline/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/flutter/proto/kline/Request;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/flutter/proto/kline/Response;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/flutter/widget/kline/KLineChannel$send$2;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p0, p1, v2}, Lcom/kubi/flutter/widget/kline/KLineChannel$send$2;-><init>(Lcom/kubi/flutter/widget/kline/KLineChannel;Lcom/kubi/flutter/proto/kline/Request;Lkotlin/coroutines/Continuation;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 14
    move-result-object p1

    .line 15
    return-object p1
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
.end method

.method public final r(Lio/flutter/plugin/common/BasicMessageChannel;Ljava/nio/ByteBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugin/common/BasicMessageChannel<",
            "Ljava/nio/ByteBuffer;",
            ">;",
            "Ljava/nio/ByteBuffer;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/flutter/proto/kline/Response;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lo00/a;->c()Lkotlinx/coroutines/j0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/flutter/widget/kline/KLineChannel$sendAsync$2;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p1, p2, p0, v2}, Lcom/kubi/flutter/widget/kline/KLineChannel$sendAsync$2;-><init>(Lio/flutter/plugin/common/BasicMessageChannel;Ljava/nio/ByteBuffer;Lcom/kubi/flutter/widget/kline/KLineChannel;Lkotlin/coroutines/Continuation;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, p3}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 14
    move-result-object p1

    .line 15
    return-object p1
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
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
.end method

.method public final s(Lcom/google/protobuf/MessageLite;)Ljava/nio/ByteBuffer;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Lcom/google/protobuf/MessageLite;->getSerializedSize()I

    .line 4
    move-result v0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/kubi/flutter/widget/kline/KLineChannel;->a:Lcom/kubi/flutter/widget/kline/utils/ByteBufferPool;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lcom/kubi/flutter/widget/kline/utils/ByteBufferPool;->a(I)Ljava/nio/ByteBuffer;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-static {v1}, Lcom/google/protobuf/CodedOutputStream;->newInstance(Ljava/nio/ByteBuffer;)Lcom/google/protobuf/CodedOutputStream;

    .line 14
    move-result-object v2

    .line 15
    .line 16
    .line 17
    invoke-interface {p1, v2}, Lcom/google/protobuf/MessageLite;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 21
    return-object v1
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
.end method
