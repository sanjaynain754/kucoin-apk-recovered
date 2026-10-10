.class public final Lkotlin/reflect/jvm/internal/impl/platform/PlatformUtilKt;
.super Ljava/lang/Object;
.source "platformUtil.kt"


# annotations
.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nplatformUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 platformUtil.kt\norg/jetbrains/kotlin/platform/PlatformUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n10#1:55\n808#2,11:44\n808#2,11:56\n*S KotlinDebug\n*F\n+ 1 platformUtil.kt\norg/jetbrains/kotlin/platform/PlatformUtilKt\n*L\n13#1:55\n10#1:44,11\n13#1:56,11\n*E\n"
    }
.end annotation


# direct methods
.method public static final getPresentableDescription(Lkotlin/reflect/jvm/internal/impl/platform/TargetPlatform;)Ljava/lang/String;
    .locals 10
    .param p0    # Lkotlin/reflect/jvm/internal/impl/platform/TargetPlatform;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/platform/TargetPlatform;->getComponentPlatforms()Ljava/util/Set;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    const/16 v8, 0x3e

    .line 12
    const/4 v9, 0x0

    .line 13
    .line 14
    const-string v2, "/"

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x0

    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v7, 0x0

    .line 20
    .line 21
    .line 22
    invoke-static/range {v1 .. v9}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 23
    move-result-object p0

    .line 24
    return-object p0
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method
