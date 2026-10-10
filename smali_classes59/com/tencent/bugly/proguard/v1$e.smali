.class public Lcom/tencent/bugly/proguard/v1$e;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/v1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation


# instance fields
.field public final synthetic b:Lcom/tencent/bugly/proguard/v1;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/v1;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/v1$e;->b:Lcom/tencent/bugly/proguard/v1;

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
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    iget-object v2, p0, Lcom/tencent/bugly/proguard/v1$e;->b:Lcom/tencent/bugly/proguard/v1;

    .line 7
    .line 8
    .line 9
    invoke-static {v2}, Lcom/tencent/bugly/proguard/v1;->b(Lcom/tencent/bugly/proguard/v1;)J

    .line 10
    move-result-wide v2

    .line 11
    .line 12
    cmp-long v2, v0, v2

    .line 13
    .line 14
    if-gez v2, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lcom/tencent/bugly/proguard/m0;->c()Lcom/tencent/bugly/proguard/m0;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    new-instance v3, Lcom/tencent/bugly/proguard/v1$e;

    .line 21
    .line 22
    iget-object v4, p0, Lcom/tencent/bugly/proguard/v1$e;->b:Lcom/tencent/bugly/proguard/v1;

    .line 23
    .line 24
    .line 25
    invoke-direct {v3, v4}, Lcom/tencent/bugly/proguard/v1$e;-><init>(Lcom/tencent/bugly/proguard/v1;)V

    .line 26
    .line 27
    iget-object v4, p0, Lcom/tencent/bugly/proguard/v1$e;->b:Lcom/tencent/bugly/proguard/v1;

    .line 28
    .line 29
    iget-wide v4, v4, Lcom/tencent/bugly/proguard/v1;->c:J

    .line 30
    sub-long/2addr v4, v0

    .line 31
    .line 32
    const-wide/16 v0, 0x1388

    .line 33
    add-long/2addr v4, v0

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v3, v4, v5}, Lcom/tencent/bugly/proguard/m0;->a(Ljava/lang/Runnable;J)Z

    .line 37
    return-void

    .line 38
    .line 39
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/v1$e;->b:Lcom/tencent/bugly/proguard/v1;

    .line 40
    const/4 v1, 0x0

    .line 41
    .line 42
    const-wide/16 v2, 0x0

    .line 43
    const/4 v4, 0x3

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v4, v1, v2, v3}, Lcom/tencent/bugly/proguard/v1;->a(IZJ)V

    .line 47
    .line 48
    iget-object v0, p0, Lcom/tencent/bugly/proguard/v1$e;->b:Lcom/tencent/bugly/proguard/v1;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/v1;->a()V

    .line 52
    return-void
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method
