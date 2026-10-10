package com.facebook.react.uimanager;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.style.CornerRadii;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p747x3.C45999a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: LengthPercentage.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003J\t\u0010\u000f\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, m90084d2 = {"Lcom/facebook/react/uimanager/LengthPercentage;", "", "value", "", "type", "Lcom/facebook/react/uimanager/LengthPercentageType;", "<init>", "(FLcom/facebook/react/uimanager/LengthPercentageType;)V", "()V", "getType", "()Lcom/facebook/react/uimanager/LengthPercentageType;", "resolve", "Lcom/facebook/react/uimanager/style/CornerRadii;", "width", "height", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final /* data */ class LengthPercentage {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final LengthPercentageType type;
    private final float value;

    /* JADX INFO: compiled from: LengthPercentage.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m90084d2 = {"Lcom/facebook/react/uimanager/LengthPercentage$Companion;", "", "<init>", "()V", "setFromDynamic", "Lcom/facebook/react/uimanager/LengthPercentage;", "dynamic", "Lcom/facebook/react/bridge/Dynamic;", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: compiled from: LengthPercentage.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ReadableType.values().length];
                try {
                    iArr[ReadableType.Number.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ReadableType.String.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        @JvmStatic
        @Nullable
        public final LengthPercentage setFromDynamic(@NotNull Dynamic dynamic) {
            Intrinsics.checkNotNullParameter(dynamic, "dynamic");
            int i11 = WhenMappings.$EnumSwitchMapping$0[dynamic.getType().ordinal()];
            if (i11 == 1) {
                double dAsDouble = dynamic.asDouble();
                if (dAsDouble >= 0.0d) {
                    return new LengthPercentage((float) dAsDouble, LengthPercentageType.POINT);
                }
                return null;
            }
            if (i11 != 2) {
                C45999a.m101488I(ReactConstants.TAG, "Unsupported type for radius property: " + dynamic.getType());
                return null;
            }
            String strAsString = dynamic.asString();
            if (!StringsKt.endsWith$default(strAsString, "%", false, 2, (Object) null)) {
                C45999a.m101488I(ReactConstants.TAG, "Invalid string value: " + strAsString);
                return null;
            }
            try {
                String strSubstring = strAsString.substring(0, strAsString.length() - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                float f11 = Float.parseFloat(strSubstring);
                if (f11 >= 0.0f) {
                    return new LengthPercentage(f11, LengthPercentageType.PERCENT);
                }
                return null;
            } catch (NumberFormatException unused) {
                C45999a.m101488I(ReactConstants.TAG, "Invalid percentage format: " + strAsString);
                return null;
            }
        }
    }

    public LengthPercentage(float f11, @NotNull LengthPercentageType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.value = f11;
        this.type = type;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LengthPercentage)) {
            return false;
        }
        LengthPercentage lengthPercentage = (LengthPercentage) other;
        return Float.compare(this.value, lengthPercentage.value) == 0 && this.type == lengthPercentage.type;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final float getValue() {
        return this.value;
    }

    public static /* synthetic */ LengthPercentage copy$default(LengthPercentage lengthPercentage, float f11, LengthPercentageType lengthPercentageType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = lengthPercentage.value;
        }
        if ((i11 & 2) != 0) {
            lengthPercentageType = lengthPercentage.type;
        }
        return lengthPercentage.copy(f11, lengthPercentageType);
    }

    @JvmStatic
    @Nullable
    public static final LengthPercentage setFromDynamic(@NotNull Dynamic dynamic) {
        return INSTANCE.setFromDynamic(dynamic);
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LengthPercentageType getType() {
        return this.type;
    }

    @NotNull
    public final LengthPercentageType getType() {
        return this.type;
    }

    public int hashCode() {
        return (Float.hashCode(this.value) * 31) + this.type.hashCode();
    }

    @NotNull
    public final CornerRadii resolve(float width, float height) {
        if (this.type != LengthPercentageType.PERCENT) {
            float f11 = this.value;
            return new CornerRadii(f11, f11);
        }
        float f12 = this.value;
        float f13 = 100;
        return new CornerRadii((f12 / f13) * width, (f12 / f13) * height);
    }

    @NotNull
    public String toString() {
        return "LengthPercentage(value=" + this.value + ", type=" + this.type + ")";
    }

    @NotNull
    public final LengthPercentage copy(float value, @NotNull LengthPercentageType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new LengthPercentage(value, type);
    }

    public LengthPercentage() {
        this(0.0f, LengthPercentageType.POINT);
    }
}
