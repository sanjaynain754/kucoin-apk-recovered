.class public Lcom/tencent/bugly/proguard/rc$a;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/bugly/proguard/rc;->a(Landroid/content/Context;Ljava/lang/String;ZLcom/tencent/bugly/proguard/b2;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
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


# virtual methods
.method public run()V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/base/config/c$a;->b:Lcom/tencent/rmonitor/base/config/c$a;

    .line 3
    .line 4
    const-string v1, "CrashModule"

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/m7;->a(Ljava/lang/String;Lcom/tencent/rmonitor/base/config/c$a;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/tencent/bugly/proguard/qe$a;->a()Lcom/tencent/bugly/proguard/qe;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    new-instance v1, Lcom/tencent/bugly/proguard/ne;

    .line 14
    .line 15
    .line 16
    invoke-direct {v1}, Lcom/tencent/bugly/proguard/ne;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/qe;->a(Lcom/tencent/bugly/proguard/t9;)V

    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
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
