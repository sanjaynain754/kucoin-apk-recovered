.class public Lcom/facebook/imagepipeline/producers/JobScheduler$e;
.super Ljava/lang/Object;
.source "JobScheduler.java"


# annotations
.annotation build Landroidx/annotation/VisibleForTesting;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/imagepipeline/producers/JobScheduler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# static fields
.field public static a:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method public static a()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/imagepipeline/producers/JobScheduler$e;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    sput-object v0, Lcom/facebook/imagepipeline/producers/JobScheduler$e;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lcom/facebook/imagepipeline/producers/JobScheduler$e;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method
