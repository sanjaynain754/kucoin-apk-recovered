.class final Lcom/otaliastudios/transcoder/internal/codec/Decoder$drain$data$1;
.super Lkotlin/jvm/internal/Lambda;
.source "Decoder.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/otaliastudios/transcoder/internal/codec/Decoder;->g()Lcom/otaliastudios/transcoder/internal/pipeline/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Boolean;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
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

.field final synthetic this$0:Lcom/otaliastudios/transcoder/internal/codec/Decoder;


# direct methods
.method public constructor <init>(Lcom/otaliastudios/transcoder/internal/codec/Decoder;I)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder$drain$data$1;->this$0:Lcom/otaliastudios/transcoder/internal/codec/Decoder;

    .line 3
    .line 4
    iput p2, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder$drain$data$1;->$result:I

    .line 5
    const/4 p1, 0x1

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
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/otaliastudios/transcoder/internal/codec/Decoder$drain$data$1;->invoke(Z)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Z)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder$drain$data$1;->this$0:Lcom/otaliastudios/transcoder/internal/codec/Decoder;

    invoke-static {v0}, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->j(Lcom/otaliastudios/transcoder/internal/codec/Decoder;)Landroid/media/MediaCodec;

    move-result-object v0

    iget v1, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder$drain$data$1;->$result:I

    invoke-virtual {v0, v1, p1}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 3
    iget-object p1, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder$drain$data$1;->this$0:Lcom/otaliastudios/transcoder/internal/codec/Decoder;

    invoke-static {p1}, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->k(Lcom/otaliastudios/transcoder/internal/codec/Decoder;)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {p1, v0}, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->m(Lcom/otaliastudios/transcoder/internal/codec/Decoder;I)V

    return-void
.end method
