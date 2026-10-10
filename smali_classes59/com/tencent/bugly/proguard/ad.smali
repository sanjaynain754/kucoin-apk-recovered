.class public Lcom/tencent/bugly/proguard/ad;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/ad$a;
    }
.end annotation


# static fields
.field public static c:Lcom/tencent/bugly/proguard/ad;

.field public static d:Ljava/lang/Object;


# instance fields
.field public a:Z

.field public b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/ad$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/bugly/proguard/ad;->d:Ljava/lang/Object;

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
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/ad;->a:Z

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    iput-object v0, p0, Lcom/tencent/bugly/proguard/ad;->b:Ljava/util/List;

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
.end method

.method public static b()Lcom/tencent/bugly/proguard/ad;
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/bugly/proguard/ad;->c:Lcom/tencent/bugly/proguard/ad;

    if-nez v0, :cond_1

    .line 2
    sget-object v0, Lcom/tencent/bugly/proguard/ad;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/ad;->c:Lcom/tencent/bugly/proguard/ad;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/tencent/bugly/proguard/ad;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/ad;-><init>()V

    sput-object v1, Lcom/tencent/bugly/proguard/ad;->c:Lcom/tencent/bugly/proguard/ad;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 5
    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_2
    sget-object v0, Lcom/tencent/bugly/proguard/ad;->c:Lcom/tencent/bugly/proguard/ad;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/tencent/bugly/proguard/ad$a;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ad;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public a(Z)V
    .locals 2

    .line 1
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/ad;->a:Z

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ad;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/proguard/ad$a;

    .line 3
    invoke-interface {v1, p1}, Lcom/tencent/bugly/proguard/ad$a;->onSubProcessConfigChanged(Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a()Z
    .locals 1

    .line 4
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/ad;->a:Z

    return v0
.end method

.method public b(Z)V
    .locals 1

    .line 7
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 8
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setSupportLoadBias(Ljava/lang/Boolean;)Z

    :cond_0
    return-void
.end method
