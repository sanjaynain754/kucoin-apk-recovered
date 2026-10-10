.class public abstract Lcom/sumsub/sns/internal/core/domain/i;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic a:[Lkotlin/reflect/KProperty;

.field public static final b:Lkotlin/properties/ReadOnlyProperty;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    .line 2
    const-string v0, "getTokenDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    const-class v2, Lcom/sumsub/sns/internal/core/domain/i;

    .line 6
    .line 7
    .line 8
    const-string/jumbo v3, "tokenDataStore"

    .line 9
    .line 10
    .line 11
    invoke-static {v2, v3, v0, v1}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    new-array v1, v1, [Lkotlin/reflect/KProperty;

    .line 15
    const/4 v2, 0x0

    .line 16
    .line 17
    aput-object v0, v1, v2

    .line 18
    .line 19
    sput-object v1, Lcom/sumsub/sns/internal/core/domain/i;->a:[Lkotlin/reflect/KProperty;

    .line 20
    .line 21
    const/16 v7, 0xe

    .line 22
    const/4 v8, 0x0

    .line 23
    .line 24
    .line 25
    const-string/jumbo v3, "token_store"

    .line 26
    const/4 v4, 0x0

    .line 27
    const/4 v5, 0x0

    .line 28
    const/4 v6, 0x0

    .line 29
    .line 30
    .line 31
    invoke-static/range {v3 .. v8}, Landroidx/datastore/preferences/PreferenceDataStoreDelegateKt;->preferencesDataStore$default(Ljava/lang/String;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/m0;ILjava/lang/Object;)Lkotlin/properties/ReadOnlyProperty;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    sput-object v0, Lcom/sumsub/sns/internal/core/domain/i;->b:Lkotlin/properties/ReadOnlyProperty;

    .line 35
    return-void
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
