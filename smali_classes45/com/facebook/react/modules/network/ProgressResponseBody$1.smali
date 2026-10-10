.class Lcom/facebook/react/modules/network/ProgressResponseBody$1;
.super Lokio/ForwardingSource;
.source "ProgressResponseBody.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/modules/network/ProgressResponseBody;->source(Lokio/Source;)Lokio/Source;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/modules/network/ProgressResponseBody;


# direct methods
.method public constructor <init>(Lcom/facebook/react/modules/network/ProgressResponseBody;Lokio/Source;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/modules/network/ProgressResponseBody$1;->this$0:Lcom/facebook/react/modules/network/ProgressResponseBody;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p2}, Lokio/ForwardingSource;-><init>(Lokio/Source;)V

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


# virtual methods
.method public read(Lokio/Buffer;J)J
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2, p3}, Lokio/ForwardingSource;->read(Lokio/Buffer;J)J

    .line 4
    move-result-wide p1

    .line 5
    .line 6
    iget-object p3, p0, Lcom/facebook/react/modules/network/ProgressResponseBody$1;->this$0:Lcom/facebook/react/modules/network/ProgressResponseBody;

    .line 7
    .line 8
    .line 9
    invoke-static {p3}, Lcom/facebook/react/modules/network/ProgressResponseBody;->g(Lcom/facebook/react/modules/network/ProgressResponseBody;)J

    .line 10
    move-result-wide v0

    .line 11
    .line 12
    const-wide/16 v2, -0x1

    .line 13
    .line 14
    cmp-long v2, p1, v2

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    move-wide v3, p1

    .line 18
    goto :goto_0

    .line 19
    .line 20
    :cond_0
    const-wide/16 v3, 0x0

    .line 21
    :goto_0
    add-long/2addr v0, v3

    .line 22
    .line 23
    .line 24
    invoke-static {p3, v0, v1}, Lcom/facebook/react/modules/network/ProgressResponseBody;->h(Lcom/facebook/react/modules/network/ProgressResponseBody;J)V

    .line 25
    .line 26
    iget-object p3, p0, Lcom/facebook/react/modules/network/ProgressResponseBody$1;->this$0:Lcom/facebook/react/modules/network/ProgressResponseBody;

    .line 27
    .line 28
    .line 29
    invoke-static {p3}, Lcom/facebook/react/modules/network/ProgressResponseBody;->a(Lcom/facebook/react/modules/network/ProgressResponseBody;)Lcom/facebook/react/modules/network/ProgressListener;

    .line 30
    move-result-object v3

    .line 31
    .line 32
    iget-object p3, p0, Lcom/facebook/react/modules/network/ProgressResponseBody$1;->this$0:Lcom/facebook/react/modules/network/ProgressResponseBody;

    .line 33
    .line 34
    .line 35
    invoke-static {p3}, Lcom/facebook/react/modules/network/ProgressResponseBody;->g(Lcom/facebook/react/modules/network/ProgressResponseBody;)J

    .line 36
    move-result-wide v4

    .line 37
    .line 38
    iget-object p3, p0, Lcom/facebook/react/modules/network/ProgressResponseBody$1;->this$0:Lcom/facebook/react/modules/network/ProgressResponseBody;

    .line 39
    .line 40
    .line 41
    invoke-static {p3}, Lcom/facebook/react/modules/network/ProgressResponseBody;->b(Lcom/facebook/react/modules/network/ProgressResponseBody;)Lokhttp3/ResponseBody;

    .line 42
    move-result-object p3

    .line 43
    .line 44
    .line 45
    invoke-virtual {p3}, Lokhttp3/ResponseBody;->contentLength()J

    .line 46
    move-result-wide v6

    .line 47
    .line 48
    if-nez v2, :cond_1

    .line 49
    const/4 p3, 0x1

    .line 50
    :goto_1
    move v8, p3

    .line 51
    goto :goto_2

    .line 52
    :cond_1
    const/4 p3, 0x0

    .line 53
    goto :goto_1

    .line 54
    .line 55
    .line 56
    :goto_2
    invoke-interface/range {v3 .. v8}, Lcom/facebook/react/modules/network/ProgressListener;->onProgress(JJZ)V

    .line 57
    return-wide p1
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
.end method
