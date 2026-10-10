.class public interface abstract Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;
.super Ljava/lang/Object;
.source "StartupDispatcher.kt"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/sdk/startup/StartupDispatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ISetupConfig"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0008g\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\rH&\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;",
        "",
        "addTask",
        "",
        "name",
        "",
        "task",
        "Lcom/kubi/sdk/startup/IStartupTask;",
        "stepType",
        "Lcom/kubi/sdk/startup/StartupStepType;",
        "threadType",
        "Lcom/kubi/sdk/startup/StartupThreadType;",
        "crossProcess",
        "",
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


# virtual methods
.method public abstract addTask(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Lcom/kubi/sdk/startup/StartupStepType;Lcom/kubi/sdk/startup/StartupThreadType;Z)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/sdk/startup/IStartupTask;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/kubi/sdk/startup/StartupStepType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/kubi/sdk/startup/StartupThreadType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
