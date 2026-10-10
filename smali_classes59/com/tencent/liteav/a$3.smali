.class final Lcom/tencent/liteav/a$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/liteav/txcplayer/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/liteav/a;


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/a;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    return-void
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
.end method


# virtual methods
.method public final a(ILandroid/os/Bundle;)V
    .locals 13

    .line 1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0, p2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 2
    const-string v1, "EVT_MSG"

    const/16 v2, -0x17d5

    const-string v3, ""

    const-string v4, "description"

    if-eq p1, v2, :cond_16

    const/16 v2, -0x8fd

    if-eq p1, v2, :cond_15

    const/16 v2, 0x7db

    const-string v5, "EVT_PARAM1"

    if-eq p1, v2, :cond_14

    const/16 v2, 0x7ea

    if-eq p1, v2, :cond_17

    const/16 v2, 0x837

    if-eq p1, v2, :cond_17

    const/16 v2, 0x83a

    if-eq p1, v2, :cond_13

    const/16 v2, 0x7dd

    if-eq p1, v2, :cond_12

    const/16 v2, 0x7de

    const/4 v6, -0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq p1, v2, :cond_e

    const/16 v2, 0x7ee

    if-eq p1, v2, :cond_17

    const/16 v2, 0x7ef

    if-eq p1, v2, :cond_17

    packed-switch p1, :pswitch_data_0

    const-string/jumbo v2, "support_hevc"

    packed-switch p1, :pswitch_data_1

    packed-switch p1, :pswitch_data_2

    packed-switch p1, :pswitch_data_3

    const/16 v2, 0x1f40

    if-lt p1, v2, :cond_0

    const/16 v2, 0x2008

    if-le p1, v2, :cond_17

    .line 3
    :cond_0
    iget-object p2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    const-string/jumbo v0, "onPlayEvent miss match event "

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/tencent/liteav/a;->b(Lcom/tencent/liteav/a;Ljava/lang/String;)V

    return-void

    .line 4
    :pswitch_0
    iget-object p1, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    const-string/jumbo p2, "onPlayEvent dns resolved"

    invoke-static {p1, p2}, Lcom/tencent/liteav/a;->b(Lcom/tencent/liteav/a;Ljava/lang/String;)V

    .line 5
    iget-object p1, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {p1}, Lcom/tencent/liteav/a;->j(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/a/a;

    move-result-object p1

    .line 6
    iget p2, p1, Lcom/tencent/liteav/txcvodplayer/a/a;->y:I

    if-nez p2, :cond_2

    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p1, Lcom/tencent/liteav/txcvodplayer/a/a;->b:J

    sub-long/2addr v0, v2

    long-to-int p2, v0

    iput p2, p1, Lcom/tencent/liteav/txcvodplayer/a/a;->y:I

    return-void

    .line 8
    :pswitch_1
    iget-object v2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    const-string/jumbo v5, "onPlayEvent first video packet"

    invoke-static {v2, v5}, Lcom/tencent/liteav/a;->b(Lcom/tencent/liteav/a;Ljava/lang/String;)V

    .line 9
    iget-object v2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v2}, Lcom/tencent/liteav/a;->p(Lcom/tencent/liteav/a;)Z

    move-result v2

    if-nez v2, :cond_e

    .line 10
    iget-object v2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v2}, Lcom/tencent/liteav/a;->j(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/a/a;

    move-result-object v2

    .line 11
    iget v5, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->z:I

    if-nez v5, :cond_1

    .line 12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    iget-wide v11, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->c:J

    sub-long/2addr v9, v11

    long-to-int v5, v9

    iput v5, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->z:I

    .line 13
    :cond_1
    iget-object v2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v2}, Lcom/tencent/liteav/a;->q(Lcom/tencent/liteav/a;)Z

    goto/16 :goto_6

    .line 14
    :pswitch_2
    iget-object p1, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    const-string/jumbo p2, "onPlayEvent tcp connect success"

    invoke-static {p1, p2}, Lcom/tencent/liteav/a;->b(Lcom/tencent/liteav/a;Ljava/lang/String;)V

    .line 15
    iget-object p1, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {p1}, Lcom/tencent/liteav/a;->j(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/a/a;

    move-result-object p1

    .line 16
    iget p2, p1, Lcom/tencent/liteav/txcvodplayer/a/a;->x:I

    if-nez p2, :cond_2

    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p1, Lcom/tencent/liteav/txcvodplayer/a/a;->b:J

    sub-long/2addr v0, v2

    long-to-int p2, v0

    iput p2, p1, Lcom/tencent/liteav/txcvodplayer/a/a;->x:I

    .line 18
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "mTcpConnectTS = "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, p1, Lcom/tencent/liteav/txcvodplayer/a/a;->x:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mOriginBeginPlayTS = "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p1, Lcom/tencent/liteav/txcvodplayer/a/a;->b:J

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/tencent/liteav/txcvodplayer/a/a;->b(Ljava/lang/String;)V

    :cond_2
    return-void

    .line 19
    :pswitch_3
    iget-object v2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v2}, Lcom/tencent/liteav/a;->l(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/renderer/d;

    move-result-object v2

    if-eqz v2, :cond_17

    .line 20
    iget-object v2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v2}, Lcom/tencent/liteav/a;->l(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/renderer/d;

    move-result-object v2

    iget-object v5, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v5}, Lcom/tencent/liteav/a;->g(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    move-result-object v5

    invoke-virtual {v5}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getVideoWidth()I

    move-result v5

    iget-object v6, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v6}, Lcom/tencent/liteav/a;->g(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    move-result-object v6

    invoke-virtual {v6}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getVideoHeight()I

    move-result v6

    .line 21
    invoke-static {v2, v5, v6}, Lcom/tencent/liteav/txcvodplayer/renderer/h;->a(Lcom/tencent/liteav/txcvodplayer/renderer/d;II)Ljava/lang/Runnable;

    move-result-object v5

    const-string/jumbo v6, "setVideoSize"

    invoke-virtual {v2, v5, v6}, Lcom/tencent/liteav/txcvodplayer/renderer/d;->a(Ljava/lang/Runnable;Ljava/lang/String;)V

    goto/16 :goto_7

    .line 22
    :pswitch_4
    iget-object v2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v2}, Lcom/tencent/liteav/a;->j(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/a/a;

    move-result-object v2

    .line 23
    iget-boolean v5, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->p:Z

    if-nez v5, :cond_17

    iget v5, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->l:I

    if-eq v5, v6, :cond_17

    iget-boolean v5, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->h:Z

    if-nez v5, :cond_17

    iget-boolean v5, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->r:Z

    if-nez v5, :cond_17

    .line 24
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iput-wide v5, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->e:J

    .line 25
    iput-boolean v8, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->q:Z

    .line 26
    new-instance v5, Ljava/lang/StringBuilder;

    const-string/jumbo v6, "setLoadBegin mBeginLoadTS= "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v6, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->e:J

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/tencent/liteav/txcvodplayer/a/a;->b(Ljava/lang/String;)V

    goto/16 :goto_7

    .line 27
    :pswitch_5
    iget-object v2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v2}, Lcom/tencent/liteav/a;->j(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/a/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/tencent/liteav/txcvodplayer/a/a;->c()V

    .line 28
    iget-object v2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v2}, Lcom/tencent/liteav/a;->k(Lcom/tencent/liteav/a;)Z

    move-result v2

    if-eqz v2, :cond_17

    .line 29
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 30
    const-string p2, "loop once playback complete"

    invoke-virtual {p1, v1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    iget-object p2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    const/16 v0, 0x1771

    invoke-static {p2, v0, p1}, Lcom/tencent/liteav/a;->a(Lcom/tencent/liteav/a;ILandroid/os/Bundle;)V

    .line 32
    iget-object p1, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {p1, v8}, Lcom/tencent/liteav/a;->a(Lcom/tencent/liteav/a;Z)Z

    .line 33
    iget-object p1, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {p1}, Lcom/tencent/liteav/a;->j(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/a/a;

    move-result-object p1

    .line 34
    iput-boolean v8, p1, Lcom/tencent/liteav/txcvodplayer/a/a;->r:Z

    .line 35
    iget-object p1, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {p1}, Lcom/tencent/liteav/a;->g(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    move-result-object p1

    invoke-virtual {p1, v8}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c(Z)V

    .line 36
    iget-object p1, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {p1}, Lcom/tencent/liteav/a;->j(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/a/a;

    move-result-object p1

    invoke-virtual {p1, v8}, Lcom/tencent/liteav/txcvodplayer/a/a;->a(Z)V

    .line 37
    iget-object p1, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    const-string p2, "loop play"

    invoke-static {p1, p2}, Lcom/tencent/liteav/a;->b(Lcom/tencent/liteav/a;Ljava/lang/String;)V

    return-void

    .line 38
    :pswitch_6
    iget-object v2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v2}, Lcom/tencent/liteav/a;->j(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/a/a;

    move-result-object v2

    const-string v5, "EVT_PLAY_DURATION"

    invoke-virtual {p2, v5, v7}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v5

    const-string v6, "EVT_PLAY_PROGRESS"

    invoke-virtual {p2, v6, v7}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v6

    .line 39
    iput v5, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->i:I

    .line 40
    div-int/lit8 v6, v6, 0x3c

    .line 41
    iget v5, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->j:I

    if-eq v6, v5, :cond_17

    .line 42
    iput v6, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->j:I

    .line 43
    iget-boolean v5, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->f:Z

    if-nez v5, :cond_17

    .line 44
    invoke-virtual {v2}, Lcom/tencent/liteav/txcvodplayer/a/a;->b()V

    goto/16 :goto_7

    .line 45
    :pswitch_7
    iget-object v2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    const-string/jumbo v5, "onPlayEvent VOD_PLAY_EVT_PLAY_BEGIN"

    invoke-static {v2, v5}, Lcom/tencent/liteav/a;->b(Lcom/tencent/liteav/a;Ljava/lang/String;)V

    .line 46
    iget-object v2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v2}, Lcom/tencent/liteav/a;->i(Lcom/tencent/liteav/a;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 47
    iget-object v2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v2}, Lcom/tencent/liteav/a;->j(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/a/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/tencent/liteav/txcvodplayer/a/a;->d()V

    .line 48
    :cond_3
    iget-object v2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v2, v7}, Lcom/tencent/liteav/a;->a(Lcom/tencent/liteav/a;Z)Z

    .line 49
    iget-object v2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v2}, Lcom/tencent/liteav/a;->j(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/a/a;

    move-result-object v2

    .line 50
    iput-boolean v7, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->r:Z

    goto/16 :goto_7

    .line 51
    :pswitch_8
    const-string v6, "extra"

    invoke-virtual {v0, v6}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v9

    if-eqz v9, :cond_5

    .line 52
    invoke-virtual {v9, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 53
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_4

    .line 54
    iget-object v10, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v10}, Lcom/tencent/liteav/a;->j(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/a/a;

    move-result-object v10

    invoke-virtual {v10, v2, v9}, Lcom/tencent/liteav/txcvodplayer/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    :cond_4
    invoke-virtual {v0, v6}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 56
    :cond_5
    iget-object v2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v2}, Lcom/tencent/liteav/a;->j(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/a/a;

    move-result-object v2

    iget-object v6, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v6}, Lcom/tencent/liteav/a;->g(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    move-result-object v6

    invoke-virtual {v6}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getVideoWidth()I

    move-result v6

    iget-object v9, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v9}, Lcom/tencent/liteav/a;->g(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    move-result-object v9

    invoke-virtual {v9}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getVideoHeight()I

    move-result v9

    .line 57
    iput v6, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->C:I

    .line 58
    iput v9, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->D:I

    .line 59
    iget-object v2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    const-string/jumbo v6, "onPlayEvent VOD_PLAY_EVT_RCV_FIRST_I_FRAME"

    invoke-static {v2, v6}, Lcom/tencent/liteav/a;->b(Lcom/tencent/liteav/a;Ljava/lang/String;)V

    .line 60
    iget-object v2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v2}, Lcom/tencent/liteav/a;->j(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/a/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/tencent/liteav/txcvodplayer/a/a;->e()V

    .line 61
    iget-object v2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v2}, Lcom/tencent/liteav/a;->m(Lcom/tencent/liteav/a;)Z

    move-result v2

    if-eqz v2, :cond_6

    return-void

    .line 62
    :cond_6
    iget-object v2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v2}, Lcom/tencent/liteav/a;->r(Lcom/tencent/liteav/a;)Z

    .line 63
    iget-object v2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v2}, Lcom/tencent/liteav/a;->j(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/a/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/tencent/liteav/txcvodplayer/a/a;->d()V

    .line 64
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 65
    const-string v6, "EVT_ID"

    const/16 v9, 0x7d8

    invoke-virtual {v2, v6, v9}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 66
    const-string v6, "EVT_TIME"

    invoke-static {}, Lcom/tencent/liteav/base/util/TimeUtil;->a()J

    move-result-wide v10

    invoke-virtual {v2, v6, v10, v11}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 67
    const-string v6, "EVT_UTC_TIME"

    invoke-static {}, Lcom/tencent/liteav/base/util/TimeUtil;->b()J

    move-result-wide v10

    invoke-virtual {v2, v6, v10, v11}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 68
    iget-object v6, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v6}, Lcom/tencent/liteav/a;->g(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    move-result-object v6

    invoke-virtual {v6}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getMediaInfo()Lcom/tencent/liteav/txcplayer/model/b;

    move-result-object v6

    if-eqz v6, :cond_8

    .line 69
    iget-object v6, v6, Lcom/tencent/liteav/txcplayer/model/b;->c:Ljava/lang/String;

    if-eqz v6, :cond_8

    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v6

    const-string v10, "hevc"

    invoke-virtual {v6, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_8

    .line 70
    iget-object v6, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    .line 71
    invoke-static {v6}, Lcom/tencent/liteav/a;->s(Lcom/tencent/liteav/a;)Z

    move-result v6

    if-eqz v6, :cond_7

    const-string v6, "Enables hardware decoding H265"

    goto :goto_0

    :cond_7
    const-string v6, "Enables software decoding h265"

    .line 72
    :goto_0
    invoke-virtual {v2, v4, v6}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    move v6, v8

    goto :goto_2

    .line 73
    :cond_8
    iget-object v6, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    .line 74
    invoke-static {v6}, Lcom/tencent/liteav/a;->s(Lcom/tencent/liteav/a;)Z

    move-result v6

    if-eqz v6, :cond_9

    const-string v6, "Enables hardware decoding"

    goto :goto_1

    :cond_9
    const-string v6, "Enables software decoding"

    .line 75
    :goto_1
    invoke-virtual {v2, v4, v6}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    move v6, v7

    .line 76
    :goto_2
    iget-object v10, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v10}, Lcom/tencent/liteav/a;->s(Lcom/tencent/liteav/a;)Z

    move-result v10

    const/4 v11, 0x2

    if-eqz v10, :cond_a

    move v10, v8

    goto :goto_3

    :cond_a
    move v10, v11

    :goto_3
    invoke-virtual {v2, v5, v10}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 77
    const-string v10, "EVT_CODEC_TYPE"

    invoke-virtual {v2, v10, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 78
    iget-object v10, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v10}, Lcom/tencent/liteav/a;->s(Lcom/tencent/liteav/a;)Z

    move-result v10

    if-eqz v10, :cond_c

    if-nez v6, :cond_b

    goto :goto_5

    :cond_b
    const/4 v8, 0x3

    goto :goto_5

    :cond_c
    if-nez v6, :cond_d

    goto :goto_4

    :cond_d
    move v7, v11

    :goto_4
    move v8, v7

    .line 79
    :goto_5
    iget-object v6, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v6}, Lcom/tencent/liteav/a;->j(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/a/a;

    move-result-object v6

    .line 80
    iput v8, v6, Lcom/tencent/liteav/txcvodplayer/a/a;->w:I

    .line 81
    invoke-virtual {p0, v9, v2}, Lcom/tencent/liteav/a$3;->a(ILandroid/os/Bundle;)V

    .line 82
    iget-object v2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v2}, Lcom/tencent/liteav/a;->j(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/a/a;

    move-result-object v2

    .line 83
    iget v2, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->l:I

    .line 84
    invoke-virtual {v0, v5, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    goto/16 :goto_7

    .line 85
    :pswitch_9
    iget-object v2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v2}, Lcom/tencent/liteav/a;->j(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/a/a;

    move-result-object v2

    const/16 v5, -0x8ff

    const-string v6, "file not found"

    invoke-virtual {v2, v5, v6}, Lcom/tencent/liteav/txcvodplayer/a/a;->a(ILjava/lang/String;)V

    goto/16 :goto_7

    .line 86
    :pswitch_a
    iget-object v5, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v5}, Lcom/tencent/liteav/a;->j(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/a/a;

    move-result-object v5

    const/16 v6, -0x900

    const-string v7, "h265 decode failed"

    invoke-virtual {v5, v6, v7}, Lcom/tencent/liteav/txcvodplayer/a/a;->a(ILjava/lang/String;)V

    .line 87
    iget-object v5, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v5}, Lcom/tencent/liteav/a;->j(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/a/a;

    move-result-object v5

    const-string v6, "0"

    invoke-virtual {v5, v2, v6}, Lcom/tencent/liteav/txcvodplayer/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    iget-object v2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v2}, Lcom/tencent/liteav/a;->m(Lcom/tencent/liteav/a;)Z

    move-result v2

    if-nez v2, :cond_17

    .line 89
    iget-object v2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v2}, Lcom/tencent/liteav/a;->n(Lcom/tencent/liteav/a;)Z

    .line 90
    iget-object v2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v2}, Lcom/tencent/liteav/a;->o(Lcom/tencent/liteav/a;)Lcom/tencent/rtmp/TXVodPlayConfig;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/tencent/liteav/a;->a(Lcom/tencent/rtmp/TXVodPlayConfig;)V

    goto/16 :goto_7

    .line 91
    :pswitch_b
    iget-object v2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v2}, Lcom/tencent/liteav/a;->j(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/a/a;

    move-result-object v2

    const/16 v5, -0x901

    const-string v6, "HLS decrypt key error"

    invoke-virtual {v2, v5, v6}, Lcom/tencent/liteav/txcvodplayer/a/a;->a(ILjava/lang/String;)V

    goto/16 :goto_7

    .line 92
    :pswitch_c
    iget-object v2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v2}, Lcom/tencent/liteav/a;->j(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/a/a;

    move-result-object v2

    invoke-virtual {p2, v4, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, p1, v5}, Lcom/tencent/liteav/txcvodplayer/a/a;->a(ILjava/lang/String;)V

    goto/16 :goto_7

    .line 93
    :cond_e
    :goto_6
    iget-object v2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v2}, Lcom/tencent/liteav/a;->j(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/a/a;

    move-result-object v2

    .line 94
    iget-boolean v5, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->p:Z

    if-nez v5, :cond_10

    iget v5, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->l:I

    if-eq v5, v6, :cond_10

    iget-boolean v5, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->h:Z

    if-nez v5, :cond_10

    iget-boolean v5, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->r:Z

    if-nez v5, :cond_10

    .line 95
    new-instance v5, Ljava/lang/StringBuilder;

    const-string/jumbo v6, "setLoadEnd mFirstFrame="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v6, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->l:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, " , mIsLoading = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v6, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->q:Z

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v6, ",mBeginLoadTS = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v9, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->e:J

    invoke-virtual {v5, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/tencent/liteav/txcvodplayer/a/a;->b(Ljava/lang/String;)V

    .line 96
    iget-boolean v5, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->q:Z

    if-eqz v5, :cond_10

    .line 97
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iget-wide v9, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->e:J

    sub-long/2addr v5, v9

    long-to-int v5, v5

    .line 98
    iget v6, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->n:I

    add-int/2addr v6, v5

    iput v6, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->n:I

    .line 99
    iget v6, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->m:I

    add-int/2addr v6, v8

    iput v6, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->m:I

    .line 100
    iget v6, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->o:I

    if-ge v6, v5, :cond_f

    .line 101
    iput v5, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->o:I

    .line 102
    :cond_f
    iput-boolean v7, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->q:Z

    .line 103
    :cond_10
    iget-boolean v5, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->p:Z

    if-eqz v5, :cond_11

    .line 104
    iput-boolean v7, v2, Lcom/tencent/liteav/txcvodplayer/a/a;->p:Z

    .line 105
    :cond_11
    iget-object v2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v2}, Lcom/tencent/liteav/a;->j(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/a/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/tencent/liteav/txcvodplayer/a/a;->e()V

    goto :goto_7

    .line 106
    :cond_12
    iget-object v2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    const-string/jumbo v5, "onPlayEvent VOD_PLAY_EVT_VOD_PLAY_PREPARED"

    invoke-static {v2, v5}, Lcom/tencent/liteav/a;->b(Lcom/tencent/liteav/a;Ljava/lang/String;)V

    goto :goto_7

    .line 107
    :cond_13
    iget-object v2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v2}, Lcom/tencent/liteav/a;->m(Lcom/tencent/liteav/a;)Z

    move-result v2

    if-nez v2, :cond_17

    .line 108
    iget-object v2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v2}, Lcom/tencent/liteav/a;->n(Lcom/tencent/liteav/a;)Z

    .line 109
    iget-object v2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v2}, Lcom/tencent/liteav/a;->o(Lcom/tencent/liteav/a;)Lcom/tencent/rtmp/TXVodPlayConfig;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/tencent/liteav/a;->a(Lcom/tencent/rtmp/TXVodPlayConfig;)V

    goto :goto_7

    .line 110
    :cond_14
    iget-object v2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v2}, Lcom/tencent/liteav/a;->g(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    move-result-object v2

    invoke-virtual {v2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getMetaRotationDegree()I

    move-result v2

    invoke-virtual {v0, v5, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    goto :goto_7

    .line 111
    :cond_15
    iget-object v5, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v5}, Lcom/tencent/liteav/a;->j(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/a/a;

    move-result-object v5

    .line 112
    invoke-virtual {p2, v4, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 113
    invoke-virtual {v5, v2, v6}, Lcom/tencent/liteav/txcvodplayer/a/a;->a(ILjava/lang/String;)V

    goto :goto_7

    .line 114
    :cond_16
    iget-object v5, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v5}, Lcom/tencent/liteav/a;->j(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/a/a;

    move-result-object v5

    invoke-virtual {p2, v4, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v2, v6}, Lcom/tencent/liteav/txcvodplayer/a/a;->a(ILjava/lang/String;)V

    .line 115
    :cond_17
    :goto_7
    :pswitch_d
    invoke-virtual {p2, v4, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, v1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    iget-object p2, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {p2, p1, v0}, Lcom/tencent/liteav/a;->a(Lcom/tencent/liteav/a;ILandroid/os/Bundle;)V

    return-void

    :pswitch_data_0
    .packed-switch -0x177b
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
    .end packed-switch

    :pswitch_data_1
    .packed-switch -0x901
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x7d2
        :pswitch_d
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_d
        :pswitch_3
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x7e0
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_d
        :pswitch_d
    .end packed-switch
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 4

    .line 117
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 118
    invoke-static {}, Lcom/tencent/liteav/base/util/t;->a()[I

    move-result-object v1

    .line 119
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v3, 0x0

    aget v1, v1, v3

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "%"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "CPU_USAGE"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 120
    const-string v1, "fps"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v1

    float-to-int v1, v1

    const-string v2, "VIDEO_FPS"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 121
    const-string v1, "dps"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v1

    float-to-int v1, v1

    const-string v2, "VIDEO_DPS"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 122
    const-string/jumbo v1, "tcpSpeed"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    long-to-int v1, v1

    div-int/lit16 v1, v1, 0x3e8

    const-string v2, "NET_SPEED"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 123
    const-string v1, "cachedBytes"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    long-to-int v1, v1

    div-int/lit16 v1, v1, 0x3e8

    const-string v2, "VIDEO_CACHE"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 124
    iget-object v1, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v1}, Lcom/tencent/liteav/a;->g(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getVideoWidth()I

    move-result v1

    const-string v2, "VIDEO_WIDTH"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 125
    iget-object v1, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v1}, Lcom/tencent/liteav/a;->g(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getVideoHeight()I

    move-result v1

    const-string v2, "VIDEO_HEIGHT"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 126
    iget-object v1, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v1}, Lcom/tencent/liteav/a;->g(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getServerIp()Ljava/lang/String;

    move-result-object v1

    const-string v2, "SERVER_IP"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    const-string v1, "VIDEO_BITRATE"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 128
    const-string v1, "AUDIO_BITRATE"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    long-to-int p1, v2

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 129
    iget-object p1, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {p1}, Lcom/tencent/liteav/a;->j(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/a/a;

    move-result-object p1

    iget-object v1, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    invoke-static {v1}, Lcom/tencent/liteav/a;->g(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getServerIp()Ljava/lang/String;

    move-result-object v1

    .line 130
    iput-object v1, p1, Lcom/tencent/liteav/txcvodplayer/a/a;->A:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 131
    const-string v1, ""

    iput-object v1, p1, Lcom/tencent/liteav/txcvodplayer/a/a;->A:Ljava/lang/String;

    .line 132
    :cond_0
    iget-object p1, p0, Lcom/tencent/liteav/a$3;->a:Lcom/tencent/liteav/a;

    const/16 v1, 0x3a99

    invoke-static {p1, v1, v0}, Lcom/tencent/liteav/a;->a(Lcom/tencent/liteav/a;ILandroid/os/Bundle;)V

    return-void
.end method
