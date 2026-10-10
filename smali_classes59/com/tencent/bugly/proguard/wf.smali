.class public final Lcom/tencent/bugly/proguard/wf;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/wf$a;
    }
.end annotation


# static fields
.field public static a:Lcom/tencent/bugly/proguard/wf$a;

.field public static b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
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

.method public static a()Ljava/lang/String;
    .locals 2

    .line 2
    sget-object v0, Lcom/tencent/bugly/proguard/wf;->a:Lcom/tencent/bugly/proguard/wf$a;

    .line 3
    sget-object v1, Lcom/tencent/bugly/proguard/wf;->b:Ljava/lang/String;

    if-nez v1, :cond_0

    if-eqz v0, :cond_0

    .line 4
    invoke-interface {v0}, Lcom/tencent/bugly/proguard/wf$a;->a()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tencent/bugly/proguard/wf;->b:Ljava/lang/String;

    .line 5
    :cond_0
    sget-object v0, Lcom/tencent/bugly/proguard/wf;->b:Ljava/lang/String;

    return-object v0
.end method

.method public static a(Lcom/tencent/bugly/proguard/wf$a;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/tencent/bugly/proguard/wf;->a:Lcom/tencent/bugly/proguard/wf$a;

    return-void
.end method

.method public static b()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    sput-object v0, Lcom/tencent/bugly/proguard/wf;->a:Lcom/tencent/bugly/proguard/wf$a;

    .line 4
    .line 5
    sput-object v0, Lcom/tencent/bugly/proguard/wf;->b:Ljava/lang/String;

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
.end method
