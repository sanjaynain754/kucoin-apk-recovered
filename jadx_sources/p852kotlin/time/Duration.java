package p852kotlin.time;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.common.primitives.Longs;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.SinceKotlin;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.internal.InlineOnly;
import p852kotlin.jvm.JvmInline;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.functions.Function4;
import p852kotlin.jvm.functions.Function5;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.math.MathKt;
import p852kotlin.ranges.LongRange;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: Duration.kt */
/* JADX INFO: loaded from: classes23.dex */
@SinceKotlin(version = "1.6")
@Metadata(m90083d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087@\u0018\u0000 \u0089\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0089\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\"\u0010\u001bJ\u0018\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b%\u0010&J\u0018\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020'H\u0086\u0002¢\u0006\u0004\b%\u0010(J\u0018\u0010)\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b*\u0010&J\u0018\u0010)\u001a\u00020\u00002\u0006\u0010$\u001a\u00020'H\u0086\u0002¢\u0006\u0004\b*\u0010(J\u0018\u0010)\u001a\u00020'2\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0013H\u0000¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\r¢\u0006\u0004\b2\u0010\u000fJ\r\u00103\u001a\u00020\r¢\u0006\u0004\b4\u0010\u000fJ\r\u00105\u001a\u00020\r¢\u0006\u0004\b6\u0010\u000fJ\r\u00107\u001a\u00020\r¢\u0006\u0004\b8\u0010\u000fJ\u0018\u0010;\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b<\u0010=J\u009d\u0001\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2u\u0010@\u001aq\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(D\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(E\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0AH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010JJ\u0088\u0001\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2`\u0010@\u001a\\\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(E\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0KH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010LJs\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2K\u0010@\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0MH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010NJ^\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?26\u0010@\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0OH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010PJ\u0015\u0010^\u001a\u00020'2\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\b_\u0010`J\u0015\u0010a\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\bb\u00100J\u0015\u0010c\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\bd\u0010eJ\u000f\u0010t\u001a\u00020uH\u0016¢\u0006\u0004\bv\u0010wJA\u0010x\u001a\u00020y*\u00060zj\u0002`{2\u0006\u0010|\u001a\u00020\t2\u0006\u0010}\u001a\u00020\t2\u0006\u0010~\u001a\u00020\t2\u0006\u0010.\u001a\u00020u2\u0006\u0010\u007f\u001a\u00020\rH\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J!\u0010t\u001a\u00020u2\u0006\u0010.\u001a\u00020\u00132\t\b\u0002\u0010\u0082\u0001\u001a\u00020\t¢\u0006\u0005\bv\u0010\u0083\u0001J\u000f\u0010\u0084\u0001\u001a\u00020u¢\u0006\u0005\b\u0085\u0001\u0010wJ\u0015\u0010\u0086\u0001\u001a\u00020\r2\t\u0010\u0019\u001a\u0005\u0018\u00010\u0087\u0001HÖ\u0003J\n\u0010\u0088\u0001\u001a\u00020\tHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0015\u0010\b\u001a\u00020\t8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u00109\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b:\u0010\u0005R\u001a\u0010Q\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bR\u0010S\u001a\u0004\bT\u0010\u000bR\u001a\u0010U\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bV\u0010S\u001a\u0004\bW\u0010\u000bR\u001a\u0010X\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bY\u0010S\u001a\u0004\bZ\u0010\u000bR\u001a\u0010[\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\\\u0010S\u001a\u0004\b]\u0010\u000bR\u0011\u0010f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bg\u0010\u0005R\u0011\u0010h\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bi\u0010\u0005R\u0011\u0010j\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bk\u0010\u0005R\u0011\u0010l\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bm\u0010\u0005R\u0011\u0010n\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bo\u0010\u0005R\u0011\u0010p\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bq\u0010\u0005R\u0011\u0010r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bs\u0010\u0005\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u008a\u0001"}, m90084d2 = {"Lkotlin/time/Duration;", "", "rawValue", "", "constructor-impl", "(J)J", "value", "getValue-impl", "unitDiscriminator", "", "getUnitDiscriminator-impl", "(J)I", "isInNanos", "", "isInNanos-impl", "(J)Z", "isInMillis", "isInMillis-impl", "storageUnit", "Lkotlin/time/DurationUnit;", "getStorageUnit-impl", "(J)Lkotlin/time/DurationUnit;", "unaryMinus", "unaryMinus-UwyO8pc", "plus", "other", "plus-LRDsOJo", "(JJ)J", "addValuesMixedRanges", "thisMillis", "otherNanos", "addValuesMixedRanges-UwyO8pc", "(JJJ)J", "minus", "minus-LRDsOJo", "times", "scale", "times-UwyO8pc", "(JI)J", "", "(JD)J", TtmlNode.TAG_DIV, "div-UwyO8pc", "div-LRDsOJo", "(JJ)D", "truncateTo", "unit", "truncateTo-UwyO8pc$kotlin_stdlib", "(JLkotlin/time/DurationUnit;)J", "isNegative", "isNegative-impl", "isPositive", "isPositive-impl", "isInfinite", "isInfinite-impl", "isFinite", "isFinite-impl", "absoluteValue", "getAbsoluteValue-UwyO8pc", "compareTo", "compareTo-LRDsOJo", "(JJ)I", "toComponents", ExifInterface.GPS_DIRECTION_TRUE, TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "days", "hours", "minutes", "seconds", "nanoseconds", "toComponents-impl", "(JLkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "Lkotlin/Function4;", "(JLkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Lkotlin/Function3;", "(JLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "hoursComponent", "getHoursComponent$annotations", "()V", "getHoursComponent-impl", "minutesComponent", "getMinutesComponent$annotations", "getMinutesComponent-impl", "secondsComponent", "getSecondsComponent$annotations", "getSecondsComponent-impl", "nanosecondsComponent", "getNanosecondsComponent$annotations", "getNanosecondsComponent-impl", "toDouble", "toDouble-impl", "(JLkotlin/time/DurationUnit;)D", "toLong", "toLong-impl", "toInt", "toInt-impl", "(JLkotlin/time/DurationUnit;)I", "inWholeDays", "getInWholeDays-impl", "inWholeHours", "getInWholeHours-impl", "inWholeMinutes", "getInWholeMinutes-impl", "inWholeSeconds", "getInWholeSeconds-impl", "inWholeMilliseconds", "getInWholeMilliseconds-impl", "inWholeMicroseconds", "getInWholeMicroseconds-impl", "inWholeNanoseconds", "getInWholeNanoseconds-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "appendFractional", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "appendFractional-impl", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "decimals", "(JLkotlin/time/DurationUnit;I)Ljava/lang/String;", "toIsoString", "toIsoString-impl", "equals", "", "hashCode", "Companion", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1062:1\n37#1:1063\n37#1:1064\n37#1:1065\n37#1:1066\n37#1:1067\n500#1:1068\n517#1:1076\n170#2,6:1069\n1#3:1075\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n*L\n38#1:1063\n39#1:1064\n274#1:1065\n294#1:1066\n478#1:1067\n727#1:1068\n818#1:1076\n769#1:1069,6\n*E\n"})
public final class Duration implements Comparable<Duration> {
    private final long rawValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long ZERO = m105187constructorimpl(0);
    private static final long INFINITE = DurationKt.durationOfMillis(DurationKt.MAX_MILLIS);
    private static final long NEG_INFINITE = DurationKt.durationOfMillis(-4611686018427387903L);

    /* JADX INFO: compiled from: Duration.kt */
    @Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\u0015\u00100\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0004\b5\u00103J\u0015\u00106\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0002\b7J\u0015\u00108\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0002\b9R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u001f\u0010\u0013\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0013\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0017\u0010\u001bR\u001f\u0010\u0013\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001f\u0010\u001e\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018R\u001f\u0010\u001e\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001bR\u001f\u0010\u001e\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001dR\u001f\u0010!\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0018R\u001f\u0010!\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001bR\u001f\u0010!\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001dR\u001f\u0010$\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0018R\u001f\u0010$\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001bR\u001f\u0010$\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001dR\u001f\u0010'\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010\u0018R\u001f\u0010'\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010\u001bR\u001f\u0010'\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u001c\u001a\u0004\b)\u0010\u001dR\u001f\u0010*\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u0016\u001a\u0004\b,\u0010\u0018R\u001f\u0010*\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u001a\u001a\u0004\b,\u0010\u001bR\u001f\u0010*\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u001c\u001a\u0004\b,\u0010\u001dR\u001f\u0010-\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u0016\u001a\u0004\b/\u0010\u0018R\u001f\u0010-\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u001a\u001a\u0004\b/\u0010\u001bR\u001f\u0010-\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u001c\u001a\u0004\b/\u0010\u001d¨\u0006:"}, m90084d2 = {"Lkotlin/time/Duration$Companion;", "", "<init>", "()V", "ZERO", "Lkotlin/time/Duration;", "getZERO-UwyO8pc", "()J", "J", "INFINITE", "getINFINITE-UwyO8pc", "NEG_INFINITE", "getNEG_INFINITE-UwyO8pc$kotlin_stdlib", "convert", "", "value", "sourceUnit", "Lkotlin/time/DurationUnit;", "targetUnit", "nanoseconds", "", "getNanoseconds-UwyO8pc$annotations", "(I)V", "getNanoseconds-UwyO8pc", "(I)J", "", "(J)V", "(J)J", "(D)V", "(D)J", "microseconds", "getMicroseconds-UwyO8pc$annotations", "getMicroseconds-UwyO8pc", "milliseconds", "getMilliseconds-UwyO8pc$annotations", "getMilliseconds-UwyO8pc", "seconds", "getSeconds-UwyO8pc$annotations", "getSeconds-UwyO8pc", "minutes", "getMinutes-UwyO8pc$annotations", "getMinutes-UwyO8pc", "hours", "getHours-UwyO8pc$annotations", "getHours-UwyO8pc", "days", "getDays-UwyO8pc$annotations", "getDays-UwyO8pc", "parse", "", "parse-UwyO8pc", "(Ljava/lang/String;)J", "parseIsoString", "parseIsoString-UwyO8pc", "parseOrNull", "parseOrNull-FghU774", "parseIsoStringOrNull", "parseIsoStringOrNull-FghU774", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m105235getDaysUwyO8pc(int i11) {
            return DurationKt.toDuration(i11, DurationUnit.DAYS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m105237getDaysUwyO8pc$annotations(double d11) {
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m105241getHoursUwyO8pc(int i11) {
            return DurationKt.toDuration(i11, DurationUnit.HOURS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m105243getHoursUwyO8pc$annotations(double d11) {
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m105247getMicrosecondsUwyO8pc(int i11) {
            return DurationKt.toDuration(i11, DurationUnit.MICROSECONDS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m105249getMicrosecondsUwyO8pc$annotations(double d11) {
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m105253getMillisecondsUwyO8pc(int i11) {
            return DurationKt.toDuration(i11, DurationUnit.MILLISECONDS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m105255getMillisecondsUwyO8pc$annotations(double d11) {
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m105259getMinutesUwyO8pc(int i11) {
            return DurationKt.toDuration(i11, DurationUnit.MINUTES);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m105261getMinutesUwyO8pc$annotations(double d11) {
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m105265getNanosecondsUwyO8pc(int i11) {
            return DurationKt.toDuration(i11, DurationUnit.NANOSECONDS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m105267getNanosecondsUwyO8pc$annotations(double d11) {
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m105271getSecondsUwyO8pc(int i11) {
            return DurationKt.toDuration(i11, DurationUnit.SECONDS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m105273getSecondsUwyO8pc$annotations(double d11) {
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m105236getDaysUwyO8pc(long j11) {
            return DurationKt.toDuration(j11, DurationUnit.DAYS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m105238getDaysUwyO8pc$annotations(int i11) {
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m105242getHoursUwyO8pc(long j11) {
            return DurationKt.toDuration(j11, DurationUnit.HOURS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m105244getHoursUwyO8pc$annotations(int i11) {
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m105248getMicrosecondsUwyO8pc(long j11) {
            return DurationKt.toDuration(j11, DurationUnit.MICROSECONDS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m105250getMicrosecondsUwyO8pc$annotations(int i11) {
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m105254getMillisecondsUwyO8pc(long j11) {
            return DurationKt.toDuration(j11, DurationUnit.MILLISECONDS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m105256getMillisecondsUwyO8pc$annotations(int i11) {
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m105260getMinutesUwyO8pc(long j11) {
            return DurationKt.toDuration(j11, DurationUnit.MINUTES);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m105262getMinutesUwyO8pc$annotations(int i11) {
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m105266getNanosecondsUwyO8pc(long j11) {
            return DurationKt.toDuration(j11, DurationUnit.NANOSECONDS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m105268getNanosecondsUwyO8pc$annotations(int i11) {
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m105272getSecondsUwyO8pc(long j11) {
            return DurationKt.toDuration(j11, DurationUnit.SECONDS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m105274getSecondsUwyO8pc$annotations(int i11) {
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m105234getDaysUwyO8pc(double d11) {
            return DurationKt.toDuration(d11, DurationUnit.DAYS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m105239getDaysUwyO8pc$annotations(long j11) {
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m105240getHoursUwyO8pc(double d11) {
            return DurationKt.toDuration(d11, DurationUnit.HOURS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m105245getHoursUwyO8pc$annotations(long j11) {
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m105246getMicrosecondsUwyO8pc(double d11) {
            return DurationKt.toDuration(d11, DurationUnit.MICROSECONDS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m105251getMicrosecondsUwyO8pc$annotations(long j11) {
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m105252getMillisecondsUwyO8pc(double d11) {
            return DurationKt.toDuration(d11, DurationUnit.MILLISECONDS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m105257getMillisecondsUwyO8pc$annotations(long j11) {
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m105258getMinutesUwyO8pc(double d11) {
            return DurationKt.toDuration(d11, DurationUnit.MINUTES);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m105263getMinutesUwyO8pc$annotations(long j11) {
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m105264getNanosecondsUwyO8pc(double d11) {
            return DurationKt.toDuration(d11, DurationUnit.NANOSECONDS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m105269getNanosecondsUwyO8pc$annotations(long j11) {
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m105270getSecondsUwyO8pc(double d11) {
            return DurationKt.toDuration(d11, DurationUnit.SECONDS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m105275getSecondsUwyO8pc$annotations(long j11) {
        }

        @ExperimentalTime
        public final double convert(double value, @NotNull DurationUnit sourceUnit, @NotNull DurationUnit targetUnit) {
            Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
            Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
            return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(value, sourceUnit, targetUnit);
        }

        /* JADX INFO: renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
        public final long m105276getINFINITEUwyO8pc() {
            return Duration.INFINITE;
        }

        /* JADX INFO: renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m105277getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
            return Duration.NEG_INFINITE;
        }

        /* JADX INFO: renamed from: getZERO-UwyO8pc, reason: not valid java name */
        public final long m105278getZEROUwyO8pc() {
            return Duration.ZERO;
        }

        /* JADX INFO: renamed from: parse-UwyO8pc, reason: not valid java name */
        public final long m105279parseUwyO8pc(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return DurationKt.parseDuration(value, false);
            } catch (IllegalArgumentException e11) {
                throw new IllegalArgumentException("Invalid duration string format: '" + value + "'.", e11);
            }
        }

        /* JADX INFO: renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
        public final long m105280parseIsoStringUwyO8pc(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return DurationKt.parseDuration(value, true);
            } catch (IllegalArgumentException e11) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e11);
            }
        }

        @Nullable
        /* JADX INFO: renamed from: parseIsoStringOrNull-FghU774, reason: not valid java name */
        public final Duration m105281parseIsoStringOrNullFghU774(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return Duration.m105185boximpl(DurationKt.parseDuration(value, true));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @Nullable
        /* JADX INFO: renamed from: parseOrNull-FghU774, reason: not valid java name */
        public final Duration m105282parseOrNullFghU774(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return Duration.m105185boximpl(DurationKt.parseDuration(value, false));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m105190divUwyO8pc(long j11, int i11) {
        if (i11 == 0) {
            if (m105214isPositiveimpl(j11)) {
                return INFINITE;
            }
            if (m105213isNegativeimpl(j11)) {
                return NEG_INFINITE;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (m105211isInNanosimpl(j11)) {
            return DurationKt.durationOfNanos(m105207getValueimpl(j11) / ((long) i11));
        }
        if (m105212isInfiniteimpl(j11)) {
            return m105218timesUwyO8pc(j11, MathKt.getSign(i11));
        }
        long j12 = i11;
        long jM105207getValueimpl = m105207getValueimpl(j11) / j12;
        if (-4611686018426L > jM105207getValueimpl || jM105207getValueimpl >= 4611686018427L) {
            return DurationKt.durationOfMillis(jM105207getValueimpl);
        }
        return DurationKt.durationOfNanos(DurationKt.millisToNanos(jM105207getValueimpl) + (DurationKt.millisToNanos(m105207getValueimpl(j11) - (jM105207getValueimpl * j12)) / j12));
    }

    /* JADX INFO: renamed from: getUnitDiscriminator-impl, reason: not valid java name */
    private static final int m105206getUnitDiscriminatorimpl(long j11) {
        return ((int) j11) & 1;
    }

    /* JADX INFO: renamed from: getValue-impl, reason: not valid java name */
    private static final long m105207getValueimpl(long j11) {
        return j11 >> 1;
    }

    /* JADX INFO: renamed from: isInMillis-impl, reason: not valid java name */
    private static final boolean m105210isInMillisimpl(long j11) {
        return (((int) j11) & 1) == 1;
    }

    /* JADX INFO: renamed from: isInNanos-impl, reason: not valid java name */
    private static final boolean m105211isInNanosimpl(long j11) {
        return (((int) j11) & 1) == 0;
    }

    /* JADX INFO: renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m105218timesUwyO8pc(long j11, int i11) {
        if (m105212isInfiniteimpl(j11)) {
            if (i11 != 0) {
                return i11 > 0 ? j11 : m105231unaryMinusUwyO8pc(j11);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i11 == 0) {
            return ZERO;
        }
        long jM105207getValueimpl = m105207getValueimpl(j11);
        long j12 = i11;
        long j13 = jM105207getValueimpl * j12;
        if (!m105211isInNanosimpl(j11)) {
            if (j13 / j12 == jM105207getValueimpl) {
                return DurationKt.durationOfMillis(RangesKt.coerceIn(j13, new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS)));
            }
            return MathKt.getSign(jM105207getValueimpl) * MathKt.getSign(i11) > 0 ? INFINITE : NEG_INFINITE;
        }
        if (-2147483647L <= jM105207getValueimpl && jM105207getValueimpl < 2147483648L) {
            return DurationKt.durationOfNanos(j13);
        }
        if (j13 / j12 == jM105207getValueimpl) {
            return DurationKt.durationOfNanosNormalized(j13);
        }
        long jNanosToMillis = DurationKt.nanosToMillis(jM105207getValueimpl);
        long j14 = jNanosToMillis * j12;
        long jNanosToMillis2 = DurationKt.nanosToMillis((jM105207getValueimpl - DurationKt.millisToNanos(jNanosToMillis)) * j12) + j14;
        if (j14 / j12 != jNanosToMillis || (jNanosToMillis2 ^ j14) < 0) {
            return MathKt.getSign(jM105207getValueimpl) * MathKt.getSign(i11) > 0 ? INFINITE : NEG_INFINITE;
        }
        return DurationKt.durationOfMillis(RangesKt.coerceIn(jNanosToMillis2, new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS)));
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m105222toComponentsimpl(long j11, @NotNull Function5<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m105195getInWholeDaysimpl(j11)), Integer.valueOf(m105194getHoursComponentimpl(j11)), Integer.valueOf(m105202getMinutesComponentimpl(j11)), Integer.valueOf(m105204getSecondsComponentimpl(j11)), Integer.valueOf(m105203getNanosecondsComponentimpl(j11)));
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m105227toStringimpl(long j11) {
        if (j11 == 0) {
            return "0s";
        }
        if (j11 == INFINITE) {
            return "Infinity";
        }
        if (j11 == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean zM105213isNegativeimpl = m105213isNegativeimpl(j11);
        StringBuilder sb2 = new StringBuilder();
        if (zM105213isNegativeimpl) {
            sb2.append('-');
        }
        long jM105193getAbsoluteValueUwyO8pc = m105193getAbsoluteValueUwyO8pc(j11);
        long jM105195getInWholeDaysimpl = m105195getInWholeDaysimpl(jM105193getAbsoluteValueUwyO8pc);
        int iM105194getHoursComponentimpl = m105194getHoursComponentimpl(jM105193getAbsoluteValueUwyO8pc);
        int iM105202getMinutesComponentimpl = m105202getMinutesComponentimpl(jM105193getAbsoluteValueUwyO8pc);
        int iM105204getSecondsComponentimpl = m105204getSecondsComponentimpl(jM105193getAbsoluteValueUwyO8pc);
        int iM105203getNanosecondsComponentimpl = m105203getNanosecondsComponentimpl(jM105193getAbsoluteValueUwyO8pc);
        int i11 = 0;
        boolean z11 = jM105195getInWholeDaysimpl != 0;
        boolean z12 = iM105194getHoursComponentimpl != 0;
        boolean z13 = iM105202getMinutesComponentimpl != 0;
        boolean z14 = (iM105204getSecondsComponentimpl == 0 && iM105203getNanosecondsComponentimpl == 0) ? false : true;
        if (z11) {
            sb2.append(jM105195getInWholeDaysimpl);
            sb2.append('d');
            i11 = 1;
        }
        if (z12 || (z11 && (z13 || z14))) {
            int i12 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            sb2.append(iM105194getHoursComponentimpl);
            sb2.append('h');
            i11 = i12;
        }
        if (z13 || (z14 && (z12 || z11))) {
            int i13 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            sb2.append(iM105202getMinutesComponentimpl);
            sb2.append('m');
            i11 = i13;
        }
        if (z14) {
            int i14 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            if (iM105204getSecondsComponentimpl != 0 || z11 || z12 || z13) {
                m105184appendFractionalimpl(j11, sb2, iM105204getSecondsComponentimpl, iM105203getNanosecondsComponentimpl, 9, CmcdData.Factory.STREAMING_FORMAT_SS, false);
            } else if (iM105203getNanosecondsComponentimpl >= 1000000) {
                m105184appendFractionalimpl(j11, sb2, iM105203getNanosecondsComponentimpl / 1000000, iM105203getNanosecondsComponentimpl % 1000000, 6, "ms", false);
            } else if (iM105203getNanosecondsComponentimpl >= 1000) {
                m105184appendFractionalimpl(j11, sb2, iM105203getNanosecondsComponentimpl / 1000, iM105203getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb2.append(iM105203getNanosecondsComponentimpl);
                sb2.append("ns");
            }
            i11 = i14;
        }
        if (zM105213isNegativeimpl && i11 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public int m105232compareToLRDsOJo(long j11) {
        return m105186compareToLRDsOJo(this.rawValue, j11);
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Duration m105185boximpl(long j11) {
        return new Duration(j11);
    }

    /* JADX INFO: renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m105186compareToLRDsOJo(long j11, long j12) {
        long j13 = j11 ^ j12;
        if (j13 < 0 || (((int) j13) & 1) == 0) {
            return Intrinsics.compare(j11, j12);
        }
        int i11 = (((int) j11) & 1) - (((int) j12) & 1);
        return m105213isNegativeimpl(j11) ? -i11 : i11;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m105191equalsimpl(long j11, Object obj) {
        return (obj instanceof Duration) && j11 == ((Duration) obj).getRawValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m105192equalsimpl0(long j11, long j12) {
        return j11 == j12;
    }

    /* JADX INFO: renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m105195getInWholeDaysimpl(long j11) {
        return m105226toLongimpl(j11, DurationUnit.DAYS);
    }

    /* JADX INFO: renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m105196getInWholeHoursimpl(long j11) {
        return m105226toLongimpl(j11, DurationUnit.HOURS);
    }

    /* JADX INFO: renamed from: getInWholeMicroseconds-impl, reason: not valid java name */
    public static final long m105197getInWholeMicrosecondsimpl(long j11) {
        return m105226toLongimpl(j11, DurationUnit.MICROSECONDS);
    }

    /* JADX INFO: renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m105199getInWholeMinutesimpl(long j11) {
        return m105226toLongimpl(j11, DurationUnit.MINUTES);
    }

    /* JADX INFO: renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m105201getInWholeSecondsimpl(long j11) {
        return m105226toLongimpl(j11, DurationUnit.SECONDS);
    }

    /* JADX INFO: renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m105212isInfiniteimpl(long j11) {
        return j11 == INFINITE || j11 == NEG_INFINITE;
    }

    /* JADX INFO: renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m105213isNegativeimpl(long j11) {
        return j11 < 0;
    }

    /* JADX INFO: renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m105214isPositiveimpl(long j11) {
        return j11 > 0;
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m105221toComponentsimpl(long j11, @NotNull Function4<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m105196getInWholeHoursimpl(j11)), Integer.valueOf(m105202getMinutesComponentimpl(j11)), Integer.valueOf(m105204getSecondsComponentimpl(j11)), Integer.valueOf(m105203getNanosecondsComponentimpl(j11)));
    }

    @NotNull
    /* JADX INFO: renamed from: toIsoString-impl, reason: not valid java name */
    public static final String m105225toIsoStringimpl(long j11) {
        StringBuilder sb2 = new StringBuilder();
        if (m105213isNegativeimpl(j11)) {
            sb2.append('-');
        }
        sb2.append("PT");
        long jM105193getAbsoluteValueUwyO8pc = m105193getAbsoluteValueUwyO8pc(j11);
        long jM105196getInWholeHoursimpl = m105196getInWholeHoursimpl(jM105193getAbsoluteValueUwyO8pc);
        int iM105202getMinutesComponentimpl = m105202getMinutesComponentimpl(jM105193getAbsoluteValueUwyO8pc);
        int iM105204getSecondsComponentimpl = m105204getSecondsComponentimpl(jM105193getAbsoluteValueUwyO8pc);
        int iM105203getNanosecondsComponentimpl = m105203getNanosecondsComponentimpl(jM105193getAbsoluteValueUwyO8pc);
        long j12 = m105212isInfiniteimpl(j11) ? 9999999999999L : jM105196getInWholeHoursimpl;
        boolean z11 = false;
        boolean z12 = j12 != 0;
        boolean z13 = (iM105204getSecondsComponentimpl == 0 && iM105203getNanosecondsComponentimpl == 0) ? false : true;
        if (iM105202getMinutesComponentimpl != 0 || (z13 && z12)) {
            z11 = true;
        }
        if (z12) {
            sb2.append(j12);
            sb2.append('H');
        }
        if (z11) {
            sb2.append(iM105202getMinutesComponentimpl);
            sb2.append('M');
        }
        if (z13 || (!z12 && !z11)) {
            m105184appendFractionalimpl(j11, sb2, iM105204getSecondsComponentimpl, iM105203getNanosecondsComponentimpl, 9, ExifInterface.LATITUDE_SOUTH, true);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: toString-impl$default, reason: not valid java name */
    public static /* synthetic */ String m105229toStringimpl$default(long j11, DurationUnit durationUnit, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return m105228toStringimpl(j11, durationUnit, i11);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Duration duration) {
        return m105232compareToLRDsOJo(duration.getRawValue());
    }

    public boolean equals(Object other) {
        return m105191equalsimpl(this.rawValue, other);
    }

    public int hashCode() {
        return m105208hashCodeimpl(this.rawValue);
    }

    @NotNull
    public String toString() {
        return m105227toStringimpl(this.rawValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getRawValue() {
        return this.rawValue;
    }

    private /* synthetic */ Duration(long j11) {
        this.rawValue = j11;
    }

    /* JADX INFO: renamed from: addValuesMixedRanges-UwyO8pc, reason: not valid java name */
    private static final long m105183addValuesMixedRangesUwyO8pc(long j11, long j12, long j13) {
        long jNanosToMillis = DurationKt.nanosToMillis(j13);
        long j14 = j12 + jNanosToMillis;
        if (-4611686018426L > j14 || j14 >= 4611686018427L) {
            return DurationKt.durationOfMillis(RangesKt.coerceIn(j14, -4611686018427387903L, DurationKt.MAX_MILLIS));
        }
        return DurationKt.durationOfNanos(DurationKt.millisToNanos(j14) + (j13 - DurationKt.millisToNanos(jNanosToMillis)));
    }

    /* JADX INFO: renamed from: appendFractional-impl, reason: not valid java name */
    private static final void m105184appendFractionalimpl(long j11, StringBuilder sb2, int i11, int i12, int i13, String str, boolean z11) {
        sb2.append(i11);
        if (i12 != 0) {
            sb2.append('.');
            String strPadStart = StringsKt.padStart(String.valueOf(i12), i13, '0');
            int i14 = -1;
            int length = strPadStart.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i15 = length - 1;
                    if (strPadStart.charAt(length) != '0') {
                        i14 = length;
                        break;
                    } else if (i15 < 0) {
                        break;
                    } else {
                        length = i15;
                    }
                }
            }
            int i16 = i14 + 1;
            if (!z11 && i16 < 3) {
                sb2.append((CharSequence) strPadStart, 0, i16);
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            } else {
                sb2.append((CharSequence) strPadStart, 0, ((i14 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            }
        }
        sb2.append(str);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m105187constructorimpl(long j11) {
        if (DurationJvmKt.getDurationAssertionsEnabled()) {
            if (m105211isInNanosimpl(j11)) {
                long jM105207getValueimpl = m105207getValueimpl(j11);
                if (-4611686018426999999L <= jM105207getValueimpl && jM105207getValueimpl < 4611686018427000000L) {
                    return j11;
                }
                throw new AssertionError(m105207getValueimpl(j11) + " ns is out of nanoseconds range");
            }
            long jM105207getValueimpl2 = m105207getValueimpl(j11);
            if (-4611686018427387903L <= jM105207getValueimpl2 && jM105207getValueimpl2 < Longs.MAX_POWER_OF_TWO) {
                long jM105207getValueimpl3 = m105207getValueimpl(j11);
                if (-4611686018426L > jM105207getValueimpl3 || jM105207getValueimpl3 >= 4611686018427L) {
                    return j11;
                }
                throw new AssertionError(m105207getValueimpl(j11) + " ms is denormalized");
            }
            throw new AssertionError(m105207getValueimpl(j11) + " ms is out of milliseconds range");
        }
        return j11;
    }

    /* JADX INFO: renamed from: div-LRDsOJo, reason: not valid java name */
    public static final double m105188divLRDsOJo(long j11, long j12) {
        DurationUnit durationUnit = (DurationUnit) ComparisonsKt.maxOf(m105205getStorageUnitimpl(j11), m105205getStorageUnitimpl(j12));
        return m105223toDoubleimpl(j11, durationUnit) / m105223toDoubleimpl(j12, durationUnit);
    }

    /* JADX INFO: renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m105193getAbsoluteValueUwyO8pc(long j11) {
        if (m105213isNegativeimpl(j11)) {
            return m105231unaryMinusUwyO8pc(j11);
        }
        return j11;
    }

    /* JADX INFO: renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m105194getHoursComponentimpl(long j11) {
        if (m105212isInfiniteimpl(j11)) {
            return 0;
        }
        return (int) (m105196getInWholeHoursimpl(j11) % ((long) 24));
    }

    /* JADX INFO: renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m105198getInWholeMillisecondsimpl(long j11) {
        if (m105210isInMillisimpl(j11) && m105209isFiniteimpl(j11)) {
            return m105207getValueimpl(j11);
        }
        return m105226toLongimpl(j11, DurationUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: getInWholeNanoseconds-impl, reason: not valid java name */
    public static final long m105200getInWholeNanosecondsimpl(long j11) {
        long jM105207getValueimpl = m105207getValueimpl(j11);
        if (m105211isInNanosimpl(j11)) {
            return jM105207getValueimpl;
        }
        if (jM105207getValueimpl > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (jM105207getValueimpl >= -9223372036854L) {
            return DurationKt.millisToNanos(jM105207getValueimpl);
        }
        return Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m105202getMinutesComponentimpl(long j11) {
        if (m105212isInfiniteimpl(j11)) {
            return 0;
        }
        return (int) (m105199getInWholeMinutesimpl(j11) % ((long) 60));
    }

    /* JADX INFO: renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m105203getNanosecondsComponentimpl(long j11) {
        long jM105207getValueimpl;
        if (m105212isInfiniteimpl(j11)) {
            return 0;
        }
        if (m105210isInMillisimpl(j11)) {
            jM105207getValueimpl = DurationKt.millisToNanos(m105207getValueimpl(j11) % ((long) 1000));
        } else {
            jM105207getValueimpl = m105207getValueimpl(j11) % ((long) 1000000000);
        }
        return (int) jM105207getValueimpl;
    }

    /* JADX INFO: renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m105204getSecondsComponentimpl(long j11) {
        if (m105212isInfiniteimpl(j11)) {
            return 0;
        }
        return (int) (m105201getInWholeSecondsimpl(j11) % ((long) 60));
    }

    /* JADX INFO: renamed from: getStorageUnit-impl, reason: not valid java name */
    private static final DurationUnit m105205getStorageUnitimpl(long j11) {
        if (m105211isInNanosimpl(j11)) {
            return DurationUnit.NANOSECONDS;
        }
        return DurationUnit.MILLISECONDS;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m105208hashCodeimpl(long j11) {
        return Long.hashCode(j11);
    }

    /* JADX INFO: renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m105209isFiniteimpl(long j11) {
        return !m105212isInfiniteimpl(j11);
    }

    /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
    public static final long m105215minusLRDsOJo(long j11, long j12) {
        return m105216plusLRDsOJo(j11, m105231unaryMinusUwyO8pc(j12));
    }

    /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m105216plusLRDsOJo(long j11, long j12) {
        if (m105212isInfiniteimpl(j11)) {
            if (!m105209isFiniteimpl(j12) && (j12 ^ j11) < 0) {
                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            }
            return j11;
        }
        if (m105212isInfiniteimpl(j12)) {
            return j12;
        }
        if ((((int) j11) & 1) == (((int) j12) & 1)) {
            long jM105207getValueimpl = m105207getValueimpl(j11) + m105207getValueimpl(j12);
            return m105211isInNanosimpl(j11) ? DurationKt.durationOfNanosNormalized(jM105207getValueimpl) : DurationKt.durationOfMillisNormalized(jM105207getValueimpl);
        }
        if (m105210isInMillisimpl(j11)) {
            return m105183addValuesMixedRangesUwyO8pc(j11, m105207getValueimpl(j11), m105207getValueimpl(j12));
        }
        return m105183addValuesMixedRangesUwyO8pc(j11, m105207getValueimpl(j12), m105207getValueimpl(j11));
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m105220toComponentsimpl(long j11, @NotNull Function3<? super Long, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m105199getInWholeMinutesimpl(j11)), Integer.valueOf(m105204getSecondsComponentimpl(j11)), Integer.valueOf(m105203getNanosecondsComponentimpl(j11)));
    }

    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    public static final double m105223toDoubleimpl(long j11, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j11 == INFINITE) {
            return Double.POSITIVE_INFINITY;
        }
        if (j11 == NEG_INFINITE) {
            return Double.NEGATIVE_INFINITY;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m105207getValueimpl(j11), m105205getStorageUnitimpl(j11), unit);
    }

    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    public static final int m105224toIntimpl(long j11, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (int) RangesKt.coerceIn(m105226toLongimpl(j11, unit), -2147483648L, 2147483647L);
    }

    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    public static final long m105226toLongimpl(long j11, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j11 == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j11 == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m105207getValueimpl(j11), m105205getStorageUnitimpl(j11), unit);
    }

    /* JADX INFO: renamed from: truncateTo-UwyO8pc$kotlin_stdlib, reason: not valid java name */
    public static final long m105230truncateToUwyO8pc$kotlin_stdlib(long j11, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        DurationUnit durationUnitM105205getStorageUnitimpl = m105205getStorageUnitimpl(j11);
        if (unit.compareTo(durationUnitM105205getStorageUnitimpl) > 0 && !m105212isInfiniteimpl(j11)) {
            return DurationKt.toDuration(m105207getValueimpl(j11) - (m105207getValueimpl(j11) % DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(1L, unit, durationUnitM105205getStorageUnitimpl)), durationUnitM105205getStorageUnitimpl);
        }
        return j11;
    }

    /* JADX INFO: renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m105231unaryMinusUwyO8pc(long j11) {
        return DurationKt.durationOf(-m105207getValueimpl(j11), ((int) j11) & 1);
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m105219toComponentsimpl(long j11, @NotNull Function2<? super Long, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m105201getInWholeSecondsimpl(j11)), Integer.valueOf(m105203getNanosecondsComponentimpl(j11)));
    }

    /* JADX INFO: renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m105189divUwyO8pc(long j11, double d11) {
        int iRoundToInt = MathKt.roundToInt(d11);
        if (iRoundToInt == d11 && iRoundToInt != 0) {
            return m105190divUwyO8pc(j11, iRoundToInt);
        }
        DurationUnit durationUnitM105205getStorageUnitimpl = m105205getStorageUnitimpl(j11);
        return DurationKt.toDuration(m105223toDoubleimpl(j11, durationUnitM105205getStorageUnitimpl) / d11, durationUnitM105205getStorageUnitimpl);
    }

    /* JADX INFO: renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m105217timesUwyO8pc(long j11, double d11) {
        int iRoundToInt = MathKt.roundToInt(d11);
        if (iRoundToInt == d11) {
            return m105218timesUwyO8pc(j11, iRoundToInt);
        }
        DurationUnit durationUnitM105205getStorageUnitimpl = m105205getStorageUnitimpl(j11);
        return DurationKt.toDuration(m105223toDoubleimpl(j11, durationUnitM105205getStorageUnitimpl) * d11, durationUnitM105205getStorageUnitimpl);
    }

    @PublishedApi
    public static /* synthetic */ void getHoursComponent$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getMinutesComponent$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getNanosecondsComponent$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getSecondsComponent$annotations() {
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static final String m105228toStringimpl(long j11, @NotNull DurationUnit unit, int i11) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (i11 >= 0) {
            double dM105223toDoubleimpl = m105223toDoubleimpl(j11, unit);
            if (Double.isInfinite(dM105223toDoubleimpl)) {
                return String.valueOf(dM105223toDoubleimpl);
            }
            return DurationJvmKt.formatToExactDecimals(dM105223toDoubleimpl, RangesKt.coerceAtMost(i11, 12)) + DurationUnitKt__DurationUnitKt.shortName(unit);
        }
        throw new IllegalArgumentException(("decimals must be not negative, but was " + i11).toString());
    }
}
