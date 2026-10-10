package com.kubi.kumex.record;

import com.kubi.kumex.R$string;
import com.kubi.utils.C27017c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kumex.record.d, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: RecordObjects.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/kumex/record/CommonFailObject;", "", "content", "", "<init>", "(Ljava/lang/CharSequence;)V", "getContent", "()Ljava/lang/CharSequence;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CommonFailObject {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final CharSequence content;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonFailObject() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CommonFailObject) && Intrinsics.areEqual(this.content, ((CommonFailObject) other).content);
    }

    public CommonFailObject(@NotNull CharSequence content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.content = content;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CharSequence getContent() {
        return this.content;
    }

    public int hashCode() {
        return this.content.hashCode();
    }

    @NotNull
    public String toString() {
        return "CommonFailObject(content=" + ((Object) this.content) + ')';
    }

    public /* synthetic */ CommonFailObject(CharSequence charSequence, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? C27017c.f54310a.m66516f(R$string.load_failed_click_retry, new Object[0]) : charSequence);
    }
}
