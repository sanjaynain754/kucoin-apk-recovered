package com.kubi.assets.entity;

import androidx.annotation.Keep;
import androidx.fragment.app.Fragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TabItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/assets/entity/TabItem;", "", "key", "", "shouldShow", "Lkotlin/Function0;", "", "fragmentProvider", "Landroidx/fragment/app/Fragment;", "titleProvider", "", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getKey", "()Ljava/lang/String;", "getShouldShow", "()Lkotlin/jvm/functions/Function0;", "getFragmentProvider", "getTitleProvider", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TabItem {

    @NotNull
    private final Function0<Fragment> fragmentProvider;

    @NotNull
    private final String key;

    @NotNull
    private final Function0<Boolean> shouldShow;

    @NotNull
    private final Function0<CharSequence> titleProvider;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TabItem)) {
            return false;
        }
        TabItem tabItem = (TabItem) other;
        return Intrinsics.areEqual(this.key, tabItem.key) && Intrinsics.areEqual(this.shouldShow, tabItem.shouldShow) && Intrinsics.areEqual(this.fragmentProvider, tabItem.fragmentProvider) && Intrinsics.areEqual(this.titleProvider, tabItem.titleProvider);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TabItem(@NotNull String key, @NotNull Function0<Boolean> shouldShow, @NotNull Function0<? extends Fragment> fragmentProvider, @NotNull Function0<? extends CharSequence> titleProvider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(shouldShow, "shouldShow");
        Intrinsics.checkNotNullParameter(fragmentProvider, "fragmentProvider");
        Intrinsics.checkNotNullParameter(titleProvider, "titleProvider");
        this.key = key;
        this.shouldShow = shouldShow;
        this.fragmentProvider = fragmentProvider;
        this.titleProvider = titleProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TabItem copy$default(TabItem tabItem, String str, Function0 function0, Function0 function1, Function0 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tabItem.key;
        }
        if ((i11 & 2) != 0) {
            function0 = tabItem.shouldShow;
        }
        if ((i11 & 4) != 0) {
            function1 = tabItem.fragmentProvider;
        }
        if ((i11 & 8) != 0) {
            function2 = tabItem.titleProvider;
        }
        return tabItem.copy(str, function0, function1, function2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final Function0<Boolean> component2() {
        return this.shouldShow;
    }

    @NotNull
    public final Function0<Fragment> component3() {
        return this.fragmentProvider;
    }

    @NotNull
    public final Function0<CharSequence> component4() {
        return this.titleProvider;
    }

    @NotNull
    public final TabItem copy(@NotNull String key, @NotNull Function0<Boolean> shouldShow, @NotNull Function0<? extends Fragment> fragmentProvider, @NotNull Function0<? extends CharSequence> titleProvider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(shouldShow, "shouldShow");
        Intrinsics.checkNotNullParameter(fragmentProvider, "fragmentProvider");
        Intrinsics.checkNotNullParameter(titleProvider, "titleProvider");
        return new TabItem(key, shouldShow, fragmentProvider, titleProvider);
    }

    @NotNull
    public final Function0<Fragment> getFragmentProvider() {
        return this.fragmentProvider;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final Function0<Boolean> getShouldShow() {
        return this.shouldShow;
    }

    @NotNull
    public final Function0<CharSequence> getTitleProvider() {
        return this.titleProvider;
    }

    public int hashCode() {
        return (((((this.key.hashCode() * 31) + this.shouldShow.hashCode()) * 31) + this.fragmentProvider.hashCode()) * 31) + this.titleProvider.hashCode();
    }

    @NotNull
    public String toString() {
        return "TabItem(key=" + this.key + ", shouldShow=" + this.shouldShow + ", fragmentProvider=" + this.fragmentProvider + ", titleProvider=" + this.titleProvider + ')';
    }
}
