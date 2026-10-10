.class public final Lcom/kubi/network/socket/WebSocketClient$a;
.super Ljava/lang/Object;
.source "WebSocketClient.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/network/socket/WebSocketClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\t\n\u0002\u0008\u0016\n\u0002\u0010\u0008\n\u0002\u0008!\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 \u00a2\u0006\u0004\u0008\"\u0010#J\u0015\u0010\'\u001a\u00020&2\u0006\u0010%\u001a\u00020$\u00a2\u0006\u0004\u0008\'\u0010(R\"\u0010.\u001a\u00020$8\u0000@\u0000X\u0080.\u00a2\u0006\u0012\n\u0004\u0008\'\u0010)\u001a\u0004\u0008*\u0010+\"\u0004\u0008,\u0010-R\"\u00105\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008/\u00100\u001a\u0004\u00081\u00102\"\u0004\u00083\u00104R$\u0010\t\u001a\u0004\u0018\u00010\u00088\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008*\u00106\u001a\u0004\u00087\u00108\"\u0004\u00089\u0010:R\"\u0010A\u001a\u00020;8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008<\u0010=\u001a\u0004\u0008<\u0010>\"\u0004\u0008?\u0010@R\"\u0010E\u001a\u00020;8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008B\u0010=\u001a\u0004\u0008C\u0010>\"\u0004\u0008D\u0010@R\"\u0010I\u001a\u00020;8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008F\u0010=\u001a\u0004\u0008G\u0010>\"\u0004\u0008H\u0010@R\"\u0010M\u001a\u00020;8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008J\u0010=\u001a\u0004\u0008K\u0010>\"\u0004\u0008L\u0010@R\"\u0010Q\u001a\u00020;8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008N\u0010=\u001a\u0004\u0008O\u0010>\"\u0004\u0008P\u0010@R\"\u0010W\u001a\u00020R8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008O\u0010S\u001a\u0004\u0008J\u0010T\"\u0004\u0008U\u0010VR\"\u0010Z\u001a\u00020;8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008X\u0010=\u001a\u0004\u0008N\u0010>\"\u0004\u0008Y\u0010@R\"\u0010\r\u001a\u00020\u000c8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008G\u0010[\u001a\u0004\u0008\\\u0010]\"\u0004\u0008^\u0010_R\"\u0010e\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008`\u0010a\u001a\u0004\u0008F\u0010b\"\u0004\u0008c\u0010dR\"\u0010j\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u00081\u0010f\u001a\u0004\u0008B\u0010g\"\u0004\u0008h\u0010iR\"\u0010\u0019\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008k\u0010l\u001a\u0004\u0008/\u0010m\"\u0004\u0008n\u0010oR\"\u0010\u001d\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008C\u0010p\u001a\u0004\u0008X\u0010q\"\u0004\u0008r\u0010sR\"\u0010!\u001a\u00020t8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008u\u0010v\u001a\u0004\u0008u\u0010w\"\u0004\u0008x\u0010yR)\u0010\u0080\u0001\u001a\u0008\u0012\u0004\u0012\u00020{0z8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u00087\u0010|\u001a\u0004\u0008k\u0010}\"\u0004\u0008~\u0010\u007fR+\u0010\u0083\u0001\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010z8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0013\n\u0004\u0008\\\u0010|\u001a\u0004\u0008`\u0010}\"\u0005\u0008\u0082\u0001\u0010\u007f\u00a8\u0006\u0084\u0001"
    }
    d2 = {
        "Lcom/kubi/network/socket/WebSocketClient$a;",
        "",
        "<init>",
        "()V",
        "Lokhttp3/OkHttpClient;",
        "client",
        "y",
        "(Lokhttp3/OkHttpClient;)Lcom/kubi/network/socket/WebSocketClient$a;",
        "Lcom/kubi/network/socket/a;",
        "subscribeClient",
        "A",
        "(Lcom/kubi/network/socket/a;)Lcom/kubi/network/socket/WebSocketClient$a;",
        "Ltr/c;",
        "tokenProvider",
        "B",
        "(Ltr/c;)Lcom/kubi/network/socket/WebSocketClient$a;",
        "",
        "protocol",
        "w",
        "(Ljava/lang/String;)Lcom/kubi/network/socket/WebSocketClient$a;",
        "Lqr/f;",
        "codec",
        "v",
        "(Lqr/f;)Lcom/kubi/network/socket/WebSocketClient$a;",
        "Lur/d;",
        "activeTrack",
        "t",
        "(Lur/d;)Lcom/kubi/network/socket/WebSocketClient$a;",
        "Lur/e;",
        "connectTrack",
        "x",
        "(Lur/e;)Lcom/kubi/network/socket/WebSocketClient$a;",
        "Lur/g$a;",
        "requestTrack",
        "z",
        "(Lur/g$a;)Lcom/kubi/network/socket/WebSocketClient$a;",
        "Landroid/app/Application;",
        "context",
        "Lcom/kubi/network/socket/WebSocketClient;",
        "a",
        "(Landroid/app/Application;)Lcom/kubi/network/socket/WebSocketClient;",
        "Landroid/app/Application;",
        "c",
        "()Landroid/app/Application;",
        "u",
        "(Landroid/app/Application;)V",
        "application",
        "b",
        "Lokhttp3/OkHttpClient;",
        "m",
        "()Lokhttp3/OkHttpClient;",
        "setOkHttpClient$network_core_socket_release",
        "(Lokhttp3/OkHttpClient;)V",
        "okHttpClient",
        "Lcom/kubi/network/socket/a;",
        "q",
        "()Lcom/kubi/network/socket/a;",
        "setSubscribeClient$network_core_socket_release",
        "(Lcom/kubi/network/socket/a;)V",
        "",
        "d",
        "J",
        "()J",
        "setCallTimeout$network_core_socket_release",
        "(J)V",
        "callTimeout",
        "e",
        "o",
        "setRequestTimeout$network_core_socket_release",
        "requestTimeout",
        "f",
        "k",
        "setFlowTimeout$network_core_socket_release",
        "flowTimeout",
        "g",
        "s",
        "setTokenTimeout$network_core_socket_release",
        "tokenTimeout",
        "h",
        "i",
        "setConnectTimeout$network_core_socket_release",
        "connectTimeout",
        "",
        "I",
        "()I",
        "setConnectRetryCount$network_core_socket_release",
        "(I)V",
        "connectRetryCount",
        "j",
        "setConnectRetryInterval$network_core_socket_release",
        "connectRetryInterval",
        "Ltr/c;",
        "r",
        "()Ltr/c;",
        "setTokenProvider$network_core_socket_release",
        "(Ltr/c;)V",
        "l",
        "Ljava/lang/String;",
        "()Ljava/lang/String;",
        "setChannelProtocol$network_core_socket_release",
        "(Ljava/lang/String;)V",
        "channelProtocol",
        "Lqr/f;",
        "()Lqr/f;",
        "setChannelCodec$network_core_socket_release",
        "(Lqr/f;)V",
        "channelCodec",
        "n",
        "Lur/d;",
        "()Lur/d;",
        "setActiveTrack$network_core_socket_release",
        "(Lur/d;)V",
        "Lur/e;",
        "()Lur/e;",
        "setConnectTrack$network_core_socket_release",
        "(Lur/e;)V",
        "Lur/h;",
        "p",
        "Lur/h;",
        "()Lur/h;",
        "setRequestTrack$network_core_socket_release",
        "(Lur/h;)V",
        "",
        "Lcom/kubi/network/socket/core/b;",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "setRequestInterceptors$network_core_socket_release",
        "(Ljava/util/List;)V",
        "requestInterceptors",
        "Lcom/kubi/network/socket/bus/a;",
        "setMessageInterceptors$network_core_socket_release",
        "messageInterceptors",
        "network-core-socket_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public a:Landroid/app/Application;

.field public b:Lokhttp3/OkHttpClient;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public c:Lcom/kubi/network/socket/a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public d:J

.field public e:J

.field public f:J

.field public g:J

.field public h:J

.field public i:I

.field public j:J

.field public k:Ltr/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public l:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public m:Lqr/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public n:Lur/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public o:Lur/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public p:Lur/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kubi/network/socket/core/b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kubi/network/socket/bus/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lmr/a;->e()Lokhttp3/OkHttpClient;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    iput-object v0, p0, Lcom/kubi/network/socket/WebSocketClient$a;->b:Lokhttp3/OkHttpClient;

    .line 10
    .line 11
    const-wide/16 v1, 0x3a98

    .line 12
    .line 13
    iput-wide v1, p0, Lcom/kubi/network/socket/WebSocketClient$a;->d:J

    .line 14
    .line 15
    const-wide/16 v3, 0x2710

    .line 16
    .line 17
    iput-wide v3, p0, Lcom/kubi/network/socket/WebSocketClient$a;->e:J

    .line 18
    .line 19
    const-wide/16 v3, 0x7530

    .line 20
    .line 21
    iput-wide v3, p0, Lcom/kubi/network/socket/WebSocketClient$a;->f:J

    .line 22
    .line 23
    iput-wide v1, p0, Lcom/kubi/network/socket/WebSocketClient$a;->g:J

    .line 24
    .line 25
    const-wide/16 v1, 0x1388

    .line 26
    .line 27
    iput-wide v1, p0, Lcom/kubi/network/socket/WebSocketClient$a;->h:J

    .line 28
    const/4 v1, 0x3

    .line 29
    .line 30
    iput v1, p0, Lcom/kubi/network/socket/WebSocketClient$a;->i:I

    .line 31
    .line 32
    new-instance v1, Ltr/b;

    .line 33
    .line 34
    new-instance v2, Ltr/a;

    .line 35
    .line 36
    const-string v3, "encrypt"

    .line 37
    .line 38
    const-string v4, "true"

    .line 39
    .line 40
    .line 41
    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 42
    move-result-object v3

    .line 43
    .line 44
    const-string v5, "protocol"

    .line 45
    .line 46
    const-string v6, "websocket"

    .line 47
    .line 48
    .line 49
    invoke-static {v5, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 50
    move-result-object v5

    .line 51
    .line 52
    const-string v6, "source"

    .line 53
    .line 54
    const-string v7, "android"

    .line 55
    .line 56
    .line 57
    invoke-static {v6, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 58
    move-result-object v6

    .line 59
    .line 60
    .line 61
    filled-new-array {v3, v5, v6}, [Lkotlin/Pair;

    .line 62
    move-result-object v3

    .line 63
    .line 64
    .line 65
    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    .line 66
    move-result-object v3

    .line 67
    .line 68
    const-string v5, "isWs"

    .line 69
    .line 70
    .line 71
    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 72
    move-result-object v4

    .line 73
    .line 74
    .line 75
    invoke-static {v4}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    .line 76
    move-result-object v5

    .line 77
    .line 78
    const/16 v7, 0x8

    .line 79
    const/4 v8, 0x0

    .line 80
    move-object v4, v3

    .line 81
    .line 82
    const-string v3, "v1/bullet-public"

    .line 83
    const/4 v6, 0x0

    .line 84
    .line 85
    .line 86
    invoke-direct/range {v2 .. v8}, Ltr/a;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 87
    .line 88
    .line 89
    invoke-direct {v1, v0, v2}, Ltr/b;-><init>(Lokhttp3/OkHttpClient;Ltr/a;)V

    .line 90
    .line 91
    iput-object v1, p0, Lcom/kubi/network/socket/WebSocketClient$a;->k:Ltr/c;

    .line 92
    .line 93
    const-string v0, "socket_kc_protocol"

    .line 94
    .line 95
    iput-object v0, p0, Lcom/kubi/network/socket/WebSocketClient$a;->l:Ljava/lang/String;

    .line 96
    .line 97
    new-instance v0, Lcom/kubi/network/socket/socketkc/d;

    .line 98
    .line 99
    .line 100
    invoke-direct {v0}, Lcom/kubi/network/socket/socketkc/d;-><init>()V

    .line 101
    .line 102
    iput-object v0, p0, Lcom/kubi/network/socket/WebSocketClient$a;->m:Lqr/f;

    .line 103
    .line 104
    new-instance v1, Lur/a;

    .line 105
    const/4 v5, 0x3

    .line 106
    const/4 v2, 0x0

    .line 107
    .line 108
    const-wide/16 v3, 0x0

    .line 109
    .line 110
    .line 111
    invoke-direct/range {v1 .. v6}, Lur/a;-><init>(Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 112
    .line 113
    iput-object v1, p0, Lcom/kubi/network/socket/WebSocketClient$a;->n:Lur/d;

    .line 114
    .line 115
    new-instance v0, Lur/b;

    .line 116
    const/4 v1, 0x0

    .line 117
    const/4 v2, 0x1

    .line 118
    .line 119
    .line 120
    invoke-direct {v0, v1, v2, v1}, Lur/b;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 121
    .line 122
    iput-object v0, p0, Lcom/kubi/network/socket/WebSocketClient$a;->o:Lur/e;

    .line 123
    .line 124
    new-instance v0, Lur/h;

    .line 125
    .line 126
    new-instance v3, Lur/c;

    .line 127
    .line 128
    .line 129
    invoke-direct {v3, v1, v2, v1}, Lur/c;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 130
    .line 131
    .line 132
    invoke-direct {v0, v3}, Lur/h;-><init>(Lur/g$a;)V

    .line 133
    .line 134
    iput-object v0, p0, Lcom/kubi/network/socket/WebSocketClient$a;->p:Lur/h;

    .line 135
    .line 136
    new-instance v0, Ljava/util/ArrayList;

    .line 137
    .line 138
    .line 139
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 140
    .line 141
    iput-object v0, p0, Lcom/kubi/network/socket/WebSocketClient$a;->q:Ljava/util/List;

    .line 142
    .line 143
    new-instance v0, Ljava/util/ArrayList;

    .line 144
    .line 145
    .line 146
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 147
    .line 148
    iput-object v0, p0, Lcom/kubi/network/socket/WebSocketClient$a;->r:Ljava/util/List;

    .line 149
    return-void
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
.end method


# virtual methods
.method public final A(Lcom/kubi/network/socket/a;)Lcom/kubi/network/socket/WebSocketClient$a;
    .locals 1
    .param p1    # Lcom/kubi/network/socket/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "subscribeClient"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/network/socket/WebSocketClient$a;->c:Lcom/kubi/network/socket/a;

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
    .line 44
    .line 45
.end method

.method public final B(Ltr/c;)Lcom/kubi/network/socket/WebSocketClient$a;
    .locals 1
    .param p1    # Ltr/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "tokenProvider"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/network/socket/WebSocketClient$a;->k:Ltr/c;

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
    .line 44
    .line 45
.end method

.method public final a(Landroid/app/Application;)Lcom/kubi/network/socket/WebSocketClient;
    .locals 1
    .param p1    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/kubi/network/socket/WebSocketClient$a;->u(Landroid/app/Application;)V

    .line 9
    .line 10
    sget-object v0, Lcom/kubi/network/socket/utils/g;->a:Lcom/kubi/network/socket/utils/g;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/kubi/network/socket/utils/g;->d(Landroid/content/Context;)V

    .line 14
    .line 15
    sget-object v0, Lcom/kubi/network/socket/utils/d;->a:Lcom/kubi/network/socket/utils/d;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/kubi/network/socket/utils/d;->a(Landroid/app/Application;)V

    .line 19
    .line 20
    new-instance p1, Lcom/kubi/network/socket/WebSocketClient;

    .line 21
    .line 22
    .line 23
    invoke-direct {p1, p0}, Lcom/kubi/network/socket/WebSocketClient;-><init>(Lcom/kubi/network/socket/WebSocketClient$a;)V

    .line 24
    return-object p1
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
.end method

.method public final b()Lur/d;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/network/socket/WebSocketClient$a;->n:Lur/d;

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
    .line 28
    .line 29
    .line 30
.end method

.method public final c()Landroid/app/Application;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/network/socket/WebSocketClient$a;->a:Landroid/app/Application;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-object v0

    .line 6
    .line 7
    :cond_0
    const-string v0, "application"

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
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
.end method

.method public final d()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/kubi/network/socket/WebSocketClient$a;->d:J

    .line 3
    return-wide v0
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
.end method

.method public final e()Lqr/f;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/network/socket/WebSocketClient$a;->m:Lqr/f;

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
    .line 28
    .line 29
    .line 30
.end method

.method public final f()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/network/socket/WebSocketClient$a;->l:Ljava/lang/String;

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
    .line 28
    .line 29
    .line 30
.end method

.method public final g()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/network/socket/WebSocketClient$a;->i:I

    .line 3
    return v0
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
.end method

.method public final h()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/kubi/network/socket/WebSocketClient$a;->j:J

    .line 3
    return-wide v0
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
.end method

.method public final i()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/kubi/network/socket/WebSocketClient$a;->h:J

    .line 3
    return-wide v0
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
.end method

.method public final j()Lur/e;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/network/socket/WebSocketClient$a;->o:Lur/e;

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
    .line 28
    .line 29
    .line 30
.end method

.method public final k()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/kubi/network/socket/WebSocketClient$a;->f:J

    .line 3
    return-wide v0
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
.end method

.method public final l()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/kubi/network/socket/bus/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/network/socket/WebSocketClient$a;->r:Ljava/util/List;

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
    .line 28
    .line 29
    .line 30
.end method

.method public final m()Lokhttp3/OkHttpClient;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/network/socket/WebSocketClient$a;->b:Lokhttp3/OkHttpClient;

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
    .line 28
    .line 29
    .line 30
.end method

.method public final n()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/kubi/network/socket/core/b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/network/socket/WebSocketClient$a;->q:Ljava/util/List;

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
    .line 28
    .line 29
    .line 30
.end method

.method public final o()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/kubi/network/socket/WebSocketClient$a;->e:J

    .line 3
    return-wide v0
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
.end method

.method public final p()Lur/h;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/network/socket/WebSocketClient$a;->p:Lur/h;

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
    .line 28
    .line 29
    .line 30
.end method

.method public final q()Lcom/kubi/network/socket/a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/network/socket/WebSocketClient$a;->c:Lcom/kubi/network/socket/a;

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
    .line 28
    .line 29
    .line 30
.end method

.method public final r()Ltr/c;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/network/socket/WebSocketClient$a;->k:Ltr/c;

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
    .line 28
    .line 29
    .line 30
.end method

.method public final s()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/kubi/network/socket/WebSocketClient$a;->g:J

    .line 3
    return-wide v0
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
.end method

.method public final t(Lur/d;)Lcom/kubi/network/socket/WebSocketClient$a;
    .locals 1
    .param p1    # Lur/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "activeTrack"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/network/socket/WebSocketClient$a;->n:Lur/d;

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
    .line 44
    .line 45
.end method

.method public final u(Landroid/app/Application;)V
    .locals 1
    .param p1    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/network/socket/WebSocketClient$a;->a:Landroid/app/Application;

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
    .line 44
    .line 45
.end method

.method public final v(Lqr/f;)Lcom/kubi/network/socket/WebSocketClient$a;
    .locals 1
    .param p1    # Lqr/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "codec"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/network/socket/WebSocketClient$a;->m:Lqr/f;

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
    .line 44
    .line 45
.end method

.method public final w(Ljava/lang/String;)Lcom/kubi/network/socket/WebSocketClient$a;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "protocol"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/network/socket/WebSocketClient$a;->l:Ljava/lang/String;

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
    .line 44
    .line 45
.end method

.method public final x(Lur/e;)Lcom/kubi/network/socket/WebSocketClient$a;
    .locals 1
    .param p1    # Lur/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "connectTrack"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/network/socket/WebSocketClient$a;->o:Lur/e;

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
    .line 44
    .line 45
.end method

.method public final y(Lokhttp3/OkHttpClient;)Lcom/kubi/network/socket/WebSocketClient$a;
    .locals 1
    .param p1    # Lokhttp3/OkHttpClient;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "client"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/network/socket/WebSocketClient$a;->b:Lokhttp3/OkHttpClient;

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
    .line 44
    .line 45
.end method

.method public final z(Lur/g$a;)Lcom/kubi/network/socket/WebSocketClient$a;
    .locals 1
    .param p1    # Lur/g$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "requestTrack"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Lur/h;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, p1}, Lur/h;-><init>(Lur/g$a;)V

    .line 11
    .line 12
    iput-object v0, p0, Lcom/kubi/network/socket/WebSocketClient$a;->p:Lur/h;

    .line 13
    return-object p0
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
.end method
