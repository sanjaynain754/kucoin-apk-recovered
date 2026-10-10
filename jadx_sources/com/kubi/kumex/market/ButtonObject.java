package com.kubi.kumex.market;

import com.kubi.p110rn.modules.BridgeParamKeyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kumex.market.a, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: MarketObjects.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/kumex/market/ButtonObject;", "", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "", "content", "", "<init>", "(ZLjava/lang/CharSequence;)V", "getEnable", "()Z", "getContent", "()Ljava/lang/CharSequence;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ButtonObject {

    /* JADX INFO: renamed from: a, reason: from toString */
    public final boolean enable;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final CharSequence content;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonObject)) {
            return false;
        }
        ButtonObject buttonObject = (ButtonObject) other;
        return this.enable == buttonObject.enable && Intrinsics.areEqual(this.content, buttonObject.content);
    }

    public ButtonObject(boolean z11, @NotNull CharSequence content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.enable = z11;
        this.content = content;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CharSequence getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.enable) * 31) + this.content.hashCode();
    }

    @NotNull
    public String toString() {
        return "ButtonObject(enable=" + this.enable + ", content=" + ((Object) this.content) + ')';
    }
}
