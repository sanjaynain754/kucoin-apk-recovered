.class public final Lcom/revolut/revolutpay/ui/learn_more_activity/e;
.super Lsa0/a;
.source "SourceFile"

# interfaces
.implements Lcom/revolut/revolutpay/ui/learn_more_activity/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revolut/revolutpay/ui/learn_more_activity/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lsa0/a<",
        "Lcom/revolut/revolutpay/ui/learn_more_activity/d;",
        ">;",
        "Lcom/revolut/revolutpay/ui/learn_more_activity/c;"
    }
.end annotation


# static fields
.field public static final f:Lcom/revolut/revolutpay/ui/learn_more_activity/e$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final c:Lpa0/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lqa0/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lcom/revolut/revolutpay/ui/learn_more_activity/LearnMoreActivity$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/revolut/revolutpay/ui/learn_more_activity/e$a;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/revolut/revolutpay/ui/learn_more_activity/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/revolut/revolutpay/ui/learn_more_activity/e;->f:Lcom/revolut/revolutpay/ui/learn_more_activity/e$a;

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
.end method

.method public constructor <init>(Lpa0/b;Lqa0/e;Lcom/revolut/revolutpay/ui/learn_more_activity/LearnMoreActivity$a;)V
    .locals 1
    .param p1    # Lpa0/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lqa0/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/revolut/revolutpay/ui/learn_more_activity/LearnMoreActivity$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "navigator"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string/jumbo v0, "parser"

    .line 10
    .line 11
    .line 12
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    const-string v0, "cashbackData"

    .line 15
    .line 16
    .line 17
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Lsa0/a;-><init>()V

    .line 21
    .line 22
    iput-object p1, p0, Lcom/revolut/revolutpay/ui/learn_more_activity/e;->c:Lpa0/b;

    .line 23
    .line 24
    iput-object p2, p0, Lcom/revolut/revolutpay/ui/learn_more_activity/e;->d:Lqa0/e;

    .line 25
    .line 26
    iput-object p3, p0, Lcom/revolut/revolutpay/ui/learn_more_activity/e;->e:Lcom/revolut/revolutpay/ui/learn_more_activity/LearnMoreActivity$a;

    .line 27
    return-void
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
.method public b(Lza0/b;)V
    .locals 3
    .param p1    # Lza0/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "clickData"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lza0/b;->a()Ljava/lang/String;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    .line 12
    const-string/jumbo v0, "terms_and_conditions"

    .line 13
    .line 14
    .line 15
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    move-result p1

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    iget-object p1, p0, Lcom/revolut/revolutpay/ui/learn_more_activity/e;->c:Lpa0/b;

    .line 21
    .line 22
    new-instance v0, Lcom/revolut/revolutpay/ui/navigator/internal/c;

    .line 23
    .line 24
    iget-object v1, p0, Lcom/revolut/revolutpay/ui/learn_more_activity/e;->d:Lqa0/e;

    .line 25
    .line 26
    const-string v2, "https://www.revolut.com/legal/pay-with-revolut-checkout/"

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v2}, Lqa0/e;->a(Ljava/lang/String;)Landroid/net/Uri;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    .line 33
    invoke-direct {v0, v1}, Lcom/revolut/revolutpay/ui/navigator/internal/c;-><init>(Landroid/net/Uri;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v0}, Lpa0/b;->f(Lcom/revolut/revolutpay/ui/navigator/internal/g;)V

    .line 37
    :cond_0
    return-void
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
.end method

.method public e()V
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lsa0/a;->d()Lsa0/c;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/revolut/revolutpay/ui/learn_more_activity/d;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v1, Lxa0/h;

    .line 11
    .line 12
    sget v2, Lcom/revolut/revolutpay/R$string;->revolut_upsell_widget_learn_more_title:I

    .line 13
    .line 14
    iget-object v3, p0, Lcom/revolut/revolutpay/ui/learn_more_activity/e;->e:Lcom/revolut/revolutpay/ui/learn_more_activity/LearnMoreActivity$a;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v3}, Lcom/revolut/revolutpay/ui/learn_more_activity/LearnMoreActivity$a;->d()Ljava/lang/String;

    .line 18
    move-result-object v3

    .line 19
    .line 20
    .line 21
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 22
    move-result-object v3

    .line 23
    const/4 v5, 0x4

    .line 24
    const/4 v6, 0x0

    .line 25
    const/4 v4, 0x0

    .line 26
    .line 27
    .line 28
    invoke-direct/range {v1 .. v6}, Lxa0/h;-><init>(ILjava/util/List;Lcom/revolut/revolutpay/ui_kit/model/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, v1}, Lcom/revolut/revolutpay/ui/learn_more_activity/d;->v(Lxa0/a;)V

    .line 32
    .line 33
    :cond_0
    new-instance v2, Lxa0/h;

    .line 34
    .line 35
    sget v3, Lcom/revolut/revolutpay/R$string;->revolut_upsell_widget_learn_more_step_one:I

    .line 36
    const/4 v6, 0x6

    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v4, 0x0

    .line 39
    const/4 v5, 0x0

    .line 40
    .line 41
    .line 42
    invoke-direct/range {v2 .. v7}, Lxa0/h;-><init>(ILjava/util/List;Lcom/revolut/revolutpay/ui_kit/model/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 43
    const/4 v0, 0x1

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v0, v2}, Lcom/revolut/revolutpay/ui/learn_more_activity/e;->g(ILxa0/a;)V

    .line 47
    .line 48
    iget-object v1, p0, Lcom/revolut/revolutpay/ui/learn_more_activity/e;->e:Lcom/revolut/revolutpay/ui/learn_more_activity/LearnMoreActivity$a;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Lcom/revolut/revolutpay/ui/learn_more_activity/LearnMoreActivity$a;->f()Z

    .line 52
    move-result v1

    .line 53
    .line 54
    if-eqz v1, :cond_1

    .line 55
    .line 56
    new-instance v2, Lxa0/h;

    .line 57
    .line 58
    sget v3, Lcom/revolut/revolutpay/R$string;->revolut_upsell_widget_learn_more_step_two:I

    .line 59
    const/4 v6, 0x6

    .line 60
    const/4 v7, 0x0

    .line 61
    const/4 v4, 0x0

    .line 62
    const/4 v5, 0x0

    .line 63
    .line 64
    .line 65
    invoke-direct/range {v2 .. v7}, Lxa0/h;-><init>(ILjava/util/List;Lcom/revolut/revolutpay/ui_kit/model/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 66
    const/4 v1, 0x2

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, v1, v2}, Lcom/revolut/revolutpay/ui/learn_more_activity/e;->g(ILxa0/a;)V

    .line 70
    goto :goto_0

    .line 71
    :cond_1
    move v1, v0

    .line 72
    .line 73
    :goto_0
    iget-object v2, p0, Lcom/revolut/revolutpay/ui/learn_more_activity/e;->e:Lcom/revolut/revolutpay/ui/learn_more_activity/LearnMoreActivity$a;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2}, Lcom/revolut/revolutpay/ui/learn_more_activity/LearnMoreActivity$a;->e()Ljava/lang/String;

    .line 77
    move-result-object v2

    .line 78
    .line 79
    if-eqz v2, :cond_2

    .line 80
    add-int/2addr v1, v0

    .line 81
    .line 82
    new-instance v3, Lxa0/h;

    .line 83
    .line 84
    sget v4, Lcom/revolut/revolutpay/R$string;->revolut_upsell_widget_learn_more_step_three:I

    .line 85
    .line 86
    .line 87
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 88
    move-result-object v5

    .line 89
    const/4 v7, 0x4

    .line 90
    const/4 v8, 0x0

    .line 91
    const/4 v6, 0x0

    .line 92
    .line 93
    .line 94
    invoke-direct/range {v3 .. v8}, Lxa0/h;-><init>(ILjava/util/List;Lcom/revolut/revolutpay/ui_kit/model/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, v1, v3}, Lcom/revolut/revolutpay/ui/learn_more_activity/e;->g(ILxa0/a;)V

    .line 98
    :cond_2
    return-void
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

.method public f()V
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

.method public final g(ILxa0/a;)V
    .locals 15

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lsa0/a;->d()Lsa0/c;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/revolut/revolutpay/ui/learn_more_activity/d;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v1, Lcom/revolut/revolutpay/ui_kit/delegate/a$b;

    .line 11
    .line 12
    new-instance v2, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    const-string v3, "LEARN_MOTE_STEP_"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    move/from16 v3, p1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    new-instance v5, Lcom/revolut/revolutpay/ui_kit/delegate/a$a$a;

    .line 32
    .line 33
    .line 34
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 35
    move-result-object v7

    .line 36
    .line 37
    new-instance v6, Lxa0/g;

    .line 38
    .line 39
    const/16 v13, 0x8

    .line 40
    const/4 v14, 0x0

    .line 41
    const/4 v8, -0x1

    .line 42
    .line 43
    const/high16 v9, -0x1000000

    .line 44
    const/4 v10, 0x0

    .line 45
    .line 46
    const/16 v11, 0xe

    .line 47
    .line 48
    const/16 v12, 0x18

    .line 49
    .line 50
    .line 51
    invoke-direct/range {v6 .. v14}, Lxa0/g;-><init>(Ljava/lang/String;IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 52
    .line 53
    .line 54
    invoke-direct {v5, v6}, Lcom/revolut/revolutpay/ui_kit/delegate/a$a$a;-><init>(Lxa0/c;)V

    .line 55
    const/4 v7, 0x4

    .line 56
    const/4 v8, 0x0

    .line 57
    const/4 v4, 0x0

    .line 58
    const/4 v6, 0x0

    .line 59
    .line 60
    move-object/from16 v3, p2

    .line 61
    .line 62
    .line 63
    invoke-direct/range {v1 .. v8}, Lcom/revolut/revolutpay/ui_kit/delegate/a$b;-><init>(Ljava/lang/String;Lxa0/a;Lxa0/a;Lcom/revolut/revolutpay/ui_kit/delegate/a$a;Lxa0/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 64
    .line 65
    .line 66
    invoke-interface {v0, v1}, Lcom/revolut/revolutpay/ui/learn_more_activity/d;->s(Lcom/revolut/revolutpay/ui_kit/delegate/a$b;)V

    .line 67
    :cond_0
    return-void
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
