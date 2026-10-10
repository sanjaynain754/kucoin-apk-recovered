.class public Lcom/tencent/bugly/proguard/qa;
.super Ljava/lang/Object;
.source "BUGLY"


# instance fields
.field public a:F

.field public b:J

.field public c:J

.field public d:J

.field public e:Z

.field public f:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const v0, 0x3dcccccd    # 0.1f

    .line 7
    .line 8
    iput v0, p0, Lcom/tencent/bugly/proguard/qa;->a:F

    .line 9
    .line 10
    const-wide/16 v0, 0xc8

    .line 11
    .line 12
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/qa;->b:J

    .line 13
    .line 14
    const-wide/16 v0, 0xbb8

    .line 15
    .line 16
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/qa;->c:J

    .line 17
    .line 18
    const-wide/16 v0, 0x34

    .line 19
    .line 20
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/qa;->d:J

    .line 21
    const/4 v0, 0x1

    .line 22
    .line 23
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/qa;->e:Z

    .line 24
    .line 25
    .line 26
    const-string/jumbo v0, "msg"

    .line 27
    .line 28
    iput-object v0, p0, Lcom/tencent/bugly/proguard/qa;->f:Ljava/lang/String;

    .line 29
    return-void
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
.end method


# virtual methods
.method public a()V
    .locals 2

    const v0, 0x3dcccccd    # 0.1f

    .line 1
    iput v0, p0, Lcom/tencent/bugly/proguard/qa;->a:F

    const-wide/16 v0, 0xc8

    .line 2
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/qa;->b:J

    const-wide/16 v0, 0xbb8

    .line 3
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/qa;->c:J

    const-wide/16 v0, 0x34

    .line 4
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/qa;->d:J

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/qa;->e:Z

    .line 6
    const-string/jumbo v0, "msg"

    iput-object v0, p0, Lcom/tencent/bugly/proguard/qa;->f:Ljava/lang/String;

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/qa;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 7
    :cond_0
    iget v0, p1, Lcom/tencent/bugly/proguard/qa;->a:F

    iput v0, p0, Lcom/tencent/bugly/proguard/qa;->a:F

    .line 8
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/qa;->b:J

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/qa;->b:J

    .line 9
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/qa;->c:J

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/qa;->c:J

    .line 10
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/qa;->d:J

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/qa;->d:J

    .line 11
    iget-boolean v0, p1, Lcom/tencent/bugly/proguard/qa;->e:Z

    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/qa;->e:Z

    .line 12
    iget-object p1, p1, Lcom/tencent/bugly/proguard/qa;->f:Ljava/lang/String;

    iput-object p1, p0, Lcom/tencent/bugly/proguard/qa;->f:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    const-string v1, "["

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    iget v1, p0, Lcom/tencent/bugly/proguard/qa;->a:F

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v1, ","

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    iget-wide v2, p0, Lcom/tencent/bugly/proguard/qa;->b:J

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    iget-wide v2, p0, Lcom/tencent/bugly/proguard/qa;->d:J

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    iget-wide v2, p0, Lcom/tencent/bugly/proguard/qa;->c:J

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    iget-boolean v2, p0, Lcom/tencent/bugly/proguard/qa;->e:Z

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    iget-object v1, p0, Lcom/tencent/bugly/proguard/qa;->f:Ljava/lang/String;

    .line 52
    .line 53
    const-string v2, "]"

    .line 54
    .line 55
    .line 56
    invoke-static {v0, v1, v2}, Lcom/tencent/bugly/proguard/xh;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    move-result-object v0

    .line 58
    return-object v0
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
.end method
