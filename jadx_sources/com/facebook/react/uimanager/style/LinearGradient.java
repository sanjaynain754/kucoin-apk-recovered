package com.facebook.react.uimanager.style;

import android.graphics.Shader;
import com.facebook.react.bridge.ReadableMap;
import com.p059BV.LinearGradient.LinearGradientManager;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LinearGradient.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u0012H\u0002J,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00162\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/facebook/react/uimanager/style/LinearGradient;", "", "directionMap", "Lcom/facebook/react/bridge/ReadableMap;", LinearGradientManager.PROP_COLORS, "", "positions", "", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;[I[F)V", "direction", "Lcom/facebook/react/uimanager/style/LinearGradient$Direction;", "getShader", "Landroid/graphics/Shader;", "width", "", "height", "getAngleForKeyword", "", "keyword", "Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Keywords;", "endPointsFromAngle", "Lkotlin/Pair;", LinearGradientManager.PROP_ANGLE, "Direction", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class LinearGradient {

    @NotNull
    private final int[] colors;

    @NotNull
    private final Direction direction;

    @NotNull
    private final float[] positions;

    /* JADX INFO: compiled from: LinearGradient.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m90084d2 = {"Lcom/facebook/react/uimanager/style/LinearGradient$Direction;", "", "<init>", "()V", "Angle", "Keywords", "Keyword", "Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Angle;", "Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Keyword;", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static abstract class Direction {

        /* JADX INFO: compiled from: LinearGradient.kt */
        @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Angle;", "Lcom/facebook/react/uimanager/style/LinearGradient$Direction;", "value", "", "<init>", "(D)V", "getValue", "()D", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
        public static final /* data */ class Angle extends Direction {
            private final double value;

            public Angle(double d11) {
                super(null);
                this.value = d11;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Angle) && Double.compare(this.value, ((Angle) other).value) == 0;
            }

            public static /* synthetic */ Angle copy$default(Angle angle, double d11, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    d11 = angle.value;
                }
                return angle.copy(d11);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final double getValue() {
                return this.value;
            }

            @NotNull
            public final Angle copy(double value) {
                return new Angle(value);
            }

            public final double getValue() {
                return this.value;
            }

            public int hashCode() {
                return Double.hashCode(this.value);
            }

            @NotNull
            public String toString() {
                return "Angle(value=" + this.value + ")";
            }
        }

        /* JADX INFO: compiled from: LinearGradient.kt */
        @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Keyword;", "Lcom/facebook/react/uimanager/style/LinearGradient$Direction;", "value", "Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Keywords;", "<init>", "(Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Keywords;)V", "getValue", "()Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Keywords;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
        public static final /* data */ class Keyword extends Direction {

            @NotNull
            private final Keywords value;

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Keyword) && this.value == ((Keyword) other).value;
            }

            public static /* synthetic */ Keyword copy$default(Keyword keyword, Keywords keywords, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    keywords = keyword.value;
                }
                return keyword.copy(keywords);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Keywords getValue() {
                return this.value;
            }

            @NotNull
            public final Keywords getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            @NotNull
            public String toString() {
                return "Keyword(value=" + this.value + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Keyword(@NotNull Keywords value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }

            @NotNull
            public final Keyword copy(@NotNull Keywords value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new Keyword(value);
            }
        }

        /* JADX INFO: compiled from: LinearGradient.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m90084d2 = {"Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Keywords;", "", "<init>", "(Ljava/lang/String;I)V", "TO_TOP_RIGHT", "TO_BOTTOM_RIGHT", "TO_TOP_LEFT", "TO_BOTTOM_LEFT", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
        public enum Keywords {
            TO_TOP_RIGHT,
            TO_BOTTOM_RIGHT,
            TO_TOP_LEFT,
            TO_BOTTOM_LEFT;

            private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

            @NotNull
            public static EnumEntries<Keywords> getEntries() {
                return $ENTRIES;
            }
        }

        public /* synthetic */ Direction(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Direction() {
        }
    }

    private final Pair<float[], float[]> endPointsFromAngle(double angle, float height, float width) {
        float[] fArr;
        double d11 = TXVodDownloadDataSource.QUALITY_360P;
        double d12 = angle % d11;
        if (d12 < 0.0d) {
            d12 += d11;
        }
        if (d12 == 0.0d) {
            return new Pair<>(new float[]{0.0f, height}, new float[]{0.0f, 0.0f});
        }
        if (d12 == 90.0d) {
            return new Pair<>(new float[]{0.0f, 0.0f}, new float[]{width, 0.0f});
        }
        if (d12 == 180.0d) {
            return new Pair<>(new float[]{0.0f, 0.0f}, new float[]{0.0f, height});
        }
        if (d12 == 270.0d) {
            return new Pair<>(new float[]{width, 0.0f}, new float[]{0.0f, 0.0f});
        }
        float fTan = (float) Math.tan(Math.toRadians(((double) 90) - d12));
        float f11 = (-1) / fTan;
        float f12 = 2;
        float f13 = height / f12;
        float f14 = width / f12;
        if (d12 < 90.0d) {
            fArr = new float[]{f14, f13};
        } else if (d12 < 180.0d) {
            fArr = new float[]{f14, -f13};
        } else {
            fArr = d12 < 270.0d ? new float[]{-f14, -f13} : new float[]{-f14, f13};
        }
        float f15 = fArr[1] - (fArr[0] * f11);
        float f16 = f15 / (fTan - f11);
        float f17 = (f11 * f16) + f15;
        return new Pair<>(new float[]{f14 - f16, f13 + f17}, new float[]{f14 + f16, f13 - f17});
    }

    /* JADX INFO: compiled from: LinearGradient.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.Keywords.values().length];
            try {
                iArr[Direction.Keywords.TO_TOP_RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.Keywords.TO_BOTTOM_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Direction.Keywords.TO_TOP_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Direction.Keywords.TO_BOTTOM_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public LinearGradient(@NotNull ReadableMap directionMap, @NotNull int[] colors, @NotNull float[] positions) {
        Direction.Keywords keywords;
        Direction keyword;
        Intrinsics.checkNotNullParameter(directionMap, "directionMap");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(positions, "positions");
        this.colors = colors;
        this.positions = positions;
        String string = directionMap.getString("type");
        if (!Intrinsics.areEqual(string, LinearGradientManager.PROP_ANGLE)) {
            if (!Intrinsics.areEqual(string, "keyword")) {
                throw new IllegalArgumentException("Invalid direction type: " + string);
            }
            String string2 = directionMap.getString("value");
            if (string2 != null) {
                switch (string2.hashCode()) {
                    case -1849920841:
                        if (string2.equals("to bottom left")) {
                            keywords = Direction.Keywords.TO_BOTTOM_LEFT;
                            keyword = new Direction.Keyword(keywords);
                        }
                        break;
                    case -1507310228:
                        if (string2.equals("to bottom right")) {
                            keywords = Direction.Keywords.TO_BOTTOM_RIGHT;
                            keyword = new Direction.Keyword(keywords);
                        }
                        break;
                    case -1359525897:
                        if (string2.equals("to top left")) {
                            keywords = Direction.Keywords.TO_TOP_LEFT;
                            keyword = new Direction.Keyword(keywords);
                        }
                        break;
                    case 810031148:
                        if (string2.equals("to top right")) {
                            keywords = Direction.Keywords.TO_TOP_RIGHT;
                            keyword = new Direction.Keyword(keywords);
                        }
                        break;
                }
            }
            throw new IllegalArgumentException("Invalid linear gradient direction keyword: " + directionMap.getString("value"));
        }
        keyword = new Direction.Angle(directionMap.getDouble("value"));
        this.direction = keyword;
    }

    private final double getAngleForKeyword(Direction.Keywords keyword, double width, double height) {
        double degrees;
        double d11;
        int i11;
        int i12 = WhenMappings.$EnumSwitchMapping$0[keyword.ordinal()];
        if (i12 == 1) {
            return ((double) 90) - Math.toDegrees(Math.atan(width / height));
        }
        if (i12 != 2) {
            if (i12 == 3) {
                degrees = Math.toDegrees(Math.atan(width / height));
                i11 = 270;
            } else {
                if (i12 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                degrees = Math.toDegrees(Math.atan(height / width));
                i11 = 180;
            }
            d11 = i11;
        } else {
            degrees = Math.toDegrees(Math.atan(width / height));
            d11 = 90;
        }
        return degrees + d11;
    }

    @NotNull
    public final Shader getShader(float width, float height) {
        LinearGradient linearGradient;
        double angleForKeyword;
        Direction direction = this.direction;
        if (direction instanceof Direction.Angle) {
            angleForKeyword = ((Direction.Angle) direction).getValue();
            linearGradient = this;
        } else {
            if (!(direction instanceof Direction.Keyword)) {
                throw new NoWhenBranchMatchedException();
            }
            linearGradient = this;
            angleForKeyword = linearGradient.getAngleForKeyword(((Direction.Keyword) direction).getValue(), width, height);
        }
        Pair<float[], float[]> pairEndPointsFromAngle = endPointsFromAngle(angleForKeyword, height, width);
        float[] fArrComponent1 = pairEndPointsFromAngle.component1();
        float[] fArrComponent2 = pairEndPointsFromAngle.component2();
        return new android.graphics.LinearGradient(fArrComponent1[0], fArrComponent1[1], fArrComponent2[0], fArrComponent2[1], linearGradient.colors, linearGradient.positions, Shader.TileMode.CLAMP);
    }
}
