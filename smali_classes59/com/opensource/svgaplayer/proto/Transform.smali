.class public final Lcom/opensource/svgaplayer/proto/Transform;
.super Lcom/squareup/wire/Message;
.source "Transform.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/opensource/svgaplayer/proto/Transform$ProtoAdapter_Transform;,
        Lcom/opensource/svgaplayer/proto/Transform$Builder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/wire/Message<",
        "Lcom/opensource/svgaplayer/proto/Transform;",
        "Lcom/opensource/svgaplayer/proto/Transform$Builder;",
        ">;"
    }
.end annotation


# static fields
.field public static final ADAPTER:Lcom/squareup/wire/ProtoAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/wire/ProtoAdapter<",
            "Lcom/opensource/svgaplayer/proto/Transform;",
            ">;"
        }
    .end annotation
.end field

.field public static final DEFAULT_A:Ljava/lang/Float;

.field public static final DEFAULT_B:Ljava/lang/Float;

.field public static final DEFAULT_C:Ljava/lang/Float;

.field public static final DEFAULT_D:Ljava/lang/Float;

.field public static final DEFAULT_TX:Ljava/lang/Float;

.field public static final DEFAULT_TY:Ljava/lang/Float;

.field private static final serialVersionUID:J


# instance fields
.field public final a:Ljava/lang/Float;
    .annotation runtime Lcom/squareup/wire/WireField;
        adapter = "com.squareup.wire.ProtoAdapter#FLOAT"
        tag = 0x1
    .end annotation
.end field

.field public final b:Ljava/lang/Float;
    .annotation runtime Lcom/squareup/wire/WireField;
        adapter = "com.squareup.wire.ProtoAdapter#FLOAT"
        tag = 0x2
    .end annotation
.end field

.field public final c:Ljava/lang/Float;
    .annotation runtime Lcom/squareup/wire/WireField;
        adapter = "com.squareup.wire.ProtoAdapter#FLOAT"
        tag = 0x3
    .end annotation
.end field

.field public final d:Ljava/lang/Float;
    .annotation runtime Lcom/squareup/wire/WireField;
        adapter = "com.squareup.wire.ProtoAdapter#FLOAT"
        tag = 0x4
    .end annotation
.end field

.field public final tx:Ljava/lang/Float;
    .annotation runtime Lcom/squareup/wire/WireField;
        adapter = "com.squareup.wire.ProtoAdapter#FLOAT"
        tag = 0x5
    .end annotation
.end field

.field public final ty:Ljava/lang/Float;
    .annotation runtime Lcom/squareup/wire/WireField;
        adapter = "com.squareup.wire.ProtoAdapter#FLOAT"
        tag = 0x6
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/opensource/svgaplayer/proto/Transform$ProtoAdapter_Transform;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/opensource/svgaplayer/proto/Transform$ProtoAdapter_Transform;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/opensource/svgaplayer/proto/Transform;->ADAPTER:Lcom/squareup/wire/ProtoAdapter;

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    sput-object v0, Lcom/opensource/svgaplayer/proto/Transform;->DEFAULT_A:Ljava/lang/Float;

    .line 15
    .line 16
    sput-object v0, Lcom/opensource/svgaplayer/proto/Transform;->DEFAULT_B:Ljava/lang/Float;

    .line 17
    .line 18
    sput-object v0, Lcom/opensource/svgaplayer/proto/Transform;->DEFAULT_C:Ljava/lang/Float;

    .line 19
    .line 20
    sput-object v0, Lcom/opensource/svgaplayer/proto/Transform;->DEFAULT_D:Ljava/lang/Float;

    .line 21
    .line 22
    sput-object v0, Lcom/opensource/svgaplayer/proto/Transform;->DEFAULT_TX:Ljava/lang/Float;

    .line 23
    .line 24
    sput-object v0, Lcom/opensource/svgaplayer/proto/Transform;->DEFAULT_TY:Ljava/lang/Float;

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
.end method

.method public constructor <init>(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 8

    .line 1
    sget-object v7, Lokio/ByteString;->EMPTY:Lokio/ByteString;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v7}, Lcom/opensource/svgaplayer/proto/Transform;-><init>(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Lokio/ByteString;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Lokio/ByteString;)V
    .locals 1

    .line 2
    sget-object v0, Lcom/opensource/svgaplayer/proto/Transform;->ADAPTER:Lcom/squareup/wire/ProtoAdapter;

    invoke-direct {p0, v0, p7}, Lcom/squareup/wire/Message;-><init>(Lcom/squareup/wire/ProtoAdapter;Lokio/ByteString;)V

    .line 3
    iput-object p1, p0, Lcom/opensource/svgaplayer/proto/Transform;->a:Ljava/lang/Float;

    .line 4
    iput-object p2, p0, Lcom/opensource/svgaplayer/proto/Transform;->b:Ljava/lang/Float;

    .line 5
    iput-object p3, p0, Lcom/opensource/svgaplayer/proto/Transform;->c:Ljava/lang/Float;

    .line 6
    iput-object p4, p0, Lcom/opensource/svgaplayer/proto/Transform;->d:Ljava/lang/Float;

    .line 7
    iput-object p5, p0, Lcom/opensource/svgaplayer/proto/Transform;->tx:Ljava/lang/Float;

    .line 8
    iput-object p6, p0, Lcom/opensource/svgaplayer/proto/Transform;->ty:Ljava/lang/Float;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ne p1, p0, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    :cond_0
    instance-of v1, p1, Lcom/opensource/svgaplayer/proto/Transform;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    return v2

    .line 11
    .line 12
    :cond_1
    check-cast p1, Lcom/opensource/svgaplayer/proto/Transform;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/squareup/wire/Message;->unknownFields()Lokio/ByteString;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/squareup/wire/Message;->unknownFields()Lokio/ByteString;

    .line 20
    move-result-object v3

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v3}, Lokio/ByteString;->equals(Ljava/lang/Object;)Z

    .line 24
    move-result v1

    .line 25
    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    iget-object v1, p0, Lcom/opensource/svgaplayer/proto/Transform;->a:Ljava/lang/Float;

    .line 29
    .line 30
    iget-object v3, p1, Lcom/opensource/svgaplayer/proto/Transform;->a:Ljava/lang/Float;

    .line 31
    .line 32
    .line 33
    invoke-static {v1, v3}, Lcom/squareup/wire/internal/Internal;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    move-result v1

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    iget-object v1, p0, Lcom/opensource/svgaplayer/proto/Transform;->b:Ljava/lang/Float;

    .line 39
    .line 40
    iget-object v3, p1, Lcom/opensource/svgaplayer/proto/Transform;->b:Ljava/lang/Float;

    .line 41
    .line 42
    .line 43
    invoke-static {v1, v3}, Lcom/squareup/wire/internal/Internal;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    move-result v1

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    iget-object v1, p0, Lcom/opensource/svgaplayer/proto/Transform;->c:Ljava/lang/Float;

    .line 49
    .line 50
    iget-object v3, p1, Lcom/opensource/svgaplayer/proto/Transform;->c:Ljava/lang/Float;

    .line 51
    .line 52
    .line 53
    invoke-static {v1, v3}, Lcom/squareup/wire/internal/Internal;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    move-result v1

    .line 55
    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    iget-object v1, p0, Lcom/opensource/svgaplayer/proto/Transform;->d:Ljava/lang/Float;

    .line 59
    .line 60
    iget-object v3, p1, Lcom/opensource/svgaplayer/proto/Transform;->d:Ljava/lang/Float;

    .line 61
    .line 62
    .line 63
    invoke-static {v1, v3}, Lcom/squareup/wire/internal/Internal;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    move-result v1

    .line 65
    .line 66
    if-eqz v1, :cond_2

    .line 67
    .line 68
    iget-object v1, p0, Lcom/opensource/svgaplayer/proto/Transform;->tx:Ljava/lang/Float;

    .line 69
    .line 70
    iget-object v3, p1, Lcom/opensource/svgaplayer/proto/Transform;->tx:Ljava/lang/Float;

    .line 71
    .line 72
    .line 73
    invoke-static {v1, v3}, Lcom/squareup/wire/internal/Internal;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    move-result v1

    .line 75
    .line 76
    if-eqz v1, :cond_2

    .line 77
    .line 78
    iget-object v1, p0, Lcom/opensource/svgaplayer/proto/Transform;->ty:Ljava/lang/Float;

    .line 79
    .line 80
    iget-object p1, p1, Lcom/opensource/svgaplayer/proto/Transform;->ty:Ljava/lang/Float;

    .line 81
    .line 82
    .line 83
    invoke-static {v1, p1}, Lcom/squareup/wire/internal/Internal;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    move-result p1

    .line 85
    .line 86
    if-eqz p1, :cond_2

    .line 87
    return v0

    .line 88
    :cond_2
    return v2
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
.end method

.method public hashCode()I
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Lcom/squareup/wire/Message;->hashCode:I

    .line 3
    .line 4
    if-nez v0, :cond_6

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/squareup/wire/Message;->unknownFields()Lokio/ByteString;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lokio/ByteString;->hashCode()I

    .line 12
    move-result v0

    .line 13
    .line 14
    mul-int/lit8 v0, v0, 0x25

    .line 15
    .line 16
    iget-object v1, p0, Lcom/opensource/svgaplayer/proto/Transform;->a:Ljava/lang/Float;

    .line 17
    const/4 v2, 0x0

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Float;->hashCode()I

    .line 23
    move-result v1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v1, v2

    .line 26
    :goto_0
    add-int/2addr v0, v1

    .line 27
    .line 28
    mul-int/lit8 v0, v0, 0x25

    .line 29
    .line 30
    iget-object v1, p0, Lcom/opensource/svgaplayer/proto/Transform;->b:Ljava/lang/Float;

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Float;->hashCode()I

    .line 36
    move-result v1

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move v1, v2

    .line 39
    :goto_1
    add-int/2addr v0, v1

    .line 40
    .line 41
    mul-int/lit8 v0, v0, 0x25

    .line 42
    .line 43
    iget-object v1, p0, Lcom/opensource/svgaplayer/proto/Transform;->c:Ljava/lang/Float;

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/Float;->hashCode()I

    .line 49
    move-result v1

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    move v1, v2

    .line 52
    :goto_2
    add-int/2addr v0, v1

    .line 53
    .line 54
    mul-int/lit8 v0, v0, 0x25

    .line 55
    .line 56
    iget-object v1, p0, Lcom/opensource/svgaplayer/proto/Transform;->d:Ljava/lang/Float;

    .line 57
    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/Float;->hashCode()I

    .line 62
    move-result v1

    .line 63
    goto :goto_3

    .line 64
    :cond_3
    move v1, v2

    .line 65
    :goto_3
    add-int/2addr v0, v1

    .line 66
    .line 67
    mul-int/lit8 v0, v0, 0x25

    .line 68
    .line 69
    iget-object v1, p0, Lcom/opensource/svgaplayer/proto/Transform;->tx:Ljava/lang/Float;

    .line 70
    .line 71
    if-eqz v1, :cond_4

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/Float;->hashCode()I

    .line 75
    move-result v1

    .line 76
    goto :goto_4

    .line 77
    :cond_4
    move v1, v2

    .line 78
    :goto_4
    add-int/2addr v0, v1

    .line 79
    .line 80
    mul-int/lit8 v0, v0, 0x25

    .line 81
    .line 82
    iget-object v1, p0, Lcom/opensource/svgaplayer/proto/Transform;->ty:Ljava/lang/Float;

    .line 83
    .line 84
    if-eqz v1, :cond_5

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Float;->hashCode()I

    .line 88
    move-result v2

    .line 89
    :cond_5
    add-int/2addr v0, v2

    .line 90
    .line 91
    iput v0, p0, Lcom/squareup/wire/Message;->hashCode:I

    .line 92
    :cond_6
    return v0
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

.method public newBuilder()Lcom/opensource/svgaplayer/proto/Transform$Builder;
    .locals 2

    .line 2
    new-instance v0, Lcom/opensource/svgaplayer/proto/Transform$Builder;

    invoke-direct {v0}, Lcom/opensource/svgaplayer/proto/Transform$Builder;-><init>()V

    .line 3
    iget-object v1, p0, Lcom/opensource/svgaplayer/proto/Transform;->a:Ljava/lang/Float;

    iput-object v1, v0, Lcom/opensource/svgaplayer/proto/Transform$Builder;->a:Ljava/lang/Float;

    .line 4
    iget-object v1, p0, Lcom/opensource/svgaplayer/proto/Transform;->b:Ljava/lang/Float;

    iput-object v1, v0, Lcom/opensource/svgaplayer/proto/Transform$Builder;->b:Ljava/lang/Float;

    .line 5
    iget-object v1, p0, Lcom/opensource/svgaplayer/proto/Transform;->c:Ljava/lang/Float;

    iput-object v1, v0, Lcom/opensource/svgaplayer/proto/Transform$Builder;->c:Ljava/lang/Float;

    .line 6
    iget-object v1, p0, Lcom/opensource/svgaplayer/proto/Transform;->d:Ljava/lang/Float;

    iput-object v1, v0, Lcom/opensource/svgaplayer/proto/Transform$Builder;->d:Ljava/lang/Float;

    .line 7
    iget-object v1, p0, Lcom/opensource/svgaplayer/proto/Transform;->tx:Ljava/lang/Float;

    iput-object v1, v0, Lcom/opensource/svgaplayer/proto/Transform$Builder;->tx:Ljava/lang/Float;

    .line 8
    iget-object v1, p0, Lcom/opensource/svgaplayer/proto/Transform;->ty:Ljava/lang/Float;

    iput-object v1, v0, Lcom/opensource/svgaplayer/proto/Transform$Builder;->ty:Ljava/lang/Float;

    .line 9
    invoke-virtual {p0}, Lcom/squareup/wire/Message;->unknownFields()Lokio/ByteString;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/squareup/wire/Message$Builder;->addUnknownFields(Lokio/ByteString;)Lcom/squareup/wire/Message$Builder;

    return-object v0
.end method

.method public bridge synthetic newBuilder()Lcom/squareup/wire/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/opensource/svgaplayer/proto/Transform;->newBuilder()Lcom/opensource/svgaplayer/proto/Transform$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/opensource/svgaplayer/proto/Transform;->a:Ljava/lang/Float;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const-string v1, ", a="

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/opensource/svgaplayer/proto/Transform;->a:Ljava/lang/Float;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    :cond_0
    iget-object v1, p0, Lcom/opensource/svgaplayer/proto/Transform;->b:Ljava/lang/Float;

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const-string v1, ", b="

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    iget-object v1, p0, Lcom/opensource/svgaplayer/proto/Transform;->b:Ljava/lang/Float;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    :cond_1
    iget-object v1, p0, Lcom/opensource/svgaplayer/proto/Transform;->c:Ljava/lang/Float;

    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    const-string v1, ", c="

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    iget-object v1, p0, Lcom/opensource/svgaplayer/proto/Transform;->c:Ljava/lang/Float;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    :cond_2
    iget-object v1, p0, Lcom/opensource/svgaplayer/proto/Transform;->d:Ljava/lang/Float;

    .line 50
    .line 51
    if-eqz v1, :cond_3

    .line 52
    .line 53
    const-string v1, ", d="

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    iget-object v1, p0, Lcom/opensource/svgaplayer/proto/Transform;->d:Ljava/lang/Float;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    :cond_3
    iget-object v1, p0, Lcom/opensource/svgaplayer/proto/Transform;->tx:Ljava/lang/Float;

    .line 64
    .line 65
    if-eqz v1, :cond_4

    .line 66
    .line 67
    const-string v1, ", tx="

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    iget-object v1, p0, Lcom/opensource/svgaplayer/proto/Transform;->tx:Ljava/lang/Float;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    :cond_4
    iget-object v1, p0, Lcom/opensource/svgaplayer/proto/Transform;->ty:Ljava/lang/Float;

    .line 78
    .line 79
    if-eqz v1, :cond_5

    .line 80
    .line 81
    const-string v1, ", ty="

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    iget-object v1, p0, Lcom/opensource/svgaplayer/proto/Transform;->ty:Ljava/lang/Float;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 90
    :cond_5
    const/4 v1, 0x2

    .line 91
    .line 92
    const-string v2, "Transform{"

    .line 93
    const/4 v3, 0x0

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v3, v1, v2}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    move-result-object v0

    .line 98
    .line 99
    const/16 v1, 0x7d

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    move-result-object v0

    .line 107
    return-object v0
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
