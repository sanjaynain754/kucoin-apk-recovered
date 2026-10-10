.class public final synthetic Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/b;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;)V
    .locals 7

    .line 1
    .line 2
    .line 3
    const-string/jumbo v5, "onNfcStateChanged(Z)V"

    .line 4
    const/4 v6, 0x0

    .line 5
    const/4 v1, 0x1

    .line 6
    .line 7
    const-class v3, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;

    .line 8
    .line 9
    .line 10
    const-string/jumbo v4, "onNfcStateChanged"

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
    .locals 10

    .line 1
    .line 2
    check-cast p1, Ljava/lang/Boolean;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    move-result p1

    .line 7
    .line 8
    iget-object v0, p0, Lkotlin/jvm/internal/CallableReference;->receiver:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;

    .line 11
    .line 12
    if-nez p1, :cond_4

    .line 13
    .line 14
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a:Lkotlin/Lazy;

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 18
    move-result-object p1

    .line 19
    move-object v1, p1

    .line 20
    .line 21
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lcom/sumsub/sns/internal/core/common/h;->b(Landroid/content/Context;)Lcom/sumsub/sns/internal/core/common/r0;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    sget-object v0, Lcom/sumsub/sns/internal/core/common/o0;->b:Lcom/sumsub/sns/internal/core/common/o0;

    .line 32
    .line 33
    .line 34
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    move-result v0

    .line 36
    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    sget-object v0, Lcom/sumsub/sns/internal/core/common/n0;->b:Lcom/sumsub/sns/internal/core/common/n0;

    .line 40
    .line 41
    .line 42
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    move-result p1

    .line 44
    .line 45
    if-eqz p1, :cond_0

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const/4 p1, 0x0

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 50
    .line 51
    .line 52
    :goto_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    sget-object v0, Lcom/sumsub/sns/internal/ff/a;->Q:Lcom/sumsub/sns/internal/ff/core/a;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    .line 58
    move-result v0

    .line 59
    .line 60
    const-string v2, "SNSEidMain"

    .line 61
    const/4 v3, 0x0

    .line 62
    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 66
    .line 67
    iget-object p1, p1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 68
    .line 69
    const-string v0, "Skipping NFC check according to FF"

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 73
    goto :goto_2

    .line 74
    .line 75
    :cond_2
    if-nez p1, :cond_3

    .line 76
    .line 77
    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/SNSEidExceptionReason;->NFCNotAvailable:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/SNSEidExceptionReason;

    .line 78
    .line 79
    sget-object v5, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/z;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/z;

    .line 80
    .line 81
    .line 82
    const-string/jumbo v4, "sns_alert_nfcIsNotSupported"

    .line 83
    .line 84
    const/16 v6, 0x14

    .line 85
    .line 86
    const-string v2, "NFC not supported"

    .line 87
    .line 88
    .line 89
    invoke-static/range {v1 .. v6}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;Ljava/lang/String;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/SNSEidExceptionReason;Ljava/lang/String;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T;I)V

    .line 90
    goto :goto_2

    .line 91
    .line 92
    :cond_3
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 93
    .line 94
    iget-object p1, p1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 95
    .line 96
    const-string v0, "On NFC disabled"

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 100
    .line 101
    .line 102
    invoke-static {v1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 103
    move-result-object v4

    .line 104
    .line 105
    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/z0;

    .line 106
    .line 107
    .line 108
    invoke-direct {v7, v1, v3}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/z0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;Lkotlin/coroutines/Continuation;)V

    .line 109
    const/4 v8, 0x3

    .line 110
    const/4 v9, 0x0

    .line 111
    const/4 v5, 0x0

    .line 112
    const/4 v6, 0x0

    .line 113
    .line 114
    .line 115
    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 116
    goto :goto_2

    .line 117
    .line 118
    :cond_4
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->k:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/a;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 124
    return-object p1
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
