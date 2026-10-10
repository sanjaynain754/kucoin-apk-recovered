.class public Lcom/tencent/bugly/proguard/vd;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/tencent/bugly/proguard/ef;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/bugly/proguard/vd;->a:Ljava/util/HashMap;

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
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
    .line 5
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

.method public static a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/ef;
    .locals 3

    .line 24
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    .line 25
    :cond_0
    :try_start_0
    sget-object v0, Lcom/tencent/bugly/proguard/vd;->a:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 26
    invoke-static {}, Lcom/tencent/bugly/proguard/vd;->a()V

    .line 27
    :cond_1
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/tencent/bugly/proguard/ef;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_2

    return-object p0

    :catchall_0
    :cond_2
    return-object v1
.end method

.method public static a()V
    .locals 7

    .line 1
    sget-object v0, Lcom/tencent/bugly/proguard/vd;->a:Ljava/util/HashMap;

    new-instance v1, Lcom/tencent/bugly/proguard/ef;

    const/16 v2, 0x10

    const-string v3, "looper"

    const-string v4, "looper_metric"

    invoke-direct {v1, v3, v4, v2}, Lcom/tencent/bugly/proguard/ef;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v1, Lcom/tencent/bugly/proguard/ef;

    const/16 v2, 0x13

    const-string v4, "looper_stack"

    invoke-direct {v1, v3, v4, v2}, Lcom/tencent/bugly/proguard/ef;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    new-instance v1, Lcom/tencent/bugly/proguard/ef;

    const/16 v2, 0x1d

    const-string/jumbo v4, "work_thread_lag"

    invoke-direct {v1, v3, v4, v2}, Lcom/tencent/bugly/proguard/ef;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    new-instance v1, Lcom/tencent/bugly/proguard/ef;

    const/16 v2, 0x32

    const-string v3, "memory"

    const-string v4, "java_memory_ceiling_hprof"

    invoke-direct {v1, v3, v4, v2}, Lcom/tencent/bugly/proguard/ef;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    new-instance v1, Lcom/tencent/bugly/proguard/ef;

    const/16 v2, 0x2f

    const-string v4, "activity_leak"

    invoke-direct {v1, v3, v4, v2}, Lcom/tencent/bugly/proguard/ef;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    new-instance v1, Lcom/tencent/bugly/proguard/ef;

    const/16 v2, 0x26

    const-string v4, "big_bitmap"

    invoke-direct {v1, v3, v4, v2}, Lcom/tencent/bugly/proguard/ef;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    new-instance v1, Lcom/tencent/bugly/proguard/ef;

    const/16 v2, 0x1c

    const-string v4, "fd_leak"

    invoke-direct {v1, v3, v4, v2}, Lcom/tencent/bugly/proguard/ef;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    new-instance v1, Lcom/tencent/bugly/proguard/ef;

    const/16 v2, 0x24

    const-string/jumbo v4, "native_memory"

    invoke-direct {v1, v3, v4, v2}, Lcom/tencent/bugly/proguard/ef;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    new-instance v1, Lcom/tencent/bugly/proguard/ef;

    const/16 v2, 0x35

    const-string v4, "asan"

    invoke-direct {v1, v3, v4, v2}, Lcom/tencent/bugly/proguard/ef;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    new-instance v1, Lcom/tencent/bugly/proguard/ef;

    const/16 v2, 0x2d

    const-string v3, "launch"

    const-string/jumbo v4, "page_launch"

    invoke-direct {v1, v3, v4, v2}, Lcom/tencent/bugly/proguard/ef;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    new-instance v1, Lcom/tencent/bugly/proguard/ef;

    const-string v2, "launch_metric"

    const/4 v4, -0x1

    invoke-direct {v1, v3, v2, v4}, Lcom/tencent/bugly/proguard/ef;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    new-instance v1, Lcom/tencent/bugly/proguard/ef;

    const-string/jumbo v2, "metric"

    const-string v3, "memory_quantile"

    invoke-direct {v1, v2, v3, v4}, Lcom/tencent/bugly/proguard/ef;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    new-instance v1, Lcom/tencent/bugly/proguard/ef;

    const-string v3, "io"

    invoke-direct {v1, v3, v3, v4}, Lcom/tencent/bugly/proguard/ef;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    new-instance v1, Lcom/tencent/bugly/proguard/ef;

    const-string v3, "db"

    invoke-direct {v1, v3, v3, v4}, Lcom/tencent/bugly/proguard/ef;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    new-instance v1, Lcom/tencent/bugly/proguard/ef;

    const-string v3, "device"

    invoke-direct {v1, v3, v3, v4}, Lcom/tencent/bugly/proguard/ef;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    new-instance v1, Lcom/tencent/bugly/proguard/ef;

    const-string v3, "battery"

    invoke-direct {v1, v3, v3, v4}, Lcom/tencent/bugly/proguard/ef;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    new-instance v1, Lcom/tencent/bugly/proguard/ef;

    const-string/jumbo v3, "traffic"

    const/16 v5, 0x2a

    const-string/jumbo v6, "resource"

    invoke-direct {v1, v6, v3, v5}, Lcom/tencent/bugly/proguard/ef;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    const-string/jumbo v3, "traffic"

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    new-instance v1, Lcom/tencent/bugly/proguard/ef;

    const-string/jumbo v3, "traffic_detail"

    const/16 v5, 0x34

    invoke-direct {v1, v6, v3, v5}, Lcom/tencent/bugly/proguard/ef;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    const-string/jumbo v3, "traffic_detail"

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    new-instance v1, Lcom/tencent/bugly/proguard/ef;

    const-string/jumbo v3, "net_quality"

    const/16 v5, 0x2e

    invoke-direct {v1, v6, v3, v5}, Lcom/tencent/bugly/proguard/ef;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    const-string/jumbo v3, "net_quality"

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    new-instance v1, Lcom/tencent/bugly/proguard/ef;

    const-string v3, "battery_metric"

    const/16 v5, 0x16

    invoke-direct {v1, v6, v3, v5}, Lcom/tencent/bugly/proguard/ef;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    const-string v3, "battery_metric"

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    new-instance v1, Lcom/tencent/bugly/proguard/ef;

    const-string v3, "battery_element"

    const/16 v5, 0x1a

    invoke-direct {v1, v6, v3, v5}, Lcom/tencent/bugly/proguard/ef;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    const-string v3, "battery_element"

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    new-instance v1, Lcom/tencent/bugly/proguard/ef;

    const-string v3, "battery_ele_metric"

    const/16 v5, 0x2b

    invoke-direct {v1, v6, v3, v5}, Lcom/tencent/bugly/proguard/ef;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    const-string v3, "battery_ele_metric"

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    new-instance v1, Lcom/tencent/bugly/proguard/ef;

    const-string v3, "custom_event"

    invoke-direct {v1, v2, v3, v4}, Lcom/tencent/bugly/proguard/ef;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    const-string v2, "custom_event"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
