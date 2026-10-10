.class Landroidx/camera/core/impl/utils/ExifTag;
.super Ljava/lang/Object;
.source "ExifTag.java"


# instance fields
.field public final name:Ljava/lang/String;

.field public final number:I

.field public final primaryFormat:I

.field public final secondaryFormat:I


# direct methods
.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/camera/core/impl/utils/ExifTag;->name:Ljava/lang/String;

    .line 3
    iput p2, p0, Landroidx/camera/core/impl/utils/ExifTag;->number:I

    .line 4
    iput p3, p0, Landroidx/camera/core/impl/utils/ExifTag;->primaryFormat:I

    const/4 p1, -0x1

    .line 5
    iput p1, p0, Landroidx/camera/core/impl/utils/ExifTag;->secondaryFormat:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;III)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Landroidx/camera/core/impl/utils/ExifTag;->name:Ljava/lang/String;

    .line 8
    iput p2, p0, Landroidx/camera/core/impl/utils/ExifTag;->number:I

    .line 9
    iput p3, p0, Landroidx/camera/core/impl/utils/ExifTag;->primaryFormat:I

    .line 10
    iput p4, p0, Landroidx/camera/core/impl/utils/ExifTag;->secondaryFormat:I

    return-void
.end method


# virtual methods
.method public isFormatCompatible(I)Z
    .locals 4

    .line 1
    .line 2
    iget v0, p0, Landroidx/camera/core/impl/utils/ExifTag;->primaryFormat:I

    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x7

    .line 5
    .line 6
    if-eq v0, v2, :cond_8

    .line 7
    .line 8
    if-ne p1, v2, :cond_0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    :cond_0
    if-eq v0, p1, :cond_8

    .line 12
    .line 13
    iget v2, p0, Landroidx/camera/core/impl/utils/ExifTag;->secondaryFormat:I

    .line 14
    .line 15
    if-ne v2, p1, :cond_1

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/4 v3, 0x4

    .line 18
    .line 19
    if-eq v0, v3, :cond_2

    .line 20
    .line 21
    if-ne v2, v3, :cond_3

    .line 22
    :cond_2
    const/4 v3, 0x3

    .line 23
    .line 24
    if-ne p1, v3, :cond_3

    .line 25
    return v1

    .line 26
    .line 27
    :cond_3
    const/16 v3, 0x9

    .line 28
    .line 29
    if-eq v0, v3, :cond_4

    .line 30
    .line 31
    if-ne v2, v3, :cond_5

    .line 32
    .line 33
    :cond_4
    const/16 v3, 0x8

    .line 34
    .line 35
    if-ne p1, v3, :cond_5

    .line 36
    return v1

    .line 37
    .line 38
    :cond_5
    const/16 v3, 0xc

    .line 39
    .line 40
    if-eq v0, v3, :cond_6

    .line 41
    .line 42
    if-ne v2, v3, :cond_7

    .line 43
    .line 44
    :cond_6
    const/16 v0, 0xb

    .line 45
    .line 46
    if-ne p1, v0, :cond_7

    .line 47
    return v1

    .line 48
    :cond_7
    const/4 p1, 0x0

    .line 49
    return p1

    .line 50
    :cond_8
    :goto_0
    return v1
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
.end method
