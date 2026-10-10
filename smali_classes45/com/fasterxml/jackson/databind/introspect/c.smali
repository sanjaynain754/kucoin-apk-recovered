.class public final Lcom/fasterxml/jackson/databind/introspect/c;
.super Lcom/fasterxml/jackson/databind/introspect/a;
.source "AnnotatedClass.java"

# interfaces
.implements Lcom/fasterxml/jackson/databind/introspect/t;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/databind/introspect/c$a;
    }
.end annotation


# static fields
.field public static final p:Lcom/fasterxml/jackson/databind/introspect/c$a;


# instance fields
.field public final b:Lcom/fasterxml/jackson/databind/JavaType;

.field public final c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final d:Lcom/fasterxml/jackson/databind/type/TypeBindings;

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

.field public final g:Lcom/fasterxml/jackson/databind/type/TypeFactory;

.field public final h:Lcom/fasterxml/jackson/databind/introspect/l$a;

.field public final i:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final j:Z

.field public final k:Lcom/fasterxml/jackson/databind/util/a;

.field public l:Lcom/fasterxml/jackson/databind/introspect/c$a;

.field public m:Lcom/fasterxml/jackson/databind/introspect/h;

.field public n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;",
            ">;"
        }
    .end annotation
.end field

.field public transient o:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/fasterxml/jackson/databind/introspect/c$a;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v2}, Lcom/fasterxml/jackson/databind/introspect/c$a;-><init>(Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;Ljava/util/List;Ljava/util/List;)V

    .line 9
    .line 10
    sput-object v0, Lcom/fasterxml/jackson/databind/introspect/c;->p:Lcom/fasterxml/jackson/databind/introspect/c$a;

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

.method public constructor <init>(Lcom/fasterxml/jackson/databind/JavaType;Ljava/lang/Class;Ljava/util/List;Ljava/lang/Class;Lcom/fasterxml/jackson/databind/util/a;Lcom/fasterxml/jackson/databind/type/TypeBindings;Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Lcom/fasterxml/jackson/databind/introspect/l$a;Lcom/fasterxml/jackson/databind/type/TypeFactory;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/util/List<",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            ">;",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/util/a;",
            "Lcom/fasterxml/jackson/databind/type/TypeBindings;",
            "Lcom/fasterxml/jackson/databind/AnnotationIntrospector;",
            "Lcom/fasterxml/jackson/databind/introspect/l$a;",
            "Lcom/fasterxml/jackson/databind/type/TypeFactory;",
            "Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/introspect/a;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/introspect/c;->b:Lcom/fasterxml/jackson/databind/JavaType;

    .line 3
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/introspect/c;->c:Ljava/lang/Class;

    .line 4
    iput-object p3, p0, Lcom/fasterxml/jackson/databind/introspect/c;->e:Ljava/util/List;

    .line 5
    iput-object p4, p0, Lcom/fasterxml/jackson/databind/introspect/c;->i:Ljava/lang/Class;

    .line 6
    iput-object p5, p0, Lcom/fasterxml/jackson/databind/introspect/c;->k:Lcom/fasterxml/jackson/databind/util/a;

    .line 7
    iput-object p6, p0, Lcom/fasterxml/jackson/databind/introspect/c;->d:Lcom/fasterxml/jackson/databind/type/TypeBindings;

    .line 8
    iput-object p7, p0, Lcom/fasterxml/jackson/databind/introspect/c;->f:Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    .line 9
    iput-object p8, p0, Lcom/fasterxml/jackson/databind/introspect/c;->h:Lcom/fasterxml/jackson/databind/introspect/l$a;

    .line 10
    iput-object p9, p0, Lcom/fasterxml/jackson/databind/introspect/c;->g:Lcom/fasterxml/jackson/databind/type/TypeFactory;

    .line 11
    iput-boolean p10, p0, Lcom/fasterxml/jackson/databind/introspect/c;->j:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 12
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/introspect/a;-><init>()V

    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/c;->b:Lcom/fasterxml/jackson/databind/JavaType;

    .line 14
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/introspect/c;->c:Ljava/lang/Class;

    .line 15
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/introspect/c;->e:Ljava/util/List;

    .line 16
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/c;->i:Ljava/lang/Class;

    .line 17
    invoke-static {}, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector;->d()Lcom/fasterxml/jackson/databind/util/a;

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/introspect/c;->k:Lcom/fasterxml/jackson/databind/util/a;

    .line 18
    invoke-static {}, Lcom/fasterxml/jackson/databind/type/TypeBindings;->emptyBindings()Lcom/fasterxml/jackson/databind/type/TypeBindings;

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/introspect/c;->d:Lcom/fasterxml/jackson/databind/type/TypeBindings;

    .line 19
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/c;->f:Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    .line 20
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/c;->h:Lcom/fasterxml/jackson/databind/introspect/l$a;

    .line 21
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/c;->g:Lcom/fasterxml/jackson/databind/type/TypeFactory;

    const/4 p1, 0x0

    .line 22
    iput-boolean p1, p0, Lcom/fasterxml/jackson/databind/introspect/c;->j:Z

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/reflect/Type;)Lcom/fasterxml/jackson/databind/JavaType;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/c;->g:Lcom/fasterxml/jackson/databind/type/TypeFactory;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/introspect/c;->d:Lcom/fasterxml/jackson/databind/type/TypeBindings;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1, v1}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->resolveMemberType(Ljava/lang/reflect/Type;Lcom/fasterxml/jackson/databind/type/TypeBindings;)Lcom/fasterxml/jackson/databind/JavaType;

    .line 8
    move-result-object p1

    .line 9
    return-object p1
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
    .line 22
    .line 23
.end method

.method public annotations()Ljava/lang/Iterable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable<",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/c;->k:Lcom/fasterxml/jackson/databind/util/a;

    .line 3
    .line 4
    instance-of v1, v0, Lcom/fasterxml/jackson/databind/introspect/i;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    check-cast v0, Lcom/fasterxml/jackson/databind/introspect/i;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/introspect/i;->c()Ljava/lang/Iterable;

    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    .line 15
    :cond_0
    instance-of v1, v0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$OneAnnotation;

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    instance-of v0, v0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$TwoAnnotations;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 24
    return-object v0

    .line 25
    .line 26
    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 27
    .line 28
    .line 29
    const-string/jumbo v1, "please use getAnnotations/ hasAnnotation to check for Annotations"

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 33
    throw v0
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

.method public final b()Lcom/fasterxml/jackson/databind/introspect/c$a;
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/c;->l:Lcom/fasterxml/jackson/databind/introspect/c$a;

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object v4, p0, Lcom/fasterxml/jackson/databind/introspect/c;->b:Lcom/fasterxml/jackson/databind/JavaType;

    .line 7
    .line 8
    if-nez v4, :cond_0

    .line 9
    .line 10
    sget-object v0, Lcom/fasterxml/jackson/databind/introspect/c;->p:Lcom/fasterxml/jackson/databind/introspect/c$a;

    .line 11
    move-object v3, p0

    .line 12
    goto :goto_0

    .line 13
    .line 14
    :cond_0
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/introspect/c;->f:Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    .line 15
    .line 16
    iget-object v2, p0, Lcom/fasterxml/jackson/databind/introspect/c;->g:Lcom/fasterxml/jackson/databind/type/TypeFactory;

    .line 17
    .line 18
    iget-object v5, p0, Lcom/fasterxml/jackson/databind/introspect/c;->i:Ljava/lang/Class;

    .line 19
    .line 20
    iget-boolean v6, p0, Lcom/fasterxml/jackson/databind/introspect/c;->j:Z

    .line 21
    move-object v3, p0

    .line 22
    .line 23
    .line 24
    invoke-static/range {v1 .. v6}, Lcom/fasterxml/jackson/databind/introspect/e;->p(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Lcom/fasterxml/jackson/databind/type/TypeFactory;Lcom/fasterxml/jackson/databind/introspect/t;Lcom/fasterxml/jackson/databind/JavaType;Ljava/lang/Class;Z)Lcom/fasterxml/jackson/databind/introspect/c$a;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    :goto_0
    iput-object v0, v3, Lcom/fasterxml/jackson/databind/introspect/c;->l:Lcom/fasterxml/jackson/databind/introspect/c$a;

    .line 28
    return-object v0

    .line 29
    :cond_1
    move-object v3, p0

    .line 30
    return-object v0
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

.method public final c()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/c;->n:Ljava/util/List;

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object v5, p0, Lcom/fasterxml/jackson/databind/introspect/c;->b:Lcom/fasterxml/jackson/databind/JavaType;

    .line 7
    .line 8
    if-nez v5, :cond_0

    .line 9
    .line 10
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 11
    move-object v2, p0

    .line 12
    goto :goto_0

    .line 13
    .line 14
    :cond_0
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/introspect/c;->f:Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    .line 15
    .line 16
    iget-object v3, p0, Lcom/fasterxml/jackson/databind/introspect/c;->h:Lcom/fasterxml/jackson/databind/introspect/l$a;

    .line 17
    .line 18
    iget-object v4, p0, Lcom/fasterxml/jackson/databind/introspect/c;->g:Lcom/fasterxml/jackson/databind/type/TypeFactory;

    .line 19
    .line 20
    iget-boolean v6, p0, Lcom/fasterxml/jackson/databind/introspect/c;->j:Z

    .line 21
    move-object v2, p0

    .line 22
    .line 23
    .line 24
    invoke-static/range {v1 .. v6}, Lcom/fasterxml/jackson/databind/introspect/f;->m(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Lcom/fasterxml/jackson/databind/introspect/t;Lcom/fasterxml/jackson/databind/introspect/l$a;Lcom/fasterxml/jackson/databind/type/TypeFactory;Lcom/fasterxml/jackson/databind/JavaType;Z)Ljava/util/List;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    :goto_0
    iput-object v0, v2, Lcom/fasterxml/jackson/databind/introspect/c;->n:Ljava/util/List;

    .line 28
    return-object v0

    .line 29
    :cond_1
    move-object v2, p0

    .line 30
    return-object v0
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

.method public final d()Lcom/fasterxml/jackson/databind/introspect/h;
    .locals 9

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/c;->m:Lcom/fasterxml/jackson/databind/introspect/h;

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object v5, p0, Lcom/fasterxml/jackson/databind/introspect/c;->b:Lcom/fasterxml/jackson/databind/JavaType;

    .line 7
    .line 8
    if-nez v5, :cond_0

    .line 9
    .line 10
    new-instance v0, Lcom/fasterxml/jackson/databind/introspect/h;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/introspect/h;-><init>()V

    .line 14
    move-object v2, p0

    .line 15
    goto :goto_0

    .line 16
    .line 17
    :cond_0
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/introspect/c;->f:Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    .line 18
    .line 19
    iget-object v3, p0, Lcom/fasterxml/jackson/databind/introspect/c;->h:Lcom/fasterxml/jackson/databind/introspect/l$a;

    .line 20
    .line 21
    iget-object v4, p0, Lcom/fasterxml/jackson/databind/introspect/c;->g:Lcom/fasterxml/jackson/databind/type/TypeFactory;

    .line 22
    .line 23
    iget-object v6, p0, Lcom/fasterxml/jackson/databind/introspect/c;->e:Ljava/util/List;

    .line 24
    .line 25
    iget-object v7, p0, Lcom/fasterxml/jackson/databind/introspect/c;->i:Ljava/lang/Class;

    .line 26
    .line 27
    iget-boolean v8, p0, Lcom/fasterxml/jackson/databind/introspect/c;->j:Z

    .line 28
    move-object v2, p0

    .line 29
    .line 30
    .line 31
    invoke-static/range {v1 .. v8}, Lcom/fasterxml/jackson/databind/introspect/g;->m(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Lcom/fasterxml/jackson/databind/introspect/t;Lcom/fasterxml/jackson/databind/introspect/l$a;Lcom/fasterxml/jackson/databind/type/TypeFactory;Lcom/fasterxml/jackson/databind/JavaType;Ljava/util/List;Ljava/lang/Class;Z)Lcom/fasterxml/jackson/databind/introspect/h;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    :goto_0
    iput-object v0, v2, Lcom/fasterxml/jackson/databind/introspect/c;->m:Lcom/fasterxml/jackson/databind/introspect/h;

    .line 35
    return-object v0

    .line 36
    :cond_1
    move-object v2, p0

    .line 37
    return-object v0
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

.method public e()Ljava/lang/Iterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable<",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/c;->c()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ne p1, p0, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    :cond_0
    const-class v1, Lcom/fasterxml/jackson/databind/introspect/c;

    .line 7
    .line 8
    .line 9
    invoke-static {p1, v1}, Lcom/fasterxml/jackson/databind/util/g;->H(Ljava/lang/Object;Ljava/lang/Class;)Z

    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    return v2

    .line 15
    .line 16
    :cond_1
    check-cast p1, Lcom/fasterxml/jackson/databind/introspect/c;

    .line 17
    .line 18
    iget-object p1, p1, Lcom/fasterxml/jackson/databind/introspect/c;->c:Ljava/lang/Class;

    .line 19
    .line 20
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/introspect/c;->c:Ljava/lang/Class;

    .line 21
    .line 22
    if-ne p1, v1, :cond_2

    .line 23
    return v0

    .line 24
    :cond_2
    return v2
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
    .line 76
    .line 77
    .line 78
.end method

.method public f(Ljava/lang/String;[Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/c;->d()Lcom/fasterxml/jackson/databind/introspect/h;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Lcom/fasterxml/jackson/databind/introspect/h;->a(Ljava/lang/String;[Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;

    .line 8
    move-result-object p1

    .line 9
    return-object p1
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
.end method

.method public g()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/c;->c:Ljava/lang/Class;

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

.method public bridge synthetic getAnnotated()Ljava/lang/reflect/AnnotatedElement;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/c;->g()Ljava/lang/Class;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TA;>;)TA;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/c;->k:Lcom/fasterxml/jackson/databind/util/a;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/fasterxml/jackson/databind/util/a;->get(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
    .line 22
    .line 23
.end method

.method public getModifiers()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/c;->c:Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getModifiers()I

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/c;->c:Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public getRawType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/c;->c:Ljava/lang/Class;

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

.method public getType()Lcom/fasterxml/jackson/databind/JavaType;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/c;->b:Lcom/fasterxml/jackson/databind/JavaType;

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

.method public h()Lcom/fasterxml/jackson/databind/util/a;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/c;->k:Lcom/fasterxml/jackson/databind/util/a;

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

.method public hasAnnotation(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/c;->k:Lcom/fasterxml/jackson/databind/util/a;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/fasterxml/jackson/databind/util/a;->has(Ljava/lang/Class;)Z

    .line 6
    move-result p1

    .line 7
    return p1
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
    .line 22
    .line 23
.end method

.method public hasOneOf([Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/annotation/Annotation;",
            ">;)Z"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/c;->k:Lcom/fasterxml/jackson/databind/util/a;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/fasterxml/jackson/databind/util/a;->hasOneOf([Ljava/lang/Class;)Z

    .line 6
    move-result p1

    .line 7
    return p1
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
    .line 22
    .line 23
.end method

.method public hashCode()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/c;->c:Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 10
    move-result v0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public i()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/c;->b()Lcom/fasterxml/jackson/databind/introspect/c$a;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v0, v0, Lcom/fasterxml/jackson/databind/introspect/c$a;->b:Ljava/util/List;

    .line 7
    return-object v0
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

.method public j()Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/c;->b()Lcom/fasterxml/jackson/databind/introspect/c$a;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v0, v0, Lcom/fasterxml/jackson/databind/introspect/c$a;->a:Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;

    .line 7
    return-object v0
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

.method public k()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/c;->b()Lcom/fasterxml/jackson/databind/introspect/c$a;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v0, v0, Lcom/fasterxml/jackson/databind/introspect/c$a;->c:Ljava/util/List;

    .line 7
    return-object v0
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

.method public l()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/c;->k:Lcom/fasterxml/jackson/databind/util/a;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/fasterxml/jackson/databind/util/a;->size()I

    .line 6
    move-result v0

    .line 7
    .line 8
    if-lez v0, :cond_0

    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public m()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/c;->o:Ljava/lang/Boolean;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/c;->c:Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lcom/fasterxml/jackson/databind/util/g;->Q(Ljava/lang/Class;)Z

    .line 10
    move-result v0

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/c;->o:Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    move-result v0

    .line 21
    return v0
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

.method public n()Ljava/lang/Iterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable<",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/c;->d()Lcom/fasterxml/jackson/databind/introspect/h;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "[AnnotedClass "

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/introspect/c;->c:Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v1, "]"

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    move-result-object v0

    .line 29
    return-object v0
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
