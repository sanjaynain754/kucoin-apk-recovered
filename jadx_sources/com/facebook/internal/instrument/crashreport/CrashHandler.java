package com.facebook.internal.instrument.crashreport;

import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.C5760c;
import com.facebook.internal.instrument.C5764a;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.instrument.crashreport.CrashHandler;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p394k6.C40926i;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: CrashHandler.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, m90084d2 = {"Lcom/facebook/internal/instrument/crashreport/CrashHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "previousHandler", "<init>", "(Ljava/lang/Thread$UncaughtExceptionHandler;)V", "Ljava/lang/Thread;", "t", "", "e", "", "uncaughtException", "(Ljava/lang/Thread;Ljava/lang/Throwable;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/Thread$UncaughtExceptionHandler;", "b", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class CrashHandler implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    public static final String f9672c = CrashHandler.class.getCanonicalName();

    /* JADX INFO: renamed from: d */
    @Nullable
    public static CrashHandler f9673d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final Thread.UncaughtExceptionHandler previousHandler;

    /* JADX INFO: compiled from: CrashHandler.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lcom/facebook/internal/instrument/crashreport/CrashHandler$Companion;", "", "<init>", "()V", "", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "c", "", "MAX_CRASH_REPORT_NUM", "I", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "Lcom/facebook/internal/instrument/crashreport/CrashHandler;", "instance", "Lcom/facebook/internal/instrument/crashreport/CrashHandler;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCrashHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrashHandler.kt\ncom/facebook/internal/instrument/crashreport/CrashHandler$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n11335#2:89\n11670#2,3:90\n766#3:93\n857#3,2:94\n1855#3,2:96\n1855#3,2:98\n*S KotlinDebug\n*F\n+ 1 CrashHandler.kt\ncom/facebook/internal/instrument/crashreport/CrashHandler$Companion\n*L\n66#1:89\n66#1:90,3\n67#1:93\n67#1:94,2\n72#1:96,2\n79#1:98,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final synchronized void enable() {
            try {
                if (C5501a.m7803q()) {
                    m10141c();
                }
                if (CrashHandler.f9673d != null) {
                    Log.w(CrashHandler.f9672c, "Already enabled!");
                } else {
                    CrashHandler.f9673d = new CrashHandler(Thread.getDefaultUncaughtExceptionHandler(), null);
                    Thread.setDefaultUncaughtExceptionHandler(CrashHandler.f9673d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: e */
        public static final void m10140e(List validReports, GraphResponse response) {
            JSONObject jsonObject;
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
        }

        /* JADX INFO: renamed from: d */
        public static final int m10139d(InstrumentData instrumentData, InstrumentData o11) {
            Intrinsics.checkNotNullExpressionValue(o11, "o2");
            return instrumentData.m10116b(o11);
        }

        /* JADX INFO: renamed from: c */
        public final void m10141c() {
            if (C5760c.m10055W()) {
                return;
            }
            File[] fileArrM89637p = C40926i.m89637p();
            ArrayList arrayList = new ArrayList(fileArrM89637p.length);
            for (File file : fileArrM89637p) {
                arrayList.add(InstrumentData.C5762a.m10127d(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((InstrumentData) obj).m10120f()) {
                    arrayList2.add(obj);
                }
            }
            final List listSortedWith = CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: m6.a
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return CrashHandler.Companion.m10139d((InstrumentData) obj2, (InstrumentData) obj3);
                }
            });
            JSONArray jSONArray = new JSONArray();
            Iterator<Integer> it = RangesKt.until(0, Math.min(listSortedWith.size(), 5)).iterator();
            while (it.hasNext()) {
                jSONArray.put(listSortedWith.get(((IntIterator) it).nextInt()));
            }
            C40926i.m89640s("crash_reports", jSONArray, new GraphRequest.InterfaceC5490b() { // from class: m6.b
                @Override // com.facebook.GraphRequest.InterfaceC5490b
                /* JADX INFO: renamed from: a */
                public final void mo78a(GraphResponse graphResponse) {
                    CrashHandler.Companion.m10140e(listSortedWith, graphResponse);
                }
            });
        }
    }

    public /* synthetic */ CrashHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, DefaultConstructorMarker defaultConstructorMarker) {
        this(uncaughtExceptionHandler);
    }

    public CrashHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.previousHandler = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NotNull Thread t11, @NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(t11, "t");
        Intrinsics.checkNotNullParameter(e11, "e");
        if (C40926i.m89631j(e11)) {
            C5764a.m10130c(e11);
            InstrumentData.C5762a.m10125b(e11, InstrumentData.Type.CrashReport).m10121g();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.previousHandler;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(t11, e11);
        }
    }
}
