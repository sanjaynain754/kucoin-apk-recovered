.class public final Lcom/tencent/liteav/txcvodplayer/b/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final a:Ljava/lang/String;

.field final b:Ljava/lang/String;

.field protected c:Lcom/tencent/liteav/txcvodplayer/b/e;

.field protected d:Lcom/tencent/liteav/txcvodplayer/b/f;

.field public e:Z

.field private final f:I

.field private final g:I

.field private h:Ljava/lang/Thread;

.field private i:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/lang/String;

    .line 6
    .line 7
    const-string v1, "aHR0cDovL3BsYXl2aWRlby5xY2xvdWQuY29tL2dldHBsYXlpbmZvL3Yy"

    .line 8
    const/4 v2, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/b/d;->a:Ljava/lang/String;

    .line 18
    .line 19
    new-instance v0, Ljava/lang/String;

    .line 20
    .line 21
    const-string v1, "aHR0cHM6Ly9wbGF5dmlkZW8ucWNsb3VkLmNvbS9nZXRwbGF5aW5mby92Mg=="

    .line 22
    .line 23
    .line 24
    invoke-static {v1, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 25
    move-result-object v1

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    .line 29
    .line 30
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/b/d;->b:Ljava/lang/String;

    .line 31
    .line 32
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/b/d;->f:I

    .line 33
    const/4 v0, 0x1

    .line 34
    .line 35
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/b/d;->g:I

    .line 36
    .line 37
    new-instance v0, Lcom/tencent/liteav/txcvodplayer/b/d$1;

    .line 38
    .line 39
    .line 40
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    .line 44
    invoke-direct {v0, p0, v1}, Lcom/tencent/liteav/txcvodplayer/b/d$1;-><init>(Lcom/tencent/liteav/txcvodplayer/b/d;Landroid/os/Looper;)V

    .line 45
    .line 46
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/b/d;->i:Landroid/os/Handler;

    .line 47
    return-void
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

.method public static synthetic a(Lcom/tencent/liteav/txcvodplayer/b/d;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 10
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 11
    const-string p1, "code"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    if-eqz p1, :cond_0

    .line 12
    const-string/jumbo v1, "message"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 13
    const-string v1, "TXCVodPlayerNetApi"

    invoke-static {v1, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    invoke-virtual {p0, v0, p1}, Lcom/tencent/liteav/txcvodplayer/b/d;->a(Ljava/lang/String;I)V

    return-void

    .line 15
    :cond_0
    new-instance p1, Lcom/tencent/liteav/txcvodplayer/b/f;

    invoke-direct {p1, v0}, Lcom/tencent/liteav/txcvodplayer/b/f;-><init>(Lorg/json/JSONObject;)V

    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/b/d;->d:Lcom/tencent/liteav/txcvodplayer/b/f;

    .line 16
    invoke-virtual {p1}, Lcom/tencent/liteav/txcvodplayer/b/f;->a()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    .line 17
    const-string p1, "No playback address"

    const/4 v0, -0x3

    invoke-virtual {p0, p1, v0}, Lcom/tencent/liteav/txcvodplayer/b/d;->a(Ljava/lang/String;I)V

    return-void

    .line 18
    :cond_1
    iget-object p0, p0, Lcom/tencent/liteav/txcvodplayer/b/d;->i:Landroid/os/Handler;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)I
    .locals 10

    const/4 v0, -0x1

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    if-nez p3, :cond_1

    if-lez p5, :cond_2

    :cond_1
    if-nez p6, :cond_2

    return v0

    .line 1
    :cond_2
    new-instance v1, Lcom/tencent/liteav/txcvodplayer/b/d$2;

    const-string v3, "getPlayInfo"

    move-object v2, p0

    move v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    move v8, p5

    move-object/from16 v9, p6

    invoke-direct/range {v1 .. v9}, Lcom/tencent/liteav/txcvodplayer/b/d$2;-><init>(Lcom/tencent/liteav/txcvodplayer/b/d;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/b/d;->h:Ljava/lang/Thread;

    .line 2
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    const/4 p1, 0x0

    return p1

    :cond_3
    :goto_0
    return v0
.end method

.method public final a()Lcom/tencent/liteav/txcvodplayer/b/f;
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/b/d;->d:Lcom/tencent/liteav/txcvodplayer/b/f;

    return-object v0
.end method

.method public final a(Lcom/tencent/liteav/txcvodplayer/b/e;)V
    .locals 0

    .line 8
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/b/d;->c:Lcom/tencent/liteav/txcvodplayer/b/e;

    return-void
.end method

.method public final a(Ljava/lang/String;I)V
    .locals 2

    .line 3
    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    const/4 v1, 0x1

    .line 4
    iput v1, v0, Landroid/os/Message;->what:I

    .line 5
    iput p2, v0, Landroid/os/Message;->arg1:I

    .line 6
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 7
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/b/d;->i:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method
