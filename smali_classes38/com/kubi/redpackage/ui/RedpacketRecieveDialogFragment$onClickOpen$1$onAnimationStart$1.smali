.class final Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "RedpacketRecieveDialogFragment.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1;->onAnimationStart(Landroid/view/animation/Animation;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/m0;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.kubi.redpackage.ui.RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1"
    f = "RedpacketRecieveDialogFragment.kt"
    i = {}
    l = {
        0xc4
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRedpacketRecieveDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedpacketRecieveDialogFragment.kt\ncom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,320:1\n25#2:321\n26#2:323\n1#3:322\n*S KotlinDebug\n*F\n+ 1 RedpacketRecieveDialogFragment.kt\ncom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1\n*L\n204#1:321\n204#1:323\n204#1:322\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $animation:Landroid/view/animation/Animation;

.field final synthetic $helper:Lcom/kubi/resources/dialog/DialogFragmentHelper;

.field final synthetic $packetInfo:Lcom/kubi/redpackage/entity/RedpacketInfoEntity;

.field final synthetic $startTimeOpen:J

.field final synthetic $tvOpen:Landroid/widget/TextView;

.field final synthetic $tvTips:Landroid/widget/TextView;

.field label:I

.field final synthetic this$0:Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment;


# direct methods
.method public constructor <init>(Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment;Landroid/view/animation/Animation;Lcom/kubi/redpackage/entity/RedpacketInfoEntity;Lcom/kubi/resources/dialog/DialogFragmentHelper;Landroid/widget/TextView;Landroid/widget/TextView;JLkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment;",
            "Landroid/view/animation/Animation;",
            "Lcom/kubi/redpackage/entity/RedpacketInfoEntity;",
            "Lcom/kubi/resources/dialog/DialogFragmentHelper;",
            "Landroid/widget/TextView;",
            "Landroid/widget/TextView;",
            "J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;->this$0:Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;->$animation:Landroid/view/animation/Animation;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;->$packetInfo:Lcom/kubi/redpackage/entity/RedpacketInfoEntity;

    .line 7
    .line 8
    iput-object p4, p0, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;->$helper:Lcom/kubi/resources/dialog/DialogFragmentHelper;

    .line 9
    .line 10
    iput-object p5, p0, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;->$tvOpen:Landroid/widget/TextView;

    .line 11
    .line 12
    iput-object p6, p0, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;->$tvTips:Landroid/widget/TextView;

    .line 13
    .line 14
    iput-wide p7, p0, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;->$startTimeOpen:J

    .line 15
    const/4 p1, 0x2

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, p1, p9}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;->this$0:Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;->$animation:Landroid/view/animation/Animation;

    .line 7
    .line 8
    iget-object v3, p0, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;->$packetInfo:Lcom/kubi/redpackage/entity/RedpacketInfoEntity;

    .line 9
    .line 10
    iget-object v4, p0, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;->$helper:Lcom/kubi/resources/dialog/DialogFragmentHelper;

    .line 11
    .line 12
    iget-object v5, p0, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;->$tvOpen:Landroid/widget/TextView;

    .line 13
    .line 14
    iget-object v6, p0, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;->$tvTips:Landroid/widget/TextView;

    .line 15
    .line 16
    iget-wide v7, p0, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;->$startTimeOpen:J

    .line 17
    move-object v9, p2

    .line 18
    .line 19
    .line 20
    invoke-direct/range {v0 .. v9}, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;-><init>(Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment;Landroid/view/animation/Animation;Lcom/kubi/redpackage/entity/RedpacketInfoEntity;Lcom/kubi/resources/dialog/DialogFragmentHelper;Landroid/widget/TextView;Landroid/widget/TextView;JLkotlin/coroutines/Continuation;)V

    .line 21
    return-object v0
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
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/m0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;->invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/m0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    iget v2, v0, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;->label:I

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    const/4 v5, 0x0

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    if-ne v2, v4, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 19
    .line 20
    move-object/from16 v2, p1

    .line 21
    goto :goto_0

    .line 22
    .line 23
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    throw v1

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 33
    .line 34
    iget-object v2, v0, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;->this$0:Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment;

    .line 35
    .line 36
    .line 37
    invoke-static {v2}, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment;->v4(Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment;)Lcom/kubi/redpackage/a;

    .line 38
    move-result-object v2

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lcom/kubi/redpackage/RedPackageHelperKt;->d()Ljava/lang/String;

    .line 42
    move-result-object v6

    .line 43
    .line 44
    .line 45
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    move-result-object v6

    .line 47
    .line 48
    iget-object v7, v0, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;->this$0:Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment;

    .line 49
    .line 50
    .line 51
    invoke-static {v7}, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment;->w4(Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment;)Ljava/lang/String;

    .line 52
    move-result-object v7

    .line 53
    .line 54
    if-nez v7, :cond_2

    .line 55
    .line 56
    const-string v7, ""

    .line 57
    .line 58
    .line 59
    :cond_2
    invoke-interface {v2, v6, v7}, Lcom/kubi/redpackage/a;->i(Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/e;

    .line 60
    move-result-object v2

    .line 61
    .line 62
    new-instance v6, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1$1;

    .line 63
    .line 64
    iget-object v7, v0, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;->$animation:Landroid/view/animation/Animation;

    .line 65
    .line 66
    iget-object v8, v0, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;->$packetInfo:Lcom/kubi/redpackage/entity/RedpacketInfoEntity;

    .line 67
    .line 68
    iget-object v9, v0, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;->$helper:Lcom/kubi/resources/dialog/DialogFragmentHelper;

    .line 69
    .line 70
    .line 71
    invoke-direct {v6, v7, v8, v9, v5}, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1$1;-><init>(Landroid/view/animation/Animation;Lcom/kubi/redpackage/entity/RedpacketInfoEntity;Lcom/kubi/resources/dialog/DialogFragmentHelper;Lkotlin/coroutines/Continuation;)V

    .line 72
    .line 73
    iput v4, v0, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;->label:I

    .line 74
    .line 75
    .line 76
    invoke-static {v2, v3, v6, v0}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->d(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 77
    move-result-object v2

    .line 78
    .line 79
    if-ne v2, v1, :cond_3

    .line 80
    return-object v1

    .line 81
    .line 82
    :cond_3
    :goto_0
    check-cast v2, Lcom/kubi/network/retrofit/utils/f;

    .line 83
    .line 84
    iget-object v1, v0, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;->$animation:Landroid/view/animation/Animation;

    .line 85
    .line 86
    iget-object v6, v0, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;->this$0:Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment;

    .line 87
    .line 88
    iget-object v8, v0, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;->$packetInfo:Lcom/kubi/redpackage/entity/RedpacketInfoEntity;

    .line 89
    .line 90
    iget-object v9, v0, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;->$helper:Lcom/kubi/resources/dialog/DialogFragmentHelper;

    .line 91
    .line 92
    iget-object v10, v0, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;->$tvOpen:Landroid/widget/TextView;

    .line 93
    .line 94
    iget-object v11, v0, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;->$tvTips:Landroid/widget/TextView;

    .line 95
    .line 96
    iget-wide v12, v0, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1;->$startTimeOpen:J

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2}, Lcom/kubi/network/retrofit/utils/f;->b()Ljava/lang/Throwable;

    .line 100
    move-result-object v2

    .line 101
    .line 102
    if-eqz v2, :cond_8

    .line 103
    .line 104
    if-eqz v1, :cond_4

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1}, Landroid/view/animation/Animation;->cancel()V

    .line 108
    .line 109
    :cond_4
    const/16 v18, 0x9

    .line 110
    .line 111
    const/16 v19, 0x0

    .line 112
    const/4 v14, 0x0

    .line 113
    const/4 v15, -0x1

    .line 114
    .line 115
    const-string v16, "error"

    .line 116
    .line 117
    const/16 v17, 0x0

    .line 118
    .line 119
    .line 120
    invoke-static/range {v14 .. v19}, Lcom/kubi/redpackage/RedPackageHelperKt;->j(Ljava/lang/String;ILjava/lang/String;ZILjava/lang/Object;)Lorg/json/JSONObject;

    .line 121
    move-result-object v21

    .line 122
    .line 123
    const/16 v24, 0x4

    .line 124
    .line 125
    const/16 v25, 0x0

    .line 126
    .line 127
    const-string v20, "com.kubi.redpackage_event:H5Result"

    .line 128
    .line 129
    const-wide/16 v22, 0x0

    .line 130
    .line 131
    .line 132
    invoke-static/range {v20 .. v25}, Lcom/kubi/event/api/a;->d(Ljava/lang/String;Ljava/lang/Object;JILjava/lang/Object;)V

    .line 133
    .line 134
    instance-of v1, v2, Lcom/kubi/network/retrofit/exception/ApiException;

    .line 135
    .line 136
    if-eqz v1, :cond_5

    .line 137
    move-object v7, v2

    .line 138
    .line 139
    check-cast v7, Lcom/kubi/network/retrofit/exception/ApiException;

    .line 140
    .line 141
    .line 142
    invoke-static/range {v6 .. v13}, Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment;->x4(Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment;Lcom/kubi/network/retrofit/exception/ApiException;Lcom/kubi/redpackage/entity/RedpacketInfoEntity;Lcom/kubi/resources/dialog/DialogFragmentHelper;Landroid/widget/TextView;Landroid/widget/TextView;J)V

    .line 143
    goto :goto_1

    .line 144
    .line 145
    :cond_5
    new-instance v4, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 149
    .line 150
    sget v7, Lcom/kubi/redpackage/R$string;->network_error:I

    .line 151
    .line 152
    .line 153
    invoke-virtual {v6, v7}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 154
    move-result-object v6

    .line 155
    .line 156
    .line 157
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 161
    move-result-object v6

    .line 162
    .line 163
    .line 164
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    move-result-object v4

    .line 169
    .line 170
    new-array v3, v3, [Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    invoke-static {v4, v3}, Lcom/kubi/utils/ToastCompat;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    .line 175
    :goto_1
    sget-object v6, Lcom/kubi/redpackage/utils/RedPkgCategory;->RECEIVE_RESULT:Lcom/kubi/redpackage/utils/RedPkgCategory;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 179
    move-result-object v3

    .line 180
    .line 181
    const-string v4, "--"

    .line 182
    .line 183
    .line 184
    invoke-static {v3, v4}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 185
    move-result-object v8

    .line 186
    .line 187
    if-eqz v1, :cond_6

    .line 188
    .line 189
    check-cast v2, Lcom/kubi/network/retrofit/exception/ApiException;

    .line 190
    goto :goto_2

    .line 191
    :cond_6
    move-object v2, v5

    .line 192
    .line 193
    :goto_2
    if-eqz v2, :cond_7

    .line 194
    .line 195
    iget-object v5, v2, Lcom/kubi/network/retrofit/exception/ApiException;->code:Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    :cond_7
    invoke-static {v5, v4}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 199
    move-result-object v9

    .line 200
    const/4 v10, 0x1

    .line 201
    const/4 v11, 0x0

    .line 202
    const/4 v7, 0x0

    .line 203
    .line 204
    .line 205
    invoke-static/range {v6 .. v11}, Lzv/a;->d(Lcom/kubi/redpackage/utils/RedPkgCategory;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 206
    .line 207
    :cond_8
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 208
    return-object v1
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
    .line 373
    .line 374
.end method
