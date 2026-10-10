.class public final Lorg/jsoup/nodes/h;
.super Ljava/lang/Object;
.source "NodeUtils.java"


# direct methods
.method public static a(Lorg/jsoup/nodes/g;)Lorg/jsoup/nodes/Document$OutputSettings;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/jsoup/nodes/g;->G()Lorg/jsoup/nodes/Document;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lorg/jsoup/nodes/Document;->s1()Lorg/jsoup/nodes/Document$OutputSettings;

    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    .line 13
    :cond_0
    new-instance p0, Lorg/jsoup/nodes/Document;

    .line 14
    .line 15
    const-string v0, ""

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, v0}, Lorg/jsoup/nodes/Document;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lorg/jsoup/nodes/Document;->s1()Lorg/jsoup/nodes/Document$OutputSettings;

    .line 22
    move-result-object p0

    .line 23
    return-object p0
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public static b(Lorg/jsoup/nodes/g;)Lorg/jsoup/parser/e;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/jsoup/nodes/g;->G()Lorg/jsoup/nodes/Document;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lorg/jsoup/nodes/Document;->u1()Lorg/jsoup/parser/e;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lorg/jsoup/nodes/Document;->u1()Lorg/jsoup/parser/e;

    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    .line 19
    :cond_0
    new-instance p0, Lorg/jsoup/parser/e;

    .line 20
    .line 21
    new-instance v0, Lorg/jsoup/parser/b;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0}, Lorg/jsoup/parser/b;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0, v0}, Lorg/jsoup/parser/e;-><init>(Lorg/jsoup/parser/i;)V

    .line 28
    return-object p0
    .line 29
    .line 30
.end method
