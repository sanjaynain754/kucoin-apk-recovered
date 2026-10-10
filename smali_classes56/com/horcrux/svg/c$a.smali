.class public Lcom/horcrux/svg/c$a;
.super Ljava/lang/Object;
.source "FontData.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/horcrux/svg/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:[Lcom/horcrux/svg/TextProperties$FontWeight;

.field public static final b:[I


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    .line 2
    sget-object v0, Lcom/horcrux/svg/TextProperties$FontWeight;->w100:Lcom/horcrux/svg/TextProperties$FontWeight;

    .line 3
    .line 4
    sget-object v2, Lcom/horcrux/svg/TextProperties$FontWeight;->w200:Lcom/horcrux/svg/TextProperties$FontWeight;

    .line 5
    .line 6
    sget-object v3, Lcom/horcrux/svg/TextProperties$FontWeight;->w300:Lcom/horcrux/svg/TextProperties$FontWeight;

    .line 7
    .line 8
    sget-object v4, Lcom/horcrux/svg/TextProperties$FontWeight;->Normal:Lcom/horcrux/svg/TextProperties$FontWeight;

    .line 9
    .line 10
    sget-object v5, Lcom/horcrux/svg/TextProperties$FontWeight;->w500:Lcom/horcrux/svg/TextProperties$FontWeight;

    .line 11
    .line 12
    sget-object v6, Lcom/horcrux/svg/TextProperties$FontWeight;->w600:Lcom/horcrux/svg/TextProperties$FontWeight;

    .line 13
    .line 14
    sget-object v7, Lcom/horcrux/svg/TextProperties$FontWeight;->Bold:Lcom/horcrux/svg/TextProperties$FontWeight;

    .line 15
    .line 16
    sget-object v8, Lcom/horcrux/svg/TextProperties$FontWeight;->w800:Lcom/horcrux/svg/TextProperties$FontWeight;

    .line 17
    .line 18
    sget-object v9, Lcom/horcrux/svg/TextProperties$FontWeight;->w900:Lcom/horcrux/svg/TextProperties$FontWeight;

    .line 19
    move-object v1, v0

    .line 20
    move-object v10, v9

    .line 21
    .line 22
    .line 23
    filled-new-array/range {v0 .. v10}, [Lcom/horcrux/svg/TextProperties$FontWeight;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    sput-object v0, Lcom/horcrux/svg/c$a;->a:[Lcom/horcrux/svg/TextProperties$FontWeight;

    .line 27
    .line 28
    const/16 v0, 0xb

    .line 29
    .line 30
    new-array v0, v0, [I

    .line 31
    .line 32
    .line 33
    fill-array-data v0, :array_0

    .line 34
    .line 35
    sput-object v0, Lcom/horcrux/svg/c$a;->b:[I

    .line 36
    return-void

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
    :array_0
    .array-data 4
        0x190
        0x2bc
        0x64
        0xc8
        0x12c
        0x190
        0x1f4
        0x258
        0x2bc
        0x320
        0x384
    .end array-data
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

.method public static a(I)I
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x15e

    .line 3
    .line 4
    if-ge p0, v0, :cond_0

    .line 5
    .line 6
    const/16 p0, 0x190

    .line 7
    return p0

    .line 8
    .line 9
    :cond_0
    const/16 v0, 0x226

    .line 10
    .line 11
    if-ge p0, v0, :cond_1

    .line 12
    .line 13
    const/16 p0, 0x2bc

    .line 14
    return p0

    .line 15
    .line 16
    :cond_1
    const/16 v0, 0x384

    .line 17
    .line 18
    if-ge p0, v0, :cond_2

    .line 19
    return v0

    .line 20
    :cond_2
    return p0
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static b(Lcom/horcrux/svg/TextProperties$FontWeight;Lcom/horcrux/svg/c;)I
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/horcrux/svg/TextProperties$FontWeight;->Bolder:Lcom/horcrux/svg/TextProperties$FontWeight;

    .line 3
    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    iget p0, p1, Lcom/horcrux/svg/c;->f:I

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, Lcom/horcrux/svg/c$a;->a(I)I

    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    .line 13
    :cond_0
    sget-object v0, Lcom/horcrux/svg/TextProperties$FontWeight;->Lighter:Lcom/horcrux/svg/TextProperties$FontWeight;

    .line 14
    .line 15
    if-ne p0, v0, :cond_1

    .line 16
    .line 17
    iget p0, p1, Lcom/horcrux/svg/c;->f:I

    .line 18
    .line 19
    .line 20
    invoke-static {p0}, Lcom/horcrux/svg/c$a;->c(I)I

    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    .line 24
    :cond_1
    sget-object p1, Lcom/horcrux/svg/c$a;->b:[I

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 28
    move-result p0

    .line 29
    .line 30
    aget p0, p1, p0

    .line 31
    return p0
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

.method public static c(I)I
    .locals 2

    .line 1
    .line 2
    const/16 v0, 0x64

    .line 3
    .line 4
    if-ge p0, v0, :cond_0

    .line 5
    return p0

    .line 6
    .line 7
    :cond_0
    const/16 v1, 0x226

    .line 8
    .line 9
    if-ge p0, v1, :cond_1

    .line 10
    return v0

    .line 11
    .line 12
    :cond_1
    const/16 v0, 0x2ee

    .line 13
    .line 14
    if-ge p0, v0, :cond_2

    .line 15
    .line 16
    const/16 p0, 0x190

    .line 17
    return p0

    .line 18
    .line 19
    :cond_2
    const/16 p0, 0x2bc

    .line 20
    return p0
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static d(I)Lcom/horcrux/svg/TextProperties$FontWeight;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/horcrux/svg/c$a;->a:[Lcom/horcrux/svg/TextProperties$FontWeight;

    .line 3
    int-to-float p0, p0

    .line 4
    .line 5
    const/high16 v1, 0x42c80000    # 100.0f

    .line 6
    div-float/2addr p0, v1

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 10
    move-result p0

    .line 11
    .line 12
    aget-object p0, v0, p0

    .line 13
    return-object p0
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
