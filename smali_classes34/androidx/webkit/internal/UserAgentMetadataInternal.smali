.class public Landroidx/webkit/internal/UserAgentMetadataInternal;
.super Ljava/lang/Object;
.source "UserAgentMetadataInternal.java"


# static fields
.field private static final ARCHITECTURE:Ljava/lang/String; = "ARCHITECTURE"

.field private static final BITNESS:Ljava/lang/String; = "BITNESS"

.field private static final BRAND_VERSION_LENGTH:I = 0x3

.field private static final BRAND_VERSION_LIST:Ljava/lang/String; = "BRAND_VERSION_LIST"

.field private static final FULL_VERSION:Ljava/lang/String; = "FULL_VERSION"

.field private static final MOBILE:Ljava/lang/String; = "MOBILE"

.field private static final MODEL:Ljava/lang/String; = "MODEL"

.field private static final PLATFORM:Ljava/lang/String; = "PLATFORM"

.field private static final PLATFORM_VERSION:Ljava/lang/String; = "PLATFORM_VERSION"

.field private static final WOW64:Ljava/lang/String; = "WOW64"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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
.end method

.method public static convertUserAgentMetadataToMap(Landroidx/webkit/UserAgentMetadata;)Ljava/util/Map;
    .locals 3
    .param p0    # Landroidx/webkit/UserAgentMetadata;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/webkit/UserAgentMetadata;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/webkit/UserAgentMetadata;->getBrandVersionList()Ljava/util/List;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-static {v1}, Landroidx/webkit/internal/UserAgentMetadataInternal;->getBrandVersionArray(Ljava/util/List;)[[Ljava/lang/String;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    const-string v2, "BRAND_VERSION_LIST"

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    const-string v1, "FULL_VERSION"

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/webkit/UserAgentMetadata;->getFullVersion()Ljava/lang/String;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    const-string v1, "PLATFORM"

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/webkit/UserAgentMetadata;->getPlatform()Ljava/lang/String;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    .line 36
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    const-string v1, "PLATFORM_VERSION"

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Landroidx/webkit/UserAgentMetadata;->getPlatformVersion()Ljava/lang/String;

    .line 42
    move-result-object v2

    .line 43
    .line 44
    .line 45
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    const-string v1, "ARCHITECTURE"

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Landroidx/webkit/UserAgentMetadata;->getArchitecture()Ljava/lang/String;

    .line 51
    move-result-object v2

    .line 52
    .line 53
    .line 54
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    const-string v1, "MODEL"

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Landroidx/webkit/UserAgentMetadata;->getModel()Ljava/lang/String;

    .line 60
    move-result-object v2

    .line 61
    .line 62
    .line 63
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Landroidx/webkit/UserAgentMetadata;->isMobile()Z

    .line 67
    move-result v1

    .line 68
    .line 69
    .line 70
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 71
    move-result-object v1

    .line 72
    .line 73
    const-string v2, "MOBILE"

    .line 74
    .line 75
    .line 76
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Landroidx/webkit/UserAgentMetadata;->getBitness()I

    .line 80
    move-result v1

    .line 81
    .line 82
    .line 83
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    move-result-object v1

    .line 85
    .line 86
    const-string v2, "BITNESS"

    .line 87
    .line 88
    .line 89
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Landroidx/webkit/UserAgentMetadata;->isWow64()Z

    .line 93
    move-result p0

    .line 94
    .line 95
    .line 96
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 97
    move-result-object p0

    .line 98
    .line 99
    const-string v1, "WOW64"

    .line 100
    .line 101
    .line 102
    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    return-object v0
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
    .line 215
.end method

.method private static getBrandVersionArray(Ljava/util/List;)[[Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/webkit/UserAgentMetadata$BrandVersion;",
            ">;)[[",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    goto :goto_1

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x2

    .line 15
    .line 16
    new-array v2, v1, [I

    .line 17
    const/4 v3, 0x1

    .line 18
    const/4 v4, 0x3

    .line 19
    .line 20
    aput v4, v2, v3

    .line 21
    const/4 v4, 0x0

    .line 22
    .line 23
    aput v0, v2, v4

    .line 24
    .line 25
    const-class v0, Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    check-cast v0, [[Ljava/lang/String;

    .line 32
    move v2, v4

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 36
    move-result v5

    .line 37
    .line 38
    if-ge v2, v5, :cond_1

    .line 39
    .line 40
    aget-object v5, v0, v2

    .line 41
    .line 42
    .line 43
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    move-result-object v6

    .line 45
    .line 46
    check-cast v6, Landroidx/webkit/UserAgentMetadata$BrandVersion;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v6}, Landroidx/webkit/UserAgentMetadata$BrandVersion;->getBrand()Ljava/lang/String;

    .line 50
    move-result-object v6

    .line 51
    .line 52
    aput-object v6, v5, v4

    .line 53
    .line 54
    aget-object v5, v0, v2

    .line 55
    .line 56
    .line 57
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 58
    move-result-object v6

    .line 59
    .line 60
    check-cast v6, Landroidx/webkit/UserAgentMetadata$BrandVersion;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v6}, Landroidx/webkit/UserAgentMetadata$BrandVersion;->getMajorVersion()Ljava/lang/String;

    .line 64
    move-result-object v6

    .line 65
    .line 66
    aput-object v6, v5, v3

    .line 67
    .line 68
    aget-object v5, v0, v2

    .line 69
    .line 70
    .line 71
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 72
    move-result-object v6

    .line 73
    .line 74
    check-cast v6, Landroidx/webkit/UserAgentMetadata$BrandVersion;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v6}, Landroidx/webkit/UserAgentMetadata$BrandVersion;->getFullVersion()Ljava/lang/String;

    .line 78
    move-result-object v6

    .line 79
    .line 80
    aput-object v6, v5, v1

    .line 81
    .line 82
    add-int/lit8 v2, v2, 0x1

    .line 83
    goto :goto_0

    .line 84
    :cond_1
    return-object v0

    .line 85
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 86
    return-object p0
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
    .line 215
.end method

.method public static getUserAgentMetadataFromMap(Ljava/util/Map;)Landroidx/webkit/UserAgentMetadata;
    .locals 9
    .param p0    # Ljava/util/Map;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Landroidx/webkit/UserAgentMetadata;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Landroidx/webkit/UserAgentMetadata$Builder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroidx/webkit/UserAgentMetadata$Builder;-><init>()V

    .line 6
    .line 7
    const-string v1, "BRAND_VERSION_LIST"

    .line 8
    .line 9
    .line 10
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    check-cast v1, [[Ljava/lang/String;

    .line 16
    .line 17
    new-instance v2, Ljava/util/ArrayList;

    .line 18
    .line 19
    .line 20
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 21
    array-length v3, v1

    .line 22
    const/4 v4, 0x0

    .line 23
    move v5, v4

    .line 24
    .line 25
    :goto_0
    if-ge v5, v3, :cond_0

    .line 26
    .line 27
    aget-object v6, v1, v5

    .line 28
    .line 29
    new-instance v7, Landroidx/webkit/UserAgentMetadata$BrandVersion$Builder;

    .line 30
    .line 31
    .line 32
    invoke-direct {v7}, Landroidx/webkit/UserAgentMetadata$BrandVersion$Builder;-><init>()V

    .line 33
    .line 34
    aget-object v8, v6, v4

    .line 35
    .line 36
    .line 37
    invoke-virtual {v7, v8}, Landroidx/webkit/UserAgentMetadata$BrandVersion$Builder;->setBrand(Ljava/lang/String;)Landroidx/webkit/UserAgentMetadata$BrandVersion$Builder;

    .line 38
    move-result-object v7

    .line 39
    const/4 v8, 0x1

    .line 40
    .line 41
    aget-object v8, v6, v8

    .line 42
    .line 43
    .line 44
    invoke-virtual {v7, v8}, Landroidx/webkit/UserAgentMetadata$BrandVersion$Builder;->setMajorVersion(Ljava/lang/String;)Landroidx/webkit/UserAgentMetadata$BrandVersion$Builder;

    .line 45
    move-result-object v7

    .line 46
    const/4 v8, 0x2

    .line 47
    .line 48
    aget-object v6, v6, v8

    .line 49
    .line 50
    .line 51
    invoke-virtual {v7, v6}, Landroidx/webkit/UserAgentMetadata$BrandVersion$Builder;->setFullVersion(Ljava/lang/String;)Landroidx/webkit/UserAgentMetadata$BrandVersion$Builder;

    .line 52
    move-result-object v6

    .line 53
    .line 54
    .line 55
    invoke-virtual {v6}, Landroidx/webkit/UserAgentMetadata$BrandVersion$Builder;->build()Landroidx/webkit/UserAgentMetadata$BrandVersion;

    .line 56
    move-result-object v6

    .line 57
    .line 58
    .line 59
    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    add-int/lit8 v5, v5, 0x1

    .line 62
    goto :goto_0

    .line 63
    .line 64
    .line 65
    :cond_0
    invoke-virtual {v0, v2}, Landroidx/webkit/UserAgentMetadata$Builder;->setBrandVersionList(Ljava/util/List;)Landroidx/webkit/UserAgentMetadata$Builder;

    .line 66
    .line 67
    :cond_1
    const-string v1, "FULL_VERSION"

    .line 68
    .line 69
    .line 70
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    move-result-object v1

    .line 72
    .line 73
    check-cast v1, Ljava/lang/String;

    .line 74
    .line 75
    if-eqz v1, :cond_2

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v1}, Landroidx/webkit/UserAgentMetadata$Builder;->setFullVersion(Ljava/lang/String;)Landroidx/webkit/UserAgentMetadata$Builder;

    .line 79
    .line 80
    :cond_2
    const-string v1, "PLATFORM"

    .line 81
    .line 82
    .line 83
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    move-result-object v1

    .line 85
    .line 86
    check-cast v1, Ljava/lang/String;

    .line 87
    .line 88
    if-eqz v1, :cond_3

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v1}, Landroidx/webkit/UserAgentMetadata$Builder;->setPlatform(Ljava/lang/String;)Landroidx/webkit/UserAgentMetadata$Builder;

    .line 92
    .line 93
    :cond_3
    const-string v1, "PLATFORM_VERSION"

    .line 94
    .line 95
    .line 96
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    move-result-object v1

    .line 98
    .line 99
    check-cast v1, Ljava/lang/String;

    .line 100
    .line 101
    if-eqz v1, :cond_4

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v1}, Landroidx/webkit/UserAgentMetadata$Builder;->setPlatformVersion(Ljava/lang/String;)Landroidx/webkit/UserAgentMetadata$Builder;

    .line 105
    .line 106
    :cond_4
    const-string v1, "ARCHITECTURE"

    .line 107
    .line 108
    .line 109
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    move-result-object v1

    .line 111
    .line 112
    check-cast v1, Ljava/lang/String;

    .line 113
    .line 114
    if-eqz v1, :cond_5

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v1}, Landroidx/webkit/UserAgentMetadata$Builder;->setArchitecture(Ljava/lang/String;)Landroidx/webkit/UserAgentMetadata$Builder;

    .line 118
    .line 119
    :cond_5
    const-string v1, "MODEL"

    .line 120
    .line 121
    .line 122
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    move-result-object v1

    .line 124
    .line 125
    check-cast v1, Ljava/lang/String;

    .line 126
    .line 127
    if-eqz v1, :cond_6

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v1}, Landroidx/webkit/UserAgentMetadata$Builder;->setModel(Ljava/lang/String;)Landroidx/webkit/UserAgentMetadata$Builder;

    .line 131
    .line 132
    :cond_6
    const-string v1, "MOBILE"

    .line 133
    .line 134
    .line 135
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    move-result-object v1

    .line 137
    .line 138
    check-cast v1, Ljava/lang/Boolean;

    .line 139
    .line 140
    if-eqz v1, :cond_7

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 144
    move-result v1

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, v1}, Landroidx/webkit/UserAgentMetadata$Builder;->setMobile(Z)Landroidx/webkit/UserAgentMetadata$Builder;

    .line 148
    .line 149
    :cond_7
    const-string v1, "BITNESS"

    .line 150
    .line 151
    .line 152
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    move-result-object v1

    .line 154
    .line 155
    check-cast v1, Ljava/lang/Integer;

    .line 156
    .line 157
    if-eqz v1, :cond_8

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 161
    move-result v1

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v1}, Landroidx/webkit/UserAgentMetadata$Builder;->setBitness(I)Landroidx/webkit/UserAgentMetadata$Builder;

    .line 165
    .line 166
    :cond_8
    const-string v1, "WOW64"

    .line 167
    .line 168
    .line 169
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    move-result-object p0

    .line 171
    .line 172
    check-cast p0, Ljava/lang/Boolean;

    .line 173
    .line 174
    if-eqz p0, :cond_9

    .line 175
    .line 176
    .line 177
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 178
    move-result p0

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, p0}, Landroidx/webkit/UserAgentMetadata$Builder;->setWow64(Z)Landroidx/webkit/UserAgentMetadata$Builder;

    .line 182
    .line 183
    .line 184
    :cond_9
    invoke-virtual {v0}, Landroidx/webkit/UserAgentMetadata$Builder;->build()Landroidx/webkit/UserAgentMetadata;

    .line 185
    move-result-object p0

    .line 186
    return-object p0
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
.end method
