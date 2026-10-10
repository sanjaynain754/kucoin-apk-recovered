.class public Lcom/tencent/bugly/proguard/bc$a;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Landroid/os/MessageQueue$IdleHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/bugly/proguard/bc;->b(Ljava/lang/Object;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/tencent/rmonitor/base/meta/InspectUUID;

.field public final synthetic b:Lcom/tencent/bugly/proguard/bc;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/bc;Lcom/tencent/rmonitor/base/meta/InspectUUID;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/bc$a;->b:Lcom/tencent/bugly/proguard/bc;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/bugly/proguard/bc$a;->a:Lcom/tencent/rmonitor/base/meta/InspectUUID;

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
.method public queueIdle()Z
    .locals 6

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/bc$c;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/tencent/bugly/proguard/bc$a;->a:Lcom/tencent/rmonitor/base/meta/InspectUUID;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/tencent/bugly/proguard/bc$a;->b:Lcom/tencent/bugly/proguard/bc;

    .line 7
    .line 8
    .line 9
    invoke-static {v2}, Lcom/tencent/bugly/proguard/bc;->a(Lcom/tencent/bugly/proguard/bc;)Landroid/os/Handler;

    .line 10
    move-result-object v3

    .line 11
    .line 12
    iget-object v2, p0, Lcom/tencent/bugly/proguard/bc$a;->b:Lcom/tencent/bugly/proguard/bc;

    .line 13
    .line 14
    iget-object v4, v2, Lcom/tencent/bugly/proguard/bc;->b:Lcom/tencent/rmonitor/base/plugin/listener/IMemoryLeakListener;

    .line 15
    .line 16
    iget-object v5, v2, Lcom/tencent/bugly/proguard/bc;->c:Lcom/tencent/bugly/proguard/ec;

    .line 17
    const/4 v2, 0x0

    .line 18
    .line 19
    .line 20
    invoke-direct/range {v0 .. v5}, Lcom/tencent/bugly/proguard/bc$c;-><init>(Lcom/tencent/rmonitor/base/meta/InspectUUID;ILandroid/os/Handler;Lcom/tencent/rmonitor/base/plugin/listener/IMemoryLeakListener;Lcom/tencent/bugly/proguard/ec;)V

    .line 21
    .line 22
    iget-object v1, p0, Lcom/tencent/bugly/proguard/bc$a;->b:Lcom/tencent/bugly/proguard/bc;

    .line 23
    .line 24
    iget-object v1, v1, Lcom/tencent/bugly/proguard/bc;->a:Landroid/os/Handler;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 28
    const/4 v0, 0x0

    .line 29
    return v0
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
