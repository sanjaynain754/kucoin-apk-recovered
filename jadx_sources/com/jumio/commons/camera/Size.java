package com.jumio.commons.camera;

import android.graphics.Rect;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0000J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, m90084d2 = {"Lcom/jumio/commons/camera/Size;", "Ljava/io/Serializable;", "width", "", "height", "<init>", "(II)V", "getWidth", "()I", "setWidth", "(I)V", "getHeight", "setHeight", "isEmpty", "", "()Z", "isPortrait", "ratio", "", "getRatio", "()F", "toString", "", "toRect", "Landroid/graphics/Rect;", "flip", "component1", "component2", "copy", "equals", "other", "", "hashCode", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class Size implements Serializable {

    /* JADX INFO: renamed from: a */
    public int f13561a;

    /* JADX INFO: renamed from: b */
    public int f13562b;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Size)) {
            return false;
        }
        Size size = (Size) other;
        return this.f13561a == size.f13561a && this.f13562b == size.f13562b;
    }

    public static /* synthetic */ Size copy$default(Size size, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = size.f13561a;
        }
        if ((i13 & 2) != 0) {
            i12 = size.f13562b;
        }
        return size.copy(i11, i12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getF13561a() {
        return this.f13561a;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getF13562b() {
        return this.f13562b;
    }

    @NotNull
    public final Size copy(int width, int height) {
        return new Size(width, height);
    }

    @NotNull
    public final Size flip() {
        return new Size(this.f13562b, this.f13561a);
    }

    public final int getHeight() {
        return this.f13562b;
    }

    public final float getRatio() {
        return this.f13561a / this.f13562b;
    }

    public final int getWidth() {
        return this.f13561a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f13562b) + (Integer.hashCode(this.f13561a) * 31);
    }

    public final boolean isEmpty() {
        return this.f13561a == 0 && this.f13562b == 0;
    }

    public final boolean isPortrait() {
        return this.f13561a <= this.f13562b;
    }

    public final void setHeight(int i11) {
        this.f13562b = i11;
    }

    public final void setWidth(int i11) {
        this.f13561a = i11;
    }

    @NotNull
    public final Rect toRect() {
        return new Rect(0, 0, this.f13561a, this.f13562b);
    }

    @NotNull
    public String toString() {
        return "Size(width=" + this.f13561a + ", height=" + this.f13562b + ')';
    }

    public Size(int i11, int i12) {
        this.f13561a = i11;
        this.f13562b = i12;
    }
}
