package androidx.graphics.shapes;

import androidx.collection.FloatList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: FloatMapping.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0000¨\u0006\u000e"}, m90084d2 = {"linearMap", "", "xValues", "Landroidx/collection/FloatList;", "yValues", "x", "progressInRange", "", "progress", "progressFrom", "progressTo", "validateProgress", "", "p", "graphics-shapes_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFloatMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatMapping.kt\nandroidx/graphics/shapes/FloatMappingKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FloatList.kt\nandroidx/collection/FloatList\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,99:1\n1#2:100\n75#3:101\n190#3,3:104\n253#3,4:107\n193#3,2:111\n258#3:113\n195#3:114\n223#4,2:102\n1774#4,4:115\n*S KotlinDebug\n*F\n+ 1 FloatMapping.kt\nandroidx/graphics/shapes/FloatMappingKt\n*L\n42#1:101\n93#1:104,3\n93#1:107,4\n93#1:111,2\n93#1:113\n93#1:114\n42#1:102,2\n96#1:115,4\n*E\n"})
public final class FloatMappingKt {
    public static final boolean progressInRange(float f11, float f12, float f13) {
        if (f13 >= f12) {
            return f12 <= f11 && f11 <= f13;
        }
        return f11 >= f12 || f11 <= f13;
    }

    public static final float linearMap(@NotNull FloatList xValues, @NotNull FloatList yValues, float f11) {
        float fPositiveModulo;
        Intrinsics.checkNotNullParameter(xValues, "xValues");
        Intrinsics.checkNotNullParameter(yValues, "yValues");
        if (0.0f <= f11 && f11 <= 1.0f) {
            Iterator<Integer> it = RangesKt.until(0, xValues._size).iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                int i11 = iNextInt + 1;
                if (progressInRange(f11, xValues.get(iNextInt), xValues.get(i11 % xValues.getSize()))) {
                    int size = i11 % xValues.getSize();
                    float fPositiveModulo2 = Utils.positiveModulo(xValues.get(size) - xValues.get(iNextInt), 1.0f);
                    float fPositiveModulo3 = Utils.positiveModulo(yValues.get(size) - yValues.get(iNextInt), 1.0f);
                    if (fPositiveModulo2 < 0.001f) {
                        fPositiveModulo = 0.5f;
                    } else {
                        fPositiveModulo = Utils.positiveModulo(f11 - xValues.get(iNextInt), 1.0f) / fPositiveModulo2;
                    }
                    return Utils.positiveModulo(yValues.get(iNextInt) + (fPositiveModulo3 * fPositiveModulo), 1.0f);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        throw new IllegalArgumentException(("Invalid progress: " + f11).toString());
    }

    public static final void validateProgress(@NotNull FloatList p11) {
        int i11;
        Intrinsics.checkNotNullParameter(p11, "p");
        Boolean boolValueOf = Boolean.TRUE;
        float[] fArr = p11.content;
        int i12 = p11._size;
        boolean z11 = false;
        int i13 = 0;
        while (true) {
            boolean z12 = true;
            if (i13 >= i12) {
                break;
            }
            float f11 = fArr[i13];
            if (!boolValueOf.booleanValue() || 0.0f > f11 || f11 > 1.0f) {
                z12 = false;
            }
            boolValueOf = Boolean.valueOf(z12);
            i13++;
        }
        if (boolValueOf.booleanValue()) {
            Iterable iterableUntil = RangesKt.until(1, p11.getSize());
            if ((iterableUntil instanceof Collection) && ((Collection) iterableUntil).isEmpty()) {
                i11 = 0;
            } else {
                Iterator it = iterableUntil.iterator();
                i11 = 0;
                while (it.hasNext()) {
                    int iNextInt = ((IntIterator) it).nextInt();
                    if (p11.get(iNextInt) < p11.get(iNextInt - 1) && (i11 = i11 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            if (i11 <= 1) {
                z11 = true;
            }
            if (z11) {
                return;
            }
            throw new IllegalArgumentException(("FloatMapping - Progress wraps more than once: " + FloatList.joinToString$default(p11, null, null, null, 0, null, 31, null)).toString());
        }
        throw new IllegalArgumentException(("FloatMapping - Progress outside of range: " + FloatList.joinToString$default(p11, null, null, null, 0, null, 31, null)).toString());
    }
}
