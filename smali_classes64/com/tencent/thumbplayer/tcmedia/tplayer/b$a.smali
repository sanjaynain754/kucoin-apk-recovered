.class Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/thumbplayer/tcmedia/tplayer/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

.field private b:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;


# direct methods
.method public constructor <init>(Lcom/tencent/thumbplayer/tcmedia/tplayer/b;Lcom/tencent/thumbplayer/tcmedia/tplayer/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->a:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    iput-object p2, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->b:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    return-void
.end method

.method public constructor <init>(Lcom/tencent/thumbplayer/tcmedia/tplayer/b;Lcom/tencent/thumbplayer/tcmedia/tplayer/b;Landroid/os/Looper;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->a:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    invoke-direct {p0, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->b:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->a:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    invoke-static {v0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/b;->e(Lcom/tencent/thumbplayer/tcmedia/tplayer/b;)Lcom/tencent/thumbplayer/tcmedia/tplayer/c;

    move-result-object v1

    if-nez v1, :cond_0

    goto/16 :goto_1

    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v2, 0x101

    if-eq v0, v2, :cond_5

    const/16 v2, 0x4e8

    if-eq v0, v2, :cond_4

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    :pswitch_0
    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->b:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    iget v0, p1, Landroid/os/Message;->arg1:I

    int-to-long v4, v0

    iget v0, p1, Landroid/os/Message;->arg2:I

    int-to-long v6, v0

    iget-object v8, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/16 v3, 0x3fa

    invoke-virtual/range {v1 .. v8}, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->onInfo(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;IJJLjava/lang/Object;)V

    return-void

    :pswitch_1
    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->b:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    iget v0, p1, Landroid/os/Message;->arg1:I

    int-to-long v4, v0

    iget v0, p1, Landroid/os/Message;->arg2:I

    int-to-long v6, v0

    iget-object v8, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/16 v3, 0x3f9

    invoke-virtual/range {v1 .. v8}, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->onInfo(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;IJJLjava/lang/Object;)V

    return-void

    :pswitch_2
    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->b:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    iget v0, p1, Landroid/os/Message;->arg1:I

    int-to-long v4, v0

    iget v0, p1, Landroid/os/Message;->arg2:I

    int-to-long v6, v0

    iget-object v8, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/16 v3, 0x3f8

    invoke-virtual/range {v1 .. v8}, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->onInfo(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;IJJLjava/lang/Object;)V

    return-void

    :pswitch_3
    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->a:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    invoke-static {p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/b;->i(Lcom/tencent/thumbplayer/tcmedia/tplayer/b;)V

    return-void

    :pswitch_4
    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->b:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    iget v0, p1, Landroid/os/Message;->arg1:I

    int-to-long v4, v0

    iget v0, p1, Landroid/os/Message;->arg2:I

    int-to-long v6, v0

    iget-object v8, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/16 v3, 0x3f7

    invoke-virtual/range {v1 .. v8}, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->onInfo(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;IJJLjava/lang/Object;)V

    return-void

    :pswitch_5
    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->b:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    invoke-virtual {v1, p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->onStopAsyncComplete(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;)V

    return-void

    :pswitch_6
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->b:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleFrameBuffer;

    invoke-virtual {v1, v0, p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->onSubtitleFrameOut(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleFrameBuffer;)V

    return-void

    :pswitch_7
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->a:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    invoke-static {v0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/b;->b(Lcom/tencent/thumbplayer/tcmedia/tplayer/b;)Lcom/tencent/thumbplayer/tcmedia/adapter/a;

    move-result-object v0

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->a:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    invoke-static {v0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/b;->b(Lcom/tencent/thumbplayer/tcmedia/tplayer/b;)Lcom/tencent/thumbplayer/tcmedia/adapter/a;

    move-result-object v0

    new-instance v2, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    invoke-direct {v2}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    iget v3, p1, Landroid/os/Message;->arg1:I

    int-to-long v3, v3

    const/16 v5, 0x1f40

    invoke-virtual {v2, v5, v3, v4}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildLong(IJ)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;->a(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->a:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    invoke-static {v0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/b;->c(Lcom/tencent/thumbplayer/tcmedia/tplayer/b;)Lcom/tencent/thumbplayer/tcmedia/e/a;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "MESSAGE_NOTIFY_PLAYER_SWITCH_DEFINITION bitrate:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->a:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    invoke-static {v2}, Lcom/tencent/thumbplayer/tcmedia/tplayer/b;->c(Lcom/tencent/thumbplayer/tcmedia/tplayer/b;)Lcom/tencent/thumbplayer/tcmedia/e/a;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/tencent/thumbplayer/tcmedia/e/a;->a(Ljava/lang/Exception;)V

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->a:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    invoke-static {v0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/b;->h(Lcom/tencent/thumbplayer/tcmedia/tplayer/b;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->b:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    iget v0, p1, Landroid/os/Message;->arg1:I

    int-to-long v4, v0

    iget v0, p1, Landroid/os/Message;->arg2:I

    int-to-long v6, v0

    iget-object v8, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/16 v3, 0x3f2

    invoke-virtual/range {v1 .. v8}, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->onInfo(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;IJJLjava/lang/Object;)V

    return-void

    :pswitch_8
    iget v0, p1, Landroid/os/Message;->arg1:I

    iget p1, p1, Landroid/os/Message;->arg2:I

    invoke-virtual {v1, v0, p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->onStateChange(II)V

    return-void

    :pswitch_9
    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->b:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    iget v0, p1, Landroid/os/Message;->arg1:I

    int-to-long v4, v0

    iget v0, p1, Landroid/os/Message;->arg2:I

    int-to-long v6, v0

    iget-object v8, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/16 v3, 0x3f0

    invoke-virtual/range {v1 .. v8}, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->onInfo(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;IJJLjava/lang/Object;)V

    return-void

    :pswitch_a
    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->b:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    iget v0, p1, Landroid/os/Message;->arg1:I

    int-to-long v4, v0

    iget v0, p1, Landroid/os/Message;->arg2:I

    int-to-long v6, v0

    iget-object v8, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/16 v3, 0x3ef

    invoke-virtual/range {v1 .. v8}, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->onInfo(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;IJJLjava/lang/Object;)V

    return-void

    :pswitch_b
    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->b:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    iget v0, p1, Landroid/os/Message;->arg1:I

    int-to-long v4, v0

    iget v0, p1, Landroid/os/Message;->arg2:I

    int-to-long v6, v0

    iget-object v8, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/16 v3, 0x3ee

    invoke-virtual/range {v1 .. v8}, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->onInfo(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;IJJLjava/lang/Object;)V

    return-void

    :pswitch_c
    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->b:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    iget v0, p1, Landroid/os/Message;->arg1:I

    int-to-long v4, v0

    iget v0, p1, Landroid/os/Message;->arg2:I

    int-to-long v6, v0

    iget-object v8, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/16 v3, 0x3ed

    invoke-virtual/range {v1 .. v8}, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->onInfo(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;IJJLjava/lang/Object;)V

    return-void

    :pswitch_d
    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->b:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    iget v0, p1, Landroid/os/Message;->arg1:I

    int-to-long v4, v0

    iget v0, p1, Landroid/os/Message;->arg2:I

    int-to-long v6, v0

    iget-object v8, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/16 v3, 0x3ec

    invoke-virtual/range {v1 .. v8}, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->onInfo(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;IJJLjava/lang/Object;)V

    return-void

    :pswitch_e
    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->b:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    iget v0, p1, Landroid/os/Message;->arg1:I

    int-to-long v4, v0

    iget v0, p1, Landroid/os/Message;->arg2:I

    int-to-long v6, v0

    iget-object v8, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/16 v3, 0x3e9

    invoke-virtual/range {v1 .. v8}, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->onInfo(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;IJJLjava/lang/Object;)V

    return-void

    :pswitch_f
    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->b:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    iget v0, p1, Landroid/os/Message;->arg1:I

    int-to-long v4, v0

    iget v0, p1, Landroid/os/Message;->arg2:I

    int-to-long v6, v0

    iget-object v8, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/16 v3, 0x3eb

    invoke-virtual/range {v1 .. v8}, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->onInfo(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;IJJLjava/lang/Object;)V

    return-void

    :pswitch_10
    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->b:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    iget v0, p1, Landroid/os/Message;->arg1:I

    int-to-long v4, v0

    iget v0, p1, Landroid/os/Message;->arg2:I

    int-to-long v6, v0

    iget-object v8, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/16 v3, 0x3ea

    invoke-virtual/range {v1 .. v8}, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->onInfo(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;IJJLjava/lang/Object;)V

    return-void

    :pswitch_11
    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->b:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    iget v3, p1, Landroid/os/Message;->arg1:I

    iget v4, p1, Landroid/os/Message;->arg2:I

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    invoke-virtual/range {v1 .. v8}, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->onError(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;IIJJ)V

    return-void

    :pswitch_12
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->b:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/tencent/thumbplayer/tcmedia/api/TPAudioFrameBuffer;

    invoke-virtual {v1, v0, p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->onAudioFrameOut(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;Lcom/tencent/thumbplayer/tcmedia/api/TPAudioFrameBuffer;)V

    return-void

    :pswitch_13
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->b:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/tencent/thumbplayer/tcmedia/api/TPVideoFrameBuffer;

    invoke-virtual {v1, v0, p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->onVideoFrameOut(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;Lcom/tencent/thumbplayer/tcmedia/api/TPVideoFrameBuffer;)V

    return-void

    :pswitch_14
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->b:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleData;

    invoke-virtual {v1, v0, p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->onSubtitleData(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleData;)V

    return-void

    :pswitch_15
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/tencent/thumbplayer/tcmedia/tplayer/e$a;

    if-eqz p1, :cond_3

    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->b:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    iget-wide v3, p1, Lcom/tencent/thumbplayer/tcmedia/tplayer/e$a;->a:J

    iget-wide v5, p1, Lcom/tencent/thumbplayer/tcmedia/tplayer/e$a;->b:J

    invoke-virtual/range {v1 .. v6}, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->onVideoSizeChanged(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;JJ)V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->a:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    invoke-static {v0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/b;->a(Lcom/tencent/thumbplayer/tcmedia/tplayer/b;)Lcom/tencent/thumbplayer/tcmedia/c/a;

    move-result-object v0

    iget-wide v1, p1, Lcom/tencent/thumbplayer/tcmedia/tplayer/e$a;->a:J

    iget-wide v3, p1, Lcom/tencent/thumbplayer/tcmedia/tplayer/e$a;->b:J

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/tencent/thumbplayer/tcmedia/c/a;->a(JJ)V

    return-void

    :pswitch_16
    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->b:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    invoke-virtual {v1, p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->onSeekComplete(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;)V

    return-void

    :pswitch_17
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/e$a;

    if-eqz v0, :cond_3

    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->b:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    iget v3, p1, Landroid/os/Message;->arg1:I

    iget v4, p1, Landroid/os/Message;->arg2:I

    iget-wide v5, v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/e$a;->a:J

    iget-wide v7, v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/e$a;->b:J

    invoke-virtual/range {v1 .. v8}, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->onError(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;IIJJ)V

    return-void

    :pswitch_18
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->a:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    iget v2, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0, v2}, Lcom/tencent/thumbplayer/tcmedia/tplayer/b;->c(Lcom/tencent/thumbplayer/tcmedia/tplayer/b;I)V

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/e$a;

    if-eqz v0, :cond_2

    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->a:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    invoke-static {v2}, Lcom/tencent/thumbplayer/tcmedia/tplayer/b;->a(Lcom/tencent/thumbplayer/tcmedia/tplayer/b;)Lcom/tencent/thumbplayer/tcmedia/c/a;

    move-result-object v2

    invoke-interface {v2}, Lcom/tencent/thumbplayer/tcmedia/c/a;->c()Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->b:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    iget v3, p1, Landroid/os/Message;->arg1:I

    iget-wide v4, v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/e$a;->a:J

    iget-wide v6, v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/e$a;->b:J

    iget-object v8, v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/e$a;->c:Ljava/lang/Object;

    invoke-virtual/range {v1 .. v8}, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->onInfo(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;IJJLjava/lang/Object;)V

    return-void

    :cond_2
    if-eqz v0, :cond_3

    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->b:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    iget v3, p1, Landroid/os/Message;->arg1:I

    iget-wide v4, v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/e$a;->a:J

    iget-wide v6, v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/e$a;->b:J

    iget-object v8, v0, Lcom/tencent/thumbplayer/tcmedia/tplayer/e$a;->c:Ljava/lang/Object;

    invoke-virtual/range {v1 .. v8}, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->onInfo(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;IJJLjava/lang/Object;)V

    :cond_3
    :goto_1
    return-void

    :pswitch_19
    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->b:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    invoke-virtual {v1, p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->onCompletion(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;)V

    return-void

    :cond_4
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->a:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    invoke-static {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/b;->a(Lcom/tencent/thumbplayer/tcmedia/tplayer/b;Landroid/os/Message;)V

    return-void

    :cond_5
    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->a:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    invoke-static {p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/b;->c(Lcom/tencent/thumbplayer/tcmedia/tplayer/b;)Lcom/tencent/thumbplayer/tcmedia/e/a;

    move-result-object p1

    const-string v0, "onPrepared"

    invoke-virtual {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/e/a;->c(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->a:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    const/16 v0, 0x3ec

    invoke-static {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/tplayer/b;->b(Lcom/tencent/thumbplayer/tcmedia/tplayer/b;I)V

    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/tplayer/b$a;->b:Lcom/tencent/thumbplayer/tcmedia/tplayer/b;

    invoke-virtual {v1, p1}, Lcom/tencent/thumbplayer/tcmedia/tplayer/c;->onPrepared(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x104
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
