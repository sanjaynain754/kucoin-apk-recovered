.class public final Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore$Companion;
.super Ljava/lang/Object;
.source "PIPPanelStore.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0006\u001a\u00020\u0005H\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore$Companion;",
        "",
        "<init>",
        "()V",
        "instance",
        "Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;",
        "sharedInstance",
        "tuilivekit_googleRelease"
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
        "SMAP\nPIPPanelStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PIPPanelStore.kt\ncom/trtc/uikit/livekit/component/pippanel/PIPPanelStore$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n1#2:30\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final sharedInstance()Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;
    .locals 2
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;->a()Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    monitor-enter p0

    .line 8
    .line 9
    .line 10
    :try_start_0
    invoke-static {}, Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;->a()Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;

    .line 16
    const/4 v1, 0x0

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v1}, Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;->b(Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    :goto_0
    monitor-exit p0

    .line 27
    return-object v0

    .line 28
    :goto_1
    monitor-exit p0

    .line 29
    throw v0

    .line 30
    :cond_1
    return-object v0
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
.end method
