package com.kubi.assets.unify.detail;

import androidx.fragment.app.Fragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.unify.detail.a, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: UnifiedDetailVM.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/assets/unify/detail/BottomFunctionData;", "", "funcBtnText", "", "onClickEvent", "Lkotlin/Function1;", "Landroidx/fragment/app/Fragment;", "", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getFuncBtnText", "()Ljava/lang/String;", "getOnClickEvent", "()Lkotlin/jvm/functions/Function1;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class BottomFunctionData {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String funcBtnText;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final Function1<Fragment, Unit> onClickEvent;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomFunctionData)) {
            return false;
        }
        BottomFunctionData bottomFunctionData = (BottomFunctionData) other;
        return Intrinsics.areEqual(this.funcBtnText, bottomFunctionData.funcBtnText) && Intrinsics.areEqual(this.onClickEvent, bottomFunctionData.onClickEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BottomFunctionData(@NotNull String funcBtnText, @NotNull Function1<? super Fragment, Unit> onClickEvent) {
        Intrinsics.checkNotNullParameter(funcBtnText, "funcBtnText");
        Intrinsics.checkNotNullParameter(onClickEvent, "onClickEvent");
        this.funcBtnText = funcBtnText;
        this.onClickEvent = onClickEvent;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFuncBtnText() {
        return this.funcBtnText;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Function1<Fragment, Unit> m19850b() {
        return this.onClickEvent;
    }

    public int hashCode() {
        return (this.funcBtnText.hashCode() * 31) + this.onClickEvent.hashCode();
    }

    @NotNull
    public String toString() {
        return "BottomFunctionData(funcBtnText=" + this.funcBtnText + ", onClickEvent=" + this.onClickEvent + ')';
    }
}
