.class public Lcom/tencent/bugly/proguard/o1$b;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/ge$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/o1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/tencent/bugly/proguard/o1;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/o1;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/o1$b;->a:Lcom/tencent/bugly/proguard/o1;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    .line 25
.end method


# virtual methods
.method public a(Landroid/os/IBinder;I)V
    .locals 2

    .line 8
    sget-object p2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "onReleaseWakeLock, token = "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BatteryMonitor"

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 9
    iget-object p2, p0, Lcom/tencent/bugly/proguard/o1$b;->a:Lcom/tencent/bugly/proguard/o1;

    .line 10
    iget-object p2, p2, Lcom/tencent/bugly/proguard/o1;->b:Lcom/tencent/bugly/proguard/hi;

    .line 11
    invoke-virtual {p2, p1}, Lcom/tencent/bugly/proguard/hi;->a(Landroid/os/IBinder;)Lcom/tencent/bugly/proguard/w0;

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/gi;Ljava/lang/String;Landroid/os/WorkSource;Ljava/lang/String;)V
    .locals 0
    .param p3    # Landroid/os/WorkSource;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    sget-object p2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string/jumbo p4, "onAcquireWakeLock, tag = "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p4, p1, Lcom/tencent/bugly/proguard/gi;->k:Ljava/lang/String;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ", scene = "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p4, p1, Lcom/tencent/bugly/proguard/w0;->e:Ljava/lang/String;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ", token = "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p4, p1, Lcom/tencent/bugly/proguard/gi;->l:Landroid/os/IBinder;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const-string p4, "BatteryMonitor"

    filled-new-array {p4, p3}, [Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 2
    iget-object p2, p0, Lcom/tencent/bugly/proguard/o1$b;->a:Lcom/tencent/bugly/proguard/o1;

    .line 3
    iget-object p2, p2, Lcom/tencent/bugly/proguard/o1;->b:Lcom/tencent/bugly/proguard/hi;

    .line 4
    invoke-virtual {p2, p1}, Lcom/tencent/bugly/proguard/d;->a(Lcom/tencent/bugly/proguard/w0;)V

    .line 5
    iget-object p1, p0, Lcom/tencent/bugly/proguard/o1$b;->a:Lcom/tencent/bugly/proguard/o1;

    .line 6
    iget-object p1, p1, Lcom/tencent/bugly/proguard/o1;->g:Lcom/tencent/bugly/proguard/g1;

    .line 7
    iget p2, p1, Lcom/tencent/bugly/proguard/g1;->g:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p1, Lcom/tencent/bugly/proguard/g1;->g:I

    return-void
.end method
