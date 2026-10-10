.class public final Lcom/tencent/liteav/a$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/rtmp/ITXVodPlayListener$ITXVodSubtitleDataListener;

.field final synthetic b:Lcom/tencent/liteav/a;


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/a;Lcom/tencent/rtmp/ITXVodPlayListener$ITXVodSubtitleDataListener;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/a$6;->b:Lcom/tencent/liteav/a;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/liteav/a$6;->a:Lcom/tencent/rtmp/ITXVodPlayListener$ITXVodSubtitleDataListener;

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
.method public final a(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleData;)V
    .locals 0

    .line 1
    .line 2
    iget-object p1, p0, Lcom/tencent/liteav/a$6;->a:Lcom/tencent/rtmp/ITXVodPlayListener$ITXVodSubtitleDataListener;

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {p2}, Lcom/tencent/liteav/a;->a(Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleData;)Lcom/tencent/rtmp/TXVodDef$TXVodSubtitleData;

    .line 8
    move-result-object p2

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, p2}, Lcom/tencent/rtmp/ITXVodPlayListener$ITXVodSubtitleDataListener;->onSubtitleData(Lcom/tencent/rtmp/TXVodDef$TXVodSubtitleData;)V

    .line 12
    :cond_0
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
