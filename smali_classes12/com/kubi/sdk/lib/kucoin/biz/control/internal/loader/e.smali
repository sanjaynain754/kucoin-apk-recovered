.class public final Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/e;
.super Ljava/lang/Object;
.source "StateMachine.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0003R\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0011R\u001a\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/e;",
        "",
        "<init>",
        "()V",
        "Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;",
        "b",
        "()Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;",
        "nextState",
        "",
        "e",
        "(Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;)V",
        "Lgz/e;",
        "listener",
        "a",
        "(Lgz/e;)V",
        "d",
        "c",
        "Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;",
        "state",
        "Ljava/util/concurrent/CopyOnWriteArrayList;",
        "Ljava/util/concurrent/CopyOnWriteArrayList;",
        "listeners",
        "biz-control-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nStateMachine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateMachine.kt\ncom/kubi/sdk/lib/kucoin/biz/control/internal/loader/StateMachine\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n1855#2,2:53\n*S KotlinDebug\n*F\n+ 1 StateMachine.kt\ncom/kubi/sdk/lib/kucoin/biz/control/internal/loader/StateMachine\n*L\n46#1:53,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static volatile b:Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lgz/e;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/e;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/e;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/e;->a:Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/e;

    .line 8
    .line 9
    sget-object v0, Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;->INIT:Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;

    .line 10
    .line 11
    sput-object v0, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/e;->b:Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;

    .line 12
    .line 13
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 17
    .line 18
    sput-object v0, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/e;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

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


# virtual methods
.method public final a(Lgz/e;)V
    .locals 1
    .param p1    # Lgz/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "listener"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/e;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    return-void
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public final b()Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/e;->b:Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;

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

.method public final c()V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/e;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    move-result v1

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    check-cast v1, Lgz/e;

    .line 19
    .line 20
    sget-object v2, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/e;->b:Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;

    .line 21
    .line 22
    .line 23
    invoke-interface {v1, v2}, Lgz/e;->r(Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;)V

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final d(Lgz/e;)V
    .locals 1
    .param p1    # Lgz/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "listener"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/e;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 11
    return-void
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public final e(Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;)V
    .locals 2
    .param p1    # Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "nextState"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    const-string v1, "currentStatus "

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    sget-object v1, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/e;->b:Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v1, " updateState: "

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    const-string v1, "BizControl::StateMachine"

    .line 35
    .line 36
    .line 37
    invoke-static {v1, v0}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    sput-object p1, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/e;->b:Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/e;->c()V

    .line 43
    return-void
    .line 44
    .line 45
.end method
