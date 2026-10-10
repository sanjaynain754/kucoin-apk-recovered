.class public Lorg/jsoup/select/a;
.super Ljava/lang/Object;
.source "Collector.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jsoup/select/a$a;,
        Lorg/jsoup/select/a$b;
    }
.end annotation


# direct methods
.method public static a(Lorg/jsoup/select/c;Lorg/jsoup/nodes/Element;)Lorg/jsoup/select/Elements;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lorg/jsoup/select/Elements;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lorg/jsoup/select/Elements;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lorg/jsoup/select/a$a;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p1, v0, p0}, Lorg/jsoup/select/a$a;-><init>(Lorg/jsoup/nodes/Element;Lorg/jsoup/select/Elements;Lorg/jsoup/select/c;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v1, p1}, Lorg/jsoup/select/d;->c(Lqh0/a;Lorg/jsoup/nodes/g;)V

    .line 14
    return-object v0
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
.end method

.method public static b(Lorg/jsoup/select/c;Lorg/jsoup/nodes/Element;)Lorg/jsoup/nodes/Element;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lorg/jsoup/select/a$b;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1, p0}, Lorg/jsoup/select/a$b;-><init>(Lorg/jsoup/nodes/Element;Lorg/jsoup/select/c;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, p1}, Lorg/jsoup/select/d;->a(Lorg/jsoup/select/NodeFilter;Lorg/jsoup/nodes/g;)Lorg/jsoup/select/NodeFilter$FilterResult;

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lorg/jsoup/select/a$b;->c(Lorg/jsoup/select/a$b;)Lorg/jsoup/nodes/Element;

    .line 12
    move-result-object p0

    .line 13
    return-object p0
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
.end method
