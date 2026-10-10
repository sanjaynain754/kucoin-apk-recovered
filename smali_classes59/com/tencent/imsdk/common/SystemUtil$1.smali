.class Lcom/tencent/imsdk/common/SystemUtil$1;
.super Ljava/lang/Object;
.source "SystemUtil.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/imsdk/common/SystemUtil;->getAppMemory()F
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$currentTimeMillis:J


# direct methods
.method public constructor <init>(J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/tencent/imsdk/common/SystemUtil$1;->val$currentTimeMillis:J

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
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcom/tencent/imsdk/common/SystemUtil;->access$002(Z)Z

    .line 8
    .line 9
    :try_start_0
    new-instance v0, Landroid/os/Debug$MemoryInfo;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Landroid/os/Debug$MemoryInfo;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Landroid/os/Debug;->getMemoryInfo(Landroid/os/Debug$MemoryInfo;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/os/Debug$MemoryInfo;->getTotalPss()I

    .line 19
    move-result v0

    .line 20
    .line 21
    iget-wide v1, p0, Lcom/tencent/imsdk/common/SystemUtil$1;->val$currentTimeMillis:J

    .line 22
    .line 23
    .line 24
    invoke-static {v1, v2}, Lcom/tencent/imsdk/common/SystemUtil;->access$102(J)J

    .line 25
    .line 26
    div-int/lit16 v0, v0, 0x400

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lcom/tencent/imsdk/common/SystemUtil;->access$202(I)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    :catch_0
    return-void
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
