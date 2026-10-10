.class public final Lcom/tencent/bugly/proguard/ji$f;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/ki;
.implements Lcom/tencent/bugly/proguard/ni$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/ji;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# instance fields
.field public a:Lcom/tencent/bugly/proguard/ni$e;

.field public final b:Ljava/lang/String;

.field public c:Landroid/content/Context;

.field public d:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/bugly/proguard/ni$e;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/ni$e;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/proguard/ji$f;->a:Lcom/tencent/bugly/proguard/ni$e;

    .line 11
    .line 12
    iput-object p1, p0, Lcom/tencent/bugly/proguard/ji$f;->b:Ljava/lang/String;

    .line 13
    return-void
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
.method public a(Landroid/content/Context;)V
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ji$f;->a:Lcom/tencent/bugly/proguard/ni$e;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/ni$e;->a(Landroid/content/Context;)V

    return-void
.end method

.method public a()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ji$f;->a:Lcom/tencent/bugly/proguard/ni$e;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/ni$e;->a()Z

    move-result v0

    return v0
.end method

.method public a(Landroid/content/Context;Landroid/os/Bundle;)Z
    .locals 1

    .line 12
    iput-object p1, p0, Lcom/tencent/bugly/proguard/ji$f;->c:Landroid/content/Context;

    .line 13
    iput-object p2, p0, Lcom/tencent/bugly/proguard/ji$f;->d:Landroid/os/Bundle;

    .line 14
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ji$f;->a:Lcom/tencent/bugly/proguard/ni$e;

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/ni$e;->a(Landroid/content/Context;Landroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public a(Ljava/lang/String;I)Z
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ji$f;->a:Lcom/tencent/bugly/proguard/ni$e;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/ni$e;->a()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ji$f;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/tencent/bugly/proguard/ji$f;->d:Landroid/os/Bundle;

    invoke-virtual {p0, v0, v2}, Lcom/tencent/bugly/proguard/ji$f;->a(Landroid/content/Context;Landroid/os/Bundle;)Z

    move-result v0

    if-nez v0, :cond_0

    return v1

    .line 4
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 5
    iget-object v2, p0, Lcom/tencent/bugly/proguard/ji$f;->b:Ljava/lang/String;

    const-string/jumbo v3, "saving-path"

    invoke-virtual {v0, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    const-string/jumbo v2, "path-of-elf"

    invoke-virtual {v0, v2, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    const-string v2, "elf-start-offset"

    invoke-virtual {v0, v2, p2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 8
    iget-object v2, p0, Lcom/tencent/bugly/proguard/ji$f;->a:Lcom/tencent/bugly/proguard/ni$e;

    const/16 v3, 0x64

    invoke-virtual {v2, v3, v0}, Lcom/tencent/bugly/proguard/ni$e;->a(ILandroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 9
    const-string/jumbo v2, "warm-up-result"

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_1
    const/16 v0, -0x64

    :goto_0
    if-nez v0, :cond_2

    const/4 v1, 0x1

    :cond_2
    if-eqz v1, :cond_3

    .line 10
    invoke-static {p1, p2}, Lcom/tencent/bugly/matrix/backtrace/WeChatBacktraceNative;->notifyWarmedUp(Ljava/lang/String;I)V

    .line 11
    :cond_3
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {p1, p2, v0}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "Matrix.WarmUpDelegate"

    const-string v0, "Warm-up %s:%s - retCode %s"

    invoke-static {p2, v0, p1}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return v1
.end method
