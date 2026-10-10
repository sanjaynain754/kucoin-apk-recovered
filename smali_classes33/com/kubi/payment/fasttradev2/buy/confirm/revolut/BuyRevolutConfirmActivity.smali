.class public final Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmActivity;
.super Lcom/kubi/sdk/BaseActivity;
.source "BuyRevolutConfirmActivity.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmActivity$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0008\u001a\u00020\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u0008\u0010\u000c\u001a\u00020\tH\u0002J\u0012\u0010\r\u001a\u00020\t2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0008\u0010\u0010\u001a\u00020\u0011H\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmActivity;",
        "Lcom/kubi/sdk/BaseActivity;",
        "<init>",
        "()V",
        "extraParams",
        "Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;",
        "caller",
        "",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "initFragment",
        "onNewIntent",
        "intent",
        "Landroid/content/Intent;",
        "needHandleActivityNotFoundException",
        "",
        "Companion",
        "PaymentLib_googleRelease"
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
        "SMAP\nBuyRevolutConfirmActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyRevolutConfirmActivity.kt\ncom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmActivity\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,97:1\n44#2,2:98\n48#2,2:100\n44#2,2:102\n*S KotlinDebug\n*F\n+ 1 BuyRevolutConfirmActivity.kt\ncom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmActivity\n*L\n44#1:98,2\n50#1:100,2\n75#1:102,2\n*E\n"
    }
.end annotation


# static fields
.field public static final k:Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmActivity$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public i:Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public j:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmActivity$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmActivity$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmActivity;->k:Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmActivity$Companion;

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/sdk/BaseActivity;-><init>()V

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    iput-object v0, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmActivity;->j:Ljava/lang/String;

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public static synthetic T(Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmActivity;->V(Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmActivity;Landroid/view/View;)V

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
.end method

.method private final U()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    sget v1, Lcom/kubi/otc/R$id;->fragment_container:I

    .line 11
    .line 12
    new-instance v2, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment;

    .line 13
    .line 14
    .line 15
    invoke-direct {v2}, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment;-><init>()V

    .line 16
    .line 17
    new-instance v3, Lcom/kubi/utils/h;

    .line 18
    .line 19
    .line 20
    invoke-direct {v3}, Lcom/kubi/utils/h;-><init>()V

    .line 21
    .line 22
    const-string v4, "data"

    .line 23
    .line 24
    iget-object v5, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmActivity;->i:Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, v4, v5}, Lcom/kubi/utils/h;->e(Ljava/lang/String;Landroid/os/Parcelable;)Lcom/kubi/utils/h;

    .line 28
    move-result-object v3

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 32
    move-result-object v4

    .line 33
    .line 34
    const-string v5, "spm"

    .line 35
    .line 36
    if-eqz v4, :cond_0

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    move-result-object v4

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v4, 0x0

    .line 43
    .line 44
    .line 45
    :goto_0
    invoke-virtual {v3, v5, v4}, Lcom/kubi/utils/h;->h(Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/utils/h;

    .line 46
    move-result-object v3

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Lcom/kubi/utils/h;->a()Landroid/os/Bundle;

    .line 50
    move-result-object v3

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v3}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 54
    .line 55
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 62
    return-void
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
.end method

.method public static final V(Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

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
.end method


# virtual methods
.method public needHandleActivityNotFoundException()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
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
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 9
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/kubi/sdk/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    .line 5
    sget p1, Lcom/kubi/otc/R$layout;->payment_activity_fast_buy_confirm_revolut:I

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/kubi/sdk/BaseActivity;->setContentView(I)V

    .line 9
    .line 10
    sget p1, Lcom/kubi/otc/R$id;->title_bar:I

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    check-cast p1, Lcom/kubi/sdk/widget/TitleBar;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    new-instance v0, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/a;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, p0}, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/a;-><init>(Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmActivity;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, Lcom/kubi/sdk/widget/TitleBar;->setOnNavigationListener(Landroid/view/View$OnClickListener;)V

    .line 27
    :cond_0
    const/4 p1, 0x2

    .line 28
    const/4 v1, 0x0

    .line 29
    .line 30
    .line 31
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    const-string v2, "data"

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v2}, Lcom/kubi/router/utils/RouteExKt;->s(Landroid/content/Intent;Ljava/lang/String;)Landroid/os/Parcelable;

    .line 40
    move-result-object v2

    .line 41
    .line 42
    check-cast v2, Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;

    .line 43
    .line 44
    iput-object v2, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmActivity;->i:Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;

    .line 45
    .line 46
    const-string v2, "data_1"

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    iput-object v0, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmActivity;->j:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    goto :goto_0

    .line 58
    :catch_0
    move-exception v0

    .line 59
    move-object v3, v0

    .line 60
    goto :goto_2

    .line 61
    .line 62
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmActivity;->i:Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;

    .line 63
    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    iget-object v0, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmActivity;->j:Ljava/lang/String;

    .line 67
    .line 68
    sget-object v2, Lvk/s;->a:Lvk/s;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Lvk/s;->L()Ljava/lang/String;

    .line 72
    move-result-object v2

    .line 73
    .line 74
    .line 75
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    move-result v0

    .line 77
    .line 78
    if-nez v0, :cond_2

    .line 79
    goto :goto_1

    .line 80
    .line 81
    .line 82
    :cond_2
    invoke-direct {p0}, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmActivity;->U()V

    .line 83
    return-void

    .line 84
    .line 85
    :cond_3
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    const-string v2, "params is invalid extraParams:"

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    iget-object v2, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmActivity;->i:Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    const-string v2, ",caller:"

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    iget-object v2, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmActivity;->j:Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    move-result-object v4

    .line 113
    .line 114
    new-instance v3, Lcom/kubi/otc/exception/OtcMessage;

    .line 115
    const/4 v7, 0x4

    .line 116
    const/4 v8, 0x0

    .line 117
    .line 118
    const-string v5, "BuyRevolutConfirmActivity"

    .line 119
    const/4 v6, 0x0

    .line 120
    .line 121
    .line 122
    invoke-direct/range {v3 .. v8}, Lcom/kubi/otc/exception/OtcMessage;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 123
    .line 124
    .line 125
    invoke-static {v3, v1, p1, v1}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 129
    return-void

    .line 130
    .line 131
    :goto_2
    new-instance v2, Lcom/kubi/otc/exception/OtcException;

    .line 132
    .line 133
    const/16 v7, 0x8

    .line 134
    const/4 v8, 0x0

    .line 135
    .line 136
    const-string v4, "RevolutConfirmActivity"

    .line 137
    const/4 v5, 0x0

    .line 138
    const/4 v6, 0x0

    .line 139
    .line 140
    .line 141
    invoke-direct/range {v2 .. v8}, Lcom/kubi/otc/exception/OtcException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 142
    .line 143
    .line 144
    invoke-static {v2, v1, p1, v1}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 148
    return-void
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
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 7
    .param p1    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onNewIntent(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    goto :goto_0

    .line 5
    :catch_0
    move-exception v0

    .line 6
    move-object v1, v0

    .line 7
    .line 8
    new-instance v0, Lcom/kubi/otc/exception/OtcException;

    .line 9
    .line 10
    const/16 v5, 0x8

    .line 11
    const/4 v6, 0x0

    .line 12
    .line 13
    const-string v2, "BuyRevolutConfirmActivity"

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    .line 17
    .line 18
    invoke-direct/range {v0 .. v6}, Lcom/kubi/otc/exception/OtcException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 19
    const/4 p1, 0x2

    .line 20
    const/4 v1, 0x0

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1, p1, v1}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 24
    .line 25
    :goto_0
    const-string p1, "revolut"

    .line 26
    .line 27
    const-string v0, "BuyRevolutConfirmActivity onNewIntent"

    .line 28
    .line 29
    .line 30
    invoke-static {p1, v0}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    return-void
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
.end method
