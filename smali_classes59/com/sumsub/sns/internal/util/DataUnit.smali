.class public enum Lcom/sumsub/sns/internal/util/DataUnit;
.super Ljava/lang/Enum;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sumsub/sns/internal/util/DataUnit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000b\n\u0002\u0010\t\n\u0002\u0008\u0002\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/util/DataUnit;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "KILOBYTES",
        "MEGABYTES",
        "GIGABYTES",
        "TERABYTES",
        "KIBIBYTES",
        "MEBIBYTES",
        "GIBIBYTES",
        "TEBIBYTES",
        "toBytes",
        "",
        "v",
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

.field private static final synthetic $VALUES:[Lcom/sumsub/sns/internal/util/DataUnit;

.field public static final enum GIBIBYTES:Lcom/sumsub/sns/internal/util/DataUnit;

.field public static final enum GIGABYTES:Lcom/sumsub/sns/internal/util/DataUnit;

.field public static final enum KIBIBYTES:Lcom/sumsub/sns/internal/util/DataUnit;

.field public static final enum KILOBYTES:Lcom/sumsub/sns/internal/util/DataUnit;

.field public static final enum MEBIBYTES:Lcom/sumsub/sns/internal/util/DataUnit;

.field public static final enum MEGABYTES:Lcom/sumsub/sns/internal/util/DataUnit;

.field public static final enum TEBIBYTES:Lcom/sumsub/sns/internal/util/DataUnit;

.field public static final enum TERABYTES:Lcom/sumsub/sns/internal/util/DataUnit;


# direct methods
.method private static final synthetic $values()[Lcom/sumsub/sns/internal/util/DataUnit;
    .locals 8

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/util/DataUnit;->KILOBYTES:Lcom/sumsub/sns/internal/util/DataUnit;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/util/DataUnit;->MEGABYTES:Lcom/sumsub/sns/internal/util/DataUnit;

    .line 5
    .line 6
    sget-object v2, Lcom/sumsub/sns/internal/util/DataUnit;->GIGABYTES:Lcom/sumsub/sns/internal/util/DataUnit;

    .line 7
    .line 8
    sget-object v3, Lcom/sumsub/sns/internal/util/DataUnit;->TERABYTES:Lcom/sumsub/sns/internal/util/DataUnit;

    .line 9
    .line 10
    sget-object v4, Lcom/sumsub/sns/internal/util/DataUnit;->KIBIBYTES:Lcom/sumsub/sns/internal/util/DataUnit;

    .line 11
    .line 12
    sget-object v5, Lcom/sumsub/sns/internal/util/DataUnit;->MEBIBYTES:Lcom/sumsub/sns/internal/util/DataUnit;

    .line 13
    .line 14
    sget-object v6, Lcom/sumsub/sns/internal/util/DataUnit;->GIBIBYTES:Lcom/sumsub/sns/internal/util/DataUnit;

    .line 15
    .line 16
    sget-object v7, Lcom/sumsub/sns/internal/util/DataUnit;->TEBIBYTES:Lcom/sumsub/sns/internal/util/DataUnit;

    .line 17
    .line 18
    .line 19
    filled-new-array/range {v0 .. v7}, [Lcom/sumsub/sns/internal/util/DataUnit;

    .line 20
    move-result-object v0

    .line 21
    return-object v0
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
.end method

.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/util/d;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/util/d;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/util/DataUnit;->KILOBYTES:Lcom/sumsub/sns/internal/util/DataUnit;

    .line 8
    .line 9
    new-instance v0, Lcom/sumsub/sns/internal/util/f;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/sumsub/sns/internal/util/f;-><init>()V

    .line 13
    .line 14
    sput-object v0, Lcom/sumsub/sns/internal/util/DataUnit;->MEGABYTES:Lcom/sumsub/sns/internal/util/DataUnit;

    .line 15
    .line 16
    new-instance v0, Lcom/sumsub/sns/internal/util/b;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0}, Lcom/sumsub/sns/internal/util/b;-><init>()V

    .line 20
    .line 21
    sput-object v0, Lcom/sumsub/sns/internal/util/DataUnit;->GIGABYTES:Lcom/sumsub/sns/internal/util/DataUnit;

    .line 22
    .line 23
    new-instance v0, Lcom/sumsub/sns/internal/util/h;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0}, Lcom/sumsub/sns/internal/util/h;-><init>()V

    .line 27
    .line 28
    sput-object v0, Lcom/sumsub/sns/internal/util/DataUnit;->TERABYTES:Lcom/sumsub/sns/internal/util/DataUnit;

    .line 29
    .line 30
    new-instance v0, Lcom/sumsub/sns/internal/util/c;

    .line 31
    .line 32
    .line 33
    invoke-direct {v0}, Lcom/sumsub/sns/internal/util/c;-><init>()V

    .line 34
    .line 35
    sput-object v0, Lcom/sumsub/sns/internal/util/DataUnit;->KIBIBYTES:Lcom/sumsub/sns/internal/util/DataUnit;

    .line 36
    .line 37
    new-instance v0, Lcom/sumsub/sns/internal/util/e;

    .line 38
    .line 39
    .line 40
    invoke-direct {v0}, Lcom/sumsub/sns/internal/util/e;-><init>()V

    .line 41
    .line 42
    sput-object v0, Lcom/sumsub/sns/internal/util/DataUnit;->MEBIBYTES:Lcom/sumsub/sns/internal/util/DataUnit;

    .line 43
    .line 44
    new-instance v0, Lcom/sumsub/sns/internal/util/a;

    .line 45
    .line 46
    .line 47
    invoke-direct {v0}, Lcom/sumsub/sns/internal/util/a;-><init>()V

    .line 48
    .line 49
    sput-object v0, Lcom/sumsub/sns/internal/util/DataUnit;->GIBIBYTES:Lcom/sumsub/sns/internal/util/DataUnit;

    .line 50
    .line 51
    new-instance v0, Lcom/sumsub/sns/internal/util/g;

    .line 52
    .line 53
    .line 54
    invoke-direct {v0}, Lcom/sumsub/sns/internal/util/g;-><init>()V

    .line 55
    .line 56
    sput-object v0, Lcom/sumsub/sns/internal/util/DataUnit;->TEBIBYTES:Lcom/sumsub/sns/internal/util/DataUnit;

    .line 57
    .line 58
    .line 59
    invoke-static {}, Lcom/sumsub/sns/internal/util/DataUnit;->$values()[Lcom/sumsub/sns/internal/util/DataUnit;

    .line 60
    move-result-object v0

    .line 61
    .line 62
    sput-object v0, Lcom/sumsub/sns/internal/util/DataUnit;->$VALUES:[Lcom/sumsub/sns/internal/util/DataUnit;

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 66
    move-result-object v0

    .line 67
    .line 68
    sput-object v0, Lcom/sumsub/sns/internal/util/DataUnit;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 69
    return-void
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

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/sumsub/sns/internal/util/DataUnit;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/sumsub/sns/internal/util/DataUnit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/util/DataUnit;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

.method public static valueOf(Ljava/lang/String;)Lcom/sumsub/sns/internal/util/DataUnit;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/util/DataUnit;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sns/internal/util/DataUnit;

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

.method public static values()[Lcom/sumsub/sns/internal/util/DataUnit;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/util/DataUnit;->$VALUES:[Lcom/sumsub/sns/internal/util/DataUnit;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/sumsub/sns/internal/util/DataUnit;

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
.method public toBytes(J)J
    .locals 0

    .line 1
    .line 2
    new-instance p1, Ljava/lang/AbstractMethodError;

    .line 3
    .line 4
    .line 5
    invoke-direct {p1}, Ljava/lang/AbstractMethodError;-><init>()V

    .line 6
    throw p1
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
.end method
