.class public final synthetic Lcom/sumsub/sns/internal/features/presentation/main/n1;
.super Lkotlin/jvm/internal/AdaptedFunctionReference;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;
.implements Lkotlin/coroutines/jvm/internal/SuspendFunction;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;)V
    .locals 7

    .line 1
    .line 2
    const-string v5, "handleRouterNotification(Lcom/sumsub/sns/internal/features/presentation/main/navigation/ServerNavigationEvent;)V"

    .line 3
    const/4 v6, 0x4

    .line 4
    const/4 v1, 0x2

    .line 5
    .line 6
    const-class v3, Lcom/sumsub/sns/internal/features/presentation/main/a2;

    .line 7
    .line 8
    const-string v4, "handleRouterNotification"

    .line 9
    move-object v0, p0

    .line 10
    move-object v2, p1

    .line 11
    .line 12
    .line 13
    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/AdaptedFunctionReference;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 14
    return-void
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
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/navigation/f;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    iget-object p2, p0, Lkotlin/jvm/internal/AdaptedFunctionReference;->receiver:Ljava/lang/Object;

    .line 7
    move-object v0, p2

    .line 8
    .line 9
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/a2;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    instance-of p2, p1, Lcom/sumsub/sns/internal/features/presentation/main/navigation/b;

    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/navigation/b;

    .line 19
    .line 20
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/main/navigation/b;->a:Lcom/sumsub/sns/internal/features/presentation/main/Y;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/a2;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 24
    goto :goto_2

    .line 25
    .line 26
    :cond_0
    instance-of p2, p1, Lcom/sumsub/sns/internal/features/presentation/main/navigation/a;

    .line 27
    .line 28
    if-eqz p2, :cond_1

    .line 29
    .line 30
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/navigation/a;

    .line 31
    .line 32
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/main/navigation/a;->a:Ljava/lang/Throwable;

    .line 33
    .line 34
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/main/navigation/a;->b:Ljava/lang/String;

    .line 35
    const/4 v4, 0x4

    .line 36
    const/4 v5, 0x0

    .line 37
    const/4 v3, 0x0

    .line 38
    .line 39
    .line 40
    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;ILjava/lang/Object;)V

    .line 41
    goto :goto_2

    .line 42
    .line 43
    :cond_1
    instance-of p2, p1, Lcom/sumsub/sns/internal/features/presentation/main/navigation/e;

    .line 44
    .line 45
    const-string v1, ""

    .line 46
    const/4 v2, 0x0

    .line 47
    .line 48
    if-eqz p2, :cond_4

    .line 49
    .line 50
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/navigation/e;

    .line 51
    .line 52
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/main/navigation/e;->a:Ljava/lang/String;

    .line 53
    .line 54
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->h:Lcom/sumsub/sns/internal/features/data/repository/settings/c;

    .line 55
    .line 56
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/repository/settings/c;->a:Lcom/sumsub/sns/internal/core/domain/k;

    .line 57
    .line 58
    .line 59
    invoke-interface {p2}, Lcom/sumsub/sns/internal/core/domain/k;->b()Ljava/lang/Object;

    .line 60
    move-result-object p2

    .line 61
    .line 62
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/h;

    .line 63
    .line 64
    if-eqz p2, :cond_2

    .line 65
    .line 66
    iget-object v2, p2, Lcom/sumsub/sns/internal/features/data/model/common/h;->a:Ljava/lang/String;

    .line 67
    .line 68
    :cond_2
    if-nez v2, :cond_3

    .line 69
    goto :goto_0

    .line 70
    :cond_3
    move-object v1, v2

    .line 71
    .line 72
    :goto_0
    new-instance p2, Lcom/sumsub/sns/core/data/listener/SNSEvent$SNSEventStepInitiated;

    .line 73
    .line 74
    .line 75
    invoke-direct {p2, v1, p1}, Lcom/sumsub/sns/core/data/listener/SNSEvent$SNSEventStepInitiated;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-static {p2}, Lcom/sumsub/sns/internal/features/presentation/main/a2;->a(Lcom/sumsub/sns/core/data/listener/SNSEvent;)V

    .line 79
    goto :goto_2

    .line 80
    .line 81
    :cond_4
    instance-of p2, p1, Lcom/sumsub/sns/internal/features/presentation/main/navigation/d;

    .line 82
    .line 83
    if-eqz p2, :cond_7

    .line 84
    .line 85
    new-instance p2, Lcom/sumsub/sns/core/data/listener/SNSEvent$SNSEventStepCompleted;

    .line 86
    .line 87
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->h:Lcom/sumsub/sns/internal/features/data/repository/settings/c;

    .line 88
    .line 89
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/repository/settings/c;->a:Lcom/sumsub/sns/internal/core/domain/k;

    .line 90
    .line 91
    .line 92
    invoke-interface {v0}, Lcom/sumsub/sns/internal/core/domain/k;->b()Ljava/lang/Object;

    .line 93
    move-result-object v0

    .line 94
    .line 95
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/h;

    .line 96
    .line 97
    if-eqz v0, :cond_5

    .line 98
    .line 99
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/data/model/common/h;->a:Ljava/lang/String;

    .line 100
    .line 101
    :cond_5
    if-nez v2, :cond_6

    .line 102
    goto :goto_1

    .line 103
    :cond_6
    move-object v1, v2

    .line 104
    .line 105
    :goto_1
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/navigation/d;

    .line 106
    .line 107
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/navigation/d;->a:Ljava/lang/String;

    .line 108
    .line 109
    iget-boolean v2, p1, Lcom/sumsub/sns/internal/features/presentation/main/navigation/d;->c:Z

    .line 110
    .line 111
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/main/navigation/d;->b:Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    invoke-direct {p2, v1, v0, v2, p1}, Lcom/sumsub/sns/core/data/listener/SNSEvent$SNSEventStepCompleted;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-static {p2}, Lcom/sumsub/sns/internal/features/presentation/main/a2;->a(Lcom/sumsub/sns/core/data/listener/SNSEvent;)V

    .line 118
    goto :goto_2

    .line 119
    .line 120
    :cond_7
    instance-of p1, p1, Lcom/sumsub/sns/internal/features/presentation/main/navigation/c;

    .line 121
    .line 122
    if-eqz p1, :cond_8

    .line 123
    .line 124
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 125
    return-object p1

    .line 126
    .line 127
    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 128
    .line 129
    .line 130
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 131
    throw p1
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
