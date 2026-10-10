package p832zh;

import com.kubi.kumex.R$string;
import com.kubi.utils.C27017c;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.C33978va;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: zh.g */
/* JADX INFO: compiled from: IntervalTimeSettingDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0004\u001a\u00020\u0002*\u00020\u0002H\u0002\u001a\f\u0010\u0005\u001a\u00020\u0002*\u00020\u0002H\u0002¨\u0006\u0006"}, m90084d2 = {"toMS", "", "", "toDHMS", "getMinute", "getRemainSecondsAfterMinute", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIntervalTimeSettingDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalTimeSettingDialog.kt\ncom/kubi/futures/dialog/twap/IntervalTimeSettingDialogKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,187:1\n360#2,7:188\n388#2,7:195\n*S KotlinDebug\n*F\n+ 1 IntervalTimeSettingDialog.kt\ncom/kubi/futures/dialog/twap/IntervalTimeSettingDialogKt\n*L\n171#1:188,7\n173#1:195,7\n*E\n"})
public final class C46855g {
    /* JADX INFO: renamed from: d */
    public static final long m103203d(long j11) {
        return j11 / 60;
    }

    /* JADX INFO: renamed from: e */
    public static final long m103204e(long j11) {
        return j11 % 60;
    }

    /* JADX INFO: renamed from: g */
    public static final CharSequence m103206g(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        return ((Number) pair.component1()).longValue() + ' ' + ((String) pair.component2());
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m103207h(long j11) {
        StringBuilder sb2 = new StringBuilder();
        long jM103203d = m103203d(j11);
        long jM103204e = m103204e(j11);
        if (jM103203d != 0) {
            sb2.append(jM103203d + C27017c.f54310a.m66516f(R$string.alpha_countdown_minute, new Object[0]));
        }
        if (jM103204e != 0) {
            sb2.append(' ' + jM103204e + C27017c.f54310a.m66516f(R$string.alpha_countdown_second, new Object[0]));
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m103205f(long j11) {
        int iNextIndex;
        long j12 = j11 / 86400;
        long j13 = (j11 % 86400) / C33978va.f72340i;
        long j14 = (j11 % C33978va.f72340i) / 60;
        long jM103204e = m103204e(j11);
        Long lValueOf = Long.valueOf(j12);
        C27017c c27017c = C27017c.f54310a;
        List listListOf = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m90091to(lValueOf, c27017c.m66516f(R$string.alpha_countdown_day, new Object[0])), TuplesKt.m90091to(Long.valueOf(j13), c27017c.m66516f(R$string.alpha_countdown_hour, new Object[0])), TuplesKt.m90091to(Long.valueOf(j14), c27017c.m66516f(R$string.alpha_countdown_minute, new Object[0])), TuplesKt.m90091to(Long.valueOf(jM103204e), c27017c.m66516f(R$string.alpha_countdown_second, new Object[0]))});
        Iterator it = listListOf.iterator();
        int i11 = 0;
        while (true) {
            if (it.hasNext()) {
                if (((Number) ((Pair) it.next()).getFirst()).longValue() != 0) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        ListIterator listIterator = listListOf.listIterator(listListOf.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (((Number) ((Pair) listIterator.previous()).getFirst()).longValue() != 0) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            } else {
                iNextIndex = -1;
                break;
            }
        }
        if (i11 != -1 && i11 != 3) {
            return CollectionsKt.joinToString$default(listListOf.subList(i11, Math.min(iNextIndex + 1, 3)), C33627eb.f69716f, null, null, 0, null, new Function1() { // from class: zh.f
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C46855g.m103206g((Pair) obj);
                }
            }, 30, null);
        }
        return "< 1 " + C27017c.f54310a.m66516f(R$string.alpha_countdown_minute, new Object[0]);
    }
}
