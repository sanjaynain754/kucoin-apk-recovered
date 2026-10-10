.class public final Lcom/tencent/rmonitor/sla/AttaEventHelper;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0014\u0010\u0003\u001a\u00020\u00042\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0008J\"\u0010\t\u001a\u00020\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\u0010\u000c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\rH\u0002\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/tencent/rmonitor/sla/AttaEventHelper;",
        "",
        "()V",
        "fillBaseInfo",
        "",
        "attaEvent",
        "Lcom/tencent/rmonitor/sla/AttaEvent;",
        "list",
        "",
        "fillFieldIfEmpty",
        "",
        "field",
        "block",
        "Lkotlin/Function0;",
        "bugly-pro_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/tencent/rmonitor/sla/AttaEventHelper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/rmonitor/sla/AttaEventHelper;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/rmonitor/sla/AttaEventHelper;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/rmonitor/sla/AttaEventHelper;->INSTANCE:Lcom/tencent/rmonitor/sla/AttaEventHelper;

    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

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
.end method

.method private final fillFieldIfEmpty(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    check-cast p1, Ljava/lang/String;

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    const-string p1, ""

    .line 17
    :cond_0
    return-object p1

    .line 18
    .line 19
    .line 20
    :cond_1
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 21
    return-object p1
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
.end method


# virtual methods
.method public final fillBaseInfo(Lcom/tencent/rmonitor/sla/AttaEvent;)V
    .locals 4
    .param p1    # Lcom/tencent/rmonitor/sla/AttaEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "attaEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getAppVersion()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/tencent/rmonitor/sla/AttaEventHelper$fillBaseInfo$1;->INSTANCE:Lcom/tencent/rmonitor/sla/AttaEventHelper$fillBaseInfo$1;

    invoke-direct {p0, v0, v1}, Lcom/tencent/rmonitor/sla/AttaEventHelper;->fillFieldIfEmpty(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/sla/AttaEvent;->setAppVersion(Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getAppName()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/tencent/rmonitor/sla/AttaEventHelper$fillBaseInfo$2;->INSTANCE:Lcom/tencent/rmonitor/sla/AttaEventHelper$fillBaseInfo$2;

    invoke-direct {p0, v0, v1}, Lcom/tencent/rmonitor/sla/AttaEventHelper;->fillFieldIfEmpty(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/sla/AttaEvent;->setAppName(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getAppBundleId()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/tencent/rmonitor/sla/AttaEventHelper$fillBaseInfo$3;->INSTANCE:Lcom/tencent/rmonitor/sla/AttaEventHelper$fillBaseInfo$3;

    invoke-direct {p0, v0, v1}, Lcom/tencent/rmonitor/sla/AttaEventHelper;->fillFieldIfEmpty(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/sla/AttaEvent;->setAppBundleId(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getAppKey()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/tencent/rmonitor/sla/AttaEventHelper$fillBaseInfo$4;->INSTANCE:Lcom/tencent/rmonitor/sla/AttaEventHelper$fillBaseInfo$4;

    invoke-direct {p0, v0, v1}, Lcom/tencent/rmonitor/sla/AttaEventHelper;->fillFieldIfEmpty(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/sla/AttaEvent;->setAppKey(Ljava/lang/String;)V

    .line 6
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getUserId()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/tencent/rmonitor/sla/AttaEventHelper$fillBaseInfo$5;->INSTANCE:Lcom/tencent/rmonitor/sla/AttaEventHelper$fillBaseInfo$5;

    invoke-direct {p0, v0, v1}, Lcom/tencent/rmonitor/sla/AttaEventHelper;->fillFieldIfEmpty(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/sla/AttaEvent;->setUserId(Ljava/lang/String;)V

    .line 7
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getSdkVersion()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/tencent/rmonitor/sla/AttaEventHelper$fillBaseInfo$6;->INSTANCE:Lcom/tencent/rmonitor/sla/AttaEventHelper$fillBaseInfo$6;

    invoke-direct {p0, v0, v1}, Lcom/tencent/rmonitor/sla/AttaEventHelper;->fillFieldIfEmpty(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/String;

    move-result-object v0

    .line 8
    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/sla/AttaEvent;->setSdkVersion(Ljava/lang/String;)V

    .line 9
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getEventTime()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getEventTime()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    :goto_0
    invoke-virtual {p1, v0, v1}, Lcom/tencent/rmonitor/sla/AttaEvent;->setEventTime(J)V

    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/tencent/rmonitor/sla/AttaEvent;->setUploadTime(J)V

    .line 11
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/tencent/rmonitor/sla/AttaEventHelper$fillBaseInfo$7;->INSTANCE:Lcom/tencent/rmonitor/sla/AttaEventHelper$fillBaseInfo$7;

    invoke-direct {p0, v0, v1}, Lcom/tencent/rmonitor/sla/AttaEventHelper;->fillFieldIfEmpty(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/sla/AttaEvent;->setDeviceId(Ljava/lang/String;)V

    .line 12
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getOsVersion()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/tencent/rmonitor/sla/AttaEventHelper$fillBaseInfo$8;->INSTANCE:Lcom/tencent/rmonitor/sla/AttaEventHelper$fillBaseInfo$8;

    invoke-direct {p0, v0, v1}, Lcom/tencent/rmonitor/sla/AttaEventHelper;->fillFieldIfEmpty(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/String;

    move-result-object v0

    .line 13
    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/sla/AttaEvent;->setOsVersion(Ljava/lang/String;)V

    .line 14
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getManufacturer()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/tencent/rmonitor/sla/AttaEventHelper$fillBaseInfo$9;->INSTANCE:Lcom/tencent/rmonitor/sla/AttaEventHelper$fillBaseInfo$9;

    invoke-direct {p0, v0, v1}, Lcom/tencent/rmonitor/sla/AttaEventHelper;->fillFieldIfEmpty(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/String;

    move-result-object v0

    .line 15
    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/sla/AttaEvent;->setManufacturer(Ljava/lang/String;)V

    .line 16
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getModel()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/tencent/rmonitor/sla/AttaEventHelper$fillBaseInfo$10;->INSTANCE:Lcom/tencent/rmonitor/sla/AttaEventHelper$fillBaseInfo$10;

    invoke-direct {p0, v0, v1}, Lcom/tencent/rmonitor/sla/AttaEventHelper;->fillFieldIfEmpty(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/sla/AttaEvent;->setModel(Ljava/lang/String;)V

    .line 17
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getProductId()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/tencent/rmonitor/sla/AttaEventHelper$fillBaseInfo$11;->INSTANCE:Lcom/tencent/rmonitor/sla/AttaEventHelper$fillBaseInfo$11;

    invoke-direct {p0, v0, v1}, Lcom/tencent/rmonitor/sla/AttaEventHelper;->fillFieldIfEmpty(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/sla/AttaEvent;->setProductId(Ljava/lang/String;)V

    .line 18
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getFullOSVersion()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/tencent/rmonitor/sla/AttaEventHelper$fillBaseInfo$12;->INSTANCE:Lcom/tencent/rmonitor/sla/AttaEventHelper$fillBaseInfo$12;

    invoke-direct {p0, v0, v1}, Lcom/tencent/rmonitor/sla/AttaEventHelper;->fillFieldIfEmpty(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/String;

    move-result-object v0

    .line 19
    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/sla/AttaEvent;->setFullOSVersion(Ljava/lang/String;)V

    return-void
.end method

.method public final fillBaseInfo(Ljava/util/List;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/rmonitor/sla/AttaEvent;",
            ">;)V"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/rmonitor/sla/AttaEvent;

    .line 21
    sget-object v1, Lcom/tencent/rmonitor/sla/AttaEventHelper;->INSTANCE:Lcom/tencent/rmonitor/sla/AttaEventHelper;

    invoke-virtual {v1, v0}, Lcom/tencent/rmonitor/sla/AttaEventHelper;->fillBaseInfo(Lcom/tencent/rmonitor/sla/AttaEvent;)V

    goto :goto_0

    :cond_0
    return-void
.end method
