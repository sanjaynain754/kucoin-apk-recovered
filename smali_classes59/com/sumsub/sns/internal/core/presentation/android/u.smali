.class public final synthetic Lcom/sumsub/sns/internal/core/presentation/android/u;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/core/presentation/android/v;)V
    .locals 7

    .line 1
    .line 2
    .line 3
    const-string/jumbo v5, "onState(Lcom/sumsub/sns/internal/core/presentation/android/PermissionController$State;)V"

    .line 4
    const/4 v6, 0x0

    .line 5
    const/4 v1, 0x1

    .line 6
    .line 7
    const-class v3, Lcom/sumsub/sns/internal/core/presentation/android/v;

    .line 8
    .line 9
    .line 10
    const-string/jumbo v4, "onState"

    .line 11
    move-object v0, p0

    .line 12
    move-object v2, p1

    .line 13
    .line 14
    .line 15
    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/android/f;

    .line 3
    .line 4
    iget-object v0, p0, Lkotlin/jvm/internal/CallableReference;->receiver:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/android/v;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    instance-of v1, p1, Lcom/sumsub/sns/internal/core/presentation/android/c;

    .line 12
    const/4 v2, 0x0

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/android/c;

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object p1, v2

    .line 19
    .line 20
    :goto_0
    if-nez p1, :cond_1

    .line 21
    .line 22
    goto/16 :goto_4

    .line 23
    .line 24
    :cond_1
    iget-object v1, p1, Lcom/sumsub/sns/internal/core/presentation/android/c;->a:Ljava/util/Set;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/core/presentation/android/v;->a(Ljava/util/Set;)Ljava/util/Set;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 32
    move-result v3

    .line 33
    .line 34
    new-instance v4, Ljava/util/ArrayList;

    .line 35
    .line 36
    .line 37
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    move-result-object v5

    .line 42
    .line 43
    .line 44
    :cond_2
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    move-result v6

    .line 46
    .line 47
    if-eqz v6, :cond_3

    .line 48
    .line 49
    .line 50
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    move-result-object v6

    .line 52
    .line 53
    instance-of v7, v6, Lcom/sumsub/sns/internal/core/presentation/android/K;

    .line 54
    .line 55
    if-eqz v7, :cond_2

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    goto :goto_1

    .line 60
    .line 61
    .line 62
    :cond_3
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 63
    move-result-object v4

    .line 64
    .line 65
    .line 66
    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    .line 67
    move-result v4

    .line 68
    .line 69
    iget-boolean v5, p1, Lcom/sumsub/sns/internal/core/presentation/android/c;->c:Z

    .line 70
    .line 71
    if-eqz v5, :cond_4

    .line 72
    .line 73
    iget-object v5, v0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v5}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    .line 77
    move-result-object v5

    .line 78
    .line 79
    .line 80
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 81
    move-result-object v6

    .line 82
    .line 83
    const-string v7, "hasAllPermissions"

    .line 84
    .line 85
    .line 86
    invoke-static {v7, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 87
    move-result-object v6

    .line 88
    .line 89
    .line 90
    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    .line 91
    move-result-object v6

    .line 92
    .line 93
    .line 94
    invoke-static {v5, v6}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Ljava/util/Map;)V

    .line 95
    .line 96
    :cond_4
    if-nez v3, :cond_b

    .line 97
    .line 98
    iget-boolean p1, p1, Lcom/sumsub/sns/internal/core/presentation/android/c;->b:Z

    .line 99
    .line 100
    if-eqz p1, :cond_5

    .line 101
    .line 102
    if-eqz v4, :cond_5

    .line 103
    goto :goto_3

    .line 104
    .line 105
    :cond_5
    if-nez p1, :cond_a

    .line 106
    .line 107
    new-instance p1, Ljava/util/ArrayList;

    .line 108
    .line 109
    .line 110
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 114
    move-result-object v1

    .line 115
    .line 116
    .line 117
    :cond_6
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    move-result v3

    .line 119
    .line 120
    if-eqz v3, :cond_7

    .line 121
    .line 122
    .line 123
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    move-result-object v3

    .line 125
    .line 126
    check-cast v3, Lcom/sumsub/sns/internal/core/presentation/android/L;

    .line 127
    .line 128
    iget-object v3, v3, Lcom/sumsub/sns/internal/core/presentation/android/L;->b:Ljava/lang/String;

    .line 129
    .line 130
    if-eqz v3, :cond_6

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    goto :goto_2

    .line 135
    .line 136
    .line 137
    :cond_7
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 138
    move-result v1

    .line 139
    .line 140
    if-nez v1, :cond_8

    .line 141
    move-object v2, p1

    .line 142
    .line 143
    :cond_8
    if-eqz v2, :cond_9

    .line 144
    .line 145
    iget-object p1, v0, Lcom/sumsub/sns/internal/core/presentation/android/v;->l:Landroidx/activity/result/ActivityResultLauncher;

    .line 146
    .line 147
    if-eqz p1, :cond_c

    .line 148
    const/4 v0, 0x0

    .line 149
    .line 150
    new-array v0, v0, [Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    invoke-interface {v2, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 154
    move-result-object v0

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1, v0}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 158
    goto :goto_4

    .line 159
    .line 160
    :cond_9
    iget-object p1, v0, Lcom/sumsub/sns/internal/core/presentation/android/v;->f:Lkotlin/Lazy;

    .line 161
    .line 162
    .line 163
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 164
    move-result-object p1

    .line 165
    .line 166
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/android/g;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/android/v;->t()Ljava/util/Set;

    .line 170
    move-result-object v1

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/core/presentation/android/v;->a(Ljava/util/Set;)Ljava/util/Set;

    .line 174
    move-result-object v0

    .line 175
    const/4 v1, 0x1

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1, v0, v1}, Lcom/sumsub/sns/internal/core/presentation/android/g;->a(Ljava/util/Set;Z)V

    .line 179
    goto :goto_4

    .line 180
    .line 181
    .line 182
    :cond_a
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/common/h;->p()V

    .line 183
    goto :goto_4

    .line 184
    .line 185
    :cond_b
    :goto_3
    iget-object p1, v0, Lcom/sumsub/sns/internal/core/presentation/android/v;->f:Lkotlin/Lazy;

    .line 186
    .line 187
    .line 188
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 189
    move-result-object p1

    .line 190
    .line 191
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/android/g;

    .line 192
    .line 193
    sget-object v1, Lcom/sumsub/sns/internal/core/presentation/android/e;->a:Lcom/sumsub/sns/internal/core/presentation/android/e;

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1, v1}, Lcom/sumsub/sns/internal/core/presentation/android/g;->a(Lcom/sumsub/sns/internal/core/presentation/android/f;)V

    .line 197
    .line 198
    iget-object p1, v0, Lcom/sumsub/sns/internal/core/presentation/android/v;->h:Lkotlin/jvm/functions/Function0;

    .line 199
    .line 200
    .line 201
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 202
    .line 203
    :cond_c
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 204
    return-object p1
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
.end method
