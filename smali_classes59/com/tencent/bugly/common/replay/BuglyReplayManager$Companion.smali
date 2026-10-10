.class public final Lcom/tencent/bugly/common/replay/BuglyReplayManager$Companion;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/common/replay/BuglyReplayManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/tencent/bugly/common/replay/BuglyReplayManager$Companion;",
        "",
        "()V",
        "INSTANCE",
        "Lcom/tencent/bugly/common/replay/BuglyReplayManager;",
        "TAG",
        "",
        "getInstance",
        "options",
        "Lcom/tencent/bugly/common/replay/BuglyReplayOptions;",
        "bugly-pro_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/bugly/common/replay/BuglyReplayManager$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getInstance()Lcom/tencent/bugly/common/replay/BuglyReplayManager;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 4
    invoke-static {}, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->access$getINSTANCE$cp()Lcom/tencent/bugly/common/replay/BuglyReplayManager;

    move-result-object v0

    return-object v0
.end method

.method public final getInstance(Lcom/tencent/bugly/common/replay/BuglyReplayOptions;)Lcom/tencent/bugly/common/replay/BuglyReplayManager;
    .locals 2
    .param p1    # Lcom/tencent/bugly/common/replay/BuglyReplayOptions;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string/jumbo v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {}, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->access$getINSTANCE$cp()Lcom/tencent/bugly/common/replay/BuglyReplayManager;

    move-result-object v0

    if-nez v0, :cond_1

    monitor-enter p0

    .line 2
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->access$getINSTANCE$cp()Lcom/tencent/bugly/common/replay/BuglyReplayManager;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/tencent/bugly/common/replay/BuglyReplayManager;-><init>(Lcom/tencent/bugly/common/replay/BuglyReplayOptions;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->access$setINSTANCE$cp(Lcom/tencent/bugly/common/replay/BuglyReplayManager;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 3
    :cond_0
    :goto_0
    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0

    throw p1

    :cond_1
    return-object v0
.end method
