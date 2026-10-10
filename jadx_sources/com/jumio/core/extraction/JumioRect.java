package com.jumio.core.extraction;

import android.graphics.RectF;
import com.facebook.react.uimanager.ViewProps;
import java.io.Serializable;
import jumio.core.AbstractC40653e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0012\u001a\u00020\u0003J\u0006\u0010\u0013\u001a\u00020\u0003J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J1\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\n¨\u0006("}, m90084d2 = {"Lcom/jumio/core/extraction/JumioRect;", "Ljava/io/Serializable;", "left", "", ViewProps.TOP, "right", ViewProps.BOTTOM, "<init>", "(IIII)V", "getLeft", "()I", "getTop", "getRight", "getBottom", "centerX", "getCenterX", "centerY", "getCenterY", "height", "width", "toRectF", "Landroid/graphics/RectF;", "toJson", "Lorg/json/JSONObject;", "isEmpty", "", "contains", "x", "y", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class JumioRect implements Serializable {

    /* JADX INFO: renamed from: a */
    public final int f13885a;

    /* JADX INFO: renamed from: b */
    public final int f13886b;

    /* JADX INFO: renamed from: c */
    public final int f13887c;

    /* JADX INFO: renamed from: d */
    public final int f13888d;

    /* JADX INFO: renamed from: e */
    public final int f13889e;

    /* JADX INFO: renamed from: f */
    public final int f13890f;

    public JumioRect() {
        this(0, 0, 0, 0, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JumioRect)) {
            return false;
        }
        JumioRect jumioRect = (JumioRect) other;
        return this.f13885a == jumioRect.f13885a && this.f13886b == jumioRect.f13886b && this.f13887c == jumioRect.f13887c && this.f13888d == jumioRect.f13888d;
    }

    public JumioRect(int i11, int i12, int i13, int i14) {
        this.f13885a = i11;
        this.f13886b = i12;
        this.f13887c = i13;
        this.f13888d = i14;
        this.f13889e = (i11 + i13) >> 1;
        this.f13890f = (i12 + i14) >> 1;
    }

    public static /* synthetic */ JumioRect copy$default(JumioRect jumioRect, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = jumioRect.f13885a;
        }
        if ((i15 & 2) != 0) {
            i12 = jumioRect.f13886b;
        }
        if ((i15 & 4) != 0) {
            i13 = jumioRect.f13887c;
        }
        if ((i15 & 8) != 0) {
            i14 = jumioRect.f13888d;
        }
        return jumioRect.copy(i11, i12, i13, i14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getF13885a() {
        return this.f13885a;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getF13886b() {
        return this.f13886b;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getF13887c() {
        return this.f13887c;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getF13888d() {
        return this.f13888d;
    }

    @NotNull
    public final JumioRect copy(int left, int top, int right, int bottom) {
        return new JumioRect(left, top, right, bottom);
    }

    public final int getBottom() {
        return this.f13888d;
    }

    /* JADX INFO: renamed from: getCenterX, reason: from getter */
    public final int getF13889e() {
        return this.f13889e;
    }

    /* JADX INFO: renamed from: getCenterY, reason: from getter */
    public final int getF13890f() {
        return this.f13890f;
    }

    public final int getLeft() {
        return this.f13885a;
    }

    public final int getRight() {
        return this.f13887c;
    }

    public final int getTop() {
        return this.f13886b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f13888d) + AbstractC40653e0.m89252a(this.f13887c, AbstractC40653e0.m89252a(this.f13886b, Integer.hashCode(this.f13885a) * 31, 31), 31);
    }

    public final int height() {
        return this.f13888d - this.f13886b;
    }

    public final boolean isEmpty() {
        return this.f13885a == 0 && this.f13886b == 0 && this.f13887c == 0 && this.f13888d == 0;
    }

    @NotNull
    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("left", this.f13885a).put("right", this.f13887c).put(ViewProps.TOP, this.f13886b).put(ViewProps.BOTTOM, this.f13888d);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    @NotNull
    public final RectF toRectF() {
        return new RectF(this.f13885a, this.f13886b, this.f13887c, this.f13888d);
    }

    @NotNull
    public String toString() {
        return "JumioRect(left=" + this.f13885a + ", top=" + this.f13886b + ", right=" + this.f13887c + ", bottom=" + this.f13888d + ')';
    }

    public final int width() {
        return this.f13887c - this.f13885a;
    }

    public final boolean contains(int x11, int y11) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (!isEmpty() && (i11 = this.f13885a) < (i12 = this.f13887c) && (i13 = this.f13886b) < (i14 = this.f13888d) && x11 >= i11 && x11 < i12 && y11 >= i13 && y11 < i14) {
            return true;
        }
        return false;
    }

    public /* synthetic */ JumioRect(int i11, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 0 : i11, (i15 & 2) != 0 ? 0 : i12, (i15 & 4) != 0 ? 0 : i13, (i15 & 8) != 0 ? 0 : i14);
    }
}
