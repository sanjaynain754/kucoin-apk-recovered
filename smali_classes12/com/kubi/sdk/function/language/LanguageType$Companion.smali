.class public final Lcom/kubi/sdk/function/language/LanguageType$Companion;
.super Ljava/lang/Object;
.source "LanguageType.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/sdk/function/language/LanguageType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005J\u000c\u0010\u0008\u001a\u0004\u0018\u00010\u0005*\u00020\u0006J\u0016\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/kubi/sdk/function/language/LanguageType$Companion;",
        "",
        "<init>",
        "()V",
        "toLanguageType",
        "Lcom/kubi/sdk/function/language/LanguageType;",
        "",
        "default",
        "toLanguageTypeOrNull",
        "Lcom/kubi/sdk/function/language/entity/LanguageEntity;",
        "LLanguage_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLanguageType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageType.kt\ncom/kubi/sdk/function/language/LanguageType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n1#2:171\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kubi/sdk/function/language/LanguageType$Companion;-><init>()V

    return-void
.end method

.method public static synthetic toLanguageType$default(Lcom/kubi/sdk/function/language/LanguageType$Companion;Lcom/kubi/sdk/function/language/entity/LanguageEntity;Lcom/kubi/sdk/function/language/LanguageType;ILjava/lang/Object;)Lcom/kubi/sdk/function/language/LanguageType;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    .line 2
    sget-object p2, Lcom/kubi/sdk/function/language/LanguageType;->ENGLISH:Lcom/kubi/sdk/function/language/LanguageType;

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/kubi/sdk/function/language/LanguageType$Companion;->toLanguageType(Lcom/kubi/sdk/function/language/entity/LanguageEntity;Lcom/kubi/sdk/function/language/LanguageType;)Lcom/kubi/sdk/function/language/LanguageType;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic toLanguageType$default(Lcom/kubi/sdk/function/language/LanguageType$Companion;Ljava/lang/String;Lcom/kubi/sdk/function/language/LanguageType;ILjava/lang/Object;)Lcom/kubi/sdk/function/language/LanguageType;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    .line 1
    sget-object p2, Lcom/kubi/sdk/function/language/LanguageType;->ENGLISH:Lcom/kubi/sdk/function/language/LanguageType;

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/kubi/sdk/function/language/LanguageType$Companion;->toLanguageType(Ljava/lang/String;Lcom/kubi/sdk/function/language/LanguageType;)Lcom/kubi/sdk/function/language/LanguageType;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final toLanguageType(Lcom/kubi/sdk/function/language/entity/LanguageEntity;Lcom/kubi/sdk/function/language/LanguageType;)Lcom/kubi/sdk/function/language/LanguageType;
    .locals 1
    .param p1    # Lcom/kubi/sdk/function/language/entity/LanguageEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/sdk/function/language/LanguageType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "default"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_1

    .line 3
    invoke-virtual {p1}, Lcom/kubi/sdk/function/language/entity/LanguageEntity;->getType()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p0, p1}, Lcom/kubi/sdk/function/language/LanguageType$Companion;->toLanguageTypeOrNull(Ljava/lang/String;)Lcom/kubi/sdk/function/language/LanguageType;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    :goto_0
    return-object p2
.end method

.method public final toLanguageType(Ljava/lang/String;Lcom/kubi/sdk/function/language/LanguageType;)Lcom/kubi/sdk/function/language/LanguageType;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/sdk/function/language/LanguageType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "default"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    return-object p2

    .line 2
    :cond_0
    invoke-static {}, Lcom/kubi/sdk/function/language/LanguageType;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/kubi/sdk/function/language/LanguageType;

    invoke-virtual {v2}, Lcom/kubi/sdk/function/language/LanguageType;->getLocalString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lcom/kubi/sdk/function/language/LanguageType;

    if-nez v1, :cond_3

    return-object p2

    :cond_3
    return-object v1
.end method

.method public final toLanguageTypeOrNull(Ljava/lang/String;)Lcom/kubi/sdk/function/language/LanguageType;
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    return-object v1

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {}, Lcom/kubi/sdk/function/language/LanguageType;->getEntries()Lkotlin/enums/EnumEntries;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    move-result v2

    .line 26
    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    move-result-object v2

    .line 32
    move-object v3, v2

    .line 33
    .line 34
    check-cast v3, Lcom/kubi/sdk/function/language/LanguageType;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Lcom/kubi/sdk/function/language/LanguageType;->getLocalString()Ljava/lang/String;

    .line 38
    move-result-object v3

    .line 39
    .line 40
    .line 41
    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    move-result v3

    .line 43
    .line 44
    if-eqz v3, :cond_1

    .line 45
    move-object v1, v2

    .line 46
    .line 47
    :cond_2
    check-cast v1, Lcom/kubi/sdk/function/language/LanguageType;

    .line 48
    return-object v1
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
.end method
