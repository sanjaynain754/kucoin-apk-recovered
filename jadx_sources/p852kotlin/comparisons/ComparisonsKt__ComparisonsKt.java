package p852kotlin.comparisons;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Comparator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.internal.InlineOnly;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Comparisons.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0007\u001aY\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\u0006\u0010\u0004\u001a\u0002H\u000226\u0010\u0005\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\b0\u00070\u0006\"\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\b0\u0007¢\u0006\u0002\u0010\t\u001aG\u0010\n\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\u0006\u0010\u0004\u001a\u0002H\u00022 \u0010\u0005\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\b0\u00070\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\t\u001aA\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\u0006\u0010\u0004\u001a\u0002H\u00022\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\b0\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\r\u001a]\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u000e2\u0006\u0010\u0003\u001a\u0002H\u00022\u0006\u0010\u0004\u001a\u0002H\u00022\u001a\u0010\u000f\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000e0\u0010j\n\u0012\u0006\b\u0000\u0012\u0002H\u000e`\u00112\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000e0\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a-\u0010\u0013\u001a\u00020\u0001\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\b2\b\u0010\u0003\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0004\u001a\u0004\u0018\u0001H\u0002¢\u0006\u0002\u0010\u0014\u001aY\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u0011\"\u0004\b\u0000\u0010\u000226\u0010\u0005\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\b0\u00070\u0006\"\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\b0\u0007¢\u0006\u0002\u0010\u0016\u001aC\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u0011\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\f\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\b0\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0017\u001a_\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u0011\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u000e2\u001a\u0010\u000f\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000e0\u0010j\n\u0012\u0006\b\u0000\u0012\u0002H\u000e`\u00112\u0014\b\u0004\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000e0\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001aC\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u0011\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\f\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\b0\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0017\u001a_\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u0011\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u000e2\u001a\u0010\u000f\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000e0\u0010j\n\u0012\u0006\b\u0000\u0012\u0002H\u000e`\u00112\u0014\b\u0004\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000e0\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001aW\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u0011\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u00112\u001a\b\u0004\u0010\f\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\b0\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001as\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u0011\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u000e*\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u00112\u001a\u0010\u000f\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000e0\u0010j\n\u0012\u0006\b\u0000\u0012\u0002H\u000e`\u00112\u0014\b\u0004\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000e0\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001b\u001aW\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u0011\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u00112\u001a\b\u0004\u0010\f\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\b0\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001as\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u0011\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u000e*\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u00112\u001a\u0010\u000f\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000e0\u0010j\n\u0012\u0006\b\u0000\u0012\u0002H\u000e`\u00112\u0014\b\u0004\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000e0\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001b\u001au\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u0011\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u001128\b\u0004\u0010\u001e\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00010\u001fH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\"\u001aT\u0010#\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u0011\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u00112\u001a\u0010\u000f\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0010j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0011H\u0086\u0004¢\u0006\u0002\u0010$\u001aT\u0010%\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u0011\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u00112\u001a\u0010\u000f\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0010j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0011H\u0086\u0004¢\u0006\u0002\u0010$\u001aE\u0010&\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0010j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0011\"\b\b\u0000\u0010\u0002*\u00020'2\u001a\u0010\u000f\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0010j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0011¢\u0006\u0002\u0010(\u001a2\u0010&\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0010j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0011\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\bH\u0087\b¢\u0006\u0002\u0010)\u001aE\u0010*\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0010j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0011\"\b\b\u0000\u0010\u0002*\u00020'2\u001a\u0010\u000f\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0010j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0011¢\u0006\u0002\u0010(\u001a2\u0010*\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0010j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0011\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\bH\u0087\b¢\u0006\u0002\u0010)\u001a+\u0010+\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u0011\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b¢\u0006\u0002\u0010)\u001a+\u0010,\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u0011\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b¢\u0006\u0002\u0010)\u001a5\u0010-\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u0011\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0010j\b\u0012\u0004\u0012\u0002H\u0002`\u0011¢\u0006\u0002\u0010(\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006."}, m90084d2 = {"compareValuesBy", "", ExifInterface.GPS_DIRECTION_TRUE, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "selectors", "", "Lkotlin/Function1;", "", "(Ljava/lang/Object;Ljava/lang/Object;[Lkotlin/jvm/functions/Function1;)I", "compareValuesByImpl", "compareValuesByImpl$ComparisonsKt__ComparisonsKt", "selector", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)I", "K", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)I", "compareValues", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)I", "compareBy", "([Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;", "(Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;", "(Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;", "compareByDescending", "thenBy", "(Ljava/util/Comparator;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;", "thenByDescending", "thenComparator", "comparison", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "(Ljava/util/Comparator;Lkotlin/jvm/functions/Function2;)Ljava/util/Comparator;", "then", "(Ljava/util/Comparator;Ljava/util/Comparator;)Ljava/util/Comparator;", "thenDescending", "nullsFirst", "", "(Ljava/util/Comparator;)Ljava/util/Comparator;", "()Ljava/util/Comparator;", "nullsLast", "naturalOrder", "reverseOrder", "reversed", "kotlin-stdlib"}, m90085k = 5, m90086mv = {2, 2, 0}, m90088xi = 49, m90089xs = "kotlin/comparisons/ComparisonsKt")
public class ComparisonsKt__ComparisonsKt {

    /* JADX INFO: renamed from: kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareBy$2 */
    /* JADX INFO: compiled from: Comparisons.kt */
    /* JADX INFO: loaded from: classes61.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 176)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n*L\n1#1,328:1\n*E\n"})
    public static final class C411272<T> implements Comparator {
        final /* synthetic */ Function1<T, Comparable<?>> $selector;

        /* JADX WARN: Multi-variable type inference failed */
        public C411272(Function1<? super T, ? extends Comparable<?>> function1) {
            this.$selector = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            Function1<T, Comparable<?>> function1 = this.$selector;
            return ComparisonsKt__ComparisonsKt.compareValues(function1.invoke(t11), function1.invoke(t12));
        }
    }

    /* JADX INFO: renamed from: kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareByDescending$1 */
    /* JADX INFO: compiled from: Comparisons.kt */
    /* JADX INFO: loaded from: classes61.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 176)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n*L\n1#1,328:1\n*E\n"})
    public static final class C411291<T> implements Comparator {
        final /* synthetic */ Function1<T, Comparable<?>> $selector;

        /* JADX WARN: Multi-variable type inference failed */
        public C411291(Function1<? super T, ? extends Comparable<?>> function1) {
            this.$selector = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            Function1<T, Comparable<?>> function1 = this.$selector;
            return ComparisonsKt__ComparisonsKt.compareValues(function1.invoke(t12), function1.invoke(t11));
        }
    }

    @NotNull
    public static <T> Comparator<T> compareBy(@NotNull final Function1<? super T, ? extends Comparable<?>>... selectors) {
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        if (selectors.length > 0) {
            return new Comparator() { // from class: kotlin.comparisons.d
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ComparisonsKt__ComparisonsKt.compareBy$lambda$0$ComparisonsKt__ComparisonsKt(selectors, obj, obj2);
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @InlineOnly
    private static final <T> Comparator<T> compareByDescending(Function1<? super T, ? extends Comparable<?>> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new C411291(selector);
    }

    public static <T> int compareValuesBy(T t11, T t12, @NotNull Function1<? super T, ? extends Comparable<?>>... selectors) {
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        if (selectors.length > 0) {
            return compareValuesByImpl$ComparisonsKt__ComparisonsKt(t11, t12, selectors);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    private static final <T> int compareValuesByImpl$ComparisonsKt__ComparisonsKt(T t11, T t12, Function1<? super T, ? extends Comparable<?>>[] function1Arr) {
        for (Function1<? super T, ? extends Comparable<?>> function1 : function1Arr) {
            int iCompareValues = compareValues(function1.invoke(t11), function1.invoke(t12));
            if (iCompareValues != 0) {
                return iCompareValues;
            }
        }
        return 0;
    }

    @NotNull
    public static final <T> Comparator<T> nullsFirst(@NotNull final Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ComparisonsKt__ComparisonsKt.nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt(comparator, obj, obj2);
            }
        };
    }

    @NotNull
    public static final <T> Comparator<T> nullsLast(@NotNull final Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ComparisonsKt__ComparisonsKt.nullsLast$lambda$4$ComparisonsKt__ComparisonsKt(comparator, obj, obj2);
            }
        };
    }

    @InlineOnly
    private static final <T> Comparator<T> thenBy(final Comparator<T> comparator, final Function1<? super T, ? extends Comparable<?>> selector) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt.thenBy.1
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                int iCompare = comparator.compare(t11, t12);
                if (iCompare != 0) {
                    return iCompare;
                }
                Function1<T, Comparable<?>> function1 = selector;
                return ComparisonsKt__ComparisonsKt.compareValues(function1.invoke(t11), function1.invoke(t12));
            }
        };
    }

    @InlineOnly
    private static final <T> Comparator<T> thenByDescending(final Comparator<T> comparator, final Function1<? super T, ? extends Comparable<?>> selector) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt.thenByDescending.1
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                int iCompare = comparator.compare(t11, t12);
                if (iCompare != 0) {
                    return iCompare;
                }
                Function1<T, Comparable<?>> function1 = selector;
                return ComparisonsKt__ComparisonsKt.compareValues(function1.invoke(t12), function1.invoke(t11));
            }
        };
    }

    @InlineOnly
    private static final <T, K> Comparator<T> compareByDescending(final Comparator<? super K> comparator, final Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt.compareByDescending.2
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                Comparator<? super K> comparator2 = comparator;
                Function1<T, K> function1 = selector;
                return comparator2.compare((Object) function1.invoke(t12), (Object) function1.invoke(t11));
            }
        };
    }

    public static <T extends Comparable<?>> int compareValues(@Nullable T t11, @Nullable T t12) {
        if (t11 == t12) {
            return 0;
        }
        if (t11 == null) {
            return -1;
        }
        if (t12 == null) {
            return 1;
        }
        return t11.compareTo(t12);
    }

    @NotNull
    public static <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
        NaturalOrderComparator naturalOrderComparator = NaturalOrderComparator.INSTANCE;
        Intrinsics.checkNotNull(naturalOrderComparator, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
        return naturalOrderComparator;
    }

    @InlineOnly
    private static final <T extends Comparable<? super T>> Comparator<T> nullsFirst() {
        return nullsFirst(naturalOrder());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt(Comparator comparator, Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return comparator.compare(obj, obj2);
    }

    @InlineOnly
    private static final <T extends Comparable<? super T>> Comparator<T> nullsLast() {
        return nullsLast(naturalOrder());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nullsLast$lambda$4$ComparisonsKt__ComparisonsKt(Comparator comparator, Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return comparator.compare(obj, obj2);
    }

    @NotNull
    public static <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
        ReverseOrderComparator reverseOrderComparator = ReverseOrderComparator.INSTANCE;
        Intrinsics.checkNotNull(reverseOrderComparator, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>");
        return reverseOrderComparator;
    }

    @NotNull
    public static final <T> Comparator<T> reversed(@NotNull Comparator<T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        if (comparator instanceof ReversedComparator) {
            return ((ReversedComparator) comparator).getComparator();
        }
        NaturalOrderComparator naturalOrderComparator = NaturalOrderComparator.INSTANCE;
        if (Intrinsics.areEqual(comparator, naturalOrderComparator)) {
            ReverseOrderComparator reverseOrderComparator = ReverseOrderComparator.INSTANCE;
            Intrinsics.checkNotNull(reverseOrderComparator, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>");
            return reverseOrderComparator;
        }
        if (!Intrinsics.areEqual(comparator, ReverseOrderComparator.INSTANCE)) {
            return new ReversedComparator(comparator);
        }
        Intrinsics.checkNotNull(naturalOrderComparator, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>");
        return naturalOrderComparator;
    }

    @NotNull
    public static final <T> Comparator<T> then(@NotNull final Comparator<T> comparator, @NotNull final Comparator<? super T> comparator2) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(comparator2, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ComparisonsKt__ComparisonsKt.then$lambda$1$ComparisonsKt__ComparisonsKt(comparator, comparator2, obj, obj2);
            }
        };
    }

    @InlineOnly
    private static final <T, K> Comparator<T> thenBy(final Comparator<T> comparator, final Comparator<? super K> comparator2, final Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(comparator2, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt.thenBy.2
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                int iCompare = comparator.compare(t11, t12);
                if (iCompare != 0) {
                    return iCompare;
                }
                Comparator<? super K> comparator3 = comparator2;
                Function1<T, K> function1 = selector;
                return comparator3.compare((Object) function1.invoke(t11), (Object) function1.invoke(t12));
            }
        };
    }

    @InlineOnly
    private static final <T, K> Comparator<T> thenByDescending(final Comparator<T> comparator, final Comparator<? super K> comparator2, final Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(comparator2, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt.thenByDescending.2
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                int iCompare = comparator.compare(t11, t12);
                if (iCompare != 0) {
                    return iCompare;
                }
                Comparator<? super K> comparator3 = comparator2;
                Function1<T, K> function1 = selector;
                return comparator3.compare((Object) function1.invoke(t12), (Object) function1.invoke(t11));
            }
        };
    }

    @InlineOnly
    private static final <T> Comparator<T> thenComparator(final Comparator<T> comparator, final Function2<? super T, ? super T, Integer> comparison) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(comparison, "comparison");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt.thenComparator.1
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                int iCompare = comparator.compare(t11, t12);
                return iCompare != 0 ? iCompare : comparison.invoke(t11, t12).intValue();
            }
        };
    }

    @NotNull
    public static final <T> Comparator<T> thenDescending(@NotNull final Comparator<T> comparator, @NotNull final Comparator<? super T> comparator2) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(comparator2, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ComparisonsKt__ComparisonsKt.thenDescending$lambda$2$ComparisonsKt__ComparisonsKt(comparator, comparator2, obj, obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int compareBy$lambda$0$ComparisonsKt__ComparisonsKt(Function1[] function1Arr, Object obj, Object obj2) {
        return compareValuesByImpl$ComparisonsKt__ComparisonsKt(obj, obj2, function1Arr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int then$lambda$1$ComparisonsKt__ComparisonsKt(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        int iCompare = comparator.compare(obj, obj2);
        if (iCompare != 0) {
            return iCompare;
        }
        return comparator2.compare(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int thenDescending$lambda$2$ComparisonsKt__ComparisonsKt(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        int iCompare = comparator.compare(obj, obj2);
        if (iCompare != 0) {
            return iCompare;
        }
        return comparator2.compare(obj2, obj);
    }

    @InlineOnly
    private static final <T> Comparator<T> compareBy(Function1<? super T, ? extends Comparable<?>> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new C411272(selector);
    }

    @InlineOnly
    private static final <T> int compareValuesBy(T t11, T t12, Function1<? super T, ? extends Comparable<?>> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        return compareValues(selector.invoke(t11), selector.invoke(t12));
    }

    @InlineOnly
    private static final <T, K> Comparator<T> compareBy(final Comparator<? super K> comparator, final Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt.compareBy.3
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                Comparator<? super K> comparator2 = comparator;
                Function1<T, K> function1 = selector;
                return comparator2.compare((Object) function1.invoke(t11), (Object) function1.invoke(t12));
            }
        };
    }

    @InlineOnly
    private static final <T, K> int compareValuesBy(T t11, T t12, Comparator<? super K> comparator, Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return comparator.compare(selector.invoke(t11), selector.invoke(t12));
    }
}
