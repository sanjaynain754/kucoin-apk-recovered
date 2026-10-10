.class public final Lcom/sumsub/sns/internal/core/analytics/g;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final d:Lkotlin/jvm/functions/Function0;

.field public static final e:Ljava/text/SimpleDateFormat;


# instance fields
.field public final a:Lkotlin/jvm/functions/Function0;

.field public final b:Ljava/util/ArrayList;

.field public c:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/core/analytics/t;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/core/analytics/t;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/core/analytics/g;->d:Lkotlin/jvm/functions/Function0;

    .line 8
    .line 9
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 10
    .line 11
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 12
    .line 13
    .line 14
    const-string/jumbo v2, "yyyy-MM-dd HH:mm:ss z"

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 18
    .line 19
    const-string v1, "UTC"

    .line 20
    .line 21
    .line 22
    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 27
    .line 28
    sput-object v0, Lcom/sumsub/sns/internal/core/analytics/g;->e:Ljava/text/SimpleDateFormat;

    .line 29
    return-void
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

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/g;->d:Lkotlin/jvm/functions/Function0;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    iput-object v0, p0, Lcom/sumsub/sns/internal/core/analytics/g;->a:Lkotlin/jvm/functions/Function0;

    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    iput-object v0, p0, Lcom/sumsub/sns/internal/core/analytics/g;->b:Ljava/util/ArrayList;

    .line 15
    return-void
    .line 16
    .line 17
.end method

.method public static final b()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/g;->e:Ljava/text/SimpleDateFormat;

    .line 3
    .line 4
    new-instance v1, Ljava/util/Date;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method


# virtual methods
.method public final a()Lcom/sumsub/sns/core/data/model/SNSTrackEvents;
    .locals 23

    move-object/from16 v0, p0

    .line 14
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/analytics/g;->b:Ljava/util/ArrayList;

    const/16 v2, 0xa

    .line 15
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v2

    const/16 v3, 0x10

    invoke-static {v2, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v2

    .line 16
    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 17
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v4, v4, 0x1

    .line 18
    move-object v6, v5

    check-cast v6, Lcom/sumsub/sns/internal/core/analytics/s;

    .line 19
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v6

    .line 20
    invoke-interface {v3, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 21
    :cond_0
    const-class v1, Lcom/sumsub/sns/internal/core/analytics/Domain;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lcom/sumsub/sns/internal/core/analytics/Domain;

    if-nez v2, :cond_1

    const/4 v1, 0x0

    :cond_1
    check-cast v1, Lcom/sumsub/sns/internal/core/analytics/Domain;

    .line 22
    const-class v2, Lcom/sumsub/sns/internal/core/analytics/Screen;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v5, v2, Lcom/sumsub/sns/internal/core/analytics/Screen;

    if-nez v5, :cond_2

    const/4 v2, 0x0

    :cond_2
    check-cast v2, Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 23
    const-class v5, Lcom/sumsub/sns/internal/core/analytics/Popup;

    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/sumsub/sns/internal/core/analytics/Popup;

    if-nez v6, :cond_3

    const/4 v5, 0x0

    :cond_3
    check-cast v5, Lcom/sumsub/sns/internal/core/analytics/Popup;

    .line 24
    const-class v6, Lcom/sumsub/sns/internal/core/analytics/Control;

    invoke-static {v6}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Lcom/sumsub/sns/internal/core/analytics/Control;

    if-nez v7, :cond_4

    const/4 v6, 0x0

    :cond_4
    check-cast v6, Lcom/sumsub/sns/internal/core/analytics/Control;

    .line 25
    const-class v7, Lcom/sumsub/sns/internal/core/analytics/Block;

    invoke-static {v7}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    instance-of v8, v7, Lcom/sumsub/sns/internal/core/analytics/Block;

    if-nez v8, :cond_5

    const/4 v7, 0x0

    :cond_5
    check-cast v7, Lcom/sumsub/sns/internal/core/analytics/Block;

    .line 26
    const-class v8, Lcom/sumsub/sns/internal/core/analytics/j;

    invoke-static {v8}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v8

    invoke-virtual {v3, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    instance-of v9, v8, Lcom/sumsub/sns/internal/core/analytics/j;

    if-nez v9, :cond_6

    const/4 v8, 0x0

    :cond_6
    check-cast v8, Lcom/sumsub/sns/internal/core/analytics/j;

    .line 27
    const-class v9, Lcom/sumsub/sns/internal/core/analytics/NavigationAction;

    invoke-static {v9}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v9

    invoke-virtual {v3, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    instance-of v10, v9, Lcom/sumsub/sns/internal/core/analytics/NavigationAction;

    if-nez v10, :cond_7

    const/4 v9, 0x0

    :cond_7
    check-cast v9, Lcom/sumsub/sns/internal/core/analytics/NavigationAction;

    .line 28
    const-class v10, Lcom/sumsub/sns/internal/core/analytics/ControlAction;

    invoke-static {v10}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v10

    invoke-virtual {v3, v10}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    instance-of v11, v10, Lcom/sumsub/sns/internal/core/analytics/ControlAction;

    if-nez v11, :cond_8

    const/4 v10, 0x0

    :cond_8
    check-cast v10, Lcom/sumsub/sns/internal/core/analytics/ControlAction;

    .line 29
    const-class v11, Lcom/sumsub/sns/internal/core/analytics/PrimaryAction;

    invoke-static {v11}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v11

    invoke-virtual {v3, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    instance-of v12, v11, Lcom/sumsub/sns/internal/core/analytics/PrimaryAction;

    if-nez v12, :cond_9

    const/4 v11, 0x0

    :cond_9
    check-cast v11, Lcom/sumsub/sns/internal/core/analytics/PrimaryAction;

    .line 30
    const-class v12, Lcom/sumsub/sns/internal/core/analytics/PrimaryActionState;

    invoke-static {v12}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v12

    invoke-virtual {v3, v12}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    instance-of v13, v12, Lcom/sumsub/sns/internal/core/analytics/PrimaryActionState;

    if-nez v13, :cond_a

    const/4 v12, 0x0

    :cond_a
    check-cast v12, Lcom/sumsub/sns/internal/core/analytics/PrimaryActionState;

    .line 31
    const-class v13, Lcom/sumsub/sns/internal/core/analytics/SdkEvent;

    invoke-static {v13}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v13

    invoke-virtual {v3, v13}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    instance-of v14, v13, Lcom/sumsub/sns/internal/core/analytics/SdkEvent;

    if-nez v14, :cond_b

    const/4 v13, 0x0

    :cond_b
    check-cast v13, Lcom/sumsub/sns/internal/core/analytics/SdkEvent;

    .line 32
    const-class v14, Lcom/sumsub/sns/internal/core/analytics/StepAction;

    invoke-static {v14}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v14

    invoke-virtual {v3, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v14, v3, Lcom/sumsub/sns/internal/core/analytics/StepAction;

    if-nez v14, :cond_c

    const/4 v3, 0x0

    :cond_c
    check-cast v3, Lcom/sumsub/sns/internal/core/analytics/StepAction;

    .line 33
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v15, -0x1

    if-nez v1, :cond_d

    move v1, v15

    goto :goto_1

    .line 34
    :cond_d
    sget-object v16, Lcom/sumsub/sns/internal/core/analytics/h;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v16, v1

    :goto_1
    const-string/jumbo v4, "msdk"

    if-eq v1, v15, :cond_11

    const/4 v15, 0x1

    if-eq v1, v15, :cond_10

    const/4 v15, 0x2

    if-eq v1, v15, :cond_10

    const/4 v15, 0x3

    if-eq v1, v15, :cond_f

    const/4 v15, 0x4

    if-ne v1, v15, :cond_e

    goto :goto_2

    :cond_e
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_f
    :goto_2
    move-object v1, v4

    goto :goto_3

    .line 35
    :cond_10
    const-string/jumbo v1, "user"

    goto :goto_3

    :cond_11
    const/4 v1, 0x0

    :goto_3
    if-eqz v1, :cond_12

    .line 36
    invoke-virtual {v14, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    const-string v1, ":"

    invoke-virtual {v14, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_12
    if-eqz v9, :cond_13

    .line 38
    invoke-static {v9, v5}, Lcom/sumsub/sns/internal/core/analytics/i;->a(Lcom/sumsub/sns/internal/core/analytics/NavigationAction;Lcom/sumsub/sns/internal/core/analytics/Popup;)Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    :cond_13
    if-eqz v10, :cond_14

    .line 39
    invoke-static {v10}, Lcom/sumsub/sns/internal/core/analytics/i;->a(Lcom/sumsub/sns/internal/core/analytics/ControlAction;)Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    :cond_14
    if-eqz v11, :cond_15

    if-eqz v12, :cond_15

    .line 40
    invoke-static {v12}, Lcom/sumsub/sns/internal/core/analytics/i;->a(Lcom/sumsub/sns/internal/core/analytics/PrimaryActionState;)Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    :cond_15
    if-eqz v13, :cond_16

    .line 41
    invoke-virtual {v13}, Lcom/sumsub/sns/internal/core/analytics/SdkEvent;->getText()Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    :cond_16
    if-eqz v3, :cond_17

    .line 42
    invoke-static {v3}, Lcom/sumsub/sns/internal/core/analytics/i;->a(Lcom/sumsub/sns/internal/core/analytics/StepAction;)Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    .line 43
    :cond_17
    const-string/jumbo v1, "unknown_action"

    .line 44
    :goto_4
    invoke-virtual {v14, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 46
    const-string/jumbo v3, "source"

    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v17

    if-eqz v2, :cond_18

    .line 47
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/core/analytics/Screen;->getText()Ljava/lang/String;

    move-result-object v2

    goto :goto_5

    :cond_18
    const/4 v2, 0x0

    :goto_5
    const-string/jumbo v3, "screenName"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v18

    if-eqz v6, :cond_19

    .line 48
    invoke-virtual {v6}, Lcom/sumsub/sns/internal/core/analytics/Control;->getText()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1b

    :cond_19
    if-eqz v11, :cond_1a

    invoke-virtual {v11}, Lcom/sumsub/sns/internal/core/analytics/PrimaryAction;->getText()Ljava/lang/String;

    move-result-object v2

    goto :goto_6

    :cond_1a
    const/4 v2, 0x0

    :cond_1b
    :goto_6
    const-string/jumbo v3, "objectName"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v19

    if-eqz v7, :cond_1c

    .line 49
    invoke-virtual {v7}, Lcom/sumsub/sns/internal/core/analytics/Block;->getText()Ljava/lang/String;

    move-result-object v2

    goto :goto_7

    :cond_1c
    const/4 v2, 0x0

    :goto_7
    const-string v3, "blockName"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v20

    if-eqz v5, :cond_1d

    .line 50
    invoke-virtual {v5}, Lcom/sumsub/sns/internal/core/analytics/Popup;->getText()Ljava/lang/String;

    move-result-object v2

    goto :goto_8

    :cond_1d
    const/4 v2, 0x0

    :goto_8
    const-string/jumbo v3, "popupName"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v21

    if-eqz v8, :cond_1e

    .line 51
    iget-object v2, v8, Lcom/sumsub/sns/internal/core/analytics/j;->a:Ljava/lang/String;

    goto :goto_9

    :cond_1e
    const/4 v2, 0x0

    .line 52
    :goto_9
    const-string/jumbo v3, "stepName"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v22

    filled-new-array/range {v17 .. v22}, [Lkotlin/Pair;

    move-result-object v2

    .line 53
    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    .line 54
    invoke-static {v2}, Lcom/sumsub/sns/internal/core/common/h;->a(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v2

    .line 55
    iget-object v3, v0, Lcom/sumsub/sns/internal/core/analytics/g;->c:Ljava/util/Map;

    if-nez v3, :cond_1f

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v3

    :cond_1f
    invoke-static {v2, v3}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    .line 56
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " payload: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 57
    sget-object v4, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 58
    iget-object v4, v4, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 59
    const-string v5, "Analytics"

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v3, v6}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 60
    iget-object v3, v0, Lcom/sumsub/sns/internal/core/analytics/g;->b:Ljava/util/ArrayList;

    sget-object v4, Lcom/sumsub/sns/internal/core/analytics/SdkEvent;->TrackingDisabled:Lcom/sumsub/sns/internal/core/analytics/SdkEvent;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    .line 61
    new-instance v4, Lcom/sumsub/sns/core/data/model/SNSTrackEvents;

    .line 62
    iget-object v5, v0, Lcom/sumsub/sns/internal/core/analytics/g;->a:Lkotlin/jvm/functions/Function0;

    invoke-interface {v5}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 63
    invoke-direct {v4, v1, v5, v2, v3}, Lcom/sumsub/sns/core/data/model/SNSTrackEvents;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Z)V

    return-object v4
.end method

.method public final a(Lcom/sumsub/sns/internal/core/analytics/PrimaryAction;)Lcom/sumsub/sns/internal/core/analytics/g;
    .locals 2

    .line 5
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/analytics/g;->b:Ljava/util/ArrayList;

    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/Domain;->PrimaryAction:Lcom/sumsub/sns/internal/core/analytics/Domain;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/analytics/g;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final a(Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Popup;)Lcom/sumsub/sns/internal/core/analytics/g;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/analytics/g;->b:Ljava/util/ArrayList;

    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/Domain;->Ui:Lcom/sumsub/sns/internal/core/analytics/Domain;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/analytics/g;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz p3, :cond_0

    .line 3
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/analytics/g;->b:Ljava/util/ArrayList;

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/analytics/g;->b:Ljava/util/ArrayList;

    new-instance p3, Lcom/sumsub/sns/internal/core/analytics/j;

    invoke-direct {p3, p2}, Lcom/sumsub/sns/internal/core/analytics/j;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final a(Lcom/sumsub/sns/internal/core/analytics/StepAction;Ljava/lang/String;)Lcom/sumsub/sns/internal/core/analytics/g;
    .locals 2

    .line 7
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/analytics/g;->b:Ljava/util/ArrayList;

    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/Domain;->Step:Lcom/sumsub/sns/internal/core/analytics/Domain;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 8
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/analytics/g;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/analytics/g;->b:Ljava/util/ArrayList;

    new-instance v0, Lcom/sumsub/sns/internal/core/analytics/j;

    invoke-direct {v0, p2}, Lcom/sumsub/sns/internal/core/analytics/j;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final a(Z)V
    .locals 6

    .line 10
    :try_start_0
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/analytics/g;->a()Lcom/sumsub/sns/core/data/model/SNSTrackEvents;

    move-result-object v0

    .line 11
    sget-boolean v1, Lcom/sumsub/sns/internal/core/analytics/e;->h:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/sumsub/sns/core/data/model/SNSTrackEvents;->getAlwaysSend()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    move-object v1, v0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    .line 12
    :goto_0
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/e;->d:Lkotlinx/coroutines/m0;

    move-object v2, v1

    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/e;->e:Lkotlinx/coroutines/j0;

    new-instance v3, Lcom/sumsub/sns/internal/core/analytics/d;

    const/4 v4, 0x0

    invoke-direct {v3, v2, p1, v4}, Lcom/sumsub/sns/internal/core/analytics/d;-><init>(Lcom/sumsub/sns/core/data/model/SNSTrackEvents;ZLkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 13
    :goto_1
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    const-string v0, "Analytics"

    const-string v1, "Failed to build event body"

    invoke-static {v0, v1, p1}, Lcom/sumsub/sns/internal/log/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
