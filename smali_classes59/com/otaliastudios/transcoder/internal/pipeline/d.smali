.class public final Lcom/otaliastudios/transcoder/internal/pipeline/d;
.super Ljava/lang/Object;
.source "Pipeline.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0080\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\t\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000\"\u0008\u0008\u0001\u0010\u0003*\u00020\u0002\"\u0008\u0008\u0002\u0010\u0004*\u00020\u0000\"\u0008\u0008\u0003\u0010\u0005*\u00020\u0002*\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00062\u001e\u0010\u0008\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006H\u0080\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000b*<\u0008\u0002\u0010\u000c\"\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00062\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0006\u00a8\u0006\r"
    }
    d2 = {
        "",
        "CurrData",
        "Lcom/otaliastudios/transcoder/internal/pipeline/b;",
        "CurrChannel",
        "NewData",
        "NewChannel",
        "Lcom/otaliastudios/transcoder/internal/pipeline/g;",
        "",
        "other",
        "Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a;",
        "a",
        "(Lcom/otaliastudios/transcoder/internal/pipeline/g;Lcom/otaliastudios/transcoder/internal/pipeline/g;)Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a;",
        "AnyStep",
        "lib_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lcom/otaliastudios/transcoder/internal/pipeline/g;Lcom/otaliastudios/transcoder/internal/pipeline/g;)Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a;
    .locals 1
    .param p0    # Lcom/otaliastudios/transcoder/internal/pipeline/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcom/otaliastudios/transcoder/internal/pipeline/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<CurrData:",
            "Ljava/lang/Object;",
            "CurrChannel::",
            "Lcom/otaliastudios/transcoder/internal/pipeline/b;",
            "NewData:",
            "Ljava/lang/Object;",
            "NewChannel::",
            "Lcom/otaliastudios/transcoder/internal/pipeline/b;",
            ">(",
            "Lcom/otaliastudios/transcoder/internal/pipeline/g<",
            "Lkotlin/Unit;",
            "Lcom/otaliastudios/transcoder/internal/pipeline/b;",
            "TCurrData;TCurrChannel;>;",
            "Lcom/otaliastudios/transcoder/internal/pipeline/g<",
            "TCurrData;TCurrChannel;TNewData;TNewChannel;>;)",
            "Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a<",
            "TNewData;TNewChannel;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v0, "other"

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    new-instance v0, Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a;

    .line 14
    .line 15
    .line 16
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 17
    move-result-object p0

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, p0}, Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a;-><init>(Ljava/util/List;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a;->b(Lcom/otaliastudios/transcoder/internal/pipeline/g;)Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a;

    .line 24
    move-result-object p0

    .line 25
    return-object p0
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
