.class final Lcom/otaliastudios/transcoder/internal/video/VideoRenderer$frameDrawer$2;
.super Lkotlin/jvm/internal/Lambda;
.source "VideoRenderer.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/otaliastudios/transcoder/internal/video/VideoRenderer;-><init>(IILandroid/media/MediaFormat;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/otaliastudios/transcoder/internal/video/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lcom/otaliastudios/transcoder/internal/video/a;",
        "<anonymous>",
        "()Lcom/otaliastudios/transcoder/internal/video/a;"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# instance fields
.field final synthetic $flipY:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/otaliastudios/transcoder/internal/video/VideoRenderer$frameDrawer$2;->$flipY:Z

    .line 3
    const/4 p1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    return-void
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
.method public final invoke()Lcom/otaliastudios/transcoder/internal/video/a;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    new-instance v0, Lcom/otaliastudios/transcoder/internal/video/a;

    invoke-direct {v0}, Lcom/otaliastudios/transcoder/internal/video/a;-><init>()V

    .line 3
    iget-boolean v1, p0, Lcom/otaliastudios/transcoder/internal/video/VideoRenderer$frameDrawer$2;->$flipY:Z

    invoke-virtual {v0, v1}, Lcom/otaliastudios/transcoder/internal/video/a;->j(Z)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/otaliastudios/transcoder/internal/video/VideoRenderer$frameDrawer$2;->invoke()Lcom/otaliastudios/transcoder/internal/video/a;

    move-result-object v0

    return-object v0
.end method
