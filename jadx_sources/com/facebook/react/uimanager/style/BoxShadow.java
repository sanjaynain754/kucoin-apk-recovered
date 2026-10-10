package com.facebook.react.uimanager.style;

import android.content.Context;
import androidx.annotation.ColorInt;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ViewProps;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BoxShadow.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 '2\u00020\u0001:\u0001'BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018JR\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0006HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018¨\u0006("}, m90084d2 = {"Lcom/facebook/react/uimanager/style/BoxShadow;", "", "offsetX", "", "offsetY", "color", "", "blurRadius", "spreadDistance", "inset", "", "<init>", "(FFLjava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;)V", "getOffsetX", "()F", "getOffsetY", "getColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBlurRadius", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getSpreadDistance", "getInset", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(FFLjava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;)Lcom/facebook/react/uimanager/style/BoxShadow;", "equals", "other", "hashCode", "toString", "", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final /* data */ class BoxShadow {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Float blurRadius;

    @Nullable
    private final Integer color;

    @Nullable
    private final Boolean inset;
    private final float offsetX;
    private final float offsetY;

    @Nullable
    private final Float spreadDistance;

    /* JADX INFO: compiled from: BoxShadow.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, m90084d2 = {"Lcom/facebook/react/uimanager/style/BoxShadow$Companion;", "", "<init>", "()V", "parse", "Lcom/facebook/react/uimanager/style/BoxShadow;", ViewProps.BOX_SHADOW, "Lcom/facebook/react/bridge/ReadableMap;", "context", "Landroid/content/Context;", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: compiled from: BoxShadow.kt */
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
                    iArr[ReadableType.Map.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        @JvmStatic
        @Nullable
        public final BoxShadow parse(@Nullable ReadableMap boxShadow, @NotNull Context context) {
            Integer num;
            Integer numValueOf;
            Intrinsics.checkNotNullParameter(context, "context");
            if (boxShadow == null || !boxShadow.hasKey("offsetX") || !boxShadow.hasKey("offsetY")) {
                return null;
            }
            float f11 = (float) boxShadow.getDouble("offsetX");
            float f12 = (float) boxShadow.getDouble("offsetY");
            if (boxShadow.hasKey("color")) {
                ReadableType type = boxShadow.getType("color");
                int i11 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                if (i11 == 1) {
                    numValueOf = Integer.valueOf(boxShadow.getInt("color"));
                } else {
                    if (i11 != 2) {
                        throw new JSApplicationCausedNativeException("Unsupported color type " + type);
                    }
                    numValueOf = ColorPropConverter.getColor(boxShadow.getMap("color"), context);
                }
                num = numValueOf;
            } else {
                num = null;
            }
            return new BoxShadow(f11, f12, num, boxShadow.hasKey("blurRadius") ? Float.valueOf((float) boxShadow.getDouble("blurRadius")) : null, boxShadow.hasKey("spreadDistance") ? Float.valueOf((float) boxShadow.getDouble("spreadDistance")) : null, boxShadow.hasKey("inset") ? Boolean.valueOf(boxShadow.getBoolean("inset")) : null);
        }
    }

    public BoxShadow(float f11, float f12, @ColorInt @Nullable Integer num, @Nullable Float f13, @Nullable Float f14, @Nullable Boolean bool) {
        this.offsetX = f11;
        this.offsetY = f12;
        this.color = num;
        this.blurRadius = f13;
        this.spreadDistance = f14;
        this.inset = bool;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoxShadow)) {
            return false;
        }
        BoxShadow boxShadow = (BoxShadow) other;
        return Float.compare(this.offsetX, boxShadow.offsetX) == 0 && Float.compare(this.offsetY, boxShadow.offsetY) == 0 && Intrinsics.areEqual(this.color, boxShadow.color) && Intrinsics.areEqual((Object) this.blurRadius, (Object) boxShadow.blurRadius) && Intrinsics.areEqual((Object) this.spreadDistance, (Object) boxShadow.spreadDistance) && Intrinsics.areEqual(this.inset, boxShadow.inset);
    }

    public static /* synthetic */ BoxShadow copy$default(BoxShadow boxShadow, float f11, float f12, Integer num, Float f13, Float f14, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = boxShadow.offsetX;
        }
        if ((i11 & 2) != 0) {
            f12 = boxShadow.offsetY;
        }
        if ((i11 & 4) != 0) {
            num = boxShadow.color;
        }
        if ((i11 & 8) != 0) {
            f13 = boxShadow.blurRadius;
        }
        if ((i11 & 16) != 0) {
            f14 = boxShadow.spreadDistance;
        }
        if ((i11 & 32) != 0) {
            bool = boxShadow.inset;
        }
        Float f15 = f14;
        Boolean bool2 = bool;
        return boxShadow.copy(f11, f12, num, f13, f15, bool2);
    }

    @JvmStatic
    @Nullable
    public static final BoxShadow parse(@Nullable ReadableMap readableMap, @NotNull Context context) {
        return INSTANCE.parse(readableMap, context);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getOffsetX() {
        return this.offsetX;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getOffsetY() {
        return this.offsetY;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getColor() {
        return this.color;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Float getBlurRadius() {
        return this.blurRadius;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Float getSpreadDistance() {
        return this.spreadDistance;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getInset() {
        return this.inset;
    }

    @NotNull
    public final BoxShadow copy(float offsetX, float offsetY, @ColorInt @Nullable Integer color, @Nullable Float blurRadius, @Nullable Float spreadDistance, @Nullable Boolean inset) {
        return new BoxShadow(offsetX, offsetY, color, blurRadius, spreadDistance, inset);
    }

    @Nullable
    public final Float getBlurRadius() {
        return this.blurRadius;
    }

    @Nullable
    public final Integer getColor() {
        return this.color;
    }

    @Nullable
    public final Boolean getInset() {
        return this.inset;
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    @Nullable
    public final Float getSpreadDistance() {
        return this.spreadDistance;
    }

    public int hashCode() {
        int iHashCode = ((Float.hashCode(this.offsetX) * 31) + Float.hashCode(this.offsetY)) * 31;
        Integer num = this.color;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Float f11 = this.blurRadius;
        int iHashCode3 = (iHashCode2 + (f11 == null ? 0 : f11.hashCode())) * 31;
        Float f12 = this.spreadDistance;
        int iHashCode4 = (iHashCode3 + (f12 == null ? 0 : f12.hashCode())) * 31;
        Boolean bool = this.inset;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BoxShadow(offsetX=" + this.offsetX + ", offsetY=" + this.offsetY + ", color=" + this.color + ", blurRadius=" + this.blurRadius + ", spreadDistance=" + this.spreadDistance + ", inset=" + this.inset + ")";
    }

    public /* synthetic */ BoxShadow(float f11, float f12, Integer num, Float f13, Float f14, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : f13, (i11 & 16) != 0 ? null : f14, (i11 & 32) != 0 ? null : bool);
    }
}
