.class public final Lcom/revolut/revolutpay/ui/picker/d;
.super Lsa0/a;
.source "SourceFile"

# interfaces
.implements Lcom/revolut/revolutpay/ui/picker/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lsa0/a<",
        "Lcom/revolut/revolutpay/ui/picker/g;",
        ">;",
        "Lcom/revolut/revolutpay/ui/picker/e;"
    }
.end annotation


# instance fields
.field public final c:Lma0/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lcom/revolut/revolutpay/ui/picker/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lma0/a;)V
    .locals 2
    .param p1    # Lma0/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "countryInteractor"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lsa0/a;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/revolut/revolutpay/ui/picker/d;->c:Lma0/a;

    .line 11
    .line 12
    new-instance p1, Lcom/revolut/revolutpay/ui/picker/f;

    .line 13
    const/4 v0, 0x0

    .line 14
    const/4 v1, 0x1

    .line 15
    .line 16
    .line 17
    invoke-direct {p1, v0, v1, v0}, Lcom/revolut/revolutpay/ui/picker/f;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 18
    .line 19
    iput-object p1, p0, Lcom/revolut/revolutpay/ui/picker/d;->d:Lcom/revolut/revolutpay/ui/picker/f;

    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "text"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/revolut/revolutpay/ui/picker/d;->h(Ljava/lang/String;)V

    .line 10
    return-void
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

.method public b(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "listId"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/revolut/revolutpay/ui/picker/d;->c:Lma0/a;

    .line 8
    .line 9
    sget-object v1, Lcom/revolut/revolutpay/domain/model/CountryCode;->Companion:Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p1}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->fromValue(Ljava/lang/String;)Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, p1}, Lma0/a;->a(Lcom/revolut/revolutpay/domain/model/CountryCode;)Lcom/revolut/revolutpay/ui/picker/model/a;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lsa0/a;->d()Lsa0/c;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    check-cast v0, Lcom/revolut/revolutpay/ui/picker/g;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, p1}, Lcom/revolut/revolutpay/ui/picker/g;->q(Lcom/revolut/revolutpay/ui/picker/model/a;)V

    .line 29
    :cond_0
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
.end method

.method public e()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/revolut/revolutpay/ui/picker/d;->d:Lcom/revolut/revolutpay/ui/picker/f;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/revolut/revolutpay/ui/picker/f;->a()Ljava/util/List;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/revolut/revolutpay/ui/picker/d;->i()V

    .line 16
    .line 17
    const-string v0, ""

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lcom/revolut/revolutpay/ui/picker/d;->h(Ljava/lang/String;)V

    .line 21
    :cond_0
    return-void
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

.method public f()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public final g(Lxa0/a;Ljava/lang/String;)Z
    .locals 1

    .line 1
    .line 2
    instance-of v0, p1, Lxa0/f;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lxa0/f;

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    .line 10
    :goto_0
    if-eqz p1, :cond_1

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lxa0/f;->b()Ljava/lang/String;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    const/4 v0, 0x1

    .line 18
    .line 19
    .line 20
    invoke-static {p1, p2, v0}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 21
    move-result p1

    .line 22
    return p1

    .line 23
    :cond_1
    const/4 p1, 0x0

    .line 24
    return p1
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

.method public final h(Ljava/lang/String;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object p1, p0, Lcom/revolut/revolutpay/ui/picker/d;->d:Lcom/revolut/revolutpay/ui/picker/f;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/revolut/revolutpay/ui/picker/f;->a()Ljava/util/List;

    .line 12
    move-result-object p1

    .line 13
    goto :goto_1

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/revolut/revolutpay/ui/picker/d;->d:Lcom/revolut/revolutpay/ui/picker/f;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/revolut/revolutpay/ui/picker/f;->a()Ljava/util/List;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    new-instance v1, Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    .line 31
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    move-result v2

    .line 33
    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    move-result-object v2

    .line 39
    move-object v3, v2

    .line 40
    .line 41
    check-cast v3, Lcom/revolut/revolutpay/ui_kit/delegate/a$b;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3}, Lcom/revolut/revolutpay/ui_kit/delegate/a$b;->e()Lxa0/a;

    .line 45
    move-result-object v4

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v4, p1}, Lcom/revolut/revolutpay/ui/picker/d;->g(Lxa0/a;Ljava/lang/String;)Z

    .line 49
    move-result v4

    .line 50
    .line 51
    if-nez v4, :cond_2

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3}, Lcom/revolut/revolutpay/ui_kit/delegate/a$b;->d()Lxa0/a;

    .line 55
    move-result-object v3

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v3, p1}, Lcom/revolut/revolutpay/ui/picker/d;->g(Lxa0/a;Ljava/lang/String;)Z

    .line 59
    move-result v3

    .line 60
    .line 61
    if-eqz v3, :cond_1

    .line 62
    .line 63
    .line 64
    :cond_2
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 65
    goto :goto_0

    .line 66
    :cond_3
    move-object p1, v1

    .line 67
    .line 68
    .line 69
    :goto_1
    invoke-virtual {p0}, Lsa0/a;->d()Lsa0/c;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    check-cast v0, Lcom/revolut/revolutpay/ui/picker/g;

    .line 73
    .line 74
    if-eqz v0, :cond_4

    .line 75
    .line 76
    .line 77
    invoke-interface {v0, p1}, Lcom/revolut/revolutpay/ui/picker/g;->a(Ljava/util/List;)V

    .line 78
    :cond_4
    return-void
    .line 79
    .line 80
    .line 81
.end method

.method public final i()V
    .locals 12

    .line 1
    .line 2
    iget-object v0, p0, Lcom/revolut/revolutpay/ui/picker/d;->c:Lma0/a;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lma0/a;->a()Ljava/util/List;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/revolut/revolutpay/ui/picker/d;->d:Lcom/revolut/revolutpay/ui/picker/f;

    .line 9
    .line 10
    new-instance v2, Ljava/util/ArrayList;

    .line 11
    .line 12
    const/16 v3, 0xa

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 16
    move-result v3

    .line 17
    .line 18
    .line 19
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    move-result v3

    .line 28
    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    move-result-object v3

    .line 34
    .line 35
    check-cast v3, Lcom/revolut/revolutpay/ui/picker/model/a;

    .line 36
    .line 37
    new-instance v4, Lcom/revolut/revolutpay/ui_kit/delegate/a$b;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3}, Lcom/revolut/revolutpay/ui/picker/model/a;->d()Ljava/lang/String;

    .line 41
    move-result-object v5

    .line 42
    .line 43
    new-instance v6, Lxa0/f;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Lcom/revolut/revolutpay/ui/picker/model/a;->g()Ljava/lang/String;

    .line 47
    move-result-object v7

    .line 48
    const/4 v8, 0x0

    .line 49
    const/4 v9, 0x2

    .line 50
    .line 51
    .line 52
    invoke-direct {v6, v7, v8, v9, v8}, Lxa0/f;-><init>(Ljava/lang/String;Lcom/revolut/revolutpay/ui_kit/model/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 53
    .line 54
    new-instance v7, Lxa0/f;

    .line 55
    .line 56
    new-instance v10, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    const/16 v11, 0x2b

    .line 62
    .line 63
    .line 64
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3}, Lcom/revolut/revolutpay/ui/picker/model/a;->f()Ljava/lang/String;

    .line 68
    move-result-object v11

    .line 69
    .line 70
    .line 71
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    move-result-object v10

    .line 76
    .line 77
    .line 78
    invoke-direct {v7, v10, v8, v9, v8}, Lxa0/f;-><init>(Ljava/lang/String;Lcom/revolut/revolutpay/ui_kit/model/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 79
    .line 80
    new-instance v8, Lcom/revolut/revolutpay/ui_kit/delegate/a$a$b;

    .line 81
    .line 82
    new-instance v9, Lxa0/b;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3}, Lcom/revolut/revolutpay/ui/picker/model/a;->d()Ljava/lang/String;

    .line 86
    move-result-object v3

    .line 87
    .line 88
    .line 89
    invoke-direct {v9, v3}, Lxa0/b;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-direct {v8, v9}, Lcom/revolut/revolutpay/ui_kit/delegate/a$a$b;-><init>(Lxa0/c;)V

    .line 93
    .line 94
    const/16 v10, 0x10

    .line 95
    const/4 v11, 0x0

    .line 96
    const/4 v9, 0x0

    .line 97
    .line 98
    .line 99
    invoke-direct/range {v4 .. v11}, Lcom/revolut/revolutpay/ui_kit/delegate/a$b;-><init>(Ljava/lang/String;Lxa0/a;Lxa0/a;Lcom/revolut/revolutpay/ui_kit/delegate/a$a;Lxa0/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 100
    .line 101
    .line 102
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 103
    goto :goto_0

    .line 104
    .line 105
    .line 106
    :cond_0
    invoke-virtual {v1, v2}, Lcom/revolut/revolutpay/ui/picker/f;->b(Ljava/util/List;)V

    .line 107
    return-void
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
.end method
