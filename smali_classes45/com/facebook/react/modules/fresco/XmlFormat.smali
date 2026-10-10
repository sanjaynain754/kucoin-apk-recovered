.class public final Lcom/facebook/react/modules/fresco/XmlFormat;
.super Ljava/lang/Object;
.source "XmlFormat.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/modules/fresco/XmlFormat$CloseableXmlImage;,
        Lcom/facebook/react/modules/fresco/XmlFormat$XmlDrawableFactory;,
        Lcom/facebook/react/modules/fresco/XmlFormat$XmlFormatChecker;,
        Lcom/facebook/react/modules/fresco/XmlFormat$XmlFormatDecoder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0007\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0004\u0016\u0017\u0018\u0019B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001d\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\r\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/facebook/react/modules/fresco/XmlFormat;",
        "",
        "<init>",
        "()V",
        "Lv5/c$a;",
        "builder",
        "Landroid/content/Context;",
        "context",
        "addDecodingCapability",
        "(Lv5/c$a;Landroid/content/Context;)Lv5/c$a;",
        "Lw5/a;",
        "getDrawableFactory",
        "()Lw5/a;",
        "Lcom/facebook/imageformat/ImageFormat;",
        "FORMAT",
        "Lcom/facebook/imageformat/ImageFormat;",
        "",
        "TAG",
        "Ljava/lang/String;",
        "",
        "BINARY_XML_HEADER",
        "[B",
        "XmlFormatChecker",
        "CloseableXmlImage",
        "XmlFormatDecoder",
        "XmlDrawableFactory",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final BINARY_XML_HEADER:[B
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final FORMAT:Lcom/facebook/imageformat/ImageFormat;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/facebook/react/modules/fresco/XmlFormat;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "XmlFormat"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/modules/fresco/XmlFormat;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/facebook/react/modules/fresco/XmlFormat;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/modules/fresco/XmlFormat;->INSTANCE:Lcom/facebook/react/modules/fresco/XmlFormat;

    .line 8
    .line 9
    new-instance v0, Lcom/facebook/imageformat/ImageFormat;

    .line 10
    .line 11
    const-string v1, "XML"

    .line 12
    .line 13
    .line 14
    const-string/jumbo v2, "xml"

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Lcom/facebook/imageformat/ImageFormat;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    sput-object v0, Lcom/facebook/react/modules/fresco/XmlFormat;->FORMAT:Lcom/facebook/imageformat/ImageFormat;

    .line 20
    const/4 v0, 0x4

    .line 21
    .line 22
    new-array v0, v0, [B

    .line 23
    .line 24
    .line 25
    fill-array-data v0, :array_0

    .line 26
    .line 27
    sput-object v0, Lcom/facebook/react/modules/fresco/XmlFormat;->BINARY_XML_HEADER:[B

    .line 28
    return-void

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    :array_0
    .array-data 1
        0x3t
        0x0t
        0x8t
        0x0t
    .end array-data
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
.end method

.method private constructor <init>()V
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

.method public static final synthetic access$getBINARY_XML_HEADER$p()[B
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/react/modules/fresco/XmlFormat;->BINARY_XML_HEADER:[B

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
    .line 18
.end method

.method public static final synthetic access$getFORMAT$p()Lcom/facebook/imageformat/ImageFormat;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/react/modules/fresco/XmlFormat;->FORMAT:Lcom/facebook/imageformat/ImageFormat;

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
    .line 18
.end method


# virtual methods
.method public final addDecodingCapability(Lv5/c$a;Landroid/content/Context;)Lv5/c$a;
    .locals 3
    .param p1    # Lv5/c$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "builder"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "context"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    sget-object v0, Lcom/facebook/react/modules/fresco/XmlFormat;->FORMAT:Lcom/facebook/imageformat/ImageFormat;

    .line 13
    .line 14
    new-instance v1, Lcom/facebook/react/modules/fresco/XmlFormat$XmlFormatChecker;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1}, Lcom/facebook/react/modules/fresco/XmlFormat$XmlFormatChecker;-><init>()V

    .line 18
    .line 19
    new-instance v2, Lcom/facebook/react/modules/fresco/XmlFormat$XmlFormatDecoder;

    .line 20
    .line 21
    .line 22
    invoke-direct {v2, p2}, Lcom/facebook/react/modules/fresco/XmlFormat$XmlFormatDecoder;-><init>(Landroid/content/Context;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0, v1, v2}, Lv5/c$a;->c(Lcom/facebook/imageformat/ImageFormat;Lcom/facebook/imageformat/ImageFormat$a;Lv5/b;)Lv5/c$a;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    const-string p2, "addDecodingCapability(...)"

    .line 29
    .line 30
    .line 31
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    return-object p1
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
.end method

.method public final getDrawableFactory()Lw5/a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/modules/fresco/XmlFormat$XmlDrawableFactory;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/facebook/react/modules/fresco/XmlFormat$XmlDrawableFactory;-><init>()V

    .line 6
    return-object v0
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
