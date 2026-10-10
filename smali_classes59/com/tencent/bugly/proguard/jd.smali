.class public Lcom/tencent/bugly/proguard/jd;
.super Lcom/tencent/bugly/proguard/hf;
.source "BUGLY"


# static fields
.field public static final t:I = 0x3e8

.field public static final u:J = 0x3e8L

.field public static final v:J = 0x1eL

.field public static final w:J = 0x3840L

.field public static final x:J = 0x7530L

.field public static final y:I = 0x1f4

.field public static final z:I = 0x1388


# instance fields
.field public n:J

.field public o:J

.field public p:J

.field public q:I

.field public r:I

.field public s:I


# direct methods
.method public constructor <init>()V
    .locals 7

    const/4 v5, 0x0

    const/16 v6, 0x64

    .line 1
    const-string/jumbo v1, "net_quality"

    const/4 v2, 0x0

    const/16 v3, 0x3e8

    const/high16 v4, 0x3f800000    # 1.0f

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/tencent/bugly/proguard/hf;-><init>(Ljava/lang/String;ZIFFI)V

    const-wide/16 v1, 0x7530

    .line 2
    iput-wide v1, v0, Lcom/tencent/bugly/proguard/jd;->n:J

    .line 3
    iput-wide v1, v0, Lcom/tencent/bugly/proguard/jd;->o:J

    .line 4
    iput-wide v1, v0, Lcom/tencent/bugly/proguard/jd;->p:J

    const/16 v1, 0x64

    .line 5
    iput v1, v0, Lcom/tencent/bugly/proguard/jd;->q:I

    const/16 v1, 0x32

    .line 6
    iput v1, v0, Lcom/tencent/bugly/proguard/jd;->r:I

    const/16 v1, 0x1388

    .line 7
    iput v1, v0, Lcom/tencent/bugly/proguard/jd;->s:I

    return-void
.end method

.method public constructor <init>(Lcom/tencent/bugly/proguard/jd;)V
    .locals 2

    .line 8
    invoke-direct {p0, p1}, Lcom/tencent/bugly/proguard/hf;-><init>(Lcom/tencent/bugly/proguard/hf;)V

    const-wide/16 v0, 0x7530

    .line 9
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/jd;->n:J

    .line 10
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/jd;->o:J

    .line 11
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/jd;->p:J

    const/16 v0, 0x64

    .line 12
    iput v0, p0, Lcom/tencent/bugly/proguard/jd;->q:I

    const/16 v0, 0x32

    .line 13
    iput v0, p0, Lcom/tencent/bugly/proguard/jd;->r:I

    const/16 v0, 0x1388

    .line 14
    iput v0, p0, Lcom/tencent/bugly/proguard/jd;->s:I

    .line 15
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/jd;->a(Lcom/tencent/bugly/proguard/hf;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/tencent/bugly/proguard/hf;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/tencent/bugly/proguard/hf;->a(Lcom/tencent/bugly/proguard/hf;)V

    .line 2
    instance-of v0, p1, Lcom/tencent/bugly/proguard/jd;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Lcom/tencent/bugly/proguard/jd;

    .line 4
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/jd;->n:J

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/jd;->n:J

    .line 5
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/jd;->o:J

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/jd;->o:J

    .line 6
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/jd;->p:J

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/jd;->p:J

    .line 7
    iget v0, p1, Lcom/tencent/bugly/proguard/jd;->q:I

    iput v0, p0, Lcom/tencent/bugly/proguard/jd;->q:I

    .line 8
    iget v0, p1, Lcom/tencent/bugly/proguard/jd;->r:I

    iput v0, p0, Lcom/tencent/bugly/proguard/jd;->r:I

    .line 9
    iget p1, p1, Lcom/tencent/bugly/proguard/jd;->s:I

    iput p1, p0, Lcom/tencent/bugly/proguard/jd;->s:I

    :cond_0
    return-void
.end method

.method public a(Lorg/json/JSONObject;)V
    .locals 2

    .line 10
    invoke-super {p0, p1}, Lcom/tencent/bugly/proguard/hf;->a(Lorg/json/JSONObject;)V

    .line 11
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/jd;->c(Lorg/json/JSONObject;)V

    .line 12
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/jd;->b(Lorg/json/JSONObject;)V

    .line 13
    const-string v0, "cache_size"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 14
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p1

    const/16 v0, 0x1f4

    if-lt p1, v0, :cond_0

    .line 15
    iput p1, p0, Lcom/tencent/bugly/proguard/jd;->s:I

    :cond_0
    return-void
.end method

.method public bridge synthetic b()Lcom/tencent/bugly/proguard/hf;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/jd;->c()Lcom/tencent/bugly/proguard/jd;

    move-result-object v0

    return-object v0
.end method

.method public b(Lorg/json/JSONObject;)V
    .locals 3

    .line 2
    const-string v0, "max_batch_count"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    const/16 v2, 0x3e8

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    if-gt v0, v2, :cond_0

    .line 4
    iput v0, p0, Lcom/tencent/bugly/proguard/jd;->q:I

    .line 5
    :cond_0
    const-string/jumbo v0, "min_batch_count"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 6
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p1

    if-lez p1, :cond_1

    if-gt p1, v2, :cond_1

    .line 7
    iput p1, p0, Lcom/tencent/bugly/proguard/jd;->r:I

    .line 8
    :cond_1
    iget p1, p0, Lcom/tencent/bugly/proguard/jd;->r:I

    iget v0, p0, Lcom/tencent/bugly/proguard/jd;->q:I

    if-le p1, v0, :cond_2

    .line 9
    iput v0, p0, Lcom/tencent/bugly/proguard/jd;->r:I

    :cond_2
    return-void
.end method

.method public c()Lcom/tencent/bugly/proguard/jd;
    .locals 1

    .line 1
    new-instance v0, Lcom/tencent/bugly/proguard/jd;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/jd;-><init>(Lcom/tencent/bugly/proguard/jd;)V

    return-object v0
.end method

.method public c(Lorg/json/JSONObject;)V
    .locals 9

    .line 2
    const-string v0, "call_end_delay_when_success"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    const-wide/16 v2, 0x3e8

    const-wide/16 v4, 0x3840

    const-wide/16 v6, 0x1e

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    cmp-long v8, v0, v6

    if-ltz v8, :cond_0

    cmp-long v8, v0, v4

    if-gtz v8, :cond_0

    mul-long/2addr v0, v2

    .line 4
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/jd;->n:J

    .line 5
    :cond_0
    const-string v0, "call_end_delay_when_fail"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 6
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    cmp-long v8, v0, v6

    if-ltz v8, :cond_1

    cmp-long v8, v0, v4

    if-gtz v8, :cond_1

    mul-long/2addr v0, v2

    .line 7
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/jd;->o:J

    .line 8
    :cond_1
    const-string v0, "call_end_delay_other"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 9
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    cmp-long p1, v0, v6

    if-ltz p1, :cond_2

    cmp-long p1, v0, v4

    if-gtz p1, :cond_2

    mul-long/2addr v0, v2

    .line 10
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/jd;->p:J

    :cond_2
    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/jd;->c()Lcom/tencent/bugly/proguard/jd;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "{callEndDelayWhenSuccess: "

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    iget-wide v1, p0, Lcom/tencent/bugly/proguard/jd;->n:J

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v1, ", callEndDelayWhenFail: "

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    iget-wide v1, p0, Lcom/tencent/bugly/proguard/jd;->o:J

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v1, ", callEndDelayOther: "

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    iget-wide v1, p0, Lcom/tencent/bugly/proguard/jd;->p:J

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v1, ", maxBatchCount: "

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    iget v1, p0, Lcom/tencent/bugly/proguard/jd;->q:I

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string v1, ", minBatchCount: "

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    iget v1, p0, Lcom/tencent/bugly/proguard/jd;->r:I

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v1, ", cacheSize: "

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    iget v1, p0, Lcom/tencent/bugly/proguard/jd;->s:I

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string/jumbo v1, "}"

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    move-result-object v0

    .line 74
    return-object v0
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
