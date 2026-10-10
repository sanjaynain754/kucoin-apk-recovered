.class public final Lcom/tencent/bugly/proguard/JceDisplayer;
.super Ljava/lang/Object;
.source "BUGLY"


# instance fields
.field public a:Ljava/lang/StringBuilder;

.field public b:I


# direct methods
.method public constructor <init>(Ljava/lang/StringBuilder;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->b:I

    .line 6
    iput-object p1, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    return-void
.end method

.method public constructor <init>(Ljava/lang/StringBuilder;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    .line 3
    iput p2, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->b:I

    return-void
.end method

.method public static a([Ljava/lang/String;)V
    .locals 1

    .line 155
    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v0, "1.2"

    invoke-virtual {p0, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(BLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;
    .locals 0

    .line 6
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(Ljava/lang/String;)V

    .line 7
    iget-object p2, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0xa

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public a(CLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;
    .locals 0

    .line 8
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(Ljava/lang/String;)V

    .line 9
    iget-object p2, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 p1, 0xa

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public a(DLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;
    .locals 0

    .line 18
    invoke-virtual {p0, p3}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(Ljava/lang/String;)V

    .line 19
    iget-object p3, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const/16 p1, 0xa

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public a(FLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;
    .locals 0

    .line 16
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(Ljava/lang/String;)V

    .line 17
    iget-object p2, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 p1, 0xa

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public a(ILjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;
    .locals 0

    .line 12
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(Ljava/lang/String;)V

    .line 13
    iget-object p2, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0xa

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public a(JLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;
    .locals 0

    .line 14
    invoke-virtual {p0, p3}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(Ljava/lang/String;)V

    .line 15
    iget-object p3, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 p1, 0xa

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public a(Lcom/tencent/bugly/proguard/JceStruct;Ljava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;
    .locals 1

    const/16 v0, 0x7b

    .line 151
    invoke-virtual {p0, v0, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(CLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    if-nez p1, :cond_0

    .line 152
    iget-object p1, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    const/16 p2, 0x9

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string/jumbo p2, "null"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 153
    :cond_0
    iget-object p2, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->b:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, p2, v0}, Lcom/tencent/bugly/proguard/JceStruct;->a(Ljava/lang/StringBuilder;I)V

    :goto_0
    const/16 p1, 0x7d

    const/4 p2, 0x0

    .line 154
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(CLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    return-object p0
.end method

.method public a(Ljava/lang/Object;Ljava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/lang/String;",
            ")",
            "Lcom/tencent/bugly/proguard/JceDisplayer;"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 111
    iget-object p1, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    const-string/jumbo p2, "null"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0xa

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0

    .line 112
    :cond_0
    instance-of v0, p1, Ljava/lang/Byte;

    if-eqz v0, :cond_1

    .line 113
    check-cast p1, Ljava/lang/Byte;

    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(BLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    return-object p0

    .line 114
    :cond_1
    instance-of v0, p1, Ljava/lang/Boolean;

    if-eqz v0, :cond_2

    .line 115
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(ZLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    return-object p0

    .line 116
    :cond_2
    instance-of v0, p1, Ljava/lang/Short;

    if-eqz v0, :cond_3

    .line 117
    check-cast p1, Ljava/lang/Short;

    invoke-virtual {p1}, Ljava/lang/Short;->shortValue()S

    move-result p1

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(SLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    return-object p0

    .line 118
    :cond_3
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_4

    .line 119
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(ILjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    return-object p0

    .line 120
    :cond_4
    instance-of v0, p1, Ljava/lang/Long;

    if-eqz v0, :cond_5

    .line 121
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(JLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    return-object p0

    .line 122
    :cond_5
    instance-of v0, p1, Ljava/lang/Float;

    if-eqz v0, :cond_6

    .line 123
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(FLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    return-object p0

    .line 124
    :cond_6
    instance-of v0, p1, Ljava/lang/Double;

    if-eqz v0, :cond_7

    .line 125
    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(DLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    return-object p0

    .line 126
    :cond_7
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_8

    .line 127
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    return-object p0

    .line 128
    :cond_8
    instance-of v0, p1, Ljava/util/Map;

    if-eqz v0, :cond_9

    .line 129
    check-cast p1, Ljava/util/Map;

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(Ljava/util/Map;Ljava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    return-object p0

    .line 130
    :cond_9
    instance-of v0, p1, Ljava/util/List;

    if-eqz v0, :cond_a

    .line 131
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(Ljava/util/Collection;Ljava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    return-object p0

    .line 132
    :cond_a
    instance-of v0, p1, Lcom/tencent/bugly/proguard/JceStruct;

    if-eqz v0, :cond_b

    .line 133
    check-cast p1, Lcom/tencent/bugly/proguard/JceStruct;

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(Lcom/tencent/bugly/proguard/JceStruct;Ljava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    return-object p0

    .line 134
    :cond_b
    instance-of v0, p1, [B

    if-eqz v0, :cond_c

    .line 135
    check-cast p1, [B

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a([BLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    return-object p0

    .line 136
    :cond_c
    instance-of v0, p1, [Z

    if-eqz v0, :cond_d

    .line 137
    check-cast p1, [Z

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(Ljava/lang/Object;Ljava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    return-object p0

    .line 138
    :cond_d
    instance-of v0, p1, [S

    if-eqz v0, :cond_e

    .line 139
    check-cast p1, [S

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a([SLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    return-object p0

    .line 140
    :cond_e
    instance-of v0, p1, [I

    if-eqz v0, :cond_f

    .line 141
    check-cast p1, [I

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a([ILjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    return-object p0

    .line 142
    :cond_f
    instance-of v0, p1, [J

    if-eqz v0, :cond_10

    .line 143
    check-cast p1, [J

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a([JLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    return-object p0

    .line 144
    :cond_10
    instance-of v0, p1, [F

    if-eqz v0, :cond_11

    .line 145
    check-cast p1, [F

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a([FLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    return-object p0

    .line 146
    :cond_11
    instance-of v0, p1, [D

    if-eqz v0, :cond_12

    .line 147
    check-cast p1, [D

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a([DLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    return-object p0

    .line 148
    :cond_12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_13

    .line 149
    check-cast p1, [Ljava/lang/Object;

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a([Ljava/lang/Object;Ljava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    return-object p0

    .line 150
    :cond_13
    new-instance p1, Lcom/tencent/bugly/proguard/ia;

    const-string/jumbo p2, "write object error: unsupport type."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/ia;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;
    .locals 1

    .line 20
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(Ljava/lang/String;)V

    const/16 p2, 0xa

    if-nez p1, :cond_0

    .line 21
    iget-object p1, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    const-string/jumbo v0, "null"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0

    .line 22
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public a(Ljava/util/Collection;Ljava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "TT;>;",
            "Ljava/lang/String;",
            ")",
            "Lcom/tencent/bugly/proguard/JceDisplayer;"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 108
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(Ljava/lang/String;)V

    .line 109
    iget-object p1, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    const-string/jumbo p2, "null"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0x9

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0

    .line 110
    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a([Ljava/lang/Object;Ljava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/util/Map;Ljava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "TK;TV;>;",
            "Ljava/lang/String;",
            ")",
            "Lcom/tencent/bugly/proguard/JceDisplayer;"
        }
    .end annotation

    .line 86
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(Ljava/lang/String;)V

    const/16 p2, 0xa

    if-nez p1, :cond_0

    .line 87
    iget-object p1, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    const-string/jumbo v0, "null"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0

    .line 88
    :cond_0
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 89
    iget-object v0, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", {}"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0

    .line 90
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", {"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 91
    new-instance p2, Lcom/tencent/bugly/proguard/JceDisplayer;

    iget-object v0, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->b:I

    add-int/lit8 v1, v1, 0x1

    invoke-direct {p2, v0, v1}, Lcom/tencent/bugly/proguard/JceDisplayer;-><init>(Ljava/lang/StringBuilder;I)V

    .line 92
    new-instance v0, Lcom/tencent/bugly/proguard/JceDisplayer;

    iget-object v1, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->b:I

    add-int/lit8 v2, v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/tencent/bugly/proguard/JceDisplayer;-><init>(Ljava/lang/StringBuilder;I)V

    .line 93
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    const/16 v3, 0x28

    .line 94
    invoke-virtual {p2, v3, v2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(CLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    .line 95
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(Ljava/lang/Object;Ljava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    .line 96
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(Ljava/lang/Object;Ljava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    const/16 v1, 0x29

    .line 97
    invoke-virtual {p2, v1, v2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(CLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    goto :goto_0

    :cond_2
    const/16 p1, 0x7d

    .line 98
    invoke-virtual {p0, p1, v2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(CLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    return-object p0
.end method

.method public a(SLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;
    .locals 0

    .line 10
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(Ljava/lang/String;)V

    .line 11
    iget-object p2, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0xa

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public a(ZLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;
    .locals 0

    .line 4
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(Ljava/lang/String;)V

    .line 5
    iget-object p2, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    if-eqz p1, :cond_0

    const/16 p1, 0x54

    goto :goto_0

    :cond_0
    const/16 p1, 0x46

    :goto_0
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 p1, 0xa

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public a([BLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;
    .locals 4

    .line 23
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(Ljava/lang/String;)V

    const/16 p2, 0xa

    if-nez p1, :cond_0

    .line 24
    iget-object p1, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    const-string/jumbo v0, "null"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0

    .line 25
    :cond_0
    array-length v0, p1

    if-nez v0, :cond_1

    .line 26
    iget-object v0, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    array-length p1, p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", []"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0

    .line 27
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    array-length v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    new-instance p2, Lcom/tencent/bugly/proguard/JceDisplayer;

    iget-object v0, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->b:I

    add-int/lit8 v1, v1, 0x1

    invoke-direct {p2, v0, v1}, Lcom/tencent/bugly/proguard/JceDisplayer;-><init>(Ljava/lang/StringBuilder;I)V

    .line 29
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x0

    if-ge v1, v0, :cond_2

    aget-byte v3, p1, v1

    .line 30
    invoke-virtual {p2, v3, v2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(BLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/16 p1, 0x5d

    .line 31
    invoke-virtual {p0, p1, v2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(CLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    return-object p0
.end method

.method public a([CLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;
    .locals 4

    .line 32
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(Ljava/lang/String;)V

    const/16 p2, 0xa

    if-nez p1, :cond_0

    .line 33
    iget-object p1, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    const-string/jumbo v0, "null"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0

    .line 34
    :cond_0
    array-length v0, p1

    if-nez v0, :cond_1

    .line 35
    iget-object v0, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    array-length p1, p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", []"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0

    .line 36
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    array-length v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 37
    new-instance p2, Lcom/tencent/bugly/proguard/JceDisplayer;

    iget-object v0, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->b:I

    add-int/lit8 v1, v1, 0x1

    invoke-direct {p2, v0, v1}, Lcom/tencent/bugly/proguard/JceDisplayer;-><init>(Ljava/lang/StringBuilder;I)V

    .line 38
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x0

    if-ge v1, v0, :cond_2

    aget-char v3, p1, v1

    .line 39
    invoke-virtual {p2, v3, v2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(CLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/16 p1, 0x5d

    .line 40
    invoke-virtual {p0, p1, v2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(CLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    return-object p0
.end method

.method public a([DLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;
    .locals 5

    .line 77
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(Ljava/lang/String;)V

    const/16 p2, 0xa

    if-nez p1, :cond_0

    .line 78
    iget-object p1, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    const-string/jumbo v0, "null"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0

    .line 79
    :cond_0
    array-length v0, p1

    if-nez v0, :cond_1

    .line 80
    iget-object v0, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    array-length p1, p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", []"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0

    .line 81
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    array-length v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 82
    new-instance p2, Lcom/tencent/bugly/proguard/JceDisplayer;

    iget-object v0, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->b:I

    add-int/lit8 v1, v1, 0x1

    invoke-direct {p2, v0, v1}, Lcom/tencent/bugly/proguard/JceDisplayer;-><init>(Ljava/lang/StringBuilder;I)V

    .line 83
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x0

    if-ge v1, v0, :cond_2

    aget-wide v3, p1, v1

    .line 84
    invoke-virtual {p2, v3, v4, v2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(DLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/16 p1, 0x5d

    .line 85
    invoke-virtual {p0, p1, v2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(CLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    return-object p0
.end method

.method public a([FLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;
    .locals 4

    .line 68
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(Ljava/lang/String;)V

    const/16 p2, 0xa

    if-nez p1, :cond_0

    .line 69
    iget-object p1, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    const-string/jumbo v0, "null"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0

    .line 70
    :cond_0
    array-length v0, p1

    if-nez v0, :cond_1

    .line 71
    iget-object v0, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    array-length p1, p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", []"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0

    .line 72
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    array-length v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 73
    new-instance p2, Lcom/tencent/bugly/proguard/JceDisplayer;

    iget-object v0, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->b:I

    add-int/lit8 v1, v1, 0x1

    invoke-direct {p2, v0, v1}, Lcom/tencent/bugly/proguard/JceDisplayer;-><init>(Ljava/lang/StringBuilder;I)V

    .line 74
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x0

    if-ge v1, v0, :cond_2

    aget v3, p1, v1

    .line 75
    invoke-virtual {p2, v3, v2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(FLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/16 p1, 0x5d

    .line 76
    invoke-virtual {p0, p1, v2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(CLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    return-object p0
.end method

.method public a([ILjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;
    .locals 4

    .line 50
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(Ljava/lang/String;)V

    const/16 p2, 0xa

    if-nez p1, :cond_0

    .line 51
    iget-object p1, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    const-string/jumbo v0, "null"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0

    .line 52
    :cond_0
    array-length v0, p1

    if-nez v0, :cond_1

    .line 53
    iget-object v0, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    array-length p1, p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", []"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0

    .line 54
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    array-length v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 55
    new-instance p2, Lcom/tencent/bugly/proguard/JceDisplayer;

    iget-object v0, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->b:I

    add-int/lit8 v1, v1, 0x1

    invoke-direct {p2, v0, v1}, Lcom/tencent/bugly/proguard/JceDisplayer;-><init>(Ljava/lang/StringBuilder;I)V

    .line 56
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x0

    if-ge v1, v0, :cond_2

    aget v3, p1, v1

    .line 57
    invoke-virtual {p2, v3, v2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(ILjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/16 p1, 0x5d

    .line 58
    invoke-virtual {p0, p1, v2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(CLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    return-object p0
.end method

.method public a([JLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;
    .locals 5

    .line 59
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(Ljava/lang/String;)V

    const/16 p2, 0xa

    if-nez p1, :cond_0

    .line 60
    iget-object p1, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    const-string/jumbo v0, "null"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0

    .line 61
    :cond_0
    array-length v0, p1

    if-nez v0, :cond_1

    .line 62
    iget-object v0, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    array-length p1, p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", []"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0

    .line 63
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    array-length v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 64
    new-instance p2, Lcom/tencent/bugly/proguard/JceDisplayer;

    iget-object v0, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->b:I

    add-int/lit8 v1, v1, 0x1

    invoke-direct {p2, v0, v1}, Lcom/tencent/bugly/proguard/JceDisplayer;-><init>(Ljava/lang/StringBuilder;I)V

    .line 65
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x0

    if-ge v1, v0, :cond_2

    aget-wide v3, p1, v1

    .line 66
    invoke-virtual {p2, v3, v4, v2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(JLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/16 p1, 0x5d

    .line 67
    invoke-virtual {p0, p1, v2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(CLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    return-object p0
.end method

.method public a([Ljava/lang/Object;Ljava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;",
            "Ljava/lang/String;",
            ")",
            "Lcom/tencent/bugly/proguard/JceDisplayer;"
        }
    .end annotation

    .line 99
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(Ljava/lang/String;)V

    const/16 p2, 0xa

    if-nez p1, :cond_0

    .line 100
    iget-object p1, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    const-string/jumbo v0, "null"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0

    .line 101
    :cond_0
    array-length v0, p1

    if-nez v0, :cond_1

    .line 102
    iget-object v0, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    array-length p1, p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", []"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0

    .line 103
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    array-length v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 104
    new-instance p2, Lcom/tencent/bugly/proguard/JceDisplayer;

    iget-object v0, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->b:I

    add-int/lit8 v1, v1, 0x1

    invoke-direct {p2, v0, v1}, Lcom/tencent/bugly/proguard/JceDisplayer;-><init>(Ljava/lang/StringBuilder;I)V

    .line 105
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x0

    if-ge v1, v0, :cond_2

    aget-object v3, p1, v1

    .line 106
    invoke-virtual {p2, v3, v2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(Ljava/lang/Object;Ljava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/16 p1, 0x5d

    .line 107
    invoke-virtual {p0, p1, v2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(CLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    return-object p0
.end method

.method public a([SLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;
    .locals 4

    .line 41
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(Ljava/lang/String;)V

    const/16 p2, 0xa

    if-nez p1, :cond_0

    .line 42
    iget-object p1, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    const-string/jumbo v0, "null"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0

    .line 43
    :cond_0
    array-length v0, p1

    if-nez v0, :cond_1

    .line 44
    iget-object v0, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    array-length p1, p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", []"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0

    .line 45
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    array-length v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    new-instance p2, Lcom/tencent/bugly/proguard/JceDisplayer;

    iget-object v0, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->b:I

    add-int/lit8 v1, v1, 0x1

    invoke-direct {p2, v0, v1}, Lcom/tencent/bugly/proguard/JceDisplayer;-><init>(Ljava/lang/StringBuilder;I)V

    .line 47
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x0

    if-ge v1, v0, :cond_2

    aget-short v3, p1, v1

    .line 48
    invoke-virtual {p2, v3, v2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(SLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/16 p1, 0x5d

    .line 49
    invoke-virtual {p0, p1, v2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(CLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    return-object p0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x0

    .line 1
    :goto_0
    iget v1, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->b:I

    if-ge v0, v1, :cond_0

    .line 2
    iget-object v1, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    const/16 v2, 0x9

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/JceDisplayer;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    return-void
.end method
