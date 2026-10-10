.class public Lcom/tencent/bugly/proguard/q0;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/q0$a;
    }
.end annotation


# instance fields
.field public final a:Lcom/tencent/bugly/proguard/n0;

.field public b:Z


# direct methods
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
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/q0;->b:Z

    .line 7
    .line 8
    new-instance v0, Lcom/tencent/bugly/proguard/n0;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/n0;-><init>()V

    .line 12
    .line 13
    iput-object v0, p0, Lcom/tencent/bugly/proguard/q0;->a:Lcom/tencent/bugly/proguard/n0;

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
.end method

.method public static b()Lcom/tencent/bugly/proguard/q0;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/q0$a;->a()Lcom/tencent/bugly/proguard/q0;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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


# virtual methods
.method public a()V
    .locals 2

    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/q0;->b:Z

    if-nez v0, :cond_1

    .line 5
    sget-object v0, Lcom/tencent/rmonitor/base/config/ConfigProxy;->INSTANCE:Lcom/tencent/rmonitor/base/config/ConfigProxy;

    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/config/ConfigProxy;->getConfig()Lcom/tencent/rmonitor/base/config/a;

    move-result-object v0

    const-string v1, "atta"

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/config/a;->b(Ljava/lang/String;)Lcom/tencent/bugly/proguard/xe;

    move-result-object v0

    .line 6
    instance-of v1, v0, Lcom/tencent/bugly/proguard/n0;

    if-eqz v1, :cond_1

    .line 7
    check-cast v0, Lcom/tencent/bugly/proguard/n0;

    .line 8
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/q0;->a(Lcom/tencent/bugly/proguard/n0;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/n0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/q0;->a:Lcom/tencent/bugly/proguard/n0;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/n0;->a(Lcom/tencent/bugly/proguard/n0;)V

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/q0;->b:Z

    return-void
.end method

.method public a(Ljava/lang/String;)Z
    .locals 4

    .line 9
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/q0;->a()V

    .line 10
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    iget-object v2, p0, Lcom/tencent/bugly/proguard/q0;->a:Lcom/tencent/bugly/proguard/n0;

    invoke-virtual {v2, p1}, Lcom/tencent/bugly/proguard/n0;->a(Ljava/lang/String;)F

    move-result p1

    float-to-double v2, p1

    cmpg-double p1, v0, v2

    if-gez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
