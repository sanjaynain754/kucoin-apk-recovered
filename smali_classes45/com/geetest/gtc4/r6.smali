.class public final Lcom/geetest/gtc4/r6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[B

.field public final b:Z

.field public final c:I

.field public final d:[B


# direct methods
.method public constructor <init>(Lcom/geetest/gtc4/w;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    instance-of v0, p1, Lcom/geetest/gtc4/z;

    if-eqz v0, :cond_4

    .line 3
    check-cast p1, Lcom/geetest/gtc4/z;

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0}, Lcom/geetest/gtc4/z;->a(I)Lcom/geetest/gtc4/f;

    move-result-object v1

    invoke-static {v1}, Lcom/geetest/gtc4/q0;->a(Lcom/geetest/gtc4/f;)[B

    move-result-object v1

    iput-object v1, p0, Lcom/geetest/gtc4/r6;->a:[B

    const/4 v1, 0x1

    .line 5
    invoke-virtual {p1, v1}, Lcom/geetest/gtc4/z;->a(I)Lcom/geetest/gtc4/f;

    move-result-object v2

    .line 6
    instance-of v3, v2, Lcom/geetest/gtc4/e;

    if-eqz v3, :cond_3

    .line 7
    check-cast v2, Lcom/geetest/gtc4/e;

    .line 8
    sget-object v3, Lcom/geetest/gtc4/e;->c:Lcom/geetest/gtc4/e;

    invoke-virtual {v2, v3}, Lcom/geetest/gtc4/w;->b(Lcom/geetest/gtc4/w;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v0, v1

    goto :goto_0

    .line 9
    :cond_0
    sget-object v1, Lcom/geetest/gtc4/e;->b:Lcom/geetest/gtc4/e;

    invoke-virtual {v2, v1}, Lcom/geetest/gtc4/w;->b(Lcom/geetest/gtc4/w;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 10
    :goto_0
    iput-boolean v0, p0, Lcom/geetest/gtc4/r6;->b:Z

    const/4 v0, 0x2

    .line 11
    invoke-virtual {p1, v0}, Lcom/geetest/gtc4/z;->a(I)Lcom/geetest/gtc4/f;

    move-result-object v0

    invoke-static {v0}, Lcom/geetest/gtc4/q0;->b(Lcom/geetest/gtc4/f;)I

    move-result v0

    iput v0, p0, Lcom/geetest/gtc4/r6;->c:I

    .line 12
    invoke-virtual {p1}, Lcom/geetest/gtc4/z;->k()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/geetest/gtc4/r6;->d:[B

    return-void

    .line 13
    :cond_1
    invoke-virtual {p1, v1}, Lcom/geetest/gtc4/z;->a(I)Lcom/geetest/gtc4/f;

    move-result-object p1

    invoke-static {p1}, Lcom/geetest/gtc4/q0;->a(Lcom/geetest/gtc4/f;)[B

    move-result-object p1

    iput-object p1, p0, Lcom/geetest/gtc4/r6;->d:[B

    return-void

    .line 14
    :cond_2
    new-instance p1, Ljava/security/cert/CertificateParsingException;

    const-string v0, "DER-encoded boolean values must contain either 0x00 or 0xFF"

    invoke-direct {p1, v0}, Ljava/security/cert/CertificateParsingException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 15
    :cond_3
    new-instance p1, Ljava/security/cert/CertificateParsingException;

    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Expected boolean, found "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/cert/CertificateParsingException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 17
    :cond_4
    new-instance v0, Ljava/security/cert/CertificateParsingException;

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Expected sequence for root of trust, found "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/cert/CertificateParsingException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>([BZI[B)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/geetest/gtc4/r6;->a:[B

    .line 21
    iput-boolean p2, p0, Lcom/geetest/gtc4/r6;->b:Z

    .line 22
    iput p3, p0, Lcom/geetest/gtc4/r6;->c:I

    .line 23
    iput-object p4, p0, Lcom/geetest/gtc4/r6;->d:[B

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    const-string v1, "Verified boot Key: "

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    iget-object v1, p0, Lcom/geetest/gtc4/r6;->a:[B

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v1, " (base64)\nDevice locked: "

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    iget-boolean v1, p0, Lcom/geetest/gtc4/r6;->b:Z

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v1, "\nVerified boot state: "

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    iget v1, p0, Lcom/geetest/gtc4/r6;->c:I

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    const/4 v3, 0x1

    .line 38
    .line 39
    if-eq v1, v3, :cond_2

    .line 40
    const/4 v3, 0x2

    .line 41
    .line 42
    if-eq v1, v3, :cond_1

    .line 43
    const/4 v3, 0x3

    .line 44
    .line 45
    if-eq v1, v3, :cond_0

    .line 46
    .line 47
    new-instance v3, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v4, "Unknown ("

    .line 50
    .line 51
    .line 52
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v1, ")"

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    move-result-object v1

    .line 65
    goto :goto_0

    .line 66
    .line 67
    :cond_0
    const-string v1, "Failed"

    .line 68
    goto :goto_0

    .line 69
    .line 70
    :cond_1
    const-string v1, "Unverified"

    .line 71
    goto :goto_0

    .line 72
    .line 73
    :cond_2
    const-string v1, "Self-signed"

    .line 74
    goto :goto_0

    .line 75
    .line 76
    :cond_3
    const-string v1, "Verified"

    .line 77
    .line 78
    .line 79
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    const/16 v1, 0xa

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    iget-object v1, p0, Lcom/geetest/gtc4/r6;->d:[B

    .line 87
    .line 88
    if-eqz v1, :cond_4

    .line 89
    .line 90
    const-string v1, "Verified boot hash: "

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    iget-object v1, p0, Lcom/geetest/gtc4/r6;->d:[B

    .line 96
    .line 97
    .line 98
    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 99
    move-result-object v1

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    const-string v1, " (base64)"

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    move-result-object v0

    .line 112
    return-object v0
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
.end method
