package com.kubi.kumex.dialog;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kumex.dialog.o2, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: DialogObjects.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÆ\u0003J)\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/kumex/dialog/SelectObject;", "", "display", "", "select", "", "tag", "<init>", "(Ljava/lang/CharSequence;ZLjava/lang/Object;)V", "getDisplay", "()Ljava/lang/CharSequence;", "setDisplay", "(Ljava/lang/CharSequence;)V", "getSelect", "()Z", "setSelect", "(Z)V", "getTag", "()Ljava/lang/Object;", "setTag", "(Ljava/lang/Object;)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SelectObject {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public CharSequence display;

    /* JADX INFO: renamed from: b, reason: from toString */
    public boolean select;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public Object tag;

    public SelectObject(@NotNull CharSequence display, boolean z11, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(display, "display");
        this.display = display;
        this.select = z11;
        this.tag = obj;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectObject)) {
            return false;
        }
        SelectObject selectObject = (SelectObject) other;
        return Intrinsics.areEqual(this.display, selectObject.display) && this.select == selectObject.select && Intrinsics.areEqual(this.tag, selectObject.tag);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CharSequence getDisplay() {
        return this.display;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getSelect() {
        return this.select;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Object getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: d */
    public final void m33657d(boolean z11) {
        this.select = z11;
    }

    public int hashCode() {
        int iHashCode = ((this.display.hashCode() * 31) + Boolean.hashCode(this.select)) * 31;
        Object obj = this.tag;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    @NotNull
    public String toString() {
        return "SelectObject(display=" + ((Object) this.display) + ", select=" + this.select + ", tag=" + this.tag + ')';
    }

    public /* synthetic */ SelectObject(CharSequence charSequence, boolean z11, Object obj, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? null : obj);
    }
}
