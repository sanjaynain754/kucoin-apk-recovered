.class final Lcom/facebook/react/modules/fresco/XmlFormat$XmlFormatChecker;
.super Ljava/lang/Object;
.source "XmlFormat.kt"

# interfaces
.implements Lcom/facebook/imageformat/ImageFormat$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/modules/fresco/XmlFormat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "XmlFormatChecker"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/facebook/react/modules/fresco/XmlFormat$XmlFormatChecker;",
        "Lcom/facebook/imageformat/ImageFormat$a;",
        "<init>",
        "()V",
        "",
        "headerBytes",
        "",
        "headerSize",
        "Lcom/facebook/imageformat/ImageFormat;",
        "determineFormat",
        "([BI)Lcom/facebook/imageformat/ImageFormat;",
        "I",
        "getHeaderSize",
        "()I",
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


# instance fields
.field private final headerSize:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/facebook/react/modules/fresco/XmlFormat;->access$getBINARY_XML_HEADER$p()[B

    .line 7
    move-result-object v0

    .line 8
    array-length v0, v0

    .line 9
    .line 10
    iput v0, p0, Lcom/facebook/react/modules/fresco/XmlFormat$XmlFormatChecker;->headerSize:I

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method


# virtual methods
.method public determineFormat([BI)Lcom/facebook/imageformat/ImageFormat;
    .locals 1
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "headerBytes"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/facebook/react/modules/fresco/XmlFormat;->access$getBINARY_XML_HEADER$p()[B

    .line 9
    move-result-object v0

    .line 10
    array-length v0, v0

    .line 11
    .line 12
    if-ge p2, v0, :cond_0

    .line 13
    .line 14
    sget-object p1, Lcom/facebook/imageformat/ImageFormat;->d:Lcom/facebook/imageformat/ImageFormat;

    .line 15
    return-object p1

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-static {}, Lcom/facebook/react/modules/fresco/XmlFormat;->access$getBINARY_XML_HEADER$p()[B

    .line 19
    move-result-object p2

    .line 20
    .line 21
    .line 22
    invoke-static {p1, p2}, Ll5/c;->c([B[B)Z

    .line 23
    move-result p1

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lcom/facebook/react/modules/fresco/XmlFormat;->access$getFORMAT$p()Lcom/facebook/imageformat/ImageFormat;

    .line 29
    move-result-object p1

    .line 30
    return-object p1

    .line 31
    .line 32
    :cond_1
    sget-object p1, Lcom/facebook/imageformat/ImageFormat;->d:Lcom/facebook/imageformat/ImageFormat;

    .line 33
    return-object p1
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

.method public getHeaderSize()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/react/modules/fresco/XmlFormat$XmlFormatChecker;->headerSize:I

    .line 3
    return v0
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
