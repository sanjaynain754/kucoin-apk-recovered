.class public interface abstract Lcom/tencent/bugly/proguard/bf$b;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/bf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "b"
.end annotation


# static fields
.field public static final a:Ljava/lang/String; = "looper_metric"

.field public static final b:Ljava/lang/String; = "looper_stack"

.field public static final c:Ljava/lang/String; = "db"

.field public static final d:Ljava/lang/String; = "io"

.field public static final e:Ljava/lang/String; = "work_thread_lag"

.field public static final f:Ljava/lang/String; = "launch_metric"

.field public static final g:Ljava/lang/String; = "activity_leak"

.field public static final h:Ljava/lang/String; = "big_bitmap"

.field public static final i:Ljava/lang/String; = "fd_leak"

.field public static final j:Ljava/lang/String; = "native_memory"

.field public static final k:Ljava/lang/String; = "asan"

.field public static final l:Ljava/lang/String; = "traffic"

.field public static final m:Ljava/lang/String; = "traffic_detail"

.field public static final n:Ljava/lang/String; = "net_quality"

.field public static final o:Ljava/lang/String; = "battery_metric"

.field public static final p:Ljava/lang/String; = "battery_ele_metric"

.field public static final q:Ljava/lang/String; = "battery_element"

.field public static final r:Ljava/lang/String; = "java_memory_ceiling_hprof"

.field public static final s:Ljava/lang/String; = "page_launch"

.field public static final t:Ljava/lang/String; = "custom_event"

.field public static final u:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final v:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/base/config/PluginCombination;->Companion:Lcom/tencent/rmonitor/base/config/PluginCombination$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/config/PluginCombination$Companion;->getModeStableNames()Ljava/util/List;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    sput-object v1, Lcom/tencent/bugly/proguard/bf$b;->u:Ljava/util/List;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/config/PluginCombination$Companion;->getModeAllNames()Ljava/util/List;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    sput-object v0, Lcom/tencent/bugly/proguard/bf$b;->v:Ljava/util/List;

    .line 15
    return-void
    .line 16
    .line 17
.end method
