.class public final enum Laai/liveness/Detector$DetectionType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Laai/liveness/Detector$DetectionType;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum AIMLESS:Laai/liveness/Detector$DetectionType;

.field public static final enum BLINK:Laai/liveness/Detector$DetectionType;

.field public static final enum DONE:Laai/liveness/Detector$DetectionType;

.field public static final enum MOUTH:Laai/liveness/Detector$DetectionType;

.field public static final enum NONE:Laai/liveness/Detector$DetectionType;

.field public static final enum POS_YAW:Laai/liveness/Detector$DetectionType;

.field public static final synthetic b:[Laai/liveness/Detector$DetectionType;


# instance fields
.field public mInterValue:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Laai/liveness/Detector$DetectionType;

    .line 3
    .line 4
    const-string v1, "NONE"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v2}, Laai/liveness/Detector$DetectionType;-><init>(Ljava/lang/String;II)V

    .line 9
    .line 10
    sput-object v0, Laai/liveness/Detector$DetectionType;->NONE:Laai/liveness/Detector$DetectionType;

    .line 11
    .line 12
    new-instance v0, Laai/liveness/Detector$DetectionType;

    .line 13
    .line 14
    const-string v1, "BLINK"

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2, v2}, Laai/liveness/Detector$DetectionType;-><init>(Ljava/lang/String;II)V

    .line 19
    .line 20
    sput-object v0, Laai/liveness/Detector$DetectionType;->BLINK:Laai/liveness/Detector$DetectionType;

    .line 21
    .line 22
    new-instance v0, Laai/liveness/Detector$DetectionType;

    .line 23
    .line 24
    const-string v1, "MOUTH"

    .line 25
    const/4 v2, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, v2, v2}, Laai/liveness/Detector$DetectionType;-><init>(Ljava/lang/String;II)V

    .line 29
    .line 30
    sput-object v0, Laai/liveness/Detector$DetectionType;->MOUTH:Laai/liveness/Detector$DetectionType;

    .line 31
    .line 32
    new-instance v0, Laai/liveness/Detector$DetectionType;

    .line 33
    .line 34
    const-string v1, "POS_YAW"

    .line 35
    const/4 v2, 0x3

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1, v2, v2}, Laai/liveness/Detector$DetectionType;-><init>(Ljava/lang/String;II)V

    .line 39
    .line 40
    sput-object v0, Laai/liveness/Detector$DetectionType;->POS_YAW:Laai/liveness/Detector$DetectionType;

    .line 41
    .line 42
    new-instance v0, Laai/liveness/Detector$DetectionType;

    .line 43
    const/4 v1, 0x4

    .line 44
    const/4 v2, 0x6

    .line 45
    .line 46
    const-string v3, "DONE"

    .line 47
    .line 48
    .line 49
    invoke-direct {v0, v3, v1, v2}, Laai/liveness/Detector$DetectionType;-><init>(Ljava/lang/String;II)V

    .line 50
    .line 51
    sput-object v0, Laai/liveness/Detector$DetectionType;->DONE:Laai/liveness/Detector$DetectionType;

    .line 52
    .line 53
    new-instance v0, Laai/liveness/Detector$DetectionType;

    .line 54
    .line 55
    const-string v1, "AIMLESS"

    .line 56
    const/4 v2, 0x5

    .line 57
    .line 58
    .line 59
    invoke-direct {v0, v1, v2, v2}, Laai/liveness/Detector$DetectionType;-><init>(Ljava/lang/String;II)V

    .line 60
    .line 61
    sput-object v0, Laai/liveness/Detector$DetectionType;->AIMLESS:Laai/liveness/Detector$DetectionType;

    .line 62
    .line 63
    .line 64
    invoke-static {}, Laai/liveness/Detector$DetectionType;->a()[Laai/liveness/Detector$DetectionType;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    sput-object v0, Laai/liveness/Detector$DetectionType;->b:[Laai/liveness/Detector$DetectionType;

    .line 68
    return-void
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
    iput p3, p0, Laai/liveness/Detector$DetectionType;->mInterValue:I

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

.method public static synthetic a()[Laai/liveness/Detector$DetectionType;
    .locals 6

    .line 1
    .line 2
    sget-object v0, Laai/liveness/Detector$DetectionType;->NONE:Laai/liveness/Detector$DetectionType;

    .line 3
    .line 4
    sget-object v1, Laai/liveness/Detector$DetectionType;->BLINK:Laai/liveness/Detector$DetectionType;

    .line 5
    .line 6
    sget-object v2, Laai/liveness/Detector$DetectionType;->MOUTH:Laai/liveness/Detector$DetectionType;

    .line 7
    .line 8
    sget-object v3, Laai/liveness/Detector$DetectionType;->POS_YAW:Laai/liveness/Detector$DetectionType;

    .line 9
    .line 10
    sget-object v4, Laai/liveness/Detector$DetectionType;->DONE:Laai/liveness/Detector$DetectionType;

    .line 11
    .line 12
    sget-object v5, Laai/liveness/Detector$DetectionType;->AIMLESS:Laai/liveness/Detector$DetectionType;

    .line 13
    .line 14
    .line 15
    filled-new-array/range {v0 .. v5}, [Laai/liveness/Detector$DetectionType;

    .line 16
    move-result-object v0

    .line 17
    return-object v0
    .line 18
    .line 19
    .line 20
.end method

.method public static valueOf(Ljava/lang/String;)Laai/liveness/Detector$DetectionType;
    .locals 1

    .line 1
    .line 2
    const-class v0, Laai/liveness/Detector$DetectionType;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Laai/liveness/Detector$DetectionType;

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

.method public static values()[Laai/liveness/Detector$DetectionType;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Laai/liveness/Detector$DetectionType;->b:[Laai/liveness/Detector$DetectionType;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Laai/liveness/Detector$DetectionType;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Laai/liveness/Detector$DetectionType;

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
