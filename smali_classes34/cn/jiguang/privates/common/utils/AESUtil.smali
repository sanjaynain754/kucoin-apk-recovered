.class public Lcn/jiguang/privates/common/utils/AESUtil;
.super Ljava/lang/Object;
.source "AESUtil.java"


# direct methods
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
.end method

.method private static aes_cbc([BLjava/lang/String;Ljava/lang/String;I)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "UTF-8"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lcn/jiguang/privates/common/utils/AESUtil;->generateKeyBytes(Ljava/lang/String;Ljava/lang/String;)[B

    .line 6
    move-result-object p1

    .line 7
    .line 8
    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    .line 9
    .line 10
    const-string v2, "AES"

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p1, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 17
    move-result-object p1

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lcn/jiguang/privates/common/utils/AESUtil;->reflectGetIv([B)Ljavax/crypto/spec/IvParameterSpec;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    const-string p2, "AES/CBC/PKCS7Padding"

    .line 24
    .line 25
    .line 26
    invoke-static {p2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 27
    move-result-object p2

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, p3, v1, p1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    .line 34
    move-result-object p0

    .line 35
    return-object p0
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
.end method

.method private static aes_gcm([BLjava/lang/String;I)[B
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "UTF-8"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lcn/jiguang/privates/common/utils/AESUtil;->generateKeyBytes(Ljava/lang/String;Ljava/lang/String;)[B

    .line 6
    move-result-object p1

    .line 7
    .line 8
    const-string v0, "AES/GCM/NoPadding"

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    .line 15
    .line 16
    const-string v2, "AES"

    .line 17
    .line 18
    .line 19
    invoke-direct {v1, p1, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 20
    .line 21
    new-instance v2, Ljavax/crypto/spec/GCMParameterSpec;

    .line 22
    .line 23
    const/16 v3, 0x80

    .line 24
    .line 25
    .line 26
    invoke-direct {v2, v3, p1}, Ljavax/crypto/spec/GCMParameterSpec;-><init>(I[B)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p2, v1, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    .line 33
    move-result-object p0

    .line 34
    return-object p0
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
.end method

.method public static decryptBytes([BLjava/lang/String;)[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const/4 v0, 0x2

    .line 1
    invoke-static {p0, p1, v0}, Lcn/jiguang/privates/common/utils/AESUtil;->aes_gcm([BLjava/lang/String;I)[B

    move-result-object p0

    return-object p0
.end method

.method public static decryptBytes([BLjava/lang/String;Ljava/lang/String;)[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const/4 v0, 0x2

    .line 2
    invoke-static {p0, p1, p2, v0}, Lcn/jiguang/privates/common/utils/AESUtil;->aes_cbc([BLjava/lang/String;Ljava/lang/String;I)[B

    move-result-object p0

    return-object p0
.end method

.method public static encryptBytes([BLjava/lang/String;)[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-static {p0, p1, v0}, Lcn/jiguang/privates/common/utils/AESUtil;->aes_gcm([BLjava/lang/String;I)[B

    move-result-object p0

    return-object p0
.end method

.method public static encryptBytes([BLjava/lang/String;Ljava/lang/String;)[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const/4 v0, 0x1

    .line 2
    invoke-static {p0, p1, p2, v0}, Lcn/jiguang/privates/common/utils/AESUtil;->aes_cbc([BLjava/lang/String;Ljava/lang/String;I)[B

    move-result-object p0

    return-object p0
.end method

.method private static generateKeyBytes(Ljava/lang/String;Ljava/lang/String;)[B
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    move-result v0

    .line 5
    .line 6
    new-array v0, v0, [B

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 10
    move-result v1

    .line 11
    .line 12
    div-int/lit8 v1, v1, 0x2

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 25
    move-result v3

    .line 26
    .line 27
    div-int/lit8 v3, v3, 0x2

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 31
    move-result-object p0

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 35
    move-result-object p0

    .line 36
    array-length p1, v1

    .line 37
    .line 38
    .line 39
    invoke-static {v1, v2, v0, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 40
    array-length p1, v1

    .line 41
    array-length v1, p0

    .line 42
    .line 43
    .line 44
    invoke-static {p0, v2, v0, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 45
    return-object v0
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
.end method

.method public static generateSeed()I
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/security/SecureRandom;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    .line 9
    move-result v0

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 13
    move-result v0

    .line 14
    .line 15
    .line 16
    const v1, 0xffffff

    .line 17
    and-int/2addr v0, v1

    .line 18
    return v0
.end method

.method public static get16Md5AesKey(J)Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    const-wide/16 v0, 0xa

    .line 3
    .line 4
    rem-long v0, p0, v0

    .line 5
    long-to-int v0, v0

    .line 6
    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    const-wide/16 v0, 0x8

    .line 11
    mul-long/2addr v0, p0

    .line 12
    .line 13
    const-wide/16 v2, 0x4a

    .line 14
    rem-long/2addr p0, v2

    .line 15
    :goto_0
    add-long/2addr v0, p0

    .line 16
    goto :goto_1

    .line 17
    .line 18
    :pswitch_0
    const-wide/16 v0, 0x25

    .line 19
    mul-long/2addr v0, p0

    .line 20
    .line 21
    const-wide/16 v2, 0x5b

    .line 22
    rem-long/2addr p0, v2

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :pswitch_1
    const-wide/16 v0, 0x1d

    .line 26
    mul-long/2addr v0, p0

    .line 27
    .line 28
    const-wide/16 v2, 0x29

    .line 29
    rem-long/2addr p0, v2

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :pswitch_2
    const-wide/16 v0, 0x1f

    .line 33
    mul-long/2addr v0, p0

    .line 34
    .line 35
    const-wide/16 v2, 0x27

    .line 36
    rem-long/2addr p0, v2

    .line 37
    goto :goto_0

    .line 38
    .line 39
    :pswitch_3
    const-wide/16 v0, 0x7

    .line 40
    mul-long/2addr v0, p0

    .line 41
    .line 42
    const-wide/16 v2, 0x44

    .line 43
    rem-long/2addr p0, v2

    .line 44
    goto :goto_0

    .line 45
    .line 46
    :pswitch_4
    const-wide/16 v0, 0x11

    .line 47
    mul-long/2addr v0, p0

    .line 48
    .line 49
    const-wide/16 v2, 0x31

    .line 50
    rem-long/2addr p0, v2

    .line 51
    goto :goto_0

    .line 52
    .line 53
    :pswitch_5
    const-wide/16 v0, 0xd

    .line 54
    mul-long/2addr v0, p0

    .line 55
    .line 56
    const-wide/16 v2, 0x60

    .line 57
    rem-long/2addr p0, v2

    .line 58
    goto :goto_0

    .line 59
    .line 60
    :pswitch_6
    const-wide/16 v0, 0x3

    .line 61
    mul-long/2addr v0, p0

    .line 62
    .line 63
    const-wide/16 v2, 0x49

    .line 64
    rem-long/2addr p0, v2

    .line 65
    goto :goto_0

    .line 66
    .line 67
    :pswitch_7
    const-wide/16 v0, 0x17

    .line 68
    mul-long/2addr v0, p0

    .line 69
    .line 70
    const-wide/16 v2, 0xf

    .line 71
    rem-long/2addr p0, v2

    .line 72
    goto :goto_0

    .line 73
    .line 74
    :pswitch_8
    const-wide/16 v0, 0x5

    .line 75
    mul-long/2addr v0, p0

    .line 76
    .line 77
    const-wide/16 v2, 0x58

    .line 78
    rem-long/2addr p0, v2

    .line 79
    goto :goto_0

    .line 80
    .line 81
    :goto_1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    const-string p1, "JCKP"

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    move-result-object p0

    .line 97
    .line 98
    .line 99
    invoke-static {p0}, Lcn/jiguang/privates/common/utils/StringUtil;->get16MD5String(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    move-result-object p0

    .line 101
    return-object p0

    .line 102
    nop

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
    :pswitch_data_0
    .packed-switch 0x1
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

.method public static getMd5AesKey(J)Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    const-wide/16 v0, 0xa

    .line 3
    .line 4
    rem-long v0, p0, v0

    .line 5
    long-to-int v0, v0

    .line 6
    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    const-wide/16 v0, 0x8

    .line 11
    mul-long/2addr v0, p0

    .line 12
    .line 13
    const-wide/16 v2, 0x4a

    .line 14
    rem-long/2addr p0, v2

    .line 15
    :goto_0
    add-long/2addr v0, p0

    .line 16
    goto :goto_1

    .line 17
    .line 18
    :pswitch_0
    const-wide/16 v0, 0x25

    .line 19
    mul-long/2addr v0, p0

    .line 20
    .line 21
    const-wide/16 v2, 0x5b

    .line 22
    rem-long/2addr p0, v2

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :pswitch_1
    const-wide/16 v0, 0x1d

    .line 26
    mul-long/2addr v0, p0

    .line 27
    .line 28
    const-wide/16 v2, 0x29

    .line 29
    rem-long/2addr p0, v2

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :pswitch_2
    const-wide/16 v0, 0x1f

    .line 33
    mul-long/2addr v0, p0

    .line 34
    .line 35
    const-wide/16 v2, 0x27

    .line 36
    rem-long/2addr p0, v2

    .line 37
    goto :goto_0

    .line 38
    .line 39
    :pswitch_3
    const-wide/16 v0, 0x7

    .line 40
    mul-long/2addr v0, p0

    .line 41
    .line 42
    const-wide/16 v2, 0x44

    .line 43
    rem-long/2addr p0, v2

    .line 44
    goto :goto_0

    .line 45
    .line 46
    :pswitch_4
    const-wide/16 v0, 0x11

    .line 47
    mul-long/2addr v0, p0

    .line 48
    .line 49
    const-wide/16 v2, 0x31

    .line 50
    rem-long/2addr p0, v2

    .line 51
    goto :goto_0

    .line 52
    .line 53
    :pswitch_5
    const-wide/16 v0, 0xd

    .line 54
    mul-long/2addr v0, p0

    .line 55
    .line 56
    const-wide/16 v2, 0x60

    .line 57
    rem-long/2addr p0, v2

    .line 58
    goto :goto_0

    .line 59
    .line 60
    :pswitch_6
    const-wide/16 v0, 0x3

    .line 61
    mul-long/2addr v0, p0

    .line 62
    .line 63
    const-wide/16 v2, 0x49

    .line 64
    rem-long/2addr p0, v2

    .line 65
    goto :goto_0

    .line 66
    .line 67
    :pswitch_7
    const-wide/16 v0, 0x17

    .line 68
    mul-long/2addr v0, p0

    .line 69
    .line 70
    const-wide/16 v2, 0xf

    .line 71
    rem-long/2addr p0, v2

    .line 72
    goto :goto_0

    .line 73
    .line 74
    :pswitch_8
    const-wide/16 v0, 0x5

    .line 75
    mul-long/2addr v0, p0

    .line 76
    .line 77
    const-wide/16 v2, 0x58

    .line 78
    rem-long/2addr p0, v2

    .line 79
    goto :goto_0

    .line 80
    .line 81
    :goto_1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    const-string p1, "JCKP"

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    move-result-object p0

    .line 97
    .line 98
    .line 99
    invoke-static {p0}, Lcn/jiguang/privates/common/utils/StringUtil;->get32MD5String(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    move-result-object p0

    .line 101
    return-object p0

    .line 102
    nop

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
    :pswitch_data_0
    .packed-switch 0x1
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

.method private static reflectGetIv([B)Ljavax/crypto/spec/IvParameterSpec;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    .line 2
    const-class v0, [B

    .line 3
    .line 4
    .line 5
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 10
    move-result-object p0

    .line 11
    .line 12
    const-class v1, Ljavax/crypto/spec/IvParameterSpec;

    .line 13
    .line 14
    .line 15
    invoke-static {v1, p0, v0}, Lcn/jiguang/privates/common/utils/ReflectUtil;->invokeConstructor(Ljava/lang/Class;[Ljava/lang/Object;[Ljava/lang/Class;)Ljava/lang/Object;

    .line 16
    move-result-object p0

    .line 17
    .line 18
    check-cast p0, Ljavax/crypto/spec/IvParameterSpec;

    .line 19
    return-object p0
    .line 20
    .line 21
    .line 22
    .line 23
.end method
