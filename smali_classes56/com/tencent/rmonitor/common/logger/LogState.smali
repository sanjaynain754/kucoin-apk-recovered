.class public final enum Lcom/tencent/rmonitor/common/logger/LogState;
.super Ljava/lang/Enum;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/rmonitor/common/logger/LogState$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/tencent/rmonitor/common/logger/LogState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000b\u0008\u0086\u0001\u0018\u0000 \r2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/tencent/rmonitor/common/logger/LogState;",
        "",
        "value",
        "",
        "(Ljava/lang/String;II)V",
        "getValue",
        "()I",
        "OFF",
        "ERROR",
        "WARN",
        "INFO",
        "DEBUG",
        "VERBOS",
        "Companion",
        "bugly-pro_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/tencent/rmonitor/common/logger/LogState;

.field public static final Companion:Lcom/tencent/rmonitor/common/logger/LogState$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

.field public static final enum ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

.field public static final enum INFO:Lcom/tencent/rmonitor/common/logger/LogState;

.field public static final enum OFF:Lcom/tencent/rmonitor/common/logger/LogState;

.field public static final enum VERBOS:Lcom/tencent/rmonitor/common/logger/LogState;

.field public static final enum WARN:Lcom/tencent/rmonitor/common/logger/LogState;

.field private static final values:[Lcom/tencent/rmonitor/common/logger/LogState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final value:I


# direct methods
.method private static final synthetic $values()[Lcom/tencent/rmonitor/common/logger/LogState;
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->OFF:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 3
    .line 4
    sget-object v1, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 5
    .line 6
    sget-object v2, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 7
    .line 8
    sget-object v3, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 9
    .line 10
    sget-object v4, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 11
    .line 12
    sget-object v5, Lcom/tencent/rmonitor/common/logger/LogState;->VERBOS:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 13
    .line 14
    .line 15
    filled-new-array/range {v0 .. v5}, [Lcom/tencent/rmonitor/common/logger/LogState;

    .line 16
    move-result-object v0

    .line 17
    return-object v0
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
.end method

.method public static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/rmonitor/common/logger/LogState;

    .line 3
    .line 4
    const-string v1, "OFF"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v2}, Lcom/tencent/rmonitor/common/logger/LogState;-><init>(Ljava/lang/String;II)V

    .line 9
    .line 10
    sput-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->OFF:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 11
    .line 12
    new-instance v0, Lcom/tencent/rmonitor/common/logger/LogState;

    .line 13
    .line 14
    const-string v1, "ERROR"

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2, v2}, Lcom/tencent/rmonitor/common/logger/LogState;-><init>(Ljava/lang/String;II)V

    .line 19
    .line 20
    sput-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 21
    .line 22
    new-instance v0, Lcom/tencent/rmonitor/common/logger/LogState;

    .line 23
    .line 24
    const-string v1, "WARN"

    .line 25
    const/4 v2, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, v2, v2}, Lcom/tencent/rmonitor/common/logger/LogState;-><init>(Ljava/lang/String;II)V

    .line 29
    .line 30
    sput-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 31
    .line 32
    new-instance v0, Lcom/tencent/rmonitor/common/logger/LogState;

    .line 33
    .line 34
    const-string v1, "INFO"

    .line 35
    const/4 v2, 0x3

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1, v2, v2}, Lcom/tencent/rmonitor/common/logger/LogState;-><init>(Ljava/lang/String;II)V

    .line 39
    .line 40
    sput-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 41
    .line 42
    new-instance v0, Lcom/tencent/rmonitor/common/logger/LogState;

    .line 43
    .line 44
    const-string v1, "DEBUG"

    .line 45
    const/4 v2, 0x4

    .line 46
    .line 47
    .line 48
    invoke-direct {v0, v1, v2, v2}, Lcom/tencent/rmonitor/common/logger/LogState;-><init>(Ljava/lang/String;II)V

    .line 49
    .line 50
    sput-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 51
    .line 52
    new-instance v0, Lcom/tencent/rmonitor/common/logger/LogState;

    .line 53
    .line 54
    const-string v1, "VERBOS"

    .line 55
    const/4 v2, 0x5

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, v1, v2, v2}, Lcom/tencent/rmonitor/common/logger/LogState;-><init>(Ljava/lang/String;II)V

    .line 59
    .line 60
    sput-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->VERBOS:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 61
    .line 62
    .line 63
    invoke-static {}, Lcom/tencent/rmonitor/common/logger/LogState;->$values()[Lcom/tencent/rmonitor/common/logger/LogState;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    sput-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->$VALUES:[Lcom/tencent/rmonitor/common/logger/LogState;

    .line 67
    .line 68
    new-instance v0, Lcom/tencent/rmonitor/common/logger/LogState$Companion;

    .line 69
    const/4 v1, 0x0

    .line 70
    .line 71
    .line 72
    invoke-direct {v0, v1}, Lcom/tencent/rmonitor/common/logger/LogState$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 73
    .line 74
    sput-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->Companion:Lcom/tencent/rmonitor/common/logger/LogState$Companion;

    .line 75
    .line 76
    .line 77
    invoke-static {}, Lcom/tencent/rmonitor/common/logger/LogState;->values()[Lcom/tencent/rmonitor/common/logger/LogState;

    .line 78
    move-result-object v0

    .line 79
    .line 80
    sput-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->values:[Lcom/tencent/rmonitor/common/logger/LogState;

    .line 81
    return-void
    .line 82
    .line 83
    .line 84
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
    iput p3, p0, Lcom/tencent/rmonitor/common/logger/LogState;->value:I

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
.end method

.method public static final synthetic access$getValues$cp()[Lcom/tencent/rmonitor/common/logger/LogState;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->values:[Lcom/tencent/rmonitor/common/logger/LogState;

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
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/tencent/rmonitor/common/logger/LogState;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/tencent/rmonitor/common/logger/LogState;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/tencent/rmonitor/common/logger/LogState;

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
.end method

.method public static values()[Lcom/tencent/rmonitor/common/logger/LogState;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->$VALUES:[Lcom/tencent/rmonitor/common/logger/LogState;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/tencent/rmonitor/common/logger/LogState;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method


# virtual methods
.method public final getValue()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/rmonitor/common/logger/LogState;->value:I

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
.end method
