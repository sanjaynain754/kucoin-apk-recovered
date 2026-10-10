.class public final enum Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum CARD_GLOSSY:Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

.field public static final enum CARD_OCCLUDED:Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

.field public static final enum CARD_POOR_QUALITY:Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

.field public static final enum EDGE_CROSS:Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

.field public static final enum GOOD:Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

.field public static final enum NO_CARD:Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

.field public static final enum TOO_SMALL_CARD:Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

.field public static final synthetic b:[Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;


# instance fields
.field public level:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

    .line 3
    .line 4
    const-string v1, "NO_CARD"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v2}, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;-><init>(Ljava/lang/String;II)V

    .line 9
    .line 10
    sput-object v0, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;->NO_CARD:Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

    .line 11
    .line 12
    new-instance v0, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

    .line 13
    .line 14
    const-string v1, "TOO_SMALL_CARD"

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2, v2}, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;-><init>(Ljava/lang/String;II)V

    .line 19
    .line 20
    sput-object v0, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;->TOO_SMALL_CARD:Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

    .line 21
    .line 22
    new-instance v0, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

    .line 23
    .line 24
    const-string v1, "EDGE_CROSS"

    .line 25
    const/4 v2, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, v2, v2}, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;-><init>(Ljava/lang/String;II)V

    .line 29
    .line 30
    sput-object v0, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;->EDGE_CROSS:Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

    .line 31
    .line 32
    new-instance v0, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

    .line 33
    .line 34
    const-string v1, "CARD_POOR_QUALITY"

    .line 35
    const/4 v2, 0x3

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1, v2, v2}, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;-><init>(Ljava/lang/String;II)V

    .line 39
    .line 40
    sput-object v0, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;->CARD_POOR_QUALITY:Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

    .line 41
    .line 42
    new-instance v0, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

    .line 43
    .line 44
    const-string v1, "CARD_OCCLUDED"

    .line 45
    const/4 v2, 0x4

    .line 46
    .line 47
    .line 48
    invoke-direct {v0, v1, v2, v2}, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;-><init>(Ljava/lang/String;II)V

    .line 49
    .line 50
    sput-object v0, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;->CARD_OCCLUDED:Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

    .line 51
    .line 52
    new-instance v0, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

    .line 53
    .line 54
    const-string v1, "CARD_GLOSSY"

    .line 55
    const/4 v2, 0x5

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, v1, v2, v2}, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;-><init>(Ljava/lang/String;II)V

    .line 59
    .line 60
    sput-object v0, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;->CARD_GLOSSY:Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

    .line 61
    .line 62
    new-instance v0, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

    .line 63
    .line 64
    const-string v1, "GOOD"

    .line 65
    const/4 v2, 0x6

    .line 66
    .line 67
    .line 68
    invoke-direct {v0, v1, v2, v2}, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;-><init>(Ljava/lang/String;II)V

    .line 69
    .line 70
    sput-object v0, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;->GOOD:Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

    .line 71
    .line 72
    .line 73
    invoke-static {}, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;->a()[Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

    .line 74
    move-result-object v0

    .line 75
    .line 76
    sput-object v0, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;->b:[Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

    .line 77
    return-void
    .line 78
    .line 79
    .line 80
.end method

.method public constructor <init>(Ljava/lang/String;II)V
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
    iput p3, p0, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;->level:I

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

.method public static synthetic a()[Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;
    .locals 7

    .line 1
    .line 2
    sget-object v0, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;->NO_CARD:Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

    .line 3
    .line 4
    sget-object v1, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;->TOO_SMALL_CARD:Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

    .line 5
    .line 6
    sget-object v2, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;->EDGE_CROSS:Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

    .line 7
    .line 8
    sget-object v3, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;->CARD_POOR_QUALITY:Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

    .line 9
    .line 10
    sget-object v4, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;->CARD_OCCLUDED:Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

    .line 11
    .line 12
    sget-object v5, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;->CARD_GLOSSY:Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

    .line 13
    .line 14
    sget-object v6, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;->GOOD:Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

    .line 15
    .line 16
    .line 17
    filled-new-array/range {v0 .. v6}, [Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

    .line 18
    move-result-object v0

    .line 19
    return-object v0
    .line 20
.end method

.method public static highLevel(Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;)Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;->level:I

    .line 3
    .line 4
    iget v1, p1, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;->level:I

    .line 5
    .line 6
    if-le v0, v1, :cond_0

    .line 7
    return-object p0

    .line 8
    :cond_0
    return-object p1
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
.end method

.method public static valueOf(Ljava/lang/String;)Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

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

.method public static values()[Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;->b:[Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

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
.end method
