.class public La3d20260409/h$o;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La3d20260409/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "o"
.end annotation


# instance fields
.field public b:J

.field public c:D

.field public d:D

.field public e:D

.field public volatile f:Z

.field public volatile g:Z

.field public h:Z

.field public volatile i:I

.field public j:Z

.field public k:Lorg/json/JSONArray;

.field public final l:Ljava/lang/Object;

.field public m:Lk/e;

.field public n:Lk/e;

.field public final o:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final p:Ljava/util/concurrent/atomic/AtomicInteger;

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:I

.field public final v:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Laai/liveness/Detector$WarnCode;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic w:La3d20260409/h;


# direct methods
.method public constructor <init>(La3d20260409/h;)V
    .locals 1

    .line 1
    .line 2
    iput-object p1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 3
    .line 4
    .line 5
    const-string/jumbo p1, "liveness_worker"

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 9
    const/4 p1, 0x0

    .line 10
    .line 11
    iput-boolean p1, p0, La3d20260409/h$o;->f:Z

    .line 12
    .line 13
    iput-boolean p1, p0, La3d20260409/h$o;->h:Z

    .line 14
    .line 15
    iput-boolean p1, p0, La3d20260409/h$o;->j:Z

    .line 16
    .line 17
    new-instance v0, Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    iput-object v0, p0, La3d20260409/h$o;->l:Ljava/lang/Object;

    .line 23
    .line 24
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 28
    .line 29
    iput-object v0, p0, La3d20260409/h$o;->o:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 30
    .line 31
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 32
    .line 33
    .line 34
    invoke-direct {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 35
    .line 36
    iput-object v0, p0, La3d20260409/h$o;->p:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 37
    .line 38
    new-instance p1, Ljava/util/HashMap;

    .line 39
    .line 40
    .line 41
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 42
    .line 43
    iput-object p1, p0, La3d20260409/h$o;->v:Ljava/util/Map;

    .line 44
    return-void
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
.end method

.method public static synthetic A(La3d20260409/h$o;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, La3d20260409/h$o;->g:Z

    .line 3
    return p0
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
.end method

.method public static synthetic B(La3d20260409/h$o;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, La3d20260409/h$o;->s:I

    .line 3
    return p0
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
.end method

.method public static synthetic E(La3d20260409/h$o;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, La3d20260409/h$o;->o:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3
    return-object p0
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
.end method

.method public static synthetic G(La3d20260409/h$o;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, La3d20260409/h$o;->u:I

    .line 3
    return p0
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
.end method

.method public static synthetic a([[B[B[BJ)Lg/c;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3, p4}, La3d20260409/h$o;->k([[B[B[BJ)Lg/c;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
.end method

.method public static synthetic b(La3d20260409/h$o;)Ljava/util/Map;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, La3d20260409/h$o;->v:Ljava/util/Map;

    .line 3
    return-object p0
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
.end method

.method public static synthetic f(La3d20260409/h$o;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, La3d20260409/h$o;->p:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3
    return-object p0
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
.end method

.method public static synthetic h(La3d20260409/h$o;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, La3d20260409/h$o;->r:I

    .line 3
    return p0
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
.end method

.method public static synthetic k([[B[B[BJ)Lg/c;
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lg/c$b;

    .line 3
    .line 4
    const-string v1, "images_build_result"

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Lg/c$b;-><init>(Ljava/lang/String;)V

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    aget-object v2, p0, v1

    .line 11
    const/4 v3, 0x1

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    move v2, v3

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v2, v1

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    const-string v4, "distant_image_is_null"

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v4, v2}, Lg/c$b;->c(Ljava/lang/String;Ljava/lang/Object;)Lg/c$b;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    aget-object v2, p0, v3

    .line 29
    .line 30
    if-nez v2, :cond_1

    .line 31
    move v2, v3

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v2, v1

    .line 34
    .line 35
    .line 36
    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    const-string v4, "distant_original_size_image_is_null"

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v4, v2}, Lg/c$b;->c(Ljava/lang/String;Ljava/lang/Object;)Lg/c$b;

    .line 43
    move-result-object v0

    .line 44
    const/4 v2, 0x2

    .line 45
    .line 46
    aget-object p0, p0, v2

    .line 47
    .line 48
    if-nez p0, :cond_2

    .line 49
    move p0, v3

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    move p0, v1

    .line 52
    .line 53
    .line 54
    :goto_2
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 55
    move-result-object p0

    .line 56
    .line 57
    const-string v2, "full_face_image_is_null"

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v2, p0}, Lg/c$b;->c(Ljava/lang/String;Ljava/lang/Object;)Lg/c$b;

    .line 61
    move-result-object p0

    .line 62
    .line 63
    if-nez p1, :cond_3

    .line 64
    move p1, v3

    .line 65
    goto :goto_3

    .line 66
    :cond_3
    move p1, v1

    .line 67
    .line 68
    .line 69
    :goto_3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    const-string v0, "distant_original_ratio_image_is_null"

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v0, p1}, Lg/c$b;->c(Ljava/lang/String;Ljava/lang/Object;)Lg/c$b;

    .line 76
    move-result-object p0

    .line 77
    .line 78
    if-nez p2, :cond_4

    .line 79
    move v1, v3

    .line 80
    .line 81
    .line 82
    :cond_4
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 83
    move-result-object p1

    .line 84
    .line 85
    .line 86
    const-string/jumbo p2, "near_image_is_null"

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, p2, p1}, Lg/c$b;->c(Ljava/lang/String;Ljava/lang/Object;)Lg/c$b;

    .line 90
    move-result-object p0

    .line 91
    .line 92
    .line 93
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 94
    move-result-wide p1

    .line 95
    sub-long/2addr p1, p3

    .line 96
    .line 97
    .line 98
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 99
    move-result-object p1

    .line 100
    .line 101
    const-string p2, "cost"

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0, p2, p1}, Lg/c$b;->c(Ljava/lang/String;Ljava/lang/Object;)Lg/c$b;

    .line 105
    move-result-object p0

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Lg/c$b;->d()Lg/c;

    .line 109
    move-result-object p0

    .line 110
    return-object p0
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
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
.end method

.method public static synthetic l(La3d20260409/h$o;)Lorg/json/JSONArray;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, La3d20260409/h$o;->k:Lorg/json/JSONArray;

    .line 3
    return-object p0
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
.end method

.method public static synthetic t(La3d20260409/h$o;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, La3d20260409/h$o;->t:I

    .line 3
    return p0
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
.end method

.method public static synthetic v(La3d20260409/h$o;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, La3d20260409/h$o;->q:I

    .line 3
    return p0
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
.end method


# virtual methods
.method public final C()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    iput-wide v0, p0, La3d20260409/h$o;->b:J

    .line 7
    .line 8
    iget-object v2, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 9
    .line 10
    iget-object v2, v2, La3d20260409/h;->j:La3d20260409/f;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2, v0, v1}, La3d20260409/f;->L(J)V

    .line 14
    .line 15
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, La3d20260409/h;->v0(La3d20260409/h;)Laai/liveness/Detector$DetectionType;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 24
    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    iget-object v2, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 31
    .line 32
    .line 33
    invoke-static {v2}, La3d20260409/h;->v0(La3d20260409/h;)Laai/liveness/Detector$DetectionType;

    .line 34
    move-result-object v2

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 38
    move-result-object v2

    .line 39
    .line 40
    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 44
    move-result-object v2

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v2, "_start"

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    .line 59
    invoke-static {v0, v1}, La3d20260409/h;->i(La3d20260409/h;Ljava/lang/String;)V

    .line 60
    :cond_0
    return-void
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
.end method

.method public final D(Ljava/lang/Object;)V
    .locals 2

    .line 1
    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    iput-wide v0, p0, La3d20260409/h$o;->d:D

    .line 5
    .line 6
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, La3d20260409/h;->d(La3d20260409/h;La3d20260409/c;)La3d20260409/c;

    .line 11
    .line 12
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 13
    .line 14
    iget-object v0, v0, La3d20260409/h;->j:La3d20260409/f;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, La3d20260409/f;->A(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1}, La3d20260409/h$o;->y(Ljava/lang/Object;)V

    .line 21
    return-void
    .line 22
    .line 23
    .line 24
.end method

.method public final F()V
    .locals 9

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 3
    .line 4
    sget-object v1, Lintl/OoOOoOoO;->oOOOOOooooOo:Lintl/OoOOoOoO;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, La3d20260409/h;->G(Lintl/OoOOoOoO;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    move-result-wide v6

    .line 12
    .line 13
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, La3d20260409/h;->p0(La3d20260409/h;)La3d20260409/c;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, La3d20260409/c;->f()[[B

    .line 21
    move-result-object v3

    .line 22
    const/4 v1, 0x0

    .line 23
    .line 24
    aget-object v0, v3, v1

    .line 25
    const/4 v2, 0x2

    .line 26
    .line 27
    aget-object v2, v3, v2

    .line 28
    const/4 v8, 0x1

    .line 29
    .line 30
    aget-object v4, v3, v8

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v2, v4}, La3d20260409/j3d20260409;->Oo0Oo00O0000o([B[B[B)V

    .line 34
    .line 35
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, La3d20260409/h;->p0(La3d20260409/h;)La3d20260409/c;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    sget-object v2, La3d20260409/oOooooooo0000000000;->O0OOOoOooo:La3d20260409/oOooooooo0000000000;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v2}, La3d20260409/c;->d(La3d20260409/oOooooooo0000000000;)[B

    .line 45
    move-result-object v4

    .line 46
    .line 47
    .line 48
    invoke-static {v4}, La3d20260409/j3d20260409;->Ooo([B)V

    .line 49
    .line 50
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, La3d20260409/h;->h0(La3d20260409/h;)La3d20260409/c;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    sget-object v2, La3d20260409/oOooooooo0000000000;->OOOoooooo:La3d20260409/oOooooooo0000000000;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v2}, La3d20260409/c;->d(La3d20260409/oOooooooo0000000000;)[B

    .line 60
    move-result-object v5

    .line 61
    .line 62
    .line 63
    invoke-static {v5}, La3d20260409/j3d20260409;->Oo0Oo00O0000O([B)V

    .line 64
    .line 65
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, La3d20260409/h;->j0(La3d20260409/h;)La3d20260409/c;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    if-eqz v0, :cond_0

    .line 72
    .line 73
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 74
    .line 75
    .line 76
    invoke-static {v0}, La3d20260409/h;->j0(La3d20260409/h;)La3d20260409/c;

    .line 77
    move-result-object v0

    .line 78
    .line 79
    sget-object v2, La3d20260409/oOooooooo0000000000;->OoooOOOoooooo:La3d20260409/oOooooooo0000000000;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v2}, La3d20260409/c;->d(La3d20260409/oOooooooo0000000000;)[B

    .line 83
    move-result-object v0

    .line 84
    .line 85
    .line 86
    invoke-static {v0}, La3d20260409/j3d20260409;->Oo0Oo00O000([B)V

    .line 87
    .line 88
    :cond_0
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 89
    .line 90
    new-instance v2, La3d20260409/i;

    .line 91
    .line 92
    .line 93
    invoke-direct/range {v2 .. v7}, La3d20260409/i;-><init>([[B[B[BJ)V

    .line 94
    .line 95
    .line 96
    invoke-static {v0, v2}, La3d20260409/h;->z(La3d20260409/h;Lg/a;)V

    .line 97
    .line 98
    iput-boolean v8, p0, La3d20260409/h$o;->g:Z

    .line 99
    .line 100
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 101
    .line 102
    .line 103
    invoke-static {v0}, La3d20260409/h;->m(La3d20260409/h;)Lc/a;

    .line 104
    move-result-object v0

    .line 105
    .line 106
    if-eqz v0, :cond_1

    .line 107
    .line 108
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 109
    .line 110
    .line 111
    invoke-static {v0}, La3d20260409/h;->m(La3d20260409/h;)Lc/a;

    .line 112
    move-result-object v0

    .line 113
    .line 114
    .line 115
    invoke-interface {v0}, Lc/a;->p()V

    .line 116
    .line 117
    :cond_1
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 118
    .line 119
    sget-object v2, Lintl/OoOOoOoO;->O0ooooooooO:Lintl/OoOOoOoO;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v2}, La3d20260409/h;->G(Lintl/OoOOoOoO;)V

    .line 123
    .line 124
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 125
    .line 126
    iget-object v0, v0, La3d20260409/h;->j:La3d20260409/f;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, La3d20260409/f;->y0()V

    .line 130
    .line 131
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 132
    .line 133
    sget-object v2, Lintl/OoooOOOoooooo;->ooO00O0O0Oo:Lintl/OoooOOOoooooo;

    .line 134
    .line 135
    .line 136
    invoke-static {v0, v2}, La3d20260409/h;->A(La3d20260409/h;Lintl/OoooOOOoooooo;)V

    .line 137
    .line 138
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 139
    .line 140
    sget-object v2, La3d20260409/O0000o0o0;->OoOOO0o:La3d20260409/O0000o0o0;

    .line 141
    .line 142
    .line 143
    invoke-static {v0, v2}, La3d20260409/h;->x(La3d20260409/h;La3d20260409/O0000o0o0;)V

    .line 144
    .line 145
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, La3d20260409/h;->w0()Z

    .line 149
    move-result v0

    .line 150
    .line 151
    if-eqz v0, :cond_4

    .line 152
    .line 153
    sget-object v0, Lintl/oOooooooo0000000000;->OOOOooooo:Lintl/oOooooooo0000000000;

    .line 154
    .line 155
    .line 156
    invoke-static {v0}, La3d20260409/v;->r(Lintl/oOooooooo0000000000;)Z

    .line 157
    move-result v0

    .line 158
    .line 159
    if-eqz v0, :cond_2

    .line 160
    .line 161
    :try_start_0
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 162
    .line 163
    .line 164
    invoke-static {v0}, La3d20260409/h;->f(La3d20260409/h;)Lwe0/c;

    .line 165
    move-result-object v0

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0}, Lwe0/c;->o()Landroid/util/Pair;

    .line 169
    move-result-object v0

    .line 170
    .line 171
    iget-object v2, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 172
    .line 173
    iget-object v2, v2, La3d20260409/h;->j:La3d20260409/f;

    .line 174
    .line 175
    iget-object v3, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v3, Ljava/lang/Integer;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 181
    move-result v3

    .line 182
    .line 183
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v0, Ljava/lang/Integer;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 189
    move-result v0

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2, v3, v0}, La3d20260409/f;->f0(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 193
    goto :goto_0

    .line 194
    :catchall_0
    move-exception v0

    .line 195
    .line 196
    iget-object v2, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2, v0}, La3d20260409/h;->K(Ljava/lang/Throwable;)V

    .line 200
    .line 201
    :cond_2
    :goto_0
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 202
    .line 203
    iget-object v0, v0, La3d20260409/h;->j:La3d20260409/f;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0}, La3d20260409/f;->i0()V

    .line 207
    .line 208
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 209
    .line 210
    .line 211
    invoke-static {v0, v1}, La3d20260409/h;->N(La3d20260409/h;Z)Z

    .line 212
    .line 213
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 214
    .line 215
    .line 216
    invoke-static {v0}, La3d20260409/h;->m(La3d20260409/h;)Lc/a;

    .line 217
    move-result-object v0

    .line 218
    .line 219
    if-eqz v0, :cond_3

    .line 220
    .line 221
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 222
    .line 223
    .line 224
    invoke-static {v0}, La3d20260409/h;->m(La3d20260409/h;)Lc/a;

    .line 225
    move-result-object v1

    .line 226
    .line 227
    new-instance v2, La3d20260409/j;

    .line 228
    .line 229
    sget-object v3, Laai/liveness/Detector$WarnCode;->OK:Laai/liveness/Detector$WarnCode;

    .line 230
    .line 231
    .line 232
    invoke-direct {v2, v3}, La3d20260409/j;-><init>(Laai/liveness/Detector$WarnCode;)V

    .line 233
    .line 234
    .line 235
    invoke-interface {v1, v2}, Lc/a;->f(La3d20260409/j;)Laai/liveness/Detector$DetectionType;

    .line 236
    move-result-object v1

    .line 237
    .line 238
    .line 239
    invoke-static {v0, v1}, La3d20260409/h;->s(La3d20260409/h;Laai/liveness/Detector$DetectionType;)Laai/liveness/Detector$DetectionType;

    .line 240
    :cond_3
    return-void

    .line 241
    .line 242
    :cond_4
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 243
    .line 244
    iget-object v1, v0, La3d20260409/h;->j:La3d20260409/f;

    .line 245
    .line 246
    .line 247
    invoke-static {v0}, La3d20260409/h;->v0(La3d20260409/h;)Laai/liveness/Detector$DetectionType;

    .line 248
    move-result-object v0

    .line 249
    .line 250
    .line 251
    invoke-virtual {v1, v0}, La3d20260409/f;->O(Laai/liveness/Detector$DetectionType;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p0}, La3d20260409/h$o;->C()V

    .line 255
    return-void
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
.end method

.method public H()V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lintl/oOooooooo0000000000;->OOOOooooo:Lintl/oOooooooo0000000000;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, La3d20260409/v;->r(Lintl/oOooooooo0000000000;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, La3d20260409/h;->f(La3d20260409/h;)Lwe0/c;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lwe0/c;->h()Lorg/json/JSONObject;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    iget-object v1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 21
    .line 22
    iget-object v1, v1, La3d20260409/h;->j:La3d20260409/f;

    .line 23
    .line 24
    .line 25
    const-string/jumbo v2, "rpt_result"

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2, v0}, Lm/b;->k(Ljava/lang/String;Ljava/lang/Object;)V

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    .line 32
    :goto_0
    iget-object v1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 33
    .line 34
    new-instance v2, La3d20260409/h$o$a;

    .line 35
    .line 36
    .line 37
    invoke-direct {v2, p0, v0}, La3d20260409/h$o$a;-><init>(La3d20260409/h$o;Lorg/json/JSONObject;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v1, v2}, La3d20260409/h;->z(La3d20260409/h;Lg/a;)V

    .line 41
    .line 42
    iget-object v0, p0, La3d20260409/h$o;->l:Ljava/lang/Object;

    .line 43
    monitor-enter v0

    .line 44
    .line 45
    :try_start_0
    iget-object v1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 46
    .line 47
    new-instance v2, La3d20260409/h$o$e;

    .line 48
    .line 49
    .line 50
    invoke-direct {v2, p0}, La3d20260409/h$o$e;-><init>(La3d20260409/h$o;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v1, v2}, La3d20260409/h;->z(La3d20260409/h;Lg/a;)V

    .line 54
    monitor-exit v0

    .line 55
    return-void

    .line 56
    :catchall_0
    move-exception v1

    .line 57
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    throw v1
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
.end method

.method public c()V
    .locals 2

    .line 1
    .line 2
    iget v0, p0, La3d20260409/h$o;->i:I

    .line 3
    .line 4
    sget-object v1, Lintl/o0oOOOOOooooo;->OOOOOoooooooO:Lintl/o0oOOOOOooooo;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 8
    move-result v1

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, La3d20260409/h$o;->o:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 16
    return-void

    .line 17
    .line 18
    :cond_0
    iget v0, p0, La3d20260409/h$o;->i:I

    .line 19
    .line 20
    sget-object v1, Lintl/o0oOOOOOooooo;->OOOOOoooo:Lintl/o0oOOOOOooooo;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 24
    move-result v1

    .line 25
    .line 26
    if-ne v0, v1, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, La3d20260409/h$o;->p:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return-void
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
.end method

.method public final d(La3d20260409/c;La3d20260409/b;)V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p2, La3d20260409/b;->c:Lintl/o0oOOOOOooooo;

    .line 3
    .line 4
    sget-object v1, Lintl/o0oOOOOOooooo;->ooooOOOOO:Lintl/o0oOOOOOooooo;

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v0, p2, La3d20260409/b;->b:Laai/liveness/Detector$WarnCode;

    .line 9
    .line 10
    sget-object v1, Laai/liveness/Detector$WarnCode;->OK:Laai/liveness/Detector$WarnCode;

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    sget-object v0, Laai/liveness/Detector$WarnCode;->PLEASE_BLINK:Laai/liveness/Detector$WarnCode;

    .line 15
    goto :goto_0

    .line 16
    .line 17
    :cond_0
    iget-object v0, p2, La3d20260409/b;->b:Laai/liveness/Detector$WarnCode;

    .line 18
    .line 19
    :goto_0
    new-instance v1, La3d20260409/j;

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, v0}, La3d20260409/j;-><init>(Laai/liveness/Detector$WarnCode;)V

    .line 23
    .line 24
    iget-object v2, p2, La3d20260409/b;->e:La3d20260409/e;

    .line 25
    .line 26
    iput-object v2, v1, La3d20260409/j;->c:La3d20260409/e;

    .line 27
    .line 28
    iget-object v2, p2, La3d20260409/b;->f:Ljava/lang/String;

    .line 29
    .line 30
    iput-object v2, v1, La3d20260409/j;->d:Ljava/lang/String;

    .line 31
    .line 32
    sget-object v2, Laai/liveness/Detector$WarnCode;->FACECAPTURE:Laai/liveness/Detector$WarnCode;

    .line 33
    const/4 v3, 0x1

    .line 34
    .line 35
    if-eq v0, v2, :cond_2

    .line 36
    .line 37
    sget-object v2, Laai/liveness/Detector$WarnCode;->OK:Laai/liveness/Detector$WarnCode;

    .line 38
    .line 39
    if-eq v0, v2, :cond_2

    .line 40
    .line 41
    iget-object v2, p0, La3d20260409/h$o;->v:Ljava/util/Map;

    .line 42
    .line 43
    .line 44
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    move-result-object v2

    .line 46
    .line 47
    check-cast v2, Ljava/lang/Integer;

    .line 48
    .line 49
    iget-object v4, p0, La3d20260409/h$o;->v:Ljava/util/Map;

    .line 50
    .line 51
    if-nez v2, :cond_1

    .line 52
    move v2, v3

    .line 53
    goto :goto_1

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 57
    move-result v2

    .line 58
    add-int/2addr v2, v3

    .line 59
    .line 60
    .line 61
    :goto_1
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    move-result-object v2

    .line 63
    .line 64
    .line 65
    invoke-interface {v4, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    :cond_2
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 68
    .line 69
    .line 70
    invoke-static {v0}, La3d20260409/h;->m(La3d20260409/h;)Lc/a;

    .line 71
    move-result-object v0

    .line 72
    .line 73
    if-eqz v0, :cond_3

    .line 74
    .line 75
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 76
    .line 77
    .line 78
    invoke-static {v0}, La3d20260409/h;->m(La3d20260409/h;)Lc/a;

    .line 79
    move-result-object v0

    .line 80
    .line 81
    .line 82
    invoke-interface {v0, v1}, Lc/a;->m(La3d20260409/j;)V

    .line 83
    .line 84
    .line 85
    :cond_3
    invoke-virtual {p0, p1, v1}, La3d20260409/h$o;->r(La3d20260409/c;La3d20260409/j;)Z

    .line 86
    move-result p1

    .line 87
    .line 88
    if-eqz p1, :cond_4

    .line 89
    goto :goto_2

    .line 90
    .line 91
    :cond_4
    iget-object p1, p2, La3d20260409/b;->b:Laai/liveness/Detector$WarnCode;

    .line 92
    .line 93
    if-eqz p1, :cond_8

    .line 94
    .line 95
    sget-object p2, La3d20260409/h$g;->b:[I

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 99
    move-result p1

    .line 100
    .line 101
    aget p1, p2, p1

    .line 102
    .line 103
    if-eq p1, v3, :cond_5

    .line 104
    goto :goto_2

    .line 105
    .line 106
    :cond_5
    iget-object p1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 107
    .line 108
    .line 109
    invoke-static {p1}, La3d20260409/h;->v0(La3d20260409/h;)Laai/liveness/Detector$DetectionType;

    .line 110
    move-result-object p1

    .line 111
    .line 112
    if-eqz p1, :cond_6

    .line 113
    .line 114
    iget-object p1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 115
    .line 116
    new-instance p2, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 120
    .line 121
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 122
    .line 123
    .line 124
    invoke-static {v0}, La3d20260409/h;->v0(La3d20260409/h;)Laai/liveness/Detector$DetectionType;

    .line 125
    move-result-object v0

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 129
    move-result-object v0

    .line 130
    .line 131
    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 135
    move-result-object v0

    .line 136
    .line 137
    .line 138
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    const-string v0, "_finished"

    .line 141
    .line 142
    .line 143
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    move-result-object p2

    .line 148
    .line 149
    .line 150
    invoke-static {p1, p2}, La3d20260409/h;->i(La3d20260409/h;Ljava/lang/String;)V

    .line 151
    .line 152
    :cond_6
    iget-object p1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 153
    .line 154
    .line 155
    invoke-static {p1}, La3d20260409/h;->m(La3d20260409/h;)Lc/a;

    .line 156
    move-result-object p1

    .line 157
    .line 158
    if-eqz p1, :cond_7

    .line 159
    .line 160
    iget-object p1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 161
    .line 162
    .line 163
    invoke-static {p1}, La3d20260409/h;->m(La3d20260409/h;)Lc/a;

    .line 164
    move-result-object p2

    .line 165
    .line 166
    .line 167
    invoke-interface {p2, v1}, Lc/a;->f(La3d20260409/j;)Laai/liveness/Detector$DetectionType;

    .line 168
    move-result-object p2

    .line 169
    .line 170
    .line 171
    invoke-static {p1, p2}, La3d20260409/h;->s(La3d20260409/h;Laai/liveness/Detector$DetectionType;)Laai/liveness/Detector$DetectionType;

    .line 172
    .line 173
    .line 174
    :cond_7
    invoke-virtual {p0}, La3d20260409/h$o;->w()V

    .line 175
    :cond_8
    :goto_2
    return-void
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
.end method

.method public final e(Ljava/lang/Object;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, La3d20260409/h$o;->f:Z

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    iput-wide v0, p0, La3d20260409/h$o;->c:D

    .line 8
    .line 9
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 10
    const/4 v1, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, La3d20260409/h;->r(La3d20260409/h;La3d20260409/c;)La3d20260409/c;

    .line 14
    .line 15
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 16
    .line 17
    iget-object v0, v0, La3d20260409/h;->j:La3d20260409/f;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, La3d20260409/f;->T(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, La3d20260409/h$o;->y(Ljava/lang/Object;)V

    .line 24
    return-void
.end method

.method public final g()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 3
    .line 4
    new-instance v1, La3d20260409/h$o$o;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0}, La3d20260409/h$o$o;-><init>(La3d20260409/h$o;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, La3d20260409/h;->h(La3d20260409/h;Lg/a;)V

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public final i()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 3
    .line 4
    new-instance v1, La3d20260409/h$o$i;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0}, La3d20260409/h$o$i;-><init>(La3d20260409/h$o;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, La3d20260409/h;->h(La3d20260409/h;Lg/a;)V

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public final j(La3d20260409/c;)La3d20260409/b;
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    iget-object v2, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 7
    .line 8
    .line 9
    invoke-static {v2}, La3d20260409/h;->b(La3d20260409/h;)J

    .line 10
    move-result-wide v3

    .line 11
    .line 12
    iget-object v5, p1, La3d20260409/c;->a:[B

    .line 13
    .line 14
    iget v6, p1, La3d20260409/c;->b:I

    .line 15
    .line 16
    iget v7, p1, La3d20260409/c;->c:I

    .line 17
    .line 18
    iget-object v2, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 19
    .line 20
    .line 21
    invoke-static {v2}, La3d20260409/h;->v0(La3d20260409/h;)Laai/liveness/Detector$DetectionType;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    iget v8, v2, Laai/liveness/Detector$DetectionType;->mInterValue:I

    .line 25
    .line 26
    .line 27
    invoke-static/range {v3 .. v8}, La3d20260409/v;->m(J[BIII)Ljava/lang/String;

    .line 28
    move-result-object v2

    .line 29
    .line 30
    new-instance v3, La3d20260409/b;

    .line 31
    .line 32
    .line 33
    invoke-direct {v3}, La3d20260409/b;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 37
    move-result-wide v4

    .line 38
    sub-long/2addr v4, v0

    .line 39
    long-to-int v0, v4

    .line 40
    .line 41
    iput v0, v3, La3d20260409/b;->j:I

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3, v2}, La3d20260409/b;->a(Ljava/lang/String;)V

    .line 45
    .line 46
    iget v0, p1, La3d20260409/c;->e:I

    .line 47
    .line 48
    iput v0, v3, La3d20260409/b;->k:I

    .line 49
    .line 50
    iget-object v0, v3, La3d20260409/b;->e:La3d20260409/e;

    .line 51
    .line 52
    iput-object v0, p1, La3d20260409/c;->f:La3d20260409/e;

    .line 53
    .line 54
    iget-object p1, p1, La3d20260409/c;->g:La3d20260409/d;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/graphics/YuvImage;->getYuvData()[B

    .line 58
    move-result-object p1

    .line 59
    .line 60
    .line 61
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 62
    move-result-wide v0

    .line 63
    .line 64
    .line 65
    invoke-static {p1, v0, v1}, La3d20260409/j3d20260409;->oO0oOO([BJ)[B

    .line 66
    move-result-object p1

    .line 67
    .line 68
    if-eqz p1, :cond_0

    .line 69
    array-length v0, p1

    .line 70
    .line 71
    if-lez v0, :cond_0

    .line 72
    .line 73
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 74
    .line 75
    .line 76
    invoke-static {v0}, La3d20260409/h;->X(La3d20260409/h;)La3d20260409/o0o00;

    .line 77
    move-result-object v0

    .line 78
    .line 79
    if-eqz v0, :cond_0

    .line 80
    .line 81
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 82
    .line 83
    .line 84
    const-string/jumbo v1, "wt_st"

    .line 85
    .line 86
    .line 87
    invoke-static {v0, v1}, La3d20260409/h;->B(La3d20260409/h;Ljava/lang/String;)V

    .line 88
    .line 89
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 90
    .line 91
    .line 92
    invoke-static {v0}, La3d20260409/h;->X(La3d20260409/h;)La3d20260409/o0o00;

    .line 93
    move-result-object v0

    .line 94
    .line 95
    iget-object v1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 96
    .line 97
    .line 98
    invoke-static {v1}, La3d20260409/h;->X(La3d20260409/h;)La3d20260409/o0o00;

    .line 99
    move-result-object v1

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Lai/advance/common/camera/GuardianCameraViewV3;->getCamera()Landroid/hardware/Camera;

    .line 103
    move-result-object v1

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, p1, v1}, La3d20260409/o0o00;->onPreviewFrame([BLandroid/hardware/Camera;)V

    .line 107
    :cond_0
    return-object v3
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
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public m(La3d20260409/b;)V
    .locals 4

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, La3d20260409/h$o;->l:Ljava/lang/Object;

    .line 3
    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    :try_start_1
    new-instance v1, Lorg/json/JSONObject;

    .line 6
    .line 7
    .line 8
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 9
    .line 10
    const-string v2, "c"

    .line 11
    .line 12
    iget v3, p1, La3d20260409/b;->k:I

    .line 13
    .line 14
    .line 15
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    move-result-object v3

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v2, v3}, Lk/g;->i(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    const-string/jumbo v2, "m"

    .line 23
    .line 24
    iget v3, p1, La3d20260409/b;->j:I

    .line 25
    .line 26
    .line 27
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    move-result-object v3

    .line 29
    .line 30
    .line 31
    invoke-static {v1, v2, v3}, Lk/g;->i(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 32
    .line 33
    iget-object v2, p0, La3d20260409/h$o;->k:Lorg/json/JSONArray;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 37
    .line 38
    iget-object v1, p0, La3d20260409/h$o;->m:Lk/e;

    .line 39
    .line 40
    iget v2, p1, La3d20260409/b;->j:I

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v2}, Lk/e;->e(I)V

    .line 44
    .line 45
    iget-object v1, p0, La3d20260409/h$o;->n:Lk/e;

    .line 46
    .line 47
    iget p1, p1, La3d20260409/b;->k:I

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, p1}, Lk/e;->e(I)V

    .line 51
    monitor-exit v0

    .line 52
    return-void

    .line 53
    :catchall_0
    move-exception p1

    .line 54
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    :try_start_2
    throw p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 56
    :catch_0
    move-exception p1

    .line 57
    .line 58
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, p1}, La3d20260409/h;->K(Ljava/lang/Throwable;)V

    .line 62
    return-void
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

.method public final n(La3d20260409/c;La3d20260409/b;)V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p2, La3d20260409/b;->c:Lintl/o0oOOOOOooooo;

    .line 3
    .line 4
    iget v1, p0, La3d20260409/h$o;->i:I

    .line 5
    .line 6
    sget-object v2, Lintl/o0oOOOOOooooo;->OOOOOoooooooO:Lintl/o0oOOOOOooooo;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 10
    move-result v3

    .line 11
    .line 12
    if-ne v1, v3, :cond_0

    .line 13
    .line 14
    sget-object v1, Lintl/o0oOOOOOooooo;->OOOOooooo:Lintl/o0oOOOOOooooo;

    .line 15
    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, La3d20260409/h$o;->i()V

    .line 20
    .line 21
    sget-object v1, Lintl/oOooooooo0000000000;->OOOOOoooooooO:Lintl/oOooooooo0000000000;

    .line 22
    .line 23
    .line 24
    invoke-static {v1}, La3d20260409/v;->r(Lintl/oOooooooo0000000000;)Z

    .line 25
    move-result v1

    .line 26
    .line 27
    if-eqz v1, :cond_3

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, La3d20260409/h$o;->s()[B

    .line 31
    move-result-object v1

    .line 32
    .line 33
    .line 34
    invoke-static {v1}, La3d20260409/j3d20260409;->Oo0O00O0000oooo([B)V

    .line 35
    goto :goto_0

    .line 36
    .line 37
    :cond_0
    iget v1, p0, La3d20260409/h$o;->i:I

    .line 38
    .line 39
    sget-object v3, Lintl/o0oOOOOOooooo;->OOOOOoooo:Lintl/o0oOOOOOooooo;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 43
    move-result v3

    .line 44
    .line 45
    if-ne v1, v3, :cond_2

    .line 46
    .line 47
    sget-object v1, Lintl/o0oOOOOOooooo;->O0OOOoOooo:Lintl/o0oOOOOOooooo;

    .line 48
    .line 49
    if-eq v0, v1, :cond_1

    .line 50
    .line 51
    sget-object v1, Lintl/o0oOOOOOooooo;->ooooOOOOO:Lintl/o0oOOOOOooooo;

    .line 52
    .line 53
    if-ne v0, v1, :cond_2

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-virtual {p0}, La3d20260409/h$o;->g()V

    .line 57
    .line 58
    sget-object v1, Lintl/oOooooooo0000000000;->OOOOOoooooooO:Lintl/oOooooooo0000000000;

    .line 59
    .line 60
    .line 61
    invoke-static {v1}, La3d20260409/v;->r(Lintl/oOooooooo0000000000;)Z

    .line 62
    move-result v1

    .line 63
    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, La3d20260409/h$o;->s()[B

    .line 68
    move-result-object v1

    .line 69
    .line 70
    .line 71
    invoke-static {v1}, La3d20260409/j3d20260409;->Oo0O00Oo000oooo([B)V

    .line 72
    goto :goto_0

    .line 73
    .line 74
    :cond_2
    iget v1, p0, La3d20260409/h$o;->i:I

    .line 75
    .line 76
    sget-object v3, Lintl/o0oOOOOOooooo;->ooooOOOOO:Lintl/o0oOOOOOooooo;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 80
    move-result v3

    .line 81
    .line 82
    if-ne v1, v3, :cond_3

    .line 83
    .line 84
    sget-object v1, Lintl/o0oOOOOOooooo;->O0OOOoOooo:Lintl/o0oOOOOOooooo;

    .line 85
    .line 86
    if-ne v0, v1, :cond_3

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, La3d20260409/h$o;->u()V

    .line 90
    .line 91
    :cond_3
    :goto_0
    if-eqz v0, :cond_4

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v0}, La3d20260409/h$o;->p(Lintl/o0oOOOOOooooo;)V

    .line 95
    .line 96
    .line 97
    invoke-static {}, Lwe0/f;->J()Lwe0/f;

    .line 98
    move-result-object v1

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 102
    move-result-object v3

    .line 103
    .line 104
    iget-object v4, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 105
    .line 106
    .line 107
    invoke-static {v4}, La3d20260409/h;->l0(La3d20260409/h;)Lg/e;

    .line 108
    move-result-object v4

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, v3, v4}, Lf/h;->A(Ljava/lang/String;Lg/e;)V

    .line 112
    .line 113
    iget-object v1, p2, La3d20260409/b;->c:Lintl/o0oOOOOOooooo;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 117
    move-result v1

    .line 118
    .line 119
    iput v1, p0, La3d20260409/h$o;->i:I

    .line 120
    .line 121
    :cond_4
    iget-object v1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 122
    .line 123
    .line 124
    invoke-static {v1}, La3d20260409/h;->X(La3d20260409/h;)La3d20260409/o0o00;

    .line 125
    move-result-object v1

    .line 126
    .line 127
    if-eqz v1, :cond_5

    .line 128
    .line 129
    iget-object v1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 130
    .line 131
    .line 132
    invoke-static {v1}, La3d20260409/h;->X(La3d20260409/h;)La3d20260409/o0o00;

    .line 133
    move-result-object v1

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1, v0}, La3d20260409/o0o00;->a(Lintl/o0oOOOOOooooo;)V

    .line 137
    .line 138
    :cond_5
    sget-object v1, Lintl/o0oOOOOOooooo;->OOOOooooo:Lintl/o0oOOOOOooooo;

    .line 139
    const/4 v3, 0x1

    .line 140
    .line 141
    if-ne v0, v1, :cond_6

    .line 142
    .line 143
    iput-boolean v3, p0, La3d20260409/h$o;->f:Z

    .line 144
    .line 145
    :cond_6
    iget-boolean v4, p0, La3d20260409/h$o;->f:Z

    .line 146
    .line 147
    if-eqz v4, :cond_7

    .line 148
    .line 149
    sget-object v4, Lintl/o0oOOOOOooooo;->oOoOOOOOooooo:Lintl/o0oOOOOOooooo;

    .line 150
    .line 151
    if-ne v0, v4, :cond_7

    .line 152
    .line 153
    iget-object p1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 154
    .line 155
    new-instance v0, La3d20260409/h$o$j;

    .line 156
    .line 157
    .line 158
    invoke-direct {v0, p0, p2}, La3d20260409/h$o$j;-><init>(La3d20260409/h$o;La3d20260409/b;)V

    .line 159
    .line 160
    .line 161
    invoke-static {p1, v0}, La3d20260409/h;->z(La3d20260409/h;Lg/a;)V

    .line 162
    .line 163
    new-instance p1, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 167
    .line 168
    const-string v0, "ROLL_BACK_"

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    iget-object v0, p2, La3d20260409/b;->b:Laai/liveness/Detector$WarnCode;

    .line 174
    .line 175
    .line 176
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    move-result-object p1

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0, p1}, La3d20260409/h$o;->q(Ljava/lang/Object;)V

    .line 184
    .line 185
    iget-object p1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 186
    .line 187
    iget-object p1, p1, La3d20260409/h;->j:La3d20260409/f;

    .line 188
    .line 189
    iget-object p2, p2, La3d20260409/b;->b:Laai/liveness/Detector$WarnCode;

    .line 190
    .line 191
    .line 192
    invoke-virtual {p1, p2}, La3d20260409/f;->P(Laai/liveness/Detector$WarnCode;)V

    .line 193
    return-void

    .line 194
    .line 195
    :cond_7
    sget-object v4, Lintl/o0oOOOOOooooo;->oOoOOOOOooooo:Lintl/o0oOOOOOooooo;

    .line 196
    .line 197
    if-ne v0, v4, :cond_8

    .line 198
    .line 199
    iget-object v4, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 200
    .line 201
    .line 202
    invoke-static {v4}, La3d20260409/h;->p0(La3d20260409/h;)La3d20260409/c;

    .line 203
    move-result-object v4

    .line 204
    .line 205
    if-eqz v4, :cond_8

    .line 206
    .line 207
    iget p1, p0, La3d20260409/h$o;->s:I

    .line 208
    add-int/2addr p1, v3

    .line 209
    .line 210
    iput p1, p0, La3d20260409/h$o;->s:I

    .line 211
    .line 212
    iget-object p1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 213
    .line 214
    new-instance v0, La3d20260409/h$o$f;

    .line 215
    .line 216
    .line 217
    invoke-direct {v0, p0, p2}, La3d20260409/h$o$f;-><init>(La3d20260409/h$o;La3d20260409/b;)V

    .line 218
    .line 219
    .line 220
    invoke-static {p1, v0}, La3d20260409/h;->z(La3d20260409/h;Lg/a;)V

    .line 221
    .line 222
    iget-object p1, p2, La3d20260409/b;->b:Laai/liveness/Detector$WarnCode;

    .line 223
    .line 224
    .line 225
    invoke-virtual {p0, p1}, La3d20260409/h$o;->q(Ljava/lang/Object;)V

    .line 226
    return-void

    .line 227
    .line 228
    :cond_8
    if-ne v0, v1, :cond_9

    .line 229
    .line 230
    iget-object v1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 231
    .line 232
    .line 233
    invoke-static {v1}, La3d20260409/h;->h0(La3d20260409/h;)La3d20260409/c;

    .line 234
    move-result-object v1

    .line 235
    .line 236
    if-eqz v1, :cond_9

    .line 237
    .line 238
    iget p1, p0, La3d20260409/h$o;->t:I

    .line 239
    add-int/2addr p1, v3

    .line 240
    .line 241
    iput p1, p0, La3d20260409/h$o;->t:I

    .line 242
    .line 243
    iget-object p1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 244
    .line 245
    new-instance v0, La3d20260409/h$o$n;

    .line 246
    .line 247
    .line 248
    invoke-direct {v0, p0, p2}, La3d20260409/h$o$n;-><init>(La3d20260409/h$o;La3d20260409/b;)V

    .line 249
    .line 250
    .line 251
    invoke-static {p1, v0}, La3d20260409/h;->z(La3d20260409/h;Lg/a;)V

    .line 252
    .line 253
    iget-object p1, p2, La3d20260409/b;->b:Laai/liveness/Detector$WarnCode;

    .line 254
    .line 255
    .line 256
    invoke-virtual {p0, p1}, La3d20260409/h$o;->D(Ljava/lang/Object;)V

    .line 257
    return-void

    .line 258
    .line 259
    :cond_9
    iget-boolean v1, p2, La3d20260409/b;->m:Z

    .line 260
    .line 261
    if-eqz v1, :cond_d

    .line 262
    .line 263
    iget-object v1, p2, La3d20260409/b;->c:Lintl/o0oOOOOOooooo;

    .line 264
    .line 265
    sget-object v4, Lintl/o0oOOOOOooooo;->OOOOOoooo:Lintl/o0oOOOOOooooo;

    .line 266
    .line 267
    if-eq v1, v4, :cond_a

    .line 268
    .line 269
    if-eq v1, v2, :cond_a

    .line 270
    .line 271
    sget-object v4, Lintl/o0oOOOOOooooo;->ooooOOOOO:Lintl/o0oOOOOOooooo;

    .line 272
    .line 273
    if-ne v1, v4, :cond_d

    .line 274
    .line 275
    .line 276
    :cond_a
    invoke-static {}, La3d20260409/v;->i()Z

    .line 277
    move-result v1

    .line 278
    .line 279
    if-eqz v1, :cond_d

    .line 280
    .line 281
    iget-wide v4, p2, La3d20260409/b;->l:D

    .line 282
    .line 283
    const-wide/16 v6, 0x0

    .line 284
    .line 285
    cmpl-double v1, v4, v6

    .line 286
    .line 287
    if-lez v1, :cond_c

    .line 288
    .line 289
    iget-wide v6, p0, La3d20260409/h$o;->e:D

    .line 290
    .line 291
    cmpl-double v1, v4, v6

    .line 292
    .line 293
    if-lez v1, :cond_d

    .line 294
    .line 295
    iget-object v1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 296
    .line 297
    new-instance v4, La3d20260409/h$o$c;

    .line 298
    .line 299
    .line 300
    invoke-direct {v4, p0, p2}, La3d20260409/h$o$c;-><init>(La3d20260409/h$o;La3d20260409/b;)V

    .line 301
    .line 302
    .line 303
    invoke-static {v1, v4}, La3d20260409/h;->z(La3d20260409/h;Lg/a;)V

    .line 304
    .line 305
    iget-object v1, p2, La3d20260409/b;->c:Lintl/o0oOOOOOooooo;

    .line 306
    .line 307
    sget-object v4, Lintl/o0oOOOOOooooo;->ooooOOOOO:Lintl/o0oOOOOOooooo;

    .line 308
    .line 309
    if-ne v1, v4, :cond_b

    .line 310
    .line 311
    iget v1, p0, La3d20260409/h$o;->u:I

    .line 312
    add-int/2addr v1, v3

    .line 313
    .line 314
    iput v1, p0, La3d20260409/h$o;->u:I

    .line 315
    .line 316
    :cond_b
    iget-wide v5, p2, La3d20260409/b;->l:D

    .line 317
    .line 318
    iput-wide v5, p0, La3d20260409/h$o;->e:D

    .line 319
    .line 320
    iget-object v1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 321
    .line 322
    .line 323
    invoke-static {v1, p1}, La3d20260409/h;->R(La3d20260409/h;La3d20260409/c;)La3d20260409/c;

    .line 324
    .line 325
    iget-object v1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 326
    .line 327
    sget-object v5, La3d20260409/O0000o0o0;->o0o00:La3d20260409/O0000o0o0;

    .line 328
    .line 329
    iget-wide v6, p2, La3d20260409/b;->l:D

    .line 330
    .line 331
    .line 332
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 333
    move-result-object v6

    .line 334
    .line 335
    .line 336
    invoke-static {v1, v5, v6}, La3d20260409/h;->y(La3d20260409/h;La3d20260409/O0000o0o0;Ljava/lang/Object;)V

    .line 337
    .line 338
    iget-object v1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 339
    .line 340
    iget-object v1, v1, La3d20260409/h;->j:La3d20260409/f;

    .line 341
    .line 342
    const-string v5, "eye_closed_captured_stage"

    .line 343
    .line 344
    .line 345
    invoke-virtual {v1, v5, v0}, Lm/b;->k(Ljava/lang/String;Ljava/lang/Object;)V

    .line 346
    .line 347
    iget-object v0, p2, La3d20260409/b;->c:Lintl/o0oOOOOOooooo;

    .line 348
    .line 349
    if-eq v0, v4, :cond_d

    .line 350
    .line 351
    .line 352
    invoke-static {}, Lwe0/f;->J()Lwe0/f;

    .line 353
    move-result-object v0

    .line 354
    .line 355
    sget-object v1, Lintl/OoooOOOoooooo;->o0o00:Lintl/OoooOOOoooooo;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 359
    move-result-object v1

    .line 360
    .line 361
    iget-object v4, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 362
    .line 363
    .line 364
    invoke-static {v4}, La3d20260409/h;->l0(La3d20260409/h;)Lg/e;

    .line 365
    move-result-object v4

    .line 366
    .line 367
    .line 368
    invoke-virtual {v0, v1, v4}, Lf/h;->A(Ljava/lang/String;Lg/e;)V

    .line 369
    goto :goto_1

    .line 370
    .line 371
    :cond_c
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 372
    .line 373
    new-instance v1, La3d20260409/h$o$b;

    .line 374
    .line 375
    .line 376
    invoke-direct {v1, p0, p2}, La3d20260409/h$o$b;-><init>(La3d20260409/h$o;La3d20260409/b;)V

    .line 377
    .line 378
    .line 379
    invoke-static {v0, v1}, La3d20260409/h;->z(La3d20260409/h;Lg/a;)V

    .line 380
    .line 381
    :cond_d
    :goto_1
    iget-object v0, p2, La3d20260409/b;->c:Lintl/o0oOOOOOooooo;

    .line 382
    const/4 v1, 0x0

    .line 383
    .line 384
    if-ne v0, v2, :cond_11

    .line 385
    .line 386
    iget-object v0, p2, La3d20260409/b;->e:La3d20260409/e;

    .line 387
    .line 388
    if-nez v0, :cond_e

    .line 389
    .line 390
    goto/16 :goto_2

    .line 391
    .line 392
    :cond_e
    iget v0, v0, La3d20260409/e;->e:F

    .line 393
    .line 394
    cmpl-float v1, v0, v1

    .line 395
    .line 396
    if-lez v1, :cond_10

    .line 397
    .line 398
    iget-object v1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 399
    .line 400
    .line 401
    invoke-static {v1}, La3d20260409/h;->p0(La3d20260409/h;)La3d20260409/c;

    .line 402
    move-result-object v1

    .line 403
    .line 404
    if-nez v1, :cond_f

    .line 405
    .line 406
    iget-object v1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 407
    .line 408
    iget-object v1, v1, La3d20260409/h;->j:La3d20260409/f;

    .line 409
    .line 410
    iget-object v2, p2, La3d20260409/b;->c:Lintl/o0oOOOOOooooo;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v1, v2}, La3d20260409/f;->S(Lintl/o0oOOOOOooooo;)V

    .line 414
    :cond_f
    float-to-double v1, v0

    .line 415
    .line 416
    iget-wide v4, p0, La3d20260409/h$o;->c:D

    .line 417
    .line 418
    cmpl-double v4, v1, v4

    .line 419
    .line 420
    if-lez v4, :cond_16

    .line 421
    .line 422
    iget v4, p0, La3d20260409/h$o;->q:I

    .line 423
    add-int/2addr v4, v3

    .line 424
    .line 425
    iput v4, p0, La3d20260409/h$o;->q:I

    .line 426
    .line 427
    iget-object v3, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 428
    .line 429
    new-instance v4, La3d20260409/h$o$d;

    .line 430
    .line 431
    .line 432
    invoke-direct {v4, p0, v0, p2}, La3d20260409/h$o$d;-><init>(La3d20260409/h$o;FLa3d20260409/b;)V

    .line 433
    .line 434
    .line 435
    invoke-static {v3, v4}, La3d20260409/h;->z(La3d20260409/h;Lg/a;)V

    .line 436
    .line 437
    iput-wide v1, p0, La3d20260409/h$o;->c:D

    .line 438
    .line 439
    iget-object p2, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 440
    .line 441
    .line 442
    invoke-static {p2, p1}, La3d20260409/h;->r(La3d20260409/h;La3d20260409/c;)La3d20260409/c;

    .line 443
    .line 444
    iget-object p1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 445
    .line 446
    .line 447
    invoke-static {p1}, La3d20260409/h;->p0(La3d20260409/h;)La3d20260409/c;

    .line 448
    move-result-object p1

    .line 449
    .line 450
    iget-wide p1, p1, La3d20260409/c;->h:J

    .line 451
    .line 452
    .line 453
    invoke-static {p1, p2}, La3d20260409/j3d20260409;->o0o00(J)V

    .line 454
    .line 455
    iget-object p1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 456
    .line 457
    sget-object p2, La3d20260409/O0000o0o0;->oooooOO:La3d20260409/O0000o0o0;

    .line 458
    .line 459
    .line 460
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 461
    move-result-object v0

    .line 462
    .line 463
    .line 464
    invoke-static {p1, p2, v0}, La3d20260409/h;->y(La3d20260409/h;La3d20260409/O0000o0o0;Ljava/lang/Object;)V

    .line 465
    return-void

    .line 466
    .line 467
    :cond_10
    iget-object p1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 468
    .line 469
    new-instance v1, La3d20260409/h$o$h;

    .line 470
    .line 471
    .line 472
    invoke-direct {v1, p0, v0, p2}, La3d20260409/h$o$h;-><init>(La3d20260409/h$o;FLa3d20260409/b;)V

    .line 473
    .line 474
    .line 475
    invoke-static {p1, v1}, La3d20260409/h;->z(La3d20260409/h;Lg/a;)V

    .line 476
    return-void

    .line 477
    .line 478
    :cond_11
    sget-object v2, Lintl/o0oOOOOOooooo;->OOOOOoooo:Lintl/o0oOOOOOooooo;

    .line 479
    .line 480
    if-ne v0, v2, :cond_15

    .line 481
    .line 482
    iget-object v0, p2, La3d20260409/b;->e:La3d20260409/e;

    .line 483
    .line 484
    if-nez v0, :cond_12

    .line 485
    goto :goto_2

    .line 486
    .line 487
    :cond_12
    iget v0, v0, La3d20260409/e;->e:F

    .line 488
    float-to-double v4, v0

    .line 489
    .line 490
    iget-wide v6, p0, La3d20260409/h$o;->d:D

    .line 491
    .line 492
    cmpl-double v2, v4, v6

    .line 493
    .line 494
    if-lez v2, :cond_16

    .line 495
    .line 496
    cmpl-float v1, v0, v1

    .line 497
    .line 498
    if-lez v1, :cond_14

    .line 499
    .line 500
    iget v1, p0, La3d20260409/h$o;->r:I

    .line 501
    add-int/2addr v1, v3

    .line 502
    .line 503
    iput v1, p0, La3d20260409/h$o;->r:I

    .line 504
    .line 505
    iget-object v1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 506
    .line 507
    new-instance v2, La3d20260409/h$o$g;

    .line 508
    .line 509
    .line 510
    invoke-direct {v2, p0, p2}, La3d20260409/h$o$g;-><init>(La3d20260409/h$o;La3d20260409/b;)V

    .line 511
    .line 512
    .line 513
    invoke-static {v1, v2}, La3d20260409/h;->z(La3d20260409/h;Lg/a;)V

    .line 514
    .line 515
    iget-object v1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 516
    .line 517
    .line 518
    invoke-static {v1}, La3d20260409/h;->h0(La3d20260409/h;)La3d20260409/c;

    .line 519
    move-result-object v1

    .line 520
    .line 521
    if-nez v1, :cond_13

    .line 522
    .line 523
    iget-object v1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 524
    .line 525
    iget-object v1, v1, La3d20260409/h;->j:La3d20260409/f;

    .line 526
    .line 527
    iget-object p2, p2, La3d20260409/b;->c:Lintl/o0oOOOOOooooo;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v1, p2}, La3d20260409/f;->S(Lintl/o0oOOOOOooooo;)V

    .line 531
    .line 532
    :cond_13
    iput-wide v4, p0, La3d20260409/h$o;->d:D

    .line 533
    .line 534
    iget-object p2, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 535
    .line 536
    .line 537
    invoke-static {p2, p1}, La3d20260409/h;->d(La3d20260409/h;La3d20260409/c;)La3d20260409/c;

    .line 538
    .line 539
    iget-object p1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 540
    .line 541
    .line 542
    invoke-static {p1}, La3d20260409/h;->h0(La3d20260409/h;)La3d20260409/c;

    .line 543
    move-result-object p1

    .line 544
    .line 545
    iget-wide p1, p1, La3d20260409/c;->h:J

    .line 546
    .line 547
    .line 548
    invoke-static {p1, p2}, La3d20260409/j3d20260409;->o0o0O(J)V

    .line 549
    .line 550
    iget-object p1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 551
    .line 552
    sget-object p2, La3d20260409/O0000o0o0;->o0oOOOOOooooo:La3d20260409/O0000o0o0;

    .line 553
    .line 554
    .line 555
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 556
    move-result-object v0

    .line 557
    .line 558
    .line 559
    invoke-static {p1, p2, v0}, La3d20260409/h;->y(La3d20260409/h;La3d20260409/O0000o0o0;Ljava/lang/Object;)V

    .line 560
    return-void

    .line 561
    .line 562
    :cond_14
    iget-object p1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 563
    .line 564
    new-instance v1, La3d20260409/h$o$m;

    .line 565
    .line 566
    .line 567
    invoke-direct {v1, p0, v0, p2}, La3d20260409/h$o$m;-><init>(La3d20260409/h$o;FLa3d20260409/b;)V

    .line 568
    .line 569
    .line 570
    invoke-static {p1, v1}, La3d20260409/h;->z(La3d20260409/h;Lg/a;)V

    .line 571
    return-void

    .line 572
    .line 573
    :cond_15
    iget-object p1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 574
    .line 575
    .line 576
    invoke-static {p1}, La3d20260409/h;->X(La3d20260409/h;)La3d20260409/o0o00;

    .line 577
    move-result-object p1

    .line 578
    .line 579
    if-eqz p1, :cond_16

    .line 580
    .line 581
    iget-object p1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 582
    .line 583
    .line 584
    invoke-static {p1}, La3d20260409/h;->b(La3d20260409/h;)J

    .line 585
    move-result-wide p1

    .line 586
    .line 587
    .line 588
    invoke-static {p1, p2}, La3d20260409/j3d20260409;->OoooolLi(J)Ljava/lang/String;

    .line 589
    move-result-object p1

    .line 590
    .line 591
    iget-object p2, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 592
    .line 593
    .line 594
    invoke-static {p2}, La3d20260409/h;->X(La3d20260409/h;)La3d20260409/o0o00;

    .line 595
    move-result-object p2

    .line 596
    .line 597
    .line 598
    invoke-virtual {p2, p1}, La3d20260409/o0o00;->o(Ljava/lang/String;)V

    .line 599
    :cond_16
    :goto_2
    return-void
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
.end method

.method public final o(Laai/liveness/Detector$DetectionFailedType;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, La3d20260409/h;->B(La3d20260409/h;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, La3d20260409/u;->a(Laai/liveness/Detector$DetectionFailedType;)V

    .line 13
    .line 14
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 15
    .line 16
    iget-object v0, v0, La3d20260409/h;->j:La3d20260409/f;

    .line 17
    .line 18
    iget-boolean v1, p0, La3d20260409/h$o;->g:Z

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1, v1}, La3d20260409/f;->N(Laai/liveness/Detector$DetectionFailedType;Z)V

    .line 22
    .line 23
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, La3d20260409/h;->m(La3d20260409/h;)Lc/a;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, La3d20260409/h;->m(La3d20260409/h;)Lc/a;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    invoke-interface {v0, p1}, Lc/a;->g(Laai/liveness/Detector$DetectionFailedType;)V

    .line 39
    .line 40
    :cond_0
    iget-object p1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 41
    const/4 v0, 0x0

    .line 42
    .line 43
    .line 44
    invoke-static {p1, v0}, La3d20260409/h;->N(La3d20260409/h;Z)Z

    .line 45
    return-void
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
.end method

.method public final p(Lintl/o0oOOOOOooooo;)V
    .locals 1

    .line 1
    .line 2
    sget-object v0, La3d20260409/h$g;->a:[I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    move-result p1

    .line 7
    .line 8
    aget p1, v0, p1

    .line 9
    const/4 v0, 0x1

    .line 10
    .line 11
    if-eq p1, v0, :cond_4

    .line 12
    const/4 v0, 0x2

    .line 13
    .line 14
    if-eq p1, v0, :cond_3

    .line 15
    const/4 v0, 0x3

    .line 16
    .line 17
    if-eq p1, v0, :cond_2

    .line 18
    const/4 v0, 0x4

    .line 19
    .line 20
    if-eq p1, v0, :cond_1

    .line 21
    const/4 v0, 0x5

    .line 22
    .line 23
    if-eq p1, v0, :cond_0

    .line 24
    return-void

    .line 25
    .line 26
    :cond_0
    iget-object p1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 27
    .line 28
    sget-object v0, Lintl/OoOOoOoO;->ooO00O0O0Oo:Lintl/OoOOoOoO;

    .line 29
    .line 30
    .line 31
    :goto_0
    invoke-virtual {p1, v0}, La3d20260409/h;->G(Lintl/OoOOoOoO;)V

    .line 32
    return-void

    .line 33
    .line 34
    :cond_1
    iget-object p1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 35
    .line 36
    sget-object v0, Lintl/OoOOoOoO;->OoOOO0o:Lintl/OoOOoOoO;

    .line 37
    goto :goto_0

    .line 38
    .line 39
    :cond_2
    iget-object p1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 40
    .line 41
    sget-object v0, Lintl/OoOOoOoO;->o0o00:Lintl/OoOOoOoO;

    .line 42
    goto :goto_0

    .line 43
    .line 44
    :cond_3
    iget-object p1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 45
    .line 46
    sget-object v0, Lintl/OoOOoOoO;->o0oOOOOOooooo:Lintl/OoOOoOoO;

    .line 47
    goto :goto_0

    .line 48
    .line 49
    :cond_4
    iget-object p1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 50
    .line 51
    sget-object v0, Lintl/OoOOoOoO;->oooooOO:Lintl/OoOOoOoO;

    .line 52
    goto :goto_0
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

.method public final q(Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, La3d20260409/h$o;->e(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, La3d20260409/h$o;->D(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, La3d20260409/h$o;->y(Ljava/lang/Object;)V

    .line 10
    return-void
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
.end method

.method public final r(La3d20260409/c;La3d20260409/j;)Z
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, La3d20260409/h$o;->h:Z

    .line 3
    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 7
    .line 8
    .line 9
    invoke-static {v0, p1}, La3d20260409/h;->r(La3d20260409/h;La3d20260409/c;)La3d20260409/c;

    .line 10
    .line 11
    iget-object p1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, La3d20260409/h;->v0(La3d20260409/h;)Laai/liveness/Detector$DetectionType;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 20
    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    iget-object v1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 27
    .line 28
    .line 29
    invoke-static {v1}, La3d20260409/h;->v0(La3d20260409/h;)Laai/liveness/Detector$DetectionType;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string v1, "_finished"

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    .line 55
    invoke-static {p1, v0}, La3d20260409/h;->i(La3d20260409/h;Ljava/lang/String;)V

    .line 56
    .line 57
    :cond_0
    iget-object p1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 58
    .line 59
    sget-object v0, Laai/liveness/Detector$DetectionType;->DONE:Laai/liveness/Detector$DetectionType;

    .line 60
    .line 61
    .line 62
    invoke-static {p1, v0}, La3d20260409/h;->s(La3d20260409/h;Laai/liveness/Detector$DetectionType;)Laai/liveness/Detector$DetectionType;

    .line 63
    .line 64
    iget-object p1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 65
    .line 66
    .line 67
    invoke-static {p1}, La3d20260409/h;->m(La3d20260409/h;)Lc/a;

    .line 68
    move-result-object p1

    .line 69
    .line 70
    if-eqz p1, :cond_1

    .line 71
    .line 72
    iget-object p1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 73
    .line 74
    .line 75
    invoke-static {p1}, La3d20260409/h;->m(La3d20260409/h;)Lc/a;

    .line 76
    move-result-object v0

    .line 77
    .line 78
    .line 79
    invoke-interface {v0, p2}, Lc/a;->f(La3d20260409/j;)Laai/liveness/Detector$DetectionType;

    .line 80
    move-result-object p2

    .line 81
    .line 82
    .line 83
    invoke-static {p1, p2}, La3d20260409/h;->s(La3d20260409/h;Laai/liveness/Detector$DetectionType;)Laai/liveness/Detector$DetectionType;

    .line 84
    .line 85
    .line 86
    :cond_1
    invoke-virtual {p0}, La3d20260409/h$o;->w()V

    .line 87
    const/4 p1, 0x1

    .line 88
    return p1

    .line 89
    :cond_2
    const/4 p1, 0x0

    .line 90
    return p1
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
.end method

.method public run()V
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    iput-wide v0, p0, La3d20260409/h$o;->b:J

    .line 7
    .line 8
    new-instance v0, La3d20260409/a;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0}, La3d20260409/a;-><init>()V

    .line 12
    .line 13
    new-instance v1, Lorg/json/JSONArray;

    .line 14
    .line 15
    .line 16
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 17
    .line 18
    iput-object v1, p0, La3d20260409/h$o;->k:Lorg/json/JSONArray;

    .line 19
    .line 20
    new-instance v1, Lk/e;

    .line 21
    .line 22
    .line 23
    invoke-direct {v1}, Lk/e;-><init>()V

    .line 24
    .line 25
    iput-object v1, p0, La3d20260409/h$o;->m:Lk/e;

    .line 26
    .line 27
    new-instance v1, Lk/e;

    .line 28
    .line 29
    .line 30
    invoke-direct {v1}, Lk/e;-><init>()V

    .line 31
    .line 32
    iput-object v1, p0, La3d20260409/h$o;->n:Lk/e;

    .line 33
    .line 34
    :cond_0
    :goto_0
    iget-object v1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 35
    .line 36
    .line 37
    invoke-static {v1}, La3d20260409/h;->Z(La3d20260409/h;)Z

    .line 38
    move-result v1

    .line 39
    .line 40
    if-eqz v1, :cond_8

    .line 41
    .line 42
    :try_start_0
    iget-object v1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 43
    .line 44
    .line 45
    invoke-static {v1}, La3d20260409/h;->v0(La3d20260409/h;)Laai/liveness/Detector$DetectionType;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    sget-object v2, Laai/liveness/Detector$DetectionType;->DONE:Laai/liveness/Detector$DetectionType;

    .line 49
    .line 50
    if-ne v1, v2, :cond_1

    .line 51
    .line 52
    goto/16 :goto_5

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 56
    move-result-wide v1

    .line 57
    .line 58
    iget-object v3, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 59
    .line 60
    .line 61
    invoke-static {v3}, La3d20260409/h;->T(La3d20260409/h;)Ljava/util/concurrent/LinkedBlockingQueue;

    .line 62
    move-result-object v3

    .line 63
    .line 64
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 65
    .line 66
    const-wide/16 v5, 0x1e

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3, v5, v6, v4}, Ljava/util/concurrent/LinkedBlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 70
    move-result-object v3

    .line 71
    .line 72
    check-cast v3, La3d20260409/c;

    .line 73
    .line 74
    if-nez v3, :cond_2

    .line 75
    .line 76
    iget-object v1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 77
    .line 78
    .line 79
    invoke-static {v1}, La3d20260409/h;->P(La3d20260409/h;)Ljava/util/concurrent/atomic/AtomicInteger;

    .line 80
    move-result-object v1

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 84
    goto :goto_0

    .line 85
    :catchall_0
    move-exception v1

    .line 86
    .line 87
    goto/16 :goto_4

    .line 88
    .line 89
    :cond_2
    iget-boolean v4, p0, La3d20260409/h$o;->j:Z

    .line 90
    .line 91
    if-nez v4, :cond_3

    .line 92
    const/4 v4, 0x1

    .line 93
    .line 94
    iput-boolean v4, p0, La3d20260409/h$o;->j:Z

    .line 95
    .line 96
    iget-object v4, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 97
    .line 98
    sget-object v5, La3d20260409/O0000o0o0;->o0O0O:La3d20260409/O0000o0o0;

    .line 99
    .line 100
    .line 101
    invoke-static {v4, v5}, La3d20260409/h;->x(La3d20260409/h;La3d20260409/O0000o0o0;)V

    .line 102
    .line 103
    iget-object v4, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 104
    .line 105
    iget-object v4, v4, La3d20260409/h;->j:La3d20260409/f;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v4}, La3d20260409/f;->r0()V

    .line 109
    .line 110
    iget-object v4, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 111
    .line 112
    sget-object v5, La3d20260409/O0000o0o0;->oo00oOO:La3d20260409/O0000o0o0;

    .line 113
    .line 114
    .line 115
    invoke-static {v4, v5}, La3d20260409/h;->x(La3d20260409/h;La3d20260409/O0000o0o0;)V

    .line 116
    .line 117
    :cond_3
    iget-boolean v4, p0, La3d20260409/h$o;->g:Z

    .line 118
    .line 119
    if-eqz v4, :cond_4

    .line 120
    .line 121
    iget-object v4, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 122
    .line 123
    .line 124
    invoke-static {v4}, La3d20260409/h;->m(La3d20260409/h;)Lc/a;

    .line 125
    move-result-object v4

    .line 126
    .line 127
    if-eqz v4, :cond_4

    .line 128
    .line 129
    iget-object v4, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 130
    .line 131
    .line 132
    invoke-static {v4}, La3d20260409/h;->m(La3d20260409/h;)Lc/a;

    .line 133
    move-result-object v4

    .line 134
    .line 135
    iget-wide v5, p0, La3d20260409/h$o;->b:J

    .line 136
    .line 137
    .line 138
    invoke-static {}, La3d20260409/h;->q()J

    .line 139
    move-result-wide v7

    .line 140
    add-long/2addr v5, v7

    .line 141
    .line 142
    .line 143
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 144
    move-result-wide v7

    .line 145
    sub-long/2addr v5, v7

    .line 146
    .line 147
    .line 148
    invoke-interface {v4, v5, v6}, Lc/a;->l(J)V

    .line 149
    .line 150
    .line 151
    :cond_4
    invoke-virtual {p0, v3}, La3d20260409/h$o;->j(La3d20260409/c;)La3d20260409/b;

    .line 152
    move-result-object v4

    .line 153
    .line 154
    iget-boolean v5, p0, La3d20260409/h$o;->g:Z

    .line 155
    .line 156
    if-eqz v5, :cond_5

    .line 157
    .line 158
    iget-object v5, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 159
    .line 160
    .line 161
    invoke-static {v5}, La3d20260409/h;->V(La3d20260409/h;)Lk/e;

    .line 162
    move-result-object v5

    .line 163
    .line 164
    :goto_1
    iget v6, v4, La3d20260409/b;->j:I

    .line 165
    goto :goto_2

    .line 166
    .line 167
    :cond_5
    iget-object v5, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 168
    .line 169
    .line 170
    invoke-static {v5}, La3d20260409/h;->a0(La3d20260409/h;)Lk/e;

    .line 171
    move-result-object v5

    .line 172
    goto :goto_1

    .line 173
    .line 174
    .line 175
    :goto_2
    invoke-virtual {v5, v6}, Lk/e;->e(I)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0, v4}, La3d20260409/h$o;->m(La3d20260409/b;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, v3, v4}, La3d20260409/a;->a(La3d20260409/c;La3d20260409/b;)V

    .line 182
    .line 183
    iget-object v5, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 184
    .line 185
    .line 186
    invoke-static {v5}, La3d20260409/h;->o0(La3d20260409/h;)Ljava/util/concurrent/atomic/AtomicInteger;

    .line 187
    move-result-object v5

    .line 188
    .line 189
    .line 190
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 191
    move-result v5

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0, v3, v4}, La3d20260409/h$o;->x(La3d20260409/c;La3d20260409/b;)V

    .line 195
    .line 196
    iget-object v6, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 197
    .line 198
    iget-object v6, v6, La3d20260409/h;->j:La3d20260409/f;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v6, v5}, La3d20260409/f;->e0(I)V

    .line 202
    .line 203
    iget-object v6, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 204
    .line 205
    iget-object v6, v6, La3d20260409/h;->j:La3d20260409/f;

    .line 206
    .line 207
    iget v7, v4, La3d20260409/b;->j:I

    .line 208
    .line 209
    .line 210
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 211
    move-result-wide v8

    .line 212
    sub-long/2addr v8, v1

    .line 213
    long-to-int v1, v8

    .line 214
    .line 215
    .line 216
    invoke-virtual {v6, v7, v5, v1}, La3d20260409/f;->z(III)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p0, v3, v4}, La3d20260409/h$o;->d(La3d20260409/c;La3d20260409/b;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p0, v3, v4}, La3d20260409/h$o;->n(La3d20260409/c;La3d20260409/b;)V

    .line 223
    .line 224
    iget-object v1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 225
    .line 226
    .line 227
    invoke-static {v1}, La3d20260409/h;->l(La3d20260409/h;)Lwe0/g;

    .line 228
    move-result-object v1

    .line 229
    .line 230
    iget-object v2, v4, La3d20260409/b;->c:Lintl/o0oOOOOOooooo;

    .line 231
    .line 232
    iget v3, v4, La3d20260409/b;->j:I

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1, v2, v3}, Lwe0/g;->d(Lintl/o0oOOOOOooooo;I)V

    .line 236
    .line 237
    iget-object v1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 238
    .line 239
    .line 240
    invoke-static {v1}, La3d20260409/h;->r0(La3d20260409/h;)Lk/e;

    .line 241
    move-result-object v1

    .line 242
    .line 243
    .line 244
    invoke-virtual {v1}, Lk/e;->d()V

    .line 245
    .line 246
    iget-boolean v1, p0, La3d20260409/h$o;->g:Z

    .line 247
    .line 248
    if-nez v1, :cond_6

    .line 249
    .line 250
    iget-object v1, v4, La3d20260409/b;->c:Lintl/o0oOOOOOooooo;

    .line 251
    .line 252
    sget-object v2, Lintl/o0oOOOOOooooo;->O0OOOoOooo:Lintl/o0oOOOOOooooo;

    .line 253
    .line 254
    if-ne v1, v2, :cond_6

    .line 255
    .line 256
    .line 257
    invoke-virtual {p0}, La3d20260409/h$o;->F()V

    .line 258
    .line 259
    :cond_6
    iget-object v1, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 260
    .line 261
    .line 262
    invoke-static {v1}, La3d20260409/h;->Z(La3d20260409/h;)Z

    .line 263
    move-result v1

    .line 264
    .line 265
    if-eqz v1, :cond_0

    .line 266
    .line 267
    .line 268
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 269
    move-result-wide v1

    .line 270
    .line 271
    iget-wide v3, p0, La3d20260409/h$o;->b:J

    .line 272
    sub-long/2addr v1, v3

    .line 273
    .line 274
    iget-boolean v3, p0, La3d20260409/h$o;->g:Z

    .line 275
    .line 276
    if-eqz v3, :cond_7

    .line 277
    .line 278
    .line 279
    invoke-static {}, La3d20260409/h;->q()J

    .line 280
    move-result-wide v3

    .line 281
    goto :goto_3

    .line 282
    .line 283
    :cond_7
    sget-wide v3, La3d20260409/s;->i:J

    .line 284
    .line 285
    :goto_3
    cmp-long v1, v1, v3

    .line 286
    .line 287
    if-ltz v1, :cond_0

    .line 288
    .line 289
    sget-object v1, Laai/liveness/Detector$DetectionFailedType;->TIMEOUT:Laai/liveness/Detector$DetectionFailedType;

    .line 290
    .line 291
    .line 292
    invoke-virtual {p0, v1}, La3d20260409/h$o;->o(Laai/liveness/Detector$DetectionFailedType;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 293
    goto :goto_5

    .line 294
    .line 295
    :goto_4
    iget-object v2, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v2, v1}, La3d20260409/h;->K(Ljava/lang/Throwable;)V

    .line 299
    .line 300
    goto/16 :goto_0

    .line 301
    .line 302
    .line 303
    :cond_8
    :goto_5
    invoke-virtual {p0}, La3d20260409/h$o;->H()V

    .line 304
    .line 305
    .line 306
    invoke-virtual {p0}, La3d20260409/h$o;->z()V

    .line 307
    return-void
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
.end method

.method public final s()[B
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, La3d20260409/h;->X(La3d20260409/h;)La3d20260409/o0o00;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/TextureView;->getBitmap()Landroid/graphics/Bitmap;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-static {}, La3d20260409/j3d20260409;->OOoooOO0000o0()I

    .line 16
    move-result v1

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Lk/a;->k(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 23
    .line 24
    .line 25
    invoke-static {}, La3d20260409/j3d20260409;->OOo0ooOO0000o0()I

    .line 26
    move-result v2

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1, v2}, Lk/a;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;I)[B

    .line 30
    move-result-object v0

    .line 31
    return-object v0

    .line 32
    :cond_0
    const/4 v0, 0x0

    .line 33
    return-object v0
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
.end method

.method public final u()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 3
    .line 4
    new-instance v1, La3d20260409/h$o$k;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0}, La3d20260409/h$o$k;-><init>(La3d20260409/h$o;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, La3d20260409/h;->h(La3d20260409/h;Lg/a;)V

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public final w()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 3
    .line 4
    iget-object v0, v0, La3d20260409/h;->j:La3d20260409/f;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, La3d20260409/f;->u()V

    .line 8
    .line 9
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 10
    .line 11
    iget-object v1, v0, La3d20260409/h;->j:La3d20260409/f;

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, La3d20260409/h;->v0(La3d20260409/h;)Laai/liveness/Detector$DetectionType;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v0}, La3d20260409/f;->O(Laai/liveness/Detector$DetectionType;)V

    .line 19
    .line 20
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, La3d20260409/h;->v0(La3d20260409/h;)Laai/liveness/Detector$DetectionType;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    sget-object v1, Laai/liveness/Detector$DetectionType;->DONE:Laai/liveness/Detector$DetectionType;

    .line 27
    .line 28
    if-ne v0, v1, :cond_0

    .line 29
    .line 30
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 31
    .line 32
    iget-object v0, v0, La3d20260409/h;->j:La3d20260409/f;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, La3d20260409/f;->i0()V

    .line 36
    .line 37
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 38
    const/4 v1, 0x0

    .line 39
    .line 40
    .line 41
    invoke-static {v0, v1}, La3d20260409/h;->N(La3d20260409/h;Z)Z

    .line 42
    return-void

    .line 43
    .line 44
    .line 45
    :cond_0
    invoke-virtual {p0}, La3d20260409/h$o;->C()V

    .line 46
    return-void
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
.end method

.method public final x(La3d20260409/c;La3d20260409/b;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 3
    .line 4
    iget-object v0, v0, La3d20260409/h;->j:La3d20260409/f;

    .line 5
    .line 6
    iget-boolean v1, p0, La3d20260409/h$o;->g:Z

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1, p2, v1}, La3d20260409/f;->M(La3d20260409/c;La3d20260409/b;Z)V

    .line 10
    return-void
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

.method public final y(Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
.end method

.method public final z()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/h$o;->w:La3d20260409/h;

    .line 3
    .line 4
    new-instance v1, La3d20260409/h$o$l;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0}, La3d20260409/h$o$l;-><init>(La3d20260409/h$o;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, La3d20260409/h;->z(La3d20260409/h;Lg/a;)V

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method
