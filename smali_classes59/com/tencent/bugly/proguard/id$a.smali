.class public Lcom/tencent/bugly/proguard/id$a;
.super Lcom/tencent/bugly/proguard/kg;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/id;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final b:Lcom/tencent/bugly/proguard/b8;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/b8;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/kg;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/tencent/bugly/proguard/id$a;->b:Lcom/tencent/bugly/proguard/b8;

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
.method public onBackground()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/id$a;->b:Lcom/tencent/bugly/proguard/b8;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 7
    .line 8
    const-string v1, "RMonitor_net_quality"

    .line 9
    .line 10
    .line 11
    const-string/jumbo v2, "try report or cache data for background."

    .line 12
    .line 13
    .line 14
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 19
    .line 20
    iget-object v0, p0, Lcom/tencent/bugly/proguard/id$a;->b:Lcom/tencent/bugly/proguard/b8;

    .line 21
    .line 22
    .line 23
    const-string/jumbo v1, "onBackground"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/b8;->a(Ljava/lang/String;)V

    .line 27
    :cond_0
    return-void
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
