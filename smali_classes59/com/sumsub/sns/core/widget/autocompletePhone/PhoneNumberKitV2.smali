.class public final Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;
.super Lcom/sumsub/sns/core/widget/PhoneKit;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u0000 .2\u00020\u0001:\u0001.Bm\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\"\u0010\t\u001a\u001e\u0012\u0008\u0012\u00060\u0005j\u0002`\u0006\u0012\u0008\u0012\u00060\u0005j\u0002`\u0007\u0018\u00010\u0004j\u0004\u0018\u0001`\u0008\u0012\u001e\u0010\u000c\u001a\u001a\u0012\u0008\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u000b\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\u001a2\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001dR(\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0016@RX\u0096\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u001f\u001a\u0004\u0008 \u0010!R(\u0010\"\u001a\u0004\u0018\u00010\n2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\n8\u0016@RX\u0096\u000e\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u0016\u0010+\u001a\u0004\u0018\u00010(8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008)\u0010*R\u0014\u0010,\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008,\u0010-\u00a8\u0006/"
    }
    d2 = {
        "Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;",
        "Lcom/sumsub/sns/core/widget/PhoneKit;",
        "Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;",
        "input",
        "",
        "",
        "Lcom/sumsub/sns/internal/features/data/model/common/CountryCode;",
        "Lcom/sumsub/sns/internal/features/data/model/common/CountryName;",
        "Lcom/sumsub/sns/internal/features/data/model/common/CountryCodeToNameMap;",
        "countries",
        "Lcom/sumsub/sns/internal/features/data/model/common/remote/l0;",
        "Lcom/sumsub/sns/internal/features/data/model/common/PhoneCountryCodeWithMasks;",
        "phoneMasks",
        "Lcom/sumsub/sns/core/widget/autocompletePhone/ValidationListener;",
        "validListener",
        "",
        "initialValue",
        "<init>",
        "(Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;Ljava/util/Map;Ljava/util/Map;Lcom/sumsub/sns/core/widget/autocompletePhone/ValidationListener;Ljava/lang/CharSequence;)V",
        "number",
        "",
        "validate",
        "(Ljava/lang/CharSequence;)Z",
        "Lcom/sumsub/sns/internal/features/presentation/country/b;",
        "country",
        "isUser",
        "",
        "setCountry",
        "(Lcom/sumsub/sns/internal/features/presentation/country/b;Z)V",
        "Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;",
        "value",
        "Lcom/sumsub/sns/internal/features/presentation/country/b;",
        "getCountry",
        "()Lcom/sumsub/sns/internal/features/presentation/country/b;",
        "mask",
        "Lcom/sumsub/sns/internal/features/data/model/common/remote/l0;",
        "getMask",
        "()Lcom/sumsub/sns/internal/features/data/model/common/remote/l0;",
        "manuallySelectedCountryKey",
        "Ljava/lang/String;",
        "Lcom/sumsub/sns/core/widget/SNSTextInputEditText;",
        "getEditText",
        "()Lcom/sumsub/sns/core/widget/SNSTextInputEditText;",
        "editText",
        "isValid",
        "()Z",
        "Companion",
        "idensic-mobile-sdk-aar_defaultRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPhoneNumberKitV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneNumberKitV2.kt\ncom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 5 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n126#2:180\n153#2,2:181\n155#2:194\n1056#3:183\n1563#3:184\n1634#3,2:185\n1636#3:193\n1056#3:195\n1374#3:196\n1460#3,5:197\n1068#3:202\n434#4:187\n507#4,5:188\n65#5,16:203\n93#5,3:219\n1#6:222\n*S KotlinDebug\n*F\n+ 1 PhoneNumberKitV2.kt\ncom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2\n*L\n48#1:180\n48#1:181,2\n48#1:194\n50#1:183\n51#1:184\n51#1:185,2\n51#1:193\n86#1:195\n87#1:196\n87#1:197,5\n124#1:202\n64#1:187\n64#1:188,5\n145#1:203,16\n145#1:219,3\n*E\n"
    }
.end annotation


# static fields
.field private static final Companion:Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private country:Lcom/sumsub/sns/internal/features/presentation/country/b;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final input:Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private manuallySelectedCountryKey:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private mask:Lcom/sumsub/sns/internal/features/data/model/common/remote/l0;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;->Companion:Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2$Companion;

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public constructor <init>(Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;Ljava/util/Map;Ljava/util/Map;Lcom/sumsub/sns/core/widget/autocompletePhone/ValidationListener;Ljava/lang/CharSequence;)V
    .locals 24
    .param p1    # Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/sumsub/sns/core/widget/autocompletePhone/ValidationListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/CharSequence;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/sumsub/sns/internal/features/data/model/common/remote/l0;",
            ">;",
            "Lcom/sumsub/sns/core/widget/autocompletePhone/ValidationListener;",
            "Ljava/lang/CharSequence;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    .line 1
    invoke-direct {v0, v1, v2, v3}, Lcom/sumsub/sns/core/widget/PhoneKit;-><init>(Ljava/util/Map;Ljava/util/Map;Lcom/sumsub/sns/core/widget/autocompletePhone/ValidationListener;)V

    move-object/from16 v4, p1

    .line 2
    iput-object v4, v0, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;->input:Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;

    .line 3
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 4
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    if-eqz v2, :cond_a

    .line 5
    new-instance v8, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 6
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map$Entry;

    .line 7
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/sumsub/sns/internal/features/data/model/common/remote/l0;

    .line 8
    iget-object v10, v10, Lcom/sumsub/sns/internal/features/data/model/common/remote/l0;->b:Ljava/util/List;

    .line 9
    new-instance v11, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2$_init_$lambda$8$$inlined$sortedBy$1;

    invoke-direct {v11}, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2$_init_$lambda$8$$inlined$sortedBy$1;-><init>()V

    invoke-static {v10, v11}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v10

    .line 10
    new-instance v11, Ljava/util/ArrayList;

    const/16 v12, 0xa

    invoke-static {v10, v12}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 11
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_7

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 12
    check-cast v12, Ljava/lang/String;

    .line 13
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/sumsub/sns/internal/features/data/model/common/remote/l0;

    .line 14
    iget-object v13, v13, Lcom/sumsub/sns/internal/features/data/model/common/remote/l0;->a:Ljava/lang/String;

    .line 15
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "+ "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v15, " "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    .line 16
    new-instance v14, Lcom/sumsub/sns/internal/features/presentation/country/b;

    .line 17
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 18
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-nez v6, :cond_1

    :cond_0
    const-string v6, ""

    .line 19
    :cond_1
    invoke-direct {v14, v15, v6}, Lcom/sumsub/sns/internal/features/presentation/country/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    new-instance v16, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;

    const/16 v22, 0xc

    const/16 v23, 0x0

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v21, v14

    .line 21
    invoke-direct/range {v16 .. v23}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;-><init>(Ljava/lang/String;ZZZLjava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v6, v16

    .line 22
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v15

    const/4 v7, 0x0

    :goto_2
    if-ge v7, v15, :cond_3

    move-object/from16 p3, v2

    .line 24
    invoke-virtual {v12, v7}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 25
    invoke-static {v2}, Ljava/lang/Character;->isDigit(C)Z

    move-result v17

    if-eqz v17, :cond_2

    .line 26
    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    :cond_2
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v2, p3

    goto :goto_2

    :cond_3
    move-object/from16 p3, v2

    .line 27
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 28
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    const/16 v21, 0x4

    const/16 v22, 0x0

    .line 29
    const-string v18, " "

    const-string v19, ""

    const/16 v20, 0x0

    invoke-static/range {v17 .. v22}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 30
    invoke-virtual {v4, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/ArrayList;

    if-nez v7, :cond_4

    .line 31
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 32
    invoke-virtual {v4, v2, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    :cond_4
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v13, :cond_6

    .line 34
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    if-nez v2, :cond_5

    .line 35
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 36
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v5, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    :cond_5
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    :cond_6
    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v2, p3

    goto/16 :goto_1

    :cond_7
    move-object/from16 p3, v2

    .line 39
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/l0;

    .line 40
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/l0;->a:Ljava/lang/String;

    .line 41
    invoke-static {v2, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    .line 42
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v2, p3

    goto/16 :goto_0

    .line 43
    :cond_8
    new-instance v2, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2$special$$inlined$sortedBy$1;

    invoke-direct {v2}, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2$special$$inlined$sortedBy$1;-><init>()V

    invoke-static {v8, v2}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_a

    .line 44
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 45
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 46
    check-cast v7, Lkotlin/Pair;

    .line 47
    invoke-virtual {v7}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    .line 48
    invoke-static {v6, v7}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_3

    .line 49
    :cond_9
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_a

    .line 50
    new-instance v6, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;

    const/16 v12, 0x10

    const/4 v13, 0x0

    .line 51
    const-string v7, "+ "

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v6 .. v13}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;-><init>(Ljava/lang/String;ZZZLjava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v7, v6

    const/4 v6, 0x0

    invoke-interface {v2, v6, v7}, Ljava/util/List;->add(ILjava/lang/Object;)V

    goto :goto_4

    :cond_a
    const/4 v2, 0x0

    .line 52
    :goto_4
    iget-object v6, v0, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;->input:Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;

    if-eqz v6, :cond_b

    invoke-virtual {v6}, Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;->getFlagTouchInterceptor()Landroid/widget/LinearLayout;

    move-result-object v6

    if-eqz v6, :cond_b

    new-instance v7, Lcom/sumsub/sns/core/widget/autocompletePhone/a;

    invoke-direct {v7, v1, v2, v0}, Lcom/sumsub/sns/core/widget/autocompletePhone/a;-><init>(Ljava/util/Map;Ljava/util/List;Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;)V

    invoke-virtual {v6, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 53
    :cond_b
    iget-object v1, v0, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;->input:Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;

    if-eqz v1, :cond_c

    const/4 v6, 0x1

    invoke-virtual {v1, v6}, Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;->setFlagDropDownVisible(Z)V

    .line 54
    :cond_c
    iget-object v1, v0, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;->input:Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;

    const/4 v6, 0x0

    if-eqz v1, :cond_d

    invoke-virtual {v1, v6}, Lcom/google/android/material/textfield/TextInputLayout;->setStartIconVisible(Z)V

    .line 55
    :cond_d
    iget-object v1, v0, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;->input:Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;

    if-eqz v1, :cond_e

    invoke-virtual {v1, v6}, Lcom/google/android/material/textfield/TextInputLayout;->setStartIconCheckable(Z)V

    .line 56
    :cond_e
    iget-object v1, v0, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;->input:Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;

    if-eqz v1, :cond_f

    const/4 v7, 0x0

    invoke-virtual {v1, v7}, Lcom/google/android/material/textfield/TextInputLayout;->setStartIconTintList(Landroid/content/res/ColorStateList;)V

    .line 57
    :cond_f
    invoke-virtual {v4}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    .line 58
    new-instance v7, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2$special$$inlined$sortedByDescending$1;

    invoke-direct {v7}, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2$special$$inlined$sortedByDescending$1;-><init>()V

    invoke-static {v1, v7}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v1

    .line 59
    invoke-direct {v0}, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;->getEditText()Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    move-result-object v7

    if-eqz v7, :cond_10

    new-instance v8, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2$2;

    invoke-direct {v8, v0, v5, v1, v4}, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2$2;-><init>(Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;Ljava/util/HashMap;Ljava/util/List;Ljava/util/HashMap;)V

    invoke-virtual {v7, v8}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->setMaskListener(Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskListener;)V

    .line 60
    :cond_10
    invoke-direct {v0}, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;->getEditText()Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    move-result-object v1

    if-eqz v1, :cond_11

    const/16 v4, 0xf

    invoke-virtual {v1, v4}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->setMaxLength(I)V

    .line 61
    :cond_11
    invoke-direct {v0}, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;->getEditText()Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    move-result-object v1

    if-eqz v1, :cond_12

    invoke-virtual {v1, v2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->setMasks(Ljava/util/List;)V

    .line 62
    :cond_12
    invoke-direct {v0}, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;->getEditText()Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    move-result-object v1

    if-eqz v1, :cond_13

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->updateInputType(Ljava/lang/Integer;)V

    .line 63
    :cond_13
    invoke-direct {v0}, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;->getEditText()Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    move-result-object v1

    if-eqz v1, :cond_14

    .line 64
    new-instance v2, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2$special$$inlined$addTextChangedListener$default$1;

    invoke-direct {v2, v0, v3}, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2$special$$inlined$addTextChangedListener$default$1;-><init>(Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;Lcom/sumsub/sns/core/widget/autocompletePhone/ValidationListener;)V

    .line 65
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 66
    :cond_14
    invoke-direct {v0}, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;->getEditText()Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    move-result-object v1

    if-eqz v1, :cond_15

    move-object/from16 v2, p5

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    :cond_15
    invoke-direct {v0}, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;->getEditText()Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    move-result-object v1

    if-eqz v1, :cond_17

    .line 68
    invoke-virtual {v1}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->getText()Landroid/text/Editable;

    move-result-object v2

    if-eqz v2, :cond_16

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v7

    goto :goto_5

    :cond_16
    move v7, v6

    :goto_5
    invoke-virtual {v1, v7}, Landroid/widget/EditText;->setSelection(I)V

    :cond_17
    return-void
.end method

.method private static final _init_$lambda$12(Ljava/util/Map;Ljava/util/List;Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;Landroid/view/View;)V
    .locals 4

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 12
    move-result v1

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 19
    move-result-object p0

    .line 20
    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 23
    move-result-object p0

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    move-result v1

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    .line 32
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    check-cast v1, Ljava/util/Map$Entry;

    .line 36
    .line 37
    .line 38
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    check-cast v2, Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    check-cast v1, Ljava/lang/String;

    .line 48
    .line 49
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/country/b;

    .line 50
    .line 51
    .line 52
    invoke-direct {v3, v2, v1}, Lcom/sumsub/sns/internal/features/presentation/country/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    goto :goto_0

    .line 57
    .line 58
    .line 59
    :cond_1
    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 60
    move-result-object p0

    .line 61
    .line 62
    new-instance p3, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2$1$1;

    .line 63
    .line 64
    .line 65
    invoke-direct {p3, p1, p2}, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2$1$1;-><init>(Ljava/util/List;Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;)V

    .line 66
    .line 67
    instance-of p1, p0, Landroidx/fragment/app/FragmentActivity;

    .line 68
    .line 69
    if-eqz p1, :cond_2

    .line 70
    .line 71
    check-cast p0, Landroidx/fragment/app/FragmentActivity;

    .line 72
    goto :goto_1

    .line 73
    :cond_2
    const/4 p0, 0x0

    .line 74
    .line 75
    :goto_1
    if-eqz p0, :cond_5

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 79
    move-result-object p0

    .line 80
    .line 81
    if-nez p0, :cond_3

    .line 82
    goto :goto_2

    .line 83
    .line 84
    :cond_3
    const-string p1, "CountryPickerDialog"

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 88
    move-result-object p2

    .line 89
    .line 90
    if-eqz p2, :cond_4

    .line 91
    goto :goto_2

    .line 92
    .line 93
    :cond_4
    sget p2, Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog;->U:I

    .line 94
    .line 95
    .line 96
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    .line 97
    move-result-object p2

    .line 98
    .line 99
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog;

    .line 100
    .line 101
    .line 102
    invoke-direct {v1}, Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog;-><init>()V

    .line 103
    .line 104
    iput-object p3, v1, Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog;->c:Lcom/sumsub/sns/internal/features/presentation/country/picker/e;

    .line 105
    .line 106
    new-instance p3, Landroid/os/Bundle;

    .line 107
    .line 108
    .line 109
    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    .line 110
    .line 111
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;->SINGLE:Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;

    .line 112
    .line 113
    const-string v3, "extra_selection_mode"

    .line 114
    .line 115
    .line 116
    invoke-virtual {p3, v3, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 117
    const/4 v2, 0x0

    .line 118
    .line 119
    new-array v3, v2, [Lcom/sumsub/sns/internal/features/presentation/country/b;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 123
    move-result-object v0

    .line 124
    .line 125
    check-cast v0, [Landroid/os/Parcelable;

    .line 126
    .line 127
    const-string v3, "extra_items"

    .line 128
    .line 129
    .line 130
    invoke-virtual {p3, v3, v0}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 131
    .line 132
    new-array v0, v2, [Lcom/sumsub/sns/internal/features/presentation/country/b;

    .line 133
    .line 134
    .line 135
    invoke-interface {p2, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 136
    move-result-object p2

    .line 137
    .line 138
    check-cast p2, [Landroid/os/Parcelable;

    .line 139
    .line 140
    const-string v0, "extra_preselected_items"

    .line 141
    .line 142
    .line 143
    invoke-virtual {p3, v0, p2}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 144
    .line 145
    const-string p2, "extra_sort"

    .line 146
    const/4 v0, 0x1

    .line 147
    .line 148
    .line 149
    invoke-virtual {p3, p2, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1, p3}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1, p0, p1}, Landroidx/fragment/app/DialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 156
    :cond_5
    :goto_2
    return-void
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
.end method

.method public static synthetic a(Ljava/util/Map;Ljava/util/List;Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3}, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;->_init_$lambda$12(Ljava/util/Map;Ljava/util/List;Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;Landroid/view/View;)V

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
.end method

.method public static final synthetic access$getEditText(Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;)Lcom/sumsub/sns/core/widget/SNSTextInputEditText;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;->getEditText()Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

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
.end method

.method public static final synthetic access$getManuallySelectedCountryKey$p(Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;->manuallySelectedCountryKey:Ljava/lang/String;

    .line 3
    return-object p0
    .line 4
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
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static final synthetic access$getPhoneMasks(Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;)Ljava/util/Map;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/PhoneKit;->getPhoneMasks()Ljava/util/Map;

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
.end method

.method public static final synthetic access$setManuallySelectedCountryKey$p(Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;->manuallySelectedCountryKey:Ljava/lang/String;

    .line 3
    return-void
    .line 4
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
.end method

.method private final getEditText()Lcom/sumsub/sns/core/widget/SNSTextInputEditText;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;->input:Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    .line 9
    move-result-object v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v0, v1

    .line 12
    .line 13
    :goto_0
    instance-of v2, v0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    check-cast v0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 18
    return-object v0

    .line 19
    :cond_1
    return-object v1
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
.end method

.method private final validate(Ljava/lang/CharSequence;)Z
    .locals 0

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lcom/sumsub/sns/internal/core/presentation/widget/autocompletePhone/util/a;->a(Ljava/lang/String;)Z

    .line 12
    move-result p1

    .line 13
    return p1

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return p1
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
.method public getCountry()Lcom/sumsub/sns/internal/features/presentation/country/b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;->country:Lcom/sumsub/sns/internal/features/presentation/country/b;

    .line 3
    return-object v0
    .line 4
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
.end method

.method public getMask()Lcom/sumsub/sns/internal/features/data/model/common/remote/l0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;->mask:Lcom/sumsub/sns/internal/features/data/model/common/remote/l0;

    .line 3
    return-object v0
    .line 4
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
.end method

.method public isValid()Z
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;->getEditText()Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->getRawText()Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-direct {p0, v0}, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;->validate(Ljava/lang/CharSequence;)Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 21
    .line 22
    new-instance v2, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string/jumbo v3, "valid="

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    move-result-object v3

    .line 39
    const/4 v5, 0x4

    .line 40
    const/4 v6, 0x0

    .line 41
    .line 42
    const-string v2, "SNSPhoneNumberKit"

    .line 43
    const/4 v4, 0x0

    .line 44
    .line 45
    .line 46
    invoke-static/range {v1 .. v6}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 47
    :cond_1
    return v0
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

.method public setCountry(Lcom/sumsub/sns/internal/features/presentation/country/b;Z)V
    .locals 4
    .param p1    # Lcom/sumsub/sns/internal/features/presentation/country/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;->getEditText()Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 4
    move-result-object p2

    .line 5
    .line 6
    if-eqz p2, :cond_5

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    move-result-object p2

    .line 11
    .line 12
    if-nez p2, :cond_0

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    .line 19
    invoke-static {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/country/c;->a(Lcom/sumsub/sns/internal/features/presentation/country/b;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 20
    move-result-object p2

    .line 21
    .line 22
    if-eqz p2, :cond_1

    .line 23
    .line 24
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;->input:Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;->getFlagView()Lcom/sumsub/sns/core/widget/SNSFlagView;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 36
    .line 37
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move-object p2, v0

    .line 40
    .line 41
    :goto_0
    if-nez p2, :cond_3

    .line 42
    .line 43
    :cond_2
    iget-object p2, p0, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;->input:Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;

    .line 44
    .line 45
    if-eqz p2, :cond_3

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2}, Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;->getFlagView()Lcom/sumsub/sns/core/widget/SNSFlagView;

    .line 49
    move-result-object p2

    .line 50
    .line 51
    if-eqz p2, :cond_3

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    sget v2, Lcom/sumsub/sns/R$drawable;->sns_ic_flag_placeholder:I

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 61
    move-result-object v3

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 65
    move-result-object v3

    .line 66
    .line 67
    .line 68
    invoke-static {v1, v2, v3}, Landroidx/core/content/res/ResourcesCompat;->getDrawable(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 69
    move-result-object v1

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 73
    .line 74
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 75
    .line 76
    :cond_3
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;->country:Lcom/sumsub/sns/internal/features/presentation/country/b;

    .line 77
    .line 78
    if-eqz p1, :cond_4

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/PhoneKit;->getPhoneMasks()Ljava/util/Map;

    .line 82
    move-result-object p2

    .line 83
    .line 84
    if-eqz p2, :cond_4

    .line 85
    .line 86
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/country/b;->a:Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    move-result-object p1

    .line 91
    move-object v0, p1

    .line 92
    .line 93
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/l0;

    .line 94
    .line 95
    :cond_4
    iput-object v0, p0, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;->mask:Lcom/sumsub/sns/internal/features/data/model/common/remote/l0;

    .line 96
    :cond_5
    :goto_1
    return-void
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
.end method
