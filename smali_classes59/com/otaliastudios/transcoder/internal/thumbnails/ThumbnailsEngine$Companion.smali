.class public final Lcom/otaliastudios/transcoder/internal/thumbnails/ThumbnailsEngine$Companion;
.super Ljava/lang/Object;
.source "ThumbnailsEngine.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/otaliastudios/transcoder/internal/thumbnails/ThumbnailsEngine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/otaliastudios/transcoder/internal/thumbnails/ThumbnailsEngine$Companion;",
        "",
        "<init>",
        "()V",
        "Lq90/b;",
        "options",
        "",
        "thumbnails",
        "(Lq90/b;)V",
        "",
        "",
        "a",
        "(Ljava/lang/Throwable;)Z",
        "Lw90/i;",
        "log",
        "Lw90/i;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/otaliastudios/transcoder/internal/thumbnails/ThumbnailsEngine$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Z
    .locals 2

    .line 1
    .line 2
    instance-of v0, p1, Ljava/lang/InterruptedException;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 p1, 0x1

    .line 6
    return p1

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    return v1

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    if-nez p1, :cond_2

    .line 25
    return v1

    .line 26
    .line 27
    .line 28
    :cond_2
    invoke-virtual {p0, p1}, Lcom/otaliastudios/transcoder/internal/thumbnails/ThumbnailsEngine$Companion;->a(Ljava/lang/Throwable;)Z

    .line 29
    move-result p1

    .line 30
    return p1
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
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public final thumbnails(Lq90/b;)V
    .locals 3
    .param p1    # Lq90/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "options"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/otaliastudios/transcoder/internal/thumbnails/ThumbnailsEngine;->a()Lw90/i;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    const-string/jumbo v1, "thumbnails(): called..."

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lw90/i;->c(Ljava/lang/String;)V

    .line 17
    .line 18
    new-instance v0, Lv90/a;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, p1}, Lv90/a;-><init>(Lq90/b;)V

    .line 22
    .line 23
    :try_start_0
    new-instance v1, Lcom/otaliastudios/transcoder/internal/thumbnails/DefaultThumbnailsEngine;

    .line 24
    .line 25
    new-instance v1, Lcom/otaliastudios/transcoder/internal/a;

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, p1}, Lcom/otaliastudios/transcoder/internal/a;-><init>(Lq90/b;)V

    .line 29
    const/4 p1, 0x0

    .line 30
    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    goto :goto_0

    .line 33
    :catch_0
    move-exception p1

    .line 34
    goto :goto_1

    .line 35
    :goto_0
    throw p1

    .line 36
    .line 37
    .line 38
    :goto_1
    invoke-virtual {p0, p1}, Lcom/otaliastudios/transcoder/internal/thumbnails/ThumbnailsEngine$Companion;->a(Ljava/lang/Throwable;)Z

    .line 39
    move-result v1

    .line 40
    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    .line 44
    invoke-static {}, Lcom/otaliastudios/transcoder/internal/thumbnails/ThumbnailsEngine;->a()Lw90/i;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    const-string v2, "Transcode canceled."

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v2, p1}, Lw90/i;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lv90/a;->b()V

    .line 54
    return-void

    .line 55
    .line 56
    .line 57
    :cond_0
    invoke-static {}, Lcom/otaliastudios/transcoder/internal/thumbnails/ThumbnailsEngine;->a()Lw90/i;

    .line 58
    move-result-object v1

    .line 59
    .line 60
    const-string v2, "Unexpected error while transcoding."

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, v2, p1}, Lw90/i;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, p1}, Lv90/a;->c(Ljava/lang/Throwable;)V

    .line 67
    throw p1
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method
