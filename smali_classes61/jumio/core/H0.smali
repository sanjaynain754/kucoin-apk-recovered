.class public final Ljumio/core/H0;
.super Ljava/lang/Object;
.source "SourceFile"


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
    .line 19
    .line 20
    .line 21
.end method

.method public static final a(Ljava/lang/String;)Lcom/jumio/core/credentials/RequiredPart;
    .locals 1

    const-string v0, "item"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    sget-object v0, Lcom/jumio/core/credentials/RequiredPart;->Companion:Lcom/jumio/core/credentials/RequiredPart$Companion;

    invoke-virtual {v0, p0}, Lcom/jumio/core/credentials/RequiredPart$Companion;->fromString(Ljava/lang/String;)Lcom/jumio/core/credentials/RequiredPart;

    move-result-object p0

    return-object p0
.end method

.method public static final a(ZLjumio/core/H0;Lorg/json/JSONObject;)Lcom/jumio/core/models/CredentialDataModel;
    .locals 8

    const-string v0, "jsonObject"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    const-string v0, "id"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 2
    const-string v0, "category"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "FACEMAP"

    if-eqz p0, :cond_1

    .line 3
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_1

    :cond_0
    const/4 p0, 0x1

    :goto_0
    move v7, p0

    goto :goto_2

    :cond_1
    :goto_1
    const/4 p0, 0x0

    goto :goto_0

    .line 4
    :goto_2
    const-string p0, "capabilities"

    invoke-virtual {p2, p0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p0

    const-string v3, "getJSONArray(...)"

    invoke-static {p0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Llg0/b;

    invoke-direct {v4}, Llg0/b;-><init>()V

    invoke-static {p0, v4}, Lcom/jumio/core/util/JsonUtilKt;->map(Lorg/json/JSONArray;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object p0

    .line 5
    const-string v4, "requiredParts"

    invoke-virtual {p2, v4}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Llg0/c;

    invoke-direct {v3}, Llg0/c;-><init>()V

    invoke-static {v4, v3}, Lcom/jumio/core/util/JsonUtilKt;->map(Lorg/json/JSONArray;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object v6

    if-eqz v0, :cond_7

    .line 6
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v3

    const v4, -0x16501e41

    if-eq v3, v4, :cond_5

    const/16 v1, 0x91b

    if-eq v3, v1, :cond_4

    const v1, 0x6202c11b

    if-eq v3, v1, :cond_2

    goto :goto_3

    :cond_2
    const-string v1, "DOCUMENT"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_3

    .line 7
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    invoke-static {p2}, Ljumio/core/H0;->b(Lorg/json/JSONObject;)Ljava/util/ArrayList;

    move-result-object v4

    .line 9
    invoke-static {p2}, Ljumio/core/H0;->d(Lorg/json/JSONObject;)Ljava/util/ArrayList;

    move-result-object v5

    .line 10
    new-instance v1, Ljumio/core/E0;

    move-object v3, p0

    invoke-direct/range {v1 .. v7}, Ljumio/core/E0;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/List;I)V

    return-object v1

    :cond_4
    move-object v3, p0

    .line 11
    const-string p0, "ID"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_7

    .line 12
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    invoke-static {p2}, Ljumio/core/H0;->c(Lorg/json/JSONObject;)Ljava/util/ArrayList;

    move-result-object v4

    .line 14
    invoke-static {p2}, Ljumio/core/H0;->e(Lorg/json/JSONObject;)Ljava/util/ArrayList;

    move-result-object v5

    .line 15
    new-instance v1, Ljumio/core/G0;

    invoke-direct/range {v1 .. v7}, Ljumio/core/G0;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/List;I)V

    return-object v1

    :cond_5
    move-object v3, p0

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto :goto_3

    .line 17
    :cond_6
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    invoke-static {p2}, Ljumio/core/H0;->f(Lorg/json/JSONObject;)Ljava/util/ArrayList;

    move-result-object v4

    .line 19
    new-instance v1, Ljumio/core/F0;

    move-object v5, v6

    move v6, v7

    invoke-direct/range {v1 .. v6}, Ljumio/core/F0;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/List;I)V

    return-object v1

    :cond_7
    :goto_3
    const/4 p0, 0x0

    return-object p0
.end method

.method public static a(Lorg/json/JSONObject;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/util/ArrayList;
    .locals 4

    .line 29
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    const/4 p1, 0x0

    if-eqz p0, :cond_2

    .line 30
    const-string v0, "predefinedType"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "DEFINED"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 31
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 32
    const-string/jumbo v0, "values"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p0

    if-nez p0, :cond_0

    new-instance p0, Lorg/json/JSONArray;

    invoke-direct {p0}, Lorg/json/JSONArray;-><init>()V

    .line 33
    :cond_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 34
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "optString(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object p1
.end method

.method public static final a(Lorg/json/JSONObject;)Ljumio/core/C0;
    .locals 1

    const-string v0, "item"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    sget-object v0, Ljumio/core/C0;->c:Lcom/jumio/core/credentials/CredentialCapability$Companion;

    invoke-virtual {v0, p0}, Lcom/jumio/core/credentials/CredentialCapability$Companion;->fromJson(Lorg/json/JSONObject;)Ljumio/core/C0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static b(Lorg/json/JSONObject;)Ljava/util/ArrayList;
    .locals 2

    .line 2
    new-instance v0, Llg0/h;

    invoke-direct {v0}, Llg0/h;-><init>()V

    const-string v1, "country"

    invoke-static {p0, v1, v0}, Ljumio/core/H0;->a(Lorg/json/JSONObject;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static c(Lorg/json/JSONObject;)Ljava/util/ArrayList;
    .locals 2

    .line 2
    new-instance v0, Llg0/f;

    invoke-direct {v0}, Llg0/f;-><init>()V

    const-string v1, "country"

    invoke-static {p0, v1, v0}, Ljumio/core/H0;->a(Lorg/json/JSONObject;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string/jumbo v0, "toUpperCase(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static d(Lorg/json/JSONObject;)Ljava/util/ArrayList;
    .locals 2

    .line 1
    new-instance v0, Llg0/d;

    invoke-direct {v0}, Llg0/d;-><init>()V

    const-string/jumbo v1, "type"

    invoke-static {p0, v1, v0}, Ljumio/core/H0;->a(Lorg/json/JSONObject;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ljava/lang/String;)Lcom/jumio/sdk/document/JumioDocumentType;
    .locals 3

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 3
    :cond_0
    :try_start_0
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v2, "toUpperCase(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/jumio/sdk/document/JumioDocumentType;->valueOf(Ljava/lang/String;)Lcom/jumio/sdk/document/JumioDocumentType;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 4
    :catch_0
    const-string v0, " is not a valid DocumentType"

    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/jumio/commons/log/Log;->e(Ljava/lang/String;)V

    return-object v1
.end method

.method public static e(Lorg/json/JSONObject;)Ljava/util/ArrayList;
    .locals 2

    .line 1
    new-instance v0, Llg0/e;

    invoke-direct {v0}, Llg0/e;-><init>()V

    const-string/jumbo v1, "type"

    invoke-static {p0, v1, v0}, Ljumio/core/H0;->a(Lorg/json/JSONObject;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method public static f(Lorg/json/JSONObject;)Ljava/util/ArrayList;
    .locals 2

    .line 1
    new-instance v0, Llg0/i;

    invoke-direct {v0}, Llg0/i;-><init>()V

    const-string/jumbo v1, "type"

    invoke-static {p0, v1, v0}, Ljumio/core/H0;->a(Lorg/json/JSONObject;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Ljava/lang/String;)Ljumio/core/j2;
    .locals 3

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 3
    :cond_0
    :try_start_0
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v2, "toUpperCase(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ljumio/core/j2;->valueOf(Ljava/lang/String;)Ljumio/core/j2;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 4
    :catch_0
    const-string v0, " is not a valid LivenessType"

    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/jumio/commons/log/Log;->e(Ljava/lang/String;)V

    return-object v1
.end method


# virtual methods
.method public final a(Lorg/json/JSONArray;)Lcom/jumio/core/models/CredentialsModel;
    .locals 6

    const-string v0, "jsonArray"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    const-string v2, ""

    if-ge v1, v0, :cond_2

    .line 23
    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_1

    .line 24
    :cond_0
    const-string v4, "category"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "ID"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 25
    const-string v0, "acquisitionMode"

    invoke-virtual {v3, v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v0, "optString(...)"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 26
    :cond_2
    :goto_2
    const-string v0, "REUSABLE_IDENTITY"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    .line 27
    new-instance v1, Llg0/g;

    invoke-direct {v1, v0, p0}, Llg0/g;-><init>(ZLjumio/core/H0;)V

    invoke-static {p1, v1}, Lcom/jumio/core/util/JsonUtilKt;->mapNotNull(Lorg/json/JSONArray;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object p1

    .line 28
    new-instance v0, Lcom/jumio/core/models/CredentialsModel;

    invoke-direct {v0, p1, v2}, Lcom/jumio/core/models/CredentialsModel;-><init>(Ljava/util/List;Ljava/lang/String;)V

    return-object v0
.end method
