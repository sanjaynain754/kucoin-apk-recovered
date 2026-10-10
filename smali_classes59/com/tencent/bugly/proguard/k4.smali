.class public Lcom/tencent/bugly/proguard/k4;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/l8;


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/tencent/bugly/proguard/hf;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    const/16 v1, 0xc

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 11
    .line 12
    iput-object v0, p0, Lcom/tencent/bugly/proguard/k4;->a:Ljava/util/HashMap;

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/hf;
    .locals 1

    .line 15
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 16
    :cond_0
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/k4;->c(Ljava/lang/String;)Lcom/tencent/bugly/proguard/hf;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 17
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/hf;->b()Lcom/tencent/bugly/proguard/hf;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public final a()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k4;->a:Ljava/util/HashMap;

    new-instance v1, Lcom/tencent/bugly/proguard/hb;

    const-string v2, "list_metric"

    invoke-direct {v1, v2}, Lcom/tencent/bugly/proguard/hb;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k4;->a:Ljava/util/HashMap;

    new-instance v1, Lcom/tencent/bugly/proguard/hb;

    const-string v2, "looper_metric"

    invoke-direct {v1, v2}, Lcom/tencent/bugly/proguard/hb;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k4;->a:Ljava/util/HashMap;

    new-instance v1, Lcom/tencent/bugly/proguard/hf;

    const-string v2, "memory_quantile"

    const/4 v3, 0x0

    const/16 v4, 0x64

    const v5, 0x3a83126f    # 0.001f

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/tencent/bugly/proguard/hf;-><init>(Ljava/lang/String;ZIF)V

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k4;->a:Ljava/util/HashMap;

    new-instance v1, Lcom/tencent/bugly/proguard/hf;

    const-string/jumbo v2, "sub_memory_quantile"

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/tencent/bugly/proguard/hf;-><init>(Ljava/lang/String;ZIF)V

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k4;->a:Ljava/util/HashMap;

    new-instance v1, Lcom/tencent/bugly/proguard/c0;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/c0;-><init>()V

    const-string v2, "launch_metric"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k4;->a:Ljava/util/HashMap;

    new-instance v1, Lcom/tencent/bugly/proguard/hf;

    const-string v2, "db"

    const/16 v4, 0xa

    const v6, 0x3dcccccd    # 0.1f

    invoke-direct {v1, v2, v3, v4, v6}, Lcom/tencent/bugly/proguard/hf;-><init>(Ljava/lang/String;ZIF)V

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k4;->a:Ljava/util/HashMap;

    new-instance v1, Lcom/tencent/bugly/proguard/hf;

    const-string v2, "io"

    invoke-direct {v1, v2, v3, v4, v6}, Lcom/tencent/bugly/proguard/hf;-><init>(Ljava/lang/String;ZIF)V

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k4;->a:Ljava/util/HashMap;

    new-instance v1, Lcom/tencent/bugly/proguard/hf;

    const-string v2, "battery"

    invoke-direct {v1, v2, v3, v4, v6}, Lcom/tencent/bugly/proguard/hf;-><init>(Ljava/lang/String;ZIF)V

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k4;->a:Ljava/util/HashMap;

    new-instance v1, Lcom/tencent/bugly/proguard/hf;

    const/4 v2, 0x1

    const-string v4, "device"

    invoke-direct {v1, v4, v3, v2, v5}, Lcom/tencent/bugly/proguard/hf;-><init>(Ljava/lang/String;ZIF)V

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k4;->a:Ljava/util/HashMap;

    new-instance v1, Lcom/tencent/bugly/proguard/hf;

    const/4 v6, 0x0

    const/16 v7, 0x64

    const-string/jumbo v2, "traffic"

    const/16 v4, 0x3e8

    const/high16 v5, 0x3f000000    # 0.5f

    invoke-direct/range {v1 .. v7}, Lcom/tencent/bugly/proguard/hf;-><init>(Ljava/lang/String;ZIFFI)V

    const-string/jumbo v2, "traffic"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k4;->a:Ljava/util/HashMap;

    new-instance v1, Lcom/tencent/bugly/proguard/hf;

    const-string v2, "battery_ele_metric"

    invoke-direct/range {v1 .. v7}, Lcom/tencent/bugly/proguard/hf;-><init>(Ljava/lang/String;ZIFFI)V

    const-string v2, "battery_ele_metric"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k4;->a:Ljava/util/HashMap;

    new-instance v1, Lcom/tencent/bugly/proguard/hf;

    const/4 v7, 0x1

    const-string v2, "battery_metric"

    invoke-direct/range {v1 .. v7}, Lcom/tencent/bugly/proguard/hf;-><init>(Ljava/lang/String;ZIFFI)V

    const-string v2, "battery_metric"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k4;->a:Ljava/util/HashMap;

    new-instance v1, Lcom/tencent/bugly/proguard/hf;

    const/high16 v6, 0x3f000000    # 0.5f

    const-string/jumbo v2, "page_launch"

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lcom/tencent/bugly/proguard/hf;-><init>(Ljava/lang/String;ZIFFI)V

    const-string/jumbo v2, "page_launch"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k4;->a:Ljava/util/HashMap;

    new-instance v1, Lcom/tencent/bugly/proguard/y3;

    const-string v2, "custom_event"

    invoke-direct {v1, v2}, Lcom/tencent/bugly/proguard/y3;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public b(Ljava/lang/String;)Lcom/tencent/bugly/proguard/xe;
    .locals 1

    .line 1
    .line 2
    const-string v0, "atta"

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance p1, Lcom/tencent/bugly/proguard/n0;

    .line 11
    .line 12
    .line 13
    invoke-direct {p1}, Lcom/tencent/bugly/proguard/n0;-><init>()V

    .line 14
    return-object p1

    .line 15
    .line 16
    .line 17
    :cond_0
    const-string/jumbo v0, "safe_mode"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    move-result p1

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    new-instance p1, Lcom/tencent/bugly/proguard/fg;

    .line 26
    .line 27
    .line 28
    invoke-direct {p1}, Lcom/tencent/bugly/proguard/fg;-><init>()V

    .line 29
    return-object p1

    .line 30
    :cond_1
    const/4 p1, 0x0

    .line 31
    return-object p1
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
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public final c(Ljava/lang/String;)Lcom/tencent/bugly/proguard/hf;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k4;->a:Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/k4;->a()V

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k4;->a:Ljava/util/HashMap;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    check-cast p1, Lcom/tencent/bugly/proguard/hf;

    .line 20
    return-object p1
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
