.class public final enum Lcom/jumio/core/processor/challenge/CameraChallengeState;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/jumio/core/processor/challenge/CameraChallengeState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/jumio/core/processor/challenge/CameraChallengeState;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "SETUP",
        "IMAGE_TAKEN",
        "COOL_DOWN",
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

.field private static final synthetic $VALUES:[Lcom/jumio/core/processor/challenge/CameraChallengeState;

.field public static final enum COOL_DOWN:Lcom/jumio/core/processor/challenge/CameraChallengeState;

.field public static final enum IMAGE_TAKEN:Lcom/jumio/core/processor/challenge/CameraChallengeState;

.field public static final enum SETUP:Lcom/jumio/core/processor/challenge/CameraChallengeState;


# direct methods
.method private static final synthetic $values()[Lcom/jumio/core/processor/challenge/CameraChallengeState;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/jumio/core/processor/challenge/CameraChallengeState;->SETUP:Lcom/jumio/core/processor/challenge/CameraChallengeState;

    .line 3
    .line 4
    sget-object v1, Lcom/jumio/core/processor/challenge/CameraChallengeState;->IMAGE_TAKEN:Lcom/jumio/core/processor/challenge/CameraChallengeState;

    .line 5
    .line 6
    sget-object v2, Lcom/jumio/core/processor/challenge/CameraChallengeState;->COOL_DOWN:Lcom/jumio/core/processor/challenge/CameraChallengeState;

    .line 7
    .line 8
    .line 9
    filled-new-array {v0, v1, v2}, [Lcom/jumio/core/processor/challenge/CameraChallengeState;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/jumio/core/processor/challenge/CameraChallengeState;

    .line 3
    .line 4
    const-string v1, "SETUP"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lcom/jumio/core/processor/challenge/CameraChallengeState;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    sput-object v0, Lcom/jumio/core/processor/challenge/CameraChallengeState;->SETUP:Lcom/jumio/core/processor/challenge/CameraChallengeState;

    .line 11
    .line 12
    new-instance v0, Lcom/jumio/core/processor/challenge/CameraChallengeState;

    .line 13
    .line 14
    const-string v1, "IMAGE_TAKEN"

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Lcom/jumio/core/processor/challenge/CameraChallengeState;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    sput-object v0, Lcom/jumio/core/processor/challenge/CameraChallengeState;->IMAGE_TAKEN:Lcom/jumio/core/processor/challenge/CameraChallengeState;

    .line 21
    .line 22
    new-instance v0, Lcom/jumio/core/processor/challenge/CameraChallengeState;

    .line 23
    .line 24
    const-string v1, "COOL_DOWN"

    .line 25
    const/4 v2, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, v2}, Lcom/jumio/core/processor/challenge/CameraChallengeState;-><init>(Ljava/lang/String;I)V

    .line 29
    .line 30
    sput-object v0, Lcom/jumio/core/processor/challenge/CameraChallengeState;->COOL_DOWN:Lcom/jumio/core/processor/challenge/CameraChallengeState;

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lcom/jumio/core/processor/challenge/CameraChallengeState;->$values()[Lcom/jumio/core/processor/challenge/CameraChallengeState;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    sput-object v0, Lcom/jumio/core/processor/challenge/CameraChallengeState;->$VALUES:[Lcom/jumio/core/processor/challenge/CameraChallengeState;

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    sput-object v0, Lcom/jumio/core/processor/challenge/CameraChallengeState;->$ENTRIES:Lkotlin/enums/EnumEntries;

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
            "Lcom/jumio/core/processor/challenge/CameraChallengeState;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/jumio/core/processor/challenge/CameraChallengeState;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

.method public static valueOf(Ljava/lang/String;)Lcom/jumio/core/processor/challenge/CameraChallengeState;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/jumio/core/processor/challenge/CameraChallengeState;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/jumio/core/processor/challenge/CameraChallengeState;

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

.method public static values()[Lcom/jumio/core/processor/challenge/CameraChallengeState;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/jumio/core/processor/challenge/CameraChallengeState;->$VALUES:[Lcom/jumio/core/processor/challenge/CameraChallengeState;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/jumio/core/processor/challenge/CameraChallengeState;

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
