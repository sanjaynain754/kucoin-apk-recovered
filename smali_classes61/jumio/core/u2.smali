.class public abstract synthetic Ljumio/core/u2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:[I

.field public static final synthetic b:[I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljumio/core/h2;->values()[Ljumio/core/h2;

    .line 4
    move-result-object v0

    .line 5
    array-length v0, v0

    .line 6
    .line 7
    new-array v0, v0, [I

    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x4

    .line 10
    .line 11
    :try_start_0
    aput v1, v0, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    :catch_0
    sput-object v0, Ljumio/core/u2;->a:[I

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lcom/jumio/core/data/ScanMode;->values()[Lcom/jumio/core/data/ScanMode;

    .line 17
    move-result-object v0

    .line 18
    array-length v0, v0

    .line 19
    .line 20
    new-array v0, v0, [I

    .line 21
    .line 22
    :try_start_1
    sget-object v3, Lcom/jumio/core/data/ScanMode;->DOCFINDER:Lcom/jumio/core/data/ScanMode;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 26
    move-result v3

    .line 27
    .line 28
    aput v1, v0, v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    .line 29
    .line 30
    :catch_1
    :try_start_2
    sget-object v1, Lcom/jumio/core/data/ScanMode;->PDF417:Lcom/jumio/core/data/ScanMode;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 34
    move-result v1

    .line 35
    const/4 v3, 0x2

    .line 36
    .line 37
    aput v3, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    .line 38
    .line 39
    :catch_2
    :try_start_3
    sget-object v1, Lcom/jumio/core/data/ScanMode;->FACE_MANUAL:Lcom/jumio/core/data/ScanMode;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 43
    move-result v1

    .line 44
    const/4 v3, 0x3

    .line 45
    .line 46
    aput v3, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    .line 47
    .line 48
    :catch_3
    :try_start_4
    sget-object v1, Lcom/jumio/core/data/ScanMode;->MANUAL:Lcom/jumio/core/data/ScanMode;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 52
    move-result v1

    .line 53
    .line 54
    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    .line 55
    .line 56
    :catch_4
    :try_start_5
    sget-object v1, Lcom/jumio/core/data/ScanMode;->NFC:Lcom/jumio/core/data/ScanMode;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 60
    move-result v1

    .line 61
    const/4 v2, 0x5

    .line 62
    .line 63
    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    .line 64
    .line 65
    :catch_5
    :try_start_6
    sget-object v1, Lcom/jumio/core/data/ScanMode;->JUMIO_LIVENESS:Lcom/jumio/core/data/ScanMode;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 69
    move-result v1

    .line 70
    const/4 v2, 0x6

    .line 71
    .line 72
    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    .line 73
    .line 74
    :catch_6
    :try_start_7
    sget-object v1, Lcom/jumio/core/data/ScanMode;->JUMIO_PREMIUM:Lcom/jumio/core/data/ScanMode;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 78
    move-result v1

    .line 79
    const/4 v2, 0x7

    .line 80
    .line 81
    aput v2, v0, v1
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    .line 82
    .line 83
    :catch_7
    :try_start_8
    sget-object v1, Lcom/jumio/core/data/ScanMode;->FILE:Lcom/jumio/core/data/ScanMode;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 87
    move-result v1

    .line 88
    .line 89
    const/16 v2, 0x8

    .line 90
    .line 91
    aput v2, v0, v1
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    .line 92
    .line 93
    :catch_8
    :try_start_9
    sget-object v1, Lcom/jumio/core/data/ScanMode;->WEB:Lcom/jumio/core/data/ScanMode;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 97
    move-result v1

    .line 98
    .line 99
    const/16 v2, 0x9

    .line 100
    .line 101
    aput v2, v0, v1
    :try_end_9
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_9} :catch_9

    .line 102
    .line 103
    :catch_9
    sput-object v0, Ljumio/core/u2;->b:[I

    .line 104
    return-void
    .line 105
    .line 106
    .line 107
.end method
