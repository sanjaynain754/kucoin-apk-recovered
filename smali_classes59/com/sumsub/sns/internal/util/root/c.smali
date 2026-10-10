.class public final Lcom/sumsub/sns/internal/util/root/c;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lkotlin/Lazy;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/util/root/g;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/sumsub/sns/internal/util/root/g;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/sumsub/sns/internal/util/root/c;->a:Lkotlin/Lazy;

    .line 15
    return-void
    .line 16
    .line 17
.end method

.method public static final a()Lcom/sumsub/sns/internal/util/root/d;
    .locals 12

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/util/root/e;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/util/root/e;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/sumsub/sns/internal/util/root/d;

    .line 8
    .line 9
    iget-object v2, v0, Lcom/sumsub/sns/internal/util/root/e;->b:[Ljava/lang/String;

    .line 10
    array-length v3, v2

    .line 11
    const/4 v4, 0x0

    .line 12
    move v5, v4

    .line 13
    .line 14
    :goto_0
    const-string v6, "Failed to check for root"

    .line 15
    .line 16
    const-string v7, "SNSRootChecker"

    .line 17
    const/4 v8, 0x1

    .line 18
    .line 19
    if-ge v5, v3, :cond_1

    .line 20
    .line 21
    aget-object v9, v2, v5

    .line 22
    .line 23
    .line 24
    :try_start_0
    invoke-virtual {v0, v9}, Lcom/sumsub/sns/internal/util/root/e;->a(Ljava/lang/String;)Z

    .line 25
    move-result v9
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    goto :goto_1

    .line 27
    :catch_0
    move-exception v9

    .line 28
    .line 29
    sget-object v10, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v10, v7, v6, v9}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 33
    move v9, v4

    .line 34
    .line 35
    :goto_1
    if-eqz v9, :cond_0

    .line 36
    move v2, v8

    .line 37
    goto :goto_2

    .line 38
    .line 39
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move v2, v4

    .line 42
    .line 43
    :goto_2
    iget-object v3, v0, Lcom/sumsub/sns/internal/util/root/e;->c:[Ljava/lang/String;

    .line 44
    array-length v5, v3

    .line 45
    move v9, v4

    .line 46
    .line 47
    :goto_3
    if-ge v9, v5, :cond_3

    .line 48
    .line 49
    aget-object v10, v3, v9

    .line 50
    .line 51
    .line 52
    :try_start_1
    invoke-virtual {v0, v10}, Lcom/sumsub/sns/internal/util/root/e;->a(Ljava/lang/String;)Z

    .line 53
    move-result v10
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 54
    goto :goto_4

    .line 55
    :catch_1
    move-exception v10

    .line 56
    .line 57
    sget-object v11, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v11, v7, v6, v10}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    move v10, v4

    .line 62
    .line 63
    :goto_4
    if-eqz v10, :cond_2

    .line 64
    move v4, v8

    .line 65
    goto :goto_5

    .line 66
    .line 67
    :cond_2
    add-int/lit8 v9, v9, 0x1

    .line 68
    goto :goto_3

    .line 69
    .line 70
    .line 71
    :cond_3
    :goto_5
    invoke-direct {v1, v2, v4}, Lcom/sumsub/sns/internal/util/root/d;-><init>(ZZ)V

    .line 72
    return-object v1
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
.end method
