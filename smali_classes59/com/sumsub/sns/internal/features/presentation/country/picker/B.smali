.class public final Lcom/sumsub/sns/internal/features/presentation/country/picker/B;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/features/presentation/country/picker/r;


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/presentation/country/picker/e;

.field public final b:Lcom/sumsub/sns/internal/features/presentation/country/picker/q;

.field public final c:Lkotlinx/coroutines/flow/n;

.field public final d:Lkotlinx/coroutines/flow/w;

.field public final synthetic e:Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog;Lcom/sumsub/sns/internal/features/presentation/country/picker/e;)V
    .locals 2

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/country/picker/B;->e:Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/country/picker/B;->a:Lcom/sumsub/sns/internal/features/presentation/country/picker/e;

    .line 8
    .line 9
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/country/picker/q;

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    .line 13
    invoke-direct {p2, v0}, Lcom/sumsub/sns/internal/features/presentation/country/picker/q;-><init>(Z)V

    .line 14
    .line 15
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/country/picker/B;->b:Lcom/sumsub/sns/internal/features/presentation/country/picker/q;

    .line 16
    const/4 p2, 0x0

    .line 17
    .line 18
    .line 19
    invoke-static {p2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/country/picker/B;->c:Lkotlinx/coroutines/flow/n;

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Lkotlinx/coroutines/flow/g;->E(Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/country/picker/A;

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, p2}, Lcom/sumsub/sns/internal/features/presentation/country/picker/A;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1}, Lkotlinx/coroutines/flow/g;->n0(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 35
    move-result-object p2

    .line 36
    .line 37
    .line 38
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    sget-object v0, Lkotlinx/coroutines/flow/SharingStarted;->a:Lkotlinx/coroutines/flow/SharingStarted$Companion;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/SharingStarted$Companion;->getEagerly()Lkotlinx/coroutines/flow/SharingStarted;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    .line 52
    invoke-static {p2, p1, v0, v1}, Lkotlinx/coroutines/flow/g;->g0(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;

    .line 53
    move-result-object p1

    .line 54
    .line 55
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/country/picker/B;->d:Lkotlinx/coroutines/flow/w;

    .line 56
    return-void
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


# virtual methods
.method public final a()Lkotlinx/coroutines/flow/e;
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Lkotlinx/coroutines/flow/g;->M(Ljava/lang/Object;)Lkotlinx/coroutines/flow/e;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/country/picker/d;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/country/picker/B;->e:Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog;

    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v1

    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/country/picker/z;

    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/country/picker/B;->e:Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog;

    const/4 v2, 0x0

    invoke-direct {v4, p0, p1, v0, v2}, Lcom/sumsub/sns/internal/features/presentation/country/picker/z;-><init>(Lcom/sumsub/sns/internal/features/presentation/country/picker/B;Lcom/sumsub/sns/internal/features/presentation/country/picker/d;Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final b()V
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

.method public final getConfig()Lcom/sumsub/sns/internal/features/presentation/country/picker/q;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/country/picker/B;->b:Lcom/sumsub/sns/internal/features/presentation/country/picker/q;

    .line 3
    return-object v0
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
