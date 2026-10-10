.class public final synthetic Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$a;
.super Ljava/lang/Object;
.source "AtomicToast.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic $EnumSwitchMapping$0:[I

.field public static final synthetic $EnumSwitchMapping$1:[I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Position;->values()[Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Position;

    .line 4
    move-result-object v0

    .line 5
    array-length v0, v0

    .line 6
    .line 7
    new-array v0, v0, [I

    .line 8
    const/4 v1, 0x1

    .line 9
    .line 10
    :try_start_0
    sget-object v2, Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Position;->TOP:Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Position;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 14
    move-result v2

    .line 15
    .line 16
    aput v1, v0, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    :catch_0
    const/4 v2, 0x2

    .line 18
    .line 19
    :try_start_1
    sget-object v3, Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Position;->CENTER:Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Position;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 23
    move-result v3

    .line 24
    .line 25
    aput v2, v0, v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    .line 26
    :catch_1
    const/4 v3, 0x3

    .line 27
    .line 28
    :try_start_2
    sget-object v4, Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Position;->BOTTOM:Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Position;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 32
    move-result v4

    .line 33
    .line 34
    aput v3, v0, v4
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    .line 35
    .line 36
    :catch_2
    sput-object v0, Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$a;->$EnumSwitchMapping$0:[I

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;->values()[Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;

    .line 40
    move-result-object v0

    .line 41
    array-length v0, v0

    .line 42
    .line 43
    new-array v0, v0, [I

    .line 44
    .line 45
    :try_start_3
    sget-object v4, Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;->INFO:Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 49
    move-result v4

    .line 50
    .line 51
    aput v1, v0, v4
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    .line 52
    .line 53
    :catch_3
    :try_start_4
    sget-object v1, Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;->HELP:Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 57
    move-result v1

    .line 58
    .line 59
    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    .line 60
    .line 61
    :catch_4
    :try_start_5
    sget-object v1, Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;->SUCCESS:Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 65
    move-result v1

    .line 66
    .line 67
    aput v3, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    .line 68
    .line 69
    :catch_5
    :try_start_6
    sget-object v1, Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;->WARNING:Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 73
    move-result v1

    .line 74
    const/4 v2, 0x4

    .line 75
    .line 76
    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    .line 77
    .line 78
    :catch_6
    :try_start_7
    sget-object v1, Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;->ERROR:Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 82
    move-result v1

    .line 83
    const/4 v2, 0x5

    .line 84
    .line 85
    aput v2, v0, v1
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    .line 86
    .line 87
    :catch_7
    :try_start_8
    sget-object v1, Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;->LOADING:Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 91
    move-result v1

    .line 92
    const/4 v2, 0x6

    .line 93
    .line 94
    aput v2, v0, v1
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    .line 95
    .line 96
    :catch_8
    sput-object v0, Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$a;->$EnumSwitchMapping$1:[I

    .line 97
    return-void
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
.end method
