package io.trtc.tuikit.atomicx.theme.utils;

import android.content.Context;
import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.BaseActivity;
import com.tencent.bugly.proguard.RunnableC33958ua;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import io.trtc.tuikit.atomicx.R$color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.Triple;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.CharsKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: ColorAlgorithm.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001'B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\nH\u0007J&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nH\u0002J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\nH\u0002J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J$\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u0018H\u0002J<\u0010\u001d\u001a\u00020\u00192\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u001f2\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u001fH\u0002J\"\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u001f2\u0006\u0010\"\u001a\u00020\nH\u0002J \u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u0019H\u0002R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u0017\u001a&\u0012\u0004\u0012\u00020\n\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u00180\u00120\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, m90084d2 = {"Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm;", "", "<init>", "()V", "generateColorPalette", "", "", "context", "Landroid/content/Context;", "baseColor", "", BaseActivity.THEME, "parseHexColor", "hexColor", "getPaletteFromResources", "type", "Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm$PaletteType;", "STANDARD_COLORS", "", "isStandardColor", "", "color", "getClosestPaletteType", "HSL_ADJUSTMENTS", "Lkotlin/Pair;", "", "generateDynamicColorVariations", "adjustColor", "adjustment", "colorDistance", "c1", "Lkotlin/Triple;", "c2", "hexToHSL", "hex", "hslToHex", CmcdData.Factory.STREAMING_FORMAT_HLS, CmcdData.Factory.STREAMING_FORMAT_SS, CmcdData.Factory.STREAM_TYPE_LIVE, "PaletteType", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nColorAlgorithm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorAlgorithm.kt\nio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,258:1\n470#2:259\n1563#3:260\n1634#3,3:261\n1761#3,3:264\n2423#3,14:271\n126#4:267\n153#4,3:268\n*S KotlinDebug\n*F\n+ 1 ColorAlgorithm.kt\nio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm\n*L\n23#1:259\n101#1:260\n101#1:261,3\n113#1:264,3\n131#1:271,14\n127#1:267\n127#1:268,3\n*E\n"})
public final class ColorAlgorithm {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ColorAlgorithm f87413a = new ColorAlgorithm();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Map<PaletteType, String> f87414b = MapsKt.mapOf(TuplesKt.m90091to(PaletteType.BLUE, "#1c66e5"), TuplesKt.m90091to(PaletteType.GREEN, "#0abf77"), TuplesKt.m90091to(PaletteType.RED, "#e54545"), TuplesKt.m90091to(PaletteType.ORANGE, "#ff7200"));

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Map<String, Map<Integer, Pair<Double, Double>>> f87415c;

    /* JADX INFO: compiled from: ColorAlgorithm.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm$PaletteType;", "", "<init>", "(Ljava/lang/String;I)V", "BLUE", "GREEN", "RED", "ORANGE", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum PaletteType {
        BLUE,
        GREEN,
        RED,
        ORANGE;


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f87417c = EnumEntriesKt.enumEntries(m88028a());

        @NotNull
        public static EnumEntries<PaletteType> getEntries() {
            return f87417c;
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.theme.utils.ColorAlgorithm$a */
    /* JADX INFO: compiled from: ColorAlgorithm.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C39351a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaletteType.values().length];
            try {
                iArr[PaletteType.BLUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaletteType.GREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaletteType.RED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaletteType.ORANGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Double dValueOf = Double.valueOf(-40.0d);
        Double dValueOf2 = Double.valueOf(45.0d);
        Pair pairM90091to = TuplesKt.m90091to(1, new Pair(dValueOf, dValueOf2));
        Double dValueOf3 = Double.valueOf(-30.0d);
        Pair pairM90091to2 = TuplesKt.m90091to(2, new Pair(dValueOf3, Double.valueOf(35.0d)));
        Double dValueOf4 = Double.valueOf(-20.0d);
        Pair pairM90091to3 = TuplesKt.m90091to(3, new Pair(dValueOf4, Double.valueOf(25.0d)));
        Double dValueOf5 = Double.valueOf(-10.0d);
        Double dValueOf6 = Double.valueOf(15.0d);
        Pair pairM90091to4 = TuplesKt.m90091to(4, new Pair(dValueOf5, dValueOf6));
        Double dValueOf7 = Double.valueOf(-5.0d);
        Double dValueOf8 = Double.valueOf(5.0d);
        Pair pairM90091to5 = TuplesKt.m90091to(5, new Pair(dValueOf7, dValueOf8));
        Double dValueOf9 = Double.valueOf(0.0d);
        f87415c = MapsKt.mapOf(TuplesKt.m90091to("light", MapsKt.mapOf(pairM90091to, pairM90091to2, pairM90091to3, pairM90091to4, pairM90091to5, TuplesKt.m90091to(6, new Pair(dValueOf9, dValueOf9)), TuplesKt.m90091to(7, new Pair(dValueOf8, dValueOf5)), TuplesKt.m90091to(8, new Pair(Double.valueOf(10.0d), dValueOf4)), TuplesKt.m90091to(9, new Pair(dValueOf6, dValueOf3)), TuplesKt.m90091to(10, new Pair(Double.valueOf(20.0d), dValueOf)))), TuplesKt.m90091to("dark", MapsKt.mapOf(TuplesKt.m90091to(1, new Pair(Double.valueOf(-60.0d), Double.valueOf(-35.0d))), TuplesKt.m90091to(2, new Pair(Double.valueOf(-50.0d), Double.valueOf(-25.0d))), TuplesKt.m90091to(3, new Pair(dValueOf, Double.valueOf(-15.0d))), TuplesKt.m90091to(4, new Pair(dValueOf3, dValueOf7)), TuplesKt.m90091to(5, new Pair(dValueOf4, dValueOf8)), TuplesKt.m90091to(6, new Pair(dValueOf9, dValueOf9)), TuplesKt.m90091to(7, new Pair(dValueOf5, dValueOf6)), TuplesKt.m90091to(8, new Pair(dValueOf4, Double.valueOf(30.0d))), TuplesKt.m90091to(9, new Pair(dValueOf3, dValueOf2)), TuplesKt.m90091to(10, new Pair(dValueOf, Double.valueOf(60.0d))))));
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<Integer> m88020c(@NotNull Context context, @NotNull String baseColor, @NotNull String theme) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(baseColor, "baseColor");
        Intrinsics.checkNotNullParameter(theme, "theme");
        return m88026i(baseColor) ? m88023f(context, m88022e(baseColor), theme) : m88021d(baseColor, theme);
    }

    /* JADX INFO: renamed from: d */
    public final List<Integer> m88021d(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Map<String, Map<Integer, Pair<Double, Double>>> map = f87415c;
        Map<Integer, Pair<Double, Double>> map2 = map.get(str2);
        if (map2 == null) {
            Map<Integer, Pair<Double, Double>> map3 = map.get("light");
            Intrinsics.checkNotNull(map3);
            map2 = map3;
        }
        Triple<Double, Double, Double> tripleM88024g = m88024g(str);
        double d11 = 1.0d;
        double d12 = tripleM88024g.getSecond().doubleValue() > 70.0d ? 0.8d : tripleM88024g.getSecond().doubleValue() < 30.0d ? 1.2d : 1.0d;
        if (tripleM88024g.getThird().doubleValue() > 70.0d) {
            d11 = 0.8d;
        } else if (tripleM88024g.getThird().doubleValue() < 30.0d) {
            d11 = 1.2d;
        }
        for (int i11 = 1; i11 < 11; i11++) {
            Pair<Double, Double> pair = map2.get(Integer.valueOf(i11));
            if (pair == null) {
                pair = new Pair<>(Double.valueOf(0.0d), Double.valueOf(0.0d));
            }
            arrayList.add(Integer.valueOf(m88027j(m88018a(str, new Pair<>(Double.valueOf(pair.getFirst().doubleValue() * d12), Double.valueOf(pair.getSecond().doubleValue() * d11))))));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final List<Integer> m88023f(Context context, PaletteType paletteType, String str) {
        List listListOf;
        int i11 = C39351a.$EnumSwitchMapping$0[paletteType.ordinal()];
        if (i11 == 1) {
            listListOf = Intrinsics.areEqual(str, "dark") ? CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R$color.theme_dark_1), Integer.valueOf(R$color.theme_dark_2), Integer.valueOf(R$color.theme_dark_3), Integer.valueOf(R$color.theme_dark_4), Integer.valueOf(R$color.theme_dark_5), Integer.valueOf(R$color.theme_dark_6), Integer.valueOf(R$color.theme_dark_7), Integer.valueOf(R$color.theme_dark_8), Integer.valueOf(R$color.theme_dark_9), Integer.valueOf(R$color.theme_dark_10)}) : CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R$color.theme_light_1), Integer.valueOf(R$color.theme_light_2), Integer.valueOf(R$color.theme_light_3), Integer.valueOf(R$color.theme_light_4), Integer.valueOf(R$color.theme_light_5), Integer.valueOf(R$color.theme_light_6), Integer.valueOf(R$color.theme_light_7), Integer.valueOf(R$color.theme_light_8), Integer.valueOf(R$color.theme_light_9), Integer.valueOf(R$color.theme_light_10)});
        } else if (i11 == 2) {
            listListOf = Intrinsics.areEqual(str, "dark") ? CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R$color.green_dark_1), Integer.valueOf(R$color.green_dark_2), Integer.valueOf(R$color.green_dark_3), Integer.valueOf(R$color.green_dark_4), Integer.valueOf(R$color.green_dark_5), Integer.valueOf(R$color.green_dark_6), Integer.valueOf(R$color.green_dark_7), Integer.valueOf(R$color.green_dark_8), Integer.valueOf(R$color.green_dark_9), Integer.valueOf(R$color.green_dark_10)}) : CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R$color.green_light_1), Integer.valueOf(R$color.green_light_2), Integer.valueOf(R$color.green_light_3), Integer.valueOf(R$color.green_light_4), Integer.valueOf(R$color.green_light_5), Integer.valueOf(R$color.green_light_6), Integer.valueOf(R$color.green_light_7), Integer.valueOf(R$color.green_light_8), Integer.valueOf(R$color.green_light_9), Integer.valueOf(R$color.green_light_10)});
        } else if (i11 == 3) {
            listListOf = Intrinsics.areEqual(str, "dark") ? CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R$color.red_dark_1), Integer.valueOf(R$color.red_dark_2), Integer.valueOf(R$color.red_dark_3), Integer.valueOf(R$color.red_dark_4), Integer.valueOf(R$color.red_dark_5), Integer.valueOf(R$color.red_dark_6), Integer.valueOf(R$color.red_dark_7), Integer.valueOf(R$color.red_dark_8), Integer.valueOf(R$color.red_dark_9), Integer.valueOf(R$color.red_dark_10)}) : CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R$color.red_light_1), Integer.valueOf(R$color.red_light_2), Integer.valueOf(R$color.red_light_3), Integer.valueOf(R$color.red_light_4), Integer.valueOf(R$color.red_light_5), Integer.valueOf(R$color.red_light_6), Integer.valueOf(R$color.red_light_7), Integer.valueOf(R$color.red_light_8), Integer.valueOf(R$color.red_light_9), Integer.valueOf(R$color.red_light_10)});
        } else {
            if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            listListOf = Intrinsics.areEqual(str, "dark") ? CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R$color.orange_dark_1), Integer.valueOf(R$color.orange_dark_2), Integer.valueOf(R$color.orange_dark_3), Integer.valueOf(R$color.orange_dark_4), Integer.valueOf(R$color.orange_dark_5), Integer.valueOf(R$color.orange_dark_6), Integer.valueOf(R$color.orange_dark_7), Integer.valueOf(R$color.orange_dark_8), Integer.valueOf(R$color.orange_dark_9), Integer.valueOf(R$color.orange_dark_10)}) : CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R$color.orange_light_1), Integer.valueOf(R$color.orange_light_2), Integer.valueOf(R$color.orange_light_3), Integer.valueOf(R$color.orange_light_4), Integer.valueOf(R$color.orange_light_5), Integer.valueOf(R$color.orange_light_6), Integer.valueOf(R$color.orange_light_7), Integer.valueOf(R$color.orange_light_8), Integer.valueOf(R$color.orange_light_9), Integer.valueOf(R$color.orange_light_10)});
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(ContextCompat.getColor(context, ((Number) it.next()).intValue())));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public final Triple<Double, Double, Double> m88024g(String str) {
        double d11;
        long j11 = Long.parseLong(StringsKt.removePrefix(str, (CharSequence) RunnableC33958ua.f72251f), CharsKt.checkRadix(16));
        double d12 = ((j11 >> 16) & 255) / 255.0d;
        double d13 = ((j11 >> 8) & 255) / 255.0d;
        double d14 = (j11 & 255) / 255.0d;
        double dMax = Math.max(d12, Math.max(d13, d14));
        double dMin = Math.min(d12, Math.min(d13, d14));
        double d15 = dMax + dMin;
        double d16 = d15 / 2.0d;
        double d17 = 0.0d;
        if (dMax == dMin) {
            d11 = 0.0d;
        } else {
            double d18 = dMax - dMin;
            if (d16 > 0.5d) {
                d15 = (2.0d - dMax) - dMin;
            }
            d11 = d18 / d15;
            if (dMax == d12) {
                d17 = ((d13 - d14) / d18) + (d13 < d14 ? 6.0d : 0.0d);
            } else if (dMax == d13) {
                d17 = ((d14 - d12) / d18) + 2.0d;
            } else if (dMax == d14) {
                d17 = ((d12 - d13) / d18) + 4.0d;
            }
            d17 /= 6.0d;
        }
        return new Triple<>(Double.valueOf(d17 * 360.0d), Double.valueOf(d11 * 100.0d), Double.valueOf(d16 * 100.0d));
    }

    @ColorInt
    /* JADX INFO: renamed from: j */
    public final int m88027j(@NotNull String hexColor) {
        Intrinsics.checkNotNullParameter(hexColor, "hexColor");
        return Color.parseColor('#' + StringsKt.removePrefix(hexColor, (CharSequence) RunnableC33958ua.f72251f));
    }

    /* JADX INFO: renamed from: a */
    public final String m88018a(String str, Pair<Double, Double> pair) {
        Triple<Double, Double, Double> tripleM88024g = m88024g(str);
        return m88025h(tripleM88024g.getFirst().doubleValue(), Math.max(0.0d, Math.min(100.0d, tripleM88024g.getSecond().doubleValue() + pair.getFirst().doubleValue())), Math.max(0.0d, Math.min(100.0d, tripleM88024g.getThird().doubleValue() + pair.getSecond().doubleValue())));
    }

    /* JADX INFO: renamed from: b */
    public final double m88019b(Triple<Double, Double, Double> triple, Triple<Double, Double, Double> triple2) {
        double dMin = Math.min(Math.abs(triple.getFirst().doubleValue() - triple2.getFirst().doubleValue()), ((double) TXVodDownloadDataSource.QUALITY_360P) - Math.abs(triple.getFirst().doubleValue() - triple2.getFirst().doubleValue()));
        double dDoubleValue = triple.getSecond().doubleValue() - triple2.getSecond().doubleValue();
        double dDoubleValue2 = triple.getThird().doubleValue() - triple2.getThird().doubleValue();
        return Math.sqrt((dMin * dMin) + (dDoubleValue * dDoubleValue) + (dDoubleValue2 * dDoubleValue2));
    }

    /* JADX INFO: renamed from: e */
    public final PaletteType m88022e(String str) {
        Object obj;
        PaletteType paletteType;
        Triple<Double, Double, Double> tripleM88024g = m88024g(str);
        Map<PaletteType, String> map = f87414b;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<PaletteType, String> entry : map.entrySet()) {
            PaletteType key = entry.getKey();
            String value = entry.getValue();
            ColorAlgorithm colorAlgorithm = f87413a;
            arrayList.add(TuplesKt.m90091to(key, Double.valueOf(colorAlgorithm.m88019b(tripleM88024g, colorAlgorithm.m88024g(value)))));
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            if (it.hasNext()) {
                double dDoubleValue = ((Number) ((Pair) next).getSecond()).doubleValue();
                do {
                    Object next2 = it.next();
                    double dDoubleValue2 = ((Number) ((Pair) next2).getSecond()).doubleValue();
                    if (Double.compare(dDoubleValue, dDoubleValue2) > 0) {
                        next = next2;
                        dDoubleValue = dDoubleValue2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        }
        Pair pair = (Pair) obj;
        if (pair != null && (paletteType = (PaletteType) pair.getFirst()) != null) {
            return paletteType;
        }
        return PaletteType.BLUE;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m88026i(String str) {
        Triple<Double, Double, Double> tripleM88024g = m88024g(str);
        Collection<String> collectionValues = f87414b.values();
        if (collectionValues != null && collectionValues.isEmpty()) {
            return false;
        }
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            Triple<Double, Double, Double> tripleM88024g2 = f87413a.m88024g((String) it.next());
            if (Math.min(Math.abs(tripleM88024g.getFirst().doubleValue() - tripleM88024g2.getFirst().doubleValue()), ((double) TXVodDownloadDataSource.QUALITY_360P) - Math.abs(tripleM88024g.getFirst().doubleValue() - tripleM88024g2.getFirst().doubleValue())) < 15.0d && Math.abs(tripleM88024g.getSecond().doubleValue() - tripleM88024g2.getSecond().doubleValue()) < 15.0d && Math.abs(tripleM88024g.getThird().doubleValue() - tripleM88024g2.getThird().doubleValue()) < 15.0d) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final String m88025h(double d11, double d12, double d13) {
        Triple triple;
        double d14 = d13 / 100.0d;
        double dAbs = (1.0d - Math.abs((d14 * 2.0d) - 1.0d)) * (d12 / 100.0d);
        double d15 = (d11 / 360.0d) * 6.0d;
        double dAbs2 = (1.0d - Math.abs((d15 % 2.0d) - 1.0d)) * dAbs;
        double d16 = d14 - (dAbs / 2.0d);
        int i11 = (int) d15;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                triple = new Triple(Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d));
                            } else {
                                triple = new Triple(Double.valueOf(dAbs), Double.valueOf(0.0d), Double.valueOf(dAbs2));
                            }
                        } else {
                            triple = new Triple(Double.valueOf(dAbs2), Double.valueOf(0.0d), Double.valueOf(dAbs));
                        }
                    } else {
                        triple = new Triple(Double.valueOf(0.0d), Double.valueOf(dAbs2), Double.valueOf(dAbs));
                    }
                } else {
                    triple = new Triple(Double.valueOf(0.0d), Double.valueOf(dAbs), Double.valueOf(dAbs2));
                }
            } else {
                triple = new Triple(Double.valueOf(dAbs2), Double.valueOf(dAbs), Double.valueOf(0.0d));
            }
        } else {
            triple = new Triple(Double.valueOf(dAbs), Double.valueOf(dAbs2), Double.valueOf(0.0d));
        }
        double dDoubleValue = ((Number) triple.component1()).doubleValue();
        double dDoubleValue2 = ((Number) triple.component2()).doubleValue();
        double dDoubleValue3 = ((Number) triple.component3()).doubleValue();
        String str = String.format("#%02X%02X%02X", Arrays.copyOf(new Object[]{Integer.valueOf((int) ((dDoubleValue + d16) * 255.0d)), Integer.valueOf((int) ((dDoubleValue2 + d16) * 255.0d)), Integer.valueOf((int) ((dDoubleValue3 + d16) * 255.0d))}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
