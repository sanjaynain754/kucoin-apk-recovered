.class public final enum Lkotlin/reflect/jvm/internal/impl/km/MemberKind;
.super Ljava/lang/Enum;
.source "Modifiers.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lkotlin/reflect/jvm/internal/impl/km/MemberKind;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lkotlin/reflect/jvm/internal/impl/km/MemberKind;

.field public static final enum DECLARATION:Lkotlin/reflect/jvm/internal/impl/km/MemberKind;

.field public static final enum DELEGATION:Lkotlin/reflect/jvm/internal/impl/km/MemberKind;

.field public static final enum FAKE_OVERRIDE:Lkotlin/reflect/jvm/internal/impl/km/MemberKind;

.field public static final enum SYNTHESIZED:Lkotlin/reflect/jvm/internal/impl/km/MemberKind;


# instance fields
.field private final flag:Lkotlin/reflect/jvm/internal/impl/km/internal/FlagImpl;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lkotlin/reflect/jvm/internal/impl/km/MemberKind;
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/km/MemberKind;->DECLARATION:Lkotlin/reflect/jvm/internal/impl/km/MemberKind;

    .line 3
    .line 4
    sget-object v1, Lkotlin/reflect/jvm/internal/impl/km/MemberKind;->FAKE_OVERRIDE:Lkotlin/reflect/jvm/internal/impl/km/MemberKind;

    .line 5
    .line 6
    sget-object v2, Lkotlin/reflect/jvm/internal/impl/km/MemberKind;->DELEGATION:Lkotlin/reflect/jvm/internal/impl/km/MemberKind;

    .line 7
    .line 8
    sget-object v3, Lkotlin/reflect/jvm/internal/impl/km/MemberKind;->SYNTHESIZED:Lkotlin/reflect/jvm/internal/impl/km/MemberKind;

    .line 9
    .line 10
    .line 11
    filled-new-array {v0, v1, v2, v3}, [Lkotlin/reflect/jvm/internal/impl/km/MemberKind;

    .line 12
    move-result-object v0

    .line 13
    return-object v0
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
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/km/MemberKind;

    .line 3
    .line 4
    const-string v1, "DECLARATION"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v2}, Lkotlin/reflect/jvm/internal/impl/km/MemberKind;-><init>(Ljava/lang/String;II)V

    .line 9
    .line 10
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/km/MemberKind;->DECLARATION:Lkotlin/reflect/jvm/internal/impl/km/MemberKind;

    .line 11
    .line 12
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/km/MemberKind;

    .line 13
    .line 14
    const-string v1, "FAKE_OVERRIDE"

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2, v2}, Lkotlin/reflect/jvm/internal/impl/km/MemberKind;-><init>(Ljava/lang/String;II)V

    .line 19
    .line 20
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/km/MemberKind;->FAKE_OVERRIDE:Lkotlin/reflect/jvm/internal/impl/km/MemberKind;

    .line 21
    .line 22
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/km/MemberKind;

    .line 23
    .line 24
    const-string v1, "DELEGATION"

    .line 25
    const/4 v2, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, v2, v2}, Lkotlin/reflect/jvm/internal/impl/km/MemberKind;-><init>(Ljava/lang/String;II)V

    .line 29
    .line 30
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/km/MemberKind;->DELEGATION:Lkotlin/reflect/jvm/internal/impl/km/MemberKind;

    .line 31
    .line 32
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/km/MemberKind;

    .line 33
    .line 34
    const-string v1, "SYNTHESIZED"

    .line 35
    const/4 v2, 0x3

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1, v2, v2}, Lkotlin/reflect/jvm/internal/impl/km/MemberKind;-><init>(Ljava/lang/String;II)V

    .line 39
    .line 40
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/km/MemberKind;->SYNTHESIZED:Lkotlin/reflect/jvm/internal/impl/km/MemberKind;

    .line 41
    .line 42
    .line 43
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/km/MemberKind;->$values()[Lkotlin/reflect/jvm/internal/impl/km/MemberKind;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/km/MemberKind;->$VALUES:[Lkotlin/reflect/jvm/internal/impl/km/MemberKind;

    .line 47
    .line 48
    .line 49
    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/km/MemberKind;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 53
    return-void
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
    .locals 1
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
    new-instance p1, Lkotlin/reflect/jvm/internal/impl/km/internal/FlagImpl;

    .line 6
    .line 7
    sget-object p2, Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags;->MEMBER_KIND:Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$FlagField;

    .line 8
    .line 9
    const-string v0, "MEMBER_KIND"

    .line 10
    .line 11
    .line 12
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p1, p2, p3}, Lkotlin/reflect/jvm/internal/impl/km/internal/FlagImpl;-><init>(Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$FlagField;I)V

    .line 16
    .line 17
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/km/MemberKind;->flag:Lkotlin/reflect/jvm/internal/impl/km/internal/FlagImpl;

    .line 18
    return-void
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
            "Lkotlin/reflect/jvm/internal/impl/km/MemberKind;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/km/MemberKind;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

.method public static valueOf(Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/km/MemberKind;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lkotlin/reflect/jvm/internal/impl/km/MemberKind;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lkotlin/reflect/jvm/internal/impl/km/MemberKind;

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

.method public static values()[Lkotlin/reflect/jvm/internal/impl/km/MemberKind;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/km/MemberKind;->$VALUES:[Lkotlin/reflect/jvm/internal/impl/km/MemberKind;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lkotlin/reflect/jvm/internal/impl/km/MemberKind;

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
.method public final getFlag$kotlin_metadata()Lkotlin/reflect/jvm/internal/impl/km/internal/FlagImpl;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/km/MemberKind;->flag:Lkotlin/reflect/jvm/internal/impl/km/internal/FlagImpl;

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
