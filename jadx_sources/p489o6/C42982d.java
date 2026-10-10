package p489o6;

import androidx.annotation.RestrictTo;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.C5760c;
import com.facebook.internal.instrument.errorreport.ErrorReportData;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p394k6.C40926i;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.text.Regex;

/* JADX INFO: renamed from: o6.d */
/* JADX INFO: compiled from: ErrorReportHandler.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u0003J\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lo6/d;", "", "<init>", "()V", "", "msg", "", "g", "(Ljava/lang/String;)V", "d", CmcdData.Factory.STREAMING_FORMAT_HLS, "", "Ljava/io/File;", "e", "()[Ljava/io/File;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nErrorReportHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErrorReportHandler.kt\ncom/facebook/internal/instrument/errorreport/ErrorReportHandler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,84:1\n1855#2,2:85\n*S KotlinDebug\n*F\n+ 1 ErrorReportHandler.kt\ncom/facebook/internal/instrument/errorreport/ErrorReportHandler\n*L\n68#1:85,2\n*E\n"})
public final class C42982d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42982d f95116a = new C42982d();

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m94393g(@Nullable String msg) {
        try {
            new ErrorReportData(msg).m10146e();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m94396j(ArrayList validReports, GraphResponse response) {
        JSONObject jSONObjectM7743d;
        Intrinsics.checkNotNullParameter(validReports, "$validReports");
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            if (response.getCom.google.firebase.messaging.Constants.IPC_BUNDLE_KEY_SEND_ERROR java.lang.String() == null && (jSONObjectM7743d = response.getJsonObject()) != null && jSONObjectM7743d.getBoolean("success")) {
                Iterator it = validReports.iterator();
                while (it.hasNext()) {
                    ((ErrorReportData) it.next()).m10142a();
                }
            }
        } catch (JSONException unused) {
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m94390d() {
        if (C5501a.m7803q()) {
            m94394h();
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final File[] m94391e() {
        File fileM89627f = C40926i.m89627f();
        if (fileM89627f == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileM89627f.listFiles(new FilenameFilter() { // from class: o6.c
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return C42982d.m94392f(file, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "reportDir.listFiles { di…OR_REPORT_PREFIX)))\n    }");
        return fileArrListFiles;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m94392f(File file, String name) {
        Intrinsics.checkNotNullExpressionValue(name, "name");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return new Regex(str).matches(name);
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m94394h() {
        if (C5760c.m10055W()) {
            return;
        }
        File[] fileArrM94391e = m94391e();
        final ArrayList arrayList = new ArrayList();
        for (File file : fileArrM94391e) {
            ErrorReportData errorReportData = new ErrorReportData(file);
            if (errorReportData.m10145d()) {
                arrayList.add(errorReportData);
            }
        }
        CollectionsKt.sortWith(arrayList, new Comparator() { // from class: o6.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C42982d.m94395i((ErrorReportData) obj, (ErrorReportData) obj2);
            }
        });
        JSONArray jSONArray = new JSONArray();
        for (int i11 = 0; i11 < arrayList.size() && i11 < 1000; i11++) {
            jSONArray.put(arrayList.get(i11));
        }
        C40926i.m89640s("error_reports", jSONArray, new GraphRequest.InterfaceC5490b() { // from class: o6.b
            @Override // com.facebook.GraphRequest.InterfaceC5490b
            /* JADX INFO: renamed from: a */
            public final void mo78a(GraphResponse graphResponse) {
                C42982d.m94396j(arrayList, graphResponse);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static final int m94395i(ErrorReportData errorReportData, ErrorReportData o11) {
        Intrinsics.checkNotNullExpressionValue(o11, "o2");
        return errorReportData.m10143b(o11);
    }
}
