.class public final Landroidx/camera/core/impl/utils/ContextUtil;
.super Ljava/lang/Object;
.source "ContextUtil.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/impl/utils/ContextUtil$Api34Impl;,
        Landroidx/camera/core/impl/utils/ContextUtil$Api30Impl;
    }
.end annotation


# direct methods
.method private constructor <init>()V
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
    .line 18
    .line 19
    .line 20
.end method

.method public static getApplicationContext(Landroid/content/Context;)Landroid/content/Context;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v2, 0x22

    .line 9
    .line 10
    if-lt v1, v2, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Landroidx/camera/core/impl/utils/ContextUtil$Api34Impl;->getDeviceId(Landroid/content/Context;)I

    .line 14
    move-result v2

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Landroidx/camera/core/impl/utils/ContextUtil$Api34Impl;->getDeviceId(Landroid/content/Context;)I

    .line 18
    move-result v3

    .line 19
    .line 20
    if-eq v2, v3, :cond_0

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v2}, Landroidx/camera/core/impl/utils/ContextUtil$Api34Impl;->createDeviceContext(Landroid/content/Context;I)Landroid/content/Context;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    :cond_0
    const/16 v2, 0x1e

    .line 27
    .line 28
    if-lt v1, v2, :cond_1

    .line 29
    .line 30
    .line 31
    invoke-static {p0}, Landroidx/camera/core/impl/utils/ContextUtil$Api30Impl;->getAttributionTag(Landroid/content/Context;)Ljava/lang/String;

    .line 32
    move-result-object p0

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Landroidx/camera/core/impl/utils/ContextUtil$Api30Impl;->getAttributionTag(Landroid/content/Context;)Ljava/lang/String;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    .line 39
    invoke-static {p0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    move-result v1

    .line 41
    .line 42
    if-nez v1, :cond_1

    .line 43
    .line 44
    .line 45
    invoke-static {v0, p0}, Landroidx/camera/core/impl/utils/ContextUtil$Api30Impl;->createAttributionContext(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Context;

    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_1
    return-object v0
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
.end method

.method public static getApplicationFromContext(Landroid/content/Context;)Landroid/app/Application;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Landroidx/camera/core/impl/utils/ContextUtil;->getApplicationContext(Landroid/content/Context;)Landroid/content/Context;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    :goto_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    instance-of v0, p0, Landroid/app/Application;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    check-cast p0, Landroid/app/Application;

    .line 15
    return-object p0

    .line 16
    .line 17
    :cond_0
    check-cast p0, Landroid/content/ContextWrapper;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 21
    move-result-object p0

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method
