.class public Lcom/tencent/bugly/proguard/z3$b;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/bugly/proguard/z3;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/tencent/bugly/proguard/z3;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/z3;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/z3$b;->b:Lcom/tencent/bugly/proguard/z3;

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
.method public run()V
    .locals 6

    .line 1
    .line 2
    const-string v0, "cacheEvents, cacheEvent: "

    .line 3
    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/tencent/bugly/proguard/z3$b;->b:Lcom/tencent/bugly/proguard/z3;

    .line 5
    .line 6
    iget-object v2, v1, Lcom/tencent/bugly/proguard/z3;->e:Lorg/json/JSONArray;

    .line 7
    .line 8
    iget-object v1, v1, Lcom/tencent/bugly/proguard/z3;->d:Lcom/tencent/bugly/common/reporter/data/ReportData;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    sget-object v3, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 15
    .line 16
    const-string v4, "RMonitor_CustomEvent"

    .line 17
    .line 18
    new-instance v5, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 25
    move-result v0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    .line 35
    filled-new-array {v4, v0}, [Ljava/lang/String;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 40
    .line 41
    new-instance v0, Lcom/tencent/bugly/proguard/pf;

    .line 42
    .line 43
    .line 44
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/pf;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/pf;->b(Lcom/tencent/bugly/common/reporter/data/ReportData;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    :catchall_0
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/z3$b;->b:Lcom/tencent/bugly/proguard/z3;

    .line 50
    const/4 v1, 0x0

    .line 51
    .line 52
    iput-object v1, v0, Lcom/tencent/bugly/proguard/z3;->g:Ljava/lang/Runnable;

    .line 53
    return-void
    .line 54
    .line 55
    .line 56
    .line 57
.end method
