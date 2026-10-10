.class public final Lcom/sumsub/sns/internal/core/presentation/theme/p;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/core/theme/SNSCustomizationTheme;


# static fields
.field public static final f:Lcom/sumsub/sns/internal/core/presentation/theme/m;


# instance fields
.field public final a:Lcom/sumsub/sns/core/theme/SNSCustomizationFileFormat;

.field public b:Ljava/util/Map;

.field public c:Ljava/util/Map;

.field public d:Ljava/util/Map;

.field public e:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/theme/m;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/core/presentation/theme/m;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/core/presentation/theme/p;->f:Lcom/sumsub/sns/internal/core/presentation/theme/m;

    .line 8
    return-void
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

.method public constructor <init>(Lcom/sumsub/sns/core/theme/SNSCustomizationFileFormat;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/theme/p;->a:Lcom/sumsub/sns/core/theme/SNSCustomizationFileFormat;

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

.method public static final a(Lcom/sumsub/sns/internal/core/presentation/theme/p;Lcom/sumsub/sns/core/theme/SNSTheme;)V
    .locals 9

    .line 9
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 10
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 11
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 12
    invoke-interface {p1}, Lcom/sumsub/sns/core/theme/SNSTheme;->getFonts()Ljava/util/Map;

    move-result-object v3

    invoke-static {v3}, Lcom/sumsub/sns/internal/core/common/h;->a(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 13
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/sumsub/sns/core/theme/SNSTypographyElement;

    invoke-virtual {v5}, Lcom/sumsub/sns/core/theme/SNSTypographyElement;->getValue()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lcom/sumsub/sns/internal/core/presentation/theme/i;

    .line 14
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/sumsub/sns/core/theme/SNSThemeFont;

    invoke-virtual {v7}, Lcom/sumsub/sns/core/theme/SNSThemeFont;->getSizeSp()I

    move-result v7

    .line 15
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sumsub/sns/core/theme/SNSThemeFont;

    invoke-virtual {v4}, Lcom/sumsub/sns/core/theme/SNSThemeFont;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v4

    .line 16
    const-string v8, ""

    invoke-direct {v6, v8, v7, v8, v4}, Lcom/sumsub/sns/internal/core/presentation/theme/i;-><init>(Ljava/lang/String;ILjava/lang/String;Landroid/graphics/Typeface;)V

    invoke-virtual {v0, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {p1}, Lcom/sumsub/sns/core/theme/SNSTheme;->getColors()Ljava/util/Map;

    move-result-object v3

    invoke-static {v3}, Lcom/sumsub/sns/internal/core/common/h;->a(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 18
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/sumsub/sns/core/theme/SNSColorElement;

    invoke-virtual {v5}, Lcom/sumsub/sns/core/theme/SNSColorElement;->getValue()Ljava/lang/String;

    move-result-object v5

    .line 19
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/sumsub/sns/core/theme/SNSThemeColor;

    invoke-virtual {v6}, Lcom/sumsub/sns/core/theme/SNSThemeColor;->getLight()I

    move-result v6

    .line 20
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sumsub/sns/core/theme/SNSThemeColor;

    invoke-virtual {v4}, Lcom/sumsub/sns/core/theme/SNSThemeColor;->getDark()I

    move-result v4

    .line 21
    new-instance v7, Lcom/sumsub/sns/internal/core/presentation/theme/c;

    .line 22
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 23
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    .line 24
    invoke-direct {v7, v4, v6}, Lcom/sumsub/sns/internal/core/presentation/theme/c;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    invoke-virtual {v1, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 25
    :cond_1
    invoke-interface {p1}, Lcom/sumsub/sns/core/theme/SNSTheme;->getMetrics()Ljava/util/Map;

    move-result-object p1

    invoke-static {p1}, Lcom/sumsub/sns/internal/core/common/h;->a(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 26
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sumsub/sns/core/theme/SNSMetricElement;

    invoke-virtual {v4}, Lcom/sumsub/sns/core/theme/SNSMetricElement;->getValue()Ljava/lang/String;

    move-result-object v4

    .line 27
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    .line 28
    instance-of v5, v3, Ljava/lang/Float;

    if-eqz v5, :cond_3

    new-instance v5, Lcom/sumsub/sns/internal/core/presentation/theme/d;

    .line 29
    check-cast v3, Ljava/lang/Float;

    .line 30
    invoke-direct {v5, v3}, Lcom/sumsub/sns/internal/core/presentation/theme/d;-><init>(Ljava/lang/Float;)V

    invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 31
    :cond_3
    instance-of v5, v3, Landroid/util/SizeF;

    if-eqz v5, :cond_4

    new-instance v5, Lcom/sumsub/sns/internal/core/presentation/theme/g;

    .line 32
    check-cast v3, Landroid/util/SizeF;

    invoke-virtual {v3}, Landroid/util/SizeF;->getWidth()F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    .line 33
    invoke-virtual {v3}, Landroid/util/SizeF;->getHeight()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    .line 34
    invoke-direct {v5, v6, v3}, Lcom/sumsub/sns/internal/core/presentation/theme/g;-><init>(Ljava/lang/Float;Ljava/lang/Float;)V

    invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 35
    :cond_4
    instance-of v5, v3, Lcom/sumsub/sns/core/theme/SNSThemeMetric$Size;

    if-eqz v5, :cond_5

    new-instance v5, Lcom/sumsub/sns/internal/core/presentation/theme/h;

    check-cast v3, Lcom/sumsub/sns/core/theme/SNSThemeMetric$Size;

    invoke-virtual {v3}, Lcom/sumsub/sns/core/theme/SNSThemeMetric$Size;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v5, v3}, Lcom/sumsub/sns/internal/core/presentation/theme/h;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 36
    :cond_5
    instance-of v5, v3, Lcom/sumsub/sns/core/theme/SNSThemeMetric$CardStyle;

    if-eqz v5, :cond_6

    new-instance v5, Lcom/sumsub/sns/internal/core/presentation/theme/h;

    check-cast v3, Lcom/sumsub/sns/core/theme/SNSThemeMetric$CardStyle;

    invoke-virtual {v3}, Lcom/sumsub/sns/core/theme/SNSThemeMetric$CardStyle;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v5, v3}, Lcom/sumsub/sns/internal/core/presentation/theme/h;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 37
    :cond_6
    instance-of v5, v3, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;

    if-eqz v5, :cond_2

    new-instance v5, Lcom/sumsub/sns/internal/core/presentation/theme/h;

    check-cast v3, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;

    invoke-virtual {v3}, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v5, v3}, Lcom/sumsub/sns/internal/core/presentation/theme/h;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_2

    .line 38
    :cond_7
    iput-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/theme/p;->b:Ljava/util/Map;

    .line 39
    iput-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/theme/p;->c:Ljava/util/Map;

    .line 40
    iput-object v2, p0, Lcom/sumsub/sns/internal/core/presentation/theme/p;->d:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lcom/sumsub/sns/internal/core/presentation/theme/e;)Landroid/graphics/Bitmap;
    .locals 13

    .line 1
    iget-object v0, p2, Lcom/sumsub/sns/internal/core/presentation/theme/e;->a:Ljava/lang/String;

    const/4 v6, 0x0

    if-eqz v0, :cond_3

    const/4 v4, 0x4

    const/4 v5, 0x0

    .line 2
    const-string v1, " "

    const-string v2, ""

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const/4 v11, 0x4

    const/4 v12, 0x0

    .line 3
    const-string v8, "/"

    const-string v9, "_"

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 4
    const-string v1, "-"

    const-string v2, ""

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2e

    const/4 v2, 0x2

    .line 5
    invoke-static {v0, v1, v6, v2, v6}, Lkotlin/text/StringsKt;->substringBeforeLast$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 6
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "drawable"

    invoke-virtual {v1, v0, v3, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-static {p1, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 8
    sget-object v7, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_0

    :cond_1
    move-object v2, v6

    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    :cond_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "loadRNImage: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ", filename: "

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ", resId: "

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ", result="

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string/jumbo p2, "x"

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    return-object p1

    :cond_3
    :goto_1
    return-object v6
.end method

.method public final a(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 6

    .line 110
    :try_start_0
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Loading image "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 111
    invoke-virtual {p1, p2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    move-object p1, v0

    .line 112
    sget-object p2, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    .line 113
    :cond_0
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    invoke-virtual {v1, p2, v0, p1}, Lcom/sumsub/sns/internal/log/logger/k;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final a(Landroid/content/Context;)V
    .locals 24

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    .line 41
    iget-object v0, v1, Lcom/sumsub/sns/internal/core/presentation/theme/p;->a:Lcom/sumsub/sns/core/theme/SNSCustomizationFileFormat;

    sget-object v3, Lcom/sumsub/sns/internal/core/presentation/theme/n;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v3, v0

    const/4 v3, 0x2

    const-string v4, ""

    const/4 v5, 0x1

    if-eq v0, v5, :cond_2

    if-eq v0, v3, :cond_2

    const/4 v6, 0x3

    if-eq v0, v6, :cond_1

    const/4 v2, 0x4

    if-ne v0, v2, :cond_0

    goto/16 :goto_c

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 42
    :cond_1
    const-string v0, "flutter_assets/"

    move-object v6, v0

    goto :goto_0

    :cond_2
    move-object v6, v4

    .line 43
    :goto_0
    iget-object v0, v1, Lcom/sumsub/sns/internal/core/presentation/theme/p;->a:Lcom/sumsub/sns/core/theme/SNSCustomizationFileFormat;

    sget-object v7, Lcom/sumsub/sns/core/theme/SNSCustomizationFileFormat;->CORDOVA:Lcom/sumsub/sns/core/theme/SNSCustomizationFileFormat;

    const-string v8, "Theme: Invalid element in images: "

    const-string v9, "Loading typeface "

    const/4 v10, 0x0

    if-eq v0, v7, :cond_9

    sget-object v7, Lcom/sumsub/sns/core/theme/SNSCustomizationFileFormat;->FLUTTER:Lcom/sumsub/sns/core/theme/SNSCustomizationFileFormat;

    if-ne v0, v7, :cond_3

    goto/16 :goto_4

    .line 44
    :cond_3
    sget-object v5, Lcom/sumsub/sns/core/theme/SNSCustomizationFileFormat;->REACT_NATIVE:Lcom/sumsub/sns/core/theme/SNSCustomizationFileFormat;

    if-ne v0, v5, :cond_13

    .line 45
    iget-object v0, v1, Lcom/sumsub/sns/internal/core/presentation/theme/p;->b:Ljava/util/Map;

    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 46
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/theme/i;

    .line 47
    :try_start_0
    sget-object v11, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    .line 48
    iget-object v6, v0, Lcom/sumsub/sns/internal/core/presentation/theme/i;->c:Ljava/lang/String;

    .line 49
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    const/4 v15, 0x4

    const/16 v16, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 50
    iget-object v12, v0, Lcom/sumsub/sns/internal/core/presentation/theme/i;->c:Ljava/lang/String;

    .line 51
    const-string v13, " "

    const-string v14, ""

    const/16 v16, 0x4

    const/16 v17, 0x0

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    .line 52
    const-string v19, "/"

    const-string v20, "_"

    const/16 v22, 0x4

    const/16 v23, 0x0

    const/16 v21, 0x0

    invoke-static/range {v18 .. v23}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    .line 53
    const-string v13, "-"

    const-string v14, ""

    const/16 v16, 0x4

    const/16 v17, 0x0

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0x2e

    .line 54
    invoke-static {v6, v7, v10, v3, v10}, Lkotlin/text/StringsKt;->substringBeforeLast$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    .line 55
    invoke-static {v1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "filename="

    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    const/4 v15, 0x4

    const/16 v16, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 56
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const-string/jumbo v12, "raw"

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v7, v6, v12, v13}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v6

    .line 57
    invoke-static {v1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v13, "resId="

    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    const/4 v15, 0x4

    const/16 v16, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 58
    invoke-static {v2, v6}, Landroidx/core/content/res/ResourcesCompat;->getFont(Landroid/content/Context;I)Landroid/graphics/Typeface;

    move-result-object v6

    .line 59
    iput-object v6, v0, Lcom/sumsub/sns/internal/core/presentation/theme/i;->d:Landroid/graphics/Typeface;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_1

    :catch_0
    move-exception v0

    .line 60
    sget-object v6, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_4

    move-object v7, v4

    .line 61
    :cond_4
    sget-object v11, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    invoke-virtual {v11, v6, v7, v0}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_1

    .line 62
    :cond_5
    iget-object v0, v1, Lcom/sumsub/sns/internal/core/presentation/theme/p;->e:Ljava/util/Map;

    if-eqz v0, :cond_13

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    if-eqz v0, :cond_13

    .line 63
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sumsub/sns/internal/core/presentation/theme/j;

    .line 64
    instance-of v4, v3, Lcom/sumsub/sns/internal/core/presentation/theme/e;

    if-eqz v4, :cond_7

    check-cast v3, Lcom/sumsub/sns/internal/core/presentation/theme/e;

    invoke-virtual {v1, v2, v3}, Lcom/sumsub/sns/internal/core/presentation/theme/p;->a(Landroid/content/Context;Lcom/sumsub/sns/internal/core/presentation/theme/e;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 65
    iput-object v4, v3, Lcom/sumsub/sns/internal/core/presentation/theme/e;->d:Landroid/graphics/Bitmap;

    goto :goto_2

    .line 66
    :cond_7
    instance-of v4, v3, Lcom/sumsub/sns/internal/core/presentation/theme/f;

    if-eqz v4, :cond_8

    .line 67
    check-cast v3, Lcom/sumsub/sns/internal/core/presentation/theme/f;

    .line 68
    iget-object v3, v3, Lcom/sumsub/sns/internal/core/presentation/theme/f;->a:Ljava/util/LinkedHashMap;

    .line 69
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v3

    .line 70
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sumsub/sns/internal/core/presentation/theme/e;

    .line 71
    invoke-virtual {v1, v2, v4}, Lcom/sumsub/sns/internal/core/presentation/theme/p;->a(Landroid/content/Context;Lcom/sumsub/sns/internal/core/presentation/theme/e;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 72
    iput-object v5, v4, Lcom/sumsub/sns/internal/core/presentation/theme/e;->d:Landroid/graphics/Bitmap;

    goto :goto_3

    .line 73
    :cond_8
    sget-object v9, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    goto :goto_2

    .line 74
    :cond_9
    :goto_4
    iget-object v0, v1, Lcom/sumsub/sns/internal/core/presentation/theme/p;->b:Ljava/util/Map;

    if-eqz v0, :cond_a

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 75
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/theme/i;

    .line 76
    :try_start_1
    sget-object v11, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    .line 77
    iget-object v7, v0, Lcom/sumsub/sns/internal/core/presentation/theme/i;->c:Ljava/lang/String;

    .line 78
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    const/4 v15, 0x4

    const/16 v16, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 79
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v7

    .line 80
    iget-object v11, v0, Lcom/sumsub/sns/internal/core/presentation/theme/i;->c:Ljava/lang/String;

    .line 81
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v7, v11}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v7

    .line 82
    iput-object v7, v0, Lcom/sumsub/sns/internal/core/presentation/theme/i;->d:Landroid/graphics/Typeface;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_5

    :catch_1
    move-exception v0

    .line 83
    sget-object v7, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 84
    sget-object v11, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    invoke-virtual {v11, v7, v4, v0}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_5

    .line 85
    :cond_a
    iget-object v0, v1, Lcom/sumsub/sns/internal/core/presentation/theme/p;->e:Ljava/util/Map;

    if-eqz v0, :cond_13

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    if-eqz v0, :cond_13

    .line 86
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_b
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sumsub/sns/internal/core/presentation/theme/j;

    .line 87
    instance-of v4, v3, Lcom/sumsub/sns/internal/core/presentation/theme/e;

    if-eqz v4, :cond_d

    check-cast v3, Lcom/sumsub/sns/internal/core/presentation/theme/e;

    .line 88
    iget-object v4, v3, Lcom/sumsub/sns/internal/core/presentation/theme/e;->a:Ljava/lang/String;

    if-eqz v4, :cond_c

    .line 89
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v7

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v7, v4}, Lcom/sumsub/sns/internal/core/presentation/theme/p;->a(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v4

    goto :goto_7

    :cond_c
    move-object v4, v10

    .line 90
    :goto_7
    iput-object v4, v3, Lcom/sumsub/sns/internal/core/presentation/theme/e;->d:Landroid/graphics/Bitmap;

    goto :goto_6

    .line 91
    :cond_d
    instance-of v4, v3, Lcom/sumsub/sns/internal/core/presentation/theme/f;

    if-eqz v4, :cond_12

    .line 92
    check-cast v3, Lcom/sumsub/sns/internal/core/presentation/theme/f;

    .line 93
    iget-object v3, v3, Lcom/sumsub/sns/internal/core/presentation/theme/f;->a:Ljava/util/LinkedHashMap;

    .line 94
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v3

    .line 95
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sumsub/sns/internal/core/presentation/theme/e;

    .line 96
    iget-object v7, v4, Lcom/sumsub/sns/internal/core/presentation/theme/e;->a:Ljava/lang/String;

    if-eqz v7, :cond_10

    .line 97
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v9

    .line 98
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 99
    invoke-virtual {v1, v9, v7}, Lcom/sumsub/sns/internal/core/presentation/theme/p;->a(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v7

    .line 100
    iget-object v9, v4, Lcom/sumsub/sns/internal/core/presentation/theme/e;->b:Ljava/lang/Integer;

    if-eqz v9, :cond_e

    .line 101
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    goto :goto_9

    :cond_e
    move v9, v5

    :goto_9
    if-le v9, v5, :cond_11

    if-eqz v7, :cond_11

    .line 102
    iget-object v9, v4, Lcom/sumsub/sns/internal/core/presentation/theme/e;->b:Ljava/lang/Integer;

    if-eqz v9, :cond_f

    .line 103
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    goto :goto_a

    :cond_f
    move v9, v5

    .line 104
    :goto_a
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v11

    mul-int/2addr v11, v9

    .line 105
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v12

    mul-int/2addr v12, v9

    .line 106
    invoke-static {v7, v11, v12, v5}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v9

    .line 107
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->recycle()V

    move-object v7, v9

    goto :goto_b

    :cond_10
    move-object v7, v10

    .line 108
    :cond_11
    :goto_b
    iput-object v7, v4, Lcom/sumsub/sns/internal/core/presentation/theme/e;->d:Landroid/graphics/Bitmap;

    goto :goto_8

    .line 109
    :cond_12
    sget-object v11, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    const/4 v15, 0x4

    const/16 v16, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    goto/16 :goto_6

    :cond_13
    :goto_c
    return-void
.end method
