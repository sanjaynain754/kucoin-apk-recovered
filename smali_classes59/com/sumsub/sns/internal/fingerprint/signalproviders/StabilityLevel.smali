.class public final enum Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;
.super Ljava/lang/Enum;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0000H\u0000\u00a2\u0006\u0002\u0008\nj\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "STABLE",
        "OPTIMAL",
        "UNIQUE",
        "atLeastAsStableAs",
        "",
        "other",
        "atLeastAsStableAs$idensic_mobile_sdk_aar_defaultRelease",
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

.field private static final synthetic $VALUES:[Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;

.field public static final enum OPTIMAL:Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;

.field public static final enum STABLE:Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;

.field public static final enum UNIQUE:Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;


# direct methods
.method private static final synthetic $values()[Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;->STABLE:Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;->OPTIMAL:Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;

    .line 5
    .line 6
    sget-object v2, Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;->UNIQUE:Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;

    .line 7
    .line 8
    .line 9
    filled-new-array {v0, v1, v2}, [Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;

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
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;

    .line 3
    .line 4
    const-string v1, "STABLE"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    sput-object v0, Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;->STABLE:Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;

    .line 11
    .line 12
    new-instance v0, Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;

    .line 13
    .line 14
    const-string v1, "OPTIMAL"

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    sput-object v0, Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;->OPTIMAL:Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;

    .line 21
    .line 22
    new-instance v0, Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;

    .line 23
    .line 24
    const-string v1, "UNIQUE"

    .line 25
    const/4 v2, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, v2}, Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;-><init>(Ljava/lang/String;I)V

    .line 29
    .line 30
    sput-object v0, Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;->UNIQUE:Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;->$values()[Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    sput-object v0, Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;->$VALUES:[Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    sput-object v0, Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 43
    return-void
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
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

.method public static valueOf(Ljava/lang/String;)Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;

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

.method public static values()[Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;->$VALUES:[Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;

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
.method public final atLeastAsStableAs$idensic_mobile_sdk_aar_defaultRelease(Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;)Z
    .locals 6
    .param p1    # Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/fingerprint/signalproviders/a;->a:[I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    move-result v1

    .line 7
    .line 8
    aget v1, v0, v1

    .line 9
    const/4 v2, 0x1

    .line 10
    .line 11
    if-eq v1, v2, :cond_7

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x3

    .line 14
    const/4 v5, 0x2

    .line 15
    .line 16
    if-eq v1, v5, :cond_3

    .line 17
    .line 18
    if-ne v1, v4, :cond_2

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 22
    move-result p1

    .line 23
    .line 24
    aget p1, v0, p1

    .line 25
    .line 26
    if-eq p1, v2, :cond_1

    .line 27
    .line 28
    if-eq p1, v5, :cond_1

    .line 29
    .line 30
    if-ne p1, v4, :cond_0

    .line 31
    return v2

    .line 32
    .line 33
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 34
    .line 35
    .line 36
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 37
    throw p1

    .line 38
    :cond_1
    return v3

    .line 39
    .line 40
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 41
    .line 42
    .line 43
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 44
    throw p1

    .line 45
    .line 46
    .line 47
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 48
    move-result p1

    .line 49
    .line 50
    aget p1, v0, p1

    .line 51
    .line 52
    if-eq p1, v2, :cond_6

    .line 53
    .line 54
    if-eq p1, v5, :cond_5

    .line 55
    .line 56
    if-ne p1, v4, :cond_4

    .line 57
    goto :goto_0

    .line 58
    .line 59
    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 60
    .line 61
    .line 62
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 63
    throw p1

    .line 64
    :cond_5
    :goto_0
    return v2

    .line 65
    :cond_6
    return v3

    .line 66
    :cond_7
    return v2
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
.end method
