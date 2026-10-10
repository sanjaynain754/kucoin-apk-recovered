.class public final Lcom/tencent/bugly/proguard/ni$e;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/ni$d;
.implements Lcom/tencent/bugly/proguard/ni$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/ni;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# static fields
.field public static final g:Ljava/lang/String; = "Matrix.WarmUpInvoker"


# instance fields
.field public volatile a:Landroid/os/Messenger;

.field public volatile b:Landroid/os/Messenger;

.field public final c:[Landroid/os/Bundle;

.field public final d:[Landroid/os/HandlerThread;

.field public e:Landroid/content/ServiceConnection;

.field public final f:[Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    .line 7
    filled-new-array {v0}, [Landroid/os/Bundle;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    iput-object v1, p0, Lcom/tencent/bugly/proguard/ni$e;->c:[Landroid/os/Bundle;

    .line 11
    .line 12
    .line 13
    filled-new-array {v0}, [Landroid/os/HandlerThread;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    iput-object v0, p0, Lcom/tencent/bugly/proguard/ni$e;->d:[Landroid/os/HandlerThread;

    .line 17
    .line 18
    new-instance v0, Lcom/tencent/bugly/proguard/ni$e$a;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/ni$e$a;-><init>(Lcom/tencent/bugly/proguard/ni$e;)V

    .line 22
    .line 23
    iput-object v0, p0, Lcom/tencent/bugly/proguard/ni$e;->e:Landroid/content/ServiceConnection;

    .line 24
    const/4 v0, 0x1

    .line 25
    .line 26
    new-array v0, v0, [Z

    .line 27
    const/4 v1, 0x0

    .line 28
    .line 29
    aput-boolean v1, v0, v1

    .line 30
    .line 31
    iput-object v0, p0, Lcom/tencent/bugly/proguard/ni$e;->f:[Z

    .line 32
    return-void
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

.method public static synthetic a(Lcom/tencent/bugly/proguard/ni$e;)[Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/ni$e;->f:[Z

    return-object p0
.end method


# virtual methods
.method public a(ILandroid/os/Bundle;)Landroid/os/Bundle;
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 42
    :try_start_0
    iget-object v2, p0, Lcom/tencent/bugly/proguard/ni$e;->b:Landroid/os/Messenger;

    if-eqz v2, :cond_0

    .line 43
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 44
    const-string v4, "invoke-args"

    invoke-virtual {v3, v4, p2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 45
    const-string p2, "invoke-resp"

    iget-object v4, p0, Lcom/tencent/bugly/proguard/ni$e;->a:Landroid/os/Messenger;

    invoke-virtual {v4}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    move-result-object v4

    invoke-virtual {v3, p2, v4}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 46
    invoke-static {v1, p1, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V

    .line 47
    iget-object p1, p0, Lcom/tencent/bugly/proguard/ni$e;->c:[Landroid/os/Bundle;

    monitor-enter p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    :try_start_1
    iget-object p2, p0, Lcom/tencent/bugly/proguard/ni$e;->c:[Landroid/os/Bundle;

    aput-object v1, p2, v0

    const-wide/32 v2, 0x493e0

    .line 49
    invoke-virtual {p2, v2, v3}, Ljava/lang/Object;->wait(J)V

    .line 50
    iget-object p2, p0, Lcom/tencent/bugly/proguard/ni$e;->c:[Landroid/os/Bundle;

    aget-object p2, p2, v0

    monitor-exit p1

    return-object p2

    :catchall_0
    move-exception p2

    .line 51
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p2
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 52
    :goto_0
    new-array p2, v0, [Ljava/lang/Object;

    const-string v0, "Matrix.WarmUpInvoker"

    const-string v2, ""

    invoke-static {v0, p1, v2, p2}, Lcom/tencent/bugly/proguard/pb;->a(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-object v1
.end method

.method public a(Landroid/content/Context;)V
    .locals 4

    const/4 v0, 0x0

    .line 29
    :try_start_0
    iget-object v1, p0, Lcom/tencent/bugly/proguard/ni$e;->e:Landroid/content/ServiceConnection;

    invoke-virtual {p1, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 30
    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "Matrix.WarmUpInvoker"

    const-string v3, ""

    invoke-static {v2, p1, v3, v1}, Lcom/tencent/bugly/proguard/pb;->a(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Matrix.WarmUpInvoker"

    const-string v2, "Start disconnecting to remote. (%s)"

    invoke-static {v1, v2, p1}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    iget-object p1, p0, Lcom/tencent/bugly/proguard/ni$e;->d:[Landroid/os/HandlerThread;

    monitor-enter p1

    .line 33
    :try_start_1
    iget-object v1, p0, Lcom/tencent/bugly/proguard/ni$e;->d:[Landroid/os/HandlerThread;

    aget-object v1, v1, v0

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 34
    invoke-virtual {v1}, Landroid/os/HandlerThread;->quitSafely()Z

    .line 35
    iget-object v1, p0, Lcom/tencent/bugly/proguard/ni$e;->d:[Landroid/os/HandlerThread;

    aput-object v2, v1, v0

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_2

    .line 36
    :cond_0
    :goto_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 37
    iget-object v1, p0, Lcom/tencent/bugly/proguard/ni$e;->c:[Landroid/os/Bundle;

    monitor-enter v1

    .line 38
    :try_start_2
    iget-object p1, p0, Lcom/tencent/bugly/proguard/ni$e;->c:[Landroid/os/Bundle;

    aput-object v2, p1, v0

    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 40
    monitor-exit v1

    return-void

    :catchall_2
    move-exception p1

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    throw p1

    .line 41
    :goto_2
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method

.method public a()Z
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ni$e;->f:[Z

    const/4 v1, 0x0

    aget-boolean v0, v0, v1

    return v0
.end method

.method public a(Landroid/content/Context;Landroid/os/Bundle;)Z
    .locals 8

    const-string/jumbo v0, "warm-up-remote-invoker-"

    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/ni$e;->b()V

    .line 4
    iget-object v1, p0, Lcom/tencent/bugly/proguard/ni$e;->f:[Z

    const/4 v2, 0x0

    aget-boolean v1, v1, v2

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    return v3

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v4, "Matrix.WarmUpInvoker"

    const-string v5, "Start connecting to remote. (%s)"

    invoke-static {v4, v5, v1}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6
    iget-object v1, p0, Lcom/tencent/bugly/proguard/ni$e;->d:[Landroid/os/HandlerThread;

    monitor-enter v1

    .line 7
    :try_start_0
    iget-object v4, p0, Lcom/tencent/bugly/proguard/ni$e;->d:[Landroid/os/HandlerThread;

    aget-object v4, v4, v2

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    .line 8
    invoke-virtual {v4}, Landroid/os/HandlerThread;->quitSafely()Z

    .line 9
    iget-object v4, p0, Lcom/tencent/bugly/proguard/ni$e;->d:[Landroid/os/HandlerThread;

    aput-object v5, v4, v2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    .line 10
    :cond_1
    :goto_0
    iget-object v4, p0, Lcom/tencent/bugly/proguard/ni$e;->d:[Landroid/os/HandlerThread;

    new-instance v6, Landroid/os/HandlerThread;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    aput-object v6, v4, v2

    .line 12
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ni$e;->d:[Landroid/os/HandlerThread;

    aget-object v0, v0, v2

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 13
    new-instance v0, Landroid/os/Messenger;

    new-instance v4, Lcom/tencent/bugly/proguard/ni$e$b;

    iget-object v6, p0, Lcom/tencent/bugly/proguard/ni$e;->d:[Landroid/os/HandlerThread;

    aget-object v6, v6, v2

    invoke-virtual {v6}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v6

    invoke-direct {v4, p0, v6}, Lcom/tencent/bugly/proguard/ni$e$b;-><init>(Lcom/tencent/bugly/proguard/ni$e;Landroid/os/Looper;)V

    invoke-direct {v0, v4}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/ni$e;->a:Landroid/os/Messenger;

    .line 14
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 16
    new-instance v1, Landroid/content/ComponentName;

    const-class v4, Lcom/tencent/bugly/proguard/ni;

    invoke-direct {v1, p1, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 17
    const-string v1, "enable-logger"

    invoke-virtual {p2, v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    const-string v4, "enable-logger"

    invoke-virtual {v0, v4, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 18
    const-string/jumbo v1, "path-of-xlog-so"

    invoke-virtual {p2, v1, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string/jumbo v1, "path-of-xlog-so"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 19
    iget-object p2, p0, Lcom/tencent/bugly/proguard/ni$e;->e:Landroid/content/ServiceConnection;

    invoke-virtual {p1, v0, p2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 20
    :try_start_1
    iget-object p2, p0, Lcom/tencent/bugly/proguard/ni$e;->f:[Z

    monitor-enter p2
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 21
    :try_start_2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ni$e;->f:[Z

    aget-boolean v1, v0, v2

    if-nez v1, :cond_2

    const-wide/32 v3, 0xea60

    .line 22
    invoke-virtual {v0, v3, v4}, Ljava/lang/Object;->wait(J)V

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_2

    .line 23
    :cond_2
    :goto_1
    monitor-exit p2

    goto :goto_3

    :goto_2
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    throw v0
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    move-exception p2

    .line 24
    new-array v0, v2, [Ljava/lang/Object;

    const-string v1, "Matrix.WarmUpInvoker"

    const-string v3, ""

    invoke-static {v1, p2, v3, v0}, Lcom/tencent/bugly/proguard/pb;->a(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 25
    :goto_3
    iget-object p2, p0, Lcom/tencent/bugly/proguard/ni$e;->f:[Z

    aget-boolean p2, p2, v2

    if-nez p2, :cond_3

    .line 26
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/ni$e;->a(Landroid/content/Context;)V

    .line 27
    :cond_3
    iget-object p1, p0, Lcom/tencent/bugly/proguard/ni$e;->f:[Z

    aget-boolean p1, p1, v2

    return p1

    .line 28
    :goto_4
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method public final b()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    return-void

    .line 12
    .line 13
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 14
    .line 15
    const-string v1, "Should not call this from main thread!"

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 19
    throw v0
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
