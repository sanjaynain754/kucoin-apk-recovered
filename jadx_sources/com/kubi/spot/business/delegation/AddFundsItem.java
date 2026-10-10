package com.kubi.spot.business.delegation;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradeFundsListViewModel.kt */
/* JADX INFO: loaded from: classes47.dex */
@Keep
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BB\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\t\u0012\b\b\u0002\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J$\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\t\u0012\b\b\u0002\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\bHÆ\u0003JL\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062#\b\u0002\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\t\u0012\b\b\u0002\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R,\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\t\u0012\b\b\u0002\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/AddFundsItem;", "", "name", "", "desc", TUIConstants.TUIChat.INPUT_MORE_ICON, "", "onItemClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", FirebaseAnalytics.Param.CURRENCY, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/functions/Function1;)V", "getName", "()Ljava/lang/String;", "getDesc", "getIcon", "()I", "getOnItemClick", "()Lkotlin/jvm/functions/Function1;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AddFundsItem {

    @NotNull
    private final String desc;
    private final int icon;

    @NotNull
    private final String name;

    @NotNull
    private final Function1<String, Unit> onItemClick;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddFundsItem)) {
            return false;
        }
        AddFundsItem addFundsItem = (AddFundsItem) other;
        return Intrinsics.areEqual(this.name, addFundsItem.name) && Intrinsics.areEqual(this.desc, addFundsItem.desc) && this.icon == addFundsItem.icon && Intrinsics.areEqual(this.onItemClick, addFundsItem.onItemClick);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddFundsItem(@NotNull String name, @NotNull String desc, int i11, @NotNull Function1<? super String, Unit> onItemClick) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.name = name;
        this.desc = desc;
        this.icon = i11;
        this.onItemClick = onItemClick;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddFundsItem copy$default(AddFundsItem addFundsItem, String str, String str2, int i11, Function1 function1, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = addFundsItem.name;
        }
        if ((i12 & 2) != 0) {
            str2 = addFundsItem.desc;
        }
        if ((i12 & 4) != 0) {
            i11 = addFundsItem.icon;
        }
        if ((i12 & 8) != 0) {
            function1 = addFundsItem.onItemClick;
        }
        return addFundsItem.copy(str, str2, i11, function1);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    @NotNull
    public final Function1<String, Unit> component4() {
        return this.onItemClick;
    }

    @NotNull
    public final AddFundsItem copy(@NotNull String name, @NotNull String desc, int icon, @NotNull Function1<? super String, Unit> onItemClick) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        return new AddFundsItem(name, desc, icon, onItemClick);
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    public final int getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final Function1<String, Unit> getOnItemClick() {
        return this.onItemClick;
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.desc.hashCode()) * 31) + Integer.hashCode(this.icon)) * 31) + this.onItemClick.hashCode();
    }

    @NotNull
    public String toString() {
        return "AddFundsItem(name=" + this.name + ", desc=" + this.desc + ", icon=" + this.icon + ", onItemClick=" + this.onItemClick + ')';
    }
}
