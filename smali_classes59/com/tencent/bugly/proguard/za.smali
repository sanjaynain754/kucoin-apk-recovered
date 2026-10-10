.class public Lcom/tencent/bugly/proguard/za;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/w9;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/tencent/rmonitor/base/plugin/listener/IBaseListener;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/tencent/bugly/proguard/w9;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/tencent/bugly/proguard/za;->a:Ljava/lang/Class;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/tencent/bugly/proguard/za;->b:Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;

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
.method public a(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/za;->a:Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/tencent/bugly/proguard/za;->b:Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/tencent/bugly/proguard/za;->a:Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    check-cast p1, Lcom/tencent/rmonitor/base/plugin/listener/IBaseListener;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;->addListener(Lcom/tencent/rmonitor/base/plugin/listener/IBaseListener;)V

    .line 22
    const/4 p1, 0x1

    .line 23
    return p1

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    return p1
.end method

.method public b(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/za;->a:Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/tencent/bugly/proguard/za;->b:Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/tencent/bugly/proguard/za;->a:Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    check-cast p1, Lcom/tencent/rmonitor/base/plugin/listener/IBaseListener;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;->removeListener(Lcom/tencent/rmonitor/base/plugin/listener/IBaseListener;)V

    .line 22
    const/4 p1, 0x1

    .line 23
    return p1

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    return p1
.end method
