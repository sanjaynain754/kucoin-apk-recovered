package com.kubi.p110rn.receiver;

import a70.InterfaceC0187a;
import com.kubi.p110rn.modules.RNPublishSubject;
import com.kubi.user.account.AccountChange;
import com.kubi.user.account.AccountChangeType;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: RNAccountChangeReceiver.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\r"}, m90084d2 = {"Lcom/kubi/rn/receiver/RNAccountChangeReceiver;", "Lcom/kubi/user/account/IAccountChangeReceiver;", "<init>", "()V", "invoke", "", "p1", "Lcom/kubi/user/account/AccountChange;", "resolveEventName", "", "type", "Lcom/kubi/user/account/AccountChangeType;", "Companion", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RNAccountChangeReceiver implements InterfaceC0187a {

    @NotNull
    public static final String EVENT_ACCOUNTS_UPDATED = "onUcAlternativeAccountsUpdated";

    @NotNull
    public static final String EVENT_ACCOUNT_STATE_CHANGE = "onUcAlternativeAccountAbnormalStatus";

    @NotNull
    private static final String KEY_CHANGE_ID = "changeId";

    @NotNull
    private static final String KEY_CHANGE_TYPE = "changeType";

    @NotNull
    private static final String TAG = "RNAccountChangeReceiver";

    @Override // p852kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AccountChange) obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: compiled from: RNAccountChangeReceiver.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountChangeType.values().length];
            try {
                iArr[AccountChangeType.TYPE_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountChangeType.TYPE_308100.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountChangeType.TYPE_280003.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountChangeType.TYPE_500036.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AccountChangeType.TYPE_4111.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AccountChangeType.TYPE_4116.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final String resolveEventName(AccountChangeType type) {
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                return EVENT_ACCOUNTS_UPDATED;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return EVENT_ACCOUNT_STATE_CHANGE;
            default:
                C44128b.m97270n(TAG, "unhandled changeType=" + type.getValue() + ", defaulting to onUcAlternativeAccountsUpdated");
                return EVENT_ACCOUNTS_UPDATED;
        }
    }

    public void invoke(@NotNull AccountChange p11) {
        Intrinsics.checkNotNullParameter(p11, "p1");
        String strResolveEventName = resolveEventName(p11.getType());
        HashMap mapHashMapOf = MapsKt.hashMapOf(TuplesKt.m90091to(KEY_CHANGE_TYPE, String.valueOf(p11.getType().getValue())), TuplesKt.m90091to(KEY_CHANGE_ID, p11.getChangeId()));
        C44128b.m97266j(TAG, "invoke: eventName=" + strResolveEventName + " info=" + mapHashMapOf);
        RNPublishSubject.INSTANCE.getNativeNotifyRn().onNext(new Pair<>(strResolveEventName, mapHashMapOf));
    }
}
