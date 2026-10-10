.class public Lcom/tencent/bugly/proguard/l;
.super Lcom/tencent/bugly/proguard/v0;
.source "BUGLY"


# instance fields
.field public final d:Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/bc;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/tencent/bugly/proguard/v0;-><init>(Lcom/tencent/bugly/proguard/bc;)V

    .line 4
    .line 5
    new-instance p1, Lcom/tencent/bugly/proguard/l$a;

    .line 6
    .line 7
    .line 8
    invoke-direct {p1, p0}, Lcom/tencent/bugly/proguard/l$a;-><init>(Lcom/tencent/bugly/proguard/l;)V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/tencent/bugly/proguard/l;->d:Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;

    .line 11
    return-void
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
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/common/utils/AndroidVersion;->isOverIceScreamSandwich()Z

    .line 4
    move-result v0

    .line 5
    return v0
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

.method public b()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/l;->d:Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->register(Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;)V

    .line 6
    const/4 v0, 0x1

    .line 7
    return v0
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

.method public c()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/l;->d:Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->unRegister(Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;)V

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
.end method
