.class public final Lcom/kubi/sdk/aspect/b;
.super Ljava/lang/Object;
.source "ConnectionTrackerAspect.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/kubi/sdk/aspect/ConnectionTrackerAspect;",
        "",
        "<init>",
        "()V",
        "bindService",
        "point",
        "Lorg/aspectj/lang/ProceedingJoinPoint;",
        "LBase_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nConnectionTrackerAspect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionTrackerAspect.kt\ncom/kubi/sdk/aspect/ConnectionTrackerAspect\n+ 2 AppBaseIssue.kt\ncom/kubi/sdk/exception/AppBaseIssueKt\n*L\n1#1,28:1\n45#2,2:29\n*S KotlinDebug\n*F\n+ 1 ConnectionTrackerAspect.kt\ncom/kubi/sdk/aspect/ConnectionTrackerAspect\n*L\n24#1:29,2\n*E\n"
    }
.end annotation


# static fields
.field public static synthetic a:Ljava/lang/Throwable;

.field public static synthetic b:Lcom/kubi/sdk/aspect/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Lcom/kubi/sdk/aspect/b;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    return-void

    .line 5
    :catchall_0
    move-exception v0

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/sdk/aspect/b;->a:Ljava/lang/Throwable;

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
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
.end method

.method public static synthetic a()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/sdk/aspect/b;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/sdk/aspect/b;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/sdk/aspect/b;->b:Lcom/kubi/sdk/aspect/b;

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public static b()Lcom/kubi/sdk/aspect/b;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/aspect/b;->b:Lcom/kubi/sdk/aspect/b;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-object v0

    .line 6
    .line 7
    :cond_0
    new-instance v0, Lorg/aspectj/lang/NoAspectBoundException;

    .line 8
    .line 9
    const-string v1, "com.kubi.sdk.aspect.ConnectionTrackerAspect"

    .line 10
    .line 11
    sget-object v2, Lcom/kubi/sdk/aspect/b;->a:Ljava/lang/Throwable;

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Lorg/aspectj/lang/NoAspectBoundException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 15
    throw v0
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
.end method


# virtual methods
.method public final c(Lorg/aspectj/lang/b;)Ljava/lang/Object;
    .locals 7
    .param p1    # Lorg/aspectj/lang/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "point"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-interface {p1}, Lorg/aspectj/lang/a;->b()[Ljava/lang/Object;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-interface {p1, v0}, Lorg/aspectj/lang/b;->d([Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    return-object p1

    .line 15
    :catch_0
    move-exception v0

    .line 16
    move-object p1, v0

    .line 17
    move-object v1, p1

    .line 18
    .line 19
    new-instance v0, Lcom/kubi/sdk/exception/AppBaseException;

    .line 20
    .line 21
    const/16 v5, 0x8

    .line 22
    const/4 v6, 0x0

    .line 23
    .line 24
    const-string v2, "ConnectionTrackerAspect"

    .line 25
    const/4 v3, 0x0

    .line 26
    const/4 v4, 0x0

    .line 27
    .line 28
    .line 29
    invoke-direct/range {v0 .. v6}, Lcom/kubi/sdk/exception/AppBaseException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    const/4 p1, 0x2

    .line 31
    const/4 v1, 0x0

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1, p1, v1}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 35
    .line 36
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 37
    return-object p1
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method
