.class public final enum Lcom/jumio/sdk/document/JumioDocumentType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jumio/sdk/document/JumioDocumentType$Companion;,
        Lcom/jumio/sdk/document/JumioDocumentType$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/jumio/sdk/document/JumioDocumentType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0081\u0002\u0018\u0000 \r2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0008\u001a\u00020\tH\u0016J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u000cj\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/jumio/sdk/document/JumioDocumentType;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "PASSPORT",
        "VISA",
        "DRIVING_LICENSE",
        "ID_CARD",
        "toString",
        "",
        "getLocalizedName",
        "c",
        "Landroid/content/Context;",
        "Companion",
        "jumio-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/jumio/sdk/document/JumioDocumentType;

.field public static final Companion:Lcom/jumio/sdk/document/JumioDocumentType$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum DRIVING_LICENSE:Lcom/jumio/sdk/document/JumioDocumentType;

.field public static final enum ID_CARD:Lcom/jumio/sdk/document/JumioDocumentType;

.field public static final enum PASSPORT:Lcom/jumio/sdk/document/JumioDocumentType;

.field public static final enum VISA:Lcom/jumio/sdk/document/JumioDocumentType;


# direct methods
.method private static final synthetic $values()[Lcom/jumio/sdk/document/JumioDocumentType;
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lcom/jumio/sdk/document/JumioDocumentType;->PASSPORT:Lcom/jumio/sdk/document/JumioDocumentType;

    .line 3
    .line 4
    sget-object v1, Lcom/jumio/sdk/document/JumioDocumentType;->VISA:Lcom/jumio/sdk/document/JumioDocumentType;

    .line 5
    .line 6
    sget-object v2, Lcom/jumio/sdk/document/JumioDocumentType;->DRIVING_LICENSE:Lcom/jumio/sdk/document/JumioDocumentType;

    .line 7
    .line 8
    sget-object v3, Lcom/jumio/sdk/document/JumioDocumentType;->ID_CARD:Lcom/jumio/sdk/document/JumioDocumentType;

    .line 9
    .line 10
    .line 11
    filled-new-array {v0, v1, v2, v3}, [Lcom/jumio/sdk/document/JumioDocumentType;

    .line 12
    move-result-object v0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/jumio/sdk/document/JumioDocumentType;

    .line 3
    .line 4
    const-string v1, "PASSPORT"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lcom/jumio/sdk/document/JumioDocumentType;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    sput-object v0, Lcom/jumio/sdk/document/JumioDocumentType;->PASSPORT:Lcom/jumio/sdk/document/JumioDocumentType;

    .line 11
    .line 12
    new-instance v0, Lcom/jumio/sdk/document/JumioDocumentType;

    .line 13
    .line 14
    const-string v1, "VISA"

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Lcom/jumio/sdk/document/JumioDocumentType;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    sput-object v0, Lcom/jumio/sdk/document/JumioDocumentType;->VISA:Lcom/jumio/sdk/document/JumioDocumentType;

    .line 21
    .line 22
    new-instance v0, Lcom/jumio/sdk/document/JumioDocumentType;

    .line 23
    .line 24
    const-string v1, "DRIVING_LICENSE"

    .line 25
    const/4 v2, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, v2}, Lcom/jumio/sdk/document/JumioDocumentType;-><init>(Ljava/lang/String;I)V

    .line 29
    .line 30
    sput-object v0, Lcom/jumio/sdk/document/JumioDocumentType;->DRIVING_LICENSE:Lcom/jumio/sdk/document/JumioDocumentType;

    .line 31
    .line 32
    new-instance v0, Lcom/jumio/sdk/document/JumioDocumentType;

    .line 33
    .line 34
    const-string v1, "ID_CARD"

    .line 35
    const/4 v2, 0x3

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1, v2}, Lcom/jumio/sdk/document/JumioDocumentType;-><init>(Ljava/lang/String;I)V

    .line 39
    .line 40
    sput-object v0, Lcom/jumio/sdk/document/JumioDocumentType;->ID_CARD:Lcom/jumio/sdk/document/JumioDocumentType;

    .line 41
    .line 42
    .line 43
    invoke-static {}, Lcom/jumio/sdk/document/JumioDocumentType;->$values()[Lcom/jumio/sdk/document/JumioDocumentType;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    sput-object v0, Lcom/jumio/sdk/document/JumioDocumentType;->$VALUES:[Lcom/jumio/sdk/document/JumioDocumentType;

    .line 47
    .line 48
    .line 49
    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    sput-object v0, Lcom/jumio/sdk/document/JumioDocumentType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 53
    .line 54
    new-instance v0, Lcom/jumio/sdk/document/JumioDocumentType$Companion;

    .line 55
    const/4 v1, 0x0

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, v1}, Lcom/jumio/sdk/document/JumioDocumentType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 59
    .line 60
    sput-object v0, Lcom/jumio/sdk/document/JumioDocumentType;->Companion:Lcom/jumio/sdk/document/JumioDocumentType$Companion;

    .line 61
    return-void
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

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 4
    return-void
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
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/jumio/sdk/document/JumioDocumentType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/jumio/sdk/document/JumioDocumentType;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

.method public static valueOf(Ljava/lang/String;)Lcom/jumio/sdk/document/JumioDocumentType;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/jumio/sdk/document/JumioDocumentType;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/jumio/sdk/document/JumioDocumentType;

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

.method public static values()[Lcom/jumio/sdk/document/JumioDocumentType;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/jumio/sdk/document/JumioDocumentType;->$VALUES:[Lcom/jumio/sdk/document/JumioDocumentType;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/jumio/sdk/document/JumioDocumentType;

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
.method public final getLocalizedName(Landroid/content/Context;)Ljava/lang/String;
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "c"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/jumio/sdk/document/JumioDocumentType$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 11
    move-result v1

    .line 12
    .line 13
    aget v0, v0, v1

    .line 14
    const/4 v1, 0x1

    .line 15
    .line 16
    if-eq v0, v1, :cond_3

    .line 17
    const/4 v1, 0x2

    .line 18
    .line 19
    if-eq v0, v1, :cond_2

    .line 20
    const/4 v1, 0x3

    .line 21
    .line 22
    if-eq v0, v1, :cond_1

    .line 23
    const/4 v1, 0x4

    .line 24
    .line 25
    if-ne v0, v1, :cond_0

    .line 26
    .line 27
    sget v0, Lcom/jumio/core/R$string;->jumio_idtype_id:I

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 31
    move-result-object p1

    .line 32
    goto :goto_0

    .line 33
    .line 34
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 35
    .line 36
    .line 37
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 38
    throw p1

    .line 39
    .line 40
    :cond_1
    sget v0, Lcom/jumio/core/R$string;->jumio_idtype_dl:I

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 44
    move-result-object p1

    .line 45
    goto :goto_0

    .line 46
    .line 47
    :cond_2
    sget v0, Lcom/jumio/core/R$string;->jumio_idtype_visa:I

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 51
    move-result-object p1

    .line 52
    goto :goto_0

    .line 53
    .line 54
    :cond_3
    sget v0, Lcom/jumio/core/R$string;->jumio_idtype_pp:I

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 58
    move-result-object p1

    .line 59
    .line 60
    .line 61
    :goto_0
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 62
    return-object p1
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
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/jumio/sdk/document/JumioDocumentType$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    move-result v1

    .line 7
    .line 8
    aget v0, v0, v1

    .line 9
    const/4 v1, 0x1

    .line 10
    .line 11
    if-eq v0, v1, :cond_3

    .line 12
    const/4 v1, 0x2

    .line 13
    .line 14
    if-eq v0, v1, :cond_2

    .line 15
    const/4 v1, 0x3

    .line 16
    .line 17
    if-eq v0, v1, :cond_1

    .line 18
    const/4 v1, 0x4

    .line 19
    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    .line 22
    const-string v0, "ID_CARD"

    .line 23
    return-object v0

    .line 24
    .line 25
    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 26
    .line 27
    .line 28
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 29
    throw v0

    .line 30
    .line 31
    :cond_1
    const-string v0, "DRIVING_LICENSE"

    .line 32
    return-object v0

    .line 33
    .line 34
    :cond_2
    const-string v0, "VISA"

    .line 35
    return-object v0

    .line 36
    .line 37
    :cond_3
    const-string v0, "PASSPORT"

    .line 38
    return-object v0
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
