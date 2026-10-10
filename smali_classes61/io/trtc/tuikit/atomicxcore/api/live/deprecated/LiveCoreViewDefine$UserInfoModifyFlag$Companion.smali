.class public final Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$UserInfoModifyFlag$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$UserInfoModifyFlag;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$UserInfoModifyFlag$Companion;",
        "",
        "()V",
        "fromInt",
        "Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$UserInfoModifyFlag;",
        "value",
        "",
        "(Ljava/lang/Integer;)Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$UserInfoModifyFlag;",
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
        "SMAP\nLiveCoreViewDefineDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveCoreViewDefineDeprecated.kt\nio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$UserInfoModifyFlag$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,271:1\n1282#2,2:272\n*S KotlinDebug\n*F\n+ 1 LiveCoreViewDefineDeprecated.kt\nio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$UserInfoModifyFlag$Companion\n*L\n139#1:272,2\n*E\n"
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
    invoke-direct {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$UserInfoModifyFlag$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromInt(Ljava/lang/Integer;)Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$UserInfoModifyFlag;
    .locals 6
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$UserInfoModifyFlag;->values()[Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$UserInfoModifyFlag;

    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    .line 8
    :goto_0
    if-ge v2, v1, :cond_2

    .line 9
    .line 10
    aget-object v3, v0, v2

    .line 11
    .line 12
    .line 13
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$UserInfoModifyFlag;->getValue()I

    .line 14
    move-result v4

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    goto :goto_1

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 21
    move-result v5

    .line 22
    .line 23
    if-ne v4, v5, :cond_1

    .line 24
    goto :goto_2

    .line 25
    .line 26
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_2
    const/4 v3, 0x0

    .line 29
    .line 30
    :goto_2
    if-nez v3, :cond_3

    .line 31
    .line 32
    sget-object p1, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$UserInfoModifyFlag;->NONE:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$UserInfoModifyFlag;

    .line 33
    return-object p1

    .line 34
    :cond_3
    return-object v3
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
.end method
