.class public final Lcom/kubi/assets/overview/ongoing/mapper/f;
.super Lgb/a;
.source "RobotMapper.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgb/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\n\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u0003H\u0016J\u0012\u0010\r\u001a\u00020\u00062\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u0003H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/kubi/assets/overview/ongoing/mapper/RobotMapper;",
        "Lcom/kubi/assets/overview/ongoing/mapper/BaseMapper;",
        "Lcom/kubi/assets/overview/ongoing/mapper/IMapper;",
        "Lcom/kubi/assets/entity/RobotItem;",
        "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$RobotItem;",
        "title",
        "",
        "<init>",
        "(Ljava/lang/String;)V",
        "getTitle",
        "()Ljava/lang/String;",
        "map",
        "input",
        "getBuildCurrency",
        "quota",
        "gerProfit",
        "AssetsCenterLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "title"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lgb/a;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/kubi/assets/overview/ongoing/mapper/f;->a:Ljava/lang/String;

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
.end method


# virtual methods
.method public final d(Lcom/kubi/assets/entity/RobotItem;)Ljava/lang/String;
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/assets/entity/RobotItem;->getTotalProfit()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    .line 8
    const-wide/16 v3, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v3, v4, v1, v2}, Lcom/kubi/utils/extensions/DowngradeExKt;->h(Ljava/lang/String;DILjava/lang/Object;)D

    .line 12
    move-result-wide v0

    .line 13
    .line 14
    cmpl-double v0, v0, v3

    .line 15
    .line 16
    if-lez v0, :cond_0

    .line 17
    .line 18
    const-string v0, "+"

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    const-string v0, ""

    .line 22
    .line 23
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/kubi/assets/entity/RobotItem;->getTotalProfit()Ljava/lang/String;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/kubi/assets/entity/RobotItem;->getQuota()Ljava/lang/String;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    .line 40
    invoke-static {v0, p1}, Lcom/kubi/assets/AssetExKt;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 41
    move-result-object p1

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    move-result-object p1

    .line 49
    return-object p1
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
.end method

.method public final e(Ljava/lang/String;)Ljava/lang/String;
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
    const/16 v1, 0x28

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v1, "--"

    .line 13
    .line 14
    .line 15
    invoke-static {p1, v1}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const/16 p1, 0x29

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    move-result-object p1

    .line 29
    return-object p1
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

.method public f(Lcom/kubi/assets/entity/RobotItem;)Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$i;
    .locals 16
    .param p1    # Lcom/kubi/assets/entity/RobotItem;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    const-string v1, "input"

    .line 5
    .line 6
    move-object/from16 v2, p1

    .line 7
    .line 8
    .line 9
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    sget-object v1, Lcom/kubi/assets/overview/ongoing/mapper/RobotType;->Companion:Lcom/kubi/assets/overview/ongoing/mapper/RobotType$Companion;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Lcom/kubi/assets/entity/RobotItem;->getType()Ljava/lang/Integer;

    .line 15
    move-result-object v3

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v3}, Lcom/kubi/assets/overview/ongoing/mapper/RobotType$Companion;->fromType(Ljava/lang/Integer;)Lcom/kubi/assets/overview/ongoing/mapper/RobotType;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/kubi/assets/overview/ongoing/mapper/RobotType;->getDrawableId()I

    .line 23
    move-result v5

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Lcom/kubi/assets/entity/RobotItem;->getSymbol()Ljava/lang/String;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    const-string v3, ""

    .line 30
    .line 31
    if-nez v1, :cond_0

    .line 32
    move-object v6, v3

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object v6, v1

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-virtual {v2}, Lcom/kubi/assets/entity/RobotItem;->getI18nType()Ljava/lang/String;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    if-nez v1, :cond_1

    .line 41
    move-object v7, v3

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move-object v7, v1

    .line 44
    .line 45
    .line 46
    :goto_1
    invoke-virtual {v2}, Lcom/kubi/assets/entity/RobotItem;->getTotalCost()Ljava/lang/String;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Lcom/kubi/assets/entity/RobotItem;->getQuota()Ljava/lang/String;

    .line 51
    move-result-object v3

    .line 52
    .line 53
    .line 54
    invoke-static {v1, v3}, Lcom/kubi/assets/AssetExKt;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    move-result-object v8

    .line 56
    .line 57
    .line 58
    invoke-virtual/range {p0 .. p1}, Lcom/kubi/assets/overview/ongoing/mapper/f;->d(Lcom/kubi/assets/entity/RobotItem;)Ljava/lang/String;

    .line 59
    move-result-object v9

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Lcom/kubi/assets/entity/RobotItem;->getTotalProfitRate()Ljava/lang/String;

    .line 63
    move-result-object v10

    .line 64
    const/4 v14, 0x5

    .line 65
    const/4 v15, 0x0

    .line 66
    const/4 v11, 0x0

    .line 67
    const/4 v12, 0x1

    .line 68
    const/4 v13, 0x0

    .line 69
    .line 70
    .line 71
    invoke-static/range {v10 .. v15}, Lcom/kubi/assets/AssetExKt;->h(Ljava/lang/String;Ljava/math/RoundingMode;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 72
    move-result-object v10

    .line 73
    .line 74
    new-instance v1, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    sget-object v3, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 80
    .line 81
    sget v4, Lcom/kubi/assets/R$string;->position_profit:I

    .line 82
    const/4 v11, 0x0

    .line 83
    .line 84
    new-array v12, v11, [Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3, v4, v12}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 88
    move-result-object v4

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2}, Lcom/kubi/assets/entity/RobotItem;->getQuota()Ljava/lang/String;

    .line 95
    move-result-object v4

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v4}, Lcom/kubi/assets/overview/ongoing/mapper/f;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    move-result-object v4

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    move-result-object v1

    .line 107
    .line 108
    new-instance v4, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    .line 113
    sget v12, Lcom/kubi/assets/R$string;->kc_tb_grid_invest_title:I

    .line 114
    .line 115
    new-array v11, v11, [Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3, v12, v11}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 119
    move-result-object v3

    .line 120
    .line 121
    .line 122
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2}, Lcom/kubi/assets/entity/RobotItem;->getQuota()Ljava/lang/String;

    .line 126
    move-result-object v3

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v3}, Lcom/kubi/assets/overview/ongoing/mapper/f;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 130
    move-result-object v3

    .line 131
    .line 132
    .line 133
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    move-result-object v12

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2}, Lcom/kubi/assets/entity/RobotItem;->getTotalProfitRate()Ljava/lang/String;

    .line 141
    move-result-object v3

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v3}, Lgb/a;->a(Ljava/lang/String;)I

    .line 145
    move-result v13

    .line 146
    .line 147
    new-instance v2, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$i;

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/assets/entity/RobotItem;->getId()Ljava/lang/String;

    .line 151
    move-result-object v3

    .line 152
    .line 153
    .line 154
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/assets/entity/RobotItem;->getType()Ljava/lang/Integer;

    .line 155
    move-result-object v4

    .line 156
    move-object v11, v1

    .line 157
    .line 158
    .line 159
    invoke-direct/range {v2 .. v13}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$i;-><init>(Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 160
    .line 161
    iget-object v1, v0, Lcom/kubi/assets/overview/ongoing/mapper/f;->a:Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2, v1}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;->c(Ljava/lang/String;)V

    .line 165
    return-object v2
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
