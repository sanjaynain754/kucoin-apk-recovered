.class public final enum Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;
.super Ljava/lang/Enum;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000e\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;",
        "",
        "value",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getValue",
        "()Ljava/lang/String;",
        "Unknown",
        "ModuleNotFound",
        "ModuleMisconfigured",
        "HardwareUnavailable",
        "OsVersionUnsupported",
        "UserSkipped",
        "UserCanceled",
        "AccessDataMissing",
        "AccessDataRejected",
        "idensic-mobile-sdk-aar_defaultRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

.field public static final enum AccessDataMissing:Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

.field public static final enum AccessDataRejected:Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

.field public static final enum HardwareUnavailable:Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

.field public static final enum ModuleMisconfigured:Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

.field public static final enum ModuleNotFound:Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

.field public static final enum OsVersionUnsupported:Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

.field public static final enum Unknown:Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

.field public static final enum UserCanceled:Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

.field public static final enum UserSkipped:Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;


# instance fields
.field private final value:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;
    .locals 9

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;->Unknown:Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;->ModuleNotFound:Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 5
    .line 6
    sget-object v2, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;->ModuleMisconfigured:Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 7
    .line 8
    sget-object v3, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;->HardwareUnavailable:Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 9
    .line 10
    sget-object v4, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;->OsVersionUnsupported:Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 11
    .line 12
    sget-object v5, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;->UserSkipped:Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 13
    .line 14
    sget-object v6, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;->UserCanceled:Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 15
    .line 16
    sget-object v7, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;->AccessDataMissing:Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 17
    .line 18
    sget-object v8, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;->AccessDataRejected:Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 19
    .line 20
    .line 21
    filled-new-array/range {v0 .. v8}, [Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 22
    move-result-object v0

    .line 23
    return-object v0
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
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    const-string/jumbo v2, "unknown"

    .line 7
    .line 8
    const-string v3, "Unknown"

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v3, v1, v2}, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 12
    .line 13
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;->Unknown:Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 14
    .line 15
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 16
    const/4 v1, 0x1

    .line 17
    .line 18
    .line 19
    const-string/jumbo v2, "moduleNotFound"

    .line 20
    .line 21
    const-string v3, "ModuleNotFound"

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v3, v1, v2}, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 25
    .line 26
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;->ModuleNotFound:Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 27
    .line 28
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 29
    const/4 v1, 0x2

    .line 30
    .line 31
    .line 32
    const-string/jumbo v2, "moduleMisconfigured"

    .line 33
    .line 34
    const-string v3, "ModuleMisconfigured"

    .line 35
    .line 36
    .line 37
    invoke-direct {v0, v3, v1, v2}, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 38
    .line 39
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;->ModuleMisconfigured:Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 40
    .line 41
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 42
    const/4 v1, 0x3

    .line 43
    .line 44
    const-string v2, "hardwareUnavailable"

    .line 45
    .line 46
    const-string v3, "HardwareUnavailable"

    .line 47
    .line 48
    .line 49
    invoke-direct {v0, v3, v1, v2}, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 50
    .line 51
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;->HardwareUnavailable:Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 52
    .line 53
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 54
    const/4 v1, 0x4

    .line 55
    .line 56
    .line 57
    const-string/jumbo v2, "osVersionUnsupported"

    .line 58
    .line 59
    const-string v3, "OsVersionUnsupported"

    .line 60
    .line 61
    .line 62
    invoke-direct {v0, v3, v1, v2}, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 63
    .line 64
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;->OsVersionUnsupported:Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 65
    .line 66
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 67
    const/4 v1, 0x5

    .line 68
    .line 69
    .line 70
    const-string/jumbo v2, "userSkipped"

    .line 71
    .line 72
    const-string v3, "UserSkipped"

    .line 73
    .line 74
    .line 75
    invoke-direct {v0, v3, v1, v2}, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 76
    .line 77
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;->UserSkipped:Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 78
    .line 79
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 80
    const/4 v1, 0x6

    .line 81
    .line 82
    .line 83
    const-string/jumbo v2, "userCancelled"

    .line 84
    .line 85
    const-string v3, "UserCanceled"

    .line 86
    .line 87
    .line 88
    invoke-direct {v0, v3, v1, v2}, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 89
    .line 90
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;->UserCanceled:Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 91
    .line 92
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 93
    const/4 v1, 0x7

    .line 94
    .line 95
    const-string v2, "accessDataMissing"

    .line 96
    .line 97
    const-string v3, "AccessDataMissing"

    .line 98
    .line 99
    .line 100
    invoke-direct {v0, v3, v1, v2}, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 101
    .line 102
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;->AccessDataMissing:Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 103
    .line 104
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 105
    .line 106
    const/16 v1, 0x8

    .line 107
    .line 108
    const-string v2, "accessDataRejected"

    .line 109
    .line 110
    const-string v3, "AccessDataRejected"

    .line 111
    .line 112
    .line 113
    invoke-direct {v0, v3, v1, v2}, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 114
    .line 115
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;->AccessDataRejected:Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 116
    .line 117
    .line 118
    invoke-static {}, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;->$values()[Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 119
    move-result-object v0

    .line 120
    .line 121
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;->$VALUES:[Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 122
    .line 123
    .line 124
    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 125
    move-result-object v0

    .line 126
    .line 127
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 128
    return-void
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
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 4
    .line 5
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;->value:Ljava/lang/String;

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
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;->$ENTRIES:Lkotlin/enums/EnumEntries;

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
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

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
.end method

.method public static values()[Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;->$VALUES:[Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

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
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;->value:Ljava/lang/String;

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
.end method
