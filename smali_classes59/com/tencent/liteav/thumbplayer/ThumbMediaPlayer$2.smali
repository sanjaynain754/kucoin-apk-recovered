.class Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnAudioFrameOutputListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->setEnableMixExternalAudioFrame()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer$2;->this$0:Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;

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
.method public onAudioFrameOut(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;Lcom/tencent/thumbplayer/tcmedia/api/TPAudioFrameBuffer;)V
    .locals 1

    .line 1
    .line 2
    iget-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer$2;->this$0:Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->access$300(Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;)Ljava/lang/Object;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer$2;->this$0:Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->access$300(Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;)Ljava/lang/Object;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer$TRTCCloudClassInvokeHelper;->access$400(Ljava/lang/Object;)Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer$TRTCCloudClassInvokeHelper;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer$2;->this$0:Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->access$300(Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;)Ljava/lang/Object;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v0, p2}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer$TRTCCloudClassInvokeHelper;->access$500(Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer$TRTCCloudClassInvokeHelper;Ljava/lang/Object;Lcom/tencent/thumbplayer/tcmedia/api/TPAudioFrameBuffer;)V

    .line 28
    :cond_0
    return-void
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
