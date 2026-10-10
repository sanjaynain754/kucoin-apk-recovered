package com.kubi.home.shortcut;

import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ShortCutCardMviContract.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/home/shortcut/ShortCutCardMviContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "EnCourageIntent", "GetCacheMenuListIntent", "GetMenuListIntent", "GetInitMenuListIntent", "UpdateServerIntent", "UpdateMenuIntent", "CheckNeedGetCacheMenuListIntent", "SetServerMenuResponseIntent", "Lcom/kubi/home/shortcut/ShortCutCardMviContract$UiIntent$CheckNeedGetCacheMenuListIntent;", "Lcom/kubi/home/shortcut/ShortCutCardMviContract$UiIntent$EnCourageIntent;", "Lcom/kubi/home/shortcut/ShortCutCardMviContract$UiIntent$GetCacheMenuListIntent;", "Lcom/kubi/home/shortcut/ShortCutCardMviContract$UiIntent$GetInitMenuListIntent;", "Lcom/kubi/home/shortcut/ShortCutCardMviContract$UiIntent$GetMenuListIntent;", "Lcom/kubi/home/shortcut/ShortCutCardMviContract$UiIntent$SetServerMenuResponseIntent;", "Lcom/kubi/home/shortcut/ShortCutCardMviContract$UiIntent$UpdateMenuIntent;", "Lcom/kubi/home/shortcut/ShortCutCardMviContract$UiIntent$UpdateServerIntent;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class ShortCutCardMviContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: ShortCutCardMviContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/home/shortcut/ShortCutCardMviContract$UiIntent$CheckNeedGetCacheMenuListIntent;", "Lcom/kubi/home/shortcut/ShortCutCardMviContract$UiIntent;", "<init>", "()V", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class CheckNeedGetCacheMenuListIntent extends ShortCutCardMviContract$UiIntent {

        @NotNull
        public static final CheckNeedGetCacheMenuListIntent INSTANCE = new CheckNeedGetCacheMenuListIntent();

        private CheckNeedGetCacheMenuListIntent() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: ShortCutCardMviContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/home/shortcut/ShortCutCardMviContract$UiIntent$EnCourageIntent;", "Lcom/kubi/home/shortcut/ShortCutCardMviContract$UiIntent;", "<init>", "()V", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class EnCourageIntent extends ShortCutCardMviContract$UiIntent {

        @NotNull
        public static final EnCourageIntent INSTANCE = new EnCourageIntent();

        private EnCourageIntent() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: ShortCutCardMviContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/home/shortcut/ShortCutCardMviContract$UiIntent$GetMenuListIntent;", "Lcom/kubi/home/shortcut/ShortCutCardMviContract$UiIntent;", "<init>", "()V", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class GetMenuListIntent extends ShortCutCardMviContract$UiIntent {

        @NotNull
        public static final GetMenuListIntent INSTANCE = new GetMenuListIntent();

        private GetMenuListIntent() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: ShortCutCardMviContract.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/home/shortcut/ShortCutCardMviContract$UiIntent$SetServerMenuResponseIntent;", "Lcom/kubi/home/shortcut/ShortCutCardMviContract$UiIntent;", "data", "Lcom/kubi/home/shortcut/ShortcutData;", "<init>", "(Lcom/kubi/home/shortcut/ShortcutData;)V", "getData", "()Lcom/kubi/home/shortcut/ShortcutData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class SetServerMenuResponseIntent extends ShortCutCardMviContract$UiIntent {

        @Nullable
        private final ShortcutData data;

        public SetServerMenuResponseIntent(@Nullable ShortcutData shortcutData) {
            super(null);
            this.data = shortcutData;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SetServerMenuResponseIntent) && Intrinsics.areEqual(this.data, ((SetServerMenuResponseIntent) other).data);
        }

        @Nullable
        public final ShortcutData getData() {
            return this.data;
        }

        public int hashCode() {
            ShortcutData shortcutData = this.data;
            if (shortcutData == null) {
                return 0;
            }
            return shortcutData.hashCode();
        }

        @NotNull
        public String toString() {
            return "SetServerMenuResponseIntent(data=" + this.data + ')';
        }
    }

    /* JADX INFO: compiled from: ShortCutCardMviContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/home/shortcut/ShortCutCardMviContract$UiIntent$UpdateMenuIntent;", "Lcom/kubi/home/shortcut/ShortCutCardMviContract$UiIntent;", "updateMenu", "", "<init>", "(Z)V", "getUpdateMenu", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class UpdateMenuIntent extends ShortCutCardMviContract$UiIntent {
        private final boolean updateMenu;

        public UpdateMenuIntent(boolean z11) {
            super(null);
            this.updateMenu = z11;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateMenuIntent) && this.updateMenu == ((UpdateMenuIntent) other).updateMenu;
        }

        public final boolean getUpdateMenu() {
            return this.updateMenu;
        }

        public int hashCode() {
            return Boolean.hashCode(this.updateMenu);
        }

        @NotNull
        public String toString() {
            return "UpdateMenuIntent(updateMenu=" + this.updateMenu + ')';
        }
    }

    /* JADX INFO: compiled from: ShortCutCardMviContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/home/shortcut/ShortCutCardMviContract$UiIntent$UpdateServerIntent;", "Lcom/kubi/home/shortcut/ShortCutCardMviContract$UiIntent;", "<init>", "()V", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class UpdateServerIntent extends ShortCutCardMviContract$UiIntent {

        @NotNull
        public static final UpdateServerIntent INSTANCE = new UpdateServerIntent();

        private UpdateServerIntent() {
            super(null);
        }
    }

    public /* synthetic */ ShortCutCardMviContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ShortCutCardMviContract$UiIntent() {
    }
}
