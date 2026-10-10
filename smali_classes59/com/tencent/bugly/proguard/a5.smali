.class public Lcom/tencent/bugly/proguard/a5;
.super Ljava/lang/Object;
.source "BUGLY"


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

.method public static a()Lcom/tencent/bugly/proguard/a;
    .locals 1

    .line 3
    new-instance v0, Lcom/tencent/bugly/proguard/a;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/a;-><init>()V

    return-object v0
.end method

.method public static a(I)Lcom/tencent/bugly/proguard/b5;
    .locals 1

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    .line 1
    new-instance p0, Lcom/tencent/bugly/proguard/c4;

    invoke-direct {p0}, Lcom/tencent/bugly/proguard/c4;-><init>()V

    return-object p0

    :cond_0
    const/4 v0, 0x3

    if-ne p0, v0, :cond_1

    .line 2
    new-instance p0, Lcom/tencent/bugly/proguard/a;

    invoke-direct {p0}, Lcom/tencent/bugly/proguard/a;-><init>()V

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static b()Lcom/tencent/bugly/proguard/c4;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/c4;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/c4;-><init>()V

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
