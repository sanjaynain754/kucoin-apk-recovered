.class public final Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;
.super Ljava/lang/Object;
.source "KCTurboSymbolsCoinModuleImpl.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a \u0010\u0003\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u0004H\u0002\u001a\u000e\u0010\u0008\u001a\u00020\u0004*\u0004\u0018\u00010\u0006H\u0002\u001a\u0018\u0010\t\u001a\u00020\n*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u001a(\u0010\u000b\u001a\u00020\u000c*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u000b\u001a\u00020\u000c*\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a\u000c\u0010\u0011\u001a\u00020\u0012*\u00020\u0013H\u0002\u00a8\u0006\u0014"
    }
    d2 = {
        "toBatchSpotCoinInfo",
        "Lcom/kubi/rn/core/turbo/SpotCoinInfo;",
        "Lcom/kubi/data/entity/CoinInfoEntity;",
        "str",
        "",
        "",
        "",
        "key",
        "orEmptyString",
        "toFuturesCoinInfo",
        "Lcom/kubi/rn/core/turbo/FuturesCoinInfo;",
        "toFuturesSymbolInfo",
        "Lcom/kubi/rn/core/turbo/FuturesSymbolInfo;",
        "service",
        "Lcom/kubi/kumex/api/IKuMexService;",
        "fallbackSymbol",
        "Lcom/kubi/kumex/data/platform/model/ContractEntity;",
        "toSpotSymbolInfo",
        "Lcom/kubi/rn/core/turbo/SpotSymbolInfo;",
        "Lcom/kubi/data/entity/SymbolInfoEntity;",
        "BReactNativeLib_googleRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nKCTurboSymbolsCoinModuleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCTurboSymbolsCoinModuleImpl.kt\ncom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,455:1\n1#2:456\n*E\n"
    }
.end annotation


# direct methods
.method public static final synthetic access$toBatchSpotCoinInfo(Lcom/kubi/data/entity/CoinInfoEntity;)Lcom/kubi/rn/core/turbo/SpotCoinInfo;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->toBatchSpotCoinInfo(Lcom/kubi/data/entity/CoinInfoEntity;)Lcom/kubi/rn/core/turbo/SpotCoinInfo;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static final synthetic access$toFuturesCoinInfo(Ljava/util/Map;)Lcom/kubi/rn/core/turbo/FuturesCoinInfo;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->toFuturesCoinInfo(Ljava/util/Map;)Lcom/kubi/rn/core/turbo/FuturesCoinInfo;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static final synthetic access$toFuturesSymbolInfo(Lcom/kubi/kumex/data/platform/model/ContractEntity;Lcom/kubi/kumex/api/IKuMexService;)Lcom/kubi/rn/core/turbo/FuturesSymbolInfo;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->toFuturesSymbolInfo(Lcom/kubi/kumex/data/platform/model/ContractEntity;Lcom/kubi/kumex/api/IKuMexService;)Lcom/kubi/rn/core/turbo/FuturesSymbolInfo;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$toFuturesSymbolInfo(Ljava/util/Map;Lcom/kubi/kumex/api/IKuMexService;Ljava/lang/String;)Lcom/kubi/rn/core/turbo/FuturesSymbolInfo;
    .locals 0

    .line 2
    invoke-static {p0, p1, p2}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->toFuturesSymbolInfo(Ljava/util/Map;Lcom/kubi/kumex/api/IKuMexService;Ljava/lang/String;)Lcom/kubi/rn/core/turbo/FuturesSymbolInfo;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$toSpotSymbolInfo(Lcom/kubi/data/entity/SymbolInfoEntity;)Lcom/kubi/rn/core/turbo/SpotSymbolInfo;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->toSpotSymbolInfo(Lcom/kubi/data/entity/SymbolInfoEntity;)Lcom/kubi/rn/core/turbo/SpotSymbolInfo;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method private static final orEmptyString(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    move-result-object p0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    .line 10
    :goto_0
    if-nez p0, :cond_1

    .line 11
    .line 12
    const-string p0, ""

    .line 13
    :cond_1
    return-object p0
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
.end method

.method private static final str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 10
    move-result-object p0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    .line 14
    :goto_0
    if-nez p0, :cond_1

    .line 15
    .line 16
    const-string p0, ""

    .line 17
    :cond_1
    return-object p0
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
.end method

.method private static final toBatchSpotCoinInfo(Lcom/kubi/data/entity/CoinInfoEntity;)Lcom/kubi/rn/core/turbo/SpotCoinInfo;
    .locals 23

    .line 1
    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/CoinInfoEntity;->getCode()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, ""

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    move-object v3, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v3, v0

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/CoinInfoEntity;->getCurrency()Ljava/lang/String;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    move-object v4, v1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move-object v4, v0

    .line 21
    .line 22
    .line 23
    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/CoinInfoEntity;->getName()Ljava/lang/String;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    if-nez v0, :cond_2

    .line 27
    move-object v5, v1

    .line 28
    goto :goto_2

    .line 29
    :cond_2
    move-object v5, v0

    .line 30
    .line 31
    .line 32
    :goto_2
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/CoinInfoEntity;->getIconUrl()Ljava/lang/String;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    if-nez v0, :cond_3

    .line 36
    move-object v6, v1

    .line 37
    goto :goto_3

    .line 38
    :cond_3
    move-object v6, v0

    .line 39
    .line 40
    .line 41
    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/CoinInfoEntity;->getPrecision()I

    .line 42
    move-result v0

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 46
    move-result-object v7

    .line 47
    .line 48
    .line 49
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/CoinInfoEntity;->getStatus()I

    .line 50
    move-result v0

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 54
    move-result-object v8

    .line 55
    .line 56
    .line 57
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/CoinInfoEntity;->getWithdrawMinFee()D

    .line 58
    move-result-wide v0

    .line 59
    .line 60
    .line 61
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 62
    move-result-object v9

    .line 63
    .line 64
    .line 65
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/CoinInfoEntity;->getWithdrawMinSize()D

    .line 66
    move-result-wide v0

    .line 67
    .line 68
    .line 69
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 70
    move-result-object v10

    .line 71
    .line 72
    .line 73
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/CoinInfoEntity;->getWithdrawEnableAt()J

    .line 74
    move-result-wide v0

    .line 75
    .line 76
    .line 77
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 78
    move-result-object v11

    .line 79
    .line 80
    .line 81
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/CoinInfoEntity;->getDepositEnableAt()J

    .line 82
    move-result-wide v0

    .line 83
    .line 84
    .line 85
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 86
    move-result-object v12

    .line 87
    .line 88
    .line 89
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/CoinInfoEntity;->isDigital()Z

    .line 90
    move-result v0

    .line 91
    .line 92
    .line 93
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 94
    move-result-object v14

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/CoinInfoEntity;->isWithdrawEnabled()Z

    .line 98
    move-result v0

    .line 99
    .line 100
    .line 101
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 102
    move-result-object v15

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/CoinInfoEntity;->isDepositEnabled()Z

    .line 106
    move-result v0

    .line 107
    .line 108
    .line 109
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 110
    move-result-object v16

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/CoinInfoEntity;->isDigital()Z

    .line 114
    move-result v0

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/CoinInfoEntity;->getProperties()Lcom/kubi/data/entity/CoinProperty;

    .line 118
    move-result-object v1

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1}, Lcom/kubi/data/entity/CoinProperty;->isStableCoin()Z

    .line 122
    move-result v1

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/CoinInfoEntity;->getProperties()Lcom/kubi/data/entity/CoinProperty;

    .line 126
    move-result-object v2

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2}, Lcom/kubi/data/entity/CoinProperty;->isDelisting()Ljava/lang/String;

    .line 130
    move-result-object v2

    .line 131
    .line 132
    const-string v13, "TRUE"

    .line 133
    .line 134
    .line 135
    invoke-static {v13, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 136
    move-result v2

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/CoinInfoEntity;->isEarnEnabled()Z

    .line 140
    move-result v13

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/CoinInfoEntity;->isDebitEnabled()Z

    .line 144
    move-result v17

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/CoinInfoEntity;->getProperties()Lcom/kubi/data/entity/CoinProperty;

    .line 148
    move-result-object v18

    .line 149
    .line 150
    move/from16 v19, v0

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v18 .. v18}, Lcom/kubi/data/entity/CoinProperty;->getIsTransferEnabled()Ljava/lang/String;

    .line 154
    move-result-object v0

    .line 155
    .line 156
    move/from16 v18, v1

    .line 157
    .line 158
    const-string v1, "false"

    .line 159
    .line 160
    .line 161
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 162
    move-result v0

    .line 163
    .line 164
    xor-int/lit8 v0, v0, 0x1

    .line 165
    move v1, v2

    .line 166
    .line 167
    new-instance v2, Lcom/kubi/rn/core/turbo/SpotCoinInfo;

    .line 168
    .line 169
    .line 170
    invoke-static/range {v19 .. v19}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 171
    move-result-object v19

    .line 172
    .line 173
    .line 174
    invoke-static/range {v18 .. v18}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 175
    move-result-object v18

    .line 176
    .line 177
    .line 178
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 179
    move-result-object v1

    .line 180
    .line 181
    .line 182
    invoke-static/range {v17 .. v17}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 183
    move-result-object v20

    .line 184
    .line 185
    .line 186
    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 187
    move-result-object v21

    .line 188
    .line 189
    .line 190
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 191
    move-result-object v22

    .line 192
    .line 193
    const-string v13, ""

    .line 194
    .line 195
    move-object/from16 v17, v19

    .line 196
    .line 197
    move-object/from16 v19, v1

    .line 198
    .line 199
    .line 200
    invoke-direct/range {v2 .. v22}, Lcom/kubi/rn/core/turbo/SpotCoinInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 201
    return-object v2
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
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
.end method

.method private static final toFuturesCoinInfo(Ljava/util/Map;)Lcom/kubi/rn/core/turbo/FuturesCoinInfo;
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/kubi/rn/core/turbo/FuturesCoinInfo;"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    const-string v0, "code"

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    move-result-object v2

    .line 9
    .line 10
    const-string v0, "currency"

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v0}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    move-result-object v3

    .line 15
    .line 16
    const-string v0, "name"

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v0}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    move-result-object v4

    .line 21
    .line 22
    const-string v0, "iconUrl"

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v0}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    move-result-object v5

    .line 27
    .line 28
    const-string v0, "withdrawDisabledTip"

    .line 29
    .line 30
    .line 31
    invoke-static {v1, v0}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    move-result-object v6

    .line 33
    .line 34
    const-string v0, "depositDisabledTip"

    .line 35
    .line 36
    .line 37
    invoke-static {v1, v0}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    move-result-object v7

    .line 39
    .line 40
    const-string v0, "type"

    .line 41
    .line 42
    .line 43
    invoke-static {v1, v0}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    move-result-object v8

    .line 45
    .line 46
    const-string v0, "precision"

    .line 47
    .line 48
    .line 49
    invoke-static {v1, v0}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    move-result-object v9

    .line 51
    .line 52
    const-string v0, "status"

    .line 53
    .line 54
    .line 55
    invoke-static {v1, v0}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    move-result-object v10

    .line 57
    .line 58
    const-string v0, "withdrawEnableAt"

    .line 59
    .line 60
    .line 61
    invoke-static {v1, v0}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    move-result-object v11

    .line 63
    .line 64
    const-string v0, "depositEnableAt"

    .line 65
    .line 66
    .line 67
    invoke-static {v1, v0}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    move-result-object v12

    .line 69
    .line 70
    const-string v0, "withdrawMinFee"

    .line 71
    .line 72
    .line 73
    invoke-static {v1, v0}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    move-result-object v13

    .line 75
    .line 76
    const-string v0, "withdrawMinSize"

    .line 77
    .line 78
    .line 79
    invoke-static {v1, v0}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    .line 80
    move-result-object v14

    .line 81
    .line 82
    const-string v0, "innerWithdrawMinFee"

    .line 83
    .line 84
    .line 85
    invoke-static {v1, v0}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    .line 86
    move-result-object v15

    .line 87
    .line 88
    const-string v0, "availableBalance"

    .line 89
    .line 90
    .line 91
    invoke-static {v1, v0}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    move-result-object v16

    .line 93
    .line 94
    const-string v0, "totalBalance"

    .line 95
    .line 96
    .line 97
    invoke-static {v1, v0}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    .line 98
    move-result-object v17

    .line 99
    .line 100
    const-string v0, "isDepositEnabled"

    .line 101
    .line 102
    .line 103
    invoke-static {v1, v0}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    .line 104
    move-result-object v18

    .line 105
    .line 106
    const-string v0, "isWithdrawEnabled"

    .line 107
    .line 108
    .line 109
    invoke-static {v1, v0}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    .line 110
    move-result-object v19

    .line 111
    .line 112
    const-string v0, "isDisplayWithdraw"

    .line 113
    .line 114
    .line 115
    invoke-static {v1, v0}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    .line 116
    move-result-object v20

    .line 117
    .line 118
    const-string v0, "isDisplayDeposit"

    .line 119
    .line 120
    .line 121
    invoke-static {v1, v0}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    .line 122
    move-result-object v21

    .line 123
    .line 124
    const-string v0, "isMarginEnabled"

    .line 125
    .line 126
    .line 127
    invoke-static {v1, v0}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    .line 128
    move-result-object v22

    .line 129
    .line 130
    const-string v0, "isDebitEnabled"

    .line 131
    .line 132
    .line 133
    invoke-static {v1, v0}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    .line 134
    move-result-object v23

    .line 135
    .line 136
    const-string v0, "isPoolXEnabled"

    .line 137
    .line 138
    .line 139
    invoke-static {v1, v0}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    .line 140
    move-result-object v24

    .line 141
    .line 142
    move-object/from16 v25, v2

    .line 143
    const/4 v2, 0x0

    .line 144
    .line 145
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 146
    .line 147
    const-string v0, "properties"

    .line 148
    .line 149
    .line 150
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    move-result-object v0

    .line 152
    .line 153
    if-eqz v0, :cond_0

    .line 154
    .line 155
    .line 156
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/c;->i(Ljava/lang/Object;)Ljava/lang/String;

    .line 157
    move-result-object v0

    .line 158
    goto :goto_0

    .line 159
    :catchall_0
    move-exception v0

    .line 160
    goto :goto_1

    .line 161
    :cond_0
    move-object v0, v2

    .line 162
    .line 163
    .line 164
    :goto_0
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 166
    goto :goto_2

    .line 167
    .line 168
    :goto_1
    sget-object v26, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 169
    .line 170
    .line 171
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 172
    move-result-object v0

    .line 173
    .line 174
    .line 175
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    move-result-object v0

    .line 177
    .line 178
    .line 179
    :goto_2
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 180
    move-result v26

    .line 181
    .line 182
    if-eqz v26, :cond_1

    .line 183
    move-object v0, v2

    .line 184
    .line 185
    :cond_1
    check-cast v0, Ljava/lang/String;

    .line 186
    .line 187
    if-nez v0, :cond_2

    .line 188
    .line 189
    const-string v0, "{}"

    .line 190
    .line 191
    :cond_2
    move-object/from16 v30, v0

    .line 192
    .line 193
    const-string v0, "isDigitalCoin"

    .line 194
    .line 195
    .line 196
    invoke-static {v1, v0}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    .line 197
    move-result-object v0

    .line 198
    .line 199
    move-object/from16 v26, v3

    .line 200
    const/4 v3, 0x0

    .line 201
    .line 202
    move-object/from16 v27, v4

    .line 203
    const/4 v4, 0x1

    .line 204
    .line 205
    .line 206
    invoke-static {v0, v3, v4, v2}, Lcom/kubi/utils/extensions/f;->m(Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 207
    move-result v0

    .line 208
    .line 209
    move/from16 v28, v0

    .line 210
    .line 211
    const-string v0, "isStableCoin"

    .line 212
    .line 213
    .line 214
    invoke-static {v1, v0}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    .line 215
    move-result-object v0

    .line 216
    .line 217
    .line 218
    invoke-static {v0, v3, v4, v2}, Lcom/kubi/utils/extensions/f;->m(Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 219
    move-result v0

    .line 220
    .line 221
    move/from16 v29, v0

    .line 222
    .line 223
    const-string v0, "isDelistingCoin"

    .line 224
    .line 225
    .line 226
    invoke-static {v1, v0}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    .line 227
    move-result-object v0

    .line 228
    .line 229
    .line 230
    invoke-static {v0, v3, v4, v2}, Lcom/kubi/utils/extensions/f;->m(Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 231
    move-result v0

    .line 232
    .line 233
    move/from16 v31, v0

    .line 234
    .line 235
    const-string v0, "isEarnEnabled"

    .line 236
    .line 237
    .line 238
    invoke-static {v1, v0}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    .line 239
    move-result-object v0

    .line 240
    .line 241
    .line 242
    invoke-static {v0, v3, v4, v2}, Lcom/kubi/utils/extensions/f;->m(Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 243
    move-result v0

    .line 244
    .line 245
    move/from16 v32, v0

    .line 246
    .line 247
    const-string v0, "isTransferEnabled"

    .line 248
    .line 249
    .line 250
    invoke-static {v1, v0}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    .line 251
    move-result-object v0

    .line 252
    .line 253
    .line 254
    invoke-static {v0, v3, v4, v2}, Lcom/kubi/utils/extensions/f;->m(Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 255
    move-result v0

    .line 256
    .line 257
    new-instance v1, Lcom/kubi/rn/core/turbo/FuturesCoinInfo;

    .line 258
    .line 259
    .line 260
    invoke-static/range {v32 .. v32}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 261
    move-result-object v2

    .line 262
    .line 263
    .line 264
    invoke-static/range {v28 .. v28}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 265
    move-result-object v3

    .line 266
    .line 267
    .line 268
    invoke-static/range {v29 .. v29}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 269
    move-result-object v4

    .line 270
    .line 271
    .line 272
    invoke-static/range {v31 .. v31}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 273
    move-result-object v28

    .line 274
    .line 275
    .line 276
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 277
    move-result-object v29

    .line 278
    .line 279
    move-object/from16 v33, v25

    .line 280
    .line 281
    move-object/from16 v25, v2

    .line 282
    .line 283
    move-object/from16 v2, v33

    .line 284
    .line 285
    move-object/from16 v33, v26

    .line 286
    .line 287
    move-object/from16 v26, v3

    .line 288
    .line 289
    move-object/from16 v3, v33

    .line 290
    .line 291
    move-object/from16 v33, v27

    .line 292
    .line 293
    move-object/from16 v27, v4

    .line 294
    .line 295
    move-object/from16 v4, v33

    .line 296
    .line 297
    .line 298
    invoke-direct/range {v1 .. v30}, Lcom/kubi/rn/core/turbo/FuturesCoinInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V

    .line 299
    return-object v1
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
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
.end method

.method private static final toFuturesSymbolInfo(Lcom/kubi/kumex/data/platform/model/ContractEntity;Lcom/kubi/kumex/api/IKuMexService;)Lcom/kubi/rn/core/turbo/FuturesSymbolInfo;
    .locals 48

    move-object/from16 v0, p1

    .line 46
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getSymbol()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    if-nez v1, :cond_0

    move-object v6, v2

    goto :goto_0

    :cond_0
    move-object v6, v1

    .line 47
    :goto_0
    new-instance v3, Lcom/kubi/rn/core/turbo/FuturesSymbolInfo;

    .line 48
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getType()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    move-object v4, v2

    goto :goto_1

    :cond_1
    move-object v4, v1

    .line 49
    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isInverse()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v5

    .line 50
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getRootSymbol()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    move-object v7, v2

    goto :goto_2

    :cond_2
    move-object v7, v1

    .line 51
    :goto_2
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getBaseCurrency()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    move-object v8, v2

    goto :goto_3

    :cond_3
    move-object v8, v1

    .line 52
    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getDisplayBaseCurrency()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    move-object v9, v2

    goto :goto_4

    :cond_4
    move-object v9, v1

    .line 53
    :goto_4
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getQuoteCurrency()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    move-object v10, v2

    goto :goto_5

    :cond_5
    move-object v10, v1

    .line 54
    :goto_5
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getStatus()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_6

    move-object v11, v2

    goto :goto_6

    :cond_6
    move-object v11, v1

    .line 55
    :goto_6
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getCreatedAt()J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v12

    .line 56
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getExpireDate()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v13

    .line 57
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getUpdatedAt()J

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v14

    .line 58
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getFairMethod()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_7

    move-object v15, v2

    goto :goto_7

    :cond_7
    move-object v15, v1

    .line 59
    :goto_7
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getFirstOpenDate()J

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v16

    .line 60
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getFundingBaseSymbol()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_8

    move-object/from16 v17, v2

    goto :goto_8

    :cond_8
    move-object/from16 v17, v1

    .line 61
    :goto_8
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getFundingQuoteSymbol()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_9

    move-object/from16 v18, v2

    goto :goto_9

    :cond_9
    move-object/from16 v18, v1

    .line 62
    :goto_9
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getFundingRateSymbol()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_a

    move-object/from16 v19, v2

    goto :goto_a

    :cond_a
    move-object/from16 v19, v1

    .line 63
    :goto_a
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getIndexSymbol()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_b

    move-object/from16 v20, v2

    goto :goto_b

    :cond_b
    move-object/from16 v20, v1

    .line 64
    :goto_b
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getInitialMargin()Ljava/math/BigDecimal;

    move-result-object v1

    invoke-static {v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->orEmptyString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v21

    .line 65
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isDeleverage()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v22

    .line 66
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isQuanto()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v23

    .line 67
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getLotSize()Ljava/math/BigDecimal;

    move-result-object v1

    invoke-static {v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->orEmptyString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v24

    .line 68
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getMaintainMargin()Ljava/math/BigDecimal;

    move-result-object v1

    invoke-static {v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->orEmptyString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v25

    .line 69
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getMakerFeeRate()Ljava/math/BigDecimal;

    move-result-object v1

    invoke-static {v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->orEmptyString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v26

    .line 70
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getMakerFixFee()Ljava/math/BigDecimal;

    move-result-object v1

    invoke-static {v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->orEmptyString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v27

    .line 71
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getMarkMethod()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_c

    move-object/from16 v28, v2

    goto :goto_c

    :cond_c
    move-object/from16 v28, v1

    .line 72
    :goto_c
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getMaxOrderQty()Ljava/math/BigDecimal;

    move-result-object v1

    invoke-static {v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->orEmptyString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v29

    .line 73
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getIndexPriceTickSize()Ljava/math/BigDecimal;

    move-result-object v1

    invoke-static {v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->orEmptyString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v30

    .line 74
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getMaxPrice()Ljava/math/BigDecimal;

    move-result-object v1

    invoke-static {v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->orEmptyString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v31

    .line 75
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getMaxRiskLimit()Ljava/math/BigDecimal;

    move-result-object v1

    invoke-static {v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->orEmptyString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v32

    .line 76
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getMinRiskLimit()Ljava/math/BigDecimal;

    move-result-object v1

    invoke-static {v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->orEmptyString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v33

    .line 77
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getRiskStep()Ljava/math/BigDecimal;

    move-result-object v1

    invoke-static {v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->orEmptyString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v34

    .line 78
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getSettleCurrency()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_d

    move-object/from16 v35, v2

    goto :goto_d

    :cond_d
    move-object/from16 v35, v1

    .line 79
    :goto_d
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getSettleDate()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_e

    invoke-virtual {v1}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_e

    :cond_e
    const/4 v1, 0x0

    :goto_e
    if-nez v1, :cond_f

    move-object/from16 v36, v2

    goto :goto_f

    :cond_f
    move-object/from16 v36, v1

    .line 80
    :goto_f
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getSettlementFee()Ljava/math/BigDecimal;

    move-result-object v1

    invoke-static {v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->orEmptyString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v37

    .line 81
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getTakerFeeRate()Ljava/math/BigDecimal;

    move-result-object v1

    invoke-static {v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->orEmptyString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v38

    .line 82
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getTakerFixFee()Ljava/math/BigDecimal;

    move-result-object v1

    invoke-static {v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->orEmptyString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v39

    .line 83
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getTickSize()Ljava/math/BigDecimal;

    move-result-object v1

    invoke-static {v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->orEmptyString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v40

    .line 84
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getMultiplier()Ljava/math/BigDecimal;

    move-result-object v1

    invoke-static {v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->orEmptyString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v41

    .line 85
    invoke-interface {v0, v6}, Lcom/kubi/kumex/api/IKuMexService;->M(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v42

    .line 86
    invoke-interface {v0, v6}, Lcom/kubi/kumex/api/IKuMexService;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v43

    .line 87
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getMaxLeverage()Ljava/math/BigDecimal;

    move-result-object v0

    invoke-static {v0}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->orEmptyString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v44

    .line 88
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getImgUrl()Ljava/lang/String;

    move-result-object v45

    .line 89
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getMarketStage()Ljava/lang/String;

    move-result-object v46

    .line 90
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getPreMarketToPerpDate()Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->orEmptyString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v47

    .line 91
    invoke-direct/range {v3 .. v47}, Lcom/kubi/rn/core/turbo/FuturesSymbolInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v3
.end method

.method private static final toFuturesSymbolInfo(Ljava/util/Map;Lcom/kubi/kumex/api/IKuMexService;Ljava/lang/String;)Lcom/kubi/rn/core/turbo/FuturesSymbolInfo;
    .locals 47
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/kubi/kumex/api/IKuMexService;",
            "Ljava/lang/String;",
            ")",
            "Lcom/kubi/rn/core/turbo/FuturesSymbolInfo;"
        }
    .end annotation

    move-object/from16 v0, p0

    .line 1
    const-string v1, "type"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 2
    const-string v1, "isInverse"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 3
    const-string v1, "symbol"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    move-object/from16 v5, p2

    goto :goto_0

    :cond_0
    move-object v5, v1

    .line 4
    :goto_0
    const-string v1, "rootSymbol"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 5
    const-string v1, "baseCurrency"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 6
    const-string v1, "displayBaseCurrency"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 7
    const-string v1, "quoteCurrency"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 8
    const-string v1, "status"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 9
    const-string v1, "createdAt"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 10
    const-string v1, "expireDate"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 11
    const-string v1, "updatedAt"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 12
    const-string v1, "fairMethod"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 13
    const-string v1, "firstOpenDate"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 14
    const-string v1, "fundingBaseSymbol"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 15
    const-string v1, "fundingQuoteSymbol"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    .line 16
    const-string v1, "fundingRateSymbol"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    .line 17
    const-string v1, "indexSymbol"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    .line 18
    const-string v1, "initialMargin"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    .line 19
    const-string v1, "isDeleverage"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v21

    .line 20
    const-string v1, "isQuanto"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    .line 21
    const-string v1, "lotSize"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v23

    .line 22
    const-string v1, "maintainMargin"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v24

    .line 23
    const-string v1, "makerFeeRate"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v25

    .line 24
    const-string v1, "makerFixFee"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v26

    .line 25
    const-string v1, "markMethod"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v27

    .line 26
    const-string v1, "maxOrderQty"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v28

    .line 27
    const-string v1, "indexPriceTickSize"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v29

    .line 28
    const-string v1, "maxPrice"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v30

    .line 29
    const-string v1, "maxRiskLimit"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v31

    .line 30
    const-string v1, "minRiskLimit"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v32

    .line 31
    const-string v1, "riskStep"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v33

    .line 32
    const-string v1, "settleCurrency"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v34

    .line 33
    const-string v1, "settleDate"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v35

    .line 34
    const-string v1, "settlementFee"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v36

    .line 35
    const-string v1, "takerFeeRate"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v37

    .line 36
    const-string v1, "takerFixFee"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v38

    .line 37
    const-string v1, "tickSize"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v39

    .line 38
    const-string v1, "multiplier"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v40

    .line 39
    invoke-interface/range {p1 .. p2}, Lcom/kubi/kumex/api/IKuMexService;->M(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v41

    .line 40
    invoke-interface/range {p1 .. p2}, Lcom/kubi/kumex/api/IKuMexService;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v42

    .line 41
    const-string v1, "maxLeverage"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v43

    .line 42
    const-string v1, "imgUrl"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v44

    .line 43
    const-string v1, "marketStage"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v45

    .line 44
    const-string v1, "preMarketToPerpDate"

    invoke-static {v0, v1}, Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v46

    .line 45
    new-instance v2, Lcom/kubi/rn/core/turbo/FuturesSymbolInfo;

    invoke-direct/range {v2 .. v46}, Lcom/kubi/rn/core/turbo/FuturesSymbolInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2
.end method

.method private static final toSpotSymbolInfo(Lcom/kubi/data/entity/SymbolInfoEntity;)Lcom/kubi/rn/core/turbo/SpotSymbolInfo;
    .locals 40

    .line 1
    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getCode()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, ""

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    move-object v3, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v3, v0

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseCurrency()Ljava/lang/String;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    move-object v5, v1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move-object v5, v0

    .line 21
    .line 22
    .line 23
    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteCurrency()Ljava/lang/String;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    if-nez v0, :cond_2

    .line 27
    move-object v6, v1

    .line 28
    goto :goto_2

    .line 29
    :cond_2
    move-object v6, v0

    .line 30
    .line 31
    .line 32
    :goto_2
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getMark()I

    .line 33
    move-result v0

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 37
    move-result-object v7

    .line 38
    .line 39
    .line 40
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBoard()I

    .line 41
    move-result v0

    .line 42
    .line 43
    .line 44
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 45
    move-result-object v8

    .line 46
    .line 47
    .line 48
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getWeight()I

    .line 49
    move-result v0

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 53
    move-result-object v9

    .line 54
    .line 55
    .line 56
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->isEnableTrading()Z

    .line 57
    move-result v0

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 61
    move-result-object v10

    .line 62
    .line 63
    .line 64
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getEnableAuctionTrade()Ljava/lang/Boolean;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    .line 69
    move-result-object v11

    .line 70
    .line 71
    .line 72
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->isDisplay()Z

    .line 73
    move-result v0

    .line 74
    .line 75
    .line 76
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 77
    move-result-object v12

    .line 78
    .line 79
    .line 80
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getMarket()Ljava/lang/String;

    .line 81
    move-result-object v0

    .line 82
    .line 83
    if-nez v0, :cond_3

    .line 84
    move-object v13, v1

    .line 85
    goto :goto_3

    .line 86
    :cond_3
    move-object v13, v0

    .line 87
    .line 88
    .line 89
    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getFeeCode()Ljava/lang/String;

    .line 90
    move-result-object v0

    .line 91
    .line 92
    if-nez v0, :cond_4

    .line 93
    move-object v15, v1

    .line 94
    goto :goto_4

    .line 95
    :cond_4
    move-object v15, v0

    .line 96
    .line 97
    .line 98
    :goto_4
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getMakerFeeRate()D

    .line 99
    move-result-wide v16

    .line 100
    .line 101
    .line 102
    invoke-static/range {v16 .. v17}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 103
    move-result-object v16

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getTakerFeeRate()D

    .line 107
    move-result-wide v17

    .line 108
    .line 109
    .line 110
    invoke-static/range {v17 .. v18}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 111
    move-result-object v17

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteIncrement()Ljava/lang/String;

    .line 115
    move-result-object v0

    .line 116
    .line 117
    if-nez v0, :cond_5

    .line 118
    .line 119
    move-object/from16 v18, v1

    .line 120
    goto :goto_5

    .line 121
    .line 122
    :cond_5
    move-object/from16 v18, v0

    .line 123
    .line 124
    .line 125
    :goto_5
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteMinSize()D

    .line 126
    move-result-wide v19

    .line 127
    .line 128
    .line 129
    invoke-static/range {v19 .. v20}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 130
    move-result-object v19

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteMaxSize()D

    .line 134
    move-result-wide v20

    .line 135
    .line 136
    .line 137
    invoke-static/range {v20 .. v21}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 138
    move-result-object v20

    .line 139
    .line 140
    .line 141
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseIncrement()Ljava/lang/String;

    .line 142
    move-result-object v0

    .line 143
    .line 144
    if-nez v0, :cond_6

    .line 145
    .line 146
    move-object/from16 v21, v1

    .line 147
    goto :goto_6

    .line 148
    .line 149
    :cond_6
    move-object/from16 v21, v0

    .line 150
    .line 151
    .line 152
    :goto_6
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseMinSize()D

    .line 153
    move-result-wide v22

    .line 154
    .line 155
    .line 156
    invoke-static/range {v22 .. v23}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 157
    move-result-object v22

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseMaxSize()D

    .line 161
    move-result-wide v23

    .line 162
    .line 163
    .line 164
    invoke-static/range {v23 .. v24}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 165
    move-result-object v23

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getPriceIncrement()Ljava/lang/String;

    .line 169
    move-result-object v0

    .line 170
    .line 171
    if-nez v0, :cond_7

    .line 172
    .line 173
    move-object/from16 v24, v1

    .line 174
    goto :goto_7

    .line 175
    .line 176
    :cond_7
    move-object/from16 v24, v0

    .line 177
    .line 178
    .line 179
    :goto_7
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getShowSymbol()Ljava/lang/String;

    .line 180
    move-result-object v0

    .line 181
    .line 182
    if-nez v0, :cond_8

    .line 183
    .line 184
    move-object/from16 v28, v1

    .line 185
    goto :goto_8

    .line 186
    .line 187
    :cond_8
    move-object/from16 v28, v0

    .line 188
    .line 189
    .line 190
    :goto_8
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseCurrencyName()Ljava/lang/String;

    .line 191
    move-result-object v0

    .line 192
    .line 193
    if-nez v0, :cond_9

    .line 194
    .line 195
    move-object/from16 v29, v1

    .line 196
    goto :goto_9

    .line 197
    .line 198
    :cond_9
    move-object/from16 v29, v0

    .line 199
    .line 200
    .line 201
    :goto_9
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteCurrencyName()Ljava/lang/String;

    .line 202
    move-result-object v0

    .line 203
    .line 204
    if-nez v0, :cond_a

    .line 205
    .line 206
    move-object/from16 v30, v1

    .line 207
    goto :goto_a

    .line 208
    .line 209
    :cond_a
    move-object/from16 v30, v0

    .line 210
    .line 211
    .line 212
    :goto_a
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->isMarginEnabled()Z

    .line 213
    move-result v0

    .line 214
    .line 215
    .line 216
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 217
    move-result-object v31

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->isBotEnabled()Z

    .line 221
    move-result v0

    .line 222
    .line 223
    .line 224
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 225
    move-result-object v34

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->isIsolatedMarginEnabled()Z

    .line 229
    move-result v0

    .line 230
    .line 231
    .line 232
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 233
    move-result-object v32

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getEnableAuctionTrade()Ljava/lang/Boolean;

    .line 237
    move-result-object v0

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    .line 241
    move-result-object v33

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getDisabledTip()Ljava/lang/String;

    .line 245
    move-result-object v0

    .line 246
    .line 247
    if-nez v0, :cond_b

    .line 248
    .line 249
    move-object/from16 v35, v1

    .line 250
    goto :goto_b

    .line 251
    .line 252
    :cond_b
    move-object/from16 v35, v0

    .line 253
    .line 254
    .line 255
    :goto_b
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getPriceIncrementPrecision()I

    .line 256
    move-result v0

    .line 257
    int-to-double v0, v0

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseIncrementPrecision()I

    .line 261
    move-result v2

    .line 262
    .line 263
    move-wide/from16 v25, v0

    .line 264
    int-to-double v0, v2

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteIncrementPrecision()I

    .line 268
    move-result v2

    .line 269
    .line 270
    move-wide/from16 v36, v0

    .line 271
    int-to-double v0, v2

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getPriceProtectionRate()D

    .line 275
    move-result-wide v38

    .line 276
    .line 277
    .line 278
    invoke-static/range {v38 .. v39}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 279
    move-result-object v2

    .line 280
    .line 281
    move-wide/from16 v37, v36

    .line 282
    .line 283
    move-object/from16 v36, v2

    .line 284
    .line 285
    new-instance v2, Lcom/kubi/rn/core/turbo/SpotSymbolInfo;

    .line 286
    .line 287
    .line 288
    invoke-static/range {v25 .. v26}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 289
    move-result-object v25

    .line 290
    .line 291
    .line 292
    invoke-static/range {v37 .. v38}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 293
    move-result-object v26

    .line 294
    .line 295
    .line 296
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 297
    move-result-object v27

    .line 298
    .line 299
    const-string v4, ""

    .line 300
    .line 301
    const-string v14, ""

    .line 302
    .line 303
    .line 304
    invoke-direct/range {v2 .. v36}, Lcom/kubi/rn/core/turbo/SpotSymbolInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 305
    return-object v2
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
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
.end method
