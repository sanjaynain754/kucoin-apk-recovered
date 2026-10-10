.class final Lcom/tencent/thumbplayer/tcmedia/core/drm/TPMediaDrmProxy$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/thumbplayer/tcmedia/core/drm/TPMediaDrmProxy;->createMediaDrmProxyWithAsyncTimeout(Ljava/util/UUID;ZLcom/tencent/thumbplayer/tcmedia/core/drm/ITPDrmInterruptCallback;)Lcom/tencent/thumbplayer/tcmedia/core/drm/TPMediaDrmProxy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field final synthetic val$cleanup:[Z

.field final synthetic val$exceptions:[Landroid/media/UnsupportedSchemeException;

.field final synthetic val$isReuse:Z

.field final synthetic val$lock:Ljava/lang/Object;

.field final synthetic val$mediaDrmProxies:[Lcom/tencent/thumbplayer/tcmedia/core/drm/TPMediaDrmProxy;

.field final synthetic val$uuid:Ljava/util/UUID;


# direct methods
.method public constructor <init>([Lcom/tencent/thumbplayer/tcmedia/core/drm/TPMediaDrmProxy;Ljava/util/UUID;Z[Landroid/media/UnsupportedSchemeException;Ljava/lang/Object;[Z)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/core/drm/TPMediaDrmProxy$2;->val$mediaDrmProxies:[Lcom/tencent/thumbplayer/tcmedia/core/drm/TPMediaDrmProxy;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/thumbplayer/tcmedia/core/drm/TPMediaDrmProxy$2;->val$uuid:Ljava/util/UUID;

    .line 5
    .line 6
    iput-boolean p3, p0, Lcom/tencent/thumbplayer/tcmedia/core/drm/TPMediaDrmProxy$2;->val$isReuse:Z

    .line 7
    .line 8
    iput-object p4, p0, Lcom/tencent/thumbplayer/tcmedia/core/drm/TPMediaDrmProxy$2;->val$exceptions:[Landroid/media/UnsupportedSchemeException;

    .line 9
    .line 10
    iput-object p5, p0, Lcom/tencent/thumbplayer/tcmedia/core/drm/TPMediaDrmProxy$2;->val$lock:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p6, p0, Lcom/tencent/thumbplayer/tcmedia/core/drm/TPMediaDrmProxy$2;->val$cleanup:[Z

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    return-void
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
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    .line 2
    const-string v0, "create system mediaDrm proxy start."

    .line 3
    const/4 v1, 0x2

    .line 4
    .line 5
    .line 6
    invoke-static {v1, v0}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeLog;->printLog(ILjava/lang/String;)V

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    :try_start_0
    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/core/drm/TPMediaDrmProxy$2;->val$mediaDrmProxies:[Lcom/tencent/thumbplayer/tcmedia/core/drm/TPMediaDrmProxy;

    .line 10
    .line 11
    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/drm/TPMediaDrmProxy;

    .line 12
    .line 13
    iget-object v4, p0, Lcom/tencent/thumbplayer/tcmedia/core/drm/TPMediaDrmProxy$2;->val$uuid:Ljava/util/UUID;

    .line 14
    .line 15
    iget-boolean v5, p0, Lcom/tencent/thumbplayer/tcmedia/core/drm/TPMediaDrmProxy$2;->val$isReuse:Z

    .line 16
    const/4 v6, 0x0

    .line 17
    .line 18
    .line 19
    invoke-direct {v3, v4, v5, v6}, Lcom/tencent/thumbplayer/tcmedia/core/drm/TPMediaDrmProxy;-><init>(Ljava/util/UUID;ZLcom/tencent/thumbplayer/tcmedia/core/drm/TPMediaDrmProxy$1;)V

    .line 20
    .line 21
    aput-object v3, v2, v0
    :try_end_0
    .catch Landroid/media/UnsupportedSchemeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception v2

    .line 24
    .line 25
    iget-object v3, p0, Lcom/tencent/thumbplayer/tcmedia/core/drm/TPMediaDrmProxy$2;->val$exceptions:[Landroid/media/UnsupportedSchemeException;

    .line 26
    .line 27
    aput-object v2, v3, v0

    .line 28
    .line 29
    :goto_0
    const-string v2, "create system mediaDrm proxy end."

    .line 30
    .line 31
    .line 32
    invoke-static {v1, v2}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPNativeLog;->printLog(ILjava/lang/String;)V

    .line 33
    .line 34
    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/drm/TPMediaDrmProxy$2;->val$lock:Ljava/lang/Object;

    .line 35
    monitor-enter v1

    .line 36
    .line 37
    :try_start_1
    iget-object v2, p0, Lcom/tencent/thumbplayer/tcmedia/core/drm/TPMediaDrmProxy$2;->val$cleanup:[Z

    .line 38
    .line 39
    aget-boolean v2, v2, v0

    .line 40
    .line 41
    iget-object v3, p0, Lcom/tencent/thumbplayer/tcmedia/core/drm/TPMediaDrmProxy$2;->val$lock:Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/Object;->notify()V

    .line 45
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    .line 47
    if-eqz v2, :cond_0

    .line 48
    .line 49
    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/core/drm/TPMediaDrmProxy$2;->val$mediaDrmProxies:[Lcom/tencent/thumbplayer/tcmedia/core/drm/TPMediaDrmProxy;

    .line 50
    .line 51
    aget-object v0, v1, v0

    .line 52
    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/core/drm/TPMediaDrmProxy;->release()V

    .line 57
    :cond_0
    return-void

    .line 58
    :catchall_0
    move-exception v0

    .line 59
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 60
    throw v0
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
.end method
