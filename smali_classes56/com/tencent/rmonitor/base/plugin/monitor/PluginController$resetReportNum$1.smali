.class final Lcom/tencent/rmonitor/base/plugin/monitor/PluginController$resetReportNum$1;
.super Lkotlin/jvm/internal/Lambda;
.source "BUGLY"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->resetReportNum()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/tencent/rmonitor/base/plugin/monitor/PluginController$resetReportNum$1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController$resetReportNum$1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController$resetReportNum$1;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController$resetReportNum$1;->INSTANCE:Lcom/tencent/rmonitor/base/plugin/monitor/PluginController$resetReportNum$1;

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

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 5
    return-void
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


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;

    invoke-virtual {p0, p1}, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController$resetReportNum$1;->invoke(Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;)V
    .locals 3
    .param p1    # Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/tencent/rmonitor/base/meta/BaseInfo;->editor:Lcom/tencent/rmonitor/common/util/AsyncSPEditor;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "count_plugin_"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p1, Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;->pluginName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/tencent/rmonitor/common/util/AsyncSPEditor;->putInt(Ljava/lang/String;I)Lcom/tencent/rmonitor/common/util/AsyncSPEditor;

    .line 3
    iput v2, p1, Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;->curReportNum:I

    return-void
.end method
