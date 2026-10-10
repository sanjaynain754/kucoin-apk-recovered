.class public final Lcom/kubi/monitor/firebase/b$a;
.super Ljava/lang/Object;
.source "FirebasePageFrameTrackFactory.kt"

# interfaces
.implements Ltq/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/monitor/firebase/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/kubi/monitor/firebase/b$a;",
        "Ltq/d;",
        "",
        "pageName",
        "<init>",
        "(Ljava/lang/String;)V",
        "Lqq/f;",
        "page",
        "Lyq/a;",
        "framesInfo",
        "",
        "a",
        "(Lqq/f;Lyq/a;)V",
        "Ljava/lang/String;",
        "Lcom/google/firebase/perf/metrics/Trace;",
        "b",
        "Lcom/google/firebase/perf/metrics/Trace;",
        "screenTrace",
        "Monitor-firebase_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lcom/google/firebase/perf/metrics/Trace;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "pageName"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/kubi/monitor/firebase/b$a;->a:Ljava/lang/String;

    .line 11
    .line 12
    const-string v0, "_st_"

    .line 13
    .line 14
    .line 15
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lcom/google/firebase/perf/metrics/Trace;->create(Ljava/lang/String;)Lcom/google/firebase/perf/metrics/Trace;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/google/firebase/perf/metrics/Trace;->start()V

    .line 24
    .line 25
    const-string v0, "create(\"_st_$pageName\").apply { start() }"

    .line 26
    .line 27
    .line 28
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    iput-object p1, p0, Lcom/kubi/monitor/firebase/b$a;->b:Lcom/google/firebase/perf/metrics/Trace;

    .line 31
    return-void
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
.end method


# virtual methods
.method public a(Lqq/f;Lyq/a;)V
    .locals 3
    .param p1    # Lqq/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lyq/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "page"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    return-void

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p2}, Lyq/a;->d()I

    .line 12
    move-result p1

    .line 13
    .line 14
    if-lez p1, :cond_1

    .line 15
    .line 16
    iget-object p1, p0, Lcom/kubi/monitor/firebase/b$a;->b:Lcom/google/firebase/perf/metrics/Trace;

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lcom/kubi/monitor/firebase/b;->d()Ljava/lang/String;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Lyq/a;->d()I

    .line 24
    move-result v1

    .line 25
    int-to-long v1, v1

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0, v1, v2}, Lcom/google/firebase/perf/metrics/Trace;->putMetric(Ljava/lang/String;J)V

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-virtual {p2}, Lyq/a;->b()I

    .line 32
    move-result p1

    .line 33
    .line 34
    if-lez p1, :cond_2

    .line 35
    .line 36
    iget-object p1, p0, Lcom/kubi/monitor/firebase/b$a;->b:Lcom/google/firebase/perf/metrics/Trace;

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lcom/kubi/monitor/firebase/b;->c()Ljava/lang/String;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2}, Lyq/a;->b()I

    .line 44
    move-result v1

    .line 45
    int-to-long v1, v1

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v0, v1, v2}, Lcom/google/firebase/perf/metrics/Trace;->putMetric(Ljava/lang/String;J)V

    .line 49
    .line 50
    .line 51
    :cond_2
    invoke-virtual {p2}, Lyq/a;->a()I

    .line 52
    move-result p1

    .line 53
    .line 54
    if-lez p1, :cond_3

    .line 55
    .line 56
    iget-object p1, p0, Lcom/kubi/monitor/firebase/b$a;->b:Lcom/google/firebase/perf/metrics/Trace;

    .line 57
    .line 58
    .line 59
    invoke-static {}, Lcom/kubi/monitor/firebase/b;->b()Ljava/lang/String;

    .line 60
    move-result-object v0

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2}, Lyq/a;->a()I

    .line 64
    move-result p2

    .line 65
    int-to-long v1, p2

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v0, v1, v2}, Lcom/google/firebase/perf/metrics/Trace;->putMetric(Ljava/lang/String;J)V

    .line 69
    .line 70
    :cond_3
    iget-object p1, p0, Lcom/kubi/monitor/firebase/b$a;->b:Lcom/google/firebase/perf/metrics/Trace;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Lcom/google/firebase/perf/metrics/Trace;->stop()V

    .line 74
    return-void
    .line 75
.end method
