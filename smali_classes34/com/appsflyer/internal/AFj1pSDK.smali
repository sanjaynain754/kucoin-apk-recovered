.class public final Lcom/appsflyer/internal/AFj1pSDK;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/hardware/SensorEventListener;


# instance fields
.field private final AFAdRevenueData:I

.field private final areAllFieldsValid:[J

.field private final component1:[[F

.field private component3:J

.field private final component4:Ljava/util/concurrent/Executor;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final getCurrencyIso4217Code:Ljava/lang/String;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private getMediationNetwork:D

.field private final getMonetizationNetwork:Ljava/lang/String;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final getRevenue:I


# direct methods
.method public constructor <init>(Landroid/hardware/Sensor;Ljava/util/concurrent/ExecutorService;)V
    .locals 3
    .param p2    # Ljava/util/concurrent/ExecutorService;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x2

    .line 5
    .line 6
    new-array v1, v0, [[F

    .line 7
    .line 8
    iput-object v1, p0, Lcom/appsflyer/internal/AFj1pSDK;->component1:[[F

    .line 9
    .line 10
    new-array v0, v0, [J

    .line 11
    .line 12
    iput-object v0, p0, Lcom/appsflyer/internal/AFj1pSDK;->areAllFieldsValid:[J

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/hardware/Sensor;->getType()I

    .line 16
    move-result v0

    .line 17
    .line 18
    iput v0, p0, Lcom/appsflyer/internal/AFj1pSDK;->getRevenue:I

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/hardware/Sensor;->getName()Ljava/lang/String;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    const-string v2, ""

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    move-object v1, v2

    .line 28
    .line 29
    :cond_0
    iput-object v1, p0, Lcom/appsflyer/internal/AFj1pSDK;->getMonetizationNetwork:Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/hardware/Sensor;->getVendor()Ljava/lang/String;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    if-nez p1, :cond_1

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move-object v2, p1

    .line 38
    .line 39
    :goto_0
    iput-object v2, p0, Lcom/appsflyer/internal/AFj1pSDK;->getCurrencyIso4217Code:Ljava/lang/String;

    .line 40
    .line 41
    add-int/lit8 v0, v0, 0x1f

    .line 42
    .line 43
    mul-int/lit8 v0, v0, 0x1f

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 47
    move-result p1

    .line 48
    add-int/2addr v0, p1

    .line 49
    .line 50
    mul-int/lit8 v0, v0, 0x1f

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 54
    move-result p1

    .line 55
    add-int/2addr v0, p1

    .line 56
    .line 57
    iput v0, p0, Lcom/appsflyer/internal/AFj1pSDK;->AFAdRevenueData:I

    .line 58
    .line 59
    iput-object p2, p0, Lcom/appsflyer/internal/AFj1pSDK;->component4:Ljava/util/concurrent/Executor;

    .line 60
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
.end method

.method private AFAdRevenueData()Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1pSDK;->component1:[[F

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    aget-object v0, v0, v1

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    const/4 v0, 0x1

    .line 9
    return v0

    .line 10
    :cond_0
    return v1
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method private F_(Landroid/hardware/SensorEvent;)V
    .locals 11
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .line 1
    .line 2
    iget-wide v0, p1, Landroid/hardware/SensorEvent;->timestamp:J

    .line 3
    .line 4
    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 5
    .line 6
    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 8
    move-result-wide v2

    .line 9
    .line 10
    iget-object v4, p0, Lcom/appsflyer/internal/AFj1pSDK;->component1:[[F

    .line 11
    const/4 v5, 0x0

    .line 12
    .line 13
    aget-object v6, v4, v5

    .line 14
    .line 15
    if-nez v6, :cond_0

    .line 16
    array-length v0, p1

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([FI)[F

    .line 20
    move-result-object p1

    .line 21
    .line 22
    aput-object p1, v4, v5

    .line 23
    .line 24
    iget-object p1, p0, Lcom/appsflyer/internal/AFj1pSDK;->areAllFieldsValid:[J

    .line 25
    .line 26
    aput-wide v2, p1, v5

    .line 27
    return-void

    .line 28
    :cond_0
    const/4 v5, 0x1

    .line 29
    .line 30
    aget-object v4, v4, v5

    .line 31
    .line 32
    if-nez v4, :cond_1

    .line 33
    array-length v0, p1

    .line 34
    .line 35
    .line 36
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([FI)[F

    .line 37
    move-result-object p1

    .line 38
    .line 39
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1pSDK;->component1:[[F

    .line 40
    .line 41
    aput-object p1, v0, v5

    .line 42
    .line 43
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1pSDK;->areAllFieldsValid:[J

    .line 44
    .line 45
    aput-wide v2, v0, v5

    .line 46
    .line 47
    .line 48
    invoke-static {v6, p1}, Lcom/appsflyer/internal/AFj1pSDK;->getCurrencyIso4217Code([F[F)D

    .line 49
    move-result-wide v0

    .line 50
    .line 51
    iput-wide v0, p0, Lcom/appsflyer/internal/AFj1pSDK;->getMediationNetwork:D

    .line 52
    return-void

    .line 53
    .line 54
    :cond_1
    iget-wide v7, p0, Lcom/appsflyer/internal/AFj1pSDK;->component3:J

    .line 55
    .line 56
    sub-long v7, v0, v7

    .line 57
    .line 58
    .line 59
    const-wide/32 v9, 0x2faf080

    .line 60
    .line 61
    cmp-long v7, v9, v7

    .line 62
    .line 63
    if-gtz v7, :cond_3

    .line 64
    .line 65
    iput-wide v0, p0, Lcom/appsflyer/internal/AFj1pSDK;->component3:J

    .line 66
    .line 67
    .line 68
    invoke-static {v4, p1}, Ljava/util/Arrays;->equals([F[F)Z

    .line 69
    move-result v0

    .line 70
    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    iget-object p1, p0, Lcom/appsflyer/internal/AFj1pSDK;->areAllFieldsValid:[J

    .line 74
    .line 75
    aput-wide v2, p1, v5

    .line 76
    return-void

    .line 77
    .line 78
    .line 79
    :cond_2
    invoke-static {v6, p1}, Lcom/appsflyer/internal/AFj1pSDK;->getCurrencyIso4217Code([F[F)D

    .line 80
    move-result-wide v0

    .line 81
    .line 82
    iget-wide v6, p0, Lcom/appsflyer/internal/AFj1pSDK;->getMediationNetwork:D

    .line 83
    .line 84
    cmpl-double v4, v0, v6

    .line 85
    .line 86
    if-lez v4, :cond_3

    .line 87
    .line 88
    iget-object v4, p0, Lcom/appsflyer/internal/AFj1pSDK;->component1:[[F

    .line 89
    array-length v6, p1

    .line 90
    .line 91
    .line 92
    invoke-static {p1, v6}, Ljava/util/Arrays;->copyOf([FI)[F

    .line 93
    move-result-object p1

    .line 94
    .line 95
    aput-object p1, v4, v5

    .line 96
    .line 97
    iget-object p1, p0, Lcom/appsflyer/internal/AFj1pSDK;->areAllFieldsValid:[J

    .line 98
    .line 99
    aput-wide v2, p1, v5

    .line 100
    .line 101
    iput-wide v0, p0, Lcom/appsflyer/internal/AFj1pSDK;->getMediationNetwork:D

    .line 102
    :cond_3
    return-void
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
.end method

.method private synthetic G_(Landroid/hardware/SensorEvent;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFj1pSDK;->F_(Landroid/hardware/SensorEvent;)V

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
.end method

.method public static synthetic a(Lcom/appsflyer/internal/AFj1pSDK;Landroid/hardware/SensorEvent;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFj1pSDK;->G_(Landroid/hardware/SensorEvent;)V

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
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method private static getCurrencyIso4217Code([F[F)D
    .locals 8
    .param p0    # [F
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # [F
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    array-length v0, p0

    array-length v1, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    .line 2
    aget v4, p0, v3

    aget v5, p1, v3

    sub-float/2addr v4, v5

    float-to-double v4, v4

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    invoke-static {v4, v5, v6, v7}, Ljava/lang/StrictMath;->pow(DD)D

    move-result-wide v4

    add-double/2addr v1, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p0

    return-wide p0
.end method

.method private static getCurrencyIso4217Code([F)Ljava/util/List;
    .locals 4
    .param p0    # [F
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([F)",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget v3, p0, v2

    .line 6
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private getMonetizationNetwork()Ljava/util/Map;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 3
    const/4 v1, 0x7

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    .line 7
    .line 8
    iget v1, p0, Lcom/appsflyer/internal/AFj1pSDK;->getRevenue:I

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    const-string/jumbo v2, "sT"

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    const-string/jumbo v1, "sN"

    .line 22
    .line 23
    iget-object v2, p0, Lcom/appsflyer/internal/AFj1pSDK;->getMonetizationNetwork:Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    const-string/jumbo v1, "sV"

    .line 30
    .line 31
    iget-object v2, p0, Lcom/appsflyer/internal/AFj1pSDK;->getCurrencyIso4217Code:Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    iget-object v1, p0, Lcom/appsflyer/internal/AFj1pSDK;->component1:[[F

    .line 37
    const/4 v2, 0x0

    .line 38
    .line 39
    aget-object v1, v1, v2

    .line 40
    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    .line 44
    const-string/jumbo v2, "sVS"

    .line 45
    .line 46
    .line 47
    invoke-static {v1}, Lcom/appsflyer/internal/AFj1pSDK;->getCurrencyIso4217Code([F)Ljava/util/List;

    .line 48
    move-result-object v1

    .line 49
    .line 50
    .line 51
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    :cond_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFj1pSDK;->component1:[[F

    .line 54
    const/4 v2, 0x1

    .line 55
    .line 56
    aget-object v1, v1, v2

    .line 57
    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    .line 61
    const-string/jumbo v2, "sVE"

    .line 62
    .line 63
    .line 64
    invoke-static {v1}, Lcom/appsflyer/internal/AFj1pSDK;->getCurrencyIso4217Code([F)Ljava/util/List;

    .line 65
    move-result-object v1

    .line 66
    .line 67
    .line 68
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    :cond_1
    return-object v0
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method private getRevenue(ILjava/lang/String;Ljava/lang/String;)Z
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 11
    iget v0, p0, Lcom/appsflyer/internal/AFj1pSDK;->getRevenue:I

    if-ne v0, p1, :cond_0

    iget-object p1, p0, Lcom/appsflyer/internal/AFj1pSDK;->getMonetizationNetwork:Ljava/lang/String;

    .line 12
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/appsflyer/internal/AFj1pSDK;->getCurrencyIso4217Code:Ljava/lang/String;

    .line 13
    invoke-virtual {p1, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    .line 6
    :cond_0
    instance-of v0, p1, Lcom/appsflyer/internal/AFj1pSDK;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    check-cast p1, Lcom/appsflyer/internal/AFj1pSDK;

    .line 11
    .line 12
    iget v0, p1, Lcom/appsflyer/internal/AFj1pSDK;->getRevenue:I

    .line 13
    .line 14
    iget-object v1, p1, Lcom/appsflyer/internal/AFj1pSDK;->getMonetizationNetwork:Ljava/lang/String;

    .line 15
    .line 16
    iget-object p1, p1, Lcom/appsflyer/internal/AFj1pSDK;->getCurrencyIso4217Code:Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, v0, v1, p1}, Lcom/appsflyer/internal/AFj1pSDK;->getRevenue(ILjava/lang/String;Ljava/lang/String;)Z

    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    :cond_1
    const/4 p1, 0x0

    .line 23
    return p1
.end method

.method public final getRevenue(Ljava/util/Map;Z)V
    .locals 3
    .param p1    # Ljava/util/Map;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/appsflyer/internal/AFj1pSDK;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/appsflyer/internal/AFj1pSDK;->AFAdRevenueData()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    invoke-direct {p0}, Lcom/appsflyer/internal/AFj1pSDK;->getMonetizationNetwork()Ljava/util/Map;

    move-result-object v0

    invoke-interface {p1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_3

    .line 3
    iget-object p1, p0, Lcom/appsflyer/internal/AFj1pSDK;->component1:[[F

    array-length p1, p1

    const/4 p2, 0x0

    move v0, p2

    :goto_0
    if-ge v0, p1, :cond_0

    .line 4
    iget-object v1, p0, Lcom/appsflyer/internal/AFj1pSDK;->component1:[[F

    const/4 v2, 0x0

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/appsflyer/internal/AFj1pSDK;->areAllFieldsValid:[J

    array-length p1, p1

    :goto_1
    const-wide/16 v0, 0x0

    if-ge p2, p1, :cond_1

    .line 6
    iget-object v2, p0, Lcom/appsflyer/internal/AFj1pSDK;->areAllFieldsValid:[J

    aput-wide v0, v2, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_1
    const-wide/16 p1, 0x0

    .line 7
    iput-wide p1, p0, Lcom/appsflyer/internal/AFj1pSDK;->getMediationNetwork:D

    .line 8
    iput-wide v0, p0, Lcom/appsflyer/internal/AFj1pSDK;->component3:J

    return-void

    .line 9
    :cond_2
    invoke-interface {p1, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    .line 10
    invoke-direct {p0}, Lcom/appsflyer/internal/AFj1pSDK;->getMonetizationNetwork()Ljava/util/Map;

    move-result-object p2

    invoke-interface {p1, p0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-void
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/appsflyer/internal/AFj1pSDK;->AFAdRevenueData:I

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
.end method

.method public final onAccuracyChanged(Landroid/hardware/Sensor;I)V
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
.end method

.method public final onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1pSDK;->component4:Ljava/util/concurrent/Executor;

    .line 13
    .line 14
    new-instance v1, Lcom/appsflyer/internal/g0;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, p0, p1}, Lcom/appsflyer/internal/g0;-><init>(Lcom/appsflyer/internal/AFj1pSDK;Landroid/hardware/SensorEvent;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 21
    return-void

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFj1pSDK;->F_(Landroid/hardware/SensorEvent;)V

    .line 25
    return-void
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
.end method
