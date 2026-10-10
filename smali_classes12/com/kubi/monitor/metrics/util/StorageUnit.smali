.class public abstract enum Lcom/kubi/monitor/metrics/util/StorageUnit;
.super Ljava/lang/Enum;
.source "StorageUnit.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/kubi/monitor/metrics/util/StorageUnit;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum BYTES:Lcom/kubi/monitor/metrics/util/StorageUnit;

.field public static final enum GIGABYTES:Lcom/kubi/monitor/metrics/util/StorageUnit;

.field public static final enum KILOBYTES:Lcom/kubi/monitor/metrics/util/StorageUnit;

.field public static final enum MEGABYTES:Lcom/kubi/monitor/metrics/util/StorageUnit;

.field public static final enum TERABYTES:Lcom/kubi/monitor/metrics/util/StorageUnit;

.field public static final synthetic b:[Lcom/kubi/monitor/metrics/util/StorageUnit;


# instance fields
.field numBytes:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/monitor/metrics/util/StorageUnit$1;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const-wide v2, 0x10000000000L

    .line 9
    .line 10
    const-string v4, "TERABYTES"

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/kubi/monitor/metrics/util/StorageUnit$1;-><init>(Ljava/lang/String;IJ)V

    .line 14
    .line 15
    sput-object v0, Lcom/kubi/monitor/metrics/util/StorageUnit;->TERABYTES:Lcom/kubi/monitor/metrics/util/StorageUnit;

    .line 16
    .line 17
    new-instance v0, Lcom/kubi/monitor/metrics/util/StorageUnit$2;

    .line 18
    const/4 v1, 0x1

    .line 19
    .line 20
    .line 21
    const-wide/32 v2, 0x40000000

    .line 22
    .line 23
    const-string v4, "GIGABYTES"

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/kubi/monitor/metrics/util/StorageUnit$2;-><init>(Ljava/lang/String;IJ)V

    .line 27
    .line 28
    sput-object v0, Lcom/kubi/monitor/metrics/util/StorageUnit;->GIGABYTES:Lcom/kubi/monitor/metrics/util/StorageUnit;

    .line 29
    .line 30
    new-instance v0, Lcom/kubi/monitor/metrics/util/StorageUnit$3;

    .line 31
    const/4 v1, 0x2

    .line 32
    .line 33
    .line 34
    const-wide/32 v2, 0x100000

    .line 35
    .line 36
    const-string v4, "MEGABYTES"

    .line 37
    .line 38
    .line 39
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/kubi/monitor/metrics/util/StorageUnit$3;-><init>(Ljava/lang/String;IJ)V

    .line 40
    .line 41
    sput-object v0, Lcom/kubi/monitor/metrics/util/StorageUnit;->MEGABYTES:Lcom/kubi/monitor/metrics/util/StorageUnit;

    .line 42
    .line 43
    new-instance v0, Lcom/kubi/monitor/metrics/util/StorageUnit$4;

    .line 44
    const/4 v1, 0x3

    .line 45
    .line 46
    const-wide/16 v2, 0x400

    .line 47
    .line 48
    const-string v4, "KILOBYTES"

    .line 49
    .line 50
    .line 51
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/kubi/monitor/metrics/util/StorageUnit$4;-><init>(Ljava/lang/String;IJ)V

    .line 52
    .line 53
    sput-object v0, Lcom/kubi/monitor/metrics/util/StorageUnit;->KILOBYTES:Lcom/kubi/monitor/metrics/util/StorageUnit;

    .line 54
    .line 55
    new-instance v0, Lcom/kubi/monitor/metrics/util/StorageUnit$5;

    .line 56
    const/4 v1, 0x4

    .line 57
    .line 58
    const-wide/16 v2, 0x1

    .line 59
    .line 60
    const-string v4, "BYTES"

    .line 61
    .line 62
    .line 63
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/kubi/monitor/metrics/util/StorageUnit$5;-><init>(Ljava/lang/String;IJ)V

    .line 64
    .line 65
    sput-object v0, Lcom/kubi/monitor/metrics/util/StorageUnit;->BYTES:Lcom/kubi/monitor/metrics/util/StorageUnit;

    .line 66
    .line 67
    .line 68
    invoke-static {}, Lcom/kubi/monitor/metrics/util/StorageUnit;->a()[Lcom/kubi/monitor/metrics/util/StorageUnit;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    sput-object v0, Lcom/kubi/monitor/metrics/util/StorageUnit;->b:[Lcom/kubi/monitor/metrics/util/StorageUnit;

    .line 72
    return-void
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

.method public constructor <init>(Ljava/lang/String;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 3
    iput-wide p3, p0, Lcom/kubi/monitor/metrics/util/StorageUnit;->numBytes:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IJLcom/kubi/monitor/metrics/util/StorageUnit$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/kubi/monitor/metrics/util/StorageUnit;-><init>(Ljava/lang/String;IJ)V

    return-void
.end method

.method public static synthetic a()[Lcom/kubi/monitor/metrics/util/StorageUnit;
    .locals 5

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/monitor/metrics/util/StorageUnit;->TERABYTES:Lcom/kubi/monitor/metrics/util/StorageUnit;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/monitor/metrics/util/StorageUnit;->GIGABYTES:Lcom/kubi/monitor/metrics/util/StorageUnit;

    .line 5
    .line 6
    sget-object v2, Lcom/kubi/monitor/metrics/util/StorageUnit;->MEGABYTES:Lcom/kubi/monitor/metrics/util/StorageUnit;

    .line 7
    .line 8
    sget-object v3, Lcom/kubi/monitor/metrics/util/StorageUnit;->KILOBYTES:Lcom/kubi/monitor/metrics/util/StorageUnit;

    .line 9
    .line 10
    sget-object v4, Lcom/kubi/monitor/metrics/util/StorageUnit;->BYTES:Lcom/kubi/monitor/metrics/util/StorageUnit;

    .line 11
    .line 12
    .line 13
    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/kubi/monitor/metrics/util/StorageUnit;

    .line 14
    move-result-object v0

    .line 15
    return-object v0
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

.method public static valueOf(Ljava/lang/String;)Lcom/kubi/monitor/metrics/util/StorageUnit;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/kubi/monitor/metrics/util/StorageUnit;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/kubi/monitor/metrics/util/StorageUnit;

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

.method public static values()[Lcom/kubi/monitor/metrics/util/StorageUnit;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/monitor/metrics/util/StorageUnit;->b:[Lcom/kubi/monitor/metrics/util/StorageUnit;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lcom/kubi/monitor/metrics/util/StorageUnit;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/kubi/monitor/metrics/util/StorageUnit;

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
.method public abstract convert(JLcom/kubi/monitor/metrics/util/StorageUnit;)J
.end method

.method public toBytes(J)J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/kubi/monitor/metrics/util/StorageUnit;->numBytes:J

    .line 3
    mul-long/2addr p1, v0

    .line 4
    return-wide p1
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

.method public toGigabytes(J)J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/kubi/monitor/metrics/util/StorageUnit;->numBytes:J

    .line 3
    mul-long/2addr p1, v0

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/monitor/metrics/util/StorageUnit;->GIGABYTES:Lcom/kubi/monitor/metrics/util/StorageUnit;

    .line 6
    .line 7
    iget-wide v0, v0, Lcom/kubi/monitor/metrics/util/StorageUnit;->numBytes:J

    .line 8
    div-long/2addr p1, v0

    .line 9
    return-wide p1
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

.method public toKilobytes(J)J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/kubi/monitor/metrics/util/StorageUnit;->numBytes:J

    .line 3
    mul-long/2addr p1, v0

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/monitor/metrics/util/StorageUnit;->KILOBYTES:Lcom/kubi/monitor/metrics/util/StorageUnit;

    .line 6
    .line 7
    iget-wide v0, v0, Lcom/kubi/monitor/metrics/util/StorageUnit;->numBytes:J

    .line 8
    div-long/2addr p1, v0

    .line 9
    return-wide p1
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

.method public toMegabytes(J)J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/kubi/monitor/metrics/util/StorageUnit;->numBytes:J

    .line 3
    mul-long/2addr p1, v0

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/monitor/metrics/util/StorageUnit;->MEGABYTES:Lcom/kubi/monitor/metrics/util/StorageUnit;

    .line 6
    .line 7
    iget-wide v0, v0, Lcom/kubi/monitor/metrics/util/StorageUnit;->numBytes:J

    .line 8
    div-long/2addr p1, v0

    .line 9
    return-wide p1
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

.method public toTerabytes(J)J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/kubi/monitor/metrics/util/StorageUnit;->numBytes:J

    .line 3
    mul-long/2addr p1, v0

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/monitor/metrics/util/StorageUnit;->TERABYTES:Lcom/kubi/monitor/metrics/util/StorageUnit;

    .line 6
    .line 7
    iget-wide v0, v0, Lcom/kubi/monitor/metrics/util/StorageUnit;->numBytes:J

    .line 8
    div-long/2addr p1, v0

    .line 9
    return-wide p1
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
