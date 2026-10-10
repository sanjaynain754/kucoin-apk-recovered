.class public final Lcom/sumsub/sns/internal/core/presentation/android/t;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final k:J


# instance fields
.field public final a:Ljava/util/Set;

.field public final b:Lcom/sumsub/sns/internal/features/domain/utils/b;

.field public final c:Ljava/util/Set;

.field public final d:Lkotlinx/coroutines/flow/n;

.field public final e:Lkotlinx/coroutines/flow/w;

.field public final f:Lkotlinx/coroutines/flow/n;

.field public g:Ljava/util/Set;

.field public final h:Lkotlinx/coroutines/channels/d;

.field public final i:Lkotlinx/coroutines/flow/e;

.field public j:Lkotlinx/coroutines/w;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    .line 3
    .line 4
    sget-object v0, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    .line 5
    const/4 v1, 0x5

    .line 6
    .line 7
    .line 8
    invoke-static {v1, v0}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    .line 9
    move-result-wide v0

    .line 10
    .line 11
    sput-wide v0, Lcom/sumsub/sns/internal/core/presentation/android/t;->k:J

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public constructor <init>(Lcom/sumsub/sns/internal/features/domain/utils/b;Ljava/util/Set;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p2, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->a:Ljava/util/Set;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->b:Lcom/sumsub/sns/internal/features/domain/utils/b;

    .line 8
    .line 9
    new-instance p1, Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    move-result-object p2

    .line 17
    .line 18
    .line 19
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    .line 25
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/android/L;

    .line 29
    .line 30
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/android/L;->b:Ljava/lang/String;

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    goto :goto_0

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->c:Ljava/util/Set;

    .line 43
    .line 44
    sget-object p1, Lcom/sumsub/sns/internal/core/presentation/android/m;->a:Lcom/sumsub/sns/internal/core/presentation/android/m;

    .line 45
    .line 46
    .line 47
    invoke-static {p1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 48
    move-result-object p1

    .line 49
    .line 50
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->d:Lkotlinx/coroutines/flow/n;

    .line 51
    .line 52
    .line 53
    invoke-static {p1}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 54
    move-result-object p1

    .line 55
    .line 56
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->e:Lkotlinx/coroutines/flow/w;

    .line 57
    const/4 p1, 0x0

    .line 58
    .line 59
    .line 60
    invoke-static {p1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 61
    move-result-object p2

    .line 62
    .line 63
    iput-object p2, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->f:Lkotlinx/coroutines/flow/n;

    .line 64
    const/4 p2, -0x2

    .line 65
    const/4 v0, 0x6

    .line 66
    .line 67
    .line 68
    invoke-static {p2, p1, p1, v0, p1}, Lkotlinx/coroutines/channels/g;->b(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/coroutines/channels/d;

    .line 69
    move-result-object p1

    .line 70
    .line 71
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->h:Lkotlinx/coroutines/channels/d;

    .line 72
    .line 73
    .line 74
    invoke-static {p1}, Lkotlinx/coroutines/flow/g;->X(Lkotlinx/coroutines/channels/o;)Lkotlinx/coroutines/flow/e;

    .line 75
    move-result-object p1

    .line 76
    .line 77
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->i:Lkotlinx/coroutines/flow/e;

    .line 78
    return-void
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


# virtual methods
.method public final a(Ljava/util/Set;)Lcom/sumsub/sns/internal/core/presentation/android/K;
    .locals 8

    .line 53
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->a:Ljava/util/Set;

    .line 54
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 55
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lcom/sumsub/sns/internal/core/presentation/android/K;

    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 56
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 57
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 58
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v4, v4, 0x1

    .line 59
    move-object v6, v5

    check-cast v6, Lcom/sumsub/sns/internal/core/presentation/android/K;

    .line 60
    instance-of v7, v6, Lcom/sumsub/sns/internal/core/presentation/android/C;

    if-nez v7, :cond_3

    instance-of v6, v6, Lcom/sumsub/sns/internal/core/presentation/android/E;

    if-eqz v6, :cond_2

    goto :goto_2

    .line 61
    :cond_2
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 62
    :cond_3
    :goto_2
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 63
    :cond_4
    new-instance v1, Lkotlin/Pair;

    invoke-direct {v1, v0, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 64
    invoke-virtual {v1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {v1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 65
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lcom/sumsub/sns/internal/core/presentation/android/K;

    .line 66
    invoke-interface {p1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_3

    :cond_6
    move-object v2, v3

    .line 67
    :goto_3
    check-cast v2, Lcom/sumsub/sns/internal/core/presentation/android/K;

    .line 68
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_9

    .line 69
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_4

    .line 70
    :cond_7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sumsub/sns/internal/core/presentation/android/K;

    .line 71
    invoke-interface {p1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    :cond_9
    move-object v0, v3

    :cond_a
    :goto_4
    if-eqz v0, :cond_b

    .line 72
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Lcom/sumsub/sns/internal/core/presentation/android/K;

    :cond_b
    if-nez v2, :cond_c

    return-object v3

    :cond_c
    return-object v2
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/geo/F;)Ljava/lang/Object;
    .locals 4

    .line 33
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->j:Lkotlinx/coroutines/w;

    if-eqz v0, :cond_0

    .line 34
    const-string/jumbo v1, "requestPermission: awaiting in-flight request"

    invoke-virtual {p0, v1}, Lcom/sumsub/sns/internal/core/presentation/android/t;->a(Ljava/lang/String;)V

    .line 35
    invoke-interface {v0, p1}, Lkotlinx/coroutines/r0;->h(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 36
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->f:Lkotlinx/coroutines/flow/n;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    if-eqz v0, :cond_1

    .line 37
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/android/t;->a(Ljava/util/Set;)Lcom/sumsub/sns/internal/core/presentation/android/K;

    move-result-object v0

    if-nez v0, :cond_1

    .line 38
    const-string/jumbo p1, "requestPermission: already granted (cached)"

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/android/t;->a(Ljava/lang/String;)V

    .line 39
    sget-object p1, Lcom/sumsub/sns/internal/core/presentation/android/i;->a:Lcom/sumsub/sns/internal/core/presentation/android/i;

    return-object p1

    .line 40
    :cond_1
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 41
    const-string/jumbo p1, "requestPermission: no runtime permissions required"

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/android/t;->a(Ljava/lang/String;)V

    .line 42
    sget-object p1, Lcom/sumsub/sns/internal/core/presentation/android/i;->a:Lcom/sumsub/sns/internal/core/presentation/android/i;

    return-object p1

    .line 43
    :cond_2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->c:Ljava/util/Set;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "requestPermission: requesting "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/android/t;->a(Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 44
    invoke-static {v1, v0, v1}, Lkotlinx/coroutines/y;->c(Lkotlinx/coroutines/x1;ILjava/lang/Object;)Lkotlinx/coroutines/w;

    move-result-object v0

    .line 45
    iput-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->j:Lkotlinx/coroutines/w;

    .line 46
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->d:Lkotlinx/coroutines/flow/n;

    new-instance v2, Lcom/sumsub/sns/internal/core/presentation/android/n;

    iget-object v3, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->c:Ljava/util/Set;

    invoke-direct {v2, v3}, Lcom/sumsub/sns/internal/core/presentation/android/n;-><init>(Ljava/util/Set;)V

    invoke-interface {v1, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 47
    invoke-interface {v0, p1}, Lkotlinx/coroutines/r0;->h(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p1, Lcom/sumsub/sns/internal/core/presentation/android/q;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/android/q;

    iget v1, v0, Lcom/sumsub/sns/internal/core/presentation/android/q;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/core/presentation/android/q;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/android/q;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/core/presentation/android/q;-><init>(Lcom/sumsub/sns/internal/core/presentation/android/t;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/core/presentation/android/q;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1
    iget v2, v0, Lcom/sumsub/sns/internal/core/presentation/android/q;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->f:Lkotlinx/coroutines/flow/n;

    invoke-static {p1}, Lkotlinx/coroutines/flow/g;->E(Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    move-result-object p1

    iput v3, v0, Lcom/sumsub/sns/internal/core/presentation/android/q;->c:I

    invoke-static {p1, v0}, Lkotlinx/coroutines/flow/g;->F(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    .line 3
    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/Iterable;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 6
    check-cast v2, Lcom/sumsub/sns/internal/core/presentation/android/L;

    .line 7
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/android/L;->a:Ljava/lang/String;

    .line 8
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 9
    :cond_4
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->a:Ljava/util/Set;

    .line 10
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 11
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 12
    move-object v5, v4

    check-cast v5, Lcom/sumsub/sns/internal/core/presentation/android/L;

    .line 13
    iget-object v5, v5, Lcom/sumsub/sns/internal/core/presentation/android/L;->c:Lcom/sumsub/sns/internal/core/analytics/PermissionPayload;

    .line 14
    invoke-virtual {v5}, Lcom/sumsub/sns/internal/core/analytics/PermissionPayload;->getValue()Ljava/lang/String;

    move-result-object v5

    .line 15
    invoke-virtual {v2, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_5

    .line 16
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 17
    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    :cond_5
    check-cast v6, Ljava/util/List;

    .line 19
    invoke-interface {v6, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 20
    :cond_6
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v4

    invoke-static {v4}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v4

    invoke-direct {p1, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 21
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    .line 22
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 23
    check-cast v4, Ljava/util/Map$Entry;

    .line 24
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    .line 25
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    .line 26
    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v4, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 27
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 28
    check-cast v7, Lcom/sumsub/sns/internal/core/presentation/android/L;

    .line 29
    iget-object v7, v7, Lcom/sumsub/sns/internal/core/presentation/android/L;->a:Ljava/lang/String;

    .line 30
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 31
    :cond_7
    invoke-interface {v0, v6}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v4

    xor-int/2addr v4, v3

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v4

    .line 32
    invoke-interface {p1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_8
    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/core/presentation/android/j;)V
    .locals 3

    .line 48
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->j:Lkotlinx/coroutines/w;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 49
    iput-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->j:Lkotlinx/coroutines/w;

    .line 50
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->d:Lkotlinx/coroutines/flow/n;

    sget-object v2, Lcom/sumsub/sns/internal/core/presentation/android/m;->a:Lcom/sumsub/sns/internal/core/presentation/android/m;

    invoke-interface {v1, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 51
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "resolved: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/sumsub/sns/internal/core/presentation/android/t;->a(Ljava/lang/String;)V

    .line 52
    invoke-interface {v0, p1}, Lkotlinx/coroutines/w;->n(Ljava/lang/Object;)Z

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 3

    .line 73
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->b:Lcom/sumsub/sns/internal/features/domain/utils/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PermissionController"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/sumsub/sns/internal/features/domain/utils/b;->a(Lcom/sumsub/sns/internal/features/domain/utils/b;Ljava/lang/String;)V

    return-void
.end method

.method public final b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p1, Lcom/sumsub/sns/internal/core/presentation/android/r;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/android/r;

    iget v1, v0, Lcom/sumsub/sns/internal/core/presentation/android/r;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/core/presentation/android/r;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/android/r;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/core/presentation/android/r;-><init>(Lcom/sumsub/sns/internal/core/presentation/android/t;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/core/presentation/android/r;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1
    iget v2, v0, Lcom/sumsub/sns/internal/core/presentation/android/r;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    sget-wide v4, Lcom/sumsub/sns/internal/core/presentation/android/t;->k:J

    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/android/s;

    const/4 v2, 0x0

    invoke-direct {p1, p0, v2}, Lcom/sumsub/sns/internal/core/presentation/android/s;-><init>(Lcom/sumsub/sns/internal/core/presentation/android/t;Lkotlin/coroutines/Continuation;)V

    iput v3, v0, Lcom/sumsub/sns/internal/core/presentation/android/r;->c:I

    invoke-static {v4, v5, p1, v0}, Lkotlinx/coroutines/TimeoutKt;->e(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ljava/util/Set;

    if-nez p1, :cond_4

    .line 3
    const-string/jumbo p1, "peekPermissions: timed out -> Denied"

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/android/t;->a(Ljava/lang/String;)V

    .line 4
    sget-object p1, Lcom/sumsub/sns/internal/core/presentation/android/h;->a:Lcom/sumsub/sns/internal/core/presentation/android/h;

    return-object p1

    .line 5
    :cond_4
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/android/t;->a(Ljava/util/Set;)Lcom/sumsub/sns/internal/core/presentation/android/K;

    move-result-object p1

    if-nez p1, :cond_5

    .line 6
    sget-object p1, Lcom/sumsub/sns/internal/core/presentation/android/i;->a:Lcom/sumsub/sns/internal/core/presentation/android/i;

    goto :goto_2

    :cond_5
    sget-object p1, Lcom/sumsub/sns/internal/core/presentation/android/h;->a:Lcom/sumsub/sns/internal/core/presentation/android/h;

    .line 7
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "peekPermissions: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/android/t;->a(Ljava/lang/String;)V

    return-object p1
.end method

.method public final b(Ljava/util/Set;)V
    .locals 2

    .line 8
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->f:Lkotlinx/coroutines/flow/n;

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 9
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->g:Ljava/util/Set;

    .line 10
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->g:Ljava/util/Set;

    if-eqz v0, :cond_0

    .line 11
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 12
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->h:Lkotlinx/coroutines/channels/d;

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlinx/coroutines/channels/p;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->j:Lkotlinx/coroutines/w;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->d:Lkotlinx/coroutines/flow/n;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lcom/sumsub/sns/internal/core/presentation/android/l;->a:Lcom/sumsub/sns/internal/core/presentation/android/l;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 14
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/android/t;->a(Ljava/util/Set;)Lcom/sumsub/sns/internal/core/presentation/android/K;

    move-result-object p1

    if-nez p1, :cond_1

    .line 15
    const-string/jumbo p1, "settings return: all required granted"

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/android/t;->a(Ljava/lang/String;)V

    .line 16
    sget-object p1, Lcom/sumsub/sns/internal/core/presentation/android/i;->a:Lcom/sumsub/sns/internal/core/presentation/android/i;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/android/t;->a(Lcom/sumsub/sns/internal/core/presentation/android/j;)V

    return-void

    .line 17
    :cond_1
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/android/L;->b:Ljava/lang/String;

    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "settings return: still missing "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", re-requesting"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/android/t;->a(Ljava/lang/String;)V

    .line 19
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->d:Lkotlinx/coroutines/flow/n;

    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/android/n;

    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->c:Ljava/util/Set;

    invoke-direct {v0, v1}, Lcom/sumsub/sns/internal/core/presentation/android/n;-><init>(Ljava/util/Set;)V

    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public final c(Ljava/util/Set;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->f:Lkotlinx/coroutines/flow/n;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->g:Ljava/util/Set;

    .line 8
    .line 9
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->g:Ljava/util/Set;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    move-result v0

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->h:Lkotlinx/coroutines/channels/d;

    .line 20
    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 23
    move-result v1

    .line 24
    .line 25
    .line 26
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-interface {v0, v1}, Lkotlinx/coroutines/channels/p;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->j:Lkotlinx/coroutines/w;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->d:Lkotlinx/coroutines/flow/n;

    .line 37
    .line 38
    .line 39
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    sget-object v1, Lcom/sumsub/sns/internal/core/presentation/android/k;->a:Lcom/sumsub/sns/internal/core/presentation/android/k;

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    move-result v0

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/android/t;->a(Ljava/util/Set;)Lcom/sumsub/sns/internal/core/presentation/android/K;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    if-nez p1, :cond_1

    .line 55
    .line 56
    .line 57
    const-string/jumbo p1, "runtime result: granted"

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/android/t;->a(Ljava/lang/String;)V

    .line 61
    .line 62
    sget-object p1, Lcom/sumsub/sns/internal/core/presentation/android/i;->a:Lcom/sumsub/sns/internal/core/presentation/android/i;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/android/t;->a(Lcom/sumsub/sns/internal/core/presentation/android/j;)V

    .line 66
    return-void

    .line 67
    .line 68
    :cond_1
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/presentation/android/L;->b:Ljava/lang/String;

    .line 69
    .line 70
    new-instance v1, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    const-string/jumbo v2, "runtime result: denied, missing "

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    const-string v0, " -> settings dialog"

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    move-result-object v0

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/android/t;->a(Ljava/lang/String;)V

    .line 95
    .line 96
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/t;->d:Lkotlinx/coroutines/flow/n;

    .line 97
    .line 98
    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/android/o;

    .line 99
    .line 100
    .line 101
    invoke-direct {v1, p1}, Lcom/sumsub/sns/internal/core/presentation/android/o;-><init>(Lcom/sumsub/sns/internal/core/presentation/android/K;)V

    .line 102
    .line 103
    .line 104
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 105
    :cond_2
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
.end method
