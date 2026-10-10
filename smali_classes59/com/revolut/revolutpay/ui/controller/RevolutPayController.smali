.class public Lcom/revolut/revolutpay/ui/controller/RevolutPayController;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revolut/revolutpay/ui/controller/RevolutPayController$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0010\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0004\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0004\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0004\u00a2\u0006\u0004\u0008\u0015\u0010\u0008J\'\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\'\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\'\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010+\u00a8\u0006-"
    }
    d2 = {
        "Lcom/revolut/revolutpay/ui/controller/RevolutPayController;",
        "",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "",
        "h",
        "()V",
        "Lha0/a;",
        "orderResultCallback",
        "j",
        "(Lha0/a;)V",
        "",
        "orderToken",
        "k",
        "(Ljava/lang/String;)V",
        "Landroidx/lifecycle/Lifecycle;",
        "lifecycle",
        "f",
        "(Landroidx/lifecycle/Lifecycle;)V",
        "g",
        "sessionToken",
        "merchantPublicKey",
        "",
        "requestShipping",
        "i",
        "(Ljava/lang/String;Ljava/lang/String;Z)V",
        "l",
        "m",
        "a",
        "Landroid/content/Context;",
        "b",
        "Landroidx/lifecycle/Lifecycle;",
        "c",
        "Lha0/a;",
        "d",
        "Ljava/lang/String;",
        "Lpa0/b;",
        "e",
        "Lpa0/b;",
        "navigator",
        "Lcom/revolut/revolutpay/polling/b;",
        "Lcom/revolut/revolutpay/polling/b;",
        "poller",
        "revolut_pay_sdk_2_0_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:Landroidx/lifecycle/Lifecycle;

.field public c:Lha0/a;

.field public d:Ljava/lang/String;

.field public final e:Lpa0/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public f:Lcom/revolut/revolutpay/polling/b;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "context"

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
    iput-object p1, p0, Lcom/revolut/revolutpay/ui/controller/RevolutPayController;->a:Landroid/content/Context;

    .line 11
    .line 12
    new-instance v0, Lpa0/b;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, p1}, Lpa0/b;-><init>(Landroid/content/Context;)V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/revolut/revolutpay/ui/controller/RevolutPayController;->e:Lpa0/b;

    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static final synthetic a(Lcom/revolut/revolutpay/ui/controller/RevolutPayController;)Landroidx/lifecycle/Lifecycle;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/revolut/revolutpay/ui/controller/RevolutPayController;->b:Landroidx/lifecycle/Lifecycle;

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
.end method

.method public static final synthetic b(Lcom/revolut/revolutpay/ui/controller/RevolutPayController;)Lha0/a;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/revolut/revolutpay/ui/controller/RevolutPayController;->c:Lha0/a;

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
.end method

.method public static final synthetic c(Lcom/revolut/revolutpay/ui/controller/RevolutPayController;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/revolut/revolutpay/ui/controller/RevolutPayController;->d:Ljava/lang/String;

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
.end method

.method public static final synthetic d(Lcom/revolut/revolutpay/ui/controller/RevolutPayController;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lcom/revolut/revolutpay/ui/controller/RevolutPayController;->i(Ljava/lang/String;Ljava/lang/String;Z)V

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
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
.end method

.method public static final synthetic e(Lcom/revolut/revolutpay/ui/controller/RevolutPayController;Lcom/revolut/revolutpay/polling/b;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/revolut/revolutpay/ui/controller/RevolutPayController;->f:Lcom/revolut/revolutpay/polling/b;

    .line 3
    return-void
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
.end method


# virtual methods
.method public final f(Landroidx/lifecycle/Lifecycle;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/Lifecycle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "lifecycle"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/revolut/revolutpay/ui/controller/RevolutPayController;->b:Landroidx/lifecycle/Lifecycle;

    .line 8
    return-void
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
.end method

.method public final g()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/revolut/revolutpay/ui/controller/RevolutPayController;->d:Ljava/lang/String;

    .line 3
    .line 4
    if-eqz v0, :cond_4

    .line 5
    .line 6
    sget-object v0, Loa0/a;->a:Loa0/a;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Loa0/a;->e()Ljava/lang/String;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    if-eqz v1, :cond_3

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Loa0/a;->f()Z

    .line 16
    move-result v0

    .line 17
    .line 18
    iget-object v2, p0, Lcom/revolut/revolutpay/ui/controller/RevolutPayController;->b:Landroidx/lifecycle/Lifecycle;

    .line 19
    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    iget-object v2, p0, Lcom/revolut/revolutpay/ui/controller/RevolutPayController;->c:Lha0/a;

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    sget-object v2, Lcom/revolut/revolutpay/data/a;->a:Lcom/revolut/revolutpay/data/a;

    .line 27
    .line 28
    iget-object v3, p0, Lcom/revolut/revolutpay/ui/controller/RevolutPayController;->d:Ljava/lang/String;

    .line 29
    .line 30
    if-nez v3, :cond_0

    .line 31
    .line 32
    .line 33
    const-string/jumbo v3, "orderToken"

    .line 34
    .line 35
    .line 36
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 37
    const/4 v3, 0x0

    .line 38
    .line 39
    :cond_0
    new-instance v4, Lcom/revolut/revolutpay/ui/controller/RevolutPayController$continueConfirmationFlow$7;

    .line 40
    .line 41
    .line 42
    invoke-direct {v4, p0, v1, v0}, Lcom/revolut/revolutpay/ui/controller/RevolutPayController$continueConfirmationFlow$7;-><init>(Lcom/revolut/revolutpay/ui/controller/RevolutPayController;Ljava/lang/String;Z)V

    .line 43
    .line 44
    new-instance v0, Lcom/revolut/revolutpay/ui/controller/RevolutPayController$continueConfirmationFlow$8;

    .line 45
    .line 46
    .line 47
    invoke-direct {v0, p0}, Lcom/revolut/revolutpay/ui/controller/RevolutPayController$continueConfirmationFlow$8;-><init>(Lcom/revolut/revolutpay/ui/controller/RevolutPayController;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v3, v4, v0}, Lcom/revolut/revolutpay/data/a;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 51
    return-void

    .line 52
    .line 53
    .line 54
    :cond_1
    invoke-virtual {p0}, Lcom/revolut/revolutpay/ui/controller/RevolutPayController;->h()V

    .line 55
    .line 56
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 57
    .line 58
    const-string v1, "Need to call [setOrderResultCallback] to receive the result of the order processing"

    .line 59
    .line 60
    .line 61
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 62
    throw v0

    .line 63
    .line 64
    .line 65
    :cond_2
    invoke-virtual {p0}, Lcom/revolut/revolutpay/ui/controller/RevolutPayController;->h()V

    .line 66
    .line 67
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 68
    .line 69
    const-string v1, "Need to pass [lifecycle] by calling [attachLifecycle] function call before continuing the confirmation flow"

    .line 70
    .line 71
    .line 72
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 73
    throw v0

    .line 74
    .line 75
    .line 76
    :cond_3
    invoke-virtual {p0}, Lcom/revolut/revolutpay/ui/controller/RevolutPayController;->h()V

    .line 77
    .line 78
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 79
    .line 80
    const-string v1, "Need to pass non-null [merchantPublicKey] in [RevolutPay.init(...)] function call before continuing the confirmation flow"

    .line 81
    .line 82
    .line 83
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 84
    throw v0

    .line 85
    .line 86
    .line 87
    :cond_4
    invoke-virtual {p0}, Lcom/revolut/revolutpay/ui/controller/RevolutPayController;->h()V

    .line 88
    .line 89
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 90
    .line 91
    const-string v1, "Need to call setOrderToken before continuing the confirmation flow"

    .line 92
    .line 93
    .line 94
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 95
    throw v0
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

.method public h()V
    .locals 0

    .line 1
    return-void
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
.end method

.method public final i(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Loa0/a;->a:Loa0/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Loa0/a;->d()Lcom/revolut/revolutpay/api/RevolutPayEnvironment;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    const/4 v0, -0x1

    .line 10
    goto :goto_0

    .line 11
    .line 12
    :cond_0
    sget-object v1, Lcom/revolut/revolutpay/ui/controller/RevolutPayController$a;->$EnumSwitchMapping$0:[I

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 16
    move-result v0

    .line 17
    .line 18
    aget v0, v1, v0

    .line 19
    :goto_0
    const/4 v1, 0x1

    .line 20
    .line 21
    if-eq v0, v1, :cond_2

    .line 22
    const/4 v1, 0x2

    .line 23
    .line 24
    if-eq v0, v1, :cond_1

    .line 25
    return-void

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/revolut/revolutpay/ui/controller/RevolutPayController;->l(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 29
    return-void

    .line 30
    .line 31
    .line 32
    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/revolut/revolutpay/ui/controller/RevolutPayController;->m(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 33
    return-void
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
.end method

.method public final j(Lha0/a;)V
    .locals 1
    .param p1    # Lha0/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "orderResultCallback"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iput-object p1, p0, Lcom/revolut/revolutpay/ui/controller/RevolutPayController;->c:Lha0/a;

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
.end method

.method public final k(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "orderToken"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iput-object p1, p0, Lcom/revolut/revolutpay/ui/controller/RevolutPayController;->d:Ljava/lang/String;

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
.end method

.method public final l(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 12

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "orderToken"

    .line 4
    const/4 v1, 0x0

    .line 5
    .line 6
    :try_start_0
    iget-object v2, p0, Lcom/revolut/revolutpay/ui/controller/RevolutPayController;->e:Lpa0/b;

    .line 7
    .line 8
    new-instance v3, Lcom/revolut/revolutpay/ui/navigator/internal/d;

    .line 9
    .line 10
    sget-object v4, Lcom/revolut/revolutpay/ui/navigator/internal/e;->a:Lcom/revolut/revolutpay/ui/navigator/internal/e;

    .line 11
    .line 12
    iget-object v5, p0, Lcom/revolut/revolutpay/ui/controller/RevolutPayController;->d:Ljava/lang/String;

    .line 13
    .line 14
    if-nez v5, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    move-object v5, v1

    .line 19
    :cond_0
    move-object v6, p1

    .line 20
    move-object v7, p2

    .line 21
    move v8, p3

    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-object v6, p1

    .line 24
    move-object v7, p2

    .line 25
    move v8, p3

    .line 26
    goto :goto_1

    .line 27
    .line 28
    .line 29
    :goto_0
    :try_start_1
    invoke-direct/range {v3 .. v8}, Lcom/revolut/revolutpay/ui/navigator/internal/d;-><init>(Lcom/revolut/revolutpay/ui/navigator/internal/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v3}, Lpa0/b;->f(Lcom/revolut/revolutpay/ui/navigator/internal/g;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 33
    return-void

    .line 34
    .line 35
    :catch_1
    :goto_1
    iget-object p1, p0, Lcom/revolut/revolutpay/ui/controller/RevolutPayController;->e:Lpa0/b;

    .line 36
    move-object v9, v6

    .line 37
    .line 38
    new-instance v6, Lcom/revolut/revolutpay/ui/navigator/internal/d;

    .line 39
    move-object v10, v7

    .line 40
    .line 41
    sget-object v7, Lcom/revolut/revolutpay/ui/navigator/internal/e;->c:Lcom/revolut/revolutpay/ui/navigator/internal/e;

    .line 42
    .line 43
    iget-object p2, p0, Lcom/revolut/revolutpay/ui/controller/RevolutPayController;->d:Ljava/lang/String;

    .line 44
    .line 45
    if-nez p2, :cond_1

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 49
    move v11, v8

    .line 50
    move-object v8, v1

    .line 51
    goto :goto_2

    .line 52
    :cond_1
    move v11, v8

    .line 53
    move-object v8, p2

    .line 54
    .line 55
    .line 56
    :goto_2
    invoke-direct/range {v6 .. v11}, Lcom/revolut/revolutpay/ui/navigator/internal/d;-><init>(Lcom/revolut/revolutpay/ui/navigator/internal/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v6}, Lpa0/b;->f(Lcom/revolut/revolutpay/ui/navigator/internal/g;)V

    .line 60
    return-void
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
.end method

.method public final m(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 7

    .line 1
    .line 2
    sget-object v0, Lcb0/a;->a:Lcb0/a;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/revolut/revolutpay/ui/controller/RevolutPayController;->a:Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    const-string v2, "context.packageManager"

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcb0/a;->b(Landroid/content/pm/PackageManager;)Z

    .line 17
    move-result v0

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    sget-object v0, Lcom/revolut/revolutpay/ui/navigator/internal/e;->b:Lcom/revolut/revolutpay/ui/navigator/internal/e;

    .line 22
    :goto_0
    move-object v2, v0

    .line 23
    goto :goto_1

    .line 24
    .line 25
    :cond_0
    sget-object v0, Lcom/revolut/revolutpay/ui/navigator/internal/e;->c:Lcom/revolut/revolutpay/ui/navigator/internal/e;

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :goto_1
    iget-object v0, p0, Lcom/revolut/revolutpay/ui/controller/RevolutPayController;->e:Lpa0/b;

    .line 29
    .line 30
    new-instance v1, Lcom/revolut/revolutpay/ui/navigator/internal/d;

    .line 31
    .line 32
    iget-object v3, p0, Lcom/revolut/revolutpay/ui/controller/RevolutPayController;->d:Ljava/lang/String;

    .line 33
    .line 34
    if-nez v3, :cond_1

    .line 35
    .line 36
    .line 37
    const-string/jumbo v3, "orderToken"

    .line 38
    .line 39
    .line 40
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 41
    const/4 v3, 0x0

    .line 42
    :cond_1
    move-object v4, p1

    .line 43
    move-object v5, p2

    .line 44
    move v6, p3

    .line 45
    .line 46
    .line 47
    invoke-direct/range {v1 .. v6}, Lcom/revolut/revolutpay/ui/navigator/internal/d;-><init>(Lcom/revolut/revolutpay/ui/navigator/internal/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lpa0/b;->f(Lcom/revolut/revolutpay/ui/navigator/internal/g;)V

    .line 51
    return-void
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
.end method
