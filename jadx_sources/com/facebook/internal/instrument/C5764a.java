package com.facebook.internal.instrument;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.facebook.C5501a;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestBatch;
import com.facebook.GraphResponse;
import com.facebook.internal.C5760c;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.C5764a;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p394k6.C40926i;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: com.facebook.internal.instrument.a */
/* JADX INFO: compiled from: ExceptionAnalyzer.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\u0003J\u0019\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\n\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u0003R\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u000f"}, m90084d2 = {"Lcom/facebook/internal/instrument/a;", "", "<init>", "()V", "", "d", "()Z", "", "b", "", "e", "c", "(Ljava/lang/Throwable;)V", "Z", "enabled", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nExceptionAnalyzer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionAnalyzer.kt\ncom/facebook/internal/instrument/ExceptionAnalyzer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,99:1\n13579#2,2:100\n*S KotlinDebug\n*F\n+ 1 ExceptionAnalyzer.kt\ncom/facebook/internal/instrument/ExceptionAnalyzer\n*L\n47#1:100,2\n*E\n"})
public final class C5764a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5764a f9669a = new C5764a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean enabled;

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m10129b() {
        enabled = true;
        if (C5501a.m7803q()) {
            f9669a.m10133e();
        }
    }

    @JvmStatic
    @VisibleForTesting(otherwise = 2)
    /* JADX INFO: renamed from: d */
    public static final boolean m10131d() {
        return false;
    }

    @VisibleForTesting(otherwise = 2)
    /* JADX INFO: renamed from: e */
    public final void m10133e() {
        if (C5760c.m10055W()) {
            return;
        }
        File[] fileArrM89635n = C40926i.m89635n();
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrM89635n) {
            final InstrumentData instrumentDataM10127d = InstrumentData.C5762a.m10127d(file);
            if (instrumentDataM10127d.m10120f()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crash_shield", instrumentDataM10127d.toString());
                    GraphRequest.Companion companion = GraphRequest.INSTANCE;
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str = String.format("%s/instruments", Arrays.copyOf(new Object[]{C5501a.m7800n()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                    arrayList.add(companion.newPostRequest(null, str, jSONObject, new GraphRequest.InterfaceC5490b() { // from class: k6.a
                        @Override // com.facebook.GraphRequest.InterfaceC5490b
                        /* JADX INFO: renamed from: a */
                        public final void mo78a(GraphResponse graphResponse) {
                            C5764a.m10132f(instrumentDataM10127d, graphResponse);
                        }
                    }));
                } catch (JSONException unused) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        new GraphRequestBatch(arrayList).m7726g();
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m10130c(@Nullable Throwable e11) {
        if (!enabled || m10131d() || e11 == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        StackTraceElement[] stackTrace = e11.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "e.stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "it.className");
            FeatureManager.Feature featureM9938d = FeatureManager.m9938d(className);
            if (featureM9938d != FeatureManager.Feature.Unknown) {
                FeatureManager.m9937c(featureM9938d);
                hashSet.add(featureM9938d.toString());
            }
        }
        if (!C5501a.m7803q() || hashSet.isEmpty()) {
            return;
        }
        InstrumentData.C5762a.m10126c(new JSONArray((Collection) hashSet)).m10121g();
    }

    /* JADX INFO: renamed from: f */
    public static final void m10132f(InstrumentData instrumentData, GraphResponse response) {
        JSONObject jSONObjectM7743d;
        Intrinsics.checkNotNullParameter(instrumentData, "$instrumentData");
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            if (response.getCom.google.firebase.messaging.Constants.IPC_BUNDLE_KEY_SEND_ERROR java.lang.String() == null && (jSONObjectM7743d = response.getJsonObject()) != null && jSONObjectM7743d.getBoolean("success")) {
                instrumentData.m10115a();
            }
        } catch (JSONException unused) {
        }
    }
}
