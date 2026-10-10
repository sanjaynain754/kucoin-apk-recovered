.class public Lb9/h;
.super Ljava/lang/Object;
.source "DefaultDecoderFactory.java"

# interfaces
.implements Lb9/e;


# instance fields
.field public a:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lcom/google/zxing/BarcodeFormat;",
            ">;"
        }
    .end annotation
.end field

.field public b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/google/zxing/DecodeHintType;",
            "*>;"
        }
    .end annotation
.end field

.field public c:Ljava/lang/String;

.field public d:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;Ljava/util/Map;Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/google/zxing/BarcodeFormat;",
            ">;",
            "Ljava/util/Map<",
            "Lcom/google/zxing/DecodeHintType;",
            "*>;",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lb9/h;->a:Ljava/util/Collection;

    .line 4
    iput-object p2, p0, Lb9/h;->b:Ljava/util/Map;

    .line 5
    iput-object p3, p0, Lb9/h;->c:Ljava/lang/String;

    .line 6
    iput p4, p0, Lb9/h;->d:I

    return-void
.end method


# virtual methods
.method public a(Ljava/util/Map;)Lb9/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/google/zxing/DecodeHintType;",
            "*>;)",
            "Lb9/d;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/EnumMap;

    .line 3
    .line 4
    const-class v1, Lcom/google/zxing/DecodeHintType;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 11
    .line 12
    iget-object p1, p0, Lb9/h;->b:Ljava/util/Map;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 18
    .line 19
    :cond_0
    iget-object p1, p0, Lb9/h;->a:Ljava/util/Collection;

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    sget-object v1, Lcom/google/zxing/DecodeHintType;->POSSIBLE_FORMATS:Lcom/google/zxing/DecodeHintType;

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    :cond_1
    iget-object p1, p0, Lb9/h;->c:Ljava/lang/String;

    .line 29
    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    sget-object v1, Lcom/google/zxing/DecodeHintType;->CHARACTER_SET:Lcom/google/zxing/DecodeHintType;

    .line 33
    .line 34
    .line 35
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    :cond_2
    new-instance p1, Lcom/google/zxing/MultiFormatReader;

    .line 38
    .line 39
    .line 40
    invoke-direct {p1}, Lcom/google/zxing/MultiFormatReader;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v0}, Lcom/google/zxing/MultiFormatReader;->setHints(Ljava/util/Map;)V

    .line 44
    .line 45
    iget v0, p0, Lb9/h;->d:I

    .line 46
    .line 47
    if-eqz v0, :cond_5

    .line 48
    const/4 v1, 0x1

    .line 49
    .line 50
    if-eq v0, v1, :cond_4

    .line 51
    const/4 v1, 0x2

    .line 52
    .line 53
    if-eq v0, v1, :cond_3

    .line 54
    .line 55
    new-instance v0, Lb9/d;

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, p1}, Lb9/d;-><init>(Lcom/google/zxing/Reader;)V

    .line 59
    return-object v0

    .line 60
    .line 61
    :cond_3
    new-instance v0, Lb9/j;

    .line 62
    .line 63
    .line 64
    invoke-direct {v0, p1}, Lb9/j;-><init>(Lcom/google/zxing/Reader;)V

    .line 65
    return-object v0

    .line 66
    .line 67
    :cond_4
    new-instance v0, Lb9/i;

    .line 68
    .line 69
    .line 70
    invoke-direct {v0, p1}, Lb9/i;-><init>(Lcom/google/zxing/Reader;)V

    .line 71
    return-object v0

    .line 72
    .line 73
    :cond_5
    new-instance v0, Lb9/d;

    .line 74
    .line 75
    .line 76
    invoke-direct {v0, p1}, Lb9/d;-><init>(Lcom/google/zxing/Reader;)V

    .line 77
    return-object v0
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
.end method
