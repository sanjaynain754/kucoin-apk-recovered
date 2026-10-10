package io.trtc.tuikit.atomicxcore.api.login;

import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/login/LoginStatus;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "UNLOGIN", "LOGINED", "Companion", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLoginStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginStore.kt\nio/trtc/tuikit/atomicxcore/api/login/LoginStatus\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,330:1\n8541#2,2:331\n8801#2,4:333\n*S KotlinDebug\n*F\n+ 1 LoginStore.kt\nio/trtc/tuikit/atomicxcore/api/login/LoginStatus\n*L\n35#1:331,2\n35#1:333,4\n*E\n"})
public enum LoginStatus {
    UNLOGIN(3),
    LOGINED(1);


    @NotNull
    private static final Map<Integer, LoginStatus> valueMap;
    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0005H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/login/LoginStatus$Companion;", "", "()V", "valueMap", "", "", "Lio/trtc/tuikit/atomicxcore/api/login/LoginStatus;", "parse", "value", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final LoginStatus parse(int value) {
            LoginStatus loginStatus = (LoginStatus) LoginStatus.valueMap.get(Integer.valueOf(value));
            if (loginStatus == null) {
                return LoginStatus.UNLOGIN;
            }
            return loginStatus;
        }
    }

    static {
        LoginStatus[] loginStatusArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(loginStatusArrValues.length), 16));
        for (LoginStatus loginStatus : loginStatusArrValues) {
            linkedHashMap.put(Integer.valueOf(loginStatus.value), loginStatus);
        }
        valueMap = linkedHashMap;
    }

    @NotNull
    public static EnumEntries<LoginStatus> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    @NotNull
    public static final LoginStatus parse(int i11) {
        return INSTANCE.parse(i11);
    }

    public final int getValue() {
        return this.value;
    }

    LoginStatus(int i11) {
        this.value = i11;
    }
}
