.class public final Ly4/f$a;
.super Ljava/lang/Object;
.source "FrameLoaderStrategy.kt"

# interfaces
.implements La5/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly4/f;-><init>(Ljava/lang/String;Lv4/d;Lw4/b;Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameLoaderFactory;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0008*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\t\u00a8\u0006\u000c"
    }
    d2 = {
        "y4/f$a",
        "La5/g;",
        "",
        "renderingFps",
        "",
        "a",
        "(I)V",
        "I",
        "c",
        "()I",
        "animationFps",
        "b",
        "animated-drawable_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:I

.field public final synthetic b:Ly4/f;


# direct methods
.method public constructor <init>(Ly4/f;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Ly4/f$a;->b:Ly4/f;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Ly4/f;->h(Ly4/f;)I

    .line 9
    move-result p1

    .line 10
    .line 11
    iput p1, p0, Ly4/f$a;->a:I

    .line 12
    return-void
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
.end method


# virtual methods
.method public a(I)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Ly4/f$a;->b:Ly4/f;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ly4/f;->f(Ly4/f;)I

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eq p1, v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Ly4/f$a;->b:Ly4/f;

    .line 11
    const/4 v1, 0x1

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Ly4/f;->h(Ly4/f;)I

    .line 15
    move-result v2

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v1, v2}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    .line 19
    move-result p1

    .line 20
    .line 21
    .line 22
    invoke-static {v0, p1}, Ly4/f;->i(Ly4/f;I)V

    .line 23
    .line 24
    iget-object p1, p0, Ly4/f$a;->b:Ly4/f;

    .line 25
    .line 26
    .line 27
    invoke-static {p1}, Ly4/f;->g(Ly4/f;)Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/b;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    iget-object v0, p0, Ly4/f$a;->b:Ly4/f;

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Ly4/f;->f(Ly4/f;)I

    .line 36
    move-result v0

    .line 37
    .line 38
    .line 39
    invoke-interface {p1, v0}, Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/b;->b(I)V

    .line 40
    :cond_0
    return-void
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
.end method

.method public b()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ly4/f$a;->b:Ly4/f;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ly4/f;->f(Ly4/f;)I

    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public c()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Ly4/f$a;->a:I

    .line 3
    return v0
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
    .line 18
.end method
