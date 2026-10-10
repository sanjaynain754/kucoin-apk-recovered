.class public final Lcom/google/gson/internal/Primitives;
.super Ljava/lang/Object;
.source "Primitives.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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
    .line 21
    .line 22
.end method

.method public static isPrimitive(Ljava/lang/reflect/Type;)Z
    .locals 1

    .line 1
    .line 2
    instance-of v0, p0, Ljava/lang/Class;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p0, Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 10
    move-result p0

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
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
.end method

.method public static isWrapperType(Ljava/lang/reflect/Type;)Z
    .locals 1

    .line 1
    .line 2
    const-class v0, Ljava/lang/Integer;

    .line 3
    .line 4
    if-eq p0, v0, :cond_1

    .line 5
    .line 6
    const-class v0, Ljava/lang/Float;

    .line 7
    .line 8
    if-eq p0, v0, :cond_1

    .line 9
    .line 10
    const-class v0, Ljava/lang/Byte;

    .line 11
    .line 12
    if-eq p0, v0, :cond_1

    .line 13
    .line 14
    const-class v0, Ljava/lang/Double;

    .line 15
    .line 16
    if-eq p0, v0, :cond_1

    .line 17
    .line 18
    const-class v0, Ljava/lang/Long;

    .line 19
    .line 20
    if-eq p0, v0, :cond_1

    .line 21
    .line 22
    const-class v0, Ljava/lang/Character;

    .line 23
    .line 24
    if-eq p0, v0, :cond_1

    .line 25
    .line 26
    const-class v0, Ljava/lang/Boolean;

    .line 27
    .line 28
    if-eq p0, v0, :cond_1

    .line 29
    .line 30
    const-class v0, Ljava/lang/Short;

    .line 31
    .line 32
    if-eq p0, v0, :cond_1

    .line 33
    .line 34
    const-class v0, Ljava/lang/Void;

    .line 35
    .line 36
    if-ne p0, v0, :cond_0

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 p0, 0x0

    .line 39
    return p0

    .line 40
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 41
    return p0
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method

.method public static unwrap(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation

    .line 1
    .line 2
    const-class v0, Ljava/lang/Integer;

    .line 3
    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    sget-object p0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 7
    return-object p0

    .line 8
    .line 9
    :cond_0
    const-class v0, Ljava/lang/Float;

    .line 10
    .line 11
    if-ne p0, v0, :cond_1

    .line 12
    .line 13
    sget-object p0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 14
    return-object p0

    .line 15
    .line 16
    :cond_1
    const-class v0, Ljava/lang/Byte;

    .line 17
    .line 18
    if-ne p0, v0, :cond_2

    .line 19
    .line 20
    sget-object p0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 21
    return-object p0

    .line 22
    .line 23
    :cond_2
    const-class v0, Ljava/lang/Double;

    .line 24
    .line 25
    if-ne p0, v0, :cond_3

    .line 26
    .line 27
    sget-object p0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 28
    return-object p0

    .line 29
    .line 30
    :cond_3
    const-class v0, Ljava/lang/Long;

    .line 31
    .line 32
    if-ne p0, v0, :cond_4

    .line 33
    .line 34
    sget-object p0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 35
    return-object p0

    .line 36
    .line 37
    :cond_4
    const-class v0, Ljava/lang/Character;

    .line 38
    .line 39
    if-ne p0, v0, :cond_5

    .line 40
    .line 41
    sget-object p0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 42
    return-object p0

    .line 43
    .line 44
    :cond_5
    const-class v0, Ljava/lang/Boolean;

    .line 45
    .line 46
    if-ne p0, v0, :cond_6

    .line 47
    .line 48
    sget-object p0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 49
    return-object p0

    .line 50
    .line 51
    :cond_6
    const-class v0, Ljava/lang/Short;

    .line 52
    .line 53
    if-ne p0, v0, :cond_7

    .line 54
    .line 55
    sget-object p0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 56
    return-object p0

    .line 57
    .line 58
    :cond_7
    const-class v0, Ljava/lang/Void;

    .line 59
    .line 60
    if-ne p0, v0, :cond_8

    .line 61
    .line 62
    sget-object p0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 63
    :cond_8
    return-object p0
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
.end method

.method public static wrap(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 3
    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    const-class p0, Ljava/lang/Integer;

    .line 7
    return-object p0

    .line 8
    .line 9
    :cond_0
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    if-ne p0, v0, :cond_1

    .line 12
    .line 13
    const-class p0, Ljava/lang/Float;

    .line 14
    return-object p0

    .line 15
    .line 16
    :cond_1
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 17
    .line 18
    if-ne p0, v0, :cond_2

    .line 19
    .line 20
    const-class p0, Ljava/lang/Byte;

    .line 21
    return-object p0

    .line 22
    .line 23
    :cond_2
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 24
    .line 25
    if-ne p0, v0, :cond_3

    .line 26
    .line 27
    const-class p0, Ljava/lang/Double;

    .line 28
    return-object p0

    .line 29
    .line 30
    :cond_3
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 31
    .line 32
    if-ne p0, v0, :cond_4

    .line 33
    .line 34
    const-class p0, Ljava/lang/Long;

    .line 35
    return-object p0

    .line 36
    .line 37
    :cond_4
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 38
    .line 39
    if-ne p0, v0, :cond_5

    .line 40
    .line 41
    const-class p0, Ljava/lang/Character;

    .line 42
    return-object p0

    .line 43
    .line 44
    :cond_5
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 45
    .line 46
    if-ne p0, v0, :cond_6

    .line 47
    .line 48
    const-class p0, Ljava/lang/Boolean;

    .line 49
    return-object p0

    .line 50
    .line 51
    :cond_6
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 52
    .line 53
    if-ne p0, v0, :cond_7

    .line 54
    .line 55
    const-class p0, Ljava/lang/Short;

    .line 56
    return-object p0

    .line 57
    .line 58
    :cond_7
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 59
    .line 60
    if-ne p0, v0, :cond_8

    .line 61
    .line 62
    const-class p0, Ljava/lang/Void;

    .line 63
    :cond_8
    return-object p0
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
.end method
