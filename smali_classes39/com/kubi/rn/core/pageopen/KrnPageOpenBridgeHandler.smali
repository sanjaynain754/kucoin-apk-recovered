.class public final Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler;
.super Ljava/lang/Object;
.source "KrnPageOpenBridgeHandler.kt"

# interfaces
.implements Lcom/kubi/rn/core/pageopen/KrnPageOpenEventHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler$Companion;,
        Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0012\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u0016J#\u0010\n\u001a\u00020\u000b2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000fH\u0000\u00a2\u0006\u0002\u0008\u0011J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u001bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler;",
        "Lcom/kubi/rn/core/pageopen/KrnPageOpenEventHandler;",
        "ownerToken",
        "",
        "registry",
        "Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryAccess;",
        "reportSink",
        "Lcom/kubi/sdk/performance/pageopen/PageOpenReportSink;",
        "<init>",
        "(Ljava/lang/Object;Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryAccess;Lcom/kubi/sdk/performance/pageopen/PageOpenReportSink;)V",
        "handle",
        "Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;",
        "params",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "values",
        "",
        "",
        "handle$BReactNativeLib_googleRelease",
        "handleParsedPayload",
        "parsed",
        "Lcom/kubi/rn/core/pageopen/KrnPageOpenPayloadParseResult;",
        "handleContainerDataReady",
        "payload",
        "Lcom/kubi/rn/core/pageopen/KrnPageOpenDataReadyPayload;",
        "handleBind",
        "Lcom/kubi/rn/core/pageopen/KrnPageOpenBindPayload;",
        "handleContainerEntryFinish",
        "Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;",
        "handleInBundleNavigationFinish",
        "Companion",
        "BReactNativeLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nKrnPageOpenBridgeHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KrnPageOpenBridgeHandler.kt\ncom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,202:1\n1#2:203\n*E\n"
    }
.end annotation


# static fields
.field private static final Companion:Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "KrnPageOpenHandler"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final ownerToken:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final registry:Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryAccess;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final reportSink:Lcom/kubi/sdk/performance/pageopen/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler;->Companion:Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler$Companion;

    .line 9
    return-void
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
    .line 46
    .line 47
    .line 48
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
    .line 79
    .line 80
    .line 81
    .line 82
.end method

.method public constructor <init>(Ljava/lang/Object;Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryAccess;Lcom/kubi/sdk/performance/pageopen/e;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryAccess;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/kubi/sdk/performance/pageopen/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "ownerToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "registry"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reportSink"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler;->ownerToken:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler;->registry:Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryAccess;

    .line 4
    iput-object p3, p0, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler;->reportSink:Lcom/kubi/sdk/performance/pageopen/e;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryAccess;Lcom/kubi/sdk/performance/pageopen/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 5
    sget-object p2, Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistry;->INSTANCE:Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistry;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 6
    sget-object p3, Lcom/kubi/sdk/performance/pageopen/PageOpenReporter;->d:Lcom/kubi/sdk/performance/pageopen/PageOpenReporter$Companion;

    invoke-virtual {p3}, Lcom/kubi/sdk/performance/pageopen/PageOpenReporter$Companion;->getDefault()Lcom/kubi/sdk/performance/pageopen/PageOpenReporter;

    move-result-object p3

    .line 7
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler;-><init>(Ljava/lang/Object;Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryAccess;Lcom/kubi/sdk/performance/pageopen/e;)V

    return-void
.end method

.method private final handleBind(Lcom/kubi/rn/core/pageopen/KrnPageOpenBindPayload;)Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler;->registry:Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryAccess;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenBindPayload;->getRootTag()I

    .line 6
    move-result v1

    .line 7
    .line 8
    iget-object v2, p0, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler;->ownerToken:Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1, v2}, Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryAccess;->find(ILjava/lang/Object;)Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    sget-object p1, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;->Companion:Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;

    .line 17
    .line 18
    const-string v0, "root_tag_not_found"

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;->rejected(Ljava/lang/String;)Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;

    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenBindPayload;->getPageId()Ljava/lang/String;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenBindPayload;->getRouteKey()Ljava/lang/String;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1, v2}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->c(Ljava/lang/String;Ljava/lang/String;)Z

    .line 35
    move-result v1

    .line 36
    .line 37
    if-nez v1, :cond_1

    .line 38
    .line 39
    sget-object p1, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;->Companion:Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;

    .line 40
    .line 41
    const-string v0, "page_binding_mismatch"

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v0}, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;->rejected(Ljava/lang/String;)Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;

    .line 45
    move-result-object p1

    .line 46
    return-object p1

    .line 47
    .line 48
    :cond_1
    iget-object v1, p0, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler;->registry:Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryAccess;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenBindPayload;->getRootTag()I

    .line 52
    move-result v2

    .line 53
    .line 54
    iget-object v3, p0, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler;->ownerToken:Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    invoke-interface {v1, v2, v3, v0}, Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryAccess;->armTimeoutAfterBind(ILjava/lang/Object;Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;)Z

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->l()Z

    .line 61
    move-result v1

    .line 62
    .line 63
    if-eqz v1, :cond_2

    .line 64
    .line 65
    iget-object v1, p0, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler;->registry:Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryAccess;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenBindPayload;->getRootTag()I

    .line 69
    move-result p1

    .line 70
    .line 71
    iget-object v2, p0, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler;->ownerToken:Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    invoke-interface {v1, p1, v2, v0}, Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryAccess;->remove(ILjava/lang/Object;Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;)Z

    .line 75
    .line 76
    :cond_2
    sget-object p1, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;->Companion:Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->i()Lcom/kubi/sdk/performance/pageopen/k;

    .line 80
    move-result-object v0

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Lcom/kubi/sdk/performance/pageopen/k;->c()Ljava/lang/String;

    .line 84
    move-result-object v0

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v0}, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;->accepted(Ljava/lang/String;)Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;

    .line 88
    move-result-object p1

    .line 89
    return-object p1
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
.end method

.method private final handleContainerDataReady(Lcom/kubi/rn/core/pageopen/KrnPageOpenDataReadyPayload;)Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler;->registry:Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryAccess;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenDataReadyPayload;->getRootTag()I

    .line 6
    move-result v1

    .line 7
    .line 8
    iget-object v2, p0, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler;->ownerToken:Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1, v2}, Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryAccess;->find(ILjava/lang/Object;)Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    sget-object p1, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;->Companion:Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;

    .line 17
    .line 18
    const-string v0, "root_tag_not_found"

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;->rejected(Ljava/lang/String;)Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;

    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {v0}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->i()Lcom/kubi/sdk/performance/pageopen/k;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Lcom/kubi/sdk/performance/pageopen/k;->c()Ljava/lang/String;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenDataReadyPayload;->getPageTraceId()Ljava/lang/String;

    .line 35
    move-result-object v2

    .line 36
    .line 37
    .line 38
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    move-result v1

    .line 40
    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    sget-object p1, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;->Companion:Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;

    .line 44
    .line 45
    const-string v0, "page_trace_id_mismatch"

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v0}, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;->rejected(Ljava/lang/String;)Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;

    .line 49
    move-result-object p1

    .line 50
    return-object p1

    .line 51
    .line 52
    .line 53
    :cond_1
    invoke-virtual {p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenDataReadyPayload;->getPageId()Ljava/lang/String;

    .line 54
    move-result-object v1

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenDataReadyPayload;->getRouteKey()Ljava/lang/String;

    .line 58
    move-result-object v2

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1, v2}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->n(Ljava/lang/String;Ljava/lang/String;)Z

    .line 62
    move-result v1

    .line 63
    .line 64
    if-nez v1, :cond_2

    .line 65
    .line 66
    sget-object p1, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;->Companion:Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;

    .line 67
    .line 68
    const-string v0, "page_binding_mismatch"

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v0}, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;->rejected(Ljava/lang/String;)Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;

    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    .line 75
    :cond_2
    iget-object v1, p0, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler;->registry:Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryAccess;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenDataReadyPayload;->getRootTag()I

    .line 79
    move-result v2

    .line 80
    .line 81
    iget-object v3, p0, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler;->ownerToken:Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenDataReadyPayload;->getCacheHit()Ljava/lang/Boolean;

    .line 85
    move-result-object p1

    .line 86
    .line 87
    .line 88
    invoke-interface {v1, v2, v3, v0, p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryAccess;->recordDataReady(ILjava/lang/Object;Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;Ljava/lang/Boolean;)Z

    .line 89
    move-result p1

    .line 90
    .line 91
    if-nez p1, :cond_3

    .line 92
    .line 93
    sget-object p1, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;->Companion:Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;

    .line 94
    .line 95
    const-string v0, "trace_not_accepted"

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v0}, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;->rejected(Ljava/lang/String;)Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;

    .line 99
    move-result-object p1

    .line 100
    return-object p1

    .line 101
    .line 102
    :cond_3
    sget-object p1, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;->Companion:Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;

    .line 103
    const/4 v0, 0x1

    .line 104
    const/4 v1, 0x0

    .line 105
    .line 106
    .line 107
    invoke-static {p1, v1, v0, v1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;->accepted$default(Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;Ljava/lang/String;ILjava/lang/Object;)Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;

    .line 108
    move-result-object p1

    .line 109
    return-object p1
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
.end method

.method private final handleContainerEntryFinish(Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;)Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;
    .locals 11

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler;->registry:Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryAccess;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;->getRootTag()I

    .line 6
    move-result v1

    .line 7
    .line 8
    iget-object v2, p0, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler;->ownerToken:Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1, v2}, Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryAccess;->find(ILjava/lang/Object;)Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;

    .line 12
    move-result-object v6

    .line 13
    .line 14
    if-nez v6, :cond_0

    .line 15
    .line 16
    sget-object p1, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;->Companion:Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;

    .line 17
    .line 18
    const-string v0, "root_tag_not_found"

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;->rejected(Ljava/lang/String;)Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;

    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {v6}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->i()Lcom/kubi/sdk/performance/pageopen/k;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/kubi/sdk/performance/pageopen/k;->c()Ljava/lang/String;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;->getPageTraceId()Ljava/lang/String;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    move-result v0

    .line 40
    .line 41
    if-nez v0, :cond_1

    .line 42
    .line 43
    sget-object p1, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;->Companion:Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;

    .line 44
    .line 45
    const-string v0, "page_trace_id_mismatch"

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v0}, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;->rejected(Ljava/lang/String;)Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;

    .line 49
    move-result-object p1

    .line 50
    return-object p1

    .line 51
    .line 52
    .line 53
    :cond_1
    invoke-virtual {p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;->getPageId()Ljava/lang/String;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;->getRouteKey()Ljava/lang/String;

    .line 58
    move-result-object v1

    .line 59
    .line 60
    .line 61
    invoke-virtual {v6, v0, v1}, Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;->n(Ljava/lang/String;Ljava/lang/String;)Z

    .line 62
    move-result v0

    .line 63
    .line 64
    if-nez v0, :cond_2

    .line 65
    .line 66
    sget-object p1, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;->Companion:Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;

    .line 67
    .line 68
    const-string v0, "page_binding_mismatch"

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v0}, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;->rejected(Ljava/lang/String;)Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;

    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    .line 75
    :cond_2
    iget-object v3, p0, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler;->registry:Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryAccess;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;->getRootTag()I

    .line 79
    move-result v4

    .line 80
    .line 81
    iget-object v5, p0, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler;->ownerToken:Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;->getResult()Lcom/kubi/sdk/performance/pageopen/PageOpenResult;

    .line 85
    move-result-object v7

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;->getCacheHit()Ljava/lang/Boolean;

    .line 89
    move-result-object v8

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;->getPhaseTimings()Lcom/kubi/sdk/performance/pageopen/c;

    .line 93
    move-result-object v9

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;->getStages()Ljava/util/List;

    .line 97
    move-result-object v10

    .line 98
    .line 99
    .line 100
    invoke-interface/range {v3 .. v10}, Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryAccess;->finishContainerEntry(ILjava/lang/Object;Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;Lcom/kubi/sdk/performance/pageopen/PageOpenResult;Ljava/lang/Boolean;Lcom/kubi/sdk/performance/pageopen/c;Ljava/util/List;)Z

    .line 101
    move-result p1

    .line 102
    .line 103
    if-nez p1, :cond_3

    .line 104
    .line 105
    sget-object p1, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;->Companion:Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;

    .line 106
    .line 107
    const-string v0, "trace_not_accepted"

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, v0}, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;->rejected(Ljava/lang/String;)Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;

    .line 111
    move-result-object p1

    .line 112
    return-object p1

    .line 113
    .line 114
    :cond_3
    sget-object p1, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;->Companion:Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;

    .line 115
    const/4 v0, 0x1

    .line 116
    const/4 v1, 0x0

    .line 117
    .line 118
    .line 119
    invoke-static {p1, v1, v0, v1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;->accepted$default(Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;Ljava/lang/String;ILjava/lang/Object;)Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;

    .line 120
    move-result-object p1

    .line 121
    return-object p1
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
.end method

.method private final handleInBundleNavigationFinish(Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;)Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;
    .locals 16

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    iget-object v0, v1, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler;->registry:Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryAccess;

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;->getRootTag()I

    .line 8
    move-result v2

    .line 9
    .line 10
    iget-object v3, v1, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler;->ownerToken:Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v2, v3}, Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryAccess;->isContainerActive(ILjava/lang/Object;)Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    sget-object v0, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;->Companion:Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;

    .line 19
    .line 20
    const-string v2, "root_tag_not_found"

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v2}, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;->rejected(Ljava/lang/String;)Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;

    .line 24
    move-result-object v0

    .line 25
    return-object v0

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;->getPageTraceId()Ljava/lang/String;

    .line 29
    move-result-object v3

    .line 30
    .line 31
    iget-object v0, v1, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler;->registry:Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryAccess;

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, v3}, Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryAccess;->tryMarkExternalCompleted(Ljava/lang/String;)Z

    .line 35
    move-result v0

    .line 36
    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    sget-object v0, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;->Companion:Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;

    .line 40
    .line 41
    const-string v2, "duplicate_terminal"

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v2}, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;->rejected(Ljava/lang/String;)Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;

    .line 45
    move-result-object v0

    .line 46
    return-object v0

    .line 47
    .line 48
    .line 49
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;->getTtfdMs()Ljava/lang/Long;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    if-eqz v0, :cond_6

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 56
    move-result-wide v9

    .line 57
    .line 58
    new-instance v2, Lcom/kubi/sdk/performance/pageopen/d;

    .line 59
    .line 60
    .line 61
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;->getPageId()Ljava/lang/String;

    .line 62
    move-result-object v4

    .line 63
    .line 64
    sget-object v5, Lcom/kubi/sdk/performance/pageopen/PageOpenMode;->IN_BUNDLE_NAVIGATION:Lcom/kubi/sdk/performance/pageopen/PageOpenMode;

    .line 65
    .line 66
    .line 67
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;->getSource()Ljava/lang/String;

    .line 68
    move-result-object v0

    .line 69
    .line 70
    if-nez v0, :cond_2

    .line 71
    .line 72
    const-string v0, "rn_navigation"

    .line 73
    :cond_2
    move-object v6, v0

    .line 74
    .line 75
    .line 76
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;->getResult()Lcom/kubi/sdk/performance/pageopen/PageOpenResult;

    .line 77
    move-result-object v7

    .line 78
    .line 79
    .line 80
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;->getTtidMs()Ljava/lang/Long;

    .line 81
    move-result-object v8

    .line 82
    .line 83
    .line 84
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;->getResult()Lcom/kubi/sdk/performance/pageopen/PageOpenResult;

    .line 85
    move-result-object v0

    .line 86
    .line 87
    sget-object v11, Lcom/kubi/sdk/performance/pageopen/PageOpenResult;->SUCCESS:Lcom/kubi/sdk/performance/pageopen/PageOpenResult;

    .line 88
    const/4 v12, 0x0

    .line 89
    .line 90
    if-ne v0, v11, :cond_3

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;->getPhaseTimings()Lcom/kubi/sdk/performance/pageopen/c;

    .line 94
    move-result-object v0

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Lcom/kubi/sdk/performance/pageopen/c;->a()Ljava/lang/Long;

    .line 98
    move-result-object v0

    .line 99
    goto :goto_0

    .line 100
    :cond_3
    move-object v0, v12

    .line 101
    .line 102
    .line 103
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;->getResult()Lcom/kubi/sdk/performance/pageopen/PageOpenResult;

    .line 104
    move-result-object v13

    .line 105
    .line 106
    if-ne v13, v11, :cond_4

    .line 107
    .line 108
    .line 109
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;->getPhaseTimings()Lcom/kubi/sdk/performance/pageopen/c;

    .line 110
    move-result-object v11

    .line 111
    .line 112
    .line 113
    invoke-virtual {v11}, Lcom/kubi/sdk/performance/pageopen/c;->b()Ljava/lang/Long;

    .line 114
    move-result-object v11

    .line 115
    goto :goto_1

    .line 116
    :cond_4
    move-object v11, v12

    .line 117
    .line 118
    .line 119
    :goto_1
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;->getCacheHit()Ljava/lang/Boolean;

    .line 120
    move-result-object v13

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;->getStages()Ljava/util/List;

    .line 124
    move-result-object v14

    .line 125
    const/4 v15, 0x1

    .line 126
    move-object v12, v11

    .line 127
    move-object v11, v0

    .line 128
    .line 129
    .line 130
    invoke-direct/range {v2 .. v15}, Lcom/kubi/sdk/performance/pageopen/d;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/sdk/performance/pageopen/PageOpenMode;Ljava/lang/String;Lcom/kubi/sdk/performance/pageopen/PageOpenResult;Ljava/lang/Long;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/List;Z)V

    .line 131
    .line 132
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 133
    .line 134
    iget-object v0, v1, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler;->reportSink:Lcom/kubi/sdk/performance/pageopen/e;

    .line 135
    .line 136
    .line 137
    invoke-interface {v0, v2}, Lcom/kubi/sdk/performance/pageopen/e;->a(Lcom/kubi/sdk/performance/pageopen/d;)V

    .line 138
    .line 139
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 140
    .line 141
    .line 142
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 144
    goto :goto_2

    .line 145
    :catchall_0
    move-exception v0

    .line 146
    .line 147
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 148
    .line 149
    .line 150
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 151
    move-result-object v0

    .line 152
    .line 153
    .line 154
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    move-result-object v0

    .line 156
    .line 157
    .line 158
    :goto_2
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 159
    move-result-object v0

    .line 160
    .line 161
    if-eqz v0, :cond_5

    .line 162
    .line 163
    const-string v0, "KrnPageOpenHandler"

    .line 164
    .line 165
    const-string v2, "PageOpen in-bundle report failed"

    .line 166
    .line 167
    .line 168
    invoke-static {v0, v2}, Lro/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    .line 170
    :cond_5
    sget-object v0, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;->Companion:Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;

    .line 171
    const/4 v2, 0x1

    .line 172
    const/4 v3, 0x0

    .line 173
    .line 174
    .line 175
    invoke-static {v0, v3, v2, v3}, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;->accepted$default(Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;Ljava/lang/String;ILjava/lang/Object;)Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;

    .line 176
    move-result-object v0

    .line 177
    return-object v0

    .line 178
    .line 179
    :cond_6
    sget-object v0, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;->Companion:Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;

    .line 180
    .line 181
    const-string v2, "missing_navigation_timings"

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0, v2}, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;->rejected(Ljava/lang/String;)Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;

    .line 185
    move-result-object v0

    .line 186
    return-object v0
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
.end method

.method private final handleParsedPayload(Lcom/kubi/rn/core/pageopen/KrnPageOpenPayloadParseResult;)Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;
    .locals 2

    .line 1
    .line 2
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenPayloadParseResult;->getPayload()Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgePayload;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    sget-object v0, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;->Companion:Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenPayloadParseResult;->getErrorCode()Ljava/lang/String;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    const-string p1, "invalid_payload"

    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    goto :goto_2

    .line 22
    .line 23
    .line 24
    :cond_0
    :goto_0
    invoke-virtual {v0, p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;->rejected(Ljava/lang/String;)Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;

    .line 25
    move-result-object p1

    .line 26
    goto :goto_1

    .line 27
    .line 28
    :cond_1
    instance-of p1, v0, Lcom/kubi/rn/core/pageopen/KrnPageOpenBindPayload;

    .line 29
    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    check-cast v0, Lcom/kubi/rn/core/pageopen/KrnPageOpenBindPayload;

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v0}, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler;->handleBind(Lcom/kubi/rn/core/pageopen/KrnPageOpenBindPayload;)Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;

    .line 36
    move-result-object p1

    .line 37
    goto :goto_1

    .line 38
    .line 39
    :cond_2
    instance-of p1, v0, Lcom/kubi/rn/core/pageopen/KrnPageOpenDataReadyPayload;

    .line 40
    .line 41
    if-eqz p1, :cond_3

    .line 42
    .line 43
    check-cast v0, Lcom/kubi/rn/core/pageopen/KrnPageOpenDataReadyPayload;

    .line 44
    .line 45
    .line 46
    invoke-direct {p0, v0}, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler;->handleContainerDataReady(Lcom/kubi/rn/core/pageopen/KrnPageOpenDataReadyPayload;)Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;

    .line 47
    move-result-object p1

    .line 48
    goto :goto_1

    .line 49
    .line 50
    :cond_3
    instance-of p1, v0, Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;

    .line 51
    .line 52
    if-eqz p1, :cond_6

    .line 53
    move-object p1, v0

    .line 54
    .line 55
    check-cast p1, Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;->getOpenMode()Lcom/kubi/sdk/performance/pageopen/PageOpenMode;

    .line 59
    move-result-object p1

    .line 60
    .line 61
    sget-object v1, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 65
    move-result p1

    .line 66
    .line 67
    aget p1, v1, p1

    .line 68
    const/4 v1, 0x1

    .line 69
    .line 70
    if-eq p1, v1, :cond_5

    .line 71
    const/4 v1, 0x2

    .line 72
    .line 73
    if-ne p1, v1, :cond_4

    .line 74
    .line 75
    check-cast v0, Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;

    .line 76
    .line 77
    .line 78
    invoke-direct {p0, v0}, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler;->handleInBundleNavigationFinish(Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;)Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;

    .line 79
    move-result-object p1

    .line 80
    goto :goto_1

    .line 81
    .line 82
    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 83
    .line 84
    .line 85
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 86
    throw p1

    .line 87
    .line 88
    :cond_5
    check-cast v0, Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;

    .line 89
    .line 90
    .line 91
    invoke-direct {p0, v0}, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler;->handleContainerEntryFinish(Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;)Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;

    .line 92
    move-result-object p1

    .line 93
    .line 94
    .line 95
    :goto_1
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    move-result-object p1

    .line 97
    goto :goto_3

    .line 98
    .line 99
    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 100
    .line 101
    .line 102
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 103
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    .line 105
    :goto_2
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 106
    .line 107
    .line 108
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 109
    move-result-object p1

    .line 110
    .line 111
    .line 112
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    move-result-object p1

    .line 114
    .line 115
    .line 116
    :goto_3
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 117
    move-result-object v0

    .line 118
    .line 119
    if-eqz v0, :cond_7

    .line 120
    .line 121
    const-string v0, "KrnPageOpenHandler"

    .line 122
    .line 123
    const-string v1, "PageOpen payload handling failed"

    .line 124
    .line 125
    .line 126
    invoke-static {v0, v1}, Lro/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    :cond_7
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 130
    move-result-object v0

    .line 131
    .line 132
    if-nez v0, :cond_8

    .line 133
    goto :goto_4

    .line 134
    .line 135
    :cond_8
    sget-object p1, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;->Companion:Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;

    .line 136
    .line 137
    const-string v0, "internal_error"

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1, v0}, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;->rejected(Ljava/lang/String;)Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;

    .line 141
    move-result-object p1

    .line 142
    .line 143
    :goto_4
    check-cast p1, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;

    .line 144
    return-object p1
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
.end method


# virtual methods
.method public handle(Lcom/facebook/react/bridge/ReadableMap;)Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;
    .locals 1
    .param p1    # Lcom/facebook/react/bridge/ReadableMap;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgePayloadParser;->INSTANCE:Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgePayloadParser;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgePayloadParser;->parse(Lcom/facebook/react/bridge/ReadableMap;)Lcom/kubi/rn/core/pageopen/KrnPageOpenPayloadParseResult;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler;->handleParsedPayload(Lcom/kubi/rn/core/pageopen/KrnPageOpenPayloadParseResult;)Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;

    .line 10
    move-result-object p1

    .line 11
    return-object p1
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
    .line 46
    .line 47
    .line 48
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
.end method

.method public final handle$BReactNativeLib_googleRelease(Ljava/util/Map;)Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;
    .locals 1
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "values"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgePayloadParser;->INSTANCE:Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgePayloadParser;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgePayloadParser;->parse$BReactNativeLib_googleRelease(Ljava/util/Map;)Lcom/kubi/rn/core/pageopen/KrnPageOpenPayloadParseResult;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, p1}, Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler;->handleParsedPayload(Lcom/kubi/rn/core/pageopen/KrnPageOpenPayloadParseResult;)Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;

    .line 15
    move-result-object p1

    .line 16
    return-object p1
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
    .line 46
    .line 47
    .line 48
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
.end method
