.class final Lcom/kubi/sdk/log/realtime/RealTimeReporter$init$1;
.super Lkotlin/jvm/internal/Lambda;
.source "RealTimeReporter.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/sdk/log/realtime/RealTimeReporter;->q(Landroid/app/Application;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRealTimeReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealTimeReporter.kt\ncom/kubi/sdk/log/realtime/RealTimeReporter$init$1\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n*L\n1#1,342:1\n33#2:343\n*S KotlinDebug\n*F\n+ 1 RealTimeReporter.kt\ncom/kubi/sdk/log/realtime/RealTimeReporter$init$1\n*L\n113#1:343\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/kubi/sdk/log/realtime/RealTimeReporter;


# direct methods
.method public constructor <init>(Lcom/kubi/sdk/log/realtime/RealTimeReporter;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/sdk/log/realtime/RealTimeReporter$init$1;->this$0:Lcom/kubi/sdk/log/realtime/RealTimeReporter;

    .line 3
    const/4 p1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    return-void
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
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/kubi/sdk/log/realtime/RealTimeReporter$init$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    sget-object v0, Lcom/kubi/config/RemoteConfig;->a:Lcom/kubi/config/RemoteConfig;

    new-instance v0, Lcom/kubi/sdk/log/realtime/RealTimeReporter$init$1$a;

    invoke-direct {v0}, Lcom/kubi/sdk/log/realtime/RealTimeReporter$init$1$a;-><init>()V

    invoke-virtual {v0}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    const-string v1, "object : TypeToken<T>() {}.type"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "real_time_log_config_Android"

    invoke-static {v1, v0}, Lcom/kubi/config/RemoteConfig;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    .line 3
    check-cast v0, Lcom/kubi/sdk/log/realtime/LogRemoteConfigData;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/kubi/sdk/log/realtime/RealTimeReporter$init$1;->this$0:Lcom/kubi/sdk/log/realtime/RealTimeReporter;

    .line 4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u83b7\u53d6\u5230\u8fdc\u7aef\u914d\u7f6e "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Logger::RealTimeReporter"

    invoke-static {v3, v2}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    invoke-virtual {v1, v0}, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->x(Lcom/kubi/sdk/log/realtime/LogRemoteConfigData;)V

    :cond_0
    return-void
.end method
