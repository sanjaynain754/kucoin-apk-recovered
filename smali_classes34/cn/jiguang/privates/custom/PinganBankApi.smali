.class public Lcn/jiguang/privates/custom/PinganBankApi;
.super Ljava/lang/Object;
.source "PinganBankApi.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "PinganBankApi"


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
    .line 18
.end method

.method public static configOnlyBeWake(Landroid/content/Context;Z)V
    .locals 1

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    const-string p0, "PinganBankApi"

    .line 5
    .line 6
    const-string p1, "configOnlyBeWake context can\'t be null, please check it"

    .line 7
    .line 8
    .line 9
    invoke-static {p0, p1}, Lcn/jiguang/privates/common/log/JCommonLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    return-void

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lcn/jiguang/privates/common/global/JGlobal;->isMainProcess(Landroid/content/Context;)Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 24
    move-result-object p0

    .line 25
    .line 26
    .line 27
    invoke-static {p0}, Lcn/jiguang/privates/common/global/JGlobal;->isRemoteProcess(Landroid/content/Context;)Z

    .line 28
    move-result p0

    .line 29
    .line 30
    if-nez p0, :cond_1

    .line 31
    return-void

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-static {p1}, Lcn/jiguang/privates/core/global/JCoreGlobal;->setOnlyBeWakeState(Z)V

    .line 35
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public static configOnlyWake(Landroid/content/Context;Z)V
    .locals 1

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    const-string p0, "PinganBankApi"

    .line 5
    .line 6
    const-string p1, "configOnlyWake context can\'t be null, please check it"

    .line 7
    .line 8
    .line 9
    invoke-static {p0, p1}, Lcn/jiguang/privates/common/log/JCommonLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    return-void

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lcn/jiguang/privates/common/global/JGlobal;->isMainProcess(Landroid/content/Context;)Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 24
    move-result-object p0

    .line 25
    .line 26
    .line 27
    invoke-static {p0}, Lcn/jiguang/privates/common/global/JGlobal;->isRemoteProcess(Landroid/content/Context;)Z

    .line 28
    move-result p0

    .line 29
    .line 30
    if-nez p0, :cond_1

    .line 31
    return-void

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-static {p1}, Lcn/jiguang/privates/core/global/JCoreGlobal;->setOnlyWakeState(Z)V

    .line 35
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method
