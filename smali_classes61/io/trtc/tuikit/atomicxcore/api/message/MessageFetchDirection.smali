.class public final enum Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;",
        "",
        "value",
        "",
        "(Ljava/lang/String;II)V",
        "getValue",
        "()I",
        "OLDER",
        "NEWER",
        "BOTH",
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


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;

.field public static final enum BOTH:Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;

.field public static final enum NEWER:Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;

.field public static final enum OLDER:Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;


# instance fields
.field private final value:I


# direct methods
.method private static final synthetic $values()[Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;->OLDER:Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;

    .line 3
    .line 4
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;->NEWER:Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;

    .line 5
    .line 6
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;->BOTH:Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;

    .line 7
    .line 8
    .line 9
    filled-new-array {v0, v1, v2}, [Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
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
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;

    .line 3
    .line 4
    const-string v1, "OLDER"

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3}, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;-><init>(Ljava/lang/String;II)V

    .line 10
    .line 11
    sput-object v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;->OLDER:Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;

    .line 12
    .line 13
    new-instance v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;

    .line 14
    .line 15
    const-string v1, "NEWER"

    .line 16
    const/4 v2, 0x2

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v1, v3, v2}, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;-><init>(Ljava/lang/String;II)V

    .line 20
    .line 21
    sput-object v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;->NEWER:Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;

    .line 22
    .line 23
    new-instance v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;

    .line 24
    .line 25
    const-string v1, "BOTH"

    .line 26
    const/4 v3, 0x3

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1, v2, v3}, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;-><init>(Ljava/lang/String;II)V

    .line 30
    .line 31
    sput-object v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;->BOTH:Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;

    .line 32
    .line 33
    .line 34
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;->$values()[Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    sput-object v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;->$VALUES:[Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    sput-object v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 44
    return-void
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
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 4
    .line 5
    iput p3, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;->value:I

    .line 6
    return-void
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
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 3
    return-object v0
    .line 4
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
    .line 19
    .line 20
    .line 21
.end method

.method public static valueOf(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;

    .line 9
    return-object p0
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
.end method

.method public static values()[Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;->$VALUES:[Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;

    .line 9
    return-object v0
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
.end method


# virtual methods
.method public final getValue()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;->value:I

    .line 3
    return v0
    .line 4
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
    .line 19
    .line 20
    .line 21
.end method
