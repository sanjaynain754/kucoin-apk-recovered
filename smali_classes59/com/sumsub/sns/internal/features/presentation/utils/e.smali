.class public final Lcom/sumsub/sns/internal/features/presentation/utils/e;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final b:Lcom/sumsub/sns/internal/features/presentation/utils/a;

.field public static final c:Ljava/util/List;


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/utils/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/utils/a;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/utils/e;->b:Lcom/sumsub/sns/internal/features/presentation/utils/a;

    .line 8
    .line 9
    const-string v0, "customPrivacyNote"

    .line 10
    .line 11
    const-string v1, "customPrivacyLink"

    .line 12
    .line 13
    .line 14
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/utils/e;->c:Ljava/util/List;

    .line 22
    return-void
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
.end method

.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/repository/extensions/a;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/utils/e;->a:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    .line 6
    return-void
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
.end method

.method public static a(Ljava/lang/String;Ljava/util/List;)Lcom/sumsub/sns/internal/features/presentation/utils/d;
    .locals 4

    const/4 v0, 0x2

    const/4 v1, 0x0

    .line 26
    const-string/jumbo v2, "sumsub://agreement-content/"

    const/4 v3, 0x0

    invoke-static {p0, v2, v3, v0, v1}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 27
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/utils/b;

    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/utils/b;-><init>(Ljava/lang/String;)V

    return-object p1

    .line 28
    :cond_0
    invoke-static {p0, v2}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eqz p1, :cond_6

    .line 29
    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/i;

    if-eqz p1, :cond_6

    .line 30
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/i;->b:Lcom/sumsub/sns/internal/features/data/model/common/remote/c;

    if-nez p1, :cond_1

    goto :goto_2

    .line 31
    :cond_1
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/c;->a:Ljava/lang/String;

    .line 32
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/c;->e:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 33
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    new-instance p0, Lcom/sumsub/sns/internal/features/presentation/utils/c;

    invoke-direct {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/utils/c;-><init>(Ljava/lang/String;)V

    return-object p0

    :cond_3
    :goto_0
    if-eqz p1, :cond_5

    .line 34
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    new-instance p0, Lcom/sumsub/sns/internal/features/presentation/utils/b;

    invoke-direct {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/utils/b;-><init>(Ljava/lang/String;)V

    return-object p0

    .line 35
    :cond_5
    :goto_1
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/utils/b;

    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/utils/b;-><init>(Ljava/lang/String;)V

    return-object p1

    .line 36
    :cond_6
    :goto_2
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/utils/b;

    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/utils/b;-><init>(Ljava/lang/String;)V

    return-object p1

    .line 37
    :cond_7
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/utils/b;

    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/utils/b;-><init>(Ljava/lang/String;)V

    return-object p1
.end method

.method public static final a(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 2

    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "- "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a(Lcom/sumsub/sns/internal/features/data/model/common/h;Lcom/sumsub/sns/internal/features/data/model/common/remote/i;I)Ljava/lang/String;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/i;->b:Lcom/sumsub/sns/internal/features/data/model/common/remote/c;

    .line 2
    iget-object v3, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/i;->c:Ljava/lang/String;

    const/4 v4, 0x0

    if-eqz v0, :cond_1

    .line 3
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/data/model/common/h;->u:Ljava/util/Map;

    .line 4
    invoke-static {v3, v5}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    move-object v5, v3

    goto :goto_2

    :cond_1
    :goto_0
    if-eqz v0, :cond_2

    .line 5
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/data/model/common/h;->u:Ljava/util/Map;

    .line 6
    const-string v5, "agreements.privacyPolicy"

    invoke-static {v5, v3}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_2
    move-object v3, v4

    :goto_1
    if-nez v3, :cond_0

    return-object v4

    .line 7
    :goto_2
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/i;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/f;

    if-eqz v1, :cond_3

    .line 8
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/f;->a:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object v1, v4

    .line 9
    :goto_3
    const-string v3, "USA"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    if-eqz v0, :cond_5

    .line 10
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/h;->u:Ljava/util/Map;

    .line 11
    const-string v3, "agreements.buttonLabelUSA"

    invoke-static {v3, v1}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    :cond_4
    if-eqz v0, :cond_5

    .line 12
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/h;->u:Ljava/util/Map;

    .line 13
    const-string v3, "agreements.buttonLabel"

    invoke-static {v3, v1}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    :cond_5
    move-object v1, v4

    :goto_4
    const-string v3, ""

    if-nez v1, :cond_6

    move-object v1, v3

    :cond_6
    if-eqz v2, :cond_7

    .line 14
    iget-object v6, v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/c;->d:Ljava/util/List;

    if-eqz v6, :cond_7

    .line 15
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-eqz v6, :cond_7

    const/4 v7, 0x0

    const/4 v8, 0x2

    const-string v9, "customPrivacyLink"

    invoke-static {v6, v9, v7, v8, v4}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v6

    const/4 v7, 0x1

    if-ne v6, v7, :cond_7

    .line 16
    iget-object v6, v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/c;->e:Ljava/lang/String;

    if-nez v6, :cond_8

    move-object v6, v3

    goto :goto_5

    .line 17
    :cond_7
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v7, "sumsub://agreement-content/"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v7, p2

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    :cond_8
    :goto_5
    if-eqz v0, :cond_a

    .line 18
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/h;->u:Ljava/util/Map;

    .line 19
    const-string v7, "agreements.privacyPolicyPrivacyLabel"

    invoke-static {v7, v0}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_9

    goto :goto_6

    :cond_9
    move-object v3, v0

    :cond_a
    :goto_6
    if-eqz v2, :cond_b

    .line 20
    iget-object v0, v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/c;->g:Ljava/lang/String;

    goto :goto_7

    :cond_b
    move-object v0, v4

    .line 21
    :goto_7
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_c

    goto :goto_8

    :cond_c
    move-object v6, v4

    :goto_8
    const-string v2, "</a>"

    const-string v11, "\">"

    const-string v12, "<a href=\""

    if-eqz v6, :cond_e

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_d

    goto :goto_9

    :cond_d
    move-object v7, v6

    goto :goto_a

    :cond_e
    :goto_9
    move-object v7, v1

    :goto_a
    const/4 v9, 0x4

    const/4 v10, 0x0

    .line 22
    const-string/jumbo v6, "{link}"

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    if-eqz v0, :cond_11

    .line 23
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_f

    move-object v4, v0

    :cond_f
    if-eqz v4, :cond_11

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_10

    goto :goto_b

    :cond_10
    move-object v15, v0

    goto :goto_c

    :cond_11
    :goto_b
    move-object v15, v3

    :goto_c
    const/16 v17, 0x4

    const/16 v18, 0x0

    .line 24
    const-string/jumbo v14, "{privacyLink}"

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Lcom/sumsub/sns/internal/features/data/model/common/h;Lcom/sumsub/sns/internal/features/data/model/common/remote/i;I)Ljava/lang/String;
    .locals 6

    .line 1
    .line 2
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/i;->c:Ljava/lang/String;

    .line 3
    .line 4
    if-eqz p0, :cond_1

    .line 5
    .line 6
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/h;->d:Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    invoke-static {p1, p0}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string/jumbo p1, "sumsub://agreement-content/"

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    move-result-object v2

    .line 32
    const/4 v4, 0x4

    .line 33
    const/4 v5, 0x0

    .line 34
    .line 35
    .line 36
    const-string/jumbo v1, "{link}"

    .line 37
    const/4 v3, 0x0

    .line 38
    .line 39
    .line 40
    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 44
    return-object p0
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
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/h;Ljava/util/List;)Landroid/text/SpannableStringBuilder;
    .locals 10

    .line 38
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 39
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v9, 0x0

    if-eqz v2, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    if-gez v1, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 40
    :cond_0
    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/i;

    .line 41
    invoke-static {v2}, Lcom/sumsub/sns/internal/features/presentation/utils/a;->a(Lcom/sumsub/sns/internal/features/data/model/common/remote/i;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 42
    invoke-static {p1, v2, v1}, Lcom/sumsub/sns/internal/features/presentation/utils/e;->b(Lcom/sumsub/sns/internal/features/data/model/common/h;Lcom/sumsub/sns/internal/features/data/model/common/remote/i;I)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {v1}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    goto :goto_1

    .line 43
    :cond_1
    invoke-static {p1, v2, v1}, Lcom/sumsub/sns/internal/features/presentation/utils/e;->a(Lcom/sumsub/sns/internal/features/data/model/common/h;Lcom/sumsub/sns/internal/features/data/model/common/remote/i;I)Ljava/lang/String;

    move-result-object v9

    :cond_2
    :goto_1
    if-eqz v9, :cond_3

    .line 44
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    move v1, v3

    goto :goto_0

    .line 45
    :cond_4
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/utils/d0;

    invoke-direct {v6}, Lcom/sumsub/sns/internal/features/presentation/utils/d0;-><init>()V

    const/16 v7, 0x1e

    const/4 v8, 0x0

    const-string v1, "\n\n"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v8}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    if-eqz p1, :cond_5

    .line 46
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/h;->u:Ljava/util/Map;

    .line 47
    const-string v0, "agreements.modalSubTitle"

    invoke-static {v0, p1}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v9

    .line 48
    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    invoke-virtual {p1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    const-string v0, "\n"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 53
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/utils/e;->a:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    check-cast p2, Lcom/sumsub/sns/internal/core/domain/d;

    .line 54
    iget-object p2, p2, Lcom/sumsub/sns/internal/core/domain/d;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 55
    iget-object p2, p2, Lcom/sumsub/sns/internal/core/domain/h;->a:Landroid/content/Context;

    .line 56
    invoke-static {p1, p2}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object p1

    .line 57
    invoke-static {p1}, Lcom/sumsub/sns/internal/core/common/i0;->a(Landroid/text/Spanned;)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    return-object p1
.end method
