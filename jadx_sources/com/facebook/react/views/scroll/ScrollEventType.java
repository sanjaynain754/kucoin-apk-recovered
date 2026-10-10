package com.facebook.react.views.scroll;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScrollEventType.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, m90084d2 = {"Lcom/facebook/react/views/scroll/ScrollEventType;", "", "<init>", "(Ljava/lang/String;I)V", "BEGIN_DRAG", "END_DRAG", "SCROLL", "MOMENTUM_BEGIN", "MOMENTUM_END", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public enum ScrollEventType {
    BEGIN_DRAG,
    END_DRAG,
    SCROLL,
    MOMENTUM_BEGIN,
    MOMENTUM_END;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: ScrollEventType.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m90084d2 = {"Lcom/facebook/react/views/scroll/ScrollEventType$Companion;", "", "<init>", "()V", "getJSEventName", "", "type", "Lcom/facebook/react/views/scroll/ScrollEventType;", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: compiled from: ScrollEventType.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ScrollEventType.values().length];
                try {
                    iArr[ScrollEventType.BEGIN_DRAG.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ScrollEventType.END_DRAG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ScrollEventType.SCROLL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ScrollEventType.MOMENTUM_BEGIN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ScrollEventType.MOMENTUM_END.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final String getJSEventName(@NotNull ScrollEventType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            int i11 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                return "topMomentumScrollEnd";
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        return "topMomentumScrollBegin";
                    }
                    return "topScroll";
                }
                return "topScrollEndDrag";
            }
            return "topScrollBeginDrag";
        }
    }

    @NotNull
    public static EnumEntries<ScrollEventType> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    @NotNull
    public static final String getJSEventName(@NotNull ScrollEventType scrollEventType) {
        return INSTANCE.getJSEventName(scrollEventType);
    }
}
