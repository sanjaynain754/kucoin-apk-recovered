.class public Lcom/kubi/assets/history/InOutHistoryFragment;
.super Lcom/kubi/sdk/base/ui/BasePagingFragment;
.source "InOutHistoryFragment.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/sdk/base/ui/BasePagingFragment<",
        "Lcom/kubi/assets/entity/HistoryRecordEntity;",
        ">;"
    }
.end annotation


# instance fields
.field public Z:Lta/r4;

.field public a0:I

.field public b0:Ljava/lang/String;

.field public c0:Lcom/kubi/assets/h0;

.field public d0:Ljava/lang/String;

.field public e0:Ljava/lang/String;

.field public final f0:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public g0:Lcom/kubi/utils/TimeUtils$b;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;-><init>()V

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    iput-object v0, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->b0:Ljava/lang/String;

    .line 8
    .line 9
    const-string v1, "ALL"

    .line 10
    .line 11
    iput-object v1, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->d0:Ljava/lang/String;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->e0:Ljava/lang/String;

    .line 14
    .line 15
    new-instance v0, Ljava/util/HashMap;

    .line 16
    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 19
    .line 20
    iput-object v0, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->f0:Ljava/util/HashMap;

    .line 21
    .line 22
    new-instance v0, Lcom/kubi/utils/TimeUtils$b;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0}, Lcom/kubi/utils/TimeUtils$b;-><init>()V

    .line 26
    .line 27
    iput-object v0, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->g0:Lcom/kubi/utils/TimeUtils$b;

    .line 28
    return-void
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
.end method

.method public static synthetic H3(Lcom/kubi/assets/history/InOutHistoryFragment;Lcom/kubi/resources/widget/drop/a;Ljava/util/List;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    const/4 v0, 0x1

    .line 5
    .line 6
    .line 7
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    check-cast v1, Lcom/kubi/resources/widget/drop/FilterType$b;

    .line 11
    .line 12
    .line 13
    invoke-interface {v1}, Lcom/kubi/resources/widget/drop/FilterType$b;->a()Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    const-string v2, "ALL"

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x0

    .line 22
    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 27
    move-result v2

    .line 28
    .line 29
    if-eqz v2, :cond_0

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :cond_0
    iget-object v2, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->d0:Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    move-result v1

    .line 37
    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    iget-object v1, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->Z:Lta/r4;

    .line 41
    .line 42
    iget-object v1, v1, Lta/r4;->m:Lcom/kubi/resources/widget/BaseTextView;

    .line 43
    .line 44
    const/16 v2, 0x8

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 48
    goto :goto_1

    .line 49
    .line 50
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->Z:Lta/r4;

    .line 51
    .line 52
    iget-object v1, v1, Lta/r4;->m:Lcom/kubi/resources/widget/BaseTextView;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 56
    .line 57
    .line 58
    :cond_2
    :goto_1
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 59
    move-result-object v1

    .line 60
    .line 61
    check-cast v1, Lcom/kubi/resources/widget/drop/FilterType$b;

    .line 62
    .line 63
    .line 64
    invoke-interface {v1}, Lcom/kubi/resources/widget/drop/FilterType$b;->a()Ljava/lang/String;

    .line 65
    move-result-object v1

    .line 66
    .line 67
    iput-object v1, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->e0:Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    move-result-object p2

    .line 72
    .line 73
    check-cast p2, Lcom/kubi/resources/widget/drop/FilterType$b;

    .line 74
    .line 75
    .line 76
    invoke-interface {p2}, Lcom/kubi/resources/widget/drop/FilterType$b;->a()Ljava/lang/String;

    .line 77
    move-result-object p2

    .line 78
    .line 79
    iput-object p2, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->d0:Ljava/lang/String;

    .line 80
    .line 81
    iget-object p2, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->e0:Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 85
    move-result p2

    .line 86
    .line 87
    if-eqz p2, :cond_4

    .line 88
    .line 89
    iget-object p2, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->d0:Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 93
    move-result p2

    .line 94
    .line 95
    if-nez p2, :cond_3

    .line 96
    goto :goto_2

    .line 97
    .line 98
    :cond_3
    sget p2, Lcom/kubi/assets/R$color;->c_text40:I

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, p2}, Lcom/kubi/resources/widget/drop/a;->i(I)V

    .line 102
    goto :goto_3

    .line 103
    .line 104
    :cond_4
    :goto_2
    sget p2, Lcom/kubi/assets/R$color;->primary:I

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, p2}, Lcom/kubi/resources/widget/drop/a;->i(I)V

    .line 108
    .line 109
    .line 110
    :goto_3
    invoke-virtual {p0}, Lcom/kubi/assets/history/InOutHistoryFragment;->F3()V

    .line 111
    return-void
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

.method public static synthetic I3(Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/assets/history/v0;->a()V

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
.end method

.method public static synthetic J3(Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    sget-object p0, Lcom/kubi/assets/service/AssetsHelper;->a:Lcom/kubi/assets/service/AssetsHelper;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/assets/service/AssetsHelper;->D()V

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
.end method

.method public static synthetic K3(ZLcom/kubi/assets/entity/HistoryRecordEntity;Landroid/view/View;)V
    .locals 8

    .line 1
    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    const-string p2, "withdraw"

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    const-string p2, "deposit"

    .line 8
    .line 9
    :goto_0
    const-string v0, "historyRecord"

    .line 10
    .line 11
    const-string v1, "1"

    .line 12
    .line 13
    .line 14
    invoke-static {v0, p2, v1}, Lqq/m;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    move-result-object v5

    .line 16
    .line 17
    sget-object v2, Lf00/a;->a:Lf00/a;

    .line 18
    .line 19
    iget-object v3, p1, Lcom/kubi/assets/entity/HistoryRecordEntity;->id:Ljava/lang/String;

    .line 20
    .line 21
    if-eqz p0, :cond_1

    .line 22
    :goto_1
    move-object v4, v1

    .line 23
    goto :goto_2

    .line 24
    .line 25
    :cond_1
    const-string v1, "0"

    .line 26
    goto :goto_1

    .line 27
    :goto_2
    const/4 v6, 0x0

    .line 28
    const/4 v7, 0x0

    .line 29
    .line 30
    .line 31
    invoke-virtual/range {v2 .. v7}, Lf00/a;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z

    .line 32
    return-void
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
.end method

.method public static synthetic L3(Lcom/kubi/assets/history/InOutHistoryFragment;Landroid/content/Intent;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const-class v0, Lcom/kubi/data/entity/CoinInfoEntity;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    check-cast p1, Lcom/kubi/data/entity/CoinInfoEntity;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/kubi/data/entity/CoinInfoEntity;->getCode()Ljava/lang/String;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    iput-object v0, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->b0:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v0, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->Z:Lta/r4;

    .line 26
    .line 27
    iget-object v0, v0, Lta/r4;->j:Lcom/kubi/resources/widget/BaseTextView;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/kubi/data/entity/CoinInfoEntity;->getCurrency()Ljava/lang/String;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, Lcom/kubi/assets/service/d;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/kubi/assets/history/InOutHistoryFragment;->F3()V

    .line 42
    :cond_0
    return-void
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
.end method

.method public static synthetic M3(Lcom/kubi/assets/history/InOutHistoryFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iget v0, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->a0:I

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0}, Lab/a;->a(Landroid/content/Context;Ljava/lang/Integer;)Landroid/content/Intent;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    new-instance v0, Lcom/kubi/assets/history/u0;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, p0}, Lcom/kubi/assets/history/u0;-><init>(Lcom/kubi/assets/history/InOutHistoryFragment;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1, v0}, Lcom/kubi/sdk/BaseFragment;->startActivityWithResult(Landroid/content/Intent;Lio/reactivex/functions/Consumer;)V

    .line 23
    return-void
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
.end method

.method public static O3(ILjava/lang/String;)Lcom/kubi/assets/history/InOutHistoryFragment;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Landroid/os/Bundle;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 6
    .line 7
    const-string v1, "type"

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 11
    .line 12
    const-string p0, "data"

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    new-instance p0, Lcom/kubi/assets/history/InOutHistoryFragment;

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Lcom/kubi/assets/history/InOutHistoryFragment;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 24
    return-object p0
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
.end method


# virtual methods
.method public C3()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

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
.end method

.method public F3()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/utils/TimeUtils$b;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/utils/TimeUtils$b;-><init>()V

    .line 6
    .line 7
    iput-object v0, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->g0:Lcom/kubi/utils/TimeUtils$b;

    .line 8
    .line 9
    .line 10
    invoke-super {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->F3()V

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
.end method

.method public N3(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/HistoryRecordEntity;)V
    .locals 7

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->a0:I

    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v2

    .line 10
    .line 11
    :goto_0
    if-nez v0, :cond_2

    .line 12
    .line 13
    iget-boolean v1, p2, Lcom/kubi/assets/entity/HistoryRecordEntity;->isInner:Z

    .line 14
    .line 15
    if-nez v1, :cond_2

    .line 16
    .line 17
    const-string v1, "PROCESSING"

    .line 18
    .line 19
    iget-object v3, p2, Lcom/kubi/assets/entity/HistoryRecordEntity;->status:Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    move-result v1

    .line 24
    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    const-string v1, "REVIEW"

    .line 28
    .line 29
    iget-object v3, p2, Lcom/kubi/assets/entity/HistoryRecordEntity;->status:Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    move-result v1

    .line 34
    .line 35
    if-nez v1, :cond_1

    .line 36
    .line 37
    const-string v1, "WALLET_PROCESSING"

    .line 38
    .line 39
    iget-object v3, p2, Lcom/kubi/assets/entity/HistoryRecordEntity;->status:Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    move-result v1

    .line 44
    .line 45
    if-nez v1, :cond_1

    .line 46
    .line 47
    const-string v1, "PRE_SUCCESS"

    .line 48
    .line 49
    iget-object v3, p2, Lcom/kubi/assets/entity/HistoryRecordEntity;->status:Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    move-result v1

    .line 54
    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    const-string v3, "("

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2}, Lcom/kubi/assets/entity/HistoryRecordEntity;->getConfirmationStr()Ljava/lang/String;

    .line 69
    move-result-object v3

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v3, "/"

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2}, Lcom/kubi/assets/entity/HistoryRecordEntity;->getConfirmationCountStr()Ljava/lang/String;

    .line 81
    move-result-object v3

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    const-string v3, ")"

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    move-result-object v1

    .line 94
    goto :goto_1

    .line 95
    .line 96
    :cond_2
    const-string v1, ""

    .line 97
    .line 98
    :goto_1
    sget v3, Lcom/kubi/assets/R$id;->tv_coin_name:I

    .line 99
    .line 100
    iget-object v4, p2, Lcom/kubi/assets/entity/HistoryRecordEntity;->currencyName:Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    invoke-static {v4}, Lcom/kubi/utils/extensions/StringEx;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    move-result-object v4

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, v3, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 108
    move-result-object v3

    .line 109
    .line 110
    sget v4, Lcom/kubi/assets/R$id;->tv_status:I

    .line 111
    .line 112
    new-instance v5, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 119
    move-result-object v6

    .line 120
    .line 121
    .line 122
    invoke-virtual {p2, v6, v0, p2, v2}, Lcom/kubi/assets/entity/HistoryRecordEntity;->getStatusString(Landroid/content/Context;ZLcom/kubi/assets/entity/HistoryRecordEntity;Z)Ljava/lang/String;

    .line 123
    move-result-object v6

    .line 124
    .line 125
    .line 126
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    move-result-object v1

    .line 134
    .line 135
    .line 136
    invoke-virtual {v3, v4, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 137
    move-result-object v1

    .line 138
    .line 139
    .line 140
    invoke-virtual {p2, v2, p2}, Lcom/kubi/assets/entity/HistoryRecordEntity;->getStatusColor(ZLcom/kubi/assets/entity/HistoryRecordEntity;)I

    .line 141
    move-result v2

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0, v2}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 145
    move-result v2

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, v4, v2}, Lio/chad/library/adapter/base/BaseViewHolder;->setTextColor(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 149
    move-result-object v1

    .line 150
    .line 151
    sget v2, Lcom/kubi/assets/R$id;->tv_amount:I

    .line 152
    .line 153
    .line 154
    invoke-virtual {p2}, Lcom/kubi/assets/entity/HistoryRecordEntity;->amountFormat()Ljava/lang/String;

    .line 155
    move-result-object v3

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1, v2, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 159
    move-result-object v1

    .line 160
    .line 161
    sget v2, Lcom/kubi/assets/R$id;->tv_time:I

    .line 162
    .line 163
    .line 164
    invoke-virtual {p2}, Lcom/kubi/assets/entity/HistoryRecordEntity;->getTimeString()Ljava/lang/String;

    .line 165
    move-result-object v3

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1, v2, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 169
    .line 170
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 171
    .line 172
    new-instance v1, Lcom/kubi/assets/history/t0;

    .line 173
    .line 174
    .line 175
    invoke-direct {v1, v0, p2}, Lcom/kubi/assets/history/t0;-><init>(ZLcom/kubi/assets/entity/HistoryRecordEntity;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 179
    return-void
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
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
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
.end method

.method public final P3(Landroid/widget/TextView;)V
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/kubi/assets/R$drawable;->ic_triangle_bottom_12:I

    .line 3
    .line 4
    .line 5
    const v1, 0x800005

    .line 6
    .line 7
    .line 8
    invoke-static {p1, v0, v1}, Lcom/kubi/utils/a1;->d(Landroid/widget/TextView;II)V

    .line 9
    .line 10
    sget v0, Lcom/kubi/assets/R$color;->c_icon60:I

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 14
    move-result v0

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v0}, Lcom/kubi/utils/extensions/k;->q(Landroid/widget/TextView;I)V

    .line 18
    return-void
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
.end method

.method public getLayout()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/assets/R$layout;->kucoin_fragment_in_out_his:I

    .line 3
    return v0
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
.end method

.method public bridge synthetic o3(Lio/chad/library/adapter/base/BaseViewHolder;Landroid/os/Parcelable;)V
    .locals 0

    .line 1
    .line 2
    check-cast p2, Lcom/kubi/assets/entity/HistoryRecordEntity;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/history/InOutHistoryFragment;->N3(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/HistoryRecordEntity;)V

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
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    return-void

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    const-string v0, "type"

    .line 17
    const/4 v1, 0x0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 21
    move-result p1

    .line 22
    .line 23
    iput p1, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->a0:I

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    const-string v0, "data"

    .line 30
    .line 31
    const-string v1, ""

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    iput-object p1, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->b0:Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    invoke-static {}, Lmr/a;->b()Lretrofit2/Retrofit;

    .line 41
    move-result-object p1

    .line 42
    .line 43
    const-class v0, Lcom/kubi/assets/h0;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v0}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    check-cast p1, Lcom/kubi/assets/h0;

    .line 50
    .line 51
    iput-object p1, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->c0:Lcom/kubi/assets/h0;

    .line 52
    return-void
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
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->onDestroyView()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->Z:Lta/r4;

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
.end method

.method public onReBack()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/history/InOutHistoryFragment;->F3()V

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
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 8
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 4
    .line 5
    iget-object p1, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContentView:Landroid/view/View;

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lta/r4;->a(Landroid/view/View;)Lta/r4;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    iput-object p1, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->Z:Lta/r4;

    .line 12
    .line 13
    iget-object p1, p1, Lta/r4;->g:Lcom/kubi/resources/widget/drop/DropMenuView;

    .line 14
    const/4 p2, 0x0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    iget-object p1, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->Z:Lta/r4;

    .line 20
    .line 21
    iget-object p1, p1, Lta/r4;->g:Lcom/kubi/resources/widget/drop/DropMenuView;

    .line 22
    .line 23
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, Lcom/kubi/resources/widget/drop/DropMenuView;->setNew(Ljava/lang/Boolean;)V

    .line 27
    .line 28
    new-instance p1, Lcom/kubi/resources/widget/drop/a;

    .line 29
    .line 30
    .line 31
    invoke-direct {p1}, Lcom/kubi/resources/widget/drop/a;-><init>()V

    .line 32
    .line 33
    sget v0, Lcom/kubi/assets/R$color;->c_text40:I

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v0}, Lcom/kubi/resources/widget/drop/a;->i(I)V

    .line 37
    .line 38
    iget-object v0, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->Z:Lta/r4;

    .line 39
    .line 40
    iget-object v1, v0, Lta/r4;->l:Lcom/kubi/resources/widget/BaseTextView;

    .line 41
    .line 42
    iget-object v0, v0, Lta/r4;->g:Lcom/kubi/resources/widget/drop/DropMenuView;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v1, v0}, Lcom/kubi/resources/widget/drop/a;->d(Landroid/widget/TextView;Lcom/kubi/resources/widget/drop/DropMenuView;)V

    .line 46
    .line 47
    iget-object v0, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->Z:Lta/r4;

    .line 48
    .line 49
    iget-object v0, v0, Lta/r4;->j:Lcom/kubi/resources/widget/BaseTextView;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v0}, Lcom/kubi/assets/history/InOutHistoryFragment;->P3(Landroid/widget/TextView;)V

    .line 53
    .line 54
    new-instance v0, Ljava/util/ArrayList;

    .line 55
    .line 56
    .line 57
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    new-instance v1, Lcom/kubi/resources/widget/drop/a$a;

    .line 60
    .line 61
    sget v2, Lcom/kubi/assets/R$string;->status:I

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 65
    move-result-object v2

    .line 66
    .line 67
    sget-object v3, Lcom/kubi/resources/widget/drop/FilterType;->a:Lcom/kubi/resources/widget/drop/FilterType$Companion;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 71
    move-result-object v4

    .line 72
    .line 73
    iget v5, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->a0:I

    .line 74
    const/4 v6, 0x1

    .line 75
    const/4 v7, 0x2

    .line 76
    .line 77
    if-ne v5, v7, :cond_0

    .line 78
    move v5, v6

    .line 79
    goto :goto_0

    .line 80
    :cond_0
    move v5, p2

    .line 81
    .line 82
    .line 83
    :goto_0
    invoke-static {v4, v5}, Lcom/kubi/assets/entity/HistoryRecordEntity;->getStatusTypeMap(Landroid/content/Context;Z)Ljava/util/LinkedHashMap;

    .line 84
    move-result-object v4

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3, v4, v6}, Lcom/kubi/resources/widget/drop/FilterType$Companion;->convert2Filter(Ljava/util/Map;Z)[Lcom/kubi/resources/widget/drop/FilterType$a;

    .line 88
    move-result-object v4

    .line 89
    .line 90
    .line 91
    invoke-direct {v1, v2, v4, v7}, Lcom/kubi/resources/widget/drop/a$a;-><init>(Ljava/lang/String;[Lcom/kubi/resources/widget/drop/FilterType$b;I)V

    .line 92
    .line 93
    .line 94
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    new-instance v1, Lcom/kubi/resources/widget/drop/a$a;

    .line 97
    .line 98
    sget v2, Lcom/kubi/assets/R$string;->time:I

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 102
    move-result-object v2

    .line 103
    .line 104
    sget-object v4, Lcom/kubi/assets/history/a;->a:Lcom/kubi/assets/history/a;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 108
    move-result-object v5

    .line 109
    .line 110
    .line 111
    invoke-virtual {v4, v5}, Lcom/kubi/assets/history/a;->b(Landroid/content/Context;)Ljava/util/LinkedHashMap;

    .line 112
    move-result-object v4

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3, v4, v6}, Lcom/kubi/resources/widget/drop/FilterType$Companion;->convert2Filter(Ljava/util/Map;Z)[Lcom/kubi/resources/widget/drop/FilterType$a;

    .line 116
    move-result-object v3

    .line 117
    .line 118
    .line 119
    invoke-direct {v1, v2, v3}, Lcom/kubi/resources/widget/drop/a$a;-><init>(Ljava/lang/String;[Lcom/kubi/resources/widget/drop/FilterType$b;)V

    .line 120
    .line 121
    .line 122
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    new-instance v1, Lcom/kubi/assets/history/q0;

    .line 125
    .line 126
    .line 127
    invoke-direct {v1, p0, p1}, Lcom/kubi/assets/history/q0;-><init>(Lcom/kubi/assets/history/InOutHistoryFragment;Lcom/kubi/resources/widget/drop/a;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, v0, v1}, Lcom/kubi/resources/widget/drop/a;->h(Ljava/util/List;Lio/reactivex/functions/Consumer;)V

    .line 131
    .line 132
    iget-object p1, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->b0:Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 136
    move-result p1

    .line 137
    .line 138
    if-nez p1, :cond_1

    .line 139
    .line 140
    iget-object p1, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->Z:Lta/r4;

    .line 141
    .line 142
    iget-object p1, p1, Lta/r4;->j:Lcom/kubi/resources/widget/BaseTextView;

    .line 143
    .line 144
    iget-object v0, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->b0:Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    invoke-static {v0}, Lcom/kubi/assets/service/d;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 148
    move-result-object v0

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 152
    .line 153
    :cond_1
    iget-object p1, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->Z:Lta/r4;

    .line 154
    .line 155
    iget-object p1, p1, Lta/r4;->j:Lcom/kubi/resources/widget/BaseTextView;

    .line 156
    .line 157
    new-instance v0, Lcom/kubi/assets/history/r0;

    .line 158
    .line 159
    .line 160
    invoke-direct {v0, p0}, Lcom/kubi/assets/history/r0;-><init>(Lcom/kubi/assets/history/InOutHistoryFragment;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 164
    .line 165
    iget-object p1, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->X:Lcom/kubi/resources/widget/SwipeRefreshRecyclerView;

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1}, Lcom/kubi/resources/widget/SwipeRefreshRecyclerView;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    .line 169
    move-result-object p1

    .line 170
    .line 171
    sget v0, Lcom/kubi/assets/R$color;->c_overlay:I

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 175
    .line 176
    iget p1, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->a0:I

    .line 177
    .line 178
    if-ne p1, v6, :cond_2

    .line 179
    .line 180
    iget-object p1, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->Z:Lta/r4;

    .line 181
    .line 182
    iget-object p1, p1, Lta/r4;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 186
    .line 187
    iget-object p1, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->Z:Lta/r4;

    .line 188
    .line 189
    iget-object p1, p1, Lta/r4;->i:Lcom/kubi/resources/widget/BaseTextView;

    .line 190
    .line 191
    new-instance p2, Lcom/kubi/assets/history/s0;

    .line 192
    .line 193
    .line 194
    invoke-direct {p2}, Lcom/kubi/assets/history/s0;-><init>()V

    .line 195
    .line 196
    .line 197
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 198
    return-void

    .line 199
    .line 200
    :cond_2
    iget-object p1, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->Z:Lta/r4;

    .line 201
    .line 202
    iget-object p1, p1, Lta/r4;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 203
    .line 204
    const/16 p2, 0x8

    .line 205
    .line 206
    .line 207
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 208
    return-void
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
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
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
.end method

.method public r3(II)Lio/reactivex/Observable;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lio/reactivex/Observable<",
            "Lcom/kubi/sdk/base/entity/BasePageEntity<",
            "Lcom/kubi/assets/entity/HistoryRecordEntity;",
            ">;>;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->f0:Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->b0:Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->f0:Ljava/util/HashMap;

    .line 16
    .line 17
    const-string v1, "currency"

    .line 18
    .line 19
    iget-object v2, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->b0:Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->f0:Ljava/util/HashMap;

    .line 25
    .line 26
    sget-object v1, Lcom/kubi/assets/history/a;->a:Lcom/kubi/assets/history/a;

    .line 27
    .line 28
    iget-object v2, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->d0:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v3, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->g0:Lcom/kubi/utils/TimeUtils$b;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v2, v3}, Lcom/kubi/assets/history/a;->c(Ljava/lang/String;Lcom/kubi/utils/TimeUtils$b;)Ljava/lang/String;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    const-string v2, "startAt"

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    iget-object v0, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->f0:Ljava/util/HashMap;

    .line 42
    .line 43
    const-string v1, "ALL"

    .line 44
    .line 45
    iget-object v2, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->d0:Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    move-result v1

    .line 50
    .line 51
    const-string v2, ""

    .line 52
    .line 53
    if-eqz v1, :cond_1

    .line 54
    move-object v1, v2

    .line 55
    goto :goto_0

    .line 56
    .line 57
    :cond_1
    iget-object v1, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->g0:Lcom/kubi/utils/TimeUtils$b;

    .line 58
    .line 59
    iget-object v1, v1, Lcom/kubi/utils/TimeUtils$b;->b:Ljava/lang/String;

    .line 60
    .line 61
    :goto_0
    const-string v3, "endAt"

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    iget-object v0, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->e0:Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 70
    move-result v0

    .line 71
    .line 72
    if-nez v0, :cond_2

    .line 73
    .line 74
    iget-object v0, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->f0:Ljava/util/HashMap;

    .line 75
    .line 76
    const-string v1, "status"

    .line 77
    .line 78
    iget-object v3, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->e0:Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    :cond_2
    iget-object v0, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->f0:Ljava/util/HashMap;

    .line 84
    .line 85
    new-instance v1, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    move-result-object p1

    .line 99
    .line 100
    const-string v1, "page"

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    iget-object p1, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->f0:Ljava/util/HashMap;

    .line 106
    .line 107
    new-instance v0, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    move-result-object p2

    .line 121
    .line 122
    const-string v0, "size"

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    iget-object p1, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->f0:Ljava/util/HashMap;

    .line 128
    .line 129
    const-string p2, "mergeKucoinKumex"

    .line 130
    .line 131
    const-string v0, "true"

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    iget p1, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->a0:I

    .line 137
    const/4 p2, 0x1

    .line 138
    .line 139
    if-eq p1, p2, :cond_4

    .line 140
    const/4 p2, 0x2

    .line 141
    .line 142
    if-eq p1, p2, :cond_3

    .line 143
    const/4 p1, 0x0

    .line 144
    return-object p1

    .line 145
    .line 146
    :cond_3
    iget-object p1, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->c0:Lcom/kubi/assets/h0;

    .line 147
    .line 148
    iget-object p2, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->f0:Ljava/util/HashMap;

    .line 149
    .line 150
    .line 151
    invoke-interface {p1, p2}, Lcom/kubi/assets/h0;->n0(Ljava/util/HashMap;)Lio/reactivex/Observable;

    .line 152
    move-result-object p1

    .line 153
    .line 154
    .line 155
    invoke-static {}, Lcom/kubi/sdk/util/a1;->m()Lio/reactivex/ObservableTransformer;

    .line 156
    move-result-object p2

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->compose(Lio/reactivex/ObservableTransformer;)Lio/reactivex/Observable;

    .line 160
    move-result-object p1

    .line 161
    return-object p1

    .line 162
    .line 163
    :cond_4
    iget-object p1, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->f0:Ljava/util/HashMap;

    .line 164
    .line 165
    const-string p2, "version"

    .line 166
    .line 167
    const-string v0, "3"

    .line 168
    .line 169
    .line 170
    invoke-virtual {p1, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    iget-object p1, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->c0:Lcom/kubi/assets/h0;

    .line 173
    .line 174
    iget-object p2, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->f0:Ljava/util/HashMap;

    .line 175
    .line 176
    .line 177
    invoke-interface {p1, p2}, Lcom/kubi/assets/h0;->I(Ljava/util/HashMap;)Lio/reactivex/Observable;

    .line 178
    move-result-object p1

    .line 179
    .line 180
    .line 181
    invoke-static {}, Lcom/kubi/sdk/util/a1;->m()Lio/reactivex/ObservableTransformer;

    .line 182
    move-result-object p2

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->compose(Lio/reactivex/ObservableTransformer;)Lio/reactivex/Observable;

    .line 186
    move-result-object p1

    .line 187
    return-object p1
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
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
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
.end method

.method public showContent()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->showContent()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->Z:Lta/r4;

    .line 6
    .line 7
    iget-object v0, v0, Lta/r4;->d:Landroid/widget/LinearLayout;

    .line 8
    .line 9
    const/16 v1, 0x8

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 13
    .line 14
    iget-object v0, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->Z:Lta/r4;

    .line 15
    .line 16
    iget-object v0, v0, Lta/r4;->m:Lcom/kubi/resources/widget/BaseTextView;

    .line 17
    const/4 v2, 0x0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    iget-object v0, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->Z:Lta/r4;

    .line 23
    .line 24
    iget-object v0, v0, Lta/r4;->m:Lcom/kubi/resources/widget/BaseTextView;

    .line 25
    .line 26
    sget v3, Lcom/kubi/assets/R$string;->assets_history_oneyear_tip:I

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 30
    move-result-object v3

    .line 31
    .line 32
    const-string v4, "1"

    .line 33
    .line 34
    .line 35
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 36
    move-result-object v4

    .line 37
    .line 38
    .line 39
    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    move-result-object v3

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 44
    .line 45
    const-string v0, "page_load_end"

    .line 46
    .line 47
    const-string v3, ""

    .line 48
    .line 49
    const-string v4, "B1overview_charge_record_load"

    .line 50
    .line 51
    .line 52
    invoke-static {v4, v0, v3}, Lqq/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    iget v0, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->a0:I

    .line 55
    const/4 v3, 0x2

    .line 56
    .line 57
    if-ne v0, v3, :cond_0

    .line 58
    .line 59
    sget-object v0, Lcom/kubi/assets/api/IAssetsCenterService;->a:Lcom/kubi/assets/api/IAssetsCenterService$Companion;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/kubi/assets/api/IAssetsCenterService$Companion;->get()Lcom/kubi/assets/api/IAssetsCenterService;

    .line 63
    move-result-object v0

    .line 64
    .line 65
    .line 66
    invoke-interface {v0}, Lcom/kubi/assets/api/IAssetsCenterService;->D()Z

    .line 67
    move-result v0

    .line 68
    .line 69
    if-eqz v0, :cond_0

    .line 70
    .line 71
    sget-object v0, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->DelistingCoinClaimRecord:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 72
    .line 73
    .line 74
    invoke-static {v0}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 75
    move-result v0

    .line 76
    .line 77
    if-eqz v0, :cond_0

    .line 78
    .line 79
    iget-object v0, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->Z:Lta/r4;

    .line 80
    .line 81
    iget-object v0, v0, Lta/r4;->c:Lcom/kubi/resources/widget/DashTextView;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 85
    goto :goto_0

    .line 86
    .line 87
    :cond_0
    iget-object v0, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->Z:Lta/r4;

    .line 88
    .line 89
    iget-object v0, v0, Lta/r4;->c:Lcom/kubi/resources/widget/DashTextView;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 93
    .line 94
    :goto_0
    iget-object v0, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->Z:Lta/r4;

    .line 95
    .line 96
    iget-object v0, v0, Lta/r4;->c:Lcom/kubi/resources/widget/DashTextView;

    .line 97
    .line 98
    new-instance v1, Lcom/kubi/assets/history/p0;

    .line 99
    .line 100
    .line 101
    invoke-direct {v1}, Lcom/kubi/assets/history/p0;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 105
    return-void
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
.end method

.method public showEmpty()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/history/InOutHistoryFragment;->showContent()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->Z:Lta/r4;

    .line 6
    .line 7
    iget-object v0, v0, Lta/r4;->d:Landroid/widget/LinearLayout;

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 12
    .line 13
    iget-object v0, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->Z:Lta/r4;

    .line 14
    .line 15
    iget-object v0, v0, Lta/r4;->m:Lcom/kubi/resources/widget/BaseTextView;

    .line 16
    .line 17
    const/16 v1, 0x8

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    iget-object v0, p0, Lcom/kubi/assets/history/InOutHistoryFragment;->Z:Lta/r4;

    .line 23
    .line 24
    iget-object v0, v0, Lta/r4;->k:Lcom/kubi/resources/widget/BaseTextView;

    .line 25
    .line 26
    sget v1, Lcom/kubi/assets/R$string;->assets_history_oneyear_tip:I

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    const-string v2, "1"

    .line 33
    .line 34
    .line 35
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 36
    move-result-object v2

    .line 37
    .line 38
    .line 39
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 44
    return-void
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
.end method

.method public x3()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/assets/R$layout;->kucoin_item_in_out_his:I

    .line 3
    return v0
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
.end method

.method public y3()I
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x14

    .line 3
    return v0
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
.end method
