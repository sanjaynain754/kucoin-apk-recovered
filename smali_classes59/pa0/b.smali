.class public final Lpa0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpa0/b$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
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
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 14
    .line 15
    iput-object v0, p0, Lpa0/b;->a:Ljava/lang/ref/WeakReference;

    .line 16
    return-void
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

.method public static synthetic a(Lpa0/b;Landroid/content/Context;Lcom/revolut/revolutpay/ui/navigator/internal/g;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lpa0/b;->g(Lpa0/b;Landroid/content/Context;Lcom/revolut/revolutpay/ui/navigator/internal/g;)V

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
.end method

.method public static final g(Lpa0/b;Landroid/content/Context;Lcom/revolut/revolutpay/ui/navigator/internal/g;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "this$0"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    const-string v0, "$context"

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    const-string v0, "$command"

    .line 14
    .line 15
    .line 16
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1, p2}, Lpa0/b;->e(Landroid/content/Context;Lcom/revolut/revolutpay/ui/navigator/internal/g;)V

    .line 20
    return-void
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
.end method


# virtual methods
.method public final b(Landroid/content/Context;Lcom/revolut/revolutpay/ui/navigator/internal/b;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/revolut/revolutpay/ui/navigator/internal/b;->i()Lcom/revolut/revolutpay/ui/navigator/internal/a;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    instance-of v0, v0, Lcom/revolut/revolutpay/ui/navigator/internal/f;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Landroid/content/Intent;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Lcom/revolut/revolutpay/ui/navigator/internal/b;->i()Lcom/revolut/revolutpay/ui/navigator/internal/a;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    check-cast v1, Lcom/revolut/revolutpay/ui/navigator/internal/f;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/revolut/revolutpay/ui/navigator/internal/f;->b()Ljava/lang/Class;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2}, Lcom/revolut/revolutpay/ui/navigator/internal/b;->k()I

    .line 27
    move-result v1

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1}, Lna0/a;->a(Landroid/content/Intent;I)Landroid/content/Intent;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2}, Lcom/revolut/revolutpay/ui/navigator/internal/b;->h()Ljava/lang/String;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2}, Lcom/revolut/revolutpay/ui/navigator/internal/b;->g()Landroid/os/Parcelable;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    .line 42
    invoke-static {v0, v1, v2}, Lna0/a;->c(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2}, Lcom/revolut/revolutpay/ui/navigator/internal/b;->j()Ljava/util/Map;

    .line 47
    move-result-object p2

    .line 48
    .line 49
    .line 50
    invoke-static {v0, p2}, Lna0/a;->d(Landroid/content/Intent;Ljava/util/Map;)Landroid/content/Intent;

    .line 51
    move-result-object p2

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 55
    return-void

    .line 56
    .line 57
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 58
    .line 59
    .line 60
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 61
    throw p1
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
.end method

.method public final c(Landroid/content/Context;Lcom/revolut/revolutpay/ui/navigator/internal/c;)V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Landroid/content/Intent;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2}, Lcom/revolut/revolutpay/ui/navigator/internal/c;->b()Landroid/net/Uri;

    .line 6
    move-result-object p2

    .line 7
    .line 8
    const-string v1, "android.intent.action.VIEW"

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

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
.end method

.method public final d(Landroid/content/Context;Lcom/revolut/revolutpay/ui/navigator/internal/d;)V
    .locals 7

    .line 1
    .line 2
    sget-object v0, Lqa0/c;->a:Lqa0/c;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2}, Lcom/revolut/revolutpay/ui/navigator/internal/d;->j()Ljava/lang/String;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, Lcom/revolut/revolutpay/ui/navigator/internal/d;->i()Ljava/lang/String;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Lcom/revolut/revolutpay/ui/navigator/internal/d;->g()Ljava/lang/String;

    .line 14
    move-result-object v3

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Lcom/revolut/revolutpay/ui/navigator/internal/d;->h()Z

    .line 18
    move-result v4

    .line 19
    .line 20
    sget-object v5, Lcb0/a;->a:Lcb0/a;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v5, p1}, Lcb0/a;->a(Landroid/content/Context;)Ljava/util/Locale;

    .line 24
    move-result-object v5

    .line 25
    .line 26
    .line 27
    invoke-virtual {v5}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 28
    move-result-object v5

    .line 29
    .line 30
    const-string v6, "context.getLocale().language"

    .line 31
    .line 32
    .line 33
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual/range {v0 .. v5}, Lqa0/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Landroid/net/Uri;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2}, Lcom/revolut/revolutpay/ui/navigator/internal/d;->f()Lcom/revolut/revolutpay/ui/navigator/internal/e;

    .line 41
    move-result-object p2

    .line 42
    .line 43
    sget-object v1, Lpa0/b$a;->a:[I

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 47
    move-result p2

    .line 48
    .line 49
    aget p2, v1, p2

    .line 50
    const/4 v1, 0x1

    .line 51
    .line 52
    const-string v2, "android.intent.action.VIEW"

    .line 53
    .line 54
    if-eq p2, v1, :cond_2

    .line 55
    const/4 v1, 0x2

    .line 56
    .line 57
    if-eq p2, v1, :cond_1

    .line 58
    const/4 v1, 0x3

    .line 59
    .line 60
    if-ne p2, v1, :cond_0

    .line 61
    .line 62
    new-instance p2, Landroid/content/Intent;

    .line 63
    .line 64
    const-class v1, Lcom/revolut/revolutpay/ui/webview/WebViewConfirmationActivity;

    .line 65
    .line 66
    .line 67
    invoke-direct {p2, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 68
    .line 69
    .line 70
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 71
    move-result-object v0

    .line 72
    .line 73
    const-string v1, "CONFIRMATION_URL_PARAM"

    .line 74
    .line 75
    .line 76
    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 77
    move-result-object v0

    .line 78
    .line 79
    sget-object v1, Loa0/a;->a:Loa0/a;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Loa0/a;->g()Landroid/net/Uri;

    .line 83
    move-result-object v1

    .line 84
    .line 85
    .line 86
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 87
    move-result-object v1

    .line 88
    .line 89
    const-string v2, "RETURN_URL_PARAM"

    .line 90
    .line 91
    .line 92
    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 93
    move-result-object v1

    .line 94
    .line 95
    .line 96
    filled-new-array {v0, v1}, [Lkotlin/Pair;

    .line 97
    move-result-object v0

    .line 98
    .line 99
    .line 100
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    .line 101
    move-result-object v0

    .line 102
    .line 103
    .line 104
    invoke-static {p2, v0}, Lna0/a;->d(Landroid/content/Intent;Ljava/util/Map;)Landroid/content/Intent;

    .line 105
    move-result-object p2

    .line 106
    goto :goto_0

    .line 107
    .line 108
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 109
    .line 110
    .line 111
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 112
    throw p1

    .line 113
    .line 114
    :cond_1
    new-instance p2, Landroid/content/Intent;

    .line 115
    .line 116
    const-class v1, Lcom/revolut/revolutpay/ui/sandbox/SandboxConfirmationActivity;

    .line 117
    .line 118
    .line 119
    invoke-direct {p2, v2, v0, p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;Landroid/content/Context;Ljava/lang/Class;)V

    .line 120
    goto :goto_0

    .line 121
    .line 122
    :cond_2
    new-instance p2, Landroid/content/Intent;

    .line 123
    .line 124
    .line 125
    invoke-direct {p2, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 126
    .line 127
    const-string v0, "com.revolut.revolut"

    .line 128
    .line 129
    .line 130
    invoke-static {p2, v0}, Lna0/a;->b(Landroid/content/Intent;Ljava/lang/String;)Landroid/content/Intent;

    .line 131
    move-result-object p2

    .line 132
    .line 133
    .line 134
    :goto_0
    invoke-virtual {p1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 135
    return-void
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
.end method

.method public final e(Landroid/content/Context;Lcom/revolut/revolutpay/ui/navigator/internal/g;)V
    .locals 1

    .line 1
    .line 2
    instance-of v0, p2, Lcom/revolut/revolutpay/ui/navigator/internal/c;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p2, Lcom/revolut/revolutpay/ui/navigator/internal/c;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1, p2}, Lpa0/b;->c(Landroid/content/Context;Lcom/revolut/revolutpay/ui/navigator/internal/c;)V

    .line 10
    return-void

    .line 11
    .line 12
    :cond_0
    instance-of v0, p2, Lcom/revolut/revolutpay/ui/navigator/internal/b;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    check-cast p2, Lcom/revolut/revolutpay/ui/navigator/internal/b;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1, p2}, Lpa0/b;->b(Landroid/content/Context;Lcom/revolut/revolutpay/ui/navigator/internal/b;)V

    .line 20
    return-void

    .line 21
    .line 22
    :cond_1
    instance-of v0, p2, Lcom/revolut/revolutpay/ui/navigator/internal/d;

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    check-cast p2, Lcom/revolut/revolutpay/ui/navigator/internal/d;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1, p2}, Lpa0/b;->d(Landroid/content/Context;Lcom/revolut/revolutpay/ui/navigator/internal/d;)V

    .line 30
    :cond_2
    return-void
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final f(Lcom/revolut/revolutpay/ui/navigator/internal/g;)V
    .locals 3
    .param p1    # Lcom/revolut/revolutpay/ui/navigator/internal/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "command"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lpa0/b;->a:Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Landroid/content/Context;

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    instance-of v1, v0, Landroid/app/Activity;

    .line 18
    const/4 v2, 0x0

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    move-object v1, v0

    .line 22
    .line 23
    check-cast v1, Landroid/app/Activity;

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v1, v2

    .line 26
    .line 27
    :goto_0
    if-eqz v1, :cond_1

    .line 28
    move-object v1, v0

    .line 29
    .line 30
    check-cast v1, Landroid/app/Activity;

    .line 31
    .line 32
    new-instance v2, Lpa0/a;

    .line 33
    .line 34
    .line 35
    invoke-direct {v2, p0, v0, p1}, Lpa0/a;-><init>(Lpa0/b;Landroid/content/Context;Lcom/revolut/revolutpay/ui/navigator/internal/g;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 39
    .line 40
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 41
    .line 42
    :cond_1
    if-nez v2, :cond_2

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v0, p1}, Lpa0/b;->e(Landroid/content/Context;Lcom/revolut/revolutpay/ui/navigator/internal/g;)V

    .line 46
    :cond_2
    return-void
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
.end method
