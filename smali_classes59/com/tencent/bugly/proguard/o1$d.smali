.class public Lcom/tencent/bugly/proguard/o1$d;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/o$d;


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
    iput-object p1, p0, Lcom/tencent/bugly/proguard/o1$d;->a:Lcom/tencent/bugly/proguard/o1;

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
.method public a(Landroid/app/PendingIntent;Landroid/app/AlarmManager$OnAlarmListener;)V
    .locals 3

    .line 11
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "onAlarmRemove, operation = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "BatteryMonitor"

    filled-new-array {v2, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 12
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o1$d;->a:Lcom/tencent/bugly/proguard/o1;

    .line 13
    iget-object v0, v0, Lcom/tencent/bugly/proguard/o1;->d:Lcom/tencent/bugly/proguard/p;

    .line 14
    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/p;->a(Landroid/app/PendingIntent;Landroid/app/AlarmManager$OnAlarmListener;)V

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/n;JJILandroid/app/AlarmManager$OnAlarmListener;)V
    .locals 0

    .line 1
    sget-object p2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string/jumbo p4, "onAlarmSet, operation = "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p4, p1, Lcom/tencent/bugly/proguard/n;->m:Landroid/app/PendingIntent;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const-string p4, "BatteryMonitor"

    filled-new-array {p4, p3}, [Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 2
    iget-object p2, p0, Lcom/tencent/bugly/proguard/o1$d;->a:Lcom/tencent/bugly/proguard/o1;

    .line 3
    iget-object p2, p2, Lcom/tencent/bugly/proguard/o1;->d:Lcom/tencent/bugly/proguard/p;

    .line 4
    invoke-virtual {p2, p1}, Lcom/tencent/bugly/proguard/p;->a(Lcom/tencent/bugly/proguard/w0;)V

    .line 5
    iget-object p2, p0, Lcom/tencent/bugly/proguard/o1$d;->a:Lcom/tencent/bugly/proguard/o1;

    .line 6
    iget-object p2, p2, Lcom/tencent/bugly/proguard/o1;->g:Lcom/tencent/bugly/proguard/g1;

    .line 7
    iget p3, p2, Lcom/tencent/bugly/proguard/g1;->h:I

    add-int/lit8 p3, p3, 0x1

    iput p3, p2, Lcom/tencent/bugly/proguard/g1;->h:I

    .line 8
    iget p1, p1, Lcom/tencent/bugly/proguard/n;->j:I

    if-eqz p1, :cond_1

    const/4 p3, 0x2

    if-ne p1, p3, :cond_0

    goto :goto_0

    .line 9
    :cond_0
    iget p1, p2, Lcom/tencent/bugly/proguard/g1;->j:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p2, Lcom/tencent/bugly/proguard/g1;->j:I

    return-void

    .line 10
    :cond_1
    :goto_0
    iget p1, p2, Lcom/tencent/bugly/proguard/g1;->i:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p2, Lcom/tencent/bugly/proguard/g1;->i:I

    return-void
.end method
