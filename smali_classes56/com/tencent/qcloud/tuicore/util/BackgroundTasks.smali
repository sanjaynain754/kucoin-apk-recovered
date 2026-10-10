.class public Lcom/tencent/qcloud/tuicore/util/BackgroundTasks;
.super Ljava/lang/Object;
.source "BackgroundTasks.java"


# static fields
.field private static final instance:Lcom/tencent/qcloud/tuicore/util/BackgroundTasks;


# instance fields
.field private final handler:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/qcloud/tuicore/util/BackgroundTasks;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/qcloud/tuicore/util/BackgroundTasks;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/qcloud/tuicore/util/BackgroundTasks;->instance:Lcom/tencent/qcloud/tuicore/util/BackgroundTasks;

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
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Landroid/os/Handler;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 13
    .line 14
    iput-object v0, p0, Lcom/tencent/qcloud/tuicore/util/BackgroundTasks;->handler:Landroid/os/Handler;

    .line 15
    return-void
    .line 16
.end method

.method public static getInstance()Lcom/tencent/qcloud/tuicore/util/BackgroundTasks;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/qcloud/tuicore/util/BackgroundTasks;->instance:Lcom/tencent/qcloud/tuicore/util/BackgroundTasks;

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
.end method


# virtual methods
.method public postDelayed(Ljava/lang/Runnable;J)Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/util/BackgroundTasks;->handler:Landroid/os/Handler;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 6
    move-result p1

    .line 7
    return p1
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
.end method

.method public runOnUiThread(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/util/BackgroundTasks;->handler:Landroid/os/Handler;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 6
    return-void
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
.end method
