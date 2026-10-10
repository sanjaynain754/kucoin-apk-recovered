.class public final Lcom/kubi/sdk/startup/StartupAttachLifecycle;
.super Ljava/lang/Object;
.source "StartupAttachLifecycle.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/sdk/startup/StartupAttachLifecycle$IAttachLifecycleCallbacks;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0008H\u0002\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0005H\u0000\u00a2\u0006\u0002\u0008\u0010J\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0005H\u0000\u00a2\u0006\u0002\u0008\u0012R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\u0008\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/kubi/sdk/startup/StartupAttachLifecycle;",
        "",
        "()V",
        "attachLifecycleCallbacks",
        "Ljava/util/ArrayList;",
        "Lcom/kubi/sdk/startup/StartupAttachLifecycle$IAttachLifecycleCallbacks;",
        "Lkotlin/collections/ArrayList;",
        "collectAttachLifecycleCallbacks",
        "",
        "()[Lcom/kubi/sdk/startup/StartupAttachLifecycle$IAttachLifecycleCallbacks;",
        "dispatchActivityAttach",
        "",
        "activity",
        "Landroid/app/Activity;",
        "registerAttachLifecycleCallbacks",
        "callback",
        "registerAttachLifecycleCallbacks$Startup_release",
        "unregisterAttachLifecycleCallbacks",
        "unregisterAttachLifecycleCallbacks$Startup_release",
        "IAttachLifecycleCallbacks",
        "Startup_release"
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
        "SMAP\nStartupAttachLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartupAttachLifecycle.kt\ncom/kubi/sdk/startup/StartupAttachLifecycle\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n13579#2,2:47\n37#3,2:49\n1#4:51\n*S KotlinDebug\n*F\n+ 1 StartupAttachLifecycle.kt\ncom/kubi/sdk/startup/StartupAttachLifecycle\n*L\n15#1:47,2\n23#1:49,2\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/kubi/sdk/startup/StartupAttachLifecycle;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final attachLifecycleCallbacks:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/kubi/sdk/startup/StartupAttachLifecycle$IAttachLifecycleCallbacks;",
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
    new-instance v0, Lcom/kubi/sdk/startup/StartupAttachLifecycle;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/sdk/startup/StartupAttachLifecycle;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/sdk/startup/StartupAttachLifecycle;->INSTANCE:Lcom/kubi/sdk/startup/StartupAttachLifecycle;

    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    sput-object v0, Lcom/kubi/sdk/startup/StartupAttachLifecycle;->attachLifecycleCallbacks:Ljava/util/ArrayList;

    .line 15
    return-void
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

.method private constructor <init>()V
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

.method private final collectAttachLifecycleCallbacks()[Lcom/kubi/sdk/startup/StartupAttachLifecycle$IAttachLifecycleCallbacks;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/startup/StartupAttachLifecycle;->attachLifecycleCallbacks:Ljava/util/ArrayList;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 7
    move-result v1

    .line 8
    .line 9
    if-lez v1, :cond_0

    .line 10
    const/4 v1, 0x0

    .line 11
    .line 12
    new-array v1, v1, [Lcom/kubi/sdk/startup/StartupAttachLifecycle$IAttachLifecycleCallbacks;

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    check-cast v1, [Lcom/kubi/sdk/startup/StartupAttachLifecycle$IAttachLifecycleCallbacks;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    monitor-exit v0

    .line 20
    return-object v1

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    goto :goto_0

    .line 23
    .line 24
    :cond_0
    :try_start_1
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    monitor-exit v0

    .line 26
    const/4 v0, 0x0

    .line 27
    return-object v0

    .line 28
    :goto_0
    monitor-exit v0

    .line 29
    throw v1
    .line 30
.end method


# virtual methods
.method public final dispatchActivityAttach(Landroid/app/Activity;)V
    .locals 4
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "activity"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/kubi/sdk/startup/StartupAttachLifecycle;->collectAttachLifecycleCallbacks()[Lcom/kubi/sdk/startup/StartupAttachLifecycle$IAttachLifecycleCallbacks;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    array-length v1, v0

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    :goto_0
    if-ge v2, v1, :cond_0

    .line 16
    .line 17
    aget-object v3, v0, v2

    .line 18
    .line 19
    .line 20
    invoke-interface {v3, p1}, Lcom/kubi/sdk/startup/StartupAttachLifecycle$IAttachLifecycleCallbacks;->onActivityAttach(Landroid/app/Activity;)V

    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-void
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

.method public final registerAttachLifecycleCallbacks$Startup_release(Lcom/kubi/sdk/startup/StartupAttachLifecycle$IAttachLifecycleCallbacks;)V
    .locals 1
    .param p1    # Lcom/kubi/sdk/startup/StartupAttachLifecycle$IAttachLifecycleCallbacks;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "callback"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/sdk/startup/StartupAttachLifecycle;->attachLifecycleCallbacks:Ljava/util/ArrayList;

    .line 8
    monitor-enter v0

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    monitor-exit v0

    .line 16
    throw p1
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

.method public final unregisterAttachLifecycleCallbacks$Startup_release(Lcom/kubi/sdk/startup/StartupAttachLifecycle$IAttachLifecycleCallbacks;)V
    .locals 1
    .param p1    # Lcom/kubi/sdk/startup/StartupAttachLifecycle$IAttachLifecycleCallbacks;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "callback"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/sdk/startup/StartupAttachLifecycle;->attachLifecycleCallbacks:Ljava/util/ArrayList;

    .line 8
    monitor-enter v0

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    monitor-exit v0

    .line 16
    throw p1
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
