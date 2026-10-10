package p852kotlin.reflect.jvm.internal.impl.descriptors;

import com.google.android.gms.common.internal.ImagesContract;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Visibilities.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class Visibilities {

    @NotNull
    private static final Public DEFAULT_VISIBILITY;

    @NotNull
    public static final Visibilities INSTANCE = new Visibilities();

    @NotNull
    private static final Map<Visibility, Integer> ORDERED_VISIBILITIES;

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class Inherited extends Visibility {

        @NotNull
        public static final Inherited INSTANCE = new Inherited();

        private Inherited() {
            super("inherited", false);
        }
    }

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class Internal extends Visibility {

        @NotNull
        public static final Internal INSTANCE = new Internal();

        private Internal() {
            super("internal", false);
        }
    }

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class InvisibleFake extends Visibility {

        @NotNull
        public static final InvisibleFake INSTANCE = new InvisibleFake();

        private InvisibleFake() {
            super("invisible_fake", false);
        }
    }

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class Local extends Visibility {

        @NotNull
        public static final Local INSTANCE = new Local();

        private Local() {
            super(ImagesContract.LOCAL, false);
        }
    }

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class Private extends Visibility {

        @NotNull
        public static final Private INSTANCE = new Private();

        private Private() {
            super("private", false);
        }
    }

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class PrivateToThis extends Visibility {

        @NotNull
        public static final PrivateToThis INSTANCE = new PrivateToThis();

        private PrivateToThis() {
            super("private_to_this", false);
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        @NotNull
        public String getInternalDisplayName() {
            return "private/*private to this*/";
        }
    }

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class Protected extends Visibility {

        @NotNull
        public static final Protected INSTANCE = new Protected();

        private Protected() {
            super("protected", true);
        }
    }

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class Public extends Visibility {

        @NotNull
        public static final Public INSTANCE = new Public();

        private Public() {
            super(TUIConstants.TUIPollPlugin.PLUGIN_POLL_ENABLE_PUBLIC, true);
        }
    }

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class Unknown extends Visibility {

        @NotNull
        public static final Unknown INSTANCE = new Unknown();

        private Unknown() {
            super("unknown", false);
        }
    }

    static {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put(PrivateToThis.INSTANCE, 0);
        mapCreateMapBuilder.put(Private.INSTANCE, 0);
        mapCreateMapBuilder.put(Internal.INSTANCE, 1);
        mapCreateMapBuilder.put(Protected.INSTANCE, 1);
        Public r11 = Public.INSTANCE;
        mapCreateMapBuilder.put(r11, 2);
        ORDERED_VISIBILITIES = MapsKt.build(mapCreateMapBuilder);
        DEFAULT_VISIBILITY = r11;
    }

    @Nullable
    public final Integer compareLocal$compiler_common(@NotNull Visibility first, @NotNull Visibility second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (first == second) {
            return 0;
        }
        Map<Visibility, Integer> map = ORDERED_VISIBILITIES;
        Integer num = map.get(first);
        Integer num2 = map.get(second);
        if (num == null || num2 == null || Intrinsics.areEqual(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    private Visibilities() {
    }

    public final boolean isPrivate(@NotNull Visibility visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        if (visibility != Private.INSTANCE && visibility != PrivateToThis.INSTANCE) {
            return false;
        }
        return true;
    }
}
