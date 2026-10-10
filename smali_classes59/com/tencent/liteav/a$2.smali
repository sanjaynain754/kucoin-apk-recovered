.class public final Lcom/tencent/liteav/a$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/liteav/txcvodplayer/b/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/rtmp/TXPlayInfoParams;

.field final synthetic b:Lcom/tencent/liteav/a;


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/a;Lcom/tencent/rtmp/TXPlayInfoParams;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/a$2;->b:Lcom/tencent/liteav/a;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/liteav/a$2;->a:Lcom/tencent/rtmp/TXPlayInfoParams;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public final a(ILjava/lang/String;)V
    .locals 5

    .line 56
    iget-object v0, p0, Lcom/tencent/liteav/a$2;->b:Lcom/tencent/liteav/a;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "onFail: errorCode = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " message = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/liteav/a;->c(Lcom/tencent/liteav/a;Ljava/lang/String;)V

    .line 57
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 58
    const-string v1, "EVT_ID"

    const/16 v2, -0x902

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 59
    const-string v1, "EVT_TIME"

    invoke-static {}, Lcom/tencent/liteav/base/util/TimeUtil;->a()J

    move-result-wide v3

    invoke-virtual {v0, v1, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 60
    const-string v1, "EVT_UTC_TIME"

    invoke-static {}, Lcom/tencent/liteav/base/util/TimeUtil;->b()J

    move-result-wide v3

    invoke-virtual {v0, v1, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 61
    const-string v1, "EVT_MSG"

    invoke-virtual {v0, v1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    const-string v1, "EVT_PARAM1"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 63
    new-instance v1, Lcom/tencent/liteav/txcvodplayer/a/a;

    iget-object v3, p0, Lcom/tencent/liteav/a$2;->b:Lcom/tencent/liteav/a;

    invoke-static {v3}, Lcom/tencent/liteav/a;->f(Lcom/tencent/liteav/a;)Landroid/content/Context;

    move-result-object v3

    invoke-direct {v1, v3}, Lcom/tencent/liteav/txcvodplayer/a/a;-><init>(Landroid/content/Context;)V

    .line 64
    iget-object v3, p0, Lcom/tencent/liteav/a$2;->a:Lcom/tencent/rtmp/TXPlayInfoParams;

    invoke-virtual {v3}, Lcom/tencent/rtmp/TXPlayInfoParams;->getAppId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/tencent/liteav/txcvodplayer/a/a;->a(Ljava/lang/String;)V

    .line 65
    iget-object v3, p0, Lcom/tencent/liteav/a$2;->a:Lcom/tencent/rtmp/TXPlayInfoParams;

    invoke-virtual {v3}, Lcom/tencent/rtmp/TXPlayInfoParams;->getFileId()Ljava/lang/String;

    move-result-object v3

    .line 66
    iput-object v3, v1, Lcom/tencent/liteav/txcvodplayer/a/a;->u:Ljava/lang/String;

    .line 67
    iget-object v3, p0, Lcom/tencent/liteav/a$2;->b:Lcom/tencent/liteav/a;

    invoke-static {v3}, Lcom/tencent/liteav/a;->g(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    move-result-object v3

    invoke-virtual {v3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getPlayerType()I

    move-result v3

    .line 68
    iput v3, v1, Lcom/tencent/liteav/txcvodplayer/a/a;->s:I

    .line 69
    iget-object v3, p0, Lcom/tencent/liteav/a$2;->b:Lcom/tencent/liteav/a;

    invoke-static {v3}, Lcom/tencent/liteav/a;->h(Lcom/tencent/liteav/a;)Z

    move-result v3

    invoke-virtual {v1, v3}, Lcom/tencent/liteav/txcvodplayer/a/a;->a(Z)V

    const/4 v3, -0x1

    if-ne p1, v3, :cond_0

    move p1, v2

    .line 70
    :cond_0
    invoke-virtual {v1, p1, p2}, Lcom/tencent/liteav/txcvodplayer/a/a;->a(ILjava/lang/String;)V

    .line 71
    invoke-virtual {v1}, Lcom/tencent/liteav/txcvodplayer/a/a;->a()V

    .line 72
    iget-object p1, p0, Lcom/tencent/liteav/a$2;->b:Lcom/tencent/liteav/a;

    invoke-static {p1, v2, v0}, Lcom/tencent/liteav/a;->a(Lcom/tencent/liteav/a;ILandroid/os/Bundle;)V

    .line 73
    iget-object p1, p0, Lcom/tencent/liteav/a$2;->b:Lcom/tencent/liteav/a;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string/jumbo v0, "onError: eventId: -2306 description:"

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/tencent/liteav/a;->b(Lcom/tencent/liteav/a;Ljava/lang/String;)V

    return-void
.end method

.method public final a(Lcom/tencent/liteav/txcvodplayer/b/c;Lcom/tencent/rtmp/TXPlayInfoParams;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/a$2;->b:Lcom/tencent/liteav/a;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "onSuccess: Requested file information successfully: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/liteav/a;->b(Lcom/tencent/liteav/a;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/a$2;->b:Lcom/tencent/liteav/a;

    invoke-static {v0}, Lcom/tencent/liteav/a;->b(Lcom/tencent/liteav/a;)Z

    move-result v0

    if-nez v0, :cond_a

    iget-object v0, p0, Lcom/tencent/liteav/a$2;->b:Lcom/tencent/liteav/a;

    invoke-static {v0}, Lcom/tencent/liteav/a;->c(Lcom/tencent/liteav/a;)Lcom/tencent/rtmp/TXPlayInfoParams;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/tencent/rtmp/TXPlayInfoParams;->getFileId()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/liteav/a$2;->b:Lcom/tencent/liteav/a;

    invoke-static {v1}, Lcom/tencent/liteav/a;->c(Lcom/tencent/liteav/a;)Lcom/tencent/rtmp/TXPlayInfoParams;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tencent/rtmp/TXPlayInfoParams;->getFileId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_4

    .line 3
    :cond_0
    invoke-virtual {p1}, Lcom/tencent/liteav/txcvodplayer/b/c;->l()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SimpleAES"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/tencent/liteav/a$2;->b:Lcom/tencent/liteav/a;

    .line 5
    iget-object v2, p1, Lcom/tencent/liteav/txcvodplayer/b/c;->d:Lcom/tencent/liteav/txcvodplayer/b/c$b;

    .line 6
    invoke-static {v0, v2}, Lcom/tencent/liteav/a;->a(Lcom/tencent/liteav/a;Lcom/tencent/liteav/txcvodplayer/b/c$b;)V

    .line 7
    invoke-static {}, Lcom/tencent/liteav/txcvodplayer/c/a;->a()Lcom/tencent/liteav/txcvodplayer/c/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/liteav/txcvodplayer/c/a;->b()V

    goto :goto_0

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/tencent/liteav/a$2;->b:Lcom/tencent/liteav/a;

    invoke-static {v0, v1}, Lcom/tencent/liteav/a;->a(Lcom/tencent/liteav/a;Lcom/tencent/liteav/txcvodplayer/b/c$b;)V

    .line 9
    :goto_0
    invoke-virtual {p1}, Lcom/tencent/liteav/txcvodplayer/b/c;->b()Ljava/lang/String;

    move-result-object v0

    .line 10
    const-string v2, "Widevine"

    invoke-virtual {p1, v2}, Lcom/tencent/liteav/txcvodplayer/b/c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 11
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 12
    iget-object p2, p0, Lcom/tencent/liteav/a$2;->b:Lcom/tencent/liteav/a;

    .line 13
    iput-object v1, p2, Lcom/tencent/liteav/a;->n:Ljava/lang/String;

    .line 14
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_2

    .line 15
    iget-object p2, p1, Lcom/tencent/liteav/txcvodplayer/b/c;->d:Lcom/tencent/liteav/txcvodplayer/b/c$b;

    move-object v8, p2

    goto :goto_1

    :cond_2
    move-object v8, v1

    .line 16
    :goto_1
    iget-object v3, p0, Lcom/tencent/liteav/a$2;->b:Lcom/tencent/liteav/a;

    invoke-virtual {p1}, Lcom/tencent/liteav/txcvodplayer/b/c;->m()Ljava/lang/String;

    move-result-object v5

    new-instance p2, Lcom/tencent/rtmp/TXPlayerDrmBuilder;

    invoke-direct {p2}, Lcom/tencent/rtmp/TXPlayerDrmBuilder;-><init>()V

    invoke-virtual {p2}, Lcom/tencent/rtmp/TXPlayerDrmBuilder;->getDeviceCertificateUrl()Ljava/lang/String;

    move-result-object v6

    .line 17
    invoke-virtual {p1}, Lcom/tencent/liteav/txcvodplayer/b/c;->d()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lcom/tencent/liteav/txcplayer/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 18
    invoke-static/range {v3 .. v8}, Lcom/tencent/liteav/a;->a(Lcom/tencent/liteav/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/liteav/txcvodplayer/b/c$b;)I

    goto :goto_2

    .line 19
    :cond_3
    iget-object v2, p0, Lcom/tencent/liteav/a$2;->b:Lcom/tencent/liteav/a;

    invoke-static {v2}, Lcom/tencent/liteav/a;->d(Lcom/tencent/liteav/a;)V

    .line 20
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_5

    .line 21
    invoke-virtual {p1}, Lcom/tencent/liteav/txcvodplayer/b/c;->d()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/tencent/liteav/txcplayer/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 22
    iget-object v2, p0, Lcom/tencent/liteav/a$2;->b:Lcom/tencent/liteav/a;

    .line 23
    iput-object v1, v2, Lcom/tencent/liteav/a;->n:Ljava/lang/String;

    .line 24
    invoke-virtual {p1}, Lcom/tencent/liteav/txcvodplayer/b/c;->l()Ljava/lang/String;

    move-result-object v2

    .line 25
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 26
    const-string/jumbo v2, "plain"

    .line 27
    :cond_4
    invoke-virtual {p2}, Lcom/tencent/rtmp/TXPlayInfoParams;->getFileId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Lcom/tencent/rtmp/TXPlayInfoParams;->getAppId()I

    move-result p2

    invoke-static {v0, v3, v2, p2}, Lcom/tencent/liteav/txcplayer/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p2

    .line 28
    iget-object v0, p0, Lcom/tencent/liteav/a$2;->b:Lcom/tencent/liteav/a;

    invoke-static {v0, p2}, Lcom/tencent/liteav/a;->a(Lcom/tencent/liteav/a;Ljava/lang/String;)I

    .line 29
    :cond_5
    :goto_2
    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 30
    const-string v0, "EVT_ID"

    const/16 v2, 0x7da

    invoke-virtual {p2, v0, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 31
    const-string v0, "EVT_TIME"

    invoke-static {}, Lcom/tencent/liteav/base/util/TimeUtil;->a()J

    move-result-wide v3

    invoke-virtual {p2, v0, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 32
    const-string v0, "EVT_UTC_TIME"

    invoke-static {}, Lcom/tencent/liteav/base/util/TimeUtil;->b()J

    move-result-wide v3

    invoke-virtual {p2, v0, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 33
    const-string v0, "EVT_MSG"

    const-string v3, "Requested file information successfully"

    invoke-virtual {p2, v0, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    iget-object v0, p0, Lcom/tencent/liteav/a$2;->b:Lcom/tencent/liteav/a;

    invoke-static {v0}, Lcom/tencent/liteav/a;->e(Lcom/tencent/liteav/a;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "EVT_PLAY_URL"

    invoke-virtual {p2, v3, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    const-string v0, "EVT_PLAY_COVER_URL"

    invoke-virtual {p1}, Lcom/tencent/liteav/txcvodplayer/b/c;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v0, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    const-string v0, "EVT_PLAY_NAME"

    invoke-virtual {p1}, Lcom/tencent/liteav/txcvodplayer/b/c;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v0, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    const-string v0, "EVT_PLAY_DESCRIPTION"

    invoke-virtual {p1}, Lcom/tencent/liteav/txcvodplayer/b/c;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v0, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    const-string v0, "EVT_PLAY_DURATION"

    invoke-virtual {p1}, Lcom/tencent/liteav/txcvodplayer/b/c;->g()I

    move-result v3

    invoke-virtual {p2, v0, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 39
    iget-object v0, p1, Lcom/tencent/liteav/txcvodplayer/b/c;->c:Lcom/tencent/liteav/txcvodplayer/b/b;

    if-eqz v0, :cond_6

    .line 40
    iget-object v1, v0, Lcom/tencent/liteav/txcvodplayer/b/b;->f:Ljava/lang/String;

    .line 41
    :cond_6
    const-string v0, "EVT_KEY_WATER_MARK_TEXT"

    invoke-virtual {p2, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    invoke-virtual {p1}, Lcom/tencent/liteav/txcvodplayer/b/c;->i()Lcom/tencent/liteav/txcvodplayer/b/c$c;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 43
    const-string v1, "EVT_IMAGESPRIT_WEBVTTURL"

    iget-object v3, v0, Lcom/tencent/liteav/txcvodplayer/b/c$c;->b:Ljava/lang/String;

    invoke-virtual {p2, v1, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    const-string v1, "EVT_IMAGESPRIT_IMAGEURL_LIST"

    iget-object v0, v0, Lcom/tencent/liteav/txcvodplayer/b/c$c;->a:Ljava/util/ArrayList;

    invoke-virtual {p2, v1, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 45
    :cond_7
    invoke-virtual {p1}, Lcom/tencent/liteav/txcvodplayer/b/c;->j()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 46
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_9

    .line 47
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 48
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    new-array v3, v3, [F

    const/4 v4, 0x0

    .line 49
    :goto_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    if-ge v4, v5, :cond_8

    .line 50
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/tencent/liteav/txcvodplayer/b/c$d;

    iget-object v5, v5, Lcom/tencent/liteav/txcvodplayer/b/c$d;->a:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/tencent/liteav/txcvodplayer/b/c$d;

    iget v5, v5, Lcom/tencent/liteav/txcvodplayer/b/c$d;->b:F

    aput v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 52
    :cond_8
    const-string v0, "EVT_KEY_FRAME_CONTENT_LIST"

    invoke-virtual {p2, v0, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 53
    const-string v0, "EVT_KEY_FRAME_TIME_LIST"

    invoke-virtual {p2, v0, v3}, Landroid/os/Bundle;->putFloatArray(Ljava/lang/String;[F)V

    .line 54
    :cond_9
    const-string v0, "EVT_DRM_TYPE"

    invoke-virtual {p1}, Lcom/tencent/liteav/txcvodplayer/b/c;->l()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    iget-object p1, p0, Lcom/tencent/liteav/a$2;->b:Lcom/tencent/liteav/a;

    invoke-static {p1, v2, p2}, Lcom/tencent/liteav/a;->a(Lcom/tencent/liteav/a;ILandroid/os/Bundle;)V

    :cond_a
    :goto_4
    return-void
.end method
