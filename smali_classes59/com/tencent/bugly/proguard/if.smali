.class public Lcom/tencent/bugly/proguard/if;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/if$b;
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/String; = "RMonitor_util_ReflectUtil"

.field public static final b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/tencent/bugly/proguard/if$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashMap;

    .line 3
    const/4 v1, 0x5

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 7
    .line 8
    sput-object v0, Lcom/tencent/bugly/proguard/if;->b:Ljava/util/HashMap;

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
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
.end method

.method public static a(Landroid/view/Choreographer;)Landroid/os/Handler;
    .locals 2

    .line 1
    const-string v0, "mHandler"

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lcom/tencent/bugly/proguard/if;->a(Ljava/lang/Object;Ljava/lang/String;Z)Ljava/lang/Object;

    move-result-object p0

    .line 2
    instance-of v0, p0, Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 3
    check-cast p0, Landroid/os/Handler;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static a(Landroid/os/Message;)Landroid/os/Message;
    .locals 2

    .line 4
    const-string/jumbo v0, "next"

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lcom/tencent/bugly/proguard/if;->a(Ljava/lang/Object;Ljava/lang/String;Z)Ljava/lang/Object;

    move-result-object p0

    .line 5
    instance-of v0, p0, Landroid/os/Message;

    if-eqz v0, :cond_0

    .line 6
    check-cast p0, Landroid/os/Message;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static a(Landroid/os/MessageQueue;)Landroid/os/Message;
    .locals 2

    .line 10
    const-string v0, "mMessages"

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lcom/tencent/bugly/proguard/if;->a(Ljava/lang/Object;Ljava/lang/String;Z)Ljava/lang/Object;

    move-result-object p0

    .line 11
    instance-of v0, p0, Landroid/os/Message;

    if-eqz v0, :cond_0

    .line 12
    check-cast p0, Landroid/os/Message;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static a(Landroid/os/Looper;)Landroid/util/Printer;
    .locals 2

    .line 7
    const-string v0, "mLogging"

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lcom/tencent/bugly/proguard/if;->a(Ljava/lang/Object;Ljava/lang/String;Z)Ljava/lang/Object;

    move-result-object p0

    .line 8
    instance-of v0, p0, Landroid/util/Printer;

    if-eqz v0, :cond_0

    .line 9
    check-cast p0, Landroid/util/Printer;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    .line 13
    invoke-static {p0, p1, v0}, Lcom/tencent/bugly/proguard/if;->a(Ljava/lang/Object;Ljava/lang/String;Z)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static a(Ljava/lang/Object;Ljava/lang/String;Z)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    move-object p1, v0

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    .line 14
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/if;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p1

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 15
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p1

    const/4 p2, 0x1

    .line 16
    invoke-virtual {p1, p2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    :goto_0
    if-eqz p1, :cond_2

    .line 17
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    .line 18
    :goto_1
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string p2, "RMonitor_util_ReflectUtil"

    const-string v1, "getInstancePrivateField"

    invoke-virtual {p1, p2, v1, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    return-object v0
.end method

.method public static a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/reflect/Field;"
        }
    .end annotation

    .line 19
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "%s#%s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 20
    sget-object v1, Lcom/tencent/bugly/proguard/if;->b:Ljava/util/HashMap;

    monitor-enter v1

    .line 21
    :try_start_0
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/bugly/proguard/if$b;

    if-nez v2, :cond_0

    .line 22
    new-instance v2, Lcom/tencent/bugly/proguard/if$b;

    .line 23
    invoke-direct {v2, p0, p1}, Lcom/tencent/bugly/proguard/if$b;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 24
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 25
    :cond_0
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/if$b;->a()Ljava/lang/reflect/Field;

    move-result-object p0

    return-object p0

    .line 27
    :goto_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static b(Landroid/os/Looper;)Landroid/os/MessageQueue;
    .locals 2

    .line 1
    .line 2
    const-string v0, "mQueue"

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0, v1}, Lcom/tencent/bugly/proguard/if;->a(Ljava/lang/Object;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 7
    move-result-object p0

    .line 8
    .line 9
    instance-of v0, p0, Landroid/os/MessageQueue;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    check-cast p0, Landroid/os/MessageQueue;

    .line 14
    return-object p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return-object p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
