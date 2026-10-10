.class public final Lcom/kubi/futures/dialog/c0;
.super Ljava/lang/Object;
.source "FuturesAdDialog.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000c\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/kubi/futures/dialog/FuturesAdFrequencyManager;",
        "",
        "<init>",
        "()V",
        "ONE_DAY_IN_MILLIS",
        "",
        "THREE_DAYS_IN_MILLIS",
        "SEVEN_DAYS_IN_MILLIS",
        "shouldShowPopup",
        "",
        "id",
        "",
        "onReset",
        "",
        "onClose",
        "KumexLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFuturesAdDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesAdDialog.kt\ncom/kubi/futures/dialog/FuturesAdFrequencyManager\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 KVStore.kt\ncom/kubi/utils/storage/KVStore\n*L\n1#1,188:1\n153#2,2:189\n153#2,2:192\n144#2,2:195\n144#2,2:197\n144#2,2:199\n153#2,2:201\n144#2,2:204\n178#3:191\n178#3:194\n178#3:203\n*S KotlinDebug\n*F\n+ 1 FuturesAdDialog.kt\ncom/kubi/futures/dialog/FuturesAdFrequencyManager\n*L\n132#1:189,2\n162#1:192,2\n166#1:195,2\n167#1:197,2\n168#1:199,2\n177#1:201,2\n180#1:204,2\n132#1:191\n162#1:194\n177#1:203\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/futures/dialog/c0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:J

.field public static final c:J

.field public static final d:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/futures/dialog/c0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/futures/dialog/c0;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/futures/dialog/c0;->a:Lcom/kubi/futures/dialog/c0;

    .line 8
    .line 9
    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 10
    .line 11
    const-wide/16 v1, 0x1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 15
    move-result-wide v1

    .line 16
    .line 17
    sput-wide v1, Lcom/kubi/futures/dialog/c0;->b:J

    .line 18
    .line 19
    const-wide/16 v1, 0x3

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 23
    move-result-wide v1

    .line 24
    .line 25
    sput-wide v1, Lcom/kubi/futures/dialog/c0;->c:J

    .line 26
    .line 27
    const-wide/16 v1, 0x7

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 31
    move-result-wide v0

    .line 32
    .line 33
    sput-wide v0, Lcom/kubi/futures/dialog/c0;->d:J

    .line 34
    return-void
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
    .line 235
.end method

.method public constructor <init>()V
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
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "id"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lzl/j;->a:Lzl/j;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lzl/j;->d0(Ljava/lang/String;)Ly70/g;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    sget-object v0, Ly70/a;->a:Ly70/a;

    .line 14
    .line 15
    const-class v1, Lcom/kubi/futures/dialog/PopData;

    .line 16
    const/4 v2, 0x0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1, v1, v2}, Ly70/a;->j(Ly70/g;Ljava/lang/Class;Landroid/os/Parcelable;)Landroid/os/Parcelable;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    check-cast v0, Lcom/kubi/futures/dialog/PopData;

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    new-instance v1, Lcom/kubi/futures/dialog/PopData;

    .line 27
    const/4 v5, 0x3

    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v2, 0x0

    .line 30
    .line 31
    const-wide/16 v3, 0x0

    .line 32
    .line 33
    .line 34
    invoke-direct/range {v1 .. v6}, Lcom/kubi/futures/dialog/PopData;-><init>(IJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 35
    move-object v0, v1

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-virtual {v0}, Lcom/kubi/futures/dialog/PopData;->getCloseCount()I

    .line 39
    move-result v1

    .line 40
    .line 41
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    .line 44
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 45
    move-result-wide v2

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1, v2, v3}, Lcom/kubi/futures/dialog/PopData;->copy(IJ)Lcom/kubi/futures/dialog/PopData;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    .line 52
    invoke-static {p1, v0}, Ly70/a;->n(Ly70/g;Landroid/os/Parcelable;)Ly70/a;

    .line 53
    return-void
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
.end method

.method public final b(Ljava/lang/String;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "id"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lzl/j;->a:Lzl/j;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lzl/j;->d0(Ljava/lang/String;)Ly70/g;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    sget-object v0, Ly70/a;->a:Ly70/a;

    .line 14
    .line 15
    const-class v1, Lcom/kubi/futures/dialog/PopData;

    .line 16
    const/4 v2, 0x0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1, v1, v2}, Ly70/a;->j(Ly70/g;Ljava/lang/Class;Landroid/os/Parcelable;)Landroid/os/Parcelable;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    check-cast v0, Lcom/kubi/futures/dialog/PopData;

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    new-instance v1, Lcom/kubi/futures/dialog/PopData;

    .line 27
    const/4 v5, 0x3

    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v2, 0x0

    .line 30
    .line 31
    const-wide/16 v3, 0x0

    .line 32
    .line 33
    .line 34
    invoke-direct/range {v1 .. v6}, Lcom/kubi/futures/dialog/PopData;-><init>(IJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 35
    move-object v0, v1

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 39
    move-result-wide v1

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/kubi/futures/dialog/PopData;->getCloseCount()I

    .line 43
    move-result v3

    .line 44
    .line 45
    if-eqz v3, :cond_2

    .line 46
    const/4 v4, 0x1

    .line 47
    .line 48
    if-eq v3, v4, :cond_2

    .line 49
    const/4 v4, 0x2

    .line 50
    .line 51
    if-eq v3, v4, :cond_2

    .line 52
    const/4 v4, 0x3

    .line 53
    .line 54
    if-eq v3, v4, :cond_1

    .line 55
    const/4 v5, 0x4

    .line 56
    .line 57
    if-eq v3, v5, :cond_1

    .line 58
    const/4 v3, 0x5

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v3, v1, v2}, Lcom/kubi/futures/dialog/PopData;->copy(IJ)Lcom/kubi/futures/dialog/PopData;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    .line 65
    invoke-static {p1, v0}, Ly70/a;->n(Ly70/g;Landroid/os/Parcelable;)Ly70/a;

    .line 66
    return-void

    .line 67
    .line 68
    .line 69
    :cond_1
    invoke-virtual {v0, v4, v1, v2}, Lcom/kubi/futures/dialog/PopData;->copy(IJ)Lcom/kubi/futures/dialog/PopData;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    .line 73
    invoke-static {p1, v0}, Ly70/a;->n(Ly70/g;Landroid/os/Parcelable;)Ly70/a;

    .line 74
    return-void

    .line 75
    :cond_2
    const/4 v3, 0x0

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v3, v1, v2}, Lcom/kubi/futures/dialog/PopData;->copy(IJ)Lcom/kubi/futures/dialog/PopData;

    .line 79
    move-result-object v0

    .line 80
    .line 81
    .line 82
    invoke-static {p1, v0}, Ly70/a;->n(Ly70/g;Landroid/os/Parcelable;)Ly70/a;

    .line 83
    return-void
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
.end method

.method public final c(Ljava/lang/String;)Z
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "id"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lzl/j;->a:Lzl/j;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lzl/j;->d0(Ljava/lang/String;)Ly70/g;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    sget-object v0, Ly70/a;->a:Ly70/a;

    .line 14
    .line 15
    const-class v1, Lcom/kubi/futures/dialog/PopData;

    .line 16
    const/4 v2, 0x0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1, v1, v2}, Ly70/a;->j(Ly70/g;Ljava/lang/Class;Landroid/os/Parcelable;)Landroid/os/Parcelable;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    check-cast p1, Lcom/kubi/futures/dialog/PopData;

    .line 23
    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    new-instance v0, Lcom/kubi/futures/dialog/PopData;

    .line 27
    const/4 v4, 0x3

    .line 28
    const/4 v5, 0x0

    .line 29
    const/4 v1, 0x0

    .line 30
    .line 31
    const-wide/16 v2, 0x0

    .line 32
    .line 33
    .line 34
    invoke-direct/range {v0 .. v5}, Lcom/kubi/futures/dialog/PopData;-><init>(IJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 35
    move-object p1, v0

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-virtual {p1}, Lcom/kubi/futures/dialog/PopData;->getCloseCount()I

    .line 39
    move-result v0

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/kubi/futures/dialog/PopData;->getLastCloseTime()J

    .line 43
    move-result-wide v1

    .line 44
    .line 45
    .line 46
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 47
    move-result-wide v3

    .line 48
    .line 49
    const-wide/16 v5, 0x0

    .line 50
    .line 51
    cmp-long p1, v1, v5

    .line 52
    const/4 v5, 0x1

    .line 53
    .line 54
    if-gtz p1, :cond_1

    .line 55
    return v5

    .line 56
    :cond_1
    sub-long/2addr v3, v1

    .line 57
    .line 58
    if-eq v0, v5, :cond_3

    .line 59
    const/4 p1, 0x2

    .line 60
    .line 61
    if-eq v0, p1, :cond_3

    .line 62
    const/4 p1, 0x3

    .line 63
    .line 64
    if-eq v0, p1, :cond_2

    .line 65
    const/4 p1, 0x4

    .line 66
    .line 67
    if-eq v0, p1, :cond_2

    .line 68
    .line 69
    sget-wide v0, Lcom/kubi/futures/dialog/c0;->d:J

    .line 70
    goto :goto_0

    .line 71
    .line 72
    :cond_2
    sget-wide v0, Lcom/kubi/futures/dialog/c0;->c:J

    .line 73
    goto :goto_0

    .line 74
    .line 75
    :cond_3
    sget-wide v0, Lcom/kubi/futures/dialog/c0;->b:J

    .line 76
    .line 77
    :goto_0
    cmp-long p1, v3, v0

    .line 78
    .line 79
    if-ltz p1, :cond_4

    .line 80
    return v5

    .line 81
    :cond_4
    const/4 p1, 0x0

    .line 82
    return p1
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
.end method
