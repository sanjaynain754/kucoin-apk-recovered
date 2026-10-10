.class public final enum Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;
.super Ljava/lang/Enum;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\n\u0008\u0087\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\u0008\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0008\u001a\u0004\u0008\t\u0010\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "com/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment",
        "",
        "",
        "Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getValue",
        "()Ljava/lang/String;",
        "LEFT",
        "CENTER",
        "RIGHT",
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

.field private static final synthetic $VALUES:[Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;

.field public static final enum CENTER:Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;

.field public static final enum LEFT:Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;

.field public static final enum RIGHT:Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;


# instance fields
.field private final value:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;->LEFT:Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;->CENTER:Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;

    .line 5
    .line 6
    sget-object v2, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;->RIGHT:Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;

    .line 7
    .line 8
    .line 9
    filled-new-array {v0, v1, v2}, [Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;

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
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    const-string v2, "left"

    .line 6
    .line 7
    const-string v3, "LEFT"

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v3, v1, v2}, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 11
    .line 12
    sput-object v0, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;->LEFT:Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;

    .line 13
    .line 14
    new-instance v0, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;

    .line 15
    const/4 v1, 0x1

    .line 16
    .line 17
    const-string v2, "center"

    .line 18
    .line 19
    const-string v3, "CENTER"

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v3, v1, v2}, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 23
    .line 24
    sput-object v0, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;->CENTER:Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;

    .line 25
    .line 26
    new-instance v0, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;

    .line 27
    const/4 v1, 0x2

    .line 28
    .line 29
    .line 30
    const-string/jumbo v2, "right"

    .line 31
    .line 32
    const-string v3, "RIGHT"

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, v3, v1, v2}, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 36
    .line 37
    sput-object v0, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;->RIGHT:Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;

    .line 38
    .line 39
    .line 40
    invoke-static {}, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;->$values()[Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    sput-object v0, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;->$VALUES:[Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    sput-object v0, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 50
    return-void
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
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
    iput-object p3, p0, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;->value:Ljava/lang/String;

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
            "Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

.method public static valueOf(Ljava/lang/String;)Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;

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

.method public static values()[Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;->$VALUES:[Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;

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
    iget-object v0, p0, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;->value:Ljava/lang/String;

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
