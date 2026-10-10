.class public Lcom/tencent/bugly/proguard/p0;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/e8;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/p0$b;
    }
.end annotation


# instance fields
.field public final a:Lcom/tencent/bugly/proguard/e8;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    :try_start_0
    const-class v0, Lcom/tencent/rmonitor/sla/a;

    .line 4
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/bugly/proguard/e8;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    iput-object v0, p0, Lcom/tencent/bugly/proguard/p0;->a:Lcom/tencent/bugly/proguard/e8;

    return-void

    :catchall_0
    move-exception v0

    const/4 v1, 0x0

    .line 6
    :try_start_1
    sget-object v2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v3, ""

    const-string v4, "init atta report fail"

    invoke-virtual {v2, v3, v4, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 7
    iput-object v1, p0, Lcom/tencent/bugly/proguard/p0;->a:Lcom/tencent/bugly/proguard/e8;

    return-void

    :catchall_1
    move-exception v0

    iput-object v1, p0, Lcom/tencent/bugly/proguard/p0;->a:Lcom/tencent/bugly/proguard/e8;

    .line 8
    throw v0
.end method

.method public synthetic constructor <init>(Lcom/tencent/bugly/proguard/p0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/p0;-><init>()V

    return-void
.end method

.method public static a()Lcom/tencent/bugly/proguard/e8;
    .locals 1

    .line 1
    invoke-static {}, Lcom/tencent/bugly/proguard/p0$b;->a()Lcom/tencent/bugly/proguard/p0;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;IIJ)V
    .locals 6

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/p0;->a:Lcom/tencent/bugly/proguard/e8;

    if-eqz v0, :cond_0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-wide v4, p4

    .line 3
    invoke-interface/range {v0 .. v5}, Lcom/tencent/bugly/proguard/e8;->a(Ljava/lang/String;IIJ)V

    :cond_0
    return-void
.end method
