.class public Lcom/facebook/hermes/intl/d$b;
.super Ljava/lang/Object;
.source "PlatformDateTimeFormatterICU.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/hermes/intl/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    const/4 v1, 0x0

    .line 7
    move v2, v1

    .line 8
    .line 9
    .line 10
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 11
    move-result v3

    .line 12
    .line 13
    if-ge v1, v3, :cond_5

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 17
    move-result v3

    .line 18
    .line 19
    const/16 v4, 0x27

    .line 20
    .line 21
    if-ne v3, v4, :cond_0

    .line 22
    .line 23
    xor-int/lit8 v2, v2, 0x1

    .line 24
    goto :goto_1

    .line 25
    .line 26
    :cond_0
    if-eqz v2, :cond_1

    .line 27
    goto :goto_1

    .line 28
    .line 29
    :cond_1
    const/16 v4, 0x41

    .line 30
    .line 31
    if-lt v3, v4, :cond_2

    .line 32
    .line 33
    const/16 v4, 0x5a

    .line 34
    .line 35
    if-le v3, v4, :cond_3

    .line 36
    .line 37
    :cond_2
    const/16 v4, 0x61

    .line 38
    .line 39
    if-lt v3, v4, :cond_4

    .line 40
    .line 41
    const/16 v4, 0x7a

    .line 42
    .line 43
    if-gt v3, v4, :cond_4

    .line 44
    .line 45
    .line 46
    :cond_3
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 47
    move-result v3

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    :cond_4
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 53
    goto :goto_0

    .line 54
    .line 55
    .line 56
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    move-result-object p0

    .line 58
    return-object p0
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
.end method
