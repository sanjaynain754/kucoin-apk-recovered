.class public final Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final f:Lcom/sumsub/sns/internal/features/data/repository/dynamic/a;


# instance fields
.field public final a:J

.field public final b:Z

.field public final c:Z

.field public final d:J

.field public final e:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/a;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;->f:Lcom/sumsub/sns/internal/features/data/repository/dynamic/a;

    .line 8
    return-void
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

.method public synthetic constructor <init>()V
    .locals 9

    const-wide/16 v5, 0xbb8

    const-wide/16 v7, 0x1388

    const-wide/16 v1, 0x78

    const/4 v3, 0x0

    const/4 v4, 0x1

    move-object v0, p0

    .line 1
    invoke-direct/range {v0 .. v8}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;-><init>(JZZJJ)V

    return-void
.end method

.method public constructor <init>(JZZJJ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;->a:J

    .line 4
    iput-boolean p3, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;->b:Z

    .line 5
    iput-boolean p4, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;->c:Z

    .line 6
    iput-wide p5, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;->d:J

    .line 7
    iput-wide p7, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;->e:J

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    :cond_0
    instance-of v1, p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    return v2

    .line 11
    .line 12
    :cond_1
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;

    .line 13
    .line 14
    iget-wide v3, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;->a:J

    .line 15
    .line 16
    iget-wide v5, p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;->a:J

    .line 17
    .line 18
    cmp-long v1, v3, v5

    .line 19
    .line 20
    if-eqz v1, :cond_2

    .line 21
    return v2

    .line 22
    .line 23
    :cond_2
    iget-boolean v1, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;->b:Z

    .line 24
    .line 25
    iget-boolean v3, p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;->b:Z

    .line 26
    .line 27
    if-eq v1, v3, :cond_3

    .line 28
    return v2

    .line 29
    .line 30
    :cond_3
    iget-boolean v1, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;->c:Z

    .line 31
    .line 32
    iget-boolean v3, p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;->c:Z

    .line 33
    .line 34
    if-eq v1, v3, :cond_4

    .line 35
    return v2

    .line 36
    .line 37
    :cond_4
    iget-wide v3, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;->d:J

    .line 38
    .line 39
    iget-wide v5, p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;->d:J

    .line 40
    .line 41
    cmp-long v1, v3, v5

    .line 42
    .line 43
    if-eqz v1, :cond_5

    .line 44
    return v2

    .line 45
    .line 46
    :cond_5
    iget-wide v3, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;->e:J

    .line 47
    .line 48
    iget-wide v5, p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;->e:J

    .line 49
    .line 50
    cmp-long p1, v3, v5

    .line 51
    .line 52
    if-eqz p1, :cond_6

    .line 53
    return v2

    .line 54
    :cond_6
    return v0
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

.method public final hashCode()I
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;->a:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 6
    move-result v0

    .line 7
    .line 8
    const/16 v1, 0x1f

    .line 9
    mul-int/2addr v0, v1

    .line 10
    .line 11
    iget-boolean v2, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;->b:Z

    .line 12
    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Lcom/sumsub/sentry/android/h;->a(ZII)I

    .line 15
    move-result v0

    .line 16
    .line 17
    iget-boolean v2, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;->c:Z

    .line 18
    .line 19
    .line 20
    invoke-static {v2, v0, v1}, Lcom/sumsub/sentry/android/h;->a(ZII)I

    .line 21
    move-result v0

    .line 22
    .line 23
    iget-wide v2, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;->d:J

    .line 24
    .line 25
    .line 26
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 27
    move-result v2

    .line 28
    add-int/2addr v2, v0

    .line 29
    mul-int/2addr v2, v1

    .line 30
    .line 31
    iget-wide v0, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;->e:J

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 35
    move-result v0

    .line 36
    add-int/2addr v0, v2

    .line 37
    return v0
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
.end method

.method public final toString()Ljava/lang/String;
    .locals 10

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;->a:J

    .line 3
    .line 4
    iget-boolean v2, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;->b:Z

    .line 5
    .line 6
    iget-boolean v3, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;->c:Z

    .line 7
    .line 8
    iget-wide v4, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;->d:J

    .line 9
    .line 10
    iget-wide v6, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;->e:J

    .line 11
    .line 12
    new-instance v8, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    const-string v9, "ApplicantPollingConfig(periodSec="

    .line 18
    .line 19
    .line 20
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v8, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v0, ", armedRefresh="

    .line 26
    .line 27
    .line 28
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v0, ", waitForConnection="

    .line 34
    .line 35
    .line 36
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v0, ", waitTimeoutMs="

    .line 42
    .line 43
    .line 44
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v8, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v0, ", stopTimeoutMs="

    .line 50
    .line 51
    .line 52
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v8, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v0, ")"

    .line 58
    .line 59
    .line 60
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    move-result-object v0

    .line 65
    return-object v0
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
