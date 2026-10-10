.class public final enum Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;
.super Ljava/lang/Enum;
.source "ReanimatedSensorType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

.field public static final enum ACCELEROMETER:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

.field public static final enum GRAVITY:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

.field public static final enum GYROSCOPE:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

.field public static final enum MAGNETIC_FIELD:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

.field public static final enum ROTATION_VECTOR:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;


# instance fields
.field private final type:I


# direct methods
.method private static synthetic $values()[Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;
    .locals 5

    .line 1
    .line 2
    sget-object v0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->ACCELEROMETER:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 3
    .line 4
    sget-object v1, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->GYROSCOPE:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 5
    .line 6
    sget-object v2, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->GRAVITY:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 7
    .line 8
    sget-object v3, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->MAGNETIC_FIELD:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 9
    .line 10
    sget-object v4, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->ROTATION_VECTOR:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 11
    .line 12
    .line 13
    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 14
    move-result-object v0

    .line 15
    return-object v0
    .line 16
    .line 17
.end method

.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    const-string v3, "ACCELEROMETER"

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v3, v1, v2}, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;-><init>(Ljava/lang/String;II)V

    .line 11
    .line 12
    sput-object v0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->ACCELEROMETER:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 13
    .line 14
    new-instance v0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 15
    .line 16
    const-string v1, "GYROSCOPE"

    .line 17
    const/4 v2, 0x1

    .line 18
    const/4 v3, 0x4

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v1, v2, v3}, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;-><init>(Ljava/lang/String;II)V

    .line 22
    .line 23
    sput-object v0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->GYROSCOPE:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 24
    .line 25
    new-instance v0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 26
    .line 27
    const/16 v1, 0x9

    .line 28
    .line 29
    const-string v2, "GRAVITY"

    .line 30
    const/4 v4, 0x2

    .line 31
    .line 32
    .line 33
    invoke-direct {v0, v2, v4, v1}, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;-><init>(Ljava/lang/String;II)V

    .line 34
    .line 35
    sput-object v0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->GRAVITY:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 36
    .line 37
    new-instance v0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 38
    .line 39
    const-string v1, "MAGNETIC_FIELD"

    .line 40
    const/4 v2, 0x3

    .line 41
    .line 42
    .line 43
    invoke-direct {v0, v1, v2, v4}, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;-><init>(Ljava/lang/String;II)V

    .line 44
    .line 45
    sput-object v0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->MAGNETIC_FIELD:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 46
    .line 47
    new-instance v0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 48
    .line 49
    const-string v1, "ROTATION_VECTOR"

    .line 50
    .line 51
    const/16 v2, 0xb

    .line 52
    .line 53
    .line 54
    invoke-direct {v0, v1, v3, v2}, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;-><init>(Ljava/lang/String;II)V

    .line 55
    .line 56
    sput-object v0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->ROTATION_VECTOR:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 57
    .line 58
    .line 59
    invoke-static {}, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->$values()[Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 60
    move-result-object v0

    .line 61
    .line 62
    sput-object v0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->$VALUES:[Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 63
    return-void
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
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method

.method private constructor <init>(Ljava/lang/String;II)V
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
    iput p3, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->type:I

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

.method public static getInstanceById(I)Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-eq p0, v0, :cond_4

    .line 4
    const/4 v0, 0x2

    .line 5
    .line 6
    if-eq p0, v0, :cond_3

    .line 7
    const/4 v0, 0x3

    .line 8
    .line 9
    if-eq p0, v0, :cond_2

    .line 10
    const/4 v0, 0x4

    .line 11
    .line 12
    if-eq p0, v0, :cond_1

    .line 13
    const/4 v0, 0x5

    .line 14
    .line 15
    if-ne p0, v0, :cond_0

    .line 16
    .line 17
    sget-object p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->ROTATION_VECTOR:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 18
    return-object p0

    .line 19
    .line 20
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 21
    .line 22
    const-string v0, "[Reanimated] Unknown sensor type."

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 26
    throw p0

    .line 27
    .line 28
    :cond_1
    sget-object p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->MAGNETIC_FIELD:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 29
    return-object p0

    .line 30
    .line 31
    :cond_2
    sget-object p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->GRAVITY:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 32
    return-object p0

    .line 33
    .line 34
    :cond_3
    sget-object p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->GYROSCOPE:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 35
    return-object p0

    .line 36
    .line 37
    :cond_4
    sget-object p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->ACCELEROMETER:Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 38
    return-object p0
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
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

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
    .line 25
.end method

.method public static values()[Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->$VALUES:[Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

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
.end method


# virtual methods
.method public getType()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->type:I

    .line 3
    return v0
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
.end method
