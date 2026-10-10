.class public final Lshark/internal/d;
.super Ljava/lang/Object;
.source "DominatorTree.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bJG\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00110\u00102\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000c2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u000e\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lshark/internal/d;",
        "",
        "",
        "expectedElements",
        "<init>",
        "(I)V",
        "",
        "objectId",
        "parentObjectId",
        "",
        "c",
        "(JJ)Z",
        "",
        "retainedObjectIds",
        "Lkotlin/Function1;",
        "computeSize",
        "",
        "Lkotlin/Pair;",
        "b",
        "(Ljava/util/Set;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;",
        "Lshark/internal/hppc/LongLongScatterMap;",
        "a",
        "Lshark/internal/hppc/LongLongScatterMap;",
        "dominated",
        "shark"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x1
    }
.end annotation


# instance fields
.field public final a:Lshark/internal/hppc/LongLongScatterMap;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lshark/internal/hppc/LongLongScatterMap;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p1}, Lshark/internal/hppc/LongLongScatterMap;-><init>(I)V

    .line 9
    .line 10
    iput-object v0, p0, Lshark/internal/d;->a:Lshark/internal/hppc/LongLongScatterMap;

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
.end method

.method public static final synthetic a(Lshark/internal/d;)Lshark/internal/hppc/LongLongScatterMap;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lshark/internal/d;->a:Lshark/internal/hppc/LongLongScatterMap;

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
.end method


# virtual methods
.method public final b(Ljava/util/Set;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;
    .locals 4
    .param p1    # Ljava/util/Set;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Long;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Long;",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    move-result v1

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    check-cast v1, Ljava/lang/Number;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 25
    move-result-wide v1

    .line 26
    .line 27
    .line 28
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 29
    move-result-object v1

    .line 30
    const/4 v2, 0x0

    .line 31
    .line 32
    .line 33
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    move-result-object v3

    .line 35
    .line 36
    .line 37
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    move-result-object v2

    .line 39
    .line 40
    .line 41
    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 42
    move-result-object v2

    .line 43
    .line 44
    .line 45
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    goto :goto_0

    .line 47
    .line 48
    :cond_0
    iget-object p1, p0, Lshark/internal/d;->a:Lshark/internal/hppc/LongLongScatterMap;

    .line 49
    .line 50
    new-instance v1, Lshark/internal/d$a;

    .line 51
    .line 52
    .line 53
    invoke-direct {v1, p0, v0, p2}, Lshark/internal/d$a;-><init>(Lshark/internal/d;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v1}, Lshark/internal/hppc/LongLongScatterMap;->h(Lshark/internal/hppc/LongLongScatterMap$a;)V

    .line 57
    .line 58
    iget-object p1, p0, Lshark/internal/d;->a:Lshark/internal/hppc/LongLongScatterMap;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Lshark/internal/hppc/LongLongScatterMap;->p()V

    .line 62
    return-object v0
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
.end method

.method public final c(JJ)Z
    .locals 18

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-wide/from16 v1, p1

    .line 5
    .line 6
    move-wide/from16 v3, p3

    .line 7
    .line 8
    iget-object v5, v0, Lshark/internal/d;->a:Lshark/internal/hppc/LongLongScatterMap;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v5, v1, v2}, Lshark/internal/hppc/LongLongScatterMap;->k(J)I

    .line 12
    move-result v5

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x1

    .line 15
    const/4 v8, -0x1

    .line 16
    .line 17
    if-eq v5, v8, :cond_0

    .line 18
    move v9, v7

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v9, v6

    .line 21
    .line 22
    :goto_0
    if-eqz v9, :cond_8

    .line 23
    .line 24
    const-wide/16 v10, 0x0

    .line 25
    .line 26
    cmp-long v12, v3, v10

    .line 27
    .line 28
    if-nez v12, :cond_1

    .line 29
    .line 30
    goto/16 :goto_4

    .line 31
    .line 32
    :cond_1
    iget-object v12, v0, Lshark/internal/d;->a:Lshark/internal/hppc/LongLongScatterMap;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v12, v5}, Lshark/internal/hppc/LongLongScatterMap;->l(I)J

    .line 36
    move-result-wide v12

    .line 37
    .line 38
    cmp-long v5, v12, v10

    .line 39
    .line 40
    if-eqz v5, :cond_7

    .line 41
    .line 42
    new-instance v5, Lshark/internal/hppc/e;

    .line 43
    const/4 v14, 0x0

    .line 44
    .line 45
    .line 46
    invoke-direct {v5, v6, v7, v14}, Lshark/internal/hppc/e;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 47
    move-wide v6, v12

    .line 48
    .line 49
    :goto_1
    cmp-long v14, v6, v10

    .line 50
    .line 51
    const-string v15, " when going through the dominator chain for "

    .line 52
    .line 53
    move-wide/from16 v16, v10

    .line 54
    .line 55
    const-string v10, "Did not find dominator for "

    .line 56
    .line 57
    if-eqz v14, :cond_3

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5, v6, v7}, Lshark/internal/hppc/e;->a(J)Z

    .line 61
    .line 62
    iget-object v11, v0, Lshark/internal/d;->a:Lshark/internal/hppc/LongLongScatterMap;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v11, v6, v7}, Lshark/internal/hppc/LongLongScatterMap;->k(J)I

    .line 66
    move-result v11

    .line 67
    .line 68
    if-eq v11, v8, :cond_2

    .line 69
    .line 70
    iget-object v6, v0, Lshark/internal/d;->a:Lshark/internal/hppc/LongLongScatterMap;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v6, v11}, Lshark/internal/hppc/LongLongScatterMap;->l(I)J

    .line 74
    move-result-wide v6

    .line 75
    .line 76
    move-wide/from16 v10, v16

    .line 77
    goto :goto_1

    .line 78
    .line 79
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 80
    .line 81
    new-instance v2, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    const-string v3, ": "

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    move-result-object v2

    .line 109
    .line 110
    .line 111
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 112
    throw v1

    .line 113
    :cond_3
    move-wide v6, v3

    .line 114
    .line 115
    :goto_2
    cmp-long v11, v6, v16

    .line 116
    .line 117
    if-eqz v11, :cond_6

    .line 118
    .line 119
    .line 120
    invoke-virtual {v5, v6, v7}, Lshark/internal/hppc/e;->d(J)Z

    .line 121
    move-result v11

    .line 122
    .line 123
    if-eqz v11, :cond_4

    .line 124
    goto :goto_3

    .line 125
    .line 126
    :cond_4
    iget-object v11, v0, Lshark/internal/d;->a:Lshark/internal/hppc/LongLongScatterMap;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v11, v6, v7}, Lshark/internal/hppc/LongLongScatterMap;->k(J)I

    .line 130
    move-result v11

    .line 131
    .line 132
    if-eq v11, v8, :cond_5

    .line 133
    .line 134
    iget-object v6, v0, Lshark/internal/d;->a:Lshark/internal/hppc/LongLongScatterMap;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v6, v11}, Lshark/internal/hppc/LongLongScatterMap;->l(I)J

    .line 138
    move-result-wide v6

    .line 139
    goto :goto_2

    .line 140
    .line 141
    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 142
    .line 143
    new-instance v2, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    move-result-object v2

    .line 163
    .line 164
    .line 165
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 166
    throw v1

    .line 167
    .line 168
    :cond_6
    :goto_3
    iget-object v3, v0, Lshark/internal/d;->a:Lshark/internal/hppc/LongLongScatterMap;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3, v1, v2, v6, v7}, Lshark/internal/hppc/LongLongScatterMap;->q(JJ)J

    .line 172
    :cond_7
    return v9

    .line 173
    .line 174
    :cond_8
    :goto_4
    iget-object v5, v0, Lshark/internal/d;->a:Lshark/internal/hppc/LongLongScatterMap;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v5, v1, v2, v3, v4}, Lshark/internal/hppc/LongLongScatterMap;->q(JJ)J

    .line 178
    return v9
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
.end method
