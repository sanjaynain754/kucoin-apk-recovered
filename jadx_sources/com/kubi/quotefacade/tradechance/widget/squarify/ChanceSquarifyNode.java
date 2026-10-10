package com.kubi.quotefacade.tradechance.widget.squarify;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.quotefacade.tradechance.widget.squarify.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ChanceSquarifyNode.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000eR\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00000\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012R\u001a\u0010#\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010\u000eR\u001a\u0010&\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\f\"\u0004\b(\u0010\u000eR\u001a\u0010)\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\f\"\u0004\b+\u0010\u000eR\u001a\u0010,\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\f\"\u0004\b.\u0010\u000eR\u0011\u0010/\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00063"}, m90084d2 = {"Lcom/kubi/quotefacade/tradechance/widget/squarify/ChanceSquarifyNode;", "", "nodeValue", "", "avgChangeRate", "texts", "", "", "tagId", "<init>", "(DDLjava/util/List;Ljava/lang/String;)V", "getAvgChangeRate", "()D", "setAvgChangeRate", "(D)V", "getTexts", "()Ljava/util/List;", "setTexts", "(Ljava/util/List;)V", "getTagId", "()Ljava/lang/String;", "setTagId", "(Ljava/lang/String;)V", "value", "getValue", "setValue", "dice", "", "getDice", "()Z", "setDice", "(Z)V", "children", "getChildren", "setChildren", "x0", "getX0", "setX0", "y0", "getY0", "setY0", "x1", "getX1", "setX1", "y1", "getY1", "setY1", "rect", "Landroid/graphics/Rect;", "getRect", "()Landroid/graphics/Rect;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ChanceSquarifyNode {

    /* JADX INFO: renamed from: a */
    public double f42725a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public List<String> f42726b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public String f42727c;

    /* JADX INFO: renamed from: d */
    public double f42728d;

    /* JADX INFO: renamed from: e */
    public boolean f42729e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public List<ChanceSquarifyNode> f42730f;

    /* JADX INFO: renamed from: g */
    public double f42731g;

    /* JADX INFO: renamed from: h */
    public double f42732h;

    /* JADX INFO: renamed from: i */
    public double f42733i;

    /* JADX INFO: renamed from: j */
    public double f42734j;

    public ChanceSquarifyNode(double d11, double d12, @NotNull List<String> texts, @NotNull String tagId) {
        Intrinsics.checkNotNullParameter(texts, "texts");
        Intrinsics.checkNotNullParameter(tagId, "tagId");
        this.f42725a = d12;
        this.f42726b = texts;
        this.f42727c = tagId;
        this.f42728d = d11;
        this.f42730f = new ArrayList();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getF42725a() {
        return this.f42725a;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<ChanceSquarifyNode> m53292b() {
        return this.f42730f;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getF42729e() {
        return this.f42729e;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Rect m53294d() {
        return new Rect((int) this.f42731g, (int) this.f42732h, (int) this.f42733i, (int) this.f42734j);
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getF42727c() {
        return this.f42727c;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final List<String> m53296f() {
        return this.f42726b;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final double getF42728d() {
        return this.f42728d;
    }

    /* JADX INFO: renamed from: h */
    public final void m53298h(@NotNull List<ChanceSquarifyNode> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f42730f = list;
    }

    /* JADX INFO: renamed from: i */
    public final void m53299i(boolean z11) {
        this.f42729e = z11;
    }

    /* JADX INFO: renamed from: j */
    public final void m53300j(double d11) {
        this.f42728d = d11;
    }

    /* JADX INFO: renamed from: k */
    public final void m53301k(double d11) {
        this.f42731g = d11;
    }

    /* JADX INFO: renamed from: l */
    public final void m53302l(double d11) {
        this.f42733i = d11;
    }

    /* JADX INFO: renamed from: m */
    public final void m53303m(double d11) {
        this.f42732h = d11;
    }

    /* JADX INFO: renamed from: n */
    public final void m53304n(double d11) {
        this.f42734j = d11;
    }

    public /* synthetic */ ChanceSquarifyNode(double d11, double d12, List list, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(d11, (i11 & 2) != 0 ? 0.0d : d12, (i11 & 4) != 0 ? new ArrayList() : list, (i11 & 8) != 0 ? "" : str);
    }
}
