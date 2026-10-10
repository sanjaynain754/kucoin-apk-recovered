.class public Landroidx/camera/core/internal/compat/workaround/InvalidJpegDataParser;
.super Ljava/lang/Object;
.source "InvalidJpegDataParser.java"


# instance fields
.field private final mQuirk:Landroidx/camera/core/internal/compat/quirk/LargeJpegImageQuirk;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-class v0, Landroidx/camera/core/internal/compat/quirk/LargeJpegImageQuirk;

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Landroidx/camera/core/internal/compat/quirk/DeviceQuirks;->get(Ljava/lang/Class;)Landroidx/camera/core/impl/Quirk;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    check-cast v0, Landroidx/camera/core/internal/compat/quirk/LargeJpegImageQuirk;

    .line 12
    .line 13
    iput-object v0, p0, Landroidx/camera/core/internal/compat/workaround/InvalidJpegDataParser;->mQuirk:Landroidx/camera/core/internal/compat/quirk/LargeJpegImageQuirk;

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public static getJfifEoiMarkEndPosition([B)I
    .locals 7
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    move v1, v0

    .line 3
    .line 4
    :goto_0
    add-int/lit8 v2, v1, 0x4

    .line 5
    array-length v3, p0

    .line 6
    const/4 v4, -0x1

    .line 7
    .line 8
    if-gt v2, v3, :cond_4

    .line 9
    .line 10
    aget-byte v2, p0, v1

    .line 11
    .line 12
    if-eq v2, v4, :cond_0

    .line 13
    goto :goto_2

    .line 14
    .line 15
    :cond_0
    add-int/lit8 v3, v1, 0x2

    .line 16
    .line 17
    aget-byte v5, p0, v3

    .line 18
    .line 19
    and-int/lit16 v5, v5, 0xff

    .line 20
    .line 21
    shl-int/lit8 v5, v5, 0x8

    .line 22
    .line 23
    add-int/lit8 v6, v1, 0x3

    .line 24
    .line 25
    aget-byte v6, p0, v6

    .line 26
    .line 27
    and-int/lit16 v6, v6, 0xff

    .line 28
    or-int/2addr v5, v6

    .line 29
    .line 30
    if-ne v2, v4, :cond_3

    .line 31
    .line 32
    add-int/lit8 v2, v1, 0x1

    .line 33
    .line 34
    aget-byte v2, p0, v2

    .line 35
    .line 36
    const/16 v6, -0x26

    .line 37
    .line 38
    if-ne v2, v6, :cond_3

    .line 39
    .line 40
    :goto_1
    add-int/lit8 v0, v3, 0x2

    .line 41
    array-length v1, p0

    .line 42
    .line 43
    if-le v0, v1, :cond_1

    .line 44
    return v4

    .line 45
    .line 46
    :cond_1
    aget-byte v1, p0, v3

    .line 47
    .line 48
    if-ne v1, v4, :cond_2

    .line 49
    .line 50
    add-int/lit8 v1, v3, 0x1

    .line 51
    .line 52
    aget-byte v1, p0, v1

    .line 53
    .line 54
    const/16 v2, -0x27

    .line 55
    .line 56
    if-ne v1, v2, :cond_2

    .line 57
    return v0

    .line 58
    .line 59
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 60
    goto :goto_1

    .line 61
    :cond_3
    add-int/2addr v5, v0

    .line 62
    add-int/2addr v1, v5

    .line 63
    goto :goto_0

    .line 64
    :cond_4
    :goto_2
    return v4
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
.end method


# virtual methods
.method public getValidDataLength([B)I
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/internal/compat/workaround/InvalidJpegDataParser;->mQuirk:Landroidx/camera/core/internal/compat/quirk/LargeJpegImageQuirk;

    .line 3
    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroidx/camera/core/internal/compat/quirk/LargeJpegImageQuirk;->shouldCheckInvalidJpegData([B)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    goto :goto_0

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-static {p1}, Landroidx/camera/core/internal/compat/workaround/InvalidJpegDataParser;->getJfifEoiMarkEndPosition([B)I

    .line 15
    move-result v0

    .line 16
    const/4 v1, -0x1

    .line 17
    .line 18
    if-eq v0, v1, :cond_1

    .line 19
    return v0

    .line 20
    :cond_1
    array-length p1, p1

    .line 21
    return p1

    .line 22
    :cond_2
    :goto_0
    array-length p1, p1

    .line 23
    return p1
    .line 24
.end method
