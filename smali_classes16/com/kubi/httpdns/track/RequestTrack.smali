.class public final Lcom/kubi/httpdns/track/RequestTrack;
.super Ljava/lang/Object;
.source "RequestTrack.kt"

# interfaces
.implements Lhk/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/httpdns/track/RequestTrack$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\t\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\n\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u000cJ\'\u0010\u0013\u001a\u00020\u00062\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0017\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/kubi/httpdns/track/RequestTrack;",
        "Lhk/b;",
        "",
        "host",
        "<init>",
        "(Ljava/lang/String;)V",
        "",
        "b",
        "()V",
        "",
        "e",
        "a",
        "(Ljava/lang/Throwable;)V",
        "Lck/a;",
        "result",
        "c",
        "(Lck/a;)V",
        "error",
        "f",
        "g",
        "(Lck/a;Ljava/lang/Throwable;)V",
        "Ljava/lang/String;",
        "",
        "J",
        "callStart",
        "callEnd",
        "d",
        "Companion",
        "httpdns_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRequestTrack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestTrack.kt\ncom/kubi/httpdns/track/RequestTrack\n+ 2 IRequestTrack.kt\ncom/kubi/httpdns/track/IRequestTrackKt\n+ 3 DnsIssueException.kt\ncom/kubi/httpdns/exception/DnsIssueExceptionKt\n+ 4 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n+ 5 KunlunEvent.kt\ncom/kubi/monitor/KunlunEvent\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n*L\n1#1,129:1\n46#2:130\n46#2:131\n46#2:132\n36#3,14:133\n36#3,14:147\n71#4,4:161\n74#5,12:165\n74#5,12:177\n1#6:189\n35#7,3:190\n*S KotlinDebug\n*F\n+ 1 RequestTrack.kt\ncom/kubi/httpdns/track/RequestTrack\n*L\n29#1:130\n33#1:131\n38#1:132\n46#1:133,14\n55#1:147,14\n68#1:161,4\n77#1:165,12\n82#1:177,12\n96#1:190,3\n*E\n"
    }
.end annotation


# static fields
.field public static final d:Lcom/kubi/httpdns/track/RequestTrack$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final e:Lik/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:J

.field public c:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/httpdns/track/RequestTrack$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/httpdns/track/RequestTrack$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/httpdns/track/RequestTrack;->d:Lcom/kubi/httpdns/track/RequestTrack$Companion;

    .line 9
    .line 10
    new-instance v0, Lik/e;

    .line 11
    .line 12
    const-wide/16 v2, 0x0

    .line 13
    const/4 v4, 0x1

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v2, v3, v4, v1}, Lik/e;-><init>(JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 17
    .line 18
    sput-object v0, Lcom/kubi/httpdns/track/RequestTrack;->e:Lik/e;

    .line 19
    return-void
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
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "host"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/kubi/httpdns/track/RequestTrack;->a:Ljava/lang/String;

    .line 11
    return-void
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
.end method

.method public static final synthetic d(Lcom/kubi/httpdns/track/RequestTrack;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/httpdns/track/RequestTrack;->a:Ljava/lang/String;

    .line 3
    return-object p0
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
.end method

.method public static final h(ILcom/kubi/httpdns/track/RequestTrack;JLck/a;Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "code = "

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string p0, ",host = "

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    iget-object p0, p1, Lcom/kubi/httpdns/track/RequestTrack;->a:Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string p0, ",duration = "

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string p0, ",isNewInstall = "

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    sget-object p0, Lcom/kubi/httpdns/utils/InstallUtil;->a:Lcom/kubi/httpdns/utils/InstallUtil;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/kubi/httpdns/utils/InstallUtil;->b()Z

    .line 42
    move-result p0

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    move-result-object p0

    .line 50
    .line 51
    if-eqz p4, :cond_2

    .line 52
    .line 53
    new-instance p1, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string p0, ", ips = "

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p4}, Lck/a;->d()[Ljava/lang/String;

    .line 68
    move-result-object p0

    .line 69
    .line 70
    const-string p2, ""

    .line 71
    .line 72
    if-nez p0, :cond_0

    .line 73
    goto :goto_0

    .line 74
    :cond_0
    const/4 p3, 0x2

    .line 75
    const/4 v0, 0x0

    .line 76
    const/4 v1, 0x0

    .line 77
    .line 78
    .line 79
    invoke-static {p0, v1, p3, v0}, Lcom/kubi/utils/x;->i(Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    .line 80
    move-result-object p0

    .line 81
    .line 82
    if-nez p0, :cond_1

    .line 83
    goto :goto_0

    .line 84
    :cond_1
    move-object p2, p0

    .line 85
    .line 86
    .line 87
    :goto_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    move-result-object p0

    .line 92
    .line 93
    :cond_2
    if-eqz p4, :cond_3

    .line 94
    .line 95
    new-instance p1, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    const-string p0, ", is_expire_ip = "

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p4}, Lck/a;->e()Z

    .line 110
    move-result p0

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    move-result-object p0

    .line 118
    .line 119
    :cond_3
    if-eqz p5, :cond_4

    .line 120
    .line 121
    new-instance p1, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    const-string p0, ", exception_type = "

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    move-result-object p0

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 140
    move-result-object p0

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    const-string p0, ", exception_message = "

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {p5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 152
    move-result-object p0

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    move-result-object p0

    .line 160
    :cond_4
    return-object p0
.end method

.method public static synthetic i(Lcom/kubi/httpdns/track/RequestTrack;Lck/a;Ljava/lang/Throwable;ILjava/lang/Object;)V
    .locals 1

    .line 1
    .line 2
    and-int/lit8 p4, p3, 0x1

    .line 3
    const/4 v0, 0x0

    .line 4
    .line 5
    if-eqz p4, :cond_0

    .line 6
    move-object p1, v0

    .line 7
    .line 8
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 9
    .line 10
    if-eqz p3, :cond_1

    .line 11
    move-object p2, v0

    .line 12
    .line 13
    .line 14
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/kubi/httpdns/track/RequestTrack;->g(Lck/a;Ljava/lang/Throwable;)V

    .line 15
    return-void
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
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 2
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "e"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    move-result-wide v0

    .line 10
    .line 11
    iput-wide v0, p0, Lcom/kubi/httpdns/track/RequestTrack;->c:J

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/kubi/httpdns/track/RequestTrack;->f(Ljava/lang/Throwable;)V

    .line 15
    return-void
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
.end method

.method public b()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/kubi/httpdns/track/RequestTrack;->b:J

    .line 7
    return-void
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
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
.end method

.method public c(Lck/a;)V
    .locals 2
    .param p1    # Lck/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "result"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    move-result-wide v0

    .line 10
    .line 11
    iput-wide v0, p0, Lcom/kubi/httpdns/track/RequestTrack;->c:J

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/kubi/httpdns/track/RequestTrack;->e(Lck/a;)V

    .line 15
    return-void
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
.end method

.method public final e(Lck/a;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    .line 4
    .line 5
    :try_start_0
    invoke-static {p0, p1, v1, v0, v1}, Lcom/kubi/httpdns/track/RequestTrack;->i(Lcom/kubi/httpdns/track/RequestTrack;Lck/a;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    return-void

    .line 7
    :catchall_0
    move-exception p1

    .line 8
    .line 9
    sget-object v0, Lik/b;->a:Lik/b;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lik/b;->b()Ljava/lang/String;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    instance-of v1, p1, Ljava/net/SocketException;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    goto :goto_0

    .line 19
    .line 20
    :cond_0
    instance-of v1, p1, Lcom/kubi/httpdns/interpret/NoServerException;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :cond_1
    instance-of v1, p1, Ljava/net/SocketTimeoutException;

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    goto :goto_0

    .line 29
    .line 30
    :cond_2
    instance-of v1, p1, Landroid/system/ErrnoException;

    .line 31
    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-static {v0, p1}, Lro/b;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 36
    goto :goto_1

    .line 37
    .line 38
    .line 39
    :cond_3
    invoke-static {p1, v0}, Ldk/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 40
    :goto_1
    return-void
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
.end method

.method public final f(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    .line 4
    .line 5
    :try_start_0
    invoke-static {p0, v1, p1, v0, v1}, Lcom/kubi/httpdns/track/RequestTrack;->i(Lcom/kubi/httpdns/track/RequestTrack;Lck/a;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    return-void

    .line 7
    :catchall_0
    move-exception p1

    .line 8
    .line 9
    sget-object v0, Lik/b;->a:Lik/b;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lik/b;->b()Ljava/lang/String;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    instance-of v1, p1, Ljava/net/SocketException;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    goto :goto_0

    .line 19
    .line 20
    :cond_0
    instance-of v1, p1, Lcom/kubi/httpdns/interpret/NoServerException;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :cond_1
    instance-of v1, p1, Ljava/net/SocketTimeoutException;

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    goto :goto_0

    .line 29
    .line 30
    :cond_2
    instance-of v1, p1, Landroid/system/ErrnoException;

    .line 31
    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-static {v0, p1}, Lro/b;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 36
    goto :goto_1

    .line 37
    .line 38
    .line 39
    :cond_3
    invoke-static {p1, v0}, Ldk/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 40
    :goto_1
    return-void
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
.end method

.method public final g(Lck/a;Ljava/lang/Throwable;)V
    .locals 17

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    move-object/from16 v5, p2

    .line 5
    .line 6
    if-nez p1, :cond_2

    .line 7
    .line 8
    instance-of v0, v5, Lcom/kubi/httpdns/exception/HttpDnsException;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    move-object v0, v5

    .line 12
    .line 13
    check-cast v0, Lcom/kubi/httpdns/exception/HttpDnsException;

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    .line 17
    :goto_0
    if-nez v0, :cond_1

    .line 18
    .line 19
    new-instance v0, Lcom/kubi/httpdns/exception/UnknownException;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v5}, Lcom/kubi/httpdns/exception/UnknownException;-><init>(Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-virtual {v0}, Lcom/kubi/httpdns/exception/HttpDnsException;->getCode()I

    .line 26
    move-result v0

    .line 27
    goto :goto_1

    .line 28
    :cond_2
    const/4 v0, 0x0

    .line 29
    .line 30
    :goto_1
    iget-wide v2, v1, Lcom/kubi/httpdns/track/RequestTrack;->c:J

    .line 31
    .line 32
    iget-wide v7, v1, Lcom/kubi/httpdns/track/RequestTrack;->b:J

    .line 33
    .line 34
    .line 35
    invoke-static {v2, v3, v7, v8}, Lhk/c;->a(JJ)J

    .line 36
    move-result-wide v2

    .line 37
    .line 38
    sget-object v4, Lcom/kubi/monitor/TechnologyEvent;->a:Lcom/kubi/monitor/TechnologyEvent;

    .line 39
    .line 40
    sget-object v4, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->b:Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder$Companion;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder$Companion;->acquire()Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;

    .line 44
    move-result-object v7

    .line 45
    .line 46
    const-string v8, "code"

    .line 47
    .line 48
    .line 49
    invoke-virtual {v7, v8, v0}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->b(Ljava/lang/String;I)V

    .line 50
    .line 51
    const-string v9, "host"

    .line 52
    .line 53
    .line 54
    invoke-static {v1}, Lcom/kubi/httpdns/track/RequestTrack;->d(Lcom/kubi/httpdns/track/RequestTrack;)Ljava/lang/String;

    .line 55
    move-result-object v10

    .line 56
    .line 57
    .line 58
    invoke-virtual {v7, v9, v10}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v7}, Lcom/kubi/monitor/TechnologyEvent$a;->b(Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;)V

    .line 62
    .line 63
    const-string v9, "duration"

    .line 64
    .line 65
    .line 66
    invoke-virtual {v7, v9, v2, v3}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->g(Ljava/lang/String;J)V

    .line 67
    .line 68
    const-string v10, "httpdns_host2ip"

    .line 69
    .line 70
    .line 71
    invoke-static {v10, v7}, Lcom/kubi/monitor/TechnologyEvent;->d(Ljava/lang/String;Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;)V

    .line 72
    .line 73
    sget-object v7, Lcom/kubi/sdk/constant/monitor/KunlunTechEventEnum;->CATE_DNS:Lcom/kubi/sdk/constant/monitor/KunlunTechEventEnum;

    .line 74
    .line 75
    .line 76
    invoke-static {v7, v0}, Lqq/h;->d(Lcom/kubi/sdk/constant/monitor/KunlunTechEventEnum;I)V

    .line 77
    .line 78
    sget-object v7, Lcom/kubi/sdk/constant/monitor/KunlunEventNameEnum;->FRONTEND_HTTPDNS_API_COUNT:Lcom/kubi/sdk/constant/monitor/KunlunEventNameEnum;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder$Companion;->acquire()Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;

    .line 82
    move-result-object v4

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4, v8, v0}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->b(Ljava/lang/String;I)V

    .line 86
    .line 87
    .line 88
    invoke-static {v1}, Lcom/kubi/httpdns/track/RequestTrack;->d(Lcom/kubi/httpdns/track/RequestTrack;)Ljava/lang/String;

    .line 89
    move-result-object v10

    .line 90
    .line 91
    const-string v11, "domain"

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4, v11, v10}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    const-string v10, "category"

    .line 97
    .line 98
    const-string v12, "host2ip"

    .line 99
    .line 100
    .line 101
    invoke-virtual {v4, v10, v12}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 103
    sget-object v13, Lcom/kubi/monitor/TechnologyEvent$a;->a:Lcom/kubi/monitor/TechnologyEvent$a;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v13, v4}, Lcom/kubi/monitor/TechnologyEvent$a;->c(Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;)Ljava/util/Map;

    .line 107
    move-result-object v14

    .line 108
    .line 109
    .line 110
    invoke-virtual {v13, v4}, Lcom/kubi/monitor/TechnologyEvent$a;->a(Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;)Ljava/util/Map;

    .line 111
    move-result-object v4

    .line 112
    .line 113
    sget-object v13, Lqq/i;->a:Lqq/i;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v13}, Lqq/i;->e()Lqq/e;

    .line 117
    move-result-object v13

    .line 118
    .line 119
    .line 120
    invoke-interface {v13}, Lqq/e;->c()Ljava/util/List;

    .line 121
    move-result-object v13

    .line 122
    .line 123
    .line 124
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 125
    move-result-object v13

    .line 126
    .line 127
    .line 128
    :goto_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    move-result v15

    .line 130
    .line 131
    if-eqz v15, :cond_4

    .line 132
    .line 133
    .line 134
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    move-result-object v15

    .line 136
    .line 137
    check-cast v15, Lrq/a;

    .line 138
    .line 139
    .line 140
    invoke-interface {v4}, Ljava/util/Map;->isEmpty()Z

    .line 141
    move-result v16

    .line 142
    .line 143
    if-eqz v16, :cond_3

    .line 144
    .line 145
    .line 146
    invoke-virtual {v7}, Lcom/kubi/sdk/constant/monitor/KunlunEventNameEnum;->getEventName()Ljava/lang/String;

    .line 147
    move-result-object v6

    .line 148
    .line 149
    .line 150
    invoke-interface {v15, v6, v14}, Lrq/a;->b(Ljava/lang/String;Ljava/util/Map;)V

    .line 151
    goto :goto_2

    .line 152
    .line 153
    .line 154
    :cond_3
    invoke-virtual {v7}, Lcom/kubi/sdk/constant/monitor/KunlunEventNameEnum;->getEventName()Ljava/lang/String;

    .line 155
    move-result-object v6

    .line 156
    .line 157
    .line 158
    invoke-interface {v15, v6, v4, v14}, Lrq/a;->a(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V

    .line 159
    goto :goto_2

    .line 160
    .line 161
    :cond_4
    sget-object v4, Lcom/kubi/sdk/constant/monitor/KunlunEventNameEnum;->FRONTEND_HTTPDNS_API_COST_MILLISECONDS:Lcom/kubi/sdk/constant/monitor/KunlunEventNameEnum;

    .line 162
    .line 163
    sget-object v6, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->b:Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder$Companion;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v6}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder$Companion;->acquire()Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;

    .line 167
    move-result-object v6

    .line 168
    .line 169
    .line 170
    invoke-virtual {v6, v8, v0}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->b(Ljava/lang/String;I)V

    .line 171
    .line 172
    .line 173
    invoke-static {v1}, Lcom/kubi/httpdns/track/RequestTrack;->d(Lcom/kubi/httpdns/track/RequestTrack;)Ljava/lang/String;

    .line 174
    move-result-object v7

    .line 175
    .line 176
    .line 177
    invoke-virtual {v6, v11, v7}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v6, v10, v12}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v6, v9, v2, v3}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->g(Ljava/lang/String;J)V

    .line 184
    .line 185
    sget-object v7, Lcom/kubi/monitor/TechnologyEvent$a;->a:Lcom/kubi/monitor/TechnologyEvent$a;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v7, v6}, Lcom/kubi/monitor/TechnologyEvent$a;->c(Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;)Ljava/util/Map;

    .line 189
    move-result-object v8

    .line 190
    .line 191
    .line 192
    invoke-virtual {v7, v6}, Lcom/kubi/monitor/TechnologyEvent$a;->a(Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;)Ljava/util/Map;

    .line 193
    move-result-object v6

    .line 194
    .line 195
    sget-object v7, Lqq/i;->a:Lqq/i;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v7}, Lqq/i;->e()Lqq/e;

    .line 199
    move-result-object v7

    .line 200
    .line 201
    .line 202
    invoke-interface {v7}, Lqq/e;->c()Ljava/util/List;

    .line 203
    move-result-object v7

    .line 204
    .line 205
    .line 206
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 207
    move-result-object v7

    .line 208
    .line 209
    .line 210
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 211
    move-result v9

    .line 212
    .line 213
    if-eqz v9, :cond_6

    .line 214
    .line 215
    .line 216
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 217
    move-result-object v9

    .line 218
    .line 219
    check-cast v9, Lrq/a;

    .line 220
    .line 221
    .line 222
    invoke-interface {v6}, Ljava/util/Map;->isEmpty()Z

    .line 223
    move-result v10

    .line 224
    .line 225
    if-eqz v10, :cond_5

    .line 226
    .line 227
    .line 228
    invoke-virtual {v4}, Lcom/kubi/sdk/constant/monitor/KunlunEventNameEnum;->getEventName()Ljava/lang/String;

    .line 229
    move-result-object v10

    .line 230
    .line 231
    .line 232
    invoke-interface {v9, v10, v8}, Lrq/a;->b(Ljava/lang/String;Ljava/util/Map;)V

    .line 233
    goto :goto_3

    .line 234
    .line 235
    .line 236
    :cond_5
    invoke-virtual {v4}, Lcom/kubi/sdk/constant/monitor/KunlunEventNameEnum;->getEventName()Ljava/lang/String;

    .line 237
    move-result-object v10

    .line 238
    .line 239
    .line 240
    invoke-interface {v9, v10, v6, v8}, Lrq/a;->a(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V

    .line 241
    goto :goto_3

    .line 242
    :cond_6
    const/4 v6, 0x1

    .line 243
    .line 244
    if-lez v0, :cond_7

    .line 245
    .line 246
    sget-object v4, Lik/b;->a:Lik/b;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v4}, Lik/b;->b()Ljava/lang/String;

    .line 250
    move-result-object v7

    .line 251
    .line 252
    new-instance v8, Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 256
    .line 257
    const-string v4, "request httpdns_error: "

    .line 258
    .line 259
    .line 260
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    move-object/from16 v4, p1

    .line 263
    .line 264
    .line 265
    invoke-static/range {v0 .. v5}, Lcom/kubi/httpdns/track/RequestTrack;->h(ILcom/kubi/httpdns/track/RequestTrack;JLck/a;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 266
    move-result-object v2

    .line 267
    .line 268
    .line 269
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 273
    move-result-object v1

    .line 274
    .line 275
    .line 276
    invoke-static {v7, v1}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    goto :goto_4

    .line 278
    .line 279
    :cond_7
    sget-object v1, Lkotlin/random/Random;->Default:Lkotlin/random/Random$Default;

    .line 280
    .line 281
    const/16 v4, 0x64

    .line 282
    .line 283
    .line 284
    invoke-virtual {v1, v4}, Lkotlin/random/Random$Default;->nextInt(I)I

    .line 285
    move-result v1

    .line 286
    .line 287
    const-string v4, "request httpdns_success: "

    .line 288
    .line 289
    if-ne v1, v6, :cond_8

    .line 290
    .line 291
    sget-object v1, Lik/b;->a:Lik/b;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v1}, Lik/b;->b()Ljava/lang/String;

    .line 295
    move-result-object v7

    .line 296
    .line 297
    new-instance v8, Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    move-object/from16 v1, p0

    .line 306
    .line 307
    move-object/from16 v4, p1

    .line 308
    .line 309
    move-object/from16 v5, p2

    .line 310
    .line 311
    .line 312
    invoke-static/range {v0 .. v5}, Lcom/kubi/httpdns/track/RequestTrack;->h(ILcom/kubi/httpdns/track/RequestTrack;JLck/a;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 313
    move-result-object v2

    .line 314
    .line 315
    .line 316
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 320
    move-result-object v1

    .line 321
    .line 322
    .line 323
    invoke-static {v7, v1}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 324
    goto :goto_4

    .line 325
    .line 326
    :cond_8
    sget-object v1, Lik/b;->a:Lik/b;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v1}, Lik/b;->b()Ljava/lang/String;

    .line 330
    move-result-object v7

    .line 331
    .line 332
    new-instance v8, Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    move-object/from16 v1, p0

    .line 341
    .line 342
    move-object/from16 v4, p1

    .line 343
    .line 344
    move-object/from16 v5, p2

    .line 345
    .line 346
    .line 347
    invoke-static/range {v0 .. v5}, Lcom/kubi/httpdns/track/RequestTrack;->h(ILcom/kubi/httpdns/track/RequestTrack;JLck/a;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 348
    move-result-object v2

    .line 349
    .line 350
    .line 351
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 355
    move-result-object v1

    .line 356
    .line 357
    .line 358
    invoke-static {v7, v1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 359
    .line 360
    :goto_4
    sget-object v1, Lcom/kubi/httpdns/track/RequestTrack;->e:Lik/e;

    .line 361
    .line 362
    if-eqz v0, :cond_9

    .line 363
    goto :goto_5

    .line 364
    :cond_9
    const/4 v6, 0x0

    .line 365
    .line 366
    .line 367
    :goto_5
    invoke-virtual {v1, v6}, Lik/e;->a(Z)Lik/f;

    .line 368
    move-result-object v0

    .line 369
    .line 370
    if-eqz v0, :cond_a

    .line 371
    .line 372
    sget-object v1, Lik/b;->a:Lik/b;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v1}, Lik/b;->b()Ljava/lang/String;

    .line 376
    move-result-object v1

    .line 377
    .line 378
    new-instance v2, Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 382
    .line 383
    const-string v3, "request httpdns_success_rate: windowSuccessRate = "

    .line 384
    .line 385
    .line 386
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v0}, Lik/f;->b()D

    .line 390
    move-result-wide v3

    .line 391
    .line 392
    .line 393
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 394
    .line 395
    const-string v3, ", totalSuccessRate = "

    .line 396
    .line 397
    .line 398
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v0}, Lik/f;->a()D

    .line 402
    move-result-wide v3

    .line 403
    .line 404
    .line 405
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 409
    move-result-object v0

    .line 410
    .line 411
    .line 412
    invoke-static {v1, v0}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 413
    :cond_a
    return-void
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
.end method
