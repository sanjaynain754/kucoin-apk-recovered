.class public Lcom/tencent/bugly/proguard/o1$c;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/cb$b;


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
    iput-object p1, p0, Lcom/tencent/bugly/proguard/o1$c;->a:Lcom/tencent/bugly/proguard/o1;

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
.method public a(ILandroid/app/PendingIntent;)V
    .locals 3

    .line 8
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "onRemoveLocationUpdates, hashCode = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", pendingIntent = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "BatteryMonitor"

    filled-new-array {v2, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 9
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o1$c;->a:Lcom/tencent/bugly/proguard/o1;

    .line 10
    iget-object v0, v0, Lcom/tencent/bugly/proguard/o1;->c:Lcom/tencent/bugly/proguard/db;

    .line 11
    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/db;->a(ILandroid/app/PendingIntent;)Lcom/tencent/bugly/proguard/w0;

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/bb;JF)V
    .locals 0

    .line 1
    sget-object p2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string/jumbo p4, "onRequestLocationUpdates\uff0chashCode = "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p4, p1, Lcom/tencent/bugly/proguard/bb;->k:I

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p4, ", pendingIntent = "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p4, p1, Lcom/tencent/bugly/proguard/bb;->j:Landroid/app/PendingIntent;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const-string p4, "BatteryMonitor"

    filled-new-array {p4, p3}, [Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 2
    iget-object p2, p0, Lcom/tencent/bugly/proguard/o1$c;->a:Lcom/tencent/bugly/proguard/o1;

    .line 3
    iget-object p2, p2, Lcom/tencent/bugly/proguard/o1;->c:Lcom/tencent/bugly/proguard/db;

    .line 4
    invoke-virtual {p2, p1}, Lcom/tencent/bugly/proguard/d;->a(Lcom/tencent/bugly/proguard/w0;)V

    .line 5
    iget-object p1, p0, Lcom/tencent/bugly/proguard/o1$c;->a:Lcom/tencent/bugly/proguard/o1;

    .line 6
    iget-object p1, p1, Lcom/tencent/bugly/proguard/o1;->g:Lcom/tencent/bugly/proguard/g1;

    .line 7
    iget p2, p1, Lcom/tencent/bugly/proguard/g1;->f:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p1, Lcom/tencent/bugly/proguard/g1;->f:I

    return-void
.end method
