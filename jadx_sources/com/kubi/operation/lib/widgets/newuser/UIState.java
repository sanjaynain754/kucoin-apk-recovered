package com.kubi.operation.lib.widgets.newuser;

import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.operation.lib.entity.WidgetNewUserEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.operation.lib.widgets.newuser.NewUserWidgetContract$UIState, reason: from toString */
/* JADX INFO: compiled from: NewUserWidgetContract.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\n¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/operation/lib/widgets/newuser/NewUserWidgetContract$UIState;", "Lcom/kubi/mvi/state/IState;", "data", "Lcom/kubi/operation/lib/entity/WidgetNewUserEntity;", "isCache", "", "<init>", "(Lcom/kubi/operation/lib/entity/WidgetNewUserEntity;Ljava/lang/Boolean;)V", "getData", "()Lcom/kubi/operation/lib/entity/WidgetNewUserEntity;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Lcom/kubi/operation/lib/entity/WidgetNewUserEntity;Ljava/lang/Boolean;)Lcom/kubi/operation/lib/widgets/newuser/NewUserWidgetContract$UIState;", "equals", "other", "", "hashCode", "", "toString", "", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UIState implements InterfaceC19284f {

    @Nullable
    private final WidgetNewUserEntity data;

    @Nullable
    private final Boolean isCache;

    /* JADX WARN: Multi-variable type inference failed */
    public UIState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIState)) {
            return false;
        }
        UIState uIState = (UIState) other;
        return Intrinsics.areEqual(this.data, uIState.data) && Intrinsics.areEqual(this.isCache, uIState.isCache);
    }

    public UIState(@Nullable WidgetNewUserEntity widgetNewUserEntity, @Nullable Boolean bool) {
        this.data = widgetNewUserEntity;
        this.isCache = bool;
    }

    public static /* synthetic */ UIState copy$default(UIState uIState, WidgetNewUserEntity widgetNewUserEntity, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            widgetNewUserEntity = uIState.data;
        }
        if ((i11 & 2) != 0) {
            bool = uIState.isCache;
        }
        return uIState.copy(widgetNewUserEntity, bool);
    }

    @NotNull
    public final UIState copy(@Nullable WidgetNewUserEntity data, @Nullable Boolean isCache) {
        return new UIState(data, isCache);
    }

    @Nullable
    public final WidgetNewUserEntity getData() {
        return this.data;
    }

    public int hashCode() {
        WidgetNewUserEntity widgetNewUserEntity = this.data;
        int iHashCode = (widgetNewUserEntity == null ? 0 : widgetNewUserEntity.hashCode()) * 31;
        Boolean bool = this.isCache;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UIState(data=" + this.data + ", isCache=" + this.isCache + ')';
    }

    public /* synthetic */ UIState(WidgetNewUserEntity widgetNewUserEntity, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : widgetNewUserEntity, (i11 & 2) != 0 ? null : bool);
    }
}
