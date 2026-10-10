.class public final Lcom/tencent/liteav/txcvodplayer/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:Ljava/lang/String;

.field public B:Ljava/lang/String;

.field public C:I

.field public D:I

.field private E:Landroid/content/Context;

.field private F:Z

.field private G:I

.field private H:Ljava/lang/String;

.field private I:I

.field private J:I

.field private K:I

.field private L:F

.field private M:I

.field private N:Ljava/lang/String;

.field private O:Ljava/lang/String;

.field private P:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

.field private R:Lcom/tencent/liteav/base/datareport/Event4XReporter;

.field public a:Ljava/lang/String;

.field public b:J

.field public c:J

.field public d:J

.field public e:J

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:I

.field public j:I

.field public k:J

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:I

.field public t:Ljava/lang/String;

.field public u:Ljava/lang/String;

.field public v:Ljava/lang/String;

.field public w:I

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->a:Ljava/lang/String;

    .line 7
    .line 8
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    iput-wide v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->b:J

    .line 11
    .line 12
    iput-wide v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->c:J

    .line 13
    .line 14
    iput-wide v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->d:J

    .line 15
    .line 16
    iput-wide v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->e:J

    .line 17
    const/4 v2, 0x0

    .line 18
    .line 19
    iput-boolean v2, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->F:Z

    .line 20
    const/4 v3, 0x1

    .line 21
    .line 22
    iput-boolean v3, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->f:Z

    .line 23
    .line 24
    iput-boolean v2, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->g:Z

    .line 25
    .line 26
    iput-boolean v2, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->h:Z

    .line 27
    .line 28
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->i:I

    .line 29
    .line 30
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->j:I

    .line 31
    .line 32
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->G:I

    .line 33
    .line 34
    iput-wide v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->k:J

    .line 35
    const/4 v0, -0x1

    .line 36
    .line 37
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->l:I

    .line 38
    .line 39
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->m:I

    .line 40
    .line 41
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->n:I

    .line 42
    .line 43
    iput-boolean v2, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->p:Z

    .line 44
    .line 45
    iput-boolean v2, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->q:Z

    .line 46
    .line 47
    iput-boolean v2, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->r:Z

    .line 48
    .line 49
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->I:I

    .line 50
    .line 51
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->s:I

    .line 52
    .line 53
    const-string v1, "0"

    .line 54
    .line 55
    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->t:Ljava/lang/String;

    .line 56
    .line 57
    const-string v1, ""

    .line 58
    .line 59
    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->u:Ljava/lang/String;

    .line 60
    .line 61
    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->v:Ljava/lang/String;

    .line 62
    .line 63
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->w:I

    .line 64
    .line 65
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->x:I

    .line 66
    .line 67
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->y:I

    .line 68
    .line 69
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->z:I

    .line 70
    .line 71
    const/high16 v0, 0x3f800000    # 1.0f

    .line 72
    .line 73
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->L:F

    .line 74
    .line 75
    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->O:Ljava/lang/String;

    .line 76
    .line 77
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->C:I

    .line 78
    .line 79
    iput v2, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->D:I

    .line 80
    .line 81
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->E:Landroid/content/Context;

    .line 82
    .line 83
    .line 84
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getAppVersion()Ljava/lang/String;

    .line 85
    move-result-object p1

    .line 86
    .line 87
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->H:Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    invoke-static {}, Lcom/tencent/liteav/txcvodplayer/a/a;->j()Ljava/lang/String;

    .line 91
    move-result-object p1

    .line 92
    .line 93
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->N:Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    invoke-static {}, Lcom/tencent/liteav/sdk/common/HouseBuilder;->getInstance()Lcom/tencent/liteav/sdk/common/HouseBuilder;

    .line 97
    move-result-object p1

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, Lcom/tencent/liteav/sdk/common/HouseBuilder;->getAppId()Ljava/lang/String;

    .line 101
    move-result-object p1

    .line 102
    .line 103
    .line 104
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 105
    move-result-object v0

    .line 106
    .line 107
    const-string v1, "getLicenseAppId = "

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    move-result-object v0

    .line 112
    .line 113
    const-string v1, "VodLicenseCheck"

    .line 114
    .line 115
    .line 116
    invoke-static {v1, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    .line 118
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->O:Ljava/lang/String;

    .line 119
    .line 120
    new-instance p1, Ljava/util/HashMap;

    .line 121
    .line 122
    .line 123
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 124
    .line 125
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->P:Ljava/util/Map;

    .line 126
    .line 127
    new-instance v0, Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 128
    const/4 v4, 0x1

    .line 129
    const/4 v5, 0x1

    .line 130
    .line 131
    .line 132
    const v1, 0xc34f

    .line 133
    .line 134
    const/16 v2, 0x3ec

    .line 135
    .line 136
    const-string v3, ""

    .line 137
    .line 138
    .line 139
    invoke-direct/range {v0 .. v5}, Lcom/tencent/liteav/base/datareport/Event4XReporter;-><init>(IILjava/lang/String;ZI)V

    .line 140
    .line 141
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->R:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 142
    .line 143
    .line 144
    const-string/jumbo p1, "new TXCVodPlayCollection"

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/txcvodplayer/a/a;->b(Ljava/lang/String;)V

    .line 148
    return-void
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
    .line 236
    .line 237
    .line 238
    .line 239
.end method

.method private static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .line 15
    const-string/jumbo v0, "window"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/WindowManager;

    .line 16
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 17
    invoke-interface {p0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 18
    invoke-interface {p0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p0

    .line 19
    :try_start_0
    const-string v1, "android.view.Display"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 20
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getSystemOSVersionInt()I

    move-result v2

    const/16 v3, 0x8

    if-le v2, v3, :cond_0

    .line 21
    const-string v2, "getRealMetrics"

    const-class v3, Landroid/util/DisplayMetrics;

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 22
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    :cond_0
    iget p0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 24
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "_"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    .line 26
    :catchall_0
    const-string p0, ""

    return-object p0
.end method

.method private g()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "str_sdk_name"

    .line 6
    .line 7
    const-string v2, "liteavSdk"

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventStringValue(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getBrand()Ljava/lang/String;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 17
    .line 18
    .line 19
    const-string/jumbo v2, "str_brand_type"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2, v0}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventStringValue(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->E:Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Lcom/tencent/liteav/txcvodplayer/a/a;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 31
    .line 32
    .line 33
    const-string/jumbo v2, "str_device_resolution"

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v2, v0}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventStringValue(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getModel()Ljava/lang/String;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 43
    .line 44
    .line 45
    const-string/jumbo v2, "str_device_type"

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v2, v0}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventStringValue(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getNetworkType()I

    .line 52
    move-result v0

    .line 53
    .line 54
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 55
    .line 56
    .line 57
    const-string/jumbo v2, "u32_network_type"

    .line 58
    int-to-long v3, v0

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v2, v3, v4}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventIntValue(Ljava/lang/String;J)V

    .line 62
    .line 63
    .line 64
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getDeviceUuid()Ljava/lang/String;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 68
    .line 69
    const-string v2, "dev_uuid"

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v2, v0}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventStringValue(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 75
    .line 76
    .line 77
    const-string/jumbo v2, "str_app_version"

    .line 78
    .line 79
    iget-object v3, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->H:Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v2, v3}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventStringValue(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getAppName()Ljava/lang/String;

    .line 86
    move-result-object v1

    .line 87
    .line 88
    iget-object v2, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 89
    .line 90
    .line 91
    const-string/jumbo v3, "str_app_name"

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2, v3, v1}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventStringValue(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 97
    .line 98
    .line 99
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getSystemOSVersionInt()I

    .line 100
    move-result v2

    .line 101
    .line 102
    .line 103
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 104
    move-result-object v2

    .line 105
    .line 106
    .line 107
    const-string/jumbo v3, "sys_version"

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, v3, v2}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventStringValue(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    .line 112
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 113
    .line 114
    .line 115
    const-string/jumbo v2, "str_stream_url"

    .line 116
    .line 117
    iget-object v3, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->a:Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, v2, v3}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventStringValue(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 123
    .line 124
    const-string v2, "bytes_token"

    .line 125
    .line 126
    iget-object v3, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->N:Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v2, v3}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventStringValue(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-static {}, Lcom/tencent/liteav/LiveSettingJni;->getUserId()Ljava/lang/String;

    .line 133
    move-result-object v1

    .line 134
    .line 135
    .line 136
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 137
    move-result v2

    .line 138
    .line 139
    if-eqz v2, :cond_0

    .line 140
    .line 141
    .line 142
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 143
    move-result-object v0

    .line 144
    .line 145
    const-string v1, "_"

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    move-result-object v1

    .line 150
    .line 151
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 152
    .line 153
    .line 154
    const-string/jumbo v2, "str_user_id"

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, v2, v1}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventStringValue(Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getAppPackageName()Ljava/lang/String;

    .line 161
    move-result-object v0

    .line 162
    .line 163
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 164
    .line 165
    .line 166
    const-string/jumbo v2, "str_package_name"

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1, v2, v0}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventStringValue(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    .line 171
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 172
    .line 173
    .line 174
    const-string/jumbo v1, "u32_app_id"

    .line 175
    .line 176
    iget-object v2, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->O:Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0, v1, v2}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventStringValue(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    .line 181
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 182
    .line 183
    const-string v1, "custom_data"

    .line 184
    .line 185
    .line 186
    invoke-direct {p0}, Lcom/tencent/liteav/txcvodplayer/a/a;->h()Ljava/lang/String;

    .line 187
    move-result-object v2

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, v1, v2}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventStringValue(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    return-void
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
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
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
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
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
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
.end method

.method private h()Ljava/lang/String;
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->P:Ljava/util/Map;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v0, ""

    .line 11
    return-object v0

    .line 12
    .line 13
    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 17
    .line 18
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->P:Ljava/util/Map;

    .line 19
    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    move-result v2

    .line 31
    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    move-result-object v2

    .line 37
    .line 38
    check-cast v2, Ljava/util/Map$Entry;

    .line 39
    .line 40
    .line 41
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 42
    move-result-object v3

    .line 43
    .line 44
    check-cast v3, Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 48
    move-result-object v2

    .line 49
    .line 50
    check-cast v2, Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 54
    move-result v4

    .line 55
    .line 56
    if-nez v4, :cond_1

    .line 57
    .line 58
    .line 59
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 60
    move-result v4

    .line 61
    .line 62
    if-nez v4, :cond_1

    .line 63
    .line 64
    .line 65
    :try_start_0
    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    goto :goto_0

    .line 67
    :catch_0
    move-exception v2

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 71
    goto :goto_0

    .line 72
    .line 73
    .line 74
    :cond_2
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 75
    move-result-object v0

    .line 76
    return-object v0
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

.method private i()V
    .locals 6

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 3
    const/4 v4, 0x1

    .line 4
    const/4 v5, 0x1

    .line 5
    .line 6
    .line 7
    const v1, 0x9d70

    .line 8
    .line 9
    const/16 v2, 0x3f3

    .line 10
    .line 11
    const-string v3, ""

    .line 12
    .line 13
    .line 14
    invoke-direct/range {v0 .. v5}, Lcom/tencent/liteav/base/datareport/Event4XReporter;-><init>(IILjava/lang/String;ZI)V

    .line 15
    .line 16
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Lcom/tencent/liteav/txcvodplayer/a/a;->g()V

    .line 20
    .line 21
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 22
    .line 23
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->G:I

    .line 24
    int-to-long v1, v1

    .line 25
    .line 26
    .line 27
    const-string/jumbo v3, "u32_timeuse"

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v3, v1, v2}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventIntValue(Ljava/lang/String;J)V

    .line 31
    .line 32
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 33
    .line 34
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->i:I

    .line 35
    int-to-long v1, v1

    .line 36
    .line 37
    .line 38
    const-string/jumbo v3, "u32_videotime"

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v3, v1, v2}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventIntValue(Ljava/lang/String;J)V

    .line 42
    .line 43
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 44
    .line 45
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->m:I

    .line 46
    .line 47
    const-wide/16 v2, 0x0

    .line 48
    .line 49
    if-nez v1, :cond_0

    .line 50
    move-wide v4, v2

    .line 51
    goto :goto_0

    .line 52
    .line 53
    :cond_0
    iget v4, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->n:I

    .line 54
    div-int/2addr v4, v1

    .line 55
    int-to-long v4, v4

    .line 56
    .line 57
    .line 58
    :goto_0
    const-string/jumbo v1, "u32_avg_load"

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1, v4, v5}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventIntValue(Ljava/lang/String;J)V

    .line 62
    .line 63
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 64
    .line 65
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->m:I

    .line 66
    int-to-long v4, v1

    .line 67
    .line 68
    .line 69
    const-string/jumbo v1, "u32_load_cnt"

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v1, v4, v5}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventIntValue(Ljava/lang/String;J)V

    .line 73
    .line 74
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 75
    .line 76
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->o:I

    .line 77
    int-to-long v4, v1

    .line 78
    .line 79
    .line 80
    const-string/jumbo v1, "u32_max_load"

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v1, v4, v5}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventIntValue(Ljava/lang/String;J)V

    .line 84
    .line 85
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 86
    .line 87
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->n:I

    .line 88
    int-to-long v4, v1

    .line 89
    .line 90
    .line 91
    const-string/jumbo v1, "u32_avg_block_time"

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v1, v4, v5}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventIntValue(Ljava/lang/String;J)V

    .line 95
    .line 96
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 97
    .line 98
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->s:I

    .line 99
    int-to-long v4, v1

    .line 100
    .line 101
    .line 102
    const-string/jumbo v1, "u32_player_type"

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v1, v4, v5}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventIntValue(Ljava/lang/String;J)V

    .line 106
    .line 107
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 108
    .line 109
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->y:I

    .line 110
    .line 111
    if-lez v1, :cond_1

    .line 112
    int-to-long v4, v1

    .line 113
    goto :goto_1

    .line 114
    :cond_1
    move-wide v4, v2

    .line 115
    .line 116
    .line 117
    :goto_1
    const-string/jumbo v1, "u32_dns_time"

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v1, v4, v5}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventIntValue(Ljava/lang/String;J)V

    .line 121
    .line 122
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 123
    .line 124
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->x:I

    .line 125
    .line 126
    if-lez v1, :cond_2

    .line 127
    int-to-long v4, v1

    .line 128
    goto :goto_2

    .line 129
    :cond_2
    move-wide v4, v2

    .line 130
    .line 131
    .line 132
    :goto_2
    const-string/jumbo v1, "u32_tcp_did_connect"

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, v1, v4, v5}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventIntValue(Ljava/lang/String;J)V

    .line 136
    .line 137
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 138
    .line 139
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->z:I

    .line 140
    .line 141
    if-lez v1, :cond_3

    .line 142
    int-to-long v2, v1

    .line 143
    .line 144
    .line 145
    :cond_3
    const-string/jumbo v1, "u32_first_video_packet"

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, v1, v2, v3}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventIntValue(Ljava/lang/String;J)V

    .line 149
    .line 150
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 151
    .line 152
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->l:I

    .line 153
    int-to-long v1, v1

    .line 154
    .line 155
    .line 156
    const-string/jumbo v3, "u32_first_i_frame"

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, v3, v1, v2}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventIntValue(Ljava/lang/String;J)V

    .line 160
    .line 161
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 162
    .line 163
    .line 164
    const-string/jumbo v1, "u32_server_ip"

    .line 165
    .line 166
    iget-object v2, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->A:Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, v1, v2}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventStringValue(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    .line 171
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 172
    .line 173
    .line 174
    const-string/jumbo v1, "u32_drm_type"

    .line 175
    .line 176
    iget-object v2, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->B:Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0, v1, v2}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventStringValue(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    .line 181
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 182
    .line 183
    .line 184
    const-string/jumbo v1, "str_fileid"

    .line 185
    .line 186
    iget-object v2, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->u:Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v1, v2}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventStringValue(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    .line 191
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 192
    .line 193
    .line 194
    const-string/jumbo v1, "u32_playmode"

    .line 195
    .line 196
    iget-object v2, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->t:Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0, v1, v2}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventStringValue(Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    .line 201
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 202
    .line 203
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->J:I

    .line 204
    int-to-long v1, v1

    .line 205
    .line 206
    .line 207
    const-string/jumbo v3, "u64_err_code"

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0, v3, v1, v2}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventIntValue(Ljava/lang/String;J)V

    .line 211
    .line 212
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 213
    .line 214
    .line 215
    const-string/jumbo v1, "str_err_info"

    .line 216
    .line 217
    iget-object v2, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->v:Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0, v1, v2}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventStringValue(Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    .line 222
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 223
    .line 224
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->w:I

    .line 225
    int-to-long v1, v1

    .line 226
    .line 227
    .line 228
    const-string/jumbo v3, "u32_video_decode_type"

    .line 229
    .line 230
    .line 231
    invoke-virtual {v0, v3, v1, v2}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventIntValue(Ljava/lang/String;J)V

    .line 232
    .line 233
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 234
    .line 235
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->L:F

    .line 236
    .line 237
    const/high16 v2, 0x42c80000    # 100.0f

    .line 238
    mul-float/2addr v1, v2

    .line 239
    float-to-int v1, v1

    .line 240
    int-to-long v3, v1

    .line 241
    .line 242
    .line 243
    const-string/jumbo v1, "u32_speed"

    .line 244
    .line 245
    .line 246
    invoke-virtual {v0, v1, v3, v4}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventIntValue(Ljava/lang/String;J)V

    .line 247
    .line 248
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 249
    .line 250
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->C:I

    .line 251
    int-to-long v3, v1

    .line 252
    .line 253
    .line 254
    const-string/jumbo v1, "vwidth"

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0, v1, v3, v4}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventIntValue(Ljava/lang/String;J)V

    .line 258
    .line 259
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 260
    .line 261
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->D:I

    .line 262
    int-to-long v3, v1

    .line 263
    .line 264
    .line 265
    const-string/jumbo v1, "vheight"

    .line 266
    .line 267
    .line 268
    invoke-virtual {v0, v1, v3, v4}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventIntValue(Ljava/lang/String;J)V

    .line 269
    .line 270
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v0}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->sendReport()V

    .line 274
    .line 275
    new-instance v0, Ljava/lang/StringBuilder;

    .line 276
    .line 277
    const-string v1, "[reportEnd] evt 40304: token="

    .line 278
    .line 279
    .line 280
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 281
    .line 282
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->N:Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    const-string v1, " ,dev_uuid="

    .line 288
    .line 289
    .line 290
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getDeviceUuid()Ljava/lang/String;

    .line 294
    move-result-object v1

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    const-string v1, " ,str_app_version="

    .line 300
    .line 301
    .line 302
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->H:Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    const-string v1, " ,sys_version="

    .line 310
    .line 311
    .line 312
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getSystemOSVersionInt()I

    .line 316
    move-result v1

    .line 317
    .line 318
    .line 319
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    const-string v1, " ,str_stream_url="

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->a:Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    const-string v1, " ,u32_timeuse="

    .line 332
    .line 333
    .line 334
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->G:I

    .line 337
    .line 338
    .line 339
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    const-string v1, " ,u32_videotime="

    .line 342
    .line 343
    .line 344
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->i:I

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    const-string v1, " ,u32_avg_load="

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->m:I

    .line 357
    .line 358
    if-nez v1, :cond_4

    .line 359
    const/4 v1, 0x0

    .line 360
    goto :goto_3

    .line 361
    .line 362
    :cond_4
    iget v3, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->n:I

    .line 363
    .line 364
    div-int v1, v3, v1

    .line 365
    .line 366
    .line 367
    :goto_3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    const-string v1, " ,u32_load_cnt="

    .line 370
    .line 371
    .line 372
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->m:I

    .line 375
    .line 376
    .line 377
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    const-string v1, " ,u32_max_load="

    .line 380
    .line 381
    .line 382
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->o:I

    .line 385
    .line 386
    .line 387
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    const-string v1, " ,u32_avg_block_time="

    .line 390
    .line 391
    .line 392
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->n:I

    .line 395
    .line 396
    .line 397
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    const-string v1, " ,u32_player_type="

    .line 400
    .line 401
    .line 402
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->s:I

    .line 405
    .line 406
    .line 407
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    const-string v1, " ,u32_dns_time="

    .line 410
    .line 411
    .line 412
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->y:I

    .line 415
    .line 416
    .line 417
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    const-string v1, " ,u32_tcp_did_connect="

    .line 420
    .line 421
    .line 422
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 423
    .line 424
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->x:I

    .line 425
    const/4 v3, -0x1

    .line 426
    .line 427
    if-lez v1, :cond_5

    .line 428
    goto :goto_4

    .line 429
    :cond_5
    move v1, v3

    .line 430
    .line 431
    .line 432
    :goto_4
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 433
    .line 434
    const-string v1, " ,u32_first_video_packet="

    .line 435
    .line 436
    .line 437
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 438
    .line 439
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->z:I

    .line 440
    .line 441
    if-lez v1, :cond_6

    .line 442
    move v3, v1

    .line 443
    .line 444
    .line 445
    :cond_6
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 446
    .line 447
    const-string v1, " ,u32_first_i_frame="

    .line 448
    .line 449
    .line 450
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 451
    .line 452
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->l:I

    .line 453
    .line 454
    .line 455
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 456
    .line 457
    const-string v1, " ,u32_server_ip="

    .line 458
    .line 459
    .line 460
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 461
    .line 462
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->A:Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 466
    .line 467
    const-string v1, " ,u32_drm_type="

    .line 468
    .line 469
    .line 470
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 471
    .line 472
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->B:Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 476
    .line 477
    const-string v1, " ,str_fileid="

    .line 478
    .line 479
    .line 480
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 481
    .line 482
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->u:Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 486
    .line 487
    const-string v1, " ,u32_playmode="

    .line 488
    .line 489
    .line 490
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 491
    .line 492
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->t:Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 496
    .line 497
    const-string v1, " ,u64_err_code="

    .line 498
    .line 499
    .line 500
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 501
    .line 502
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->J:I

    .line 503
    .line 504
    .line 505
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 506
    .line 507
    const-string v1, " ,str_err_info="

    .line 508
    .line 509
    .line 510
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 511
    .line 512
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->v:Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 516
    .line 517
    const-string v1, " ,u32_speed="

    .line 518
    .line 519
    .line 520
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 521
    .line 522
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->L:F

    .line 523
    mul-float/2addr v1, v2

    .line 524
    .line 525
    .line 526
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 527
    .line 528
    const-string v1, " ,u32_app_id="

    .line 529
    .line 530
    .line 531
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 532
    .line 533
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->O:Ljava/lang/String;

    .line 534
    .line 535
    .line 536
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 537
    .line 538
    const-string v1, " ,u32_video_decode_type="

    .line 539
    .line 540
    .line 541
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 542
    .line 543
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->w:I

    .line 544
    .line 545
    .line 546
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 547
    .line 548
    const-string v1, " ,custom_data="

    .line 549
    .line 550
    .line 551
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 552
    .line 553
    .line 554
    invoke-direct {p0}, Lcom/tencent/liteav/txcvodplayer/a/a;->h()Ljava/lang/String;

    .line 555
    move-result-object v1

    .line 556
    .line 557
    .line 558
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 559
    .line 560
    const-string v1, " ,vwidth="

    .line 561
    .line 562
    .line 563
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 564
    .line 565
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->C:I

    .line 566
    .line 567
    .line 568
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 569
    .line 570
    const-string v1, " ,vheight="

    .line 571
    .line 572
    .line 573
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 574
    .line 575
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->D:I

    .line 576
    .line 577
    .line 578
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 579
    .line 580
    .line 581
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 582
    move-result-object v0

    .line 583
    .line 584
    .line 585
    invoke-virtual {p0, v0}, Lcom/tencent/liteav/txcvodplayer/a/a;->b(Ljava/lang/String;)V

    .line 586
    return-void
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
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
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
.end method

.method private static j()Ljava/lang/String;
    .locals 12

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 8
    move-result-wide v2

    .line 9
    .line 10
    const-string v4, ""

    .line 11
    const/4 v5, 0x5

    .line 12
    .line 13
    :goto_0
    const-wide/16 v6, 0xff

    .line 14
    .line 15
    const-string v8, "%02x"

    .line 16
    .line 17
    if-ltz v5, :cond_0

    .line 18
    .line 19
    new-instance v9, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    mul-int/lit8 v4, v5, 0x8

    .line 28
    .line 29
    shr-long v10, v0, v4

    .line 30
    and-long/2addr v6, v10

    .line 31
    long-to-int v4, v6

    .line 32
    int-to-byte v4, v4

    .line 33
    .line 34
    .line 35
    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 36
    move-result-object v4

    .line 37
    .line 38
    .line 39
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 40
    move-result-object v4

    .line 41
    .line 42
    .line 43
    invoke-static {v8, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 44
    move-result-object v4

    .line 45
    .line 46
    .line 47
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    move-result-object v4

    .line 52
    .line 53
    add-int/lit8 v5, v5, -0x1

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    const/4 v0, 0x3

    .line 56
    .line 57
    :goto_1
    if-ltz v0, :cond_1

    .line 58
    .line 59
    new-instance v1, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    mul-int/lit8 v4, v0, 0x8

    .line 68
    .line 69
    shr-long v4, v2, v4

    .line 70
    and-long/2addr v4, v6

    .line 71
    long-to-int v4, v4

    .line 72
    int-to-byte v4, v4

    .line 73
    .line 74
    .line 75
    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 76
    move-result-object v4

    .line 77
    .line 78
    .line 79
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 80
    move-result-object v4

    .line 81
    .line 82
    .line 83
    invoke-static {v8, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 84
    move-result-object v4

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    move-result-object v4

    .line 92
    .line 93
    add-int/lit8 v0, v0, -0x1

    .line 94
    goto :goto_1

    .line 95
    .line 96
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    new-instance v1, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getDeviceUuid()Ljava/lang/String;

    .line 114
    move-result-object v2

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    move-result-object v1

    .line 122
    .line 123
    .line 124
    invoke-static {v1}, Lcom/tencent/liteav/txcplayer/a/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 125
    move-result-object v1

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    move-result-object v0

    .line 133
    return-object v0
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


# virtual methods
.method public final a()V
    .locals 6

    .line 3
    new-instance v0, Lcom/tencent/liteav/base/datareport/Event4XReporter;

    const/4 v4, 0x1

    const/4 v5, 0x1

    const v1, 0x9d6f

    const/16 v2, 0x3f3

    const-string v3, ""

    invoke-direct/range {v0 .. v5}, Lcom/tencent/liteav/base/datareport/Event4XReporter;-><init>(IILjava/lang/String;ZI)V

    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 4
    invoke-direct {p0}, Lcom/tencent/liteav/txcvodplayer/a/a;->g()V

    .line 5
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    const-string/jumbo v1, "str_fileid"

    iget-object v2, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->u:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventStringValue(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    invoke-static {}, Lcom/tencent/liteav/txcplayer/common/c;->a()Lcom/tencent/liteav/sdk/common/HouseBuilder$d;

    move-result-object v0

    .line 7
    sget-object v1, Lcom/tencent/liteav/sdk/common/HouseBuilder$d;->a:Lcom/tencent/liteav/sdk/common/HouseBuilder$d;

    if-eq v0, v1, :cond_0

    .line 8
    iget v0, v0, Lcom/tencent/liteav/sdk/common/HouseBuilder$d;->value:I

    .line 9
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->J:I

    .line 10
    const-string/jumbo v1, "player_license_error"

    iput-object v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->v:Ljava/lang/String;

    .line 11
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    const-string/jumbo v2, "u64_err_code"

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventStringValue(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    const-string/jumbo v1, "str_err_info"

    iget-object v2, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->v:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->setEventStringValue(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->Q:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    invoke-virtual {v0}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->sendReport()V

    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[reportStart], report evt 40303: token="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->N:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ,u32_app_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->O:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ,str_fileid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->u:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ,str_stream_url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ,u64_err_code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->J:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " ,str_err_info="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->v:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/liteav/txcvodplayer/a/a;->b(Ljava/lang/String;)V

    return-void
.end method

.method public final a(F)V
    .locals 3

    .line 40
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->L:F

    .line 41
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->R:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    const/4 v0, 0x0

    const-string v1, ""

    const/16 v2, 0x610

    invoke-virtual {p1, v2, v0, v1}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->reportDau(IILjava/lang/String;)V

    .line 42
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "[changeSpeed], mSpeed = "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->L:F

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tencent/liteav/txcvodplayer/a/a;->b(Ljava/lang/String;)V

    return-void
.end method

.method public final a(ILjava/lang/String;)V
    .locals 3

    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "errorCode= "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " \uff0cerrorInfo= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/liteav/txcvodplayer/a/a;->b(Ljava/lang/String;)V

    .line 44
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->l:I

    const/4 v1, -0x1

    const-string v2, ""

    if-ne v0, v1, :cond_1

    .line 45
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->J:I

    if-nez p2, :cond_0

    move-object p2, v2

    .line 46
    :cond_0
    iput-object p2, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->v:Ljava/lang/String;

    const/4 p1, 0x0

    .line 47
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->l:I

    goto :goto_0

    .line 48
    :cond_1
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->J:I

    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "errorCode="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "_errorInfo="

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p2, :cond_2

    move-object p2, v2

    :cond_2
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->v:Ljava/lang/String;

    .line 50
    :goto_0
    iget-boolean p1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->F:Z

    if-eqz p1, :cond_3

    .line 51
    invoke-virtual {p0}, Lcom/tencent/liteav/txcvodplayer/a/a;->c()V

    :cond_3
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->O:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 53
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->O:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[putCustomData]: <"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ,"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/liteav/txcvodplayer/a/a;->b(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->P:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final a(Z)V
    .locals 4

    const/4 v0, 0x1

    .line 27
    iput-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->F:Z

    .line 28
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->d:J

    iput-wide v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->b:J

    .line 29
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->c:J

    const/4 v1, 0x0

    .line 30
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->G:I

    const-wide/16 v2, 0x0

    .line 31
    iput-wide v2, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->k:J

    .line 32
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->j:I

    .line 33
    iput-wide v2, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->e:J

    .line 34
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->m:I

    .line 35
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->n:I

    .line 36
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->o:I

    if-eqz p1, :cond_0

    .line 37
    iput-boolean v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->f:Z

    goto :goto_0

    .line 38
    :cond_0
    iput-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->g:Z

    .line 39
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "[start] ,mBeginPlayTS = "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->d:J

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", mIsPaused = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->f:Z

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, " mIsPreLoading = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->g:Z

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tencent/liteav/txcvodplayer/a/a;->b(Ljava/lang/String;)V

    return-void
.end method

.method public final b()V
    .locals 6

    const-wide/16 v0, 0x0

    .line 1
    iget-wide v2, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->d:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 2
    const-string v0, "calculateSegmentPlayTime mBeginPlayTS == 0"

    invoke-virtual {p0, v0}, Lcom/tencent/liteav/txcvodplayer/a/a;->b(Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "calculateSegmentPlayTime mCurIndexPlayTime= "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->k:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mBeginPlayTS="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->d:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/liteav/txcvodplayer/a/a;->b(Ljava/lang/String;)V

    .line 4
    iget-wide v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->k:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->d:J

    sub-long/2addr v2, v4

    long-to-int v2, v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->k:J

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->d:J

    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 2

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "], "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "TXCVodPlayCollection"

    invoke-static {v0, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final b(Z)V
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 6
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->K:I

    .line 7
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->R:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    const/16 v1, 0x611

    const-string v2, ""

    invoke-virtual {p1, v1, v0, v2}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->reportDau(IILjava/lang/String;)V

    goto :goto_0

    .line 8
    :cond_0
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->K:I

    .line 9
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, " mIsMirror= "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->K:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tencent/liteav/txcvodplayer/a/a;->b(Ljava/lang/String;)V

    return-void
.end method

.method public final c()V
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[stop] mCurIndexPlayTime = "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->k:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " ,mIsPaused = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->f:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " ,mIsPlaying = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->F:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " ,mIsPreLoading ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->g:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/liteav/txcvodplayer/a/a;->b(Ljava/lang/String;)V

    .line 2
    iget-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->f:Z

    if-eqz v0, :cond_0

    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->d:J

    .line 4
    :cond_0
    iget-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->F:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->g:Z

    if-nez v0, :cond_1

    .line 5
    invoke-virtual {p0}, Lcom/tencent/liteav/txcvodplayer/a/a;->b()V

    .line 6
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->G:I

    int-to-long v2, v0

    iget-wide v4, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->k:J

    const-wide/16 v6, 0x3e8

    div-long/2addr v4, v6

    add-long/2addr v2, v4

    long-to-int v0, v2

    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->G:I

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "[stop] mPlayTime = "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->G:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " s"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/liteav/txcvodplayer/a/a;->b(Ljava/lang/String;)V

    const-wide/16 v2, 0x0

    .line 8
    iput-wide v2, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->k:J

    .line 9
    invoke-direct {p0}, Lcom/tencent/liteav/txcvodplayer/a/a;->i()V

    .line 10
    invoke-static {}, Lcom/tencent/liteav/txcvodplayer/a/a;->j()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->N:Ljava/lang/String;

    .line 11
    iput-boolean v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->F:Z

    .line 12
    :cond_1
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->J:I

    .line 13
    const-string v0, ""

    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->v:Ljava/lang/String;

    .line 14
    iput-boolean v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->p:Z

    .line 15
    iput-boolean v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->q:Z

    .line 16
    iput-boolean v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->f:Z

    .line 17
    iput-boolean v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->g:Z

    .line 18
    iput-boolean v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->h:Z

    const/4 v0, -0x1

    .line 19
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->l:I

    .line 20
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->P:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public final c(Z)V
    .locals 3

    const/4 v0, 0x1

    if-nez p1, :cond_0

    .line 21
    iput-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->h:Z

    .line 22
    :cond_0
    iget p1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->M:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->M:I

    .line 23
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->R:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    const/4 v0, 0x0

    const-string v1, ""

    const/16 v2, 0x612

    invoke-virtual {p1, v2, v0, v1}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->reportDau(IILjava/lang/String;)V

    .line 24
    new-instance p1, Ljava/lang/StringBuilder;

    const-string/jumbo v0, "setBitrateIndexCnt= "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->M:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tencent/liteav/txcvodplayer/a/a;->b(Ljava/lang/String;)V

    return-void
.end method

.method public final d()V
    .locals 4

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->l:I

    .line 3
    const/4 v1, -0x1

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    move-result-wide v0

    .line 10
    .line 11
    iget-wide v2, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->b:J

    .line 12
    sub-long/2addr v0, v2

    .line 13
    long-to-int v0, v0

    .line 14
    .line 15
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->l:I

    .line 16
    :cond_0
    return-void
    .line 17
.end method

.method public final e()V
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "setBitrateRenderStart"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/tencent/liteav/txcvodplayer/a/a;->b(Ljava/lang/String;)V

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    iput-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->h:Z

    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final f()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->p:Z

    .line 4
    .line 5
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->I:I

    .line 6
    add-int/2addr v1, v0

    .line 7
    .line 8
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->I:I

    .line 9
    .line 10
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->R:Lcom/tencent/liteav/base/datareport/Event4XReporter;

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    const-string v2, ""

    .line 14
    .line 15
    const/16 v3, 0x60f

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v3, v1, v2}, Lcom/tencent/liteav/base/datareport/Event4XReporter;->reportDau(IILjava/lang/String;)V

    .line 19
    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v1, "mSeekCnt= "

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    iget v1, p0, Lcom/tencent/liteav/txcvodplayer/a/a;->I:I

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0}, Lcom/tencent/liteav/txcvodplayer/a/a;->b(Ljava/lang/String;)V

    .line 38
    return-void
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
