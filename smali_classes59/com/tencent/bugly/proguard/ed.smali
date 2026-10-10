.class public Lcom/tencent/bugly/proguard/ed;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/y9;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/ed$b;
    }
.end annotation


# static fields
.field public static final e:J = 0x2710L


# instance fields
.field public b:Lcom/tencent/bugly/proguard/ed$b;

.field public c:Z

.field public d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/tencent/bugly/proguard/ed;->b:Lcom/tencent/bugly/proguard/ed$b;

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    iput-boolean v1, p0, Lcom/tencent/bugly/proguard/ed;->c:Z

    .line 10
    .line 11
    iput-object v0, p0, Lcom/tencent/bugly/proguard/ed;->d:Ljava/lang/String;

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/ed;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/ed;->d:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/ed;Z)Z
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/ed;->c:Z

    return p1
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ed;->d:Ljava/lang/String;

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iput-object p1, p0, Lcom/tencent/bugly/proguard/ed;->d:Ljava/lang/String;

    .line 5
    iget-boolean p1, p0, Lcom/tencent/bugly/proguard/ed;->c:Z

    if-nez p1, :cond_2

    .line 6
    iget-object p1, p0, Lcom/tencent/bugly/proguard/ed;->b:Lcom/tencent/bugly/proguard/ed$b;

    if-nez p1, :cond_1

    .line 7
    new-instance p1, Lcom/tencent/bugly/proguard/ed$b;

    .line 8
    invoke-direct {p1, p0}, Lcom/tencent/bugly/proguard/ed$b;-><init>(Lcom/tencent/bugly/proguard/ed;)V

    .line 9
    iput-object p1, p0, Lcom/tencent/bugly/proguard/ed;->b:Lcom/tencent/bugly/proguard/ed$b;

    :cond_1
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/ed;->c:Z

    .line 11
    iget-object p1, p0, Lcom/tencent/bugly/proguard/ed;->b:Lcom/tencent/bugly/proguard/ed$b;

    const-wide/16 v0, 0x2710

    invoke-static {p1, v0, v1}, Lcom/tencent/bugly/common/thread/ThreadManager;->runInMainThread(Ljava/lang/Runnable;J)V

    :cond_2
    :goto_0
    return-void
.end method
