.class public abstract Ljumio/core/A3;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcom/jumio/core/models/ScanPartModel;)Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/jumio/core/models/ScanPartModel;->getCredentialPart()Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    sget-object v1, Ljumio/core/z3;->b:[I

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 15
    move-result v0

    .line 16
    .line 17
    aget v0, v1, v0

    .line 18
    .line 19
    const-string v1, "FACE"

    .line 20
    const/4 v2, 0x2

    .line 21
    .line 22
    if-eq v0, v2, :cond_4

    .line 23
    const/4 v3, 0x3

    .line 24
    .line 25
    if-eq v0, v3, :cond_3

    .line 26
    const/4 v3, 0x4

    .line 27
    .line 28
    if-eq v0, v3, :cond_1

    .line 29
    const/4 p0, 0x5

    .line 30
    .line 31
    if-eq v0, p0, :cond_0

    .line 32
    .line 33
    const-string p0, "FRONTSIDE"

    .line 34
    return-object p0

    .line 35
    .line 36
    :cond_0
    const-string p0, "DOCUMENT"

    .line 37
    return-object p0

    .line 38
    .line 39
    .line 40
    :cond_1
    invoke-virtual {p0}, Lcom/jumio/core/models/ScanPartModel;->getMode()Lcom/jumio/core/data/ScanMode;

    .line 41
    move-result-object p0

    .line 42
    .line 43
    sget-object v0, Ljumio/core/z3;->a:[I

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 47
    move-result p0

    .line 48
    .line 49
    aget p0, v0, p0

    .line 50
    const/4 v0, 0x1

    .line 51
    .line 52
    const-string v3, "JUMIO_LIVENESS"

    .line 53
    .line 54
    if-eq p0, v0, :cond_2

    .line 55
    .line 56
    if-eq p0, v2, :cond_2

    .line 57
    return-object v1

    .line 58
    :cond_2
    return-object v3

    .line 59
    .line 60
    :cond_3
    const-string p0, "BACKSIDE"

    .line 61
    return-object p0

    .line 62
    :cond_4
    return-object v1
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
.end method
