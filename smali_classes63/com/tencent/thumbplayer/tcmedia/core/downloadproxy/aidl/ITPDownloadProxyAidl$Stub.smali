.class public abstract Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl$Stub;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Stub"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl$Stub$Proxy;
    }
.end annotation


# static fields
.field private static final DESCRIPTOR:Ljava/lang/String; = "com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl"

.field static final TRANSACTION_checkResourceExist:I = 0x19

.field static final TRANSACTION_checkResourceStatus:I = 0x11

.field static final TRANSACTION_clearCache:I = 0x18

.field static final TRANSACTION_deleteOfflineLicenseKeySetId:I = 0x1c

.field static final TRANSACTION_getClipPlayUrl:I = 0x6

.field static final TRANSACTION_getNativeInfo:I = 0x10

.field static final TRANSACTION_getOfflineLicenseKeySetId:I = 0x1b

.field static final TRANSACTION_getPlayErrorCodeStr:I = 0x7

.field static final TRANSACTION_getPlayUrl:I = 0x5

.field static final TRANSACTION_getResourceDownloadProgress:I = 0x1a

.field static final TRANSACTION_getResourceSize:I = 0x12

.field static final TRANSACTION_init:I = 0x1

.field static final TRANSACTION_pauseDownload:I = 0x9

.field static final TRANSACTION_pushEvent:I = 0x13

.field static final TRANSACTION_removeStorageCache:I = 0x17

.field static final TRANSACTION_resumeDownload:I = 0xa

.field static final TRANSACTION_setClipInfo:I = 0x4

.field static final TRANSACTION_setMaxStorageSizeMB:I = 0x15

.field static final TRANSACTION_setPlayState:I = 0x14

.field static final TRANSACTION_setUserData:I = 0xf

.field static final TRANSACTION_startClipPlay:I = 0x3

.field static final TRANSACTION_startClipPreload:I = 0xc

.field static final TRANSACTION_startPlay:I = 0x2

.field static final TRANSACTION_startPreload:I = 0xb

.field static final TRANSACTION_startTask:I = 0xe

.field static final TRANSACTION_stopPlay:I = 0x8

.field static final TRANSACTION_stopPreload:I = 0xd

.field static final TRANSACTION_updateTaskInfo:I = 0x16


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 4
    .line 5
    const-string v0, "com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl"

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 9
    return-void
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

.method public static asInterface(Landroid/os/IBinder;)Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl;
    .locals 2

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    .line 6
    :cond_0
    const-string v0, "com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl"

    .line 7
    .line 8
    .line 9
    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    instance-of v1, v0, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    check-cast v0, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl;

    .line 19
    return-object v0

    .line 20
    .line 21
    :cond_1
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl$Stub$Proxy;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl$Stub$Proxy;-><init>(Landroid/os/IBinder;)V

    .line 25
    return-object v0
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
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    .line 1
    return-object p0
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
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const v0, 0x5f4e5446

    .line 4
    const/4 v1, 0x1

    .line 5
    .line 6
    const-string v2, "com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl"

    .line 7
    .line 8
    if-eq p1, v0, :cond_3

    .line 9
    const/4 v0, 0x0

    .line 10
    .line 11
    .line 12
    packed-switch p1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 16
    move-result p1

    .line 17
    return p1

    .line 18
    .line 19
    .line 20
    :pswitch_0
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 28
    move-result-object p4

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 32
    move-result-object p2

    .line 33
    .line 34
    .line 35
    invoke-interface {p0, p1, p4, p2}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl;->deleteOfflineLicenseKeySetId(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    move-result p1

    .line 37
    .line 38
    .line 39
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 43
    return v1

    .line 44
    .line 45
    .line 46
    :pswitch_1
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 50
    move-result-object p1

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 54
    move-result-object p4

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 58
    move-result-object p2

    .line 59
    .line 60
    .line 61
    invoke-interface {p0, p1, p4, p2}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl;->getOfflineLicenseKeySetId(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[B

    .line 62
    move-result-object p1

    .line 63
    .line 64
    .line 65
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeByteArray([B)V

    .line 69
    return v1

    .line 70
    .line 71
    .line 72
    :pswitch_2
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 76
    move-result-object p1

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 80
    move-result-object p4

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 84
    move-result-wide v2

    .line 85
    .line 86
    .line 87
    invoke-interface {p0, p1, p4, v2, v3}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl;->getResourceDownloadProgress(Ljava/lang/String;Ljava/lang/String;J)F

    .line 88
    move-result p1

    .line 89
    .line 90
    .line 91
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeFloat(F)V

    .line 95
    return v1

    .line 96
    .line 97
    .line 98
    :pswitch_3
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 102
    move-result-object p1

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 106
    move-result-object p4

    .line 107
    .line 108
    .line 109
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 110
    move-result-wide v2

    .line 111
    .line 112
    .line 113
    invoke-interface {p0, p1, p4, v2, v3}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl;->checkResourceExist(Ljava/lang/String;Ljava/lang/String;J)Z

    .line 114
    move-result p1

    .line 115
    .line 116
    .line 117
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 121
    return v1

    .line 122
    .line 123
    .line 124
    :pswitch_4
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 128
    move-result-object v3

    .line 129
    .line 130
    .line 131
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 132
    move-result-object v4

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 136
    move-result v5

    .line 137
    .line 138
    .line 139
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 140
    move-result-wide v6

    .line 141
    move-object v2, p0

    .line 142
    .line 143
    .line 144
    invoke-interface/range {v2 .. v7}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl;->clearCache(Ljava/lang/String;Ljava/lang/String;IJ)I

    .line 145
    move-result p1

    .line 146
    move-object p4, v2

    .line 147
    .line 148
    .line 149
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 153
    return v1

    .line 154
    :pswitch_5
    move-object p4, p0

    .line 155
    .line 156
    .line 157
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 161
    move-result-object p1

    .line 162
    .line 163
    .line 164
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 165
    move-result-wide v2

    .line 166
    .line 167
    .line 168
    invoke-interface {p0, p1, v2, v3}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl;->removeStorageCache(Ljava/lang/String;J)I

    .line 169
    move-result p1

    .line 170
    .line 171
    .line 172
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 176
    return v1

    .line 177
    :pswitch_6
    move-object p4, p0

    .line 178
    .line 179
    .line 180
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 184
    move-result p1

    .line 185
    .line 186
    .line 187
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    move-result-object v0

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 192
    move-result-object v0

    .line 193
    .line 194
    .line 195
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->readHashMap(Ljava/lang/ClassLoader;)Ljava/util/HashMap;

    .line 196
    move-result-object p2

    .line 197
    .line 198
    .line 199
    invoke-interface {p0, p1, p2}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl;->updateTaskInfo(ILjava/util/Map;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 203
    return v1

    .line 204
    :pswitch_7
    move-object p4, p0

    .line 205
    .line 206
    .line 207
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 211
    move-result-wide p1

    .line 212
    .line 213
    .line 214
    invoke-interface {p0, p1, p2}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl;->setMaxStorageSizeMB(J)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 218
    return v1

    .line 219
    :pswitch_8
    move-object p4, p0

    .line 220
    .line 221
    .line 222
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 226
    move-result p1

    .line 227
    .line 228
    .line 229
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 230
    move-result p2

    .line 231
    .line 232
    .line 233
    invoke-interface {p0, p1, p2}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl;->setPlayState(II)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 237
    return v1

    .line 238
    :pswitch_9
    move-object p4, p0

    .line 239
    .line 240
    .line 241
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 245
    move-result p1

    .line 246
    .line 247
    .line 248
    invoke-interface {p0, p1}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl;->pushEvent(I)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 252
    return v1

    .line 253
    :pswitch_a
    move-object p4, p0

    .line 254
    .line 255
    .line 256
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 260
    move-result-object p1

    .line 261
    .line 262
    .line 263
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 264
    move-result-object p2

    .line 265
    .line 266
    .line 267
    invoke-interface {p0, p1, p2}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl;->getResourceSize(Ljava/lang/String;Ljava/lang/String;)J

    .line 268
    move-result-wide p1

    .line 269
    .line 270
    .line 271
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 272
    .line 273
    .line 274
    invoke-virtual {p3, p1, p2}, Landroid/os/Parcel;->writeLong(J)V

    .line 275
    return v1

    .line 276
    :pswitch_b
    move-object p4, p0

    .line 277
    .line 278
    .line 279
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 283
    move-result-object p1

    .line 284
    .line 285
    .line 286
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 287
    move-result-object v0

    .line 288
    .line 289
    .line 290
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 291
    move-result p2

    .line 292
    .line 293
    .line 294
    invoke-interface {p0, p1, v0, p2}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl;->checkResourceStatus(Ljava/lang/String;Ljava/lang/String;I)I

    .line 295
    move-result p1

    .line 296
    .line 297
    .line 298
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 299
    .line 300
    .line 301
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 302
    return v1

    .line 303
    :pswitch_c
    move-object p4, p0

    .line 304
    .line 305
    .line 306
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 310
    move-result p1

    .line 311
    .line 312
    .line 313
    invoke-interface {p0, p1}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl;->getNativeInfo(I)Ljava/lang/String;

    .line 314
    move-result-object p1

    .line 315
    .line 316
    .line 317
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 318
    .line 319
    .line 320
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 321
    return v1

    .line 322
    :pswitch_d
    move-object p4, p0

    .line 323
    .line 324
    .line 325
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    move-result-object p1

    .line 330
    .line 331
    .line 332
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 333
    move-result-object p1

    .line 334
    .line 335
    .line 336
    invoke-virtual {p2, p1}, Landroid/os/Parcel;->readHashMap(Ljava/lang/ClassLoader;)Ljava/util/HashMap;

    .line 337
    move-result-object p1

    .line 338
    .line 339
    .line 340
    invoke-interface {p0, p1}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl;->setUserData(Ljava/util/Map;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 344
    return v1

    .line 345
    :pswitch_e
    move-object p4, p0

    .line 346
    .line 347
    .line 348
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 352
    move-result p1

    .line 353
    .line 354
    .line 355
    invoke-interface {p0, p1}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl;->startTask(I)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 359
    return v1

    .line 360
    :pswitch_f
    move-object p4, p0

    .line 361
    .line 362
    .line 363
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 367
    move-result p1

    .line 368
    .line 369
    .line 370
    invoke-interface {p0, p1}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl;->stopPreload(I)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 374
    return v1

    .line 375
    :pswitch_10
    move-object p4, p0

    .line 376
    .line 377
    .line 378
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 382
    move-result-object p1

    .line 383
    .line 384
    .line 385
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 386
    move-result v0

    .line 387
    .line 388
    .line 389
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 390
    move-result-object p2

    .line 391
    .line 392
    .line 393
    invoke-static {p2}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPPreLoadListenerAidl$Stub;->asInterface(Landroid/os/IBinder;)Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPPreLoadListenerAidl;

    .line 394
    move-result-object p2

    .line 395
    .line 396
    .line 397
    invoke-interface {p0, p1, v0, p2}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl;->startClipPreload(Ljava/lang/String;ILcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPPreLoadListenerAidl;)I

    .line 398
    move-result p1

    .line 399
    .line 400
    .line 401
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 402
    .line 403
    .line 404
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 405
    return v1

    .line 406
    :pswitch_11
    move-object p4, p0

    .line 407
    .line 408
    .line 409
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 413
    move-result-object p1

    .line 414
    .line 415
    .line 416
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 417
    move-result v2

    .line 418
    .line 419
    if-eqz v2, :cond_0

    .line 420
    .line 421
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/TPDownloadParamAidl;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 422
    .line 423
    .line 424
    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 425
    move-result-object v0

    .line 426
    .line 427
    check-cast v0, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/TPDownloadParamAidl;

    .line 428
    .line 429
    .line 430
    :cond_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 431
    move-result-object p2

    .line 432
    .line 433
    .line 434
    invoke-static {p2}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPPreLoadListenerAidl$Stub;->asInterface(Landroid/os/IBinder;)Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPPreLoadListenerAidl;

    .line 435
    move-result-object p2

    .line 436
    .line 437
    .line 438
    invoke-interface {p0, p1, v0, p2}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl;->startPreload(Ljava/lang/String;Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/TPDownloadParamAidl;Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPPreLoadListenerAidl;)I

    .line 439
    move-result p1

    .line 440
    .line 441
    .line 442
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 443
    .line 444
    .line 445
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 446
    return v1

    .line 447
    :pswitch_12
    move-object p4, p0

    .line 448
    .line 449
    .line 450
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 454
    move-result p1

    .line 455
    .line 456
    .line 457
    invoke-interface {p0, p1}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl;->resumeDownload(I)I

    .line 458
    move-result p1

    .line 459
    .line 460
    .line 461
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 462
    .line 463
    .line 464
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 465
    return v1

    .line 466
    :pswitch_13
    move-object p4, p0

    .line 467
    .line 468
    .line 469
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 473
    move-result p1

    .line 474
    .line 475
    .line 476
    invoke-interface {p0, p1}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl;->pauseDownload(I)I

    .line 477
    move-result p1

    .line 478
    .line 479
    .line 480
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 481
    .line 482
    .line 483
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 484
    return v1

    .line 485
    :pswitch_14
    move-object p4, p0

    .line 486
    .line 487
    .line 488
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 489
    .line 490
    .line 491
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 492
    move-result p1

    .line 493
    .line 494
    .line 495
    invoke-interface {p0, p1}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl;->stopPlay(I)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 499
    return v1

    .line 500
    :pswitch_15
    move-object p4, p0

    .line 501
    .line 502
    .line 503
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 507
    move-result p1

    .line 508
    .line 509
    .line 510
    invoke-interface {p0, p1}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl;->getPlayErrorCodeStr(I)Ljava/lang/String;

    .line 511
    move-result-object p1

    .line 512
    .line 513
    .line 514
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 515
    .line 516
    .line 517
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 518
    return v1

    .line 519
    :pswitch_16
    move-object p4, p0

    .line 520
    .line 521
    .line 522
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 526
    move-result p1

    .line 527
    .line 528
    .line 529
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 530
    move-result v0

    .line 531
    .line 532
    .line 533
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 534
    move-result p2

    .line 535
    .line 536
    .line 537
    invoke-interface {p0, p1, v0, p2}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl;->getClipPlayUrl(III)Ljava/lang/String;

    .line 538
    move-result-object p1

    .line 539
    .line 540
    .line 541
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 542
    .line 543
    .line 544
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 545
    return v1

    .line 546
    :pswitch_17
    move-object p4, p0

    .line 547
    .line 548
    .line 549
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 550
    .line 551
    .line 552
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 553
    move-result p1

    .line 554
    .line 555
    .line 556
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 557
    move-result p2

    .line 558
    .line 559
    .line 560
    invoke-interface {p0, p1, p2}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl;->getPlayUrl(II)Ljava/lang/String;

    .line 561
    move-result-object p1

    .line 562
    .line 563
    .line 564
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 565
    .line 566
    .line 567
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 568
    return v1

    .line 569
    :pswitch_18
    move-object p4, p0

    .line 570
    .line 571
    .line 572
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 573
    .line 574
    .line 575
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 576
    move-result p1

    .line 577
    .line 578
    .line 579
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 580
    move-result v2

    .line 581
    .line 582
    .line 583
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 584
    move-result-object v3

    .line 585
    .line 586
    .line 587
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 588
    move-result v4

    .line 589
    .line 590
    if-eqz v4, :cond_1

    .line 591
    .line 592
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/TPDownloadParamAidl;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 593
    .line 594
    .line 595
    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 596
    move-result-object p2

    .line 597
    move-object v0, p2

    .line 598
    .line 599
    check-cast v0, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/TPDownloadParamAidl;

    .line 600
    .line 601
    .line 602
    :cond_1
    invoke-interface {p0, p1, v2, v3, v0}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl;->setClipInfo(IILjava/lang/String;Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/TPDownloadParamAidl;)Z

    .line 603
    move-result p1

    .line 604
    .line 605
    .line 606
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 607
    .line 608
    .line 609
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 610
    return v1

    .line 611
    :pswitch_19
    move-object p4, p0

    .line 612
    .line 613
    .line 614
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 615
    .line 616
    .line 617
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 618
    move-result-object p1

    .line 619
    .line 620
    .line 621
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 622
    move-result v0

    .line 623
    .line 624
    .line 625
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 626
    move-result-object p2

    .line 627
    .line 628
    .line 629
    invoke-static {p2}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPPlayListenerAidl$Stub;->asInterface(Landroid/os/IBinder;)Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPPlayListenerAidl;

    .line 630
    move-result-object p2

    .line 631
    .line 632
    .line 633
    invoke-interface {p0, p1, v0, p2}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl;->startClipPlay(Ljava/lang/String;ILcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPPlayListenerAidl;)I

    .line 634
    move-result p1

    .line 635
    .line 636
    .line 637
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 638
    .line 639
    .line 640
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 641
    return v1

    .line 642
    :pswitch_1a
    move-object p4, p0

    .line 643
    .line 644
    .line 645
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 646
    .line 647
    .line 648
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 649
    move-result-object p1

    .line 650
    .line 651
    .line 652
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 653
    move-result v2

    .line 654
    .line 655
    if-eqz v2, :cond_2

    .line 656
    .line 657
    sget-object v0, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/TPDownloadParamAidl;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 658
    .line 659
    .line 660
    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 661
    move-result-object v0

    .line 662
    .line 663
    check-cast v0, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/TPDownloadParamAidl;

    .line 664
    .line 665
    .line 666
    :cond_2
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 667
    move-result-object p2

    .line 668
    .line 669
    .line 670
    invoke-static {p2}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPPlayListenerAidl$Stub;->asInterface(Landroid/os/IBinder;)Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPPlayListenerAidl;

    .line 671
    move-result-object p2

    .line 672
    .line 673
    .line 674
    invoke-interface {p0, p1, v0, p2}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl;->startPlay(Ljava/lang/String;Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/TPDownloadParamAidl;Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPPlayListenerAidl;)I

    .line 675
    move-result p1

    .line 676
    .line 677
    .line 678
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 679
    .line 680
    .line 681
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 682
    return v1

    .line 683
    :pswitch_1b
    move-object p4, p0

    .line 684
    .line 685
    .line 686
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 687
    .line 688
    .line 689
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 690
    move-result-object p1

    .line 691
    .line 692
    .line 693
    invoke-interface {p0, p1}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/aidl/ITPDownloadProxyAidl;->init(Ljava/lang/String;)I

    .line 694
    move-result p1

    .line 695
    .line 696
    .line 697
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 698
    .line 699
    .line 700
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 701
    return v1

    .line 702
    :cond_3
    move-object p4, p0

    .line 703
    .line 704
    .line 705
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 706
    return v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
