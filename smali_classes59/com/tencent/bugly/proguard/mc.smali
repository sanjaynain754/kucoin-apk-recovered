.class public final Lcom/tencent/bugly/proguard/mc;
.super Lcom/tencent/bugly/proguard/kc;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/g7$a;


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    api = 0x1a
.end annotation


# instance fields
.field public j:Lcom/tencent/bugly/proguard/g7;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/kc;-><init>()V

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


# virtual methods
.method public a(Lcom/tencent/bugly/proguard/f7;)V
    .locals 1

    .line 7
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/kc;->c:Z

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 8
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/kc;->b(Lcom/tencent/bugly/proguard/f7;)V

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;J)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/tencent/bugly/proguard/kc;->a(Ljava/lang/String;J)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2
    iget-object p2, p0, Lcom/tencent/bugly/proguard/mc;->j:Lcom/tencent/bugly/proguard/g7;

    if-nez p2, :cond_0

    .line 3
    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p3

    invoke-direct {p2, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 4
    new-instance p3, Lcom/tencent/bugly/proguard/g7;

    invoke-direct {p3, p0, p2}, Lcom/tencent/bugly/proguard/g7;-><init>(Lcom/tencent/bugly/proguard/g7$a;Landroid/os/Handler;)V

    .line 5
    iput-object p3, p0, Lcom/tencent/bugly/proguard/mc;->j:Lcom/tencent/bugly/proguard/g7;

    .line 6
    :cond_0
    iget-object p2, p0, Lcom/tencent/bugly/proguard/mc;->j:Lcom/tencent/bugly/proguard/g7;

    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/g7;->a()V

    :cond_1
    return p1
.end method

.method public g()Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/tencent/bugly/proguard/kc;->g()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/tencent/bugly/proguard/mc;->j:Lcom/tencent/bugly/proguard/g7;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/g7;->b()V

    .line 14
    :cond_0
    return v0
    .line 15
    .line 16
    .line 17
.end method
