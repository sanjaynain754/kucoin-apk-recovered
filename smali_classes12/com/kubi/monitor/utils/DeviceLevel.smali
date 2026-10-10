.class public final enum Lcom/kubi/monitor/utils/DeviceLevel;
.super Ljava/lang/Enum;
.source "DeviceLevelHelper.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/kubi/monitor/utils/DeviceLevel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000c\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/kubi/monitor/utils/DeviceLevel;",
        "",
        "value",
        "",
        "(Ljava/lang/String;II)V",
        "getValue",
        "()I",
        "setValue",
        "(I)V",
        "BEST",
        "HIGH",
        "MIDDLE",
        "LOW",
        "BAD",
        "UN_KNOW",
        "Monitor_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final enum BAD:Lcom/kubi/monitor/utils/DeviceLevel;

.field public static final enum BEST:Lcom/kubi/monitor/utils/DeviceLevel;

.field public static final enum HIGH:Lcom/kubi/monitor/utils/DeviceLevel;

.field public static final enum LOW:Lcom/kubi/monitor/utils/DeviceLevel;

.field public static final enum MIDDLE:Lcom/kubi/monitor/utils/DeviceLevel;

.field public static final enum UN_KNOW:Lcom/kubi/monitor/utils/DeviceLevel;

.field public static final synthetic b:[Lcom/kubi/monitor/utils/DeviceLevel;


# instance fields
.field private value:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/monitor/utils/DeviceLevel;

    .line 3
    .line 4
    const-string v1, "BEST"

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x5

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3}, Lcom/kubi/monitor/utils/DeviceLevel;-><init>(Ljava/lang/String;II)V

    .line 10
    .line 11
    sput-object v0, Lcom/kubi/monitor/utils/DeviceLevel;->BEST:Lcom/kubi/monitor/utils/DeviceLevel;

    .line 12
    .line 13
    new-instance v0, Lcom/kubi/monitor/utils/DeviceLevel;

    .line 14
    .line 15
    const-string v1, "HIGH"

    .line 16
    const/4 v2, 0x1

    .line 17
    const/4 v4, 0x4

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v1, v2, v4}, Lcom/kubi/monitor/utils/DeviceLevel;-><init>(Ljava/lang/String;II)V

    .line 21
    .line 22
    sput-object v0, Lcom/kubi/monitor/utils/DeviceLevel;->HIGH:Lcom/kubi/monitor/utils/DeviceLevel;

    .line 23
    .line 24
    new-instance v0, Lcom/kubi/monitor/utils/DeviceLevel;

    .line 25
    .line 26
    const-string v1, "MIDDLE"

    .line 27
    const/4 v5, 0x2

    .line 28
    const/4 v6, 0x3

    .line 29
    .line 30
    .line 31
    invoke-direct {v0, v1, v5, v6}, Lcom/kubi/monitor/utils/DeviceLevel;-><init>(Ljava/lang/String;II)V

    .line 32
    .line 33
    sput-object v0, Lcom/kubi/monitor/utils/DeviceLevel;->MIDDLE:Lcom/kubi/monitor/utils/DeviceLevel;

    .line 34
    .line 35
    new-instance v0, Lcom/kubi/monitor/utils/DeviceLevel;

    .line 36
    .line 37
    const-string v1, "LOW"

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, v1, v6, v5}, Lcom/kubi/monitor/utils/DeviceLevel;-><init>(Ljava/lang/String;II)V

    .line 41
    .line 42
    sput-object v0, Lcom/kubi/monitor/utils/DeviceLevel;->LOW:Lcom/kubi/monitor/utils/DeviceLevel;

    .line 43
    .line 44
    new-instance v0, Lcom/kubi/monitor/utils/DeviceLevel;

    .line 45
    .line 46
    const-string v1, "BAD"

    .line 47
    .line 48
    .line 49
    invoke-direct {v0, v1, v4, v2}, Lcom/kubi/monitor/utils/DeviceLevel;-><init>(Ljava/lang/String;II)V

    .line 50
    .line 51
    sput-object v0, Lcom/kubi/monitor/utils/DeviceLevel;->BAD:Lcom/kubi/monitor/utils/DeviceLevel;

    .line 52
    .line 53
    new-instance v0, Lcom/kubi/monitor/utils/DeviceLevel;

    .line 54
    .line 55
    const-string v1, "UN_KNOW"

    .line 56
    const/4 v2, -0x1

    .line 57
    .line 58
    .line 59
    invoke-direct {v0, v1, v3, v2}, Lcom/kubi/monitor/utils/DeviceLevel;-><init>(Ljava/lang/String;II)V

    .line 60
    .line 61
    sput-object v0, Lcom/kubi/monitor/utils/DeviceLevel;->UN_KNOW:Lcom/kubi/monitor/utils/DeviceLevel;

    .line 62
    .line 63
    .line 64
    invoke-static {}, Lcom/kubi/monitor/utils/DeviceLevel;->a()[Lcom/kubi/monitor/utils/DeviceLevel;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    sput-object v0, Lcom/kubi/monitor/utils/DeviceLevel;->b:[Lcom/kubi/monitor/utils/DeviceLevel;

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
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
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
    iput p3, p0, Lcom/kubi/monitor/utils/DeviceLevel;->value:I

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
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
.end method

.method public static final synthetic a()[Lcom/kubi/monitor/utils/DeviceLevel;
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/monitor/utils/DeviceLevel;->BEST:Lcom/kubi/monitor/utils/DeviceLevel;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/monitor/utils/DeviceLevel;->HIGH:Lcom/kubi/monitor/utils/DeviceLevel;

    .line 5
    .line 6
    sget-object v2, Lcom/kubi/monitor/utils/DeviceLevel;->MIDDLE:Lcom/kubi/monitor/utils/DeviceLevel;

    .line 7
    .line 8
    sget-object v3, Lcom/kubi/monitor/utils/DeviceLevel;->LOW:Lcom/kubi/monitor/utils/DeviceLevel;

    .line 9
    .line 10
    sget-object v4, Lcom/kubi/monitor/utils/DeviceLevel;->BAD:Lcom/kubi/monitor/utils/DeviceLevel;

    .line 11
    .line 12
    sget-object v5, Lcom/kubi/monitor/utils/DeviceLevel;->UN_KNOW:Lcom/kubi/monitor/utils/DeviceLevel;

    .line 13
    .line 14
    .line 15
    filled-new-array/range {v0 .. v5}, [Lcom/kubi/monitor/utils/DeviceLevel;

    .line 16
    move-result-object v0

    .line 17
    return-object v0
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
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/kubi/monitor/utils/DeviceLevel;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/kubi/monitor/utils/DeviceLevel;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/kubi/monitor/utils/DeviceLevel;

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
.end method

.method public static values()[Lcom/kubi/monitor/utils/DeviceLevel;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/monitor/utils/DeviceLevel;->b:[Lcom/kubi/monitor/utils/DeviceLevel;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/kubi/monitor/utils/DeviceLevel;

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
.end method


# virtual methods
.method public final getValue()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/monitor/utils/DeviceLevel;->value:I

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
.end method

.method public final setValue(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/monitor/utils/DeviceLevel;->value:I

    .line 3
    return-void
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
.end method
