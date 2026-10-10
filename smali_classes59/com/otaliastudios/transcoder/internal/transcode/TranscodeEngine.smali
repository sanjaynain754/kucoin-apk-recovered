.class public abstract Lcom/otaliastudios/transcoder/internal/transcode/TranscodeEngine;
.super Ljava/lang/Object;
.source "TranscodeEngine.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/otaliastudios/transcoder/internal/transcode/TranscodeEngine$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0008 \u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0003\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/otaliastudios/transcoder/internal/transcode/TranscodeEngine;",
        "",
        "<init>",
        "()V",
        "",
        "b",
        "a",
        "Companion",
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


# static fields
.field public static final a:Lcom/otaliastudios/transcoder/internal/transcode/TranscodeEngine$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lw90/i;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/otaliastudios/transcoder/internal/transcode/TranscodeEngine$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/otaliastudios/transcoder/internal/transcode/TranscodeEngine$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/otaliastudios/transcoder/internal/transcode/TranscodeEngine;->a:Lcom/otaliastudios/transcoder/internal/transcode/TranscodeEngine$Companion;

    .line 9
    .line 10
    new-instance v0, Lw90/i;

    .line 11
    .line 12
    const-string v1, "TranscodeEngine"

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1}, Lw90/i;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    sput-object v0, Lcom/otaliastudios/transcoder/internal/transcode/TranscodeEngine;->b:Lw90/i;

    .line 18
    return-void
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
    .line 5
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

.method public static final synthetic a()Lw90/i;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/otaliastudios/transcoder/internal/transcode/TranscodeEngine;->b:Lw90/i;

    .line 3
    return-object v0
    .line 4
    .line 5
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

.method public static final c(Lq90/e;)V
    .locals 1
    .param p0    # Lq90/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/otaliastudios/transcoder/internal/transcode/TranscodeEngine;->a:Lcom/otaliastudios/transcoder/internal/transcode/TranscodeEngine$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lcom/otaliastudios/transcoder/internal/transcode/TranscodeEngine$Companion;->transcode(Lq90/e;)V

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
.method public abstract b()V
.end method
