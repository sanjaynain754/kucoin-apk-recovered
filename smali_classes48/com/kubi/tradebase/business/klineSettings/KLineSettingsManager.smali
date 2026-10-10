.class public final Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager;
.super Ljava/lang/Object;
.source "KLineSettingsManager.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0014\u0010\u000e\u001a\u00020\u000f2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008J\u0014\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0086@\u00a2\u0006\u0002\u0010\u0012J\u001c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0002J\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008J\u001a\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008J\u000e\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0002J\u000e\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0002J\u0015\u0010\u001a\u001a\u00020\u00052\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0002\u0010\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R!\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager;",
        "",
        "<init>",
        "()V",
        "category",
        "",
        "key",
        "allTimeList",
        "",
        "Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;",
        "getAllTimeList",
        "()Ljava/util/List;",
        "allTimeList$delegate",
        "Lkotlin/Lazy;",
        "saveTimeCycle",
        "",
        "value",
        "getTimeCycle",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "reBuildTimeCycle",
        "list",
        "getAllTimeCycle",
        "getPopTimeCycle",
        "showTimeList",
        "buildDefaultData",
        "buildAllData",
        "convert",
        "tag",
        "",
        "(Ljava/lang/Integer;)Ljava/lang/String;",
        "TradeBaseLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nKLineSettingsManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineSettingsManager.kt\ncom/kubi/tradebase/business/klineSettings/KLineSettingsManager\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n196#2,3:183\n1#3:186\n1011#4,2:187\n1021#4,2:189\n1021#4,2:191\n1011#4,2:193\n774#4:195\n865#4,2:196\n1011#4,2:198\n*S KotlinDebug\n*F\n+ 1 KLineSettingsManager.kt\ncom/kubi/tradebase/business/klineSettings/KLineSettingsManager\n*L\n30#1:183,3\n32#1:187,2\n52#1:189,2\n53#1:191,2\n79#1:193,2\n96#1:195\n96#1:196,2\n116#1:198,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager;->a:Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager;

    .line 8
    .line 9
    new-instance v0, Lcom/kubi/tradebase/business/klineSettings/a;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/kubi/tradebase/business/klineSettings/a;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    sput-object v0, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager;->b:Lkotlin/Lazy;

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
.end method

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
.end method

.method public static synthetic a()Ljava/util/List;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager;->b()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
.end method

.method public static final b()Ljava/util/List;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager;->a:Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager;->c()Ljava/util/List;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method


# virtual methods
.method public final c()Ljava/util/List;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;

    .line 8
    .line 9
    sget-object v7, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 10
    .line 11
    sget v2, Lcom/kubi/tradebase/R$string;->k_linke_min_time:I

    .line 12
    const/4 v8, 0x0

    .line 13
    .line 14
    new-array v3, v8, [Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v7, v2, v3}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    move-result-object v2

    .line 19
    const/4 v5, 0x4

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x0

    .line 23
    .line 24
    .line 25
    invoke-direct/range {v1 .. v6}, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;-><init>(Ljava/lang/String;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    new-instance v9, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;

    .line 31
    .line 32
    sget v1, Lcom/kubi/tradebase/R$string;->one_min:I

    .line 33
    .line 34
    new-array v2, v8, [Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v7, v1, v2}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    move-result-object v10

    .line 39
    const/4 v13, 0x4

    .line 40
    const/4 v14, 0x0

    .line 41
    const/4 v11, 0x1

    .line 42
    const/4 v12, 0x0

    .line 43
    .line 44
    .line 45
    invoke-direct/range {v9 .. v14}, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;-><init>(Ljava/lang/String;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    new-instance v1, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;

    .line 51
    .line 52
    sget v2, Lcom/kubi/tradebase/R$string;->five_min:I

    .line 53
    .line 54
    new-array v3, v8, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v7, v2, v3}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 58
    move-result-object v2

    .line 59
    const/4 v3, 0x2

    .line 60
    .line 61
    .line 62
    invoke-direct/range {v1 .. v6}, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;-><init>(Ljava/lang/String;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    new-instance v9, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;

    .line 68
    .line 69
    sget v1, Lcom/kubi/tradebase/R$string;->fiveteen_min:I

    .line 70
    .line 71
    new-array v2, v8, [Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v7, v1, v2}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 75
    move-result-object v10

    .line 76
    const/4 v11, 0x3

    .line 77
    .line 78
    .line 79
    invoke-direct/range {v9 .. v14}, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;-><init>(Ljava/lang/String;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 80
    .line 81
    .line 82
    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    new-instance v1, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;

    .line 85
    .line 86
    sget v2, Lcom/kubi/tradebase/R$string;->thirty_min:I

    .line 87
    .line 88
    new-array v3, v8, [Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v7, v2, v3}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 92
    move-result-object v2

    .line 93
    const/4 v3, 0x4

    .line 94
    .line 95
    .line 96
    invoke-direct/range {v1 .. v6}, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;-><init>(Ljava/lang/String;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 97
    .line 98
    .line 99
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    new-instance v9, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;

    .line 102
    .line 103
    sget v1, Lcom/kubi/tradebase/R$string;->one_hour:I

    .line 104
    .line 105
    new-array v2, v8, [Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v7, v1, v2}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 109
    move-result-object v10

    .line 110
    const/4 v11, 0x5

    .line 111
    .line 112
    .line 113
    invoke-direct/range {v9 .. v14}, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;-><init>(Ljava/lang/String;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 114
    .line 115
    .line 116
    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    new-instance v1, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;

    .line 119
    .line 120
    sget v2, Lcom/kubi/tradebase/R$string;->two_hour:I

    .line 121
    .line 122
    new-array v3, v8, [Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v7, v2, v3}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 126
    move-result-object v2

    .line 127
    const/4 v3, 0x6

    .line 128
    .line 129
    .line 130
    invoke-direct/range {v1 .. v6}, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;-><init>(Ljava/lang/String;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 131
    .line 132
    .line 133
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    new-instance v9, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;

    .line 136
    .line 137
    sget v1, Lcom/kubi/tradebase/R$string;->four_hour:I

    .line 138
    .line 139
    new-array v2, v8, [Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v7, v1, v2}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 143
    move-result-object v10

    .line 144
    const/4 v11, 0x7

    .line 145
    .line 146
    .line 147
    invoke-direct/range {v9 .. v14}, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;-><init>(Ljava/lang/String;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 148
    .line 149
    .line 150
    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    new-instance v1, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;

    .line 153
    .line 154
    sget v2, Lcom/kubi/tradebase/R$string;->k_linke_8_h:I

    .line 155
    .line 156
    new-array v3, v8, [Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v7, v2, v3}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 160
    move-result-object v2

    .line 161
    .line 162
    const/16 v3, 0x8

    .line 163
    .line 164
    .line 165
    invoke-direct/range {v1 .. v6}, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;-><init>(Ljava/lang/String;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 166
    .line 167
    .line 168
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    new-instance v9, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;

    .line 171
    .line 172
    sget v1, Lcom/kubi/tradebase/R$string;->k_linke_one_day:I

    .line 173
    .line 174
    new-array v2, v8, [Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v7, v1, v2}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 178
    move-result-object v10

    .line 179
    .line 180
    const/16 v11, 0x9

    .line 181
    .line 182
    .line 183
    invoke-direct/range {v9 .. v14}, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;-><init>(Ljava/lang/String;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 184
    .line 185
    .line 186
    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 187
    .line 188
    new-instance v1, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;

    .line 189
    .line 190
    sget v2, Lcom/kubi/tradebase/R$string;->k_linke_one_week:I

    .line 191
    .line 192
    new-array v3, v8, [Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v7, v2, v3}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 196
    move-result-object v2

    .line 197
    .line 198
    const/16 v3, 0xa

    .line 199
    .line 200
    .line 201
    invoke-direct/range {v1 .. v6}, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;-><init>(Ljava/lang/String;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 202
    .line 203
    .line 204
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 205
    .line 206
    sget-object v1, Lhf/h;->a:Lhf/h;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1}, Lhf/h;->l()Z

    .line 210
    move-result v1

    .line 211
    .line 212
    if-eqz v1, :cond_0

    .line 213
    .line 214
    new-instance v9, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;

    .line 215
    .line 216
    sget v1, Lcom/kubi/tradebase/R$string;->k_linke_one_month:I

    .line 217
    .line 218
    new-array v2, v8, [Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v7, v1, v2}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 222
    move-result-object v10

    .line 223
    const/4 v13, 0x4

    .line 224
    const/4 v14, 0x0

    .line 225
    .line 226
    const/16 v11, 0xb

    .line 227
    const/4 v12, 0x0

    .line 228
    .line 229
    .line 230
    invoke-direct/range {v9 .. v14}, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;-><init>(Ljava/lang/String;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 231
    .line 232
    .line 233
    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 234
    :cond_0
    return-object v0
    .line 235
    .line 236
    .line 237
.end method

.method public final d()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;

    .line 8
    .line 9
    sget-object v2, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 10
    .line 11
    sget v3, Lcom/kubi/tradebase/R$string;->k_linke_min_time:I

    .line 12
    const/4 v4, 0x0

    .line 13
    .line 14
    new-array v5, v4, [Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, v3, v5}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    move-result-object v3

    .line 19
    const/4 v5, 0x1

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, v3, v4, v5}, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;-><init>(Ljava/lang/String;IZ)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    new-instance v1, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;

    .line 28
    .line 29
    sget v3, Lcom/kubi/tradebase/R$string;->fiveteen_min:I

    .line 30
    .line 31
    new-array v6, v4, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v3, v6}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    move-result-object v3

    .line 36
    const/4 v6, 0x3

    .line 37
    .line 38
    .line 39
    invoke-direct {v1, v3, v6, v5}, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;-><init>(Ljava/lang/String;IZ)V

    .line 40
    .line 41
    .line 42
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    new-instance v1, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;

    .line 45
    .line 46
    sget v3, Lcom/kubi/tradebase/R$string;->one_hour:I

    .line 47
    .line 48
    new-array v6, v4, [Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v3, v6}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 52
    move-result-object v3

    .line 53
    const/4 v6, 0x5

    .line 54
    .line 55
    .line 56
    invoke-direct {v1, v3, v6, v5}, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;-><init>(Ljava/lang/String;IZ)V

    .line 57
    .line 58
    .line 59
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    new-instance v1, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;

    .line 62
    .line 63
    sget v3, Lcom/kubi/tradebase/R$string;->k_linke_8_h:I

    .line 64
    .line 65
    new-array v6, v4, [Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v3, v6}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 69
    move-result-object v3

    .line 70
    .line 71
    const/16 v6, 0x8

    .line 72
    .line 73
    .line 74
    invoke-direct {v1, v3, v6, v5}, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;-><init>(Ljava/lang/String;IZ)V

    .line 75
    .line 76
    .line 77
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    new-instance v1, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;

    .line 80
    .line 81
    sget v3, Lcom/kubi/tradebase/R$string;->k_linke_one_day:I

    .line 82
    .line 83
    new-array v4, v4, [Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v3, v4}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 87
    move-result-object v2

    .line 88
    .line 89
    const/16 v3, 0x9

    .line 90
    .line 91
    .line 92
    invoke-direct {v1, v2, v3, v5}, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;-><init>(Ljava/lang/String;IZ)V

    .line 93
    .line 94
    .line 95
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 99
    move-result v1

    .line 100
    .line 101
    if-le v1, v5, :cond_0

    .line 102
    .line 103
    new-instance v1, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager$a;

    .line 104
    .line 105
    .line 106
    invoke-direct {v1}, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager$a;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->sortWith(Ljava/util/List;Ljava/util/Comparator;)V

    .line 110
    :cond_0
    return-object v0
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
.end method

.method public final e(Ljava/lang/Integer;)Ljava/lang/String;
    .locals 3
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    goto :goto_0

    .line 5
    .line 6
    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 8
    move-result v1

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    sget-object p1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 13
    .line 14
    sget v1, Lcom/kubi/tradebase/R$string;->k_linke_min_time:I

    .line 15
    .line 16
    new-array v0, v0, [Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v1, v0}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    .line 23
    :cond_1
    :goto_0
    if-nez p1, :cond_2

    .line 24
    goto :goto_1

    .line 25
    .line 26
    .line 27
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 28
    move-result v1

    .line 29
    const/4 v2, 0x1

    .line 30
    .line 31
    if-ne v1, v2, :cond_3

    .line 32
    .line 33
    sget-object p1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 34
    .line 35
    sget v1, Lcom/kubi/tradebase/R$string;->one_min:I

    .line 36
    .line 37
    new-array v0, v0, [Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v1, v0}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    .line 44
    :cond_3
    :goto_1
    if-nez p1, :cond_4

    .line 45
    goto :goto_2

    .line 46
    .line 47
    .line 48
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 49
    move-result v1

    .line 50
    const/4 v2, 0x2

    .line 51
    .line 52
    if-ne v1, v2, :cond_5

    .line 53
    .line 54
    sget-object p1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 55
    .line 56
    sget v1, Lcom/kubi/tradebase/R$string;->five_min:I

    .line 57
    .line 58
    new-array v0, v0, [Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v1, v0}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    move-result-object p1

    .line 63
    return-object p1

    .line 64
    .line 65
    :cond_5
    :goto_2
    if-nez p1, :cond_6

    .line 66
    goto :goto_3

    .line 67
    .line 68
    .line 69
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 70
    move-result v1

    .line 71
    const/4 v2, 0x3

    .line 72
    .line 73
    if-ne v1, v2, :cond_7

    .line 74
    .line 75
    sget-object p1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 76
    .line 77
    sget v1, Lcom/kubi/tradebase/R$string;->fiveteen_min:I

    .line 78
    .line 79
    new-array v0, v0, [Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v1, v0}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 83
    move-result-object p1

    .line 84
    return-object p1

    .line 85
    .line 86
    :cond_7
    :goto_3
    if-nez p1, :cond_8

    .line 87
    goto :goto_4

    .line 88
    .line 89
    .line 90
    :cond_8
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 91
    move-result v1

    .line 92
    const/4 v2, 0x4

    .line 93
    .line 94
    if-ne v1, v2, :cond_9

    .line 95
    .line 96
    sget-object p1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 97
    .line 98
    sget v1, Lcom/kubi/tradebase/R$string;->thirty_min:I

    .line 99
    .line 100
    new-array v0, v0, [Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v1, v0}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 104
    move-result-object p1

    .line 105
    return-object p1

    .line 106
    .line 107
    :cond_9
    :goto_4
    if-nez p1, :cond_a

    .line 108
    goto :goto_5

    .line 109
    .line 110
    .line 111
    :cond_a
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 112
    move-result v1

    .line 113
    const/4 v2, 0x5

    .line 114
    .line 115
    if-ne v1, v2, :cond_b

    .line 116
    .line 117
    sget-object p1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 118
    .line 119
    sget v1, Lcom/kubi/tradebase/R$string;->one_hour:I

    .line 120
    .line 121
    new-array v0, v0, [Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, v1, v0}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 125
    move-result-object p1

    .line 126
    return-object p1

    .line 127
    .line 128
    :cond_b
    :goto_5
    if-nez p1, :cond_c

    .line 129
    goto :goto_6

    .line 130
    .line 131
    .line 132
    :cond_c
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 133
    move-result v1

    .line 134
    const/4 v2, 0x6

    .line 135
    .line 136
    if-ne v1, v2, :cond_d

    .line 137
    .line 138
    sget-object p1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 139
    .line 140
    sget v1, Lcom/kubi/tradebase/R$string;->two_hour:I

    .line 141
    .line 142
    new-array v0, v0, [Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, v1, v0}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 146
    move-result-object p1

    .line 147
    return-object p1

    .line 148
    .line 149
    :cond_d
    :goto_6
    if-nez p1, :cond_e

    .line 150
    goto :goto_7

    .line 151
    .line 152
    .line 153
    :cond_e
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 154
    move-result v1

    .line 155
    const/4 v2, 0x7

    .line 156
    .line 157
    if-ne v1, v2, :cond_f

    .line 158
    .line 159
    sget-object p1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 160
    .line 161
    sget v1, Lcom/kubi/tradebase/R$string;->four_hour:I

    .line 162
    .line 163
    new-array v0, v0, [Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1, v1, v0}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 167
    move-result-object p1

    .line 168
    return-object p1

    .line 169
    .line 170
    :cond_f
    :goto_7
    if-nez p1, :cond_10

    .line 171
    goto :goto_8

    .line 172
    .line 173
    .line 174
    :cond_10
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 175
    move-result v1

    .line 176
    .line 177
    const/16 v2, 0x8

    .line 178
    .line 179
    if-ne v1, v2, :cond_11

    .line 180
    .line 181
    sget-object p1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 182
    .line 183
    sget v1, Lcom/kubi/tradebase/R$string;->k_linke_8_h:I

    .line 184
    .line 185
    new-array v0, v0, [Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1, v1, v0}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 189
    move-result-object p1

    .line 190
    return-object p1

    .line 191
    .line 192
    :cond_11
    :goto_8
    if-nez p1, :cond_12

    .line 193
    goto :goto_9

    .line 194
    .line 195
    .line 196
    :cond_12
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 197
    move-result v1

    .line 198
    .line 199
    const/16 v2, 0x9

    .line 200
    .line 201
    if-ne v1, v2, :cond_13

    .line 202
    .line 203
    sget-object p1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 204
    .line 205
    sget v1, Lcom/kubi/tradebase/R$string;->k_linke_one_day:I

    .line 206
    .line 207
    new-array v0, v0, [Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    invoke-virtual {p1, v1, v0}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 211
    move-result-object p1

    .line 212
    return-object p1

    .line 213
    .line 214
    :cond_13
    :goto_9
    if-nez p1, :cond_14

    .line 215
    goto :goto_a

    .line 216
    .line 217
    .line 218
    :cond_14
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 219
    move-result v1

    .line 220
    .line 221
    const/16 v2, 0xa

    .line 222
    .line 223
    if-ne v1, v2, :cond_15

    .line 224
    .line 225
    sget-object p1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 226
    .line 227
    sget v1, Lcom/kubi/tradebase/R$string;->k_linke_one_week:I

    .line 228
    .line 229
    new-array v0, v0, [Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    invoke-virtual {p1, v1, v0}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 233
    move-result-object p1

    .line 234
    return-object p1

    .line 235
    .line 236
    :cond_15
    :goto_a
    if-nez p1, :cond_16

    .line 237
    goto :goto_b

    .line 238
    .line 239
    .line 240
    :cond_16
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 241
    move-result p1

    .line 242
    .line 243
    const/16 v1, 0xb

    .line 244
    .line 245
    if-ne p1, v1, :cond_17

    .line 246
    .line 247
    sget-object p1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 248
    .line 249
    sget v1, Lcom/kubi/tradebase/R$string;->k_linke_one_month:I

    .line 250
    .line 251
    new-array v0, v0, [Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    invoke-virtual {p1, v1, v0}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 255
    move-result-object p1

    .line 256
    return-object p1

    .line 257
    .line 258
    :cond_17
    :goto_b
    sget-object p1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 259
    .line 260
    sget v1, Lcom/kubi/tradebase/R$string;->fiveteen_min:I

    .line 261
    .line 262
    new-array v0, v0, [Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    invoke-virtual {p1, v1, v0}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 266
    move-result-object p1

    .line 267
    return-object p1
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
.end method

.method public final f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager;->g()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
.end method

.method public final g()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager;->b:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/util/List;

    .line 9
    return-object v0
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
.end method

.method public final h(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "showTimeList"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager;->f()Ljava/util/List;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    move-result v2

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    move-result-object v2

    .line 29
    move-object v3, v2

    .line 30
    .line 31
    check-cast v3, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;

    .line 32
    .line 33
    .line 34
    invoke-interface {p1, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 35
    move-result v3

    .line 36
    .line 37
    if-nez v3, :cond_0

    .line 38
    .line 39
    .line 40
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 41
    goto :goto_0

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    .line 45
    move-result-object p1

    .line 46
    return-object p1
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
.end method

.method public final i(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p1, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager$getTimeCycle$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager$getTimeCycle$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager$getTimeCycle$1;->label:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager$getTimeCycle$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager$getTimeCycle$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager$getTimeCycle$1;-><init>(Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p1, v0, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager$getTimeCycle$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager$getTimeCycle$1;->label:I

    .line 33
    const/4 v3, 0x1

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object v1, v0, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager$getTimeCycle$1;->L$2:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Ljava/lang/String;

    .line 42
    .line 43
    iget-object v1, v0, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager$getTimeCycle$1;->L$1:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Lcom/kubi/utils/x;

    .line 46
    .line 47
    iget-object v0, v0, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager$getTimeCycle$1;->L$0:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 53
    goto :goto_1

    .line 54
    .line 55
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    .line 60
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    throw p1

    .line 62
    .line 63
    .line 64
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 65
    .line 66
    const-string p1, "kline_time_cycle"

    .line 67
    .line 68
    const-string v2, ""

    .line 69
    .line 70
    const-string v4, "trade"

    .line 71
    .line 72
    .line 73
    invoke-static {v4, p1, v2}, Ly70/e;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    move-result-object p1

    .line 75
    .line 76
    .line 77
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 78
    move-result v2

    .line 79
    .line 80
    if-nez v2, :cond_3

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager;->d()Ljava/util/List;

    .line 84
    move-result-object p1

    .line 85
    return-object p1

    .line 86
    .line 87
    :cond_3
    sget-object v2, Lcom/kubi/utils/x;->a:Lcom/kubi/utils/x;

    .line 88
    .line 89
    new-instance v4, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager$getTimeCycle$$inlined$fromJsonOrNull$1;

    .line 90
    const/4 v5, 0x0

    .line 91
    .line 92
    .line 93
    invoke-direct {v4, p1, v5}, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager$getTimeCycle$$inlined$fromJsonOrNull$1;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 94
    .line 95
    .line 96
    invoke-static {v4}, Lkotlinx/coroutines/flow/g;->K(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    .line 97
    move-result-object v4

    .line 98
    .line 99
    .line 100
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 101
    move-result-object v5

    .line 102
    .line 103
    .line 104
    invoke-static {v4, v5}, Lkotlinx/coroutines/flow/g;->N(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/e;

    .line 105
    move-result-object v4

    .line 106
    .line 107
    .line 108
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    move-result-object v5

    .line 110
    .line 111
    iput-object v5, v0, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager$getTimeCycle$1;->L$0:Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    move-result-object v2

    .line 116
    .line 117
    iput-object v2, v0, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager$getTimeCycle$1;->L$1:Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    move-result-object p1

    .line 122
    .line 123
    iput-object p1, v0, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager$getTimeCycle$1;->L$2:Ljava/lang/Object;

    .line 124
    const/4 p1, 0x0

    .line 125
    .line 126
    iput p1, v0, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager$getTimeCycle$1;->I$0:I

    .line 127
    .line 128
    iput v3, v0, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager$getTimeCycle$1;->label:I

    .line 129
    .line 130
    .line 131
    invoke-static {v4, v0}, Lkotlinx/coroutines/flow/g;->f0(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 132
    move-result-object p1

    .line 133
    .line 134
    if-ne p1, v1, :cond_4

    .line 135
    return-object v1

    .line 136
    .line 137
    :cond_4
    :goto_1
    check-cast p1, Ljava/util/List;

    .line 138
    .line 139
    if-nez p1, :cond_5

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0}, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager;->d()Ljava/util/List;

    .line 143
    move-result-object p1

    .line 144
    .line 145
    :cond_5
    sget-object v0, Lhf/h;->a:Lhf/h;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Lhf/h;->l()Z

    .line 149
    move-result v0

    .line 150
    .line 151
    if-eqz v0, :cond_7

    .line 152
    .line 153
    .line 154
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 155
    move-result v0

    .line 156
    .line 157
    if-le v0, v3, :cond_6

    .line 158
    .line 159
    new-instance v0, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager$b;

    .line 160
    .line 161
    .line 162
    invoke-direct {v0}, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager$b;-><init>()V

    .line 163
    .line 164
    .line 165
    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->sortWith(Ljava/util/List;Ljava/util/Comparator;)V

    .line 166
    :cond_6
    return-object p1

    .line 167
    .line 168
    .line 169
    :cond_7
    invoke-virtual {p0, p1}, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager;->j(Ljava/util/List;)Ljava/util/List;

    .line 170
    move-result-object p1

    .line 171
    return-object p1
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
.end method

.method public final j(Ljava/util/List;)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    move-result v1

    .line 9
    .line 10
    if-eqz v1, :cond_a

    .line 11
    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    check-cast v1, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;->getTag()I

    .line 20
    move-result v1

    .line 21
    .line 22
    const/16 v2, 0xb

    .line 23
    .line 24
    if-ne v1, v2, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 28
    .line 29
    new-instance v0, Ljava/util/ArrayList;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager;->g()Ljava/util/List;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    .line 36
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 40
    move-result v1

    .line 41
    const/4 v3, 0x1

    .line 42
    .line 43
    if-le v1, v3, :cond_1

    .line 44
    .line 45
    new-instance v1, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager$d;

    .line 46
    .line 47
    .line 48
    invoke-direct {v1}, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager$d;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->sortWith(Ljava/util/List;Ljava/util/Comparator;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 55
    move-result v1

    .line 56
    .line 57
    if-le v1, v3, :cond_2

    .line 58
    .line 59
    new-instance v1, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager$e;

    .line 60
    .line 61
    .line 62
    invoke-direct {v1}, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager$e;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->sortWith(Ljava/util/List;Ljava/util/Comparator;)V

    .line 66
    .line 67
    .line 68
    :cond_2
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 69
    move-result-object v1

    .line 70
    .line 71
    check-cast v1, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;

    .line 72
    .line 73
    .line 74
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 75
    move-result v4

    .line 76
    const/4 v5, 0x0

    .line 77
    move v6, v5

    .line 78
    .line 79
    :goto_0
    if-ge v6, v4, :cond_8

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 83
    move-result-object v7

    .line 84
    .line 85
    check-cast v7, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v7}, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;->getTag()I

    .line 89
    move-result v8

    .line 90
    .line 91
    if-ne v8, v2, :cond_3

    .line 92
    goto :goto_2

    .line 93
    .line 94
    :cond_3
    if-eqz v1, :cond_4

    .line 95
    .line 96
    .line 97
    invoke-virtual {v7}, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;->getTag()I

    .line 98
    move-result v8

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1}, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;->getTag()I

    .line 102
    move-result v9

    .line 103
    .line 104
    if-ge v8, v9, :cond_4

    .line 105
    .line 106
    .line 107
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-interface {p1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 111
    goto :goto_3

    .line 112
    .line 113
    .line 114
    :cond_4
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 115
    move-result v8

    .line 116
    move v9, v5

    .line 117
    .line 118
    :goto_1
    if-ge v9, v8, :cond_7

    .line 119
    .line 120
    .line 121
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 122
    move-result-object v10

    .line 123
    .line 124
    check-cast v10, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v10}, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;->getTag()I

    .line 128
    move-result v11

    .line 129
    .line 130
    .line 131
    invoke-virtual {v7}, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;->getTag()I

    .line 132
    move-result v12

    .line 133
    .line 134
    if-ne v11, v12, :cond_5

    .line 135
    goto :goto_2

    .line 136
    .line 137
    .line 138
    :cond_5
    invoke-virtual {v7}, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;->getTag()I

    .line 139
    move-result v11

    .line 140
    .line 141
    .line 142
    invoke-virtual {v10}, Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;->getTag()I

    .line 143
    move-result v10

    .line 144
    .line 145
    if-le v11, v10, :cond_6

    .line 146
    .line 147
    .line 148
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    invoke-interface {p1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 152
    goto :goto_3

    .line 153
    .line 154
    :cond_6
    add-int/lit8 v9, v9, 0x1

    .line 155
    goto :goto_1

    .line 156
    .line 157
    :cond_7
    :goto_2
    add-int/lit8 v6, v6, 0x1

    .line 158
    goto :goto_0

    .line 159
    .line 160
    .line 161
    :cond_8
    :goto_3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 162
    move-result v0

    .line 163
    .line 164
    if-le v0, v3, :cond_9

    .line 165
    .line 166
    new-instance v0, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager$c;

    .line 167
    .line 168
    .line 169
    invoke-direct {v0}, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager$c;-><init>()V

    .line 170
    .line 171
    .line 172
    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->sortWith(Ljava/util/List;Ljava/util/Comparator;)V

    .line 173
    .line 174
    .line 175
    :cond_9
    invoke-virtual {p0, p1}, Lcom/kubi/tradebase/business/klineSettings/KLineSettingsManager;->k(Ljava/util/List;)V

    .line 176
    :cond_a
    return-object p1
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
.end method

.method public final k(Ljava/util/List;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "value"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/c;->i(Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    const-string v0, "toJson(...)"

    .line 12
    .line 13
    .line 14
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    const-string v0, "trade"

    .line 17
    .line 18
    const-string v1, "kline_time_cycle"

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1, p1}, Ly70/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ly70/e;

    .line 22
    return-void
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
.end method
