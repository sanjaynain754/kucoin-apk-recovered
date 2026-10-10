.class final Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine$location$1;
.super Lkotlin/jvm/internal/Lambda;
.source "DefaultTranscodeEngine.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;-><init>(Lcom/otaliastudios/transcoder/internal/a;Lz90/a;Lw90/l;Lea0/b;ILca0/a;Lx90/a;Lda0/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Laa0/b;",
        "[D>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0013\n\u0002\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Laa0/b;",
        "it",
        "",
        "<anonymous>",
        "(Laa0/b;)[D"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine$location$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine$location$1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine$location$1;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine$location$1;->INSTANCE:Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine$location$1;

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
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 5
    return-void
    .line 6
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
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Laa0/b;

    invoke-virtual {p0, p1}, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine$location$1;->invoke(Laa0/b;)[D

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Laa0/b;)[D
    .locals 1
    .param p1    # Laa0/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-interface {p1}, Laa0/b;->getLocation()[D

    move-result-object p1

    return-object p1
.end method
