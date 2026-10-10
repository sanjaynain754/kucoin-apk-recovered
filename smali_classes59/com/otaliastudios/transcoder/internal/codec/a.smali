.class public interface abstract Lcom/otaliastudios/transcoder/internal/codec/a;
.super Ljava/lang/Object;
.source "Decoder.kt"

# interfaces
.implements Lcom/otaliastudios/transcoder/internal/pipeline/b;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/otaliastudios/transcoder/internal/codec/a;",
        "Lcom/otaliastudios/transcoder/internal/pipeline/b;",
        "Landroid/media/MediaFormat;",
        "sourceFormat",
        "Landroid/view/Surface;",
        "e",
        "(Landroid/media/MediaFormat;)Landroid/view/Surface;",
        "rawFormat",
        "",
        "a",
        "(Landroid/media/MediaFormat;)V",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract a(Landroid/media/MediaFormat;)V
    .param p1    # Landroid/media/MediaFormat;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract e(Landroid/media/MediaFormat;)Landroid/view/Surface;
    .param p1    # Landroid/media/MediaFormat;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method
