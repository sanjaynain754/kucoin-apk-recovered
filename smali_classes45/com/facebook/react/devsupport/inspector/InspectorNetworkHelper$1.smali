.class Lcom/facebook/react/devsupport/inspector/InspectorNetworkHelper$1;
.super Ljava/lang/Object;
.source "InspectorNetworkHelper.java"

# interfaces
.implements Lokhttp3/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/inspector/InspectorNetworkHelper;->loadNetworkResource(Ljava/lang/String;Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$listener:Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;


# direct methods
.method public constructor <init>(Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/devsupport/inspector/InspectorNetworkHelper$1;->val$listener:Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;

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
.method public onFailure(Lokhttp3/Call;Ljava/io/IOException;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Lokhttp3/Call;->isCanceled()Z

    .line 4
    move-result p1

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-object p1, p0, Lcom/facebook/react/devsupport/inspector/InspectorNetworkHelper$1;->val$listener:Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 13
    move-result-object p2

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p2}, Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;->onError(Ljava/lang/String;)V

    .line 17
    return-void
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

.method public onResponse(Lokhttp3/Call;Lokhttp3/Response;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Lokhttp3/Response;->headers()Lokhttp3/Headers;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    new-instance v0, Ljava/util/HashMap;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lokhttp3/Headers;->names()Ljava/util/Set;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    move-result v2

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    check-cast v2, Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v2}, Lokhttp3/Headers;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    move-result-object v3

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    goto :goto_0

    .line 38
    .line 39
    :cond_0
    iget-object p1, p0, Lcom/facebook/react/devsupport/inspector/InspectorNetworkHelper$1;->val$listener:Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2}, Lokhttp3/Response;->code()I

    .line 43
    move-result v1

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v1, v0}, Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;->onHeaders(ILjava/util/Map;)V

    .line 47
    .line 48
    .line 49
    :try_start_0
    invoke-virtual {p2}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    .line 50
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    .line 55
    :try_start_1
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->byteStream()Ljava/io/InputStream;

    .line 56
    move-result-object p2

    .line 57
    .line 58
    const/16 v0, 0x400

    .line 59
    .line 60
    new-array v0, v0, [B
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 61
    .line 62
    .line 63
    :goto_1
    :try_start_2
    invoke-virtual {p2, v0}, Ljava/io/InputStream;->read([B)I

    .line 64
    move-result v1

    .line 65
    const/4 v2, -0x1

    .line 66
    .line 67
    if-eq v1, v2, :cond_1

    .line 68
    .line 69
    new-instance v2, Ljava/lang/String;

    .line 70
    const/4 v3, 0x0

    .line 71
    .line 72
    .line 73
    invoke-direct {v2, v0, v3, v1}, Ljava/lang/String;-><init>([BII)V

    .line 74
    .line 75
    iget-object v1, p0, Lcom/facebook/react/devsupport/inspector/InspectorNetworkHelper$1;->val$listener:Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v2}, Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;->onData(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 79
    goto :goto_1

    .line 80
    :catchall_0
    move-exception v0

    .line 81
    goto :goto_2

    .line 82
    .line 83
    .line 84
    :cond_1
    :try_start_3
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V

    .line 85
    goto :goto_3

    .line 86
    :catchall_1
    move-exception p2

    .line 87
    goto :goto_4

    .line 88
    .line 89
    .line 90
    :goto_2
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V

    .line 91
    throw v0

    .line 92
    .line 93
    :cond_2
    :goto_3
    iget-object p2, p0, Lcom/facebook/react/devsupport/inspector/InspectorNetworkHelper$1;->val$listener:Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2}, Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;->onCompletion()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 97
    .line 98
    if-eqz p1, :cond_4

    .line 99
    .line 100
    .line 101
    :try_start_4
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 102
    return-void

    .line 103
    :catch_0
    move-exception p1

    .line 104
    goto :goto_6

    .line 105
    .line 106
    :goto_4
    if-eqz p1, :cond_3

    .line 107
    .line 108
    .line 109
    :try_start_5
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 110
    goto :goto_5

    .line 111
    :catchall_2
    move-exception p1

    .line 112
    .line 113
    .line 114
    :try_start_6
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 115
    :cond_3
    :goto_5
    throw p2
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0

    .line 116
    .line 117
    :goto_6
    iget-object p2, p0, Lcom/facebook/react/devsupport/inspector/InspectorNetworkHelper$1;->val$listener:Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 121
    move-result-object p1

    .line 122
    .line 123
    .line 124
    invoke-virtual {p2, p1}, Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;->onError(Ljava/lang/String;)V

    .line 125
    :cond_4
    return-void
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
