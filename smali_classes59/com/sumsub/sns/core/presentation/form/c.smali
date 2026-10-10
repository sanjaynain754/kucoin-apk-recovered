.class public final Lcom/sumsub/sns/core/presentation/form/c;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/core/presentation/form/a;


# instance fields
.field public final synthetic a:Lcom/sumsub/sns/core/presentation/form/f;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/core/presentation/form/f;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/core/presentation/form/c;->a:Lcom/sumsub/sns/core/presentation/form/f;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    return-void
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
    .line 22
    .line 23
    .line 24
    .line 25
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)V
    .locals 6

    .line 32
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    iget-object v1, p0, Lcom/sumsub/sns/core/presentation/form/c;->a:Lcom/sumsub/sns/core/presentation/form/f;

    sget-object v2, Lcom/sumsub/sns/core/presentation/form/f;->o:Lcom/sumsub/sns/core/presentation/form/b;

    .line 33
    invoke-virtual {v1}, Lcom/sumsub/sns/core/presentation/form/f;->c()Ljava/lang/String;

    move-result-object v1

    .line 34
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "onFieldClick: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 35
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/form/c;->a:Lcom/sumsub/sns/core/presentation/form/f;

    .line 36
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/form/f;->a()Lcom/sumsub/sns/internal/core/presentation/form/k;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 37
    invoke-interface {v0, p1}, Lcom/sumsub/sns/internal/core/presentation/form/k;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)V

    :cond_0
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Landroid/view/View;)V
    .locals 6

    .line 12
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/form/c;->a:Lcom/sumsub/sns/core/presentation/form/f;

    sget-object v1, Lcom/sumsub/sns/core/presentation/form/f;->o:Lcom/sumsub/sns/core/presentation/form/b;

    .line 13
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    move-result-object v0

    .line 14
    instance-of v1, v0, Lcom/sumsub/sns/core/presentation/form/h;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/sumsub/sns/core/presentation/form/h;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 15
    invoke-interface {v0, p1, p2}, Lcom/sumsub/sns/core/presentation/form/h;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Landroid/view/View;)V

    return-void

    .line 16
    :cond_1
    invoke-static {p1}, Lcom/sumsub/sns/core/presentation/form/model/b;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Lcom/sumsub/sns/internal/core/presentation/form/FieldId;

    move-result-object p1

    .line 17
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    iget-object p2, p0, Lcom/sumsub/sns/core/presentation/form/c;->a:Lcom/sumsub/sns/core/presentation/form/f;

    .line 18
    invoke-virtual {p2}, Lcom/sumsub/sns/core/presentation/form/f;->c()Ljava/lang/String;

    move-result-object v1

    .line 19
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "onPickFileClick: "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 20
    sget-boolean p2, Lcom/sumsub/sns/internal/core/common/k0;->f:Z

    .line 21
    invoke-static {p2}, Lcom/sumsub/sns/internal/core/common/J;->a(Z)Lxg0/a;

    move-result-object p2

    .line 22
    invoke-interface {p2}, Ltg0/n;->getSerializersModule()Lyg0/a;

    sget-object v0, Lcom/sumsub/sns/internal/core/presentation/form/FieldId;->Companion:Lcom/sumsub/sns/internal/core/presentation/form/b;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/form/b;->serializer()Ltg0/d;

    move-result-object v0

    check-cast v0, Ltg0/p;

    invoke-interface {p2, v0, p1}, Ltg0/c0;->b(Ltg0/p;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 23
    iget-object p2, p0, Lcom/sumsub/sns/core/presentation/form/c;->a:Lcom/sumsub/sns/core/presentation/form/f;

    .line 24
    iget-object p2, p2, Lcom/sumsub/sns/core/presentation/form/f;->e:Lcom/sumsub/sns/internal/core/presentation/android/y;

    if-eqz p2, :cond_2

    .line 25
    invoke-virtual {p2, p1}, Lcom/sumsub/sns/internal/core/presentation/android/y;->a(Ljava/lang/String;)Z

    :cond_2
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Ljava/lang/String;)V
    .locals 6

    .line 26
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    iget-object v1, p0, Lcom/sumsub/sns/core/presentation/form/c;->a:Lcom/sumsub/sns/core/presentation/form/f;

    sget-object v2, Lcom/sumsub/sns/core/presentation/form/f;->o:Lcom/sumsub/sns/core/presentation/form/b;

    .line 27
    invoke-virtual {v1}, Lcom/sumsub/sns/core/presentation/form/f;->c()Ljava/lang/String;

    move-result-object v1

    .line 28
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "onDeleteFileClick: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " -> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 29
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/form/c;->a:Lcom/sumsub/sns/core/presentation/form/f;

    .line 30
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/form/f;->a()Lcom/sumsub/sns/internal/core/presentation/form/k;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 31
    invoke-interface {v0, p1, p2}, Lcom/sumsub/sns/internal/core/presentation/form/k;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Ljava/util/List;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/form/c;->a:Lcom/sumsub/sns/core/presentation/form/f;

    .line 2
    iget-boolean v1, v0, Lcom/sumsub/sns/core/presentation/form/f;->k:Z

    if-eqz v1, :cond_0

    return-void

    .line 3
    :cond_0
    instance-of v1, p1, Lcom/sumsub/sns/internal/core/presentation/form/model/E;

    if-eqz v1, :cond_1

    return-void

    .line 4
    :cond_1
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/form/f;->c()Ljava/lang/String;

    move-result-object v3

    .line 6
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->j()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "onValuesChanged: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " -> "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 7
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/form/c;->a:Lcom/sumsub/sns/core/presentation/form/f;

    .line 8
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/form/f;->a()Lcom/sumsub/sns/internal/core/presentation/form/k;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 9
    invoke-interface {v0, p1, p2}, Lcom/sumsub/sns/internal/core/presentation/form/k;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Ljava/util/List;)V

    .line 10
    :cond_2
    iget-object p1, p0, Lcom/sumsub/sns/core/presentation/form/c;->a:Lcom/sumsub/sns/core/presentation/form/f;

    .line 11
    invoke-virtual {p1}, Lcom/sumsub/sns/core/presentation/form/f;->d()V

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/core/presentation/form/model/j;)V
    .locals 6

    .line 38
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    iget-object v1, p0, Lcom/sumsub/sns/core/presentation/form/c;->a:Lcom/sumsub/sns/core/presentation/form/f;

    sget-object v2, Lcom/sumsub/sns/core/presentation/form/f;->o:Lcom/sumsub/sns/core/presentation/form/b;

    .line 39
    invoke-virtual {v1}, Lcom/sumsub/sns/core/presentation/form/f;->c()Ljava/lang/String;

    move-result-object v1

    .line 40
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "onAction: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 41
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/form/c;->a:Lcom/sumsub/sns/core/presentation/form/f;

    .line 42
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/form/f;->a()Lcom/sumsub/sns/internal/core/presentation/form/k;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 43
    invoke-interface {v0, p1}, Lcom/sumsub/sns/internal/core/presentation/form/k;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/j;)V

    :cond_0
    return-void
.end method

.method public final b(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final b(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Ljava/lang/String;)V
    .locals 6

    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    iget-object v1, p0, Lcom/sumsub/sns/core/presentation/form/c;->a:Lcom/sumsub/sns/core/presentation/form/f;

    sget-object v2, Lcom/sumsub/sns/core/presentation/form/f;->o:Lcom/sumsub/sns/core/presentation/form/b;

    .line 3
    invoke-virtual {v1}, Lcom/sumsub/sns/core/presentation/form/f;->c()Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-static {p1}, Lcom/sumsub/sns/core/presentation/form/model/b;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Lcom/sumsub/sns/internal/core/presentation/form/FieldId;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "onLinkClick: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " -> "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 5
    iget-object p1, p0, Lcom/sumsub/sns/core/presentation/form/c;->a:Lcom/sumsub/sns/core/presentation/form/f;

    .line 6
    invoke-virtual {p1}, Lcom/sumsub/sns/core/presentation/form/f;->a()Lcom/sumsub/sns/internal/core/presentation/form/k;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 7
    invoke-interface {p1, p2}, Lcom/sumsub/sns/internal/core/presentation/form/k;->a(Ljava/lang/String;)Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    return-void

    .line 8
    :cond_0
    iget-object p1, p0, Lcom/sumsub/sns/core/presentation/form/c;->a:Lcom/sumsub/sns/core/presentation/form/f;

    invoke-static {p1, p2}, Lcom/sumsub/sns/internal/core/common/F;->a(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    return-void
.end method

.method public final c(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Ljava/lang/String;)V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/form/c;->a:Lcom/sumsub/sns/core/presentation/form/f;

    .line 3
    .line 4
    iget-boolean v1, v0, Lcom/sumsub/sns/core/presentation/form/f;->k:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/form/f;->c()Ljava/lang/String;

    .line 13
    move-result-object v3

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->j()Ljava/lang/String;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string/jumbo v4, "onValueChanged: "

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v0, " -> "

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    move-result-object v4

    .line 44
    const/4 v6, 0x4

    .line 45
    const/4 v7, 0x0

    .line 46
    const/4 v5, 0x0

    .line 47
    .line 48
    .line 49
    invoke-static/range {v2 .. v7}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 50
    .line 51
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/form/c;->a:Lcom/sumsub/sns/core/presentation/form/f;

    .line 52
    .line 53
    iget-object v1, v0, Lcom/sumsub/sns/core/presentation/form/f;->i:Ljava/util/Map;

    .line 54
    .line 55
    .line 56
    invoke-static {p1}, Lcom/sumsub/sns/core/presentation/form/model/b;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Lcom/sumsub/sns/internal/core/presentation/form/FieldId;

    .line 57
    move-result-object v2

    .line 58
    const/4 v3, 0x0

    .line 59
    .line 60
    .line 61
    invoke-static {v1, v2, v3}, Lcom/sumsub/sns/internal/core/common/h;->a(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    .line 62
    move-result-object v1

    .line 63
    .line 64
    iput-object v1, v0, Lcom/sumsub/sns/core/presentation/form/f;->i:Ljava/util/Map;

    .line 65
    .line 66
    instance-of v0, p1, Lcom/sumsub/sns/internal/core/presentation/form/model/E;

    .line 67
    .line 68
    if-eqz v0, :cond_1

    .line 69
    return-void

    .line 70
    .line 71
    :cond_1
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/form/c;->a:Lcom/sumsub/sns/core/presentation/form/f;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/form/f;->a()Lcom/sumsub/sns/internal/core/presentation/form/k;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    .line 80
    invoke-interface {v0, p1, p2}, Lcom/sumsub/sns/internal/core/presentation/form/k;->b(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Ljava/lang/String;)V

    .line 81
    .line 82
    :cond_2
    iget-object p1, p0, Lcom/sumsub/sns/core/presentation/form/c;->a:Lcom/sumsub/sns/core/presentation/form/f;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Lcom/sumsub/sns/core/presentation/form/f;->d()V

    .line 86
    return-void
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
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method
