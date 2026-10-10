package com.blankj.utilcode.util;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.collection.SimpleArrayMap;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.C33844oi;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/* JADX INFO: renamed from: com.blankj.utilcode.util.u */
/* JADX INFO: compiled from: LogUtils.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C5298u {

    /* JADX INFO: renamed from: e */
    public static SimpleDateFormat f6605e;

    /* JADX INFO: renamed from: a */
    public static final char[] f6601a = {'V', 'D', 'I', 'W', 'E', 'A'};

    /* JADX INFO: renamed from: b */
    public static final String f6602b = System.getProperty("file.separator");

    /* JADX INFO: renamed from: c */
    public static final String f6603c = System.getProperty("line.separator");

    /* JADX INFO: renamed from: d */
    public static final d f6604d = new d(null);

    /* JADX INFO: renamed from: f */
    public static final ExecutorService f6606f = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: g */
    public static final SimpleArrayMap<Class, f> f6607g = new SimpleArrayMap<>();

    /* JADX INFO: renamed from: com.blankj.utilcode.util.u$a */
    /* JADX INFO: compiled from: LogUtils.java */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f6608b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ h f6609c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f6610d;

        public a(int i11, h hVar, String str) {
            this.f6608b = i11;
            this.f6609c = hVar;
            this.f6610d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5298u.m6428u(this.f6608b, this.f6609c.f6630a, this.f6609c.f6632c + this.f6610d);
        }
    }

    /* JADX INFO: renamed from: com.blankj.utilcode.util.u$c */
    /* JADX INFO: compiled from: LogUtils.java */
    public static class c implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ File f6611b;

        public c(File file) {
            this.f6611b = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f6611b.delete()) {
                return;
            }
            Log.e("LogUtils", "delete " + this.f6611b + " failed!");
        }
    }

    /* JADX INFO: renamed from: com.blankj.utilcode.util.u$d */
    /* JADX INFO: compiled from: LogUtils.java */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public String f6612a;

        /* JADX INFO: renamed from: b */
        public String f6613b;

        /* JADX INFO: renamed from: c */
        public String f6614c;

        /* JADX INFO: renamed from: d */
        public String f6615d;

        /* JADX INFO: renamed from: e */
        public boolean f6616e;

        /* JADX INFO: renamed from: f */
        public boolean f6617f;

        /* JADX INFO: renamed from: g */
        public String f6618g;

        /* JADX INFO: renamed from: h */
        public boolean f6619h;

        /* JADX INFO: renamed from: i */
        public boolean f6620i;

        /* JADX INFO: renamed from: j */
        public boolean f6621j;

        /* JADX INFO: renamed from: k */
        public boolean f6622k;

        /* JADX INFO: renamed from: l */
        public boolean f6623l;

        /* JADX INFO: renamed from: m */
        public int f6624m;

        /* JADX INFO: renamed from: n */
        public int f6625n;

        /* JADX INFO: renamed from: o */
        public int f6626o;

        /* JADX INFO: renamed from: p */
        public int f6627p;

        /* JADX INFO: renamed from: q */
        public int f6628q;

        /* JADX INFO: renamed from: r */
        public String f6629r;

        public /* synthetic */ d(a aVar) {
            this();
        }

        public d() {
            this.f6614c = "util";
            this.f6615d = ".txt";
            this.f6616e = true;
            this.f6617f = true;
            this.f6618g = "";
            this.f6619h = true;
            this.f6620i = true;
            this.f6621j = false;
            this.f6622k = true;
            this.f6623l = true;
            this.f6624m = 2;
            this.f6625n = 2;
            this.f6626o = 1;
            this.f6627p = 0;
            this.f6628q = -1;
            this.f6629r = C5299u0.m6494q();
            if (!C5299u0.m6468F() || C5287o0.m6331a().getExternalFilesDir(null) == null) {
                this.f6612a = C5287o0.m6331a().getFilesDir() + C5298u.f6602b + "log" + C5298u.f6602b;
                return;
            }
            this.f6612a = C5287o0.m6331a().getExternalFilesDir(null) + C5298u.f6602b + "log" + C5298u.f6602b;
        }

        /* JADX INFO: renamed from: f */
        public final String m6439f() {
            String str = this.f6613b;
            return str == null ? this.f6612a : str;
        }

        /* JADX INFO: renamed from: g */
        public final String m6440g() {
            return this.f6615d;
        }

        /* JADX INFO: renamed from: i */
        public final String m6442i() {
            return this.f6614c;
        }

        /* JADX INFO: renamed from: j */
        public final String m6443j() {
            return C5299u0.m6469G(this.f6618g) ? "" : this.f6618g;
        }

        /* JADX INFO: renamed from: k */
        public final String m6444k() {
            String str = this.f6629r;
            return str == null ? "" : str.replace(C33844oi.f71346o, "_");
        }

        /* JADX INFO: renamed from: l */
        public final int m6445l() {
            return this.f6628q;
        }

        /* JADX INFO: renamed from: m */
        public final int m6446m() {
            return this.f6626o;
        }

        /* JADX INFO: renamed from: n */
        public final int m6447n() {
            return this.f6627p;
        }

        /* JADX INFO: renamed from: o */
        public final boolean m6448o() {
            return this.f6617f;
        }

        /* JADX INFO: renamed from: p */
        public final boolean m6449p() {
            return this.f6621j;
        }

        /* JADX INFO: renamed from: q */
        public final boolean m6450q() {
            return this.f6622k;
        }

        /* JADX INFO: renamed from: r */
        public final boolean m6451r() {
            return this.f6620i;
        }

        /* JADX INFO: renamed from: s */
        public final boolean m6452s() {
            return this.f6616e;
        }

        /* JADX INFO: renamed from: t */
        public final boolean m6453t() {
            return this.f6623l;
        }

        public String toString() {
            return "process: " + m6444k() + C5298u.f6603c + "switch: " + m6452s() + C5298u.f6603c + "console: " + m6448o() + C5298u.f6603c + "tag: " + m6443j() + C5298u.f6603c + "head: " + m6451r() + C5298u.f6603c + "file: " + m6449p() + C5298u.f6603c + "dir: " + m6439f() + C5298u.f6603c + "filePrefix: " + m6442i() + C5298u.f6603c + "border: " + m6450q() + C5298u.f6603c + "singleTag: " + m6453t() + C5298u.f6603c + "consoleFilter: " + m6438e() + C5298u.f6603c + "fileFilter: " + m6441h() + C5298u.f6603c + "stackDeep: " + m6446m() + C5298u.f6603c + "stackOffset: " + m6447n() + C5298u.f6603c + "saveDays: " + m6445l() + C5298u.f6603c + "formatter: " + C5298u.f6607g;
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ e m6437d(d dVar) {
            dVar.getClass();
            return null;
        }

        /* JADX INFO: renamed from: e */
        public final char m6438e() {
            return C5298u.f6601a[this.f6624m - 2];
        }

        /* JADX INFO: renamed from: h */
        public final char m6441h() {
            return C5298u.f6601a[this.f6625n - 2];
        }
    }

    /* JADX INFO: renamed from: com.blankj.utilcode.util.u$e */
    /* JADX INFO: compiled from: LogUtils.java */
    public interface e {
    }

    /* JADX INFO: renamed from: com.blankj.utilcode.util.u$f */
    /* JADX INFO: compiled from: LogUtils.java */
    public static abstract class f<T> {
        /* JADX INFO: renamed from: a */
        public abstract String m6454a(T t11);
    }

    /* JADX INFO: renamed from: com.blankj.utilcode.util.u$g */
    /* JADX INFO: compiled from: LogUtils.java */
    public static final class g {
        @RequiresApi(api = 16)
        /* JADX INFO: renamed from: c */
        public static void m6457c(ClipData clipData, StringBuilder sb2) {
            ClipData.Item itemAt = clipData.getItemAt(0);
            if (itemAt == null) {
                sb2.append("ClipData.Item {}");
                return;
            }
            sb2.append("ClipData.Item { ");
            String htmlText = itemAt.getHtmlText();
            if (htmlText != null) {
                sb2.append("H:");
                sb2.append(htmlText);
                sb2.append("}");
                return;
            }
            CharSequence text = itemAt.getText();
            if (text != null) {
                sb2.append("T:");
                sb2.append(text);
                sb2.append("}");
                return;
            }
            Uri uri = itemAt.getUri();
            if (uri != null) {
                sb2.append("U:");
                sb2.append(uri);
                sb2.append("}");
                return;
            }
            Intent intent = itemAt.getIntent();
            if (intent == null) {
                sb2.append("NULL");
                sb2.append("}");
            } else {
                sb2.append("I:");
                sb2.append(m6459e(intent));
                sb2.append("}");
            }
        }

        /* JADX INFO: renamed from: g */
        public static String m6461g(Object obj) {
            return m6462h(obj, -1);
        }

        /* JADX INFO: renamed from: a */
        public static String m6455a(Object obj) {
            if (obj instanceof Object[]) {
                return Arrays.deepToString((Object[]) obj);
            }
            if (obj instanceof boolean[]) {
                return Arrays.toString((boolean[]) obj);
            }
            if (obj instanceof byte[]) {
                return Arrays.toString((byte[]) obj);
            }
            if (obj instanceof char[]) {
                return Arrays.toString((char[]) obj);
            }
            if (obj instanceof double[]) {
                return Arrays.toString((double[]) obj);
            }
            if (obj instanceof float[]) {
                return Arrays.toString((float[]) obj);
            }
            if (obj instanceof int[]) {
                return Arrays.toString((int[]) obj);
            }
            if (obj instanceof long[]) {
                return Arrays.toString((long[]) obj);
            }
            if (obj instanceof short[]) {
                return Arrays.toString((short[]) obj);
            }
            throw new IllegalArgumentException("Array has incompatible type: " + obj.getClass());
        }

        /* JADX INFO: renamed from: d */
        public static String m6458d(String str) {
            try {
                StreamSource streamSource = new StreamSource(new StringReader(str));
                StreamResult streamResult = new StreamResult(new StringWriter());
                Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
                transformerNewTransformer.setOutputProperty("indent", "yes");
                transformerNewTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
                transformerNewTransformer.transform(streamSource, streamResult);
                return streamResult.getWriter().toString().replaceFirst(">", ">" + C5298u.f6603c);
            } catch (Exception e11) {
                e11.printStackTrace();
                return str;
            }
        }

        /* JADX INFO: renamed from: e */
        public static String m6459e(Intent intent) {
            boolean z11;
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Intent { ");
            String action = intent.getAction();
            boolean z12 = false;
            boolean z13 = true;
            if (action != null) {
                sb2.append("act=");
                sb2.append(action);
                z11 = false;
            } else {
                z11 = true;
            }
            Set<String> categories = intent.getCategories();
            if (categories != null) {
                if (!z11) {
                    sb2.append(' ');
                }
                sb2.append("cat=[");
                for (String str : categories) {
                    if (!z13) {
                        sb2.append(',');
                    }
                    sb2.append(str);
                    z13 = false;
                }
                sb2.append("]");
                z11 = false;
            }
            Uri data = intent.getData();
            if (data != null) {
                if (!z11) {
                    sb2.append(' ');
                }
                sb2.append("dat=");
                sb2.append(data);
                z11 = false;
            }
            String type = intent.getType();
            if (type != null) {
                if (!z11) {
                    sb2.append(' ');
                }
                sb2.append("typ=");
                sb2.append(type);
                z11 = false;
            }
            int flags = intent.getFlags();
            if (flags != 0) {
                if (!z11) {
                    sb2.append(' ');
                }
                sb2.append("flg=0x");
                sb2.append(Integer.toHexString(flags));
                z11 = false;
            }
            String str2 = intent.getPackage();
            if (str2 != null) {
                if (!z11) {
                    sb2.append(' ');
                }
                sb2.append("pkg=");
                sb2.append(str2);
                z11 = false;
            }
            ComponentName component = intent.getComponent();
            if (component != null) {
                if (!z11) {
                    sb2.append(' ');
                }
                sb2.append("cmp=");
                sb2.append(component.flattenToShortString());
                z11 = false;
            }
            Rect sourceBounds = intent.getSourceBounds();
            if (sourceBounds != null) {
                if (!z11) {
                    sb2.append(' ');
                }
                sb2.append("bnds=");
                sb2.append(sourceBounds.toShortString());
                z11 = false;
            }
            ClipData clipData = intent.getClipData();
            if (clipData != null) {
                if (!z11) {
                    sb2.append(' ');
                }
                m6457c(clipData, sb2);
                z11 = false;
            }
            Bundle extras = intent.getExtras();
            if (extras != null) {
                if (!z11) {
                    sb2.append(' ');
                }
                sb2.append("extras={");
                sb2.append(m6456b(extras));
                sb2.append('}');
            } else {
                z12 = z11;
            }
            Intent selector = intent.getSelector();
            if (selector != null) {
                if (!z12) {
                    sb2.append(' ');
                }
                sb2.append("sel={");
                sb2.append(selector == intent ? "(this Intent)" : m6459e(selector));
                sb2.append("}");
            }
            sb2.append(" }");
            return sb2.toString();
        }

        /* JADX INFO: renamed from: f */
        public static String m6460f(Object obj) {
            if (obj instanceof CharSequence) {
                return C5299u0.m6488k(obj.toString());
            }
            try {
                return C5299u0.m6497t().toJson(obj);
            } catch (Throwable unused) {
                return obj.toString();
            }
        }

        /* JADX INFO: renamed from: b */
        public static String m6456b(Bundle bundle) {
            String strM6456b;
            Iterator<String> it = bundle.keySet().iterator();
            if (!it.hasNext()) {
                return "Bundle {}";
            }
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Bundle { ");
            while (true) {
                String next = it.next();
                Object obj = bundle.get(next);
                sb2.append(next);
                sb2.append('=');
                if (obj instanceof Bundle) {
                    if (obj == bundle) {
                        strM6456b = "(this Bundle)";
                    } else {
                        strM6456b = m6456b((Bundle) obj);
                    }
                    sb2.append(strM6456b);
                } else {
                    sb2.append(C5298u.m6420m(obj));
                }
                if (!it.hasNext()) {
                    sb2.append(" }");
                    return sb2.toString();
                }
                sb2.append(',');
                sb2.append(' ');
            }
        }

        /* JADX INFO: renamed from: h */
        public static String m6462h(Object obj, int i11) {
            if (obj.getClass().isArray()) {
                return m6455a(obj);
            }
            if (obj instanceof Throwable) {
                return C5299u0.m6496s((Throwable) obj);
            }
            if (obj instanceof Bundle) {
                return m6456b((Bundle) obj);
            }
            if (obj instanceof Intent) {
                return m6459e((Intent) obj);
            }
            if (i11 == 32) {
                return m6460f(obj);
            }
            if (i11 == 48) {
                return m6458d(obj.toString());
            }
            return obj.toString();
        }
    }

    /* JADX INFO: renamed from: com.blankj.utilcode.util.u$b */
    /* JADX INFO: compiled from: LogUtils.java */
    public static class b implements FilenameFilter {
        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return C5298u.m6425r(str);
        }
    }

    /* JADX INFO: renamed from: com.blankj.utilcode.util.u$h */
    /* JADX INFO: compiled from: LogUtils.java */
    public static final class h {

        /* JADX INFO: renamed from: a */
        public String f6630a;

        /* JADX INFO: renamed from: b */
        public String[] f6631b;

        /* JADX INFO: renamed from: c */
        public String f6632c;

        public h(String str, String[] strArr, String str2) {
            this.f6630a = str;
            this.f6631b = strArr;
            this.f6632c = str2;
        }
    }

    /* JADX INFO: renamed from: A */
    public static void m6404A(int i11, String str, String str2) {
        if (!f6604d.m6450q()) {
            Log.println(i11, str, str2);
            return;
        }
        for (String str3 : str2.split(f6603c)) {
            Log.println(i11, str, "│ " + str3);
        }
    }

    /* JADX INFO: renamed from: B */
    public static String m6405B(int i11, Object... objArr) {
        String string;
        if (objArr != null) {
            if (objArr.length == 1) {
                string = m6419l(i11, objArr[0]);
            } else {
                StringBuilder sb2 = new StringBuilder();
                int length = objArr.length;
                for (int i12 = 0; i12 < length; i12++) {
                    Object obj = objArr[i12];
                    sb2.append("args");
                    sb2.append("[");
                    sb2.append(i12);
                    sb2.append("]");
                    sb2.append(" = ");
                    sb2.append(m6420m(obj));
                    sb2.append(f6603c);
                }
                string = sb2.toString();
            }
        } else {
            string = "null";
        }
        return string.length() == 0 ? "log nothing" : string;
    }

    /* JADX INFO: renamed from: C */
    public static String m6406C(int i11, String str, String[] strArr, String str2) {
        StringBuilder sb2 = new StringBuilder();
        int i12 = 0;
        if (f6604d.m6450q()) {
            sb2.append(C33627eb.f69716f);
            String str3 = f6603c;
            sb2.append(str3);
            sb2.append("┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
            sb2.append(str3);
            if (strArr != null) {
                for (String str4 : strArr) {
                    sb2.append("│ ");
                    sb2.append(str4);
                    sb2.append(f6603c);
                }
                sb2.append("├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄");
                sb2.append(f6603c);
            }
            String[] strArrSplit = str2.split(f6603c);
            int length = strArrSplit.length;
            while (i12 < length) {
                String str5 = strArrSplit[i12];
                sb2.append("│ ");
                sb2.append(str5);
                sb2.append(f6603c);
                i12++;
            }
            sb2.append("└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        } else {
            if (strArr != null) {
                sb2.append(C33627eb.f69716f);
                sb2.append(f6603c);
                int length2 = strArr.length;
                while (i12 < length2) {
                    sb2.append(strArr[i12]);
                    sb2.append(f6603c);
                    i12++;
                }
            }
            sb2.append(str2);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: D */
    public static h m6407D(String str) {
        d dVar = f6604d;
        if (dVar.f6619h || dVar.m6451r()) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            int iM6447n = dVar.m6447n() + 3;
            if (iM6447n >= stackTrace.length) {
                String strM6422o = m6422o(stackTrace[3]);
                if (dVar.f6619h && C5299u0.m6469G(str)) {
                    int iIndexOf = strM6422o.indexOf(46);
                    str = iIndexOf == -1 ? strM6422o : strM6422o.substring(0, iIndexOf);
                }
                return new h(str, null, ": ");
            }
            StackTraceElement stackTraceElement = stackTrace[iM6447n];
            String strM6422o2 = m6422o(stackTraceElement);
            if (dVar.f6619h && C5299u0.m6469G(str)) {
                int iIndexOf2 = strM6422o2.indexOf(46);
                str = iIndexOf2 == -1 ? strM6422o2 : strM6422o2.substring(0, iIndexOf2);
            }
            if (dVar.m6451r()) {
                String name = Thread.currentThread().getName();
                String string = new Formatter().format("%s, %s.%s(%s:%d)", name, stackTraceElement.getClassName(), stackTraceElement.getMethodName(), strM6422o2, Integer.valueOf(stackTraceElement.getLineNumber())).toString();
                String str2 = " [" + string + "]: ";
                if (dVar.m6446m() <= 1) {
                    return new h(str, new String[]{string}, str2);
                }
                int iMin = Math.min(dVar.m6446m(), stackTrace.length - iM6447n);
                String[] strArr = new String[iMin];
                strArr[0] = string;
                int length = name.length() + 2;
                String string2 = new Formatter().format("%" + length + CmcdData.Factory.STREAMING_FORMAT_SS, "").toString();
                for (int i11 = 1; i11 < iMin; i11++) {
                    StackTraceElement stackTraceElement2 = stackTrace[i11 + iM6447n];
                    strArr[i11] = new Formatter().format("%s%s.%s(%s:%d)", string2, stackTraceElement2.getClassName(), stackTraceElement2.getMethodName(), m6422o(stackTraceElement2), Integer.valueOf(stackTraceElement2.getLineNumber())).toString();
                }
                return new h(str, strArr, str2);
            }
        } else {
            str = dVar.m6443j();
        }
        return new h(str, null, ": ");
    }

    /* JADX INFO: renamed from: h */
    public static boolean m6415h(String str, String str2) {
        File file = new File(str);
        if (file.exists()) {
            return file.isFile();
        }
        if (!C5299u0.m6482e(file.getParentFile())) {
            return false;
        }
        try {
            m6417j(str, str2);
            boolean zCreateNewFile = file.createNewFile();
            if (!zCreateNewFile) {
                return zCreateNewFile;
            }
            m6430w(str, str2);
            return zCreateNewFile;
        } catch (IOException e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m6416i(Object... objArr) {
        m6426s(3, f6604d.m6443j(), objArr);
    }

    /* JADX INFO: renamed from: j */
    public static void m6417j(String str, String str2) {
        File[] fileArrListFiles;
        d dVar = f6604d;
        if (dVar.m6445l() > 0 && (fileArrListFiles = new File(str).getParentFile().listFiles(new b())) != null && fileArrListFiles.length > 0) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy_MM_dd", Locale.getDefault());
            try {
                long time = simpleDateFormat.parse(str2).getTime() - (((long) dVar.m6445l()) * 86400000);
                for (File file : fileArrListFiles) {
                    String name = file.getName();
                    name.getClass();
                    if (simpleDateFormat.parse(m6418k(name)).getTime() <= time) {
                        f6606f.execute(new c(file));
                    }
                }
            } catch (ParseException e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m6418k(String str) {
        Matcher matcher = Pattern.compile("[0-9]{4}_[0-9]{2}_[0-9]{2}").matcher(str);
        return matcher.find() ? matcher.group() : "";
    }

    /* JADX INFO: renamed from: l */
    public static String m6419l(int i11, Object obj) {
        if (obj == null) {
            return "null";
        }
        if (i11 == 32) {
            return g.m6462h(obj, 32);
        }
        return i11 == 48 ? g.m6462h(obj, 48) : m6420m(obj);
    }

    /* JADX INFO: renamed from: m */
    public static String m6420m(Object obj) {
        f fVar;
        if (obj == null) {
            return "null";
        }
        SimpleArrayMap<Class, f> simpleArrayMap = f6607g;
        return (simpleArrayMap.isEmpty() || (fVar = simpleArrayMap.get(m6421n(obj))) == null) ? g.m6461g(obj) : fVar.m6454a(obj);
    }

    /* JADX INFO: renamed from: p */
    public static SimpleDateFormat m6423p() {
        if (f6605e == null) {
            f6605e = new SimpleDateFormat("yyyy_MM_dd HH:mm:ss.SSS ", Locale.getDefault());
        }
        return f6605e;
    }

    /* JADX INFO: renamed from: q */
    public static void m6424q(String str, String str2) {
        d.m6437d(f6604d);
        C5299u0.m6477O(str, str2, true);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m6425r(String str) {
        return str.matches("^" + f6604d.m6442i() + "_[0-9]{4}_[0-9]{2}_[0-9]{2}_.*$");
    }

    /* JADX INFO: renamed from: s */
    public static void m6426s(int i11, String str, Object... objArr) {
        d dVar = f6604d;
        if (dVar.m6452s()) {
            int i12 = i11 & 15;
            int i13 = i11 & 240;
            if (dVar.m6448o() || dVar.m6449p() || i13 == 16) {
                if (i12 >= dVar.f6624m || i12 >= dVar.f6625n) {
                    h hVarM6407D = m6407D(str);
                    String strM6405B = m6405B(i13, objArr);
                    if (dVar.m6448o() && i13 != 16 && i12 >= dVar.f6624m) {
                        m6427t(i12, hVarM6407D.f6630a, hVarM6407D.f6631b, strM6405B);
                    }
                    if ((dVar.m6449p() || i13 == 16) && i12 >= dVar.f6625n) {
                        f6606f.execute(new a(i12, hVarM6407D, strM6405B));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m6427t(int i11, String str, String[] strArr, String str2) {
        if (f6604d.m6453t()) {
            m6433z(i11, str, m6406C(i11, str, strArr, str2));
            return;
        }
        m6429v(i11, str, true);
        m6431x(i11, str, strArr);
        m6432y(i11, str, str2);
        m6429v(i11, str, false);
    }

    /* JADX INFO: renamed from: v */
    public static void m6429v(int i11, String str, boolean z11) {
        if (f6604d.m6450q()) {
            Log.println(i11, str, z11 ? "┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────" : "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m6430w(String str, String str2) {
        m6424q(str, "************* Log Head ****************\nDate of Log        : " + str2 + "\nDevice Manufacturer: " + Build.MANUFACTURER + "\nDevice Model       : " + Build.MODEL + "\nAndroid Version    : " + Build.VERSION.RELEASE + "\nAndroid SDK        : " + Build.VERSION.SDK_INT + "\nApp VersionName    : " + C5299u0.m6492o() + "\nApp VersionCode    : " + C5299u0.m6491n() + "\n************* Log Head ****************\n\n");
    }

    /* JADX INFO: renamed from: x */
    public static void m6431x(int i11, String str, String[] strArr) {
        if (strArr != null) {
            for (String str2 : strArr) {
                if (f6604d.m6450q()) {
                    str2 = "│ " + str2;
                }
                Log.println(i11, str, str2);
            }
            if (f6604d.m6450q()) {
                Log.println(i11, str, "├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄");
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static Class m6421n(Object obj) {
        String string;
        Class<?> cls = obj.getClass();
        if (cls.isAnonymousClass() || cls.isSynthetic()) {
            Type[] genericInterfaces = cls.getGenericInterfaces();
            if (genericInterfaces.length == 1) {
                Type rawType = genericInterfaces[0];
                while (rawType instanceof ParameterizedType) {
                    rawType = ((ParameterizedType) rawType).getRawType();
                }
                string = rawType.toString();
            } else {
                Type genericSuperclass = cls.getGenericSuperclass();
                while (genericSuperclass instanceof ParameterizedType) {
                    genericSuperclass = ((ParameterizedType) genericSuperclass).getRawType();
                }
                string = genericSuperclass.toString();
            }
            if (string.startsWith("class ")) {
                string = string.substring(6);
            } else if (string.startsWith("interface ")) {
                string = string.substring(10);
            }
            try {
                return Class.forName(string);
            } catch (ClassNotFoundException e11) {
                e11.printStackTrace();
            }
        }
        return cls;
    }

    /* JADX INFO: renamed from: o */
    public static String m6422o(StackTraceElement stackTraceElement) {
        String fileName = stackTraceElement.getFileName();
        if (fileName != null) {
            return fileName;
        }
        String className = stackTraceElement.getClassName();
        String[] strArrSplit = className.split("\\.");
        if (strArrSplit.length > 0) {
            className = strArrSplit[strArrSplit.length - 1];
        }
        int iIndexOf = className.indexOf(36);
        if (iIndexOf != -1) {
            className = className.substring(0, iIndexOf);
        }
        return className + ".java";
    }

    /* JADX INFO: renamed from: u */
    public static void m6428u(int i11, String str, String str2) {
        String str3 = m6423p().format(new Date());
        String strSubstring = str3.substring(0, 10);
        String strSubstring2 = str3.substring(11);
        StringBuilder sb2 = new StringBuilder();
        d dVar = f6604d;
        sb2.append(dVar.m6439f());
        sb2.append(dVar.m6442i());
        sb2.append("_");
        sb2.append(strSubstring);
        sb2.append("_");
        sb2.append(dVar.m6444k());
        sb2.append(dVar.m6440g());
        String string = sb2.toString();
        if (!m6415h(string, strSubstring)) {
            Log.e("LogUtils", "create " + string + " failed!");
            return;
        }
        m6424q(string, strSubstring2 + f6601a[i11 - 2] + "/" + str + str2 + f6603c);
    }

    /* JADX INFO: renamed from: y */
    public static void m6432y(int i11, String str, String str2) {
        int length = str2.length();
        int i12 = length / 1100;
        if (i12 > 0) {
            int i13 = 0;
            int i14 = 0;
            while (i13 < i12) {
                int i15 = i14 + 1100;
                m6404A(i11, str, str2.substring(i14, i15));
                i13++;
                i14 = i15;
            }
            if (i14 != length) {
                m6404A(i11, str, str2.substring(i14, length));
                return;
            }
            return;
        }
        m6404A(i11, str, str2);
    }

    /* JADX INFO: renamed from: z */
    public static void m6433z(int i11, String str, String str2) {
        int i12;
        int length = str2.length();
        d dVar = f6604d;
        int i13 = 1100;
        if (dVar.m6450q()) {
            i12 = (length - 113) / 1100;
        } else {
            i12 = length / 1100;
        }
        if (i12 > 0) {
            int i14 = 1;
            if (dVar.m6450q()) {
                Log.println(i11, str, str2.substring(0, 1100) + f6603c + "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
                while (i14 < i12) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(C33627eb.f69716f);
                    String str3 = f6603c;
                    sb2.append(str3);
                    sb2.append("┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
                    sb2.append(str3);
                    sb2.append("│ ");
                    int i15 = i13 + 1100;
                    sb2.append(str2.substring(i13, i15));
                    sb2.append(str3);
                    sb2.append("└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
                    Log.println(i11, str, sb2.toString());
                    i14++;
                    i13 = i15;
                }
                if (i13 != length - 113) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(C33627eb.f69716f);
                    String str4 = f6603c;
                    sb3.append(str4);
                    sb3.append("┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
                    sb3.append(str4);
                    sb3.append("│ ");
                    sb3.append(str2.substring(i13, length));
                    Log.println(i11, str, sb3.toString());
                    return;
                }
                return;
            }
            Log.println(i11, str, str2.substring(0, 1100));
            while (i14 < i12) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(C33627eb.f69716f);
                sb4.append(f6603c);
                int i16 = i13 + 1100;
                sb4.append(str2.substring(i13, i16));
                Log.println(i11, str, sb4.toString());
                i14++;
                i13 = i16;
            }
            if (i13 != length) {
                Log.println(i11, str, C33627eb.f69716f + f6603c + str2.substring(i13, length));
                return;
            }
            return;
        }
        Log.println(i11, str, str2);
    }
}
