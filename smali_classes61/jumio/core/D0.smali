.class public final enum Ljumio/core/D0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final a:Lcom/jumio/core/credentials/CredentialCapabilityType$Companion;

.field public static final enum b:Ljumio/core/D0;

.field public static final enum c:Ljumio/core/D0;

.field public static final enum d:Ljumio/core/D0;

.field public static final enum e:Ljumio/core/D0;

.field public static final enum f:Ljumio/core/D0;

.field public static final enum g:Ljumio/core/D0;

.field public static final enum h:Ljumio/core/D0;

.field public static final synthetic i:[Ljumio/core/D0;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    .line 2
    new-instance v0, Ljumio/core/D0;

    .line 3
    .line 4
    const-string v1, "UNKNOWN"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Ljumio/core/D0;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    sput-object v0, Ljumio/core/D0;->b:Ljumio/core/D0;

    .line 11
    .line 12
    new-instance v1, Ljumio/core/D0;

    .line 13
    .line 14
    const-string v2, "STORAGE"

    .line 15
    const/4 v3, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v2, v3}, Ljumio/core/D0;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    sput-object v1, Ljumio/core/D0;->c:Ljumio/core/D0;

    .line 21
    .line 22
    new-instance v2, Ljumio/core/D0;

    .line 23
    .line 24
    const-string v3, "EXTRACTION"

    .line 25
    const/4 v4, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v2, v3, v4}, Ljumio/core/D0;-><init>(Ljava/lang/String;I)V

    .line 29
    .line 30
    sput-object v2, Ljumio/core/D0;->d:Ljumio/core/D0;

    .line 31
    .line 32
    new-instance v3, Ljumio/core/D0;

    .line 33
    .line 34
    const-string v4, "AUTHENTICATION"

    .line 35
    const/4 v5, 0x3

    .line 36
    .line 37
    .line 38
    invoke-direct {v3, v4, v5}, Ljumio/core/D0;-><init>(Ljava/lang/String;I)V

    .line 39
    .line 40
    sput-object v3, Ljumio/core/D0;->e:Ljumio/core/D0;

    .line 41
    .line 42
    new-instance v4, Ljumio/core/D0;

    .line 43
    .line 44
    const-string v5, "SIMILARITY"

    .line 45
    const/4 v6, 0x4

    .line 46
    .line 47
    .line 48
    invoke-direct {v4, v5, v6}, Ljumio/core/D0;-><init>(Ljava/lang/String;I)V

    .line 49
    .line 50
    sput-object v4, Ljumio/core/D0;->f:Ljumio/core/D0;

    .line 51
    .line 52
    new-instance v5, Ljumio/core/D0;

    .line 53
    .line 54
    const-string v6, "FRAUD_LOOKUPS"

    .line 55
    const/4 v7, 0x5

    .line 56
    .line 57
    .line 58
    invoke-direct {v5, v6, v7}, Ljumio/core/D0;-><init>(Ljava/lang/String;I)V

    .line 59
    .line 60
    sput-object v5, Ljumio/core/D0;->g:Ljumio/core/D0;

    .line 61
    .line 62
    new-instance v6, Ljumio/core/D0;

    .line 63
    .line 64
    const-string v7, "LIVENESS"

    .line 65
    const/4 v8, 0x6

    .line 66
    .line 67
    .line 68
    invoke-direct {v6, v7, v8}, Ljumio/core/D0;-><init>(Ljava/lang/String;I)V

    .line 69
    .line 70
    sput-object v6, Ljumio/core/D0;->h:Ljumio/core/D0;

    .line 71
    .line 72
    .line 73
    filled-new-array/range {v0 .. v6}, [Ljumio/core/D0;

    .line 74
    move-result-object v0

    .line 75
    .line 76
    sput-object v0, Ljumio/core/D0;->i:[Ljumio/core/D0;

    .line 77
    .line 78
    .line 79
    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 80
    .line 81
    new-instance v0, Lcom/jumio/core/credentials/CredentialCapabilityType$Companion;

    .line 82
    const/4 v1, 0x0

    .line 83
    .line 84
    .line 85
    invoke-direct {v0, v1}, Lcom/jumio/core/credentials/CredentialCapabilityType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 86
    .line 87
    sput-object v0, Ljumio/core/D0;->a:Lcom/jumio/core/credentials/CredentialCapabilityType$Companion;

    .line 88
    return-void
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

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

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
.end method

.method public static valueOf(Ljava/lang/String;)Ljumio/core/D0;
    .locals 1

    .line 1
    .line 2
    const-class v0, Ljumio/core/D0;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Ljumio/core/D0;

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

.method public static values()[Ljumio/core/D0;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Ljumio/core/D0;->i:[Ljumio/core/D0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Ljumio/core/D0;

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
