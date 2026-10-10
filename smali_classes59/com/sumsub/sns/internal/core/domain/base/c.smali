.class public abstract Lcom/sumsub/sns/internal/core/domain/base/c;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static final a(Lcom/sumsub/sns/internal/features/data/repository/common/a;Ljava/lang/Exception;)Ljava/lang/Exception;
    .locals 3

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/core/data/model/SNSException;

    .line 3
    .line 4
    if-eqz v0, :cond_6

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/core/data/model/SNSException;

    .line 8
    .line 9
    instance-of v1, v0, Lcom/sumsub/sns/core/data/model/SNSException$Api;

    .line 10
    .line 11
    if-eqz v1, :cond_2

    .line 12
    move-object v1, p1

    .line 13
    .line 14
    check-cast v1, Lcom/sumsub/sns/core/data/model/SNSException$Api;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/model/SNSException$Api;->getCode()Ljava/lang/Integer;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    goto :goto_0

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 25
    move-result v1

    .line 26
    .line 27
    const/16 v2, 0x191

    .line 28
    .line 29
    if-ne v1, v2, :cond_1

    .line 30
    .line 31
    sget-object v1, Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$Unauthorized;->INSTANCE:Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$Unauthorized;

    .line 32
    .line 33
    check-cast p0, Lcom/sumsub/sns/internal/features/data/repository/common/e;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v1}, Lcom/sumsub/sns/internal/features/data/repository/common/e;->a(Lcom/sumsub/sns/core/data/model/SNSSDKState;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Lcom/sumsub/sns/internal/core/common/F0;->a(Lcom/sumsub/sns/core/data/model/SNSException;)V

    .line 40
    return-object p1

    .line 41
    .line 42
    :cond_1
    :goto_0
    new-instance v0, Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$Unknown;

    .line 43
    .line 44
    .line 45
    invoke-direct {v0, p1}, Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$Unknown;-><init>(Ljava/lang/Exception;)V

    .line 46
    .line 47
    check-cast p0, Lcom/sumsub/sns/internal/features/data/repository/common/e;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/data/repository/common/e;->a(Lcom/sumsub/sns/core/data/model/SNSSDKState;)V

    .line 51
    return-object p1

    .line 52
    .line 53
    :cond_2
    instance-of v1, v0, Lcom/sumsub/sns/core/data/model/SNSException$Unknown;

    .line 54
    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    new-instance v0, Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$Unknown;

    .line 58
    .line 59
    .line 60
    invoke-direct {v0, p1}, Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$Unknown;-><init>(Ljava/lang/Exception;)V

    .line 61
    .line 62
    check-cast p0, Lcom/sumsub/sns/internal/features/data/repository/common/e;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/data/repository/common/e;->a(Lcom/sumsub/sns/core/data/model/SNSSDKState;)V

    .line 66
    return-object p1

    .line 67
    .line 68
    :cond_3
    instance-of v1, v0, Lcom/sumsub/sns/core/data/model/SNSException$Network;

    .line 69
    .line 70
    if-eqz v1, :cond_4

    .line 71
    .line 72
    new-instance v0, Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$NetworkError;

    .line 73
    .line 74
    .line 75
    invoke-direct {v0, p1}, Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$NetworkError;-><init>(Ljava/lang/Exception;)V

    .line 76
    .line 77
    check-cast p0, Lcom/sumsub/sns/internal/features/data/repository/common/e;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/data/repository/common/e;->a(Lcom/sumsub/sns/core/data/model/SNSSDKState;)V

    .line 81
    return-object p1

    .line 82
    .line 83
    :cond_4
    instance-of v0, v0, Lcom/sumsub/sns/core/data/model/SNSException$Internal;

    .line 84
    .line 85
    if-eqz v0, :cond_5

    .line 86
    .line 87
    new-instance v0, Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$Unknown;

    .line 88
    .line 89
    .line 90
    invoke-direct {v0, p1}, Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$Unknown;-><init>(Ljava/lang/Exception;)V

    .line 91
    .line 92
    check-cast p0, Lcom/sumsub/sns/internal/features/data/repository/common/e;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/data/repository/common/e;->a(Lcom/sumsub/sns/core/data/model/SNSSDKState;)V

    .line 96
    return-object p1

    .line 97
    .line 98
    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 99
    .line 100
    .line 101
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 102
    throw p0

    .line 103
    .line 104
    :cond_6
    instance-of v0, p1, Lcom/sumsub/sns/core/data/model/SNSApplicantNotFoundException;

    .line 105
    .line 106
    if-eqz v0, :cond_7

    .line 107
    .line 108
    new-instance v0, Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$ApplicantNotFound;

    .line 109
    .line 110
    .line 111
    invoke-direct {v0, p1}, Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$ApplicantNotFound;-><init>(Ljava/lang/Exception;)V

    .line 112
    .line 113
    check-cast p0, Lcom/sumsub/sns/internal/features/data/repository/common/e;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/data/repository/common/e;->a(Lcom/sumsub/sns/core/data/model/SNSSDKState;)V

    .line 117
    return-object p1

    .line 118
    .line 119
    :cond_7
    instance-of v0, p1, Lcom/sumsub/sns/core/data/model/SNSConfigNotFoundException;

    .line 120
    .line 121
    if-eqz v0, :cond_8

    .line 122
    .line 123
    new-instance v0, Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$InitialLoadingFailed;

    .line 124
    .line 125
    .line 126
    invoke-direct {v0, p1}, Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$InitialLoadingFailed;-><init>(Ljava/lang/Exception;)V

    .line 127
    .line 128
    check-cast p0, Lcom/sumsub/sns/internal/features/data/repository/common/e;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/data/repository/common/e;->a(Lcom/sumsub/sns/core/data/model/SNSSDKState;)V

    .line 132
    :cond_8
    return-object p1
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
