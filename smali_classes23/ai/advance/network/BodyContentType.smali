.class public final enum Lai/advance/network/BodyContentType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lai/advance/network/BodyContentType;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum FORM:Lai/advance/network/BodyContentType;

.field public static final enum JSON:Lai/advance/network/BodyContentType;

.field public static final enum MULTIPART:Lai/advance/network/BodyContentType;

.field public static final synthetic b:[Lai/advance/network/BodyContentType;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lai/advance/network/BodyContentType;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    const-string v2, "application/json"

    .line 6
    .line 7
    const-string v3, "JSON"

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v3, v1, v2}, Lai/advance/network/BodyContentType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 11
    .line 12
    sput-object v0, Lai/advance/network/BodyContentType;->JSON:Lai/advance/network/BodyContentType;

    .line 13
    .line 14
    new-instance v0, Lai/advance/network/BodyContentType;

    .line 15
    const/4 v1, 0x1

    .line 16
    .line 17
    const-string v2, "application/x-www-form-urlencoded"

    .line 18
    .line 19
    const-string v3, "FORM"

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v3, v1, v2}, Lai/advance/network/BodyContentType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 23
    .line 24
    sput-object v0, Lai/advance/network/BodyContentType;->FORM:Lai/advance/network/BodyContentType;

    .line 25
    .line 26
    new-instance v0, Lai/advance/network/BodyContentType;

    .line 27
    const/4 v1, 0x2

    .line 28
    .line 29
    .line 30
    const-string/jumbo v2, "multipart/form-data"

    .line 31
    .line 32
    const-string v3, "MULTIPART"

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, v3, v1, v2}, Lai/advance/network/BodyContentType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 36
    .line 37
    sput-object v0, Lai/advance/network/BodyContentType;->MULTIPART:Lai/advance/network/BodyContentType;

    .line 38
    .line 39
    .line 40
    invoke-static {}, Lai/advance/network/BodyContentType;->a()[Lai/advance/network/BodyContentType;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    sput-object v0, Lai/advance/network/BodyContentType;->b:[Lai/advance/network/BodyContentType;

    .line 44
    return-void
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
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
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
    iput-object p3, p0, Lai/advance/network/BodyContentType;->value:Ljava/lang/String;

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

.method public static synthetic a()[Lai/advance/network/BodyContentType;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lai/advance/network/BodyContentType;->JSON:Lai/advance/network/BodyContentType;

    .line 3
    .line 4
    sget-object v1, Lai/advance/network/BodyContentType;->FORM:Lai/advance/network/BodyContentType;

    .line 5
    .line 6
    sget-object v2, Lai/advance/network/BodyContentType;->MULTIPART:Lai/advance/network/BodyContentType;

    .line 7
    .line 8
    .line 9
    filled-new-array {v0, v1, v2}, [Lai/advance/network/BodyContentType;

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
    .line 18
    .line 19
    .line 20
.end method

.method public static valueOf(Ljava/lang/String;)Lai/advance/network/BodyContentType;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lai/advance/network/BodyContentType;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lai/advance/network/BodyContentType;

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

.method public static values()[Lai/advance/network/BodyContentType;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lai/advance/network/BodyContentType;->b:[Lai/advance/network/BodyContentType;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lai/advance/network/BodyContentType;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lai/advance/network/BodyContentType;

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


# virtual methods
.method public getValue()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/network/BodyContentType;->value:Ljava/lang/String;

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
.end method
