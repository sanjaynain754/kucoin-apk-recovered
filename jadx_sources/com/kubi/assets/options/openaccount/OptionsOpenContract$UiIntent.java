package com.kubi.assets.options.openaccount;

import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OptionsOpenContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/options/openaccount/OptionsOpenContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "JumpToOpen", "Lcom/kubi/assets/options/openaccount/OptionsOpenContract$UiIntent$JumpToOpen;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class OptionsOpenContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: OptionsOpenContract.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/assets/options/openaccount/OptionsOpenContract$UiIntent$JumpToOpen;", "Lcom/kubi/assets/options/openaccount/OptionsOpenContract$UiIntent;", "path", "", "<init>", "(Ljava/lang/String;)V", "getPath", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class JumpToOpen extends OptionsOpenContract$UiIntent {

        @Nullable
        private final String path;

        /* JADX WARN: Multi-variable type inference failed */
        public JumpToOpen() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof JumpToOpen) && Intrinsics.areEqual(this.path, ((JumpToOpen) other).path);
        }

        public JumpToOpen(@Nullable String str) {
            super(null);
            this.path = str;
        }

        @Nullable
        public final String getPath() {
            return this.path;
        }

        public int hashCode() {
            String str = this.path;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "JumpToOpen(path=" + this.path + ')';
        }

        public /* synthetic */ JumpToOpen(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str);
        }
    }

    public /* synthetic */ OptionsOpenContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OptionsOpenContract$UiIntent() {
    }
}
