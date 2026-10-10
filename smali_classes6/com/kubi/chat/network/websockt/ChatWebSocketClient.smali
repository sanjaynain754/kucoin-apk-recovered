.class public final Lcom/kubi/chat/network/websockt/ChatWebSocketClient;
.super Ljava/lang/Object;
.source "ChatWebSocketClient.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/chat/network/websockt/ChatWebSocketClient$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 +2\u00020\u0001:\u00013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008\t\u0010\u0008J\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0000\u00a2\u0006\u0004\u0008\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0000\u00a2\u0006\u0004\u0008\u0017\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0000\u00a2\u0006\u0004\u0008\u0019\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0000\u00a2\u0006\u0004\u0008\u001a\u0010\u0015J\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\u0008 \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0018\u0010\'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\'\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000c0(8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008)\u0010*\u001a\u0004\u0008+\u0010,R\'\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00120(8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010*\u001a\u0004\u0008.\u0010,R\u0018\u00102\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\t\u00101\u00a8\u00064"
    }
    d2 = {
        "Lcom/kubi/chat/network/websockt/ChatWebSocketClient;",
        "",
        "Lrb/b;",
        "config",
        "<init>",
        "(Lrb/b;)V",
        "",
        "d",
        "()V",
        "e",
        "",
        "id",
        "Ltb/c;",
        "listener",
        "o",
        "(Ljava/lang/String;Ltb/c;)V",
        "r",
        "(Ljava/lang/String;)V",
        "Lcom/kubi/chat/entity/ChatMessage;",
        "message",
        "q",
        "(Lcom/kubi/chat/entity/ChatMessage;)V",
        "n",
        "j",
        "m",
        "l",
        "k",
        "Lcom/kubi/chat/network/websockt/MessageEvent;",
        "messageEvent",
        "i",
        "(Lcom/kubi/chat/network/websockt/MessageEvent;)V",
        "Landroid/os/Message;",
        "h",
        "(Landroid/os/Message;)V",
        "a",
        "Lrb/b;",
        "Lcom/kubi/chat/network/websockt/ChatSocketExecutor;",
        "b",
        "Lcom/kubi/chat/network/websockt/ChatSocketExecutor;",
        "socketExecutor",
        "",
        "c",
        "Lkotlin/Lazy;",
        "f",
        "()Ljava/util/Map;",
        "listenerMap",
        "g",
        "sendMessageMap",
        "Landroid/os/Handler;",
        "Landroid/os/Handler;",
        "uiHandler",
        "Companion",
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


# static fields
.field public static final f:Lcom/kubi/chat/network/websockt/ChatWebSocketClient$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lrb/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:Lcom/kubi/chat/network/websockt/ChatSocketExecutor;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final c:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public e:Landroid/os/Handler;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/chat/network/websockt/ChatWebSocketClient$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/chat/network/websockt/ChatWebSocketClient$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/chat/network/websockt/ChatWebSocketClient;->f:Lcom/kubi/chat/network/websockt/ChatWebSocketClient$Companion;

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
.end method

.method public constructor <init>(Lrb/b;)V
    .locals 1
    .param p1    # Lrb/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "config"

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
    iput-object p1, p0, Lcom/kubi/chat/network/websockt/ChatWebSocketClient;->a:Lrb/b;

    .line 11
    .line 12
    sget-object p1, Lcom/kubi/chat/network/websockt/ChatWebSocketClient$listenerMap$2;->INSTANCE:Lcom/kubi/chat/network/websockt/ChatWebSocketClient$listenerMap$2;

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    iput-object p1, p0, Lcom/kubi/chat/network/websockt/ChatWebSocketClient;->c:Lkotlin/Lazy;

    .line 19
    .line 20
    sget-object p1, Lcom/kubi/chat/network/websockt/ChatWebSocketClient$sendMessageMap$2;->INSTANCE:Lcom/kubi/chat/network/websockt/ChatWebSocketClient$sendMessageMap$2;

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    iput-object p1, p0, Lcom/kubi/chat/network/websockt/ChatWebSocketClient;->d:Lkotlin/Lazy;

    .line 27
    return-void
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

.method public static synthetic a(Lcom/kubi/chat/network/websockt/ChatWebSocketClient;Landroid/os/Message;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/chat/network/websockt/ChatWebSocketClient;->p(Lcom/kubi/chat/network/websockt/ChatWebSocketClient;Landroid/os/Message;)Z

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method public static final synthetic b(Lcom/kubi/chat/network/websockt/ChatWebSocketClient;)Ljava/util/Map;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/chat/network/websockt/ChatWebSocketClient;->g()Ljava/util/Map;

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
.end method

.method public static final synthetic c(Lcom/kubi/chat/network/websockt/ChatWebSocketClient;Lcom/kubi/chat/network/websockt/MessageEvent;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/chat/network/websockt/ChatWebSocketClient;->i(Lcom/kubi/chat/network/websockt/MessageEvent;)V

    .line 4
    return-void
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
.end method

.method public static final p(Lcom/kubi/chat/network/websockt/ChatWebSocketClient;Landroid/os/Message;)Z
    .locals 1

    .line 1
    .line 2
    const-string v0, "this$0"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "msg"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/kubi/chat/network/websockt/ChatWebSocketClient;->h(Landroid/os/Message;)V

    .line 14
    const/4 p0, 0x0

    .line 15
    return p0
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
.end method


# virtual methods
.method public final d()V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/chat/network/websockt/IStatusCallback;->a:Lcom/kubi/chat/network/websockt/IStatusCallback$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/chat/network/websockt/IStatusCallback$Companion;->isConnected()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    :cond_0
    new-instance v0, Lcom/kubi/chat/network/websockt/ChatSocketExecutor;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/kubi/chat/network/websockt/ChatWebSocketClient;->a:Lrb/b;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1, p0}, Lcom/kubi/chat/network/websockt/ChatSocketExecutor;-><init>(Lrb/b;Lcom/kubi/chat/network/websockt/ChatWebSocketClient;)V

    .line 17
    .line 18
    iput-object v0, p0, Lcom/kubi/chat/network/websockt/ChatWebSocketClient;->b:Lcom/kubi/chat/network/websockt/ChatSocketExecutor;

    .line 19
    .line 20
    new-instance v1, Lcom/kubi/chat/network/websockt/ChatWebSocketClient$a;

    .line 21
    .line 22
    .line 23
    invoke-direct {v1, p0}, Lcom/kubi/chat/network/websockt/ChatWebSocketClient$a;-><init>(Lcom/kubi/chat/network/websockt/ChatWebSocketClient;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/kubi/chat/network/websockt/ChatSocketExecutor;->X(Lcom/kubi/chat/network/websockt/IStatusCallback;)V

    .line 27
    .line 28
    iget-object v0, p0, Lcom/kubi/chat/network/websockt/ChatWebSocketClient;->b:Lcom/kubi/chat/network/websockt/ChatSocketExecutor;

    .line 29
    .line 30
    if-nez v0, :cond_1

    .line 31
    :goto_0
    return-void

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {v0}, Lcom/kubi/chat/network/websockt/ChatSocketExecutor;->Y()V

    .line 35
    return-void
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
.end method

.method public final e()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/chat/network/websockt/ChatWebSocketClient;->b:Lcom/kubi/chat/network/websockt/ChatSocketExecutor;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v1, 0x1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v3, v1, v2}, Lcom/kubi/chat/network/websockt/ChatSocketExecutor;->U(Lcom/kubi/chat/network/websockt/ChatSocketExecutor;IILjava/lang/Object;)V

    .line 12
    return-void
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

.method public final f()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ltb/c;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/chat/network/websockt/ChatWebSocketClient;->c:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/util/Map;

    .line 9
    return-object v0
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

.method public final g()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/kubi/chat/entity/ChatMessage;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/chat/network/websockt/ChatWebSocketClient;->d:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/util/Map;

    .line 9
    return-object v0
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

.method public final h(Landroid/os/Message;)V
    .locals 5

    .line 1
    .line 2
    iget v0, p1, Landroid/os/Message;->what:I

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_2

    .line 8
    .line 9
    :cond_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 10
    .line 11
    instance-of v0, p1, Lcom/kubi/chat/network/websockt/MessageEvent;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    check-cast p1, Lcom/kubi/chat/network/websockt/MessageEvent;

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/4 p1, 0x0

    .line 18
    .line 19
    :goto_0
    if-nez p1, :cond_2

    .line 20
    .line 21
    goto/16 :goto_2

    .line 22
    .line 23
    .line 24
    :cond_2
    invoke-virtual {p1}, Lcom/kubi/chat/network/websockt/MessageEvent;->getMessage()Lcom/kubi/chat/entity/ChatMessage;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    if-nez v0, :cond_3

    .line 28
    .line 29
    goto/16 :goto_2

    .line 30
    .line 31
    .line 32
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/chat/network/websockt/ChatWebSocketClient;->f()Ljava/util/Map;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    .line 44
    :cond_4
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    move-result v2

    .line 46
    .line 47
    if-eqz v2, :cond_b

    .line 48
    .line 49
    .line 50
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    move-result-object v2

    .line 52
    .line 53
    check-cast v2, Ltb/c;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/kubi/chat/network/websockt/MessageEvent;->getAction()Ljava/lang/String;

    .line 57
    move-result-object v3

    .line 58
    .line 59
    if-eqz v3, :cond_4

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 63
    move-result v4

    .line 64
    .line 65
    .line 66
    sparse-switch v4, :sswitch_data_0

    .line 67
    goto :goto_1

    .line 68
    .line 69
    :sswitch_0
    const-string v4, "MESSAGE_DELIVERED"

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    move-result v3

    .line 74
    .line 75
    if-nez v3, :cond_5

    .line 76
    goto :goto_1

    .line 77
    .line 78
    .line 79
    :cond_5
    invoke-interface {v2, v0}, Ltb/c;->Z2(Lcom/kubi/chat/entity/ChatMessage;)V

    .line 80
    goto :goto_1

    .line 81
    .line 82
    :sswitch_1
    const-string v4, "MESSAGE_READED"

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    move-result v3

    .line 87
    .line 88
    if-nez v3, :cond_6

    .line 89
    goto :goto_1

    .line 90
    .line 91
    .line 92
    :cond_6
    invoke-interface {v2, v0}, Ltb/c;->l(Lcom/kubi/chat/entity/ChatMessage;)V

    .line 93
    goto :goto_1

    .line 94
    .line 95
    :sswitch_2
    const-string v4, "MESSAGE_SENT"

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    move-result v3

    .line 100
    .line 101
    if-nez v3, :cond_7

    .line 102
    goto :goto_1

    .line 103
    .line 104
    .line 105
    :cond_7
    invoke-interface {v2, v0}, Ltb/c;->p(Lcom/kubi/chat/entity/ChatMessage;)V

    .line 106
    goto :goto_1

    .line 107
    .line 108
    :sswitch_3
    const-string v4, "MESSAGE_NOTIFY_ALL"

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    move-result v3

    .line 113
    .line 114
    if-nez v3, :cond_8

    .line 115
    goto :goto_1

    .line 116
    .line 117
    .line 118
    :cond_8
    invoke-interface {v2}, Ltb/c;->e2()V

    .line 119
    goto :goto_1

    .line 120
    .line 121
    :sswitch_4
    const-string v4, "MESSAGE_RECEIVED"

    .line 122
    .line 123
    .line 124
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    move-result v3

    .line 126
    .line 127
    if-nez v3, :cond_9

    .line 128
    goto :goto_1

    .line 129
    .line 130
    .line 131
    :cond_9
    invoke-interface {v2, v0}, Ltb/c;->f2(Lcom/kubi/chat/entity/ChatMessage;)V

    .line 132
    goto :goto_1

    .line 133
    .line 134
    :sswitch_5
    const-string v4, "MESSAGE_FAILD"

    .line 135
    .line 136
    .line 137
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 138
    move-result v3

    .line 139
    .line 140
    if-nez v3, :cond_a

    .line 141
    goto :goto_1

    .line 142
    .line 143
    .line 144
    :cond_a
    invoke-interface {v2, v0}, Ltb/c;->V2(Lcom/kubi/chat/entity/ChatMessage;)V

    .line 145
    goto :goto_1

    .line 146
    :cond_b
    :goto_2
    return-void

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
    :sswitch_data_0
    .sparse-switch
        -0x58c8c572 -> :sswitch_5
        -0x446e0cc7 -> :sswitch_4
        -0x32f2f11d -> :sswitch_3
        0x3f394cf0 -> :sswitch_2
        0x545edc0d -> :sswitch_1
        0x7e89820c -> :sswitch_0
    .end sparse-switch
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
.end method

.method public final i(Lcom/kubi/chat/network/websockt/MessageEvent;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/chat/network/websockt/ChatWebSocketClient;->e:Landroid/os/Handler;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    new-instance v0, Landroid/os/Message;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    .line 11
    const/4 v1, 0x1

    .line 12
    .line 13
    iput v1, v0, Landroid/os/Message;->what:I

    .line 14
    .line 15
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object p1, p0, Lcom/kubi/chat/network/websockt/ChatWebSocketClient;->e:Landroid/os/Handler;

    .line 18
    .line 19
    if-nez p1, :cond_1

    .line 20
    :goto_0
    return-void

    .line 21
    .line 22
    .line 23
    :cond_1
    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 24
    return-void
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

.method public final j(Lcom/kubi/chat/entity/ChatMessage;)V
    .locals 2
    .param p1    # Lcom/kubi/chat/entity/ChatMessage;
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
    invoke-virtual {p0}, Lcom/kubi/chat/network/websockt/ChatWebSocketClient;->g()Ljava/util/Map;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/kubi/chat/entity/ChatMessage;->getUniqueId()Ljava/lang/String;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    sget-object v0, Lcom/kubi/chat/entity/MsgStatusEnum;->DELIVERED:Lcom/kubi/chat/entity/MsgStatusEnum;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lcom/kubi/chat/entity/ChatMessage;->setStatus(Lcom/kubi/chat/entity/MsgStatusEnum;)V

    .line 22
    .line 23
    new-instance v0, Lcom/kubi/chat/network/websockt/MessageEvent;

    .line 24
    .line 25
    const-string v1, "MESSAGE_DELIVERED"

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, p1}, Lcom/kubi/chat/network/websockt/MessageEvent;-><init>(Ljava/lang/String;Lcom/kubi/chat/entity/ChatMessage;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lcom/kubi/chat/network/websockt/ChatWebSocketClient;->i(Lcom/kubi/chat/network/websockt/MessageEvent;)V

    .line 32
    return-void
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

.method public final k(Lcom/kubi/chat/entity/ChatMessage;)V
    .locals 2
    .param p1    # Lcom/kubi/chat/entity/ChatMessage;
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
    invoke-virtual {p0}, Lcom/kubi/chat/network/websockt/ChatWebSocketClient;->g()Ljava/util/Map;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/kubi/chat/entity/ChatMessage;->getUniqueId()Ljava/lang/String;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    sget-object v0, Lcom/kubi/chat/entity/MsgStatusEnum;->FAIL:Lcom/kubi/chat/entity/MsgStatusEnum;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lcom/kubi/chat/entity/ChatMessage;->setStatus(Lcom/kubi/chat/entity/MsgStatusEnum;)V

    .line 22
    .line 23
    new-instance v0, Lcom/kubi/chat/network/websockt/MessageEvent;

    .line 24
    .line 25
    const-string v1, "MESSAGE_FAILD"

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, p1}, Lcom/kubi/chat/network/websockt/MessageEvent;-><init>(Ljava/lang/String;Lcom/kubi/chat/entity/ChatMessage;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lcom/kubi/chat/network/websockt/ChatWebSocketClient;->i(Lcom/kubi/chat/network/websockt/MessageEvent;)V

    .line 32
    return-void
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

.method public final l(Lcom/kubi/chat/entity/ChatMessage;)V
    .locals 2
    .param p1    # Lcom/kubi/chat/entity/ChatMessage;
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
    sget-object v0, Lcom/kubi/chat/entity/MsgStatusEnum;->READED:Lcom/kubi/chat/entity/MsgStatusEnum;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lcom/kubi/chat/entity/ChatMessage;->setStatus(Lcom/kubi/chat/entity/MsgStatusEnum;)V

    .line 11
    .line 12
    new-instance v0, Lcom/kubi/chat/network/websockt/MessageEvent;

    .line 13
    .line 14
    const-string v1, "MESSAGE_READED"

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, p1}, Lcom/kubi/chat/network/websockt/MessageEvent;-><init>(Ljava/lang/String;Lcom/kubi/chat/entity/ChatMessage;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lcom/kubi/chat/network/websockt/ChatWebSocketClient;->i(Lcom/kubi/chat/network/websockt/MessageEvent;)V

    .line 21
    return-void
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

.method public final m(Lcom/kubi/chat/entity/ChatMessage;)V
    .locals 2
    .param p1    # Lcom/kubi/chat/entity/ChatMessage;
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
    sget-object v0, Lcom/kubi/chat/entity/MsgStatusEnum;->DELIVERED:Lcom/kubi/chat/entity/MsgStatusEnum;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lcom/kubi/chat/entity/ChatMessage;->setStatus(Lcom/kubi/chat/entity/MsgStatusEnum;)V

    .line 11
    .line 12
    new-instance v0, Lcom/kubi/chat/network/websockt/MessageEvent;

    .line 13
    .line 14
    const-string v1, "MESSAGE_RECEIVED"

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, p1}, Lcom/kubi/chat/network/websockt/MessageEvent;-><init>(Ljava/lang/String;Lcom/kubi/chat/entity/ChatMessage;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lcom/kubi/chat/network/websockt/ChatWebSocketClient;->i(Lcom/kubi/chat/network/websockt/MessageEvent;)V

    .line 21
    return-void
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

.method public final n(Lcom/kubi/chat/entity/ChatMessage;)V
    .locals 2
    .param p1    # Lcom/kubi/chat/entity/ChatMessage;
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
    invoke-virtual {p0}, Lcom/kubi/chat/network/websockt/ChatWebSocketClient;->g()Ljava/util/Map;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/kubi/chat/entity/ChatMessage;->getUniqueId()Ljava/lang/String;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 17
    move-result v0

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lub/b;->b(Ljava/lang/Boolean;)Z

    .line 25
    move-result v0

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/kubi/chat/network/websockt/ChatWebSocketClient;->g()Ljava/util/Map;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/kubi/chat/entity/ChatMessage;->getUniqueId()Ljava/lang/String;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    .line 38
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    :cond_0
    sget-object v0, Lcom/kubi/chat/entity/MsgStatusEnum;->SENDING:Lcom/kubi/chat/entity/MsgStatusEnum;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v0}, Lcom/kubi/chat/entity/ChatMessage;->setStatus(Lcom/kubi/chat/entity/MsgStatusEnum;)V

    .line 44
    .line 45
    new-instance v0, Lcom/kubi/chat/network/websockt/MessageEvent;

    .line 46
    .line 47
    const-string v1, "MESSAGE_SENT"

    .line 48
    .line 49
    .line 50
    invoke-direct {v0, v1, p1}, Lcom/kubi/chat/network/websockt/MessageEvent;-><init>(Ljava/lang/String;Lcom/kubi/chat/entity/ChatMessage;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v0}, Lcom/kubi/chat/network/websockt/ChatWebSocketClient;->i(Lcom/kubi/chat/network/websockt/MessageEvent;)V

    .line 54
    return-void
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
.end method

.method public final o(Ljava/lang/String;Ltb/c;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ltb/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "id"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "listener"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/kubi/chat/network/websockt/ChatWebSocketClient;->e:Landroid/os/Handler;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    new-instance v0, Landroid/os/Handler;

    .line 17
    .line 18
    .line 19
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    new-instance v2, Lrb/a;

    .line 23
    .line 24
    .line 25
    invoke-direct {v2, p0}, Lrb/a;-><init>(Lcom/kubi/chat/network/websockt/ChatWebSocketClient;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 29
    .line 30
    iput-object v0, p0, Lcom/kubi/chat/network/websockt/ChatWebSocketClient;->e:Landroid/os/Handler;

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/chat/network/websockt/ChatWebSocketClient;->f()Ljava/util/Map;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 38
    move-result v0

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, Lub/b;->b(Ljava/lang/Boolean;)Z

    .line 46
    move-result v0

    .line 47
    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/kubi/chat/network/websockt/ChatWebSocketClient;->f()Ljava/util/Map;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    .line 55
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    :cond_1
    return-void
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
.end method

.method public final q(Lcom/kubi/chat/entity/ChatMessage;)V
    .locals 2
    .param p1    # Lcom/kubi/chat/entity/ChatMessage;
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
    invoke-static {}, Lcom/blankj/utilcode/util/NetworkUtils;->k()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const-string v0, "Network error please check the connection."

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lcom/kubi/chat/entity/ChatMessage;->setFailedInfo(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lcom/kubi/chat/network/websockt/ChatWebSocketClient;->k(Lcom/kubi/chat/entity/ChatMessage;)V

    .line 20
    return-void

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lcom/kubi/chat/network/websockt/ChatWebSocketClient;->b:Lcom/kubi/chat/network/websockt/ChatSocketExecutor;

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    const/4 v0, 0x0

    .line 26
    goto :goto_0

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p1}, Lcom/kubi/chat/entity/ChatMessage;->getDataByte()Lokio/ByteString;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lcom/kubi/chat/network/websockt/ChatSocketExecutor;->W(Lokio/ByteString;)Z

    .line 34
    move-result v0

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    .line 41
    :goto_0
    invoke-static {v0}, Lub/b;->b(Ljava/lang/Boolean;)Z

    .line 42
    move-result v0

    .line 43
    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    const-string v0, "webSocket un connect."

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v0}, Lcom/kubi/chat/entity/ChatMessage;->setFailedInfo(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, p1}, Lcom/kubi/chat/network/websockt/ChatWebSocketClient;->k(Lcom/kubi/chat/entity/ChatMessage;)V

    .line 53
    :cond_2
    return-void
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
.end method

.method public final r(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "id"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/chat/network/websockt/ChatWebSocketClient;->f()Ljava/util/Map;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    return-void
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
