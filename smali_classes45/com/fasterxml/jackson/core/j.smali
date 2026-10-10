.class public abstract Lcom/fasterxml/jackson/core/j;
.super Ljava/lang/Object;
.source "TSFBuilder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<F:",
        "Lcom/fasterxml/jackson/core/JsonFactory;",
        "B:",
        "Lcom/fasterxml/jackson/core/j<",
        "TF;TB;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final f:I

.field public static final g:I

.field public static final h:I


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:Lcom/fasterxml/jackson/core/io/InputDecorator;

.field public e:Lcom/fasterxml/jackson/core/io/OutputDecorator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/fasterxml/jackson/core/JsonFactory$Feature;->collectDefaults()I

    .line 4
    move-result v0

    .line 5
    .line 6
    sput v0, Lcom/fasterxml/jackson/core/j;->f:I

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/fasterxml/jackson/core/JsonParser$Feature;->collectDefaults()I

    .line 10
    move-result v0

    .line 11
    .line 12
    sput v0, Lcom/fasterxml/jackson/core/j;->g:I

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lcom/fasterxml/jackson/core/JsonGenerator$Feature;->collectDefaults()I

    .line 16
    move-result v0

    .line 17
    .line 18
    sput v0, Lcom/fasterxml/jackson/core/j;->h:I

    .line 19
    return-void
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
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Lcom/fasterxml/jackson/core/j;->f:I

    iput v0, p0, Lcom/fasterxml/jackson/core/j;->a:I

    .line 3
    sget v0, Lcom/fasterxml/jackson/core/j;->g:I

    iput v0, p0, Lcom/fasterxml/jackson/core/j;->b:I

    .line 4
    sget v0, Lcom/fasterxml/jackson/core/j;->h:I

    iput v0, p0, Lcom/fasterxml/jackson/core/j;->c:I

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/fasterxml/jackson/core/j;->d:Lcom/fasterxml/jackson/core/io/InputDecorator;

    .line 6
    iput-object v0, p0, Lcom/fasterxml/jackson/core/j;->e:Lcom/fasterxml/jackson/core/io/OutputDecorator;

    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput p1, p0, Lcom/fasterxml/jackson/core/j;->a:I

    .line 10
    iput p2, p0, Lcom/fasterxml/jackson/core/j;->b:I

    .line 11
    iput p3, p0, Lcom/fasterxml/jackson/core/j;->c:I

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/core/JsonFactory;)V
    .locals 2

    .line 7
    iget v0, p1, Lcom/fasterxml/jackson/core/JsonFactory;->_factoryFeatures:I

    iget v1, p1, Lcom/fasterxml/jackson/core/JsonFactory;->_parserFeatures:I

    iget p1, p1, Lcom/fasterxml/jackson/core/JsonFactory;->_generatorFeatures:I

    invoke-direct {p0, v0, v1, p1}, Lcom/fasterxml/jackson/core/j;-><init>(III)V

    return-void
.end method
