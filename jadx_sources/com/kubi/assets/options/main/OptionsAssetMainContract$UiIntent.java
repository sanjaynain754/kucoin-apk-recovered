package com.kubi.assets.options.main;

import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: OptionsAssetMainContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/options/main/OptionsAssetMainContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "RefreshOpenStatus", "Lcom/kubi/assets/options/main/OptionsAssetMainContract$UiIntent$RefreshOpenStatus;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class OptionsAssetMainContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: OptionsAssetMainContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/assets/options/main/OptionsAssetMainContract$UiIntent$RefreshOpenStatus;", "Lcom/kubi/assets/options/main/OptionsAssetMainContract$UiIntent;", "<init>", "()V", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class RefreshOpenStatus extends OptionsAssetMainContract$UiIntent {

        @NotNull
        public static final RefreshOpenStatus INSTANCE = new RefreshOpenStatus();

        private RefreshOpenStatus() {
            super(null);
        }
    }

    public /* synthetic */ OptionsAssetMainContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OptionsAssetMainContract$UiIntent() {
    }
}
