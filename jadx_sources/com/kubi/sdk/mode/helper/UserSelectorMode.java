package com.kubi.sdk.mode.helper;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.kubi.sdk.mode.helper.UserSelectorMode, still in use, count: 1, list:
  (r0v1 com.kubi.sdk.mode.helper.UserSelectorMode) from 0x002a: CONSTRUCTOR (r0v1 com.kubi.sdk.mode.helper.UserSelectorMode) A[GenericInfoAttr{[com.kubi.sdk.mode.helper.UserSelectorMode], explicit=false}, MD:(T):void (m), WRAPPED] (LINE:45) call: androidx.lifecycle.MutableLiveData.<init>(java.lang.Object):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: ModeHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/sdk/mode/helper/UserSelectorMode;", "", "<init>", "(Ljava/lang/String;I)V", "Newer", "Experienced", "Companion", "LModeConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UserSelectorMode {
    Newer,
    Experienced;


    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ EnumEntries f47134d = EnumEntriesKt.enumEntries(m57263a());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final MutableLiveData<UserSelectorMode> f47132b = new MutableLiveData<>(new UserSelectorMode());

    /* JADX INFO: compiled from: ModeHelper.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/sdk/mode/helper/UserSelectorMode$Companion;", "", "<init>", "()V", "_currentMode", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/sdk/mode/helper/UserSelectorMode;", "currentMode", "Landroidx/lifecycle/LiveData;", "getCurrentMode", "()Landroidx/lifecycle/LiveData;", "get", "set", "", "mode", "LModeConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void set(@NotNull UserSelectorMode mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            if (UserSelectorMode.f47132b.getValue() != mode) {
                UserSelectorMode.f47132b.setValue(mode);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final UserSelectorMode get() {
            UserSelectorMode userSelectorMode = (UserSelectorMode) UserSelectorMode.f47132b.getValue();
            if (userSelectorMode == null) {
                return UserSelectorMode.Experienced;
            }
            return userSelectorMode;
        }

        @NotNull
        public final LiveData<UserSelectorMode> getCurrentMode() {
            return UserSelectorMode.f47132b;
        }
    }

    static {
    }

    @NotNull
    public static EnumEntries<UserSelectorMode> getEntries() {
        return f47134d;
    }

    public static UserSelectorMode valueOf(String str) {
        return (UserSelectorMode) Enum.valueOf(UserSelectorMode.class, str);
    }

    public static UserSelectorMode[] values() {
        return (UserSelectorMode[]) f47133c.clone();
    }

    public UserSelectorMode() {
        super(str, i);
    }
}
