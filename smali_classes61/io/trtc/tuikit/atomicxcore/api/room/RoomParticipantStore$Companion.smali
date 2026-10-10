.class public final Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStore$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"
    }
    d2 = {
        "Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStore$Companion;",
        "",
        "()V",
        "create",
        "Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStore;",
        "roomID",
        "",
        "atomicxcore_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRoomParticipantStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomParticipantStore.kt\nio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStore$Companion\n+ 2 RoomStoreFactory.kt\nio/trtc/tuikit/atomicxcore/impl/room/RoomStoreFactory\n+ 3 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,714:1\n28#2,4:715\n32#2:722\n33#2,3:726\n72#3,2:719\n1#4:721\n372#5,3:723\n375#5,4:729\n*S KotlinDebug\n*F\n+ 1 RoomParticipantStore.kt\nio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStore$Companion\n*L\n444#1:715,4\n444#1:722\n444#1:726,3\n444#1:719,2\n444#1:721\n444#1:723,3\n444#1:729,4\n*E\n"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStore$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStore;
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "roomID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/room/p0;->b:Lkotlin/Lazy;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/room/o0;->a()Lio/trtc/tuikit/atomicxcore/impl/room/p0;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    const-class v1, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStore;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    const-class v3, Lio/trtc/tuikit/atomicxcore/api/room/RoomStore;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 23
    move-result-object v3

    .line 24
    .line 25
    .line 26
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    move-result v2

    .line 28
    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->k:Lkotlin/Lazy;

    .line 32
    .line 33
    .line 34
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    check-cast p1, Lio/trtc/tuikit/atomicxcore/impl/room/T0;

    .line 38
    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStore;

    .line 42
    return-object p1

    .line 43
    .line 44
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 45
    .line 46
    const-string v0, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore"

    .line 47
    .line 48
    .line 49
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 50
    throw p1

    .line 51
    .line 52
    :cond_1
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/room/p0;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    move-result-object v2

    .line 57
    .line 58
    if-nez v2, :cond_3

    .line 59
    .line 60
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 61
    .line 62
    .line 63
    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, p1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    move-result-object v0

    .line 68
    .line 69
    if-nez v0, :cond_2

    .line 70
    goto :goto_0

    .line 71
    :cond_2
    move-object v2, v0

    .line 72
    .line 73
    :cond_3
    :goto_0
    check-cast v2, Ljava/util/Map;

    .line 74
    .line 75
    const-string v0, "getName(...)"

    .line 76
    .line 77
    .line 78
    invoke-static {v2, v1, v0}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 79
    move-result-object v0

    .line 80
    .line 81
    .line 82
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    move-result-object v3

    .line 84
    .line 85
    if-nez v3, :cond_5

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 89
    move-result-object v3

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 93
    move-result-object v1

    .line 94
    .line 95
    .line 96
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    move-result v1

    .line 98
    .line 99
    if-eqz v1, :cond_4

    .line 100
    .line 101
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/room/k0;

    .line 102
    .line 103
    .line 104
    invoke-direct {v3, p1}, Lio/trtc/tuikit/atomicxcore/impl/room/k0;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    goto :goto_1

    .line 109
    .line 110
    :cond_4
    new-instance p1, Ljava/lang/Exception;

    .line 111
    .line 112
    .line 113
    const-string/jumbo v0, "type is not supported"

    .line 114
    .line 115
    .line 116
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 117
    throw p1

    .line 118
    .line 119
    :cond_5
    :goto_1
    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStore;

    .line 120
    return-object v3
.end method
