.class final Lcom/otaliastudios/transcoder/internal/codec/Encoder$buffers$2;
.super Lkotlin/jvm/internal/Lambda;
.source "Encoder.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/otaliastudios/transcoder/internal/codec/Encoder;-><init>(Landroid/media/MediaCodec;Landroid/view/Surface;ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lu90/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lu90/a;",
        "<anonymous>",
        "()Lu90/a;"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/otaliastudios/transcoder/internal/codec/Encoder;


# direct methods
.method public constructor <init>(Lcom/otaliastudios/transcoder/internal/codec/Encoder;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder$buffers$2;->this$0:Lcom/otaliastudios/transcoder/internal/codec/Encoder;

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
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/otaliastudios/transcoder/internal/codec/Encoder$buffers$2;->invoke()Lu90/a;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Lu90/a;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    new-instance v0, Lu90/a;

    iget-object v1, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder$buffers$2;->this$0:Lcom/otaliastudios/transcoder/internal/codec/Encoder;

    invoke-static {v1}, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->j(Lcom/otaliastudios/transcoder/internal/codec/Encoder;)Landroid/media/MediaCodec;

    move-result-object v1

    invoke-direct {v0, v1}, Lu90/a;-><init>(Landroid/media/MediaCodec;)V

    return-object v0
.end method
