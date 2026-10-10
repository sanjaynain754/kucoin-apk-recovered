.class public Lo90/a;
.super Ljava/lang/Object;
.source "EglSurface.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\r\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u0016\u0018\u00002\u00020\u0001B\u0019\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0010\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0015\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u001b\u00a8\u0006\u001e"
    }
    d2 = {
        "Lo90/a;",
        "",
        "Lcom/otaliastudios/opengl/core/EglCore;",
        "eglCore",
        "Ln90/e;",
        "eglSurface",
        "<init>",
        "(Lcom/otaliastudios/opengl/core/EglCore;Ln90/e;)V",
        "",
        "d",
        "()V",
        "c",
        "",
        "nsecs",
        "e",
        "(J)V",
        "a",
        "Lcom/otaliastudios/opengl/core/EglCore;",
        "()Lcom/otaliastudios/opengl/core/EglCore;",
        "setEglCore$library_release",
        "(Lcom/otaliastudios/opengl/core/EglCore;)V",
        "b",
        "Ln90/e;",
        "()Ln90/e;",
        "setEglSurface$library_release",
        "(Ln90/e;)V",
        "",
        "I",
        "width",
        "height",
        "library_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field public a:Lcom/otaliastudios/opengl/core/EglCore;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:Ln90/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>(Lcom/otaliastudios/opengl/core/EglCore;Ln90/e;)V
    .locals 1
    .param p1    # Lcom/otaliastudios/opengl/core/EglCore;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ln90/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "eglCore"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "eglSurface"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    iput-object p1, p0, Lo90/a;->a:Lcom/otaliastudios/opengl/core/EglCore;

    .line 16
    .line 17
    iput-object p2, p0, Lo90/a;->b:Ln90/e;

    .line 18
    const/4 p1, -0x1

    .line 19
    .line 20
    iput p1, p0, Lo90/a;->c:I

    .line 21
    .line 22
    iput p1, p0, Lo90/a;->d:I

    .line 23
    return-void
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
.method public final a()Lcom/otaliastudios/opengl/core/EglCore;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lo90/a;->a:Lcom/otaliastudios/opengl/core/EglCore;

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

.method public final b()Ln90/e;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lo90/a;->b:Ln90/e;

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

.method public final c()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lo90/a;->a:Lcom/otaliastudios/opengl/core/EglCore;

    .line 3
    .line 4
    iget-object v1, p0, Lo90/a;->b:Ln90/e;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/otaliastudios/opengl/core/EglNativeCore;->b(Ln90/e;)V

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

.method public d()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lo90/a;->a:Lcom/otaliastudios/opengl/core/EglCore;

    .line 3
    .line 4
    iget-object v1, p0, Lo90/a;->b:Ln90/e;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/otaliastudios/opengl/core/EglNativeCore;->d(Ln90/e;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ln90/d;->h()Ln90/e;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    iput-object v0, p0, Lo90/a;->b:Ln90/e;

    .line 14
    const/4 v0, -0x1

    .line 15
    .line 16
    iput v0, p0, Lo90/a;->d:I

    .line 17
    .line 18
    iput v0, p0, Lo90/a;->c:I

    .line 19
    return-void
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

.method public final e(J)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lo90/a;->a:Lcom/otaliastudios/opengl/core/EglCore;

    .line 3
    .line 4
    iget-object v1, p0, Lo90/a;->b:Ln90/e;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1, p1, p2}, Lcom/otaliastudios/opengl/core/EglNativeCore;->e(Ln90/e;J)V

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
.end method
