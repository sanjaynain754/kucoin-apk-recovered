.class public Lorg/springframework/web/util/pattern/PatternParseException;
.super Ljava/lang/IllegalArgumentException;
.source "PatternParseException.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/springframework/web/util/pattern/PatternParseException$PatternMessage;
    }
.end annotation


# instance fields
.field private final inserts:[Ljava/lang/Object;

.field private final messageType:Lorg/springframework/web/util/pattern/PatternParseException$PatternMessage;

.field private final pattern:[C

.field private final position:I


# direct methods
.method public varargs constructor <init>(I[CLorg/springframework/web/util/pattern/PatternParseException$PatternMessage;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p3, p4}, Lorg/springframework/web/util/pattern/PatternParseException$PatternMessage;->formatMessage([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 2
    iput p1, p0, Lorg/springframework/web/util/pattern/PatternParseException;->position:I

    .line 3
    iput-object p2, p0, Lorg/springframework/web/util/pattern/PatternParseException;->pattern:[C

    .line 4
    iput-object p3, p0, Lorg/springframework/web/util/pattern/PatternParseException;->messageType:Lorg/springframework/web/util/pattern/PatternParseException$PatternMessage;

    .line 5
    iput-object p4, p0, Lorg/springframework/web/util/pattern/PatternParseException;->inserts:[Ljava/lang/Object;

    return-void
.end method

.method public varargs constructor <init>(Ljava/lang/Throwable;I[CLorg/springframework/web/util/pattern/PatternParseException$PatternMessage;[Ljava/lang/Object;)V
    .locals 1

    .line 6
    invoke-virtual {p4, p5}, Lorg/springframework/web/util/pattern/PatternParseException$PatternMessage;->formatMessage([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 7
    iput p2, p0, Lorg/springframework/web/util/pattern/PatternParseException;->position:I

    .line 8
    iput-object p3, p0, Lorg/springframework/web/util/pattern/PatternParseException;->pattern:[C

    .line 9
    iput-object p4, p0, Lorg/springframework/web/util/pattern/PatternParseException;->messageType:Lorg/springframework/web/util/pattern/PatternParseException$PatternMessage;

    .line 10
    iput-object p5, p0, Lorg/springframework/web/util/pattern/PatternParseException;->inserts:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public getInserts()[Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/springframework/web/util/pattern/PatternParseException;->inserts:[Ljava/lang/Object;

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
    .line 19
    .line 20
    .line 21
.end method

.method public getMessage()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lorg/springframework/web/util/pattern/PatternParseException;->messageType:Lorg/springframework/web/util/pattern/PatternParseException$PatternMessage;

    .line 3
    .line 4
    iget-object v1, p0, Lorg/springframework/web/util/pattern/PatternParseException;->inserts:[Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lorg/springframework/web/util/pattern/PatternParseException$PatternMessage;->formatMessage([Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    return-object v0
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
.end method

.method public getMessageType()Lorg/springframework/web/util/pattern/PatternParseException$PatternMessage;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/springframework/web/util/pattern/PatternParseException;->messageType:Lorg/springframework/web/util/pattern/PatternParseException$PatternMessage;

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
    .line 19
    .line 20
    .line 21
.end method

.method public getPosition()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lorg/springframework/web/util/pattern/PatternParseException;->position:I

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
    .line 19
    .line 20
    .line 21
.end method

.method public toDetailedString()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lorg/springframework/web/util/pattern/PatternParseException;->pattern:[C

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append([C)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const/16 v1, 0xa

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    const/4 v1, 0x0

    .line 17
    .line 18
    :goto_0
    iget v2, p0, Lorg/springframework/web/util/pattern/PatternParseException;->position:I

    .line 19
    .line 20
    if-ge v1, v2, :cond_0

    .line 21
    .line 22
    const/16 v2, 0x20

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    add-int/lit8 v1, v1, 0x1

    .line 28
    goto :goto_0

    .line 29
    .line 30
    :cond_0
    const-string v1, "^\n"

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lorg/springframework/web/util/pattern/PatternParseException;->getMessage()Ljava/lang/String;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    move-result-object v0

    .line 45
    return-object v0
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
.end method
