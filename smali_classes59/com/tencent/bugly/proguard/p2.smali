.class public Lcom/tencent/bugly/proguard/p2;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static a:Lcom/tencent/bugly/proguard/h7;

.field public static b:Lcom/tencent/bugly/proguard/zi;


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

.method public static a()Lcom/tencent/bugly/proguard/q2;
    .locals 1

    .line 1
    new-instance v0, Lcom/tencent/bugly/proguard/h7;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/h7;-><init>()V

    return-object v0
.end method

.method public static a(I)Lcom/tencent/bugly/proguard/q2;
    .locals 1

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    .line 2
    new-instance p0, Lcom/tencent/bugly/proguard/zi;

    invoke-direct {p0}, Lcom/tencent/bugly/proguard/zi;-><init>()V

    return-object p0

    :cond_0
    const/4 v0, 0x2

    if-ne p0, v0, :cond_1

    .line 3
    new-instance p0, Lcom/tencent/bugly/proguard/h7;

    invoke-direct {p0}, Lcom/tencent/bugly/proguard/h7;-><init>()V

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static b()Lcom/tencent/bugly/proguard/q2;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/zi;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/zi;-><init>()V

    .line 6
    return-object v0
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
