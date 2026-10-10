package p423l6;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.facebook.C5501a;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.C5760c;
import com.facebook.internal.instrument.InstrumentData;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p394k6.C40926i;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: l6.e */
/* JADX INFO: compiled from: ANRHandler.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0003R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, m90084d2 = {"Ll6/e;", "", "<init>", "()V", "", "c", "d", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "enabled", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nANRHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ANRHandler.kt\ncom/facebook/internal/instrument/anrreport/ANRHandler\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,77:1\n11335#2:78\n11670#2,3:79\n766#3:82\n857#3,2:83\n1855#3,2:85\n1855#3,2:87\n*S KotlinDebug\n*F\n+ 1 ANRHandler.kt\ncom/facebook/internal/instrument/anrreport/ANRHandler\n*L\n58#1:78\n58#1:79,3\n59#1:82\n59#1:83,2\n63#1:85,2\n69#1:87,2\n*E\n"})
public final class C42105e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42105e f93428a = new C42105e();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean enabled = new AtomicBoolean(false);

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final synchronized void m92363c() {
        if (C42757a.m93689d(C42105e.class)) {
            return;
        }
        try {
            if (enabled.getAndSet(true)) {
                return;
            }
            if (C5501a.m7803q()) {
                m92364d();
            }
            C42102b.m92360d();
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C42105e.class);
        }
    }

    @JvmStatic
    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public static final void m92364d() {
        if (C42757a.m93689d(C42105e.class)) {
            return;
        }
        try {
            if (C5760c.m10055W()) {
                return;
            }
            File[] fileArrM89633l = C40926i.m89633l();
            ArrayList arrayList = new ArrayList(fileArrM89633l.length);
            for (File file : fileArrM89633l) {
                arrayList.add(InstrumentData.C5762a.m10127d(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((InstrumentData) obj).m10120f()) {
                    arrayList2.add(obj);
                }
            }
            final List listSortedWith = CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: l6.c
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return C42105e.m92365e((InstrumentData) obj2, (InstrumentData) obj3);
                }
            });
            JSONArray jSONArray = new JSONArray();
            Iterator<Integer> it = RangesKt.until(0, Math.min(listSortedWith.size(), 5)).iterator();
            while (it.hasNext()) {
                jSONArray.put(listSortedWith.get(((IntIterator) it).nextInt()));
            }
            C40926i.m89640s("anr_reports", jSONArray, new GraphRequest.InterfaceC5490b() { // from class: l6.d
                @Override // com.facebook.GraphRequest.InterfaceC5490b
                /* JADX INFO: renamed from: a */
                public final void mo78a(GraphResponse graphResponse) {
                    C42105e.m92366f(listSortedWith, graphResponse);
                }
            });
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C42105e.class);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final int m92365e(InstrumentData instrumentData, InstrumentData o11) {
        if (C42757a.m93689d(C42105e.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullExpressionValue(o11, "o2");
            return instrumentData.m10116b(o11);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C42105e.class);
            return 0;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m92366f(List validReports, GraphResponse response) {
        JSONObject jsonObject;
        if (C42757a.m93689d(C42105e.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(validReports, "$validReports");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                if (response.getCom.google.firebase.messaging.Constants.IPC_BUNDLE_KEY_SEND_ERROR java.lang.String() == null && (jsonObject = response.getJsonObject()) != null && jsonObject.getBoolean("success")) {
                    Iterator it = validReports.iterator();
                    while (it.hasNext()) {
                        ((InstrumentData) it.next()).m10115a();
                    }
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C42105e.class);
        }
    }
}
