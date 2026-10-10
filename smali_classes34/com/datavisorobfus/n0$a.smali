.class Lcom/datavisorobfus/n0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/datavisorobfus/m0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/datavisorobfus/n0;->a(Lcom/datavisorobfus/b0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/datavisorobfus/n0;


# direct methods
.method public constructor <init>(Lcom/datavisorobfus/n0;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/datavisorobfus/n0$a;->a:Lcom/datavisorobfus/n0;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    return-void
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


# virtual methods
.method public a(Landroid/os/IBinder;)Ljava/lang/String;
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/datavisorobfus/n0$a;->a:Lcom/datavisorobfus/n0;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/datavisorobfus/n0;->a(Lcom/datavisorobfus/n0;)Landroid/content/Context;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/datavisorobfus/n0$a;->a:Lcom/datavisorobfus/n0;

    .line 13
    .line 14
    .line 15
    invoke-static {v1}, Lcom/datavisorobfus/n0;->b(Lcom/datavisorobfus/n0;)Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    :try_start_0
    iget-object v1, p0, Lcom/datavisorobfus/n0$a;->a:Lcom/datavisorobfus/n0;

    .line 21
    .line 22
    .line 23
    invoke-static {v1}, Lcom/datavisorobfus/n0;->a(Lcom/datavisorobfus/n0;)Landroid/content/Context;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    const/16 v2, 0x40

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 37
    const/4 v2, 0x0

    .line 38
    .line 39
    aget-object v1, v1, v2

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 43
    move-result-object v1

    .line 44
    .line 45
    const-string v3, "SHA1"

    .line 46
    .line 47
    .line 48
    invoke-static {v3}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 49
    move-result-object v3

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3, v1}, Ljava/security/MessageDigest;->digest([B)[B

    .line 53
    move-result-object v1

    .line 54
    .line 55
    new-instance v3, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    array-length v4, v1

    .line 60
    .line 61
    :goto_0
    if-ge v2, v4, :cond_0

    .line 62
    .line 63
    aget-byte v5, v1, v2

    .line 64
    .line 65
    and-int/lit16 v5, v5, 0xff

    .line 66
    .line 67
    or-int/lit16 v5, v5, 0x100

    .line 68
    .line 69
    .line 70
    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 71
    move-result-object v5

    .line 72
    const/4 v6, 0x3

    .line 73
    const/4 v7, 0x1

    .line 74
    .line 75
    .line 76
    invoke-virtual {v5, v7, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 77
    move-result-object v5

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    add-int/lit8 v2, v2, 0x1

    .line 83
    goto :goto_0

    .line 84
    :catchall_0
    move-exception v1

    .line 85
    goto :goto_1

    .line 86
    .line 87
    :cond_0
    iget-object v1, p0, Lcom/datavisorobfus/n0$a;->a:Lcom/datavisorobfus/n0;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    move-result-object v2

    .line 92
    .line 93
    .line 94
    invoke-static {v1, v2}, Lcom/datavisorobfus/n0;->a(Lcom/datavisorobfus/n0;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    goto :goto_2

    .line 96
    .line 97
    .line 98
    :goto_1
    invoke-static {v1}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    .line 99
    .line 100
    :cond_1
    :goto_2
    iget-object v1, p0, Lcom/datavisorobfus/n0$a;->a:Lcom/datavisorobfus/n0;

    .line 101
    .line 102
    .line 103
    invoke-static {v1}, Lcom/datavisorobfus/n0;->b(Lcom/datavisorobfus/n0;)Ljava/lang/String;

    .line 104
    move-result-object v1

    .line 105
    .line 106
    if-eqz v1, :cond_2

    .line 107
    .line 108
    iget-object v1, p0, Lcom/datavisorobfus/n0$a;->a:Lcom/datavisorobfus/n0;

    .line 109
    .line 110
    .line 111
    invoke-static {v1}, Lcom/datavisorobfus/n0;->b(Lcom/datavisorobfus/n0;)Ljava/lang/String;

    .line 112
    move-result-object v2

    .line 113
    .line 114
    .line 115
    invoke-static {v1, p1, v0, v2}, Lcom/datavisorobfus/n0;->a(Lcom/datavisorobfus/n0;Landroid/os/IBinder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 116
    move-result-object p1

    .line 117
    return-object p1

    .line 118
    .line 119
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    .line 120
    .line 121
    .line 122
    const-string/jumbo v0, "sign is empty"

    .line 123
    .line 124
    .line 125
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 126
    throw p1
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
