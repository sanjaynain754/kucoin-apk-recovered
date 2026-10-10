.class public abstract Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$LoopStackPlugin;,
        Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$LooperMetricPlugin;,
        Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$WorkThreadLagPlugin;,
        Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$DBPlugin;,
        Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$IOPlugin;,
        Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$LeakPlugin;,
        Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$CeilingHprofPlugin;,
        Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$QQBatteryPlugin;,
        Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$DevicePlugin;,
        Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$MemoryQuantilePlugin;,
        Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$SubMemoryQuantilePlugin;,
        Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$BigBitmapPlugin;,
        Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$FdLeakPlugin;,
        Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$NatMemPlugin;,
        Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$AsanPlugin;,
        Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$LaunchMetricPlugin;,
        Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$TrafficMetricPlugin;,
        Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$TrafficDetailMetricPlugin;,
        Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$NetQualityPlugin;,
        Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$BatteryMetricPlugin;,
        Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$BatteryElementMetricPlugin;,
        Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$BatteryElementPlugin;,
        Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$PageLaunchPlugin;,
        Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$CustomEventPlugin;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0018\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%B-\u0008\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000b\u0082\u0001\u0018&\'()*+,-./0123456789:;<=\u00a8\u0006>"
    }
    d2 = {
        "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;",
        "",
        "",
        "pluginName",
        "Ljava/lang/String;",
        "entrance",
        "Lcom/tencent/bugly/proguard/hf;",
        "config",
        "Lcom/tencent/bugly/proguard/hf;",
        "",
        "curReportNum",
        "I",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/hf;I)V",
        "AsanPlugin",
        "BatteryElementMetricPlugin",
        "BatteryElementPlugin",
        "BatteryMetricPlugin",
        "BigBitmapPlugin",
        "CeilingHprofPlugin",
        "CustomEventPlugin",
        "DBPlugin",
        "DevicePlugin",
        "FdLeakPlugin",
        "IOPlugin",
        "LaunchMetricPlugin",
        "LeakPlugin",
        "LoopStackPlugin",
        "LooperMetricPlugin",
        "MemoryQuantilePlugin",
        "NatMemPlugin",
        "NetQualityPlugin",
        "PageLaunchPlugin",
        "QQBatteryPlugin",
        "SubMemoryQuantilePlugin",
        "TrafficDetailMetricPlugin",
        "TrafficMetricPlugin",
        "WorkThreadLagPlugin",
        "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$LoopStackPlugin;",
        "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$LooperMetricPlugin;",
        "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$WorkThreadLagPlugin;",
        "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$DBPlugin;",
        "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$IOPlugin;",
        "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$LeakPlugin;",
        "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$CeilingHprofPlugin;",
        "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$QQBatteryPlugin;",
        "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$DevicePlugin;",
        "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$MemoryQuantilePlugin;",
        "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$SubMemoryQuantilePlugin;",
        "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$BigBitmapPlugin;",
        "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$FdLeakPlugin;",
        "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$NatMemPlugin;",
        "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$AsanPlugin;",
        "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$LaunchMetricPlugin;",
        "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$TrafficMetricPlugin;",
        "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$TrafficDetailMetricPlugin;",
        "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$NetQualityPlugin;",
        "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$BatteryMetricPlugin;",
        "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$BatteryElementMetricPlugin;",
        "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$BatteryElementPlugin;",
        "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$PageLaunchPlugin;",
        "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$CustomEventPlugin;",
        "bugly-pro_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public config:Lcom/tencent/bugly/proguard/hf;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public curReportNum:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public final entrance:Ljava/lang/String;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final pluginName:Ljava/lang/String;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/hf;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;->pluginName:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;->entrance:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;->config:Lcom/tencent/bugly/proguard/hf;

    .line 6
    iput p4, p0, Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;->curReportNum:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/hf;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    .line 7
    invoke-static {p1}, Lcom/tencent/bugly/proguard/w2;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/hf;

    move-result-object p3

    const-string p6, "createPluginDefaultConfig(pluginName)"

    invoke-static {p3, p6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p5, 0x8

    if-eqz p3, :cond_1

    const/4 p4, 0x0

    :cond_1
    move v4, p4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 8
    invoke-direct/range {v0 .. v5}, Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/hf;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/hf;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/hf;I)V

    return-void
.end method
