.class public Lcom/tencent/bugly/proguard/w1$a;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/bugly/proguard/w1;->a(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/tencent/bugly/proguard/w1;

.field public final synthetic c:Lcom/tencent/bugly/proguard/w1;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/w1;Lcom/tencent/bugly/proguard/w1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/w1$a;->c:Lcom/tencent/bugly/proguard/w1;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/bugly/proguard/w1$a;->b:Lcom/tencent/bugly/proguard/w1;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/proguard/w1;->a()Lcom/tencent/bugly/proguard/w1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    const-string v1, "Register broadcast receiver of Bugly."

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    new-array v2, v2, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1, v2}, Lcom/tencent/bugly/proguard/x4;->c(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 17
    .line 18
    iget-object v0, p0, Lcom/tencent/bugly/proguard/w1$a;->b:Lcom/tencent/bugly/proguard/w1;

    .line 19
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 20
    .line 21
    :try_start_1
    iget-object v1, p0, Lcom/tencent/bugly/proguard/w1$a;->c:Lcom/tencent/bugly/proguard/w1;

    .line 22
    .line 23
    iget-object v2, v1, Lcom/tencent/bugly/proguard/w1;->b:Landroid/content/Context;

    .line 24
    .line 25
    sget-object v3, Lcom/tencent/bugly/proguard/w1;->e:Lcom/tencent/bugly/proguard/w1;

    .line 26
    .line 27
    iget-object v1, v1, Lcom/tencent/bugly/proguard/w1;->a:Landroid/content/IntentFilter;

    .line 28
    .line 29
    const-string v4, "com.tencent.bugly.BuglyBroadcastReceiver.permission"

    .line 30
    const/4 v5, 0x0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v3, v1, v4, v5}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 34
    monitor-exit v0

    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception v1

    .line 37
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 39
    :catchall_1
    move-exception v0

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 43
    return-void
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
