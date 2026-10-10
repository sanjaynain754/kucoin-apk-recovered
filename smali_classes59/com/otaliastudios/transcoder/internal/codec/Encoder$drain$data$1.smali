.class final Lcom/otaliastudios/transcoder/internal/codec/Encoder$drain$data$1;
.super Lkotlin/jvm/internal/Lambda;
.source "Encoder.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/otaliastudios/transcoder/internal/codec/Encoder;->g()Lcom/otaliastudios/transcoder/internal/pipeline/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        ""
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $result:I

.field final synthetic this$0:Lcom/otaliastudios/transcoder/internal/codec/Encoder;


# direct methods
.method public constructor <init>(Lcom/otaliastudios/transcoder/internal/codec/Encoder;I)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder$drain$data$1;->this$0:Lcom/otaliastudios/transcoder/internal/codec/Encoder;

    .line 3
    .line 4
    iput p2, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder$drain$data$1;->$result:I

    .line 5
    const/4 p1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

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
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/otaliastudios/transcoder/internal/codec/Encoder$drain$data$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder$drain$data$1;->this$0:Lcom/otaliastudios/transcoder/internal/codec/Encoder;

    invoke-static {v0}, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->j(Lcom/otaliastudios/transcoder/internal/codec/Encoder;)Landroid/media/MediaCodec;

    move-result-object v0

    iget v1, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder$drain$data$1;->$result:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 3
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder$drain$data$1;->this$0:Lcom/otaliastudios/transcoder/internal/codec/Encoder;

    invoke-static {v0}, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->k(Lcom/otaliastudios/transcoder/internal/codec/Encoder;)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-static {v0, v1}, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->m(Lcom/otaliastudios/transcoder/internal/codec/Encoder;I)V

    return-void
.end method
